package t1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f39372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f39373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f39374c;

    public /* synthetic */ b1(Object obj, int i11) {
        this(1.0f, 1500.0f, (i11 & 4) != 0 ? null : obj);
    }

    @Override // t1.i
    public final x1 a(v1 v1Var) {
        Object obj = this.f39374c;
        return new ky.o(this.f39372a, this.f39373b, obj == null ? null : (o) v1Var.f39591a.invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (b1Var.f39372a == this.f39372a && b1Var.f39373b == this.f39373b && Intrinsics.areEqual(b1Var.f39374c, this.f39374c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f39374c;
        return Float.hashCode(this.f39373b) + r8.k.a((obj != null ? obj.hashCode() : 0) * 31, this.f39372a, 31);
    }

    public b1(float f11, float f12, Object obj) {
        this.f39372a = f11;
        this.f39373b = f12;
        this.f39374c = obj;
    }
}
