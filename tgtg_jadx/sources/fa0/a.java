package fa0;

import ia0.g;
import java.io.EOFException;
import kotlin.text.StringsKt;
import r90.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f17530a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(String str, int i11, String str2, int i12, int i13) {
        int i14 = (i13 & 1) != 0 ? 0 : i11;
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        int i15 = i12;
        boolean z11 = (i13 & 8) == 0;
        boolean z12 = (i13 & 16) == 0;
        boolean z13 = (i13 & 32) == 0;
        boolean z14 = (i13 & 64) == 0;
        str.getClass();
        return b(str, i14, i15, str2, z11, z12, z13, z14, 128);
    }

    public static String b(String str, int i11, int i12, String str2, boolean z11, boolean z12, boolean z13, boolean z14, int i13) throws EOFException {
        int i14 = (i13 & 1) != 0 ? 0 : i11;
        int length = (i13 & 2) != 0 ? str.length() : i12;
        boolean z15 = (i13 & 8) != 0 ? false : z11;
        boolean z16 = (i13 & 16) != 0 ? false : z12;
        boolean z17 = (i13 & 64) == 0 ? z14 : false;
        str.getClass();
        int iCharCount = i14;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i15 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z17) || StringsKt.A(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z15 || (z16 && !c(iCharCount, length, str)))) || (iCodePointAt == 43 && z13)))) {
                g gVar = new g();
                gVar.E0(i14, iCharCount, str);
                g gVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z15 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            gVar.F0("+");
                        } else if (iCodePointAt2 == 43 && z13) {
                            gVar.F0(z15 ? "+" : "%2B");
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i15 && !z17) || StringsKt.A(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z15 || (z16 && !c(iCharCount, length, str)))))) {
                            if (gVar2 == null) {
                                gVar2 = new g();
                            }
                            gVar2.G0(iCodePointAt2);
                            while (!gVar2.B()) {
                                byte b8 = gVar2.readByte();
                                gVar.z0(37);
                                char[] cArr = f17530a;
                                gVar.z0(cArr[((b8 & 255) >> 4) & 15]);
                                gVar.z0(cArr[b8 & 15]);
                            }
                        } else {
                            gVar.G0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i15 = 128;
                }
                return gVar.g0();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i14, length);
    }

    public static final boolean c(int i11, int i12, String str) {
        str.getClass();
        int i13 = i11 + 2;
        return i13 < i12 && str.charAt(i11) == '%' && e.n(str.charAt(i11 + 1)) != -1 && e.n(str.charAt(i13)) != -1;
    }

    public static String d(int i11, int i12, int i13, String str) {
        int i14;
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        boolean z11 = (i13 & 4) == 0;
        str.getClass();
        int iCharCount = i11;
        while (iCharCount < i12) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z11)) {
                g gVar = new g();
                gVar.E0(i11, iCharCount, str);
                while (iCharCount < i12) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i14 = iCharCount + 2) < i12) {
                        int iN = e.n(str.charAt(iCharCount + 1));
                        int iN2 = e.n(str.charAt(i14));
                        if (iN == -1 || iN2 == -1) {
                            gVar.G0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            gVar.z0((iN << 4) + iN2);
                            iCharCount = Character.charCount(iCodePointAt) + i14;
                        }
                    } else if (iCodePointAt == 43 && z11) {
                        gVar.z0(32);
                        iCharCount++;
                    } else {
                        gVar.G0(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return gVar.g0();
            }
            iCharCount++;
        }
        return str.substring(i11, i12);
    }
}
