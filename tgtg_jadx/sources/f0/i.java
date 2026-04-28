package f0;

import android.hardware.camera2.CaptureFailure;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements e0.j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CaptureFailure f16713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16715c;

    public i(e0.k1 k1Var, CaptureFailure captureFailure) {
        k1Var.getClass();
        captureFailure.getClass();
        this.f16713a = captureFailure;
        captureFailure.getFrameNumber();
        this.f16714b = captureFailure.getReason();
        this.f16715c = captureFailure.wasImageCaptured();
    }

    @Override // e0.j1
    public final boolean B() {
        return this.f16715c;
    }

    @Override // e0.j1
    public final int H() {
        return this.f16714b;
    }

    @Override // e0.r1
    public final Object t(KClass kClass) {
        if (r8.k.D(kClass, CaptureFailure.class, kClass)) {
            return this.f16713a;
        }
        return null;
    }
}
