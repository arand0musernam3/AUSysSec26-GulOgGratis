package vi;

import b4.t;
import bn.b0;
import cj.q;
import com.app.tgtg.model.remote.VoucherId;
import com.app.tgtg.model.remote.payment.VoucherPaymentInformation;
import com.app.tgtg.model.remote.user.response.MoneySavedResponse;
import com.app.tgtg.model.remote.user.response.MonthlyMoneySaved;
import com.app.tgtg.model.remote.voucher.DiscountVoucher;
import d2.p;
import f2.c0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.b1;
import m3.s;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42404a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f42405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f42407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f42408e;

    public o(List list, b1 b1Var, q qVar, b1 b1Var2) {
        this.f42405b = list;
        this.f42406c = b1Var;
        this.f42408e = qVar;
        this.f42407d = b1Var2;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        DiscountVoucher discountVoucher;
        int i12;
        switch (this.f42404a) {
            case 0:
                f2.d dVar = (f2.d) obj;
                int iIntValue = ((Number) obj2).intValue();
                m3.n nVar = (m3.n) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                b1 b1Var = (b1) this.f42407d;
                b1 b1Var2 = (b1) this.f42406c;
                q qVar = (q) this.f42408e;
                if ((iIntValue2 & 6) == 0) {
                    i11 = (((s) nVar).f(dVar) ? 4 : 2) | iIntValue2;
                } else {
                    i11 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i11 |= ((s) nVar).d(iIntValue) ? 32 : 16;
                }
                s sVar = (s) nVar;
                if (sVar.R(i11 & 1, (i11 & 147) != 146)) {
                    aj.j jVar = (aj.j) this.f42405b.get(iIntValue);
                    sVar.a0(-2061678111);
                    String strMo529getIdVUJ7vw4 = null;
                    t tVarA = f2.d.a(dVar, null, null, 7);
                    int size = ((List) b1Var2.getValue()).size();
                    t tVarB = b4.q.f5711a;
                    if (size == 1) {
                        tVarB = f2.d.b(dVar, tVarB);
                    }
                    t tVarThen = tVarA.then(tVarB);
                    u0 u0VarD = p.d(b4.d.f5683a, false);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    t tVarC = b4.a.c(tVarThen, sVar);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(u0VarD, b5.i.f5843f, sVar);
                    m3.i.C(iVarL, b5.i.f5842e, sVar);
                    m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar);
                    boolean z11 = jVar instanceof aj.h;
                    m3.f fVar = m3.m.f29332a;
                    if (z11) {
                        sVar.a0(-919802203);
                        boolean z12 = ((aj.n) b1Var.getValue()) instanceof aj.k;
                        VoucherPaymentInformation voucherPaymentInformation = ((aj.h) jVar).f1501a;
                        boolean z13 = ((List) b1Var2.getValue()).size() == 1;
                        boolean zH = sVar.h(qVar) | sVar.g(z12);
                        Object objM = sVar.M();
                        if (zH || objM == fVar) {
                            objM = new fg.i(qVar, z12, 4);
                            sVar.k0(objM);
                        }
                        hg.i.a(voucherPaymentInformation, z13, z12, (Function0) objM, sVar, 0);
                        sVar.q(false);
                    } else {
                        if (!(jVar instanceof aj.i)) {
                            throw e0.f.v(sVar, -168219715, false);
                        }
                        sVar.a0(-919252573);
                        aj.n nVar2 = (aj.n) b1Var.getValue();
                        aj.l lVar = nVar2 instanceof aj.l ? (aj.l) nVar2 : null;
                        if (lVar != null && (discountVoucher = lVar.f1504a) != null) {
                            strMo529getIdVUJ7vw4 = discountVoucher.mo529getIdVUJ7vw4();
                        }
                        aj.i iVar = (aj.i) jVar;
                        boolean zM302equalsimpl0 = strMo529getIdVUJ7vw4 == null ? false : VoucherId.m302equalsimpl0(strMo529getIdVUJ7vw4, iVar.f1502a.mo529getIdVUJ7vw4());
                        DiscountVoucher discountVoucher2 = iVar.f1502a;
                        boolean z14 = ((List) b1Var2.getValue()).size() == 1;
                        boolean zH2 = sVar.h(jVar) | sVar.h(qVar);
                        Object objM2 = sVar.M();
                        if (zH2 || objM2 == fVar) {
                            objM2 = new b0(24, qVar, iVar);
                            sVar.k0(objM2);
                        }
                        hg.i.b(discountVoucher2, zM302equalsimpl0, z14, (Function0) objM2, sVar, 0);
                        sVar.q(false);
                    }
                    sVar.q(true);
                    sVar.q(false);
                } else {
                    sVar.U();
                }
                return Unit.f26487a;
            default:
                f2.d dVar2 = (f2.d) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                m3.n nVar3 = (m3.n) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                c0 c0Var = (c0) this.f42407d;
                v80.b0 b0Var = (v80.b0) this.f42406c;
                if ((iIntValue4 & 6) == 0) {
                    i12 = (((s) nVar3).f(dVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i12 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i12 |= ((s) nVar3).d(iIntValue3) ? 32 : 16;
                }
                s sVar2 = (s) nVar3;
                if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
                    MonthlyMoneySaved monthlyMoneySaved = (MonthlyMoneySaved) this.f42405b.get(iIntValue3);
                    sVar2.a0(1797297461);
                    int i13 = (i12 & 112) ^ 48;
                    boolean zH3 = sVar2.h(b0Var) | sVar2.f(c0Var) | ((i13 > 32 && sVar2.d(iIntValue3)) || (i12 & 48) == 32);
                    Object objM3 = sVar2.M();
                    m3.f fVar2 = m3.m.f29332a;
                    if (zH3 || objM3 == fVar2) {
                        objM3 = new zq.c(b0Var, c0Var, iIntValue3, 0);
                        sVar2.k0(objM3);
                    }
                    Function0 function0 = (Function0) objM3;
                    boolean zH4 = ((i13 > 32 && sVar2.d(iIntValue3)) || (i12 & 48) == 32) | sVar2.h(b0Var) | sVar2.f(c0Var);
                    Object objM4 = sVar2.M();
                    if (zH4 || objM4 == fVar2) {
                        objM4 = new zq.c(b0Var, c0Var, iIntValue3, 1);
                        sVar2.k0(objM4);
                    }
                    ar.a.b(monthlyMoneySaved, function0, (Function0) objM4, iIntValue3 == 0, iIntValue3 == ((MoneySavedResponse) this.f42408e).getMoneySavedList().size() - 1, sVar2, 0);
                    sVar2.q(false);
                } else {
                    sVar2.U();
                }
                return Unit.f26487a;
        }
    }

    public o(List list, v80.b0 b0Var, c0 c0Var, MoneySavedResponse moneySavedResponse) {
        this.f42405b = list;
        this.f42406c = b0Var;
        this.f42407d = c0Var;
        this.f42408e = moneySavedResponse;
    }
}
