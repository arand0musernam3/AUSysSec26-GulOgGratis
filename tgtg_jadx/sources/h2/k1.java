package h2;

import b5.l2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import z1.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends b4.s implements l2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Function0 f21149o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public g1 f21150p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h2 f21151q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f21152r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f21153s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j5.k f21154t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final i1 f21155u = new i1(this, 0);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i1 f21156v;

    public k1(Function0 function0, g1 g1Var, h2 h2Var, boolean z11, boolean z12) {
        this.f21149o = function0;
        this.f21150p = g1Var;
        this.f21151q = h2Var;
        this.f21152r = z11;
        this.f21153s = z12;
        L0();
    }

    public final void L0() {
        this.f21154t = new j5.k(new j1(this, 0), new j1(this, 1), this.f21153s);
        this.f21156v = this.f21152r ? new i1(this, 1) : null;
    }

    @Override // b4.s
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // b5.l2
    public final void h0(j5.b0 b0Var) {
        j5.z.q(b0Var);
        b0Var.b(j5.x.M, this.f21155u);
        h2 h2Var = this.f21151q;
        h2 h2Var2 = h2.Vertical;
        j5.k kVar = this.f21154t;
        if (h2Var == h2Var2) {
            if (kVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scrollAxisRange");
                kVar = null;
            }
            j5.a0 a0Var = j5.x.f24727v;
            KProperty kProperty = j5.z.f24734a[13];
            b0Var.b(a0Var, kVar);
        } else {
            if (kVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scrollAxisRange");
                kVar = null;
            }
            j5.a0 a0Var2 = j5.x.f24726u;
            KProperty kProperty2 = j5.z.f24734a[12];
            b0Var.b(a0Var2, kVar);
        }
        i1 i1Var = this.f21156v;
        if (i1Var != null) {
            b0Var.b(j5.m.f24662f, new j5.a(null, i1Var));
        }
        b0Var.b(j5.m.C, new j5.a(null, new androidx.fragment.app.r(new j1(this, 2), 24)));
        j5.d dVarE = this.f21150p.e();
        j5.a0 a0Var3 = j5.x.f24712f;
        KProperty kProperty3 = j5.z.f24734a[23];
        b0Var.b(a0Var3, dVarE);
    }
}
