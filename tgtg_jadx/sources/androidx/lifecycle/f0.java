package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends Lifecycle {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r.a f3434c = new r.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Lifecycle.State f3435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f3436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3439h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f3440i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a2 f3441j;

    public f0(LifecycleOwner lifecycleOwner, boolean z11) {
        this.f3433b = z11;
        Lifecycle.State state = Lifecycle.State.INITIALIZED;
        this.f3435d = state;
        this.f3440i = new ArrayList();
        this.f3436e = new WeakReference(lifecycleOwner);
        this.f3441j = y80.r.c(state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void a(d0 d0Var) {
        c0 d0Var2;
        LifecycleOwner lifecycleOwner;
        d0Var.getClass();
        f("addObserver");
        Lifecycle.State state = this.f3435d;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        state2.getClass();
        e0 e0Var = new e0();
        HashMap map = g0.f3446a;
        boolean z11 = d0Var instanceof c0;
        boolean z12 = d0Var instanceof h;
        Object obj = null;
        if (z11 && z12) {
            d0Var2 = new androidx.activity.d0((h) d0Var, (c0) d0Var);
        } else if (z12) {
            d0Var2 = new androidx.activity.d0((h) d0Var, (c0) null);
        } else if (z11) {
            d0Var2 = (c0) d0Var;
        } else {
            Class<?> cls = d0Var.getClass();
            int i11 = 2;
            if (g0.b(cls) == 2) {
                Object obj2 = g0.f3447b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    g0.a((Constructor) list.get(0), d0Var);
                    throw null;
                }
                int size = list.size();
                o[] oVarArr = new o[size];
                if (size > 0) {
                    g0.a((Constructor) list.get(0), d0Var);
                    throw null;
                }
                d0Var2 = new ea.b(oVarArr, i11);
            } else {
                d0Var2 = new androidx.activity.d0(d0Var);
            }
        }
        e0Var.f3430b = d0Var2;
        e0Var.f3429a = state2;
        r.a aVar = this.f3434c;
        r.c cVarB = aVar.b(d0Var);
        if (cVarB != null) {
            obj = cVarB.f37419b;
        } else {
            HashMap map2 = aVar.f37414e;
            r.c cVar = new r.c(d0Var, e0Var);
            aVar.f37428d++;
            r.c cVar2 = aVar.f37426b;
            if (cVar2 == null) {
                aVar.f37425a = cVar;
                aVar.f37426b = cVar;
            } else {
                cVar2.f37420c = cVar;
                cVar.f37421d = cVar2;
                aVar.f37426b = cVar;
            }
            map2.put(d0Var, cVar);
        }
        if (((e0) obj) == null && (lifecycleOwner = (LifecycleOwner) this.f3436e.get()) != null) {
            boolean z13 = this.f3437f != 0 || this.f3438g;
            Lifecycle.State stateE = e(d0Var);
            this.f3437f++;
            while (e0Var.f3429a.compareTo(stateE) < 0 && this.f3434c.f37414e.containsKey(d0Var)) {
                Lifecycle.State state3 = e0Var.f3429a;
                ArrayList arrayList = this.f3440i;
                arrayList.add(state3);
                u uVar = w.Companion;
                Lifecycle.State state4 = e0Var.f3429a;
                uVar.getClass();
                w wVarB = u.b(state4);
                if (wVarB == null) {
                    m0.i1.q(e0Var.f3429a, "no event up from ");
                    return;
                } else {
                    e0Var.a(lifecycleOwner, wVarB);
                    arrayList.remove(arrayList.size() - 1);
                    stateE = e(d0Var);
                }
            }
            if (!z13) {
                j();
            }
            this.f3437f--;
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    public final Lifecycle.State b() {
        return this.f3435d;
    }

    @Override // androidx.lifecycle.Lifecycle
    public final y80.h1 c() {
        return new y80.h1(this.f3441j);
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void d(d0 d0Var) {
        d0Var.getClass();
        f("removeObserver");
        this.f3434c.c(d0Var);
    }

    public final Lifecycle.State e(d0 d0Var) {
        HashMap map = this.f3434c.f37414e;
        r.c cVar = map.containsKey(d0Var) ? ((r.c) map.get(d0Var)).f37421d : null;
        Lifecycle.State state = cVar != null ? ((e0) cVar.f37419b).f3429a : null;
        ArrayList arrayList = this.f3440i;
        Lifecycle.State state2 = arrayList.isEmpty() ? null : (Lifecycle.State) j4.s.d(1, arrayList);
        Lifecycle.State state3 = this.f3435d;
        state3.getClass();
        if (state == null || state.compareTo(state3) >= 0) {
            state = state3;
        }
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }

    public final void f(String str) {
        if (!this.f3433b || q.a.H().f35696f.I()) {
            return;
        }
        e40.a.g(w.a0.p("Method ", str, " must be called on the main thread"));
    }

    public final void g(w wVar) {
        wVar.getClass();
        f("handleLifecycleEvent");
        h(wVar.a());
    }

    public final void h(Lifecycle.State state) {
        if (this.f3435d == state) {
            return;
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.f3436e.get();
        Lifecycle.State state2 = this.f3435d;
        state2.getClass();
        state.getClass();
        if (state2 == Lifecycle.State.INITIALIZED && state == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException(("State must be at least '" + Lifecycle.State.CREATED + "' to be moved to '" + state + "' in component " + lifecycleOwner).toString());
        }
        Lifecycle.State state3 = Lifecycle.State.DESTROYED;
        if (state2 == state3 && state2 != state) {
            throw new IllegalStateException(("State is '" + state3 + "' and cannot be moved to `" + state + "` in component " + lifecycleOwner).toString());
        }
        this.f3435d = state;
        if (this.f3438g || this.f3437f != 0) {
            this.f3439h = true;
            return;
        }
        this.f3438g = true;
        j();
        this.f3438g = false;
        if (this.f3435d == state3) {
            this.f3434c = new r.a();
        }
    }

    public final void i(Lifecycle.State state) {
        state.getClass();
        f("setCurrentState");
        h(state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r7.f3439h = false;
        r7.f3441j.j(r7.f3435d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.f0.j():void");
    }
}
