package org.bouncycastle.pqc.crypto.rainbow;

import java.lang.reflect.Array;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
class GF2Field {
    public static final int MASK = 255;
    static final byte[][] gfMulTable = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 256, 256);
    static final byte[] gfInvTable = new byte[256];

    static {
        long j9;
        int i11 = 1;
        long j11 = 72340172838076673L;
        while (true) {
            j9 = 506097522914230528L;
            if (i11 > 255) {
                break;
            }
            for (int i12 = 0; i12 < 256; i12 += 8) {
                Pack.longToLittleEndian(gf256Mul_64(j11, j9), gfMulTable[i11], i12);
                j9 += 578721382704613384L;
            }
            j11 += 72340172838076673L;
            i11++;
        }
        for (int i13 = 0; i13 < 256; i13 += 8) {
            Pack.longToLittleEndian(gf256Inv_64(j9), gfInvTable, i13);
            j9 += 578721382704613384L;
        }
    }

    public static short addElem(short s7, short s8) {
        return (short) (s7 ^ s8);
    }

    public static long addElem_64(long j9, long j11) {
        return j9 ^ j11;
    }

    private static short gf16Mul(short s7, short s8) {
        short s11 = (short) (s7 & 3);
        short s12 = (short) ((s7 >>> 2) & 255);
        short s13 = (short) (s8 & 3);
        short s14 = (short) ((s8 >>> 2) & 255);
        short sGf4Mul = gf4Mul(s11, s13);
        short sGf4Mul2 = gf4Mul(s12, s14);
        return (short) ((((((short) (gf4Mul((short) (s12 ^ s11), (short) (s14 ^ s13)) ^ sGf4Mul)) << 2) ^ sGf4Mul) ^ gf4Mul2(sGf4Mul2)) & 255);
    }

    private static short gf16Mul8(short s7) {
        short s8 = (short) (s7 & 3);
        short s11 = (short) ((s7 >>> 2) & 255);
        return (short) ((gf4Mul3(s11) | (gf4Mul2((short) (s8 ^ s11)) << 2)) & 255);
    }

    private static long gf16Mul8_64(long j9) {
        long j11 = 3689348814741910323L & j9;
        long j12 = j9 & (-3689348814741910324L);
        long j13 = (j11 << 2) ^ j12;
        long j14 = j12 >>> 2;
        return j14 ^ gf4Mul2_64(j13 ^ j14);
    }

    private static long gf16Mul_64(long j9, long j11) {
        long jGf4Mul_64 = gf4Mul_64(j9, j11);
        long j12 = 3689348814741910323L & jGf4Mul_64;
        return (gf4Mul_64(((j9 ^ (j9 << 2)) & (-3689348814741910324L)) ^ ((jGf4Mul_64 & (-3689348814741910324L)) >>> 2), ((j11 ^ (j11 << 2)) & (-3689348814741910324L)) ^ 2459565876494606882L) ^ (j12 << 2)) ^ j12;
    }

    private static short gf16Squ(short s7) {
        short s8 = (short) (s7 & 3);
        short sGf4Squ = gf4Squ((short) ((s7 >>> 2) & 255));
        return (short) ((((sGf4Squ << 2) ^ gf4Mul2(sGf4Squ)) ^ gf4Squ(s8)) & 255);
    }

    private static long gf16Squ_64(long j9) {
        long jGf4Squ_64 = gf4Squ_64(j9);
        return jGf4Squ_64 ^ (gf4Mul2_64((-3689348814741910324L) & jGf4Squ_64) >>> 2);
    }

    private static short gf256Inv(short s7) {
        short sGf256Squ = gf256Squ(s7);
        short sGf256Squ2 = gf256Squ(sGf256Squ);
        short sGf256Mul = gf256Mul(gf256Mul(sGf256Squ2, sGf256Squ), gf256Squ(sGf256Squ2));
        return gf256Mul(sGf256Squ, gf256Squ(gf256Mul(gf256Squ(gf256Squ(gf256Squ(sGf256Mul))), sGf256Mul)));
    }

    private static long gf256Inv_64(long j9) {
        long jGf256Squ_64 = gf256Squ_64(j9);
        long jGf256Squ_642 = gf256Squ_64(jGf256Squ_64);
        long jGf256Mul_64 = gf256Mul_64(gf256Mul_64(jGf256Squ_642, jGf256Squ_64), gf256Squ_64(jGf256Squ_642));
        return gf256Mul_64(jGf256Squ_64, gf256Squ_64(gf256Mul_64(gf256Squ_64(gf256Squ_64(gf256Squ_64(jGf256Mul_64))), jGf256Mul_64)));
    }

    private static short gf256Mul(short s7, short s8) {
        short s11 = (short) (s7 & 15);
        short s12 = (short) ((s7 >>> 4) & 255);
        short s13 = (short) (s8 & 15);
        short s14 = (short) ((s8 >>> 4) & 255);
        short sGf16Mul = gf16Mul(s11, s13);
        short sGf16Mul2 = gf16Mul(s12, s14);
        return (short) ((((((short) (gf16Mul((short) (s12 ^ s11), (short) (s14 ^ s13)) ^ sGf16Mul)) << 4) ^ sGf16Mul) ^ gf16Mul8(sGf16Mul2)) & 255);
    }

    private static long gf256Mul_64(long j9, long j11) {
        long jGf16Mul_64 = gf16Mul_64(j9, j11);
        long j12 = 1085102592571150095L & jGf16Mul_64;
        return (gf16Mul_64(((j9 ^ (j9 << 4)) & (-1085102592571150096L)) ^ ((jGf16Mul_64 & (-1085102592571150096L)) >>> 4), ((j11 ^ (j11 << 4)) & (-1085102592571150096L)) ^ 578721382704613384L) ^ (j12 << 4)) ^ j12;
    }

    private static short gf256Squ(short s7) {
        short s8 = (short) (s7 & 15);
        short sGf16Squ = gf16Squ((short) ((s7 >>> 4) & 255));
        return (short) ((((sGf16Squ << 4) ^ gf16Mul8(sGf16Squ)) ^ gf16Squ(s8)) & 255);
    }

    private static long gf256Squ_64(long j9) {
        long jGf16Squ_64 = gf16Squ_64(j9);
        return jGf16Squ_64 ^ (gf16Mul8_64((-1085102592571150096L) & jGf16Squ_64) >>> 4);
    }

    private static short gf4Mul(short s7, short s8) {
        return (short) (((gf4Mul2(s7) * (s8 >>> 1)) ^ ((s8 & 1) * s7)) & 255);
    }

    private static short gf4Mul2(short s7) {
        return (short) ((((s7 >>> 1) * 7) ^ (s7 << 1)) & 255);
    }

    private static long gf4Mul2_64(long j9) {
        long j11 = 6148914691236517205L & j9;
        long j12 = j9 & (-6148914691236517206L);
        return (j12 >>> 1) ^ ((j11 << 1) ^ j12);
    }

    private static short gf4Mul3(short s7) {
        int i11 = (s7 - 2) >>> 1;
        return (short) ((((s7 - 1) & (~i11)) | ((s7 * 3) & i11)) & 255);
    }

    private static long gf4Mul_64(long j9, long j11) {
        long j12 = (((j9 << 1) & j11) ^ ((j11 << 1) & j9)) & (-6148914691236517206L);
        long j13 = j9 & j11;
        return ((j13 & (-6148914691236517206L)) >>> 1) ^ (j13 ^ j12);
    }

    private static short gf4Squ(short s7) {
        return (short) ((s7 ^ (s7 >>> 1)) & 255);
    }

    private static long gf4Squ_64(long j9) {
        return j9 ^ (((-6148914691236517206L) & j9) >>> 1);
    }

    public static short invElem(short s7) {
        return (short) (gfInvTable[s7] & 255);
    }

    public static long invElem_64(long j9) {
        return gf256Inv_64(j9);
    }

    public static short multElem(short s7, short s8) {
        return (short) (gfMulTable[s7][s8] & 255);
    }

    public static long multElem_64(long j9, long j11) {
        return gf256Mul_64(j9, j11);
    }
}
