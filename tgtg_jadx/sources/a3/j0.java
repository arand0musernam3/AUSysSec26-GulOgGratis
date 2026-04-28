package a3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f401a;

    public final i0 a(n1 n1Var) {
        h0 h0VarJ;
        h0 h0VarJ2;
        switch (this.f401a) {
            case 0:
                return new i0(n1Var.k().a(n1Var.k().f339c), n1Var.f().a(n1Var.f().f340d), n1Var.g() == k.CROSSED);
            case 1:
                return dx.f.q(new i0(n1Var.k().a(n1Var.k().f339c), n1Var.f().a(n1Var.f().f340d), n1Var.g() == k.CROSSED), n1Var);
            case 2:
                return dx.f.h(n1Var, k0.f430c);
            case 3:
                return dx.f.h(n1Var, k0.f429b);
            default:
                i0 i0VarC = n1Var.c();
                if (i0VarC == null) {
                    return dx.f.h(n1Var, k0.f430c);
                }
                h0 h0Var = i0VarC.f386b;
                h0 h0Var2 = i0VarC.f385a;
                if (n1Var.a()) {
                    h0VarJ2 = dx.f.j(n1Var, n1Var.k(), h0Var2);
                    h0VarJ = h0Var;
                    h0Var = h0Var2;
                    h0Var2 = h0VarJ2;
                } else {
                    h0VarJ = dx.f.j(n1Var, n1Var.f(), h0Var);
                    h0VarJ2 = h0VarJ;
                }
                if (Intrinsics.areEqual(h0VarJ2, h0Var)) {
                    return i0VarC;
                }
                return dx.f.q(new i0(h0Var2, h0VarJ, n1Var.g() == k.CROSSED || (n1Var.g() == k.COLLAPSED && h0Var2.f367b > h0VarJ.f367b)), n1Var);
        }
    }
}
