package gd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n4.b f20370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final td.q f20371b;

    public g(n4.b bVar, td.q qVar) {
        this.f20370a = bVar;
        this.f20371b = qVar;
    }

    @Override // gd.h
    public final n4.b a() {
        return this.f20370a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f20370a, gVar.f20370a) && Intrinsics.areEqual(this.f20371b, gVar.f20371b);
    }

    public final int hashCode() {
        return this.f20371b.hashCode() + (this.f20370a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.f20370a + ", result=" + this.f20371b + ")";
    }
}
