package b0;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w.q f5220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f5221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CaptureRequest f5222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CaptureResult f5223e;

    public /* synthetic */ i(w.q qVar, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult, int i11) {
        this.f5219a = i11;
        this.f5220b = qVar;
        this.f5221c = cameraCaptureSession;
        this.f5222d = captureRequest;
        this.f5223e = captureResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5219a) {
            case 0:
                this.f5220b.f42750a.onCaptureProgressed(this.f5221c, this.f5222d, this.f5223e);
                break;
            default:
                this.f5220b.f42750a.onCaptureProgressed(this.f5221c, this.f5222d, this.f5223e);
                break;
        }
    }
}
