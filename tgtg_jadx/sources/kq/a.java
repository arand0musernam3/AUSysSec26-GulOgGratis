package kq;

import b4.q;
import b4.t;
import bn.h0;
import d2.m2;
import g3.e2;
import g3.h6;
import g3.m0;
import g3.p0;
import g3.r0;
import i4.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import l2.f;
import l2.g;
import l3.y;
import m3.i;
import m3.m;
import m3.n;
import m3.s;
import u3.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26643a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f26645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f26646d;

    public /* synthetic */ a(String str, Function0 function0, boolean z11) {
        this.f26645c = z11;
        this.f26646d = function0;
        this.f26644b = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j9;
        long j11;
        long j12;
        int i11 = this.f26643a;
        Function0 function0 = this.f26646d;
        boolean z11 = this.f26645c;
        String str = this.f26644b;
        switch (i11) {
            case 0:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(1 & iIntValue, (iIntValue & 3) != 2)) {
                    t tVarV = m2.v(m2.e(q.f5711a, 32), 3);
                    f fVarB = g.b(8);
                    float f11 = e2.f18510a;
                    long j13 = z11 ? lv.s.f28217b : lv.s.f28245z;
                    long j14 = z11 ? lv.s.J : lv.s.f28215a;
                    long j15 = v.f23315h;
                    p0 p0Var = (p0) sVar.j(r0.f19375a);
                    h6 h6Var = p0Var.Z;
                    if (h6Var == null) {
                        long j16 = v.f23314g;
                        j9 = j13;
                        h6Var = new h6(j16, r0.d(p0Var, y.f27226n), r0.d(p0Var, y.f27230r), r0.d(p0Var, y.f27234v), j16, v.b(y.f27216c, r0.d(p0Var, y.f27215b)), v.b(y.f27228p, r0.d(p0Var, y.f27227o)), v.b(y.f27232t, r0.d(p0Var, y.f27231s)), r0.d(p0Var, y.f27221h), v.b(y.f27220g, r0.d(p0Var, y.f27219f)), r0.d(p0Var, y.f27225m), r0.d(p0Var, y.f27229q), r0.d(p0Var, y.f27233u));
                        p0Var.Z = h6Var;
                    } else {
                        j9 = j13;
                    }
                    if (j9 != 16) {
                        j11 = 16;
                        j12 = j9;
                    } else {
                        j11 = 16;
                        j12 = h6Var.f18746a;
                    }
                    if (j14 == j11) {
                        j14 = h6Var.f18747b;
                    }
                    h6 h6Var2 = new h6(j12, j14, j15 != j11 ? j15 : h6Var.f18748c, j15 != j11 ? j15 : h6Var.f18749d, j15 != j11 ? j15 : h6Var.f18750e, j15 != j11 ? j15 : h6Var.f18751f, j15 != j11 ? j15 : h6Var.f18752g, j15 != j11 ? j15 : h6Var.f18753h, j15 != j11 ? j15 : h6Var.f18754i, j15 != j11 ? j15 : h6Var.f18755j, j15 != j11 ? j15 : h6Var.f18756k, j15 != j11 ? j15 : h6Var.l, j15 != j11 ? j15 : h6Var.f18757m);
                    boolean zF = sVar.f(function0);
                    Object objM = sVar.M();
                    if (zF || objM == m.f29332a) {
                        objM = new ki.a(8, function0);
                        sVar.k0(objM);
                    }
                    m0.b((Function0) objM, e.e(-1176008180, sVar, new h0(str, 3)), tVarV, false, fVarB, h6Var2, null, null, sVar, 3462);
                } else {
                    sVar.U();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                zz.f.g(str, z11, function0, (n) obj, i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ a(String str, boolean z11, Function0 function0, int i11) {
        this.f26644b = str;
        this.f26645c = z11;
        this.f26646d = function0;
    }
}
