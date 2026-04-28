package org.bouncycastle.crypto.signers;

import com.braze.h2;
import i4.a;
import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithID;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes3.dex */
public class SM2Signer implements Signer, ECConstants {
    private final Digest digest;
    private ECKeyParameters ecKey;
    private ECDomainParameters ecParams;
    private final DSAEncoding encoding;
    private final DSAKCalculator kCalculator;
    private ECPoint pubPoint;
    private int state;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private byte[] f33275z;

    public static final class State {
        static final int DATA = 2;
        static final int INIT = 1;
        static final int UNINITIALIZED = 0;

        private State() {
        }
    }

    public SM2Signer(DSAEncoding dSAEncoding) {
        this.kCalculator = new RandomDSAKCalculator();
        this.state = 0;
        this.encoding = dSAEncoding;
        this.digest = new SM3Digest();
    }

    private void addFieldElement(Digest digest, ECFieldElement eCFieldElement) {
        byte[] encoded = eCFieldElement.getEncoded();
        digest.update(encoded, 0, encoded.length);
    }

    private void addUserID(Digest digest, byte[] bArr) {
        int length = bArr.length * 8;
        digest.update((byte) (length >>> 8));
        digest.update((byte) length);
        digest.update(bArr, 0, bArr.length);
    }

    private void checkData() {
        int i11 = this.state;
        if (i11 != 1) {
            if (i11 == 2) {
                return;
            }
            h2.b("SM2Signer needs to be initialized");
        } else {
            Digest digest = this.digest;
            byte[] bArr = this.f33275z;
            digest.update(bArr, 0, bArr.length);
            this.state = 2;
        }
    }

    private byte[] digestDoFinal() {
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        return bArr;
    }

    private byte[] getZ(byte[] bArr) {
        addUserID(this.digest, bArr);
        addFieldElement(this.digest, this.ecParams.getCurve().getA());
        addFieldElement(this.digest, this.ecParams.getCurve().getB());
        addFieldElement(this.digest, this.ecParams.getG().getAffineXCoord());
        addFieldElement(this.digest, this.ecParams.getG().getAffineYCoord());
        addFieldElement(this.digest, this.pubPoint.getAffineXCoord());
        addFieldElement(this.digest, this.pubPoint.getAffineYCoord());
        return digestDoFinal();
    }

    private boolean verifySignature(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger n11 = this.ecParams.getN();
        BigInteger bigInteger3 = ECConstants.ONE;
        if (bigInteger.compareTo(bigInteger3) < 0 || bigInteger.compareTo(n11) >= 0 || bigInteger2.compareTo(bigInteger3) < 0 || bigInteger2.compareTo(n11) >= 0) {
            return false;
        }
        BigInteger bigIntegerCalculateE = calculateE(n11, digestDoFinal());
        BigInteger bigIntegerMod = bigInteger.add(bigInteger2).mod(n11);
        if (bigIntegerMod.equals(ECConstants.ZERO)) {
            return false;
        }
        ECPoint eCPointNormalize = ECAlgorithms.sumOfTwoMultiplies(this.ecParams.getG(), bigInteger2, ((ECPublicKeyParameters) this.ecKey).getQ(), bigIntegerMod).normalize();
        if (eCPointNormalize.isInfinity()) {
            return false;
        }
        return bigIntegerCalculateE.add(eCPointNormalize.getAffineXCoord().toBigInteger()).mod(n11).equals(bigInteger);
    }

