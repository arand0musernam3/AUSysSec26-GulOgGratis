package o90;

import zendesk.core.ui.android.internal.xml.richtext.codeblock.CodeBlockHandler;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f32154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f32155b;

    static {
        String[] strArr = new String[93];
        for (int i11 = 0; i11 < 32; i11++) {
            strArr[i11] = "\\u" + c(i11 >> 12) + c(i11 >> 8) + c(i11 >> 4) + c(i11);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = CodeBlockHandler.NEWLINE_REGEX;
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f32154a = strArr;
        byte[] bArr = new byte[93];
        for (int i12 = 0; i12 < 32; i12++) {
            bArr[i12] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f32155b = bArr;
    }

    public static final void a(String str, StringBuilder sb2) {
        str.getClass();
        sb2.append('\"');
        int length = str.length();
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str.charAt(i12);
            String[] strArr = f32154a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb2.append((CharSequence) str, i11, i12);
                sb2.append(strArr[cCharAt]);
                i11 = i12 + 1;
            }
        }
        if (i11 != 0) {
            sb2.append((CharSequence) str, i11, str.length());
        } else {
            sb2.append(str);
        }
        sb2.append('\"');
    }

    public static final Boolean b(String str) {
        str.getClass();
        if (kotlin.text.y.k(str, "true", true)) {
            return Boolean.TRUE;
        }
        if (kotlin.text.y.k(str, "false", true)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final char c(int i11) {
        int i12 = i11 & 15;
        return (char) (i12 < 10 ? i12 + 48 : i12 + 87);
    }
}
