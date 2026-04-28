package w;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import androidx.camera.core.CameraControl$OperationCanceledException;
import b0.d2;
import b0.e3;
import b0.f1;
import b0.g2;
import b0.k3;
import b0.l1;
import b0.l2;
import b0.l3;
import b0.m1;
import b0.n3;
import b0.o1;
import b0.z1;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import s0.i1;
import s0.u1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements s0.f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0.n f42649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1 f42650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d2 f42651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g2 f42652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o1 f42653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s0 f42654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d0.a f42655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e3 f42656i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k3 f42657j;

    public c(b0.n nVar, f1 f1Var, l1 l1Var, m1 m1Var, d2 d2Var, g2 g2Var, o1 o1Var, n3 n3Var, s0 s0Var, d0.a aVar, e3 e3Var, k3 k3Var, l3 l3Var) {
        nVar.getClass();
        f1Var.getClass();
        l1Var.getClass();
        m1Var.getClass();
        d2Var.getClass();
        g2Var.getClass();
        o1Var.getClass();
        n3Var.getClass();
        s0Var.getClass();
        aVar.getClass();
        e3Var.getClass();
        k3Var.getClass();
        l3Var.getClass();
        this.f42649b = nVar;
        this.f42650c = l1Var;
        this.f42651d = d2Var;
        this.f42652e = g2Var;
        this.f42653f = o1Var;
        this.f42654g = s0Var;
        this.f42655h = aVar;
        this.f42656i = e3Var;
        this.f42657j = k3Var;
    }

    @Override // s0.f0
    public final void a(u1 u1Var) {
        this.f42654g.a(u1Var);
    }

    @Override // s0.f0
    public final void b() {
        this.f42654g.b();
    }

    @Override // s0.f0
    public final void c(int i11) {
        boolean z11 = true;
        this.f42650c.d(i11, true);
        if (i11 != 1 && i11 != 0) {
            z11 = false;
        }
        this.f42654g.e(z11);
    }

    @Override // s0.f0
    public final ListenableFuture d(ArrayList arrayList, int i11, int i12) {
        d2 d2Var = this.f42651d;
        d2Var.getClass();
        v80.q qVar = new v80.q();
        v80.f0.B(d2Var.f5120b.f5270f, null, null, new z1(arrayList, i11, i12, qVar, d2Var, null), 3);
        return x0.g.d(v0.n.r("Deferred.asListenableFuture", qVar));
    }

    @Override // s0.f0
    public final ListenableFuture e(boolean z11) {
        Integer num;
        e0.u uVar = e0.v.f15412i0;
        e0.v vVar = this.f42649b.f5321b;
        uVar.getClass();
        vVar.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
        key.getClass();
        int[] iArr = (int[]) ((f0.t0) vVar).c(key);
        if (!(iArr == null ? false : kotlin.collections.y.t(iArr, 6)) || ((num = (Integer) this.f42653f.f5352f.d()) != null && num.intValue() == -1)) {
            return x0.g.d(x0.g.f(new x0.d(v0.n.r("Deferred.asListenableFuture", g2.b(this.f42652e, z11, 6))), new u6.f(new qc.y(27)), b.F()));
        }
        if (wd.a.B(3, "CXCP")) {
            Log.d("CXCP", "Unable to enable/disable torch when low-light boost is on.");
        }
        return new x0.i(new IllegalStateException("Torch can not be enabled/disable when low-light boost is on!"), 1);
    }

    @Override // s0.f0
    public final s0.u0 f() {
        lz.i iVar;
        x.a aVar = this.f42655h.f13658a;
        synchronized (aVar.f43595a) {
            b0.b bVarA = aVar.f43597c.a();
            a50.c cVar = new a50.c(12);
            bVarA.j(new a50.d(11, cVar, bVarA));
            iVar = new lz.i(s0.l1.e((i1) cVar.f822b));
        }
        return iVar;
    }

    @Override // s0.f0
    public final void g(s0.u0 u0Var) {
        u0Var.getClass();
        d0.a aVar = this.f42655h;
        a50.c cVar = new a50.c(12);
        u0Var.j(new a50.d(11, cVar, u0Var));
        s0.l1 l1VarE = s0.l1.e((i1) cVar.f822b);
        aVar.getClass();
        x.a aVar2 = aVar.f13658a;
        synchronized (aVar2.f43595a) {
            for (s0.g gVar : l1VarE.c()) {
                gVar.getClass();
                aVar2.f43597c.f5038b.x(gVar, s0.t0.ALWAYS_OVERRIDE, l1VarE.d(gVar));
            }
        }
        x0.g.d(v0.n.r("addCaptureRequestOptions", aVar.f13658a.a(aVar.f13661d, true)));
    }

    @Override // s0.f0
    public final void h(y0.f fVar) {
        this.f42650c.f5290h = fVar;
    }

    @Override // s0.f0
    public final void i() {
        d0.a aVar = this.f42655h;
        x.a aVar2 = aVar.f13658a;
        synchronized (aVar2.f43595a) {
            aVar2.f43597c = new b0.a(0);
        }
        x0.g.d(v0.n.r("clearCaptureRequestOptions", aVar.f13658a.a(aVar.f13661d, true)));
    }

    @Override // s0.f0
    public final ListenableFuture j(int i11) {
        l2 l2VarG = this.f42656i.g();
        if (l2VarG == null) {
            return new x0.i(new CameraControl$OperationCanceledException("Camera is not active."), 1);
        }
        a90.d dVar = this.f42657j.f5270f;
        e6.i iVar = new e6.i();
        iVar.f15778c = new e6.n();
        e6.l lVar = new e6.l(iVar);
        iVar.f15777b = lVar;
        iVar.f15776a = b.class;
        try {
            iVar.f15776a = v80.f0.B(dVar, null, null, new a(iVar, null, l2VarG, i11, this), 3);
            return lVar;
        } catch (Exception e5) {
            lVar.b(e5);
            return lVar;
        }
    }
}
