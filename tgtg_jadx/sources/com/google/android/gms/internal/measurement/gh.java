package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class gh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f11438c = new HashSet(Arrays.asList(Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f11439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11440b = false;

    public gh(StringBuilder sb2) {
        this.f11439a = sb2;
    }

    public static int b(int i11, String str) {
        while (i11 < str.length()) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < ' ' || cCharAt == '\"' || cCharAt == '\\') {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public final void a(Object obj, String str) {
        boolean z11 = this.f11440b;
        StringBuilder sb2 = this.f11439a;
        if (z11) {
            sb2.append(' ');
        } else {
            if (sb2.length() > 0) {
                sb2.append((sb2.length() > 1000 || sb2.indexOf("\n") != -1) ? '\n' : ' ');
            }
            sb2.append("[CONTEXT ");
            this.f11440b = true;
        }
        sb2.append(str);
        sb2.append('=');
        if (obj == null) {
            sb2.append(true);
            return;
        }
        if (f11438c.contains(obj.getClass())) {
            sb2.append(obj);
            return;
        }
        sb2.append('\"');
        String string = obj.toString();
        int i11 = 0;
        while (true) {
            int iB = b(i11, string);
            if (iB == -1) {
                sb2.append((CharSequence) string, i11, string.length());
                sb2.append('\"');
                return;
            }
            sb2.append((CharSequence) string, i11, iB);
            i11 = iB + 1;
            char cCharAt = string.charAt(iB);
            if (cCharAt == '\t') {
                cCharAt = 't';
            } else if (cCharAt == '\n') {
                cCharAt = 'n';
            } else if (cCharAt == '\r') {
                cCharAt = 'r';
            } else if (cCharAt != '\"' && cCharAt != '\\') {
                sb2.append((char) 65533);
            }
            sb2.append("\\");
            sb2.append(cCharAt);
        }
    }
}
