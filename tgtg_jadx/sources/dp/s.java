package dp;

import android.app.Activity;
import android.net.Uri;
import cj.e0;
import com.app.tgtg.feature.tabprofile.legal.privacy.privacyaction.PrivacyActionActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.edit.EditDataActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.specialrewards.SpecialRewardsActivity;
import com.app.tgtg.model.local.GenericErrors;
import com.app.tgtg.model.remote.RewardId;
import com.app.tgtg.model.remote.item.response.AllergensInfo;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.HeroComponentResponse;
import com.app.tgtg.model.remote.specialrewards.SpecialReward;
import com.app.tgtg.model.remote.specialrewards.response.SpecialRewardsResponse;
import ep.d0;
import g3.q9;
import g3.x5;
import g9.f0;
import java.util.ArrayList;
import java.util.List;
import jb.u;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m3.b1;
import m3.c3;
import s1.r0;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15117e;

    public /* synthetic */ s(ap.n nVar, e.n nVar2, Uri uri, e.n nVar3) {
        this.f15113a = 0;
        this.f15114b = nVar;
        this.f15115c = nVar2;
        this.f15117e = uri;
        this.f15116d = nVar3;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i11 = this.f15113a;
        int i12 = 11;
        m3.f fVar = m3.m.f29332a;
        final int i13 = 0;
        Object obj5 = this.f15117e;
        Object obj6 = this.f15116d;
        Object obj7 = this.f15115c;
        Object obj8 = this.f15114b;
        switch (i11) {
            case 0:
                ap.n nVar = (ap.n) obj8;
                e.n nVar2 = (e.n) obj7;
                Uri uri = (Uri) obj5;
                e.n nVar3 = (e.n) obj6;
                Uri uri2 = (Uri) obj2;
                m3.n nVar4 = (m3.n) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((s1.l) obj).getClass();
                if (uri2 != null) {
                    m3.s sVar = (m3.s) nVar4;
                    sVar.a0(-1688358587);
                    boolean zH = sVar.h(nVar);
                    Object objM = sVar.M();
                    if (zH || objM == fVar) {
                        objM = new ap.h(nVar, 6);
                        sVar.k0(objM);
                    }
                    cp.a.b(uri2, (Function0) objM, sVar, (iIntValue >> 3) & 14);
                    sVar.q(false);
                } else {
                    m3.s sVar2 = (m3.s) nVar4;
                    sVar2.a0(-1688205137);
                    boolean zH2 = sVar2.h(nVar2) | sVar2.h(uri);
                    Object objM2 = sVar2.M();
                    if (zH2 || objM2 == fVar) {
                        objM2 = new bs.b(18, nVar2, uri);
                        sVar2.k0(objM2);
                    }
                    Function0 function0 = (Function0) objM2;
                    boolean zH3 = sVar2.h(nVar3);
                    Object objM3 = sVar2.M();
                    if (zH3 || objM3 == fVar) {
                        objM3 = new cw.b(nVar3, 2);
                        sVar2.k0(objM3);
                    }
                    cp.a.c(function0, (Function0) objM3, sVar2, 0);
                    sVar2.q(false);
                }
                return Unit.f26487a;
            case 1:
                f0 f0Var = (f0) obj7;
                d0 d0Var = (d0) obj6;
                Function0 function02 = (Function0) obj5;
                m3.n nVar5 = (m3.n) obj3;
                ((Integer) obj4).getClass();
                ((s1.l) obj).getClass();
                ((g9.l) obj2).getClass();
                GenericErrors genericErrors = (GenericErrors) ((c3) obj8).getValue();
                if (genericErrors == null) {
                    m3.s sVar3 = (m3.s) nVar5;
                    sVar3.a0(234645358);
                    sVar3.q(false);
                } else {
                    m3.s sVar4 = (m3.s) nVar5;
                    sVar4.a0(234645359);
                    boolean zH4 = sVar4.h(f0Var) | sVar4.h(d0Var) | sVar4.f(function02);
                    Object objM4 = sVar4.M();
                    if (zH4 || objM4 == fVar) {
                        objM4 = new a0.g(f0Var, d0Var, function02, 9);
                        sVar4.k0(objM4);
                    }
                    cg.o.a(genericErrors, (Function0) objM4, null, sVar4, 0, 4);
                    sVar4.q(false);
                }
                return Unit.f26487a;
            case 2:
                Function1 function1 = (Function1) obj7;
                Function1 function12 = (Function1) obj6;
                b1 b1Var = (b1) obj5;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ((Integer) obj4).getClass();
                ((s1.l) obj).getClass();
                List<BasicItem> items = ((HeroComponentResponse) obj8).getItems();
                m3.s sVar5 = (m3.s) ((m3.n) obj3);
                if (items == null) {
                    sVar5.a0(-509096144);
                    sVar5.q(false);
                } else {
                    sVar5.a0(-509096143);
                    if (!zBooleanValue || items.size() < 3) {
                        sVar5.a0(752639522);
                        boolean zF = sVar5.f(function12);
                        Object objM5 = sVar5.M();
                        if (zF || objM5 == fVar) {
                            objM5 = new defpackage.d(function12, 11);
                            sVar5.k0(objM5);
                        }
                        gn.a.h(items, (Function1) objM5, function1, sVar5, 0);
                        sVar5.q(false);
                    } else {
                        sVar5.a0(752305125);
                        Object objM6 = sVar5.M();
                        if (objM6 == fVar) {
                            objM6 = new bm.j(b1Var, 22);
                            sVar5.k0(objM6);
                        }
                        gn.a.n(48, items, (Function0) objM6, function1, sVar5);
                        sVar5.q(false);
                    }
                    sVar5.q(false);
                }
                return Unit.f26487a;
            case 3:
                final ir.h hVar = (ir.h) obj8;
                Activity activity = (Activity) obj7;
                e0 e0Var = (e0) obj6;
                f0 f0Var2 = (f0) obj5;
                ((Integer) obj4).getClass();
                ((s1.l) obj).getClass();
                ((g9.l) obj2).getClass();
                m3.s sVar6 = (m3.s) ((m3.n) obj3);
                boolean zH5 = sVar6.h(activity);
                Object objM7 = sVar6.M();
                if (zH5 || objM7 == fVar) {
                    objM7 = new ap.f(activity, 7);
                    sVar6.k0(objM7);
                }
                Function0 function03 = (Function0) objM7;
                boolean zH6 = sVar6.h(activity) | sVar6.h(hVar);
                Object objM8 = sVar6.M();
                if (zH6 || objM8 == fVar) {
                    objM8 = new hb0.o(i12, activity, hVar);
                    sVar6.k0(objM8);
                }
                Function1 function13 = (Function1) objM8;
                boolean zH7 = sVar6.h(activity);
                Object objM9 = sVar6.M();
                if (zH7 || objM9 == fVar) {
                    objM9 = new q9(activity, 29);
                    sVar6.k0(objM9);
                }
                Function1 function14 = (Function1) objM9;
                boolean zH8 = sVar6.h(hVar);
                Object objM10 = sVar6.M();
                if (zH8 || objM10 == fVar) {
                    final int i14 = 1;
                    objM10 = new Function1() { // from class: ir.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i14) {
                                case 0:
                                    fr.a aVar = (fr.a) obj9;
                                    aVar.getClass();
                                    lr.a aVar2 = hVar.f24125b;
                                    aVar2.getClass();
                                    aVar2.f28165a.a(new f70.b(PrivacyActionActivity.class, u.x(new Pair("ACTION", aVar.toString())), false, false, false, null, null, null, null, false, 1020));
                                    break;
                                default:
                                    or.a aVar3 = (or.a) obj9;
                                    aVar3.getClass();
                                    lr.a aVar4 = hVar.f24125b;
                                    aVar4.getClass();
                                    aVar4.f28165a.a(new f70.b(EditDataActivity.class, u.x(new Pair("DATA", aVar3)), false, false, false, null, null, null, null, false, 1020));
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    };
                    sVar6.k0(objM10);
                }
                Function1 function15 = (Function1) objM10;
                boolean zH9 = sVar6.h(e0Var) | sVar6.h(f0Var2);
                Object objM11 = sVar6.M();
                if (zH9 || objM11 == fVar) {
                    objM11 = new hb0.o(12, e0Var, f0Var2);
                    sVar6.k0(objM11);
                }
                Function1 function16 = (Function1) objM11;
                boolean zH10 = sVar6.h(hVar);
                Object objM12 = sVar6.M();
                if (zH10 || objM12 == fVar) {
                    objM12 = new Function1() { // from class: ir.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i13) {
                                case 0:
                                    fr.a aVar = (fr.a) obj9;
                                    aVar.getClass();
                                    lr.a aVar2 = hVar.f24125b;
                                    aVar2.getClass();
                                    aVar2.f28165a.a(new f70.b(PrivacyActionActivity.class, u.x(new Pair("ACTION", aVar.toString())), false, false, false, null, null, null, null, false, 1020));
                                    break;
                                default:
                                    or.a aVar3 = (or.a) obj9;
                                    aVar3.getClass();
                                    lr.a aVar4 = hVar.f24125b;
                                    aVar4.getClass();
                                    aVar4.f28165a.a(new f70.b(EditDataActivity.class, u.x(new Pair("DATA", aVar3)), false, false, false, null, null, null, null, false, 1020));
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    };
                    sVar6.k0(objM12);
                }
                ex.i.a(hVar, function03, function13, function14, function15, function16, (Function1) objM12, sVar6, 0);
                return Unit.f26487a;
            case 4:
                SpecialRewardsActivity specialRewardsActivity = (SpecialRewardsActivity) obj8;
                f0 f0Var3 = (f0) obj7;
                b1 b1Var2 = (b1) obj6;
                b1 b1Var3 = (b1) obj5;
                m3.n nVar6 = (m3.n) obj3;
                ((Integer) obj4).getClass();
                int i15 = SpecialRewardsActivity.f9434g;
                ((s1.l) obj).getClass();
                ((g9.l) obj2).getClass();
                SpecialRewardsResponse specialRewardsResponse = (SpecialRewardsResponse) m3.i.n(specialRewardsActivity.A().f31390h, nVar6, 0).getValue();
                m3.s sVar7 = (m3.s) nVar6;
                if (specialRewardsResponse == null) {
                    sVar7.a0(-1005516062);
                    sVar7.q(false);
                } else {
                    sVar7.a0(-1005516061);
                    List<SpecialReward> specialRewards = specialRewardsResponse.getSpecialRewards();
                    if (specialRewards != null) {
                        arrayList = new ArrayList();
                        for (Object obj9 : specialRewards) {
                            SpecialReward specialReward = (SpecialReward) obj9;
                            if (ns.e.valueOf(specialReward.getStatus()) == ns.e.RESERVED || ns.e.valueOf(specialReward.getStatus()) == ns.e.CLAIMED) {
                                arrayList.add(obj9);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    List<SpecialReward> specialRewards2 = specialRewardsResponse.getSpecialRewards();
                    if (specialRewards2 != null) {
                        arrayList2 = new ArrayList();
                        for (Object obj10 : specialRewards2) {
                            SpecialReward specialReward2 = (SpecialReward) obj10;
                            if (ns.e.valueOf(specialReward2.getStatus()) == ns.e.REDEEMED || ns.e.valueOf(specialReward2.getStatus()) == ns.e.EXPIRED) {
                                arrayList2.add(obj10);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                    int i16 = 1;
                    RewardId rewardId = (RewardId) specialRewardsActivity.A().f31383a.a("REMOTE_SELECTED_REWARD");
                    String strM265unboximpl = rewardId != null ? rewardId.m265unboximpl() : null;
                    if (strM265unboximpl != null) {
                        String strM265unboximpl2 = RewardId.m257boximpl(strM265unboximpl).m265unboximpl();
                        if (!RewardId.m261equalsimpl0(((RewardId) b1Var2.getValue()).m265unboximpl(), strM265unboximpl2)) {
                            List<SpecialReward> specialRewards3 = specialRewardsResponse.getSpecialRewards();
                            if (specialRewards3 != null) {
                                arrayList3 = new ArrayList();
                                for (Object obj11 : specialRewards3) {
                                    if (RewardId.m261equalsimpl0(((SpecialReward) obj11).m496getRewardIdr7kTZ_U(), strM265unboximpl2)) {
                                        arrayList3.add(obj11);
                                    }
                                }
                            } else {
                                arrayList3 = null;
                            }
                            if (arrayList3 != null) {
                                ns.g gVarA = specialRewardsActivity.A();
                                SpecialReward specialReward3 = (SpecialReward) arrayList3.get(0);
                                specialReward3.getClass();
                                gVarA.f31386d = specialReward3;
                                specialRewardsActivity.A().b();
                                b1Var3.setValue(Boolean.TRUE);
                            }
                            b1Var2.setValue(RewardId.m257boximpl(strM265unboximpl2));
                        }
                    }
                    boolean z11 = arrayList2 != null ? !arrayList2.isEmpty() : false;
                    boolean zH11 = sVar7.h(specialRewardsActivity);
                    Object objM13 = sVar7.M();
                    if (zH11 || objM13 == fVar) {
                        objM13 = new ns.b(specialRewardsActivity, i16);
                        sVar7.k0(objM13);
                    }
                    Function0 function04 = (Function0) objM13;
                    boolean zH12 = sVar7.h(specialRewardsActivity);
                    Object objM14 = sVar7.M();
                    if (zH12 || objM14 == fVar) {
                        objM14 = new ns.a(specialRewardsActivity, b1Var3, 1);
                        sVar7.k0(objM14);
                    }
                    Function1 function17 = (Function1) objM14;
                    boolean zH13 = sVar7.h(f0Var3);
                    Object objM15 = sVar7.M();
                    if (zH13 || objM15 == fVar) {
                        objM15 = new dq.g(f0Var3, 7);
                        sVar7.k0(objM15);
                    }
                    ps.a.a(arrayList, z11, function04, function17, (Function0) objM15, sVar7, 0);
                    specialRewardsActivity.A().f31385c.d(cv.i.SCREEN_SPECIAL_REWARDS_MAIN, dv.a.COUNT_SPECIAL_REWARDS, String.valueOf(arrayList != null ? Integer.valueOf(arrayList.size()) : null));
                    sVar7.q(false);
                }
                return Unit.f26487a;
            case 5:
                Function0 function05 = (Function0) obj8;
                Function0 function06 = (Function0) obj7;
                AllergensInfo allergensInfo = (AllergensInfo) obj6;
                Function1 function18 = (Function1) obj5;
                no.e eVar = (no.e) obj2;
                m3.n nVar7 = (m3.n) obj3;
                ((Integer) obj4).intValue();
                ((s1.l) obj).getClass();
                eVar.getClass();
                if (Intrinsics.areEqual(eVar, no.d.f31182a)) {
                    m3.s sVar8 = (m3.s) nVar7;
                    sVar8.a0(1889257727);
                    po.c.b(function05, function06, allergensInfo, function18, sVar8, 0);
                    sVar8.q(false);
                } else if (Intrinsics.areEqual(eVar, no.a.f31169a)) {
                    m3.s sVar9 = (m3.s) nVar7;
                    sVar9.a0(1889266301);
                    po.c.i(sVar9, 0);
                    sVar9.q(false);
                } else if (Intrinsics.areEqual(eVar, no.c.f31179a)) {
                    m3.s sVar10 = (m3.s) nVar7;
                    sVar10.a0(1889267805);
                    po.c.l(sVar10, 0);
                    sVar10.q(false);
                } else {
                    if (!Intrinsics.areEqual(eVar, no.b.f31173a)) {
                        throw e0.f.v((m3.s) nVar7, 1889256264, false);
                    }
                    m3.s sVar11 = (m3.s) nVar7;
                    sVar11.a0(1889268991);
                    sVar11.q(false);
                    function06.invoke();
                }
                return Unit.f26487a;
            default:
                b1 b1Var4 = (b1) obj8;
                f0 f0Var4 = (f0) obj7;
                pi.m mVar = (pi.m) obj5;
                m3.n nVar8 = (m3.n) obj3;
                a0.A((Integer) obj4, (s1.l) obj, (g9.l) obj2);
                x5.a(null, null, u3.e.e(-1390699527, nVar8, new xh.f(f0Var4, (b1) obj6, i13)), null, null, 0, 0L, lv.s.J, null, u3.e.e(1039153347, nVar8, new ap.e(mVar, f0Var4, b1Var4)), nVar8, 817889664, 379);
                s1.y.d(((Boolean) b1Var4.getValue()).booleanValue(), null, r0.d(null, 3), r0.e(null, 3), null, u3.e.e(296282124, nVar8, new oo.s(13, mVar, b1Var4)), nVar8, 200064, 18);
                return Unit.f26487a;
        }
    }

    public /* synthetic */ s(int i11, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f15113a = i11;
        this.f15114b = obj;
        this.f15115c = obj2;
        this.f15116d = obj3;
        this.f15117e = obj4;
    }
}
