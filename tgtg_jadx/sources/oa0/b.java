package oa0;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32273a;

    public /* synthetic */ b(int i11) {
        this.f32273a = i11;
    }

    @Override // oa0.j
    public k a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, o0 o0Var) {
        switch (this.f32273a) {
            case 0:
                if (q90.n0.class.isAssignableFrom(u0.h(type))) {
                    return a.f32264d;
                }
                return null;
            case 1:
            default:
                return super.a(type, annotationArr, annotationArr2, o0Var);
            case 2:
                if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
                    return qa0.a.f36774a;
                }
                return null;
        }
    }

    @Override // oa0.j
    public final k b(Type type, Annotation[] annotationArr, o0 o0Var) {
        switch (this.f32273a) {
            case 0:
                if (type == q90.r0.class) {
                    return u0.l(annotationArr, ra0.w.class) ? a.f32265e : a.f32263c;
                }
                if (type == Void.class) {
                    return a.f32267g;
                }
                if (u0.f32386b && type == Unit.class) {
                    return a.f32266f;
                }
                return null;
            case 1:
                if (u0.h(type) != Optional.class) {
                    return null;
                }
                return new ky.o(o0Var.c(null, u0.g(0, (ParameterizedType) type), annotationArr), 9);
            default:
                if (type == String.class) {
                    return qa0.b.f36784j;
                }
                if (type == Boolean.class || type == Boolean.TYPE) {
                    return qa0.b.f36776b;
                }
                if (type == Byte.class || type == Byte.TYPE) {
                    return qa0.b.f36777c;
                }
                if (type == Character.class || type == Character.TYPE) {
                    return qa0.b.f36778d;
                }
                if (type == Double.class || type == Double.TYPE) {
                    return qa0.b.f36779e;
                }
                if (type == Float.class || type == Float.TYPE) {
                    return qa0.b.f36780f;
                }
                if (type == Integer.class || type == Integer.TYPE) {
                    return qa0.b.f36781g;
                }
                if (type == Long.class || type == Long.TYPE) {
                    return qa0.b.f36782h;
                }
                if (type == Short.class || type == Short.TYPE) {
                    return qa0.b.f36783i;
                }
                return null;
        }
    }
}
