package lk;

import a3.l3;
import a3.s2;
import a3.t2;
import android.app.Activity;
import android.graphics.RectF;
import android.widget.Toast;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.c1;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import androidx.lifecycle.p;
import androidx.lifecycle.s1;
import b0.a0;
import b0.z;
import b4.t;
import c5.f3;
import c5.x1;
import cg.j;
import cn.x;
import com.app.tgtg.feature.bucketlist.ui.BucketListActivity;
import com.app.tgtg.feature.helpdesk.ui.topic.TopicFragment;
import com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity;
import com.app.tgtg.feature.tabdiscover.discoveritems.DiscoverFavoritesPromoItemView;
import com.app.tgtg.feature.tabdiscover.discoveritems.DiscoverLocalHeroItemView;
import com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.edit.EditDataActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.specialrewards.SpecialRewardsActivity;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.RewardId;
import com.app.tgtg.model.remote.Server;
import com.app.tgtg.model.remote.invitation.InvitationFromDeeplinkResponse;
import com.app.tgtg.model.remote.item.response.AllergensInfo;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.payment.BasicSavedPaymentMethod;
import com.app.tgtg.model.remote.payment.SavedEdenred;
import com.app.tgtg.model.remote.specialrewards.SpecialReward;
import com.app.tgtg.model.remote.user.requests.CollectionTime;
import com.app.tgtg.model.remote.user.requests.UserAddress;
import com.braze.h2;
import d2.m2;
import d2.w;
import d2.w0;
import d2.y;
import d2.z2;
import d40.t1;
import g0.c;
import g3.r9;
import g3.v3;
import g3.w6;
import g4.l;
import g9.f0;
import g9.t0;
import h2.n0;
import hp.g;
import hp.o0;
import i3.j0;
import i4.k0;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.text.b0;
import lh.c0;
import lm.i;
import lp.d;
import lv.v;
import m2.e2;
import m2.g0;
import m2.l1;
import m3.b1;
import m3.b2;
import m3.f;
import m3.f2;
import m3.k1;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import m3.z1;
import o3.e;
import o30.e0;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import ox.h;
import q1.i1;
import q1.j1;
import q1.u0;
import q5.r;
import s1.r0;
import u70.o;
import u70.q;
import v80.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27882b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f27881a = i11;
        this.f27882b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        k kVarC;
        long j9;
        long j11;
        boolean zI;
        float fA;
        l lVar;
        Unit unit;
        b1 b1Var;
        f0 f0Var;
        long j12 = -9187201950435737472L;
        switch (this.f27881a) {
            case 0:
                TopicFragment topicFragment = (TopicFragment) this.f27882b;
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h.j(topicFragment.o(), sVar, 0);
                } else {
                    sVar.U();
                }
                return Unit.f26487a;
            case 1:
                i iVar = (i) this.f27882b;
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qm.b.b(iVar.f27927q, sVar2, 0);
                } else {
                    sVar2.U();
                }
                return Unit.f26487a;
            case 2:
                ((Integer) obj2).getClass();
                d.e((o0) this.f27882b, (n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 3:
                ((Integer) obj2).getClass();
                d.c((k0) this.f27882b, (n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 4:
                ((Integer) obj2).getClass();
                d.q((g) this.f27882b, (n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 5:
                DiscoverFavoritesPromoItemView discoverFavoritesPromoItemView = (DiscoverFavoritesPromoItemView) this.f27882b;
                n nVar3 = (n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i11 = DiscoverFavoritesPromoItemView.f9294k;
                s sVar3 = (s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    w6 w6VarF = v3.f(6, 2, null, sVar3);
                    Object objM = sVar3.M();
                    f fVar = m.f29332a;
                    Object obj3 = objM;
                    if (objM == fVar) {
                        k1 k1VarW = m3.i.w(Boolean.FALSE);
                        sVar3.k0(k1VarW);
                        obj3 = k1VarW;
                    }
                    b1 b1Var2 = (b1) obj3;
                    s1 s1VarA = z8.a.a(sVar3);
                    if (s1VarA == null) {
                        h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return null;
                    }
                    xj.k kVar = (xj.k) t1.K(Reflection.getOrCreateKotlinClass(xj.k.class), s1VarA, e0.r(s1VarA, sVar3), s1VarA instanceof p ? ((p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar3);
                    boolean zH = sVar3.h(kVar);
                    Object objM2 = sVar3.M();
                    Object obj4 = objM2;
                    if (zH || objM2 == fVar) {
                        lq.b bVar = new lq.b(kVar, b1Var2, false ? 1 : 0);
                        sVar3.k0(bVar);
                        obj4 = bVar;
                    }
                    yj.a.i((Function0) obj4, sVar3, 0);
                    if (((Boolean) b1Var2.getValue()).booleanValue()) {
                        sVar3.a0(1505353496);
                        boolean z11 = discoverFavoritesPromoItemView.f9297j;
                        Object objM3 = sVar3.M();
                        Object obj5 = objM3;
                        if (objM3 == fVar) {
                            n0 n0Var = new n0(b1Var2, 24);
                            sVar3.k0(n0Var);
                            obj5 = n0Var;
                        }
                        yj.a.k(w6VarF, z11, (Function0) obj5, sVar3, MLKEMEngine.KyberPolyBytes);
                        sVar3.q(false);
                    } else {
                        sVar3.a0(1505640835);
                        sVar3.q(false);
                    }
                } else {
                    sVar3.U();
                }
                return Unit.f26487a;
            case 6:
                DiscoverLocalHeroItemView discoverLocalHeroItemView = (DiscoverLocalHeroItemView) this.f27882b;
                n nVar4 = (n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i12 = DiscoverLocalHeroItemView.f9298j;
                s sVar4 = (s) nVar4;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zH2 = sVar4.h(discoverLocalHeroItemView);
                    Object objM4 = sVar4.M();
                    if (zH2 || objM4 == m.f29332a) {
                        objM4 = new jt.g(discoverLocalHeroItemView, 18);
                        sVar4.k0(objM4);
                    }
                    j.e((Function0) objM4, sVar4, 0);
                } else {
                    sVar4.U();
                }
                return Unit.f26487a;
            case 7:
                ((Integer) obj2).getClass();
                ls.a.d((BasicSavedPaymentMethod) this.f27882b, (n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 8:
                ((Integer) obj2).getClass();
                ls.a.e((SavedEdenred) this.f27882b, (n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 9:
                Long l = (Long) obj2;
                if (t2.a((s2) this.f27882b, l.longValue())) {
                    return l;
                }
                return null;
            case 10:
                ((Integer) obj2).getClass();
                g0.n((l3) this.f27882b, (n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 11:
                ((l1) this.f27882b).e(((h4.b) obj2).f21378a);
                return Unit.f26487a;
            case 12:
                ((Integer) obj2).getClass();
                ((e2) this.f27882b).a((n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 13:
                c cVar = (c) this.f27882b;
                ((Integer) obj).getClass();
                if (obj2 instanceof m3.j) {
                    m3.j jVar = (m3.j) obj2;
                    u0 u0Var = (u0) cVar.f18005h;
                    if (u0Var == null) {
                        u0 u0Var2 = j1.f35777a;
                        u0Var = new u0();
                        cVar.f18005h = u0Var;
                    }
                    u0Var.j(jVar);
                    ((e) cVar.f18003f).b(jVar);
                }
                if (obj2 instanceof f2) {
                    cVar.e((f2) obj2);
                }
                if (obj2 instanceof w1) {
                    ((w1) obj2).d();
                }
                return Unit.f26487a;
            case 14:
                b2 b2Var = (b2) this.f27882b;
                Set set = (Set) obj;
                synchronized (b2Var.f29227c) {
                    try {
                        if (((z1) b2Var.f29244u.getValue()).compareTo(z1.Idle) >= 0) {
                            u0 u0Var3 = b2Var.f29232h;
                            if (set instanceof o3.h) {
                                i1 i1Var = ((o3.h) set).f31843a;
                                Object[] objArr = i1Var.f35769b;
                                long[] jArr = i1Var.f35768a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i13 = 0;
                                    while (true) {
                                        long j13 = jArr[i13];
                                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i14 = 8 - ((~(i13 - length)) >>> 31);
                                            for (int i15 = 0; i15 < i14; i15++) {
                                                if ((j13 & 255) < 128) {
                                                    Object obj6 = objArr[(i13 << 3) + i15];
                                                    if (!(obj6 instanceof z3.e0) || ((z3.e0) obj6).f(1)) {
                                                        u0Var3.d(obj6);
                                                    }
                                                }
                                                j13 >>= 8;
                                            }
                                            if (i14 == 8) {
                                            }
                                        }
                                        if (i13 != length) {
                                            i13++;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj7 : set) {
                                    if (!(obj7 instanceof z3.e0) || ((z3.e0) obj7).f(1)) {
                                        u0Var3.d(obj7);
                                    }
                                }
                            }
                            kVarC = b2Var.C();
                        } else {
                            kVarC = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                if (kVarC != null) {
                    o oVar = q.f40850b;
                    ((v80.l) kVarC).resumeWith(Unit.f26487a);
                }
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                x80.i iVar2 = (x80.i) this.f27882b;
                Set set2 = (Set) obj;
                if (set2 instanceof o3.h) {
                    i1 i1Var2 = ((o3.h) set2).f31843a;
                    Object[] objArr2 = i1Var2.f35769b;
                    long[] jArr2 = i1Var2.f35768a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i16 = 0;
                        while (true) {
                            long j14 = jArr2[i16];
                            if ((((~j14) << 7) & j14 & j12) != j12) {
                                int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                int i18 = 0;
                                while (i18 < i17) {
                                    if ((j14 & 255) < 128) {
                                        Object obj8 = objArr2[(i16 << 3) + i18];
                                        j11 = j12;
                                        if (!(obj8 instanceof z3.e0) || ((z3.e0) obj8).f(4)) {
                                        }
                                    } else {
                                        j11 = j12;
                                    }
                                    j14 >>= 8;
                                    i18++;
                                    j12 = j11;
                                }
                                j9 = j12;
                                if (i17 == 8) {
                                }
                            } else {
                                j9 = j12;
                            }
                            if (i16 != length2) {
                                i16++;
                                j12 = j9;
                            }
                        }
                    }
                } else {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (Object obj9 : set3) {
                            if (!(obj9 instanceof z3.e0) || ((z3.e0) obj9).f(4)) {
                                iVar2.h(set2);
                            }
                        }
                    }
                }
                return Unit.f26487a;
            case 16:
                m0.i1 i1Var3 = (m0.i1) this.f27882b;
                h4.c cVarF = i4.g0.F((RectF) obj);
                h4.c cVarF2 = i4.g0.F((RectF) obj2);
                switch (i1Var3.f28529a) {
                    case 2:
                        zI = cVarF.i(cVarF2);
                        break;
                    default:
                        zI = cVarF2.a(cVarF.d());
                        break;
                }
                return Boolean.valueOf(zI);
            case 17:
                ((Integer) obj2).getClass();
                t1.f((UserAddress) this.f27882b, (n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 18:
                EditDataActivity editDataActivity = (EditDataActivity) this.f27882b;
                n nVar5 = (n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i19 = EditDataActivity.f9359n;
                s sVar5 = (s) nVar5;
                if (sVar5.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    a80.a entries = CollectionTime.getEntries();
                    List listD = editDataActivity.b0().d();
                    boolean zH3 = sVar5.h(editDataActivity);
                    Object objM5 = sVar5.M();
                    if (zH3 || objM5 == m.f29332a) {
                        objM5 = new mr.b(editDataActivity, 9);
                        sVar5.k0(objM5);
                    }
                    bx.o.i(entries, listD, (Function1) objM5, sVar5, 0);
                } else {
                    sVar5.U();
                }
                return Unit.f26487a;
            case 19:
                ng.d dVar = (ng.d) this.f27882b;
                n nVar6 = (n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                s sVar6 = (s) nVar6;
                if (sVar6.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    b1 b1VarM = m3.i.m(dVar.s().f30846g, null, null, sVar6, 48, 2);
                    Object objM6 = sVar6.M();
                    f fVar2 = m.f29332a;
                    Object obj10 = objM6;
                    if (objM6 == fVar2) {
                        k1 k1VarW2 = m3.i.w((List) b1VarM.getValue());
                        sVar6.k0(k1VarW2);
                        obj10 = k1VarW2;
                    }
                    b1 b1Var3 = (b1) obj10;
                    b1 b1VarN = m3.i.n(dVar.s().f30843d, sVar6, 0);
                    Object objM7 = sVar6.M();
                    Object obj11 = objM7;
                    if (objM7 == fVar2) {
                        t1.k0 k0Var = new t1.k0(Boolean.FALSE);
                        k0Var.f39472d.setValue(Boolean.TRUE);
                        sVar6.k0(k0Var);
                        obj11 = k0Var;
                    }
                    t1.k0 k0Var2 = (t1.k0) obj11;
                    WeakHashMap weakHashMap = z2.f13983w;
                    boolean zBooleanValue = ((Boolean) d2.b.e(sVar6).f13986c.f13728d.getValue()).booleanValue();
                    f3 f3Var = (f3) sVar6.j(x1.f7423p);
                    l lVar2 = (l) sVar6.j(x1.f7417i);
                    t tVarC = m2.c(b4.q.f5711a, 1.0f);
                    if (zBooleanValue) {
                        sVar6.a0(1344200435);
                        fA = d2.c.j(d2.b.e(sVar6).f13986c, sVar6).a();
                        sVar6.q(false);
                    } else {
                        sVar6.a0(1344397812);
                        sVar6.q(false);
                        fA = 0;
                    }
                    t tVarD = d2.c.D(tVarC, 0.0f, 0.0f, 0.0f, fA, 7);
                    y yVarA = w.a(d2.i.f13807g, b4.d.f5694m, sVar6, 6);
                    int iHashCode = Long.hashCode(sVar6.T);
                    u3.i iVarL = sVar6.l();
                    t tVarC2 = b4.a.c(tVarD, sVar6);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar6.e0();
                    if (sVar6.S) {
                        sVar6.k(hVar);
                    } else {
                        sVar6.n0();
                    }
                    m3.i.C(yVarA, b5.i.f5843f, sVar6);
                    m3.i.C(iVarL, b5.i.f5842e, sVar6);
                    m3.i.v(sVar6, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar6, b5.i.f5845h);
                    m3.i.C(tVarC2, b5.i.f5841d, sVar6);
                    String name = ((Server) b1VarN.getValue()).getName();
                    boolean zF = sVar6.f(b1VarM);
                    Object objM8 = sVar6.M();
                    Object obj12 = objM8;
                    if (zF || objM8 == fVar2) {
                        j0 j0Var = new j0(b1VarM, b1Var3);
                        sVar6.k0(j0Var);
                        obj12 = j0Var;
                    }
                    dVar.q(name, (Function1) obj12, sVar6, 0);
                    List list = (List) b1VarM.getValue();
                    if (list == null) {
                        sVar6.a0(-471566396);
                        sVar6.q(false);
                        lVar = lVar2;
                        unit = null;
                    } else {
                        sVar6.a0(-471566395);
                        if (list.isEmpty()) {
                            lVar = lVar2;
                            sVar6.a0(-1867441693);
                            z.k((Server) b1VarN.getValue(), true, null, sVar6, 432);
                            Toast.makeText(dVar.requireActivity(), "Couldn't load servers", 0).show();
                            sVar6.q(false);
                        } else {
                            sVar6.a0(-1868052393);
                            lVar = lVar2;
                            s1.y.c(k0Var2, d2.z.a().then(m2.f13850c), r0.d(t1.c.k(500, 0, null, 6), 2), null, null, u3.e.e(870876877, sVar6, new x(13, dVar, b1Var3, b1VarM, b1VarN)), sVar6, 1575942);
                            sVar6.q(false);
                        }
                        sVar6.q(false);
                        unit = Unit.f26487a;
                    }
                    if (unit == null) {
                        sVar6.a0(-470577309);
                        j.q(0, 0, new w0(b4.d.f5695n), sVar6);
                        sVar6.q(false);
                    } else {
                        sVar6.a0(261882604);
                        sVar6.q(false);
                    }
                    boolean zF2 = sVar6.f(f3Var) | sVar6.h(lVar);
                    Object objM9 = sVar6.M();
                    Object obj13 = objM9;
                    if (zF2 || objM9 == fVar2) {
                        m90.z zVar = new m90.z(10, f3Var, lVar);
                        sVar6.k0(zVar);
                        obj13 = zVar;
                    }
                    dVar.p((Function0) obj13, sVar6, 0);
                    sVar6.q(true);
                } else {
                    sVar6.U();
                }
                return Unit.f26487a;
            case 20:
                ((Integer) obj2).getClass();
                nn.q.k((mn.l) this.f27882b, (n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 21:
                Activity activity = (Activity) this.f27882b;
                Order order = (Order) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                order.getClass();
                if (activity != null) {
                    p30.b.w(activity, new io.a(order.m429getOrderIdreIZeYA(), order.getInvitationId(), order.getOrderType(), zBooleanValue2, f70.i.PROFILE, 80), null);
                }
                return Unit.f26487a;
            case 22:
                no.j jVar2 = (no.j) this.f27882b;
                n nVar7 = (n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                s sVar7 = (s) nVar7;
                if (sVar7.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    c1 c1Var = jVar2.f31223b;
                    kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
                    String upperCase = b0.y(4, OrderId.m210constructorimpl(((xh.z) e0.f.f(o0Var, xh.z.class, c1Var, o0Var)).f44348b)).toUpperCase(t5.d.f39798a.k().b().f39794a);
                    upperCase.getClass();
                    r9.d(upperCase, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(v.f28269h, lv.s.J, 0L, r.f36046k, null, a0.B(2.13d), null, 0, 0L, null, null, 16777082), sVar7, 0, 0, 131070);
                } else {
                    sVar7.U();
                }
                return Unit.f26487a;
            case 23:
                SurpriseBagOrderActivity surpriseBagOrderActivity = (SurpriseBagOrderActivity) this.f27882b;
                n nVar8 = (n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                int i21 = SurpriseBagOrderActivity.f9178y;
                s sVar8 = (s) nVar8;
                if (sVar8.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    w6 w6VarF2 = v3.f(6, 2, null, sVar8);
                    Object objM10 = sVar8.M();
                    Object obj14 = m.f29332a;
                    Object obj15 = objM10;
                    if (objM10 == obj14) {
                        Object objW = m3.i.w(Boolean.FALSE);
                        sVar8.k0(objW);
                        obj15 = objW;
                    }
                    b1 b1Var4 = (b1) obj15;
                    Object objM11 = sVar8.M();
                    Object obj16 = objM11;
                    if (objM11 == obj14) {
                        Object objW2 = m3.i.w(Boolean.FALSE);
                        sVar8.k0(objW2);
                        obj16 = objW2;
                    }
                    b1 b1Var5 = (b1) obj16;
                    Object objM12 = sVar8.M();
                    Object obj17 = objM12;
                    if (objM12 == obj14) {
                        Object objW3 = m3.i.w(oo.f.NONE);
                        sVar8.k0(objW3);
                        obj17 = objW3;
                    }
                    b1 b1Var6 = (b1) obj17;
                    Object objM13 = sVar8.M();
                    Object obj18 = objM13;
                    if (objM13 == obj14) {
                        Object objW4 = m3.i.w(Boolean.TRUE);
                        sVar8.k0(objW4);
                        obj18 = objW4;
                    }
                    b1 b1Var7 = (b1) obj18;
                    Object objM14 = sVar8.M();
                    Object obj19 = objM14;
                    if (objM14 == obj14) {
                        Object objW5 = m3.i.w(null);
                        sVar8.k0(objW5);
                        obj19 = objW5;
                    }
                    b1 b1Var8 = (b1) obj19;
                    Object objM15 = sVar8.M();
                    Object obj20 = objM15;
                    if (objM15 == obj14) {
                        Object objW6 = m3.i.w(Boolean.TRUE);
                        sVar8.k0(objW6);
                        obj20 = objW6;
                    }
                    b1 b1Var9 = (b1) obj20;
                    Object objM16 = sVar8.M();
                    Object obj21 = objM16;
                    if (objM16 == obj14) {
                        Object objW7 = m3.i.w(null);
                        sVar8.k0(objW7);
                        obj21 = objW7;
                    }
                    b1 b1Var10 = (b1) obj21;
                    Object objM17 = sVar8.M();
                    Object obj22 = objM17;
                    if (objM17 == obj14) {
                        Object objW8 = m3.i.w(Boolean.FALSE);
                        sVar8.k0(objW8);
                        obj22 = objW8;
                    }
                    b1 b1Var11 = (b1) obj22;
                    Object objM18 = sVar8.M();
                    Object objW9 = objM18;
                    if (objM18 == obj14) {
                        Boolean bool = (Boolean) surpriseBagOrderActivity.C().f31266y.a("SHOW_RECOMMENDATIONS_BOTTOM_SHEET");
                        objW9 = e0.f.w(bool != null ? bool.booleanValue() : false, sVar8);
                    }
                    b1 b1Var12 = (b1) objW9;
                    b1 b1VarN2 = m3.i.n(surpriseBagOrderActivity.C().N, sVar8, 0);
                    b1 b1VarN3 = m3.i.n(surpriseBagOrderActivity.C().f31256j0, sVar8, 0);
                    b1 b1VarN4 = m3.i.n(surpriseBagOrderActivity.C().f22215i, sVar8, 0);
                    surpriseBagOrderActivity.I((Order) b1VarN4.getValue(), b1Var4, b1Var5, b1Var6, b1Var7, b1Var9, b1Var8, b1Var10, sVar8, 14380464);
                    if (((Order) b1VarN4.getValue()) == null && ((InvitationFromDeeplinkResponse) b1VarN2.getValue()) == null) {
                        return Unit.f26487a;
                    }
                    if (((String) surpriseBagOrderActivity.C().f31266y.a("INVITATION_FROM_DEEPLINK")) != null && ((Order) b1VarN4.getValue()) == null) {
                        sVar8.a0(-666117016);
                        surpriseBagOrderActivity.G(b1Var11, sVar8, 6);
                        surpriseBagOrderActivity.C().l(cv.i.SCREEN_COLLECTION_INVITATION_RECEIVED, null);
                        sVar8.q(false);
                        b1Var = b1Var6;
                    } else if (((Order) b1VarN4.getValue()) != null) {
                        sVar8.a0(-298574577);
                        Order order2 = (Order) b1VarN4.getValue();
                        if (order2 == null) {
                            sVar8.a0(-665877294);
                            sVar8.q(false);
                            b1Var = b1Var6;
                        } else {
                            sVar8.a0(-665877293);
                            surpriseBagOrderActivity.J(order2, b1Var6, b1Var4, b1Var5, b1Var7, b1Var8, b1Var10, sVar8, 1797552);
                            b1Var = b1Var6;
                            sVar8.q(false);
                        }
                        sVar8.q(false);
                    } else {
                        b1Var = b1Var6;
                        sVar8.a0(-665391554);
                        sVar8.q(false);
                    }
                    if (((Boolean) b1Var12.getValue()).booleanValue()) {
                        sVar8.a0(-665314953);
                        surpriseBagOrderActivity.C().f31266y.d(Boolean.FALSE, "SHOW_RECOMMENDATIONS_BOTTOM_SHEET");
                        BasicItem basicItem = (BasicItem) m3.i.n(surpriseBagOrderActivity.C().f31248b0, sVar8, 0).getValue();
                        if (basicItem == null) {
                            sVar8.a0(-665140486);
                            sVar8.q(false);
                        } else {
                            sVar8.a0(-665140485);
                            boolean zH4 = sVar8.h(surpriseBagOrderActivity);
                            Object objM19 = sVar8.M();
                            Object obj23 = objM19;
                            if (zH4 || objM19 == obj14) {
                                Object mVar = new no.m(surpriseBagOrderActivity, 7);
                                sVar8.k0(mVar);
                                obj23 = mVar;
                            }
                            Function1 function1 = (Function1) obj23;
                            Object objM20 = sVar8.M();
                            Object obj24 = objM20;
                            if (objM20 == obj14) {
                                Object aVar = new ms.a(b1Var12, 21);
                                sVar8.k0(aVar);
                                obj24 = aVar;
                            }
                            po.c.j(basicItem, function1, (Function0) obj24, sVar8, MLKEMEngine.KyberPolyBytes);
                            sVar8.q(false);
                        }
                        sVar8.q(false);
                    } else {
                        sVar8.a0(-664662434);
                        sVar8.q(false);
                    }
                    if (((Boolean) b1Var11.getValue()).booleanValue()) {
                        sVar8.a0(-664576130);
                        InvitationFromDeeplinkResponse invitationFromDeeplinkResponse = (InvitationFromDeeplinkResponse) b1VarN2.getValue();
                        AllergensInfo allergensInfo = invitationFromDeeplinkResponse != null ? invitationFromDeeplinkResponse.getAllergensInfo() : null;
                        no.e eVar = (no.e) b1VarN3.getValue();
                        boolean zH5 = sVar8.h(surpriseBagOrderActivity);
                        Object objM21 = sVar8.M();
                        Object obj25 = objM21;
                        if (zH5 || objM21 == obj14) {
                            Object lVar3 = new no.l(surpriseBagOrderActivity, b1Var, 9);
                            sVar8.k0(lVar3);
                            obj25 = lVar3;
                        }
                        Function0 function0 = (Function0) obj25;
                        boolean zH6 = sVar8.h(surpriseBagOrderActivity);
                        Object objM22 = sVar8.M();
                        Object obj26 = objM22;
                        if (zH6 || objM22 == obj14) {
                            Object mVar2 = new no.m(surpriseBagOrderActivity, 8);
                            sVar8.k0(mVar2);
                            obj26 = mVar2;
                        }
                        Function1 function12 = (Function1) obj26;
                        Object objM23 = sVar8.M();
                        Object obj27 = objM23;
                        if (objM23 == obj14) {
                            Object aVar2 = new ms.a(b1Var11, 5);
                            sVar8.k0(aVar2);
                            obj27 = aVar2;
                        }
                        po.c.a(w6VarF2, function0, function12, (Function0) obj27, allergensInfo, eVar, sVar8, 3072);
                        surpriseBagOrderActivity.C().l(cv.i.SCREEN_NEED_TO_KNOW, null);
                        sVar8.q(false);
                    } else {
                        sVar8.a0(-663653570);
                        sVar8.q(false);
                    }
                } else {
                    sVar8.U();
                }
                return Unit.f26487a;
            case 24:
                SpecialRewardsActivity specialRewardsActivity = (SpecialRewardsActivity) this.f27882b;
                n nVar9 = (n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                int i22 = SpecialRewardsActivity.f9434g;
                s sVar9 = (s) nVar9;
                if (sVar9.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    b1 b1VarN5 = m3.i.n(specialRewardsActivity.A().f31388f, sVar9, 0);
                    f0 f0VarI = a.a.I(new t0[0], sVar9);
                    Object objM24 = sVar9.M();
                    f fVar3 = m.f29332a;
                    if (objM24 == fVar3) {
                        objM24 = m3.i.w(Boolean.FALSE);
                        sVar9.k0(objM24);
                    }
                    b1 b1Var13 = (b1) objM24;
                    Object objM25 = sVar9.M();
                    if (objM25 == fVar3) {
                        objM25 = m3.i.w(RewardId.m257boximpl(RewardId.m258constructorimpl("0")));
                        sVar9.k0(objM25);
                    }
                    b1 b1Var14 = (b1) objM25;
                    t tVarJ = v1.n.j(m2.f13850c, lv.s.J, i4.g0.f23254b);
                    boolean zH7 = sVar9.h(specialRewardsActivity) | sVar9.h(f0VarI);
                    Object objM26 = sVar9.M();
                    if (zH7 || objM26 == fVar3) {
                        b0.x1 x1Var = new b0.x1(20, specialRewardsActivity, f0VarI, b1Var14, b1Var13);
                        f0Var = f0VarI;
                        sVar9.k0(x1Var);
                        objM26 = x1Var;
                    } else {
                        f0Var = f0VarI;
                    }
                    z.h(f0Var, "screen_list", tVarJ, null, null, null, null, null, null, (Function1) objM26, sVar9, MLKEMEngine.KyberPolyBytes, 1016);
                    if (((Boolean) b1Var13.getValue()).booleanValue()) {
                        sVar9.a0(2045998769);
                        SpecialReward specialReward = (SpecialReward) m3.i.n(specialRewardsActivity.A().l, sVar9, 0).getValue();
                        if (specialReward == null) {
                            sVar9.a0(-998547600);
                            sVar9.q(false);
                        } else {
                            sVar9.a0(-998547599);
                            s1 s1VarA2 = z8.a.a(sVar9);
                            if (s1VarA2 == null) {
                                h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return null;
                            }
                            ns.g gVar = (ns.g) t1.K(Reflection.getOrCreateKotlinClass(ns.g.class), s1VarA2, e0.r(s1VarA2, sVar9), s1VarA2 instanceof p ? ((p) s1VarA2).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar9);
                            Object objM27 = sVar9.M();
                            if (objM27 == fVar3) {
                                objM27 = new ms.a(b1Var13, 22);
                                sVar9.k0(objM27);
                            }
                            Function0 function02 = (Function0) objM27;
                            boolean zH8 = sVar9.h(specialRewardsActivity);
                            Object objM28 = sVar9.M();
                            if (zH8 || objM28 == fVar3) {
                                objM28 = new ns.b(specialRewardsActivity, false ? 1 : 0);
                                sVar9.k0(objM28);
                            }
                            os.a.a(specialReward, gVar, function02, (Function0) objM28, sVar9, MLKEMEngine.KyberPolyBytes);
                            sVar9.q(false);
                        }
                        sVar9.q(false);
                    } else {
                        sVar9.a0(-998083963);
                        sVar9.q(false);
                    }
                    if (((Boolean) b1VarN5.getValue()).booleanValue()) {
                        j4.s.y(-998052839, 0, sVar9, sVar9, false);
                    } else {
                        sVar9.a0(-998010555);
                        sVar9.q(false);
                    }
                } else {
                    sVar9.U();
                }
                return Unit.f26487a;
            case 25:
                o9.l lVar4 = (o9.l) this.f27882b;
                n nVar10 = (n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                s sVar10 = (s) nVar10;
                if (sVar10.R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    lVar4.f32145b.a(sVar10, 0);
                } else {
                    sVar10.U();
                }
                return Unit.f26487a;
            case 26:
                n1 n1Var = ((BucketListActivity) this.f27882b).f8970g;
                n nVar11 = (n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                int i23 = BucketListActivity.f8968i;
                s sVar11 = (s) nVar11;
                if (sVar11.R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ph.g.a((c0) m3.i.m(((oh.c) n1Var.getValue()).f32555d, lh.a0.f27777a, null, sVar11, 48, 2).getValue(), ((oh.c) n1Var.getValue()).f32556e, (String) ((oh.c) n1Var.getValue()).f32553b.a("TITLE"), sVar11, 0);
                } else {
                    sVar11.U();
                }
                return Unit.f26487a;
            case 27:
                o9.d dVar2 = (o9.d) this.f27882b;
                n nVar12 = (n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                s sVar12 = (s) nVar12;
                if (sVar12.R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    dVar2.getContent().invoke(sVar12, 0);
                } else {
                    sVar12.U();
                }
                return Unit.f26487a;
            case 28:
                ((Integer) obj2).getClass();
                ph.g.b((Throwable) this.f27882b, (n) obj, m3.i.F(1));
                return Unit.f26487a;
            default:
                pi.m mVar3 = (pi.m) this.f27882b;
                androidx.lifecycle.w wVar = (androidx.lifecycle.w) obj2;
                ((LifecycleOwner) obj).getClass();
                wVar.getClass();
                if (pi.e.$EnumSwitchMapping$0[wVar.ordinal()] == 1) {
                    mVar3.getClass();
                    v80.f0.B(m1.d(mVar3), null, null, new pi.i(mVar3, null), 3);
                }
                return Unit.f26487a;
        }
    }

    public /* synthetic */ a(Object obj, int i11, int i12) {
        this.f27881a = i12;
        this.f27882b = obj;
    }
}
