package z50;

import com.app.tgtg.model.local.AppConstants;
import com.google.zxing.WriterException;
import m2.f2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f47296a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[][] f47297b = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[][] f47298c = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[][] f47299d = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, AppConstants.RESULT_CODE_ORDER_COLLECTED, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, AppConstants.RESULT_CODE_FLASH_SALES_SURVEY, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[][] f47300e = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static int a(f2 f2Var, boolean z11) {
        int i11 = f2Var.f28852b;
        int i12 = f2Var.f28853c;
        int i13 = z11 ? i12 : i11;
        if (!z11) {
            i11 = i12;
        }
        byte[][] bArr = (byte[][]) f2Var.f28854d;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            byte b8 = -1;
            int i16 = 0;
            for (int i17 = 0; i17 < i11; i17++) {
                byte b11 = z11 ? bArr[i15][i17] : bArr[i17][i15];
                if (b11 == b8) {
                    i16++;
                } else {
                    if (i16 >= 5) {
                        i14 += i16 - 2;
                    }
                    i16 = 1;
                    b8 = b11;
                }
            }
            if (i16 >= 5) {
                i14 = (i16 - 2) + i14;
            }
        }
        return i14;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0226  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(q50.a r25, y50.a r26, y50.c r27, int r28, m2.f2 r29) {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z50.c.b(q50.a, y50.a, y50.c, int, m2.f2):void");
    }

    public static int c(int i11, int i12) {
        if (i12 == 0) {
            i4.a.f("0 polynomial");
            return 0;
        }
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i12);
        int i13 = 32 - iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2 = i11 << (31 - iNumberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2) >= i13) {
            iNumberOfLeadingZeros2 ^= i12 << ((32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2)) - i13);
        }
        return iNumberOfLeadingZeros2;
    }

    public static void d(int i11, int i12, f2 f2Var) throws WriterException {
        for (int i13 = 0; i13 < 8; i13++) {
            int i14 = i11 + i13;
            if (!g(f2Var.s(i14, i12))) {
                throw new WriterException();
            }
            f2Var.u(i14, i12, 0);
        }
    }

    public static void e(int i11, int i12, f2 f2Var) {
        for (int i13 = 0; i13 < 7; i13++) {
            int[] iArr = f47297b[i13];
            for (int i14 = 0; i14 < 7; i14++) {
                f2Var.u(i11 + i14, i12 + i13, iArr[i14]);
            }
        }
    }

    public static void f(int i11, int i12, f2 f2Var) throws WriterException {
        for (int i13 = 0; i13 < 7; i13++) {
            int i14 = i12 + i13;
            if (!g(f2Var.s(i11, i14))) {
                throw new WriterException();
            }
            f2Var.u(i11, i14, 0);
        }
    }

    public static boolean g(int i11) {
        return i11 == -1;
    }
}
