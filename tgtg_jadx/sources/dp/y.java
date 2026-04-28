package dp;

import a3.f2;
import b0.z;
import bn.b0;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.Server;
import com.app.tgtg.model.remote.VoucherId;
import com.app.tgtg.model.remote.payment.VoucherPaymentInformation;
import com.app.tgtg.model.remote.voucher.DiscountVoucher;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m3.b1;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15140d;

    public /* synthetic */ y(Object obj, Object obj2, Object obj3, int i11) {
        this.f15137a = i11;
        this.f15138b = obj;
        this.f15139c = obj2;
        this.f15140d = obj3;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        int i12;
        m3.s sVar;
        DiscountVoucher discountVoucher;
        int i13 = this.f15137a;
        Object obj5 = this.f15138b;
        Object obj6 = this.f15140d;
        Object obj7 = this.f15139c;
        m3.f fVar = m3.m.f29332a;
        switch (i13) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                m3.n nVar = (m3.n) obj3;
                ((Number) obj4).intValue();
                ap.n nVar2 = (ap.n) obj5;
                ((s1.l) obj).getClass();
                b4.q qVar = b4.q.f5711a;
                if (zBooleanValue) {
                    m3.s sVar2 = (m3.s) nVar;
                    sVar2.a0(-490765243);
                    String strU = f0.U(sVar2, R.string.rating_cta_skip_question);
                    boolean zH = sVar2.h(nVar2);
                    Object objM = sVar2.M();
                    if (zH || objM == fVar) {
                        objM = new j(nVar2, 4);
                        sVar2.k0(objM);
                    }
                    v0.n.o(qVar, strU, null, null, null, false, (Function0) objM, sVar2, 6, 0, 1020);
                    sVar2.q(false);
                } else {
                    m3.s sVar3 = (m3.s) nVar;
                    sVar3.a0(-490496814);
                    String strU2 = f0.U(sVar3, R.string.rating_cta_continue);
                    boolean zH2 = sVar3.h(nVar2);
                    b1 b1Var = (b1) obj7;
                    b1 b1Var2 = (b1) obj6;
                    Object objM2 = sVar3.M();
                    if (zH2 || objM2 == fVar) {
                        objM2 = new x((Object) nVar2, (Object) b1Var, (Object) b1Var2, 0);
                        sVar3.k0(objM2);
                    }
                    v0.n.l(qVar, strU2, null, null, null, false, false, null, null, (Function0) objM2, sVar3, 6, 508);
                    sVar3.q(false);
                }
                return Unit.f26487a;
            case 1:
                f2.d dVar = (f2.d) obj;
                int iIntValue = ((Number) obj2).intValue();
                m3.n nVar3 = (m3.n) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                ng.d dVar2 = (ng.d) obj6;
                if ((iIntValue2 & 6) == 0) {
                    i11 = iIntValue2 | (((m3.s) nVar3).f(dVar) ? 4 : 2);
                } else {
                    i11 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i11 |= ((m3.s) nVar3).d(iIntValue) ? 32 : 16;
                }
                m3.s sVar4 = (m3.s) nVar3;
                if (sVar4.R(i11 & 1, (i11 & 147) != 146)) {
                    Server server = (Server) ((List) obj5).get(iIntValue);
                    sVar4.a0(-2041981025);
                    Server server2 = (Server) obj7;
                    boolean zK = kotlin.text.y.k(server2 != null ? server2.getDomain() : null, server.getDomain(), true);
                    boolean zH3 = sVar4.h(dVar2);
                    Object objM3 = sVar4.M();
                    if (zH3 || objM3 == fVar) {
                        objM3 = new f2(dVar2, 7);
                        sVar4.k0(objM3);
                    }
                    z.k(server, zK, (Function1) objM3, sVar4, 0);
                    sVar4.q(false);
                } else {
                    sVar4.U();
                }
                return Unit.f26487a;
            default:
                f2.d dVar3 = (f2.d) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                m3.n nVar4 = (m3.n) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                aj.n nVar5 = (aj.n) obj7;
                m1.a aVar = (m1.a) obj6;
                if ((iIntValue4 & 6) == 0) {
                    i12 = iIntValue4 | (((m3.s) nVar4).f(dVar3) ? 4 : 2);
                } else {
                    i12 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i12 |= ((m3.s) nVar4).d(iIntValue3) ? 32 : 16;
                }
                m3.s sVar5 = (m3.s) nVar4;
                if (sVar5.R(i12 & 1, (i12 & 147) != 146)) {
                    aj.j jVar = (aj.j) ((List) obj5).get(iIntValue3);
                    sVar5.a0(-622734783);
                    b4.t tVarB = f2.d.b(dVar3, f2.d.a(dVar3, null, null, 7));
                    u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                    int iHashCode = Long.hashCode(sVar5.T);
                    u3.i iVarL = sVar5.l();
                    b4.t tVarC = b4.a.c(tVarB, sVar5);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar5.e0();
                    if (sVar5.S) {
                        sVar5.k(hVar);
                    } else {
                        sVar5.n0();
                    }
                    m3.i.C(u0VarD, b5.i.f5843f, sVar5);
                    m3.i.C(iVarL, b5.i.f5842e, sVar5);
                    m3.i.v(sVar5, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar5, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar5);
                    if (jVar instanceof aj.h) {
                        sVar5.a0(-394909319);
                        boolean z11 = nVar5 instanceof aj.k;
                        VoucherPaymentInformation voucherPaymentInformation = ((aj.h) jVar).f1501a;
                        boolean zH4 = sVar5.h(aVar) | sVar5.g(z11);
                        Object objM4 = sVar5.M();
                        if (zH4 || objM4 == fVar) {
                            objM4 = new fg.i(aVar, z11, 2);
                            sVar5.k0(objM4);
                        }
                        hg.i.a(voucherPaymentInformation, true, z11, (Function0) objM4, sVar5, 48);
                        sVar = sVar5;
                        sVar.q(false);
                    } else {
                        sVar = sVar5;
                        if (!(jVar instanceof aj.i)) {
                            throw e0.f.v(sVar, -705477168, false);
                        }
                        sVar.a0(-394294527);
                        aj.l lVar = nVar5 instanceof aj.l ? (aj.l) nVar5 : null;
                        String strMo529getIdVUJ7vw4 = (lVar == null || (discountVoucher = lVar.f1504a) == null) ? null : discountVoucher.mo529getIdVUJ7vw4();
                        aj.i iVar = (aj.i) jVar;
                        boolean zM302equalsimpl0 = strMo529getIdVUJ7vw4 == null ? false : VoucherId.m302equalsimpl0(strMo529getIdVUJ7vw4, iVar.f1502a.mo529getIdVUJ7vw4());
                        DiscountVoucher discountVoucher2 = iVar.f1502a;
                        boolean zH5 = sVar.h(jVar) | sVar.h(aVar);
                        Object objM5 = sVar.M();
                        if (zH5 || objM5 == fVar) {
                            objM5 = new b0(19, aVar, iVar);
                            sVar.k0(objM5);
                        }
                        hg.i.b(discountVoucher2, zM302equalsimpl0, true, (Function0) objM5, sVar, MLKEMEngine.KyberPolyBytes);
                        sVar.q(false);
                    }
                    sVar.q(true);
                    sVar.q(false);
                } else {
                    sVar5.U();
                }
                return Unit.f26487a;
        }
    }
}
