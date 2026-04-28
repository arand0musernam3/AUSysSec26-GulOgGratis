package f0;

import android.hardware.camera2.CameraManager;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends CameraManager.AvailabilityCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16919a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x80.u f16920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16921c;

    public u0(x80.u uVar, v0 v0Var) {
        this.f16920b = uVar;
        this.f16921c = v0Var;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public void onCameraAccessPrioritiesChanged() {
        switch (this.f16919a) {
            case 0:
                Log.d("CXCP", "Camera access priorities have changed");
                if (o00.x0.H(this.f16920b, j0.j.f24298a) instanceof x80.o) {
                    Log.w("CXCP", "Failed to emit CameraPrioritiesChanged");
                }
                break;
            default:
                super.onCameraAccessPrioritiesChanged();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        int i11 = this.f16919a;
        str.getClass();
        switch (i11) {
            case 0:
                if (Intrinsics.areEqual(str, ((v0) this.f16921c).f16927b)) {
                    Log.d("CXCP", "Camera " + str + " has become available");
                    e0.s.a(str);
                    if (o00.x0.H(this.f16920b, new j0.i(str)) instanceof x80.o) {
                        Log.w("CXCP", "Failed to emit CameraAvailable(" + str + ')');
                    }
                    break;
                }
                break;
            default:
                c1.a((c1) this.f16921c, this.f16920b, str, true);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        int i11 = this.f16919a;
        str.getClass();
        switch (i11) {
            case 0:
                if (Intrinsics.areEqual(str, ((v0) this.f16921c).f16927b)) {
                    Log.d("CXCP", "Camera " + str + " has become unavailable");
                    e0.s.a(str);
                    if (o00.x0.H(this.f16920b, new j0.k(str)) instanceof x80.o) {
                        Log.w("CXCP", "Failed to emit CameraUnavailable(" + str + ')');
                    }
                    break;
                }
                break;
            default:
                c1.a((c1) this.f16921c, this.f16920b, str, false);
                break;
        }
    }

    public u0(c1 c1Var, x80.u uVar) {
        this.f16921c = c1Var;
        this.f16920b = uVar;
    }
}
