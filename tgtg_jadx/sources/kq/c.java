package kq;

import al.h;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.app.NotificationManagerCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.w;
import bx.k;
import bx.o;
import com.app.tgtg.feature.login.optin.OptInActivity;
import com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity;
import com.app.tgtg.model.remote.invitation.OrderDataForInvitation;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.FlashSalesItem;
import com.app.tgtg.model.remote.item.response.ManufacturerItem;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.profile.response.ProfileFeature;
import com.app.tgtg.model.remote.profile.response.ProfileScreenResponse;
import d2.h2;
import d2.i2;
import d2.m2;
import d40.t1;
import g3.r9;
import hp.f1;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import li.e;
import lp.r;
import m2.b2;
import m2.q;
import m3.b1;
import m3.c3;
import m3.f;
import m3.f2;
import m3.h1;
import m3.i;
import m3.j;
import m3.j2;
import m3.m;
import m3.n;
import m3.q2;
import m3.s;
import m3.t;
import m3.w1;
import m3.y0;
import mn.l;
import ni.g;
import o30.f0;
import org.bouncycastle.iana.AEADAlgorithm;
import u3.d;
import z4.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26652c;

    public /* synthetic */ c(int i11, Object obj, Object obj2) {
        this.f26650a = i11;
        this.f26651b = obj;
        this.f26652c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f26650a;
        f fVar = m.f29332a;
        final int i12 = 2;
        final int i13 = 1;
        Object obj3 = this.f26652c;
        Object obj4 = this.f26651b;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                a.a.p((List) obj4, (Function1) obj3, (n) obj, i.F(1));
                break;
            case 1:
                Context context = (Context) obj4;
                b1 b1Var = (b1) obj3;
                w wVar = (w) obj2;
                ((LifecycleOwner) obj).getClass();
                wVar.getClass();
                if (e.$EnumSwitchMapping$0[wVar.ordinal()] == 1) {
                    b1Var.setValue(Boolean.valueOf(NotificationManagerCompat.from(context).areNotificationsEnabled()));
                }
                break;
            case 2:
                nl.a aVar = (nl.a) obj4;
                OptInActivity optInActivity = (OptInActivity) obj3;
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i14 = OptInActivity.f9058k;
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String privacyUrl = optInActivity.a0().f27892a.n().getPrivacyUrl();
                    if (privacyUrl == null) {
                        privacyUrl = "https://www.toogoodtogo.com";
                    }
                    String strConcat = privacyUrl.concat("?webview=1");
                    boolean zH = sVar.h(optInActivity);
                    Object objM = sVar.M();
                    if (zH || objM == fVar) {
                        objM = new ll.b(optInActivity, i13);
                        sVar.k0(objM);
                    }
                    Function0 function0 = (Function0) objM;
                    boolean zH2 = sVar.h(optInActivity);
                    Object objM2 = sVar.M();
                    if (zH2 || objM2 == fVar) {
                        objM2 = new ll.b(optInActivity, i12);
                        sVar.k0(objM2);
                    }
                    Function0 function02 = (Function0) objM2;
                    boolean zH3 = sVar.h(optInActivity);
                    Object objM3 = sVar.M();
                    if (zH3 || objM3 == fVar) {
                        objM3 = new ll.b(optInActivity, 3);
                        sVar.k0(objM3);
                    }
                    dx.f.e(aVar, strConcat, function0, function02, (Function0) objM3, sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                r.e((f1) obj4, (Function0) obj3, (n) obj, i.F(1));
                break;
            case 4:
                mq.a aVar2 = (mq.a) obj4;
                final lq.s sVar2 = (lq.s) obj3;
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i15 = lq.s.f28161k;
                s sVar3 = (s) nVar2;
                if (!sVar3.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar3.U();
                } else if (aVar2 instanceof ManufacturerItem) {
                    sVar3.a0(1358442341);
                    mq.a item = sVar2.getItem();
                    item.getClass();
                    ManufacturerItem manufacturerItem = (ManufacturerItem) item;
                    boolean z11 = sVar2.f28163i;
                    boolean zH4 = sVar3.h(sVar2);
                    Object objM4 = sVar3.M();
                    if (zH4 || objM4 == fVar) {
                        final int i16 = false ? 1 : 0;
                        objM4 = new Function0() { // from class: lq.q
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i17 = i16;
                                s sVar4 = sVar2;
                                switch (i17) {
                                    case 0:
                                        int i18 = s.f28161k;
                                        Function1<BasicItem, Unit> onCardClicked = sVar4.getOnCardClicked();
                                        if (onCardClicked != null) {
                                            mq.a item2 = sVar4.getItem();
                                            item2.getClass();
                                            onCardClicked.invoke((ManufacturerItem) item2);
                                        }
                                        break;
                                    case 1:
                                        int i19 = s.f28161k;
                                        Function0<Unit> favoriteOnClickLister = sVar4.getFavoriteOnClickLister();
                                        if (favoriteOnClickLister != null) {
                                            favoriteOnClickLister.invoke();
                                        }
                                        break;
                                    default:
                                        int i21 = s.f28161k;
                                        Function0<Unit> favoriteOnClickLister2 = sVar4.getFavoriteOnClickLister();
                                        if (favoriteOnClickLister2 != null) {
                                            favoriteOnClickLister2.invoke();
                                        }
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        };
                        sVar3.k0(objM4);
                    }
                    o.p(manufacturerItem, z11, (Function0) objM4, sVar3, 0);
                    sVar3.q(false);
                } else if (aVar2 instanceof FlashSalesItem) {
                    sVar3.a0(1358792021);
                    mq.a item2 = sVar2.getItem();
                    item2.getClass();
                    FlashSalesItem flashSalesItem = (FlashSalesItem) item2;
                    boolean z12 = sVar2.f28163i;
                    boolean zH5 = sVar3.h(sVar2);
                    Object objM5 = sVar3.M();
                    if (zH5 || objM5 == fVar) {
                        final int i17 = false ? 1 : 0;
                        objM5 = new Function1() { // from class: lq.r
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                int i18 = i17;
                                s sVar4 = sVar2;
                                BasicItem basicItem = (BasicItem) obj5;
                                switch (i18) {
                                    case 0:
                                        int i19 = s.f28161k;
                                        basicItem.getClass();
                                        Function1<BasicItem, Unit> onCardClicked = sVar4.getOnCardClicked();
                                        if (onCardClicked != null) {
                                            mq.a item3 = sVar4.getItem();
                                            item3.getClass();
                                            onCardClicked.invoke((BasicItem) item3);
                                        }
                                        break;
                                    default:
                                        int i21 = s.f28161k;
                                        basicItem.getClass();
                                        Function1<BasicItem, Unit> onCardClicked2 = sVar4.getOnCardClicked();
                                        if (onCardClicked2 != null) {
                                            mq.a item4 = sVar4.getItem();
                                            item4.getClass();
                                            onCardClicked2.invoke((BasicItem) item4);
                                        }
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        };
                        sVar3.k0(objM5);
                    }
                    Function1 function1 = (Function1) objM5;
                    boolean zH6 = sVar3.h(sVar2);
                    Object objM6 = sVar3.M();
                    if (zH6 || objM6 == fVar) {
                        objM6 = new Function0() { // from class: lq.q
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i172 = i13;
                                s sVar4 = sVar2;
                                switch (i172) {
                                    case 0:
                                        int i18 = s.f28161k;
                                        Function1<BasicItem, Unit> onCardClicked = sVar4.getOnCardClicked();
                                        if (onCardClicked != null) {
                                            mq.a item22 = sVar4.getItem();
                                            item22.getClass();
                                            onCardClicked.invoke((ManufacturerItem) item22);
                                        }
                                        break;
                                    case 1:
                                        int i19 = s.f28161k;
                                        Function0<Unit> favoriteOnClickLister = sVar4.getFavoriteOnClickLister();
                                        if (favoriteOnClickLister != null) {
                                            favoriteOnClickLister.invoke();
                                        }
                                        break;
                                    default:
                                        int i21 = s.f28161k;
                                        Function0<Unit> favoriteOnClickLister2 = sVar4.getFavoriteOnClickLister();
                                        if (favoriteOnClickLister2 != null) {
                                            favoriteOnClickLister2.invoke();
                                        }
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        };
                        sVar3.k0(objM6);
                    }
                    k.a(null, flashSalesItem, z12, function1, (Function0) objM6, sVar3, 0, 1);
                    sVar3.q(false);
                } else if (aVar2 instanceof BasicItem) {
                    sVar3.a0(1359215853);
                    mq.a item3 = sVar2.getItem();
                    item3.getClass();
                    BasicItem basicItem = (BasicItem) item3;
                    boolean z13 = sVar2.f28163i;
                    boolean z14 = sVar2.f28164j;
                    boolean zH7 = sVar3.h(sVar2);
                    Object objM7 = sVar3.M();
                    if (zH7 || objM7 == fVar) {
                        objM7 = new Function1() { // from class: lq.r
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                int i18 = i13;
                                s sVar4 = sVar2;
                                BasicItem basicItem2 = (BasicItem) obj5;
                                switch (i18) {
                                    case 0:
                                        int i19 = s.f28161k;
                                        basicItem2.getClass();
                                        Function1<BasicItem, Unit> onCardClicked = sVar4.getOnCardClicked();
                                        if (onCardClicked != null) {
                                            mq.a item32 = sVar4.getItem();
                                            item32.getClass();
                                            onCardClicked.invoke((BasicItem) item32);
                                        }
                                        break;
                                    default:
                                        int i21 = s.f28161k;
                                        basicItem2.getClass();
                                        Function1<BasicItem, Unit> onCardClicked2 = sVar4.getOnCardClicked();
                                        if (onCardClicked2 != null) {
                                            mq.a item4 = sVar4.getItem();
                                            item4.getClass();
                                            onCardClicked2.invoke((BasicItem) item4);
                                        }
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        };
                        sVar3.k0(objM7);
                    }
                    Function1 function12 = (Function1) objM7;
                    boolean zH8 = sVar3.h(sVar2);
                    Object objM8 = sVar3.M();
                    if (zH8 || objM8 == fVar) {
                        objM8 = new Function0() { // from class: lq.q
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i172 = i12;
                                s sVar4 = sVar2;
                                switch (i172) {
                                    case 0:
                                        int i18 = s.f28161k;
                                        Function1<BasicItem, Unit> onCardClicked = sVar4.getOnCardClicked();
                                        if (onCardClicked != null) {
                                            mq.a item22 = sVar4.getItem();
                                            item22.getClass();
                                            onCardClicked.invoke((ManufacturerItem) item22);
                                        }
                                        break;
                                    case 1:
                                        int i19 = s.f28161k;
                                        Function0<Unit> favoriteOnClickLister = sVar4.getFavoriteOnClickLister();
                                        if (favoriteOnClickLister != null) {
                                            favoriteOnClickLister.invoke();
                                        }
                                        break;
                                    default:
                                        int i21 = s.f28161k;
                                        Function0<Unit> favoriteOnClickLister2 = sVar4.getFavoriteOnClickLister();
                                        if (favoriteOnClickLister2 != null) {
                                            favoriteOnClickLister2.invoke();
                                        }
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        };
                        sVar3.k0(objM8);
                    }
                    t1.m(null, basicItem, z13, false, false, z14, function12, (Function0) objM8, null, sVar3, 0, 281);
                    sVar3.q(false);
                } else {
                    sVar3.a0(1359674808);
                    sVar3.q(false);
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((q) obj4).a((d) obj3, (n) obj, i.F(7));
                break;
            case 6:
                y0 y0Var = (y0) obj4;
                n nVar3 = (n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                s sVar4 = (s) nVar3;
                if (sVar4.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    y0Var.getClass();
                    o9.b.f32135a.invoke(obj3, sVar4, 0);
                } else {
                    sVar4.U();
                }
                break;
            case 7:
                g0.c cVar = (g0.c) obj4;
                q2 q2Var = (q2) obj3;
                int iIntValue4 = ((Integer) obj).intValue();
                if (obj2 instanceof j) {
                    ((o3.e) cVar.f18003f).b((j) obj2);
                } else if (!(obj2 instanceof j2)) {
                    if (obj2 instanceof f2) {
                        t.d(q2Var, iIntValue4, obj2);
                        cVar.e((f2) obj2);
                    } else if (obj2 instanceof w1) {
                        t.d(q2Var, iIntValue4, obj2);
                        ((w1) obj2).d();
                    }
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                o.g((Order) obj4, (i80.n) obj3, (n) obj, i.F(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                o.v((List) obj4, (Price) obj3, (n) obj, i.F(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                ((ng.d) obj4).p((Function0) obj3, (n) obj, i.F(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                g.a((ni.e) obj4, (Function0) obj3, (n) obj, i.F(1));
                break;
            case 12:
                ni.e eVar = (ni.e) obj4;
                b1 b1Var2 = (b1) obj3;
                w wVar2 = (w) obj2;
                ((LifecycleOwner) obj).getClass();
                wVar2.getClass();
                if (ni.d.$EnumSwitchMapping$0[wVar2.ordinal()] == 1) {
                    b1Var2.setValue(Boolean.valueOf(eVar.f30875a.a()));
                }
                break;
            case 13:
                ((Integer) obj2).getClass();
                nn.q.d((ProfileScreenResponse) obj4, (Activity) obj3, (n) obj, i.F(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                nn.q.e((ProfileFeature) obj4, (l) obj3, (n) obj, i.F(1));
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((Integer) obj2).getClass();
                nn.q.a((l) obj4, (Activity) obj3, (n) obj, i.F(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                int i18 = SurpriseBagOrderActivity.f9178y;
                ((SurpriseBagOrderActivity) obj4).G((b1) obj3, (n) obj, i.F(7));
                break;
            case 17:
                ((Integer) obj2).getClass();
                nv.c.a((Function0) obj4, (d) obj3, (n) obj, i.F(49));
                break;
            case 18:
                ((Integer) obj2).getClass();
                oi.a.d((oi.d) obj4, (Function0) obj3, (n) obj, i.F(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                oi.a.c((List) obj4, (b4.t) obj3, (n) obj, i.F(1));
                break;
            case 20:
                int iIntValue5 = ((Integer) obj).intValue();
                int iIntValue6 = ((Integer) obj2).intValue();
                ((h1) obj4).i(iIntValue5);
                ((h1) obj3).i(iIntValue6);
                break;
            case 21:
                ((Integer) obj2).getClass();
                oo.a.t((OrderDataForInvitation) obj4, (Function0) obj3, (n) obj, i.F(385));
                break;
            case 22:
                jd.f fVar2 = (jd.f) obj4;
                b1 b1Var3 = (b1) obj3;
                n nVar4 = (n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                s sVar5 = (s) nVar4;
                if (sVar5.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    String str = (String) b1Var3.getValue();
                    if (str == null) {
                        str = "-";
                    }
                    String str2 = str;
                    boolean zH9 = sVar5.h(fVar2);
                    Object objM9 = sVar5.M();
                    if (zH9 || objM9 == fVar) {
                        objM9 = new b2(fVar2, 12);
                        sVar5.k0(objM9);
                    }
                    cg.j.s(str2, null, 0L, 0L, (Function0) objM9, null, null, null, sVar5, 0, 238);
                } else {
                    sVar5.U();
                }
                break;
            case 23:
                n4.b bVar = (n4.b) obj4;
                h hVar = (h) obj3;
                n nVar5 = (n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                s sVar6 = (s) nVar5;
                if (sVar6.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    b4.j jVar = b4.d.f5693k;
                    d2.e eVar2 = d2.i.f13805e;
                    float f11 = lv.t.f28253g;
                    b4.q qVar = b4.q.f5711a;
                    b4.t tVarB = d2.c.B(qVar, 0.0f, f11, 1);
                    i2 i2VarA = h2.a(eVar2, jVar, sVar6, 54);
                    int iHashCode = Long.hashCode(sVar6.T);
                    u3.i iVarL = sVar6.l();
                    b4.t tVarC = b4.a.c(tVarB, sVar6);
                    b5.j.R.getClass();
                    b5.h hVar2 = b5.i.f5839b;
                    sVar6.e0();
                    if (sVar6.S) {
                        sVar6.k(hVar2);
                    } else {
                        sVar6.n0();
                    }
                    i.C(i2VarA, b5.i.f5843f, sVar6);
                    i.C(iVarL, b5.i.f5842e, sVar6);
                    i.v(sVar6, Integer.valueOf(iHashCode), b5.i.f5844g);
                    i.z(sVar6, b5.i.f5845h);
                    i.C(tVarC, b5.i.f5841d, sVar6);
                    if (bVar != null) {
                        sVar6.a0(2007410531);
                        v1.n.d(bVar, null, m2.m(d2.c.D(qVar, 0.0f, 0.0f, 16, 0.0f, 11), 18), null, null, 0.0f, null, sVar6, 440, 120);
                        sVar6.q(false);
                    } else {
                        sVar6.a0(2007670001);
                        sVar6.q(false);
                    }
                    r9.d(f0.U(sVar6, hVar.e()), null, hVar.d(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, hVar.f(), sVar6, 0, 0, 131066);
                    sVar6.q(true);
                } else {
                    sVar6.U();
                }
                break;
            case 24:
                t2.d dVar = (t2.d) obj4;
                p2.g gVar = (p2.g) obj3;
                n nVar6 = (n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                s sVar7 = (s) nVar6;
                if (sVar7.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    boolean zF = sVar7.f(dVar);
                    Object objM10 = sVar7.M();
                    if (zF || objM10 == fVar) {
                        objM10 = i.q(new b40.d(dVar, 16));
                        sVar7.k0(objM10);
                    }
                    r2.h.a(gVar, (p2.c) ((c3) objM10).getValue(), sVar7, 0);
                } else {
                    sVar7.U();
                }
                break;
            case 25:
                ((Integer) obj2).getClass();
                r2.h.a((p2.g) obj4, (p2.c) obj3, (n) obj, i.F(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                ((r2.n) obj4).a((Drawable) obj3, (n) obj, i.F(49));
                break;
            case 27:
                ((Integer) obj2).getClass();
                rk.e.u((z) obj4, (Function0) obj3, (n) obj, i.F(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                rk.e.k((BasicItem) obj4, (m1.a) obj3, (n) obj, i.F(1));
                break;
            default:
                ((Integer) obj2).getClass();
                rk.e.z((m1.a) obj4, (Function0) obj3, (n) obj, i.F(49));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ c(Object obj, Object obj2, int i11, int i12) {
        this.f26650a = i12;
        this.f26651b = obj;
        this.f26652c = obj2;
    }
}
