package z4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f47092a;

    public b1(a1 a1Var) {
        this.f47092a = a1Var;
    }

    @Override // z4.u0
    public final int a(u uVar, List list, int i11) {
        return this.f47092a.a(uVar, b5.o.f(uVar), i11);
    }

    @Override // z4.u0
    public final int b(u uVar, List list, int i11) {
        return this.f47092a.b(uVar, b5.o.f(uVar), i11);
    }

    @Override // z4.u0
    public final v0 c(w0 w0Var, List list, long j9) {
        return this.f47092a.c(w0Var, b5.o.f(w0Var), j9);
    }

    @Override // z4.u0
    public final int d(u uVar, List list, int i11) {
        return this.f47092a.d(uVar, b5.o.f(uVar), i11);
    }

    @Override // z4.u0
    public final int e(u uVar, List list, int i11) {
        return this.f47092a.e(uVar, b5.o.f(uVar), i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1) && Intrinsics.areEqual(this.f47092a, ((b1) obj).f47092a);
    }

    public final int hashCode() {
        return this.f47092a.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f47092a + ')';
    }
}
