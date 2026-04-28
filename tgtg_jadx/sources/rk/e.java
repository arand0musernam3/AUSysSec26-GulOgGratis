package rk;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.m0;
import b0.x1;
import c5.a1;
import c5.v0;
import cg.k0;
import com.app.tgtg.R;
import com.app.tgtg.model.local.DietPreferenceModel;
import com.app.tgtg.model.remote.item.AverageItemRating;
import com.app.tgtg.model.remote.item.BasicItemInformation;
import com.app.tgtg.model.remote.item.ItemSpecialReward;
import com.app.tgtg.model.remote.item.ItemTagInfo;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.item.SpecialRewardVariant;
import com.app.tgtg.model.remote.item.response.AllergensInfo;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.DiscountedItemPrice;
import com.app.tgtg.model.remote.item.response.FlashSalesItem;
import com.app.tgtg.model.remote.item.response.Item;
import com.app.tgtg.model.remote.item.response.ItemState;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.payment.Price;
import com.google.android.gms.internal.measurement.cg;
import com.tgtg.componentlibrary.component.iconbutton.variant.SubtlePantryIconButtonKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.b2;
import d2.h2;
import d2.i2;
import d2.k2;
import d2.m2;
import d2.n1;
import d40.t1;
import f0.f2;
import g3.r9;
import g3.s0;
import g3.v3;
import g3.w6;
import g3.w7;
import g3.x7;
import g3.z7;
import i4.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import m2.c2;
import m3.b1;
import m3.c3;
import m3.d3;
import m3.g1;
import m3.i1;
import m3.w1;
import m5.l0;
import m90.z0;
import mv.j0;
import mv.p0;
import nk.q0;
import o00.x0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import s1.r0;
import s1.y0;
import t1.u1;
import y80.m1;
import z4.c1;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f38059a = new u3.d(new qm.a(15), false, -285389251);

    public static final void A(q0 q0Var, m1.a aVar, d dVar, m3.n nVar, int i11) {
        b4.q qVar;
        b4.t tVarK;
        m3.f fVar;
        q0 q0Var2 = q0Var;
        m1.a aVar2 = aVar;
        q0Var2.getClass();
        aVar2.getClass();
        dVar.getClass();
        float f11 = dVar.f38056a;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1485306608);
        int i12 = i11 | (sVar.h(q0Var2) ? 4 : 2) | (sVar.f(aVar2) ? 32 : 16) | (sVar.f(dVar) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            boolean z11 = f11 > 0.8f;
            boolean z12 = f11 > 0.9f;
            BasicItem basicItem = q0Var2.f31035a;
            boolean zF = sVar.f(basicItem.getItemTags());
            Object objM = sVar.M();
            m3.f fVar2 = m3.m.f29332a;
            if (zF || objM == fVar2) {
                List<ItemTagInfo> itemTags = basicItem.getItemTags();
                objM = null;
                if (itemTags != null) {
                    Iterator<T> it = itemTags.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((ItemTagInfo) next).getLongText() != null) {
                            objM = next;
                            break;
                        }
                    }
                    objM = (ItemTagInfo) objM;
                }
                sVar.k0(objM);
            }
            ItemTagInfo itemTagInfo = (ItemTagInfo) objM;
            b4.q qVar2 = b4.q.f5711a;
            b4.t tVarD = m2.d(qVar2, 1.0f);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarD, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar2 = b5.i.f5845h;
            m3.i.z(sVar, dVar2);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            boolean z13 = z11;
            b4.t tVarD2 = m2.d(qVar2, 1.0f);
            if (z13 && itemTagInfo == null) {
                tVarK = f4.g.k(qVar2, 4, null, false, 0L, lv.s.G, 14);
                qVar = qVar2;
            } else {
                qVar = qVar2;
                tVarK = qVar;
            }
            b4.t tVarE = d2.c.E(v1.n.j(tVarD2.then(tVarK), i4.v.b(f11, lv.s.J), g0.f23254b));
            float f12 = lv.t.f28253g;
            float f13 = lv.t.f28251e;
            b4.t tVarA = d2.c.A(tVarE, f12, f13);
            b4.k kVar = b4.d.f5683a;
            u0 u0VarD = d2.p.d(kVar, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarA, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC2, gVar4, sVar);
            b4.t tVarD3 = m2.d(qVar, 1.0f);
            i2 i2VarA = h2.a(d2.i.f13807g, b4.d.f5693k, sVar, 54);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            b4.t tVarC3 = b4.a.c(tVarD3, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            w.a0.y(iHashCode3, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC3, gVar4, sVar);
            float f14 = 40;
            b4.t tVarM = m2.m(qVar, f14);
            long j9 = lv.s.S;
            l2.f fVar3 = l2.g.f26790a;
            b4.t tVarJ = v1.n.j(tVarM, j9, fVar3);
            j5.j jVar = new j5.j(0);
            int i13 = i12 & 112;
            boolean z14 = i13 == 32;
            Object objM2 = sVar.M();
            int i14 = 3;
            if (z14 || objM2 == fVar2) {
                fVar = fVar2;
                objM2 = new a(aVar, i14);
                sVar.k0(objM2);
            } else {
                fVar = fVar2;
            }
            b4.t tVarC4 = androidx.compose.foundation.b.c(tVarJ, false, null, jVar, (Function0) objM2, 11);
            u0 u0VarD2 = d2.p.d(kVar, false);
            int iHashCode4 = Long.hashCode(sVar.T);
            u3.i iVarL4 = sVar.l();
            b4.t tVarC5 = b4.a.c(tVarC4, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD2, gVar, sVar);
            m3.i.C(iVarL4, gVar2, sVar);
            w.a0.y(iHashCode4, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC5, gVar4, sVar);
            b4.q qVar3 = qVar;
            m3.f fVar4 = fVar;
            v1.n.d(x0.z(R.drawable.ic_arrow_back, sVar, 0), f0.U(sVar, R.string.voice_over_back), d2.c.z(qVar, f13), null, null, 0.0f, new i4.o(lv.s.D, 5), sVar, 1573256, 56);
            sVar.q(true);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            b4.t tVarA2 = f4.g.a(d2.c.B(new n1(1.0f, true), f13, 0.0f, 2), dVar.f38058c);
            String storeNameAndBranch = mv.d.m(basicItem).getStoreNameAndBranch();
            if (storeNameAndBranch == null) {
                storeNameAndBranch = "";
            }
            r9.d(storeNameAndBranch, tVarA2, lv.s.C, 0L, null, 0L, null, new x5.k(3), 0L, 2, false, 1, 0, null, lv.v.f28272k, sVar, MLKEMEngine.KyberPolyBytes, 12607872, 109560);
            sVar = sVar;
            i2 i2VarA2 = h2.a(d2.i.g(f13), b4.d.f5692j, sVar, 6);
            int iHashCode5 = Long.hashCode(sVar.T);
            u3.i iVarL5 = sVar.l();
            b4.t tVarC6 = b4.a.c(qVar3, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA2, gVar, sVar);
            m3.i.C(iVarL5, gVar2, sVar);
            w.a0.y(iHashCode5, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC6, gVar4, sVar);
            b4.t tVarJ2 = v1.n.j(m2.m(qVar3, f14), j9, fVar3);
            boolean zH = (i13 == 32) | sVar.h(q0Var);
            Object objM3 = sVar.M();
            if (zH || objM3 == fVar4) {
                objM3 = new f(aVar, q0Var, 5);
                sVar.k0(objM3);
            }
            b4.t tVarC7 = androidx.compose.foundation.b.c(tVarJ2, false, null, null, (Function0) objM3, 15);
            u0 u0VarD3 = d2.p.d(kVar, false);
            int iHashCode6 = Long.hashCode(sVar.T);
            u3.i iVarL6 = sVar.l();
            b4.t tVarC8 = b4.a.c(tVarC7, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD3, gVar, sVar);
            m3.i.C(iVarL6, gVar2, sVar);
            w.a0.y(iHashCode6, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC8, gVar4, sVar);
            v1.n.d(x0.z(R.drawable.system_icon_share, sVar, 0), f0.U(sVar, R.string.screen_reader_item_view_share), d2.c.z(qVar3, f13), null, null, 0.0f, null, sVar, 392, 120);
            sVar.q(true);
            b4.t tVarJ3 = v1.n.j(m2.m(qVar3, f14), j9, fVar3);
            u0 u0VarD4 = d2.p.d(kVar, false);
            int iHashCode7 = Long.hashCode(sVar.T);
            u3.i iVarL7 = sVar.l();
            b4.t tVarC9 = b4.a.c(tVarJ3, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD4, gVar, sVar);
            m3.i.C(iVarL7, gVar2, sVar);
            w.a0.y(iHashCode7, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC9, gVar4, sVar);
            q0Var2 = q0Var;
            aVar2 = aVar;
            j(q0Var2, aVar2, sVar, i12 & 126);
            sVar.q(true);
            sVar.q(true);
            sVar.q(true);
            sVar.q(true);
            if (itemTagInfo == null) {
                sVar.a0(865896544);
                sVar.q(false);
            } else {
                sVar.a0(865896545);
                s1.y.b(d2.z.f13980a, z12, null, null, null, null, u3.e.e(-1007664146, sVar, new a3.m2(itemTagInfo, 25)), sVar, 1572870, 30);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ki.h(q0Var2, aVar2, dVar, i11, 28);
        }
    }

    public static final void B(q0 q0Var, m3.n nVar, int i11) {
        q0Var.getClass();
        BasicItem basicItem = q0Var.f31035a;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(575983786);
        int i12 = (sVar.h(q0Var) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            C(basicItem.getInformation().getAverageItemRating(), mv.d.p(basicItem), false, sVar, 0, 4);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new qk.h(q0Var, i11, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void C(final com.app.tgtg.model.remote.item.AverageItemRating r34, boolean r35, boolean r36, m3.n r37, final int r38, final int r39) {
        /*
            Method dump skipped, instruction units count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk.e.C(com.app.tgtg.model.remote.item.AverageItemRating, boolean, boolean, m3.n, int, int):void");
    }

    public static final void D(q0 q0Var, m1.a aVar, m3.n nVar, int i11) {
        w1 w1VarS;
        qk.e eVar;
        q0Var.getClass();
        List<BasicItem> list = q0Var.f31036b;
        aVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(493422014);
        int i12 = (sVar.h(q0Var) ? 4 : 2) | i11 | (sVar.f(aVar) ? 32 : 16);
        if (!sVar.R(i12 & 1, (i12 & 19) != 18)) {
            sVar.U();
        } else {
            if (list.isEmpty()) {
                w1VarS = sVar.s();
                if (w1VarS != null) {
                    eVar = new qk.e(q0Var, aVar, i11, 19);
                    w1VarS.f29476d = eVar;
                }
                return;
            }
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC = b4.a.c(qVar, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            r9.d(f0.U(sVar, R.string.item_view_recommendation_title), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28272k, sVar, 0, 12582912, 131070);
            sVar = sVar;
            d2.c.f(m2.m(qVar, lv.t.f28252f), sVar);
            b4.t tVarR = v1.n.r(m2.d(qVar, 1.0f), v1.n.q(sVar), false);
            i2 i2VarA = h2.a(d2.i.g(lv.t.f28251e), b4.d.f5692j, sVar, 6);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarR, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            sVar.a0(1200082534);
            for (BasicItem basicItem : list) {
                boolean zH = sVar.h(basicItem) | ((i12 & 112) == 32);
                Object objM = sVar.M();
                if (zH || objM == m3.m.f29332a) {
                    objM = new c2(28, aVar, basicItem);
                    sVar.k0(objM);
                }
                t1.m(null, basicItem, true, false, false, false, (Function1) objM, null, null, sVar, MLKEMEngine.KyberPolyBytes, 441);
            }
            e0.f.D(sVar, false, true, true);
        }
        w1VarS = sVar.s();
        if (w1VarS != null) {
            eVar = new qk.e(q0Var, aVar, i11, 20);
            w1VarS.f29476d = eVar;
        }
    }

    public static final void E(q0 q0Var, m1.a aVar, m3.n nVar, int i11) {
        q0Var.getClass();
        aVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(194588938);
        int i12 = (sVar.h(q0Var) ? 4 : 2) | i11 | (sVar.f(aVar) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            d2.b bVar = d2.i.f13801a;
            d2.y yVarA = d2.w.a(d2.i.g(lv.t.f28251e), b4.d.f5694m, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(b4.q.f5711a, sVar);
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
            BasicItem basicItem = q0Var.f31035a;
            if (mv.d.q(basicItem)) {
                sVar.a0(-278975486);
                sVar.q(false);
            } else {
                sVar.a0(-279019692);
                e(basicItem, sVar, 0);
                sVar.q(false);
            }
            if (q0Var.f31039e.f30965a) {
                sVar.a0(-278907286);
                n(q0Var, aVar, sVar, i12 & 126);
                sVar.q(false);
            } else if (mv.d.q(basicItem)) {
                sVar.a0(-278625310);
                sVar.q(false);
            } else {
                sVar.a0(-278742552);
                a(q0Var, aVar, sVar, i12 & 126);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new qk.e(q0Var, aVar, i11, 21);
        }
    }

    public static final void F(q0 q0Var, m1.a aVar, b4.t tVar, m3.n nVar, int i11) {
        q0Var.getClass();
        aVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1936715655);
        int i12 = i11 | (sVar.h(q0Var) ? 4 : 2) | (sVar.f(aVar) ? 32 : 16) | (sVar.f(tVar) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            x60.i iVar = (x60.i) sVar.j(PantryThemeKt.getLocalPantryShadow());
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.o(kotlin.coroutines.g.f26549a, sVar);
                sVar.k0(objM);
            }
            v80.b0 b0Var = (v80.b0) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM2);
            }
            b1 b1Var = (b1) objM2;
            Unit unit = Unit.f26487a;
            boolean zH = sVar.h(b0Var);
            Object objM3 = sVar.M();
            x70.c cVar = null;
            if (zH || objM3 == fVar) {
                objM3 = new rf.c(b0Var, b1Var, cVar, 2);
                sVar.k0(objM3);
            }
            m3.i.h(unit, (Function2) objM3, sVar);
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            s1.x0 x0VarD = r0.d(null, 3);
            Object objM4 = sVar.M();
            if (objM4 == fVar) {
                objM4 = new qb.r(29);
                sVar.k0(objM4);
            }
            s1.x0 x0VarA = x0VarD.a(r0.n((Function1) objM4));
            y0 y0VarE = r0.e(null, 3);
            Object objM5 = sVar.M();
            if (objM5 == fVar) {
                objM5 = new z(0);
                sVar.k0(objM5);
            }
            s1.y.d(zBooleanValue, null, x0VarA, y0VarE.a(r0.o(1, (Function1) objM5)), null, u3.e.e(-1560749407, sVar, new cn.x(17, iVar, q0Var, aVar, tVar)), sVar, 200064, 18);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ki.h(q0Var, aVar, tVar, i11, 29);
        }
    }

    public static final void G(q0 q0Var, m1.a aVar, m3.n nVar, int i11) {
        m1.a aVar2;
        SpecialRewardVariant specialRewardVariant;
        q0Var.getClass();
        aVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1060365826);
        int i12 = (sVar.h(q0Var) ? 4 : 2) | i11 | (sVar.f(aVar) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            BasicItem basicItem = q0Var.f31035a;
            if (!(basicItem instanceof Item)) {
                w1 w1VarS = sVar.s();
                if (w1VarS != null) {
                    w1VarS.f29476d = new qk.e(q0Var, aVar, i11, 25);
                    return;
                }
                return;
            }
            ItemSpecialReward itemSpecialReward = ((Item) basicItem).getItemSpecialReward();
            if (itemSpecialReward == null) {
                w1 w1VarS2 = sVar.s();
                if (w1VarS2 != null) {
                    w1VarS2.f29476d = new qk.e(q0Var, aVar, i11, 26);
                    return;
                }
                return;
            }
            String variant = itemSpecialReward.getVariant();
            SpecialRewardVariant[] specialRewardVariantArrValues = SpecialRewardVariant.values();
            int length = specialRewardVariantArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    specialRewardVariant = null;
                    break;
                }
                specialRewardVariant = specialRewardVariantArrValues[i13];
                if (Intrinsics.areEqual(specialRewardVariant.name(), variant)) {
                    break;
                } else {
                    i13++;
                }
            }
            if (specialRewardVariant == null) {
                specialRewardVariant = SpecialRewardVariant.AMOUNT_OFF;
            }
            b4.q qVar = b4.q.f5711a;
            b4.t tVarJ = v1.n.j(m2.d(qVar, 1.0f), lv.s.J, g0.f23254b);
            d2.d dVar = d2.i.f13803c;
            b4.i iVar = b4.d.f5694m;
            d2.y yVarA = d2.w.a(dVar, iVar, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarJ, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar2 = b5.i.f5845h;
            m3.i.z(sVar, dVar2);
            SpecialRewardVariant specialRewardVariant2 = specialRewardVariant;
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            b4.t tVarD = m2.d(qVar, 1.0f);
            float f11 = lv.t.f28252f;
            b4.t tVarB = d2.c.B(tVarD, f11, 0.0f, 2);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarB, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC2, gVar4, sVar);
            b4.t tVarM = m2.m(qVar, 54);
            b4.k kVar = b4.d.f5683a;
            u0 u0VarD = d2.p.d(kVar, false);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            b4.t tVarC3 = b4.a.c(tVarM, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            w.a0.y(iHashCode3, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC3, gVar4, sVar);
            b4.t tVarM2 = m2.m(qVar, 48);
            b4.k kVar2 = b4.d.f5687e;
            d2.u uVar = d2.u.f13938a;
            v1.n.d(x0.z(specialRewardVariant2.getDoodleResId(), sVar, 0), null, uVar.a(tVarM2, kVar2), null, null, 0.0f, null, sVar, 56, 120);
            v1.n.d(x0.z(R.drawable.special_reward, sVar, 0), null, uVar.a(m2.m(qVar, 16), kVar), null, null, 0.0f, null, sVar, 56, 120);
            sVar.q(true);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            b4.t tVarB2 = d2.c.B(new n1(1.0f, true), f11, 0.0f, 2);
            d2.y yVarA2 = d2.w.a(dVar, iVar, sVar, 0);
            int iHashCode4 = Long.hashCode(sVar.T);
            u3.i iVarL4 = sVar.l();
            b4.t tVarC4 = b4.a.c(tVarB2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA2, gVar, sVar);
            m3.i.C(iVarL4, gVar2, sVar);
            w.a0.y(iHashCode4, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC4, gVar4, sVar);
            r9.d(itemSpecialReward.getShortText(), null, lv.s.C, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, lv.v.l, sVar, MLKEMEngine.KyberPolyBytes, 12607872, 110586);
            float f12 = lv.t.f28249c;
            d2.c.f(m2.e(qVar, f12), sVar);
            String description = itemSpecialReward.getDescription();
            if (description == null) {
                description = "";
            }
            r9.d(description, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar, 0, 12582912, 131070);
            sVar = sVar;
            String termsUrl = itemSpecialReward.getTermsUrl();
            String str = (termsUrl == null || StringsKt.H(termsUrl)) ? null : termsUrl;
            if (str == null) {
                sVar.a0(-1873204232);
                sVar.q(false);
                aVar2 = aVar;
            } else {
                sVar.a0(-1873204231);
                b4.t tVarA = b4.a.a(d2.c.D(m2.d(qVar, 1.0f), 0.0f, f12, 0.0f, 0.0f, 13), c5.m2.f7291a, new bn.c0(11, aVar, str));
                String terms = itemSpecialReward.getTerms();
                aVar2 = aVar;
                r9.d(terms == null ? "" : terms, tVarA, lv.s.f28217b, 0L, null, 0L, x5.l.f43854c, new x5.k(1), 0L, 0, false, 0, 0, null, lv.v.f28284x, sVar, 805306752, 12582912, 129528);
                sVar = sVar;
                sVar.q(false);
            }
            e0.f.D(sVar, true, true, true);
        } else {
            aVar2 = aVar;
            sVar.U();
        }
        w1 w1VarS3 = sVar.s();
        if (w1VarS3 != null) {
            w1VarS3.f29476d = new qk.e(q0Var, aVar2, i11, 27);
        }
    }

    public static final void H(m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(611904710);
        if (sVar.R(i11 & 1, i11 != 0)) {
            long j9 = lv.s.I;
            l2.f fVarB = l2.g.b(10);
            b4.q qVar = b4.q.f5711a;
            b4.t tVarZ = d2.c.z(v1.n.j(qVar, j9, fVarB), lv.t.f28252f);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarZ, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(u0VarD, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            v1.n.d(x0.z(R.drawable.info_icon, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
            r9.d(r8.k.f(lv.t.f28251e, R.string.item_view_not_enough_reviews_box_msg, qVar, sVar, sVar), null, lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            sVar = sVar;
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new qm.a(i11, 16);
        }
    }

    public static final void I(double d3, m3.n nVar, final int i11) {
        int i12;
        final double d11;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1114058764);
        Object objE = sVar.E();
        if ((objE instanceof Double) && d3 == ((Number) objE).doubleValue()) {
            i12 = 2;
        } else {
            sVar.l0(Double.valueOf(d3));
            i12 = 4;
        }
        int i13 = i11 | i12;
        if (sVar.R(i13 & 1, (i13 & 3) != 2)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = new g1(0.0f);
                sVar.k0(objM);
            }
            g1 g1Var = (g1) objM;
            c3 c3VarB = t1.d.b(g1Var.h(), new u1(500, 700, t1.w.f39596d), "", null, sVar, 3072, 20);
            long j9 = lv.s.H;
            l2.f fVarB = l2.g.b(8);
            b4.q qVar = b4.q.f5711a;
            b4.t tVarK = v1.n.k(qVar, 1, j9, fVarB);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarK, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(u0VarD, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            float f11 = lv.t.f28251e;
            b4.t tVarD = d2.c.D(qVar, 0.0f, f11, 0.0f, f11, 5);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarD, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            d2.c.f(m2.m(qVar, f11), sVar);
            v1.n.d(x0.z(d3 == 0.0d ? R.drawable.rating_star_empty_big : R.drawable.rating_star_filled_big, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
            r9.d(Q(Double.valueOf(((Number) c3VarB.getValue()).floatValue()), sVar), null, d3 == 0.0d ? lv.s.D : lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28270i, sVar, 0, 12582912, 131066);
            sVar = sVar;
            b3.i.y(qVar, lv.t.f28253g, sVar, true);
            Unit unit = Unit.f26487a;
            boolean z11 = (i13 & 14) == 4;
            Object objM2 = sVar.M();
            if (z11 || objM2 == fVar) {
                d11 = d3;
                objM2 = new of.j(d11, g1Var, (x70.c) null);
                sVar.k0(objM2);
            } else {
                d11 = d3;
            }
            m3.i.h(unit, (Function2) objM2, sVar);
            sVar.q(true);
        } else {
            d11 = d3;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(i11, d11) { // from class: rk.x

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ double f38122a;

                {
                    this.f38122a = d11;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(1);
                    e.I(this.f38122a, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void J(String str, Double d3, AverageItemRating averageItemRating, String str2, int i11, m3.n nVar, int i12) {
        int i13;
        Double d11;
        String strQ;
        int i14 = i11;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1065892683);
        if ((i12 & 6) == 0) {
            i13 = (sVar.f(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar.f(d3) ? 32 : 16;
        }
        if ((i12 & MLKEMEngine.KyberPolyBytes) == 0) {
            i13 |= sVar.f(averageItemRating) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= sVar.f(str2) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= sVar.d(i14) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if (sVar.R(i13 & 1, (i13 & 9363) != 9362)) {
            float fDoubleValue = d3 == null ? 0.0f : (((float) d3.doubleValue()) * 2) / 10;
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = new g1(0.0f);
                sVar.k0(objM);
            }
            g1 g1Var = (g1) objM;
            c3 c3VarB = t1.d.b(g1Var.h(), new u1(500, 700, t1.w.f39596d), "", null, sVar, 3072, 20);
            b4.q qVar = b4.q.f5711a;
            b4.t tVarN = v1.n.n(qVar, true, null);
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new qb.r(25);
                sVar.k0(objM2);
            }
            b4.t tVarC = j5.r.c(tVarN, true, (Function1) objM2);
            boolean z11 = (i13 & 7168) == 2048;
            Object objM3 = sVar.M();
            if (z11 || objM3 == fVar) {
                objM3 = new qb.s(str2, 12);
                sVar.k0(objM3);
            }
            b4.t tVarB = j5.r.b(tVarC, (Function1) objM3);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarB, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC2, gVar4, sVar);
            d2.c.f(m2.e(qVar, lv.t.f28252f), sVar);
            d2.b bVar = d2.i.f13801a;
            float f11 = fDoubleValue;
            i2 i2VarA = h2.a(bVar, b4.d.f5692j, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            int i15 = i13;
            b4.t tVarC3 = b4.a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            m5.u0 u0Var = lv.v.f28274n;
            long j9 = lv.s.C;
            r9.d(str, null, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, (i15 & 14) | MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            float f12 = lv.t.f28249c;
            d2.c.f(m2.m(qVar, f12), sVar);
            if (d3 == null) {
                sVar.a0(2001594410);
                sVar.q(false);
                strQ = null;
            } else {
                sVar.a0(2001594411);
                strQ = Q(Double.valueOf(((Number) c3VarB.getValue()).floatValue()), sVar);
                sVar.q(false);
            }
            if (strQ == null) {
                strQ = "--*";
            }
            m5.u0 u0Var2 = lv.v.f28275o;
            if (d3 == null || Intrinsics.areEqual(d3, 0.0d)) {
                j9 = lv.s.D;
            }
            r9.d(strQ, null, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, 0, 12582912, 131066);
            sVar.q(true);
            d2.c.f(m2.m(qVar, f12), sVar);
            i2 i2VarA2 = h2.a(bVar, b4.d.f5693k, sVar, 48);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            b4.t tVarC4 = b4.a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA2, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            w.a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC4, gVar4, sVar);
            if (0.8f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            n1 n1Var = new n1(0.8f, true);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode4 = Long.hashCode(sVar.T);
            u3.i iVarL4 = sVar.l();
            b4.t tVarC5 = b4.a.c(n1Var, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL4, gVar2, sVar);
            w.a0.y(iHashCode4, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC5, gVar4, sVar);
            i14 = i11;
            cp.a.g(f11, lv.s.f28223e, 8, 20, i14 + 700, sVar, 3504, 0);
            sVar = sVar;
            sVar.q(true);
            Unit unit = Unit.f26487a;
            boolean z12 = (i15 & 112) == 32;
            Object objM4 = sVar.M();
            if (z12 || objM4 == fVar) {
                d11 = d3;
                objM4 = new rf.c(d11, g1Var, null, 1);
                sVar.k0(objM4);
            } else {
                d11 = d3;
            }
            m3.i.h(unit, (Function2) objM4, sVar);
            sVar.q(true);
            sVar.q(true);
        } else {
            d11 = d3;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new d60.b(str, d11, averageItemRating, str2, i14, i12);
        }
    }

    public static final void K(q0 q0Var, m1.a aVar, boolean z11, m3.n nVar, int i11) {
        boolean z12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1402837357);
        int i12 = i11 | (sVar.h(q0Var) ? 4 : 2) | (sVar.f(aVar) ? 32 : 16) | (sVar.g(z11) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            boolean z13 = q0Var.f31039e.f30966b;
            int i13 = R.string.item_view_sold_out_get_reminder;
            String strU = f0.U(sVar, z13 ? z11 ? R.string.item_view_get_custom_favorite_reminder_on_voice_over : R.string.item_view_get_custom_favorite_reminder_off_voice_over : R.string.item_view_sold_out_get_reminder);
            b4.q qVar = b4.q.f5711a;
            b4.t tVarJ = v1.n.j(m2.d(qVar, 1.0f), lv.s.I, l2.g.b(12));
            float f11 = lv.t.f28251e;
            b4.t tVarB = d2.c.B(tVarJ, f11, 0.0f, 2);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
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
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            v1.n.d(x0.z(z11 ? R.drawable.item_bell_on : R.drawable.item_bell_off, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
            d2.c.f(m2.m(qVar, lv.t.f28249c), sVar);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            n1 n1Var = new n1(1.0f, true);
            boolean zF = sVar.f(strU);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (zF || objM == fVar) {
                objM = new qb.s(strU, 16);
                sVar.k0(objM);
            }
            b4.t tVarC2 = j5.r.c(n1Var, false, (Function1) objM);
            if (q0Var.f31039e.f30966b) {
                i13 = z11 ? R.string.item_view_get_custom_favorite_reminder_on : R.string.item_view_get_custom_favorite_reminder_off;
            }
            r9.d(f0.U(sVar, i13), tVarC2, lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            d2.c.f(m2.m(qVar, f11), sVar);
            b4.t tVarJ2 = f4.g.j(qVar, 0.8f, 0.8f);
            float f12 = x7.f19777a;
            long j9 = lv.s.J;
            long j11 = lv.s.f28217b;
            long j12 = lv.s.F;
            w7 w7VarA = x7.a(j9, j11, j11, 0L, j9, j12, j12, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, sVar, 65416);
            boolean zH = sVar.h(q0Var) | ((i12 & 112) == 32);
            Object objM2 = sVar.M();
            if (zH || objM2 == fVar) {
                z12 = true;
                objM2 = new g(aVar, q0Var, 1 == true ? 1 : 0);
                sVar.k0(objM2);
            } else {
                z12 = true;
            }
            z7.a(z11, (Function1) objM2, tVarJ2, null, false, w7VarA, sVar, ((i12 >> 6) & 14) | MLKEMEngine.KyberPolyBytes, 88);
            sVar = sVar;
            sVar.q(z12);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.d(q0Var, aVar, z11, i11, 10);
        }
    }

    public static final void L(AverageItemRating averageItemRating, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-160467153);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(averageItemRating) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (!sVar.R(i12 & 1, (i12 & 3) != 2)) {
            sVar.U();
        } else if (averageItemRating.getAverageFoodQualityRating() == null || averageItemRating.getAverageCollectionExperienceRating() == null || averageItemRating.getAverageContentsVarietyRating() == null || averageItemRating.getAverageFoodQuantityRating() == null) {
            sVar.a0(-177973955);
            d2.c.f(m2.e(b4.q.f5711a, lv.t.f28253g), sVar);
            r9.d(f0.U(sVar, R.string.item_view_not_enough_data_info), null, lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            sVar = sVar;
            sVar.q(false);
        } else {
            sVar.a0(-177737549);
            sVar.q(false);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c60.c(averageItemRating, i11, 18);
        }
    }

    public static final void M(BasicItem basicItem, m3.n nVar, int i11) {
        String strJ;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-805489444);
        int i12 = (sVar.h(basicItem) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            float f11 = lv.t.f28249c;
            b4.q qVar = b4.q.f5711a;
            d2.c.f(m2.m(qVar, f11), sVar);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(qVar, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            v1.n.d(x0.z(R.drawable.system_icon_clock_outline, sVar, 0), null, null, null, null, 0.0f, new i4.o(lv.s.C, 5), sVar, 1572920, 60);
            d2.c.f(m2.m(qVar, lv.t.f28251e), sVar);
            Context context = (Context) sVar.j(v0.f7390b);
            PickupInterval pickupIntervalL = mv.d.l(basicItem);
            a1 a1Var = p0.f30209a;
            pickupIntervalL.getClass();
            if (pickupIntervalL.getIntervalStart() == null || pickupIntervalL.getIntervalEnd() == null) {
                strJ = b3.i.j(1360089928, R.string.store_item_label_closed, sVar, sVar, false);
            } else if (mv.d.j(basicItem) == ItemState.INACTIVE_TODAY || mv.d.j(basicItem) == ItemState.SOLD_OUT || mv.d.j(basicItem) == ItemState.SALES_ENDED) {
                sVar.a0(1360325559);
                f0.U(sVar, R.string.table_reservation_item_view_typical_collect);
                strJ = p0.s(context, mv.d.l(basicItem));
                sVar.q(false);
            } else if (p0.A(mv.d.l(basicItem).getIntervalStart())) {
                sVar.a0(1360534189);
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                strJ = String.format(f0.U(sVar, R.string.table_reservation_item_view_collect), Arrays.copyOf(new Object[]{p0.s(context, mv.d.l(basicItem))}, 1));
                sVar.q(false);
            } else if (p0.C(mv.d.l(basicItem).getIntervalStart())) {
                sVar.a0(1360786405);
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                strJ = String.format(f0.U(sVar, R.string.table_reservation_item_view_typical_collect), Arrays.copyOf(new Object[]{p0.s(context, mv.d.l(basicItem))}, 1));
                sVar.q(false);
            } else {
                sVar.a0(1567924057);
                sVar.q(false);
                strJ = p0.m(context, mv.d.l(basicItem), mv.d.j(basicItem), true, false).toString();
                strJ.getClass();
            }
            r9.d(strJ, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, 0, 12582912, 131070);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new r(basicItem, i11, 4);
        }
    }

    public static final void N(e0 e0Var, Function1 function1, m3.n nVar, int i11) {
        Function1 function12;
        int i12;
        String strJ;
        b1 b1Var;
        b4.q qVar;
        e0Var.getClass();
        function1.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(656700348);
        int i13 = i11 | (sVar.d(e0Var.ordinal()) ? 4 : 2) | (sVar.h(function1) ? 32 : 16);
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = m3.i.w(e0Var);
                sVar.k0(objM);
            }
            b1 b1Var2 = (b1) objM;
            int i14 = d0.$EnumSwitchMapping$0[((e0) b1Var2.getValue()).ordinal()];
            if (i14 == 1) {
                strJ = b3.i.j(-271149089, R.string.item_view_translation_button_original, sVar, sVar, false);
            } else {
                if (i14 != 2) {
                    throw e0.f.v(sVar, -271150931, false);
                }
                strJ = b3.i.j(-271145760, R.string.item_view_translation_button_translate, sVar, sVar, false);
            }
            String str = strJ;
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.q qVar2 = b4.q.f5711a;
            b4.t tVarC = b4.a.c(qVar2, sVar);
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
            if (((e0) b1Var2.getValue()) == e0.TRANSLATED) {
                sVar.a0(-755785627);
                b1Var = b1Var2;
                qVar = qVar2;
                i12 = 0;
                r9.d(f0.U(sVar, R.string.item_view_translation_message), d2.c.D(qVar2, 0.0f, 0.0f, 0.0f, lv.t.f28252f, 7), lv.s.D, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, lv.v.f28276p, sVar, 432, 12607872, 110584);
                sVar = sVar;
                sVar.q(false);
            } else {
                b1Var = b1Var2;
                i12 = 0;
                qVar = qVar2;
                sVar.a0(-755446084);
                sVar.q(false);
            }
            function12 = function1;
            m3.s sVar2 = sVar;
            r9.d(str, b4.a.a(qVar, c5.m2.f7291a, new c0(function1, b1Var)), lv.s.f28217b, 0L, null, 0L, x5.l.f43854c, null, 0L, 2, false, 1, 0, null, lv.v.f28283w, sVar2, 805306752, 12607872, 110072);
            sVar = sVar2;
            sVar.q(true);
        } else {
            function12 = function1;
            i12 = 0;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a0(e0Var, function12, i11, i12);
        }
    }

    public static final void O(boolean z11, Price price, Function0 function0, m3.n nVar, int i11) {
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(873824228);
        int i12 = i11 | (sVar.g(z11) ? 4 : 2) | (sVar.f(price) ? 32 : 16) | (sVar.h(function0) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.k kVar = (x60.k) sVar.j(PantryThemeKt.getLocalPantryRadius());
            x60.l lVar = (x60.l) sVar.j(PantryThemeKt.getLocalPantrySize());
            boolean zC = sVar.c(kVar.f43977a) | sVar.c(lVar.f43994f);
            Object objM = sVar.M();
            if (zC || objM == m3.m.f29332a) {
                objM = new gg.c(kVar.f43987k, lVar.f43993e);
                sVar.k0(objM);
            }
            s0.b(null, (gg.c) objM, s0.p(hVar.G, sVar, 0), null, null, u3.e.e(606763442, sVar, new lj.a(function0, mVar, lVar, z11, hVar, jVar, price)), sVar, 196608, 25);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.d(i11, 11, price, function0, z11);
        }
    }

    public static final m5.h P(String str, m3.n nVar, int i11) {
        str.getClass();
        String strT = f0.T(i11, new Object[]{str}, nVar);
        m5.e eVar = new m5.e();
        int iG = StringsKt.G(strT, str, 0, false, 6);
        if (iG >= 0) {
            eVar.c(strT.substring(0, iG));
            int i12 = eVar.i(new l0(0L, 0L, q5.r.f36046k, (q5.n) null, (q5.o) null, (q5.i) null, (String) null, 0L, (x5.a) null, (x5.p) null, (t5.c) null, 0L, (x5.l) null, (i4.u0) null, 65531));
            try {
                eVar.c(strT.substring(iG));
            } finally {
                eVar.g(i12);
            }
        } else {
            eVar.c(strT);
        }
        return eVar.j();
    }

    public static final String Q(Double d3, m3.n nVar) {
        String strU = f0.U(nVar, R.string.app_language);
        LinkedHashMap linkedHashMap = j0.f30194a;
        return j0.a(d3, 1, strU);
    }

    public static final boolean R(AverageItemRating averageItemRating) {
        if ((averageItemRating != null ? averageItemRating.getAverageCollectionExperienceRating() : null) != null) {
            return true;
        }
        if ((averageItemRating != null ? averageItemRating.getAverageFoodQualityRating() : null) != null) {
            return true;
        }
        if ((averageItemRating != null ? averageItemRating.getAverageContentsVarietyRating() : null) == null) {
            return (averageItemRating != null ? averageItemRating.getAverageFoodQuantityRating() : null) != null;
        }
        return true;
    }

    public static final String S(Long l, m3.n nVar) {
        m3.s sVar = (m3.s) nVar;
        Object objM = sVar.M();
        m3.f fVar = m3.m.f29332a;
        if (objM == fVar) {
            objM = new i1(System.currentTimeMillis() / 1000);
            sVar.k0(objM);
        }
        i1 i1Var = (i1) objM;
        boolean zF = sVar.f(l);
        Object objM2 = sVar.M();
        if (zF || objM2 == fVar) {
            objM2 = new s(l, i1Var, null);
            sVar.k0(objM2);
        }
        m3.i.h(l, (Function2) objM2, sVar);
        long jLongValue = (l != null ? l.longValue() : 0L) - (i1Var.h() * 1000);
        return p0.l(jLongValue >= 0 ? jLongValue : 0L);
    }

    public static final void a(q0 q0Var, m1.a aVar, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1796869556);
        int i12 = (sVar.h(q0Var) ? 4 : 2) | i11 | (sVar.f(aVar) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            Boolean boolValueOf = Boolean.valueOf(q0Var.f31035a.getFavorite());
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = new qb.r(27);
                sVar.k0(objM);
            }
            s1.i.a(boolValueOf, null, (Function1) objM, null, null, null, u3.e.e(568943351, sVar, new y(q0Var, aVar, 0)), sVar, 1573248, 58);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new qk.e(q0Var, aVar, i11, 23);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    public static final void b(BasicItem basicItem, m3.n nVar, int i11) {
        ?? r92;
        m3.s sVar;
        boolean z11;
        m3.s sVar2;
        AllergensInfo allergensInfo;
        AllergensInfo allergensInfo2;
        m3.s sVar3 = (m3.s) nVar;
        sVar3.c0(-247679071);
        int i12 = 2;
        int i13 = i11 | (sVar3.h(basicItem) ? 4 : 2);
        if (sVar3.R(i13 & 1, (i13 & 3) != 2)) {
            Object objM = sVar3.M();
            if (objM == m3.m.f29332a) {
                objM = m3.i.w(Boolean.FALSE);
                sVar3.k0(objM);
            }
            b1 b1Var = (b1) objM;
            String strJ = null;
            c3 c3VarB = t1.d.b(((Boolean) b1Var.getValue()).booleanValue() ? 180.0f : 0.0f, null, "allergens_chevron_rotation", null, sVar3, 3072, 22);
            BasicItemInformation information = basicItem.getInformation();
            String url = (information == null || (allergensInfo2 = information.getAllergensInfo()) == null) ? null : allergensInfo2.getUrl();
            BasicItemInformation information2 = basicItem.getInformation();
            if (information2 != null && (allergensInfo = information2.getAllergensInfo()) != null) {
                strJ = allergensInfo.getDescription();
            }
            if (mv.d.r(strJ)) {
                sVar3.a0(147060117);
                sVar3.q(false);
            } else if (url == null || url.length() == 0) {
                sVar3.a0(147151319);
                strJ = mv.d.p(basicItem) ? b3.i.j(147188705, R.string.item_view_dine_in_allergens_description, sVar3, sVar3, false) : b3.i.j(147289393, R.string.allergens_popup_text_v2, sVar3, sVar3, false);
                sVar3.q(false);
            } else {
                sVar3.a0(147401148);
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                strJ = String.format(f0.U(sVar3, R.string.allergens_popup_text_with_url), Arrays.copyOf(new Object[]{w.a0.p("<a href='", url, "'>"), "</a>"}, 2));
                sVar3.q(false);
            }
            String str = strJ;
            d2.d dVar = d2.i.f13803c;
            b4.i iVar = b4.d.f5694m;
            d2.y yVarA = d2.w.a(dVar, iVar, sVar3, 0);
            int iHashCode = Long.hashCode(sVar3.T);
            u3.i iVarL = sVar3.l();
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC = b4.a.c(qVar, sVar3);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar3.e0();
            if (sVar3.S) {
                sVar3.k(hVar);
            } else {
                sVar3.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar3);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar3, numValueOf, gVar3);
            b5.d dVar2 = b5.i.f5845h;
            m3.i.z(sVar3, dVar2);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar3);
            b4.t tVarA = b4.a.a(qVar, c5.m2.f7291a, new k0(b1Var, i12));
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar3, 48);
            int iHashCode2 = Long.hashCode(sVar3.T);
            u3.i iVarL2 = sVar3.l();
            b4.t tVarC2 = b4.a.c(tVarA, sVar3);
            sVar3.e0();
            if (sVar3.S) {
                sVar3.k(hVar);
            } else {
                sVar3.n0();
            }
            m3.i.C(i2VarA, gVar, sVar3);
            m3.i.C(iVarL2, gVar2, sVar3);
            w.a0.y(iHashCode2, sVar3, gVar3, sVar3, dVar2);
            m3.i.C(tVarC2, gVar4, sVar3);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            r9.d(f0.U(sVar3, R.string.item_view_description_tab_text), new n1(1.0f, true), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((Boolean) b1Var.getValue()).booleanValue() ? lv.v.f28275o : lv.v.f28274n, sVar3, 0, 0, 131068);
            v1.n.d(x0.z(R.drawable.gfx_chevron_down, sVar3, 0), null, f4.g.i(qVar, ((Number) c3VarB.getValue()).floatValue()), null, null, 0.0f, new i4.o(lv.s.D, 5), sVar3, 1572920, 56);
            m3.s sVar4 = sVar3;
            float f11 = lv.t.f28251e;
            b3.i.y(qVar, f11, sVar4, true);
            b4.t tVarA2 = s1.b0.a(qVar, t1.c.k(m0.DEFAULT_SWIPE_ANIMATION_DURATION, 0, t1.w.f39593a, 2), 2);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode3 = Long.hashCode(sVar4.T);
            u3.i iVarL3 = sVar4.l();
            b4.t tVarC3 = b4.a.c(tVarA2, sVar4);
            sVar4.e0();
            if (sVar4.S) {
                sVar4.k(hVar);
            } else {
                sVar4.n0();
            }
            m3.i.C(u0VarD, gVar, sVar4);
            m3.i.C(iVarL3, gVar2, sVar4);
            w.a0.y(iHashCode3, sVar4, gVar3, sVar4, dVar2);
            m3.i.C(tVarC3, gVar4, sVar4);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar4.a0(380560575);
                d2.y yVarA2 = d2.w.a(dVar, iVar, sVar4, 0);
                int iHashCode4 = Long.hashCode(sVar4.T);
                u3.i iVarL4 = sVar4.l();
                b4.t tVarC4 = b4.a.c(qVar, sVar4);
                sVar4.e0();
                if (sVar4.S) {
                    sVar4.k(hVar);
                } else {
                    sVar4.n0();
                }
                m3.i.C(yVarA2, gVar, sVar4);
                m3.i.C(iVarL4, gVar2, sVar4);
                w.a0.y(iHashCode4, sVar4, gVar3, sVar4, dVar2);
                m3.i.C(tVarC4, gVar4, sVar4);
                d2.c.f(m2.m(qVar, f11), sVar4);
                r9.d(str, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar4, 0, 12582912, 131070);
                m3.s sVar5 = sVar4;
                z11 = true;
                sVar5.q(true);
                sVar5.q(false);
                sVar2 = sVar5;
            } else {
                z11 = true;
                sVar4.a0(380804669);
                sVar4.q(false);
                sVar2 = sVar4;
            }
            sVar2.q(z11);
            sVar2.q(z11);
            sVar = sVar2;
            r92 = z11;
        } else {
            r92 = 1;
            sVar3.U();
            sVar = sVar3;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new r(basicItem, i11, r92);
        }
    }

    public static final void c(final q0 q0Var, final m1.a aVar, m3.n nVar, int i11) {
        int i12;
        m3.s sVar;
        q0Var.getClass();
        aVar.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(308894354);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.h(q0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? sVar2.f(aVar) : sVar2.h(aVar) ? 32 : 16;
        }
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            final List list = q0Var.f31043i;
            final aj.n nVar2 = q0Var.f31044j;
            final w6 w6VarF = v3.f(6, 2, null, sVar2);
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.o(kotlin.coroutines.g.f26549a, sVar2);
                sVar2.k0(objM);
            }
            final v80.b0 b0Var = (v80.b0) objM;
            final x60.h hVar = (x60.h) sVar2.j(PantryThemeKt.getLocalPantryColor());
            final x60.m mVar = (x60.m) sVar2.j(PantryThemeKt.getLocalPantrySpacing());
            final x60.j jVar = (x60.j) sVar2.j(PantryThemeKt.getLocalPantryTypography());
            final x60.j jVar2 = (x60.j) sVar2.j(PantryThemeKt.getLocalPantryTypography());
            final x60.l lVar = (x60.l) sVar2.j(PantryThemeKt.getLocalPantrySize());
            long j9 = i4.v.f23310c;
            int i13 = i12;
            boolean z11 = (i13 & 112) == 32 || ((i13 & 64) != 0 && sVar2.h(aVar));
            Object objM2 = sVar2.M();
            if (z11 || objM2 == fVar) {
                objM2 = new a(aVar, 0);
                sVar2.k0(objM2);
            }
            sVar = sVar2;
            v3.a((Function0) objM2, null, w6VarF, 0.0f, false, null, j9, 0L, 0.0f, 0L, f38059a, null, null, u3.e.e(480264816, sVar2, new i80.n() { // from class: rk.b
                @Override // i80.n
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    m1.a aVar2;
                    aj.n nVar3;
                    b5.h hVar2;
                    Price discountedItemPrice;
                    Object next;
                    m3.n nVar4 = (m3.n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((d2.z) obj).getClass();
                    m3.s sVar3 = (m3.s) nVar4;
                    if (sVar3.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        b4.q qVar = b4.q.f5711a;
                        b4.t tVarD = m2.d(qVar, 1.0f);
                        u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                        int iHashCode = Long.hashCode(sVar3.T);
                        u3.i iVarL = sVar3.l();
                        b4.t tVarC = b4.a.c(tVarD, sVar3);
                        b5.j.R.getClass();
                        b5.h hVar3 = b5.i.f5839b;
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(hVar3);
                        } else {
                            sVar3.n0();
                        }
                        b5.g gVar = b5.i.f5843f;
                        m3.i.C(u0VarD, gVar, sVar3);
                        b5.g gVar2 = b5.i.f5842e;
                        m3.i.C(iVarL, gVar2, sVar3);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        b5.g gVar3 = b5.i.f5844g;
                        m3.i.v(sVar3, numValueOf, gVar3);
                        b5.d dVar = b5.i.f5845h;
                        m3.i.z(sVar3, dVar);
                        b5.g gVar4 = b5.i.f5841d;
                        m3.i.C(tVarC, gVar4, sVar3);
                        b4.t tVarT = d2.c.t(m2.d(qVar, 1.0f));
                        x60.m mVar2 = mVar;
                        float f11 = mVar2.f44010f;
                        float f12 = mVar2.f44017n;
                        float f13 = mVar2.f44015k;
                        b4.t tVarB = d2.c.B(tVarT, f11, 0.0f, 2);
                        d2.d dVar2 = d2.i.f13803c;
                        b4.i iVar = b4.d.f5694m;
                        d2.y yVarA = d2.w.a(dVar2, iVar, sVar3, 0);
                        int iHashCode2 = Long.hashCode(sVar3.T);
                        u3.i iVarL2 = sVar3.l();
                        b4.t tVarC2 = b4.a.c(tVarB, sVar3);
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(hVar3);
                        } else {
                            sVar3.n0();
                        }
                        m3.i.C(yVarA, gVar, sVar3);
                        m3.i.C(iVarL2, gVar2, sVar3);
                        w.a0.y(iHashCode2, sVar3, gVar3, sVar3, dVar);
                        m3.i.C(tVarC2, gVar4, sVar3);
                        b4.t tVarB2 = d2.c.B(m2.d(qVar, 1.0f), 0.0f, mVar2.f44011g, 1);
                        b4.j jVar3 = b4.d.f5693k;
                        i2 i2VarA = h2.a(d2.i.g(f12), jVar3, sVar3, 48);
                        int iHashCode3 = Long.hashCode(sVar3.T);
                        u3.i iVarL3 = sVar3.l();
                        b4.t tVarC3 = b4.a.c(tVarB2, sVar3);
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(hVar3);
                        } else {
                            sVar3.n0();
                        }
                        m3.i.C(i2VarA, gVar, sVar3);
                        m3.i.C(iVarL3, gVar2, sVar3);
                        w.a0.y(iHashCode3, sVar3, gVar3, sVar3, dVar);
                        m3.i.C(tVarC3, gVar4, sVar3);
                        d2.c.f(m2.q(qVar, lVar.f43993e), sVar3);
                        String strU = f0.U(sVar3, R.string.voucher_apply_title);
                        m5.u0 u0Var = jVar2.f43957f;
                        k2 k2Var = k2.f13824a;
                        r9.d(strU, k2Var.b(jVar3, k2Var.a(1.0f, qVar, true)), 0L, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0Var, sVar3, 0, 0, 130044);
                        v80.b0 b0Var2 = b0Var;
                        boolean zH = sVar3.h(b0Var2);
                        w6 w6Var = w6VarF;
                        boolean zF = zH | sVar3.f(w6Var);
                        m1.a aVar3 = aVar;
                        boolean zH2 = zF | sVar3.h(aVar3);
                        Object objM3 = sVar3.M();
                        m3.f fVar2 = m3.m.f29332a;
                        if (zH2 || objM3 == fVar2) {
                            objM3 = new lw.o(b0Var2, w6Var, aVar3, 15);
                            sVar3.k0(objM3);
                        }
                        x60.h hVar4 = hVar;
                        SubtlePantryIconButtonKt.SmallSubtlePantryIconButton((Function0) objM3, null, null, false, false, u3.e.e(-1956704349, sVar3, new c(0, hVar4)), sVar3, 196608, 30);
                        sVar3.q(true);
                        r9.d(f0.U(sVar3, R.string.voucher_apply_subtitle), null, hVar4.K, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43958g, sVar3, 0, 0, 131066);
                        d2.c.f(m2.e(qVar, f12), sVar3);
                        b4.t tVarD2 = m2.d(qVar, 1.0f);
                        d2.g gVarG = d2.i.g(f13);
                        b2 b2VarE = d2.c.e(0.0f, f12, 0.0f, 0.0f, 13);
                        List list2 = list;
                        boolean zH3 = sVar3.h(list2);
                        aj.n nVar5 = nVar2;
                        boolean zF2 = zH3 | sVar3.f(nVar5) | sVar3.h(aVar3) | sVar3.f(mVar2);
                        Object objM4 = sVar3.M();
                        if (zF2 || objM4 == fVar2) {
                            aVar2 = aVar3;
                            objM4 = new x1(23, list2, nVar5, aVar2, mVar2);
                            nVar3 = nVar5;
                            sVar3.k0(objM4);
                        } else {
                            aVar2 = aVar3;
                            nVar3 = nVar5;
                        }
                        m1.a aVar4 = aVar2;
                        ox.h.c(tVarD2, null, b2VarE, gVarG, null, null, false, null, (Function1) objM4, sVar3, 6, 490);
                        sVar3.q(true);
                        b4.t tVarJ = v1.n.j(d2.u.f13938a.a(qVar, b4.d.f5690h), hVar4.G, g0.f23254b);
                        d2.y yVarA2 = d2.w.a(dVar2, iVar, sVar3, 0);
                        int iHashCode4 = Long.hashCode(sVar3.T);
                        u3.i iVarL4 = sVar3.l();
                        b4.t tVarC4 = b4.a.c(tVarJ, sVar3);
                        sVar3.e0();
                        if (sVar3.S) {
                            hVar2 = hVar3;
                            sVar3.k(hVar2);
                        } else {
                            hVar2 = hVar3;
                            sVar3.n0();
                        }
                        m3.i.C(yVarA2, gVar, sVar3);
                        m3.i.C(iVarL4, gVar2, sVar3);
                        w.a0.y(iHashCode4, sVar3, gVar3, sVar3, dVar);
                        m3.i.C(tVarC4, gVar4, sVar3);
                        aj.n nVar6 = nVar3;
                        s0.g(null, 1, lv.s.H, sVar3, 432, 1);
                        b4.t tVarA = d2.c.A(m2.d(qVar, 1.0f), mVar2.f44014j, f13);
                        i2 i2VarA2 = h2.a(d2.i.f13801a, jVar3, sVar3, 48);
                        int iHashCode5 = Long.hashCode(sVar3.T);
                        u3.i iVarL5 = sVar3.l();
                        b4.t tVarC5 = b4.a.c(tVarA, sVar3);
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(hVar2);
                        } else {
                            sVar3.n0();
                        }
                        m3.i.C(i2VarA2, gVar, sVar3);
                        m3.i.C(iVarL5, gVar2, sVar3);
                        w.a0.y(iHashCode5, sVar3, gVar3, sVar3, dVar);
                        m3.i.C(tVarC5, gVar4, sVar3);
                        b4.t tVarA2 = k2Var.a(1.0f, d2.c.B(qVar, 0.0f, f13, 1), true);
                        d2.y yVarA3 = d2.w.a(dVar2, iVar, sVar3, 0);
                        int iHashCode6 = Long.hashCode(sVar3.T);
                        u3.i iVarL6 = sVar3.l();
                        b4.t tVarC6 = b4.a.c(tVarA2, sVar3);
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(hVar2);
                        } else {
                            sVar3.n0();
                        }
                        m3.i.C(yVarA3, gVar, sVar3);
                        m3.i.C(iVarL6, gVar2, sVar3);
                        w.a0.y(iHashCode6, sVar3, gVar3, sVar3, dVar);
                        m3.i.C(tVarC6, gVar4, sVar3);
                        boolean z12 = nVar6 instanceof aj.k;
                        q0 q0Var2 = q0Var;
                        if (z12) {
                            discountedItemPrice = q0Var2.l;
                        } else {
                            if (nVar6 instanceof aj.l) {
                                Iterator it = q0Var2.f31046m.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    if (Intrinsics.areEqual(((DiscountedItemPrice) next).getUserDiscountId(), ((aj.l) nVar6).f1504a.mo529getIdVUJ7vw4())) {
                                        break;
                                    }
                                }
                                DiscountedItemPrice discountedItemPrice2 = (DiscountedItemPrice) next;
                                if (discountedItemPrice2 != null) {
                                    discountedItemPrice = discountedItemPrice2.getDiscountedItemPrice();
                                }
                            } else if (!(nVar6 instanceof aj.m)) {
                                e40.a.f();
                                return null;
                            }
                            discountedItemPrice = null;
                        }
                        BasicItem basicItem = q0Var2.f31035a;
                        r9.d(mv.d.i(basicItem.getInformation().getDisplayValue(), 1), null, lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(lv.v.f28274n, 0L, 0L, null, null, 0L, x5.l.f43855d, 0, 0L, null, null, 16773119), sVar3, MLKEMEngine.KyberPolyBytes, 0, 131066);
                        if (discountedItemPrice == null) {
                            discountedItemPrice = basicItem.getInformation().getDisplayPrice();
                        }
                        r9.d(mv.d.i(discountedItemPrice, 1), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28271j, sVar3, 0, 12582912, 131070);
                        sVar3.q(true);
                        b4.t tVarA3 = k2Var.a(1.0f, qVar, true);
                        boolean zQ = mv.d.q(basicItem);
                        String strU2 = f0.U(sVar3, R.string.checkout_reserve_button);
                        lv.q qVar2 = lv.q.REGULAR;
                        lv.e eVar = lv.e.LARGE;
                        boolean zF3 = sVar3.f(nVar6) | sVar3.h(aVar4) | sVar3.h(q0Var2);
                        Object objM5 = sVar3.M();
                        if (zF3 || objM5 == fVar2) {
                            objM5 = new lw.o(nVar6, aVar4, q0Var2, 16);
                            sVar3.k0(objM5);
                        }
                        v0.n.l(tVarA3, strU2, null, qVar2, eVar, zQ, false, null, null, (Function0) objM5, sVar3, 27648, 452);
                        e0.f.D(sVar3, true, true, true);
                    } else {
                        sVar3.U();
                    }
                    return Unit.f26487a;
                }
            }), sVar, 1572864, 3078, 7098);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.x(q0Var, aVar, i11, 24);
        }
    }

    public static final void d(AverageItemRating averageItemRating, boolean z11, m3.n nVar, int i11) {
        int i12;
        AverageItemRating averageItemRating2;
        String strT;
        int i13;
        String strT2;
        int i14;
        String str;
        int i15;
        String strT3;
        int i16;
        String str2;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(108375091);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(averageItemRating) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.g(z11) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(b4.q.f5711a, sVar);
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
            String strT4 = null;
            if (z11) {
                averageItemRating2 = averageItemRating;
                sVar.a0(1805050969);
                sVar.q(false);
            } else {
                sVar.a0(1804699243);
                String strU = f0.U(sVar, R.string.rating_details_category_title_collection);
                Double averageCollectionExperienceRating = averageItemRating.getAverageCollectionExperienceRating();
                if (R(averageItemRating)) {
                    if (averageItemRating.getAverageCollectionExperienceRating() == null) {
                        i16 = -5240523;
                    } else if (Intrinsics.areEqual(averageItemRating.getAverageCollectionExperienceRating(), 0.0d)) {
                        i16 = -5078827;
                    } else {
                        sVar.a0(-4960438);
                        strT3 = f0.T(R.string.screen_reader_item_view_rating_collection, new Object[]{Q(averageItemRating.getAverageCollectionExperienceRating(), sVar)}, sVar);
                        sVar.q(false);
                        str2 = strT3;
                    }
                    strT3 = b3.i.j(i16, R.string.screen_reader_item_view_rating_collection_no_data, sVar, sVar, false);
                    str2 = strT3;
                } else {
                    sVar.a0(-5312878);
                    sVar.q(false);
                    str2 = null;
                }
                averageItemRating2 = averageItemRating;
                J(strU, averageCollectionExperienceRating, averageItemRating2, str2, 0, sVar, ((i12 << 6) & 896) | 24576);
                sVar.q(false);
            }
            String strU2 = f0.U(sVar, R.string.rating_details_category_title_quality);
            Double averageFoodQualityRating = averageItemRating2.getAverageFoodQualityRating();
            int i17 = i12 & 14;
            if (R(averageItemRating2)) {
                if (averageItemRating2.getAverageFoodQualityRating() == null) {
                    i13 = 2116056873;
                } else if (Intrinsics.areEqual(averageItemRating2.getAverageFoodQualityRating(), 0.0d)) {
                    i13 = 2116206665;
                } else {
                    sVar.a0(2116321799);
                    strT = f0.T(R.string.screen_reader_item_view_rating_quality, new Object[]{Q(averageItemRating2.getAverageFoodQualityRating(), sVar)}, sVar);
                    sVar.q(false);
                }
                strT = b3.i.j(i13, R.string.screen_reader_item_view_rating_quality_no_data, sVar, sVar, false);
            } else {
                sVar.a0(2115993539);
                sVar.q(false);
                strT = null;
            }
            int i18 = ((i12 << 6) & 896) | 24576;
            J(strU2, averageFoodQualityRating, averageItemRating2, strT, 100, sVar, i18);
            String strU3 = f0.U(sVar, R.string.rating_details_category_title_variety);
            Double averageContentsVarietyRating = averageItemRating2.getAverageContentsVarietyRating();
            if (R(averageItemRating2)) {
                if (averageItemRating2.getAverageContentsVarietyRating() == null) {
                    i14 = 981850546;
                } else if (Intrinsics.areEqual(averageItemRating2.getAverageContentsVarietyRating(), 0.0d)) {
                    i14 = 982004306;
                } else {
                    sVar.a0(982119564);
                    strT2 = f0.T(R.string.screen_reader_item_view_rating_variety, new Object[]{Q(averageItemRating2.getAverageContentsVarietyRating(), sVar)}, sVar);
                    sVar.q(false);
                    str = strT2;
                }
                strT2 = b3.i.j(i14, R.string.screen_reader_item_view_rating_variety_no_data, sVar, sVar, false);
                str = strT2;
            } else {
                sVar.a0(981783244);
                sVar.q(false);
                str = null;
            }
            J(strU3, averageContentsVarietyRating, averageItemRating2, str, 200, sVar, i18);
            String strU4 = f0.U(sVar, R.string.rating_details_category_title_quantity);
            Double averageFoodQuantityRating = averageItemRating2.getAverageFoodQuantityRating();
            if (R(averageItemRating2)) {
                if (averageItemRating2.getAverageFoodQuantityRating() == null) {
                    i15 = -1631034140;
                } else if (Intrinsics.areEqual(averageItemRating2.getAverageFoodQuantityRating(), 0.0d)) {
                    i15 = -1630882364;
                } else {
                    sVar.a0(-1630766207);
                    strT4 = f0.T(R.string.screen_reader_item_view_rating_quantity, new Object[]{Q(averageItemRating2.getAverageFoodQuantityRating(), sVar)}, sVar);
                    sVar.q(false);
                }
                strT4 = b3.i.j(i15, R.string.screen_reader_item_view_rating_quantity_no_data, sVar, sVar, false);
            } else {
                sVar.a0(-1631098497);
                sVar.q(false);
            }
            J(strU4, averageFoodQuantityRating, averageItemRating2, strT4, 300, sVar, i18);
            L(averageItemRating2, sVar, i17);
            sVar.q(true);
        } else {
            averageItemRating2 = averageItemRating;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new e.p(averageItemRating2, z11, i11, 3);
        }
    }

    public static final void e(BasicItem basicItem, m3.n nVar, int i11) {
        m5.h hVar;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-780920142);
        int i12 = i11 | (sVar.h(basicItem) ? 4 : 2);
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            String strG = p0.G((Context) sVar.j(v0.f7390b), basicItem.getNextSalesWindowPurchaseStart());
            String nextSalesWindowPurchaseStart = basicItem.getNextSalesWindowPurchaseStart();
            if (nextSalesWindowPurchaseStart == null || nextSalesWindowPurchaseStart.length() == 0) {
                sVar.a0(1446539020);
                hVar = new m5.h(f0.U(sVar, R.string.item_view_sold_out_state_next_sale_unknown));
                sVar.q(false);
            } else {
                sVar.a0(1446146529);
                if (p0.A(basicItem.getNextSalesWindowPurchaseStart())) {
                    sVar.a0(1446196749);
                    hVar = P(strG, sVar, R.string.item_view_sold_out_state_next_sale_time_today);
                    sVar.q(false);
                } else {
                    sVar.a0(1446364490);
                    hVar = P(strG, sVar, R.string.item_view_sold_out_state_next_sale_time_tomorrow);
                    sVar.q(false);
                }
                sVar.q(false);
            }
            m5.h hVar2 = hVar;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarJ = v1.n.j(m2.d(qVar, 1.0f), lv.s.I, l2.g.b(12));
            float f11 = lv.t.f28251e;
            b4.t tVarZ = d2.c.z(tVarJ, f11);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarZ, sVar);
            b5.j.R.getClass();
            b5.h hVar3 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar3);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            v1.n.d(x0.z(R.drawable.item_calender, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
            d2.c.f(m2.m(qVar, lv.t.f28249c), sVar);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            r9.e(hVar2, new n1(1.0f, true), lv.s.C, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, lv.v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 100663296, 262136);
            sVar = sVar;
            b3.i.y(qVar, f11, sVar, true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new r(basicItem, i11, 5);
        }
    }

    public static final void f(BasicItem basicItem, m3.n nVar, int i11) {
        String strJ;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(788445641);
        int i12 = (sVar.h(basicItem) ? 4 : 2) | i11;
        if (!sVar.R(i12 & 1, (i12 & 3) != 2)) {
            sVar.U();
        } else {
            if (!mv.r0.t(basicItem)) {
                w1 w1VarS = sVar.s();
                if (w1VarS != null) {
                    w1VarS.f29476d = new r(basicItem, i11, 2);
                    return;
                }
                return;
            }
            d3 d3Var = v0.f7390b;
            Context context = (Context) sVar.j(d3Var);
            float f11 = lv.t.f28249c;
            b4.q qVar = b4.q.f5711a;
            d2.c.f(m2.m(qVar, f11), sVar);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(qVar, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            v1.n.d(x0.z(R.drawable.system_icon_clock_outline, sVar, 0), null, null, null, null, 0.0f, new i4.o(lv.s.C, 5), sVar, 1572920, 60);
            float f12 = lv.t.f28251e;
            String strF = r8.k.f(f12, R.string.item_view_collect, qVar, sVar, sVar);
            m5.u0 u0Var = lv.v.f28274n;
            r9.d(strF, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, 0, 12582912, 131070);
            d2.c.f(m2.m(qVar, f11), sVar);
            r9.d(p0.u(context, mv.d.l(basicItem)), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, 0, 12582912, 131070);
            d2.c.f(m2.m(qVar, f11), sVar);
            String intervalStart = mv.d.l(basicItem).getIntervalStart();
            Context context2 = (Context) sVar.j(d3Var);
            if (mv.d.j(basicItem) == ItemState.INACTIVE_TODAY || mv.d.l(basicItem).getIntervalStart() == null || mv.d.l(basicItem).getIntervalEnd() == null) {
                strJ = b3.i.j(474573907, R.string.store_item_label_closed, sVar, sVar, false);
            } else if (p0.A(intervalStart)) {
                strJ = b3.i.j(-677423997, R.string.generic_collection_time_label_today, sVar, sVar, false);
            } else if (p0.C(intervalStart)) {
                strJ = b3.i.j(-677420442, R.string.generic_collection_time_label_tomorrow, sVar, sVar, false);
            } else {
                sVar.a0(474883752);
                sVar.q(false);
                strJ = p0.d(context2, intervalStart);
            }
            r9.d(strJ, d2.c.A(v1.n.j(d2.c.D(qVar, f11, 0.0f, 0.0f, 0.0f, 14), lv.s.f28217b, l2.g.b(46)), f12, f11), lv.s.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28277q, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            sVar = sVar;
            sVar.q(true);
        }
        w1 w1VarS2 = sVar.s();
        if (w1VarS2 != null) {
            w1VarS2.f29476d = new r(basicItem, i11, 3);
        }
    }

    public static final void g(q0 q0Var, m1.a aVar, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(588153523);
        int i12 = (sVar.h(q0Var) ? 4 : 2) | i11 | (sVar.f(aVar) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            String strU = f0.U(sVar, R.string.item_view_get_custom_favorite_reminder_on_voice_over);
            b4.q qVar = b4.q.f5711a;
            b4.t tVarJ = v1.n.j(m2.d(qVar, 1.0f), lv.s.I, l2.g.b(12));
            float f11 = lv.t.f28251e;
            b4.t tVarZ = d2.c.z(tVarJ, f11);
            boolean zH = ((i12 & 112) == 32) | sVar.h(q0Var);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (zH || objM == fVar) {
                objM = new f(aVar, q0Var, 6);
                sVar.k0(objM);
            }
            b4.t tVarC = androidx.compose.foundation.b.c(tVarZ, false, null, null, (Function0) objM, 15);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarC, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC2, b5.i.f5841d, sVar);
            v1.n.d(x0.z(R.drawable.item_bell_on, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
            d2.c.f(m2.m(qVar, lv.t.f28249c), sVar);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            n1 n1Var = new n1(1.0f, true);
            boolean zF = sVar.f(strU);
            Object objM2 = sVar.M();
            if (zF || objM2 == fVar) {
                objM2 = new qb.s(strU, 15);
                sVar.k0(objM2);
            }
            r9.d(f0.U(sVar, R.string.item_view_get_custom_favorite_reminder_on), j5.r.c(n1Var, false, (Function1) objM2), lv.s.f28215a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            sVar = sVar;
            d2.c.f(m2.m(qVar, f11), sVar);
            v1.n.d(x0.z(R.drawable.system_icon_chevron_right_primary_30, sVar, 0), f0.U(sVar, R.string.item_view_get_custom_favorite_reminder_chevron_voice_over), null, null, null, 0.0f, null, sVar, 8, 124);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new qk.e(q0Var, aVar, i11, 22);
        }
    }

    public static final void h(m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1520240090);
        if (sVar.R(i11 & 1, i11 != 0)) {
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC = b4.a.c(qVar, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            b4.t tVarB = d2.c.B(v1.n.j(m2.d(qVar, 1.0f), lv.s.I, g0.f23254b), 0.0f, lv.t.f28251e, 1);
            i2 i2VarA = h2.a(d2.i.f13805e, b4.d.f5693k, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarB, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            v1.n.d(x0.z(R.drawable.itemcard_icon_edenred, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
            r9.d(r8.k.f(4, R.string.edenred_item_view_signpost, qVar, sVar, sVar), null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43960i, sVar, 0, 0, 131066);
            sVar = sVar;
            sVar.q(true);
            s0.g(m2.d(qVar, 1.0f), (float) 0.5d, lv.s.H, sVar, 438, 0);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new qm.a(i11, 17);
        }
    }

    public static final void i(String str, Function0 function0, m3.n nVar, int i11) {
        m3.s sVar;
        int i12;
        m5.s0 s0Var;
        boolean zD;
        Object objValueOf;
        b1 b1Var;
        m5.h hVar;
        m5.h hVarJ;
        m5.e eVar;
        int i13;
        function0.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(823554935);
        int i14 = i11 | (sVar2.f(str) ? 4 : 2) | (sVar2.h(function0) ? 32 : 16);
        if (sVar2.R(i14 & 1, (i14 & 19) != 18)) {
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM);
            }
            b1 b1Var2 = (b1) objM;
            String strU = f0.U(sVar2, R.string.item_view_read_more);
            int i15 = i14 & 14;
            boolean z11 = i15 == 4;
            Object objM2 = sVar2.M();
            if (z11 || objM2 == fVar) {
                objM2 = m3.i.w(null);
                sVar2.k0(objM2);
            }
            b1 b1Var3 = (b1) objM2;
            m5.s0 s0VarJ = m5.k0.j(sVar2);
            m5.q0 q0Var = (m5.q0) b1Var3.getValue();
            int i16 = q0Var != null ? (int) (q0Var.f29619c >> 32) : 0;
            boolean zD2 = (i15 == 4) | sVar2.d(i16) | sVar2.f(s0VarJ);
            Object objM3 = sVar2.M();
            if (zD2 || objM3 == fVar) {
                if (i16 <= 0) {
                    zD = false;
                    s0Var = s0VarJ;
                } else {
                    s0Var = s0VarJ;
                    zD = m5.s0.b(s0VarJ, new m5.h(str), lv.v.f28274n, false, 3, z5.b.b(i16, 0, 13), null, null, null, 1964).d();
                }
                objValueOf = Boolean.valueOf(zD);
                sVar2.k0(objValueOf);
            } else {
                objValueOf = objM3;
                s0Var = s0VarJ;
            }
            boolean zBooleanValue = ((Boolean) objValueOf).booleanValue();
            boolean zG = (i15 == 4) | sVar2.g(((Boolean) b1Var2.getValue()).booleanValue()) | sVar2.f((m5.q0) b1Var3.getValue()) | sVar2.d(i16) | sVar2.g(zBooleanValue) | sVar2.f(s0Var);
            Object objM4 = sVar2.M();
            if (zG || objM4 == fVar) {
                if (((Boolean) b1Var2.getValue()).booleanValue() || ((m5.q0) b1Var3.getValue()) == null || !zBooleanValue) {
                    b1Var = b1Var2;
                    hVar = new m5.h(str);
                } else {
                    m5.q0 q0Var2 = (m5.q0) b1Var3.getValue();
                    q0Var2.getClass();
                    m5.r rVar = q0Var2.f29618b;
                    int i17 = rVar.f29628f;
                    int i18 = i17 - 1;
                    if (i18 < 0) {
                        i18 = 0;
                    }
                    if (2 <= i18) {
                        i18 = 2;
                    }
                    if (i17 <= 0) {
                        hVar = new m5.h(str);
                        b1Var = b1Var2;
                    } else {
                        int iC = n80.p.c(rVar.c(i18, false), 0, str.length());
                        String strK = e0.f.k("…", strU);
                        int i19 = iC;
                        while (true) {
                            if (i19 <= 0) {
                                b1Var = b1Var2;
                                hVarJ = null;
                                break;
                            }
                            String string = StringsKt.f0(str.substring(0, i19)).toString();
                            b1Var = b1Var2;
                            m5.s0 s0Var2 = s0Var;
                            if (!m5.s0.b(s0Var2, new m5.h(r8.k.l(string, strK)), lv.v.f28274n, false, 3, z5.b.b(i16, 0, 13), null, null, null, 1964).d()) {
                                eVar = new m5.e();
                                eVar.c(string);
                                eVar.c("…");
                                i13 = eVar.i(new l0(lv.s.D, 0L, (q5.r) null, (q5.n) null, (q5.o) null, (q5.i) null, (String) null, 0L, (x5.a) null, (x5.p) null, (t5.c) null, 0L, (x5.l) null, (i4.u0) null, 65534));
                                try {
                                    eVar.c(strU);
                                    eVar.g(i13);
                                    hVarJ = eVar.j();
                                    break;
                                } finally {
                                }
                            }
                            i19--;
                            s0Var = s0Var2;
                            b1Var2 = b1Var;
                        }
                        if (hVarJ == null) {
                            eVar = new m5.e();
                            eVar.c(StringsKt.f0(kotlin.text.b0.x(iC, str)).toString());
                            eVar.c("…");
                            i13 = eVar.i(new l0(lv.s.D, 0L, (q5.r) null, (q5.n) null, (q5.o) null, (q5.i) null, (String) null, 0L, (x5.a) null, (x5.p) null, (t5.c) null, 0L, (x5.l) null, (i4.u0) null, 65534));
                            try {
                                eVar.c(strU);
                                eVar.g(i13);
                                hVar = eVar.j();
                            } finally {
                            }
                        } else {
                            hVar = hVarJ;
                        }
                    }
                }
                objM4 = m3.i.w(hVar);
                sVar2.k0(objM4);
            } else {
                b1Var = b1Var2;
            }
            b1 b1Var4 = (b1) objM4;
            String strU2 = f0.U(sVar2, R.string.screen_reader_item_view_what_you_could_get);
            c5.t1 t1Var = (c5.t1) sVar2.j(c5.x1.f7414f);
            Object objM5 = sVar2.M();
            if (objM5 == fVar) {
                objM5 = m3.i.o(kotlin.coroutines.g.f26549a, sVar2);
                sVar2.k0(objM5);
            }
            v80.b0 b0Var = (v80.b0) objM5;
            m5.h hVar2 = (m5.h) b1Var4.getValue();
            m5.q0 q0Var3 = (m5.q0) b1Var3.getValue();
            i iVar = new i((q0Var3 == null || !q0Var3.d()) ? null : strU2, b0Var, t1Var, b1Var4, function0, b1Var);
            i12 = 2;
            b4.t tVarA = s1.b0.a(b4.a.a(b4.q.f5711a, c5.m2.f7291a, iVar), t1.c.k(m0.DEFAULT_SWIPE_ANIMATION_DURATION, 0, t1.w.f39593a, 2), 2);
            m5.u0 u0Var = lv.v.f28274n;
            int i21 = ((Boolean) b1Var.getValue()).booleanValue() ? Integer.MAX_VALUE : 3;
            boolean zF = sVar2.f(b1Var3);
            Object objM6 = sVar2.M();
            if (zF || objM6 == fVar) {
                objM6 = new li.c(b1Var3, 26);
                sVar2.k0(objM6);
            }
            sVar = sVar2;
            r9.e(hVar2, tVarA, 0L, 0L, 0L, null, null, 0L, 2, false, i21, 0, null, (Function1) objM6, u0Var, sVar, 0, 100663680, 110588);
        } else {
            sVar = sVar2;
            i12 = 2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new jr.b(str, function0, i11, i12);
        }
    }

    public static final void j(q0 q0Var, m1.a aVar, m3.n nVar, int i11) {
        q0Var.getClass();
        aVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1344994752);
        int i12 = (sVar.h(q0Var) ? 4 : 2) | i11 | (sVar.f(aVar) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(null);
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new li.c(b1Var, 27);
                sVar.k0(objM2);
            }
            b4.q qVar = b4.q.f5711a;
            b4.t tVarO = z4.c0.o(qVar, (Function1) objM2);
            u0 u0VarD = d2.p.d(b4.d.f5687e, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarO, sVar);
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
            b4.t tVarZ = d2.c.z(qVar, lv.t.f28251e);
            boolean favorite = q0Var.f31035a.getFavorite();
            int i13 = i12 & 112;
            boolean zH = (i13 == 32) | sVar.h(q0Var);
            Object objM3 = sVar.M();
            if (zH || objM3 == fVar) {
                objM3 = new f(aVar, q0Var, 3);
                sVar.k0(objM3);
            }
            t(6, tVarZ, (Function0) objM3, sVar, favorite);
            z4.z zVar = (z4.z) b1Var.getValue();
            if (zVar == null || q0Var.f31039e.f30968d) {
                sVar.a0(-499695768);
                sVar.q(false);
            } else {
                sVar.a0(-499891812);
                boolean z11 = i13 == 32;
                Object objM4 = sVar.M();
                if (z11 || objM4 == fVar) {
                    objM4 = new a(aVar, 1);
                    sVar.k0(objM4);
                }
                u(zVar, (Function0) objM4, sVar, 0);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new qk.e(q0Var, aVar, i11, 15);
        }
    }

    public static final void k(BasicItem basicItem, m1.a aVar, m3.n nVar, int i11) {
        aVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-883058693);
        int i12 = 2;
        int i13 = (sVar.h(basicItem) ? 4 : 2) | i11 | (sVar.f(aVar) ? 32 : 16);
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            boolean zF = sVar.f(basicItem);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (zF || objM == fVar) {
                String intervalEnd = mv.d.l(basicItem).getIntervalEnd();
                objM = intervalEnd != null ? Long.valueOf(p0.h(intervalEnd)) : null;
                sVar.k0(objM);
            }
            Long l = (Long) objM;
            String strS = S(l, sVar);
            boolean zD = sVar.d(basicItem.getItemsAvailable()) | sVar.f(l);
            Object objM2 = sVar.M();
            if (zD || objM2 == fVar) {
                objM2 = e0.f.w(l == null || l.longValue() == 0 || basicItem.getItemsAvailable() < 1, sVar);
            }
            long j9 = ((Boolean) ((b1) objM2).getValue()).booleanValue() ? lv.s.D : lv.s.C;
            boolean z11 = (i13 & 112) == 32;
            Object objM3 = sVar.M();
            if (z11 || objM3 == fVar) {
                objM3 = new a(aVar, i12);
                sVar.k0(objM3);
            }
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC = androidx.compose.foundation.b.c(qVar, false, null, null, (Function0) objM3, 15);
            float f11 = lv.t.f28249c;
            b4.t tVarD = d2.c.D(d2.c.z(v1.n.j(d2.c.w(tVarC, -f11, 0.0f, 2), lv.s.f28236q, l2.g.b(12)), f11), 0.0f, 0.0f, f11, 0.0f, 11);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarD, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC2, b5.i.f5841d, sVar);
            v1.n.d(x0.z(R.drawable.system_icon_clock_outline, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
            float f12 = lv.t.f28251e;
            r9.d(r8.k.f(f12, R.string.item_view_collect_flash_sale_countdown, qVar, sVar, sVar), null, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, 0, 12582912, 131066);
            d2.c.f(m2.m(qVar, f11), sVar);
            r9.d(strS, null, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28275o, sVar, 0, 12582912, 131066);
            sVar = sVar;
            sVar.q(true);
            d2.c.f(m2.m(qVar, f12), sVar);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new kq.c(basicItem, aVar, i11, 28);
        }
    }

    public static final void l(BasicItem basicItem, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(786973661);
        int i12 = i11 | (sVar.h(basicItem) ? 4 : 2);
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            boolean zF = sVar.f(basicItem);
            Object objM = sVar.M();
            if (zF || objM == m3.m.f29332a) {
                String intervalEnd = mv.d.l(basicItem).getIntervalEnd();
                objM = intervalEnd != null ? Long.valueOf(p0.h(intervalEnd)) : null;
                sVar.k0(objM);
            }
            String strS = S((Long) objM, sVar);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC = b4.a.c(qVar, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            b4.t tVarD = m2.d(qVar, 1.0f);
            long j9 = lv.s.I;
            i4.r0 r0Var = g0.f23254b;
            b4.t tVarB = d2.c.B(v1.n.j(tVarD, j9, r0Var), 0.0f, lv.t.f28251e, 1);
            i2 i2VarA = h2.a(d2.i.f13805e, b4.d.f5693k, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarB, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            v1.n.d(x0.z(R.drawable.flash_outlined, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
            String strU = f0.U(sVar, R.string.item_view_flash_explainer_title);
            m5.u0 u0Var = lv.v.f28274n;
            r9.d(strU, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, 0, 12582912, 131070);
            float f11 = lv.t.f28249c;
            d2.c.f(m2.m(qVar, f11), sVar);
            long j11 = lv.s.H;
            s0.o(m2.e(v1.n.j(qVar, j11, r0Var), 16), 1, 0L, sVar, 54, 4);
            r9.d(r8.k.f(f11, R.string.item_view_flash_sale_countdown_reserve, qVar, sVar, sVar), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, 0, 12582912, 131070);
            d2.c.f(m2.m(qVar, f11), sVar);
            r9.d(strS, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(lv.v.f28275o, 0L, 0L, null, null, 0L, null, 0, 0L, null, null, 16777151), sVar, 0, 0, 131070);
            sVar = sVar;
            sVar.q(true);
            s0.g(m2.d(qVar, 1.0f), (float) 0.5d, j11, sVar, 438, 0);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new r(basicItem, i11, 0);
        }
    }

    public static final void m(Function0 function0, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(68052652);
        int i12 = (sVar.h(function0) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            long j9 = lv.s.J;
            i4.r0 r0Var = g0.f23254b;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarA = b4.a.a(v1.n.j(qVar, j9, r0Var), c5.m2.f7291a, new on.l(9, function0));
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarA, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            if (0.8f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            r9.d(f0.U(sVar, R.string.item_view_description_smiley_report), new n1(0.8f, true), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            sVar = sVar;
            v1.n.d(x0.z(R.drawable.ic_open_in_new, sVar, 0), null, null, null, null, 0.0f, new i4.o(lv.s.D, 5), sVar, 1572920, 60);
            b3.i.y(qVar, lv.t.f28251e, sVar, true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.z(i11, 21, function0);
        }
    }

    public static final void n(q0 q0Var, m1.a aVar, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1279840910);
        int i12 = (sVar.h(q0Var) ? 4 : 2) | i11 | (sVar.f(aVar) ? 32 : 16);
        boolean z11 = false;
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            if (q0Var.f31035a.getFavorite() && q0Var.f31039e.f30965a) {
                z11 = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z11);
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = new qb.r(28);
                sVar.k0(objM);
            }
            s1.i.a(boolValueOf, null, (Function1) objM, null, null, null, u3.e.e(-1982793867, sVar, new y(q0Var, aVar, 1)), sVar, 1573248, 58);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new qk.e(q0Var, aVar, i11, 24);
        }
    }

    public static final void o(q0 q0Var, m3.n nVar, int i11) {
        b4.j jVar = b4.d.f5693k;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1751787242);
        int i12 = (sVar.h(q0Var) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            BasicItem basicItem = q0Var.f31035a;
            AverageItemRating averageItemRating = basicItem.getInformation().getAverageItemRating();
            b4.q qVar = b4.q.f5711a;
            if (averageItemRating != null) {
                sVar.a0(-653750686);
                i2 i2VarA = h2.a(d2.i.f13801a, jVar, sVar, 48);
                int iHashCode = Long.hashCode(sVar.T);
                u3.i iVarL = sVar.l();
                b4.t tVarC = b4.a.c(qVar, sVar);
                b5.j.R.getClass();
                b5.h hVar = b5.i.f5839b;
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar);
                } else {
                    sVar.n0();
                }
                m3.i.C(i2VarA, b5.i.f5843f, sVar);
                m3.i.C(iVarL, b5.i.f5842e, sVar);
                m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                m3.i.z(sVar, b5.i.f5845h);
                m3.i.C(tVarC, b5.i.f5841d, sVar);
                v1.n.d(x0.z(R.drawable.icon_rating_star, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
                d2.c.f(m2.m(qVar, lv.t.f28251e), sVar);
                AverageItemRating averageItemRating2 = basicItem.getInformation().getAverageItemRating();
                String displayValue = averageItemRating2 != null ? averageItemRating2.getDisplayValue() : null;
                if (displayValue == null) {
                    displayValue = "";
                }
                m5.u0 u0Var = lv.v.f28274n;
                r9.d(displayValue, null, 0L, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, u0Var, sVar, 0, 12582912, 130046);
                d2.c.f(m2.m(qVar, lv.t.f28249c), sVar);
                AverageItemRating averageItemRating3 = basicItem.getInformation().getAverageItemRating();
                r9.d("(" + (averageItemRating3 != null ? Integer.valueOf(averageItemRating3.getRatingCount()) : null) + ")", null, lv.s.D, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130042);
                sVar = sVar;
                sVar.q(true);
                sVar.q(false);
            } else {
                sVar.a0(-652939509);
                i2 i2VarA2 = h2.a(d2.i.f13801a, jVar, sVar, 48);
                int iHashCode2 = Long.hashCode(sVar.T);
                u3.i iVarL2 = sVar.l();
                b4.t tVarC2 = b4.a.c(qVar, sVar);
                b5.j.R.getClass();
                b5.h hVar2 = b5.i.f5839b;
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar2);
                } else {
                    sVar.n0();
                }
                m3.i.C(i2VarA2, b5.i.f5843f, sVar);
                m3.i.C(iVarL2, b5.i.f5842e, sVar);
                m3.i.v(sVar, Integer.valueOf(iHashCode2), b5.i.f5844g);
                m3.i.z(sVar, b5.i.f5845h);
                m3.i.C(tVarC2, b5.i.f5841d, sVar);
                v1.n.d(x0.z(R.drawable.icon_rating_star, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
                r9.d(r8.k.f(lv.t.f28251e, R.string.item_view_no_ratings, qVar, sVar, sVar), null, lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                sVar = sVar;
                sVar.q(true);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new qk.h(q0Var, i11, 4);
        }
    }

    public static final void p(q0 q0Var, m1.a aVar, m3.n nVar, int i11) {
        q0 q0Var2 = q0Var;
        q0Var2.getClass();
        aVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-976477186);
        int i12 = i11 | (sVar.h(q0Var2) ? 4 : 2) | (sVar.f(aVar) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            b4.q qVar = b4.q.f5711a;
            b4.t tVarJ = v1.n.j(m2.d(qVar, 1.0f), lv.s.J, g0.f23254b);
            d2.d dVar = d2.i.f13803c;
            b4.i iVar = b4.d.f5694m;
            d2.y yVarA = d2.w.a(dVar, iVar, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarJ, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar2 = b5.i.f5845h;
            m3.i.z(sVar, dVar2);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            b4.t tVarD = m2.d(qVar, 1.0f);
            boolean zH = ((i12 & 112) == 32) | sVar.h(q0Var2);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new f(aVar, q0Var2, 0);
                sVar.k0(objM);
            }
            b4.t tVarC2 = androidx.compose.foundation.b.c(tVarD, false, null, null, (Function0) objM, 15);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC3 = b4.a.c(tVarC2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC3, gVar4, sVar);
            v1.n.d(x0.z(R.drawable.item_address_location, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            b4.t tVarD2 = d2.c.D(new n1(1.0f, true), 8, 0.0f, 10, 0.0f, 10);
            d2.y yVarA2 = d2.w.a(dVar, iVar, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            b4.t tVarC4 = b4.a.c(tVarD2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA2, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            w.a0.y(iHashCode3, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC4, gVar4, sVar);
            q0Var2 = q0Var;
            String streetAddress = q0Var2.f31035a.getPickupLocation().getAddress().getStreetAddress();
            if (streetAddress == null) {
                streetAddress = "";
            }
            r9.d(streetAddress, null, lv.s.f28217b, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, lv.v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12607872, 110586);
            r9.d(f0.U(sVar, R.string.item_view_more_info_about_store), d2.c.D(qVar, 0.0f, 4, 0.0f, 0.0f, 13), lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar, 432, 12582912, 131064);
            sVar = sVar;
            sVar.q(true);
            g3.i2.a(x0.z(R.drawable.system_icon_chevron_right_primary_30, sVar, 0), null, null, 0L, sVar, 56, 12);
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new qk.e(q0Var2, aVar, i11, 11);
        }
    }

    public static final void q(q0 q0Var, m3.n nVar, int i11) {
        String collectionInfo;
        q0Var.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-337286242);
        int i12 = (sVar.h(q0Var) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            BasicItem basicItem = q0Var.f31035a;
            boolean zR = mv.d.r(basicItem.getInformation().getCollectionInfo());
            boolean zP = mv.d.p(basicItem);
            if (zP && !zR) {
                collectionInfo = b3.i.j(-2009522740, R.string.item_view_dine_in_collection_instructions_description, sVar, sVar, false);
            } else if (zR) {
                sVar.a0(-2009514489);
                sVar.q(false);
                collectionInfo = basicItem.getInformation().getCollectionInfo();
                if (collectionInfo == null) {
                    collectionInfo = "";
                }
            } else {
                collectionInfo = b3.i.j(-2009518844, R.string.item_view_collection_instructions_description, sVar, sVar, false);
            }
            String str = collectionInfo;
            String strJ = zP ? b3.i.j(2129609015, R.string.item_view_dine_in_how_it_works_title, sVar, sVar, false) : b3.i.j(2129691444, R.string.item_view_collection_instructions_title, sVar, sVar, false);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC = b4.a.c(qVar, sVar);
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
            r9.d(strJ, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28272k, sVar, 0, 12582912, 131070);
            d2.c.f(m2.m(qVar, lv.t.f28251e), sVar);
            r9.d(str, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, 0, 12582912, 131070);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new qk.h(q0Var, i11, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v33 */
    public static final void r(q0 q0Var, m1.a aVar, m3.n nVar, int i11) {
        m3.s sVar;
        String strJ;
        m1.a aVar2;
        Object obj;
        Integer numValueOf;
        ?? r102;
        Object obj2;
        m1.a aVar3 = aVar;
        q0Var.getClass();
        aVar3.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-260333570);
        int i12 = i11 | (sVar2.h(q0Var) ? 4 : 2) | (sVar2.f(aVar3) ? 32 : 16);
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            BasicItem basicItem = q0Var.f31035a;
            e0 e0Var = q0Var.f31038d;
            boolean zR = mv.d.r(basicItem.getInformation().getDescriptionTranslated());
            boolean zR2 = mv.d.r(basicItem.getInformation().getDescription());
            boolean zP = mv.d.p(basicItem);
            if (zR && e0Var == e0.TRANSLATED) {
                sVar2.a0(-1072442605);
                sVar2.q(false);
                strJ = basicItem.getInformation().getDescriptionTranslated();
            } else if (zR2) {
                sVar2.a0(-1072439927);
                sVar2.q(false);
                strJ = basicItem.getInformation().getDescription();
            } else {
                sVar2.a0(-1072438424);
                strJ = zP ? b3.i.j(1114157673, R.string.item_view_dine_in_description_body, sVar2, sVar2, false) : b3.i.j(1114253897, R.string.item_view_description_body_generic, sVar2, sVar2, false);
                sVar2.q(false);
            }
            String str = strJ;
            String strJ2 = zP ? b3.i.j(1114381493, R.string.item_view_dine_in_what_to_expect_title, sVar2, sVar2, false) : b3.i.j(1114465379, R.string.item_view_about_this_bag, sVar2, sVar2, false);
            d2.d dVar = d2.i.f13803c;
            b4.i iVar = b4.d.f5694m;
            d2.y yVarA = d2.w.a(dVar, iVar, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC = b4.a.c(qVar, sVar2);
            b5.j.R.getClass();
            Function0 function0 = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(function0);
            } else {
                sVar2.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar2);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar2, numValueOf2, gVar3);
            b5.d dVar2 = b5.i.f5845h;
            m3.i.z(sVar2, dVar2);
            String str2 = strJ2;
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar2);
            b4.t tVarD = m2.d(qVar, 1.0f);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar2, 54);
            int iHashCode2 = Long.hashCode(sVar2.T);
            u3.i iVarL2 = sVar2.l();
            b4.t tVarC2 = b4.a.c(tVarD, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(function0);
            } else {
                sVar2.n0();
            }
            m3.i.C(i2VarA, gVar, sVar2);
            m3.i.C(iVarL2, gVar2, sVar2);
            w.a0.y(iHashCode2, sVar2, gVar3, sVar2, dVar2);
            m3.i.C(tVarC2, gVar4, sVar2);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            n1 n1Var = new n1(1.0f, true);
            d2.y yVarA2 = d2.w.a(dVar, iVar, sVar2, 0);
            int iHashCode3 = Long.hashCode(sVar2.T);
            u3.i iVarL3 = sVar2.l();
            b4.t tVarC3 = b4.a.c(n1Var, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(function0);
            } else {
                sVar2.n0();
            }
            m3.i.C(yVarA2, gVar, sVar2);
            m3.i.C(iVarL3, gVar2, sVar2);
            w.a0.y(iHashCode3, sVar2, gVar3, sVar2, dVar2);
            m3.i.C(tVarC3, gVar4, sVar2);
            b4.q qVar2 = qVar;
            r9.d(str2, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28272k, sVar2, 0, 12582912, 131070);
            m3.s sVar3 = sVar2;
            float f11 = lv.t.f28249c;
            d2.c.f(m2.m(qVar2, f11), sVar3);
            if (str == null) {
                str = "";
            }
            String str3 = str;
            int i13 = i12 & 112;
            boolean zH = sVar3.h(q0Var) | (i13 == 32);
            Object objM = sVar3.M();
            m3.f fVar = m3.m.f29332a;
            if (zH || objM == fVar) {
                aVar2 = aVar;
                f fVar2 = new f(aVar2, q0Var, 1);
                sVar3.k0(fVar2);
                obj = fVar2;
            } else {
                aVar2 = aVar;
                obj = objM;
            }
            i(str3, (Function0) obj, sVar3, 0);
            if (zR) {
                r8.k.t(f11, -636020824, qVar2, sVar3, sVar3);
                boolean zH2 = sVar3.h(q0Var) | (i13 == 32);
                Object objM2 = sVar3.M();
                if (zH2 || objM2 == fVar) {
                    r102 = 0;
                    g gVar5 = new g(aVar2, q0Var, false ? 1 : 0);
                    sVar3.k0(gVar5);
                    obj2 = gVar5;
                } else {
                    r102 = 0;
                    obj2 = objM2;
                }
                N(e0Var, (Function1) obj2, sVar3, r102);
                sVar3.q(r102);
            } else {
                sVar3.a0(-635609516);
                sVar3.q(false);
            }
            sVar3.q(true);
            float f12 = lv.t.f28251e;
            b3.i.y(qVar2, f12, sVar3, true);
            d2.c.f(m2.m(qVar2, f12), sVar3);
            Context context = (Context) sVar3.j(v0.f7390b);
            context.getClass();
            String string = null;
            switch (mv.q0.$EnumSwitchMapping$1[basicItem.getInformation().getItemCategory().ordinal()]) {
                case 1:
                    numValueOf = Integer.valueOf(R.string.generic_category_meals);
                    break;
                case 2:
                    numValueOf = Integer.valueOf(R.string.generic_category_groceries);
                    break;
                case 3:
                    numValueOf = Integer.valueOf(R.string.generic_category_baked_goods);
                    break;
                case 4:
                    numValueOf = Integer.valueOf(R.string.generic_category_pet_food);
                    break;
                case 5:
                    numValueOf = Integer.valueOf(R.string.generic_category_flowers);
                    break;
                case 6:
                    numValueOf = Integer.valueOf(R.string.generic_category_personal_care);
                    break;
                default:
                    numValueOf = null;
                    break;
            }
            String string2 = numValueOf != null ? context.getString(numValueOf.intValue()) : null;
            if (!basicItem.getInformation().getDietCategories().isEmpty()) {
                DietPreferenceModel dietPreferenceModelFromString = DietPreferenceModel.INSTANCE.fromString(basicItem.getInformation().getDietCategories().get(0));
                int i14 = dietPreferenceModelFromString == null ? -1 : mv.q0.$EnumSwitchMapping$2[dietPreferenceModelFromString.ordinal()];
                int i15 = i14 != 1 ? i14 != 2 ? 0 : R.string.generic_preference_vegan : R.string.generic_preference_vegetarian;
                if (i15 != 0) {
                    string = context.getString(i15);
                }
            }
            ArrayList arrayListW = kotlin.collections.y.w(new String[]{string2, string});
            i2 i2VarA2 = h2.a(d2.i.g(f12), b4.d.f5692j, sVar3, 6);
            int iHashCode4 = Long.hashCode(sVar3.T);
            u3.i iVarL4 = sVar3.l();
            b4.t tVarC4 = b4.a.c(qVar2, sVar3);
            sVar3.e0();
            if (sVar3.S) {
                sVar3.k(function0);
            } else {
                sVar3.n0();
            }
            m3.i.C(i2VarA2, gVar, sVar3);
            m3.i.C(iVarL4, gVar2, sVar3);
            w.a0.y(iHashCode4, sVar3, gVar3, sVar3, dVar2);
            m3.i.C(tVarC4, gVar4, sVar3);
            sVar3.a0(-1869948275);
            Iterator it = arrayListW.iterator();
            m3.s sVar4 = sVar3;
            while (it.hasNext()) {
                m3.s sVar5 = sVar4;
                r9.d((String) it.next(), d2.c.A(v1.n.j(qVar2, lv.s.I, l2.g.b(46)), lv.t.f28251e, lv.t.f28249c), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28277q, sVar5, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                aVar2 = aVar;
                sVar4 = sVar5;
                qVar2 = qVar2;
            }
            aVar3 = aVar2;
            e0.f.D(sVar4, false, true, true);
            sVar = sVar4;
        } else {
            sVar2.U();
            sVar = sVar2;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new qk.e(q0Var, aVar3, i11, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x033a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(nk.q0 r47, m1.a r48, m3.n r49, int r50) {
        /*
            Method dump skipped, instruction units count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk.e.s(nk.q0, m1.a, m3.n, int):void");
    }

    public static final void t(int i11, b4.t tVar, Function0 function0, m3.n nVar, boolean z11) {
        int i12;
        int i13;
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-21424845);
        int i14 = i11 | (sVar.g(z11) ? 32 : 16) | (sVar.h(function0) ? 256 : 128);
        if (sVar.R(i14 & 1, (i14 & 147) != 146)) {
            le.p pVarD = o30.e0.D(new le.q("favorite_animation.json"), sVar, 6);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            le.h hVarJ = cg.j((he.k) pVarD.getValue(), ((Boolean) b1Var.getValue()).booleanValue(), false, 0.0f, 1, sVar, 952);
            float fFloatValue = z11 ? 1.0f : 0.0f;
            if (((Boolean) b1Var.getValue()).booleanValue() && ((Number) hVarJ.getValue()).floatValue() >= 1.0f) {
                b1Var.setValue(Boolean.FALSE);
            }
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                fFloatValue = ((Number) hVarJ.getValue()).floatValue();
            }
            if (z11) {
                i12 = 1683252703;
                i13 = R.string.screen_reader_item_view_remove_from_fav;
            } else {
                i12 = 1683337860;
                i13 = R.string.screen_reader_item_view_add_to_fav;
            }
            String strJ = b3.i.j(i12, i13, sVar, sVar, false);
            float f11 = 24;
            b4.t tVarM = m2.m(tVar, f11);
            u0 u0VarD = d2.p.d(b4.d.f5687e, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarM, sVar);
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
            b4.q qVar = b4.q.f5711a;
            b4.t tVarJ = f4.g.j(qVar, 3.5f, 3.5f);
            he.k kVar = (he.k) pVarD.getValue();
            boolean zC = sVar.c(fFloatValue);
            Object objM2 = sVar.M();
            if (zC || objM2 == fVar) {
                objM2 = new defpackage.f(fFloatValue);
                sVar.k0(objM2);
            }
            x0.g(kVar, (Function0) objM2, tVarJ, false, false, false, false, null, false, null, null, false, false, null, null, false, sVar, MLKEMEngine.KyberPolyBytes, 0, 131064);
            sVar = sVar;
            b4.t tVarA = b4.a.a(m2.m(qVar, f11), c5.m2.f7291a, new o(z11, function0, b1Var));
            boolean zF = sVar.f(strJ);
            Object objM3 = sVar.M();
            if (zF || objM3 == fVar) {
                objM3 = new qb.s(strJ, 11);
                sVar.k0(objM3);
            }
            d2.p.a(j5.r.c(tVarA, false, (Function1) objM3), sVar, 0);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new pi.h(tVar, z11, function0, i11, 1);
        }
    }

    public static final void u(z4.z zVar, final Function0 function0, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1757360252);
        int i12 = (sVar.h(zVar) ? 4 : 2) | i11 | (sVar.h(function0) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            final z5.c cVar = (z5.c) sVar.j(c5.x1.f7416h);
            final float f11 = 260;
            float fC0 = cVar.c0(f11);
            Object objM = sVar.M();
            x70.c cVar2 = null;
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(null);
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            boolean zH = sVar.h(zVar);
            Object objM2 = sVar.M();
            if (zH || objM2 == fVar) {
                objM2 = new mn.g(zVar, b1Var, cVar2, 21);
                sVar.k0(objM2);
            }
            m3.i.h(zVar, (Function2) objM2, sVar);
            final float fC02 = (fC0 - cVar.c0(12)) - d70.b.a(30);
            boolean zF = sVar.f((z5.j) b1Var.getValue());
            Object objM3 = sVar.M();
            if (zF || objM3 == fVar) {
                objM3 = new q(b1Var);
                sVar.k0(objM3);
            }
            q qVar = (q) objM3;
            Object objM4 = sVar.M();
            if (objM4 == fVar) {
                objM4 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM4);
            }
            final b1 b1Var2 = (b1) objM4;
            z5.j jVar = (z5.j) b1Var.getValue();
            Object objM5 = sVar.M();
            if (objM5 == fVar) {
                objM5 = new co.l(b1Var, b1Var2, cVar2, 4);
                sVar.k0(objM5);
            }
            m3.i.h(jVar, (Function2) objM5, sVar);
            if (((z5.j) b1Var.getValue()) != null) {
                sVar.a0(2133791348);
                d6.j0 j0Var = new d6.j0(false, 9);
                boolean z11 = (i12 & 112) == 32;
                Object objM6 = sVar.M();
                if (z11 || objM6 == fVar) {
                    objM6 = new js.b(function0, b1Var2, 5);
                    sVar.k0(objM6);
                }
                d6.r.a(qVar, (Function0) objM6, j0Var, u3.e.e(1043770749, sVar, new Function2() { // from class: rk.l
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        m3.n nVar2 = (m3.n) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        m3.s sVar2 = (m3.s) nVar2;
                        if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final b1 b1Var3 = b1Var2;
                            boolean zBooleanValue = ((Boolean) b1Var3.getValue()).booleanValue();
                            s1.x0 x0VarA = r0.d(t1.c.k(150, 0, null, 6), 2).a(r0.c(t1.c.k(180, 0, null, 6), 12));
                            y0 y0VarE = r0.e(t1.c.k(120, 0, null, 6), 2);
                            final float f12 = f11;
                            final float f13 = fC02;
                            final Function0 function02 = function0;
                            final z5.c cVar3 = cVar;
                            s1.y.d(zBooleanValue, null, x0VarA, y0VarE, null, u3.e.e(1705215909, sVar2, new i80.n() { // from class: rk.m
                                @Override // i80.n
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    m3.n nVar3 = (m3.n) obj4;
                                    ((Integer) obj5).getClass();
                                    ((s1.z) obj3).getClass();
                                    b4.q qVar2 = b4.q.f5711a;
                                    b4.t tVarQ = m2.q(qVar2, f12);
                                    float f14 = lv.t.f28253g;
                                    b4.t tVarD = d2.c.D(tVarQ, 0.0f, 0.0f, f14, 0.0f, 11);
                                    Ref.FloatRef floatRef = new Ref.FloatRef();
                                    Ref.FloatRef floatRef2 = new Ref.FloatRef();
                                    Ref.FloatRef floatRef3 = new Ref.FloatRef();
                                    float f15 = 12;
                                    z5.c cVar4 = cVar3;
                                    floatRef.element = cVar4.c0(f15);
                                    floatRef2.element = cVar4.c0(f15) * 1.0f;
                                    floatRef3.element = cVar4.c0(f15) * 1.0f;
                                    l2.d dVar = new l2.d(new oo.d(floatRef3, floatRef, f13, floatRef2, 1));
                                    float f16 = 0;
                                    b4.t tVarA = b4.a.a(v1.n.j(f4.g.g(tVarD, dVar, new o4.d(8, lv.s.G, 6, (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f16)) & 4294967295L))), lv.s.J, dVar), c5.m2.f7291a, new p(function02, b1Var3, 0));
                                    u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                                    m3.s sVar3 = (m3.s) nVar3;
                                    int iHashCode = Long.hashCode(sVar3.T);
                                    u3.i iVarL = sVar3.l();
                                    b4.t tVarC = b4.a.c(tVarA, nVar3);
                                    b5.j.R.getClass();
                                    b5.h hVar = b5.i.f5839b;
                                    sVar3.e0();
                                    if (sVar3.S) {
                                        sVar3.k(hVar);
                                    } else {
                                        sVar3.n0();
                                    }
                                    m3.i.C(u0VarD, b5.i.f5843f, nVar3);
                                    m3.i.C(iVarL, b5.i.f5842e, nVar3);
                                    m3.i.v(nVar3, Integer.valueOf(iHashCode), b5.i.f5844g);
                                    m3.i.z(nVar3, b5.i.f5845h);
                                    m3.i.C(tVarC, b5.i.f5841d, nVar3);
                                    float f17 = lv.t.f28255i;
                                    float f18 = lv.t.f28252f;
                                    r9.d(f0.U(nVar3, R.string.item_view_favorite_tooltip), d2.c.C(qVar2, f18, f17, f18, f14), lv.s.C, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28274n, nVar3, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
                                    sVar3.q(true);
                                    return Unit.f26487a;
                                }
                            }), sVar2, 200064, 18);
                        } else {
                            sVar2.U();
                        }
                        return Unit.f26487a;
                    }
                }), sVar, 3456, 0);
                sVar.q(false);
            } else {
                sVar.a0(2136328574);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new kq.c(zVar, function0, i11, 27);
        }
    }

    public static final void v(q0 q0Var, m1.a aVar, m3.n nVar, int i11) {
        q0Var.getClass();
        BasicItem basicItem = q0Var.f31035a;
        aVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1907016782);
        int i12 = (sVar.h(q0Var) ? 4 : 2) | i11 | (sVar.f(aVar) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            d2.b bVar = d2.i.f13801a;
            d2.y yVarA = d2.w.a(d2.i.g(lv.t.f28253g), b4.d.f5694m, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC = b4.a.c(qVar, sVar);
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
            b(basicItem, sVar, 0);
            String smileyReportLink = basicItem.getInformation().getSmileyReportLink();
            if (smileyReportLink == null) {
                sVar.a0(443283119);
                sVar.q(false);
            } else {
                sVar.a0(443283120);
                s0.g(v1.n.j(m2.e(m2.d(qVar, 1.0f), 1), lv.s.D, g0.f23254b), 0.0f, 0L, sVar, 6, 6);
                boolean zF = ((i12 & 112) == 32) | sVar.f(smileyReportLink);
                Object objM = sVar.M();
                if (zF || objM == m3.m.f29332a) {
                    objM = new qw.b(aVar, 10, smileyReportLink);
                    sVar.k0(objM);
                }
                m((Function0) objM, sVar, 0);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new qk.e(q0Var, aVar, i11, 16);
        }
    }

    public static final void w(q0 q0Var, m1.a aVar, m3.n nVar, int i11) {
        b5.h hVar;
        m1.a aVar2;
        b5.g gVar;
        m3.s sVar;
        float f11;
        b5.g gVar2;
        c1 c1Var;
        float f12;
        b5.d dVar;
        int i12;
        b4.q qVar;
        int i13;
        q0 q0Var2 = q0Var;
        m1.a aVar3 = aVar;
        q0Var2.getClass();
        aVar3.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-575956780);
        int i14 = i11 | (sVar2.h(q0Var2) ? 4 : 2) | (sVar2.f(aVar3) ? 32 : 16);
        if (sVar2.R(i14 & 1, (i14 & 19) != 18)) {
            BasicItem basicItem = q0Var2.f31035a;
            boolean z11 = mv.d.j(basicItem) == ItemState.AVAILABLE || mv.d.j(basicItem) == ItemState.FEW_LEFT;
            d2.d dVar2 = d2.i.f13803c;
            b4.i iVar = b4.d.f5694m;
            d2.y yVarA = d2.w.a(dVar2, iVar, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            b4.q qVar2 = b4.q.f5711a;
            b4.t tVarC = b4.a.c(qVar2, sVar2);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar2);
            } else {
                sVar2.n0();
            }
            b5.g gVar3 = b5.i.f5843f;
            m3.i.C(yVarA, gVar3, sVar2);
            b5.g gVar4 = b5.i.f5842e;
            m3.i.C(iVarL, gVar4, sVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar5 = b5.i.f5844g;
            m3.i.v(sVar2, numValueOf, gVar5);
            b5.d dVar3 = b5.i.f5845h;
            m3.i.z(sVar2, dVar3);
            b5.g gVar6 = b5.i.f5841d;
            m3.i.C(tVarC, gVar6, sVar2);
            b4.t tVarD = m2.d(qVar2, 1.0f);
            long j9 = lv.s.J;
            i4.r0 r0Var = g0.f23254b;
            b4.t tVarJ = v1.n.j(tVarD, j9, r0Var);
            b4.k kVar = b4.d.f5683a;
            u0 u0VarD = d2.p.d(kVar, false);
            int iHashCode2 = Long.hashCode(sVar2.T);
            u3.i iVarL2 = sVar2.l();
            b4.t tVarC2 = b4.a.c(tVarJ, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar2);
            } else {
                sVar2.n0();
            }
            m3.i.C(u0VarD, gVar3, sVar2);
            m3.i.C(iVarL2, gVar4, sVar2);
            w.a0.y(iHashCode2, sVar2, gVar5, sVar2, dVar3);
            m3.i.C(tVarC2, gVar6, sVar2);
            b4.t tVarE = m2.e(m2.d(qVar2, 1.0f), 230);
            u0 u0VarD2 = d2.p.d(kVar, false);
            int iHashCode3 = Long.hashCode(sVar2.T);
            u3.i iVarL3 = sVar2.l();
            b4.t tVarC3 = b4.a.c(tVarE, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar2);
            } else {
                sVar2.n0();
            }
            m3.i.C(u0VarD2, gVar3, sVar2);
            m3.i.C(iVarL3, gVar4, sVar2);
            w.a0.y(iHashCode3, sVar2, gVar5, sVar2, dVar3);
            m3.i.C(tVarC3, gVar6, sVar2);
            d2.u uVar = d2.u.f13938a;
            b4.t tVarB = uVar.b();
            String currentUrl = basicItem.getInformation().getCoverPicture().getCurrentUrl();
            n4.b bVarZ = x0.z(R.drawable.gfx_tgtg_logo_green_small, sVar2, 0);
            c1 c1Var2 = z4.l.f47166a;
            gd.o.c(currentUrl, null, tVarB, null, bVarZ, null, c1Var2, 0.0f, null, sVar2, 32816, 6, 31720);
            d2.p.a(v1.n.i(uVar.b(), qb.e.I(kotlin.collections.d0.h(new i4.v(i4.v.f23314g), new i4.v(i4.v.b(0.4f, i4.v.f23309b))), 100.0f, 0.0f, 12), 0.0f, 6), sVar2, 0);
            if (z11) {
                sVar2.a0(-1516559572);
                sVar2.q(false);
            } else {
                sVar2.a0(-1516770992);
                d2.p.a(v1.n.j(uVar.b(), lv.s.U, r0Var), sVar2, 0);
                sVar2.q(false);
            }
            sVar2.q(true);
            float f13 = 56;
            d2.c.f(m2.e(d2.c.E(m2.d(qVar2, 1.0f)), f13), sVar2);
            b4.t tVarA = uVar.a(qVar2, b4.d.f5689g);
            float f14 = lv.t.f28253g;
            b4.t tVarD2 = d2.c.D(tVarA, f14, 0.0f, 0.0f, lv.t.f28252f, 6);
            d2.y yVarA2 = d2.w.a(dVar2, iVar, sVar2, 0);
            int iHashCode4 = Long.hashCode(sVar2.T);
            u3.i iVarL4 = sVar2.l();
            b4.t tVarC4 = b4.a.c(tVarD2, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                hVar = hVar2;
                sVar2.k(hVar);
            } else {
                hVar = hVar2;
                sVar2.n0();
            }
            m3.i.C(yVarA2, gVar3, sVar2);
            m3.i.C(iVarL4, gVar4, sVar2);
            w.a0.y(iHashCode4, sVar2, gVar5, sVar2, dVar3);
            m3.i.C(tVarC4, gVar6, sVar2);
            float f15 = lv.t.f28251e;
            i2 i2VarA = h2.a(d2.i.g(f15), b4.d.f5692j, sVar2, 6);
            int iHashCode5 = Long.hashCode(sVar2.T);
            u3.i iVarL5 = sVar2.l();
            b4.t tVarC5 = b4.a.c(qVar2, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(i2VarA, gVar3, sVar2);
            m3.i.C(iVarL5, gVar4, sVar2);
            w.a0.y(iHashCode5, sVar2, gVar5, sVar2, dVar3);
            m3.i.C(tVarC5, gVar6, sVar2);
            List<ItemTagInfo> itemTags = basicItem.getItemTags();
            m3.f fVar = m3.m.f29332a;
            if (itemTags == null) {
                sVar2.a0(892189555);
                sVar2.q(false);
                gVar = gVar5;
                sVar = sVar2;
                aVar2 = aVar;
                f11 = f15;
                gVar2 = gVar6;
                c1Var = c1Var2;
                f12 = f13;
                qVar = qVar2;
                i13 = 0;
                i12 = 32;
                dVar = dVar3;
            } else {
                sVar2.a0(892189556);
                boolean z12 = (i14 & 112) == 32;
                Object objM = sVar2.M();
                if (z12 || objM == fVar) {
                    aVar2 = aVar;
                    objM = new z0(aVar2, 23);
                    sVar2.k0(objM);
                } else {
                    aVar2 = aVar;
                }
                gVar = gVar5;
                sVar = sVar2;
                f11 = f15;
                gVar2 = gVar6;
                c1Var = c1Var2;
                f12 = f13;
                dVar = dVar3;
                i12 = 32;
                bg.m.d(qVar2, itemTags, (Function1) objM, sVar, 6, 0);
                qVar = qVar2;
                i13 = 0;
                sVar.q(false);
            }
            sVar.q(true);
            d2.c.f(m2.m(qVar, f14), sVar);
            String strU = f0.U(sVar, R.string.screen_reader_item_view_open_store_page);
            b4.j jVar = b4.d.f5693k;
            j5.j jVar2 = new j5.j(i13);
            boolean zH = ((i14 & 112) == i12) | sVar.h(q0Var);
            Object objM2 = sVar.M();
            if (zH || objM2 == fVar) {
                objM2 = new f(aVar2, q0Var, 4);
                sVar.k0(objM2);
            }
            b4.t tVarC6 = androidx.compose.foundation.b.c(qVar, false, strU, jVar2, (Function0) objM2, 9);
            i2 i2VarA2 = h2.a(d2.i.f13801a, jVar, sVar, 48);
            int iHashCode6 = Long.hashCode(sVar.T);
            u3.i iVarL6 = sVar.l();
            b4.t tVarC7 = b4.a.c(tVarC6, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA2, gVar3, sVar);
            m3.i.C(iVarL6, gVar4, sVar);
            w.a0.y(iHashCode6, sVar, gVar, sVar, dVar);
            m3.i.C(tVarC7, gVar2, sVar);
            l2.f fVar2 = l2.g.f26790a;
            b4.t tVarM = m2.m(v1.n.k(f4.g.b(qVar, fVar2), 1, lv.s.H, fVar2), f12);
            m3.s sVar3 = sVar;
            aVar3 = aVar2;
            q0Var2 = q0Var;
            gd.o.c(mv.d.k(basicItem).getCurrentUrl(), null, tVarM, null, x0.z(R.drawable.gfx_tgtg_logo_green_small, sVar, 0), null, c1Var, 0.0f, null, sVar3, 32816, 6, 31720);
            d2.c.f(m2.m(qVar, f11), sVar3);
            String storeNameAndBranch = mv.d.m(basicItem).getStoreNameAndBranch();
            if (storeNameAndBranch == null) {
                storeNameAndBranch = "";
            }
            r9.d(storeNameAndBranch, null, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28270i, sVar3, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            sVar2 = sVar3;
            sVar2.q(true);
            sVar2.q(true);
            sVar2.q(true);
            sVar2.q(true);
        } else {
            sVar2.U();
        }
        w1 w1VarS = sVar2.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new qk.e(q0Var2, aVar3, i11, 17);
        }
    }

    public static final void x(q0 q0Var, m1.a aVar, m3.n nVar, int i11) {
        m1.a aVar2;
        boolean z11;
        n4.b bVarZ;
        q0Var.getClass();
        aVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1942124434);
        int i12 = i11 | (sVar.h(q0Var) ? 4 : 2) | (sVar.f(aVar) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            BasicItem basicItem = q0Var.f31035a;
            boolean z12 = mv.d.j(basicItem) == ItemState.AVAILABLE || mv.d.j(basicItem) == ItemState.FEW_LEFT;
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC = b4.a.c(qVar, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(qVar, sVar);
            sVar.e0();
            boolean z13 = z12;
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            if (basicItem.getItemType() == ItemType.TABLE_RESERVATION) {
                sVar.a0(179035557);
                z11 = false;
                bVarZ = x0.z(R.drawable.ic_table, sVar, 0);
                sVar.q(false);
            } else {
                z11 = false;
                sVar.a0(179122357);
                bVarZ = x0.z(R.drawable.system_icon_surprise_bag, sVar, 0);
                sVar.q(false);
            }
            v1.n.d(bVarZ, null, null, null, null, 0.0f, z13 ? null : new i4.o(lv.s.D, 5), sVar, 56, 60);
            d2.c.f(m2.m(qVar, lv.t.f28251e), sVar);
            String strI = mv.r0.i((Context) sVar.j(v0.f7390b), basicItem);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            r9.d(strI, new n1(1.0f, true), 0L, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, 0, 12582912, 130044);
            sVar = sVar;
            sVar.q(true);
            d2.c.f(m2.m(qVar, lv.t.f28249c), sVar);
            o(q0Var, sVar, i12 & 14);
            if (basicItem instanceof FlashSalesItem) {
                sVar.a0(-1463620501);
                aVar2 = aVar;
                k(basicItem, aVar2, sVar, i12 & 112);
                sVar.q(false);
            } else {
                aVar2 = aVar;
                sVar.a0(-1463516651);
                if (mv.d.p(basicItem)) {
                    sVar.a0(-1463477994);
                    M(basicItem, sVar, 0);
                    sVar.q(false);
                } else {
                    sVar.a0(-1463404648);
                    f(basicItem, sVar, 0);
                    sVar.q(false);
                }
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            aVar2 = aVar;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new qk.e(q0Var, aVar2, i11, 18);
        }
    }

    public static final void y(q0 q0Var, m1.a aVar, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(531900667);
        int i12 = (sVar.h(q0Var) ? 4 : 2) | i11 | (sVar.f(aVar) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            Context context = (Context) sVar.j(v0.f7390b);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) sVar.j(w8.g.f43289a);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = new rt.a();
                sVar.k0(objM);
            }
            rt.a aVar2 = (rt.a) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                aVar2.getClass();
                context.getClass();
                objM2 = new rt.f(context);
                sVar.k0(objM2);
            }
            rt.f fVar2 = (rt.f) objM2;
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = fVar2.f38239a;
                sVar.k0(objM3);
            }
            View view = (View) objM3;
            boolean zH = sVar.h(fVar2) | sVar.h(lifecycleOwner);
            Object objM4 = sVar.M();
            if (zH || objM4 == fVar) {
                objM4 = new j(fVar2, lifecycleOwner, 0);
                sVar.k0(objM4);
            }
            m3.i.d(lifecycleOwner, (Function1) objM4, sVar);
            LatLngInfo latLngInfo = q0Var.f31035a.getPickupLocation().getLatLngInfo();
            String currentUrl = mv.d.k(q0Var.f31035a).getCurrentUrl();
            boolean zF = sVar.f(latLngInfo) | sVar.h(fVar2) | sVar.f(currentUrl) | sVar.h(context);
            Object objM5 = sVar.M();
            if (zF || objM5 == fVar) {
                co.n nVar2 = new co.n(latLngInfo, fVar2, currentUrl, context, null, 7);
                sVar.k0(nVar2);
                objM5 = nVar2;
            }
            m3.i.g(latLngInfo, currentUrl, (Function2) objM5, sVar);
            String strU = f0.U(sVar, R.string.screen_reader_item_view_directions_map);
            String strU2 = f0.U(sVar, R.string.screen_reader_item_view_directions_map_tap);
            b4.q qVar = b4.q.f5711a;
            b4.t tVarB = f4.g.b(m2.e(m2.d(qVar, 1.0f), 120), l2.g.b(lv.t.f28252f));
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
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
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            b4.t tVarE = m2.e(m2.d(qVar, 1.0f), 160);
            boolean zH2 = sVar.h(view);
            Object objM6 = sVar.M();
            if (zH2 || objM6 == fVar) {
                objM6 = new nv.d(1, view);
                sVar.k0(objM6);
            }
            c6.r.b((Function1) objM6, tVarE, null, sVar, 48, 4);
            d2.p.a(b4.a.a(d2.u.f13938a.b(), c5.m2.f7291a, new fg.f(r8.k.m(strU, " ", strU2), latLngInfo, aVar, 3)), sVar, 0);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new qk.e(q0Var, aVar, i11, 14);
        }
    }

    public static final void z(final m1.a aVar, final Function0 function0, m3.n nVar, int i11) {
        aVar.getClass();
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1890672242);
        int i12 = (sVar.f(aVar) ? 4 : 2) | i11;
        final int i13 = 1;
        final int i14 = 0;
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.TRUE);
                sVar.k0(objM);
            }
            final b1 b1Var = (b1) objM;
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.a0(-815458280);
                Integer numValueOf = Integer.valueOf(R.string.notification_settings_push_notifications_body);
                int i15 = i12 & 14;
                boolean z11 = i15 == 4;
                Object objM2 = sVar.M();
                if (z11 || objM2 == fVar) {
                    objM2 = new Function0() { // from class: rk.t
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i14) {
                                case 0:
                                    b1Var.setValue(Boolean.FALSE);
                                    function0.invoke();
                                    f2 f2Var = (f2) aVar.f28697a;
                                    ((m1) f2Var.f16653f).i(new ok.i(true));
                                    break;
                                default:
                                    b1Var.setValue(Boolean.FALSE);
                                    function0.invoke();
                                    f2 f2Var2 = (f2) aVar.f28697a;
                                    ((m1) f2Var2.f16653f).i(new ok.i(false));
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    };
                    sVar.k0(objM2);
                }
                Function0 function02 = (Function0) objM2;
                Integer numValueOf2 = Integer.valueOf(R.string.notification_settings_push_notifications_cancel_button);
                boolean z12 = i15 == 4;
                Object objM3 = sVar.M();
                if (z12 || objM3 == fVar) {
                    objM3 = new Function0() { // from class: rk.t
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i13) {
                                case 0:
                                    b1Var.setValue(Boolean.FALSE);
                                    function0.invoke();
                                    f2 f2Var = (f2) aVar.f28697a;
                                    ((m1) f2Var.f16653f).i(new ok.i(true));
                                    break;
                                default:
                                    b1Var.setValue(Boolean.FALSE);
                                    function0.invoke();
                                    f2 f2Var2 = (f2) aVar.f28697a;
                                    ((m1) f2Var2.f16653f).i(new ok.i(false));
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    };
                    sVar.k0(objM3);
                }
                cg.j.i(null, numValueOf, null, null, R.string.notification_settings_push_notifications_confirm_button, 0L, function02, numValueOf2, (Function0) objM3, 0L, 0L, null, null, null, sVar, 0, 0, 15917);
                sVar = sVar;
                sVar.q(false);
            } else {
                sVar.a0(-814847084);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new kq.c(aVar, function0, i11, 29);
        }
    }
}
