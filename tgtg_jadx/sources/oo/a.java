package oo;

import a3.d0;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.DashPathEffect;
import android.view.animation.DecelerateInterpolator;
import c5.a1;
import c5.v0;
import c5.x1;
import cg.q0;
import com.app.tgtg.R;
import com.app.tgtg.feature.orderview.OrderSwiper;
import com.app.tgtg.model.remote.invitation.Invitation;
import com.app.tgtg.model.remote.invitation.InvitationState;
import com.app.tgtg.model.remote.invitation.OrderDataForInvitation;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.CancellingEntity;
import com.app.tgtg.model.remote.item.response.PackagingOptions;
import com.app.tgtg.model.remote.item.response.PaymentState;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderState;
import com.app.tgtg.model.remote.order.OrderType;
import com.app.tgtg.model.remote.payment.Price;
import d2.b2;
import d2.h2;
import d2.i2;
import d2.k2;
import d2.m2;
import d40.t1;
import g3.a2;
import g3.b9;
import g3.r1;
import g3.r9;
import g3.s0;
import g3.v3;
import g3.w6;
import g3.w7;
import g3.x7;
import g3.z7;
import i4.g0;
import i4.k0;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.b1;
import m3.h1;
import m3.w1;
import m5.l0;
import m90.z0;
import mv.p0;
import o00.x0;
import o30.e0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import z4.c0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f32725a = new u3.d(new o9.a(4), false, -663853843);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u3.d f32726b = new u3.d(new o9.a(5), false, 429645245);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u3.d f32727c = new u3.d(new o9.a(6), false, 1704706046);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u3.d f32728d = new u3.d(new o9.a(7), false, -1444603072);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u3.d f32729e = new u3.d(new o9.a(8), false, 1012407645);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u3.d f32730f = new u3.d(new o60.a(10), false, 1329554148);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u3.d f32731g = new u3.d(new o9.a(9), false, 373955928);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u3.d f32732h = new u3.d(new o9.a(10), false, 1797260170);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final u3.d f32733i = new u3.d(new o9.a(11), false, 996389257);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final u3.d f32734j = new u3.d(new o9.a(12), false, -1174455017);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final u3.d f32735k = new u3.d(new o60.a(11), false, -1749875771);
    public static final u3.d l = new u3.d(new d0(6), false, -772513392);

    public static final void A(Function0 function0, m3.n nVar, int i11) {
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-2113732923);
        int i12 = (sVar.h(function0) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            b4.i iVar = b4.d.f5695n;
            boolean z11 = (i12 & 14) == 4;
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new nn.m(15, function0);
                sVar.k0(objM);
            }
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC = androidx.compose.foundation.b.c(qVar, false, null, null, (Function0) objM, 15);
            d2.y yVarA = d2.w.a(d2.i.f13803c, iVar, sVar, 48);
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
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC2, b5.i.f5841d, sVar);
            v1.n.d(x0.z(R.drawable.cx_agent_icon, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
            r9.d(f0.U(sVar, R.string.order_contact_us_button), d2.c.D(qVar, 0.0f, 5, 0.0f, 0.0f, 13), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar, 432, 12582912, 131064);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.z(i11, 13, function0);
        }
    }

    public static final void B(m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-293589617);
        if (sVar.R(i11 & 1, i11 != 0)) {
            s0.b(m2.d(b4.q.f5711a, 1.0f), l2.g.b(12), s0.p(lv.s.f28242w, sVar, 6), s0.q(2, 0.0f, 0.0f, 0.0f, 62), v1.n.b(3, lv.s.f28217b), f32729e, sVar, 221190, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new o60.a(i11, 13);
        }
    }

    public static final void C(int i11, b4.t tVar, String str, String str2, m3.n nVar) {
        m3.s sVar;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(1455807539);
        int i12 = (sVar2.f(str) ? 4 : 2) | i11 | (sVar2.f(str2) ? 32 : 16);
        if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
            m5.e eVar = new m5.e();
            eVar.c(str);
            eVar.c(" ");
            int i13 = eVar.i(lv.u.f28260a);
            try {
                eVar.c(str2);
                eVar.g(i13);
                sVar = sVar2;
                r9.e(eVar.j(), d2.c.D(tVar, 0.0f, 2, 0.0f, 0.0f, 13), lv.s.C, 0L, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, null, lv.v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 100663296, 261112);
            } catch (Throwable th2) {
                eVar.g(i13);
                throw th2;
            }
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lp.p(str, str2, tVar, i11);
        }
    }

    public static final void D(String str, Price price, Price price2, Double d3, m3.n nVar, int i11) {
        m3.s sVar;
        String strJ;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(1109859450);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2) | (sVar2.f(price) ? 32 : 16) | (sVar2.f(price2) ? 256 : 128) | (sVar2.f(d3) ? NewHope.SENDB_BYTES : 1024);
        if (sVar2.R(i12 & 1, (i12 & 1171) != 1170)) {
            float f11 = 24;
            b4.t tVarT = m2.t(d2.c.B(b4.q.f5711a, f11, 0.0f, 2), 3);
            r9.d(f0.U(sVar2, R.string.checkout_label_payment_method), d2.c.D(tVarT, 0.0f, f11, 0.0f, 0.0f, 13), lv.s.D, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, lv.v.f28279s, sVar2, 432, 12582912, 130040);
            sVar = sVar2;
            if (price == null) {
                sVar.a0(1165159389);
                sVar.q(false);
            } else {
                sVar.a0(1165159390);
                C(MLKEMEngine.KyberPolyBytes, tVarT, str + ":", mv.d.i(price, 1), sVar);
                sVar.q(false);
            }
            if (price2 == null) {
                sVar.a0(1165362687);
                sVar.q(false);
            } else {
                sVar.a0(1165362688);
                if (d3 != null) {
                    sVar.a0(-846110489);
                    strJ = f0.T(R.string.order_discount_payment_method, new Object[]{d70.a.a(d3.doubleValue(), sVar)}, sVar);
                    sVar.q(false);
                } else {
                    strJ = b3.i.j(-845942624, R.string.order_voucher_payment_method, sVar, sVar, false);
                }
                C(MLKEMEngine.KyberPolyBytes, tVarT, strJ, mv.d.i(price2, 1), sVar);
                sVar.q(false);
            }
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lp.v(str, price, i11, price2, d3, 6);
        }
    }

    public static final void E(Long l7, OrderType orderType, Boolean bool, Function0 function0, m3.n nVar, int i11) {
        orderType.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(251491813);
        int i12 = i11 | (sVar.f(l7) ? 4 : 2) | (sVar.d(orderType.ordinal()) ? 32 : 16) | (sVar.f(bool) ? 256 : 128) | (sVar.h(function0) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(new z5.l(0L));
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            k0 k0VarI = qb.e.I(kotlin.collections.d0.h(new i4.v(lv.s.R), new i4.v(lv.s.J)), 0.0f, (int) (((z5.l) b1Var.getValue()).f47286a & 4294967295L), 8);
            b4.q qVar = b4.q.f5711a;
            b4.t tVarI = v1.n.i(qVar, k0VarI, 0.0f, 6);
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new li.c(b1Var, 19);
                sVar.k0(objM2);
            }
            b4.t tVarO = c0.o(tVarI, (Function1) objM2);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
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
            d2.c.f(m2.m(qVar, 12), sVar);
            b4.t tVarD = m2.d(qVar, 1.0f);
            i2 i2VarA = h2.a(d2.i.f13805e, b4.d.f5693k, sVar, 54);
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
            k(l7, orderType, bool, function0, null, sVar, i12 & 8190, 16);
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lp.v(l7, orderType, i11, bool, function0, 5);
        }
    }

    public static final void F(Order order, Function0 function0, m3.n nVar, int i11) {
        w1 w1VarS;
        y yVar;
        boolean z11;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1721287616);
        int i12 = (sVar.h(order) ? 4 : 2) | i11 | (sVar.h(function0) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            Unit unit = null;
            if ((order != null ? order.getPaymentState() : null) == PaymentState.VOUCHER_REINSTATED) {
                sVar.a0(1264966208);
                P(R.string.order_status_reversal_cancel_received, p0.n(order.getCancelledOrRefundedAtUtc()), sVar, 0);
                O(R.string.order_status_reversal_voucher_processed, order.getCancelledOrRefundedAtUtc(), order.getExpectedBankDays(), true, sVar, 3072, 0);
                sVar.q(false);
                w1VarS = sVar.s();
                if (w1VarS != null) {
                    yVar = new y(order, function0, i11, 1);
                    w1VarS.f29476d = yVar;
                }
                return;
            }
            sVar.a0(1265398658);
            sVar.q(false);
            OrderState state = order != null ? order.getState() : null;
            int i13 = state == null ? -1 : b0.$EnumSwitchMapping$2[state.ordinal()];
            m3.f fVar = m3.m.f29332a;
            if (i13 == 1) {
                sVar.a0(1265568848);
                CancellingEntity cancellingEntity = order.getCancellingEntity();
                int i14 = cancellingEntity == null ? -1 : b0.$EnumSwitchMapping$1[cancellingEntity.ordinal()];
                if (i14 == -1) {
                    sVar.a0(595110340);
                    sVar.q(false);
                } else if (i14 == 1) {
                    sVar.a0(1265574955);
                    P(R.string.order_status_reversal_cancel_received, p0.n(order.getCancelledOrRefundedAtUtc()), sVar, 0);
                    O(R.string.order_status_reversal_cancel_processed, order.getCancelledOrRefundedAtUtc(), order.getExpectedBankDays(), false, sVar, 0, 8);
                    String cancelledOrRefundedAtUtc = order.getCancelledOrRefundedAtUtc();
                    if (cancelledOrRefundedAtUtc == null) {
                        sVar.a0(1266111595);
                        sVar.q(false);
                    } else {
                        sVar.a0(1266111596);
                        int expectedBankDays = order.getExpectedBankDays();
                        z11 = (i12 & 112) == 32;
                        Object objM = sVar.M();
                        if (z11 || objM == fVar) {
                            objM = new nn.m(29, function0);
                            sVar.k0(objM);
                        }
                        M(cancelledOrRefundedAtUtc, expectedBankDays, (Function0) objM, sVar, 0);
                        sVar.q(false);
                    }
                    sVar.q(false);
                } else if (i14 == 2) {
                    sVar.a0(1266467011);
                    P(R.string.order_status_reversal_cancel_received_by_store, p0.n(order.getCancelledOrRefundedAtUtc()), sVar, 0);
                    O(R.string.order_status_reversal_cancel_processed, order.getCancelledOrRefundedAtUtc(), order.getExpectedBankDays(), false, sVar, 0, 8);
                    String cancelledOrRefundedAtUtc2 = order.getCancelledOrRefundedAtUtc();
                    if (cancelledOrRefundedAtUtc2 == null) {
                        sVar.a0(1267011339);
                        sVar.q(false);
                    } else {
                        sVar.a0(1267011340);
                        int expectedBankDays2 = order.getExpectedBankDays();
                        z11 = (i12 & 112) == 32;
                        Object objM2 = sVar.M();
                        if (z11 || objM2 == fVar) {
                            objM2 = new z(0, function0);
                            sVar.k0(objM2);
                        }
                        M(cancelledOrRefundedAtUtc2, expectedBankDays2, (Function0) objM2, sVar, 0);
                        sVar.q(false);
                    }
                    sVar.q(false);
                } else if (i14 == 3) {
                    sVar.a0(1267375528);
                    String supportReqCreatedAtUtc = order.getSupportReqCreatedAtUtc();
                    if (supportReqCreatedAtUtc == null) {
                        sVar.a0(1267399273);
                        sVar.q(false);
                    } else {
                        sVar.a0(1267399274);
                        P(R.string.order_status_reversal_support_req_received, p0.n(supportReqCreatedAtUtc), sVar, 0);
                        sVar.q(false);
                        unit = Unit.f26487a;
                    }
                    if (unit == null) {
                        sVar.a0(595081208);
                        P(R.string.order_status_reversal_cancel_received_by_admin, p0.n(order.getCancelledOrRefundedAtUtc()), sVar, 0);
                        sVar.q(false);
                    } else {
                        sVar.a0(595072466);
                        sVar.q(false);
                    }
                    O(R.string.order_status_reversal_cancel_processed, order.getCancelledOrRefundedAtUtc(), order.getExpectedBankDays(), false, sVar, 0, 8);
                    String cancelledOrRefundedAtUtc3 = order.getCancelledOrRefundedAtUtc();
                    if (cancelledOrRefundedAtUtc3 == null) {
                        sVar.a0(1268191819);
                        sVar.q(false);
                    } else {
                        sVar.a0(1268191820);
                        int expectedBankDays3 = order.getExpectedBankDays();
                        boolean z12 = (i12 & 112) == 32;
                        Object objM3 = sVar.M();
                        if (z12 || objM3 == fVar) {
                            objM3 = new z(1, function0);
                            sVar.k0(objM3);
                        }
                        M(cancelledOrRefundedAtUtc3, expectedBankDays3, (Function0) objM3, sVar, 0);
                        sVar.q(false);
                    }
                    sVar.q(false);
                } else {
                    if (i14 != 4) {
                        throw e0.f.v(sVar, 595014130, false);
                    }
                    sVar.a0(595109412);
                    sVar.q(false);
                }
                sVar.q(false);
            } else if (i13 == 2 || i13 == 3) {
                sVar.a0(1268661873);
                String supportReqCreatedAtUtc2 = order.getSupportReqCreatedAtUtc();
                if (supportReqCreatedAtUtc2 == null) {
                    supportReqCreatedAtUtc2 = order.getCancelledOrRefundedAtUtc();
                }
                P(R.string.order_status_reversal_support_req_received, p0.n(supportReqCreatedAtUtc2), sVar, 0);
                O(R.string.order_status_reversal_refund_processed, order.getCancelledOrRefundedAtUtc(), order.getExpectedBankDays(), false, sVar, 0, 8);
                String cancelledOrRefundedAtUtc4 = order.getCancelledOrRefundedAtUtc();
                if (cancelledOrRefundedAtUtc4 == null) {
                    sVar.a0(1269192995);
                    sVar.q(false);
                } else {
                    sVar.a0(1269192996);
                    int expectedBankDays4 = order.getExpectedBankDays();
                    z11 = (i12 & 112) == 32;
                    Object objM4 = sVar.M();
                    if (z11 || objM4 == fVar) {
                        objM4 = new z(2, function0);
                        sVar.k0(objM4);
                    }
                    M(cancelledOrRefundedAtUtc4, expectedBankDays4, (Function0) objM4, sVar, 0);
                    sVar.q(false);
                }
                sVar.q(false);
            } else {
                sVar.a0(595138820);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1VarS = sVar.s();
        if (w1VarS != null) {
            yVar = new y(order, function0, i11, 2);
            w1VarS.f29476d = yVar;
        }
    }

    public static final void G(Order order, Function1 function1, m3.n nVar, int i11) {
        int i12;
        function1.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-19808830);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(order) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function1) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            s0.b(m2.d(b4.q.f5711a, 1.0f), l2.g.b(12), s0.p(lv.s.f28223e, sVar, 6), null, null, u3.e.e(1098298548, sVar, new s(0, (Object) order, (Object) function1)), sVar, 196614, 24);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.x(order, function1, i11, 19);
        }
    }

    public static final void H(b4.t tVar, BasicItem basicItem, Function1 function1, m3.n nVar, int i11) {
        b4.t tVar2;
        function1.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(2086612991);
        int i12 = i11 | 6 | (sVar.h(basicItem) ? 32 : 16) | (sVar.h(function1) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            b4.k kVar = b4.d.f5683a;
            u0 u0VarD = d2.p.d(kVar, false);
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
            d2.u uVar = d2.u.f13938a;
            b4.t tVarA = uVar.a(qVar, kVar);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5695n, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarA, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            r9.d(f0.U(sVar, R.string.order_recommendation_title), null, lv.s.f28215a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28265d, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            d2.c.f(m2.m(qVar, lv.t.f28251e), sVar);
            t1.m(d2.c.B(qVar, lv.t.f28253g, 0.0f, 2), basicItem, false, false, false, false, function1, null, null, sVar, (i12 & 112) | 6 | ((i12 << 12) & 3670016), 444);
            sVar = sVar;
            d2.c.f(m2.m(qVar, lv.t.f28254h), sVar);
            sVar.q(true);
            x0.f((he.k) e0.D(new le.q("map_pin_icon.json"), sVar, 6).getValue(), d2.c.w(uVar.a(m2.m(qVar, 80), b4.d.f5689g), -24, 0.0f, 2), false, 0.0f, Integer.MAX_VALUE, false, null, sVar, 1572864, 0, 4194236);
            sVar.q(true);
            tVar2 = qVar;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ki.h(tVar2, basicItem, function1, false, i11, 15);
        }
    }

    public static final void I(Order order, b4.t tVar, fo.b bVar, w6 w6Var, v80.b0 b0Var, int i11, Function0 function0, m3.n nVar, int i12) {
        m3.s sVar;
        Function0 function02;
        tVar.getClass();
        bVar.getClass();
        b0Var.getClass();
        function0.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-569030067);
        int i13 = i12 | (sVar2.h(order) ? 4 : 2) | (sVar2.f(tVar) ? 32 : 16) | (sVar2.f(bVar) ? 256 : 128) | (sVar2.f(w6Var) ? NewHope.SENDB_BYTES : 1024) | (sVar2.h(b0Var) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar2.d(i11) ? 131072 : 65536);
        if (sVar2.R(i13 & 1, (599187 & i13) != 599186)) {
            float f11 = 12;
            l2.f fVarC = l2.g.c(f11, f11, 0.0f, 0.0f, 12);
            long j9 = lv.s.J;
            Object objM = sVar2.M();
            if (objM == m3.m.f29332a) {
                function02 = function0;
                objM = new nn.m(25, function02);
                sVar2.k0(objM);
            } else {
                function02 = function0;
            }
            sVar = sVar2;
            v3.a((Function0) objM, null, w6Var, 0.0f, false, fVarC, j9, 0L, 0.0f, 0L, null, null, null, u3.e.e(1543846443, sVar2, new t(tVar, order, b0Var, function02, i11, bVar)), sVar, ((i13 >> 3) & 896) | 1572864, 3078, 7066);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.a0(order, tVar, bVar, w6Var, b0Var, i11, function0, i12);
        }
    }

    public static final void J(m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1571273008);
        if (sVar.R(i11 & 1, i11 != 0)) {
            s0.b(m2.d(b4.q.f5711a, 1.0f), l2.g.b(12), s0.p(lv.s.f28242w, sVar, 6), s0.q(2, 0.0f, 0.0f, 0.0f, 62), v1.n.b(3, lv.s.f28217b), f32727c, sVar, 221190, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new o60.a(i11, 12);
        }
    }

    public static final void K(b1 b1Var, m3.n nVar, int i11) {
        b1Var.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(999336284);
        if (sVar.R(i11 & 1, (i11 & 3) != 2)) {
            Unit unit = Unit.f26487a;
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = new q0(b1Var, null, 6);
                sVar.k0(objM);
            }
            m3.i.h(unit, (Function2) objM, sVar);
            d6.r.b(b4.d.f5689g, 0L, null, null, u3.e.e(-1051602881, sVar, new r1(b1Var, 4)), sVar, 24582, 14);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new r1(b1Var, i11, 5);
        }
    }

    public static final void L(boolean z11, Long l7, Boolean bool, Function0 function0, b4.t tVar, b1 b1Var, m3.n nVar, int i11) {
        int i12;
        b4.t tVar2;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1011860387);
        if ((i11 & 6) == 0) {
            i12 = (sVar.g(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(l7) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.f(bool) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(function0) ? 2048 : 1024;
        }
        int i13 = i12 | 24576;
        if ((196608 & i11) == 0) {
            i13 |= sVar.f(b1Var) ? 131072 : 65536;
        }
        if (!sVar.R(i13 & 1, (74899 & i13) != 74898)) {
            sVar.U();
            tVar2 = tVar;
        } else {
            if (!z11 || l7 == null || bool == null || l7.longValue() <= 0) {
                w1 w1VarS = sVar.s();
                if (w1VarS != null) {
                    w1VarS.f29476d = new eg.b(z11, l7, bool, function0, b1Var, i11);
                    return;
                }
                return;
            }
            d2.e eVar = d2.i.f13805e;
            b4.j jVar = b4.d.f5693k;
            b4.q qVar = b4.q.f5711a;
            float f11 = 16;
            b4.t tVarC = d2.c.C(m2.d(qVar, 1.0f), f11, 0, f11, f11);
            boolean z12 = (i13 & 7168) == 2048;
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (z12 || objM == fVar) {
                objM = new nn.m(17, function0);
                sVar.k0(objM);
            }
            b4.t tVarC2 = androidx.compose.foundation.b.c(tVarC, false, null, null, (Function0) objM, 15);
            boolean z13 = (i13 & 458752) == 131072;
            Object objM2 = sVar.M();
            if (z13 || objM2 == fVar) {
                objM2 = new li.c(b1Var, 20);
                sVar.k0(objM2);
            }
            b4.t tVarO = c0.o(tVarC2, (Function1) objM2);
            i2 i2VarA = h2.a(eVar, jVar, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC3 = b4.a.c(tVarO, sVar);
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
            m3.i.C(tVarC3, b5.i.f5841d, sVar);
            String strU = f0.U(sVar, R.string.orderview_remind_me);
            m5.u0 u0Var = lv.v.f28281u;
            long j9 = lv.s.f28217b;
            r9.d(strU, null, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            sVar = sVar;
            v1.n.d(x0.z(R.drawable.system_icon_notifications_settings, sVar, 0), null, null, null, null, 0.0f, new i4.o(j9, 5), sVar, 1572920, 60);
            sVar.q(true);
            tVar2 = qVar;
        }
        w1 w1VarS2 = sVar.s();
        if (w1VarS2 != null) {
            w1VarS2.f29476d = new g3.e0(z11, l7, bool, function0, tVar2, b1Var, i11);
        }
    }

    public static final void M(String str, int i11, Function0 function0, m3.n nVar, int i12) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(841760872);
        int i13 = i12 | (sVar.f(str) ? 4 : 2) | (sVar.d(i11) ? 32 : 16) | (sVar.h(function0) ? 256 : 128);
        if (sVar.R(i13 & 1, (i13 & 147) != 146)) {
            a1 a1Var = p0.f30209a;
            long j9 = i11;
            String str2 = ZonedDateTime.parse(str).plusDays(j9).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.getDefault()));
            str2.getClass();
            R(R.string.order_status_reversal_completed, f0.T(R.string.order_status_reversal_estimated, new Object[]{str2}, sVar), str.length() != 0 ? ZonedDateTime.parse(str).plusDays(j9).isBefore(ZonedDateTime.now()) : false, false, true, false, function0, sVar, ((i13 << 12) & 3670016) | 24576, 40);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.x(str, i11, function0, i12, 22);
        }
    }

    public static final void N(m3.n nVar, int i11) {
        m3.s sVar;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(1960377195);
        if (sVar2.R(i11 & 1, i11 != 0)) {
            v1.n.d(x0.z(R.drawable.frame_icon_donation, sVar2, 0), null, null, null, null, 0.0f, null, sVar2, 56, 124);
            sVar = sVar2;
            r9.d(f0.U(sVar2, R.string.order_status_state_donated), d2.c.D(b4.q.f5711a, 4, 0.0f, 0.0f, 0.0f, 14), lv.s.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28277q, sVar, 432, 12582912, 131064);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new o60.a(i11, 16);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void O(int r16, java.lang.String r17, int r18, boolean r19, m3.n r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oo.a.O(int, java.lang.String, int, boolean, m3.n, int, int):void");
    }

    public static final void P(int i11, String str, m3.n nVar, int i12) {
        int i13;
        String str2;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1610608494);
        int i14 = (sVar.d(i11) ? 4 : 2) | i12 | (sVar.f(str) ? 32 : 16);
        if (sVar.R(i14 & 1, (i14 & 19) != 18)) {
            i13 = i11;
            str2 = str;
            R(i13, str2, true, true, false, false, null, sVar, (i14 & 14) | MLKEMEngine.KyberPolyBytes | (i14 & 112), 112);
        } else {
            i13 = i11;
            str2 = str;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ig.c(i13, str2, i12);
        }
    }

    public static final void Q(Invitation invitation, Function0 function0, Function0 function02, Function0 function03, b1 b1Var, b1 b1Var2, Integer num, u3.d dVar, m3.n nVar, int i11) {
        u3.d dVar2;
        m3.s sVar;
        int i12;
        Invitation invitation2 = invitation;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-2086076750);
        int i13 = i11 | (sVar2.f(invitation2) ? 4 : 2) | (sVar2.h(function0) ? 32 : 16) | (sVar2.h(function02) ? 256 : 128) | (sVar2.h(function03) ? NewHope.SENDB_BYTES : 1024) | (sVar2.f(b1Var) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar2.f(b1Var2) ? 131072 : 65536) | (sVar2.f(num) ? 1048576 : 524288);
        if (sVar2.R(i13 & 1, (i13 & 4793491) != 4793490)) {
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = w.a0.s(num != null ? num.intValue() : 0, sVar2);
            }
            h1 h1Var = (h1) objM;
            boolean z11 = (i13 & 3670016) == 1048576;
            Object objM2 = sVar2.M();
            int i14 = 21;
            x70.c cVar = null;
            if (z11 || objM2 == fVar) {
                objM2 = new is.h(num, h1Var, cVar, i14);
                sVar2.k0(objM2);
            }
            m3.i.h(num, (Function2) objM2, sVar2);
            Object objM3 = sVar2.M();
            if (objM3 == fVar) {
                objM3 = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM3);
            }
            b1 b1Var3 = (b1) objM3;
            List listH = kotlin.collections.d0.h(f0.U(sVar2, R.string.orderview_delegate_tab_collection_title), f0.U(sVar2, R.string.orderview_delegate_tab_invitation_title));
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC = b4.a.c(qVar, sVar2);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar2, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar2);
            int iH = h1Var.h();
            long j9 = lv.s.J;
            boolean z12 = (i13 & 458752) == 131072;
            Object objM4 = sVar2.M();
            if (z12 || objM4 == fVar) {
                i12 = 21;
                objM4 = new li.c(b1Var2, 21);
                sVar2.k0(objM4);
            } else {
                i12 = 21;
            }
            b4.t tVarO = c0.o(qVar, (Function1) objM4);
            u3.d dVarE = u3.e.e(-864381468, sVar2, new a3.m2(h1Var, i12));
            invitation2 = invitation;
            b9.e(iH, tVarO, j9, 0L, dVarE, f32735k, u3.e.e(-1091492892, sVar2, new jh.a(listH, function03, b1Var, invitation, function02, h1Var, b1Var3)), sVar2, 1794432);
            sVar = sVar2;
            if ((invitation2 != null ? invitation2.getState() : null) == InvitationState.PENDING) {
                h1Var.i(1);
            }
            if ((invitation2 != null ? invitation2.getState() : null) == InvitationState.DISABLED && ((Boolean) b1Var3.getValue()).booleanValue()) {
                h1Var.i(0);
                b1Var3.setValue(Boolean.FALSE);
            }
            int iH2 = h1Var.h();
            if (iH2 != 0) {
                if (iH2 != 1) {
                    sVar.a0(1597524934);
                    sVar.q(false);
                } else {
                    sVar.a0(1597344917);
                    d(invitation2, function0, sVar, i13 & 126);
                    sVar.q(false);
                }
                dVar2 = dVar;
            } else {
                sVar.a0(1597281181);
                dVar2 = dVar;
                dVar2.invoke(sVar, 6);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            dVar2 = dVar;
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new gn.j(invitation2, function0, function02, function03, b1Var, b1Var2, num, dVar2, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void R(final int r39, final java.lang.String r40, boolean r41, boolean r42, boolean r43, boolean r44, kotlin.jvm.functions.Function0 r45, m3.n r46, final int r47, final int r48) {
        /*
            Method dump skipped, instruction units count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oo.a.R(int, java.lang.String, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function0, m3.n, int, int):void");
    }

    public static final void S(String str, String str2, boolean z11, Function1 function1, m3.n nVar, int i11) {
        int i12;
        str.getClass();
        str2.getClass();
        function1.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(581992369);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(str2) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.g(z11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(function1) ? NewHope.SENDB_BYTES : 1024;
        }
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = m2.d(d2.c.A(qVar, 24, 20), 1.0f);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
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
            b4.t tVarD2 = m2.d(qVar, 1.0f);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarD2, sVar);
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
            float f11 = 8;
            b4.t tVarD3 = d2.c.D(m2.d(qVar, 1.0f), 0.0f, 0.0f, f11, 0.0f, 11);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            b4.t tVarE = b3.i.e(1.0f, tVarD3, true);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            b4.t tVarC3 = b4.a.c(tVarE, sVar);
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
            r9.d(str, null, lv.s.C, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, lv.v.f28271j, sVar, (i12 & 14) | MLKEMEngine.KyberPolyBytes, 12582912, 130042);
            d2.c.f(m2.m(qVar, f11), sVar);
            r9.d(str2, null, lv.s.D, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, ((i12 >> 3) & 14) | MLKEMEngine.KyberPolyBytes, 12582912, 130042);
            sVar.q(true);
            b4.t tVarU = m2.u(qVar, null, 3);
            float f12 = x7.f19777a;
            long j9 = lv.s.J;
            long j11 = lv.s.f28217b;
            long j12 = lv.s.E;
            long j13 = lv.s.H;
            w7 w7VarA = x7.a(j9, j11, j11, 0L, j9, j12, j12, 0L, 0L, 0L, 0L, 0L, lv.s.F, j13, j13, 0L, sVar, 36744);
            sVar = sVar;
            boolean z12 = (i12 & 7168) == 2048;
            Object objM = sVar.M();
            if (z12 || objM == m3.m.f29332a) {
                objM = new defpackage.d(function1, 25);
                sVar.k0(objM);
            }
            z7.a(z11, (Function1) objM, tVarU, null, false, w7VarA, sVar, ((i12 >> 6) & 14) | MLKEMEngine.KyberPolyBytes, 88);
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.m(str, str2, z11, function1, i11, 8);
        }
    }

    public static final void T(Order order, Function0 function0, m3.n nVar, int i11) {
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1357160839);
        int i12 = (sVar.h(order) ? 4 : 2) | i11 | (sVar.h(function0) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            s0.b(m2.d(b4.q.f5711a, 1.0f), l2.g.b(12), s0.p(lv.s.J, sVar, 6), s0.q(2, 0.0f, 0.0f, 0.0f, 62), null, u3.e.e(497335673, sVar, new s(1, order, function0)), sVar, 196614, 16);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new y(order, function0, i11, 0);
        }
    }

    public static final void U(b1 b1Var, m3.n nVar, int i11) {
        b1Var.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1525330052);
        if (!sVar.R(i11 & 1, (i11 & 3) != 2)) {
            sVar.U();
        } else if (((Boolean) b1Var.getValue()).booleanValue()) {
            sVar.a0(-353487227);
            Integer numValueOf = Integer.valueOf(R.string.orderview_delegate_wrong_region_popup_title);
            Integer numValueOf2 = Integer.valueOf(R.string.orderview_delegate_wrong_region_popup_body);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = new ms.a(b1Var, 26);
                sVar.k0(objM);
            }
            Function0 function0 = (Function0) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new ms.a(b1Var, 27);
                sVar.k0(objM2);
            }
            cg.j.i(numValueOf, numValueOf2, null, null, R.string.orderview_delegate_error_btn_txt, 0L, function0, null, null, 0L, 0L, (Function0) objM2, null, Integer.valueOf(R.drawable.delegate_wrong_region), sVar, 0, 0, 6060);
            sVar = sVar;
            sVar.q(false);
        } else {
            sVar.a0(-353086490);
            sVar.q(false);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new r1(b1Var, i11, 6);
        }
    }

    public static final void V(int i11, Function0 function0, m3.n nVar, int i12) {
        m3.s sVar;
        function0.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1365491529);
        int i13 = i12 | (sVar2.d(i11) ? 4 : 2) | (sVar2.h(function0) ? 32 : 16);
        if (sVar2.R(i13 & 1, (i13 & 19) != 18)) {
            sVar = sVar2;
            cg.j.i(Integer.valueOf(R.string.orderview_delegate_offline_popup_title), Integer.valueOf(i11), null, null, R.string.orderview_delegate_error_btn_txt, 0L, function0, null, null, 0L, 0L, function0, null, Integer.valueOf(R.drawable.offline), sVar, ((i13 << 3) & 112) | ((i13 << 15) & 3670016), i13 & 112, 6060);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a2(i11, function0, i12, 7);
        }
    }

    public static final void W(OrderSwiper orderSwiper) {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(orderSwiper, "progress", orderSwiper.getProgress(), 0);
        objectAnimatorOfInt.setDuration(500L);
        objectAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfInt.start();
        orderSwiper.clearAnimation();
    }

    public static final void a(m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(597632111);
        if (sVar.R(i11 & 1, i11 != 0)) {
            s0.b(m2.d(b4.q.f5711a, 1.0f), l2.g.b(12), s0.p(lv.s.f28242w, sVar, 6), s0.q(2, 0.0f, 0.0f, 0.0f, 62), v1.n.b(3, lv.s.f28217b), f32726b, sVar, 221190, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new o60.a(i11, 15);
        }
    }

    public static final void b(Function0 function0, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-2096776963);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(function0) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.g(true) ? 32 : 16;
        }
        int i13 = i12;
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            b4.t tVarD = m2.d(m2.b(d2.c.z(b4.q.f5711a, 16), 0.0f, 44, 1), 1.0f);
            l2.f fVarB = l2.g.b(20);
            b2 b2Var = g3.p.f19253a;
            g3.o oVarA = g3.p.a(lv.s.f28217b, 0L, 0L, 0L, sVar, 14);
            boolean z11 = (i13 & 14) == 4;
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new nn.m(13, function0);
                sVar.k0(objM);
            }
            s0.a((Function0) objM, tVarD, true, fVarB, oVarA, null, null, null, null, f32725a, sVar, ((i13 << 3) & 896) | 805306416, 480);
            sVar = sVar;
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a2(i11, 5, function0);
        }
    }

    public static final void c(int i11, int i12, m3.n nVar, int i13) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1041927033);
        int i14 = (sVar.d(i11) ? 4 : 2) | i13 | (sVar.d(i12) ? 32 : 16);
        if (sVar.R(i14 & 1, (i14 & 19) != 18)) {
            float f11 = 24;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = d2.c.D(qVar, f11, 0.0f, f11, 0.0f, 10);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
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
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            v1.n.d(x0.z(i11, sVar, i14 & 14), null, d2.c.D(qVar, 0.0f, 0.0f, 16, 0.0f, 11), null, null, 0.0f, null, sVar, 440, 120);
            r9.d(f0.U(sVar, i12), null, lv.s.C, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130042);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new v(i11, i12, i13, 0);
        }
    }

    public static final void d(Invitation invitation, Function0 function0, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1478366595);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(invitation) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function0) ? 32 : 16;
        }
        int i13 = i12;
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            d2.c.f(m2.m(b4.q.f5711a, 24), sVar);
            s1.i.a(invitation != null ? invitation.getState() : null, null, null, null, "", null, l, sVar, 1597440, 46);
            cg.j.b(0L, 0, sVar, 1);
            y((invitation != null ? invitation.getState() : null) == InvitationState.PENDING, function0, sVar, i13 & 112);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.x(invitation, function0, i11, 20);
        }
    }

    public static final void e(Function0 function0, m3.n nVar, int i11) {
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1887412352);
        int i12 = (sVar.h(function0) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            b4.i iVar = b4.d.f5695n;
            boolean z11 = (i12 & 14) == 4;
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new nn.m(16, function0);
                sVar.k0(objM);
            }
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC = androidx.compose.foundation.b.c(qVar, false, null, null, (Function0) objM, 15);
            d2.y yVarA = d2.w.a(d2.i.f13803c, iVar, sVar, 48);
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
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC2, b5.i.f5841d, sVar);
            v1.n.d(x0.z(R.drawable.system_icon_cancel_order_view, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
            r9.d(f0.U(sVar, R.string.orderview_cancel_button), d2.c.D(qVar, 0.0f, 5, 0.0f, 0.0f, 13), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar, 432, 12582912, 131064);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.z(i11, 14, function0);
        }
    }

    public static final void f(Function0 function0, Function0 function02, Function0 function03, m3.n nVar, int i11) {
        m3.s sVar;
        function0.getClass();
        function02.getClass();
        function03.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-988849462);
        int i12 = i11 | (sVar2.h(function0) ? 4 : 2);
        if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
            Integer numValueOf = Integer.valueOf(R.string.cancel_order_popup_title);
            long j9 = lv.s.f28231k;
            boolean z11 = (i12 & 14) == 4;
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (z11 || objM == fVar) {
                objM = new nn.m(20, function0);
                sVar2.k0(objM);
            }
            Function0 function04 = (Function0) objM;
            Integer numValueOf2 = Integer.valueOf(R.string.cancel_order_popup_negative_btn);
            Object objM2 = sVar2.M();
            if (objM2 == fVar) {
                objM2 = new nn.m(21, function02);
                sVar2.k0(objM2);
            }
            sVar = sVar2;
            cg.j.i(numValueOf, null, null, null, R.string.cancel_order_popup_positive_btn, j9, function04, numValueOf2, (Function0) objM2, 0L, lv.s.f28217b, function03, null, null, sVar, 196608, 54, 12814);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new r(function0, function02, function03, i11, 0);
        }
    }

    public static final void g(Function0 function0, Function0 function02, Function0 function03, m3.n nVar, int i11) {
        m3.s sVar;
        function0.getClass();
        function02.getClass();
        function03.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-248532198);
        int i12 = i11 | (sVar2.h(function0) ? 4 : 2);
        if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
            Integer numValueOf = Integer.valueOf(R.string.dynamic_pricing_cancel_order_popup_title);
            Integer numValueOf2 = Integer.valueOf(R.string.dynamic_pricing_cancel_order_popup_description);
            long j9 = lv.s.f28231k;
            boolean z11 = (i12 & 14) == 4;
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (z11 || objM == fVar) {
                objM = new nn.m(23, function0);
                sVar2.k0(objM);
            }
            Function0 function04 = (Function0) objM;
            Integer numValueOf3 = Integer.valueOf(R.string.dynamic_pricing_cancel_order_popup_button_negative);
            Object objM2 = sVar2.M();
            if (objM2 == fVar) {
                objM2 = new nn.m(24, function02);
                sVar2.k0(objM2);
            }
            sVar = sVar2;
            cg.j.i(numValueOf, numValueOf2, null, null, R.string.dynamic_pricing_cancel_order_popup_button_positive, j9, function04, numValueOf3, (Function0) objM2, 0L, 0L, function03, null, null, sVar, 196608, 48, 13836);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new r(function0, function02, function03, i11, 1);
        }
    }

    public static final void h(m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1286059954);
        if (sVar.R(i11 & 1, i11 != 0)) {
            s0.b(m2.d(b4.q.f5711a, 1.0f), l2.g.b(12), s0.p(lv.s.f28242w, sVar, 6), s0.q(2, 0.0f, 0.0f, 0.0f, 62), v1.n.b(3, lv.s.f28217b), f32728d, sVar, 221190, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new o60.a(i11, 14);
        }
    }

    public static final void i(Function0 function0, m3.n nVar, int i11) {
        int i12;
        m3.s sVar;
        function0.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-243874899);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar2.h(function0) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (sVar2.R(i12 & 1, (i12 & 3) != 2)) {
            sVar = sVar2;
            cg.j.i(Integer.valueOf(R.string.orderview_delegate_cant_cancel_already_accepted_popup_title), Integer.valueOf(R.string.orderview_delegate_cant_cancel_already_accepted_popup_body), null, null, R.string.orderview_delegate_error_btn_txt, 0L, function0, null, null, 0L, 0L, function0, null, Integer.valueOf(R.drawable.delegate_invitation_already_accepted), sVar, (i12 << 18) & 3670016, (i12 << 3) & 112, 6060);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a2(i11, 6, function0);
        }
    }

    public static final void j(Function0 function0, m3.n nVar, int i11) {
        m3.s sVar;
        function0.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-32656050);
        int i12 = i11 | (sVar2.h(function0) ? 4 : 2);
        if (sVar2.R(i12 & 1, (i12 & 3) != 2)) {
            sVar = sVar2;
            cg.j.i(Integer.valueOf(R.string.orderview_delegate_wrong_region_owner_popup_title), Integer.valueOf(R.string.orderview_delegate_wrong_region_owner_popup_body), null, null, R.string.orderview_delegate_error_btn_txt, 0L, function0, null, null, 0L, 0L, function0, null, Integer.valueOf(R.drawable.delegate_wrong_region), sVar, (i12 << 18) & 3670016, (i12 << 3) & 112, 6060);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.z(i11, 17, function0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final java.lang.Long r22, final com.app.tgtg.model.remote.order.OrderType r23, final java.lang.Boolean r24, final kotlin.jvm.functions.Function0 r25, b4.t r26, m3.n r27, final int r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oo.a.k(java.lang.Long, com.app.tgtg.model.remote.order.OrderType, java.lang.Boolean, kotlin.jvm.functions.Function0, b4.t, m3.n, int, int):void");
    }

    public static final void l(boolean z11, boolean z12, Function1 function1, Function1 function12, m3.n nVar, int i11) {
        function1.getClass();
        function12.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1510314134);
        int i12 = i11 | (sVar.g(z11) ? 4 : 2) | (sVar.g(z12) ? 32 : 16) | (sVar.h(function1) ? 256 : 128) | (sVar.h(function12) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            d2.e eVar = d2.i.f13805e;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = m2.d(qVar, 1.0f);
            b4.i iVar = b4.d.f5694m;
            d2.y yVarA = d2.w.a(eVar, iVar, sVar, 6);
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
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            float f11 = 24;
            b4.t tVarF = b3.i.f(iVar, d2.c.B(qVar, f11, 0.0f, 2));
            String strU = f0.U(sVar, R.string.orderview_remember_to_collect_title);
            m5.u0 u0Var = lv.v.f28270i;
            long j9 = lv.s.C;
            r9.d(strU, tVarF, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            d2.c.f(m2.m(qVar, 8), sVar);
            r9.d(f0.U(sVar, R.string.orderview_remember_to_collect_description), d2.c.B(qVar, f11, 0.0f, 2), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, 432, 12582912, 131064);
            sVar = sVar;
            int i13 = i12 << 3;
            S(r8.k.f(f11, R.string.orderview_remember_to_collect_important_updates, qVar, sVar, sVar), f0.U(sVar, R.string.orderview_remember_to_collect_important_updates_description), z11, function1, sVar, ((i12 << 6) & 896) | (i13 & 7168));
            S(f0.U(sVar, R.string.orderview_remember_to_collect_calendar_reminder), f0.U(sVar, R.string.orderview_remember_to_collect_calendar_reminder_description), z12, function12, sVar, (i13 & 896) | (i12 & 7168));
            b3.i.y(qVar, 30, sVar, true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new hg.g(z11, z12, function1, function12, i11);
        }
    }

    public static final void m(String str, String str2, Function0 function0, Function0 function02, Function0 function03, m3.n nVar, int i11) {
        m3.s sVar;
        function0.getClass();
        function02.getClass();
        function03.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(1054091090);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2) | (sVar2.f(str2) ? 32 : 16) | (sVar2.h(function0) ? 256 : 128) | (sVar2.h(function02) ? NewHope.SENDB_BYTES : 1024) | (sVar2.h(function03) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar2.R(i12 & 1, (i12 & 9363) != 9362)) {
            sVar2.a0(2032075698);
            m5.e eVar = new m5.e();
            eVar.c(f0.U(sVar2, R.string.order_status_unredeemed_popup_content) + "\n\n");
            sVar2.a0(2032078811);
            int i13 = eVar.i(new l0(0L, 0L, q5.r.f36046k, (q5.n) null, (q5.o) null, (q5.i) null, (String) null, 0L, (x5.a) null, (x5.p) null, (t5.c) null, 0L, (x5.l) null, (i4.u0) null, 65531));
            try {
                eVar.c(str + "\n " + p0.c((Context) sVar2.j(v0.f7390b), str2));
                eVar.g(i13);
                sVar2.q(false);
                eVar.c("\n\n " + f0.U(sVar2, R.string.order_status_unredeemed_popup_question));
                m5.h hVarJ = eVar.j();
                sVar2.q(false);
                sVar = sVar2;
                cg.j.i(Integer.valueOf(R.string.order_status_unredeemed_popup_title), null, hVarJ, null, R.string.order_status_unredeemed_popup_collected_positive, 0L, function0, Integer.valueOf(R.string.order_status_unredeemed_popup_collected_negative), function02, 0L, 0L, function03, new d6.a0(5), null, sVar, ((i12 << 12) & 3670016) | ((i12 << 15) & 234881024), ((i12 >> 9) & 112) | MLKEMEngine.KyberPolyBytes, 9770);
            } catch (Throwable th2) {
                eVar.g(i13);
                throw th2;
            }
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ap.b(str, str2, function0, function02, function03, i11, 20);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v0, types: [x70.c] */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v7 */
    public static final void n(final Order order, final boolean z11, final Boolean bool, final Long l7, final Function0 function0, final Function0 function02, final Function0 function03, final Function0 function04, final b1 b1Var, final boolean z12, final b1 b1Var2, m3.n nVar, final int i11) {
        boolean z13;
        int i12;
        int i13;
        String strM429getOrderIdreIZeYA;
        m3.s sVar;
        String intervalEnd;
        order.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-180692491);
        int i14 = i11 | (sVar2.h(order) ? 4 : 2) | (sVar2.g(z11) ? 32 : 16) | (sVar2.f(bool) ? 256 : 128) | (sVar2.f(l7) ? NewHope.SENDB_BYTES : 1024) | (sVar2.h(function0) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar2.h(function02) ? 131072 : 65536) | (sVar2.h(function03) ? 1048576 : 524288) | (sVar2.h(function04) ? 8388608 : 4194304) | (sVar2.f(b1Var) ? 67108864 : 33554432) | (sVar2.g(z12) ? 536870912 : 268435456);
        int i15 = sVar2.f(b1Var2) ? 4 : 2;
        if (sVar2.R(i14 & 1, ((i14 & 306783379) == 306783378 && (i15 & 3) == 2) ? false : true)) {
            Context context = (Context) sVar2.j(v0.f7390b);
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.o(kotlin.coroutines.g.f26549a, sVar2);
                sVar2.k0(objM);
            }
            v80.b0 b0Var = (v80.b0) objM;
            Object objM2 = sVar2.M();
            if (objM2 == fVar) {
                objM2 = m3.i.w("");
                sVar2.k0(objM2);
            }
            b1 b1Var3 = (b1) objM2;
            PickupInterval pickupInterval = order.getPickupInterval();
            Long lValueOf = (pickupInterval == null || (intervalEnd = pickupInterval.getIntervalEnd()) == null) ? null : Long.valueOf(p0.h(intervalEnd));
            Long lValueOf2 = lValueOf != null ? Long.valueOf(lValueOf.longValue() - System.currentTimeMillis()) : null;
            boolean zIsFlashSales = order.isFlashSales();
            boolean z14 = !ho.r.c(order.getStoreTimeZone()) && (order.getState() == OrderState.ACTIVE || order.getState() == OrderState.COLLECTION_DELEGATED);
            boolean zF = sVar2.f(lValueOf2) | sVar2.h(b0Var);
            boolean z15 = z14;
            Object objM3 = sVar2.M();
            if (zF || objM3 == fVar) {
                objM3 = new p(lValueOf2, b0Var, b1Var3, , 0);
                sVar2.k0(objM3);
            }
            m3.i.h(order, (Function2) objM3, sVar2);
            d2.d dVar = d2.i.f13803c;
            b4.i iVar = b4.d.f5694m;
            d2.y yVarA = d2.w.a(dVar, iVar, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC = b4.a.c(qVar, sVar2);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar2);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar2, numValueOf, gVar3);
            b5.d dVar2 = b5.i.f5845h;
            m3.i.z(sVar2, dVar2);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar2);
            d2.c.f(m2.e(qVar, 12), sVar2);
            float f11 = 24;
            b4.t tVarT = m2.t(d2.c.D(qVar, f11, 0.0f, f11, 0.0f, 10), 3);
            d2.c.f(m2.m(qVar, f11), sVar2);
            d2.y yVarA2 = d2.w.a(dVar, iVar, sVar2, 0);
            int iHashCode2 = Long.hashCode(sVar2.T);
            u3.i iVarL2 = sVar2.l();
            b4.t tVarC2 = b4.a.c(qVar, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(yVarA2, gVar, sVar2);
            m3.i.C(iVarL2, gVar2, sVar2);
            w.a0.y(iHashCode2, sVar2, gVar3, sVar2, dVar2);
            m3.i.C(tVarC2, gVar4, sVar2);
            if (order.getState() != OrderState.ACTIVE) {
                sVar2.a0(1195633103);
                m0.c.P(((i14 >> 12) & 14) | MLKEMEngine.KyberPolyBytes | ((i14 << 3) & 112), tVarT, order, function0, sVar2);
                z13 = false;
                sVar2.q(false);
            } else {
                z13 = false;
                sVar2.a0(1195827225);
                sVar2.q(false);
            }
            String strU = f0.U(sVar2, R.string.orderview_information_date_label);
            if (z11) {
                i12 = 1196177153;
                i13 = R.string.orderview_information_order_id_label;
            } else {
                i12 = 1196024261;
                i13 = R.string.orderview_information_time_label;
            }
            boolean z16 = z13;
            jb.u.m(tVarT, strU, b3.i.j(i12, i13, sVar2, sVar2, z13), false, sVar2, 6, 8);
            if (zIsFlashSales) {
                sVar2.a0(1196385318);
                PickupInterval pickupInterval2 = order.getPickupInterval();
                h0.g.g(tVarT, p0.d(context, pickupInterval2 != null ? pickupInterval2.getIntervalStart() : null), (String) b1Var3.getValue(), z15, null, m5.u0.a(lv.v.f28275o, lv.s.f28217b, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), sVar2, 6, 16);
                sVar = sVar2;
                sVar.q(z16);
            } else {
                sVar2.a0(1196925338);
                PickupInterval pickupInterval3 = order.getPickupInterval();
                String strD = p0.d(context, pickupInterval3 != null ? pickupInterval3.getIntervalStart() : 0);
                if (z11) {
                    sVar2.a0(1197497846);
                    sVar2.q(z16);
                    strM429getOrderIdreIZeYA = order.m429getOrderIdreIZeYA();
                } else {
                    sVar2.a0(1197209205);
                    strM429getOrderIdreIZeYA = ho.r.b(z15, order.getPickupInterval(), order.getStoreTimeZone(), sVar2);
                    sVar2.q(z16);
                }
                h0.g.g(tVarT, strD, strM429getOrderIdreIZeYA, z15, null, null, sVar2, 6, 48);
                sVar = sVar2;
                sVar.q(z16);
            }
            jb.u.m(d2.c.D(tVarT, 0.0f, f11, 0.0f, 0.0f, 13), f0.U(sVar, R.string.orderview_information_surprise_bag_label), f0.U(sVar, R.string.orderview_information_total_label), false, sVar, 6, 8);
            m3.s sVar3 = sVar;
            h0.g.g(d2.c.D(tVarT, 0.0f, 2, 0.0f, 0.0f, 13), f0.T(R.string.orderview_information_item_info, new Object[]{String.valueOf(order.getQuantity()), String.valueOf(order.getItemName())}, sVar), mv.d.i(order.getTotalPrice(), 1), false, null, null, sVar3, 6, 56);
            sVar2 = sVar3;
            if (z11) {
                sVar2.a0(1200732975);
                ex.i.c(R.string.orderview_information_payment_method_label, null, order.getPaymentMethodDisplayName(), null, sVar2, 0, 10);
                b3.i.y(qVar, f11, sVar2, z16);
            } else {
                sVar2.a0(1198439285);
                if (order.getPackagingOption() == PackagingOptions.UNKNOWN || !order.isEdible()) {
                    sVar2.a0(1198693113);
                    sVar2.q(z16);
                } else {
                    sVar2.a0(1198463434);
                    ex.i.c(R.string.orderview_information_packaging_label, Integer.valueOf(order.getPackagingOption().getStringId()), null, null, sVar2, 0, 12);
                    sVar2.q(z16);
                }
                String itemCollectionInfo = order.getItemCollectionInfo();
                if (itemCollectionInfo == null || itemCollectionInfo.length() == 0) {
                    sVar2.a0(1198979801);
                    sVar2.q(z16);
                } else {
                    sVar2.a0(1198763576);
                    ex.i.c(R.string.orderview_information_collection_info_label, null, order.getItemCollectionInfo(), null, sVar2, 0, 10);
                    sVar2.q(z16);
                }
                String foodHandlingInstruction = order.getFoodHandlingInstruction();
                if (foodHandlingInstruction == null || foodHandlingInstruction.length() == 0) {
                    sVar2.a0(1199272441);
                    sVar2.q(z16);
                } else {
                    sVar2.a0(1199055255);
                    ex.i.c(R.string.orderview_information_food_safety_label, null, order.getFoodHandlingInstruction(), null, sVar2, 0, 10);
                    sVar2.q(z16);
                }
                cg.j.b(0L, z16 ? 1 : 0, sVar2, 1);
                int i16 = i14 & 896;
                int i17 = i14 >> 6;
                k(l7, order.getOrderType(), bool, function02, vi.c.z(qVar, b1Var), sVar2, (i17 & 7168) | ((i14 >> 9) & 14) | i16, 0);
                L(z12, l7, bool, function04, null, b1Var2, sVar2, i16 | (i17 & 112) | ((i14 >> 27) & 14) | ((i14 >> 12) & 7168) | ((i15 << 15) & 458752));
                b4.t tVarJ = v1.n.j(m2.d(m2.b(d2.c.D(qVar, 0.0f, 0.0f, 0.0f, 16, 7), 0.0f, 44, 1), 1.0f), i4.v.f23314g, g0.f23254b);
                boolean z17 = (i14 & 3670016) == 1048576;
                Object objM4 = sVar2.M();
                if (z17 || objM4 == fVar) {
                    objM4 = new nn.m(19, function03);
                    sVar2.k0(objM4);
                }
                b4.t tVarF = b3.i.f(b4.d.f5695n, androidx.compose.foundation.b.c(tVarJ, false, null, null, (Function0) objM4, 15));
                u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                int iHashCode3 = Long.hashCode(sVar2.T);
                u3.i iVarL3 = sVar2.l();
                b4.t tVarC3 = b4.a.c(tVarF, sVar2);
                sVar2.e0();
                if (sVar2.S) {
                    sVar2.k(hVar);
                } else {
                    sVar2.n0();
                }
                m3.i.C(u0VarD, gVar, sVar2);
                m3.i.C(iVarL3, gVar2, sVar2);
                w.a0.y(iHashCode3, sVar2, gVar3, sVar2, dVar2);
                m3.i.C(tVarC3, gVar4, sVar2);
                r9.d(f0.U(sVar2, R.string.orderview_delegate_send_invitation_back_cta), d2.u.f13938a.a(qVar, b4.d.f5687e), lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar2, MLKEMEngine.KyberPolyBytes, 0, 262136);
                sVar2 = sVar2;
                sVar2.q(true);
                sVar2.q(false);
            }
            sVar2.q(true);
            sVar2.q(true);
        } else {
            sVar2.U();
        }
        w1 w1VarS = sVar2.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(z11, bool, l7, function0, function02, function03, function04, b1Var, z12, b1Var2, i11) { // from class: oo.o

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f32843b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Boolean f32844c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Long f32845d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Function0 f32846e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ Function0 f32847f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ Function0 f32848g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ Function0 f32849h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ b1 f32850i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ boolean f32851j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ b1 f32852k;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(1);
                    a.n(this.f32842a, this.f32843b, this.f32844c, this.f32845d, this.f32846e, this.f32847f, this.f32848g, this.f32849h, this.f32850i, this.f32851j, this.f32852k, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void o(m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1642218564);
        if (sVar.R(i11 & 1, i11 != 0)) {
            k4.h hVar = new k4.h(((z5.c) sVar.j(x1.f7416h)).c0(3), 0.0f, 0, 0, new i4.i(new DashPathEffect(new float[]{30.0f, 20.0f}, 0.0f)), 14);
            b4.q qVar = b4.q.f5711a;
            b4.t tVarB = d2.c.B(qVar, 24, 0.0f, 2);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarB, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
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
            b4.t tVarJ = v1.n.j(qVar, lv.s.f28242w, g0.f23254b);
            boolean zH = sVar.h(hVar);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new z0(hVar, 10);
                sVar.k0(objM);
            }
            b4.t tVarD = f4.g.d(tVarJ, (Function1) objM);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5695n, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarD, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            float f11 = 16;
            d2.c.f(m2.m(qVar, f11), sVar);
            r9.d(f0.U(sVar, R.string.orderview_delegate_tab_invitation_info_waiting_for_accept), d2.c.D(qVar, f11, f11, f11, 0.0f, 8), lv.s.f28217b, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28275o, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            sVar = sVar;
            d2.c.f(m2.m(qVar, 8), sVar);
            v1.n.d(x0.z(R.drawable.delegate_waiting_for_accept, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
            d2.c.f(m2.m(qVar, f11), sVar);
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new o60.a(i11, 17);
        }
    }

    public static final void p(m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(80013715);
        if (sVar.R(i11 & 1, i11 != 0)) {
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
            c(R.drawable.group_add_icon, R.string.orderview_delegate_tab_invitation_only_one_friend_info, sVar, 0);
            float f11 = 24;
            d2.c.f(m2.m(qVar, f11), sVar);
            c(R.drawable.do_not_touch_icon, R.string.orderview_delegate_tab_invitation_cant_collect_when_delegated_info, sVar, 0);
            d2.c.f(m2.m(qVar, f11), sVar);
            c(R.drawable.undo_icon, R.string.orderview_delegate_tab_invitation_can_always_return_info, sVar, 0);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new o60.a(i11, 18);
        }
    }

    public static final void q(b4.t tVar, boolean z11, int i11, Function0 function0, m3.n nVar, int i12, int i13) {
        b4.t tVar2;
        int i14;
        int i15;
        b4.q qVar;
        d2.u uVar;
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-603144603);
        int i16 = i13 & 1;
        if (i16 != 0) {
            i14 = i12 | 6;
            tVar2 = tVar;
        } else {
            tVar2 = tVar;
            i14 = i12 | (sVar.f(tVar2) ? 4 : 2);
        }
        int i17 = i14 | (sVar.d(i11) ? 256 : 128) | (sVar.h(function0) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i17 & 1, (i17 & 1171) != 1170)) {
            b4.q qVar2 = b4.q.f5711a;
            if (i16 != 0) {
                tVar2 = qVar2;
            }
            b4.t tVarD = m2.d(v1.n.j(tVar2, lv.s.B, g0.f23254b), 1.0f);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
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
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            d2.u uVar2 = d2.u.f13938a;
            if (z11) {
                i15 = 1572864;
                qVar = qVar2;
                uVar = uVar2;
                sVar.a0(1551900695);
                sVar.q(false);
            } else {
                sVar.a0(1551503802);
                i15 = 1572864;
                qVar = qVar2;
                uVar = uVar2;
                s0.h(function0, uVar2.a(qVar2, b4.d.f5686d), false, null, null, null, f32730f, sVar, ((i17 >> 9) & 14) | 1572864, 60);
                sVar.q(false);
            }
            d2.u uVar3 = uVar;
            b4.t tVar3 = tVar2;
            r9.d(f0.U(sVar, i11), uVar.a(d2.c.B(qVar, 0.0f, lv.t.f28253g, 1), b4.d.f5687e), lv.s.C, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28272k, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            sVar = sVar;
            if (z11) {
                sVar.a0(1552263271);
                s0.h(function0, uVar3.a(qVar, b4.d.f5688f), false, null, null, null, u3.e.e(-1303217957, sVar, new cg.z(15, function0)), sVar, ((i17 >> 9) & 14) | i15, 60);
                sVar.q(false);
            } else {
                sVar.a0(1552739927);
                sVar.q(false);
            }
            sVar.q(true);
            tVar2 = tVar3;
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cn.d(tVar2, z11, i11, function0, i12, i13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:323:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(java.lang.Long r66, java.lang.Boolean r67, m3.b1 r68, final boolean r69, final boolean r70, com.app.tgtg.model.remote.order.Order r71, com.app.tgtg.model.remote.invitation.Invitation r72, com.app.tgtg.model.remote.invitation.OrderDataForInvitation r73, m3.b1 r74, kotlin.jvm.functions.Function0 r75, kotlin.jvm.functions.Function0 r76, kotlin.jvm.functions.Function0 r77, kotlin.jvm.functions.Function0 r78, kotlin.jvm.functions.Function0 r79, kotlin.jvm.functions.Function0 r80, kotlin.jvm.functions.Function0 r81, m3.b1 r82, kotlin.jvm.functions.Function0 r83, boolean r84, m3.b1 r85, java.lang.Integer r86, m3.n r87, final int r88, final int r89, final int r90) {
        /*
            Method dump skipped, instruction units count: 1429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oo.a.r(java.lang.Long, java.lang.Boolean, m3.b1, boolean, boolean, com.app.tgtg.model.remote.order.Order, com.app.tgtg.model.remote.invitation.Invitation, com.app.tgtg.model.remote.invitation.OrderDataForInvitation, m3.b1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, m3.b1, kotlin.jvm.functions.Function0, boolean, m3.b1, java.lang.Integer, m3.n, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(java.lang.Long r54, java.lang.Boolean r55, com.app.tgtg.model.remote.order.Order r56, kotlin.jvm.functions.Function0 r57, kotlin.jvm.functions.Function0 r58, m3.b1 r59, kotlin.jvm.functions.Function0 r60, boolean r61, m3.b1 r62, m3.n r63, int r64) {
        /*
            Method dump skipped, instruction units count: 1888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oo.a.s(java.lang.Long, java.lang.Boolean, com.app.tgtg.model.remote.order.Order, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, m3.b1, kotlin.jvm.functions.Function0, boolean, m3.b1, m3.n, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public static final void t(OrderDataForInvitation orderDataForInvitation, Function0 function0, m3.n nVar, int i11) {
        m3.s sVar;
        b1 b1Var;
        String str;
        Function0 function02;
        Function0 function03;
        k2 k2Var;
        b4.q qVar;
        b5.g gVar;
        b5.g gVar2;
        b5.g gVar3;
        Function0 function04;
        b5.g gVar4;
        b5.d dVar;
        ?? r22;
        long j9;
        m3.s sVar2;
        long j11;
        m3.s sVar3;
        String intervalEnd;
        Function0 function05 = function0;
        m3.s sVar4 = (m3.s) nVar;
        sVar4.c0(1872415852);
        int i12 = i11 | (sVar4.h(orderDataForInvitation) ? 4 : 2) | (sVar4.h(function05) ? 32 : 16);
        if (sVar4.R(i12 & 1, (i12 & 147) != 146)) {
            Context context = (Context) sVar4.j(v0.f7390b);
            Object objM = sVar4.M();
            Object obj = m3.m.f29332a;
            if (objM == obj) {
                objM = m3.i.o(kotlin.coroutines.g.f26549a, sVar4);
                sVar4.k0(objM);
            }
            v80.b0 b0Var = (v80.b0) objM;
            boolean z11 = orderDataForInvitation.getOrderType() == OrderType.FLASH_SALES;
            Object objM2 = sVar4.M();
            if (objM2 == obj) {
                objM2 = m3.i.w("");
                sVar4.k0(objM2);
            }
            b1 b1Var2 = (b1) objM2;
            PickupInterval pickupInterval = orderDataForInvitation.getPickupInterval();
            x70.c cVar = null;
            Long lValueOf = (pickupInterval == null || (intervalEnd = pickupInterval.getIntervalEnd()) == null) ? null : Long.valueOf(p0.h(intervalEnd));
            Long lValueOf2 = lValueOf != null ? Long.valueOf(lValueOf.longValue() - System.currentTimeMillis()) : null;
            boolean zF = sVar4.f(lValueOf2) | sVar4.h(b0Var);
            Object objM3 = sVar4.M();
            if (zF || objM3 == obj) {
                objM3 = new p(lValueOf2, b0Var, b1Var2, cVar, 2);
                b1Var = b1Var2;
                str = null;
                sVar4.k0(objM3);
            } else {
                b1Var = b1Var2;
                str = null;
            }
            m3.i.h(orderDataForInvitation, (Function2) objM3, sVar4);
            d2.d dVar2 = d2.i.f13803c;
            b4.i iVar = b4.d.f5694m;
            d2.y yVarA = d2.w.a(dVar2, iVar, sVar4, 0);
            int iHashCode = Long.hashCode(sVar4.T);
            u3.i iVarL = sVar4.l();
            b4.q qVar2 = b4.q.f5711a;
            b4.t tVarC = b4.a.c(qVar2, sVar4);
            b5.j.R.getClass();
            Function0 function06 = b5.i.f5839b;
            sVar4.e0();
            if (sVar4.S) {
                sVar4.k(function06);
            } else {
                sVar4.n0();
            }
            b5.g gVar5 = b5.i.f5843f;
            m3.i.C(yVarA, gVar5, sVar4);
            b5.g gVar6 = b5.i.f5842e;
            m3.i.C(iVarL, gVar6, sVar4);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar7 = b5.i.f5844g;
            m3.i.v(sVar4, numValueOf, gVar7);
            b5.d dVar3 = b5.i.f5845h;
            m3.i.z(sVar4, dVar3);
            b5.g gVar8 = b5.i.f5841d;
            m3.i.C(tVarC, gVar8, sVar4);
            d2.c.f(m2.e(qVar2, 12), sVar4);
            float f11 = 24;
            b4.t tVarT = m2.t(d2.c.D(qVar2, f11, 0.0f, f11, 0.0f, 10), 3);
            d2.c.f(m2.m(qVar2, f11), sVar4);
            d2.y yVarA2 = d2.w.a(dVar2, iVar, sVar4, 0);
            int iHashCode2 = Long.hashCode(sVar4.T);
            u3.i iVarL2 = sVar4.l();
            b4.t tVarC2 = b4.a.c(qVar2, sVar4);
            sVar4.e0();
            if (sVar4.S) {
                sVar4.k(function06);
            } else {
                sVar4.n0();
            }
            m3.i.C(yVarA2, gVar5, sVar4);
            m3.i.C(iVarL2, gVar6, sVar4);
            w.a0.y(iHashCode2, sVar4, gVar7, sVar4, dVar3);
            m3.i.C(tVarC2, gVar8, sVar4);
            d2.b bVar = d2.i.f13801a;
            b4.j jVar = b4.d.f5692j;
            i2 i2VarA = h2.a(bVar, jVar, sVar4, 0);
            int iHashCode3 = Long.hashCode(sVar4.T);
            u3.i iVarL3 = sVar4.l();
            b4.t tVarC3 = b4.a.c(tVarT, sVar4);
            sVar4.e0();
            if (sVar4.S) {
                sVar4.k(function06);
            } else {
                sVar4.n0();
            }
            m3.i.C(i2VarA, gVar5, sVar4);
            m3.i.C(iVarL3, gVar6, sVar4);
            w.a0.y(iHashCode3, sVar4, gVar7, sVar4, dVar3);
            m3.i.C(tVarC3, gVar8, sVar4);
            String strU = f0.U(sVar4, R.string.orderview_information_date_label);
            k2 k2Var2 = k2.f13824a;
            b4.t tVarA = k2Var2.a(1.0f, qVar2, true);
            m5.u0 u0Var = lv.v.f28279s;
            long j12 = lv.s.D;
            r9.d(strU, tVarA, j12, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, u0Var, sVar4, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            r9.d(f0.U(sVar4, z11 ? R.string.orderview_information_flashsales_time_label : R.string.orderview_information_time_label), k2Var2.a(1.0f, qVar2, true), j12, 0L, null, 0L, null, new x5.k(6), 0L, 0, false, 0, 0, null, u0Var, sVar4, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            sVar4.q(true);
            float f12 = 2;
            b4.t tVarD = d2.c.D(tVarT, 0.0f, f12, 0.0f, 0.0f, 13);
            i2 i2VarA2 = h2.a(bVar, jVar, sVar4, 0);
            int iHashCode4 = Long.hashCode(sVar4.T);
            u3.i iVarL4 = sVar4.l();
            b4.t tVarC4 = b4.a.c(tVarD, sVar4);
            sVar4.e0();
            if (sVar4.S) {
                function02 = function06;
                sVar4.k(function02);
            } else {
                function02 = function06;
                sVar4.n0();
            }
            m3.i.C(i2VarA2, gVar5, sVar4);
            m3.i.C(iVarL4, gVar6, sVar4);
            w.a0.y(iHashCode4, sVar4, gVar7, sVar4, dVar3);
            m3.i.C(tVarC4, gVar8, sVar4);
            PickupInterval pickupInterval2 = orderDataForInvitation.getPickupInterval();
            String strD = p0.d(context, pickupInterval2 != null ? pickupInterval2.getIntervalStart() : str);
            b4.t tVarA2 = k2Var2.a(1.0f, qVar2, true);
            m5.u0 u0Var2 = lv.v.f28274n;
            long j13 = lv.s.C;
            Function0 function07 = function02;
            r9.d(strD, tVarA2, j13, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, u0Var2, sVar4, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            String strB = ho.r.b(ho.r.c(orderDataForInvitation.getStoreInfo().getStoreTimezone()), orderDataForInvitation.getPickupInterval(), orderDataForInvitation.getStoreInfo().getStoreTimezone(), sVar4);
            b4.t tVarA3 = k2Var2.a(1.0f, qVar2, true);
            d2.y yVarA3 = d2.w.a(dVar2, b4.d.f5696o, sVar4, 48);
            int iHashCode5 = Long.hashCode(sVar4.T);
            u3.i iVarL5 = sVar4.l();
            b4.t tVarC5 = b4.a.c(tVarA3, sVar4);
            sVar4.e0();
            if (sVar4.S) {
                function03 = function07;
                sVar4.k(function03);
            } else {
                function03 = function07;
                sVar4.n0();
            }
            m3.i.C(yVarA3, gVar5, sVar4);
            m3.i.C(iVarL5, gVar6, sVar4);
            w.a0.y(iHashCode5, sVar4, gVar7, sVar4, dVar3);
            m3.i.C(tVarC5, gVar8, sVar4);
            if (z11) {
                sVar4.a0(-1678779548);
                gVar = gVar6;
                k2Var = k2Var2;
                qVar = qVar2;
                dVar = dVar3;
                function04 = function03;
                gVar4 = gVar5;
                gVar3 = gVar7;
                gVar2 = gVar8;
                r9.d((String) b1Var.getValue(), null, lv.s.f28217b, 0L, null, 0L, null, new x5.k(6), 0L, 0, false, 0, 0, null, lv.v.f28275o, sVar4, MLKEMEngine.KyberPolyBytes, 12582912, 130042);
                m3.s sVar5 = sVar4;
                sVar5.q(false);
                r22 = 0;
                j9 = j13;
                sVar2 = sVar5;
            } else {
                k2Var = k2Var2;
                qVar = qVar2;
                gVar = gVar6;
                gVar2 = gVar8;
                gVar3 = gVar7;
                function04 = function03;
                gVar4 = gVar5;
                dVar = dVar3;
                sVar4.a0(-1678483002);
                r22 = 0;
                j9 = j13;
                r9.d(strB, null, j9, 0L, null, 0L, null, new x5.k(6), 0L, 0, false, 0, 0, null, u0Var2, sVar4, MLKEMEngine.KyberPolyBytes, 12582912, 130042);
                m3.s sVar6 = sVar4;
                sVar6.q(false);
                sVar2 = sVar6;
            }
            if (ho.r.c(orderDataForInvitation.getStoreInfo().getStoreTimezone())) {
                j11 = j9;
                sVar2.a0(-1677814983);
                sVar2.q(r22);
                sVar3 = sVar2;
            } else {
                sVar2.a0(-1678110692);
                m3.s sVar7 = sVar2;
                r9.d(f0.U(sVar2, R.string.orderview_store_time_zone), null, j9, 0L, null, 0L, null, new x5.k(6), 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar7, MLKEMEngine.KyberPolyBytes, 12582912, 130042);
                j11 = j9;
                m3.s sVar8 = sVar7;
                sVar8.q(r22);
                sVar3 = sVar8;
            }
            sVar3.q(true);
            sVar3.q(true);
            b4.t tVarD2 = d2.c.D(tVarT, 0.0f, f11, 0.0f, 0.0f, 13);
            i2 i2VarA3 = h2.a(bVar, jVar, sVar3, r22);
            int iHashCode6 = Long.hashCode(sVar3.T);
            u3.i iVarL6 = sVar3.l();
            b4.t tVarC6 = b4.a.c(tVarD2, sVar3);
            sVar3.e0();
            if (sVar3.S) {
                sVar3.k(function04);
            } else {
                sVar3.n0();
            }
            m3.i.C(i2VarA3, gVar4, sVar3);
            m3.i.C(iVarL6, gVar, sVar3);
            b5.g gVar9 = gVar3;
            b5.d dVar4 = dVar;
            w.a0.y(iHashCode6, sVar3, gVar9, sVar3, dVar4);
            b5.g gVar10 = gVar2;
            m3.i.C(tVarC6, gVar10, sVar3);
            m3.s sVar9 = sVar3;
            k2 k2Var3 = k2Var;
            b5.g gVar11 = gVar4;
            Function0 function08 = function04;
            b4.q qVar3 = qVar;
            b5.g gVar12 = gVar;
            r9.d(f0.U(sVar3, R.string.orderview_information_surprise_bag_label), k2Var3.a(1.0f, qVar, true), j12, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, u0Var, sVar9, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            sVar9.q(true);
            b4.t tVarD3 = d2.c.D(tVarT, 0.0f, f12, 0.0f, 0.0f, 13);
            i2 i2VarA4 = h2.a(bVar, jVar, sVar9, r22);
            int iHashCode7 = Long.hashCode(sVar9.T);
            u3.i iVarL7 = sVar9.l();
            b4.t tVarC7 = b4.a.c(tVarD3, sVar9);
            sVar9.e0();
            if (sVar9.S) {
                sVar9.k(function08);
            } else {
                sVar9.n0();
            }
            m3.i.C(i2VarA4, gVar11, sVar9);
            m3.i.C(iVarL7, gVar12, sVar9);
            w.a0.y(iHashCode7, sVar9, gVar9, sVar9, dVar4);
            m3.i.C(tVarC7, gVar10, sVar9);
            r9.d(f0.T(R.string.orderview_information_item_info, new Object[]{String.valueOf(orderDataForInvitation.getQuantity()), String.valueOf(orderDataForInvitation.getItemInfo().getItemName())}, sVar9), k2Var3.a(1.0f, qVar3, true), j11, 0L, null, 0L, null, new x5.k(5), 0L, 2, false, 1, 0, null, u0Var2, sVar9, MLKEMEngine.KyberPolyBytes, 12607872, 109560);
            m3.s sVar10 = sVar9;
            sVar10.q(true);
            cg.j.b(0L, r22, sVar10, 1);
            function05 = function0;
            b(function05, sVar10, (i12 >> 3) & 126);
            sVar10.q(true);
            sVar10.q(true);
            sVar = sVar10;
        } else {
            sVar4.U();
            sVar = sVar4;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new kq.c(orderDataForInvitation, function05, i11, 21);
        }
    }

    public static final void u(Function0 function0, Function0 function02, m3.n nVar, int i11) {
        int i12;
        m3.s sVar;
        function0.getClass();
        function02.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1088884306);
        if ((i11 & 48) == 0) {
            i12 = (sVar2.h(function0) ? 32 : 16) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar2.h(function02) ? 256 : 128;
        }
        if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
            Integer numValueOf = Integer.valueOf(R.string.order_status_reversal_info_popup_after_completed_title);
            Integer numValueOf2 = Integer.valueOf(R.string.order_status_reversal_info_popup_after_completed_msg);
            boolean z11 = (i12 & 112) == 32;
            Object objM = sVar2.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new nn.m(22, function0);
                sVar2.k0(objM);
            }
            sVar = sVar2;
            cg.j.i(numValueOf, numValueOf2, null, null, R.string.order_status_reversal_info_popup_close_btn, 0L, (Function0) objM, null, null, 0L, 0L, function02, null, null, sVar, 0, (i12 >> 3) & 112, 14252);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.x(function0, function02, i11, 18);
        }
    }

    public static final void v(Function0 function0, m3.n nVar, int i11) {
        m3.s sVar;
        function0.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(1359849003);
        int i12 = i11 | (sVar2.h(function0) ? 4 : 2);
        if (sVar2.R(i12 & 1, (i12 & 3) != 2)) {
            sVar = sVar2;
            cg.j.i(Integer.valueOf(R.string.orderview_delegate_already_accepted_owner_popup_title), Integer.valueOf(R.string.orderview_delegate_already_accepted_owner_popup_body), null, null, R.string.orderview_delegate_error_btn_txt, 0L, function0, null, null, 0L, 0L, function0, null, Integer.valueOf(R.drawable.delegate_invitation_already_accepted), sVar, (i12 << 18) & 3670016, (i12 << 3) & 112, 6060);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.z(i11, 16, function0);
        }
    }

    public static final void w(boolean z11, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(465313765);
        int i12 = (sVar.g(z11) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            d6.r.b(b4.d.f5689g, 0L, null, null, u3.e.e(1310709090, sVar, new lp.q(z11, 1, (byte) 0)), sVar, 24582, 14);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lp.q(z11, i11);
        }
    }

    public static final void x(b1 b1Var, m3.n nVar, int i11) {
        b1Var.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-248578240);
        if (!sVar.R(i11 & 1, (i11 & 3) != 2)) {
            sVar.U();
        } else if (((Boolean) b1Var.getValue()).booleanValue()) {
            sVar.a0(-870622150);
            Integer numValueOf = Integer.valueOf(R.string.orderview_delegate_invitation_not_available_popup_title);
            Integer numValueOf2 = Integer.valueOf(R.string.orderview_delegate_invitation_not_available_popup_body);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = new ms.a(b1Var, 28);
                sVar.k0(objM);
            }
            Function0 function0 = (Function0) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new ms.a(b1Var, 29);
                sVar.k0(objM2);
            }
            cg.j.i(numValueOf, numValueOf2, null, null, R.string.orderview_delegate_error_btn_txt, 0L, function0, null, null, 0L, 0L, (Function0) objM2, null, Integer.valueOf(R.drawable.delegate_invitation_already_accepted), sVar, 0, 0, 6060);
            sVar = sVar;
            sVar.q(false);
        } else {
            sVar.a0(-870183934);
            sVar.q(false);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new r1(b1Var, i11, 7);
        }
    }

    public static final void y(boolean z11, Function0 function0, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(625518935);
        int i12 = (sVar.g(z11) ? 4 : 2) | i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function0) ? 32 : 16;
        }
        int i13 = i12;
        int i14 = 1;
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            b4.t tVarD = m2.d(m2.b(d2.c.z(b4.q.f5711a, 16), 0.0f, 44, 1), 1.0f);
            l2.f fVarB = l2.g.b(20);
            b2 b2Var = g3.p.f19253a;
            g3.o oVarA = g3.p.a(lv.s.f28217b, 0L, 0L, 0L, sVar, 14);
            boolean z12 = (i13 & 112) == 32;
            Object objM = sVar.M();
            if (z12 || objM == m3.m.f29332a) {
                objM = new nn.m(26, function0);
                sVar.k0(objM);
            }
            u3.d dVarE = u3.e.e(-325840025, sVar, new dq.h(z11, i14));
            sVar = sVar;
            s0.a((Function0) objM, tVarD, false, fVarB, oVarA, null, null, null, null, dVarE, sVar, 805306416, 484);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new hg.f(z11, function0, i11, 2);
        }
    }

    public static final void z(Function0 function0, m3.n nVar, int i11) {
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1598092003);
        int i12 = (sVar.h(function0) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            b4.i iVar = b4.d.f5695n;
            boolean z11 = (i12 & 14) == 4;
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new nn.m(12, function0);
                sVar.k0(objM);
            }
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC = androidx.compose.foundation.b.c(qVar, false, null, null, (Function0) objM, 15);
            d2.y yVarA = d2.w.a(d2.i.f13803c, iVar, sVar, 48);
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
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC2, b5.i.f5841d, sVar);
            v1.n.d(x0.z(R.drawable.system_icon_help_center, sVar, 0), null, null, null, null, 0.0f, new i4.o(lv.s.f28217b, 5), sVar, 1572920, 60);
            r9.d(f0.U(sVar, R.string.order_contact_us_button), d2.c.D(qVar, 0.0f, 5, 0.0f, 0.0f, 13), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar, 432, 12582912, 131064);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.z(i11, 12, function0);
        }
    }
}
