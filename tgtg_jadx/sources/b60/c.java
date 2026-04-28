package b60;

import a60.h0;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements GenericArrayType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f6043a;

    public c(Type type) {
        this.f6043a = f.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && h0.c(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f6043a;
    }

    public final int hashCode() {
        return this.f6043a.hashCode();
    }

    public final String toString() {
        return f.i(this.f6043a) + "[]";
    }
}
