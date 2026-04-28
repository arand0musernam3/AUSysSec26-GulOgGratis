package c5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7275b;

    public k3(String str, Object obj) {
        this.f7274a = str;
        this.f7275b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj;
        return Intrinsics.areEqual(this.f7274a, k3Var.f7274a) && Intrinsics.areEqual(this.f7275b, k3Var.f7275b);
    }

    public final int hashCode() {
        int iHashCode = this.f7274a.hashCode() * 31;
        Object obj = this.f7275b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ValueElement(name=" + this.f7274a + ", value=" + this.f7275b + ')';
    }
}
