package f0;

import android.hardware.camera2.params.OutputConfiguration;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements e0.r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputConfiguration f16863a;

    public r(OutputConfiguration outputConfiguration) {
        this.f16863a = outputConfiguration;
        outputConfiguration.getSurface();
    }

    @Override // e0.r1
    public final Object t(KClass kClass) {
        if (r8.k.D(kClass, OutputConfiguration.class, kClass)) {
            return this.f16863a;
        }
        return null;
    }

    public final String toString() {
        return this.f16863a.toString();
    }
}
