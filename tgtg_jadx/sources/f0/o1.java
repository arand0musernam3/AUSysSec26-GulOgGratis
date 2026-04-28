package f0;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.ArrayMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements e0.k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f16797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CaptureRequest f16798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f16799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f16800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f16801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayMap f16802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f16803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e0.i1 f16804h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f16805i;

    public o1(q1 q1Var, CaptureRequest captureRequest, Map map, Map map2, Map map3, ArrayMap arrayMap, boolean z11, e0.i1 i1Var, long j9) {
        q1Var.getClass();
        captureRequest.getClass();
        map.getClass();
        map2.getClass();
        map3.getClass();
        this.f16797a = q1Var;
        this.f16798b = captureRequest;
        this.f16799c = map;
        this.f16800d = map2;
        this.f16801e = map3;
        this.f16802f = arrayMap;
        this.f16803g = z11;
        this.f16804h = i1Var;
        this.f16805i = j9;
    }

    @Override // e0.k1
    public final Map I() {
        return this.f16802f;
    }

    @Override // e0.k1
    public final boolean O() {
        return this.f16803g;
    }

    @Override // e0.v0
    public final Object a(e0.u0 u0Var) {
        Map map = this.f16804h.f15357c;
        u0Var.getClass();
        Map map2 = this.f16801e;
        if (map2.containsKey(u0Var)) {
            return map2.get(u0Var);
        }
        if (map.containsKey(u0Var)) {
            return map.get(u0Var);
        }
        Map map3 = this.f16800d;
        return map3.containsKey(u0Var) ? map3.get(u0Var) : this.f16799c.get(u0Var);
    }

    @Override // e0.v0
    public final Object b(e0.u0 u0Var, s0.k2 k2Var) {
        u0Var.getClass();
        Object objA = a(u0Var);
        return objA == null ? k2Var : objA;
    }

    @Override // e0.k1
    public final e0.i1 e() {
        return this.f16804h;
    }

    @Override // e0.k1
    public final long g0() {
        return this.f16805i;
    }

    @Override // e0.r1
    public final Object t(KClass kClass) {
        if (r8.k.D(kClass, CaptureRequest.class, kClass)) {
            CaptureRequest captureRequest = this.f16798b;
            captureRequest.getClass();
            return captureRequest;
        }
        boolean zAreEqual = Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(CameraCaptureSession.class));
        q1 q1Var = this.f16797a;
        if (zAreEqual) {
            Object objT = q1Var.t(Reflection.getOrCreateKotlinClass(CameraCaptureSession.class));
            if (objT == null) {
                return null;
            }
            return objT;
        }
        if (!Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(ax.y.c()))) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 31) {
            com.braze.h2.b("Check failed.");
            return null;
        }
        Object objT2 = q1Var.t(Reflection.getOrCreateKotlinClass(ax.y.c()));
        if (objT2 == null) {
            return null;
        }
        return objT2;
    }
}
