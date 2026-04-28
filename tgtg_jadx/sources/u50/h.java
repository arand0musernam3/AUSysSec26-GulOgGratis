package u50;

import b0.a0;
import java.util.EnumMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends a0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f40806e = {1, 1, 1, 1};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f40807f = {3, 1, 1};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[][] f40808g = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f40809d;

    public /* synthetic */ h(int i11) {
        this.f40809d = i11;
    }

    public static void I(boolean[] zArr, int i11, int[] iArr) {
        int length = iArr.length;
        int i12 = 0;
        while (i12 < length) {
            int i13 = i11 + 1;
            zArr[i11] = iArr[i12] != 0;
            i12++;
            i11 = i13;
        }
    }

    public static int J(int i11, String str) {
        int iIndexOf = 0;
        int i12 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i12;
            i12++;
            if (i12 > i11) {
                i12 = 1;
            }
        }
        return iIndexOf % 47;
    }

    public static d K(int i11, String str) {
        int length = str.length();
        if (i11 >= length) {
            return d.UNCODABLE;
        }
        char cCharAt = str.charAt(i11);
        if (cCharAt == 241) {
            return d.FNC_1;
        }
        if (cCharAt < '0' || cCharAt > '9') {
            return d.UNCODABLE;
        }
        int i12 = i11 + 1;
        if (i12 >= length) {
            return d.ONE_DIGIT;
        }
        char cCharAt2 = str.charAt(i12);
        return (cCharAt2 < '0' || cCharAt2 > '9') ? d.ONE_DIGIT : d.TWO_DIGITS;
    }

    public static void L(int i11, int[] iArr) {
        for (int i12 = 0; i12 < 9; i12++) {
            int i13 = 1;
            if (((1 << (8 - i12)) & i11) != 0) {
                i13 = 2;
            }
            iArr[i12] = i13;
        }
    }

    public static void M(int i11, int[] iArr) {
        for (int i12 = 0; i12 < 9; i12++) {
            int i13 = 1;
            if (((1 << (8 - i12)) & i11) == 0) {
                i13 = 0;
            }
            iArr[i12] = i13;
        }
    }

    @Override // b0.a0, n50.d
    public final q50.b k(String str, n50.a aVar, EnumMap enumMap) {
        switch (this.f40809d) {
            case 0:
                if (aVar != n50.a.ITF) {
                    i4.a.f("Can only encode ITF, but got ".concat(String.valueOf(aVar)));
                }
                break;
            case 1:
                if (aVar != n50.a.CODE_128) {
                    i4.a.f("Can only encode CODE_128, but got ".concat(String.valueOf(aVar)));
                }
                break;
            case 2:
                if (aVar != n50.a.CODE_39) {
                    i4.a.f("Can only encode CODE_39, but got ".concat(String.valueOf(aVar)));
                }
                break;
            default:
                if (aVar != n50.a.CODE_93) {
                    i4.a.f("Can only encode CODE_93, but got ".concat(String.valueOf(aVar)));
                }
                break;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0185  */
    @Override // b0.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean[] q(java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u50.h.q(java.lang.String):boolean[]");
    }
}
