package v1;

import kotlin.jvm.internal.Intrinsics;
import z1.g3;
import z1.h2;
import z1.h3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 extends b5.n implements b5.k, b5.y1 {
    public b5.n A;
    public j B;
    public i C;
    public boolean D;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h3 f41680q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h2 f41681r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f41682s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f41683t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public z1.l1 f41684u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b2.l f41685v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public z1.u f41686w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f41687x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public o1 f41688y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public g3 f41689z;

    public final void O0() {
        b5.l lVar = this.A;
        if (lVar != null) {
            if (lVar.getNode().isAttached()) {
                return;
            }
            L0(lVar);
            return;
        }
        if (this.f41687x) {
            b5.o.m(this, new rv.a(this, 14));
        }
        Object obj = this.f41687x ? this.C : this.f41688y;
        if (obj != null) {
            b5.n nVar = ((i) obj).f41759i;
            if (nVar.getNode().isAttached()) {
                return;
            }
            L0(nVar);
            this.A = nVar;
        }
    }

    public final boolean P0() {
        z5.m mVar = z5.m.Ltr;
        if (isAttached()) {
            mVar = b5.m.g(this).A;
        }
        h2 h2Var = this.f41681r;
        boolean z11 = this.f41683t;
        return (mVar != z5.m.Rtl || h2Var == h2.Vertical) ? !z11 : z11;
    }

    public final void Q0(b2.l lVar, o1 o1Var, z1.u uVar, z1.l1 l1Var, h2 h2Var, h3 h3Var, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        this.f41680q = h3Var;
        this.f41681r = h2Var;
        boolean z15 = true;
        if (this.f41687x != z11) {
            this.f41687x = z11;
            z14 = true;
        } else {
            z14 = false;
        }
        if (Intrinsics.areEqual(this.f41688y, o1Var)) {
            z15 = false;
        } else {
            this.f41688y = o1Var;
        }
        if (z14 || (z15 && !z11)) {
            b5.n nVar = this.A;
            if (nVar != null) {
                M0(nVar);
            }
            this.A = null;
            O0();
        }
        this.f41682s = z12;
        this.f41683t = z13;
        this.f41684u = l1Var;
        this.f41685v = lVar;
        this.f41686w = uVar;
        boolean zP0 = P0();
        this.D = zP0;
        g3 g3Var = this.f41689z;
        if (g3Var != null) {
            g3Var.g1(lVar, this.f41687x ? this.C : this.f41688y, uVar, l1Var, h2Var, h3Var, z12, zP0);
        }
    }

    @Override // b4.s
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // b5.y1
    public final void l0() {
        j jVar = (j) b5.o.e(this, p1.f41821a);
        if (Intrinsics.areEqual(jVar, this.B)) {
            return;
        }
        this.B = jVar;
        this.C = null;
        b5.n nVar = this.A;
        if (nVar != null) {
            M0(nVar);
        }
        this.A = null;
        O0();
        g3 g3Var = this.f41689z;
        if (g3Var != null) {
            h3 h3Var = this.f41680q;
            h2 h2Var = this.f41681r;
            o1 o1Var = this.f41687x ? this.C : this.f41688y;
            g3Var.g1(this.f41685v, o1Var, this.f41686w, this.f41684u, h2Var, h3Var, this.f41682s, this.D);
        }
    }

    @Override // b4.s
    public final void onAttach() {
        this.D = P0();
        O0();
        if (this.f41689z == null) {
            h3 h3Var = this.f41680q;
            g3 g3Var = new g3(this.f41685v, this.f41687x ? this.C : this.f41688y, this.f41686w, this.f41684u, this.f41681r, h3Var, this.f41682s, this.D);
            L0(g3Var);
            this.f41689z = g3Var;
        }
    }

    @Override // b4.s
    public final void onDetach() {
        b5.n nVar = this.A;
        if (nVar != null) {
            M0(nVar);
        }
    }

    @Override // b5.l
    public final void onLayoutDirectionChange() {
        boolean zP0 = P0();
        if (this.D != zP0) {
            this.D = zP0;
            h3 h3Var = this.f41680q;
            h2 h2Var = this.f41681r;
            boolean z11 = this.f41687x;
            o1 o1Var = z11 ? this.C : this.f41688y;
            Q0(this.f41685v, o1Var, this.f41686w, this.f41684u, h2Var, h3Var, z11, this.f41682s, this.f41683t);
        }
    }
}
