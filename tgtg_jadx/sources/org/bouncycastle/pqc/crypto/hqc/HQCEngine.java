package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;
import w2.l1;

/* JADX INFO: loaded from: classes3.dex */
class HQCEngine {
    private int K_BYTE;
    private int K_BYTE_64;
    private int N1N2_BYTE;
    private int N1N2_BYTE_64;
    private int N1_BYTE;
    private int N1_BYTE_64;
    private int N_BYTE;
    private int N_BYTE_64;
    private long RED_MASK;
    private int delta;
    private int fft;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f33498g;
    private int[] generatorPoly;
    private GF2PolynomialCalculator gfCalculator;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f33499k;
    private int mulParam;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f33500n;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private int f33501n1;
    private int n1n2;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    private int f33502n2;
    private int rejectionThreshold;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f33503w;

    /* JADX INFO: renamed from: we, reason: collision with root package name */
    private int f33504we;

    /* JADX INFO: renamed from: wr, reason: collision with root package name */
    private int f33505wr;
    private int SEED_SIZE = 40;
    private byte G_FCT_DOMAIN = 3;
    private byte K_FCT_DOMAIN = 4;
    private int GF_POLY_WT = 5;
    private int GF_POLY_M2 = 4;
    private int SALT_SIZE_BYTES = 16;
    private int SALT_SIZE_64 = 2;
    private int SHA512_BYTES = 64;

    public HQCEngine(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int[] iArr) {
        this.f33500n = i11;
        this.f33499k = i14;
        this.delta = i16;
        this.f33503w = i17;
        this.f33505wr = i18;
        this.f33504we = i19;
        this.f33501n1 = i12;
        this.f33502n2 = i13;
        int i23 = i12 * i13;
        this.n1n2 = i23;
        this.generatorPoly = iArr;
        this.f33498g = i15;
        this.rejectionThreshold = i21;
        this.fft = i22;
        this.mulParam = (int) Math.ceil(i13 / 128);
        this.N_BYTE = Utils.getByteSizeFromBitSize(i11);
        this.K_BYTE = i14;
        this.N_BYTE_64 = Utils.getByte64SizeFromBitSize(i11);
        this.K_BYTE_64 = Utils.getByteSizeFromBitSize(i14);
        this.N1_BYTE_64 = Utils.getByteSizeFromBitSize(i12);
        this.N1N2_BYTE_64 = Utils.getByte64SizeFromBitSize(i23);
        this.N1N2_BYTE = Utils.getByteSizeFromBitSize(i23);
        this.N1_BYTE = Utils.getByteSizeFromBitSize(i12);
        long j9 = (1 << ((int) (((long) i11) % 64))) - 1;
        this.RED_MASK = j9;
        this.gfCalculator = new GF2PolynomialCalculator(this.N_BYTE_64, i11, j9);
    }

