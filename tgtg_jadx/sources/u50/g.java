package u50;

import b0.a0;
import com.google.zxing.FormatException;
import java.util.EnumMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f40805d;

    public /* synthetic */ g(int i11) {
        this.f40805d = i11;
    }

    @Override // b0.a0, n50.d
    public final q50.b k(String str, n50.a aVar, EnumMap enumMap) {
        switch (this.f40805d) {
            case 0:
                if (aVar != n50.a.EAN_13) {
                    i4.a.f("Can only encode EAN_13, but got ".concat(String.valueOf(aVar)));
                }
                break;
            case 1:
                if (aVar != n50.a.EAN_8) {
                    i4.a.f("Can only encode EAN_8, but got ".concat(String.valueOf(aVar)));
                }
                break;
            default:
                if (aVar != n50.a.UPC_E) {
                    i4.a.f("Can only encode UPC_E, but got ".concat(String.valueOf(aVar)));
                }
                break;
        }
        return null;
    }

    @Override // b0.a0
    public final boolean[] q(String str) {
        switch (this.f40805d) {
            case 0:
                int length = str.length();
                if (length != 12) {
                    if (length == 13) {
                        try {
                            if (!i.B(str)) {
                                throw new IllegalArgumentException("Contents do not pass checksum");
                            }
                        } catch (FormatException unused) {
                            i4.a.f("Illegal contents");
                        }
                    } else {
                        i4.a.f("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
                    }
                    return null;
                }
                try {
                    str = str + i.C(str);
                } catch (FormatException e5) {
                    throw new IllegalArgumentException(e5);
                }
                int i11 = f.f40803j[Character.digit(str.charAt(0), 10)];
                boolean[] zArr = new boolean[95];
                int i12 = a0.i(zArr, 0, i.f40810e, true);
                for (int i13 = 1; i13 <= 6; i13++) {
                    int iDigit = Character.digit(str.charAt(i13), 10);
                    if (((i11 >> (6 - i13)) & 1) == 1) {
                        iDigit += 10;
                    }
                    i12 += a0.i(zArr, i12, i.f40814i[iDigit], false);
                }
                int i14 = a0.i(zArr, i12, i.f40811f, false) + i12;
                for (int i15 = 7; i15 <= 12; i15++) {
                    i14 += a0.i(zArr, i14, i.f40813h[Character.digit(str.charAt(i15), 10)], true);
                }
                a0.i(zArr, i14, i.f40810e, true);
                return zArr;
            case 1:
                int length2 = str.length();
                if (length2 != 7) {
                    if (length2 == 8) {
                        try {
                            if (!i.B(str)) {
                                throw new IllegalArgumentException("Contents do not pass checksum");
                            }
                        } catch (FormatException unused2) {
                            i4.a.f("Illegal contents");
                        }
                    } else {
                        i4.a.f("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length2)));
                    }
                    return null;
                }
                try {
                    str = str + i.C(str);
                } catch (FormatException e11) {
                    throw new IllegalArgumentException(e11);
                }
                boolean[] zArr2 = new boolean[67];
                int i16 = a0.i(zArr2, 0, i.f40810e, true);
                for (int i17 = 0; i17 <= 3; i17++) {
                    i16 += a0.i(zArr2, i16, i.f40813h[Character.digit(str.charAt(i17), 10)], false);
                }
                int i18 = a0.i(zArr2, i16, i.f40811f, false) + i16;
                for (int i19 = 4; i19 <= 7; i19++) {
                    i18 += a0.i(zArr2, i18, i.f40813h[Character.digit(str.charAt(i19), 10)], true);
                }
                a0.i(zArr2, i18, i.f40810e, true);
                return zArr2;
            default:
                int length3 = str.length();
                if (length3 != 7) {
                    if (length3 == 8) {
                        try {
                            if (!i.B(str)) {
                                throw new IllegalArgumentException("Contents do not pass checksum");
                            }
                        } catch (FormatException unused3) {
                            i4.a.f("Illegal contents");
                        }
                    } else {
                        i4.a.f("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length3)));
                    }
                    return null;
                }
                try {
                    str = str + i.C(f.D(str));
                } catch (FormatException e12) {
                    throw new IllegalArgumentException(e12);
                }
                int iDigit2 = Character.digit(str.charAt(0), 10);
                if (iDigit2 != 0 && iDigit2 != 1) {
                    i4.a.f("Number system must be 0 or 1");
                    return null;
                }
                int i21 = f.f40804k[iDigit2][Character.digit(str.charAt(7), 10)];
                boolean[] zArr3 = new boolean[51];
                int i22 = a0.i(zArr3, 0, i.f40810e, true);
                for (int i23 = 1; i23 <= 6; i23++) {
                    int iDigit3 = Character.digit(str.charAt(i23), 10);
                    if (((i21 >> (6 - i23)) & 1) == 1) {
                        iDigit3 += 10;
                    }
                    i22 += a0.i(zArr3, i22, i.f40814i[iDigit3], false);
                }
                a0.i(zArr3, i22, i.f40812g, false);
                return zArr3;
        }
    }

    @Override // b0.a0
    public final int w() {
        return 9;
    }
}
