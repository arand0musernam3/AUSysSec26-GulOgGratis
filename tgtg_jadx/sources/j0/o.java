package j0;

import com.braze.h2;
import e0.h1;
import e0.i1;
import e0.j1;
import e0.k1;
import e0.p1;
import e0.x0;
import e0.y0;
import i0.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements AutoCloseable, h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f24304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f24305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f24306c = new z(a0.f24282b);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f24307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f24308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i4.a f24309f;

    public o(g0 g0Var, n nVar) {
        this.f24304a = g0Var;
        this.f24305b = nVar;
        v70.i iVar = g0Var.f22656e;
        LinkedHashMap linkedHashMap = new LinkedHashMap(w0.a(iVar.f42051i));
        Iterator it = iVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            int i11 = ((p1) entry.getKey()).f15397a;
            if (g0Var.a(i11) == null) {
                h2.b("Required value was null.");
                throw null;
            }
            g0Var.e(i11).getClass();
            throw null;
        }
        this.f24307d = linkedHashMap;
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(e0.o(setKeySet, 10));
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            e0.e0 e0VarA = this.f24304a.a(((p1) it2.next()).f15397a);
            if (e0VarA == null) {
                h2.b("Required value was null.");
                throw null;
            }
            arrayList.add(e0VarA);
        }
        this.f24308e = CollectionsKt.v0(arrayList);
        this.f24309f = new i4.a();
    }

    @Override // e0.h1
    public final void H(k1 k1Var, long j9, j1 j1Var) throws Throwable {
        this.f24306c.e(j9, new y0(10));
        if (j1Var.B()) {
            return;
        }
        Iterator it = k1Var.I().keySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) this.f24307d.get(new p1(((p1) it.next()).f15397a));
            if (map != null) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    ((z) it2.next()).a(j9);
                }
            }
        }
    }

    @Override // e0.h1
    public final void I(k1 k1Var, long j9, int i11, int i12) {
        Map map = (Map) this.f24307d.get(new p1(i11));
        if (map == null) {
            return;
        }
        if (this.f24304a.e(i11) == null) {
            h2.b("Required value was null.");
        } else {
            if (!map.containsKey(new x0(i12))) {
                h2.b("Check failed.");
                return;
            }
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((z) it.next()).a(j9);
            }
        }
    }

    @Override // e0.h1
    public final void L(k1 k1Var, long j9, f0.n nVar) throws Throwable {
        this.f24306c.e(j9, nVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f24305b.close();
        this.f24306c.close();
        Iterator it = this.f24307d.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((Map) it.next()).values().iterator();
            while (it2.hasNext()) {
                ((z) it2.next()).close();
            }
        }
    }

    @Override // e0.h1
    public final void r(k1 k1Var, long j9, long j11) throws Throwable {
        k1Var.getClass();
        u uVar = new u(k1Var, j9, j11, this.f24308e);
        this.f24306c.g(j9, j11, j9, uVar.f24322d);
        v70.e eVar = uVar.f24323e;
        int iB = eVar.b();
        for (int i11 = 0; i11 < iB; i11++) {
            r rVar = (r) eVar.get(i11);
            Object obj = this.f24307d.get(new p1(rVar.f24314c));
            if (obj == null) {
                h2.b("Required value was null.");
                return;
            }
            Object obj2 = ((Map) obj).get(new x0(rVar.f24315d));
            if (obj2 == null) {
                h2.b("Required value was null.");
                return;
            }
            z zVar = (z) obj2;
            zVar.g(j9, j11, j11, rVar);
            if (!k1Var.I().keySet().contains(new p1(rVar.f24314c))) {
                zVar.a(uVar.f24319a);
            }
        }
        p pVar = new p(uVar);
        this.f24309f.getClass();
        if (!k1Var.O()) {
            this.f24305b.a(k1Var.e());
        }
        pVar.a();
    }

    @Override // e0.h1
    public final void t(i1 i1Var) {
        i1Var.getClass();
        this.f24305b.a(i1Var);
    }
}
