package c50;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f7662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f7664g;

    public y0(String str, String str2, int i11, long j9, k kVar, String str3, String str4) {
        w.a0.C(str, str2, str4);
        this.f7658a = str;
        this.f7659b = str2;
        this.f7660c = i11;
        this.f7661d = j9;
        this.f7662e = kVar;
        this.f7663f = str3;
        this.f7664g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return Intrinsics.areEqual(this.f7658a, y0Var.f7658a) && Intrinsics.areEqual(this.f7659b, y0Var.f7659b) && this.f7660c == y0Var.f7660c && this.f7661d == y0Var.f7661d && Intrinsics.areEqual(this.f7662e, y0Var.f7662e) && Intrinsics.areEqual(this.f7663f, y0Var.f7663f) && Intrinsics.areEqual(this.f7664g, y0Var.f7664g);
    }

    public final int hashCode() {
        return this.f7664g.hashCode() + w2.l1.b((this.f7662e.hashCode() + e0.f.b(r8.k.b(this.f7660c, w2.l1.b(this.f7658a.hashCode() * 31, 31, this.f7659b), 31), 31, this.f7661d)) * 31, 31, this.f7663f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionInfo(sessionId=");
        sb2.append(this.f7658a);
        sb2.append(", firstSessionId=");
        sb2.append(this.f7659b);
        sb2.append(", sessionIndex=");
        sb2.append(this.f7660c);
        sb2.append(", eventTimestampUs=");
        sb2.append(this.f7661d);
        sb2.append(", dataCollectionStatus=");
        sb2.append(this.f7662e);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.f7663f);
        sb2.append(", firebaseAuthenticationToken=");
        return w2.l1.f(sb2, this.f7664g, ')');
    }
}
