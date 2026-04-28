package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class qg implements rg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final og f11804a = new og();

    public abstract String a();

    public abstract String b();

    public abstract int c();

    public abstract String d();

    public String e() {
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LogSite{ class=");
        sb2.append(a());
        sb2.append(", method=");
        sb2.append(b());
        sb2.append(", line=");
        sb2.append(c());
        if (d() != null) {
            sb2.append(", file=");
            sb2.append(d());
        }
        if (e() != null) {
            sb2.append(", filePath=");
            sb2.append(e());
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
