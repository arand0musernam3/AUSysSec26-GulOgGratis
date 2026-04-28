package f0;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraDevice.CameraDeviceSetup f16707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1 f16709c;

    public h1(CameraDevice.CameraDeviceSetup cameraDeviceSetup, String str, j1 j1Var) {
        str.getClass();
        j1Var.getClass();
        this.f16707a = cameraDeviceSetup;
        this.f16708b = str;
        this.f16709c = j1Var;
    }

    public final CaptureRequest.Builder a(int i11) throws Exception {
        try {
            return this.f16707a.createCaptureRequest(i11);
        } catch (Exception e5) {
            boolean z11 = e5 instanceof CameraAccessException;
            int i12 = 0;
            String str = this.f16708b;
            j1 j1Var = this.f16709c;
            if (!z11) {
                if (!(e5 instanceof IllegalArgumentException) && !(e5 instanceof SecurityException) && !(e5 instanceof UnsupportedOperationException) && !(e5 instanceof NullPointerException)) {
                    if (!(e5 instanceof IllegalStateException)) {
                        throw e5;
                    }
                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    return null;
                }
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e5.getMessage());
                j1Var.a(str, 9, false);
                return null;
            }
            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e5.getMessage());
            CameraAccessException cameraAccessException = (CameraAccessException) e5;
            int reason = cameraAccessException.getReason();
            if (reason == 1) {
                i12 = 3;
            } else if (reason == 2) {
                i12 = 6;
            } else if (reason != 3) {
                if (reason == 4) {
                    i12 = 1;
                } else if (reason != 5) {
                    Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                    i12 = 11;
                } else {
                    i12 = 2;
                }
            }
            j1Var.a(str, i12, true);
            return null;
        }
    }
}
