package f0;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements e0.k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TotalCaptureResult f16778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f16779b;

    public n(TotalCaptureResult totalCaptureResult, String str, e0.k1 k1Var) {
        Map mapF;
        totalCaptureResult.getClass();
        str.getClass();
        k1Var.getClass();
        this.f16778a = totalCaptureResult;
        this.f16779b = new o(totalCaptureResult, str);
        try {
            Trace.beginSection("physicalCaptureResults");
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 31) {
                mapF = y.a(totalCaptureResult);
                mapF.getClass();
            } else if (i11 >= 28) {
                mapF = u.f(totalCaptureResult);
            } else {
                mapF = kotlin.collections.o0.f26530a;
                mapF.getClass();
            }
            if (mapF == null || mapF.isEmpty()) {
                kotlin.collections.o0.f26530a.getClass();
            } else {
                ArrayMap arrayMap = new ArrayMap(mapF.size());
                for (Map.Entry entry : mapF.entrySet()) {
                    String str2 = (String) entry.getKey();
                    e0.s.a(str2);
                    arrayMap.put(new e0.s(str2), new o((CaptureResult) entry.getValue(), str2));
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // e0.k0
    public final o getMetadata() {
        return this.f16779b;
    }

    @Override // e0.r1
    public final Object t(KClass kClass) {
        boolean zD = r8.k.D(kClass, CaptureResult.class, kClass);
        TotalCaptureResult totalCaptureResult = this.f16778a;
        if (zD) {
            totalCaptureResult.getClass();
            return totalCaptureResult;
        }
        if (!Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(TotalCaptureResult.class)) || totalCaptureResult == null) {
            return null;
        }
        return totalCaptureResult;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FrameInfo(camera: ");
        o oVar = this.f16779b;
        sb2.append((Object) e0.s.b(oVar.f16793b));
        sb2.append(", frameNumber: ");
        sb2.append(oVar.f16792a.getFrameNumber());
        sb2.append(')');
        return sb2.toString();
    }
}
