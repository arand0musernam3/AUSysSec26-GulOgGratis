package d2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2 f13776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z5.c f13777b;

    public e1(y2 y2Var, z5.c cVar) {
        this.f13776a = y2Var;
        this.f13777b = cVar;
    }

    @Override // d2.z1
    public final float a() {
        y2 y2Var = this.f13776a;
        z5.c cVar = this.f13777b;
        return cVar.O(y2Var.c(cVar));
    }

    @Override // d2.z1
    public final float b(z5.m mVar) {
        y2 y2Var = this.f13776a;
        z5.c cVar = this.f13777b;
        return cVar.O(y2Var.b(cVar, mVar));
    }

    @Override // d2.z1
    public final float c() {
        y2 y2Var = this.f13776a;
        z5.c cVar = this.f13777b;
        return cVar.O(y2Var.d(cVar));
    }

    @Override // d2.z1
    public final float d(z5.m mVar) {
        y2 y2Var = this.f13776a;
        z5.c cVar = this.f13777b;
        return cVar.O(y2Var.a(cVar, mVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return Intrinsics.areEqual(this.f13776a, e1Var.f13776a) && Intrinsics.areEqual(this.f13777b, e1Var.f13777b);
    }

    public final int hashCode() {
        return this.f13777b.hashCode() + (this.f13776a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f13776a + ", density=" + this.f13777b + ')';
    }
}
