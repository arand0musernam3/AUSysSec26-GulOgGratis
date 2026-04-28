package b0;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0.b0 f5147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w.e f5148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w2.z f5149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w.s0 f5150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o1 f5151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w.o f5152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t70.a f5153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t70.a f5154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m0.z f5155i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f5156j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f5157k;
    public final LinkedHashSet l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedHashSet f5158m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f5159n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f5160o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f5161p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LinkedHashSet f5162q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r1 f5163r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w.q0 f5164s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c0.b f5165t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a3.x0 f5166u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile a0.e f5167v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f5168w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final LinkedHashSet f5169x;

    public e3(e0.b0 b0Var, w.e eVar, w2.z zVar, w.s0 s0Var, o1 o1Var, Set set, d0.a aVar, w.o oVar, ag.d dVar, t70.a aVar2, t70.a aVar3, s0.y0 y0Var, n nVar, m0.z zVar2, l lVar, Context context, e1 e1Var) {
        eVar.getClass();
        s0Var.getClass();
        o1Var.getClass();
        set.getClass();
        aVar.getClass();
        oVar.getClass();
        dVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        y0Var.getClass();
        nVar.getClass();
        lVar.getClass();
        context.getClass();
        this.f5147a = b0Var;
        this.f5148b = eVar;
        this.f5149c = zVar;
        this.f5150d = s0Var;
        this.f5151e = o1Var;
        this.f5152f = oVar;
        this.f5153g = dVar;
        this.f5154h = aVar3;
        this.f5155i = zVar2;
        this.f5156j = lVar;
        this.f5157k = new Object();
        this.l = new LinkedHashSet();
        this.f5158m = new LinkedHashSet();
        this.f5160o = true;
        this.f5161p = true;
        this.f5162q = new LinkedHashSet();
        this.f5163r = new r1(nVar, new q1(), e1Var);
        e0.v vVar = nVar.f5321b;
        this.f5164s = new w.q0(context, vVar, y0Var, o0.b.f31617m0);
        this.f5165t = new c0.b(vVar);
        this.f5166u = new a3.x0(this, 11);
        this.f5168w = new ArrayList();
        LinkedHashSet linkedHashSetU0 = CollectionsKt.u0(set);
        linkedHashSetU0.add(aVar);
        this.f5169x = linkedHashSetU0;
    }

    public final boolean a(LinkedHashSet linkedHashSet) {
        if (((Boolean) this.f5155i.f28649a.i(m0.z.l, Boolean.TRUE)).booleanValue() && !this.l.contains(this.f5163r) && i(linkedHashSet)) {
            b();
            return true;
        }
        if (!linkedHashSet.contains(this.f5163r) || i(linkedHashSet)) {
            return false;
        }
        r1 r1Var = this.f5163r;
        r1Var.getClass();
        synchronized (this.f5157k) {
            if (this.f5158m.remove(r1Var)) {
                k();
            }
        }
        f(kotlin.collections.c0.c(r1Var));
        r1Var.A((s0.i0) this.f5153g.get());
        return true;
    }

    public final void b() {
        r1 r1Var = this.f5163r;
        r1Var.b((s0.i0) this.f5153g.get(), null, null, null);
        r1Var.F();
        c(kotlin.collections.c0.c(r1Var));
        synchronized (this.f5157k) {
            if (this.f5158m.add(r1Var)) {
                k();
            }
        }
    }

    public final void c(List list) {
        list.getClass();
        synchronized (this.f5157k) {
            if (list.isEmpty()) {
                if (wd.a.B(5, "CXCP")) {
                    Log.w("CXCP", "Attach [] from " + this + " (Ignored)");
                }
                return;
            }
            if (wd.a.B(3, "CXCP")) {
                Log.d("CXCP", "Attaching " + list + " from " + this);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!this.l.contains((m0.m1) obj)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((m0.m1) it.next()).u();
            }
            if (this.l.addAll(list) && !a(CollectionsKt.S(this.l, this.f5158m))) {
                m();
                this.f5151e.b(CollectionsKt.r0(this.l));
                j(this.l);
            }
            if (this.f5160o) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((m0.m1) it2.next()).s();
                }
            } else {
                this.f5162q.addAll(arrayList);
            }
        }
    }

    public final Object d(z70.i iVar) {
        List listR0;
        synchronized (this.f5157k) {
            e();
            this.f5163r.y();
            listR0 = CollectionsKt.r0(this.f5168w);
        }
        Object objZ = v80.f0.z(listR0, iVar);
        return objZ == y70.a.COROUTINE_SUSPENDED ? objZ : Unit.f26487a;
    }

    public final void e() {
        v80.i1 i1VarA;
        l2 l2VarG = g();
        this.f5167v = null;
        w.e eVar = this.f5148b;
        m0.q qVar = (m0.q) this.f5154h.get();
        eVar.getClass();
        qVar.getClass();
        synchronized (eVar.f42668b) {
            try {
                if (eVar.f42673g) {
                    ArrayList arrayList = eVar.f42671e;
                    e0.v vVar = (e0.v) pd.g.L(qVar, Reflection.getOrCreateKotlinClass(e0.v.class));
                    String str = vVar != null ? ((f0.t0) vVar).f16904a : null;
                    e0.s sVar = str != null ? new e0.s(str) : null;
                    if (sVar == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    arrayList.remove(sVar.f15403a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (l2VarG != null) {
            if (l2VarG.f5299h.a()) {
                l2VarG.f5294c.close();
                i1VarA = v80.f0.B(l2VarG.f5293b.f5270f, null, null, new a3.b2(null, l2VarG), 3);
            } else {
                i1VarA = v80.f0.a(Unit.f26487a);
            }
            this.f5168w.add(i1VarA);
            i1VarA.J(new a3.p(9, this, i1VarA));
        }
        synchronized (this.f5157k) {
        }
    }

    public final void f(List list) {
        list.getClass();
        synchronized (this.f5157k) {
            if (list.isEmpty()) {
                if (wd.a.B(5, "CXCP")) {
                    Log.w("CXCP", "Detaching [] from " + this + " (Ignored)");
                }
                return;
            }
            if (wd.a.B(3, "CXCP")) {
                Log.d("CXCP", "Detaching " + list + " from " + this);
            }
            this.f5158m.removeAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m0.m1 m1Var = (m0.m1) it.next();
                if (this.l.contains(m1Var)) {
                    m1Var.v();
                }
            }
            if (this.l.removeAll(list)) {
                if (a(CollectionsKt.S(this.l, this.f5158m))) {
                    return;
                }
                if (this.l.isEmpty()) {
                    this.f5150d.f(false);
                    this.f5151e.b(kotlin.collections.n0.f26529a);
                } else {
                    m();
                    this.f5151e.b(CollectionsKt.r0(this.l));
                }
                j(this.l);
            }
            this.f5162q.removeAll(list);
        }
    }

    public final l2 g() {
        a0.e eVar = this.f5167v;
        if (eVar != null) {
            return (l2) ((s70.c) eVar.f61m).get();
        }
        return null;
    }

    public final int h() {
        int i11;
        synchronized (this.f5157k) {
            w.e eVar = this.f5148b;
            synchronized (eVar.f42668b) {
                i11 = eVar.f42672f;
            }
            return i11 == 2 ? 1 : 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a7  */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(java.util.LinkedHashSet r34) {
        /*
            Method dump skipped, instruction units count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.e3.i(java.util.LinkedHashSet):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(LinkedHashSet linkedHashSet) {
        e();
        List listR0 = CollectionsKt.r0(linkedHashSet);
        Object[] objArr = 0;
        if (listR0.isEmpty()) {
            for (h2 h2Var : this.f5169x) {
                h2Var.a(null);
                h2Var.reset();
            }
            return;
        }
        if (!this.f5160o) {
            Iterator it = this.f5169x.iterator();
            while (it.hasNext()) {
                ((h2) it.next()).a(null);
            }
        }
        w.e0 e0Var = new w.e0(this.f5152f);
        synchronized (this.f5157k) {
        }
        w.l0 l0Var = new w.l0(listR0, this.f5161p);
        l lVar = this.f5156j;
        a3.x0 x0Var = this.f5166u;
        synchronized (this.f5157k) {
        }
        lVar.getClass();
        x0Var.getClass();
        a0.h hVar = new a0.h(x0Var, e0Var, l0Var, u70.l.b(new a0.g(l0Var, lVar, e0Var, 0)));
        if (!this.f5160o) {
            w.e eVar = this.f5148b;
            m0.q qVar = (m0.q) this.f5154h.get();
            eVar.getClass();
            qVar.getClass();
            synchronized (eVar.f42668b) {
                try {
                    if (eVar.f42673g) {
                        ArrayList arrayList = eVar.f42671e;
                        e0.v vVar = (e0.v) pd.g.L(qVar, Reflection.getOrCreateKotlinClass(e0.v.class));
                        String str = vVar != null ? ((f0.t0) vVar).f16904a : null;
                        e0.s sVar = str != null ? new e0.s(str) : null;
                        if (sVar == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        arrayList.add(sVar.f15403a);
                        synchronized (eVar.f42668b) {
                            eVar.f42670d.getClass();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        w2.z zVar = this.f5149c;
        this.f5167v = new a0.e((a0.a) zVar.f43083b, (a0.c) zVar.f43084c, hVar);
        l2 l2VarG = g();
        if (l2VarG == null) {
            com.braze.h2.b("Required value was null.");
            return;
        }
        v80.f0.B(l2VarG.f5293b.f5270f, null, null, new a3.y((x70.c) (objArr == true ? 1 : 0), (Object) l2VarG, 4), 3);
        Iterator it2 = this.f5169x.iterator();
        while (it2.hasNext()) {
            ((h2) it2.next()).a(l2VarG.f5294c);
        }
        v80.f0.B(l2VarG.f5293b.f5270f, null, null, new j2((x70.c) null, l2VarG, this.f5159n), 3);
        l(CollectionsKt.S(this.l, this.f5158m));
        if (wd.a.B(3, "CXCP")) {
            Log.d("CXCP", "Notifying " + this.f5162q + " camera control ready");
        }
        Iterator it3 = this.f5162q.iterator();
        while (it3.hasNext()) {
            ((m0.m1) it3.next()).s();
        }
        this.f5162q.clear();
    }

    public final void k() {
        if (this.l.isEmpty()) {
            return;
        }
        LinkedHashSet linkedHashSetS = CollectionsKt.S(this.l, this.f5158m);
        if (((Boolean) this.f5155i.f28649a.i(m0.z.l, Boolean.TRUE)).booleanValue() && !this.l.contains(this.f5163r) && i(linkedHashSetS)) {
            b();
            return;
        }
        if (!linkedHashSetS.contains(this.f5163r) || i(linkedHashSetS)) {
            l(linkedHashSetS);
            return;
        }
        r1 r1Var = this.f5163r;
        r1Var.getClass();
        synchronized (this.f5157k) {
            if (this.f5158m.remove(r1Var)) {
                k();
            }
        }
        f(kotlin.collections.c0.c(r1Var));
        r1Var.A((s0.i0) this.f5153g.get());
    }

    public final void l(LinkedHashSet linkedHashSet) {
        l2 l2VarG = g();
        if (l2VarG != null) {
            l2VarG.f5294c.g(linkedHashSet, this.f5161p);
            for (h2 h2Var : this.f5169x) {
                if (h2Var instanceof d3) {
                    ((d3) h2Var).b(linkedHashSet);
                }
            }
        }
    }

    public final void m() {
        boolean z11 = false;
        LinkedHashSet linkedHashSet = this.l;
        if (linkedHashSet == null || !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((Boolean) ((m0.m1) it.next()).f28560i.i(s0.o2.S0, Boolean.FALSE)).booleanValue()) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f5150d.f(z11);
    }

    public final String toString() {
        return "UseCaseManager<" + this.f5156j + '>';
    }
}
