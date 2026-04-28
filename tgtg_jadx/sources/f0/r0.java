package f0;

import android.hardware.camera2.CameraExtensionCharacteristics;
import java.util.LinkedHashMap;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements e0.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CameraExtensionCharacteristics f16866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f16867d;

    public r0(String str, int i11, CameraExtensionCharacteristics cameraExtensionCharacteristics, kotlin.collections.o0 o0Var) {
        str.getClass();
        o0Var.getClass();
        this.f16864a = str;
        this.f16865b = i11;
        this.f16866c = cameraExtensionCharacteristics;
        new LinkedHashMap();
        new LinkedHashMap();
        new LinkedHashMap();
        u70.m mVar = u70.m.PUBLICATION;
        u70.l.a(mVar, new q0(this, 0));
        u70.l.a(mVar, new q0(this, 1));
        this.f16867d = u70.l.a(mVar, new q0(this, 2));
        u70.l.a(mVar, new q0(this, 3));
    }

    @Override // e0.r1
    public final Object t(KClass kClass) {
        if (r8.k.D(kClass, CameraExtensionCharacteristics.class, kClass)) {
            return this.f16866c;
        }
        return null;
    }
}
