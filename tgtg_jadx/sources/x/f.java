package x;

import android.hardware.camera2.CaptureResult;
import e0.h1;
import e0.k1;
import f0.n;
import f0.o;
import v80.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f43604a;

    public f(q qVar) {
        this.f43604a = qVar;
    }

    @Override // e0.h1
    public final void L(k1 k1Var, long j9, n nVar) {
        o oVar = nVar.f16779b;
        CaptureResult.Key key = CaptureResult.CONTROL_AE_STATE;
        key.getClass();
        Integer num = (Integer) oVar.c(key);
        CaptureResult.Key key2 = CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION;
        key2.getClass();
        Integer num2 = (Integer) oVar.c(key2);
        q qVar = this.f43604a;
        if (num == null || num2 == null) {
            if (num2 == null || num2.intValue() != 0) {
                return;
            }
            qVar.R(0);
            return;
        }
        int iIntValue = num.intValue();
        if ((iIntValue == 2 || iIntValue == 3 || iIntValue == 4) && num2.intValue() == 0) {
            qVar.R(0);
        }
    }
}
