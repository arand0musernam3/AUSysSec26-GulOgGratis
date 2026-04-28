package b0;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w.q f5125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f5126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CaptureRequest f5127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f5128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f5129f;

    public /* synthetic */ e(w.q qVar, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j9, long j11, int i11) {
        this.f5124a = i11;
        this.f5125b = qVar;
        this.f5126c = cameraCaptureSession;
        this.f5127d = captureRequest;
        this.f5128e = j9;
        this.f5129f = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5124a) {
            case 0:
                this.f5125b.f42750a.onCaptureStarted(this.f5126c, this.f5127d, this.f5128e, this.f5129f);
                break;
            default:
                h7.i0.t(this.f5125b.f42750a, this.f5126c, this.f5127d, this.f5128e, this.f5129f);
                break;
        }
    }
}
