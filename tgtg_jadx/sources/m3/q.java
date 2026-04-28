package m3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f29375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f29376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashSet f29377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f29378e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k1 f29379f = new k1(u3.i.f40658g, f.f29273e);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s f29380g;

    public q(s sVar, long j9, boolean z11, boolean z12, jb.b bVar) {
        this.f29380g = sVar;
        this.f29374a = j9;
        this.f29375b = z11;
        this.f29376c = z12;
    }

    @Override // m3.x
    public final void a(g0 g0Var, Function2 function2) {
        this.f29380g.f29418b.a(g0Var, function2);
    }

    @Override // m3.x
    public final q1.i1 b(g0 g0Var, wy.o oVar, Function2 function2) {
        return this.f29380g.f29418b.b(g0Var, oVar, function2);
    }

    @Override // m3.x
    public final void c(a1 a1Var) {
        this.f29380g.f29418b.c(a1Var);
    }

    @Override // m3.x
    public final void d() {
        s sVar = this.f29380g;
        sVar.A--;
    }

    @Override // m3.x
    public final boolean e() {
        return this.f29380g.f29418b.e();
    }

    @Override // m3.x
    public final boolean f() {
        return this.f29375b;
    }

    @Override // m3.x
    public final boolean g() {
        return this.f29376c;
    }

    @Override // m3.x
    public final long h() {
        return this.f29374a;
    }

    @Override // m3.x
    public final w i() {
        return this.f29380g.f29424h;
    }

    @Override // m3.x
    public final u3.i j() {
        return (u3.i) this.f29379f.getValue();
    }

    @Override // m3.x
    public final CoroutineContext k() {
        return this.f29380g.f29418b.k();
    }

    @Override // m3.x
    public final boolean l() {
        return this.f29380g.f29418b.l();
    }

    @Override // m3.x
    public final void m(a1 a1Var) {
        this.f29380g.f29418b.m(a1Var);
    }

    @Override // m3.x
    public final void n(g0 g0Var) {
        s sVar = this.f29380g;
        sVar.f29418b.n(sVar.f29424h);
        sVar.f29418b.n(g0Var);
    }

    @Override // m3.x
    public final void o(a1 a1Var, z0 z0Var, c cVar) {
        this.f29380g.f29418b.o(a1Var, z0Var, cVar);
    }

    @Override // m3.x
    public final z0 p(a1 a1Var) {
        return this.f29380g.f29418b.p(a1Var);
    }

    @Override // m3.x
    public final q1.i1 q(g0 g0Var, wy.o oVar, q1.i1 i1Var) {
        return this.f29380g.f29418b.q(g0Var, oVar, i1Var);
    }

    @Override // m3.x
    public final void r(Set set) {
        HashSet hashSet = this.f29377d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f29377d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // m3.x
    public final void s(s sVar) {
        this.f29378e.add(sVar);
    }

    @Override // m3.x
    public final void t(w1 w1Var) {
        this.f29380g.f29418b.t(w1Var);
    }

    @Override // m3.x
    public final void u(a0 a0Var) {
        this.f29380g.f29418b.u(a0Var);
    }

    @Override // m3.x
    public final g v(defpackage.a aVar) {
        return this.f29380g.f29418b.v(aVar);
    }

    @Override // m3.x
    public final void w() {
        this.f29380g.A++;
    }

    @Override // m3.x
    public final void x(n nVar) {
        HashSet<Set> hashSet = this.f29377d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                nVar.getClass();
                set.remove(((s) nVar).x());
            }
        }
        TypeIntrinsics.asMutableCollection(this.f29378e).remove(nVar);
    }

    @Override // m3.x
    public final void y(a0 a0Var) {
        this.f29380g.f29418b.y(a0Var);
    }

    public final void z() {
        LinkedHashSet<s> linkedHashSet = this.f29378e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.f29377d;
        if (hashSet != null) {
            for (s sVar : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(sVar.x());
                }
            }
        }
        linkedHashSet.clear();
    }
}
