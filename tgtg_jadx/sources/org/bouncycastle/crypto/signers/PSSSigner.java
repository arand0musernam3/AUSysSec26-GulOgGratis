package org.bouncycastle.crypto.signers;

import i4.a;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.Prehash;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSABlindingParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.util.Arrays;
import qc.y;
import w2.l1;

/* JADX INFO: loaded from: classes3.dex */
public class PSSSigner implements Signer {
    public static final byte TRAILER_IMPLICIT = -68;
    private byte[] block;
    private AsymmetricBlockCipher cipher;
    private Digest contentDigest1;
    private Digest contentDigest2;
    private int emBits;
    private int hLen;
    private byte[] mDash;
    private Digest mgfDigest;
    private int mgfhLen;
    private SecureRandom random;
    private int sLen;
    private boolean sSet;
    private byte[] salt;
    private byte trailer;

    private PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, Digest digest3, int i11, byte b8) {
        this.cipher = asymmetricBlockCipher;
        this.contentDigest1 = digest;
        this.contentDigest2 = digest2;
        this.mgfDigest = digest3;
        this.hLen = digest2.getDigestSize();
        this.mgfhLen = digest3.getDigestSize();
        this.sSet = false;
        this.sLen = i11;
        this.salt = new byte[i11];
        this.mDash = new byte[i11 + 8 + this.hLen];
        this.trailer = b8;
    }

    private void ItoOSP(int i11, byte[] bArr) {
        bArr[0] = (byte) (i11 >>> 24);
        bArr[1] = (byte) (i11 >>> 16);
        bArr[2] = (byte) (i11 >>> 8);
        bArr[3] = (byte) i11;
    }

    private void clearBlock(byte[] bArr) {
        for (int i11 = 0; i11 != bArr.length; i11++) {
            bArr[i11] = 0;
        }
    }

    public static PSSSigner createRawSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
        return new PSSSigner(asymmetricBlockCipher, Prehash.forDigest(digest), digest, digest, digest.getDigestSize(), TRAILER_IMPLICIT);
    }

    private byte[] maskGenerator(byte[] bArr, int i11, int i12, int i13) {
        Digest digest = this.mgfDigest;
        if (!(digest instanceof Xof)) {
            return maskGeneratorFunction1(bArr, i11, i12, i13);
        }
        byte[] bArr2 = new byte[i13];
        digest.update(bArr, i11, i12);
        ((Xof) this.mgfDigest).doFinal(bArr2, 0, i13);
        return bArr2;
    }

    private byte[] maskGeneratorFunction1(byte[] bArr, int i11, int i12, int i13) {
        int i14;
        byte[] bArr2 = new byte[i13];
        byte[] bArr3 = new byte[this.mgfhLen];
        byte[] bArr4 = new byte[4];
        this.mgfDigest.reset();
        int i15 = 0;
        while (true) {
            i14 = this.mgfhLen;
            if (i15 >= i13 / i14) {
                break;
            }
            ItoOSP(i15, bArr4);
            this.mgfDigest.update(bArr, i11, i12);
            this.mgfDigest.update(bArr4, 0, 4);
            this.mgfDigest.doFinal(bArr3, 0);
            int i16 = this.mgfhLen;
            System.arraycopy(bArr3, 0, bArr2, i15 * i16, i16);
            i15++;
        }
        if (i14 * i15 < i13) {
            ItoOSP(i15, bArr4);
            this.mgfDigest.update(bArr, i11, i12);
            this.mgfDigest.update(bArr4, 0, 4);
            this.mgfDigest.doFinal(bArr3, 0);
            int i17 = this.mgfhLen;
            System.arraycopy(bArr3, 0, bArr2, i15 * i17, i13 - (i15 * i17));
        }
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws DataLengthException, CryptoException {
        int digestSize = this.contentDigest1.getDigestSize();
        int i11 = this.hLen;
        if (digestSize != i11) {
            y.e();
            return null;
        }
        Digest digest = this.contentDigest1;
        byte[] bArr = this.mDash;
        digest.doFinal(bArr, (bArr.length - i11) - this.sLen);
        if (this.sLen != 0) {
            if (!this.sSet) {
                this.random.nextBytes(this.salt);
            }
            byte[] bArr2 = this.salt;
            byte[] bArr3 = this.mDash;
            int length = bArr3.length;
            int i12 = this.sLen;
            System.arraycopy(bArr2, 0, bArr3, length - i12, i12);
        }
        int i13 = this.hLen;
        byte[] bArr4 = new byte[i13];
        Digest digest2 = this.contentDigest2;
        byte[] bArr5 = this.mDash;
        digest2.update(bArr5, 0, bArr5.length);
        this.contentDigest2.doFinal(bArr4, 0);
        byte[] bArr6 = this.block;
        int length2 = bArr6.length;
        int i14 = this.sLen;
        int i15 = this.hLen;
        bArr6[(((length2 - i14) - 1) - i15) - 1] = 1;
        System.arraycopy(this.salt, 0, bArr6, ((bArr6.length - i14) - i15) - 1, i14);
        byte[] bArrMaskGenerator = maskGenerator(bArr4, 0, i13, (this.block.length - this.hLen) - 1);
        int i16 = 0;
        while (true) {
            int length3 = bArrMaskGenerator.length;
            byte[] bArr7 = this.block;
            if (i16 == length3) {
                int length4 = bArr7.length;
                int i17 = this.hLen;
                System.arraycopy(bArr4, 0, bArr7, (length4 - i17) - 1, i17);
                byte[] bArr8 = this.block;
                bArr8[0] = (byte) ((255 >>> ((bArr8.length * 8) - this.emBits)) & bArr8[0]);
                bArr8[bArr8.length - 1] = this.trailer;
                byte[] bArrProcessBlock = this.cipher.processBlock(bArr8, 0, bArr8.length);
                clearBlock(this.block);
                return bArrProcessBlock;
            }
            bArr7[i16] = (byte) (bArr7[i16] ^ bArrMaskGenerator[i16]);
            i16++;
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z11, CipherParameters cipherParameters) {
        CipherParameters parameters;
        RSAKeyParameters publicKey;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            parameters = parametersWithRandom.getParameters();
            this.random = parametersWithRandom.getRandom();
        } else {
            if (z11) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            parameters = cipherParameters;
        }
        if (parameters instanceof RSABlindingParameters) {
            publicKey = ((RSABlindingParameters) parameters).getPublicKey();
            this.cipher.init(z11, cipherParameters);
        } else {
            publicKey = (RSAKeyParameters) parameters;
            this.cipher.init(z11, parameters);
        }
        int iBitLength = publicKey.getModulus().bitLength();
        int i11 = iBitLength - 1;
        this.emBits = i11;
        if (i11 < l1.a(this.sLen, 8, this.hLen * 8, 9)) {
            a.f("key too small for specified hash and salt lengths");
        } else {
            this.block = new byte[(iBitLength + 6) / 8];
            reset();
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.contentDigest1.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b8) {
        this.contentDigest1.update(b8);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        byte[] bArr2;
        int length;
        byte b8;
        byte[] bArr3;
        int digestSize = this.contentDigest1.getDigestSize();
        int i11 = this.hLen;
        if (digestSize != i11) {
            y.e();
            return false;
        }
        Digest digest = this.contentDigest1;
        byte[] bArr4 = this.mDash;
        digest.doFinal(bArr4, (bArr4.length - i11) - this.sLen);
        try {
            byte[] bArrProcessBlock = this.cipher.processBlock(bArr, 0, bArr.length);
            byte[] bArr5 = this.block;
            Arrays.fill(bArr5, 0, bArr5.length - bArrProcessBlock.length, (byte) 0);
            byte[] bArr6 = this.block;
            System.arraycopy(bArrProcessBlock, 0, bArr6, bArr6.length - bArrProcessBlock.length, bArrProcessBlock.length);
            bArr2 = this.block;
            length = 255 >>> ((bArr2.length * 8) - this.emBits);
            b8 = bArr2[0];
        } catch (Exception unused) {
        }
        if ((b8 & 255) != (b8 & length) || bArr2[bArr2.length - 1] != this.trailer) {
            clearBlock(bArr2);
            return false;
        }
        int length2 = bArr2.length;
        int i12 = this.hLen;
        byte[] bArrMaskGenerator = maskGenerator(bArr2, (length2 - i12) - 1, i12, (bArr2.length - i12) - 1);
        int i13 = 0;
        while (true) {
            int length3 = bArrMaskGenerator.length;
            bArr3 = this.block;
            if (i13 == length3) {
                break;
            }
            bArr3[i13] = (byte) (bArr3[i13] ^ bArrMaskGenerator[i13]);
            i13++;
        }
        bArr3[0] = (byte) (bArr3[0] & length);
        int i14 = 0;
        while (true) {
            byte[] bArr7 = this.block;
            int length4 = bArr7.length;
            int i15 = this.hLen;
            int i16 = this.sLen;
            if (i14 != ((length4 - i15) - i16) - 2) {
                if (bArr7[i14] != 0) {
                    clearBlock(bArr7);
                    return false;
                }
                i14++;
            } else {
                if (bArr7[((bArr7.length - i15) - i16) - 2] != 1) {
                    clearBlock(bArr7);
                    return false;
                }
                if (this.sSet) {
                    byte[] bArr8 = this.salt;
                    byte[] bArr9 = this.mDash;
                    System.arraycopy(bArr8, 0, bArr9, bArr9.length - i16, i16);
                } else {
                    int length5 = ((bArr7.length - i16) - i15) - 1;
                    byte[] bArr10 = this.mDash;
                    System.arraycopy(bArr7, length5, bArr10, bArr10.length - i16, i16);
                }
                Digest digest2 = this.contentDigest2;
                byte[] bArr11 = this.mDash;
                digest2.update(bArr11, 0, bArr11.length);
                Digest digest3 = this.contentDigest2;
                byte[] bArr12 = this.mDash;
                digest3.doFinal(bArr12, bArr12.length - this.hLen);
                int length6 = this.block.length;
                int i17 = this.hLen;
                int i18 = (length6 - i17) - 1;
                int length7 = this.mDash.length - i17;
                while (true) {
                    byte[] bArr13 = this.mDash;
                    if (length7 == bArr13.length) {
                        clearBlock(bArr13);
                        clearBlock(this.block);
                        return true;
                    }
                    if ((this.block[i18] ^ bArr13[length7]) != 0) {
                        clearBlock(bArr13);
                        clearBlock(this.block);
                        return false;
                    }
                    i18++;
                    length7++;
                }
            }
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i11, int i12) {
        this.contentDigest1.update(bArr, i11, i12);
    }

    public static PSSSigner createRawSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, int i11, byte b8) {
        return new PSSSigner(asymmetricBlockCipher, Prehash.forDigest(digest), digest, digest2, i11, b8);
    }

    public static PSSSigner createRawSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, byte[] bArr, byte b8) {
        return new PSSSigner(asymmetricBlockCipher, Prehash.forDigest(digest), digest, digest2, bArr, b8);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, int i11, byte b8) {
        this(asymmetricBlockCipher, digest, digest, i11, b8);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, int i11) {
        this(asymmetricBlockCipher, digest, digest2, i11, TRAILER_IMPLICIT);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, int i11, byte b8) {
        this(asymmetricBlockCipher, digest, digest, digest2, i11, b8);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, int i11) {
        this(asymmetricBlockCipher, digest, i11, TRAILER_IMPLICIT);
    }

    private PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, Digest digest3, byte[] bArr, byte b8) {
        this.cipher = asymmetricBlockCipher;
        this.contentDigest1 = digest;
        this.contentDigest2 = digest2;
        this.mgfDigest = digest3;
        this.hLen = digest2.getDigestSize();
        this.mgfhLen = digest3.getDigestSize();
        this.sSet = true;
        int length = bArr.length;
        this.sLen = length;
        this.salt = bArr;
        this.mDash = new byte[length + 8 + this.hLen];
        this.trailer = b8;
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, byte[] bArr) {
        this(asymmetricBlockCipher, digest, digest2, bArr, TRAILER_IMPLICIT);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, byte[] bArr, byte b8) {
        this(asymmetricBlockCipher, digest, digest, digest2, bArr, b8);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, byte[] bArr) {
        this(asymmetricBlockCipher, digest, digest, bArr, TRAILER_IMPLICIT);
    }
}
