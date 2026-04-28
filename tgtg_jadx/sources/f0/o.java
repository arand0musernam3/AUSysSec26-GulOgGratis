package f0;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements e0.v0, e0.r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CaptureResult f16792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlin.collections.o0 f16794c;

    public o(CaptureResult captureResult, String str) {
        captureResult.getClass();
        str.getClass();
        this.f16792a = captureResult;
        this.f16793b = str;
        kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
        o0Var.getClass();
        this.f16794c = o0Var;
    }

    public final Object c(CaptureResult.Key key) {
        key.getClass();
        this.f16794c.getClass();
        return this.f16792a.get(key);
    }

    @Override // e0.r1
    public final Object t(KClass kClass) {
        boolean zD = r8.k.D(kClass, CaptureResult.class, kClass);
        CaptureResult captureResult = this.f16792a;
        if (zD) {
            captureResult.getClass();
            return captureResult;
        }
        if (!Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(TotalCaptureResult.class)) || captureResult == null) {
            return null;
        }
        return captureResult;
    }

    public final String toString() {
        return "FrameMetadata(camera: " + ((Object) e0.s.b(this.f16793b)) + ", frameNumber: " + this.f16792a.getFrameNumber() + ')';
    }
}
