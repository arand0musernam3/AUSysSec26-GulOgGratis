package ii;

import android.content.Context;
import c5.v0;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.order.Order;
import d2.h2;
import d2.i2;
import d2.m2;
import g3.r9;
import g3.s0;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import m3.d3;
import m3.w1;
import mv.p0;
import o00.x0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class q {
    /* JADX WARN: Type inference failed for: r5v11, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v15, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v22, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v26, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v30, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v34, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v38, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v42, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v46, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v50, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v52, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v56, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v58, types: [T, java.lang.String] */
    public static final void a(int i11, b4.t tVar, Order order, Function0 function0, m3.n nVar) {
        m3.s sVar;
        b4.t tVar2;
        order.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(1279356086);
        int i12 = i11 | 6 | (sVar2.h(order) ? 32 : 16) | (sVar2.h(function0) ? 256 : 128);
        if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Ref.LongRef longRef = new Ref.LongRef();
            longRef.element = lv.s.J;
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            switch (p.$EnumSwitchMapping$0[order.getState().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    sVar2.a0(-242259574);
                    d3 d3Var = v0.f7390b;
                    Context context = (Context) sVar2.j(d3Var);
                    PickupInterval pickupInterval = order.getPickupInterval();
                    String strE = p0.e(context, pickupInterval != null ? pickupInterval.getIntervalStart() : null);
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String strU = o30.f0.U(sVar2, R.string.order_status_collect_info_certain_date);
                    Context context2 = (Context) sVar2.j(d3Var);
                    PickupInterval pickupInterval2 = order.getPickupInterval();
                    String strG = p0.G(context2, pickupInterval2 != null ? pickupInterval2.getIntervalStart() : null);
                    Context context3 = (Context) sVar2.j(d3Var);
                    PickupInterval pickupInterval3 = order.getPickupInterval();
                    pickupInterval3.getClass();
                    objectRef2.element = String.format(strU, Arrays.copyOf(new Object[]{strE, strG, p0.G(context3, pickupInterval3.getIntervalEnd())}, 3));
                    sVar2.q(false);
                    break;
                case 4:
                    sVar2.a0(-241600576);
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    objectRef2.element = String.format(o30.f0.U(sVar2, R.string.order_list_item_label_purchased_on), Arrays.copyOf(new Object[]{p0.e((Context) sVar2.j(v0.f7390b), order.getTimeOfPurchase())}, 1));
                    sVar2.q(false);
                    break;
                case 5:
                    sVar2.a0(-241237969);
                    objectRef2.element = o30.f0.T(R.string.order_list_item_label_purchased_on, new Object[]{p0.e((Context) sVar2.j(v0.f7390b), order.getTimeOfPurchase())}, sVar2);
                    sVar2.q(false);
                    break;
                case 6:
                    sVar2.a0(-240886708);
                    longRef.element = lv.s.f28221d;
                    objectRef.element = Integer.valueOf(R.drawable.system_icon_order_list_status_collected);
                    StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                    objectRef2.element = String.format(o30.f0.U(sVar2, R.string.order_list_status_collected), Arrays.copyOf(new Object[]{p0.e((Context) sVar2.j(v0.f7390b), order.getTimeOfPurchase())}, 1));
                    sVar2.q(false);
                    break;
                case 7:
                case 8:
                    sVar2.a0(-240383826);
                    longRef.element = lv.s.D;
                    objectRef.element = Integer.valueOf(R.drawable.system_icon_order_list_status_refund);
                    StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                    objectRef2.element = String.format(o30.f0.U(sVar2, R.string.order_list_status_refunded), Arrays.copyOf(new Object[]{p0.e((Context) sVar2.j(v0.f7390b), order.getTimeOfPurchase())}, 1));
                    sVar2.q(false);
                    break;
                case 9:
                case 10:
                    sVar2.a0(-239873876);
                    longRef.element = lv.s.f28231k;
                    objectRef.element = Integer.valueOf(R.drawable.system_icon_order_status_cancelled);
                    StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
                    objectRef2.element = String.format(o30.f0.U(sVar2, R.string.order_list_item_label_cancelled_on), Arrays.copyOf(new Object[]{p0.e((Context) sVar2.j(v0.f7390b), order.getTimeOfPurchase())}, 1));
                    sVar2.q(false);
                    break;
                case 11:
                    sVar2.a0(-239401467);
                    longRef.element = lv.s.D;
                    objectRef.element = Integer.valueOf(R.drawable.system_icon_order_list_status_unconfirmed);
                    objectRef2.element = o30.f0.U(sVar2, R.string.order_list_item_label_not_unredeemed);
                    sVar2.q(false);
                    break;
                case 12:
                    sVar2.a0(-239134650);
                    longRef.element = lv.s.D;
                    objectRef.element = Integer.valueOf(R.drawable.system_icon_order_list_status_uncollected);
                    objectRef2.element = o30.f0.U(sVar2, R.string.order_list_item_label_not_collected);
                    sVar2.q(false);
                    break;
                default:
                    sVar2.a0(-238894462);
                    sVar2.q(false);
                    break;
            }
            float f11 = lv.t.f28253g;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarB = d2.c.B(qVar, f11, 0.0f, 2);
            b4.k kVar = b4.d.f5688f;
            u0 u0VarD = d2.p.d(kVar, false);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            b4.t tVarC = b4.a.c(tVarB, sVar2);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar2, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar2);
            s0.b(b4.a.a(m2.d(qVar, 1.0f), c5.m2.f7291a, new bm.f(15, function0)), l2.g.b(lv.t.f28247a), s0.p(lv.s.X, sVar2, 6), null, null, u3.e.e(-569527106, sVar2, new cn.x(order, objectRef2, objectRef, longRef)), sVar2, 196608, 24);
            v1.n.d(x0.z(R.drawable.ic_chevron_right, sVar2, 0), null, m2.m(qVar, 30), kVar, null, 0.0f, new i4.o(lv.s.C, 5), sVar2, 1576376, 48);
            sVar = sVar2;
            sVar.q(true);
            tVar2 = qVar;
        } else {
            sVar = sVar2;
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new n(tVar2, order, function0, i11, 0);
        }
    }

    public static final void b(final b4.t tVar, final String str, final String str2, final String str3, Integer num, final long j9, m3.n nVar, final int i11, final int i12) {
        Integer num2;
        int i13;
        final Integer num3;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-141479658);
        int i14 = i11 | (sVar.f(tVar) ? 4 : 2) | (sVar.f(str) ? 32 : 16) | (sVar.f(str2) ? 256 : 128) | (sVar.f(str3) ? NewHope.SENDB_BYTES : 1024);
        int i15 = i12 & 16;
        if (i15 != 0) {
            i13 = i14 | 24576;
            num2 = num;
        } else {
            num2 = num;
            i13 = i14 | (sVar.f(num2) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        }
        if ((i11 & 196608) == 0) {
            i13 |= sVar.e(j9) ? 131072 : 65536;
        }
        if (sVar.R(i13 & 1, (74899 & i13) != 74898)) {
            Integer num4 = i15 != 0 ? null : num2;
            b4.t tVarD = m2.d(tVar, 1.0f);
            b4.j jVar = b4.d.f5693k;
            i2 i2VarA = h2.a(d2.i.f13801a, jVar, sVar, 48);
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
            m3.i.C(i2VarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            u0 u0VarD = d2.p.d(b4.d.f5691i, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.q qVar = b4.q.f5711a;
            int i16 = i13;
            b4.t tVarC2 = b4.a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            l2.f fVar = l2.g.f26790a;
            gd.o.c(str, null, v1.n.j(v1.n.k(m2.m(f4.g.b(qVar, fVar), 48), 1, j9, fVar), lv.s.J, i4.g0.f23254b), x0.z(R.drawable.gfx_tgtg_logo_green_small, sVar, 0), null, null, z4.l.f47172g, 0.0f, null, sVar, ((i16 >> 3) & 14) | 4144, 6, 31728);
            if (num4 == null) {
                sVar.a0(1759448727);
                sVar.q(false);
            } else {
                sVar.a0(1759448728);
                v1.n.d(x0.z(num4.intValue(), sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
                sVar.q(false);
            }
            sVar.q(true);
            b4.t tVarG = b3.i.g(jVar, d2.c.B(qVar, lv.t.f28253g, 0.0f, 2));
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            b4.t tVarC3 = b4.a.c(tVarG, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            w.a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            m5.u0 u0Var = lv.v.f28277q;
            long j11 = lv.s.C;
            r9.d(str2, null, j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, ((i16 >> 6) & 14) | MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            sVar = sVar;
            if (str3 == null) {
                sVar.a0(806328333);
                sVar.q(false);
            } else {
                sVar.a0(806328334);
                r9.d(str3, d2.c.D(qVar, 0.0f, lv.t.f28249c, 0.0f, 0.0f, 13), j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar, 432, 12582912, 131064);
                sVar = sVar;
                sVar.q(false);
            }
            sVar.q(true);
            sVar.q(true);
            num3 = num4;
        } else {
            sVar.U();
            num3 = num2;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: ii.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q.b(tVar, str, str2, str3, num3, j9, (m3.n) obj, m3.i.F(i11 | 1), i12);
                    return Unit.f26487a;
                }
            };
        }
    }
}
