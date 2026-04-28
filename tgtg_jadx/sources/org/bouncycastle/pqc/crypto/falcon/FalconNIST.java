package org.bouncycastle.pqc.crypto.falcon;

import com.braze.h2;
import i4.a;
import java.security.SecureRandom;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.util.Arrays;
import w2.l1;

/* JADX INFO: loaded from: classes3.dex */
class FalconNIST {
    final int CRYPTO_BYTES;
    private final int CRYPTO_PUBLICKEYBYTES;
    private final int CRYPTO_SECRETKEYBYTES;
    final int LOGN;
    private final int N;
    final int NONCELEN;
    private final SecureRandom rand;

    public FalconNIST(int i11, int i12, SecureRandom secureRandom) {
        this.rand = secureRandom;
        this.LOGN = i11;
        this.NONCELEN = i12;
        int i13 = 1 << i11;
        this.N = i13;
        this.CRYPTO_PUBLICKEYBYTES = ((i13 * 14) / 8) + 1;
        if (i11 == 10) {
            this.CRYPTO_SECRETKEYBYTES = 2305;
            this.CRYPTO_BYTES = 1330;
            return;
        }
        if (i11 == 9 || i11 == 8) {
            this.CRYPTO_SECRETKEYBYTES = ((i13 * 12) / 8) + 1 + i13;
            this.CRYPTO_BYTES = 690;
        } else if (i11 == 7 || i11 == 6) {
            this.CRYPTO_SECRETKEYBYTES = ((i13 * 14) / 8) + 1 + i13;
            this.CRYPTO_BYTES = 690;
        } else {
            this.CRYPTO_SECRETKEYBYTES = l1.a(i13, 2, 1, i13);
            this.CRYPTO_BYTES = 690;
        }
    }

    public byte[] crypto_sign(byte[] bArr, byte[] bArr2, int i11, byte[] bArr3) {
        int i12 = this.N;
        byte[] bArr4 = new byte[i12];
        byte[] bArr5 = new byte[i12];
        byte[] bArr6 = new byte[i12];
        byte[] bArr7 = new byte[i12];
        short[] sArr = new short[i12];
        short[] sArr2 = new short[i12];
        byte[] bArr8 = new byte[48];
        byte[] bArr9 = new byte[this.NONCELEN];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        FalconSign falconSign = new FalconSign();
        int i13 = this.LOGN;
        byte[] bArr10 = FalconCodec.max_fg_bits;
        int iTrim_i8_decode = FalconCodec.trim_i8_decode(bArr4, i13, bArr10[i13], bArr3, 0, this.CRYPTO_SECRETKEYBYTES);
        if (iTrim_i8_decode == 0) {
            h2.b("f decode failed");
            return null;
        }
        int i14 = this.LOGN;
        int iTrim_i8_decode2 = FalconCodec.trim_i8_decode(bArr5, i14, bArr10[i14], bArr3, iTrim_i8_decode, this.CRYPTO_SECRETKEYBYTES - iTrim_i8_decode);
        if (iTrim_i8_decode2 == 0) {
            h2.b("g decode failed");
            return null;
        }
        int i15 = iTrim_i8_decode + iTrim_i8_decode2;
        int i16 = this.LOGN;
        int iTrim_i8_decode3 = FalconCodec.trim_i8_decode(bArr6, i16, FalconCodec.max_FG_bits[i16], bArr3, i15, this.CRYPTO_SECRETKEYBYTES - i15);
        if (iTrim_i8_decode3 == 0) {
            a.f("F decode failed");
            return null;
        }
        if (iTrim_i8_decode3 + i15 != this.CRYPTO_SECRETKEYBYTES - 1) {
            h2.b("full key not used");
            return null;
        }
        if (!FalconVrfy.complete_private(bArr7, bArr4, bArr5, bArr6, this.LOGN, new short[this.N * 2])) {
            h2.b("complete_private failed");
            return null;
        }
        this.rand.nextBytes(bArr9);
        sHAKEDigest.update(bArr9, 0, this.NONCELEN);
        sHAKEDigest.update(bArr2, 0, i11);
        FalconCommon.hash_to_point_vartime(sHAKEDigest, sArr2, this.LOGN);
        this.rand.nextBytes(bArr8);
        sHAKEDigest.reset();
        sHAKEDigest.update(bArr8, 0, 48);
        falconSign.sign_dyn(sArr, sHAKEDigest, bArr4, bArr5, bArr6, bArr7, sArr2, this.LOGN, new double[this.N * 10]);
        int i17 = (this.CRYPTO_BYTES - 2) - this.NONCELEN;
        byte[] bArr11 = new byte[i17];
        int iComp_encode = FalconCodec.comp_encode(bArr11, i17, sArr, this.LOGN);
        if (iComp_encode == 0) {
            h2.b("signature failed to generate");
            return null;
        }
        bArr[0] = (byte) (this.LOGN + 48);
        System.arraycopy(bArr9, 0, bArr, 1, this.NONCELEN);
        System.arraycopy(bArr11, 0, bArr, this.NONCELEN + 1, iComp_encode);
        return Arrays.copyOfRange(bArr, 0, this.NONCELEN + 1 + iComp_encode);
    }

