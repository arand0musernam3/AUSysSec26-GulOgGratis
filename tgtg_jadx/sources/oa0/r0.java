package oa0;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class r0 implements GenericArrayType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f32372a;

    public r0(Type type) {
        this.f32372a = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && u0.e(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f32372a;
    }

    public final int hashCode() {
        return this.f32372a.hashCode();
    }

    public final String toString() {
        return u0.s(this.f32372a) + "[]";
    }
}
