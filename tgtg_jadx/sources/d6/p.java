package d6;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import m3.b1;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f14520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f14521c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(g0 g0Var, b1 b1Var, int i11) {
        super(2);
        this.f14519a = i11;
        this.f14520b = g0Var;
        this.f14521c = b1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f14519a;
        b1 b1Var = this.f14521c;
        g0 g0Var = this.f14520b;
        int i12 = 0;
        switch (i11) {
            case 0:
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Number) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objM = sVar.M();
                    m3.f fVar = m3.m.f29332a;
                    if (objM == fVar) {
                        objM = d.f14443e;
                        sVar.k0(objM);
                    }
                    b4.t tVarC = j5.r.c(b4.q.f5711a, false, (Function1) objM);
                    boolean zH = sVar.h(g0Var);
                    Object objM2 = sVar.M();
                    if (zH || objM2 == fVar) {
                        objM2 = new m(g0Var, 1);
                        sVar.k0(objM2);
                    }
                    b4.t tVarA = f4.g.a(z4.c0.q(tVarC, (Function1) objM2), g0Var.getCanCalculatePosition() ? 1.0f : 0.0f);
                    m3.e0 e0Var = r.f14523a;
                    Function2 function2 = (Function2) b1Var.getValue();
                    Object objM3 = sVar.M();
                    if (objM3 == fVar) {
                        objM3 = q.f14522a;
                        sVar.k0(objM3);
                    }
                    u0 u0Var = (u0) objM3;
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    b4.t tVarC2 = b4.a.c(tVarA, sVar);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(u0Var, b5.i.f5843f, sVar);
                    m3.i.C(iVarL, b5.i.f5842e, sVar);
                    m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar, b5.i.f5845h);
                    m3.i.C(tVarC2, b5.i.f5841d, sVar);
                    w.a0.w(0, function2, sVar, true);
                } else {
                    sVar.U();
                }
                break;
            default:
                m3.n nVar2 = (m3.n) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    m3.i.a(r.f14524b.a(Boolean.TRUE), u3.e.e(1022273628, sVar2, new p(g0Var, b1Var, i12)), sVar2, 56);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
