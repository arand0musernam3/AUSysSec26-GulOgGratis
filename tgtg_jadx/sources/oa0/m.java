package oa0;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f32337a;

    public m(Executor executor) {
        this.f32337a = executor;
    }

    @Override // oa0.e
    public final f a(Type type, Annotation[] annotationArr, o0 o0Var) {
        if (u0.h(type) != d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new k8.d(26, u0.g(0, (ParameterizedType) type), u0.l(annotationArr, p0.class) ? null : this.f32337a);
        }
        i4.a.f("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        return null;
    }
}
