package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzabo extends RuntimeException {
    public static zzabo a(String str, int i11, int i12, String str2) {
        return new zzabo(c(str, i11, i12, str2));
    }

    public static zzabo b(int i11, String str, String str2) {
        return new zzabo(c(str, i11, i11 + 1, str2));
    }

    public static String c(String str, int i11, int i12, String str2) {
        if (i12 < 0) {
            i12 = str2.length();
        }
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(": ");
        if (i11 > 8) {
            sb2.append("...");
            sb2.append((CharSequence) str2, i11 - 5, i11);
        } else {
            sb2.append((CharSequence) str2, 0, i11);
        }
        sb2.append('[');
        sb2.append(str2.substring(i11, i12));
        sb2.append(']');
        if (str2.length() - i12 > 8) {
            sb2.append((CharSequence) str2, i12, i12 + 5);
            sb2.append("...");
        } else {
            sb2.append((CharSequence) str2, i12, str2.length());
        }
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
