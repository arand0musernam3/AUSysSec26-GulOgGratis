package b0;

import androidx.camera.core.ImageCaptureException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements e0.h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v80.q f5261a;

    public k0(v80.q qVar) {
        this.f5261a = qVar;
    }

    @Override // e0.h1
    public final void G(e0.k1 k1Var, long j9, f0.n nVar) {
        this.f5261a.R(null);
    }

    @Override // e0.h1
    public final void H(e0.k1 k1Var, long j9, e0.j1 j1Var) {
        this.f5261a.h0(new ImageCaptureException(2, "Capture request failed with reason " + j1Var.H(), null));
    }

    @Override // e0.h1
    public final void t(e0.i1 i1Var) {
        i1Var.getClass();
        this.f5261a.h0(new ImageCaptureException(3, "Capture request is cancelled because camera is closed", null));
    }
}
