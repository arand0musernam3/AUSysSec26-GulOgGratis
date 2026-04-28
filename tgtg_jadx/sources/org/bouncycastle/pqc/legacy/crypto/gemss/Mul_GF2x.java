package org.bouncycastle.pqc.legacy.crypto.gemss;

/* JADX INFO: loaded from: classes3.dex */
abstract class Mul_GF2x {

    public static class Mul12 extends Mul_GF2x {
        private long[] Buffer = new long[12];

        @Override // org.bouncycastle.pqc.legacy.crypto.gemss.Mul_GF2x
        public void mul_gf2x(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul384_no_simd_gf2x(pointer.array, pointer2.array, pointer2.f33654cp, pointer3.array, pointer3.f33654cp, this.Buffer);
        }

        @Override // org.bouncycastle.pqc.legacy.crypto.gemss.Mul_GF2x
        public void mul_gf2x_xor(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul384_no_simd_gf2x_xor(pointer.array, pointer2.array, pointer2.f33654cp, pointer3.array, pointer3.f33654cp, this.Buffer);
        }

        @Override // org.bouncycastle.pqc.legacy.crypto.gemss.Mul_GF2x
        public void sqr_gf2x(long[] jArr, long[] jArr2, int i11) {
            Mul_GF2x.SQR128_NO_SIMD_GF2X(jArr, 8, jArr2, i11 + 4);
            Mul_GF2x.SQR256_NO_SIMD_GF2X(jArr, 0, jArr2, i11);
        }
    }

    public static class Mul13 extends Mul_GF2x {
        private long[] Buffer = new long[13];
        private long[] Buffer2 = new long[4];

        @Override // org.bouncycastle.pqc.legacy.crypto.gemss.Mul_GF2x
        public void mul_gf2x(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul416_no_simd_gf2x(pointer.array, pointer2.array, pointer2.f33654cp, pointer3.array, pointer3.f33654cp, this.Buffer);
        }

        @Override // org.bouncycastle.pqc.legacy.crypto.gemss.Mul_GF2x
        public void mul_gf2x_xor(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul416_no_simd_gf2x_xor(pointer.array, pointer2.array, pointer2.f33654cp, pointer3.array, pointer3.f33654cp, this.Buffer, this.Buffer2);
        }

        @Override // org.bouncycastle.pqc.legacy.crypto.gemss.Mul_GF2x
        public void sqr_gf2x(long[] jArr, long[] jArr2, int i11) {
            jArr[12] = Mul_GF2x.SQR32_NO_SIMD_GF2X(jArr2[i11 + 6]);
            Mul_GF2x.SQR128_NO_SIMD_GF2X(jArr, 8, jArr2, i11 + 4);
            Mul_GF2x.SQR256_NO_SIMD_GF2X(jArr, 0, jArr2, i11);
        }
    }

    public static class Mul17 extends Mul_GF2x {
        private long[] AA = new long[5];
        private long[] BB = new long[5];
        private long[] Buffer1 = new long[17];
        private long[] Buffer2 = new long[4];

        @Override // org.bouncycastle.pqc.legacy.crypto.gemss.Mul_GF2x
        public void mul_gf2x(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul544_no_simd_gf2x(pointer.array, pointer2.array, pointer2.f33654cp, pointer3.array, pointer3.f33654cp, this.AA, this.BB, this.Buffer1);
        }

        @Override // org.bouncycastle.pqc.legacy.crypto.gemss.Mul_GF2x
        public void mul_gf2x_xor(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul544_no_simd_gf2x_xor(pointer.array, pointer2.array, pointer2.f33654cp, pointer3.array, pointer3.f33654cp, this.AA, this.BB, this.Buffer1, this.Buffer2);
        }

        @Override // org.bouncycastle.pqc.legacy.crypto.gemss.Mul_GF2x
        public void sqr_gf2x(long[] jArr, long[] jArr2, int i11) {
            jArr[16] = Mul_GF2x.SQR32_NO_SIMD_GF2X(jArr2[i11 + 8]);
            Mul_GF2x.SQR256_NO_SIMD_GF2X(jArr, 8, jArr2, i11 + 4);
            Mul_GF2x.SQR256_NO_SIMD_GF2X(jArr, 0, jArr2, i11);
        }
    }

    public static class Mul6 extends Mul_GF2x {
        private long[] Buffer = new long[6];

        @Override // org.bouncycastle.pqc.legacy.crypto.gemss.Mul_GF2x
        public void mul_gf2x(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul192_no_simd_gf2x(pointer.array, 0, pointer2.array, pointer2.f33654cp, pointer3.array, pointer3.f33654cp);
        }

        @Override // org.bouncycastle.pqc.legacy.crypto.gemss.Mul_GF2x
        public void mul_gf2x_xor(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul192_no_simd_gf2x_xor(pointer.array, pointer.f33654cp, pointer2.array, pointer2.f33654cp, pointer3.array, pointer3.f33654cp, this.Buffer);
        }

        @Override // org.bouncycastle.pqc.legacy.crypto.gemss.Mul_GF2x
        public void sqr_gf2x(long[] jArr, long[] jArr2, int i11) {
            Mul_GF2x.SQR64_NO_SIMD_GF2X(jArr, 4, jArr2[i11 + 2]);
            Mul_GF2x.SQR128_NO_SIMD_GF2X(jArr, 0, jArr2, i11);
        }
    }

    public static class Mul9 extends Mul_GF2x {
        private long[] Buffer = new long[9];

        @Override // org.bouncycastle.pqc.legacy.crypto.gemss.Mul_GF2x
        public void mul_gf2x(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul288_no_simd_gf2x(pointer.array, 0, pointer2.array, pointer2.f33654cp, pointer3.array, pointer3.f33654cp, this.Buffer);
        }

        @Override // org.bouncycastle.pqc.legacy.crypto.gemss.Mul_GF2x
        public void mul_gf2x_xor(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul288_no_simd_gf2x_xor(pointer.array, pointer.f33654cp, pointer2.array, pointer2.f33654cp, pointer3.array, pointer3.f33654cp, this.Buffer);
        }

        @Override // org.bouncycastle.pqc.legacy.crypto.gemss.Mul_GF2x
        public void sqr_gf2x(long[] jArr, long[] jArr2, int i11) {
            jArr[8] = Mul_GF2x.SQR32_NO_SIMD_GF2X(jArr2[i11 + 4]);
            Mul_GF2x.SQR256_NO_SIMD_GF2X(jArr, 0, jArr2, i11);
        }
    }

    private static long MUL32_NO_SIMD_GF2X(long j9, long j11) {
        return ((j9 & (-((j11 >>> 31) & 1))) << 31) ^ ((((((((((((((((((((((((((((((((-(j11 & 1)) & j9) ^ (((-((j11 >>> 1) & 1)) & j9) << 1)) ^ (((-((j11 >>> 2) & 1)) & j9) << 2)) ^ (((-((j11 >>> 3) & 1)) & j9) << 3)) ^ (((-((j11 >>> 4) & 1)) & j9) << 4)) ^ (((-((j11 >>> 5) & 1)) & j9) << 5)) ^ (((-((j11 >>> 6) & 1)) & j9) << 6)) ^ (((-((j11 >>> 7) & 1)) & j9) << 7)) ^ (((-((j11 >>> 8) & 1)) & j9) << 8)) ^ (((-((j11 >>> 9) & 1)) & j9) << 9)) ^ (((-((j11 >>> 10) & 1)) & j9) << 10)) ^ (((-((j11 >>> 11) & 1)) & j9) << 11)) ^ (((-((j11 >>> 12) & 1)) & j9) << 12)) ^ (((-((j11 >>> 13) & 1)) & j9) << 13)) ^ (((-((j11 >>> 14) & 1)) & j9) << 14)) ^ (((-((j11 >>> 15) & 1)) & j9) << 15)) ^ (((-((j11 >>> 16) & 1)) & j9) << 16)) ^ (((-((j11 >>> 17) & 1)) & j9) << 17)) ^ (((-((j11 >>> 18) & 1)) & j9) << 18)) ^ (((-((j11 >>> 19) & 1)) & j9) << 19)) ^ (((-((j11 >>> 20) & 1)) & j9) << 20)) ^ (((-((j11 >>> 21) & 1)) & j9) << 21)) ^ (((-((j11 >>> 22) & 1)) & j9) << 22)) ^ (((-((j11 >>> 23) & 1)) & j9) << 23)) ^ (((-((j11 >>> 24) & 1)) & j9) << 24)) ^ (((-((j11 >>> 25) & 1)) & j9) << 25)) ^ (((-((j11 >>> 26) & 1)) & j9) << 26)) ^ (((-((j11 >>> 27) & 1)) & j9) << 27)) ^ (((-((j11 >>> 28) & 1)) & j9) << 28)) ^ (((-((j11 >>> 29) & 1)) & j9) << 29)) ^ (((-((j11 >>> 30) & 1)) & j9) << 30));
    }

