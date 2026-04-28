package gd;

import fd.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f20363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final td.i f20364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f20365c;

    public c(t tVar, td.i iVar, b bVar) {
        this.f20363a = tVar;
        this.f20364b = iVar;
        this.f20365c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!Intrinsics.areEqual(this.f20363a, cVar.f20363a)) {
            return false;
        }
        b bVar = cVar.f20365c;
        b bVar2 = this.f20365c;
        return Intrinsics.areEqual(bVar2, bVar) && bVar2.a(this.f20364b, cVar.f20364b);
    }

    public final int hashCode() {
        int iHashCode = this.f20363a.hashCode() * 31;
        b bVar = this.f20365c;
        return bVar.b(this.f20364b) + ((bVar.hashCode() + iHashCode) * 31);
    }

    public final String toString() {
        return "Input(imageLoader=" + this.f20363a + ", request=" + this.f20364b + ", modelEqualityDelegate=" + this.f20365c + ")";
    }
}