    public byte[][] crypto_sign_keypair(byte[] bArr, byte[] bArr2) {
        int i11 = this.N;
        byte[] bArr3 = new byte[i11];
        byte[] bArr4 = new byte[i11];
        byte[] bArr5 = new byte[i11];
        short[] sArr = new short[i11];
        byte[] bArr6 = new byte[48];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        this.rand.nextBytes(bArr6);
        sHAKEDigest.update(bArr6, 0, 48);
        FalconKeyGen.keygen(sHAKEDigest, bArr3, bArr4, bArr5, sArr, this.LOGN);
        int i12 = this.LOGN;
        bArr2[0] = (byte) (i12 + 80);
        int i13 = this.CRYPTO_SECRETKEYBYTES - 1;
        byte[] bArr7 = FalconCodec.max_fg_bits;
        int iTrim_i8_encode = FalconCodec.trim_i8_encode(bArr2, 1, i13, bArr3, i12, bArr7[i12]);
        if (iTrim_i8_encode == 0) {
            h2.b("f encode failed");
            return null;
        }
        int i14 = iTrim_i8_encode + 1;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, 1, i14);
        int i15 = this.CRYPTO_SECRETKEYBYTES - i14;
        int i16 = this.LOGN;
        int iTrim_i8_encode2 = FalconCodec.trim_i8_encode(bArr2, i14, i15, bArr4, i16, bArr7[i16]);
        if (iTrim_i8_encode2 == 0) {
            h2.b("g encode failed");
            return null;
        }
        int i17 = i14 + iTrim_i8_encode2;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr2, i14, i17);
        int i18 = this.CRYPTO_SECRETKEYBYTES - i17;
        int i19 = this.LOGN;
        int iTrim_i8_encode3 = FalconCodec.trim_i8_encode(bArr2, i17, i18, bArr5, i19, FalconCodec.max_FG_bits[i19]);
        if (iTrim_i8_encode3 == 0) {
            h2.b("F encode failed");
            return null;
        }
        int i21 = iTrim_i8_encode3 + i17;
        byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr2, i17, i21);
        if (i21 != this.CRYPTO_SECRETKEYBYTES) {
            h2.b("secret key encoding failed");
            return null;
        }
        int i22 = this.LOGN;
        bArr[0] = (byte) i22;
        if (FalconCodec.modq_encode(bArr, this.CRYPTO_PUBLICKEYBYTES - 1, sArr, i22) == this.CRYPTO_PUBLICKEYBYTES - 1) {
            return new byte[][]{Arrays.copyOfRange(bArr, 1, bArr.length), bArrCopyOfRange, bArrCopyOfRange2, bArrCopyOfRange3};
        }
        h2.b("public key encoding failed");
        return null;
    }

    public int crypto_sign_open(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int i11 = this.N;
        short[] sArr = new short[i11];
        short[] sArr2 = new short[i11];
        short[] sArr3 = new short[i11];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        if (FalconCodec.modq_decode(sArr, this.LOGN, bArr4, this.CRYPTO_PUBLICKEYBYTES - 1) != this.CRYPTO_PUBLICKEYBYTES - 1) {
            return -1;
        }
        FalconVrfy.to_ntt_monty(sArr, this.LOGN);
        int length = bArr.length;
        int length2 = bArr3.length;
        if (length < 1 || FalconCodec.comp_decode(sArr3, this.LOGN, bArr, length) != length) {
            return -1;
        }
        sHAKEDigest.update(bArr2, 0, this.NONCELEN);
        sHAKEDigest.update(bArr3, 0, length2);
        FalconCommon.hash_to_point_vartime(sHAKEDigest, sArr2, this.LOGN);
        return FalconVrfy.verify_raw(sArr2, sArr3, sArr, this.LOGN, new short[this.N]) == 0 ? -1 : 0;
    }
}
