package h1;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.SessionConfiguration;
import e10.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraDevice.CameraDeviceSetup f20997a;

    public b(CameraManager cameraManager, String str) {
        this.f20997a = cameraManager.getCameraDeviceSetup(str);
    }

    @Override // h1.d
    public final t a(SessionConfiguration sessionConfiguration) {
        int i11 = this.f20997a.isSessionConfigurationSupported(sessionConfiguration) ? 1 : 2;
        String property = System.getProperty("ro.build.date.utc");
        if (property != null) {
            try {
                Long.parseLong(property);
            } catch (NumberFormatException unused) {
            }
        }
        return new t(i11);
    }
}