    private int decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, long[] jArr) {
        long[] jArr2 = new long[this.N_BYTE_64];
        Utils.fromByteArrayToLongArray(jArr2, bArr4);
        int i11 = this.N1N2_BYTE_64;
        long[] jArr3 = new long[i11];
        Utils.fromByteArrayToLongArray(jArr3, bArr5);
        long[] jArr4 = new long[this.N_BYTE_64];
        System.arraycopy(jArr3, 0, jArr4, 0, i11);
        long[] jArr5 = new long[this.N_BYTE_64];
        this.gfCalculator.multLongs(jArr5, jArr, jArr2);
        GF2PolynomialCalculator.addLongs(jArr5, jArr5, jArr4);
        int i12 = this.f33501n1;
        byte[] bArr6 = new byte[i12];
        ReedMuller.decode(bArr6, jArr5, i12, this.mulParam);
        ReedSolomon.decode(bArr2, bArr6, this.f33501n1, this.fft, this.delta, this.f33499k, this.f33498g);
        System.arraycopy(bArr2, 0, bArr, 0, bArr.length);
        return 0;
    }

    private void encrypt(byte[] bArr, long[] jArr, long[] jArr2, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        KeccakRandomGenerator keccakRandomGenerator = new KeccakRandomGenerator(256);
        keccakRandomGenerator.seedExpanderInit(bArr4, this.SEED_SIZE);
        int i11 = this.N_BYTE_64;
        long[] jArr3 = new long[i11];
        long[] jArr4 = new long[i11];
        long[] jArr5 = new long[i11];
        generateRandomFixedWeight(jArr5, keccakRandomGenerator, this.f33505wr);
        generateRandomFixedWeight(jArr3, keccakRandomGenerator, this.f33504we);
        generateRandomFixedWeight(jArr4, keccakRandomGenerator, this.f33505wr);
        long[] jArr6 = new long[this.N_BYTE_64];
        this.gfCalculator.multLongs(jArr6, jArr5, jArr2);
        GF2PolynomialCalculator.addLongs(jArr6, jArr6, jArr4);
        Utils.fromLongArrayToByteArray(bArr, jArr6);
        int i12 = this.f33501n1;
        byte[] bArr5 = new byte[i12];
        int i13 = this.N1N2_BYTE_64;
        long[] jArr7 = new long[i13];
        long[] jArr8 = new long[this.N_BYTE_64];
        ReedSolomon.encode(bArr5, bArr3, this.K_BYTE * 8, i12, this.f33499k, this.f33498g, this.generatorPoly);
        ReedMuller.encode(jArr7, bArr5, this.f33501n1, this.mulParam);
        System.arraycopy(jArr7, 0, jArr8, 0, i13);
        long[] jArr9 = new long[this.N_BYTE_64];
        Utils.fromByteArrayToLongArray(jArr9, bArr2);
        long[] jArr10 = new long[this.N_BYTE_64];
        this.gfCalculator.multLongs(jArr10, jArr5, jArr9);
        GF2PolynomialCalculator.addLongs(jArr10, jArr10, jArr8);
        GF2PolynomialCalculator.addLongs(jArr10, jArr10, jArr3);
        int i14 = this.n1n2;
        int i15 = this.f33500n;
        int i16 = this.N1N2_BYTE_64;
        Utils.resizeArray(jArr, i14, jArr10, i15, i16, i16);
    }

    private void extractCiphertexts(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        System.arraycopy(bArr4, 0, bArr, 0, bArr.length);
        System.arraycopy(bArr4, bArr.length, bArr2, 0, bArr2.length);
        System.arraycopy(bArr4, bArr.length + bArr2.length, bArr3, 0, bArr3.length);
    }

    private void extractKeysFromSecretKeys(long[] jArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i11 = this.SEED_SIZE;
        byte[] bArr4 = new byte[i11];
        System.arraycopy(bArr3, 0, bArr4, 0, i11);
        System.arraycopy(bArr3, this.SEED_SIZE, bArr, 0, this.K_BYTE);
        KeccakRandomGenerator keccakRandomGenerator = new KeccakRandomGenerator(256);
        keccakRandomGenerator.seedExpanderInit(bArr4, i11);
        generateRandomFixedWeight(jArr, keccakRandomGenerator, this.f33503w);
        System.arraycopy(bArr3, this.SEED_SIZE + this.K_BYTE, bArr2, 0, bArr2.length);
    }

    private void extractPublicKeys(long[] jArr, byte[] bArr, byte[] bArr2) {
        int i11 = this.SEED_SIZE;
        byte[] bArr3 = new byte[i11];
        System.arraycopy(bArr2, 0, bArr3, 0, i11);
        KeccakRandomGenerator keccakRandomGenerator = new KeccakRandomGenerator(256);
        keccakRandomGenerator.seedExpanderInit(bArr3, i11);
        long[] jArr2 = new long[this.N_BYTE_64];
        generatePublicKeyH(jArr2, keccakRandomGenerator);
        System.arraycopy(jArr2, 0, jArr, 0, jArr.length);
        System.arraycopy(bArr2, 40, bArr, 0, bArr.length);
    }

    private void generateRandomFixedWeight(long[] jArr, KeccakRandomGenerator keccakRandomGenerator, int i11) {
        int i12 = this.f33505wr;
        int[] iArr = new int[i12];
        byte[] bArr = new byte[i12 * 4];
        int[] iArr2 = new int[i12];
        int[] iArr3 = new int[i12];
        long[] jArr2 = new long[i12];
        keccakRandomGenerator.expandSeed(bArr, i11 * 4);
        Pack.littleEndianToInt(bArr, 0, iArr, 0, i12);
        for (int i13 = 0; i13 < i11; i13++) {
            iArr2[i13] = (int) (((((long) iArr[i13]) & 4294967295L) % ((long) (this.f33500n - i13))) + ((long) i13));
        }
        for (int i14 = i11 - 1; i14 >= 0; i14--) {
            int i15 = 0;
            for (int i16 = i14 + 1; i16 < i11; i16++) {
                if (iArr2[i16] == iArr2[i14]) {
                    i15 = 1;
                }
            }
            int i17 = -i15;
            iArr2[i14] = ((~i17) & iArr2[i14]) ^ (i17 & i14);
        }
        for (int i18 = 0; i18 < i11; i18++) {
            iArr3[i18] = iArr2[i18] >>> 6;
            jArr2[i18] = 1 << (iArr2[i18] & 63);
        }
        for (int i19 = 0; i19 < this.N_BYTE_64; i19++) {
            long j9 = 0;
            for (int i21 = 0; i21 < i11; i21++) {
                int i22 = i19 - iArr3[i21];
                j9 |= ((long) (-(((i22 | (-i22)) >>> 31) ^ 1))) & jArr2[i21];
            }
            jArr[i19] = j9 | jArr[i19];
        }
    }

    public int decaps(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        long[] jArr = new long[this.N_BYTE_64];
        byte[] bArr4 = new byte[this.N_BYTE + 40];
        byte[] bArr5 = new byte[this.K_BYTE];
        extractKeysFromSecretKeys(jArr, bArr5, bArr4, bArr3);
        byte[] bArr6 = new byte[this.N_BYTE];
        byte[] bArr7 = new byte[this.N1N2_BYTE];
        byte[] bArr8 = new byte[this.SALT_SIZE_BYTES];
        extractCiphertexts(bArr6, bArr7, bArr8, bArr2);
        int i11 = this.f33499k;
        byte[] bArr9 = new byte[i11];
        int iDecrypt = decrypt(bArr9, bArr9, bArr5, bArr6, bArr7, jArr);
        byte[] bArr10 = new byte[this.SHA512_BYTES];
        int i12 = this.K_BYTE;
        int i13 = this.SALT_SIZE_BYTES;
        int iA = l1.a(i13, 2, i12, i13);
        byte[] bArr11 = new byte[iA];
        System.arraycopy(bArr9, 0, bArr11, 0, i11);
        System.arraycopy(bArr4, 0, bArr11, this.K_BYTE, this.SALT_SIZE_BYTES * 2);
        int i14 = this.K_BYTE;
        int i15 = this.SALT_SIZE_BYTES;
        System.arraycopy(bArr8, 0, bArr11, (i15 * 2) + i14, i15);
        KeccakRandomGenerator keccakRandomGenerator = new KeccakRandomGenerator(256);
        keccakRandomGenerator.SHAKE256_512_ds(bArr10, bArr11, iA, new byte[]{this.G_FCT_DOMAIN});
        long[] jArr2 = new long[this.N_BYTE_64];
        byte[] bArr12 = new byte[this.N_BYTE];
        extractPublicKeys(jArr2, bArr12, bArr4);
        byte[] bArr13 = new byte[this.N_BYTE];
        byte[] bArr14 = new byte[this.N1N2_BYTE];
        long[] jArr3 = new long[this.N1N2_BYTE_64];
        encrypt(bArr13, jArr3, jArr2, bArr12, bArr9, bArr10);
        Utils.fromLongArrayToByteArray(bArr14, jArr3);
        int i16 = this.K_BYTE + this.N_BYTE + this.N1N2_BYTE;
        byte[] bArr15 = new byte[i16];
        if (!Arrays.constantTimeAreEqual(bArr6, bArr13)) {
            iDecrypt = 1;
        }
        if (!Arrays.constantTimeAreEqual(bArr7, bArr14)) {
            iDecrypt = 1;
        }
        int i17 = iDecrypt - 1;
        int i18 = 0;
        while (true) {
            int i19 = this.K_BYTE;
            if (i18 >= i19) {
                System.arraycopy(bArr6, 0, bArr15, i19, this.N_BYTE);
                System.arraycopy(bArr7, 0, bArr15, this.K_BYTE + this.N_BYTE, this.N1N2_BYTE);
                keccakRandomGenerator.SHAKE256_512_ds(bArr, bArr15, i16, new byte[]{this.K_FCT_DOMAIN});
                return -i17;
            }
            bArr15[i18] = (byte) (((bArr9[i18] & i17) ^ (bArr5[i18] & (~i17))) & 255);
            i18++;
        }
    }

    public void encaps(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        int i11 = this.K_BYTE;
        byte[] bArr7 = new byte[i11];
        byte[] bArr8 = new byte[this.SEED_SIZE];
        KeccakRandomGenerator keccakRandomGenerator = new KeccakRandomGenerator(256);
        keccakRandomGenerator.randomGeneratorInit(bArr5, null, bArr5.length, 0);
        keccakRandomGenerator.squeeze(bArr8, 40);
        int i12 = this.K_BYTE;
        keccakRandomGenerator.squeeze(new byte[i12], i12);
        keccakRandomGenerator.squeeze(new byte[this.SEED_SIZE], 40);
        keccakRandomGenerator.squeeze(bArr7, this.K_BYTE);
        byte[] bArr9 = new byte[this.SHA512_BYTES];
        int i13 = this.K_BYTE;
        int i14 = this.SALT_SIZE_BYTES;
        int iA = l1.a(i14, 2, i13, i14);
        byte[] bArr10 = new byte[iA];
        keccakRandomGenerator.squeeze(bArr6, i14);
        System.arraycopy(bArr7, 0, bArr10, 0, i11);
        System.arraycopy(bArr4, 0, bArr10, this.K_BYTE, this.SALT_SIZE_BYTES * 2);
        int i15 = this.K_BYTE;
        int i16 = this.SALT_SIZE_BYTES;
        System.arraycopy(bArr6, 0, bArr10, (i16 * 2) + i15, i16);
        KeccakRandomGenerator keccakRandomGenerator2 = new KeccakRandomGenerator(256);
        keccakRandomGenerator2.SHAKE256_512_ds(bArr9, bArr10, iA, new byte[]{this.G_FCT_DOMAIN});
        long[] jArr = new long[this.N_BYTE_64];
        byte[] bArr11 = new byte[this.N_BYTE];
        extractPublicKeys(jArr, bArr11, bArr4);
        long[] jArr2 = new long[this.N1N2_BYTE_64];
        encrypt(bArr, jArr2, jArr, bArr11, bArr7, bArr9);
        Utils.fromLongArrayToByteArray(bArr2, jArr2);
        byte[] bArrConcatenate = Arrays.concatenate(bArr7, bArr, bArr2);
        keccakRandomGenerator2.SHAKE256_512_ds(bArr3, bArrConcatenate, bArrConcatenate.length, new byte[]{this.K_FCT_DOMAIN});
    }

    public void genKeyPair(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i11 = this.SEED_SIZE;
        byte[] bArr4 = new byte[i11];
        byte[] bArr5 = new byte[this.K_BYTE];
        KeccakRandomGenerator keccakRandomGenerator = new KeccakRandomGenerator(256);
        keccakRandomGenerator.randomGeneratorInit(bArr3, null, bArr3.length, 0);
        keccakRandomGenerator.squeeze(bArr4, 40);
        keccakRandomGenerator.squeeze(bArr5, this.K_BYTE);
        KeccakRandomGenerator keccakRandomGenerator2 = new KeccakRandomGenerator(256);
        keccakRandomGenerator2.seedExpanderInit(bArr4, i11);
        int i12 = this.N_BYTE_64;
        long[] jArr = new long[i12];
        long[] jArr2 = new long[i12];
        generateRandomFixedWeight(jArr2, keccakRandomGenerator2, this.f33503w);
        generateRandomFixedWeight(jArr, keccakRandomGenerator2, this.f33503w);
        int i13 = this.SEED_SIZE;
        byte[] bArr6 = new byte[i13];
        keccakRandomGenerator.squeeze(bArr6, 40);
        KeccakRandomGenerator keccakRandomGenerator3 = new KeccakRandomGenerator(256);
        keccakRandomGenerator3.seedExpanderInit(bArr6, i13);
        long[] jArr3 = new long[this.N_BYTE_64];
        generatePublicKeyH(jArr3, keccakRandomGenerator3);
        long[] jArr4 = new long[this.N_BYTE_64];
        this.gfCalculator.multLongs(jArr4, jArr2, jArr3);
        GF2PolynomialCalculator.addLongs(jArr4, jArr4, jArr);
        byte[] bArr7 = new byte[this.N_BYTE];
        Utils.fromLongArrayToByteArray(bArr7, jArr4);
        byte[] bArrConcatenate = Arrays.concatenate(bArr6, bArr7);
        byte[] bArrConcatenate2 = Arrays.concatenate(bArr4, bArr5, bArrConcatenate);
        System.arraycopy(bArrConcatenate, 0, bArr, 0, bArrConcatenate.length);
        System.arraycopy(bArrConcatenate2, 0, bArr2, 0, bArrConcatenate2.length);
    }

    public void generatePublicKeyH(long[] jArr, KeccakRandomGenerator keccakRandomGenerator) {
        int i11 = this.N_BYTE;
        byte[] bArr = new byte[i11];
        keccakRandomGenerator.expandSeed(bArr, i11);
        long[] jArr2 = new long[this.N_BYTE_64];
        Utils.fromByteArrayToLongArray(jArr2, bArr);
        int i12 = this.N_BYTE_64 - 1;
        jArr2[i12] = jArr2[i12] & Utils.bitMask(this.f33500n, 64L);
        System.arraycopy(jArr2, 0, jArr, 0, jArr.length);
    }

    public int getSessionKeySize() {
        return this.SHA512_BYTES;
    }
}
