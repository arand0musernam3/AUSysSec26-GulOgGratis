package i4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends g0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h4.d f23274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f23275g;

    public o0(h4.d dVar) {
        h hVarA;
        this.f23274f = dVar;
        if (nx.d.z(dVar)) {
            hVarA = null;
        } else {
            hVarA = l.a();
            h.c(hVarA, dVar);
        }
        this.f23275g = hVarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0) {
            return Intrinsics.areEqual(this.f23274f, ((o0) obj).f23274f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23274f.hashCode();
    }

    @Override // i4.g0
    public final h4.c o() {
        h4.d dVar = this.f23274f;
        return new h4.c(dVar.f21384a, dVar.f21385b, dVar.f21386c, dVar.f21387d);
    }
}
