package f0;

import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.os.Handler;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CameraConstrainedHighSpeedCaptureSession f16582e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession, j1 j1Var, Handler handler) {
        super(dVar, cameraConstrainedHighSpeedCaptureSession, j1Var, handler);
        dVar.getClass();
        cameraConstrainedHighSpeedCaptureSession.getClass();
        j1Var.getClass();
        handler.getClass();
        this.f16582e = cameraConstrainedHighSpeedCaptureSession;
    }

    @Override // f0.b, e0.r1
    public final Object t(KClass kClass) {
        return r8.k.D(kClass, CameraConstrainedHighSpeedCaptureSession.class, kClass) ? this.f16582e : super.t(kClass);
    }
}
