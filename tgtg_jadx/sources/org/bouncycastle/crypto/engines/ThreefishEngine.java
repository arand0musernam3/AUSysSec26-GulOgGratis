package org.bouncycastle.crypto.engines;

import com.braze.h2;
import i4.a;
import j4.s;
import m0.i1;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.TweakableBlockCipherParameters;
import org.bouncycastle.util.Pack;
import r8.k;

/* JADX INFO: loaded from: classes3.dex */
public class ThreefishEngine implements BlockCipher {
    public static final int BLOCKSIZE_1024 = 1024;
    public static final int BLOCKSIZE_256 = 256;
    public static final int BLOCKSIZE_512 = 512;
    private static final long C_240 = 2004413935125273122L;
    private static final int MAX_ROUNDS = 80;
    private static int[] MOD17 = null;
    private static int[] MOD3 = null;
    private static int[] MOD5 = null;
    private static int[] MOD9 = null;
    private static final int ROUNDS_1024 = 80;
    private static final int ROUNDS_256 = 72;
    private static final int ROUNDS_512 = 72;
    private static final int TWEAK_SIZE_BYTES = 16;
    private static final int TWEAK_SIZE_WORDS = 2;
    private int blocksizeBytes;
    private int blocksizeWords;
    private ThreefishCipher cipher;
    private long[] currentBlock;
    private boolean forEncryption;
    private long[] kw;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long[] f33136t;

    public static final class Threefish1024Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 24;
        private static final int ROTATION_0_1 = 13;
        private static final int ROTATION_0_2 = 8;
        private static final int ROTATION_0_3 = 47;
        private static final int ROTATION_0_4 = 8;
        private static final int ROTATION_0_5 = 17;
        private static final int ROTATION_0_6 = 22;
        private static final int ROTATION_0_7 = 37;
        private static final int ROTATION_1_0 = 38;
        private static final int ROTATION_1_1 = 19;
        private static final int ROTATION_1_2 = 10;
        private static final int ROTATION_1_3 = 55;
        private static final int ROTATION_1_4 = 49;
        private static final int ROTATION_1_5 = 18;
        private static final int ROTATION_1_6 = 23;
        private static final int ROTATION_1_7 = 52;
        private static final int ROTATION_2_0 = 33;
        private static final int ROTATION_2_1 = 4;
        private static final int ROTATION_2_2 = 51;
        private static final int ROTATION_2_3 = 13;
        private static final int ROTATION_2_4 = 34;
        private static final int ROTATION_2_5 = 41;
        private static final int ROTATION_2_6 = 59;
        private static final int ROTATION_2_7 = 17;
        private static final int ROTATION_3_0 = 5;
        private static final int ROTATION_3_1 = 20;
        private static final int ROTATION_3_2 = 48;
        private static final int ROTATION_3_3 = 41;
        private static final int ROTATION_3_4 = 47;
        private static final int ROTATION_3_5 = 28;
        private static final int ROTATION_3_6 = 16;
        private static final int ROTATION_3_7 = 25;
        private static final int ROTATION_4_0 = 41;
        private static final int ROTATION_4_1 = 9;
        private static final int ROTATION_4_2 = 37;
        private static final int ROTATION_4_3 = 31;
        private static final int ROTATION_4_4 = 12;
        private static final int ROTATION_4_5 = 47;
        private static final int ROTATION_4_6 = 44;
        private static final int ROTATION_4_7 = 30;
        private static final int ROTATION_5_0 = 16;
        private static final int ROTATION_5_1 = 34;
        private static final int ROTATION_5_2 = 56;
        private static final int ROTATION_5_3 = 51;
        private static final int ROTATION_5_4 = 4;
        private static final int ROTATION_5_5 = 53;
        private static final int ROTATION_5_6 = 42;
        private static final int ROTATION_5_7 = 41;
        private static final int ROTATION_6_0 = 31;
        private static final int ROTATION_6_1 = 44;
        private static final int ROTATION_6_2 = 47;
        private static final int ROTATION_6_3 = 46;
        private static final int ROTATION_6_4 = 19;
        private static final int ROTATION_6_5 = 42;
        private static final int ROTATION_6_6 = 44;
        private static final int ROTATION_6_7 = 25;
        private static final int ROTATION_7_0 = 9;
        private static final int ROTATION_7_1 = 48;
        private static final int ROTATION_7_2 = 35;
        private static final int ROTATION_7_3 = 52;
        private static final int ROTATION_7_4 = 23;
        private static final int ROTATION_7_5 = 31;
        private static final int ROTATION_7_6 = 37;
        private static final int ROTATION_7_7 = 20;

