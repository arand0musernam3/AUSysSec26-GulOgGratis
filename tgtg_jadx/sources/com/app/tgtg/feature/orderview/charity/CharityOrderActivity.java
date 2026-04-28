package com.app.tgtg.feature.orderview.charity;

import a0.g;
import a3.t0;
import a3.u1;
import aa.l0;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.e0;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import b0.a0;
import b0.x1;
import b0.z;
import b4.a;
import b4.d;
import b4.q;
import b4.t;
import b5.h;
import b5.j;
import bg.a1;
import bx.o;
import com.app.tgtg.R;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.item.Address;
import com.app.tgtg.model.remote.item.StoreLocation;
import com.app.tgtg.model.remote.order.Changes;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderState;
import com.app.tgtg.model.remote.order.UpdateNotificationType;
import d2.e;
import d2.h2;
import d2.i;
import d2.i2;
import d2.m2;
import d2.p;
import d2.y;
import e70.c;
import ep.l;
import g3.s0;
import g3.v3;
import g3.w6;
import g3.x6;
import g9.f0;
import go.k;
import go.m;
import go.v;
import go.w;
import gv.b;
import i4.g0;
import i4.r0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import lx.u;
import m3.b1;
import m3.f;
import m3.n;
import m3.s;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import s1.x0;
import v1.y1;
import v80.b0;
import xh.r;
import y80.h1;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class CharityOrderActivity extends w {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f9162o = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n1 f9163j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f9164k;
    public b l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f9165m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e0 f9166n;

    public CharityOrderActivity() {
        super(0);
        this.f9163j = new n1(Reflection.getOrCreateKotlinClass(v.class), new m(this, 1), new m(this, 0), new m(this, 2));
        this.f9166n = new e0(this, 18);
    }

    public static void R(Order order, Function1 function1, List list) {
        Object next;
        String strM428getItemIdRWxzYZM = order.m428getItemIdRWxzYZM();
        if (strM428getItemIdRWxzYZM != null) {
            String timestamp = null;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (((Changes) next).getType() == UpdateNotificationType.INVENTORY_CHANGED) {
                            break;
                        }
                    }
                }
                Changes changes = (Changes) next;
                if (changes != null) {
                    timestamp = changes.getTimestamp();
                }
            }
            function1.invoke(new r(strM428getItemIdRWxzYZM, timestamp, true));
        }
    }

    public final void G(Order order, b1 b1Var, n nVar, int i11) {
        Order order2;
        int i12;
        s sVar = (s) nVar;
        sVar.c0(55099897);
        if ((i11 & 6) == 0) {
            order2 = order;
            i12 = (sVar.h(order2) ? 4 : 2) | i11;
        } else {
            order2 = order;
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(b1Var) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(this) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            float f11 = 24;
            q qVar = q.f5711a;
            d2.c.f(m2.m(qVar, f11), sVar);
            e eVar = i.f13806f;
            t tVarD = m2.d(qVar, 1.0f);
            i2 i2VarA = h2.a(eVar, d.f5692j, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = a.c(tVarD, sVar);
            j.R.getClass();
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
            sVar.a0(-944203289);
            boolean zIsSupportAvailable = order2.isSupportAvailable();
            f fVar = m3.m.f29332a;
            if (zIsSupportAvailable) {
                sVar.a0(-484490400);
                boolean zH = sVar.h(this);
                Object objM = sVar.M();
                if (zH || objM == fVar) {
                    objM = new go.d(this, 2);
                    sVar.k0(objM);
                }
                oo.a.z((Function0) objM, sVar, 0);
                sVar.q(false);
            } else {
                sVar.a0(-484408715);
                sVar.q(false);
            }
            if (order2.canCancel() && order2.getInvitationId() == null) {
                sVar.a0(-484339337);
                boolean zH2 = ((i12 & 112) == 32) | sVar.h(this);
                Object objM2 = sVar.M();
                if (zH2 || objM2 == fVar) {
                    objM2 = new go.i(this, b1Var, 1);
                    sVar.k0(objM2);
                }
                oo.a.e((Function0) objM2, sVar, 0);
                sVar.q(false);
            } else {
                sVar.a0(-484156747);
                sVar.q(false);
            }
            sVar.q(false);
            sVar.q(true);
            d2.c.f(m2.d(m2.e(qVar, f11), 1.0f), sVar);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.a(this, order2, b1Var, i11, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r12v1, types: [m3.n, m3.s] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    public final void H(Order order, List list, Function1 function1, n nVar, int i11) {
        Function1 function12;
        ArrayList arrayList;
        ArrayList arrayList2;
        Unit unit;
        ?? r32;
        int i12;
        int i13;
        ?? r33;
        ?? r34;
        Order order2 = order;
        ?? r12 = (s) nVar;
        r12.c0(344293452);
        int i14 = (i11 & 6) == 0 ? (r12.h(order2) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i14 |= r12.h(list) ? 32 : 16;
        }
        int i15 = 256;
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            function12 = function1;
            i14 |= r12.h(function12) ? 256 : 128;
        } else {
            function12 = function1;
        }
        if ((i11 & 3072) == 0) {
            i14 |= r12.h(this) ? NewHope.SENDB_BYTES : 1024;
        }
        int i16 = i14;
        ?? r102 = 0;
        if (!r12.R(i16 & 1, (i16 & 1171) != 1170)) {
            r12.U();
        } else if (d0.h(OrderState.ACTIVE, OrderState.CANCELLED, OrderState.REFUNDED_OR_CANCELLED).contains(order2.getState())) {
            r12.a0(464616249);
            if (list != null) {
                HashSet hashSet = new HashSet();
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (hashSet.add(((Changes) obj).getType())) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    Changes changes = (Changes) obj2;
                    if (changes.getType() == UpdateNotificationType.CANCELLED_BY_CHARITY || changes.getType() == UpdateNotificationType.CANCELLED_BY_STORE) {
                        arrayList2.add(obj2);
                    }
                }
            } else {
                arrayList2 = null;
            }
            Changes changes2 = arrayList2 != null ? (Changes) CollectionsKt.firstOrNull(arrayList2) : null;
            f fVar = m3.m.f29332a;
            if (changes2 == null) {
                r12.a0(464921598);
                r12.q(false);
                unit = null;
            } else {
                r12.a0(464921599);
                boolean zH = r12.h(this) | r12.h(order2) | ((i16 & 896) == 256) | r12.h(arrayList);
                Object objM = r12.M();
                if (zH || objM == fVar) {
                    g gVar = new g(this, order2, function12, arrayList, 15);
                    r12.k0(gVar);
                    objM = gVar;
                }
                Function0 function0 = (Function0) objM;
                boolean zH2 = r12.h(this);
                Object objM2 = r12.M();
                Object obj3 = objM2;
                if (zH2 || objM2 == fVar) {
                    go.g gVar2 = new go.g(this, 1);
                    r12.k0(gVar2);
                    obj3 = gVar2;
                }
                a0.b(changes2, function0, (Function1) obj3, r12, 0);
                r12.q(false);
                unit = Unit.f26487a;
            }
            if (unit == null) {
                r12.a0(465216564);
                if (arrayList == null) {
                    r12.a0(465216563);
                    r12.q(false);
                    r34 = 0;
                } else {
                    r12.a0(465216564);
                    int i17 = 0;
                    for (Object obj4 : arrayList) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            d0.n();
                            throw null;
                        }
                        Changes changes3 = (Changes) obj4;
                        int i19 = (r12.h(this) ? 1 : 0) | (r12.h(order2) ? 1 : 0) | ((i16 & 896) == i15 ? 1 : r102) | (r12.h(arrayList) ? 1 : 0);
                        Object objM3 = r12.M();
                        if (i19 != 0 || objM3 == fVar) {
                            g gVar3 = new g(this, order2, function1, arrayList, 16);
                            r12.k0(gVar3);
                            objM3 = gVar3;
                        }
                        Function0 function02 = (Function0) objM3;
                        boolean zH3 = r12.h(this);
                        Object objM4 = r12.M();
                        Object obj5 = objM4;
                        if (zH3 || objM4 == fVar) {
                            go.g gVar4 = new go.g(this, 2);
                            r12.k0(gVar4);
                            obj5 = gVar4;
                        }
                        a0.b(changes3, function02, (Function1) obj5, r12, r102);
                        if (i17 != arrayList.size() - 1) {
                            r12.a0(-1204801882);
                            i13 = i16;
                            r33 = r102;
                            i12 = i15;
                            s0.g(null, 16, lv.s.K, r12, 432, 1);
                            r12.q(r33);
                        } else {
                            i12 = i15;
                            i13 = i16;
                            r33 = r102;
                            r12.a0(-1204701938);
                            r12.q(r33);
                        }
                        i16 = i13;
                        r102 = r33;
                        i15 = i12;
                        i17 = i18;
                        order2 = order;
                    }
                    ?? r35 = r102;
                    r12.q(r35);
                    r34 = r35;
                }
                r12.q(r34);
                r32 = r34;
            } else {
                r32 = 0;
                r12.a0(153544243);
                r12.q(false);
            }
            r12.q(r32);
        } else {
            r12.a0(465658934);
            r12.q(false);
        }
        w1 w1VarS = r12.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new t0(this, order, list, function1, i11, 10);
        }
    }

    public final void I(go.a aVar, Function1 function1, n nVar, int i11) {
        int i12;
        go.a aVar2;
        Function1 function12 = function1;
        s sVar = (s) nVar;
        sVar.c0(1968072653);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function12) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(this) ? 256 : 128;
        }
        int i13 = i12;
        if (sVar.R(i13 & 1, (i13 & 147) != 146)) {
            y1 y1VarQ = v1.n.q(sVar);
            b1 b1VarN = m3.i.n(C().f22217k, sVar, 0);
            b1 b1VarN2 = m3.i.n(C().f22218m, sVar, 0);
            b1 b1VarN3 = m3.i.n(C().E, sVar, 0);
            long j9 = lv.s.B;
            r0 r0Var = g0.f23254b;
            q qVar = q.f5711a;
            t tVarThen = v1.n.j(qVar, j9, r0Var).then(m2.f13850c);
            u0 u0VarD = p.d(d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = a.c(tVarThen, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
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
            float f11 = 16;
            t tVarR = v1.n.r(d2.c.D(qVar, f11, 0.0f, f11, 0.0f, 10), y1VarQ, true);
            y yVarA = d2.w.a(i.f13803c, d.f5694m, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = a.c(tVarR, sVar);
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
            L(sVar, (i13 >> 6) & 14);
            Order order = aVar.f20698a;
            H(order, (List) b1VarN2.getValue(), function1, sVar, (i13 << 3) & 8064);
            int i14 = (i13 >> 3) & 112;
            P(order, sVar, i14);
            O(order, sVar, i14);
            aVar2 = aVar;
            M(aVar2, function1, (List) b1VarN.getValue(), ((Boolean) b1VarN3.getValue()).booleanValue(), sVar, (i13 & 126) | (57344 & (i13 << 6)));
            function12 = function1;
            sVar = sVar;
            G(order, aVar2.f20701d, sVar, i13 & 896);
            sVar.q(true);
            if (((Boolean) b1VarN3.getValue()).booleanValue()) {
                sVar.a0(226817755);
                sVar.q(false);
            } else {
                sVar.a0(226746641);
                N(aVar2, function12, sVar, i13 & 1022);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            aVar2 = aVar;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new go.h(this, aVar2, function12, i11, 0);
        }
    }

    public final void J(n nVar, int i11) {
        s sVar;
        Object a1Var;
        f0 f0Var;
        Boolean hasDynamicPrice;
        s sVar2 = (s) nVar;
        sVar2.c0(1439673016);
        int i12 = (sVar2.h(this) ? 4 : 2) | i11;
        if (sVar2.R(i12 & 1, (i12 & 3) != 2)) {
            Object objM = sVar2.M();
            f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM);
            }
            b1 b1Var = (b1) objM;
            Object objM2 = sVar2.M();
            if (objM2 == fVar) {
                objM2 = m3.i.w(null);
                sVar2.k0(objM2);
            }
            b1 b1Var2 = (b1) objM2;
            b1 b1VarN = m3.i.n(C().f22215i, sVar2, 0);
            f0 f0VarI = a.a.I(new g9.t0[0], sVar2);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar2.a0(-244213984);
                Order order = (Order) b1VarN.getValue();
                if ((order != null ? order.getState() : null) == OrderState.COLLECTION_DELEGATED) {
                    sVar2.a0(-244174676);
                    Object objM3 = sVar2.M();
                    if (objM3 == fVar) {
                        objM3 = new bm.j(b1Var, 24);
                        sVar2.k0(objM3);
                    }
                    oo.a.i((Function0) objM3, sVar2, 6);
                    C().l(cv.i.SCREEN_ERROR_CANCELLATION_DELEGATED, null);
                    sVar2.q(false);
                } else {
                    Order order2 = (Order) C().f22215i.f45488a.getValue();
                    if ((order2 == null || (hasDynamicPrice = order2.getHasDynamicPrice()) == null) ? false : hasDynamicPrice.booleanValue()) {
                        sVar2.a0(-243910711);
                        boolean zH = sVar2.h(this);
                        Object objM4 = sVar2.M();
                        if (zH || objM4 == fVar) {
                            objM4 = new go.i(this, b1Var, 0);
                            sVar2.k0(objM4);
                        }
                        Function0 function0 = (Function0) objM4;
                        Object objM5 = sVar2.M();
                        if (objM5 == fVar) {
                            objM5 = new bm.j(b1Var, 26);
                            sVar2.k0(objM5);
                        }
                        Function0 function02 = (Function0) objM5;
                        Object objM6 = sVar2.M();
                        if (objM6 == fVar) {
                            objM6 = new bm.j(b1Var, 27);
                            sVar2.k0(objM6);
                        }
                        oo.a.g(function0, function02, (Function0) objM6, sVar2, 432);
                        sVar2.q(false);
                    } else {
                        sVar2.a0(-243523335);
                        boolean zH2 = sVar2.h(this);
                        Object objM7 = sVar2.M();
                        if (zH2 || objM7 == fVar) {
                            objM7 = new go.i(this, b1Var, 2);
                            sVar2.k0(objM7);
                        }
                        Function0 function03 = (Function0) objM7;
                        Object objM8 = sVar2.M();
                        if (objM8 == fVar) {
                            objM8 = new bm.j(b1Var, 28);
                            sVar2.k0(objM8);
                        }
                        Function0 function04 = (Function0) objM8;
                        Object objM9 = sVar2.M();
                        if (objM9 == fVar) {
                            objM9 = new bm.j(b1Var, 29);
                            sVar2.k0(objM9);
                        }
                        oo.a.f(function03, function04, (Function0) objM9, sVar2, 432);
                        sVar2.q(false);
                    }
                }
                sVar2.q(false);
            } else {
                sVar2.a0(-243158806);
                sVar2.q(false);
            }
            xh.t tVar = xh.t.INSTANCE;
            boolean zF = sVar2.f(b1VarN) | sVar2.h(this) | sVar2.h(f0VarI);
            Object objM10 = sVar2.M();
            if (zF || objM10 == fVar) {
                f0Var = f0VarI;
                a1Var = new a1(b1VarN, this, b1Var, b1Var2, f0Var, 3);
                sVar2.k0(a1Var);
            } else {
                a1Var = objM10;
                f0Var = f0VarI;
            }
            sVar = sVar2;
            z.g(f0Var, tVar, null, null, null, null, null, null, null, (Function1) a1Var, sVar, 48, 2044);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new go.b(this, i11);
        }
    }

    public final void K(Order order, b1 b1Var, b1 b1Var2, Function1 function1, n nVar, int i11) {
        CharityOrderActivity charityOrderActivity;
        s sVar;
        Function0 function0;
        boolean z11;
        b1 b1Var3;
        s sVar2 = (s) nVar;
        sVar2.c0(-819763391);
        int i12 = i11 | (sVar2.h(order) ? 4 : 2) | (sVar2.h(function1) ? NewHope.SENDB_BYTES : 1024) | (sVar2.h(this) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar2.R(i12 & 1, (i12 & 9363) != 9362)) {
            Object objM = sVar2.M();
            f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.o(kotlin.coroutines.g.f26549a, sVar2);
                sVar2.k0(objM);
            }
            b0 b0Var = (b0) objM;
            w6 w6VarF = v3.f(6, 2, null, sVar2);
            w6 w6VarF2 = v3.f(6, 2, null, sVar2);
            Object objM2 = sVar2.M();
            if (objM2 == fVar) {
                objM2 = m3.i.w(Boolean.TRUE);
                sVar2.k0(objM2);
            }
            b1 b1Var4 = (b1) objM2;
            Object objM3 = sVar2.M();
            if (objM3 == fVar) {
                objM3 = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM3);
            }
            b1 b1Var5 = (b1) objM3;
            Object objM4 = sVar2.M();
            if (objM4 == fVar) {
                objM4 = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM4);
            }
            b1 b1Var6 = (b1) objM4;
            b1 b1VarN = m3.i.n(C().f22226u, sVar2, 0);
            b1 b1VarN2 = m3.i.n(C().f22228w, sVar2, 0);
            b1 b1VarN3 = m3.i.n((h1) C().c().f3503e, sVar2, 0);
            C().g(order);
            b1 b1VarN4 = m3.i.n((h1) C().c().f3501c, sVar2, 0);
            b1 b1VarN5 = m3.i.n(C().C, sVar2, 0);
            b1 b1VarN6 = m3.i.n(C().H, sVar2, 0);
            String strName = order.getState().name();
            Locale locale = Locale.getDefault();
            locale.getClass();
            strName.toUpperCase(locale).getClass();
            if (order.getState() == OrderState.ACTIVE || order.getState() == OrderState.COLLECTION_DELEGATED) {
                ((Number) b1VarN4.getValue()).longValue();
            }
            if (w6VarF.d() == x6.Expanded) {
                getWindow().setFlags(8192, 8192);
            } else {
                getWindow().clearFlags(8192);
            }
            long jLongValue = ((Number) b1VarN4.getValue()).longValue();
            if (((String) b1VarN5.getValue()) == null) {
                sVar2.a0(-384945516);
                sVar2.q(false);
                function0 = null;
            } else {
                sVar2.a0(-384945515);
                Object objM5 = sVar2.M();
                if (objM5 == fVar) {
                    objM5 = new bm.j(b1Var6, 23);
                    sVar2.k0(objM5);
                }
                function0 = (Function0) objM5;
                sVar2.q(false);
            }
            go.a aVar = new go.a(order, jLongValue, b1Var4, b1Var, b1Var5, b1Var2, function0, ((Boolean) b1VarN3.getValue()).booleanValue());
            OrderState orderState = (OrderState) b1VarN6.getValue();
            boolean zF = sVar2.f(b1VarN6) | ((i12 & 7168) == 2048);
            Object objM6 = sVar2.M();
            if (zF || objM6 == fVar) {
                objM6 = new l0(function1, b1VarN6, (x70.c) null, 26);
                sVar2.k0(objM6);
            }
            m3.i.h(orderState, (Function2) objM6, sVar2);
            I(aVar, function1, sVar2, (i12 >> 6) & 1008);
            if (((Boolean) b1Var5.getValue()).booleanValue()) {
                sVar2.a0(-384453359);
                boolean zH = sVar2.h(b0Var) | sVar2.f(w6VarF2);
                Object objM7 = sVar2.M();
                if (zH || objM7 == fVar) {
                    objM7 = new go.f(b0Var, w6VarF2, b1Var5, 0);
                    sVar2.k0(objM7);
                }
                Function0 function02 = (Function0) objM7;
                boolean zBooleanValue = ((Boolean) b1VarN.getValue()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) b1VarN2.getValue()).booleanValue();
                boolean zH2 = sVar2.h(this);
                Object objM8 = sVar2.M();
                if (zH2 || objM8 == fVar) {
                    objM8 = new go.g(this, 0);
                    sVar2.k0(objM8);
                }
                Function1 function12 = (Function1) objM8;
                boolean zH3 = sVar2.h(this) | sVar2.h(b0Var) | sVar2.f(w6VarF2);
                Object objM9 = sVar2.M();
                if (zH3 || objM9 == fVar) {
                    x1 x1Var = new x1(6, this, b0Var, w6VarF2, b1Var5);
                    charityOrderActivity = this;
                    sVar2.k0(x1Var);
                    objM9 = x1Var;
                } else {
                    charityOrderActivity = this;
                }
                sVar = sVar2;
                po.c.e(w6VarF2, function02, zBooleanValue, zBooleanValue2, function12, (Function1) objM9, sVar, 0);
                sVar.q(false);
            } else {
                charityOrderActivity = this;
                sVar = sVar2;
                sVar.a0(-383207903);
                sVar.q(false);
            }
            if (((Boolean) b1Var6.getValue()).booleanValue()) {
                sVar.a0(-383156288);
                boolean zH4 = sVar.h(charityOrderActivity) | sVar.f(b1VarN5);
                Object objM10 = sVar.M();
                if (zH4 || objM10 == fVar) {
                    b1Var3 = b1Var6;
                    objM10 = new g(charityOrderActivity, b1Var3, b1VarN5, 14);
                    sVar.k0(objM10);
                } else {
                    b1Var3 = b1Var6;
                }
                Function0 function03 = (Function0) objM10;
                Object objM11 = sVar.M();
                if (objM11 == fVar) {
                    objM11 = new bm.j(b1Var3, 25);
                    sVar.k0(objM11);
                }
                ki.j.c(function03, (Function0) objM11, sVar, 48);
                z11 = false;
                sVar.q(false);
            } else {
                z11 = false;
                sVar.a0(-382817055);
                sVar.q(false);
            }
            Boolean bool = (Boolean) charityOrderActivity.C().f20770y.a("AUTO_SHOW_REDEEMER_VIEW");
            if ((bool != null ? bool.booleanValue() : z11) && !charityOrderActivity.f9165m) {
                charityOrderActivity.f9165m = true;
            }
        } else {
            charityOrderActivity = this;
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ap.b(charityOrderActivity, order, b1Var, b1Var2, function1, i11);
        }
    }

    public final void L(n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(-1851200445);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            boolean zH = sVar.h(this);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new go.d(this, 3);
                sVar.k0(objM);
            }
            oo.a.q(null, false, R.string.charity_order_toolbar_title, (Function0) objM, sVar, 48, 1);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c60.c(this, i11, 8);
        }
    }

    public final void M(go.a aVar, Function1 function1, List list, boolean z11, n nVar, int i11) {
        int i12;
        CharityOrderActivity charityOrderActivity;
        s sVar = (s) nVar;
        sVar.c0(-2126282892);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function1) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(list) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.g(z11) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(this) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        int i13 = i12;
        if (sVar.R(i13 & 1, (i13 & 9363) != 9362)) {
            d2.c.f(m2.m(q.f5711a, 16), sVar);
            boolean zE = E();
            int i14 = i13 & 112;
            boolean zH = (i14 == 32) | sVar.h(aVar);
            Object objM = sVar.M();
            f fVar = m3.m.f29332a;
            if (zH || objM == fVar) {
                objM = new k(function1, aVar, 0);
                sVar.k0(objM);
            }
            Function0 function0 = (Function0) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new g60.d(24);
                sVar.k0(objM2);
            }
            Function0 function02 = (Function0) objM2;
            boolean zH2 = sVar.h(this) | sVar.h(aVar) | (i14 == 32) | sVar.h(list);
            Object objM3 = sVar.M();
            if (zH2 || objM3 == fVar) {
                g gVar = new g(this, aVar, function1, list, 17);
                charityOrderActivity = this;
                sVar.k0(gVar);
                objM3 = gVar;
            } else {
                charityOrderActivity = this;
            }
            Function0 function03 = (Function0) objM3;
            boolean zH3 = sVar.h(charityOrderActivity) | sVar.h(aVar);
            Object objM4 = sVar.M();
            if (zH3 || objM4 == fVar) {
                objM4 = new l(17, charityOrderActivity, aVar);
                sVar.k0(objM4);
            }
            Function0 function04 = (Function0) objM4;
            int i15 = i13 << 12;
            o.c(aVar, function0, function02, function03, function04, zE, list, z11, sVar, (i13 & 14) | MLKEMEngine.KyberPolyBytes | (3670016 & i15) | (i15 & 29360128));
        } else {
            charityOrderActivity = this;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new eg.b(charityOrderActivity, aVar, function1, list, z11, i11, 1);
        }
    }

    public final void N(go.a aVar, Function1 function1, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(1477774590);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function1) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            boolean z11 = !((Boolean) aVar.f20700c.getValue()).booleanValue();
            Object objM = sVar.M();
            f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = new g9.r0(12);
                sVar.k0(objM);
            }
            x0 x0VarN = s1.r0.n((Function1) objM);
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new g9.r0(12);
                sVar.k0(objM2);
            }
            s1.y.d(z11, null, x0VarN, s1.r0.o(1, (Function1) objM2), null, u3.e.e(-644226266, sVar, new u1(6, aVar, function1)), sVar, 200064, 18);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new go.h(this, aVar, function1, i11, 1);
        }
    }

    public final void O(Order order, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(1312337829);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(order) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(this) ? 32 : 16;
        }
        if (!sVar.R(i12 & 1, (i12 & 19) != 18)) {
            sVar.U();
        } else if (order.getState() == OrderState.REDEEMED && !order.isRated() && order.getCanBeRated()) {
            sVar.a0(-1230902632);
            d2.c.f(m2.m(q.f5711a, 16), sVar);
            boolean zH = sVar.h(this);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new go.g(this, 3);
                sVar.k0(objM);
            }
            oo.a.G(order, (Function1) objM, sVar, i12 & 14);
            sVar.q(false);
        } else {
            sVar.a0(-1230590307);
            sVar.q(false);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new go.j(this, order, i11, 1);
        }
    }

    public final void P(Order order, n nVar, int i11) {
        int i12;
        Address address;
        s sVar = (s) nVar;
        sVar.c0(-131050748);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(order) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(this) ? 32 : 16;
        }
        if (!sVar.R(i12 & 1, (i12 & 19) != 18)) {
            sVar.U();
        } else if (d0.h(OrderState.ACTIVE, OrderState.COLLECTION_OFFERED).contains(order.getState())) {
            sVar.a0(-7427093);
            d2.c.f(m2.m(q.f5711a, 16), sVar);
            String storeName = order.getStoreName();
            StoreLocation pickupLocation = order.getPickupLocation();
            String streetAddress = (pickupLocation == null || (address = pickupLocation.getAddress()) == null) ? null : address.getStreetAddress();
            String itemOrStoreLogoUrl = order.getItemOrStoreLogoUrl();
            boolean zH = sVar.h(this) | sVar.h(order);
            Object objM = sVar.M();
            f fVar = m3.m.f29332a;
            if (zH || objM == fVar) {
                objM = new l(16, this, order);
                sVar.k0(objM);
            }
            Function0 function0 = (Function0) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new g60.d(23);
                sVar.k0(objM2);
            }
            u.q(storeName, streetAddress, itemOrStoreLogoUrl, function0, (Function0) objM2, order.isFlashSales(), sVar, 24576);
            sVar.q(false);
        } else {
            sVar.a0(-7009058);
            sVar.q(false);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new go.j(this, order, i11, 0);
        }
    }

    @Override // go.w
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final v C() {
        return (v) this.f9163j.getValue();
    }

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1000 && i12 == 1002) {
            setResult(AppConstants.RESULT_CODE_AUTO_REFUND);
            getOnBackPressedDispatcher().d();
        }
    }

    @Override // go.w, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        o30.f0.S(this, true);
        super.onCreate(bundle);
        a70.a.t(this, lv.s.B);
        v80.f0.B(m1.c(this), null, null, new go.l(this, null), 3);
        c cVar = this.f9164k;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
            cVar = null;
        }
        c.b(cVar, this, null, 6);
        getOnBackPressedDispatcher().a(this.f9166n);
        e.f.a(this, new u3.d(new go.b(this), true, 365124747));
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (E()) {
            C().a();
        }
        C().m();
    }
}
