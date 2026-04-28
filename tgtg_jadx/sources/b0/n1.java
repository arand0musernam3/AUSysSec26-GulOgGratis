package b0;

import android.hardware.camera2.CaptureResult;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements e0.h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1 f5333a;

    public n1(o1 o1Var) {
        this.f5333a = o1Var;
    }

    @Override // e0.h1
    public final void G(e0.k1 k1Var, long j9, f0.n nVar) {
        if (Build.VERSION.SDK_INT >= 35) {
            o1 o1Var = this.f5333a;
            if (o1Var.f5349c == null || !o1Var.f5351e) {
                return;
            }
            f0.o oVar = nVar.f16779b;
            CaptureResult.Key key = CaptureResult.CONTROL_LOW_LIGHT_BOOST_STATE;
            key.getClass();
            Integer num = (Integer) oVar.c(key);
            if (num != null) {
                o1Var.c(o1Var.f5352f, num.intValue() != 1 ? 0 : 1);
            }
        }
    }
}
