package d2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 implements y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2 f13877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13878b;

    public p1(y2 y2Var, int i11) {
        this.f13877a = y2Var;
        this.f13878b = i11;
    }

    @Override // d2.y2
    public final int a(z5.c cVar, z5.m mVar) {
        if (((mVar == z5.m.Ltr ? 8 : 2) & this.f13878b) != 0) {
            return this.f13877a.a(cVar, mVar);
        }
        return 0;
    }

    @Override // d2.y2
    public final int b(z5.c cVar, z5.m mVar) {
        if (((mVar == z5.m.Ltr ? 4 : 1) & this.f13878b) != 0) {
            return this.f13877a.b(cVar, mVar);
        }
        return 0;
    }

    @Override // d2.y2
    public final int c(z5.c cVar) {
        if ((this.f13878b & 32) != 0) {
            return this.f13877a.c(cVar);
        }
        return 0;
    }

    @Override // d2.y2
    public final int d(z5.c cVar) {
        if ((this.f13878b & 16) != 0) {
            return this.f13877a.d(cVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return Intrinsics.areEqual(this.f13877a, p1Var.f13877a) && this.f13878b == p1Var.f13878b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13878b) + (this.f13877a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(this.f13877a);
        sb2.append(" only ");
        StringBuilder sb3 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb4 = new StringBuilder();
        int i11 = c.f13758d;
        int i12 = this.f13878b;
        if ((i12 & i11) == i11) {
            c.I("Start", sb4);
        }
        int i13 = c.f13760f;
        if ((i12 & i13) == i13) {
            c.I("Left", sb4);
        }
        if ((i12 & 16) == 16) {
            c.I("Top", sb4);
        }
        int i14 = c.f13759e;
        if ((i12 & i14) == i14) {
            c.I("End", sb4);
        }
        int i15 = c.f13761g;
        if ((i12 & i15) == i15) {
            c.I("Right", sb4);
        }
        if ((i12 & 32) == 32) {
            c.I("Bottom", sb4);
        }
        sb3.append(sb4.toString());
        sb3.append(')');
        sb2.append((Object) sb3.toString());
        sb2.append(')');
        return sb2.toString();
    }
}
