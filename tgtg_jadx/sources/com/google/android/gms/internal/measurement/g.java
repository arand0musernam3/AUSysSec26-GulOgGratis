package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f11425a = d0.f11332b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11426b;

    public g(String str) {
        this.f11426b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f11425a.equals(gVar.f11425a) && this.f11426b.equals(gVar.f11426b);
    }

    public final int hashCode() {
        return this.f11425a.hashCode() ^ this.f11426b.hashCode();
    }
}
