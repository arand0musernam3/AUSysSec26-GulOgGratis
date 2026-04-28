package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f11355a;

    static {
        String property;
        try {
            property = System.getProperty("line.separator");
        } catch (SecurityException unused) {
        }
        if (!property.matches("\\n|\\r(?:\\n)?")) {
            property = "\n";
        }
        f11355a = property;
    }

    public static void a(int i11, int i12, String str, StringBuilder sb2) {
        int i13 = i11;
        while (i11 < i12) {
            int i14 = i11 + 1;
            if (str.charAt(i11) == '%') {
                if (i14 == i12) {
                    break;
                }
                char cCharAt = str.charAt(i14);
                if (cCharAt == '%') {
                    sb2.append((CharSequence) str, i13, i14);
                } else if (cCharAt == 'n') {
                    sb2.append((CharSequence) str, i13, i11);
                    sb2.append(f11355a);
                }
                i13 = i11 + 2;
                i11 = i13;
            }
            i11 = i14;
        }
        if (i13 < i12) {
            sb2.append((CharSequence) str, i13, i12);
        }
    }

    public static int b(int i11, String str) {
        while (i11 < str.length()) {
            int i12 = i11 + 1;
            if (str.charAt(i11) != '%') {
                i11 = i12;
            } else {
                if (i12 >= str.length()) {
                    throw new zzabo(zzabo.c("trailing unquoted '%' character", i11, -1, str));
                }
                char cCharAt = str.charAt(i12);
                if (cCharAt != '%' && cCharAt != 'n') {
                    return i11;
                }
                i11 += 2;
            }
        }
        return -1;
    }
}
