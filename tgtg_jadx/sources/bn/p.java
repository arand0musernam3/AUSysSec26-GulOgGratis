package bn;

import a3.y0;
import android.app.Activity;
import android.webkit.WebView;
import b0.x1;
import com.app.tgtg.R;
import com.app.tgtg.feature.orderview.manufacture.ManufacturerOrderActivity;
import com.app.tgtg.model.remote.badge.Badge;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.CategoryCard;
import com.app.tgtg.model.remote.item.response.ElementMnuV2;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.mapService.response.FilterCategory;
import com.app.tgtg.model.remote.mapService.response.MapClustersResponse;
import com.app.tgtg.model.remote.order.Order;
import com.tgtg.componentlibrary.component.chip.model.ChipVariant;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.PantrySelectionChipKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.h2;
import d2.m2;
import d2.w0;
import d2.z1;
import d40.t1;
import g3.i2;
import g3.l9;
import g3.r9;
import g3.s0;
import g3.s5;
import g3.t5;
import g3.z4;
import i3.m0;
import i3.q0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m3.b1;
import o00.x0;
import org.bouncycastle.iana.AEADAlgorithm;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6503e;

    public /* synthetic */ p(x60.m mVar, List list, Function1 function1, Set set) {
        this.f6499a = 20;
        this.f6501c = mVar;
        this.f6502d = list;
        this.f6500b = function1;
        this.f6503e = set;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11;
        g9.f0 f0Var;
        Object x1Var;
        int i12 = this.f6499a;
        m3.f fVar = m3.m.f29332a;
        b4.q qVar = b4.q.f5711a;
        Object obj3 = this.f6503e;
        Object obj4 = this.f6500b;
        Object obj5 = this.f6502d;
        Object obj6 = this.f6501c;
        switch (i12) {
            case 0:
                b2.l lVar = (b2.l) obj6;
                x60.l lVar2 = (x60.l) obj5;
                ym.y yVar = (ym.y) obj4;
                CategoryCard categoryCard = (CategoryCard) obj3;
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    t5 t5VarA = s5.a(lVar2.f43994f, 4, 0L, false);
                    boolean zH = sVar.h(yVar) | sVar.h(categoryCard);
                    Object objM = sVar.M();
                    if (zH || objM == fVar) {
                        objM = new r(yVar, categoryCard, 0);
                        sVar.k0(objM);
                    }
                    b4.t tVarB = androidx.compose.foundation.b.b(b4.q.f5711a, lVar, t5VarA, false, null, null, (Function0) objM, 28);
                    d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    b4.t tVarC = b4.a.c(tVarB, sVar);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(yVarA, b5.i.f5843f, sVar);
                    m3.i.C(iVarL, b5.i.f5842e, sVar);
                    m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar);
                    jf.e.b(d2.c.B(new w0(b4.d.f5695n), lv.t.f28250d, 0.0f, 2), categoryCard, sVar, 0);
                    sVar.q(true);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                ym.y yVar2 = (ym.y) obj4;
                BaseItemMnuV2 baseItemMnuV2 = (BaseItemMnuV2) obj6;
                String str = (String) obj5;
                String str2 = (String) obj3;
                m3.n nVar2 = (m3.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    b4.t tVarQ = m2.q(qVar, 300);
                    g3.u uVarP = s0.p(lv.s.J, sVar2, 6);
                    l2.f fVarB = l2.g.b(15);
                    g3.v vVarQ = s0.q(4, 0.0f, 0.0f, 0.0f, 62);
                    boolean zH2 = sVar2.h(yVar2) | sVar2.h(baseItemMnuV2);
                    Object objM2 = sVar2.M();
                    if (zH2 || objM2 == fVar) {
                        i11 = 1;
                        objM2 = new u(yVar2, baseItemMnuV2, i11);
                        sVar2.k0(objM2);
                    } else {
                        i11 = 1;
                    }
                    s0.c((Function0) objM2, tVarQ, false, fVarB, uVarP, vVarQ, u3.e.e(-738812595, sVar2, new ap.e(baseItemMnuV2, str, str2, i11)), sVar2, 100663344, 196);
                } else {
                    sVar2.U();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                t1.c((b4.t) obj6, (cm.d) obj5, (Function0) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                jf.e.d((ElementMnuV2) obj6, (BaseItemMnuV2) obj5, (String) obj3, (ym.y) obj4, (m3.n) obj, m3.i.F(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                lx.u.a((cn.a) obj6, (Function2) obj5, (Function2) obj4, (Function2) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                o30.e0.l((BaseItemMnuV2) obj6, (String) obj5, (String) obj4, (String) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                dq.j.a((b4.t) obj6, (String) obj5, (dq.k) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                t1.p((at.h0) obj6, (a50.c) obj5, (WebView) obj4, (bt.b) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                t1.n((at.g0) obj6, (a50.c) obj5, (WebView) obj4, (bt.b) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                h0.g.i((b4.t) obj6, (ei.a) obj5, (Function0) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                g3.a.a((Function0) obj6, (b4.t) obj5, (d6.a0) obj4, (u3.d) obj3, (m3.n) obj, m3.i.F(3463));
                break;
            case 11:
                ((Integer) obj2).getClass();
                gi.a.g((b4.t) obj6, (gi.c) obj5, (Function2) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 12:
                ItemType itemType = (ItemType) obj6;
                x60.m mVar = (x60.m) obj5;
                x60.j jVar = (x60.j) obj4;
                x60.h hVar2 = (x60.h) obj3;
                m3.n nVar3 = (m3.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                m3.s sVar3 = (m3.s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    i2.a(x0.z(itemType.getIconRes(), sVar3, 0), null, m2.m(qVar, ((x60.l) sVar3.j(PantryThemeKt.getLocalPantrySize())).f43999k), 0L, sVar3, 56, 8);
                    d2.c.f(m2.q(qVar, mVar.f44016m), sVar3);
                    r9.d(o30.f0.T(R.string.voucher_applicable_item_type_only, new Object[]{o30.f0.U(sVar3, itemType.getResId())}, sVar3), null, hVar2.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43968r, sVar3, 0, 0, 131066);
                } else {
                    sVar3.U();
                }
                break;
            case 13:
                ((Integer) obj2).getClass();
                hj.e.a((MapClustersResponse) obj6, (gj.c0) obj5, (jj.c) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 14:
                b1 b1Var = (b1) obj6;
                l9 l9Var = (l9) obj5;
                z1 z1Var = (z1) obj4;
                Function2 function2 = (Function2) obj3;
                m3.n nVar4 = (m3.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                m3.s sVar4 = (m3.s) nVar4;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    b4.t tVarM = z4.c0.m(qVar, "Container");
                    m0 m0Var = new m0(b1Var, b1.class, "value", "getValue()Ljava/lang/Object;", 0);
                    b4.e eVarD = q0.d(l9Var);
                    float f11 = z4.f19883a;
                    b4.t tVarF = f4.g.f(tVarM, new y0(m0Var, z1Var, eVarD, 13));
                    u0 u0VarD = d2.p.d(b4.d.f5683a, true);
                    int iHashCode2 = Long.hashCode(sVar4.T);
                    u3.i iVarL2 = sVar4.l();
                    b4.t tVarC2 = b4.a.c(tVarF, sVar4);
                    b5.j.R.getClass();
                    b5.h hVar3 = b5.i.f5839b;
                    sVar4.e0();
                    if (sVar4.S) {
                        sVar4.k(hVar3);
                    } else {
                        sVar4.n0();
                    }
                    m3.i.C(u0VarD, b5.i.f5843f, sVar4);
                    m3.i.C(iVarL2, b5.i.f5842e, sVar4);
                    b5.g gVar = b5.i.f5844g;
                    if (sVar4.S || !Intrinsics.areEqual(sVar4.M(), Integer.valueOf(iHashCode2))) {
                        e0.f.y(iHashCode2, sVar4, iHashCode2, gVar);
                    }
                    m3.i.C(tVarC2, b5.i.f5841d, sVar4);
                    w.a0.w(0, function2, sVar4, true);
                } else {
                    sVar4.U();
                }
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((Integer) obj2).getClass();
                ii.l.m((List) obj6, (ArrayList) obj5, (ArrayList) obj4, (ArrayList) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                wd.a.g((DiscoverBucket) obj6, (String) obj5, (Function0) obj4, (Function1) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 17:
                g9.f0 f0Var2 = (g9.f0) obj6;
                ir.h hVar4 = (ir.h) obj5;
                Activity activity = (Activity) obj4;
                cj.e0 e0Var = (cj.e0) obj3;
                m3.n nVar5 = (m3.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                m3.s sVar5 = (m3.s) nVar5;
                if (sVar5.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    qr.a aVar = qr.a.INSTANCE;
                    b4.t tVarJ = v1.n.j(m2.f13850c, lv.s.J, i4.g0.f23254b);
                    boolean zH3 = sVar5.h(hVar4) | sVar5.h(activity) | sVar5.h(e0Var) | sVar5.h(f0Var2);
                    Object objM3 = sVar5.M();
                    if (zH3 || objM3 == fVar) {
                        f0Var = f0Var2;
                        x1Var = new x1(9, hVar4, activity, e0Var, f0Var);
                        sVar5.k0(x1Var);
                    } else {
                        f0Var = f0Var2;
                        x1Var = objM3;
                    }
                    b0.z.g(f0Var, aVar, tVarJ, null, null, nv.b.f31400a, nv.b.f31401b, nv.b.f31402c, nv.b.f31403d, (Function1) x1Var, sVar5, 920125872, 1080);
                } else {
                    sVar5.U();
                }
                break;
            case 18:
                ((Integer) obj2).getClass();
                jh.f.c((b4.t) obj6, (String) obj5, (String) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(3073));
                break;
            case 19:
                ((Integer) obj2).getClass();
                jh.f.e((b4.t) obj6, (Badge) obj5, (ih.i) obj4, (Function1) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 20:
                x60.m mVar2 = (x60.m) obj6;
                List list = (List) obj5;
                Function1 function1 = (Function1) obj4;
                Set set = (Set) obj3;
                m3.n nVar6 = (m3.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                m3.s sVar6 = (m3.s) nVar6;
                if (sVar6.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    b4.t tVarD = m2.d(qVar, 1.0f);
                    b4.i iVar = b4.d.f5694m;
                    d2.b bVar = d2.i.f13801a;
                    int i13 = 48;
                    d2.y yVarA2 = d2.w.a(d2.i.g(mVar2.f44016m), iVar, sVar6, 48);
                    int iHashCode3 = Long.hashCode(sVar6.T);
                    u3.i iVarL3 = sVar6.l();
                    b4.t tVarC3 = b4.a.c(tVarD, sVar6);
                    b5.j.R.getClass();
                    b5.h hVar5 = b5.i.f5839b;
                    sVar6.e0();
                    if (sVar6.S) {
                        sVar6.k(hVar5);
                    } else {
                        sVar6.n0();
                    }
                    m3.i.C(yVarA2, b5.i.f5843f, sVar6);
                    m3.i.C(iVarL3, b5.i.f5842e, sVar6);
                    m3.i.v(sVar6, Integer.valueOf(iHashCode3), b5.i.f5844g);
                    m3.i.z(sVar6, b5.i.f5845h);
                    m3.i.C(tVarC3, b5.i.f5841d, sVar6);
                    sVar6.a0(-1451090491);
                    for (List<FilterCategory> list2 : CollectionsKt.H(list, 2)) {
                        d2.b bVar2 = d2.i.f13801a;
                        d2.i2 i2VarA = h2.a(d2.i.g(mVar2.f44006b), b4.d.f5693k, sVar6, i13);
                        int iHashCode4 = Long.hashCode(sVar6.T);
                        u3.i iVarL4 = sVar6.l();
                        b4.t tVarC4 = b4.a.c(qVar, sVar6);
                        b5.j.R.getClass();
                        b5.h hVar6 = b5.i.f5839b;
                        sVar6.e0();
                        if (sVar6.S) {
                            sVar6.k(hVar6);
                        } else {
                            sVar6.n0();
                        }
                        m3.i.C(i2VarA, b5.i.f5843f, sVar6);
                        m3.i.C(iVarL4, b5.i.f5842e, sVar6);
                        m3.i.v(sVar6, Integer.valueOf(iHashCode4), b5.i.f5844g);
                        m3.i.z(sVar6, b5.i.f5845h);
                        m3.i.C(tVarC4, b5.i.f5841d, sVar6);
                        sVar6.a0(-399647596);
                        for (FilterCategory filterCategory : list2) {
                            int i14 = i13;
                            String name = filterCategory.getName();
                            boolean zF = sVar6.f(function1) | sVar6.f(filterCategory);
                            Object objM4 = sVar6.M();
                            if (zF || objM4 == fVar) {
                                objM4 = new i2.e(9, function1, filterCategory);
                                sVar6.k0(objM4);
                            }
                            PantrySelectionChipKt.PantrySelectionChip(name, (Function0) objM4, null, filterCategory.getName(), ChipVariant.Avatar, set.contains(filterCategory.getId()), false, false, u3.e.e(137064153, sVar6, new g3.y0(filterCategory, 21)), null, sVar6, 100687872, 708);
                            i13 = i14;
                        }
                        sVar6.q(false);
                        sVar6.q(true);
                    }
                    sVar6.q(false);
                    sVar6.q(true);
                } else {
                    sVar6.U();
                }
                break;
            case 21:
                ((Integer) obj2).getClass();
                zz.f.h((List) obj6, (String) obj5, (Function1) obj4, (b4.t) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                kg.a.b((List) obj6, (Function0) obj5, (Function2) obj4, (Function2) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                ki.j.f((b4.t) obj6, (List) obj5, (ArrayList) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(7));
                break;
            case 24:
                ((Integer) obj2).getClass();
                z20.b.e((String) obj6, (String) obj5, (String) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 25:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                str3.getClass();
                str4.getClass();
                ((Function1) obj6).invoke(new mi.b(((Boolean) ((b1) obj5).getValue()).booleanValue(), ((Boolean) ((b1) obj4).getValue()).booleanValue(), str3, str4, ((Boolean) ((b1) obj3).getValue()).booleanValue()));
                break;
            case 26:
                ((Integer) obj2).getClass();
                int i15 = ManufacturerOrderActivity.f9167q;
                ((ManufacturerOrderActivity) obj6).a0((Order) obj5, (Function0) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                lp.d.g((b4.t) obj6, (List) obj5, (ep.d0) obj4, (g9.p) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                lp.d.r((g9.f0) obj6, (ep.d0) obj5, (Function1) obj4, (Function1) obj3, (m3.n) obj, m3.i.F(3073));
                break;
            default:
                ((Integer) obj2).getClass();
                lp.d.t((ep.d0) obj6, (Function1) obj5, (Function0) obj4, (Function1) obj3, (m3.n) obj, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ p(ElementMnuV2 elementMnuV2, BaseItemMnuV2 baseItemMnuV2, String str, ym.y yVar, int i11) {
        this.f6499a = 3;
        this.f6501c = elementMnuV2;
        this.f6502d = baseItemMnuV2;
        this.f6503e = str;
        this.f6500b = yVar;
    }

    public /* synthetic */ p(Object obj, Object obj2, int i11, Object obj3, Object obj4, int i12) {
        this.f6499a = i12;
        this.f6501c = obj;
        this.f6502d = obj2;
        this.f6500b = obj3;
        this.f6503e = obj4;
    }

    public /* synthetic */ p(int i11, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f6499a = i11;
        this.f6501c = obj;
        this.f6502d = obj2;
        this.f6500b = obj3;
        this.f6503e = obj4;
    }

    public /* synthetic */ p(ym.y yVar, BaseItemMnuV2 baseItemMnuV2, String str, String str2) {
        this.f6499a = 1;
        this.f6500b = yVar;
        this.f6501c = baseItemMnuV2;
        this.f6502d = str;
        this.f6503e = str2;
    }
}
