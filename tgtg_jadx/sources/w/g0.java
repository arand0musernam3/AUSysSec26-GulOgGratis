package w;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraMetadata;
import e0.r1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements m0.q, r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0.n f42681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u70.t f42682b = u70.l.b(new rv.a(this, 19));

    public g0(b0.n nVar) {
        this.f42681a = nVar;
    }

    @Override // m0.q
    public final int b() {
        return n(0);
    }

    @Override // m0.q
    public final int k() {
        e0.v vVar = this.f42681a.f5321b;
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        key.getClass();
        Object objC = ((f0.t0) vVar).c(key);
        objC.getClass();
        int iIntValue = ((Number) objC).intValue();
        if (iIntValue == 0) {
            return 0;
        }
        if (iIntValue == 1) {
            return 1;
        }
        if (iIntValue == 2) {
            return 2;
        }
        i4.a.f(r8.k.h(iIntValue, "The specified lens facing integer ", " can not be recognized."));
        return 0;
    }

    @Override // m0.q
    public final String l() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // m0.q
    public final int n(int i11) {
        e0.v vVar = this.f42681a.f5321b;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_ORIENTATION;
        key.getClass();
        Object objC = ((f0.t0) vVar).c(key);
        objC.getClass();
        return z20.b.p(z20.b.D(i11), ((Number) objC).intValue(), 1 == k());
    }

    @Override // m0.q
    public final boolean q() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // e0.r1
    public final Object t(KClass kClass) {
        if (r8.k.D(kClass, d0.b.class, kClass)) {
            d0.b bVar = (d0.b) this.f42682b.getValue();
            bVar.getClass();
            return bVar;
        }
        boolean zAreEqual = Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(b0.n.class));
        b0.n nVar = this.f42681a;
        if (zAreEqual) {
            return nVar;
        }
        boolean zAreEqual2 = Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(CameraMetadata.class));
        e0.v vVar = nVar.f5321b;
        if (!zAreEqual2) {
            return ((f0.t0) vVar).t(kClass);
        }
        vVar.getClass();
        return vVar;
    }
}
