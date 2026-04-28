package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.ApiException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzmk extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12099a;

    public zzmk(int i11, String str, ApiException apiException) {
        String strValueOf;
        if (str != null) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 2 + str.length());
            sb2.append(i11);
            sb2.append(": ");
            sb2.append(str);
            strValueOf = sb2.toString();
        } else {
            strValueOf = String.valueOf(i11);
        }
        super(strValueOf, apiException);
        this.f12099a = i11;
    }
}
