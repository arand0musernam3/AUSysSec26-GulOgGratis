package xh;

import a3.f2;
import c5.d2;
import com.app.tgtg.R;
import d2.m2;
import d2.z1;
import g3.r9;
import i4.r0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m3.b1;
import m5.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44322a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f44323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f44324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f44325d;

    public /* synthetic */ g(g9.f0 f0Var, b1 b1Var, b1 b1Var2) {
        this.f44324c = f0Var;
        this.f44323b = b1Var;
        this.f44325d = b1Var2;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f44322a;
        m3.f fVar = m3.m.f29332a;
        r0 r0Var = i4.g0.f23254b;
        b4.q qVar = b4.q.f5711a;
        b1 b1Var = this.f44323b;
        Object obj4 = this.f44325d;
        Object obj5 = this.f44324c;
        switch (i11) {
            case 0:
                g9.f0 f0Var = (g9.f0) obj5;
                b1 b1Var2 = (b1) obj4;
                z1 z1Var = (z1) obj;
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                z1Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((m3.s) nVar).f(z1Var) ? 4 : 2;
                }
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(1 & iIntValue, (iIntValue & 19) != 18)) {
                    b4.t tVarThen = d2.c.y(v1.n.j(qVar, lv.s.I, r0Var), z1Var).then(m2.f13850c);
                    boolean zH = sVar.h(f0Var);
                    Object objM = sVar.M();
                    if (zH || objM == fVar) {
                        objM = new f2(f0Var, 13);
                        sVar.k0(objM);
                    }
                    Function1 function1 = (Function1) objM;
                    boolean zH2 = sVar.h(f0Var);
                    Object objM2 = sVar.M();
                    if (zH2 || objM2 == fVar) {
                        objM2 = new dq.g(f0Var, 20);
                        sVar.k0(objM2);
                    }
                    Function0 function0 = (Function0) objM2;
                    boolean zF = sVar.f(b1Var);
                    Object objM3 = sVar.M();
                    if (zF || objM3 == fVar) {
                        objM3 = new sn.c(b1Var, 6);
                        sVar.k0(objM3);
                    }
                    Function1 function12 = (Function1) objM3;
                    boolean zH3 = sVar.h(f0Var);
                    Object objM4 = sVar.M();
                    if (zH3 || objM4 == fVar) {
                        objM4 = new dq.g(f0Var, 21);
                        sVar.k0(objM4);
                    }
                    Function0 function02 = (Function0) objM4;
                    boolean zH4 = sVar.h(f0Var);
                    Object objM5 = sVar.M();
                    if (zH4 || objM5 == fVar) {
                        objM5 = new dq.g(f0Var, 22);
                        sVar.k0(objM5);
                    }
                    Function0 function03 = (Function0) objM5;
                    Object objM6 = sVar.M();
                    if (objM6 == fVar) {
                        objM6 = new sn.c(b1Var2, 7);
                        sVar.k0(objM6);
                    }
                    ii.l.i(tVarThen, null, null, function1, function0, function12, function02, function03, (Function1) objM6, sVar, 100663296);
                } else {
                    sVar.U();
                }
                break;
            default:
                Function1 function13 = (Function1) obj5;
                m5.h hVar = (m5.h) obj4;
                m3.n nVar2 = (m3.n) obj2;
                ((Integer) obj3).getClass();
                ((s1.z) obj).getClass();
                b4.t tVarD = d2.c.D(v1.n.j(qVar, lv.s.I, r0Var), 0.0f, 0.0f, 0.0f, lv.t.f28254h, 7);
                d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, nVar2, 0);
                m3.s sVar2 = (m3.s) nVar2;
                int iHashCode = Long.hashCode(sVar2.T);
                u3.i iVarL = sVar2.l();
                b4.t tVarC = b4.a.c(tVarD, nVar2);
                b5.j.R.getClass();
                b5.h hVar2 = b5.i.f5839b;
                sVar2.e0();
                if (sVar2.S) {
                    sVar2.k(hVar2);
                } else {
                    sVar2.n0();
                }
                m3.i.C(yVarA, b5.i.f5843f, nVar2);
                m3.i.C(iVarL, b5.i.f5842e, nVar2);
                m3.i.v(nVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
                m3.i.z(nVar2, b5.i.f5845h);
                m3.i.C(tVarC, b5.i.f5841d, nVar2);
                b4.t tVarD2 = m2.d(qVar, 1.0f);
                float f11 = lv.t.f28253g;
                b4.t tVarB = d2.c.B(tVarD2, f11, 0.0f, 2);
                String strU = o30.f0.U(nVar2, R.string.login_charity_next);
                boolean zF2 = sVar2.f(function13);
                Object objM7 = sVar2.M();
                if (zF2 || objM7 == fVar) {
                    objM7 = new bm.k(b1Var, function13);
                    sVar2.k0(objM7);
                }
                v0.n.l(tVarB, strU, null, null, null, false, false, null, null, (Function0) objM7, nVar2, 6, 508);
                r9.e(hVar, d2.j(d2.c.B(d2.c.D(m2.t(m2.d(qVar, 1.0f), 3), 0.0f, lv.t.f28252f, 0.0f, 0.0f, 13), f11, 0.0f, 2), "TermsConditions"), lv.s.C, 0L, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, null, u0.a(lv.v.f28274n, 0L, 0L, null, null, 0L, null, 0, b0.a0.C(30), null, null, 16646143), nVar2, 432, 0, 261112);
                sVar2.q(true);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ g(Function1 function1, m5.h hVar, b1 b1Var) {
        this.f44324c = function1;
        this.f44325d = hVar;
        this.f44323b = b1Var;
    }
}
