package m2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements z4.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1 f29102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r5.e0 f29104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function0 f29105d;

    public w0(y1 y1Var, int i11, r5.e0 e0Var, Function0 function0) {
        this.f29102a = y1Var;
        this.f29103b = i11;
        this.f29104c = e0Var;
        this.f29105d = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return Intrinsics.areEqual(this.f29102a, w0Var.f29102a) && this.f29103b == w0Var.f29103b && Intrinsics.areEqual(this.f29104c, w0Var.f29104c) && Intrinsics.areEqual(this.f29105d, w0Var.f29105d);
    }

    public final int hashCode() {
        return this.f29105d.hashCode() + ((this.f29104c.hashCode() + r8.k.b(this.f29103b, this.f29102a.hashCode() * 31, 31)) * 31);
    }

    @Override // z4.g0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final z4.v0 mo964measure3p2s80s(z4.w0 w0Var, z4.t0 t0Var, long j9) {
        long j11;
        if (t0Var.y(z5.a.h(j9)) < z5.a.i(j9)) {
            j11 = j9;
        } else {
            j11 = j9;
            j9 = z5.a.b(j11, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        z4.m1 m1VarD = t0Var.D(j9);
        int iMin = Math.min(m1VarD.f47183a, z5.a.i(j11));
        return z4.w0.f(w0Var, iMin, m1VarD.f47184b, new cn.j(this, w0Var, m1VarD, iMin, 2));
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f29102a + ", cursorOffset=" + this.f29103b + ", transformedText=" + this.f29104c + ", textLayoutResultProvider=" + this.f29105d + ')';
    }
}
