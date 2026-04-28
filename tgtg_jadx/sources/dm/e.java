package dm;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m1;
import ap.h;
import b4.q;
import bm.j;
import cj.e0;
import cj.r;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabprofile.manageaccount.specialrewards.SpecialRewardsActivity;
import com.app.tgtg.model.remote.badge.Badge;
import com.app.tgtg.model.remote.badge.BadgeCollection;
import com.app.tgtg.model.remote.item.response.CharityItem;
import com.app.tgtg.model.remote.specialrewards.SpecialReward;
import com.app.tgtg.model.remote.specialrewards.response.SpecialRewardsResponse;
import i80.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.x0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KFunction;
import m3.b1;
import m3.i;
import m3.m;
import m3.n;
import m3.s;
import m3.v1;
import o30.f0;
import s1.l;
import t1.q1;
import w.a0;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14973c;

    public /* synthetic */ e(b1 b1Var, CharityItem charityItem) {
        this.f14971a = 4;
        this.f14972b = b1Var;
        this.f14973c = charityItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11 = this.f14971a;
        int i12 = 2;
        ArrayList arrayList = null;
        Object[] objArr = 0;
        m3.f fVar = m.f29332a;
        Object obj5 = this.f14972b;
        Object obj6 = this.f14973c;
        switch (i11) {
            case 0:
                Function0 function0 = (Function0) obj6;
                b1 b1Var = (b1) obj5;
                d dVar = (d) obj2;
                n nVar = (n) obj3;
                ((Integer) obj4).getClass();
                ((l) obj).getClass();
                dVar.getClass();
                if (Intrinsics.areEqual(dVar, a.f14968a)) {
                    s sVar = (s) nVar;
                    sVar.a0(1316418956);
                    Object objM = sVar.M();
                    if (objM == fVar) {
                        objM = new j(b1Var, 7);
                        sVar.k0(objM);
                    }
                    Function0 function02 = (Function0) objM;
                    Object objM2 = sVar.M();
                    if (objM2 == fVar) {
                        objM2 = new j(b1Var, 8);
                        sVar.k0(objM2);
                    }
                    em.a.a(null, null, function02, (Function0) objM2, function0, sVar, 3456);
                    sVar.q(false);
                } else if (Intrinsics.areEqual(dVar, b.f14969a)) {
                    s sVar2 = (s) nVar;
                    sVar2.a0(1316740085);
                    Object objM3 = sVar2.M();
                    if (objM3 == fVar) {
                        objM3 = new j(b1Var, 9);
                        sVar2.k0(objM3);
                    }
                    w.i(null, (Function0) objM3, function0, sVar2, 48);
                    sVar2.q(false);
                } else {
                    if (!Intrinsics.areEqual(dVar, c.f14970a)) {
                        throw e0.f.v((s) nVar, -1620104301, false);
                    }
                    s sVar3 = (s) nVar;
                    sVar3.a0(1316992673);
                    z20.b.g(0, null, function0, sVar3);
                    sVar3.q(false);
                }
                return Unit.f26487a;
            case 1:
                ap.n nVar2 = (ap.n) obj6;
                b1 b1Var2 = (b1) obj5;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                n nVar3 = (n) obj3;
                ((Integer) obj4).getClass();
                ((l) obj).getClass();
                q qVar = q.f5711a;
                if (zBooleanValue) {
                    s sVar4 = (s) nVar3;
                    sVar4.a0(-1154721898);
                    String strU = f0.U(sVar4, R.string.rating_cta_skip_question);
                    boolean zH = sVar4.h(nVar2);
                    Object objM4 = sVar4.M();
                    if (zH || objM4 == fVar) {
                        objM4 = new h(nVar2, 18);
                        sVar4.k0(objM4);
                    }
                    v0.n.o(qVar, strU, null, null, null, false, (Function0) objM4, sVar4, 6, 0, 1020);
                    sVar4.q(false);
                } else {
                    s sVar5 = (s) nVar3;
                    sVar5.a0(-1154462087);
                    String strU2 = f0.U(sVar5, R.string.rating_cta_continue);
                    boolean zH2 = sVar5.h(nVar2);
                    Object objM5 = sVar5.M();
                    if (zH2 || objM5 == fVar) {
                        objM5 = new ap.g(nVar2, b1Var2, 2);
                        sVar5.k0(objM5);
                    }
                    v0.n.l(qVar, strU2, null, null, null, false, false, null, null, (Function0) objM5, sVar5, 6, 508);
                    sVar5.q(false);
                }
                return Unit.f26487a;
            case 2:
                e0 e0Var = (e0) obj6;
                g9.f0 f0Var = (g9.f0) obj5;
                n nVar4 = (n) obj3;
                a0.A((Integer) obj4, (l) obj, (g9.l) obj2);
                if (((Boolean) i.n(e0Var.f8231v, nVar4, 0).getValue()).booleanValue()) {
                    v80.f0.B(m1.d(e0Var), null, null, new r(e0Var, objArr == true ? 1 : 0, 3), 3);
                    f0Var.g();
                }
                s sVar6 = (s) nVar4;
                Object objM6 = sVar6.M();
                if (objM6 == fVar) {
                    objM6 = ir.d.f24114a;
                    sVar6.k0(objM6);
                }
                i80.n nVar5 = (i80.n) ((KFunction) objM6);
                Object objM7 = sVar6.M();
                if (objM7 == fVar) {
                    objM7 = new im.a(2);
                    sVar6.k0(objM7);
                }
                c6.l.b(nVar5, null, (Function1) objM7, sVar6, 390, 2);
                return Unit.f26487a;
            case 3:
                BadgeCollection badgeCollection = (BadgeCollection) obj6;
                Function1 function1 = (Function1) obj5;
                int iIntValue = ((Integer) obj2).intValue();
                n nVar6 = (n) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((g2.l) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= ((s) nVar6).d(iIntValue) ? 32 : 16;
                }
                s sVar7 = (s) nVar6;
                if (sVar7.R(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    Badge badge = badgeCollection.getBadges().get(iIntValue);
                    boolean zF = sVar7.f(function1);
                    Object objM8 = sVar7.M();
                    if (zF || objM8 == fVar) {
                        objM8 = new defpackage.d(function1, 20);
                        sVar7.k0(objM8);
                    }
                    jh.f.g(null, badge, (Function1) objM8, sVar7, 0);
                } else {
                    sVar7.U();
                }
                return Unit.f26487a;
            case 4:
                b1 b1Var3 = (b1) obj5;
                CharityItem charityItem = (CharityItem) obj6;
                ((Integer) obj2).getClass();
                n nVar7 = (n) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((f2.d) obj).getClass();
                s sVar8 = (s) nVar7;
                if (sVar8.R(iIntValue3 & 1, (iIntValue3 & 129) != 128)) {
                    ki.j.m(2, ki.j.b(b1Var3), u3.e.e(1277020355, sVar8, new ki.b(charityItem, i)), sVar8, 390);
                } else {
                    sVar8.U();
                }
                return Unit.f26487a;
            case 5:
                hk.c cVar = (hk.c) obj6;
                ek.q qVar2 = (ek.q) obj5;
                int iIntValue4 = ((Integer) obj2).intValue();
                n nVar8 = (n) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                ((f2.d) obj).getClass();
                if ((iIntValue5 & 48) == 0) {
                    iIntValue5 |= ((s) nVar8).d(iIntValue4) ? 32 : 16;
                }
                s sVar9 = (s) nVar8;
                if (sVar9.R(iIntValue5 & 1, (iIntValue5 & 145) != 144)) {
                    Integer num = ((hk.d) cVar.f22091c.get(iIntValue4)).f22093a;
                    if (num == null) {
                        sVar9.a0(-235049543);
                        sVar9.q(false);
                    } else {
                        sVar9.a0(-235049542);
                        int iIntValue6 = num.intValue();
                        int i13 = (sVar9.h(qVar2) ? 1 : 0) | (sVar9.h(cVar) ? 1 : 0) | ((iIntValue5 & 112) != 32 ? 0 : 1);
                        Object objM9 = sVar9.M();
                        if (i13 != 0 || objM9 == fVar) {
                            objM9 = new cp.j(qVar2, cVar, iIntValue4);
                            sVar9.k0(objM9);
                        }
                        w0.e.h(iIntValue6, (Function0) objM9, sVar9, 0);
                        sVar9.q(false);
                    }
                } else {
                    sVar9.U();
                }
                return Unit.f26487a;
            case 6:
                SpecialRewardsActivity specialRewardsActivity = (SpecialRewardsActivity) obj6;
                b1 b1Var4 = (b1) obj5;
                n nVar9 = (n) obj3;
                ((Integer) obj4).getClass();
                int i14 = SpecialRewardsActivity.f9434g;
                ((l) obj).getClass();
                ((g9.l) obj2).getClass();
                SpecialRewardsResponse specialRewardsResponse = (SpecialRewardsResponse) i.n(specialRewardsActivity.A().f31390h, nVar9, 0).getValue();
                s sVar10 = (s) nVar9;
                if (specialRewardsResponse == null) {
                    sVar10.a0(676922608);
                    sVar10.q(false);
                } else {
                    sVar10.a0(676922609);
                    List<SpecialReward> specialRewards = specialRewardsResponse.getSpecialRewards();
                    if (specialRewards != null) {
                        arrayList = new ArrayList();
                        for (Object obj7 : specialRewards) {
                            SpecialReward specialReward = (SpecialReward) obj7;
                            if (ns.e.valueOf(specialReward.getStatus()) == ns.e.REDEEMED || ns.e.valueOf(specialReward.getStatus()) == ns.e.EXPIRED) {
                                arrayList.add(obj7);
                            }
                        }
                    }
                    boolean zH3 = sVar10.h(specialRewardsActivity);
                    Object objM10 = sVar10.M();
                    if (zH3 || objM10 == fVar) {
                        objM10 = new ns.b(specialRewardsActivity, i12);
                        sVar10.k0(objM10);
                    }
                    Function0 function03 = (Function0) objM10;
                    boolean zH4 = sVar10.h(specialRewardsActivity);
                    Object objM11 = sVar10.M();
                    if (zH4 || objM11 == fVar) {
                        objM11 = new ns.a(specialRewardsActivity, b1Var4, 0);
                        sVar10.k0(objM11);
                    }
                    ps.a.b(0, arrayList, function03, (Function1) objM11, sVar10);
                    sVar10.q(false);
                }
                return Unit.f26487a;
            default:
                q1 q1Var = (q1) obj6;
                Map map = (Map) obj5;
                l lVar = (l) obj;
                o9.d dVar2 = (o9.d) obj2;
                n nVar10 = (n) obj3;
                ((Integer) obj4).getClass();
                i.b(new v1[]{w8.g.f43289a.a(w8.i.a(Intrinsics.areEqual(q1Var.f39537a.j(), q1Var.f39540d.getValue()) ? Lifecycle.State.RESUMED : Lifecycle.State.STARTED, nVar10)), p9.b.f34586a.a(lVar), o9.h.f32139a.a(x0.c(new Pair(Reflection.getOrCreateKotlinClass(dVar2.getClass()), dVar2.getKey()), map))}, u3.e.e(-1734941436, nVar10, new lk.a(dVar2, 27)), nVar10, 56);
                return Unit.f26487a;
        }
    }

    public /* synthetic */ e(int i11, Object obj, Object obj2) {
        this.f14971a = i11;
        this.f14973c = obj;
        this.f14972b = obj2;
    }
}
