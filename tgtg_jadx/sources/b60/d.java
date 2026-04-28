package b60;

import a60.h0;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Set;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements ParameterizedType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f6044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f6045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type[] f6046c;

    public d(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
            if (type != null) {
                if (enclosingClass == null || h0.e(type) != enclosingClass) {
                    i1.k("unexpected owner type for ", type2, ": ", type);
                    throw null;
                }
            } else if (enclosingClass != null) {
                j4.d.m("unexpected owner type for ", type2, ": null");
                throw null;
            }
        }
        this.f6044a = type == null ? null : f.a(type);
        this.f6045b = f.a(type2);
        this.f6046c = (Type[]) typeArr.clone();
        int i11 = 0;
        while (true) {
            Type[] typeArr2 = this.f6046c;
            if (i11 >= typeArr2.length) {
                return;
            }
            typeArr2[i11].getClass();
            f.b(this.f6046c[i11]);
            Type[] typeArr3 = this.f6046c;
            typeArr3[i11] = f.a(typeArr3[i11]);
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && h0.c(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f6046c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f6044a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f6045b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f6046c) ^ this.f6045b.hashCode();
        Set set = f.f6049a;
        Type type = this.f6044a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f6046c;
        StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
        sb2.append(f.i(this.f6045b));
        if (typeArr.length == 0) {
            return sb2.toString();
        }
        sb2.append("<");
        sb2.append(f.i(typeArr[0]));
        for (int i11 = 1; i11 < typeArr.length; i11++) {
            sb2.append(", ");
            sb2.append(f.i(typeArr[i11]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
