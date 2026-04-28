package com.google.android.gms.internal.measurement;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f11334a;

    static {
        char[] cArr = new char[80];
        f11334a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb2, int i11, String str, Object obj) {
        String strReplace;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb2, i11, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb2, i11, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        c(i11, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i12 = 1; i12 < str.length(); i12++) {
                char cCharAt = str.charAt(i12);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (!(obj instanceof String)) {
            if (obj instanceof u0) {
                sb2.append(": \"");
                sb2.append(la.d(((u0) obj).m()));
                sb2.append('\"');
                return;
            }
            if (obj instanceof k1) {
                sb2.append(" {");
                b((k1) obj, sb2, i11 + 2);
                sb2.append("\n");
                c(i11, sb2);
                sb2.append("}");
                return;
            }
            if (!(obj instanceof Map.Entry)) {
                sb2.append(": ");
                sb2.append(obj);
                return;
            }
            int i13 = i11 + 2;
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            a(sb2, i13, "key", entry.getKey());
            a(sb2, i13, "value", entry.getValue());
            sb2.append("\n");
            c(i11, sb2);
            sb2.append("}");
            return;
        }
        sb2.append(": \"");
        String strReplace2 = (String) obj;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        for (int i14 = 0; i14 < strReplace2.length(); i14++) {
            char cCharAt2 = strReplace2.charAt(i14);
            if (cCharAt2 < ' ' || cCharAt2 > '~') {
                strReplace = la.d(strReplace2.getBytes(StandardCharsets.UTF_8));
                break;
            }
            if (cCharAt2 == '\"') {
                z13 = true;
            } else if (cCharAt2 == '\'') {
                z12 = true;
            } else if (cCharAt2 == '\\') {
                z11 = true;
            }
        }
        if (z11) {
            strReplace2 = strReplace2.replace("\\", "\\\\");
        }
        strReplace = z12 ? strReplace2.replace("'", "\\'") : strReplace2;
        if (z13) {
            strReplace = strReplace.replace("\"", "\\\"");
        }
        sb2.append(strReplace);
        sb2.append('\"');
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(com.google.android.gms.internal.measurement.k1 r19, java.lang.StringBuilder r20, int r21) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.d2.b(com.google.android.gms.internal.measurement.k1, java.lang.StringBuilder, int):void");
    }

    public static void c(int i11, StringBuilder sb2) {
        while (i11 > 0) {
            int i12 = 80;
            if (i11 <= 80) {
                i12 = i11;
            }
            sb2.append(f11334a, 0, i12);
            i11 -= i12;
        }
    }
}
