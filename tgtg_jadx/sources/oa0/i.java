package oa0;

import com.braze.h2;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32294a;

    public /* synthetic */ i(int i11) {
        this.f32294a = i11;
    }

    @Override // oa0.e
    public final f a(Type type, Annotation[] annotationArr, o0 o0Var) {
        f oVar;
        switch (this.f32294a) {
            case 0:
                if (u0.h(type) == CompletableFuture.class) {
                    if (type instanceof ParameterizedType) {
                        Type typeG = u0.g(0, (ParameterizedType) type);
                        if (u0.h(typeG) != n0.class) {
                            oVar = new m1.a(typeG);
                        } else if (typeG instanceof ParameterizedType) {
                            oVar = new ky.o(u0.g(0, (ParameterizedType) typeG), 8);
                        } else {
                            h2.b("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
                        }
                        return oVar;
                    }
                    h2.b("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
                }
                return null;
            default:
                type.getClass();
                annotationArr.getClass();
                if (Intrinsics.areEqual(u0.h(type), d.class) && (type instanceof ParameterizedType)) {
                    Type typeG2 = u0.g(0, (ParameterizedType) type);
                    if (typeG2 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) typeG2;
                        if (Intrinsics.areEqual(parameterizedType.getRawType(), u70.q.class)) {
                            return new ky.o(parameterizedType, 10);
                        }
                    }
                }
                return null;
        }
    }
}