        public Threefish1024Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f33137t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 33) {
                a.h();
                return;
            }
            if (jArr4.length != 5) {
                a.h();
                return;
            }
            long j9 = jArr[0];
            int i11 = 1;
            long j11 = jArr[1];
            long j12 = jArr[2];
            long j13 = jArr[3];
            long j14 = jArr[4];
            long j15 = jArr[5];
            long j16 = jArr[6];
            long j17 = jArr[7];
            long j18 = jArr[8];
            int i12 = 9;
            long j19 = jArr[9];
            long j21 = jArr[10];
            long j22 = jArr[11];
            long j23 = jArr[12];
            long j24 = jArr[13];
            long j25 = jArr[14];
            long jXorRotr = jArr[15];
            int i13 = 19;
            while (i13 >= i11) {
                int i14 = iArr[i13];
                int i15 = iArr2[i13];
                int i16 = i14 + 1;
                long j26 = j9 - jArr3[i16];
                int i17 = i14 + 2;
                long j27 = j11 - jArr3[i17];
                int i18 = i14 + 3;
                long j28 = j12 - jArr3[i18];
                int i19 = i14 + 4;
                long j29 = j13 - jArr3[i19];
                int i21 = i14 + 5;
                int i22 = i11;
                long j31 = j14 - jArr3[i21];
                int i23 = i14 + 6;
                long[] jArr5 = jArr3;
                long j32 = j15 - jArr3[i23];
                int i24 = i14 + 7;
                long[] jArr6 = jArr4;
                long j33 = j16 - jArr5[i24];
                int i25 = i14 + 8;
                int[] iArr3 = iArr2;
                long j34 = j17 - jArr5[i25];
                int i26 = i14 + 9;
                long j35 = j18 - jArr5[i26];
                int i27 = i14 + 10;
                long j36 = j19 - jArr5[i27];
                int i28 = i14 + 11;
                long j37 = j21 - jArr5[i28];
                int i29 = i14 + 12;
                long j38 = j22 - jArr5[i29];
                int i31 = i14 + 13;
                long j39 = j23 - jArr5[i31];
                int i32 = i14 + 14;
                int i33 = i15 + 1;
                long j41 = j24 - (jArr5[i32] + jArr6[i33]);
                int i34 = i14 + 15;
                long j42 = j25 - (jArr5[i34] + jArr6[i15 + 2]);
                long j43 = i13;
                long jXorRotr2 = ThreefishEngine.xorRotr(jXorRotr - ((jArr5[i14 + 16] + j43) + 1), i12, j26);
                long j44 = j26 - jXorRotr2;
                long jXorRotr3 = ThreefishEngine.xorRotr(j38, 48, j28);
                long j45 = j28 - jXorRotr3;
                long jXorRotr4 = ThreefishEngine.xorRotr(j41, 35, j33);
                long j46 = j33 - jXorRotr4;
                long jXorRotr5 = ThreefishEngine.xorRotr(j36, 52, j31);
                long j47 = j31 - jXorRotr5;
                long jXorRotr6 = ThreefishEngine.xorRotr(j27, 23, j42);
                long j48 = j42 - jXorRotr6;
                long jXorRotr7 = ThreefishEngine.xorRotr(j32, 31, j35);
                long j49 = j35 - jXorRotr7;
                long jXorRotr8 = ThreefishEngine.xorRotr(j29, 37, j37);
                long j51 = j37 - jXorRotr8;
                long jXorRotr9 = ThreefishEngine.xorRotr(j34, 20, j39);
                long j52 = j39 - jXorRotr9;
                long jXorRotr10 = ThreefishEngine.xorRotr(jXorRotr9, 31, j44);
                long j53 = j44 - jXorRotr10;
                long jXorRotr11 = ThreefishEngine.xorRotr(jXorRotr7, 44, j45);
                long j54 = j45 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(jXorRotr8, 47, j47);
                long j55 = j47 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(jXorRotr6, ROTATION_6_3, j46);
                long j56 = j46 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(jXorRotr2, 19, j52);
                long j57 = j52 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(jXorRotr4, 42, j48);
                long j58 = j48 - jXorRotr15;
                long jXorRotr16 = ThreefishEngine.xorRotr(jXorRotr3, 44, j49);
                long j59 = j49 - jXorRotr16;
                long jXorRotr17 = ThreefishEngine.xorRotr(jXorRotr5, 25, j51);
                long j61 = j51 - jXorRotr17;
                long jXorRotr18 = ThreefishEngine.xorRotr(jXorRotr17, 16, j53);
                long j62 = j53 - jXorRotr18;
                long jXorRotr19 = ThreefishEngine.xorRotr(jXorRotr15, 34, j54);
                long j63 = j54 - jXorRotr19;
                long jXorRotr20 = ThreefishEngine.xorRotr(jXorRotr16, 56, j56);
                long j64 = j56 - jXorRotr20;
                long jXorRotr21 = ThreefishEngine.xorRotr(jXorRotr14, 51, j55);
                long j65 = j55 - jXorRotr21;
                long jXorRotr22 = ThreefishEngine.xorRotr(jXorRotr10, 4, j61);
                long j66 = j61 - jXorRotr22;
                long jXorRotr23 = ThreefishEngine.xorRotr(jXorRotr12, ROTATION_5_5, j57);
                long j67 = j57 - jXorRotr23;
                long jXorRotr24 = ThreefishEngine.xorRotr(jXorRotr11, 42, j58);
                long j68 = j58 - jXorRotr24;
                long jXorRotr25 = ThreefishEngine.xorRotr(jXorRotr13, 41, j59);
                long j69 = j59 - jXorRotr25;
                long jXorRotr26 = ThreefishEngine.xorRotr(jXorRotr25, 41, j62);
                long j71 = j62 - jXorRotr26;
                long jXorRotr27 = ThreefishEngine.xorRotr(jXorRotr23, 9, j63);
                long jXorRotr28 = ThreefishEngine.xorRotr(jXorRotr24, 37, j65);
                long j72 = j65 - jXorRotr28;
                long jXorRotr29 = ThreefishEngine.xorRotr(jXorRotr22, 31, j64);
                long j73 = j64 - jXorRotr29;
                long jXorRotr30 = ThreefishEngine.xorRotr(jXorRotr18, 12, j69);
                long j74 = j69 - jXorRotr30;
                long jXorRotr31 = ThreefishEngine.xorRotr(jXorRotr20, 47, j66);
                long j75 = j66 - jXorRotr31;
                long jXorRotr32 = ThreefishEngine.xorRotr(jXorRotr19, 44, j67);
                long j76 = j67 - jXorRotr32;
                long jXorRotr33 = ThreefishEngine.xorRotr(jXorRotr21, 30, j68);
                long j77 = j68 - jXorRotr33;
                long j78 = j71 - jArr5[i14];
                long j79 = jXorRotr26 - jArr5[i16];
                long j81 = (j63 - jXorRotr27) - jArr5[i17];
                long j82 = jXorRotr27 - jArr5[i18];
                long j83 = j72 - jArr5[i19];
                long j84 = jXorRotr28 - jArr5[i21];
                long j85 = j73 - jArr5[i23];
                long j86 = jXorRotr29 - jArr5[i24];
                long j87 = j74 - jArr5[i25];
                long j88 = jXorRotr30 - jArr5[i26];
                long j89 = j75 - jArr5[i27];
                long j90 = jXorRotr31 - jArr5[i28];
                long j91 = j76 - jArr5[i29];
                long j92 = jXorRotr32 - (jArr5[i31] + jArr6[i15]);
                long j93 = j77 - (jArr5[i32] + jArr6[i33]);
                long jXorRotr34 = ThreefishEngine.xorRotr(jXorRotr33 - (jArr5[i34] + j43), 5, j78);
                long j94 = j78 - jXorRotr34;
                long jXorRotr35 = ThreefishEngine.xorRotr(j90, 20, j81);
                long j95 = j81 - jXorRotr35;
                long jXorRotr36 = ThreefishEngine.xorRotr(j92, 48, j85);
                long j96 = j85 - jXorRotr36;
                long jXorRotr37 = ThreefishEngine.xorRotr(j88, 41, j83);
                long j97 = j83 - jXorRotr37;
                long jXorRotr38 = ThreefishEngine.xorRotr(j79, 47, j93);
                long j98 = j93 - jXorRotr38;
                long jXorRotr39 = ThreefishEngine.xorRotr(j84, 28, j87);
                long j99 = j87 - jXorRotr39;
                long jXorRotr40 = ThreefishEngine.xorRotr(j82, 16, j89);
                long j100 = j89 - jXorRotr40;
                long jXorRotr41 = ThreefishEngine.xorRotr(j86, 25, j91);
                long j101 = j91 - jXorRotr41;
                long jXorRotr42 = ThreefishEngine.xorRotr(jXorRotr41, 33, j94);
                long j102 = j94 - jXorRotr42;
                long jXorRotr43 = ThreefishEngine.xorRotr(jXorRotr39, 4, j95);
                long j103 = j95 - jXorRotr43;
                long jXorRotr44 = ThreefishEngine.xorRotr(jXorRotr40, 51, j97);
                long j104 = j97 - jXorRotr44;
                long jXorRotr45 = ThreefishEngine.xorRotr(jXorRotr38, 13, j96);
                long j105 = j96 - jXorRotr45;
                long jXorRotr46 = ThreefishEngine.xorRotr(jXorRotr34, 34, j101);
                long j106 = j101 - jXorRotr46;
                long jXorRotr47 = ThreefishEngine.xorRotr(jXorRotr36, 41, j98);
                long j107 = j98 - jXorRotr47;
                long jXorRotr48 = ThreefishEngine.xorRotr(jXorRotr35, ROTATION_2_6, j99);
                long j108 = j99 - jXorRotr48;
                long jXorRotr49 = ThreefishEngine.xorRotr(jXorRotr37, 17, j100);
                long j109 = j100 - jXorRotr49;
                long jXorRotr50 = ThreefishEngine.xorRotr(jXorRotr49, ROTATION_1_0, j102);
                long j110 = j102 - jXorRotr50;
                long jXorRotr51 = ThreefishEngine.xorRotr(jXorRotr47, 19, j103);
                long j111 = j103 - jXorRotr51;
                long jXorRotr52 = ThreefishEngine.xorRotr(jXorRotr48, 10, j105);
                long j112 = j105 - jXorRotr52;
                long jXorRotr53 = ThreefishEngine.xorRotr(jXorRotr46, ROTATION_1_3, j104);
                long j113 = j104 - jXorRotr53;
                long jXorRotr54 = ThreefishEngine.xorRotr(jXorRotr42, ROTATION_1_4, j109);
                long j114 = j109 - jXorRotr54;
                long jXorRotr55 = ThreefishEngine.xorRotr(jXorRotr44, 18, j106);
                long j115 = j106 - jXorRotr55;
                long jXorRotr56 = ThreefishEngine.xorRotr(jXorRotr43, 23, j107);
                long j116 = j107 - jXorRotr56;
                long jXorRotr57 = ThreefishEngine.xorRotr(jXorRotr45, 52, j108);
                long j117 = j108 - jXorRotr57;
                long jXorRotr58 = ThreefishEngine.xorRotr(jXorRotr57, 24, j110);
                long j118 = j110 - jXorRotr58;
                long jXorRotr59 = ThreefishEngine.xorRotr(jXorRotr55, 13, j111);
                j12 = j111 - jXorRotr59;
                long jXorRotr60 = ThreefishEngine.xorRotr(jXorRotr56, 8, j113);
                long j119 = j113 - jXorRotr60;
                long jXorRotr61 = ThreefishEngine.xorRotr(jXorRotr54, 47, j112);
                long j120 = j112 - jXorRotr61;
                long jXorRotr62 = ThreefishEngine.xorRotr(jXorRotr50, 8, j117);
                long j121 = j117 - jXorRotr62;
                long jXorRotr63 = ThreefishEngine.xorRotr(jXorRotr52, 17, j114);
                long j122 = j114 - jXorRotr63;
                long jXorRotr64 = ThreefishEngine.xorRotr(jXorRotr51, 22, j115);
                j23 = j115 - jXorRotr64;
                jXorRotr = ThreefishEngine.xorRotr(jXorRotr53, 37, j116);
                j25 = j116 - jXorRotr;
                j22 = jXorRotr63;
                j21 = j122;
                jArr3 = jArr5;
                jArr4 = jArr6;
                iArr = iArr;
                j16 = j120;
                j15 = jXorRotr60;
                j9 = j118;
                i12 = 9;
                j13 = jXorRotr59;
                j24 = jXorRotr64;
                j17 = jXorRotr61;
                i13 -= 2;
                j19 = jXorRotr62;
                j14 = j119;
                j11 = jXorRotr58;
                i11 = i22;
                j18 = j121;
                iArr2 = iArr3;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            int i35 = i11;
            long j123 = j9 - jArr7[0];
            long j124 = j11 - jArr7[i35];
            long j125 = j12 - jArr7[2];
            long j126 = j13 - jArr7[3];
            long j127 = j14 - jArr7[4];
            long j128 = j15 - jArr7[5];
            long j129 = j16 - jArr7[6];
            long j130 = j17 - jArr7[7];
            long j131 = j18 - jArr7[8];
            long j132 = j19 - jArr7[9];
            long j133 = j21 - jArr7[10];
            long j134 = j22 - jArr7[11];
            long j135 = j23 - jArr7[12];
            long j136 = j24 - (jArr7[13] + jArr8[0]);
            long j137 = j25 - (jArr7[14] + jArr8[i35]);
            long j138 = jXorRotr - jArr7[15];
            jArr2[0] = j123;
            jArr2[i35] = j124;
            jArr2[2] = j125;
            jArr2[3] = j126;
            jArr2[4] = j127;
            jArr2[5] = j128;
            jArr2[6] = j129;
            jArr2[7] = j130;
            jArr2[8] = j131;
            jArr2[9] = j132;
            jArr2[10] = j133;
            jArr2[11] = j134;
            jArr2[12] = j135;
            jArr2[13] = j136;
            jArr2[14] = j137;
            jArr2[15] = j138;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f33137t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 33) {
                a.h();
                return;
            }
            if (jArr4.length != 5) {
                a.h();
                return;
            }
            long j9 = jArr[0];
            long j11 = jArr[1];
            long j12 = jArr[2];
            long j13 = jArr[3];
            long j14 = jArr[4];
            long j15 = jArr[5];
            long j16 = jArr[6];
            long j17 = jArr[7];
            long j18 = jArr[8];
            long j19 = jArr[9];
            long j21 = jArr[10];
            long j22 = jArr[11];
            int i11 = 9;
            long j23 = jArr[12];
            int i12 = 12;
            int i13 = 13;
            long j24 = jArr[13];
            long j25 = jArr[14];
            long j26 = jArr[15];
            long j27 = j9 + jArr3[0];
            long j28 = j11 + jArr3[1];
            long j29 = j12 + jArr3[2];
            long j31 = j13 + jArr3[3];
            long j32 = j14 + jArr3[4];
            long j33 = j15 + jArr3[5];
            long j34 = j16 + jArr3[6];
            long j35 = j17 + jArr3[7];
            long j36 = j18 + jArr3[8];
            long j37 = j19 + jArr3[9];
            long j38 = j21 + jArr3[10];
            long j39 = j22 + jArr3[11];
            long j41 = j23 + jArr3[12];
            long j42 = jArr3[13] + jArr4[0] + j24;
            long j43 = jArr3[14] + jArr4[1] + j25;
            long j44 = j33;
            long j45 = j35;
            long j46 = j37;
            long j47 = j39;
            long j48 = j26 + jArr3[15];
            long j49 = j42;
            long j51 = j32;
            long j52 = j27;
            long j53 = j31;
            int i14 = 1;
            while (i14 < 20) {
                int i15 = iArr[i14];
                int i16 = iArr2[i14];
                long j54 = j53;
                long j55 = j52 + j28;
                long jRotlXor = ThreefishEngine.rotlXor(j28, 24, j55);
                long j56 = j29 + j54;
                long jRotlXor2 = ThreefishEngine.rotlXor(j54, i13, j56);
                int i17 = i14;
                long j57 = j44;
                long j58 = j51 + j57;
                long jRotlXor3 = ThreefishEngine.rotlXor(j57, 8, j58);
                long[] jArr5 = jArr3;
                long j59 = j45;
                long j61 = j34 + j59;
                long[] jArr6 = jArr4;
                long jRotlXor4 = ThreefishEngine.rotlXor(j59, 47, j61);
                long j62 = j46;
                long j63 = j36 + j62;
                int[] iArr3 = iArr2;
                long jRotlXor5 = ThreefishEngine.rotlXor(j62, 8, j63);
                long j64 = j47;
                long j65 = j38 + j64;
                long jRotlXor6 = ThreefishEngine.rotlXor(j64, 17, j65);
                long j66 = j49;
                long j67 = j41 + j66;
                long jRotlXor7 = ThreefishEngine.rotlXor(j66, 22, j67);
                long j68 = j48;
                long j69 = j43 + j68;
                long jRotlXor8 = ThreefishEngine.rotlXor(j68, 37, j69);
                long j71 = j55 + jRotlXor5;
                long jRotlXor9 = ThreefishEngine.rotlXor(jRotlXor5, ROTATION_1_0, j71);
                long j72 = j56 + jRotlXor7;
                long jRotlXor10 = ThreefishEngine.rotlXor(jRotlXor7, 19, j72);
                long j73 = j61 + jRotlXor6;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor6, 10, j73);
                long j74 = j58 + jRotlXor8;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor8, ROTATION_1_3, j74);
                long j75 = j65 + jRotlXor4;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor4, ROTATION_1_4, j75);
                long j76 = j67 + jRotlXor2;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor2, 18, j76);
                long j77 = j69 + jRotlXor3;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor3, 23, j77);
                long j78 = j63 + jRotlXor;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor, 52, j78);
                long j79 = j71 + jRotlXor13;
                long jRotlXor17 = ThreefishEngine.rotlXor(jRotlXor13, 33, j79);
                long j81 = j72 + jRotlXor15;
                long jRotlXor18 = ThreefishEngine.rotlXor(jRotlXor15, 4, j81);
                long j82 = j74 + jRotlXor14;
                long jRotlXor19 = ThreefishEngine.rotlXor(jRotlXor14, 51, j82);
                long j83 = j73 + jRotlXor16;
                long jRotlXor20 = ThreefishEngine.rotlXor(jRotlXor16, 13, j83);
                long j84 = j76 + jRotlXor12;
                long jRotlXor21 = ThreefishEngine.rotlXor(jRotlXor12, 34, j84);
                long j85 = j77 + jRotlXor10;
                long jRotlXor22 = ThreefishEngine.rotlXor(jRotlXor10, 41, j85);
                long j86 = j78 + jRotlXor11;
                long jRotlXor23 = ThreefishEngine.rotlXor(jRotlXor11, ROTATION_2_6, j86);
                long j87 = j75 + jRotlXor9;
                long jRotlXor24 = ThreefishEngine.rotlXor(jRotlXor9, 17, j87);
                long j88 = j79 + jRotlXor21;
                long jRotlXor25 = ThreefishEngine.rotlXor(jRotlXor21, 5, j88);
                long j89 = j81 + jRotlXor23;
                long jRotlXor26 = ThreefishEngine.rotlXor(jRotlXor23, 20, j89);
                long j90 = j83 + jRotlXor22;
                long jRotlXor27 = ThreefishEngine.rotlXor(jRotlXor22, 48, j90);
                long j91 = j82 + jRotlXor24;
                long jRotlXor28 = ThreefishEngine.rotlXor(jRotlXor24, 41, j91);
                long j92 = j85 + jRotlXor20;
                long jRotlXor29 = ThreefishEngine.rotlXor(jRotlXor20, 47, j92);
                long j93 = j86 + jRotlXor18;
                long jRotlXor30 = ThreefishEngine.rotlXor(jRotlXor18, 28, j93);
                long j94 = j87 + jRotlXor19;
                long jRotlXor31 = ThreefishEngine.rotlXor(jRotlXor19, 16, j94);
                long j95 = j84 + jRotlXor17;
                long jRotlXor32 = ThreefishEngine.rotlXor(jRotlXor17, 25, j95);
                long j96 = j88 + jArr5[i15];
                int i18 = i15 + 1;
                long j97 = jRotlXor29 + jArr5[i18];
                int i19 = i15 + 2;
                long j98 = j89 + jArr5[i19];
                int i21 = i15 + 3;
                long j99 = jRotlXor31 + jArr5[i21];
                int i22 = i15 + 4;
                long j100 = j91 + jArr5[i22];
                int i23 = i15 + 5;
                long j101 = jRotlXor30 + jArr5[i23];
                int i24 = i15 + 6;
                long j102 = j90 + jArr5[i24];
                int i25 = i15 + 7;
                long j103 = jRotlXor32 + jArr5[i25];
                int i26 = i15 + 8;
                long j104 = j93 + jArr5[i26];
                int i27 = i15 + 9;
                long j105 = jRotlXor28 + jArr5[i27];
                int i28 = i15 + 10;
                long j106 = j94 + jArr5[i28];
                int i29 = i15 + 11;
                long j107 = jRotlXor26 + jArr5[i29];
                int i31 = i15 + 12;
                long j108 = j95 + jArr5[i31];
                int i32 = i15 + 13;
                long j109 = jArr5[i32] + jArr6[i16] + jRotlXor27;
                int i33 = i15 + 14;
                int i34 = i16 + 1;
                long j110 = jArr5[i33] + jArr6[i34] + j92;
                int i35 = i15 + 15;
                long j111 = i17;
                long j112 = jArr5[i35] + j111 + jRotlXor25;
                long j113 = j96 + j97;
                long jRotlXor33 = ThreefishEngine.rotlXor(j97, 41, j113);
                long j114 = j98 + j99;
                long jRotlXor34 = ThreefishEngine.rotlXor(j99, i11, j114);
                long j115 = j100 + j101;
                long jRotlXor35 = ThreefishEngine.rotlXor(j101, 37, j115);
                long j116 = j102 + j103;
                long jRotlXor36 = ThreefishEngine.rotlXor(j103, 31, j116);
                long j117 = j104 + j105;
                long jRotlXor37 = ThreefishEngine.rotlXor(j105, i12, j117);
                long j118 = j106 + j107;
                long jRotlXor38 = ThreefishEngine.rotlXor(j107, 47, j118);
                long j119 = j108 + j109;
                long jRotlXor39 = ThreefishEngine.rotlXor(j109, 44, j119);
                long j120 = j110 + j112;
                long jRotlXor40 = ThreefishEngine.rotlXor(j112, 30, j120);
                long j121 = j113 + jRotlXor37;
                long jRotlXor41 = ThreefishEngine.rotlXor(jRotlXor37, 16, j121);
                long j122 = j114 + jRotlXor39;
                long jRotlXor42 = ThreefishEngine.rotlXor(jRotlXor39, 34, j122);
                long j123 = j116 + jRotlXor38;
                long jRotlXor43 = ThreefishEngine.rotlXor(jRotlXor38, 56, j123);
                long j124 = j115 + jRotlXor40;
                long jRotlXor44 = ThreefishEngine.rotlXor(jRotlXor40, 51, j124);
                long j125 = j118 + jRotlXor36;
                long jRotlXor45 = ThreefishEngine.rotlXor(jRotlXor36, 4, j125);
                long j126 = j119 + jRotlXor34;
                long jRotlXor46 = ThreefishEngine.rotlXor(jRotlXor34, ROTATION_5_5, j126);
                long j127 = j120 + jRotlXor35;
                long jRotlXor47 = ThreefishEngine.rotlXor(jRotlXor35, 42, j127);
                long j128 = j117 + jRotlXor33;
                long jRotlXor48 = ThreefishEngine.rotlXor(jRotlXor33, 41, j128);
                long j129 = j121 + jRotlXor45;
                long jRotlXor49 = ThreefishEngine.rotlXor(jRotlXor45, 31, j129);
                long j130 = j122 + jRotlXor47;
                long jRotlXor50 = ThreefishEngine.rotlXor(jRotlXor47, 44, j130);
                long j131 = j124 + jRotlXor46;
                long jRotlXor51 = ThreefishEngine.rotlXor(jRotlXor46, 47, j131);
                long j132 = j123 + jRotlXor48;
                long jRotlXor52 = ThreefishEngine.rotlXor(jRotlXor48, ROTATION_6_3, j132);
                long j133 = j126 + jRotlXor44;
                long jRotlXor53 = ThreefishEngine.rotlXor(jRotlXor44, 19, j133);
                long j134 = j127 + jRotlXor42;
                long jRotlXor54 = ThreefishEngine.rotlXor(jRotlXor42, 42, j134);
                long j135 = j128 + jRotlXor43;
                long jRotlXor55 = ThreefishEngine.rotlXor(jRotlXor43, 44, j135);
                long j136 = j125 + jRotlXor41;
                long jRotlXor56 = ThreefishEngine.rotlXor(jRotlXor41, 25, j136);
                long j137 = j129 + jRotlXor53;
                long jRotlXor57 = ThreefishEngine.rotlXor(jRotlXor53, 9, j137);
                long j138 = j130 + jRotlXor55;
                long jRotlXor58 = ThreefishEngine.rotlXor(jRotlXor55, 48, j138);
                long j139 = j132 + jRotlXor54;
                long jRotlXor59 = ThreefishEngine.rotlXor(jRotlXor54, 35, j139);
                long j140 = j131 + jRotlXor56;
                long jRotlXor60 = ThreefishEngine.rotlXor(jRotlXor56, 52, j140);
                long j141 = j134 + jRotlXor52;
                long jRotlXor61 = ThreefishEngine.rotlXor(jRotlXor52, 23, j141);
                long j142 = j135 + jRotlXor50;
                long jRotlXor62 = ThreefishEngine.rotlXor(jRotlXor50, 31, j142);
                long j143 = j136 + jRotlXor51;
                long jRotlXor63 = ThreefishEngine.rotlXor(jRotlXor51, 37, j143);
                long j144 = j133 + jRotlXor49;
                long jRotlXor64 = ThreefishEngine.rotlXor(jRotlXor49, 20, j144);
                long j145 = jArr5[i18] + j137;
                long j146 = jRotlXor61 + jArr5[i19];
                long j147 = j138 + jArr5[i21];
                long j148 = jRotlXor63 + jArr5[i22];
                long j149 = j140 + jArr5[i23];
                long j150 = jRotlXor62 + jArr5[i24];
                long j151 = j139 + jArr5[i25];
                long j152 = jRotlXor64 + jArr5[i26];
                long j153 = j142 + jArr5[i27];
                j46 = jRotlXor60 + jArr5[i28];
                long j154 = j143 + jArr5[i29];
                long j155 = jRotlXor58 + jArr5[i31];
                j41 = j144 + jArr5[i32];
                j49 = jArr5[i33] + jArr6[i34] + jRotlXor59;
                long j156 = jArr5[i35] + jArr6[i16 + 2] + j141;
                j48 = jArr5[i15 + 16] + j111 + 1 + jRotlXor57;
                j34 = j151;
                j36 = j153;
                j51 = j149;
                j28 = j146;
                j29 = j147;
                i14 = i17 + 2;
                j53 = j148;
                j38 = j154;
                j47 = j155;
                j44 = j150;
                i13 = 13;
                i11 = 9;
                i12 = 12;
                j45 = j152;
                j52 = j145;
                j43 = j156;
                jArr3 = jArr5;
                jArr4 = jArr6;
                iArr = iArr;
                iArr2 = iArr3;
            }
            jArr2[0] = j52;
            jArr2[1] = j28;
            jArr2[2] = j29;
            jArr2[3] = j53;
            jArr2[4] = j51;
            jArr2[5] = j44;
            jArr2[6] = j34;
            jArr2[7] = j45;
            jArr2[8] = j36;
            jArr2[9] = j46;
            jArr2[10] = j38;
            jArr2[11] = j47;
            jArr2[12] = j41;
            jArr2[13] = j49;
            jArr2[14] = j43;
            jArr2[15] = j48;
        }
    }

    public static final class Threefish256Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 14;
        private static final int ROTATION_0_1 = 16;
        private static final int ROTATION_1_0 = 52;
        private static final int ROTATION_1_1 = 57;
        private static final int ROTATION_2_0 = 23;
        private static final int ROTATION_2_1 = 40;
        private static final int ROTATION_3_0 = 5;
        private static final int ROTATION_3_1 = 37;
        private static final int ROTATION_4_0 = 25;
        private static final int ROTATION_4_1 = 33;
        private static final int ROTATION_5_0 = 46;
        private static final int ROTATION_5_1 = 12;
        private static final int ROTATION_6_0 = 58;
        private static final int ROTATION_6_1 = 22;
        private static final int ROTATION_7_0 = 32;
        private static final int ROTATION_7_1 = 32;

        public Threefish256Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f33137t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 9) {
                a.h();
                return;
            }
            if (jArr4.length != 5) {
                a.h();
                return;
            }
            long j9 = jArr[0];
            int i11 = 1;
            long j11 = jArr[1];
            char c3 = 2;
            long j12 = jArr[2];
            long jXorRotr = jArr[3];
            int i12 = 17;
            while (i12 >= i11) {
                int i13 = iArr[i12];
                int i14 = iArr2[i12];
                int i15 = i13 + 1;
                long j13 = j9 - jArr3[i15];
                int i16 = i13 + 2;
                int i17 = i14 + 1;
                long j14 = j11 - (jArr3[i16] + jArr4[i17]);
                int i18 = i13 + 3;
                long j15 = j12 - (jArr3[i18] + jArr4[i14 + 2]);
                int i19 = i11;
                long j16 = i12;
                char c7 = c3;
                long jXorRotr2 = ThreefishEngine.xorRotr(jXorRotr - ((jArr3[i13 + 4] + j16) + 1), 32, j13);
                long j17 = j13 - jXorRotr2;
                long[] jArr5 = jArr3;
                long jXorRotr3 = ThreefishEngine.xorRotr(j14, 32, j15);
                long j18 = j15 - jXorRotr3;
                long[] jArr6 = jArr4;
                long jXorRotr4 = ThreefishEngine.xorRotr(jXorRotr3, ROTATION_6_0, j17);
                long j19 = j17 - jXorRotr4;
                long jXorRotr5 = ThreefishEngine.xorRotr(jXorRotr2, 22, j18);
                long j21 = j18 - jXorRotr5;
                long jXorRotr6 = ThreefishEngine.xorRotr(jXorRotr5, ROTATION_5_0, j19);
                long j22 = j19 - jXorRotr6;
                long jXorRotr7 = ThreefishEngine.xorRotr(jXorRotr4, 12, j21);
                long j23 = j21 - jXorRotr7;
                long jXorRotr8 = ThreefishEngine.xorRotr(jXorRotr7, 25, j22);
                long jXorRotr9 = ThreefishEngine.xorRotr(jXorRotr6, 33, j23);
                long j24 = (j22 - jXorRotr8) - jArr5[i13];
                long j25 = jXorRotr8 - (jArr5[i15] + jArr6[i14]);
                long j26 = (j23 - jXorRotr9) - (jArr5[i16] + jArr6[i17]);
                long jXorRotr10 = ThreefishEngine.xorRotr(jXorRotr9 - (jArr5[i18] + j16), 5, j24);
                long j27 = j24 - jXorRotr10;
                long jXorRotr11 = ThreefishEngine.xorRotr(j25, ROTATION_3_1, j26);
                long j28 = j26 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(jXorRotr11, 23, j27);
                long j29 = j27 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(jXorRotr10, 40, j28);
                long j31 = j28 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(jXorRotr13, ROTATION_1_0, j29);
                long j32 = j29 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(jXorRotr12, 57, j31);
                long j33 = j31 - jXorRotr15;
                long jXorRotr16 = ThreefishEngine.xorRotr(jXorRotr15, 14, j32);
                jXorRotr = ThreefishEngine.xorRotr(jXorRotr14, 16, j33);
                j12 = j33 - jXorRotr;
                i12 -= 2;
                j11 = jXorRotr16;
                i11 = i19;
                jArr3 = jArr5;
                c3 = c7;
                j9 = j32 - jXorRotr16;
                jArr4 = jArr6;
                iArr = iArr;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            int i21 = i11;
            char c8 = c3;
            long j34 = j9 - jArr7[0];
            long j35 = j11 - (jArr7[i21] + jArr8[0]);
            long j36 = j12 - (jArr7[c8] + jArr8[i21]);
            long j37 = jXorRotr - jArr7[3];
            jArr2[0] = j34;
            jArr2[i21] = j35;
            jArr2[c8] = j36;
            jArr2[3] = j37;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f33137t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 9) {
                a.h();
                return;
            }
            if (jArr4.length != 5) {
                a.h();
                return;
            }
            long j9 = jArr[0];
            long j11 = jArr[1];
            char c3 = 2;
            long j12 = jArr[2];
            long j13 = jArr[3];
            long j14 = j9 + jArr3[0];
            long j15 = jArr3[1] + jArr4[0] + j11;
            long j16 = jArr3[2] + jArr4[1] + j12;
            long j17 = j13 + jArr3[3];
            long j18 = j16;
            long j19 = j15;
            int i11 = 1;
            while (i11 < 18) {
                int i12 = iArr[i11];
                int i13 = iArr2[i11];
                long j21 = j14 + j19;
                char c7 = c3;
                long jRotlXor = ThreefishEngine.rotlXor(j19, 14, j21);
                long j22 = j18 + j17;
                long jRotlXor2 = ThreefishEngine.rotlXor(j17, 16, j22);
                long[] jArr5 = jArr3;
                long j23 = j21 + jRotlXor2;
                long jRotlXor3 = ThreefishEngine.rotlXor(jRotlXor2, ROTATION_1_0, j23);
                long j24 = j22 + jRotlXor;
                long jRotlXor4 = ThreefishEngine.rotlXor(jRotlXor, 57, j24);
                long j25 = j23 + jRotlXor4;
                long jRotlXor5 = ThreefishEngine.rotlXor(jRotlXor4, 23, j25);
                long j26 = j24 + jRotlXor3;
                long jRotlXor6 = ThreefishEngine.rotlXor(jRotlXor3, 40, j26);
                long j27 = j25 + jRotlXor6;
                long jRotlXor7 = ThreefishEngine.rotlXor(jRotlXor6, 5, j27);
                long j28 = j26 + jRotlXor5;
                long jRotlXor8 = ThreefishEngine.rotlXor(jRotlXor5, ROTATION_3_1, j28);
                long j29 = j27 + jArr5[i12];
                int i14 = i12 + 1;
                long j31 = jArr5[i14] + jArr4[i13] + jRotlXor8;
                int i15 = i12 + 2;
                int i16 = i13 + 1;
                long j32 = jArr5[i15] + jArr4[i16] + j28;
                int i17 = i12 + 3;
                long j33 = i11;
                long j34 = jArr5[i17] + j33 + jRotlXor7;
                long[] jArr6 = jArr4;
                long j35 = j29 + j31;
                long jRotlXor9 = ThreefishEngine.rotlXor(j31, 25, j35);
                long j36 = j32 + j34;
                long jRotlXor10 = ThreefishEngine.rotlXor(j34, 33, j36);
                long j37 = j35 + jRotlXor10;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor10, ROTATION_5_0, j37);
                long j38 = j36 + jRotlXor9;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor9, 12, j38);
                long j39 = j37 + jRotlXor12;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor12, ROTATION_6_0, j39);
                long j41 = j38 + jRotlXor11;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor11, 22, j41);
                long j42 = j39 + jRotlXor14;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor14, 32, j42);
                long j43 = j41 + jRotlXor13;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor13, 32, j43);
                long j44 = j42 + jArr5[i14];
                j19 = jArr5[i15] + jArr6[i16] + jRotlXor16;
                j18 = jArr5[i17] + jArr6[i13 + 2] + j43;
                j17 = jArr5[i12 + 4] + j33 + 1 + jRotlXor15;
                i11 += 2;
                j14 = j44;
                c3 = c7;
                jArr3 = jArr5;
                jArr4 = jArr6;
                iArr = iArr;
            }
            jArr2[0] = j14;
            jArr2[1] = j19;
            jArr2[c3] = j18;
            jArr2[3] = j17;
        }
    }

    public static final class Threefish512Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 46;
        private static final int ROTATION_0_1 = 36;
        private static final int ROTATION_0_2 = 19;
        private static final int ROTATION_0_3 = 37;
        private static final int ROTATION_1_0 = 33;
        private static final int ROTATION_1_1 = 27;
        private static final int ROTATION_1_2 = 14;
        private static final int ROTATION_1_3 = 42;
        private static final int ROTATION_2_0 = 17;
        private static final int ROTATION_2_1 = 49;
        private static final int ROTATION_2_2 = 36;
        private static final int ROTATION_2_3 = 39;
        private static final int ROTATION_3_0 = 44;
        private static final int ROTATION_3_1 = 9;
        private static final int ROTATION_3_2 = 54;
        private static final int ROTATION_3_3 = 56;
        private static final int ROTATION_4_0 = 39;
        private static final int ROTATION_4_1 = 30;
        private static final int ROTATION_4_2 = 34;
        private static final int ROTATION_4_3 = 24;
        private static final int ROTATION_5_0 = 13;
        private static final int ROTATION_5_1 = 50;
        private static final int ROTATION_5_2 = 10;
        private static final int ROTATION_5_3 = 17;
        private static final int ROTATION_6_0 = 25;
        private static final int ROTATION_6_1 = 29;
        private static final int ROTATION_6_2 = 39;
        private static final int ROTATION_6_3 = 43;
        private static final int ROTATION_7_0 = 8;
        private static final int ROTATION_7_1 = 35;
        private static final int ROTATION_7_2 = 56;
        private static final int ROTATION_7_3 = 22;

        public Threefish512Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f33137t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 17) {
                a.h();
                return;
            }
            char c3 = 5;
            if (jArr4.length != 5) {
                a.h();
                return;
            }
            long j9 = jArr[0];
            int i11 = 1;
            long j11 = jArr[1];
            char c7 = 2;
            long j12 = jArr[2];
            long jXorRotr = jArr[3];
            long j13 = jArr[4];
            long jXorRotr2 = jArr[5];
            long j14 = jArr[6];
            long jXorRotr3 = jArr[7];
            int i12 = 17;
            while (i12 >= i11) {
                int i13 = iArr[i12];
                int i14 = iArr2[i12];
                int i15 = i13 + 1;
                long j15 = j9 - jArr3[i15];
                int i16 = i13 + 2;
                long j16 = j11 - jArr3[i16];
                int i17 = i13 + 3;
                long j17 = j12 - jArr3[i17];
                int i18 = i13 + 4;
                long j18 = jXorRotr - jArr3[i18];
                int i19 = i13 + 5;
                char c8 = c7;
                long j19 = j13 - jArr3[i19];
                int i21 = i13 + 6;
                int i22 = i14 + 1;
                int i23 = i11;
                long j21 = jXorRotr2 - (jArr3[i21] + jArr4[i22]);
                int i24 = i13 + 7;
                long[] jArr5 = jArr3;
                long j22 = j14 - (jArr3[i24] + jArr4[i14 + 2]);
                long[] jArr6 = jArr4;
                long j23 = i12;
                long j24 = jXorRotr3 - ((jArr5[i13 + 8] + j23) + 1);
                int[] iArr3 = iArr2;
                long jXorRotr4 = ThreefishEngine.xorRotr(j16, 8, j22);
                long j25 = j22 - jXorRotr4;
                long jXorRotr5 = ThreefishEngine.xorRotr(j24, 35, j15);
                long j26 = j15 - jXorRotr5;
                long jXorRotr6 = ThreefishEngine.xorRotr(j21, 56, j17);
                long j27 = j17 - jXorRotr6;
                long jXorRotr7 = ThreefishEngine.xorRotr(j18, 22, j19);
                long j28 = j19 - jXorRotr7;
                long jXorRotr8 = ThreefishEngine.xorRotr(jXorRotr4, 25, j28);
                long j29 = j28 - jXorRotr8;
                long jXorRotr9 = ThreefishEngine.xorRotr(jXorRotr7, 29, j25);
                long j31 = j25 - jXorRotr9;
                long jXorRotr10 = ThreefishEngine.xorRotr(jXorRotr6, 39, j26);
                long j32 = j26 - jXorRotr10;
                long jXorRotr11 = ThreefishEngine.xorRotr(jXorRotr5, ROTATION_6_3, j27);
                long j33 = j27 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(jXorRotr8, 13, j33);
                long j34 = j33 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(jXorRotr11, 50, j29);
                long j35 = j29 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(jXorRotr10, 10, j31);
                long j36 = j31 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(jXorRotr9, 17, j32);
                long j37 = j32 - jXorRotr15;
                long jXorRotr16 = ThreefishEngine.xorRotr(jXorRotr12, 39, j37);
                long j38 = j37 - jXorRotr16;
                long jXorRotr17 = ThreefishEngine.xorRotr(jXorRotr15, 30, j34);
                long jXorRotr18 = ThreefishEngine.xorRotr(jXorRotr14, 34, j35);
                long jXorRotr19 = ThreefishEngine.xorRotr(jXorRotr13, 24, j36);
                long j39 = j36 - jXorRotr19;
                long j41 = j38 - jArr5[i13];
                long j42 = jXorRotr16 - jArr5[i15];
                long j43 = (j34 - jXorRotr17) - jArr5[i16];
                long j44 = jXorRotr17 - jArr5[i17];
                long j45 = (j35 - jXorRotr18) - jArr5[i18];
                long j46 = jXorRotr18 - (jArr5[i19] + jArr6[i14]);
                long j47 = j39 - (jArr5[i21] + jArr6[i22]);
                long j48 = jXorRotr19 - (jArr5[i24] + j23);
                long jXorRotr20 = ThreefishEngine.xorRotr(j42, ROTATION_3_0, j47);
                long j49 = j47 - jXorRotr20;
                long jXorRotr21 = ThreefishEngine.xorRotr(j48, 9, j41);
                long j51 = j41 - jXorRotr21;
                long jXorRotr22 = ThreefishEngine.xorRotr(j46, ROTATION_3_2, j43);
                long j52 = j43 - jXorRotr22;
                long jXorRotr23 = ThreefishEngine.xorRotr(j44, 56, j45);
                long j53 = j45 - jXorRotr23;
                long jXorRotr24 = ThreefishEngine.xorRotr(jXorRotr20, 17, j53);
                long j54 = j53 - jXorRotr24;
                long jXorRotr25 = ThreefishEngine.xorRotr(jXorRotr23, ROTATION_2_1, j49);
                long j55 = j49 - jXorRotr25;
                long jXorRotr26 = ThreefishEngine.xorRotr(jXorRotr22, 36, j51);
                long j56 = j51 - jXorRotr26;
                long jXorRotr27 = ThreefishEngine.xorRotr(jXorRotr21, 39, j52);
                long j57 = j52 - jXorRotr27;
                long jXorRotr28 = ThreefishEngine.xorRotr(jXorRotr24, 33, j57);
                long j58 = j57 - jXorRotr28;
                long jXorRotr29 = ThreefishEngine.xorRotr(jXorRotr27, 27, j54);
                long j59 = j54 - jXorRotr29;
                long jXorRotr30 = ThreefishEngine.xorRotr(jXorRotr26, 14, j55);
                long j61 = j55 - jXorRotr30;
                long jXorRotr31 = ThreefishEngine.xorRotr(jXorRotr25, ROTATION_1_3, j56);
                long j62 = j56 - jXorRotr31;
                long jXorRotr32 = ThreefishEngine.xorRotr(jXorRotr28, ROTATION_0_0, j62);
                jXorRotr = ThreefishEngine.xorRotr(jXorRotr31, 36, j58);
                jXorRotr2 = ThreefishEngine.xorRotr(jXorRotr30, 19, j59);
                long j63 = j59 - jXorRotr2;
                jXorRotr3 = ThreefishEngine.xorRotr(jXorRotr29, ROTATION_0_3, j61);
                j14 = j61 - jXorRotr3;
                j12 = j58 - jXorRotr;
                j11 = jXorRotr32;
                i12 -= 2;
                j9 = j62 - jXorRotr32;
                i11 = i23;
                jArr3 = jArr5;
                c3 = c3;
                c7 = c8;
                iArr2 = iArr3;
                j13 = j63;
                jArr4 = jArr6;
                iArr = iArr;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            char c11 = c3;
            int i25 = i11;
            char c12 = c7;
            long j64 = j9 - jArr7[0];
            long j65 = j11 - jArr7[i25];
            long j66 = j12 - jArr7[c12];
            long j67 = jXorRotr - jArr7[3];
            long j68 = j13 - jArr7[4];
            long j69 = jXorRotr2 - (jArr7[c11] + jArr8[0]);
            long j71 = j14 - (jArr7[6] + jArr8[i25]);
            long j72 = jXorRotr3 - jArr7[7];
            jArr2[0] = j64;
            jArr2[i25] = j65;
            jArr2[c12] = j66;
            jArr2[3] = j67;
            jArr2[4] = j68;
            jArr2[c11] = j69;
            jArr2[6] = j71;
            jArr2[7] = j72;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f33137t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 17) {
                a.h();
                return;
            }
            if (jArr4.length != 5) {
                a.h();
                return;
            }
            long j9 = jArr[0];
            long j11 = jArr[1];
            long j12 = jArr[2];
            long j13 = jArr[3];
            long j14 = jArr[4];
            long j15 = jArr[5];
            long j16 = jArr[6];
            long j17 = jArr[7];
            long j18 = j9 + jArr3[0];
            long j19 = j11 + jArr3[1];
            long j21 = j12 + jArr3[2];
            long j22 = j13 + jArr3[3];
            long j23 = j14 + jArr3[4];
            long j24 = jArr3[5] + jArr4[0] + j15;
            long j25 = jArr3[6] + jArr4[1] + j16;
            long j26 = j17 + jArr3[7];
            long j27 = j25;
            long j28 = j23;
            long j29 = j18;
            int i11 = 1;
            long j31 = j22;
            long j32 = j24;
            long j33 = j21;
            long j34 = j26;
            while (i11 < 18) {
                int i12 = iArr[i11];
                int i13 = iArr2[i11];
                long j35 = j31;
                long j36 = j29 + j19;
                long jRotlXor = ThreefishEngine.rotlXor(j19, ROTATION_0_0, j36);
                long[] jArr5 = jArr3;
                long j37 = j33 + j35;
                long[] jArr6 = jArr4;
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                long jRotlXor2 = ThreefishEngine.rotlXor(j35, 36, j37);
                long j38 = j28 + j32;
                long jRotlXor3 = ThreefishEngine.rotlXor(j32, 19, j38);
                long j39 = j27 + j34;
                long jRotlXor4 = ThreefishEngine.rotlXor(j34, ROTATION_0_3, j39);
                long j41 = j37 + jRotlXor;
                long jRotlXor5 = ThreefishEngine.rotlXor(jRotlXor, 33, j41);
                long j42 = j38 + jRotlXor4;
                long jRotlXor6 = ThreefishEngine.rotlXor(jRotlXor4, 27, j42);
                long j43 = j39 + jRotlXor3;
                long jRotlXor7 = ThreefishEngine.rotlXor(jRotlXor3, 14, j43);
                long j44 = j36 + jRotlXor2;
                long jRotlXor8 = ThreefishEngine.rotlXor(jRotlXor2, ROTATION_1_3, j44);
                long j45 = j42 + jRotlXor5;
                long jRotlXor9 = ThreefishEngine.rotlXor(jRotlXor5, 17, j45);
                long j46 = j43 + jRotlXor8;
                long jRotlXor10 = ThreefishEngine.rotlXor(jRotlXor8, ROTATION_2_1, j46);
                long j47 = j44 + jRotlXor7;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor7, 36, j47);
                long j48 = j41 + jRotlXor6;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor6, 39, j48);
                int i14 = i11;
                long j49 = j46 + jRotlXor9;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor9, ROTATION_3_0, j49);
                long j51 = j47 + jRotlXor12;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor12, 9, j51);
                long j52 = j48 + jRotlXor11;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor11, ROTATION_3_2, j52);
                long j53 = j45 + jRotlXor10;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor10, 56, j53);
                long j54 = j51 + jArr5[i12];
                int i15 = i12 + 1;
                long j55 = jRotlXor13 + jArr5[i15];
                int i16 = i12 + 2;
                long j56 = j52 + jArr5[i16];
                int i17 = i12 + 3;
                long j57 = jRotlXor16 + jArr5[i17];
                int i18 = i12 + 4;
                long j58 = j53 + jArr5[i18];
                int i19 = i12 + 5;
                long j59 = jArr5[i19] + jArr6[i13] + jRotlXor15;
                int i21 = i12 + 6;
                int i22 = i13 + 1;
                long j61 = jArr5[i21] + jArr6[i22] + j49;
                int i23 = i12 + 7;
                long j62 = i14;
                long j63 = jArr5[i23] + j62 + jRotlXor14;
                long j64 = j54 + j55;
                long jRotlXor17 = ThreefishEngine.rotlXor(j55, 39, j64);
                long j65 = j56 + j57;
                long jRotlXor18 = ThreefishEngine.rotlXor(j57, 30, j65);
                long j66 = j58 + j59;
                long jRotlXor19 = ThreefishEngine.rotlXor(j59, 34, j66);
                long j67 = j61 + j63;
                long jRotlXor20 = ThreefishEngine.rotlXor(j63, 24, j67);
                long j68 = j65 + jRotlXor17;
                long jRotlXor21 = ThreefishEngine.rotlXor(jRotlXor17, 13, j68);
                long j69 = j66 + jRotlXor20;
                long jRotlXor22 = ThreefishEngine.rotlXor(jRotlXor20, 50, j69);
                long j71 = j67 + jRotlXor19;
                long jRotlXor23 = ThreefishEngine.rotlXor(jRotlXor19, 10, j71);
                long j72 = j64 + jRotlXor18;
                long jRotlXor24 = ThreefishEngine.rotlXor(jRotlXor18, 17, j72);
                long j73 = j69 + jRotlXor21;
                long jRotlXor25 = ThreefishEngine.rotlXor(jRotlXor21, 25, j73);
                long j74 = j71 + jRotlXor24;
                long jRotlXor26 = ThreefishEngine.rotlXor(jRotlXor24, 29, j74);
                long j75 = j72 + jRotlXor23;
                long jRotlXor27 = ThreefishEngine.rotlXor(jRotlXor23, 39, j75);
                long j76 = j68 + jRotlXor22;
                long jRotlXor28 = ThreefishEngine.rotlXor(jRotlXor22, ROTATION_6_3, j76);
                long j77 = j74 + jRotlXor25;
                long jRotlXor29 = ThreefishEngine.rotlXor(jRotlXor25, 8, j77);
                long j78 = j75 + jRotlXor28;
                long jRotlXor30 = ThreefishEngine.rotlXor(jRotlXor28, 35, j78);
                long j79 = j76 + jRotlXor27;
                long jRotlXor31 = ThreefishEngine.rotlXor(jRotlXor27, 56, j79);
                long j81 = j73 + jRotlXor26;
                long jRotlXor32 = ThreefishEngine.rotlXor(jRotlXor26, 22, j81);
                long j82 = j78 + jArr5[i15];
                long j83 = jRotlXor29 + jArr5[i16];
                long j84 = j79 + jArr5[i17];
                long j85 = jRotlXor32 + jArr5[i18];
                long j86 = j81 + jArr5[i19];
                long j87 = jArr5[i21] + jArr6[i22] + jRotlXor31;
                j27 = jArr5[i23] + jArr6[i13 + 2] + j77;
                j28 = j86;
                j29 = j82;
                j33 = j84;
                jArr4 = jArr6;
                iArr = iArr3;
                j19 = j83;
                j34 = jArr5[i12 + 8] + j62 + 1 + jRotlXor30;
                j31 = j85;
                jArr3 = jArr5;
                i11 = i14 + 2;
                j32 = j87;
                iArr2 = iArr4;
            }
            jArr2[0] = j29;
            jArr2[1] = j19;
            jArr2[2] = j33;
            jArr2[3] = j31;
            jArr2[4] = j28;
            jArr2[5] = j32;
            jArr2[6] = j27;
            jArr2[7] = j34;
        }
    }

    public static abstract class ThreefishCipher {
        protected final long[] kw;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        protected final long[] f33137t;

        public ThreefishCipher(long[] jArr, long[] jArr2) {
            this.kw = jArr;
            this.f33137t = jArr2;
        }

        public abstract void decryptBlock(long[] jArr, long[] jArr2);

        public abstract void encryptBlock(long[] jArr, long[] jArr2);
    }

    static {
        int[] iArr = new int[80];
        MOD9 = iArr;
        MOD17 = new int[iArr.length];
        MOD5 = new int[iArr.length];
        MOD3 = new int[iArr.length];
        int i11 = 0;
        while (true) {
            int[] iArr2 = MOD9;
            if (i11 >= iArr2.length) {
                return;
            }
            MOD17[i11] = i11 % 17;
            iArr2[i11] = i11 % 9;
            MOD5[i11] = i11 % 5;
            MOD3[i11] = i11 % 3;
            i11++;
        }
    }

    public ThreefishEngine(int i11) {
        ThreefishCipher threefish256Cipher;
        long[] jArr = new long[5];
        this.f33136t = jArr;
        int i12 = i11 / 8;
        this.blocksizeBytes = i12;
        int i13 = i12 / 8;
        this.blocksizeWords = i13;
        this.currentBlock = new long[i13];
        long[] jArr2 = new long[(i13 * 2) + 1];
        this.kw = jArr2;
        if (i11 == 256) {
            threefish256Cipher = new Threefish256Cipher(jArr2, jArr);
        } else if (i11 == 512) {
            threefish256Cipher = new Threefish512Cipher(jArr2, jArr);
        } else {
            if (i11 != 1024) {
                a.f("Invalid blocksize - Threefish is defined with block size of 256, 512, or 1024 bits");
                throw null;
            }
            threefish256Cipher = new Threefish1024Cipher(jArr2, jArr);
        }
        this.cipher = threefish256Cipher;
    }

    public static long bytesToWord(byte[] bArr, int i11) {
        return Pack.littleEndianToLong(bArr, i11);
    }

    public static long rotlXor(long j9, int i11, long j11) {
        return ((j9 >>> (-i11)) | (j9 << i11)) ^ j11;
    }

    private void setKey(long[] jArr) {
        if (jArr.length != this.blocksizeWords) {
            a.f(k.i(this.blocksizeWords, " words)", new StringBuilder("Threefish key must be same size as block (")));
            return;
        }
        long j9 = C_240;
        int i11 = 0;
        while (true) {
            int i12 = this.blocksizeWords;
            long[] jArr2 = this.kw;
            if (i11 >= i12) {
                jArr2[i12] = j9;
                System.arraycopy(jArr2, 0, jArr2, i12 + 1, i12);
                return;
            } else {
                long j11 = jArr[i11];
                jArr2[i11] = j11;
                j9 ^= j11;
                i11++;
            }
        }
    }

    private void setTweak(long[] jArr) {
        if (jArr.length != 2) {
            a.f("Tweak must be 2 words.");
            return;
        }
        long[] jArr2 = this.f33136t;
        long j9 = jArr[0];
        jArr2[0] = j9;
        long j11 = jArr[1];
        jArr2[1] = j11;
        jArr2[2] = j9 ^ j11;
        jArr2[3] = j9;
        jArr2[4] = j11;
    }

    public static void wordToBytes(long j9, byte[] bArr, int i11) {
        Pack.longToLittleEndian(j9, bArr, i11);
    }

    public static long xorRotr(long j9, int i11, long j11) {
        long j12 = j9 ^ j11;
        return (j12 << (-i11)) | (j12 >>> i11);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Threefish-" + (this.blocksizeBytes * 8);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blocksizeBytes;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) throws IllegalArgumentException {
        byte[] key;
        byte[] tweak;
        long[] jArr;
        long[] jArr2 = null;
        if (cipherParameters instanceof TweakableBlockCipherParameters) {
            TweakableBlockCipherParameters tweakableBlockCipherParameters = (TweakableBlockCipherParameters) cipherParameters;
            key = tweakableBlockCipherParameters.getKey().getKey();
            tweak = tweakableBlockCipherParameters.getTweak();
        } else if (!(cipherParameters instanceof KeyParameter)) {
            a.f(s.n("Invalid parameter passed to Threefish init - ", cipherParameters));
            return;
        } else {
            key = ((KeyParameter) cipherParameters).getKey();
            tweak = null;
        }
        if (key == null) {
            jArr = null;
        } else if (key.length != this.blocksizeBytes) {
            a.f(k.i(this.blocksizeBytes, " bytes)", new StringBuilder("Threefish key must be same size as block (")));
            return;
        } else {
            jArr = new long[this.blocksizeWords];
            Pack.littleEndianToLong(key, 0, jArr);
        }
        if (tweak != null) {
            if (tweak.length != 16) {
                a.f("Threefish tweak must be 16 bytes");
                return;
            } else {
                jArr2 = new long[2];
                Pack.littleEndianToLong(tweak, 0, jArr2);
            }
        }
        init(z11, jArr, jArr2);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 256, cipherParameters, Utils.getPurpose(z11)));
    }

    public int processBlock(long[] jArr, long[] jArr2) throws IllegalStateException, DataLengthException {
        long[] jArr3 = this.kw;
        int i11 = this.blocksizeWords;
        if (jArr3[i11] == 0) {
            h2.b("Threefish engine not initialised");
            return 0;
        }
        if (jArr.length != i11) {
            i1.t("Input buffer too short");
            return 0;
        }
        if (jArr2.length != i11) {
            i1.r("Output buffer too short");
            return 0;
        }
        boolean z11 = this.forEncryption;
        ThreefishCipher threefishCipher = this.cipher;
        if (z11) {
            threefishCipher.encryptBlock(jArr, jArr2);
        } else {
            threefishCipher.decryptBlock(jArr, jArr2);
        }
        return this.blocksizeWords;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) throws IllegalStateException, DataLengthException {
        int i13 = this.blocksizeBytes;
        if (i11 + i13 > bArr.length) {
            i1.t("Input buffer too short");
            return 0;
        }
        if (i13 + i12 > bArr2.length) {
            i1.r("Output buffer too short");
            return 0;
        }
        Pack.littleEndianToLong(bArr, i11, this.currentBlock);
        long[] jArr = this.currentBlock;
        processBlock(jArr, jArr);
        Pack.longToLittleEndian(this.currentBlock, bArr2, i12);
        return this.blocksizeBytes;
    }

    public void init(boolean z11, long[] jArr, long[] jArr2) {
        this.forEncryption = z11;
        if (jArr != null) {
            setKey(jArr);
        }
        if (jArr2 != null) {
            setTweak(jArr2);
        }
    }
}
