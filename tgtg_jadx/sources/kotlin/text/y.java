package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class y extends StringsKt__StringNumberConversionsKt {
    public static boolean i(CharSequence charSequence, CharSequence charSequence2) {
        boolean z11 = charSequence instanceof String;
        if (z11 && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        if (z11 && (charSequence2 instanceof String)) {
            return Intrinsics.areEqual(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence != null && charSequence2 != null && charSequence.length() == charSequence2.length()) {
            int length = charSequence.length();
            for (int i11 = 0; i11 < length; i11++) {
                if (charSequence.charAt(i11) == charSequence2.charAt(i11)) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean j(String str, String str2, boolean z11) {
        str.getClass();
        str2.getClass();
        return !z11 ? str.endsWith(str2) : str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
    }

    public static boolean k(String str, String str2, boolean z11) {
        return str == null ? str2 == null : !z11 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static boolean l(int i11, int i12, int i13, String str, String str2, boolean z11) {
        str.getClass();
        str2.getClass();
        return !z11 ? str.regionMatches(i11, str2, i12, i13) : str.regionMatches(z11, i11, str2, i12, i13);
    }

    public static String m(int i11, String str) {
        if (i11 < 0) {
            i4.a.i(w.a0.l("Count 'n' must be non-negative, but was ", i11, '.'));
            return null;
        }
        if (i11 == 0) {
            return "";
        }
        int i12 = 1;
        if (i11 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length != 1) {
            StringBuilder sb2 = new StringBuilder(str.length() * i11);
            if (1 <= i11) {
                while (true) {
                    sb2.append((CharSequence) str);
                    if (i12 == i11) {
                        break;
                    }
                    i12++;
                }
            }
            return sb2.toString();
        }
        char cCharAt = str.charAt(0);
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = cCharAt;
        }
        return new String(cArr);
    }

    public static String n(String str, String str2, String str3, boolean z11) {
        w.a0.C(str, str2, str3);
        int i11 = 0;
        int iE = StringsKt.E(0, str, str2, z11);
        if (iE < 0) {
            return str;
        }
        int length = str2.length();
        int i12 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i11, iE);
            sb2.append(str3);
            i11 = iE + length;
            if (iE >= str.length()) {
                break;
            }
            iE = StringsKt.E(iE + i12, str, str2, z11);
        } while (iE > 0);
        sb2.append((CharSequence) str, i11, str.length());
        return sb2.toString();
    }

    public static boolean o(String str, int i11, String str2, boolean z11) {
        str.getClass();
        return !z11 ? str.startsWith(str2, i11) : l(i11, 0, str2.length(), str, str2, z11);
    }

    public static boolean p(String str, String str2, boolean z11) {
        str.getClass();
        str2.getClass();
        return !z11 ? str.startsWith(str2) : l(0, 0, str2.length(), str, str2, z11);
    }
}