    private static void MUL64_NO_SIMD_GF2X(long[] jArr, int i11, long j9, long j11) {
        long j12 = (-(j11 >>> 63)) & j9;
        long j13 = (-((j11 >>> 1) & 1)) & j9;
        long j14 = (((-(j11 & 1)) & j9) ^ (j12 << 63)) ^ (j13 << 1);
        long j15 = (j12 >>> 1) ^ (j13 >>> 63);
        long j16 = (-((j11 >>> 2) & 1)) & j9;
        long j17 = (-((j11 >>> 3) & 1)) & j9;
        long j18 = (-((j11 >>> 4) & 1)) & j9;
        long j19 = (-((j11 >>> 5) & 1)) & j9;
        long j21 = (((j14 ^ (j16 << 2)) ^ (j17 << 3)) ^ (j18 << 4)) ^ (j19 << 5);
        long j22 = (j19 >>> 59) ^ (((j15 ^ (j16 >>> 62)) ^ (j17 >>> 61)) ^ (j18 >>> 60));
        long j23 = (-((j11 >>> 6) & 1)) & j9;
        long j24 = j21 ^ (j23 << 6);
        long j25 = j22 ^ (j23 >>> 58);
        long j26 = (-((j11 >>> 7) & 1)) & j9;
        long j27 = j24 ^ (j26 << 7);
        long j28 = j25 ^ (j26 >>> 57);
        long j29 = (-((j11 >>> 8) & 1)) & j9;
        long j31 = j27 ^ (j29 << 8);
        long j32 = j28 ^ (j29 >>> 56);
        long j33 = (-((j11 >>> 9) & 1)) & j9;
        long j34 = j31 ^ (j33 << 9);
        long j35 = j32 ^ (j33 >>> 55);
        long j36 = (-((j11 >>> 10) & 1)) & j9;
        long j37 = j34 ^ (j36 << 10);
        long j38 = j35 ^ (j36 >>> 54);
        long j39 = (-((j11 >>> 11) & 1)) & j9;
        long j41 = j37 ^ (j39 << 11);
        long j42 = j38 ^ (j39 >>> 53);
        long j43 = (-((j11 >>> 12) & 1)) & j9;
        long j44 = j41 ^ (j43 << 12);
        long j45 = j42 ^ (j43 >>> 52);
        long j46 = (-((j11 >>> 13) & 1)) & j9;
        long j47 = j44 ^ (j46 << 13);
        long j48 = j45 ^ (j46 >>> 51);
        long j49 = (-((j11 >>> 14) & 1)) & j9;
        long j51 = j47 ^ (j49 << 14);
        long j52 = j48 ^ (j49 >>> 50);
        long j53 = (-((j11 >>> 15) & 1)) & j9;
        long j54 = j51 ^ (j53 << 15);
        long j55 = j52 ^ (j53 >>> 49);
        long j56 = (-((j11 >>> 16) & 1)) & j9;
        long j57 = j54 ^ (j56 << 16);
        long j58 = j55 ^ (j56 >>> 48);
        long j59 = (-((j11 >>> 17) & 1)) & j9;
        long j61 = j57 ^ (j59 << 17);
        long j62 = j58 ^ (j59 >>> 47);
        long j63 = (-((j11 >>> 18) & 1)) & j9;
        long j64 = j61 ^ (j63 << 18);
        long j65 = j62 ^ (j63 >>> 46);
        long j66 = (-((j11 >>> 19) & 1)) & j9;
        long j67 = j64 ^ (j66 << 19);
        long j68 = j65 ^ (j66 >>> 45);
        long j69 = (-((j11 >>> 20) & 1)) & j9;
        long j71 = j67 ^ (j69 << 20);
        long j72 = j68 ^ (j69 >>> 44);
        long j73 = (-((j11 >>> 21) & 1)) & j9;
        long j74 = j71 ^ (j73 << 21);
        long j75 = j72 ^ (j73 >>> 43);
        long j76 = (-((j11 >>> 22) & 1)) & j9;
        long j77 = j74 ^ (j76 << 22);
        long j78 = j75 ^ (j76 >>> 42);
        long j79 = (-((j11 >>> 23) & 1)) & j9;
        long j81 = j77 ^ (j79 << 23);
        long j82 = j78 ^ (j79 >>> 41);
        long j83 = (-((j11 >>> 24) & 1)) & j9;
        long j84 = j81 ^ (j83 << 24);
        long j85 = j82 ^ (j83 >>> 40);
        long j86 = (-((j11 >>> 25) & 1)) & j9;
        long j87 = j84 ^ (j86 << 25);
        long j88 = j85 ^ (j86 >>> 39);
        long j89 = (-((j11 >>> 26) & 1)) & j9;
        long j90 = j87 ^ (j89 << 26);
        long j91 = j88 ^ (j89 >>> 38);
        long j92 = (-((j11 >>> 27) & 1)) & j9;
        long j93 = j90 ^ (j92 << 27);
        long j94 = j91 ^ (j92 >>> 37);
        long j95 = (-((j11 >>> 28) & 1)) & j9;
        long j96 = j93 ^ (j95 << 28);
        long j97 = j94 ^ (j95 >>> 36);
        long j98 = (-((j11 >>> 29) & 1)) & j9;
        long j99 = j96 ^ (j98 << 29);
        long j100 = j97 ^ (j98 >>> 35);
        long j101 = (-((j11 >>> 30) & 1)) & j9;
        long j102 = j99 ^ (j101 << 30);
        long j103 = j100 ^ (j101 >>> 34);
        long j104 = (-((j11 >>> 31) & 1)) & j9;
        long j105 = j102 ^ (j104 << 31);
        long j106 = j103 ^ (j104 >>> 33);
        long j107 = (-((j11 >>> 32) & 1)) & j9;
        long j108 = j105 ^ (j107 << 32);
        long j109 = j106 ^ (j107 >>> 32);
        long j110 = (-((j11 >>> 33) & 1)) & j9;
        long j111 = j108 ^ (j110 << 33);
        long j112 = j109 ^ (j110 >>> 31);
        long j113 = (-((j11 >>> 34) & 1)) & j9;
        long j114 = j111 ^ (j113 << 34);
        long j115 = j112 ^ (j113 >>> 30);
        long j116 = (-((j11 >>> 35) & 1)) & j9;
        long j117 = j114 ^ (j116 << 35);
        long j118 = j115 ^ (j116 >>> 29);
        long j119 = (-((j11 >>> 36) & 1)) & j9;
        long j120 = j117 ^ (j119 << 36);
        long j121 = j118 ^ (j119 >>> 28);
        long j122 = (-((j11 >>> 37) & 1)) & j9;
        long j123 = j120 ^ (j122 << 37);
        long j124 = j121 ^ (j122 >>> 27);
        long j125 = (-((j11 >>> 38) & 1)) & j9;
        long j126 = j123 ^ (j125 << 38);
        long j127 = j124 ^ (j125 >>> 26);
        long j128 = (-((j11 >>> 39) & 1)) & j9;
        long j129 = j126 ^ (j128 << 39);
        long j130 = j127 ^ (j128 >>> 25);
        long j131 = (-((j11 >>> 40) & 1)) & j9;
        long j132 = j129 ^ (j131 << 40);
        long j133 = j130 ^ (j131 >>> 24);
        long j134 = (-((j11 >>> 41) & 1)) & j9;
        long j135 = j132 ^ (j134 << 41);
        long j136 = j133 ^ (j134 >>> 23);
        long j137 = (-((j11 >>> 42) & 1)) & j9;
        long j138 = j135 ^ (j137 << 42);
        long j139 = j136 ^ (j137 >>> 22);
        long j140 = (-((j11 >>> 43) & 1)) & j9;
        long j141 = j138 ^ (j140 << 43);
        long j142 = j139 ^ (j140 >>> 21);
        long j143 = (-((j11 >>> 44) & 1)) & j9;
        long j144 = j141 ^ (j143 << 44);
        long j145 = j142 ^ (j143 >>> 20);
        long j146 = (-((j11 >>> 45) & 1)) & j9;
        long j147 = j144 ^ (j146 << 45);
        long j148 = j145 ^ (j146 >>> 19);
        long j149 = (-((j11 >>> 46) & 1)) & j9;
        long j150 = j147 ^ (j149 << 46);
        long j151 = j148 ^ (j149 >>> 18);
        long j152 = (-((j11 >>> 47) & 1)) & j9;
        long j153 = j150 ^ (j152 << 47);
        long j154 = j151 ^ (j152 >>> 17);
        long j155 = (-((j11 >>> 48) & 1)) & j9;
        long j156 = j153 ^ (j155 << 48);
        long j157 = j154 ^ (j155 >>> 16);
        long j158 = (-((j11 >>> 49) & 1)) & j9;
        long j159 = j156 ^ (j158 << 49);
        long j160 = j157 ^ (j158 >>> 15);
        long j161 = (-((j11 >>> 50) & 1)) & j9;
        long j162 = j159 ^ (j161 << 50);
        long j163 = j160 ^ (j161 >>> 14);
        long j164 = (-((j11 >>> 51) & 1)) & j9;
        long j165 = j162 ^ (j164 << 51);
        long j166 = j163 ^ (j164 >>> 13);
        long j167 = (-((j11 >>> 52) & 1)) & j9;
        long j168 = j165 ^ (j167 << 52);
        long j169 = j166 ^ (j167 >>> 12);
        long j170 = (-((j11 >>> 53) & 1)) & j9;
        long j171 = j168 ^ (j170 << 53);
        long j172 = j169 ^ (j170 >>> 11);
        long j173 = (-((j11 >>> 54) & 1)) & j9;
        long j174 = j171 ^ (j173 << 54);
        long j175 = j172 ^ (j173 >>> 10);
        long j176 = (-((j11 >>> 55) & 1)) & j9;
        long j177 = j174 ^ (j176 << 55);
        long j178 = j175 ^ (j176 >>> 9);
        long j179 = (-((j11 >>> 56) & 1)) & j9;
        long j180 = j177 ^ (j179 << 56);
        long j181 = j178 ^ (j179 >>> 8);
        long j182 = (-((j11 >>> 57) & 1)) & j9;
        long j183 = j180 ^ (j182 << 57);
        long j184 = j181 ^ (j182 >>> 7);
        long j185 = (-((j11 >>> 58) & 1)) & j9;
        long j186 = j183 ^ (j185 << 58);
        long j187 = j184 ^ (j185 >>> 6);
        long j188 = (-((j11 >>> 59) & 1)) & j9;
        long j189 = j186 ^ (j188 << 59);
        long j190 = j187 ^ (j188 >>> 5);
        long j191 = (-((j11 >>> 60) & 1)) & j9;
        long j192 = j189 ^ (j191 << 60);
        long j193 = j190 ^ (j191 >>> 4);
        long j194 = (-((j11 >>> 61) & 1)) & j9;
        long j195 = j192 ^ (j194 << 61);
        long j196 = j193 ^ (j194 >>> 3);
        long j197 = (-((j11 >>> 62) & 1)) & j9;
        jArr[i11] = j195 ^ (j197 << 62);
        jArr[i11 + 1] = j196 ^ (j197 >>> 2);
    }

