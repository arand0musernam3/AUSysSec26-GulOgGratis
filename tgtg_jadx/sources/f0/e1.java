package f0;

import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends z70.i implements Function1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ CameraDevice f16621j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f16622k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(CameraDevice cameraDevice, Ref.BooleanRef booleanRef, x70.c cVar) {
        super(1, cVar);
        this.f16621j = cameraDevice;
        this.f16622k = booleanRef;
    }

    @Override // z70.a
    public final x70.c create(x70.c cVar) {
        return new e1(this.f16621j, this.f16622k, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((e1) create((x70.c) obj)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        CameraDevice cameraDevice = this.f16621j;
        if (cameraDevice != null) {
            Log.i("CXCP", "Closing Camera " + cameraDevice.getId());
            String str = "CXCP#CameraDevice-" + cameraDevice.getId() + "#close";
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            try {
                Trace.beginSection(str);
                try {
                    cameraDevice.close();
                } catch (NullPointerException e5) {
                    Log.w("CXCP", "NPE encountered during CameraDevice.close()", e5);
                }
            } finally {
                Log.d("CXCP", e0.f.q(new Object[]{Double.valueOf(e0.f.d(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", e0.f.r(str, " - ")));
            }
        }
        this.f16622k.element = true;
        return Unit.f26487a;
    }
}
