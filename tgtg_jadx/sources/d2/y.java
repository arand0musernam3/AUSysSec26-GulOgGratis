package d2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements z4.u0, e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f13971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b4.e f13972b;

    public y(h hVar, b4.e eVar) {
        this.f13971a = hVar;
        this.f13972b = eVar;
    }

    @Override // z4.u0
    public final int a(z4.u uVar, List list, int i11) {
        int iQ0 = uVar.q0(this.f13971a.a());
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
                int iMin2 = Math.min(tVar.b(Integer.MAX_VALUE), i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i11 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, tVar.y(iMin2));
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
                iMax = Math.max(iMax, tVar2.y(iRound != Integer.MAX_VALUE ? Math.round(iRound * fB2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // z4.u0
    public final int b(z4.u uVar, List list, int i11) {
        int iQ0 = uVar.q0(this.f13971a.a());
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
                int iMin2 = Math.min(tVar.b(Integer.MAX_VALUE), i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i11 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, tVar.w(iMin2));
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
                iMax = Math.max(iMax, tVar2.w(iRound != Integer.MAX_VALUE ? Math.round(iRound * fB2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // z4.u0
    public final z4.v0 c(z4.w0 w0Var, List list, long j9) {
        return f2.a(this, z5.a.j(j9), z5.a.k(j9), z5.a.h(j9), z5.a.i(j9), w0Var.q0(this.f13971a.a()), w0Var, list, new z4.m1[list.size()], 0, list.size(), null, 0);
    }

    @Override // z4.u0
    public final int d(z4.u uVar, List list, int i11) {
        int iQ0 = uVar.q0(this.f13971a.a());
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
            int iB = tVar.b(i11);
            if (fB == 0.0f) {
                i12 += iB;
            } else if (fB > 0.0f) {
                f11 += fB;
                iMax = Math.max(iMax, Math.round(iB / fB));
            }
        }
        return ((list.size() - 1) * iQ0) + Math.round(iMax * f11) + i12;
    }

    @Override // z4.u0
    public final int e(z4.u uVar, List list, int i11) {
        int iQ0 = uVar.q0(this.f13971a.a());
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
            int iV = tVar.V(i11);
            if (fB == 0.0f) {
                i12 += iV;
            } else if (fB > 0.0f) {
                f11 += fB;
                iMax = Math.max(iMax, Math.round(iV / fB));
            }
        }
        return ((list.size() - 1) * iQ0) + Math.round(iMax * f11) + i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.areEqual(this.f13971a, yVar.f13971a) && Intrinsics.areEqual(this.f13972b, yVar.f13972b);
    }

    @Override // d2.e2
    public final long f(int i11, int i12, int i13, boolean z11) {
        return !z11 ? z5.b.a(0, i13, i11, i12) : y9.w.q(0, i13, i11, i12);
    }

    @Override // d2.e2
    public final void g(int i11, int[] iArr, int[] iArr2, z4.w0 w0Var) {
        this.f13971a.b(w0Var, i11, iArr, iArr2);
    }

    @Override // d2.e2
    public final int h(z4.m1 m1Var) {
        return m1Var.f47184b;
    }

    public final int hashCode() {
        return this.f13972b.hashCode() + (this.f13971a.hashCode() * 31);
    }

    @Override // d2.e2
    public final int i(z4.m1 m1Var) {
        return m1Var.f47183a;
    }

    @Override // d2.e2
    public final z4.v0 j(z4.m1[] m1VarArr, z4.w0 w0Var, int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15) {
        return z4.w0.f(w0Var, i12, i11, new x(m1VarArr, this, i12, w0Var, iArr, 0));
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f13971a + ", horizontalAlignment=" + this.f13972b + ')';
    }
}
