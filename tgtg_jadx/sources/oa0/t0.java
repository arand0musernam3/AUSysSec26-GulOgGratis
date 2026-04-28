package oa0;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class t0 implements WildcardType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f32380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f32381b;

    public t0(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            i4.a.h();
            throw null;
        }
        if (typeArr.length != 1) {
            i4.a.h();
            throw null;
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            u0.d(typeArr[0]);
            this.f32381b = null;
            this.f32380a = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        u0.d(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            i4.a.h();
            throw null;
        }
        this.f32381b = typeArr2[0];
        this.f32380a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && u0.e(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f32381b;
        return type != null ? new Type[]{type} : u0.f32385a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f32380a};
    }

    public final int hashCode() {
        Type type = this.f32381b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f32380a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f32381b;
        if (type != null) {
            return "? super " + u0.s(type);
        }
        Type type2 = this.f32380a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + u0.s(type2);
    }
}
