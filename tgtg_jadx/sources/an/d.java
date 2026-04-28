package an;

import a3.n2;
import a3.u1;
import a3.u2;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.LifecycleOwner;
import at.h0;
import b2.l;
import b4.q;
import b4.t;
import bm.p;
import bn.r;
import c5.v0;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.badge.Badge;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.BasketIntroBannerMnu;
import com.app.tgtg.model.remote.item.response.CategoryCard;
import com.app.tgtg.model.remote.item.response.CharityItem;
import com.app.tgtg.model.remote.item.response.HeroComponentResponse;
import com.app.tgtg.model.remote.item.response.IntroBanner;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails;
import d2.i1;
import d2.m2;
import d2.w;
import d2.w0;
import d2.z;
import d40.t1;
import g3.a9;
import g3.b6;
import g3.k;
import g3.n1;
import g3.s0;
import g3.s5;
import g3.t5;
import g3.w6;
import g3.y2;
import g3.z8;
import h2.n0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l3.f0;
import m3.g1;
import m3.m;
import m3.n;
import m3.s;
import o30.e0;
import org.bouncycastle.iana.AEADAlgorithm;
import t1.b1;
import t1.y0;
import v1.y1;
import v80.b0;
import w4.v;
import ym.y;
import z4.a1;
import z4.c0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1627d;

    public /* synthetic */ d(Function0 function0, String str, String str2) {
        this.f1624a = 25;
        this.f1627d = function0;
        this.f1625b = str;
        this.f1626c = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f1624a;
        int i12 = 16;
        int i13 = 7;
        q qVar = q.f5711a;
        m3.f fVar = m.f29332a;
        int i14 = 3;
        int i15 = 1;
        Object obj3 = this.f1626c;
        Object obj4 = this.f1625b;
        Object obj5 = this.f1627d;
        switch (i11) {
            case 0:
                BasketIntroBannerMnu basketIntroBannerMnu = (BasketIntroBannerMnu) obj5;
                a50.c cVar = (a50.c) obj4;
                y yVar = (y) obj3;
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zH = sVar.h(cVar) | sVar.h(yVar);
                    Object objM = sVar.M();
                    if (zH || objM == fVar) {
                        objM = new n2(5, cVar, yVar);
                        sVar.k0(objM);
                    }
                    h0.g.e(basketIntroBannerMnu, (Function0) objM, sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                IntroBanner introBanner = (IntroBanner) obj5;
                a50.c cVar2 = (a50.c) obj4;
                y yVar2 = (y) obj3;
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zH2 = sVar2.h(cVar2) | sVar2.f(introBanner) | sVar2.h(yVar2);
                    Object objM2 = sVar2.M();
                    if (zH2 || objM2 == fVar) {
                        objM2 = new a0.g(cVar2, introBanner, yVar2, i15);
                        sVar2.k0(objM2);
                    }
                    nx.d.b(introBanner, (Function0) objM2, sVar2, 0);
                } else {
                    sVar2.U();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                bm.a.e((t) obj5, (p) obj4, (Function1) obj3, (n) obj, m3.i.F(7));
                break;
            case 3:
                ((Integer) obj2).getClass();
                m0.c.I((BaseItemMnuV2) obj5, (String) obj4, (String) obj3, (n) obj, m3.i.F(1));
                break;
            case 4:
                l lVar = (l) obj5;
                y yVar3 = (y) obj3;
                CategoryCard categoryCard = (CategoryCard) obj4;
                n nVar3 = (n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                s sVar3 = (s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    float f11 = 12;
                    t tVarB = f4.g.b(v1.n.j(qVar, lv.s.I, l2.g.b(f11)), l2.g.b(f11));
                    t5 t5VarA = s5.a(0.0f, 6, 0L, false);
                    boolean zH3 = sVar3.h(yVar3) | sVar3.h(categoryCard);
                    Object objM3 = sVar3.M();
                    if (zH3 || objM3 == fVar) {
                        objM3 = new r(yVar3, categoryCard, i15);
                        sVar3.k0(objM3);
                    }
                    t tVarB2 = androidx.compose.foundation.b.b(tVarB, lVar, t5VarA, false, null, null, (Function0) objM3, 28);
                    d2.y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar3, 0);
                    int iHashCode = Long.hashCode(sVar3.T);
                    u3.i iVarL = sVar3.l();
                    t tVarC = b4.a.c(tVarB2, sVar3);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar3.e0();
                    if (sVar3.S) {
                        sVar3.k(hVar);
                    } else {
                        sVar3.n0();
                    }
                    m3.i.C(yVarA, b5.i.f5843f, sVar3);
                    m3.i.C(iVarL, b5.i.f5842e, sVar3);
                    m3.i.v(sVar3, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar3, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar3);
                    na0.a.I(d2.c.z(new w0(b4.d.f5695n), lv.t.f28251e), categoryCard, sVar3, 0);
                    sVar3.q(true);
                } else {
                    sVar3.U();
                }
                break;
            case 5:
                g1 g1Var = (g1) obj5;
                g1 g1Var2 = (g1) obj4;
                v vVar = (v) obj;
                h4.b bVar = (h4.b) obj2;
                vVar.getClass();
                g1Var.i(Float.intBitsToFloat((int) (bVar.f21378a & 4294967295L)) + g1Var.h());
                g1Var2.i(Float.intBitsToFloat((int) (bVar.f21378a >> 32)) + g1Var2.h());
                ((g1) obj3).i(g1Var2.h());
                vVar.a();
                break;
            case 6:
                ((Integer) obj2).getClass();
                u00.d.g((Order) obj5, (co.q) obj4, (t) obj3, (n) obj, m3.i.F(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                cp.a.o((String) obj5, (g4.v) obj4, (Function1) obj3, (n) obj, m3.i.F(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                dq.j.c((dq.i) obj5, (Function0) obj4, (Function0) obj3, (n) obj, m3.i.F(1));
                break;
            case 9:
                h0 h0Var = (h0) obj5;
                a50.c cVar3 = (a50.c) obj4;
                n1 n1Var = (n1) obj3;
                n nVar4 = (n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                s sVar4 = (s) nVar4;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    t1.q(h0Var, u3.e.e(1182629798, sVar4, new u1(5, cVar3, n1Var)), sVar4, 48);
                } else {
                    sVar4.U();
                }
                break;
            case 10:
                ((Integer) obj2).getClass();
                fi.e.a((w6) obj5, (Function0) obj4, (Function0) obj3, (n) obj, m3.i.F(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                fi.e.d((fi.i) obj5, (Function1) obj4, (Function0) obj3, (n) obj, m3.i.F(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                k.b((u3.d) obj5, (t) obj4, (u3.d) obj3, (n) obj, m3.i.F(391));
                break;
            case 13:
                t tVar = (t) obj5;
                y1 y1Var = (y1) obj4;
                u3.d dVar = (u3.d) obj3;
                n nVar5 = (n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                s sVar5 = (s) nVar5;
                if (sVar5.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    t tVarR = v1.n.r(d2.c.J(d2.c.B(tVar, 0.0f, y2.f19817e, 1), i1.Max), y1Var, true);
                    d2.y yVarA2 = w.a(d2.i.f13803c, b4.d.f5694m, sVar5, 0);
                    int iHashCode2 = Long.hashCode(sVar5.T);
                    u3.i iVarL2 = sVar5.l();
                    t tVarC2 = b4.a.c(tVarR, sVar5);
                    b5.j.R.getClass();
                    b5.h hVar2 = b5.i.f5839b;
                    sVar5.e0();
                    if (sVar5.S) {
                        sVar5.k(hVar2);
                    } else {
                        sVar5.n0();
                    }
                    m3.i.C(yVarA2, b5.i.f5843f, sVar5);
                    m3.i.C(iVarL2, b5.i.f5842e, sVar5);
                    b5.g gVar = b5.i.f5844g;
                    if (sVar5.S || !Intrinsics.areEqual(sVar5.M(), Integer.valueOf(iHashCode2))) {
                        e0.f.y(iHashCode2, sVar5, iHashCode2, gVar);
                    }
                    m3.i.C(tVarC2, b5.i.f5841d, sVar5);
                    dVar.invoke(z.f13980a, sVar5, 6);
                    sVar5.q(true);
                } else {
                    sVar5.U();
                }
                break;
            case 14:
                Function2 function2 = (Function2) obj5;
                Function2 function22 = (Function2) obj4;
                b1 b1Var = (b1) obj3;
                n nVar6 = (n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                s sVar6 = (s) nVar6;
                if (sVar6.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    Object objM4 = sVar6.M();
                    if (objM4 == fVar) {
                        objM4 = m3.i.o(kotlin.coroutines.g.f26549a, sVar6);
                        sVar6.k0(objM4);
                    }
                    b0 b0Var = (b0) objM4;
                    Object objM5 = sVar6.M();
                    if (objM5 == fVar) {
                        objM5 = new b6(b0Var, b1Var);
                        sVar6.k0(objM5);
                    }
                    b6 b6Var = (b6) objM5;
                    t tVarQ = d2.c.q(qVar, i1.Min);
                    u3.d dVarG = c0.g(d0.h(function2, function22));
                    Object objM6 = sVar6.M();
                    if (objM6 == fVar) {
                        objM6 = new z4.b1(b6Var);
                        sVar6.k0(objM6);
                    }
                    u0 u0Var = (u0) objM6;
                    int iHashCode3 = Long.hashCode(sVar6.T);
                    u3.i iVarL3 = sVar6.l();
                    t tVarC3 = b4.a.c(tVarQ, sVar6);
                    b5.j.R.getClass();
                    b5.h hVar3 = b5.i.f5839b;
                    sVar6.e0();
                    if (sVar6.S) {
                        sVar6.k(hVar3);
                    } else {
                        sVar6.n0();
                    }
                    m3.i.C(u0Var, b5.i.f5843f, sVar6);
                    m3.i.C(iVarL3, b5.i.f5842e, sVar6);
                    b5.g gVar2 = b5.i.f5844g;
                    if (sVar6.S || !Intrinsics.areEqual(sVar6.M(), Integer.valueOf(iHashCode3))) {
                        e0.f.y(iHashCode3, sVar6, iHashCode3, gVar2);
                    }
                    m3.i.C(tVarC3, b5.i.f5841d, sVar6);
                    r8.k.w(0, dVarG, sVar6, true);
                } else {
                    sVar6.U();
                }
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                Function2 function23 = (Function2) obj5;
                Function2 function24 = (Function2) obj4;
                i80.n nVar7 = (i80.n) obj3;
                n nVar8 = (n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                s sVar7 = (s) nVar8;
                if (sVar7.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    b1 b1VarD = s0.D(f0.DefaultSpatial, sVar7);
                    Object objM7 = sVar7.M();
                    if (objM7 == fVar) {
                        objM7 = new a9(b1VarD);
                        sVar7.k0(objM7);
                    }
                    a9 a9Var = (a9) objM7;
                    t tVarD = m2.d(qVar, 1.0f);
                    List listH = d0.h(function23, function24, u3.e.e(-1333331860, sVar7, new u2(28, (Object) nVar7, (Object) a9Var)));
                    Object objM8 = sVar7.M();
                    if (objM8 == fVar) {
                        objM8 = new z8(a9Var);
                        sVar7.k0(objM8);
                    }
                    a1 a1Var = (a1) objM8;
                    u3.d dVarG2 = c0.g(listH);
                    Object objM9 = sVar7.M();
                    if (objM9 == fVar) {
                        objM9 = new z4.b1(a1Var);
                        sVar7.k0(objM9);
                    }
                    u0 u0Var2 = (u0) objM9;
                    int iHashCode4 = Long.hashCode(sVar7.T);
                    u3.i iVarL4 = sVar7.l();
                    t tVarC4 = b4.a.c(tVarD, sVar7);
                    b5.j.R.getClass();
                    b5.h hVar4 = b5.i.f5839b;
                    sVar7.e0();
                    if (sVar7.S) {
                        sVar7.k(hVar4);
                    } else {
                        sVar7.n0();
                    }
                    m3.i.C(u0Var2, b5.i.f5843f, sVar7);
                    m3.i.C(iVarL4, b5.i.f5842e, sVar7);
                    b5.g gVar3 = b5.i.f5844g;
                    if (sVar7.S || !Intrinsics.areEqual(sVar7.M(), Integer.valueOf(iHashCode4))) {
                        e0.f.y(iHashCode4, sVar7, iHashCode4, gVar3);
                    }
                    m3.i.C(tVarC4, b5.i.f5841d, sVar7);
                    r8.k.w(0, dVarG2, sVar7, true);
                } else {
                    sVar7.U();
                }
                break;
            case 16:
                ((Integer) obj2).getClass();
                gn.a.g((HeroComponentResponse) obj5, (Function1) obj4, (Function1) obj3, (n) obj, m3.i.F(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                android.support.v4.media.session.a.b((t) obj5, (hi.e) obj4, (Function0) obj3, (n) obj, m3.i.F(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                i3.r.c((LifecycleOwner) obj5, (Function1) obj4, (Function0) obj3, (n) obj, m3.i.F(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                z20.b.f((g9.l) obj5, (y3.b) obj4, (u3.d) obj3, (n) obj, m3.i.F(385));
                break;
            case 20:
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                v80.f0.B((b0) obj5, null, null, new f3.g(fFloatValue, (y0) obj4, (g9.l) obj3, null), 3);
                break;
            case 21:
                ((Integer) obj2).getClass();
                ii.l.a((t) obj5, (CharityItem) obj4, (Function1) obj3, (n) obj, m3.i.F(1));
                break;
            case 22:
                ii.h hVar5 = (ii.h) obj5;
                ii.h hVar6 = (ii.h) obj4;
                Integer num = (Integer) obj3;
                n nVar9 = (n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                s sVar8 = (s) nVar9;
                if (sVar8.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    k.b(u3.e.e(-1728872883, sVar8, new u1(11, hVar6, num)), null, u3.e.e(1814427471, sVar8, new cg.t(!Intrinsics.areEqual(hVar5, hVar6) ? hVar6.f23900b : hVar6.f23899a, i14)), sVar8, 390);
                } else {
                    sVar8.U();
                }
                break;
            case 23:
                ((Integer) obj2).getClass();
                w.b.d((DiscoverBucket) obj5, (Function0) obj4, (t) obj3, (n) obj, m3.i.F(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                z20.b.j((String) obj5, (Function0) obj4, (t) obj3, (n) obj, m3.i.F(1));
                break;
            case 25:
                Function0 function0 = (Function0) obj5;
                String str = (String) obj4;
                String str2 = (String) obj3;
                n nVar10 = (n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                s sVar9 = (s) nVar10;
                if (sVar9.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ViewParent parent = ((View) sVar9.j(v0.f7394f)).getParent();
                    parent.getClass();
                    ((d6.b0) parent).getWindow().setGravity(48);
                    s0.b(d2.c.A(m2.t(m2.d(qVar, 1.0f), 3), e0.s(sVar9, R.dimen.spacing_3), e0.s(sVar9, R.dimen.toolbar_height) + e0.s(sVar9, R.dimen.spacing_3)), l2.g.b(16), s0.p(lv.s.J, sVar9, 6), null, null, u3.e.e(6149000, sVar9, new ap.e(function0, str, str2, i13)), sVar9, 196608, 24);
                } else {
                    sVar9.U();
                }
                break;
            case 26:
                ((Integer) obj2).getClass();
                jh.f.g((t) obj5, (Badge) obj4, (Function1) obj3, (n) obj, m3.i.F(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                ji.i.h((t) obj5, (ArrayList) obj4, (String) obj3, (n) obj, m3.i.F(7));
                break;
            case 28:
                ((Integer) obj2).getClass();
                a.a.h((LoyaltyCardDetails) obj5, (Function1) obj4, (Function0) obj3, (n) obj, m3.i.F(1));
                break;
            default:
                Function0 function02 = (Function0) obj5;
                ih.i iVar = (ih.i) obj4;
                m3.b1 b1Var2 = (m3.b1) obj3;
                n nVar11 = (n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                s sVar10 = (s) nVar11;
                if (sVar10.R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    boolean zF = sVar10.f(function02) | sVar10.h(iVar);
                    Object objM10 = sVar10.M();
                    if (zF || objM10 == fVar) {
                        objM10 = new i2.e(i12, function02, iVar);
                        sVar10.k0(objM10);
                    }
                    Function0 function03 = (Function0) objM10;
                    Object objM11 = sVar10.M();
                    if (objM11 == fVar) {
                        objM11 = new n0(b1Var2, 9);
                        sVar10.k0(objM11);
                    }
                    jh.f.h(function03, (Function0) objM11, sVar10, 48);
                } else {
                    sVar10.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i11) {
        this.f1624a = i11;
        this.f1627d = obj;
        this.f1625b = obj2;
        this.f1626c = obj3;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i11, int i12) {
        this.f1624a = i12;
        this.f1627d = obj;
        this.f1625b = obj2;
        this.f1626c = obj3;
    }

    public /* synthetic */ d(l lVar, y yVar, CategoryCard categoryCard) {
        this.f1624a = 4;
        this.f1627d = lVar;
        this.f1626c = yVar;
        this.f1625b = categoryCard;
    }
}
