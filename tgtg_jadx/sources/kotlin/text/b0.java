package kotlin.text;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class b0 extends a0 {
    public static char w(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        qc.y.h("Char sequence is empty.");
        return (char) 0;
    }

    public static String x(int i11, String str) {
        str.getClass();
        if (i11 < 0) {
            i4.a.i(r8.k.h(i11, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i11 > length) {
            i11 = length;
        }
        return str.substring(0, i11);
    }

    public static String y(int i11, String str) {
        str.getClass();
        if (i11 < 0) {
            i4.a.i(r8.k.h(i11, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i11 > length) {
            i11 = length;
        }
        return str.substring(length - i11);
    }
}
