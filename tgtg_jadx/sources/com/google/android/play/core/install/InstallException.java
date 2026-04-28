package com.google.android.play.core.install;

import com.google.android.gms.common.api.ApiException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class InstallException extends ApiException {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InstallException(int r8) {
        /*
            r7 = this;
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            java.util.HashMap r3 = c30.a.f7019a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            boolean r5 = r3.containsKey(r4)
            if (r5 == 0) goto L45
            java.util.HashMap r5 = c30.a.f7020b
            boolean r6 = r5.containsKey(r4)
            if (r6 != 0) goto L1f
            goto L45
        L1f:
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#"
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = ")"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            goto L47
        L45:
            java.lang.String r3 = ""
        L47:
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "Install Error(%d): %s"
            java.lang.String r1 = java.lang.String.format(r1, r3, r2)
            r2 = 0
            r0.<init>(r8, r1, r2, r2)
            r7.<init>(r0)
            if (r8 == 0) goto L5b
            return
        L5b:
            java.lang.String r8 = "errorCode should not be 0."
            i4.a.f(r8)
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.install.InstallException.<init>(int):void");
    }
}
