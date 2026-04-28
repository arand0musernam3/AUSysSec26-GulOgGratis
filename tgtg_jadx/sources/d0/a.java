package d0;

import androidx.camera.core.CameraControl$OperationCanceledException;
import b0.h2;
import b0.k3;
import b0.o2;
import b0.x0;
import v80.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x.a f13658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k3 f13659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f13660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o2 f13661d;

    public a(x.a aVar, k3 k3Var, x0 x0Var) {
        this.f13658a = aVar;
        this.f13659b = k3Var;
        this.f13660c = x0Var;
    }

    @Override // b0.h2
    public final void a(o2 o2Var) {
        this.f13661d = o2Var;
        if (o2Var != null) {
            x0 x0Var = this.f13660c;
            x.a aVar = this.f13658a;
            x0Var.b(aVar);
            x0Var.a(aVar, this.f13659b.f5269e);
            aVar.a(o2Var, false);
        }
    }

    @Override // b0.h2
    public final void reset() {
        x.a aVar = this.f13658a;
        synchronized (aVar.f43596b) {
            try {
                q qVar = aVar.f43598d;
                if (qVar != null) {
                    aVar.f43598d = null;
                    qVar.h0(new CameraControl$OperationCanceledException("The camera control has became inactive."));
                }
                q qVar2 = aVar.f43599e;
                if (qVar2 != null) {
                    aVar.f43599e = null;
                    qVar2.h0(new CameraControl$OperationCanceledException("The camera control has became inactive."));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f13660c.b(this.f13658a);
    }
}
