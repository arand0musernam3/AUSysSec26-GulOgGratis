package t1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f39502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f39503b;

    public o1(Object obj, Object obj2) {
        this.f39502a = obj;
        this.f39503b = obj2;
    }

    @Override // t1.n1
    public final Object a() {
        return this.f39502a;
    }

    @Override // t1.n1
    public final Object c() {
        return this.f39503b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return Intrinsics.areEqual(this.f39502a, n1Var.a()) && Intrinsics.areEqual(this.f39503b, n1Var.c());
    }

    public final int hashCode() {
        Object obj = this.f39502a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f39503b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
