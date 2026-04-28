package b0;

import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n3 implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x.k f5334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f5335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f5336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u70.t f5337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u70.t f5338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o2 f5340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v80.q f5341h;

    public n3(x.k kVar) {
        this.f5334a = kVar;
        this.f5335b = kVar.d();
        this.f5336c = kVar.a();
        final int i11 = 0;
        this.f5337d = u70.l.b(new Function0(this) { // from class: b0.m3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n3 f5319b;

            {
                this.f5319b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        n3 n3Var = this.f5319b;
                        return new w.r0(n3Var.f5335b, n3Var.f5336c);
                    default:
                        return new androidx.lifecycle.o0((w.r0) this.f5319b.f5337d.getValue());
                }
            }
        });
        final int i12 = 1;
        this.f5338e = u70.l.b(new Function0(this) { // from class: b0.m3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n3 f5319b;

            {
                this.f5319b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        n3 n3Var = this.f5319b;
                        return new w.r0(n3Var.f5335b, n3Var.f5336c);
                    default:
                        return new androidx.lifecycle.o0((w.r0) this.f5319b.f5337d.getValue());
                }
            }
        });
    }

    @Override // b0.h2
    public final void a(o2 o2Var) {
        boolean z11;
        this.f5340g = o2Var;
        w.r0 r0Var = (w.r0) ((androidx.lifecycle.o0) this.f5338e.getValue()).d();
        if (r0Var == null) {
            r0Var = (w.r0) this.f5337d.getValue();
        }
        if (this.f5339f) {
            z11 = true;
        } else {
            r0Var.getClass();
            z11 = false;
        }
        b(r0Var, false, z11);
        this.f5339f = true;
    }

    public final ListenableFuture b(w.r0 r0Var, boolean z11, boolean z12) {
        r0Var.getClass();
        v80.q qVar = new v80.q();
        v80.q qVar2 = this.f5341h;
        if (qVar2 != null) {
            if (z11) {
                w2.l1.k("Cancelled due to another zoom value being set.", qVar2);
            } else {
                v0.n.C(qVar, qVar2);
            }
        }
        this.f5341h = qVar;
        boolean zE = a.a.E();
        u70.t tVar = this.f5338e;
        if (zE) {
            ((androidx.lifecycle.o0) tVar.getValue()).k(r0Var);
        } else {
            ((androidx.lifecycle.o0) tVar.getValue()).i(r0Var);
        }
        o2 o2Var = this.f5340g;
        if (o2Var != null) {
            x.k kVar = this.f5334a;
            v0.n.C(z12 ? kVar.g(o2Var) : kVar.f(o2Var), qVar);
        } else {
            w2.l1.k("Camera is not active.", qVar);
        }
        e6.i iVar = new e6.i();
        iVar.f15778c = new e6.n();
        e6.l lVar = new e6.l(iVar);
        iVar.f15777b = lVar;
        iVar.f15776a = w.z.class;
        try {
            qVar.J(new sg.c(iVar, 19));
            iVar.f15776a = "Job.asListenableFuture";
        } catch (Exception e5) {
            lVar.b(e5);
        }
        return x0.g.d(lVar);
    }

    @Override // b0.h2
    public final void reset() {
        b((w.r0) this.f5337d.getValue(), true, true);
    }
}
