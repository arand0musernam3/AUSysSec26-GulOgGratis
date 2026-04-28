package w50;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f43229c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f43227a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f43228b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f43230d = new byte[128];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f43231e = StandardCharsets.ISO_8859_1;

    static {
        byte[] bArr = new byte[128];
        f43229c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            byte[] bArr2 = f43227a;
            if (i12 >= bArr2.length) {
                break;
            }
            byte b8 = bArr2[i12];
            if (b8 > 0) {
                f43229c[b8] = (byte) i12;
            }
            i12++;
        }
        Arrays.fill(f43230d, (byte) -1);
        while (true) {
            byte[] bArr3 = f43228b;
            if (i11 >= bArr3.length) {
                return;
            }
            byte b11 = bArr3[i11];
            if (b11 > 0) {
                f43230d[b11] = (byte) i11;
            }
            i11++;
        }
    }

    public static void a(int i11, int i12, StringBuilder sb2, byte[] bArr) {
        if (i11 == 1 && i12 == 0) {
            sb2.append((char) 913);
        } else if (i11 % 6 == 0) {
            sb2.append((char) 924);
        } else {
            sb2.append((char) 901);
        }
        int i13 = 0;
        if (i11 >= 6) {
            char[] cArr = new char[5];
            int i14 = 0;
            while (i11 - i14 >= 6) {
                long j9 = 0;
                for (int i15 = 0; i15 < 6; i15++) {
                    j9 = (j9 << 8) + ((long) (bArr[i14 + i15] & 255));
                }
                for (int i16 = 0; i16 < 5; i16++) {
                    cArr[i16] = (char) (j9 % 900);
                    j9 /= 900;
                }
                for (int i17 = 4; i17 >= 0; i17--) {
                    sb2.append(cArr[i17]);
                }
                i14 += 6;
            }
            i13 = i14;
        }
        while (i13 < i11) {
            sb2.append((char) (bArr[i13] & 255));
            i13++;
        }
    }

    public static void b(int i11, int i12, String str, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder((i12 / 3) + 1);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(0L);
        int i13 = 0;
        while (i13 < i12) {
            sb3.setLength(0);
            int iMin = Math.min(44, i12 - i13);
            int i14 = i11 + i13;
            BigInteger bigInteger = new BigInteger("1".concat(str.substring(i14, i14 + iMin)));
            do {
                sb3.append((char) bigInteger.mod(bigIntegerValueOf).intValue());
                bigInteger = bigInteger.divide(bigIntegerValueOf);
            } while (!bigInteger.equals(bigIntegerValueOf2));
            for (int length = sb3.length() - 1; length >= 0; length--) {
                sb2.append(sb3.charAt(length));
            }
            i13 += iMin;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00e6 A[EDGE_INSN: B:76:0x00e6->B:57:0x00e6 BREAK  A[LOOP:0: B:3:0x000e->B:93:0x000e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x000e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(java.lang.String r17, int r18, int r19, java.lang.StringBuilder r20, int r21) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w50.d.c(java.lang.String, int, int, java.lang.StringBuilder, int):int");
    }

    public static boolean d(char c3) {
        if (c3 != ' ') {
            return c3 >= 'a' && c3 <= 'z';
        }
        return true;
    }

    public static boolean e(char c3) {
        if (c3 != ' ') {
            return c3 >= 'A' && c3 <= 'Z';
        }
        return true;
    }
}
