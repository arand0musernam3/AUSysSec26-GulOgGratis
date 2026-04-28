package org.bouncycastle.pqc.legacy.crypto.mceliece;

import com.braze.h2;
import i4.a;
import java.security.SecureRandom;
import m0.i1;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageEncryptor;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Vector;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GoppaCode;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.legacy.math.linearalgebra.PolynomialGF2mSmallM;

/* JADX INFO: loaded from: classes3.dex */
public class McElieceCipher implements MessageEncryptor {
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.1";
    public int cipherTextSize;
    private boolean forEncryption;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f33685k;
    private McElieceKeyParameters key;
    public int maxPlainTextSize;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f33686n;

    /* JADX INFO: renamed from: sr, reason: collision with root package name */
    private SecureRandom f33687sr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f33688t;

    private byte[] computeMessage(GF2Vector gF2Vector) throws InvalidCipherTextException {
        byte[] encoded = gF2Vector.getEncoded();
        int length = encoded.length - 1;
        while (length >= 0 && encoded[length] == 0) {
            length--;
        }
        if (length < 0 || encoded[length] != 1) {
            i1.i("Bad Padding: invalid ciphertext");
            return null;
        }
        byte[] bArr = new byte[length];
        System.arraycopy(encoded, 0, bArr, 0, length);
        return bArr;
    }

    private GF2Vector computeMessageRepresentative(byte[] bArr) {
        byte[] bArr2 = new byte[this.maxPlainTextSize + ((this.f33685k & 7) != 0 ? 1 : 0)];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[bArr.length] = 1;
        return GF2Vector.OS2VP(this.f33685k, bArr2);
    }

    private void initCipherDecrypt(McEliecePrivateKeyParameters mcEliecePrivateKeyParameters) {
        this.f33686n = mcEliecePrivateKeyParameters.getN();
        int k11 = mcEliecePrivateKeyParameters.getK();
        this.f33685k = k11;
        this.maxPlainTextSize = k11 >> 3;
        this.cipherTextSize = this.f33686n >> 3;
    }

    private void initCipherEncrypt(McEliecePublicKeyParameters mcEliecePublicKeyParameters) {
        this.f33686n = mcEliecePublicKeyParameters.getN();
        this.f33685k = mcEliecePublicKeyParameters.getK();
        this.f33688t = mcEliecePublicKeyParameters.getT();
        this.cipherTextSize = this.f33686n >> 3;
        this.maxPlainTextSize = this.f33685k >> 3;
    }

    public int getKeySize(McElieceKeyParameters mcElieceKeyParameters) {
        if (mcElieceKeyParameters instanceof McEliecePublicKeyParameters) {
            return ((McEliecePublicKeyParameters) mcElieceKeyParameters).getN();
        }
        if (mcElieceKeyParameters instanceof McEliecePrivateKeyParameters) {
            return ((McEliecePrivateKeyParameters) mcElieceKeyParameters).getN();
        }
        a.f("unsupported type");
        return 0;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public void init(boolean z11, CipherParameters cipherParameters) {
        this.forEncryption = z11;
        if (!z11) {
            McEliecePrivateKeyParameters mcEliecePrivateKeyParameters = (McEliecePrivateKeyParameters) cipherParameters;
            this.key = mcEliecePrivateKeyParameters;
            initCipherDecrypt(mcEliecePrivateKeyParameters);
        } else {
            if (!(cipherParameters instanceof ParametersWithRandom)) {
                this.f33687sr = CryptoServicesRegistrar.getSecureRandom();
                McEliecePublicKeyParameters mcEliecePublicKeyParameters = (McEliecePublicKeyParameters) cipherParameters;
                this.key = mcEliecePublicKeyParameters;
                initCipherEncrypt(mcEliecePublicKeyParameters);
                return;
            }
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.f33687sr = parametersWithRandom.getRandom();
            McEliecePublicKeyParameters mcEliecePublicKeyParameters2 = (McEliecePublicKeyParameters) parametersWithRandom.getParameters();
            this.key = mcEliecePublicKeyParameters2;
            initCipherEncrypt(mcEliecePublicKeyParameters2);
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public byte[] messageDecrypt(byte[] bArr) throws InvalidCipherTextException {
        if (this.forEncryption) {
            h2.b("cipher initialised for decryption");
            return null;
        }
        GF2Vector gF2VectorOS2VP = GF2Vector.OS2VP(this.f33686n, bArr);
        McEliecePrivateKeyParameters mcEliecePrivateKeyParameters = (McEliecePrivateKeyParameters) this.key;
        GF2mField field = mcEliecePrivateKeyParameters.getField();
        PolynomialGF2mSmallM goppaPoly = mcEliecePrivateKeyParameters.getGoppaPoly();
        GF2Matrix sInv = mcEliecePrivateKeyParameters.getSInv();
        Permutation p12 = mcEliecePrivateKeyParameters.getP1();
        Permutation p22 = mcEliecePrivateKeyParameters.getP2();
        GF2Matrix h11 = mcEliecePrivateKeyParameters.getH();
        PolynomialGF2mSmallM[] qInv = mcEliecePrivateKeyParameters.getQInv();
        Permutation permutationRightMultiply = p12.rightMultiply(p22);
        GF2Vector gF2Vector = (GF2Vector) gF2VectorOS2VP.multiply(permutationRightMultiply.computeInverse());
        GF2Vector gF2VectorSyndromeDecode = GoppaCode.syndromeDecode((GF2Vector) h11.rightMultiply(gF2Vector), field, goppaPoly, qInv);
        GF2Vector gF2Vector2 = (GF2Vector) ((GF2Vector) gF2Vector.add(gF2VectorSyndromeDecode)).multiply(p12);
        return computeMessage((GF2Vector) sInv.leftMultiply(gF2Vector2.extractRightVector(this.f33685k)));
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public byte[] messageEncrypt(byte[] bArr) {
        if (!this.forEncryption) {
            h2.b("cipher initialised for decryption");
            return null;
        }
        GF2Vector gF2VectorComputeMessageRepresentative = computeMessageRepresentative(bArr);
        return ((GF2Vector) ((McEliecePublicKeyParameters) this.key).getG().leftMultiply(gF2VectorComputeMessageRepresentative).add(new GF2Vector(this.f33686n, this.f33688t, this.f33687sr))).getEncoded();
    }
}
