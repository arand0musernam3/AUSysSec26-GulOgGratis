package i0;

import android.os.Build;
import android.util.Log;
import com.braze.h2;
import e0.i1;
import e0.m0;
import e0.n0;
import e0.o0;
import e0.p0;
import e0.q0;
import e0.u0;
import f0.m1;
import f0.n1;
import f0.t1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0.r f22739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0.n f22740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f22741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f22742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a2 f22743e;

    public v(h0.n nVar, e0.r rVar, e0.n nVar2, z zVar, List list, n1 n1Var) {
        nVar.getClass();
        nVar2.getClass();
        zVar.getClass();
        list.getClass();
        n1Var.getClass();
        this.f22739a = rVar;
        this.f22740b = nVar2;
        this.f22742d = nVar2.l;
        Map map = nVar2.f15378j;
        Map map2 = nVar2.f15380m;
        u0 u0Var = t1.f16915c;
        Object obj = map.get(u0Var);
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(obj, bool) || Intrinsics.areEqual(map2.get(u0Var), bool)) {
            Log.i("CXCP", u0Var + " is set to true, ignoring GraphState3A parameters.");
        }
        e0.p pVar = nVar2.f15382o;
        pVar.getClass();
        n1Var.f16785b.getClass();
        androidx.constraintlayout.widget.z zVar2 = pVar.f15391b;
        Set set = (Set) n1.f16782c.get(Build.MANUFACTURER);
        int iMax = (set == null || !set.contains(Build.DEVICE) || Build.VERSION.SDK_INT >= 34) ? 0 : Math.max(0, 10);
        e0.q qVar = (e0.q) zVar2.f2543c;
        int iMax2 = zVar2.f2542b;
        int i11 = m1.$EnumSwitchMapping$0[qVar.ordinal()];
        if (i11 == 1) {
            iMax2 = Math.max(iMax, iMax2);
        } else if (i11 != 2) {
            e40.a.f();
            throw null;
        }
        e eVar = iMax2 != 0 ? new e(iMax2) : null;
        u uVar = new u(rVar, map, map2, CollectionsKt.d0(kotlin.collections.d0.i(eVar), list), kotlin.collections.y.w(new Object[]{zVar, eVar}), nVar.f20981a, nVar.f20988h);
        this.f22741c = uVar;
        if (eVar != null) {
            if (eVar.f22624c != null) {
                h2.b("GraphLoop has already been set!");
                throw null;
            }
            eVar.f22624c = uVar;
            uVar.G(false);
            Log.w("CXCP", "Capture processing has been disabled for " + uVar + " until " + eVar.f22622a + " frames have been completed.");
        }
        this.f22743e = y80.r.c(o0.f15388b);
    }

    public final void a(m0 m0Var) {
        a2 a2Var;
        Object value;
        q0 q0Var;
        Log.d("CXCP", this + " onGraphError(" + m0Var + ')');
        do {
            a2Var = this.f22743e;
            value = a2Var.getValue();
            q0Var = (q0) value;
        } while (!a2Var.g(value, ((q0Var instanceof p0) || (q0Var instanceof o0)) ? o0.f15388b : m0Var));
        for (w.e0 e0Var : this.f22742d) {
            e0Var.getClass();
            e0Var.f42674a.b(e0Var.a(), m0Var);
        }
    }

    public final void b(w wVar) {
        Log.d("CXCP", this + " onGraphStarted");
        n0 n0Var = n0.f15383b;
        this.f22743e.j(n0Var);
        this.f22741c.H(wVar);
        for (w.e0 e0Var : this.f22742d) {
            e0Var.f42674a.b(e0Var.a(), n0Var);
        }
    }

    public final void c() {
        Log.d("CXCP", this + " onGraphStopped");
        a2 a2Var = this.f22743e;
        o0 o0Var = o0.f15388b;
        a2Var.j(o0Var);
        this.f22741c.H(null);
        for (w.e0 e0Var : this.f22742d) {
            e0Var.f42674a.b(e0Var.a(), o0Var);
        }
    }

    public final void d(i1 i1Var) {
        u uVar = this.f22741c;
        synchronized (uVar.f22727h) {
            try {
                i1 i1Var2 = uVar.f22730k;
                uVar.f22730k = i1Var;
                if (i1Var2 != null || i1Var != null) {
                    androidx.lifecycle.n1 n1Var = uVar.f22726g;
                    if (i1Var != null) {
                        n1Var.C(new m(i1Var));
                    } else {
                        n1Var.C(i.f22695d);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i1Var == null) {
            int size = uVar.f22723d.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((q) uVar.f22723d.get(i11)).c();
            }
        }
    }

    public final boolean e(Map map) {
        map.getClass();
        u uVar = this.f22741c;
        uVar.getClass();
        if (uVar.g() != null) {
            return uVar.f22726g.C(new o(map));
        }
        h2.b("Cannot submit parameters without an active repeating request!");
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void f(LinkedHashMap linkedHashMap) {
        u uVar = this.f22741c;
        uVar.getClass();
        synchronized (uVar.f22727h) {
            uVar.f22731m = linkedHashMap;
            uVar.f22726g.C(new l(uVar.l, linkedHashMap));
        }
    }

    public final String toString() {
        return "GraphProcessor(cameraGraph: " + this.f22739a + ')';
    }
}
