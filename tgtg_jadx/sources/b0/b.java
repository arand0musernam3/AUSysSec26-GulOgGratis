package b0;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends lz.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s0.g f5055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s0.g f5056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s0.g f5057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s0.g f5058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s0.g f5059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final s0.g f5060i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final s0.g f5061j;

    static {
        Class cls = Integer.TYPE;
        cls.getClass();
        f5055d = new s0.g("camera2.captureRequest.templateType", cls, null);
        f5056e = new s0.g("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);
        f5057f = new s0.g("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);
        f5058g = new s0.g("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);
        Class cls2 = Long.TYPE;
        cls2.getClass();
        f5059h = new s0.g("camera2.cameraCaptureSession.streamUseCase", cls2, null);
        f5060i = new s0.g("camera2.cameraCaptureSession.streamUseHint", cls2, null);
        f5061j = new s0.g("camera2.cameraCaptureSession.physicalCameraId", String.class, null);
    }
}
