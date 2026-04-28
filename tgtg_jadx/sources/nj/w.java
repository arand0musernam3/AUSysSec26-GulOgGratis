package nj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f30960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f30961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f30962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f30963e;

    public w(boolean z11, boolean z12, boolean z13, boolean z14, String str) {
        this.f30959a = z11;
        this.f30960b = z12;
        this.f30961c = z13;
        this.f30962d = z14;
        this.f30963e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f30959a == wVar.f30959a && this.f30960b == wVar.f30960b && this.f30961c == wVar.f30961c && this.f30962d == wVar.f30962d && Intrinsics.areEqual(this.f30963e, wVar.f30963e);
    }

    public final int hashCode() {
        return this.f30963e.hashCode() + r8.k.e(r8.k.e(r8.k.e(Boolean.hashCode(this.f30959a) * 31, 31, this.f30960b), 31, this.f30961c), 31, this.f30962d);
    }

    public final String toString() {
        StringBuilder sbP = b3.i.p("MainContent(allowMarketing=", this.f30959a, ", isFromAppStart=", this.f30960b, ", isLoggedIn=");
        b3.i.C(sbP, this.f30961c, ", isFromDeepLink=", this.f30962d, ", privacyUrl=");
        return r8.k.p(sbP, this.f30963e, ")");
    }
}
