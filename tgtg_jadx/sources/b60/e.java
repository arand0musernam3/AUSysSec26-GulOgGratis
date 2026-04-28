package b60;

import a60.h0;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements WildcardType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f6047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f6048b;

    public e(Type[] typeArr, Type[] typeArr2) {
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
            f.b(typeArr[0]);
            this.f6048b = null;
            this.f6047a = f.a(typeArr[0]);
            return;
        }
        typeArr2[0].getClass();
        f.b(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            i4.a.h();
            throw null;
        }
        this.f6048b = f.a(typeArr2[0]);
        this.f6047a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && h0.c(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f6048b;
        return type != null ? new Type[]{type} : f.f6050b;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f6047a};
    }

    public final int hashCode() {
        Type type = this.f6048b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f6047a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f6048b;
        if (type != null) {
            return "? super " + f.i(type);
        }
        Type type2 = this.f6047a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + f.i(type2);
    }
}
