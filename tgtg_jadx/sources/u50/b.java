package u50;

import b0.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f40796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f40797e = {'T', 'N', '*', 'E'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final char[] f40798f = {'/', ':', '+', '.'};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final char f40799g;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f40796d = cArr;
        f40799g = cArr[0];
    }

    @Override // b0.a0
    public final boolean[] q(String str) {
        int i11;
        int length = str.length();
        char c3 = f40799g;
        if (length < 2) {
            str = c3 + str + c3;
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f40796d;
            boolean zB = a.B(cArr, upperCase);
            boolean zB2 = a.B(cArr, upperCase2);
            char[] cArr2 = f40797e;
            boolean zB3 = a.B(cArr2, upperCase);
            boolean zB4 = a.B(cArr2, upperCase2);
            if (zB) {
                if (!zB2) {
                    i4.a.f("Invalid start/end guards: ".concat(str));
                    return null;
                }
            } else if (!zB3) {
                if (zB2 || zB4) {
                    i4.a.f("Invalid start/end guards: ".concat(str));
                    return null;
                }
                str = c3 + str + c3;
            } else if (!zB4) {
                i4.a.f("Invalid start/end guards: ".concat(str));
                return null;
            }
        }
        int i12 = 20;
        for (int i13 = 1; i13 < str.length() - 1; i13++) {
            if (Character.isDigit(str.charAt(i13)) || str.charAt(i13) == '-' || str.charAt(i13) == '$') {
                i12 += 9;
            } else {
                if (!a.B(f40798f, str.charAt(i13))) {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i13) + '\'');
                }
                i12 += 10;
            }
        }
        boolean[] zArr = new boolean[(str.length() - 1) + i12];
        int i14 = 0;
        for (int i15 = 0; i15 < str.length(); i15++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i15));
            if (i15 == 0 || i15 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i16 = 0;
            while (true) {
                char[] cArr3 = a.f40794e;
                if (i16 >= cArr3.length) {
                    i11 = 0;
                    break;
                }
                if (upperCase3 == cArr3[i16]) {
                    i11 = a.f40795f[i16];
                    break;
                }
                i16++;
            }
            int i17 = 0;
            int i18 = 0;
            boolean z11 = true;
            while (i17 < 7) {
                zArr[i14] = z11;
                i14++;
                if (((i11 >> (6 - i17)) & 1) == 0 || i18 == 1) {
                    z11 = !z11;
                    i17++;
                    i18 = 0;
                } else {
                    i18++;
                }
            }
            if (i15 < str.length() - 1) {
                zArr[i14] = false;
                i14++;
            }
        }
        return zArr;
    }
}
