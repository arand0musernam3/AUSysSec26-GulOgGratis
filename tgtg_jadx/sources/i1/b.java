package i1;

import android.util.Range;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.d0;
import androidx.lifecycle.q0;
import androidx.lifecycle.w;
import com.google.firebase.messaging.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m0.j0;
import m0.k;
import m0.m1;
import m0.q;
import m0.x0;
import s0.g0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d0, k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LifecycleOwner f22757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0.d f22758c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22756a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22759d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public df.g f22760e = null;

    public b(LifecycleOwner lifecycleOwner, y0.d dVar, x0 x0Var) {
        this.f22757b = lifecycleOwner;
        this.f22758c = dVar;
        if (lifecycleOwner.getLifecycle().b().a(Lifecycle.State.STARTED)) {
            dVar.r();
        } else {
            dVar.u();
        }
        lifecycleOwner.getLifecycle().a(this);
    }

    @Override // m0.k
    public final q b() {
        return this.f22758c.f44540a.f38311b;
    }

    public final void c(df.g gVar) {
        synchronized (this.f22756a) {
            try {
                df.g gVar2 = this.f22760e;
                if (gVar2 == null) {
                    this.f22760e = gVar;
                } else {
                    boolean z11 = gVar.f14894b;
                    boolean z12 = gVar2.f14894b;
                    if (z11) {
                        if (!z12) {
                            throw new IllegalStateException("Cannot bind use cases when a SessionConfig is already bound to this LifecycleOwner. Please unbind first");
                        }
                        ArrayList arrayList = new ArrayList((List) this.f22760e.f14899g);
                        arrayList.addAll((List) gVar.f14899g);
                        this.f22760e = new df.g(arrayList, (List) gVar.f14895c);
                    } else {
                        if (z12) {
                            throw new IllegalStateException("Cannot bind the SessionConfig when use cases are bound to this LifecycleOwner already. Please unbind first");
                        }
                        this.f22760e = gVar;
                        y0.d dVar = this.f22758c;
                        dVar.A((ArrayList) dVar.y());
                    }
                }
                synchronized (this.f22758c.f44550k) {
                }
                y0.d dVar2 = this.f22758c;
                List list = (List) gVar.f14895c;
                synchronized (dVar2.f44550k) {
                    dVar2.f44547h = list;
                }
                synchronized (this.f22758c.f44550k) {
                }
                y0.d dVar3 = this.f22758c;
                Range range = (Range) gVar.f14896d;
                synchronized (dVar3.f44550k) {
                    dVar3.f44548i = range;
                }
                g0 g0Var = (g0) b();
                g0Var.getClass();
                o0.c cVarV = l20.c.v(gVar, g0Var);
                ((w0.c) gVar.f14901i).execute(new r(22, cVarV, gVar));
                this.f22758c.c((List) gVar.f14899g, cVarV);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @q0(w.ON_DESTROY)
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        synchronized (this.f22756a) {
            y0.d dVar = this.f22758c;
            dVar.A((ArrayList) dVar.y());
        }
    }

    @q0(w.ON_PAUSE)
    public void onPause(LifecycleOwner lifecycleOwner) {
        this.f22758c.f44540a.j(false);
    }

    @q0(w.ON_RESUME)
    public void onResume(LifecycleOwner lifecycleOwner) {
        this.f22758c.f44540a.j(true);
    }

    @q0(w.ON_START)
    public void onStart(LifecycleOwner lifecycleOwner) {
        synchronized (this.f22756a) {
            try {
                if (!this.f22759d) {
                    this.f22758c.r();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @q0(w.ON_STOP)
    public void onStop(LifecycleOwner lifecycleOwner) {
        synchronized (this.f22756a) {
            try {
                if (!this.f22759d) {
                    this.f22758c.u();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final LifecycleOwner r() {
        LifecycleOwner lifecycleOwner;
        synchronized (this.f22756a) {
            lifecycleOwner = this.f22757b;
        }
        return lifecycleOwner;
    }

    public final List s() {
        List listUnmodifiableList;
        synchronized (this.f22756a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f22758c.y());
        }
        return listUnmodifiableList;
    }

    public final void t() {
        synchronized (this.f22756a) {
            try {
                if (this.f22759d) {
                    return;
                }
                onStop(this.f22757b);
                this.f22759d = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void u() {
        synchronized (this.f22756a) {
            List listY = this.f22758c.y();
            this.f22758c.A((ArrayList) listY);
            for (m1 m1Var : (ArrayList) listY) {
                m1Var.getClass();
                if (m1Var instanceof j0) {
                    synchronized (m1Var.f28555d) {
                    }
                }
            }
            this.f22760e = null;
        }
    }

    public final void v() {
        synchronized (this.f22756a) {
            try {
                if (this.f22759d) {
                    this.f22759d = false;
                    if (this.f22757b.getLifecycle().b().a(Lifecycle.State.STARTED)) {
                        onStart(this.f22757b);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
