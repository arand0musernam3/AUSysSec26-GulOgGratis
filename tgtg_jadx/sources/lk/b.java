package lk;

import b4.t;
import bn.b0;
import com.app.tgtg.feature.logincharity.ui.model.Country;
import com.app.tgtg.model.remote.specialrewards.SpecialReward;
import com.app.tgtg.model.remote.user.response.Address;
import com.app.tgtg.model.remote.voucher.BasicVoucher;
import com.app.tgtg.model.remote.voucher.VoucherUsageDetails;
import d2.m2;
import dp.g;
import ek.q;
import f2.d;
import g3.r9;
import hk.c;
import i80.o;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lv.v;
import m3.b1;
import m3.m;
import m3.n;
import m3.s;
import ox.h;
import tg.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f27884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27885c;

    public /* synthetic */ b(Object obj, List list, int i11) {
        this.f27883a = i11;
        this.f27884b = list;
        this.f27885c = obj;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        switch (this.f27883a) {
            case 0:
                d dVar = (d) obj;
                int iIntValue = ((Number) obj2).intValue();
                n nVar = (n) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                q qVar = (q) this.f27885c;
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
                    c cVar = (c) this.f27884b.get(iIntValue);
                    sVar.a0(-1435451744);
                    int iA = cVar.f22090b.a();
                    boolean zH = sVar.h(qVar) | sVar.h(cVar);
                    Object objM = sVar.M();
                    if (zH || objM == m.f29332a) {
                        objM = new b0(12, qVar, cVar);
                        sVar.k0(objM);
                    }
                    h.i(iA, (Function0) objM, sVar, 0);
                    sVar.q(false);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                d dVar2 = (d) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                n nVar2 = (n) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                i iVar = (i) this.f27885c;
                if ((iIntValue4 & 6) == 0) {
                    i12 = (((s) nVar2).f(dVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i12 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i12 |= ((s) nVar2).d(iIntValue3) ? 32 : 16;
                }
                s sVar2 = (s) nVar2;
                if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
                    Address address = (Address) this.f27884b.get(iIntValue3);
                    sVar2.a0(-679116830);
                    t tVarB = d2.c.B(m2.d(b4.q.f5711a, 1.0f), 0.0f, lv.t.f28252f, 1);
                    boolean zH2 = sVar2.h(iVar) | sVar2.f(address);
                    Object objM2 = sVar2.M();
                    if (zH2 || objM2 == m.f29332a) {
                        objM2 = new b0(23, iVar, address);
                        sVar2.k0(objM2);
                    }
                    r9.d(address.getDisplayName(), androidx.compose.foundation.b.c(tVarB, false, null, null, (Function0) objM2, 15), 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, v.f28274n, sVar2, 0, 12607872, 110588);
                    sVar2.q(false);
                } else {
                    sVar2.U();
                }
                break;
            case 2:
                d dVar3 = (d) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                n nVar3 = (n) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i13 = (((s) nVar3).f(dVar3) ? 4 : 2) | iIntValue6;
                } else {
                    i13 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i13 |= ((s) nVar3).d(iIntValue5) ? 32 : 16;
                }
                s sVar3 = (s) nVar3;
                if (sVar3.R(i13 & 1, (i13 & 147) != 146)) {
                    SpecialReward specialReward = (SpecialReward) this.f27884b.get(iIntValue5);
                    sVar3.a0(1787680542);
                    os.a.e(d2.c.D(b4.q.f5711a, 0.0f, 0.0f, 0.0f, ((x60.m) this.f27885c).f44014j, 7), specialReward, false, null, sVar3, 0, 12);
                    sVar3.q(false);
                } else {
                    sVar3.U();
                }
                break;
            case 3:
                d dVar4 = (d) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                n nVar4 = (n) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                BasicVoucher basicVoucher = (BasicVoucher) this.f27885c;
                if ((iIntValue8 & 6) == 0) {
                    i14 = (((s) nVar4).f(dVar4) ? 4 : 2) | iIntValue8;
                } else {
                    i14 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i14 |= ((s) nVar4).d(iIntValue7) ? 32 : 16;
                }
                s sVar4 = (s) nVar4;
                if (sVar4.R(i14 & 1, (i14 & 147) != 146)) {
                    VoucherUsageDetails voucherUsageDetails = (VoucherUsageDetails) this.f27884b.get(iIntValue7);
                    sVar4.a0(1595383221);
                    if (basicVoucher == null) {
                        sVar4.a0(1595391868);
                        sVar4.q(false);
                    } else {
                        sVar4.a0(1595391869);
                        us.a.k(voucherUsageDetails, basicVoucher, sVar4, 0);
                        sVar4.q(false);
                    }
                    sVar4.q(false);
                } else {
                    sVar4.U();
                }
                break;
            default:
                d dVar5 = (d) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                n nVar5 = (n) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                b1 b1Var = (b1) this.f27885c;
                if ((iIntValue10 & 6) == 0) {
                    i15 = (((s) nVar5).f(dVar5) ? 4 : 2) | iIntValue10;
                } else {
                    i15 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i15 |= ((s) nVar5).d(iIntValue9) ? 32 : 16;
                }
                s sVar5 = (s) nVar5;
                if (sVar5.R(i15 & 1, (i15 & 147) != 146)) {
                    Country country = (Country) this.f27884b.get(iIntValue9);
                    sVar5.a0(-758823239);
                    float f11 = lv.t.f28253g;
                    t tVarD = d2.c.D(d2.c.B(b4.q.f5711a, f11, 0.0f, 2), 0.0f, 0.0f, 0.0f, f11, 7);
                    boolean zAreEqual = Intrinsics.areEqual((Country) b1Var.getValue(), country);
                    Object objM3 = sVar5.M();
                    if (objM3 == m.f29332a) {
                        objM3 = new g(b1Var, 4);
                        sVar5.k0(objM3);
                    }
                    yl.a.b(tVarD, country, zAreEqual, (Function1) objM3, sVar5, 3078);
                    sVar5.q(false);
                } else {
                    sVar5.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
