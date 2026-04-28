package com.app.tgtg.feature.orderview.manufacture;

import ah.n;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.activity.e0;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.g1;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import b4.q;
import b5.h;
import bg.w0;
import bn.a0;
import bn.p;
import bx.k;
import c6.r;
import com.app.tgtg.R;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.item.response.CancellingEntity;
import com.app.tgtg.model.remote.item.response.PaymentState;
import com.app.tgtg.model.remote.order.NpsRating;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderRatingItem;
import com.app.tgtg.model.remote.order.OrderState;
import com.app.tgtg.model.remote.order.Rating;
import d2.h2;
import d2.i;
import d2.i2;
import d2.m2;
import e70.c;
import g3.v3;
import g3.w6;
import g3.x5;
import h2.n0;
import hb0.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.d0;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import lo.b;
import lo.e;
import lo.j;
import lo.m;
import m3.b1;
import m3.f;
import m3.i1;
import m3.s;
import m3.w1;
import mg.a;
import mv.r0;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import se.d;
import u70.l;
import u70.t;
import v80.b0;
import v80.f0;
import v80.p0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class ManufacturerOrderActivity extends n {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f9167q = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f9168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1 f9170h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f9171i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f9172j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f9173k;
    public f30.a l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f9174m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d f9175n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e0 f9176o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ActivityResultLauncher f9177p;

    public ManufacturerOrderActivity() {
        super(23);
        this.f9170h = new n1(Reflection.getOrCreateKotlinClass(m.class), new j(this, 1), new j(this, 0), new j(this, 2));
        this.f9171i = l.b(new e(this, 2));
        this.f9174m = l.b(new e(this, 3));
        this.f9176o = new e0(this, 29);
        this.f9177p = registerForActivityResult(new g1(4), new lo.a(this));
    }

    public final void a0(Order order, Function0 function0, Function0 function02, m3.n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(1548173271);
        int i12 = i11 | (sVar.h(order) ? 4 : 2) | (sVar.h(function0) ? 32 : 16) | (sVar.h(function02) ? 256 : 128) | (sVar.h(this) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            Object objM = sVar.M();
            f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = e0.f.w(!r0.u(this), sVar);
            }
            b1 b1Var = (b1) objM;
            d2.e eVar = i.f13806f;
            b4.t tVarD = d2.c.D(m2.d(q.f5711a, 1.0f), 0.0f, 0.0f, 0.0f, lv.t.f28253g, 7);
            i2 i2VarA = h2.a(eVar, b4.d.f5692j, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarD, sVar);
            b5.j.R.getClass();
            h hVar = b5.i.f5839b;
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
            if (((hv.j) f0().f27986g).b()) {
                sVar.a0(641570167);
                boolean zH = sVar.h(this);
                Object objM2 = sVar.M();
                if (zH || objM2 == fVar) {
                    objM2 = new e(this, 1);
                    sVar.k0(objM2);
                }
                oo.a.A((Function0) objM2, sVar, 0);
                sVar.q(false);
            } else {
                sVar.a0(641778363);
                boolean z11 = (i12 & 112) == 32;
                Object objM3 = sVar.M();
                if (z11 || objM3 == fVar) {
                    objM3 = new ki.a(12, function0);
                    sVar.k0(objM3);
                }
                k.e((Function0) objM3, sVar, 0);
                sVar.q(false);
            }
            if (order.getState() != OrderState.ACTIVE || ((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.a0(642403943);
                sVar.q(false);
            } else {
                sVar.a0(641931131);
                boolean zH2 = ((i12 & 896) == 256) | sVar.h(this);
                Object objM4 = sVar.M();
                if (zH2 || objM4 == fVar) {
                    objM4 = new i2.e(21, this, function02);
                    sVar.k0(objM4);
                }
                k.d((Function0) objM4, sVar, 0);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new p(this, order, i11, function0, function02, 26);
        }
    }

    public final void b0(Order order, Function0 function0, Function0 function02, Function0 function03, i80.n nVar, m3.n nVar2, int i11) {
        s sVar = (s) nVar2;
        sVar.c0(242776717);
        int i12 = i11 | (sVar.h(order) ? 4 : 2) | (sVar.h(function0) ? 32 : 16) | (sVar.h(nVar) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if ((i11 & 196608) == 0) {
            i12 |= sVar.h(this) ? 131072 : 65536;
        }
        if (sVar.R(i12 & 1, (74899 & i12) != 74898)) {
            x5.a(null, u3.e.e(2052035913, sVar, new lo.c(this, 0)), null, null, null, 0, 0L, 0L, null, u3.e.e(-996977890, sVar, new lo.d(v1.n.q(sVar), order, this, nVar, function0, function02, m3.i.n(f0().f27998t, sVar, 0), function03, 0)), sVar, 805306416, 509);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a0(this, order, function0, function02, function03, nVar, i11, 8);
        }
    }

    public final void c0(Order order, m3.n nVar, int i11) {
        order.getClass();
        s sVar = (s) nVar;
        sVar.c0(-281239501);
        int i12 = (sVar.h(order) ? 4 : 2) | i11 | (sVar.h(this) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            String strM429getOrderIdreIZeYA = order.m429getOrderIdreIZeYA();
            mg.j jVar = mg.j.ViewStateRating;
            String itemName = order.getItemName();
            Boolean boolIsMultiItem = order.isMultiItem();
            ArrayList arrayListJ = d0.j(new a(strM429getOrderIdreIZeYA, jVar, itemName, null, false, boolIsMultiItem != null ? boolIsMultiItem.booleanValue() : false, 96));
            g0((a) arrayListJ.get(0), false);
            b4.t tVarD = m2.d(q.f5711a, 1.0f);
            float f11 = lv.t.f28253g;
            b4.t tVarC = d2.c.C(tVarD, f11, f11, f11, 0);
            boolean zH = sVar.h(arrayListJ) | sVar.h(this);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new o(21, arrayListJ, this);
                sVar.k0(objM);
            }
            r.b((Function1) objM, tVarC, null, sVar, 0, 4);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lo.f(this, order, i11, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void d0(Order order, m3.n nVar, int i11) {
        ManufacturerOrderActivity manufacturerOrderActivity;
        Order order2;
        int i12;
        s sVar;
        int i13;
        boolean z11;
        b1 b1Var;
        int i14;
        Object obj;
        s sVar2;
        s sVar3 = (s) nVar;
        sVar3.c0(-358492022);
        int i15 = 4;
        int i16 = (sVar3.h(order) ? 4 : 2) | i11 | (sVar3.h(this) ? 32 : 16);
        int i17 = 18;
        int i18 = 1;
        if (sVar3.R(i16 & 1, (i16 & 19) != 18)) {
            Object objM = sVar3.M();
            Object obj2 = m3.m.f29332a;
            if (objM == obj2) {
                objM = m3.i.w(Boolean.FALSE);
                sVar3.k0(objM);
            }
            b1 b1Var2 = (b1) objM;
            Object objM2 = sVar3.M();
            if (objM2 == obj2) {
                objM2 = m3.i.w(Boolean.FALSE);
                sVar3.k0(objM2);
            }
            b1 b1Var3 = (b1) objM2;
            Object objM3 = sVar3.M();
            if (objM3 == obj2) {
                objM3 = new i1(0L);
                sVar3.k0(objM3);
            }
            i1 i1Var = (i1) objM3;
            b1 b1VarN = m3.i.n(f0().f28000v, sVar3, 0);
            String strName = order.getState().name();
            Locale locale = Locale.getDefault();
            locale.getClass();
            String upperCase = strName.toUpperCase(locale);
            upperCase.getClass();
            this.f9172j = upperCase;
            if (this.f9169g) {
                i0(upperCase);
            }
            boolean zH = sVar3.h(this);
            Object objM4 = sVar3.M();
            if (zH || objM4 == obj2) {
                objM4 = new e(this, i15);
                sVar3.k0(objM4);
            }
            Function0 function0 = (Function0) objM4;
            Object objM5 = sVar3.M();
            int i19 = 22;
            if (objM5 == obj2) {
                objM5 = new i2.e(i19, i1Var, b1Var2);
                sVar3.k0(objM5);
            }
            Function0 function02 = (Function0) objM5;
            Object objM6 = sVar3.M();
            if (objM6 == obj2) {
                objM6 = new n0(b1Var3, i17);
                sVar3.k0(objM6);
            }
            Function0 function03 = (Function0) objM6;
            boolean zH2 = sVar3.h(this);
            Object objM7 = sVar3.M();
            if (zH2 || objM7 == obj2) {
                objM7 = new go.s(this, i18);
                sVar3.k0(objM7);
            }
            b0(order, function0, function02, function03, (i80.n) objM7, sVar3, (i16 & 14) | 3456 | ((i16 << 12) & 458752));
            order2 = order;
            ManufacturerOrderActivity manufacturerOrderActivity2 = this;
            if (((Boolean) b1Var2.getValue()).booleanValue()) {
                sVar3.a0(1748920334);
                Integer numValueOf = Integer.valueOf(R.string.cancel_parcel_order_popup_title);
                long j9 = lv.s.f28231k;
                boolean zH3 = sVar3.h(manufacturerOrderActivity2);
                Object objM8 = sVar3.M();
                int i21 = 20;
                if (zH3 || objM8 == obj2) {
                    objM8 = new i2.e(i21, manufacturerOrderActivity2, b1Var2);
                    sVar3.k0(objM8);
                }
                Function0 function04 = (Function0) objM8;
                Integer numValueOf2 = Integer.valueOf(R.string.cancel_order_popup_negative_btn);
                Object objM9 = sVar3.M();
                if (objM9 == obj2) {
                    objM9 = new n0(b1Var2, 19);
                    sVar3.k0(objM9);
                }
                Function0 function05 = (Function0) objM9;
                long j11 = lv.s.f28217b;
                Object objM10 = sVar3.M();
                if (objM10 == obj2) {
                    objM10 = new n0(b1Var2, i21);
                    sVar3.k0(objM10);
                }
                Function0 function06 = (Function0) objM10;
                b1Var = b1Var3;
                i14 = 2;
                obj = obj2;
                z11 = 0;
                i13 = 22;
                cg.j.i(numValueOf, null, null, null, R.string.cancel_order_popup_positive_btn, j9, function04, numValueOf2, function05, 0L, j11, function06, null, null, sVar3, 100859904, 54, 12814);
                s sVar4 = sVar3;
                i1Var.i(System.currentTimeMillis());
                sVar4.q(false);
                sVar2 = sVar4;
            } else {
                i13 = 22;
                z11 = 0;
                b1Var = b1Var3;
                i14 = 2;
                s sVar5 = sVar3;
                obj = obj2;
                sVar5.a0(1749606488);
                sVar5.q(false);
                sVar2 = sVar5;
            }
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar2.a0(1749647749);
                Object objM11 = sVar2.M();
                if (objM11 == obj) {
                    objM11 = new n0(b1Var, 21);
                    sVar2.k0(objM11);
                }
                Function0 function07 = (Function0) objM11;
                Object objM12 = sVar2.M();
                if (objM12 == obj) {
                    objM12 = new n0(b1Var, i13);
                    sVar2.k0(objM12);
                }
                oo.a.u(function07, (Function0) objM12, sVar2, 438);
                sVar2.q(z11);
            } else {
                sVar2.a0(1749850520);
                sVar2.q(z11);
            }
            if (((Boolean) b1VarN.getValue()).booleanValue()) {
                sVar2.a0(1749912365);
                Object objM13 = sVar2.M();
                if (objM13 == obj) {
                    objM13 = m3.i.o(g.f26549a, sVar2);
                    sVar2.k0(objM13);
                }
                b0 b0Var = (b0) objM13;
                w6 w6VarF = v3.f(6, i14, null, sVar2);
                boolean zBooleanValue = ((Boolean) m3.i.n(manufacturerOrderActivity2.f0().f28002x, sVar2, z11).getValue()).booleanValue();
                boolean zH4 = sVar2.h(manufacturerOrderActivity2);
                Object objM14 = sVar2.M();
                if (zH4 || objM14 == obj) {
                    objM14 = new b(manufacturerOrderActivity2, z11);
                    sVar2.k0(objM14);
                }
                Function1 function1 = (Function1) objM14;
                boolean zH5 = sVar2.h(b0Var) | sVar2.f(w6VarF) | sVar2.h(manufacturerOrderActivity2);
                Object objM15 = sVar2.M();
                if (zH5 || objM15 == obj) {
                    objM15 = new a0.g(b0Var, w6VarF, manufacturerOrderActivity2, 28);
                    sVar2.k0(objM15);
                }
                s sVar6 = sVar2;
                i12 = i14;
                cg.j.a(w6VarF, zBooleanValue, function1, (Function0) objM15, sVar6, 0);
                sVar6.q(z11);
                sVar = sVar6;
                manufacturerOrderActivity = manufacturerOrderActivity2;
            } else {
                s sVar7 = sVar2;
                i12 = i14;
                sVar7.a0(1750630232);
                sVar7.q(z11);
                sVar = sVar7;
                manufacturerOrderActivity = manufacturerOrderActivity2;
            }
        } else {
            manufacturerOrderActivity = this;
            order2 = order;
            i12 = 2;
            sVar3.U();
            sVar = sVar3;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lo.f(manufacturerOrderActivity, order2, i11, i12);
        }
    }

    public final void e0(Order order, m3.n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(109065937);
        int i12 = (sVar.h(order) ? 4 : 2) | i11 | (sVar.h(this) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            if (((Boolean) m3.i.n(f0().f27994p, sVar, 0).getValue()).booleanValue()) {
                j4.s.y(-2106806643, 0, sVar, sVar, false);
            } else {
                sVar.a0(-2106772047);
                sVar.q(false);
            }
            if (order == null) {
                sVar.a0(-2106752518);
                sVar.q(false);
            } else {
                sVar.a0(-2106752517);
                d0(order, sVar, i12 & 112);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lo.f(this, order, i11, 1);
        }
    }

    public final m f0() {
        return (m) this.f9170h.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g0(a aVar, boolean z11) {
        aVar.getClass();
        this.f9173k = aVar;
        if (z11) {
            m mVarF0 = f0();
            mVarF0.getClass();
            int i11 = 2;
            f0.B(m1.d(mVarF0), null, null, new lo.l(mVarF0, null, i11), 3);
            m mVarF02 = f0();
            String str = aVar.f29928a;
            Integer num = aVar.f29931d;
            String str2 = aVar.f29932e;
            mVarF02.getClass();
            str.getClass();
            int i12 = 5;
            OrderRatingItem orderRatingItem = new OrderRatingItem(new Rating(i12, (List) (0 == true ? 1 : 0), i11, (DefaultConstructorMarker) (0 == true ? 1 : 0)), new Rating(i12, (List) (0 == true ? 1 : 0), i11, (DefaultConstructorMarker) (0 == true ? 1 : 0)), new Rating(i12, (List) (0 == true ? 1 : 0), i11, (DefaultConstructorMarker) (0 == true ? 1 : 0)), (List) null, (String) null, new NpsRating(num, str2), (Boolean) null, (Boolean) null, (String) null, (Boolean) null, 984, (DefaultConstructorMarker) null);
            a9.a aVarD = m1.d(mVarF02);
            mVarF02.f27989j.getClass();
            c90.f fVar = p0.f42144a;
            f0.B(aVarD, c90.e.f7834b, null, new h2.a0(mVarF02, str, orderRatingItem, 0 == true ? 1 : 0, 18), 2);
            this.f9173k = null;
            h0(aVar, true);
        }
    }

    public final void h0(a aVar, boolean z11) {
        if (z11) {
            m mVarF0 = f0();
            cv.i iVar = cv.i.ACTION_CLOSE_NPS;
            dv.b bVarE = h0.g.E(new Pair(dv.a.SOURCE, new dv.c("Order_Overview")), new Pair(dv.a.NPS_STEP, new dv.c(aVar.f29929b.a())), new Pair(dv.a.ORDER_ID, new dv.c(aVar.f29928a)));
            mVarF0.getClass();
            iVar.getClass();
            mVarF0.f27982c.c(iVar, bVarE);
        }
        m mVarF02 = f0();
        cv.i iVar2 = cv.i.SCREEN_NPS_SURVEY;
        dv.b bVarE2 = h0.g.E(new Pair(dv.a.SOURCE, new dv.c("Order_Overview")), new Pair(dv.a.NPS_STEP, new dv.c(aVar.f29929b.a())), new Pair(dv.a.ORDER_ID, new dv.c(aVar.f29928a)));
        mVarF02.getClass();
        iVar2.getClass();
        mVarF02.f27982c.c(iVar2, bVarE2);
    }

    public final void i0(String str) {
        dv.d dVarY;
        PaymentState paymentState;
        CancellingEntity cancellingEntity;
        if (str == null) {
            this.f9169g = true;
            return;
        }
        Pair pair = new Pair(dv.a.STATE, new dv.c(str));
        Pair pair2 = new Pair(dv.a.SWIPE_ACTIVE, new dv.c(Boolean.FALSE));
        Pair pair3 = new Pair(dv.a.NOTIFICATION_ENABLED, new dv.c(Boolean.valueOf(NotificationManagerCompat.from(this).areNotificationsEnabled())));
        dv.a aVar = dv.a.ORDER_ID;
        String strB = f0().b();
        String strA = null;
        if (strB == null) {
            strB = null;
        }
        Pair pair4 = new Pair(aVar, new dv.c(strB));
        dv.a aVar2 = dv.a.ITEM_TYPE;
        Order order = (Order) f0().l.f45488a.getValue();
        Pair pair5 = new Pair(aVar2, new dv.c(order != null ? order.orderTypeMappedToItemTypeForTracking() : null));
        dv.a aVar3 = dv.a.CANCELLING_ENTITY;
        Order order2 = (Order) f0().l.f45488a.getValue();
        Pair pair6 = new Pair(aVar3, new dv.c((order2 == null || (cancellingEntity = order2.getCancellingEntity()) == null) ? null : cancellingEntity.name()));
        dv.a aVar4 = dv.a.PAYMENT_STATE;
        Order order3 = (Order) f0().l.f45488a.getValue();
        Pair pair7 = new Pair(aVar4, new dv.c((order3 == null || (paymentState = order3.getPaymentState()) == null) ? null : paymentState.name()));
        dv.a aVar5 = dv.a.OPENED_FROM;
        f70.i iVar = (f70.i) f0().f27980a.a("ORIGIN");
        if (iVar != null && (dVarY = zz.f.y(iVar)) != null) {
            strA = dVarY.a();
        }
        if (strA == null) {
            strA = "";
        }
        dv.b bVarE = h0.g.E(pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair(aVar5, new dv.c(strA)));
        m mVarF0 = f0();
        cv.i iVar2 = cv.i.SCREEN_ORDER;
        mVarF0.getClass();
        iVar2.getClass();
        mVarF0.f27982c.c(iVar2, bVarE);
        this.f9169g = false;
    }

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1000 && i12 == 1002) {
            setResult(AppConstants.RESULT_CODE_AUTO_REFUND);
            getOnBackPressedDispatcher().d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        o30.f0.S(this, false);
        super.onCreate(bundle);
        a70.a.t(this, lv.s.B);
        c cVar = null;
        int i11 = 3;
        f0.B(m1.c(this), null, null, new lo.h(this, 0 == true ? 1 : 0, 0), 3);
        int i12 = 1;
        f0.B(m1.c(this), null, null, new lo.h(this, 0 == true ? 1 : 0, i12), 3);
        c cVar2 = this.f9168f;
        if (cVar2 != null) {
            cVar = cVar2;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
        }
        c.b(cVar, this, new b(this, i11), 2);
        Object value = this.f9174m.getValue();
        value.getClass();
        ((f30.d) value).b().addOnCompleteListener(new lo.a(this));
        getOnBackPressedDispatcher().a(this.f9176o);
        e.f.a(this, new u3.d(new lo.c(this, i12), true, -150317074));
        String strB = f0().b();
        if (strB != null) {
            f0().a(strB);
        } else {
            Toast.makeText(this, R.string.error_no_order, 1).show();
            finishAfterTransition();
        }
    }

    @Override // ah.n, k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        a aVar = this.f9173k;
        if (aVar != null) {
            h0(aVar, false);
        }
        this.f9176o.remove();
        ((w0) this.f9171i.getValue()).a();
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void onResume() {
        super.onResume();
        m mVarF0 = f0();
        Order order = (Order) mVarF0.l.f45488a.getValue();
        if (order != null) {
            mVarF0.a(order.m429getOrderIdreIZeYA());
        }
        i0(this.f9172j);
    }
}
