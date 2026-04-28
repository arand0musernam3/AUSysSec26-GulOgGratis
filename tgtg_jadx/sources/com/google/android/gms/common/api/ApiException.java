package com.google.android.gms.common.api;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class ApiException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Status f11049a;

    public ApiException(Status status) {
        int i11 = status.f11059a;
        String str = status.f11060b;
        str = str == null ? "" : str;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 2 + String.valueOf(str).length());
        sb2.append(i11);
        sb2.append(": ");
        sb2.append(str);
        super(sb2.toString());
        this.f11049a = status;
    }
}
