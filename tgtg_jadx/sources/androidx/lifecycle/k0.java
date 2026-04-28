package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.braze.h2;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f3468k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r.f f3470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f3473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f3474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3476h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3477i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a8.f f3478j;

    public k0() {
        this.f3469a = new Object();
        this.f3470b = new r.f();
        this.f3471c = 0;
        Object obj = f3468k;
        this.f3474f = obj;
        this.f3478j = new a8.f(this, 1);
        this.f3473e = obj;
        this.f3475g = -1;
    }

    public static void a(String str) {
        if (q.a.H().f35696f.I()) {
            return;
        }
        h2.b(w.a0.p("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(j0 j0Var) {
        if (j0Var.f3461b) {
            if (!j0Var.d()) {
                j0Var.a(false);
                return;
            }
            int i11 = j0Var.f3462c;
            int i12 = this.f3475g;
            if (i11 >= i12) {
                return;
            }
            j0Var.f3462c = i12;
            j0Var.f3460a.a(this.f3473e);
        }
    }

    public final void c(j0 j0Var) {
        if (this.f3476h) {
            this.f3477i = true;
            return;
        }
        this.f3476h = true;
        do {
            this.f3477i = false;
            if (j0Var != null) {
                b(j0Var);
                j0Var = null;
            } else {
                r.f fVar = this.f3470b;
                fVar.getClass();
                r.d dVar = new r.d(fVar);
                fVar.f37427c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((j0) ((Map.Entry) dVar.next()).getValue());
                    if (this.f3477i) {
                        break;
                    }
                }
            }
        } while (this.f3477i);
        this.f3476h = false;
    }

    public final Object d() {
        Object obj = this.f3473e;
        if (obj != f3468k) {
            return obj;
        }
        return null;
    }

    public void e(LifecycleOwner lifecycleOwner, p0 p0Var) {
        Object obj;
        a("observe");
        if (lifecycleOwner.getLifecycle().b() == Lifecycle.State.DESTROYED) {
            return;
        }
        i0 i0Var = new i0(this, lifecycleOwner, p0Var);
        r.f fVar = this.f3470b;
        r.c cVarB = fVar.b(p0Var);
        if (cVarB != null) {
            obj = cVarB.f37419b;
        } else {
            r.c cVar = new r.c(p0Var, i0Var);
            fVar.f37428d++;
            r.c cVar2 = fVar.f37426b;
            if (cVar2 == null) {
                fVar.f37425a = cVar;
                fVar.f37426b = cVar;
            } else {
                cVar2.f37420c = cVar;
                cVar.f37421d = cVar2;
                fVar.f37426b = cVar;
            }
            obj = null;
        }
        j0 j0Var = (j0) obj;
        if (j0Var != null && !j0Var.c(lifecycleOwner)) {
            i4.a.f("Cannot add the same observer with different lifecycles");
        } else {
            if (j0Var != null) {
                return;
            }
            lifecycleOwner.getLifecycle().a(i0Var);
        }
    }

    public final void f(p0 p0Var) {
        Object obj;
        a("observeForever");
        h0 h0Var = new h0(this, p0Var);
        r.f fVar = this.f3470b;
        r.c cVarB = fVar.b(p0Var);
        if (cVarB != null) {
            obj = cVarB.f37419b;
        } else {
            r.c cVar = new r.c(p0Var, h0Var);
            fVar.f37428d++;
            r.c cVar2 = fVar.f37426b;
            if (cVar2 == null) {
                fVar.f37425a = cVar;
                fVar.f37426b = cVar;
            } else {
                cVar2.f37420c = cVar;
                cVar.f37421d = cVar2;
                fVar.f37426b = cVar;
            }
            obj = null;
        }
        j0 j0Var = (j0) obj;
        if (j0Var instanceof i0) {
            i4.a.f("Cannot add the same observer with different lifecycles");
        } else {
            if (j0Var != null) {
                return;
            }
            h0Var.a(true);
        }
    }

    public void i(Object obj) {
        boolean z11;
        synchronized (this.f3469a) {
            z11 = this.f3474f == f3468k;
            this.f3474f = obj;
        }
        if (z11) {
            q.a.H().I(this.f3478j);
        }
    }

    public void j(p0 p0Var) {
        a("removeObserver");
        j0 j0Var = (j0) this.f3470b.c(p0Var);
        if (j0Var == null) {
            return;
        }
        j0Var.b();
        j0Var.a(false);
    }

    public void k(Object obj) {
        a("setValue");
        this.f3475g++;
        this.f3473e = obj;
        c(null);
    }

    public void g() {
    }

    public void h() {
    }

    public k0(Object obj) {
        this.f3469a = new Object();
        this.f3470b = new r.f();
        this.f3471c = 0;
        this.f3474f = f3468k;
        this.f3478j = new a8.f(this, 1);
        this.f3473e = obj;
        this.f3475g = 0;
    }
}
