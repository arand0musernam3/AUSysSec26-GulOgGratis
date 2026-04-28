package i0;

import a3.b2;
import android.util.Log;
import androidx.lifecycle.n1;
import com.braze.h2;
import com.google.android.gms.internal.measurement.cg;
import e0.h1;
import e0.i1;
import g3.q9;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.o0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0.r f22720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f22721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f22722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f22723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v80.b0 f22724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a90.d f22725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f22726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f22727h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f22728i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w f22729j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i1 f22730k;
    public final Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f22731m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r80.a f22732n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i1 f22733o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Map f22734p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Map f22735q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Map f22736r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f22737s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public w f22738t;

    public u(e0.r rVar, Map map, Map map2, ArrayList arrayList, ArrayList arrayList2, v80.b0 b0Var, v80.x xVar) {
        map.getClass();
        map2.getClass();
        b0Var.getClass();
        this.f22720a = rVar;
        this.f22721b = map;
        this.f22722c = map2;
        this.f22723d = arrayList2;
        this.f22724e = b0Var;
        a90.d dVarB = v80.f0.b(xVar.plus(new v80.a0("CXCP-GraphLoop")));
        this.f22725f = dVarB;
        int i11 = 0;
        al.d dVar = new al.d(1, this, u.class, "finalizeUnprocessedCommands", "finalizeUnprocessedCommands(Ljava/util/List;)V", i11, 13);
        c6.y yVar = new c6.y(2, this, u.class, "process", "process(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i11, 2);
        n1 n1Var = new n1();
        n1Var.f3499a = dVar;
        n1Var.f3500b = yVar;
        n1Var.f3501c = w.b.p(false);
        n1Var.f3502d = cg.a(Integer.MAX_VALUE, null, new q9(n1Var, 8), 2);
        n1Var.f3503e = new kotlin.collections.t();
        if (!((r80.a) n1Var.f3501c).a()) {
            h2.b("ProcessingQueue cannot be re-started!");
            throw null;
        }
        if (v80.f0.B(dVarB, null, null, new b2(n1Var, null, 26), 3).isCancelled()) {
            n1Var.x(null);
        }
        this.f22726g = n1Var;
        this.f22727h = new Object();
        o0 o0Var = o0.f26530a;
        o0Var.getClass();
        this.l = o0Var;
        this.f22731m = o0Var;
        this.f22732n = w.b.p(true);
        this.f22734p = o0Var;
        this.f22735q = o0Var;
        this.f22736r = map2;
        this.f22737s = arrayList;
    }

    public final void A(List list, int i11, o oVar) {
        i1 i1Var = this.f22733o;
        if (i1Var == null && i11 == 0) {
            list.remove(i11);
            return;
        }
        if (this.f22732n.b() && i1Var != null && e(kotlin.collections.c0.c(i1Var), false, oVar.f22702a)) {
            list.remove(i11);
            return;
        }
        if (i11 > 0) {
            int i12 = i11 - 1;
            if (((p) list.get(i12)) instanceof m) {
                r(i12, list, false);
            } else {
                h2.b("Check failed.");
            }
        }
    }

    public final boolean B() {
        Boolean boolValueOf;
        w wVar = this.f22738t;
        if (wVar == null) {
            return false;
        }
        i1 i1Var = this.f22733o;
        if (i1Var != null) {
            boolValueOf = Boolean.valueOf(wVar.V(true, kotlin.collections.c0.c(i1Var), this.f22721b, this.f22734p, this.f22736r, this.f22737s));
        } else {
            boolValueOf = null;
        }
        return Intrinsics.areEqual(boolValueOf, Boolean.TRUE);
    }

    public final void G(boolean z11) {
        this.f22732n.f37779a = z11 ? 1 : 0;
        if (z11) {
            this.f22726g.C(i.f22693b);
        }
    }

    public final void H(w wVar) {
        synchronized (this.f22727h) {
            w wVar2 = this.f22729j;
            this.f22729j = wVar;
            if (this.f22728i) {
                x70.c cVar = null;
                this.f22729j = null;
                if (wVar != null) {
                    v80.f0.B(this.f22724e, null, null, new r(wVar, cVar, 1), 3);
                }
                return;
            }
            if (wVar2 != wVar) {
                this.f22726g.C(new n(wVar2, wVar));
            }
            if (wVar == null) {
                int size = this.f22723d.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((q) this.f22723d.get(i11)).a();
                }
            }
        }
    }

    public final void a(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            i1 i1Var = (i1) arrayList.get(i11);
            int size2 = this.f22737s.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ((h1) this.f22737s.get(i12)).t(i1Var);
            }
        }
        int size3 = arrayList.size();
        for (int i13 = 0; i13 < size3; i13++) {
            i1 i1Var2 = (i1) arrayList.get(i13);
            int size4 = i1Var2.f15358d.size();
            for (int i14 = 0; i14 < size4; i14++) {
                ((h1) i1Var2.f15358d.get(i14)).t(i1Var2);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f22727h) {
            try {
                if (this.f22728i) {
                    return;
                }
                this.f22728i = true;
                w wVar = this.f22729j;
                x70.c cVar = null;
                if (wVar != null) {
                    v80.f0.B(this.f22724e, null, null, new r(wVar, cVar, 0), 3);
                }
                this.f22729j = null;
                this.f22726g.C(i.f22694c);
                int size = this.f22723d.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((q) this.f22723d.get(i11)).b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean e(List list, boolean z11, Map map) throws Exception {
        Map mapB;
        w wVar = this.f22738t;
        if (wVar == null) {
            return false;
        }
        Map map2 = this.f22734p;
        if (map.isEmpty()) {
            mapB = this.f22736r;
        } else {
            v70.i iVar = new v70.i();
            Map map3 = this.f22735q;
            map3.getClass();
            iVar.putAll(map3);
            iVar.putAll(map);
            Map map4 = this.f22722c;
            map4.getClass();
            iVar.putAll(map4);
            mapB = iVar.b();
        }
        boolean zV = wVar.V(z11, list, this.f22721b, map2, mapB, this.f22737s);
        if (!zV) {
            if (z11) {
                Log.w("CXCP", "Failed to repeat with " + CollectionsKt.h0(list));
                return zV;
            }
            if (map.isEmpty()) {
                Log.w("CXCP", "Failed to submit capture with " + list);
                return zV;
            }
            Log.w("CXCP", "Failed to trigger with " + CollectionsKt.h0(list) + " and " + map);
        }
        return zV;
    }

    public final i1 g() {
        i1 i1Var;
        synchronized (this.f22727h) {
            i1Var = this.f22730k;
        }
        return i1Var;
    }

    public final void p(List list, int i11, j jVar, boolean z11) {
        if (this.f22732n.b()) {
            ArrayList arrayList = jVar.f22696a;
            o0 o0Var = o0.f26530a;
            o0Var.getClass();
            if (e(arrayList, false, o0Var)) {
                list.remove(i11);
                return;
            }
        }
        if (!z11 || i11 <= 0) {
            return;
        }
        int i12 = i11 - 1;
        if (((p) list.get(i12)) instanceof m) {
            r(i12, list, false);
        } else {
            h2.b("Check failed.");
        }
    }

    public final void r(int i11, List list, boolean z11) {
        int i12;
        int i13 = i11;
        while (true) {
            int i14 = 0;
            if (-1 >= i13) {
                if (!z11 || (i12 = i11 + 1) >= list.size()) {
                    return;
                }
                p pVar = (p) list.get(i12);
                if (pVar instanceof j) {
                    p(list, i12, (j) pVar, false);
                    return;
                } else {
                    if (pVar instanceof o) {
                        A(list, i12, (o) pVar);
                        return;
                    }
                    return;
                }
            }
            p pVar2 = (p) list.get(i13);
            if (pVar2 instanceof m) {
                i1 i1Var = ((m) pVar2).f22699a;
                List listC = kotlin.collections.c0.c(i1Var);
                o0 o0Var = o0.f26530a;
                o0Var.getClass();
                if (e(listC, true, o0Var)) {
                    this.f22733o = i1Var;
                    list.remove(i13);
                    while (i14 < i13) {
                        if (((p) list.get(i14)) instanceof m) {
                            list.remove(i14);
                            i13--;
                        } else {
                            i14++;
                        }
                    }
                    return;
                }
            }
            i13--;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00be -> B:37:0x00d9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d7 -> B:36:0x00d8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e6 -> B:39:0x00e7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(java.util.List r18, int r19, i0.n r20, x70.c r21) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.u.t(java.util.List, int, i0.n, x70.c):java.lang.Object");
    }

    public final String toString() {
        return "GraphLoop(" + this.f22720a + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        if (r12.S() == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cf, code lost:
    
        if (r12.S() == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x009a -> B:48:0x00d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00bf -> B:47:0x00d2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00cf -> B:47:0x00d2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.util.List r11, x70.c r12) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.u.u(java.util.List, x70.c):java.lang.Object");
    }
}
