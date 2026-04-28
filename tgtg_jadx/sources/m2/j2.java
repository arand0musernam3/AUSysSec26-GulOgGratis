package m2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 implements z4.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1 f28917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r5.e0 f28919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function0 f28920d;

    public j2(y1 y1Var, int i11, r5.e0 e0Var, Function0 function0) {
        this.f28917a = y1Var;
        this.f28918b = i11;
        this.f28919c = e0Var;
        this.f28920d = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        return Intrinsics.areEqual(this.f28917a, j2Var.f28917a) && this.f28918b == j2Var.f28918b && Intrinsics.areEqual(this.f28919c, j2Var.f28919c) && Intrinsics.areEqual(this.f28920d, j2Var.f28920d);
    }

    public final int hashCode() {
        return this.f28920d.hashCode() + ((this.f28919c.hashCode() + r8.k.b(this.f28918b, this.f28917a.hashCode() * 31, 31)) * 31);
    }

    @Override // z4.g0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final z4.v0 mo964measure3p2s80s(z4.w0 w0Var, z4.t0 t0Var, long j9) {
        z4.m1 m1VarD = t0Var.D(z5.a.b(j9, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(m1VarD.f47184b, z5.a.h(j9));
        return z4.w0.f(w0Var, m1VarD.f47183a, iMin, new cg.i0(this, m1VarD, iMin, 2));
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f28917a + ", cursorOffset=" + this.f28918b + ", transformedText=" + this.f28919c + ", textLayoutResultProvider=" + this.f28920d + ')';
    }
}
