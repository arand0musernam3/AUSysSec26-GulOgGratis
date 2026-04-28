package b0;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y2 implements e0.h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c3 f5514a;

    public y2(c3 c3Var) {
        this.f5514a = c3Var;
    }

    @Override // e0.h1
    public final void G(e0.k1 k1Var, long j9, f0.n nVar) {
        Integer num;
        if (this.f5514a.f5107q.f37781a == 0 || (num = (Integer) k1Var.a(e2.f5146b)) == null) {
            return;
        }
        c3 c3Var = this.f5514a;
        int iIntValue = num.intValue();
        synchronized (c3Var.f5094c) {
            kotlin.collections.t tVar = c3Var.f5097f;
            while (!tVar.isEmpty() && ((z2) tVar.first()).f5533a <= iIntValue) {
                ((z2) tVar.first()).f5534b.R(Unit.f26487a);
                kotlin.collections.i0.w(tVar);
                this.f5514a.f5107q.a();
            }
        }
    }

    @Override // e0.h1
    public final void H(e0.k1 k1Var, long j9, e0.j1 j1Var) {
        Integer num;
        if (this.f5514a.f5107q.f37781a == 0 || (num = (Integer) k1Var.a(e2.f5146b)) == null) {
            return;
        }
        c3 c3Var = this.f5514a;
        int iIntValue = num.intValue();
        synchronized (c3Var.f5094c) {
            kotlin.collections.t tVar = c3Var.f5097f;
            Throwable th2 = new Throwable("Failed in framework level".concat(" with CaptureFailure.reason = " + j1Var.H()));
            while (!tVar.isEmpty() && ((z2) tVar.first()).f5533a <= iIntValue) {
                ((z2) tVar.first()).f5534b.h0(th2);
                kotlin.collections.i0.w(tVar);
                this.f5514a.f5107q.a();
            }
        }
    }
}
