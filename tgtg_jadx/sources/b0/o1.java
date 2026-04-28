package b0;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f5347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k3 f5348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o2 f5349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.o0 f5352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f5353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v80.q f5354h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v80.s1 f5355i;

    public o1(e0.v vVar, w1 w1Var, k3 k3Var, x0 x0Var) {
        w1Var.getClass();
        k3Var.getClass();
        x0Var.getClass();
        this.f5347a = w1Var;
        this.f5348b = k3Var;
        boolean z11 = false;
        if (vVar != null) {
            e0.v.f15412i0.getClass();
            CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
            key.getClass();
            int[] iArr = (int[]) ((f0.t0) vVar).c(key);
            if (iArr == null ? false : kotlin.collections.y.t(iArr, 6)) {
                z11 = true;
            }
        }
        this.f5350d = z11;
        this.f5352f = new androidx.lifecycle.o0(-1);
        this.f5353g = new AtomicInteger(-1);
        if (z11) {
            x0Var.a(new n1(this), k3Var.f5269e);
        }
    }

    @Override // b0.h2
    public final void a(o2 o2Var) {
        this.f5349c = o2Var;
        if (this.f5351e) {
            if (o2Var != null) {
                d(true, false);
            } else {
                c(this.f5352f, 0);
            }
        }
    }

    public final void b(List list) {
        list.getClass();
        if (this.f5350d) {
            if (list.isEmpty()) {
                this.f5355i = v80.f0.a(Boolean.FALSE);
            } else {
                this.f5355i = v80.f0.f(this.f5348b.f5270f, null, null, new aa.l0(this, list, (x70.c) null, 4), 3);
            }
        }
    }

    public final void c(androidx.lifecycle.o0 o0Var, int i11) {
        if (this.f5353g.getAndSet(i11) != i11) {
            if (a.a.E()) {
                o0Var.k(Integer.valueOf(i11));
            } else {
                o0Var.i(Integer.valueOf(i11));
            }
        }
    }

    public final v80.q d(boolean z11, boolean z12) {
        if (wd.a.B(3, "CXCP")) {
            Log.d("CXCP", "LowLightBoostControl#setLowLightBoostAsync: lowLightBoost = " + z11);
        }
        v80.q qVar = new v80.q();
        if (this.f5350d) {
            v80.f0.B(this.f5348b.f5270f, null, null, new da.c((x70.c) null, this, qVar, z11, z12), 3);
            return qVar;
        }
        qVar.h0(new IllegalStateException("Low Light Boost is not supported!"));
        return qVar;
    }

    @Override // b0.h2
    public final void reset() {
        v80.q qVar = this.f5354h;
        if (qVar != null) {
            w2.l1.k("There is a new enableLowLightBoost being set", qVar);
        }
        this.f5354h = null;
        d(false, true);
    }
}