    private static void MUL64_NO_SIMD_GF2X_XOR(long[] jArr, int i11, long j9, long j11) {
        long j12 = (-(j11 >>> 63)) & j9;
        long j13 = (-((j11 >>> 1) & 1)) & j9;
        long j14 = (((-(j11 & 1)) & j9) ^ (j12 << 63)) ^ (j13 << 1);
        long j15 = (j12 >>> 1) ^ (j13 >>> 63);
        long j16 = (-((j11 >>> 2) & 1)) & j9;
        long j17 = (-((j11 >>> 3) & 1)) & j9;
        long j18 = (-((j11 >>> 4) & 1)) & j9;
        long j19 = (-((j11 >>> 5) & 1)) & j9;
        long j21 = (((j14 ^ (j16 << 2)) ^ (j17 << 3)) ^ (j18 << 4)) ^ (j19 << 5);
        long j22 = (j19 >>> 59) ^ (((j15 ^ (j16 >>> 62)) ^ (j17 >>> 61)) ^ (j18 >>> 60));
        long j23 = (-((j11 >>> 6) & 1)) & j9;
        long j24 = j21 ^ (j23 << 6);
        long j25 = j22 ^ (j23 >>> 58);
        long j26 = (-((j11 >>> 7) & 1)) & j9;
        long j27 = j24 ^ (j26 << 7);
        long j28 = j25 ^ (j26 >>> 57);
        long j29 = (-((j11 >>> 8) & 1)) & j9;
        long j31 = j27 ^ (j29 << 8);
        long j32 = j28 ^ (j29 >>> 56);
        long j33 = (-((j11 >>> 9) & 1)) & j9;
        long j34 = j31 ^ (j33 << 9);
        long j35 = j32 ^ (j33 >>> 55);
        long j36 = (-((j11 >>> 10) & 1)) & j9;
        long j37 = j34 ^ (j36 << 10);
        long j38 = j35 ^ (j36 >>> 54);
        long j39 = (-((j11 >>> 11) & 1)) & j9;
        long j41 = j37 ^ (j39 << 11);
        long j42 = j38 ^ (j39 >>> 53);
        long j43 = (-((j11 >>> 12) & 1)) & j9;
        long j44 = j41 ^ (j43 << 12);
        long j45 = j42 ^ (j43 >>> 52);
        long j46 = (-((j11 >>> 13) & 1)) & j9;
        long j47 = j44 ^ (j46 << 13);
        long j48 = j45 ^ (j46 >>> 51);
        long j49 = (-((j11 >>> 14) & 1)) & j9;
        long j51 = j47 ^ (j49 << 14);
        long j52 = j48 ^ (j49 >>> 50);
        long j53 = (-((j11 >>> 15) & 1)) & j9;
        long j54 = j51 ^ (j53 << 15);
        long j55 = j52 ^ (j53 >>> 49);
        long j56 = (-((j11 >>> 16) & 1)) & j9;
        long j57 = j54 ^ (j56 << 16);
        long j58 = j55 ^ (j56 >>> 48);
        long j59 = (-((j11 >>> 17) & 1)) & j9;
        long j61 = j57 ^ (j59 << 17);
        long j62 = j58 ^ (j59 >>> 47);
        long j63 = (-((j11 >>> 18) & 1)) & j9;
        long j64 = j61 ^ (j63 << 18);
        long j65 = j62 ^ (j63 >>> 46);
        long j66 = (-((j11 >>> 19) & 1)) & j9;
        long j67 = j64 ^ (j66 << 19);
        long j68 = j65 ^ (j66 >>> 45);
        long j69 = (-((j11 >>> 20) & 1)) & j9;
        long j71 = j67 ^ (j69 << 20);
        long j72 = j68 ^ (j69 >>> 44);
        long j73 = (-((j11 >>> 21) & 1)) & j9;
        long j74 = j71 ^ (j73 << 21);
        long j75 = j72 ^ (j73 >>> 43);
        long j76 = (-((j11 >>> 22) & 1)) & j9;
        long j77 = j74 ^ (j76 << 22);
        long j78 = j75 ^ (j76 >>> 42);
        long j79 = (-((j11 >>> 23) & 1)) & j9;
        long j81 = j77 ^ (j79 << 23);
        long j82 = j78 ^ (j79 >>> 41);
        long j83 = (-((j11 >>> 24) & 1)) & j9;
        long j84 = j81 ^ (j83 << 24);
        long j85 = j82 ^ (j83 >>> 40);
        long j86 = (-((j11 >>> 25) & 1)) & j9;
        long j87 = j84 ^ (j86 << 25);
        long j88 = j85 ^ (j86 >>> 39);
        long j89 = (-((j11 >>> 26) & 1)) & j9;
        long j90 = j87 ^ (j89 << 26);
        long j91 = j88 ^ (j89 >>> 38);
        long j92 = (-((j11 >>> 27) & 1)) & j9;
        long j93 = j90 ^ (j92 << 27);
        long j94 = j91 ^ (j92 >>> 37);
        long j95 = (-((j11 >>> 28) & 1)) & j9;
        long j96 = j93 ^ (j95 << 28);
        long j97 = j94 ^ (j95 >>> 36);
        long j98 = (-((j11 >>> 29) & 1)) & j9;
        long j99 = j96 ^ (j98 << 29);
        long j100 = j97 ^ (j98 >>> 35);
        long j101 = (-((j11 >>> 30) & 1)) & j9;
        long j102 = j99 ^ (j101 << 30);
        long j103 = j100 ^ (j101 >>> 34);
        long j104 = (-((j11 >>> 31) & 1)) & j9;
        long j105 = j102 ^ (j104 << 31);
        long j106 = j103 ^ (j104 >>> 33);
        long j107 = (-((j11 >>> 32) & 1)) & j9;
        long j108 = j105 ^ (j107 << 32);
        long j109 = j106 ^ (j107 >>> 32);
        long j110 = (-((j11 >>> 33) & 1)) & j9;
        long j111 = j108 ^ (j110 << 33);
        long j112 = j109 ^ (j110 >>> 31);
        long j113 = (-((j11 >>> 34) & 1)) & j9;
        long j114 = j111 ^ (j113 << 34);
        long j115 = j112 ^ (j113 >>> 30);
        long j116 = (-((j11 >>> 35) & 1)) & j9;
        long j117 = j114 ^ (j116 << 35);
        long j118 = j115 ^ (j116 >>> 29);
        long j119 = (-((j11 >>> 36) & 1)) & j9;
        long j120 = j117 ^ (j119 << 36);
        long j121 = j118 ^ (j119 >>> 28);
        long j122 = (-((j11 >>> 37) & 1)) & j9;
        long j123 = j120 ^ (j122 << 37);
        long j124 = j121 ^ (j122 >>> 27);
        long j125 = (-((j11 >>> 38) & 1)) & j9;
        long j126 = j123 ^ (j125 << 38);
        long j127 = j124 ^ (j125 >>> 26);
        long j128 = (-((j11 >>> 39) & 1)) & j9;
        long j129 = j126 ^ (j128 << 39);
        long j130 = j127 ^ (j128 >>> 25);
        long j131 = (-((j11 >>> 40) & 1)) & j9;
        long j132 = j129 ^ (j131 << 40);
        long j133 = j130 ^ (j131 >>> 24);
        long j134 = (-((j11 >>> 41) & 1)) & j9;
        long j135 = j132 ^ (j134 << 41);
        long j136 = j133 ^ (j134 >>> 23);
        long j137 = (-((j11 >>> 42) & 1)) & j9;
        long j138 = j135 ^ (j137 << 42);
        long j139 = j136 ^ (j137 >>> 22);
        long j140 = (-((j11 >>> 43) & 1)) & j9;
        long j141 = j138 ^ (j140 << 43);
        long j142 = j139 ^ (j140 >>> 21);
        long j143 = (-((j11 >>> 44) & 1)) & j9;
        long j144 = j141 ^ (j143 << 44);
        long j145 = j142 ^ (j143 >>> 20);
        long j146 = (-((j11 >>> 45) & 1)) & j9;
        long j147 = j144 ^ (j146 << 45);
        long j148 = j145 ^ (j146 >>> 19);
        long j149 = (-((j11 >>> 46) & 1)) & j9;
        long j150 = j147 ^ (j149 << 46);
        long j151 = j148 ^ (j149 >>> 18);
        long j152 = (-((j11 >>> 47) & 1)) & j9;
        long j153 = j150 ^ (j152 << 47);
        long j154 = j151 ^ (j152 >>> 17);
        long j155 = (-((j11 >>> 48) & 1)) & j9;
        long j156 = j153 ^ (j155 << 48);
        long j157 = j154 ^ (j155 >>> 16);
        long j158 = (-((j11 >>> 49) & 1)) & j9;
        long j159 = j156 ^ (j158 << 49);
        long j160 = j157 ^ (j158 >>> 15);
        long j161 = (-((j11 >>> 50) & 1)) & j9;
        long j162 = j159 ^ (j161 << 50);
        long j163 = j160 ^ (j161 >>> 14);
        long j164 = (-((j11 >>> 51) & 1)) & j9;
        long j165 = j162 ^ (j164 << 51);
        long j166 = j163 ^ (j164 >>> 13);
        long j167 = (-((j11 >>> 52) & 1)) & j9;
        long j168 = j165 ^ (j167 << 52);
        long j169 = j166 ^ (j167 >>> 12);
        long j170 = (-((j11 >>> 53) & 1)) & j9;
        long j171 = j168 ^ (j170 << 53);
        long j172 = j169 ^ (j170 >>> 11);
        long j173 = (-((j11 >>> 54) & 1)) & j9;
        long j174 = j171 ^ (j173 << 54);
        long j175 = j172 ^ (j173 >>> 10);
        long j176 = (-((j11 >>> 55) & 1)) & j9;
        long j177 = j174 ^ (j176 << 55);
        long j178 = j175 ^ (j176 >>> 9);
        long j179 = (-((j11 >>> 56) & 1)) & j9;
        long j180 = j177 ^ (j179 << 56);
        long j181 = j178 ^ (j179 >>> 8);
        long j182 = (-((j11 >>> 57) & 1)) & j9;
        long j183 = j180 ^ (j182 << 57);
        long j184 = j181 ^ (j182 >>> 7);
        long j185 = (-((j11 >>> 58) & 1)) & j9;
        long j186 = j183 ^ (j185 << 58);
        long j187 = j184 ^ (j185 >>> 6);
        long j188 = (-((j11 >>> 59) & 1)) & j9;
        long j189 = j186 ^ (j188 << 59);
        long j190 = j187 ^ (j188 >>> 5);
        long j191 = (-((j11 >>> 60) & 1)) & j9;
        long j192 = j189 ^ (j191 << 60);
        long j193 = j190 ^ (j191 >>> 4);
        long j194 = (-((j11 >>> 61) & 1)) & j9;
        long j195 = j192 ^ (j194 << 61);
        long j196 = j193 ^ (j194 >>> 3);
        long j197 = (-((j11 >>> 62) & 1)) & j9;
        jArr[i11] = (j195 ^ (j197 << 62)) ^ jArr[i11];
        int i12 = i11 + 1;
        jArr[i12] = (j196 ^ (j197 >>> 2)) ^ jArr[i12];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void SQR128_NO_SIMD_GF2X(long[] jArr, int i11, long[] jArr2, int i12) {
        SQR64_NO_SIMD_GF2X(jArr, i11 + 2, jArr2[i12 + 1]);
        SQR64_NO_SIMD_GF2X(jArr, i11, jArr2[i12]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void SQR256_NO_SIMD_GF2X(long[] jArr, int i11, long[] jArr2, int i12) {
        SQR128_NO_SIMD_GF2X(jArr, i11 + 4, jArr2, i12 + 2);
        SQR128_NO_SIMD_GF2X(jArr, i11, jArr2, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long SQR32_NO_SIMD_GF2X(long j9) {
        long j11 = (j9 ^ (j9 << 16)) & 281470681808895L;
        long j12 = (j11 ^ (j11 << 8)) & 71777214294589695L;
        long j13 = (j12 ^ (j12 << 4)) & 1085102592571150095L;
        long j14 = (j13 ^ (j13 << 2)) & 3689348814741910323L;
        return (j14 ^ (j14 << 1)) & 6148914691236517205L;
    }

    private static long SQR64LOW_NO_SIMD_GF2X(long j9) {
        long j11 = ((j9 << 16) ^ (4294967295L & j9)) & 281470681808895L;
        long j12 = (j11 ^ (j11 << 8)) & 71777214294589695L;
        long j13 = (j12 ^ (j12 << 4)) & 1085102592571150095L;
        long j14 = (j13 ^ (j13 << 2)) & 3689348814741910323L;
        return (j14 ^ (j14 << 1)) & 6148914691236517205L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void SQR64_NO_SIMD_GF2X(long[] jArr, int i11, long j9) {
        jArr[i11 + 1] = SQR32_NO_SIMD_GF2X(j9 >>> 32);
        jArr[i11] = SQR64LOW_NO_SIMD_GF2X(j9);
    }

    private static void mul128_no_simd_gf2x(long[] jArr, int i11, long[] jArr2, int i12, long[] jArr3, int i13) {
        MUL64_NO_SIMD_GF2X(jArr, i11, jArr2[i12], jArr3[i13]);
        int i14 = i11 + 2;
        int i15 = i12 + 1;
        int i16 = i13 + 1;
        MUL64_NO_SIMD_GF2X(jArr, i14, jArr2[i15], jArr3[i16]);
        long j9 = jArr[i14];
        int i17 = i11 + 1;
        long j11 = j9 ^ jArr[i17];
        jArr[i14] = j11;
        jArr[i17] = j11 ^ jArr[i11];
        jArr[i14] = jArr[i14] ^ jArr[i11 + 3];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i17, jArr2[i12] ^ jArr2[i15], jArr3[i13] ^ jArr3[i16]);
    }

    private static void mul128_no_simd_gf2x_xor(long[] jArr, int i11, long j9, long j11, long j12, long j13, long[] jArr2) {
        MUL64_NO_SIMD_GF2X(jArr2, 0, j9, j12);
        MUL64_NO_SIMD_GF2X(jArr2, 2, j11, j13);
        jArr[i11] = jArr[i11] ^ jArr2[0];
        long j14 = jArr2[2] ^ jArr2[1];
        jArr2[2] = j14;
        int i12 = i11 + 1;
        jArr[i12] = (jArr2[0] ^ j14) ^ jArr[i12];
        int i13 = i11 + 2;
        jArr[i13] = jArr[i13] ^ (jArr2[2] ^ jArr2[3]);
        int i14 = i11 + 3;
        jArr[i14] = jArr[i14] ^ jArr2[3];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i12, j9 ^ j11, j12 ^ j13);
    }

    public static void mul192_no_simd_gf2x(long[] jArr, int i11, long[] jArr2, int i12, long[] jArr3, int i13) {
        MUL64_NO_SIMD_GF2X(jArr, i11, jArr2[i12], jArr3[i13]);
        int i14 = i11 + 4;
        int i15 = i12 + 2;
        int i16 = i13 + 2;
        MUL64_NO_SIMD_GF2X(jArr, i14, jArr2[i15], jArr3[i16]);
        int i17 = i11 + 2;
        int i18 = i12 + 1;
        int i19 = i13 + 1;
        MUL64_NO_SIMD_GF2X(jArr, i17, jArr2[i18], jArr3[i19]);
        int i21 = i11 + 1;
        jArr[i21] = jArr[i21] ^ jArr[i17];
        int i22 = i11 + 3;
        long j9 = jArr[i22] ^ jArr[i14];
        jArr[i22] = j9;
        jArr[i14] = j9 ^ jArr[i11 + 5];
        jArr[i17] = (jArr[i22] ^ jArr[i21]) ^ jArr[i11];
        jArr[i22] = jArr[i21] ^ jArr[i14];
        jArr[i21] = jArr[i21] ^ jArr[i11];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i21, jArr2[i12] ^ jArr2[i18], jArr3[i13] ^ jArr3[i19]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i22, jArr2[i18] ^ jArr2[i15], jArr3[i19] ^ jArr3[i16]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i17, jArr2[i12] ^ jArr2[i15], jArr3[i13] ^ jArr3[i16]);
    }

    public static void mul192_no_simd_gf2x_xor(long[] jArr, int i11, long[] jArr2, int i12, long[] jArr3, int i13, long[] jArr4) {
        MUL64_NO_SIMD_GF2X(jArr4, 0, jArr2[i12], jArr3[i13]);
        int i14 = i12 + 2;
        int i15 = i13 + 2;
        MUL64_NO_SIMD_GF2X(jArr4, 4, jArr2[i14], jArr3[i15]);
        int i16 = i12 + 1;
        int i17 = i13 + 1;
        MUL64_NO_SIMD_GF2X(jArr4, 2, jArr2[i16], jArr3[i17]);
        jArr[i11] = jArr[i11] ^ jArr4[0];
        long j9 = jArr4[1] ^ jArr4[2];
        jArr4[1] = j9;
        long j11 = jArr4[3] ^ jArr4[4];
        jArr4[3] = j11;
        jArr4[4] = j11 ^ jArr4[5];
        long j12 = j9 ^ jArr4[0];
        jArr4[0] = j12;
        int i18 = i11 + 1;
        jArr[i18] = j12 ^ jArr[i18];
        int i19 = i11 + 2;
        jArr[i19] = (jArr4[0] ^ jArr4[3]) ^ jArr[i19];
        int i21 = i11 + 3;
        jArr[i21] = jArr[i21] ^ (jArr4[1] ^ jArr4[4]);
        int i22 = i11 + 4;
        jArr[i22] = jArr[i22] ^ jArr4[4];
        int i23 = i11 + 5;
        jArr[i23] = jArr[i23] ^ jArr4[5];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i18, jArr2[i12] ^ jArr2[i16], jArr3[i13] ^ jArr3[i17]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i21, jArr2[i16] ^ jArr2[i14], jArr3[i17] ^ jArr3[i15]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i19, jArr2[i12] ^ jArr2[i14], jArr3[i15] ^ jArr3[i13]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul288_no_simd_gf2x(long[] jArr, int i11, long[] jArr2, int i12, long[] jArr3, int i13, long[] jArr4) {
        int i14 = i12 + 1;
        int i15 = i13 + 1;
        mul128_no_simd_gf2x(jArr, i11, jArr2[i12], jArr2[i14], jArr3[i13], jArr3[i15]);
        int i16 = i11 + 4;
        int i17 = i12 + 2;
        int i18 = i13 + 2;
        MUL64_NO_SIMD_GF2X(jArr, i16, jArr2[i17], jArr3[i18]);
        int i19 = i11 + 7;
        int i21 = i12 + 3;
        int i22 = i13 + 3;
        MUL64_NO_SIMD_GF2X(jArr, i19, jArr2[i21], jArr3[i22]);
        long j9 = jArr[i19];
        int i23 = i11 + 5;
        jArr[i19] = j9 ^ jArr[i23];
        int i24 = i11 + 8;
        int i25 = i12 + 4;
        int i26 = i13 + 4;
        jArr[i24] = MUL32_NO_SIMD_GF2X(jArr2[i25], jArr3[i26]) ^ jArr[i24];
        jArr[i23] = jArr[i19] ^ jArr[i16];
        long j11 = jArr[i19] ^ jArr[i24];
        jArr[i19] = j11;
        int i27 = i11 + 6;
        jArr[i27] = j11 ^ jArr[i16];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i23, jArr2[i21] ^ jArr2[i17], jArr3[i18] ^ jArr3[i22]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i19, jArr2[i25] ^ jArr2[i21], jArr3[i22] ^ jArr3[i26]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i27, jArr2[i25] ^ jArr2[i17], jArr3[i18] ^ jArr3[i26]);
        int i28 = i11 + 2;
        jArr[i16] = jArr[i16] ^ jArr[i28];
        long j12 = jArr[i23];
        int i29 = i11 + 3;
        jArr[i23] = j12 ^ jArr[i29];
        long j13 = jArr2[i12] ^ jArr2[i17];
        long j14 = jArr2[i14] ^ jArr2[i21];
        long j15 = jArr3[i13] ^ jArr3[i18];
        long j16 = jArr3[i15] ^ jArr3[i22];
        MUL64_NO_SIMD_GF2X(jArr4, 0, j13, j15);
        MUL64_NO_SIMD_GF2X(jArr4, 2, j14, j16);
        jArr4[2] = jArr4[2] ^ jArr4[1];
        jArr4[3] = MUL32_NO_SIMD_GF2X(jArr2[i25], jArr3[i26]) ^ jArr4[3];
        jArr[i28] = (jArr[i16] ^ jArr[i11]) ^ jArr4[0];
        jArr[i29] = ((jArr[i23] ^ jArr[i11 + 1]) ^ jArr4[2]) ^ jArr4[0];
        long j17 = jArr4[2] ^ jArr4[3];
        jArr4[2] = j17;
        jArr[i16] = ((jArr[i27] ^ j17) ^ jArr4[0]) ^ jArr[i16];
        jArr[i23] = jArr[i23] ^ (jArr[i19] ^ jArr4[2]);
        jArr[i27] = (jArr[i24] ^ jArr4[3]) ^ jArr[i27];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i29, j13 ^ j14, j15 ^ j16);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i23, j14 ^ jArr2[i25], j16 ^ jArr3[i26]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i16, j13 ^ jArr2[i25], j15 ^ jArr3[i26]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul288_no_simd_gf2x_xor(long[] jArr, int i11, long[] jArr2, int i12, long[] jArr3, int i13, long[] jArr4) {
        int i14 = i12 + 1;
        int i15 = i13 + 1;
        mul128_no_simd_gf2x(jArr4, 0, jArr2[i12], jArr2[i14], jArr3[i13], jArr3[i15]);
        int i16 = i12 + 2;
        int i17 = i13 + 2;
        MUL64_NO_SIMD_GF2X(jArr4, 4, jArr2[i16], jArr3[i17]);
        int i18 = i12 + 3;
        int i19 = i13 + 3;
        MUL64_NO_SIMD_GF2X(jArr4, 7, jArr2[i18], jArr3[i19]);
        jArr4[7] = jArr4[7] ^ jArr4[5];
        int i21 = i12 + 4;
        int i22 = i13 + 4;
        long jMUL32_NO_SIMD_GF2X = jArr4[8] ^ MUL32_NO_SIMD_GF2X(jArr2[i21], jArr3[i22]);
        jArr4[8] = jMUL32_NO_SIMD_GF2X;
        long j9 = jArr4[7];
        long j11 = jArr4[4];
        long j12 = j9 ^ j11;
        jArr4[5] = j12;
        long j13 = jMUL32_NO_SIMD_GF2X ^ j9;
        jArr4[7] = j13;
        jArr4[6] = j13 ^ j11;
        jArr4[4] = jArr4[2] ^ j11;
        jArr4[5] = j12 ^ jArr4[3];
        jArr[i11] = jArr[i11] ^ jArr4[0];
        int i23 = i11 + 1;
        jArr[i23] = jArr[i23] ^ jArr4[1];
        int i24 = i11 + 2;
        jArr[i24] = jArr[i24] ^ (jArr4[4] ^ jArr4[0]);
        MUL64_NO_SIMD_GF2X_XOR(jArr4, 5, jArr2[i18] ^ jArr2[i16], jArr3[i17] ^ jArr3[i19]);
        MUL64_NO_SIMD_GF2X_XOR(jArr4, 7, jArr2[i21] ^ jArr2[i18], jArr3[i19] ^ jArr3[i22]);
        MUL64_NO_SIMD_GF2X_XOR(jArr4, 6, jArr2[i21] ^ jArr2[i16], jArr3[i17] ^ jArr3[i22]);
        int i25 = i11 + 3;
        jArr[i25] = jArr[i25] ^ (jArr4[5] ^ jArr4[1]);
        int i26 = i11 + 4;
        jArr[i26] = jArr[i26] ^ (jArr4[4] ^ jArr4[6]);
        int i27 = i11 + 5;
        jArr[i27] = jArr[i27] ^ (jArr4[5] ^ jArr4[7]);
        int i28 = i11 + 6;
        jArr[i28] = jArr[i28] ^ (jArr4[6] ^ jArr4[8]);
        int i29 = i11 + 7;
        jArr[i29] = jArr[i29] ^ jArr4[7];
        int i31 = i11 + 8;
        jArr[i31] = jArr[i31] ^ jArr4[8];
        long j14 = jArr2[i12] ^ jArr2[i16];
        long j15 = jArr2[i14] ^ jArr2[i18];
        long j16 = jArr3[i13] ^ jArr3[i17];
        long j17 = jArr3[i15] ^ jArr3[i19];
        MUL64_NO_SIMD_GF2X(jArr4, 0, j14, j16);
        MUL64_NO_SIMD_GF2X(jArr4, 2, j15, j17);
        jArr4[2] = jArr4[2] ^ jArr4[1];
        jArr4[3] = MUL32_NO_SIMD_GF2X(jArr2[i21], jArr3[i22]) ^ jArr4[3];
        jArr[i24] = jArr[i24] ^ jArr4[0];
        jArr[i25] = jArr[i25] ^ (jArr4[2] ^ jArr4[0]);
        long j18 = jArr4[2] ^ jArr4[3];
        jArr4[2] = j18;
        jArr[i26] = (j18 ^ jArr4[0]) ^ jArr[i26];
        jArr[i27] = jArr[i27] ^ jArr4[2];
        jArr[i28] = jArr[i28] ^ jArr4[3];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i25, j14 ^ j15, j16 ^ j17);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i27, j15 ^ jArr2[i21], j17 ^ jArr3[i22]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i26, jArr2[i21] ^ j14, jArr3[i22] ^ j16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul384_no_simd_gf2x(long[] jArr, long[] jArr2, int i11, long[] jArr3, int i12, long[] jArr4) {
        mul192_no_simd_gf2x(jArr, 0, jArr2, i11, jArr3, i12);
        int i13 = i11 + 3;
        int i14 = i12 + 3;
        mul192_no_simd_gf2x(jArr, 6, jArr2, i13, jArr3, i14);
        long j9 = jArr2[i11] ^ jArr2[i13];
        long j11 = jArr2[i11 + 1] ^ jArr2[i11 + 4];
        long j12 = jArr2[i11 + 2] ^ jArr2[i11 + 5];
        long j13 = jArr3[i12] ^ jArr3[i14];
        long j14 = jArr3[i12 + 1] ^ jArr3[i12 + 4];
        long j15 = jArr3[i12 + 2] ^ jArr3[i12 + 5];
        jArr[6] = jArr[6] ^ jArr[3];
        jArr[7] = jArr[7] ^ jArr[4];
        jArr[8] = jArr[8] ^ jArr[5];
        MUL64_NO_SIMD_GF2X(jArr4, 0, j9, j13);
        MUL64_NO_SIMD_GF2X(jArr4, 4, j12, j15);
        MUL64_NO_SIMD_GF2X(jArr4, 2, j11, j14);
        long j16 = jArr[6];
        long j17 = j16 ^ jArr[0];
        long j18 = jArr4[0];
        jArr[3] = j17 ^ j18;
        long j19 = jArr4[1] ^ jArr4[2];
        jArr4[1] = j19;
        long j21 = j18 ^ j19;
        jArr4[0] = j21;
        long j22 = jArr4[3] ^ jArr4[4];
        jArr4[3] = j22;
        long j23 = j22 ^ jArr4[5];
        jArr4[4] = j23;
        long j24 = jArr[8];
        jArr[5] = ((j24 ^ jArr[2]) ^ j22) ^ j21;
        jArr[6] = j16 ^ ((jArr[9] ^ j19) ^ j23);
        long j25 = jArr[7];
        jArr[4] = (jArr[1] ^ j25) ^ j21;
        jArr[7] = j25 ^ (jArr4[4] ^ jArr[10]);
        jArr[8] = j24 ^ (jArr[11] ^ jArr4[5]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, 4, j9 ^ j11, j13 ^ j14);
        MUL64_NO_SIMD_GF2X_XOR(jArr, 6, j11 ^ j12, j14 ^ j15);
        MUL64_NO_SIMD_GF2X_XOR(jArr, 5, j9 ^ j12, j13 ^ j15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul384_no_simd_gf2x_xor(long[] jArr, long[] jArr2, int i11, long[] jArr3, int i12, long[] jArr4) {
        mul192_no_simd_gf2x(jArr4, 0, jArr2, i11, jArr3, i12);
        int i13 = i11 + 3;
        int i14 = i12 + 3;
        mul192_no_simd_gf2x(jArr4, 6, jArr2, i13, jArr3, i14);
        long j9 = jArr2[i13] ^ jArr2[i11];
        long j11 = jArr2[i11 + 1] ^ jArr2[i11 + 4];
        long j12 = jArr2[i11 + 2] ^ jArr2[i11 + 5];
        long j13 = jArr3[i14] ^ jArr3[i12];
        long j14 = jArr3[i12 + 4] ^ jArr3[i12 + 1];
        long j15 = jArr3[i12 + 5] ^ jArr3[i12 + 2];
        long j16 = jArr4[6] ^ jArr4[3];
        jArr4[6] = j16;
        long j17 = jArr4[7] ^ jArr4[4];
        jArr4[7] = j17;
        long j18 = jArr4[8] ^ jArr4[5];
        jArr4[8] = j18;
        jArr[0] = jArr[0] ^ jArr4[0];
        jArr[1] = jArr[1] ^ jArr4[1];
        jArr[2] = jArr[2] ^ jArr4[2];
        jArr[3] = jArr[3] ^ (j16 ^ jArr4[0]);
        jArr[5] = jArr[5] ^ (j18 ^ jArr4[2]);
        long j19 = jArr[6];
        long j21 = jArr4[9];
        jArr[6] = j19 ^ (j16 ^ j21);
        jArr[4] = jArr[4] ^ (j17 ^ jArr4[1]);
        long j22 = jArr[7];
        long j23 = jArr4[10];
        jArr[7] = j22 ^ (j17 ^ j23);
        long j24 = jArr[8];
        long j25 = jArr4[11];
        jArr[8] = j24 ^ (j18 ^ j25);
        jArr[9] = jArr[9] ^ j21;
        jArr[10] = jArr[10] ^ j23;
        jArr[11] = jArr[11] ^ j25;
        MUL64_NO_SIMD_GF2X(jArr4, 0, j9, j13);
        MUL64_NO_SIMD_GF2X(jArr4, 4, j12, j15);
        MUL64_NO_SIMD_GF2X(jArr4, 2, j11, j14);
        long j26 = jArr[3];
        long j27 = jArr4[0];
        jArr[3] = j26 ^ j27;
        long j28 = jArr4[1] ^ jArr4[2];
        jArr4[1] = j28;
        long j29 = j27 ^ j28;
        jArr4[0] = j29;
        long j31 = jArr4[3] ^ jArr4[4];
        jArr4[3] = j31;
        long j32 = j31 ^ jArr4[5];
        jArr4[4] = j32;
        jArr[5] = jArr[5] ^ (j31 ^ j29);
        jArr[6] = (j28 ^ j32) ^ jArr[6];
        jArr[4] = jArr[4] ^ j29;
        jArr[7] = jArr[7] ^ jArr4[4];
        jArr[8] = jArr[8] ^ jArr4[5];
        MUL64_NO_SIMD_GF2X_XOR(jArr, 4, j9 ^ j11, j13 ^ j14);
        MUL64_NO_SIMD_GF2X_XOR(jArr, 6, j11 ^ j12, j14 ^ j15);
        MUL64_NO_SIMD_GF2X_XOR(jArr, 5, j9 ^ j12, j13 ^ j15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul416_no_simd_gf2x(long[] jArr, long[] jArr2, int i11, long[] jArr3, int i12, long[] jArr4) {
        mul192_no_simd_gf2x(jArr, 0, jArr2, i11, jArr3, i12);
        int i13 = i11 + 3;
        int i14 = i11 + 4;
        int i15 = i12 + 3;
        int i16 = i12 + 4;
        mul128_no_simd_gf2x(jArr, 6, jArr2[i13], jArr2[i14], jArr3[i15], jArr3[i16]);
        int i17 = i11 + 5;
        int i18 = i12 + 5;
        MUL64_NO_SIMD_GF2X(jArr, 10, jArr2[i17], jArr3[i18]);
        int i19 = i11 + 6;
        int i21 = i12 + 6;
        long jMUL32_NO_SIMD_GF2X = MUL32_NO_SIMD_GF2X(jArr2[i19], jArr3[i21]) ^ jArr[11];
        jArr[12] = jMUL32_NO_SIMD_GF2X;
        jArr[11] = jMUL32_NO_SIMD_GF2X ^ jArr[10];
        MUL64_NO_SIMD_GF2X_XOR(jArr, 11, jArr2[i19] ^ jArr2[i17], jArr3[i21] ^ jArr3[i18]);
        long j9 = jArr[8] ^ jArr[10];
        jArr[8] = j9;
        long j11 = jArr[11] ^ jArr[9];
        jArr[11] = j11;
        jArr[10] = jArr[12] ^ j9;
        jArr[8] = j9 ^ jArr[6];
        jArr[9] = jArr[7] ^ j11;
        mul128_no_simd_gf2x_xor(jArr, 8, jArr2[i17] ^ jArr2[i13], jArr2[i19] ^ jArr2[i14], jArr3[i18] ^ jArr3[i15], jArr3[i21] ^ jArr3[i16], jArr4);
        long j12 = jArr2[i13] ^ jArr2[i11];
        long j13 = jArr2[i11 + 1] ^ jArr2[i14];
        long j14 = jArr2[i11 + 2] ^ jArr2[i17];
        long j15 = jArr2[i19];
        long j16 = jArr3[i12] ^ jArr3[i15];
        long j17 = jArr3[i12 + 1] ^ jArr3[i16];
        long j18 = jArr3[i12 + 2] ^ jArr3[i18];
        long j19 = jArr3[i21];
        jArr[6] = jArr[6] ^ jArr[3];
        jArr[7] = jArr[7] ^ jArr[4];
        jArr[8] = jArr[8] ^ jArr[5];
        mul128_no_simd_gf2x(jArr4, 0, j12, j13, j16, j17);
        MUL64_NO_SIMD_GF2X(jArr4, 4, j14, j18);
        long jMUL32_NO_SIMD_GF2X2 = MUL32_NO_SIMD_GF2X(j15, j19) ^ jArr4[5];
        jArr4[6] = jMUL32_NO_SIMD_GF2X2;
        jArr4[5] = jMUL32_NO_SIMD_GF2X2 ^ jArr4[4];
        MUL64_NO_SIMD_GF2X_XOR(jArr4, 5, j14 ^ j15, j18 ^ j19);
        long j21 = jArr[6];
        long j22 = jArr[0] ^ j21;
        long j23 = jArr4[0];
        jArr[3] = j22 ^ j23;
        long j24 = jArr[7];
        long j25 = j24 ^ jArr[1];
        long j26 = jArr4[1];
        jArr[4] = j25 ^ j26;
        long j27 = jArr4[2] ^ jArr4[4];
        jArr4[2] = j27;
        long j28 = jArr4[3] ^ jArr4[5];
        jArr4[3] = j28;
        long j29 = jArr[8];
        jArr[5] = ((j29 ^ jArr[2]) ^ j27) ^ j23;
        long j31 = jArr[9];
        jArr[6] = j21 ^ ((j31 ^ j28) ^ j26);
        long j32 = jArr[10] ^ j27;
        long j33 = jArr4[6];
        jArr[7] = (j32 ^ j33) ^ j24;
        jArr[8] = j29 ^ (jArr[11] ^ j28);
        jArr[9] = j31 ^ (jArr[12] ^ j33);
        mul128_no_simd_gf2x_xor(jArr, 5, j12 ^ j14, j13 ^ j15, j16 ^ j18, j17 ^ j19, jArr4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul416_no_simd_gf2x_xor(long[] jArr, long[] jArr2, int i11, long[] jArr3, int i12, long[] jArr4, long[] jArr5) {
        mul192_no_simd_gf2x(jArr4, 0, jArr2, i11, jArr3, i12);
        int i13 = i11 + 3;
        int i14 = i11 + 4;
        int i15 = i12 + 3;
        int i16 = i12 + 4;
        mul128_no_simd_gf2x(jArr4, 6, jArr2[i13], jArr2[i14], jArr3[i15], jArr3[i16]);
        int i17 = i11 + 5;
        int i18 = i12 + 5;
        MUL64_NO_SIMD_GF2X(jArr4, 10, jArr2[i17], jArr3[i18]);
        int i19 = i11 + 6;
        int i21 = i12 + 6;
        long jMUL32_NO_SIMD_GF2X = MUL32_NO_SIMD_GF2X(jArr2[i19], jArr3[i21]) ^ jArr4[11];
        jArr4[12] = jMUL32_NO_SIMD_GF2X;
        jArr4[11] = jMUL32_NO_SIMD_GF2X ^ jArr4[10];
        MUL64_NO_SIMD_GF2X_XOR(jArr4, 11, jArr2[i19] ^ jArr2[i17], jArr3[i21] ^ jArr3[i18]);
        long j9 = jArr4[8] ^ jArr4[10];
        jArr4[8] = j9;
        long j11 = jArr4[11] ^ jArr4[9];
        jArr4[11] = j11;
        jArr4[10] = jArr4[12] ^ j9;
        long j12 = jArr4[6];
        long j13 = j9 ^ j12;
        jArr4[8] = j13;
        long j14 = jArr4[7];
        jArr4[9] = j11 ^ j14;
        jArr4[6] = jArr4[3] ^ j12;
        jArr4[7] = jArr4[4] ^ j14;
        jArr4[8] = j13 ^ jArr4[5];
        mul128_no_simd_gf2x_xor(jArr4, 8, jArr2[i17] ^ jArr2[i13], jArr2[i19] ^ jArr2[i14], jArr3[i18] ^ jArr3[i15], jArr3[i21] ^ jArr3[i16], jArr5);
        jArr[0] = jArr[0] ^ jArr4[0];
        jArr[1] = jArr[1] ^ jArr4[1];
        jArr[2] = jArr[2] ^ jArr4[2];
        long j15 = jArr[3];
        long j16 = jArr4[6];
        jArr[3] = j15 ^ (jArr4[0] ^ j16);
        long j17 = jArr[4];
        long j18 = jArr4[7];
        jArr[4] = j17 ^ (jArr4[1] ^ j18);
        long j19 = jArr[5];
        long j21 = jArr4[8];
        jArr[5] = j19 ^ (jArr4[2] ^ j21);
        long j22 = jArr[6];
        long j23 = jArr4[9];
        jArr[6] = j22 ^ (j16 ^ j23);
        long j24 = jArr[7];
        long j25 = jArr4[10];
        jArr[7] = j24 ^ (j18 ^ j25);
        long j26 = jArr[8];
        long j27 = jArr4[11];
        jArr[8] = j26 ^ (j21 ^ j27);
        long j28 = jArr[9];
        long j29 = jArr4[12];
        jArr[9] = j28 ^ (j23 ^ j29);
        jArr[10] = jArr[10] ^ j25;
        jArr[11] = jArr[11] ^ j27;
        jArr[12] = jArr[12] ^ j29;
        long j31 = jArr2[i13] ^ jArr2[i11];
        long j32 = jArr2[i14] ^ jArr2[i11 + 1];
        long j33 = jArr2[i11 + 2] ^ jArr2[i17];
        long j34 = jArr2[i19];
        long j35 = jArr3[i12] ^ jArr3[i15];
        long j36 = jArr3[i12 + 1] ^ jArr3[i16];
        long j37 = jArr3[i12 + 2] ^ jArr3[i18];
        long j38 = jArr3[i21];
        mul128_no_simd_gf2x(jArr4, 0, j31, j32, j35, j36);
        MUL64_NO_SIMD_GF2X(jArr4, 4, j33, j37);
        long jMUL32_NO_SIMD_GF2X2 = MUL32_NO_SIMD_GF2X(j34, j38) ^ jArr4[5];
        jArr4[6] = jMUL32_NO_SIMD_GF2X2;
        jArr4[5] = jMUL32_NO_SIMD_GF2X2 ^ jArr4[4];
        MUL64_NO_SIMD_GF2X_XOR(jArr4, 5, j33 ^ j34, j37 ^ j38);
        long j39 = jArr[3];
        long j41 = jArr4[0];
        jArr[3] = j39 ^ j41;
        long j42 = jArr[4];
        long j43 = jArr4[1];
        jArr[4] = j42 ^ j43;
        long j44 = jArr4[2] ^ jArr4[4];
        jArr4[2] = j44;
        long j45 = jArr4[3] ^ jArr4[5];
        jArr4[3] = j45;
        jArr[5] = jArr[5] ^ (j41 ^ j44);
        jArr[6] = jArr[6] ^ (j45 ^ j43);
        long j46 = jArr[7];
        long j47 = jArr4[6];
        jArr[7] = (j44 ^ j47) ^ j46;
        jArr[8] = jArr[8] ^ j45;
        jArr[9] = jArr[9] ^ j47;
        mul128_no_simd_gf2x_xor(jArr, 5, j31 ^ j33, j32 ^ j34, j35 ^ j37, j36 ^ j38, jArr4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul544_no_simd_gf2x(long[] jArr, long[] jArr2, int i11, long[] jArr3, int i12, long[] jArr4, long[] jArr5, long[] jArr6) {
        int i13 = i11 + 1;
        int i14 = i12 + 1;
        mul128_no_simd_gf2x(jArr, 0, jArr2[i11], jArr2[i13], jArr3[i12], jArr3[i14]);
        int i15 = i11 + 2;
        int i16 = i11 + 3;
        int i17 = i12 + 2;
        int i18 = i12 + 3;
        mul128_no_simd_gf2x(jArr, 4, jArr2[i15], jArr2[i16], jArr3[i17], jArr3[i18]);
        long j9 = jArr[4] ^ jArr[2];
        jArr[4] = j9;
        long j11 = jArr[5] ^ jArr[3];
        jArr[5] = j11;
        jArr[2] = jArr[0] ^ j9;
        jArr[3] = jArr[1] ^ j11;
        jArr[4] = j9 ^ jArr[6];
        jArr[5] = j11 ^ jArr[7];
        mul128_no_simd_gf2x_xor(jArr, 2, jArr2[i15] ^ jArr2[i11], jArr2[i13] ^ jArr2[i16], jArr3[i12] ^ jArr3[i17], jArr3[i14] ^ jArr3[i18], jArr6);
        int i19 = i11 + 4;
        int i21 = i12 + 4;
        mul288_no_simd_gf2x(jArr, 8, jArr2, i19, jArr3, i21, jArr6);
        long j12 = jArr[8] ^ jArr[4];
        jArr[8] = j12;
        long j13 = jArr[9] ^ jArr[5];
        jArr[9] = j13;
        long j14 = jArr[10] ^ jArr[6];
        jArr[10] = j14;
        long j15 = jArr[11] ^ jArr[7];
        jArr[11] = j15;
        jArr[4] = j12 ^ jArr[0];
        jArr[5] = j13 ^ jArr[1];
        jArr[6] = j14 ^ jArr[2];
        jArr[7] = j15 ^ jArr[3];
        long j16 = jArr[12];
        jArr[8] = j12 ^ j16;
        jArr[9] = j13 ^ jArr[13];
        jArr[10] = j14 ^ jArr[14];
        jArr[11] = j15 ^ jArr[15];
        jArr[12] = j16 ^ jArr[16];
        jArr4[0] = jArr2[i11] ^ jArr2[i19];
        jArr4[1] = jArr2[i13] ^ jArr2[i11 + 5];
        jArr4[2] = jArr2[i15] ^ jArr2[i11 + 6];
        jArr4[3] = jArr2[i16] ^ jArr2[i11 + 7];
        jArr4[4] = jArr2[i11 + 8];
        jArr5[0] = jArr3[i12] ^ jArr3[i21];
        jArr5[1] = jArr3[i14] ^ jArr3[i12 + 5];
        jArr5[2] = jArr3[i17] ^ jArr3[i12 + 6];
        jArr5[3] = jArr3[i18] ^ jArr3[i12 + 7];
        jArr5[4] = jArr3[i12 + 8];
        mul288_no_simd_gf2x_xor(jArr, 4, jArr4, 0, jArr5, 0, jArr6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul544_no_simd_gf2x_xor(long[] jArr, long[] jArr2, int i11, long[] jArr3, int i12, long[] jArr4, long[] jArr5, long[] jArr6, long[] jArr7) {
        int i13 = i11 + 1;
        int i14 = i12 + 1;
        mul128_no_simd_gf2x(jArr6, 0, jArr2[i11], jArr2[i13], jArr3[i12], jArr3[i14]);
        int i15 = i11 + 2;
        int i16 = i11 + 3;
        int i17 = i12 + 2;
        int i18 = i12 + 3;
        mul128_no_simd_gf2x(jArr6, 4, jArr2[i15], jArr2[i16], jArr3[i17], jArr3[i18]);
        long j9 = jArr6[4] ^ jArr6[2];
        jArr6[4] = j9;
        long j11 = jArr6[5] ^ jArr6[3];
        jArr6[5] = j11;
        jArr6[2] = jArr6[0] ^ j9;
        jArr6[3] = jArr6[1] ^ j11;
        jArr6[4] = j9 ^ jArr6[6];
        jArr6[5] = j11 ^ jArr6[7];
        mul128_no_simd_gf2x_xor(jArr6, 2, jArr2[i15] ^ jArr2[i11], jArr2[i13] ^ jArr2[i16], jArr3[i12] ^ jArr3[i17], jArr3[i14] ^ jArr3[i18], jArr7);
        int i19 = i11 + 4;
        int i21 = i12 + 4;
        mul288_no_simd_gf2x(jArr6, 8, jArr2, i19, jArr3, i21, jArr7);
        long j12 = jArr6[8] ^ jArr6[4];
        jArr6[8] = j12;
        long j13 = jArr6[9] ^ jArr6[5];
        jArr6[9] = j13;
        long j14 = jArr6[10] ^ jArr6[6];
        jArr6[10] = j14;
        long j15 = jArr6[11] ^ jArr6[7];
        jArr6[11] = j15;
        jArr[0] = jArr[0] ^ jArr6[0];
        jArr[1] = jArr[1] ^ jArr6[1];
        jArr[2] = jArr[2] ^ jArr6[2];
        jArr[3] = jArr[3] ^ jArr6[3];
        jArr[4] = jArr[4] ^ (j12 ^ jArr6[0]);
        jArr[5] = jArr[5] ^ (j13 ^ jArr6[1]);
        jArr[6] = jArr[6] ^ (j14 ^ jArr6[2]);
        jArr[7] = jArr[7] ^ (j15 ^ jArr6[3]);
        long j16 = jArr[8];
        long j17 = jArr6[12];
        jArr[8] = j16 ^ (j12 ^ j17);
        long j18 = jArr[9];
        long j19 = jArr6[13];
        jArr[9] = j18 ^ (j13 ^ j19);
        long j21 = jArr[10];
        long j22 = jArr6[14];
        jArr[10] = j21 ^ (j14 ^ j22);
        long j23 = jArr[11];
        long j24 = jArr6[15];
        jArr[11] = j23 ^ (j15 ^ j24);
        long j25 = jArr[12];
        long j26 = jArr6[16];
        jArr[12] = j25 ^ (j17 ^ j26);
        jArr[13] = jArr[13] ^ j19;
        jArr[14] = jArr[14] ^ j22;
        jArr[15] = jArr[15] ^ j24;
        jArr[16] = jArr[16] ^ j26;
        jArr4[0] = jArr2[i11] ^ jArr2[i19];
        jArr4[1] = jArr2[i13] ^ jArr2[i11 + 5];
        jArr4[2] = jArr2[i15] ^ jArr2[i11 + 6];
        jArr4[3] = jArr2[i16] ^ jArr2[i11 + 7];
        jArr4[4] = jArr2[i11 + 8];
        jArr5[0] = jArr3[i12] ^ jArr3[i21];
        jArr5[1] = jArr3[i14] ^ jArr3[i12 + 5];
        jArr5[2] = jArr3[i17] ^ jArr3[i12 + 6];
        jArr5[3] = jArr3[i18] ^ jArr3[i12 + 7];
        jArr5[4] = jArr3[i12 + 8];
        mul288_no_simd_gf2x_xor(jArr, 4, jArr4, 0, jArr5, 0, jArr6);
    }

    public abstract void mul_gf2x(Pointer pointer, Pointer pointer2, Pointer pointer3);

    public abstract void mul_gf2x_xor(Pointer pointer, Pointer pointer2, Pointer pointer3);

    public abstract void sqr_gf2x(long[] jArr, long[] jArr2, int i11);

    private static void mul128_no_simd_gf2x(long[] jArr, int i11, long j9, long j11, long j12, long j13) {
        MUL64_NO_SIMD_GF2X(jArr, i11, j9, j12);
        int i12 = i11 + 2;
        MUL64_NO_SIMD_GF2X(jArr, i12, j11, j13);
        int i13 = i11 + 1;
        long j14 = jArr[i12] ^ jArr[i13];
        jArr[i12] = j14;
        jArr[i13] = j14 ^ jArr[i11];
        jArr[i12] = jArr[i12] ^ jArr[i11 + 3];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i13, j9 ^ j11, j12 ^ j13);
    }
}
