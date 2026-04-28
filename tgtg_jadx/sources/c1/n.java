package c1;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import androidx.core.util.Consumer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import m0.c1;
import m0.e1;
import m0.g1;
import m0.h1;
import s0.i0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f6897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f6899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s0.n f6902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6904i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h1 f6906k;
    public m l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6905j = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashSet f6907m = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6908n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f6909o = new ArrayList();

    public n(int i11, int i12, s0.n nVar, Matrix matrix, boolean z11, Rect rect, int i13, int i14, boolean z12) {
        this.f6901f = i11;
        this.f6896a = i12;
        this.f6902g = nVar;
        this.f6897b = matrix;
        this.f6898c = z11;
        this.f6899d = rect;
        this.f6904i = i13;
        this.f6903h = i14;
        this.f6900e = z12;
        this.l = new m(i12, nVar.f38402a);
    }

    public final void a() {
        pd.g.n("Edge is already closed.", !this.f6908n);
    }

    public final void b() {
        a.a.t();
        this.l.a();
        this.f6908n = true;
        this.f6909o.clear();
        this.f6907m.clear();
    }

    public final h1 c(i0 i0Var, boolean z11) {
        a.a.t();
        a();
        s0.n nVar = this.f6902g;
        h1 h1Var = new h1(nVar.f38402a, i0Var, z11, nVar.f38404c, new h(this, 0));
        try {
            e1 e1Var = h1Var.f28524k;
            m mVar = this.l;
            Objects.requireNonNull(mVar);
            if (mVar.g(e1Var, new i(mVar, 0))) {
                x0.g.d(mVar.f38469e).a(new j(e1Var, 0), w.b.F());
            }
            this.f6906k = h1Var;
            e();
            return h1Var;
        } catch (DeferrableSurface$SurfaceClosedException e5) {
            throw new AssertionError("Surface is somehow already closed", e5);
        } catch (RuntimeException e11) {
            h1Var.c();
            throw e11;
        }
    }

    public final void d() {
        boolean z11;
        a.a.t();
        a();
        m mVar = this.l;
        mVar.getClass();
        a.a.t();
        if (mVar.f6894p == null) {
            synchronized (mVar.f38465a) {
                z11 = mVar.f38467c;
            }
            if (!z11) {
                return;
            }
        }
        this.f6905j = false;
        this.l.a();
        this.l = new m(this.f6896a, this.f6902g.f38402a);
        Iterator it = this.f6907m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void e() {
        g1 g1Var;
        Executor executor;
        a.a.t();
        m0.j jVar = new m0.j(this.f6899d, this.f6904i, this.f6903h, this.f6898c, this.f6897b, this.f6900e);
        h1 h1Var = this.f6906k;
        if (h1Var != null) {
            synchronized (h1Var.f28514a) {
                h1Var.l = jVar;
                g1Var = h1Var.f28525m;
                executor = h1Var.f28526n;
            }
            if (g1Var != null && executor != null) {
                executor.execute(new c1(g1Var, jVar, 0));
            }
        }
        Iterator it = this.f6909o.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).accept(jVar);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SurfaceEdge{targets=");
        sb2.append(this.f6901f);
        sb2.append(", format=");
        sb2.append(this.f6896a);
        sb2.append(", resolution=");
        sb2.append(this.f6902g.f38402a);
        sb2.append(", cropRect=");
        sb2.append(this.f6899d);
        sb2.append(", rotationDegrees=");
        sb2.append(this.f6904i);
        sb2.append(", mirroring=");
        sb2.append(this.f6900e);
        sb2.append(", sensorToBufferTransform= ");
        Matrix matrix = this.f6897b;
        sb2.append(matrix);
        sb2.append(", rotationInTransform= ");
        sb2.append(v0.o.b(matrix));
        sb2.append(", isMirrorInTransform= ");
        sb2.append(v0.o.f(matrix));
        sb2.append(", isClosed=");
        return r8.k.q(sb2, this.f6908n, '}');
    }
}
