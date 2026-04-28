package d2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld2/q1;", "Lb5/h1;", "Ld2/s1;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class q1 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function1 f13891e;

    public q1(float f11, float f12, boolean z11, Function1 function1) {
        this.f13888b = f11;
        this.f13889c = f12;
        this.f13890d = z11;
        this.f13891e = function1;
    }

    @Override // b5.h1
    public final b4.s create() {
        s1 s1Var = new s1();
        s1Var.f13924o = this.f13888b;
        s1Var.f13925p = this.f13889c;
        s1Var.f13926q = this.f13890d;
        return s1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        q1 q1Var = obj instanceof q1 ? (q1) obj : null;
        return q1Var != null && z5.f.c(this.f13888b, q1Var.f13888b) && z5.f.c(this.f13889c, q1Var.f13889c) && this.f13890d == q1Var.f13890d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13890d) + r8.k.a(Float.hashCode(this.f13888b) * 31, this.f13889c, 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(c5.o2 o2Var) {
        this.f13891e.invoke(o2Var);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OffsetModifierElement(x=");
        r8.k.u(this.f13888b, ", y=", sb2);
        r8.k.u(this.f13889c, ", rtlAware=", sb2);
        return r8.k.q(sb2, this.f13890d, ')');
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        s1 s1Var = (s1) sVar;
        float f11 = s1Var.f13924o;
        float f12 = this.f13888b;
        boolean zC = z5.f.c(f11, f12);
        float f13 = this.f13889c;
        boolean z11 = this.f13890d;
        if (!zC || !z5.f.c(s1Var.f13925p, f13) || s1Var.f13926q != z11) {
            b5.m0 m0VarG = b5.m.g(s1Var);
            b5.g0 g0Var = b5.m0.V;
            m0VarG.X(false);
        }
        s1Var.f13924o = f12;
        s1Var.f13925p = f13;
        s1Var.f13926q = z11;
    }
}
