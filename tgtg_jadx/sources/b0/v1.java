package b0;

import android.hardware.camera2.CaptureResult;
import android.util.Log;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 implements e0.h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f5452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v80.q f5453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Long f5454d;

    public v1(long j9, Function1 function1) {
        function1.getClass();
        this.f5451a = j9;
        this.f5452b = function1;
        this.f5453c = new v80.q();
    }

    @Override // e0.h1
    public final void G(e0.k1 k1Var, long j9, f0.n nVar) {
        if (this.f5453c.a0() || this.f5453c.isCancelled()) {
            return;
        }
        f0.o oVar = nVar.f16779b;
        CaptureResult.Key key = CaptureResult.SENSOR_TIMESTAMP;
        key.getClass();
        Long l = (Long) oVar.c(key);
        if (l != null && this.f5454d == null) {
            this.f5454d = l;
        }
        Long l7 = this.f5454d;
        if (this.f5451a == 0 || l7 == null || l == null || l.longValue() - l7.longValue() <= this.f5451a) {
            if (((Boolean) this.f5452b.invoke(nVar)).booleanValue()) {
                this.f5453c.R(nVar);
                return;
            }
            return;
        }
        this.f5453c.R(null);
        if (wd.a.B(3, "CXCP")) {
            Log.d("CXCP", "Wait for capture result timeout, current: " + l.longValue() + " first: " + l7.longValue());
        }
    }
}
