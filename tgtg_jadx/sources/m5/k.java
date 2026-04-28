package m5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f29568a;

    public k(p0 p0Var) {
        this.f29568a = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        p0 p0Var = this.f29568a;
        h hVar = p0Var.f29603a;
        p0 p0Var2 = ((k) obj).f29568a;
        return Intrinsics.areEqual(hVar, p0Var2.f29603a) && p0Var.f29604b.c(p0Var2.f29604b) && Intrinsics.areEqual(p0Var.f29605c, p0Var2.f29605c) && p0Var.f29606d == p0Var2.f29606d && p0Var.f29607e == p0Var2.f29607e && p0Var.f29608f == p0Var2.f29608f && Intrinsics.areEqual(p0Var.f29609g, p0Var2.f29609g) && p0Var.f29610h == p0Var2.f29610h && p0Var.f29611i == p0Var2.f29611i && z5.a.c(p0Var.f29612j, p0Var2.f29612j);
    }

    public final int hashCode() {
        p0 p0Var = this.f29568a;
        int iHashCode = p0Var.f29603a.hashCode() * 31;
        u0 u0Var = p0Var.f29604b;
        l0 l0Var = u0Var.f29655a;
        long j9 = l0Var.f29576b;
        z5.p[] pVarArr = z5.o.f47288b;
        int iHashCode2 = Long.hashCode(j9) * 31;
        q5.r rVar = l0Var.f29577c;
        int i11 = (iHashCode2 + (rVar != null ? rVar.f36049a : 0)) * 31;
        q5.n nVar = l0Var.f29578d;
        int iHashCode3 = (i11 + (nVar != null ? Integer.hashCode(nVar.f36034a) : 0)) * 31;
        q5.o oVar = l0Var.f29579e;
        int iHashCode4 = (iHashCode3 + (oVar != null ? Integer.hashCode(oVar.f36035a) : 0)) * 31;
        q5.i iVar = l0Var.f29580f;
        int iHashCode5 = (iHashCode4 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        String str = l0Var.f29581g;
        int iB = e0.f.b((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, l0Var.f29582h);
        x5.a aVar = l0Var.f29583i;
        int iHashCode6 = (iB + (aVar != null ? Float.hashCode(aVar.f43835a) : 0)) * 31;
        x5.p pVar = l0Var.f29584j;
        int iHashCode7 = (iHashCode6 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        t5.c cVar = l0Var.f29585k;
        int iHashCode8 = (iHashCode7 + (cVar != null ? cVar.f39796a.hashCode() : 0)) * 31;
        long j11 = l0Var.l;
        int i12 = i4.v.f23316i;
        u70.b0 b0Var = u70.c0.f40833b;
        int iB2 = e0.f.b(iHashCode8, 31, j11);
        a0 a0Var = l0Var.f29588o;
        int iHashCode9 = (u0Var.f29656b.hashCode() + ((iB2 + (a0Var != null ? a0Var.hashCode() : 0)) * 31)) * 31;
        b0 b0Var2 = u0Var.f29657c;
        return Long.hashCode(p0Var.f29612j) + ((p0Var.f29611i.hashCode() + ((p0Var.f29610h.hashCode() + ((p0Var.f29609g.hashCode() + r8.k.b(p0Var.f29608f, r8.k.e((e0.f.c(p0Var.f29605c, (iHashCode9 + (b0Var2 != null ? b0Var2.hashCode() : 0) + iHashCode) * 31, 31) + p0Var.f29606d) * 31, 31, p0Var.f29607e), 31)) * 31)) * 31)) * 31);
    }
}
