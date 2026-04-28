package e0;

import android.hardware.camera2.CameraDevice;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraDevice.StateCallback f15414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2.z f15415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0.d f15416c;

    public x(CameraDevice.StateCallback stateCallback, w2.z zVar, h0.d dVar) {
        this.f15414a = stateCallback;
        this.f15415b = zVar;
        this.f15416c = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.areEqual(this.f15414a, xVar.f15414a) && Intrinsics.areEqual(this.f15415b, xVar.f15415b) && Intrinsics.areEqual(this.f15416c, xVar.f15416c);
    }

    public final int hashCode() {
        CameraDevice.StateCallback stateCallback = this.f15414a;
        int iHashCode = (stateCallback == null ? 0 : stateCallback.hashCode()) * 31;
        w2.z zVar = this.f15415b;
        int iHashCode2 = (iHashCode + (zVar == null ? 0 : zVar.hashCode())) * 31;
        h0.d dVar = this.f15416c;
        return iHashCode2 + (dVar != null ? Long.hashCode(dVar.f20962a) : 0);
    }

    public final String toString() {
        return "CameraInteropConfig(cameraDeviceStateCallback=" + this.f15414a + ", cameraCaptureSessionListener=" + this.f15415b + ", cameraOpenRetryMaxTimeoutNs=" + this.f15416c + ')';
    }
}
