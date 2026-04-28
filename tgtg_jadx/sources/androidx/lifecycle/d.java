package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f3422b;

    public d(Method method, int i11) {
        this.f3421a = i11;
        this.f3422b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f3421a == dVar.f3421a && this.f3422b.getName().equals(dVar.f3422b.getName());
    }

    public final int hashCode() {
        return this.f3422b.getName().hashCode() + (this.f3421a * 31);
    }
}
