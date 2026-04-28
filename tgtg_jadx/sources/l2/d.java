package l2;

import i4.g0;
import i4.h;
import i4.l;
import i4.m0;
import i4.v0;
import i80.n;
import z5.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f26788a;

    public d(n nVar) {
        this.f26788a = nVar;
    }

    @Override // i4.v0
    public final g0 a(long j9, m mVar, z5.c cVar) {
        h hVarA = l.a();
        this.f26788a.invoke(hVarA, new h4.e(j9), mVar);
        hVarA.f23258a.close();
        return new m0(hVarA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        d dVar = obj instanceof d ? (d) obj : null;
        return (dVar != null ? dVar.f26788a : null) == this.f26788a;
    }

    public final int hashCode() {
        return this.f26788a.hashCode();
    }
}
