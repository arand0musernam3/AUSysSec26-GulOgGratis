package d2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 implements z4.u0, e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f13812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b4.j f13813b;

    public i2(f fVar, b4.j jVar) {
        this.f13812a = fVar;
        this.f13813b = jVar;
    }

    @Override // z4.u0
    public final int a(z4.u uVar, List list, int i11) {
        int iQ0 = uVar.q0(this.f13812a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f11 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            z4.t tVar = (z4.t) list.get(i13);
            float fB = d2.b(d2.a(tVar));
            int iY = tVar.y(i11);
            if (fB == 0.0f) {
                i12 += iY;
            } else if (fB > 0.0f) {
                f11 += fB;
                iMax = Math.max(iMax, Math.round(iY / fB));
            }
        }
        return ((list.size() - 1) * iQ0) + Math.round(iMax * f11) + i12;
    }

    @Override // z4.u0
    public final int b(z4.u uVar, List list, int i11) {
        int iQ0 = uVar.q0(this.f13812a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f11 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            z4.t tVar = (z4.t) list.get(i13);
            float fB = d2.b(d2.a(tVar));
            int iW = tVar.w(i11);
            if (fB == 0.0f) {
                i12 += iW;
            } else if (fB > 0.0f) {
                f11 += fB;
                iMax = Math.max(iMax, Math.round(iW / fB));
            }
        }
        return ((list.size() - 1) * iQ0) + Math.round(iMax * f11) + i12;
    }

    @Override // z4.u0
    public final z4.v0 c(z4.w0 w0Var, List list, long j9) {
        return f2.a(this, z5.a.k(j9), z5.a.j(j9), z5.a.i(j9), z5.a.h(j9), w0Var.q0(this.f13812a.a()), w0Var, list, new z4.m1[list.size()], 0, list.size(), null, 0);
    }

    @Override // z4.u0
    public final int d(z4.u uVar, List list, int i11) {
        int iQ0 = uVar.q0(this.f13812a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iQ0, i11);
        int size = list.size();
        int iMax = 0;
        float f11 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            z4.t tVar = (z4.t) list.get(i12);
            float fB = d2.b(d2.a(tVar));
            if (fB == 0.0f) {
                int iMin2 = Math.min(tVar.y(Integer.MAX_VALUE), i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i11 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, tVar.b(iMin2));
            } else if (fB > 0.0f) {
                f11 += fB;
            }
        }
        int iRound = f11 == 0.0f ? 0 : i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i11 - iMin, 0) / f11);
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            z4.t tVar2 = (z4.t) list.get(i13);
            float fB2 = d2.b(d2.a(tVar2));
            if (fB2 > 0.0f) {
                iMax = Math.max(iMax, tVar2.b(iRound != Integer.MAX_VALUE ? Math.round(iRound * fB2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // z4.u0
    public final int e(z4.u uVar, List list, int i11) {
        int iQ0 = uVar.q0(this.f13812a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iQ0, i11);
        int size = list.size();
        int iMax = 0;
        float f11 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            z4.t tVar = (z4.t) list.get(i12);
            float fB = d2.b(d2.a(tVar));
            if (fB == 0.0f) {
                int iMin2 = Math.min(tVar.y(Integer.MAX_VALUE), i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i11 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, tVar.V(iMin2));
            } else if (fB > 0.0f) {
                f11 += fB;
            }
        }
        int iRound = f11 == 0.0f ? 0 : i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i11 - iMin, 0) / f11);
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            z4.t tVar2 = (z4.t) list.get(i13);
            float fB2 = d2.b(d2.a(tVar2));
            if (fB2 > 0.0f) {
                iMax = Math.max(iMax, tVar2.V(iRound != Integer.MAX_VALUE ? Math.round(iRound * fB2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return Intrinsics.areEqual(this.f13812a, i2Var.f13812a) && Intrinsics.areEqual(this.f13813b, i2Var.f13813b);
    }

    @Override // d2.e2
    public final long f(int i11, int i12, int i13, boolean z11) {
        return !z11 ? z5.b.a(i11, i12, 0, i13) : y9.w.r(i11, i12, 0, i13);
    }

    @Override // d2.e2
    public final void g(int i11, int[] iArr, int[] iArr2, z4.w0 w0Var) {
        this.f13812a.c(w0Var, i11, iArr, w0Var.getLayoutDirection(), iArr2);
    }

    @Override // d2.e2
    public final int h(z4.m1 m1Var) {
        return m1Var.f47183a;
    }

    public final int hashCode() {
        return this.f13813b.hashCode() + (this.f13812a.hashCode() * 31);
    }

    @Override // d2.e2
    public final int i(z4.m1 m1Var) {
        return m1Var.f47184b;
    }

    @Override // d2.e2
    public final z4.v0 j(z4.m1[] m1VarArr, z4.w0 w0Var, int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15) {
        return z4.w0.f(w0Var, i11, i12, new cn.j(m1VarArr, this, i12, iArr));
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f13812a + ", verticalAlignment=" + this.f13813b + ')';
    }
}
