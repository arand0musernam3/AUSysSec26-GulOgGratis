package gd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n4.b f20367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final td.d f20368b;

    public e(n4.b bVar, td.d dVar) {
        this.f20367a = bVar;
        this.f20368b = dVar;
    }

    @Override // gd.h
    public final n4.b a() {
        return this.f20367a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f20367a, eVar.f20367a) && Intrinsics.areEqual(this.f20368b, eVar.f20368b);
    }

    public final int hashCode() {
        n4.b bVar = this.f20367a;
        return this.f20368b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.f20367a + ", result=" + this.f20368b + ")";
    }
}
