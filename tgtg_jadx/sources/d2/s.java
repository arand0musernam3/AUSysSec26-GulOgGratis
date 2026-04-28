package d2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements z4.u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4.f f13913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13914b;

    public s(b4.f fVar, boolean z11) {
        this.f13913a = fVar;
        this.f13914b = z11;
    }

    @Override // z4.u0
    public final z4.v0 c(z4.w0 w0Var, List list, long j9) {
        int iK;
        int iJ;
        z4.m1 m1VarD;
        if (list.isEmpty()) {
            return z4.w0.f(w0Var, z5.a.k(j9), z5.a.j(j9), new cp.i(5));
        }
        long j11 = this.f13914b ? j9 : j9 & (-8589934589L);
        if (list.size() == 1) {
            z4.t0 t0Var = (z4.t0) list.get(0);
            Object objG = t0Var.G();
            n nVar = objG instanceof n ? (n) objG : null;
            if (nVar != null ? nVar.f13858p : false) {
                iK = z5.a.k(j9);
                iJ = z5.a.j(j9);
                int iK2 = z5.a.k(j9);
                int iJ2 = z5.a.j(j9);
                if (!((iJ2 >= 0) & (iK2 >= 0))) {
                    z5.i.a("width and height must be >= 0");
                }
                m1VarD = t0Var.D(z5.b.h(iK2, iK2, iJ2, iJ2));
            } else {
                m1VarD = t0Var.D(j11);
                iK = Math.max(z5.a.k(j9), m1VarD.f47183a);
                iJ = Math.max(z5.a.j(j9), m1VarD.f47184b);
            }
            int i11 = iJ;
            int i12 = iK;
            return z4.w0.f(w0Var, i12, i11, new q(m1VarD, t0Var, w0Var, i12, i11, this));
        }
        z4.m1[] m1VarArr = new z4.m1[list.size()];
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = z5.a.k(j9);
        Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = z5.a.j(j9);
        int size = list.size();
        boolean z11 = false;
        for (int i13 = 0; i13 < size; i13++) {
            z4.t0 t0Var2 = (z4.t0) list.get(i13);
            Object objG2 = t0Var2.G();
            n nVar2 = objG2 instanceof n ? (n) objG2 : null;
            if (nVar2 != null ? nVar2.f13858p : false) {
                z11 = true;
            } else {
                z4.m1 m1VarD2 = t0Var2.D(j11);
                m1VarArr[i13] = m1VarD2;
                intRef.element = Math.max(intRef.element, m1VarD2.f47183a);
                intRef2.element = Math.max(intRef2.element, m1VarD2.f47184b);
            }
        }
        if (z11) {
            int i14 = intRef.element;
            int i15 = i14 != Integer.MAX_VALUE ? i14 : 0;
            int i16 = intRef2.element;
            long jA = z5.b.a(i15, i14, i16 != Integer.MAX_VALUE ? i16 : 0, i16);
            int size2 = list.size();
            for (int i17 = 0; i17 < size2; i17++) {
                z4.t0 t0Var3 = (z4.t0) list.get(i17);
                Object objG3 = t0Var3.G();
                n nVar3 = objG3 instanceof n ? (n) objG3 : null;
                if (nVar3 != null ? nVar3.f13858p : false) {
                    m1VarArr[i17] = t0Var3.D(jA);
                }
            }
        }
        return z4.w0.f(w0Var, intRef.element, intRef2.element, new r(m1VarArr, list, w0Var, intRef, intRef2, this, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.areEqual(this.f13913a, sVar.f13913a) && this.f13914b == sVar.f13914b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13914b) + (this.f13913a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb2.append(this.f13913a);
        sb2.append(", propagateMinConstraints=");
        return r8.k.q(sb2, this.f13914b, ')');
    }
}
