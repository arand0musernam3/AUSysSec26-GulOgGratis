package oa0;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class s0 implements ParameterizedType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f32375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f32376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type[] f32377c;

    public s0(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                i4.a.h();
                throw null;
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            u0.d(type3);
        }
        this.f32375a = type;
        this.f32376b = type2;
        this.f32377c = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && u0.e(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f32377c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f32375a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f32376b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f32377c) ^ this.f32376b.hashCode();
        Type type = this.f32375a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f32377c;
        int length = typeArr.length;
        Type type = this.f32376b;
        if (length == 0) {
            return u0.s(type);
        }
        StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
        sb2.append(u0.s(type));
        sb2.append("<");
        sb2.append(u0.s(typeArr[0]));
        for (int i11 = 1; i11 < typeArr.length; i11++) {
            sb2.append(", ");
            sb2.append(u0.s(typeArr[i11]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
