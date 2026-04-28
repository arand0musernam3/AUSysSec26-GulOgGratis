package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.DSAExt;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.GOST3411_2012_256Digest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.signers.ECGOST3410Signer;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jce.interfaces.ECKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.provider.a;

/* JADX INFO: loaded from: classes3.dex */
public class ECGOST2012SignatureSpi256 extends SignatureSpi implements PKCSObjectIdentifiers, X509ObjectIdentifiers {
    private int size = 64;
    private int halfSize = 64 / 2;
    private Digest digest = new GOST3411_2012_256Digest();
    private DSAExt signer = new ECGOST3410Signer();

    public static AsymmetricKeyParameter generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        return publicKey instanceof BCECGOST3410_2012PublicKey ? ((BCECGOST3410_2012PublicKey) publicKey).engineGetKeyParameters() : ECUtil.generatePublicKeyParameter(publicKey);
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof ECKey)) {
            a.i("cannot recognise key type in ECGOST-2012-256 signer");
            return;
        }
        ECKeyParameters eCKeyParameters = (ECKeyParameters) ECUtil.generatePrivateKeyParameter(privateKey);
        if (eCKeyParameters.getParameters().getN().bitLength() > 256) {
            a.i("key out of range for ECGOST-2012-256");
            return;
        }
        this.digest.reset();
        SecureRandom secureRandom = ((SignatureSpi) this).appRandom;
        DSAExt dSAExt = this.signer;
        if (secureRandom != null) {
            dSAExt.init(true, new ParametersWithRandom(eCKeyParameters, secureRandom));
        } else {
            dSAExt.init(true, eCKeyParameters);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        ECKeyParameters eCKeyParameters;
        if (publicKey instanceof ECPublicKey) {
            eCKeyParameters = (ECKeyParameters) generatePublicKeyParameter(publicKey);
        } else {
            try {
                eCKeyParameters = (ECKeyParameters) ECUtil.generatePublicKeyParameter(BouncyCastleProvider.getPublicKey(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded())));
            } catch (Exception unused) {
                a.i("cannot recognise key type in ECGOST-2012-256 signer");
                return;
            }
        }
        if (eCKeyParameters.getParameters().getN().bitLength() > 256) {
            a.i("key out of range for ECGOST-2012-256");
        } else {
            this.digest.reset();
            this.signer.init(false, eCKeyParameters);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        try {
            byte[] bArr2 = new byte[this.size];
            BigInteger[] bigIntegerArrGenerateSignature = this.signer.generateSignature(bArr);
            byte[] byteArray = bigIntegerArrGenerateSignature[0].toByteArray();
            byte[] byteArray2 = bigIntegerArrGenerateSignature[1].toByteArray();
            byte b8 = byteArray2[0];
            int i11 = this.halfSize;
            if (b8 != 0) {
                System.arraycopy(byteArray2, 0, bArr2, i11 - byteArray2.length, byteArray2.length);
            } else {
                System.arraycopy(byteArray2, 1, bArr2, i11 - (byteArray2.length - 1), byteArray2.length - 1);
            }
            byte b11 = byteArray[0];
            int i12 = this.size;
            if (b11 != 0) {
                System.arraycopy(byteArray, 0, bArr2, i12 - byteArray.length, byteArray.length);
                return bArr2;
            }
            System.arraycopy(byteArray, 1, bArr2, i12 - (byteArray.length - 1), byteArray.length - 1);
            return bArr2;
        } catch (Exception e5) {
            a.f(e5);
            return null;
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b8) throws SignatureException {
        this.digest.update(b8);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        try {
            int i11 = this.halfSize;
            byte[] bArr3 = new byte[i11];
            byte[] bArr4 = new byte[i11];
            System.arraycopy(bArr, 0, bArr4, 0, i11);
            int i12 = this.halfSize;
            System.arraycopy(bArr, i12, bArr3, 0, i12);
            BigInteger[] bigIntegerArr = {new BigInteger(1, bArr3), new BigInteger(1, bArr4)};
            return this.signer.verifySignature(bArr2, bigIntegerArr[0], bigIntegerArr[1]);
        } catch (Exception unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i11, int i12) throws SignatureException {
        this.digest.update(bArr, i11, i12);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }
}
