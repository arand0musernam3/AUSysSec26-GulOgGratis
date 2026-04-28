package mo;

import b4.j;
import b4.q;
import b5.g;
import b5.h;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderState;
import com.app.tgtg.model.remote.order.OrderType;
import d2.h2;
import d2.i;
import d2.i2;
import d2.m2;
import d2.w;
import d2.y;
import d2.z;
import d40.t1;
import g3.r9;
import g3.s0;
import gd.o;
import i80.n;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l2.f;
import lv.t;
import lv.v;
import m3.s;
import o00.x0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import w.a0;
import z4.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Order f30056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f30057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f30058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f30059e;

    public /* synthetic */ d(Order order, String str, boolean z11, n nVar, int i11) {
        this.f30055a = i11;
        this.f30056b = order;
        this.f30057c = str;
        this.f30058d = z11;
        this.f30059e = nVar;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        j jVar;
        g gVar;
        b5.d dVar;
        h hVar;
        g gVar2;
        g gVar3;
        g gVar4;
        int i11;
        boolean z11;
        switch (this.f30055a) {
            case 0:
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    float f11 = t.f28249c;
                    q qVar = q.f5711a;
                    b4.t tVarZ = d2.c.z(qVar, f11);
                    y yVarA = w.a(i.f13803c, b4.d.f5694m, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    b4.t tVarC = b4.a.c(tVarZ, sVar);
                    b5.j.R.getClass();
                    h hVar2 = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar2);
                    } else {
                        sVar.n0();
                    }
                    g gVar5 = b5.i.f5843f;
                    m3.i.C(yVarA, gVar5, sVar);
                    g gVar6 = b5.i.f5842e;
                    m3.i.C(iVarL, gVar6, sVar);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    g gVar7 = b5.i.f5844g;
                    m3.i.v(sVar, numValueOf, gVar7);
                    b5.d dVar2 = b5.i.f5845h;
                    m3.i.z(sVar, dVar2);
                    g gVar8 = b5.i.f5841d;
                    m3.i.C(tVarC, gVar8, sVar);
                    d2.e eVar = i.f13805e;
                    float f12 = 10;
                    b4.t tVarD = m2.d(d2.c.D(qVar, 0.0f, f12, 0.0f, f12, 5), 1.0f);
                    i2 i2VarA = h2.a(eVar, b4.d.f5692j, sVar, 6);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    u3.i iVarL2 = sVar.l();
                    b4.t tVarC2 = b4.a.c(tVarD, sVar);
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar2);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(i2VarA, gVar5, sVar);
                    m3.i.C(iVarL2, gVar6, sVar);
                    a0.y(iHashCode2, sVar, gVar7, sVar, dVar2);
                    m3.i.C(tVarC2, gVar8, sVar);
                    Order order = this.f30056b;
                    OrderState state = order.getState();
                    Integer numValueOf2 = Integer.valueOf(R.drawable.system_icon_collected);
                    state.getClass();
                    int i12 = e.$EnumSwitchMapping$1[state.ordinal()];
                    if (i12 == 4) {
                        numValueOf2 = Integer.valueOf(R.drawable.system_icon_cancelled);
                    } else if (i12 == 5 || i12 == 6) {
                        numValueOf2 = Integer.valueOf(R.drawable.system_icon_refunded);
                    }
                    sVar.a0(-950888851);
                    v1.n.d(x0.z(numValueOf2.intValue(), sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
                    sVar.q(false);
                    t1.a(order, sVar, 0);
                    sVar.q(true);
                    s0.b(m2.d(qVar, 1.0f), l2.g.b(12), s0.p(lv.s.J, sVar, 6), null, null, u3.e.e(2077193111, sVar, new d(order, this.f30057c, this.f30058d, this.f30059e, 1)), sVar, 196614, 24);
                    sVar.q(true);
                } else {
                    sVar.U();
                }
                break;
            default:
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                j jVar2 = b4.d.f5692j;
                ((z) obj).getClass();
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    float f13 = t.f28254h;
                    q qVar2 = q.f5711a;
                    b4.t tVarZ2 = d2.c.z(qVar2, f13);
                    y yVarA2 = w.a(i.f13803c, b4.d.f5694m, sVar2, 0);
                    int iHashCode3 = Long.hashCode(sVar2.T);
                    u3.i iVarL3 = sVar2.l();
                    b4.t tVarC3 = b4.a.c(tVarZ2, sVar2);
                    b5.j.R.getClass();
                    h hVar3 = b5.i.f5839b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar3);
                    } else {
                        sVar2.n0();
                    }
                    g gVar9 = b5.i.f5843f;
                    m3.i.C(yVarA2, gVar9, sVar2);
                    g gVar10 = b5.i.f5842e;
                    m3.i.C(iVarL3, gVar10, sVar2);
                    Integer numValueOf3 = Integer.valueOf(iHashCode3);
                    g gVar11 = b5.i.f5844g;
                    m3.i.v(sVar2, numValueOf3, gVar11);
                    b5.d dVar3 = b5.i.f5845h;
                    m3.i.z(sVar2, dVar3);
                    g gVar12 = b5.i.f5841d;
                    m3.i.C(tVarC3, gVar12, sVar2);
                    Order order2 = this.f30056b;
                    if (Intrinsics.areEqual(order2.isMultiItem(), Boolean.TRUE)) {
                        jVar = jVar2;
                        gVar = gVar10;
                        dVar = dVar3;
                        hVar = hVar3;
                        gVar2 = gVar9;
                        gVar3 = gVar12;
                        gVar4 = gVar11;
                        sVar2.a0(-213729215);
                        sVar2.q(false);
                    } else {
                        sVar2.a0(-215040980);
                        b4.t tVarD2 = m2.d(qVar2, 1.0f);
                        i2 i2VarA2 = h2.a(i.f13801a, jVar2, sVar2, 0);
                        int iHashCode4 = Long.hashCode(sVar2.T);
                        u3.i iVarL4 = sVar2.l();
                        b4.t tVarC4 = b4.a.c(tVarD2, sVar2);
                        sVar2.e0();
                        jVar = jVar2;
                        if (sVar2.S) {
                            sVar2.k(hVar3);
                        } else {
                            sVar2.n0();
                        }
                        m3.i.C(i2VarA2, gVar9, sVar2);
                        m3.i.C(iVarL4, gVar10, sVar2);
                        a0.y(iHashCode4, sVar2, gVar11, sVar2, dVar3);
                        m3.i.C(tVarC4, gVar12, sVar2);
                        b4.t tVarM = m2.m(qVar2, 48);
                        f fVar = l2.g.f26790a;
                        b4.t tVarK = v1.n.k(f4.g.b(tVarM, fVar), 1, lv.s.H, fVar);
                        Picture itemCoverImage = order2.getItemCoverImage();
                        String currentUrl = itemCoverImage != null ? itemCoverImage.getCurrentUrl() : null;
                        gVar2 = gVar9;
                        gVar = gVar10;
                        dVar = dVar3;
                        gVar4 = gVar11;
                        hVar = hVar3;
                        o.c(currentUrl, null, tVarK, x0.z(R.drawable.gfx_tgtg_logo_green_small, sVar2, 0), null, null, l.f47166a, 0.0f, null, sVar2, 4144, 6, 31728);
                        float f14 = t.f28251e;
                        b4.t tVarG = b3.i.g(b4.d.f5693k, d2.c.D(qVar2, f14, 0.0f, f14, 0.0f, 10));
                        String itemName = order2.getItemName();
                        if (itemName == null) {
                            itemName = "";
                        }
                        gVar3 = gVar12;
                        qVar2 = qVar2;
                        r9.d(itemName, tVarG, lv.s.C, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, v.l, sVar2, MLKEMEngine.KyberPolyBytes, 12607872, 110584);
                        sVar2 = sVar2;
                        sVar2.q(true);
                        sVar2.q(false);
                    }
                    d2.c.f(m2.e(qVar2, f13), sVar2);
                    t1.b(f0.U(sVar2, R.string.mnu_order_header_order_date), this.f30057c, f0.U(sVar2, R.string.mnu_order_header_order_id), order2.m429getOrderIdreIZeYA(), sVar2, 0);
                    d2.c.f(m2.e(qVar2, f13), sVar2);
                    if (order2.getState() == OrderState.ACTIVE || order2.getState() == OrderState.SHIPPED || order2.getState() == OrderState.DELIVERED) {
                        i11 = 0;
                        sVar2.a0(-213027716);
                        t1.k(order2, this.f30058d, sVar2, 0);
                        sVar2.q(false);
                    } else {
                        sVar2.a0(-212930655);
                        i11 = 0;
                        sVar2.q(false);
                    }
                    bx.o.g(order2, this.f30059e, sVar2, i11);
                    d2.c.f(m2.e(qVar2, f13), sVar2);
                    t1.b(f0.U(sVar2, R.string.mnu_order_header_payment_method), order2.getPaymentMethodDisplayName(), null, null, sVar2, 3456);
                    if (order2.getOrderType() == OrderType.CATERING && order2.isRated()) {
                        sVar2.a0(-212405763);
                        b4.t tVarD3 = d2.c.D(qVar2, 0.0f, 16, 0.0f, 0.0f, 13);
                        i2 i2VarA3 = h2.a(i.f13801a, jVar, sVar2, 0);
                        int iHashCode5 = Long.hashCode(sVar2.T);
                        u3.i iVarL5 = sVar2.l();
                        b4.t tVarC5 = b4.a.c(tVarD3, sVar2);
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(hVar);
                        } else {
                            sVar2.n0();
                        }
                        m3.i.C(i2VarA3, gVar2, sVar2);
                        m3.i.C(iVarL5, gVar, sVar2);
                        a0.y(iHashCode5, sVar2, gVar4, sVar2, dVar);
                        m3.i.C(tVarC5, gVar3, sVar2);
                        Integer overallRating = order2.getOverallRating();
                        s sVar3 = sVar2;
                        cp.a.i(overallRating != null ? overallRating.intValue() : 0, false, null, 0L, 0L, null, sVar3, 0, 254);
                        sVar2 = sVar3;
                        z11 = true;
                        sVar2.q(true);
                        sVar2.q(false);
                    } else {
                        z11 = true;
                        sVar2.a0(-212217407);
                        sVar2.q(false);
                    }
                    sVar2.q(z11);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
