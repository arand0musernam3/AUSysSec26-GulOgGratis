package org.bouncycastle.pqc.crypto.hqc;

import com.braze.h2;
import i4.a;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class KeccakRandomGenerator {
    private static long[] KeccakRoundConstants = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};
    protected int bitsInQueue;
    protected byte[] dataQueue;
    protected int fixedOutputLength;
    protected int rate;
    protected long[] state;

    public KeccakRandomGenerator(int i11) {
        this.state = new long[26];
        this.dataQueue = new byte[BERTags.PRIVATE];
        init(i11);
    }

    private void init(int i11) {
        if (i11 == 128 || i11 == 224 || i11 == 256 || i11 == 288 || i11 == 384 || i11 == 512) {
            initSponge(1600 - (i11 << 1));
        } else {
            a.f("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
        }
    }

    private void initSponge(int i11) {
        if (i11 <= 0 || i11 >= 1600 || i11 % 64 != 0) {
            h2.b("invalid rate value");
            return;
        }
        this.rate = i11;
        Arrays.fill(this.state, 0L);
        Arrays.fill(this.dataQueue, (byte) 0);
        this.bitsInQueue = 0;
        this.fixedOutputLength = (1600 - i11) / 2;
    }

    private void keccakIncAbsorb(byte[] bArr, int i11) {
        long j9;
        long[] jArr;
        long j11;
        int i12 = this.rate >> 3;
        int i13 = i11;
        int i14 = 0;
        while (true) {
            j9 = i13;
            long j12 = i12;
            if (this.state[25] + j9 < j12) {
                break;
            }
            int i15 = 0;
            while (true) {
                long j13 = i15;
                jArr = this.state;
                j11 = jArr[25];
                if (j13 < j12 - j11) {
                    int i16 = i15;
                    int i17 = ((int) (j11 + j13)) >> 3;
                    jArr[i17] = jArr[i17] ^ (toUnsignedLong(bArr[i16 + i14] & 255) << ((int) (((this.state[25] + j13) & 7) * 8)));
                    i15 = i16 + 1;
                }
            }
            i13 = (int) (j9 - (j12 - j11));
            i14 = (int) ((j12 - j11) + ((long) i14));
            jArr[25] = 0;
            keccakPermutation(jArr);
        }
        int i18 = 0;
        while (true) {
            long[] jArr2 = this.state;
            if (i18 >= i13) {
                jArr2[25] = jArr2[25] + j9;
                return;
            }
            long j14 = i18;
            int i19 = ((int) (jArr2[25] + j14)) >> 3;
            jArr2[i19] = (toUnsignedLong(bArr[i18 + i14] & 255) << ((int) (((this.state[25] + j14) & 7) * 8))) ^ jArr2[i19];
            i18++;
        }
    }

    private void keccakIncFinalize(int i11) {
        int i12 = this.rate >> 3;
        long[] jArr = this.state;
        int i13 = ((int) jArr[25]) >> 3;
        long j9 = jArr[i13];
        long unsignedLong = toUnsignedLong(i11);
        long[] jArr2 = this.state;
        jArr[i13] = j9 ^ (unsignedLong << ((int) ((jArr2[25] & 7) * 8)));
        int i14 = i12 - 1;
        int i15 = i14 >> 3;
        jArr2[i15] = jArr2[i15] ^ (toUnsignedLong(128) << ((i14 & 7) * 8));
        this.state[25] = 0;
    }

    private void keccakIncSqueeze(byte[] bArr, int i11) {
        int i12 = this.rate >> 3;
        int i13 = 0;
        while (i13 < i11) {
            if (i13 >= this.state[25]) {
                break;
            }
            long j9 = i12;
            bArr[i13] = (byte) (r9[(int) (((j9 - r10) + r7) >> 3)] >> ((int) ((7 & ((j9 - r10) + r7)) * 8)));
            i13++;
        }
        int i14 = i11 - i13;
        long[] jArr = this.state;
        jArr[25] = jArr[25] - ((long) i13);
        while (i14 > 0) {
            keccakPermutation(this.state);
            int i15 = 0;
            while (i15 < i14 && i15 < i12) {
                bArr[i13 + i15] = (byte) (this.state[i15 >> 3] >> ((i15 & 7) * 8));
                i15++;
            }
            i13 += i15;
            i14 -= i15;
            this.state[25] = i12 - i15;
        }
    }

    private static void keccakPermutation(long[] jArr) {
        long j9 = jArr[0];
        long j11 = jArr[1];
        char c3 = 2;
        long j12 = jArr[2];
        char c7 = 3;
        long j13 = jArr[3];
        char c8 = 4;
        long j14 = jArr[4];
        char c11 = 5;
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        long j18 = jArr[8];
        long j19 = jArr[9];
        long j21 = jArr[10];
        long j22 = jArr[11];
        long j23 = jArr[12];
        long j24 = jArr[13];
        long j25 = jArr[14];
        long j26 = jArr[15];
        long j27 = jArr[16];
        long j28 = jArr[17];
        long j29 = jArr[18];
        long j31 = jArr[19];
        long j32 = jArr[20];
        long j33 = jArr[21];
        long j34 = jArr[22];
        long j35 = jArr[23];
        int i11 = 24;
        long j36 = jArr[24];
        int i12 = 0;
        while (i12 < i11) {
            long j37 = (((j9 ^ j15) ^ j21) ^ j26) ^ j32;
            long j38 = (((j11 ^ j16) ^ j22) ^ j27) ^ j33;
            long j39 = (((j12 ^ j17) ^ j23) ^ j28) ^ j34;
            long j41 = (((j13 ^ j18) ^ j24) ^ j29) ^ j35;
            long j42 = (((j14 ^ j19) ^ j25) ^ j31) ^ j36;
            long j43 = ((j38 << 1) | (j38 >>> (-1))) ^ j42;
            long j44 = ((j39 << 1) | (j39 >>> (-1))) ^ j37;
            long j45 = ((j41 << 1) | (j41 >>> (-1))) ^ j38;
            long j46 = ((j42 << 1) | (j42 >>> (-1))) ^ j39;
            long j47 = ((j37 << 1) | (j37 >>> (-1))) ^ j41;
            long j48 = j9 ^ j43;
            long j49 = j15 ^ j43;
            long j51 = j21 ^ j43;
            long j52 = j26 ^ j43;
            long j53 = j32 ^ j43;
            long j54 = j11 ^ j44;
            long j55 = j16 ^ j44;
            long j56 = j22 ^ j44;
            long j57 = j27 ^ j44;
            long j58 = j33 ^ j44;
            long j59 = j12 ^ j45;
            long j61 = j17 ^ j45;
            long j62 = j23 ^ j45;
            long j63 = j28 ^ j45;
            long j64 = j34 ^ j45;
            long j65 = j13 ^ j46;
            long j66 = j18 ^ j46;
            long j67 = j24 ^ j46;
            long j68 = j29 ^ j46;
            long j69 = j35 ^ j46;
            long j71 = j14 ^ j47;
            long j72 = j19 ^ j47;
            long j73 = j25 ^ j47;
            long j74 = j31 ^ j47;
            long j75 = j36 ^ j47;
            long j76 = (j54 << 1) | (j54 >>> 63);
            char c12 = c3;
            long j77 = (j55 << 44) | (j55 >>> 20);
            char c13 = c7;
            long j78 = (j72 << 20) | (j72 >>> 44);
            char c14 = c8;
            long j79 = (j64 << 61) | (j64 >>> c13);
            int i13 = i11;
            long j81 = (j73 << 39) | (j73 >>> 25);
            int i14 = i12;
            long j82 = (j53 << 18) | (j53 >>> 46);
            long j83 = (j59 << 62) | (j59 >>> c12);
            long j84 = (j62 << 43) | (j62 >>> 21);
            long j85 = (j67 << 25) | (j67 >>> 39);
            long j86 = (j74 << 8) | (j74 >>> 56);
            long j87 = (j69 << 56) | (j69 >>> 8);
            long j88 = (j52 << 41) | (j52 >>> 23);
            long j89 = (j71 << 27) | (j71 >>> 37);
            long j90 = (j75 << 14) | (j75 >>> 50);
            long j91 = (j58 << c12) | (j58 >>> 62);
            long j92 = (j66 << 55) | (j66 >>> 9);
            long j93 = (j57 << 45) | (j57 >>> 19);
            long j94 = (j49 << 36) | (j49 >>> 28);
            long j95 = (j65 << 28) | (j65 >>> 36);
            long j96 = (j68 << 21) | (j68 >>> 43);
            long j97 = (j63 << 15) | (j63 >>> 49);
            long j98 = (j56 << 10) | (j56 >>> 54);
            long j99 = (j61 << 6) | (j61 >>> 58);
            long j100 = (j51 << c13) | (j51 >>> 61);
            long j101 = j48 ^ ((~j77) & j84);
            long j102 = ((~j84) & j96) ^ j77;
            long j103 = ((~j96) & j90) ^ j84;
            long j104 = j96 ^ ((~j90) & j48);
            j14 = j90 ^ (j77 & (~j48));
            long j105 = j95 ^ ((~j78) & j100);
            long j106 = ((~j100) & j93) ^ j78;
            long j107 = ((~j93) & j79) ^ j100;
            long j108 = j93 ^ ((~j79) & j95);
            long j109 = ((~j95) & j78) ^ j79;
            j21 = j76 ^ ((~j99) & j85);
            long j110 = ((~j85) & j86) ^ j99;
            long j111 = ((~j86) & j82) ^ j85;
            long j112 = j86 ^ ((~j82) & j76);
            j25 = j82 ^ ((~j76) & j99);
            long j113 = j89 ^ ((~j94) & j98);
            long j114 = j94 ^ ((~j98) & j97);
            long j115 = ((~j97) & j87) ^ j98;
            long j116 = j97 ^ ((~j87) & j89);
            long j117 = ((~j89) & j94) ^ j87;
            long j118 = j83 ^ ((~j92) & j81);
            long j119 = ((~j81) & j88) ^ j92;
            long j120 = j81 ^ ((~j88) & j91);
            j35 = j88 ^ ((~j91) & j83);
            long j121 = j91 ^ ((~j83) & j92);
            long j122 = j101 ^ KeccakRoundConstants[i14];
            j27 = j114;
            j17 = j107;
            j33 = j119;
            j32 = j118;
            j34 = j120;
            j19 = j109;
            j18 = j108;
            j28 = j115;
            j24 = j112;
            j31 = j117;
            j16 = j106;
            j15 = j105;
            j23 = j111;
            j22 = j110;
            c8 = c14;
            c3 = c12;
            c11 = c11;
            j29 = j116;
            j26 = j113;
            c7 = c13;
            j12 = j103;
            j11 = j102;
            j36 = j121;
            j9 = j122;
            i12 = i14 + 1;
            j13 = j104;
            i11 = i13;
        }
        jArr[0] = j9;
        jArr[1] = j11;
        jArr[c3] = j12;
        jArr[c7] = j13;
        jArr[c8] = j14;
        jArr[c11] = j15;
        jArr[6] = j16;
        jArr[7] = j17;
        jArr[8] = j18;
        jArr[9] = j19;
        jArr[10] = j21;
        jArr[11] = j22;
        jArr[12] = j23;
        jArr[13] = j24;
        jArr[14] = j25;
        jArr[15] = j26;
        jArr[16] = j27;
        jArr[17] = j28;
        jArr[18] = j29;
        jArr[19] = j31;
        jArr[20] = j32;
        jArr[21] = j33;
        jArr[22] = j34;
        jArr[23] = j35;
        jArr[i11] = j36;
    }

    private static long toUnsignedLong(int i11) {
        return ((long) i11) & 4294967295L;
    }

    public void SHAKE256_512_ds(byte[] bArr, byte[] bArr2, int i11, byte[] bArr3) {
        Arrays.fill(this.state, 0L);
        keccakIncAbsorb(bArr2, i11);
        keccakIncAbsorb(bArr3, bArr3.length);
        keccakIncFinalize(31);
        keccakIncSqueeze(bArr, 64);
    }

    public void expandSeed(byte[] bArr, int i11) {
        int i12 = i11 & 7;
        int i13 = i11 - i12;
        keccakIncSqueeze(bArr, i13);
        if (i12 != 0) {
            byte[] bArr2 = new byte[8];
            keccakIncSqueeze(bArr2, 8);
            System.arraycopy(bArr2, 0, bArr, i13, i12);
        }
    }

    public void randomGeneratorInit(byte[] bArr, byte[] bArr2, int i11, int i12) {
        keccakIncAbsorb(bArr, i11);
        keccakIncAbsorb(bArr2, i12);
        keccakIncAbsorb(new byte[]{1}, 1);
        keccakIncFinalize(31);
    }

    public void seedExpanderInit(byte[] bArr, int i11) {
        keccakIncAbsorb(bArr, i11);
        keccakIncAbsorb(new byte[]{2}, 1);
        keccakIncFinalize(31);
    }

    public void squeeze(byte[] bArr, int i11) {
        keccakIncSqueeze(bArr, i11);
    }

    public KeccakRandomGenerator() {
        this(288);
    }
}
