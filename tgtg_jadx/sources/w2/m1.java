package w2;

import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lw2/m1;", "Lb5/h1;", "Lw2/n1;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m1 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1 f42985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1 f42986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m5.u0 f42987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f42988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m2.d1 f42989f;

    public m1(o1 o1Var, s1 s1Var, m5.u0 u0Var, boolean z11, m2.d1 d1Var) {
        this.f42985b = o1Var;
        this.f42986c = s1Var;
        this.f42987d = u0Var;
        this.f42988e = z11;
        this.f42989f = d1Var;
    }

    @Override // b5.h1
    public final b4.s create() {
        return new n1(this.f42985b, this.f42986c, this.f42987d, this.f42988e, this.f42989f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return this.f42988e == m1Var.f42988e && Intrinsics.areEqual(this.f42985b, m1Var.f42985b) && Intrinsics.areEqual(this.f42986c, m1Var.f42986c) && Intrinsics.areEqual(this.f42987d, m1Var.f42987d) && Intrinsics.areEqual(this.f42989f, m1Var.f42989f);
    }

    public final int hashCode() {
        return this.f42989f.hashCode() + l1.c((this.f42986c.hashCode() + ((this.f42985b.hashCode() + (Boolean.hashCode(this.f42988e) * 31)) * 31)) * 31, 961, this.f42987d);
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        n1 n1Var = (n1) sVar;
        o1 o1Var = n1Var.f42994q;
        o1 o1Var2 = this.f42985b;
        n1Var.f42994q = o1Var2;
        o1Var2.getClass();
        boolean z11 = this.f42988e;
        n1Var.f42995r = z11;
        boolean z12 = !z11;
        k1 k1Var = o1Var2.f43007a;
        k1Var.getClass();
        k1Var.f42957a.setValue(new j1(this.f42986c, this.f42987d, z11, z12, this.f42989f.f28807c == 4));
        if (Intrinsics.areEqual(o1Var, o1Var2)) {
            return;
        }
        j2.e eVar = n1Var.f42996s;
        j2.c cVar = o1Var2.f43013g;
        j2.c cVar2 = eVar.f24441o;
        if (cVar2 != null) {
            cVar2.f24440a.j(eVar);
        }
        if (cVar != null) {
            cVar.f24440a.b(eVar);
        }
        eVar.f24441o = cVar;
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
    }
}
