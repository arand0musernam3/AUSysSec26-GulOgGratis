package oa0;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f32295h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(int i11) {
        super(7);
        this.f32295h = i11;
    }

    @Override // oa0.a
    public String c(Method method, int i11) {
        switch (this.f32295h) {
            case 1:
                Parameter parameter = method.getParameters()[i11];
                if (!parameter.isNamePresent()) {
                }
                break;
        }
        return super.c(method, i11);
    }

    @Override // oa0.a
    public final Object d(Class cls, Object obj, Method method, Object[] objArr) {
        switch (this.f32295h) {
        }
        return u0.k(cls, obj, method, objArr);
    }

    @Override // oa0.a
    public final boolean e(Method method) {
        switch (this.f32295h) {
        }
        return method.isDefault();
    }
}
