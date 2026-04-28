package f0;

import android.hardware.camera2.CameraManager;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends CameraManager.AvailabilityCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x80.u f16706a;

    public h0(x80.u uVar) {
        this.f16706a = uVar;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        str.getClass();
        e0.s.a(str);
        o00.x0.H(this.f16706a, new e0.s(str));
    }
}