    public BigInteger calculateE(BigInteger bigInteger, byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws CryptoException {
        checkData();
        byte[] bArrDigestDoFinal = digestDoFinal();
        BigInteger n11 = this.ecParams.getN();
        BigInteger bigIntegerCalculateE = calculateE(n11, bArrDigestDoFinal);
        BigInteger d3 = ((ECPrivateKeyParameters) this.ecKey).getD();
        ECMultiplier eCMultiplierCreateBasePointMultiplier = createBasePointMultiplier();
        while (true) {
            BigInteger bigIntegerNextK = this.kCalculator.nextK();
            BigInteger bigIntegerMod = bigIntegerCalculateE.add(eCMultiplierCreateBasePointMultiplier.multiply(this.ecParams.getG(), bigIntegerNextK).normalize().getAffineXCoord().toBigInteger()).mod(n11);
            BigInteger bigInteger = ECConstants.ZERO;
            if (!bigIntegerMod.equals(bigInteger) && !bigIntegerMod.add(bigIntegerNextK).equals(n11)) {
                BigInteger bigIntegerMod2 = BigIntegers.modOddInverse(n11, d3.add(ECConstants.ONE)).multiply(bigIntegerNextK.subtract(bigIntegerMod.multiply(d3)).mod(n11)).mod(n11);
                if (!bigIntegerMod2.equals(bigInteger)) {
                    try {
                        try {
                            return this.encoding.encode(this.ecParams.getN(), bigIntegerMod, bigIntegerMod2);
                        } catch (Exception e5) {
                            throw new CryptoException("unable to encode signature: " + e5.getMessage(), e5);
                        }
                    } finally {
                        reset();
                    }
                }
            }
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z11, CipherParameters cipherParameters) {
        byte[] bArrDecodeStrict;
        ECPoint q7;
        if (cipherParameters instanceof ParametersWithID) {
            ParametersWithID parametersWithID = (ParametersWithID) cipherParameters;
            CipherParameters parameters = parametersWithID.getParameters();
            byte[] id2 = parametersWithID.getID();
            if (id2.length >= 8192) {
                a.f("SM2 user ID must be less than 2^13 bits long");
                return;
            } else {
                bArrDecodeStrict = id2;
                cipherParameters = parameters;
            }
        } else {
            bArrDecodeStrict = Hex.decodeStrict("31323334353637383132333435363738");
        }
        if (z11) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                ECKeyParameters eCKeyParameters = (ECKeyParameters) parametersWithRandom.getParameters();
                this.ecKey = eCKeyParameters;
                ECDomainParameters parameters2 = eCKeyParameters.getParameters();
                this.ecParams = parameters2;
                this.kCalculator.init(parameters2.getN(), parametersWithRandom.getRandom());
            } else {
                ECKeyParameters eCKeyParameters2 = (ECKeyParameters) cipherParameters;
                this.ecKey = eCKeyParameters2;
                ECDomainParameters parameters3 = eCKeyParameters2.getParameters();
                this.ecParams = parameters3;
                this.kCalculator.init(parameters3.getN(), CryptoServicesRegistrar.getSecureRandom());
            }
            BigInteger d3 = ((ECPrivateKeyParameters) this.ecKey).getD();
            BigInteger bigIntegerSubtract = this.ecParams.getN().subtract(BigIntegers.ONE);
            if (d3.compareTo(ECConstants.ONE) < 0 || d3.compareTo(bigIntegerSubtract) >= 0) {
                a.f("SM2 private key out of range");
                return;
            }
            q7 = createBasePointMultiplier().multiply(this.ecParams.getG(), d3).normalize();
        } else {
            ECKeyParameters eCKeyParameters3 = (ECKeyParameters) cipherParameters;
            this.ecKey = eCKeyParameters3;
            this.ecParams = eCKeyParameters3.getParameters();
            q7 = ((ECPublicKeyParameters) this.ecKey).getQ();
        }
        this.pubPoint = q7;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties("ECNR", this.ecKey, z11));
        this.digest.reset();
        this.f33275z = getZ(bArrDecodeStrict);
        this.state = 1;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        int i11 = this.state;
        if (i11 != 1) {
            if (i11 != 2) {
                h2.b("SM2Signer needs to be initialized");
            } else {
                this.digest.reset();
                this.state = 1;
            }
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b8) {
        checkData();
        this.digest.update(b8);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i11, int i12) {
        checkData();
        this.digest.update(bArr, i11, i12);
    }

    public SM2Signer(Digest digest) {
        this(StandardDSAEncoding.INSTANCE, digest);
    }

    public SM2Signer() {
        this(StandardDSAEncoding.INSTANCE, new SM3Digest());
    }

    public SM2Signer(DSAEncoding dSAEncoding, Digest digest) {
        this.kCalculator = new RandomDSAKCalculator();
        this.state = 0;
        this.encoding = dSAEncoding;
        this.digest = digest;
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        checkData();
        try {
            BigInteger[] bigIntegerArrDecode = this.encoding.decode(this.ecParams.getN(), bArr);
            return verifySignature(bigIntegerArrDecode[0], bigIntegerArrDecode[1]);
        } catch (Exception unused) {
            return false;
        } finally {
            reset();
        }
    }
}
