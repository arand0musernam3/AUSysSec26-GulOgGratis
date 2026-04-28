package s1;

import a3.f2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import m3.k2;
import z4.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends Lambda implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38571b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, int i11) {
        super(3);
        this.f38570a = i11;
        this.f38571b = obj;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f38570a) {
            case 0:
                m1 m1VarD = ((z4.t0) obj2).D(((z5.a) obj3).f47271a);
                return z4.w0.f((z4.w0) obj, m1VarD.f47183a, m1VarD.f47184b, new b4.x(14, m1VarD, (e0) this.f38571b));
            case 1:
                ((Number) obj3).intValue();
                m3.s sVar = (m3.s) ((m3.n) obj2);
                sVar.a0(955869654);
                t1.x xVar = (t1.x) this.f38571b;
                sVar.q(false);
                return xVar;
            case 2:
                ((Number) obj3).intValue();
                m3.s sVar2 = (m3.s) ((m3.n) obj2);
                sVar2.a0(374375707);
                Object objM = sVar2.M();
                if (objM == m3.m.f29332a) {
                    objM = new w4.b0();
                    sVar2.k0(objM);
                }
                w4.b0 b0Var = (w4.b0) objM;
                b0Var.f43102a = (Function1) this.f38571b;
                f2 f2Var = b0Var.f43103b;
                if (f2Var != null) {
                    f2Var.f346b = null;
                }
                b0Var.f43103b = null;
                sVar2.q(false);
                return b0Var;
            default:
                m3.n nVar = ((k2) obj).f29314a;
                m3.n nVar2 = (m3.n) obj2;
                ((Number) obj3).intValue();
                int iHashCode = Long.hashCode(((m3.s) nVar2).T);
                b4.t tVarC = b4.a.c((b4.t) this.f38571b, nVar2);
                m3.s sVar3 = (m3.s) nVar;
                sVar3.b0(509942095);
                b5.j.R.getClass();
                m3.i.C(tVarC, b5.i.f5841d, sVar3);
                m3.i.v(sVar3, Integer.valueOf(iHashCode), b5.i.f5844g);
                sVar3.q(false);
                return Unit.f26487a;
        }
    }
}
