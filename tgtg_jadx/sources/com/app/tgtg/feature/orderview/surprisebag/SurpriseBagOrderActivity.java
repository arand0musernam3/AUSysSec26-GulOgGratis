package com.app.tgtg.feature.orderview.surprisebag;

import a3.t1;
import android.os.Bundle;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.g1;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import b0.x1;
import b4.q;
import com.app.tgtg.feature.itemview.ui.ItemViewActivity;
import com.app.tgtg.feature.storeview.ui.StoreViewActivity;
import com.app.tgtg.model.remote.StoreId;
import com.app.tgtg.model.remote.invitation.OrderDataForInvitation;
import com.app.tgtg.model.remote.item.BasicItemInformation;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.StoreLocation;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.CancellingEntity;
import com.app.tgtg.model.remote.item.response.PaymentState;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderState;
import cv.i;
import d2.z2;
import e70.c;
import f30.a;
import f70.m;
import g3.v3;
import g3.w6;
import g3.x6;
import gn.j;
import go.w;
import gv.b;
import h0.g;
import java.util.Locale;
import java.util.WeakHashMap;
import jb.u;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import m3.b1;
import m3.c3;
import m3.f;
import m3.s;
import m3.w1;
import mr.e;
import mv.a0;
import mv.r0;
import mv.z;
import no.g0;
import no.k;
import no.m0;
import no.n;
import no.n0;
import no.o;
import no.p;
import no.v;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import se.d;
import u70.l;
import u70.t;
import v80.b0;
import y80.h1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class SurpriseBagOrderActivity extends w {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f9178y = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n1 f9179j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f9180k;
    public d l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f9181m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t f9182n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f9183o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f9184p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9185q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f9186r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f9187s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f9188t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f9189u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final e f9190v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ActivityResultLauncher f9191w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ActivityResultLauncher f9192x;

    public SurpriseBagOrderActivity() {
        super(1);
        this.f9179j = new n1(Reflection.getOrCreateKotlinClass(m0.class), new no.w(this, 1), new no.w(this, 0), new no.w(this, 2));
        this.f9182n = l.b(new n(this, 2));
        this.f9190v = new e(this, 1);
        this.f9191w = registerForActivityResult(new g1(4), new k(this, 1));
        this.f9192x = registerForActivityResult(new g1(4), new k(this, 2));
    }

    public static void P(SurpriseBagOrderActivity surpriseBagOrderActivity, Order order, OrderDataForInvitation orderDataForInvitation, int i11) {
        StoreLocation pickupLocation;
        LatLngInfo latLngInfo;
        StoreLocation pickupLocation2;
        LatLngInfo latLngInfo2;
        StoreLocation pickupLocation3;
        LatLngInfo latLngInfo3;
        StoreLocation pickupLocation4;
        LatLngInfo latLngInfo4;
        if ((i11 & 1) != 0) {
            order = null;
        }
        if ((i11 & 2) != 0) {
            orderDataForInvitation = null;
        }
        m0 m0VarC = surpriseBagOrderActivity.C();
        double longitude = 0.0d;
        double latitude = (order == null || (pickupLocation4 = order.getPickupLocation()) == null || (latLngInfo4 = pickupLocation4.getLatLngInfo()) == null) ? (orderDataForInvitation == null || (pickupLocation = orderDataForInvitation.getPickupLocation()) == null || (latLngInfo = pickupLocation.getLatLngInfo()) == null) ? 0.0d : latLngInfo.getLatitude() : latLngInfo4.getLatitude();
        if (order != null && (pickupLocation3 = order.getPickupLocation()) != null && (latLngInfo3 = pickupLocation3.getLatLngInfo()) != null) {
            longitude = latLngInfo3.getLongitude();
        } else if (orderDataForInvitation != null && (pickupLocation2 = orderDataForInvitation.getPickupLocation()) != null && (latLngInfo2 = pickupLocation2.getLatLngInfo()) != null) {
            longitude = latLngInfo2.getLongitude();
        }
        m0VarC.I.f26484a.a(new m(latitude, longitude));
        surpriseBagOrderActivity.C().l(i.ACTION_FIND_STORE, g.E(new Pair(dv.a.METHOD, new dv.c("Find_Store_Button"))));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(m3.b1 r47, m3.n r48, int r49) {
        /*
            Method dump skipped, instruction units count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity.G(m3.b1, m3.n, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0313  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [b4.t] */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r13v30, types: [m3.n] */
    /* JADX WARN: Type inference failed for: r14v1, types: [m3.n, m3.s] */
    /* JADX WARN: Type inference failed for: r14v12, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v29, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r2v30, types: [m3.n, m3.s] */
    /* JADX WARN: Type inference failed for: r2v36, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r2v47, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r2v48, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v70 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(final com.app.tgtg.model.remote.order.Order r49, final long r50, final v80.b0 r52, final m3.b1 r53, final m3.b1 r54, final m3.b1 r55, final m3.b1 r56, final m3.b1 r57, final m3.b1 r58, final m3.b1 r59, final m3.b1 r60, final m3.b1 r61, final m3.b1 r62, final m3.b1 r63, m3.n r64, final int r65, final int r66) {
        /*
            Method dump skipped, instruction units count: 2654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity.H(com.app.tgtg.model.remote.order.Order, long, v80.b0, m3.b1, m3.b1, m3.b1, m3.b1, m3.b1, m3.b1, m3.b1, m3.b1, m3.b1, m3.b1, m3.b1, m3.n, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x05ff  */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r10v1, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r10v11, types: [m3.n, m3.s] */
    /* JADX WARN: Type inference failed for: r10v12, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r10v13, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r10v15, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r10v16, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r10v17, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r10v19, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r10v20, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v5, types: [m3.n] */
    /* JADX WARN: Type inference failed for: r15v6, types: [m3.n] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(com.app.tgtg.model.remote.order.Order r21, m3.b1 r22, m3.b1 r23, m3.b1 r24, m3.b1 r25, m3.b1 r26, m3.b1 r27, m3.b1 r28, m3.n r29, int r30) {
        /*
            Method dump skipped, instruction units count: 1577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity.I(com.app.tgtg.model.remote.order.Order, m3.b1, m3.b1, m3.b1, m3.b1, m3.b1, m3.b1, m3.b1, m3.n, int):void");
    }

    public final void J(Order order, b1 b1Var, b1 b1Var2, b1 b1Var3, b1 b1Var4, b1 b1Var5, b1 b1Var6, m3.n nVar, int i11) {
        b1 b1Var7;
        b0 b0Var;
        float f11;
        f fVar;
        boolean z11;
        b1 b1Var8;
        s sVar;
        w6 w6Var;
        int i12;
        s sVar2;
        w6 w6Var2;
        w6 w6Var3;
        s sVar3 = (s) nVar;
        sVar3.c0(1875272742);
        int i13 = i11 | (sVar3.h(order) ? 4 : 2) | (sVar3.h(this) ? 8388608 : 4194304);
        if (sVar3.R(i13 & 1, (4793491 & i13) != 4793490)) {
            WeakHashMap weakHashMap = z2.f13983w;
            float fA = d2.c.j(d2.b.e(sVar3).f13988e, sVar3).a();
            Object objM = sVar3.M();
            f fVar2 = m3.m.f29332a;
            if (objM == fVar2) {
                objM = m3.i.o(kotlin.coroutines.g.f26549a, sVar3);
                sVar3.k0(objM);
            }
            b0 b0Var2 = (b0) objM;
            w6 w6VarF = v3.f(6, 2, null, sVar3);
            w6 w6VarF2 = v3.f(6, 2, null, sVar3);
            Object objM2 = sVar3.M();
            if (objM2 == fVar2) {
                objM2 = m3.i.w(Boolean.TRUE);
                sVar3.k0(objM2);
            }
            b1 b1Var9 = (b1) objM2;
            Object objM3 = sVar3.M();
            if (objM3 == fVar2) {
                objM3 = m3.i.w(Boolean.FALSE);
                sVar3.k0(objM3);
            }
            b1 b1Var10 = (b1) objM3;
            Object objM4 = sVar3.M();
            if (objM4 == fVar2) {
                objM4 = m3.i.w(Boolean.FALSE);
                sVar3.k0(objM4);
            }
            b1 b1Var11 = (b1) objM4;
            Object objM5 = sVar3.M();
            if (objM5 == fVar2) {
                objM5 = m3.i.w(Boolean.FALSE);
                sVar3.k0(objM5);
            }
            b1 b1Var12 = (b1) objM5;
            Object objM6 = sVar3.M();
            if (objM6 == fVar2) {
                objM6 = m3.i.w(Boolean.FALSE);
                sVar3.k0(objM6);
            }
            b1 b1Var13 = (b1) objM6;
            b1 b1VarN = m3.i.n(C().f22226u, sVar3, 0);
            b1 b1VarN2 = m3.i.n(C().f22228w, sVar3, 0);
            C().g(order);
            b1 b1VarN3 = m3.i.n((h1) C().c().f3501c, sVar3, 0);
            Object objM7 = sVar3.M();
            if (objM7 == fVar2) {
                objM7 = m3.i.q(new t1(b1VarN3, 7));
                sVar3.k0(objM7);
            }
            c3 c3Var = (c3) objM7;
            b1 b1VarM = m3.i.m(this.f20776e, 0, null, sVar3, 48, 2);
            String strName = order.getState().name();
            Locale locale = Locale.getDefault();
            locale.getClass();
            String upperCase = strName.toUpperCase(locale);
            upperCase.getClass();
            this.f9186r = upperCase;
            if (order.getState() == OrderState.ACTIVE || order.getState() == OrderState.COLLECTION_DELEGATED) {
                this.f9185q = ((Number) c3Var.getValue()).longValue() < 1;
            }
            if (this.f9184p) {
                S(this.f9186r, this.f9185q);
            }
            if (w6VarF.d() == x6.Expanded) {
                getWindow().setFlags(8192, 8192);
            } else {
                getWindow().clearFlags(8192);
            }
            Boolean bool = (Boolean) C().f31266y.a("AUTO_SHOW_REDEEMER_VIEW");
            if ((bool != null ? bool.booleanValue() : false) && !this.f9187s && K()) {
                this.f9187s = true;
                b1Var10.setValue(Boolean.TRUE);
            }
            long jLongValue = ((Number) c3Var.getValue()).longValue();
            int i14 = i13 & 14;
            H(order, jLongValue, b0Var2, b1Var10, b1Var, b1Var2, b1Var3, b1Var4, b1Var11, b1Var12, b1Var13, b1Var9, b1Var5, b1Var6, sVar3, i14 | 920349696, ((i13 >> 9) & 57344) | 3510);
            s sVar4 = sVar3;
            if (((Boolean) b1Var10.getValue()).booleanValue()) {
                sVar4.a0(1614094941);
                f11 = fA;
                b4.t tVarD = d2.c.D(q.f5711a, 0.0f, 0.0f, 0.0f, f11, 7);
                boolean zH = sVar4.h(this);
                Object objM8 = sVar4.M();
                fVar = fVar2;
                if (zH || objM8 == fVar) {
                    objM8 = new p(this);
                    sVar4.k0(objM8);
                }
                fo.b bVar = (fo.b) objM8;
                int iIntValue = ((Number) b1VarM.getValue()).intValue();
                Object objM9 = sVar4.M();
                if (objM9 == fVar) {
                    objM9 = new ms.a(b1Var10, 15);
                    sVar4.k0(objM9);
                }
                b1Var7 = b1Var13;
                oo.a.I(order, tVarD, bVar, w6VarF, b0Var2, iIntValue, (Function0) objM9, sVar4, i14 | 1572864);
                b0Var = b0Var2;
                sVar4 = sVar4;
                z11 = false;
                sVar4.q(false);
            } else {
                b1Var7 = b1Var13;
                b0Var = b0Var2;
                f11 = fA;
                fVar = fVar2;
                z11 = false;
                sVar4.a0(1614595932);
                sVar4.q(false);
            }
            if (((Boolean) b1Var11.getValue()).booleanValue()) {
                sVar4.a0(1614683662);
                boolean zH2 = sVar4.h(this);
                Object objM10 = sVar4.M();
                if (zH2 || objM10 == fVar) {
                    b1Var8 = b1Var;
                    i12 = 1;
                    objM10 = new o(this, b1Var8, b1Var11, i12);
                    sVar4.k0(objM10);
                } else {
                    b1Var8 = b1Var;
                    i12 = 1;
                }
                Function0 function0 = (Function0) objM10;
                Object objM11 = sVar4.M();
                if (objM11 == fVar) {
                    objM11 = new ms.a(b1Var11, 16);
                    sVar4.k0(objM11);
                }
                w6Var = w6VarF2;
                po.c.h(w6Var, function0, (Function0) objM11, f11, sVar4, MLKEMEngine.KyberPolyBytes);
                sVar = sVar4;
                sVar.q(z11);
            } else {
                b1Var8 = b1Var;
                sVar = sVar4;
                w6Var = w6VarF2;
                i12 = 1;
                sVar.a0(1615742684);
                sVar.q(z11);
            }
            if (((Boolean) b1Var12.getValue()).booleanValue()) {
                sVar.a0(1615835653);
                boolean zH3 = sVar.h(this) | sVar.h(b0Var) | sVar.f(w6Var);
                Object objM12 = sVar.M();
                if (zH3 || objM12 == fVar) {
                    w6Var3 = w6Var;
                    b0 b0Var3 = b0Var;
                    cg.d dVar = new cg.d(this, b1Var8, b0Var3, w6Var3, b1Var12, 3);
                    b0Var = b0Var3;
                    sVar.k0(dVar);
                    objM12 = dVar;
                } else {
                    w6Var3 = w6Var;
                }
                Function0 function02 = (Function0) objM12;
                Object objM13 = sVar.M();
                if (objM13 == fVar) {
                    objM13 = new ms.a(b1Var11, 17);
                    sVar.k0(objM13);
                }
                Function0 function03 = (Function0) objM13;
                w6Var = w6Var3;
                s sVar5 = sVar;
                po.c.k(w6Var, function02, function03, f11, sVar5, MLKEMEngine.KyberPolyBytes);
                sVar2 = sVar5;
                sVar2.q(z11);
            } else {
                sVar2 = sVar;
                sVar2.a0(1617026332);
                sVar2.q(z11);
            }
            if (((Boolean) b1Var7.getValue()).booleanValue()) {
                sVar2.a0(1617127888);
                boolean zH4 = sVar2.h(b0Var) | sVar2.f(w6Var);
                Object objM14 = sVar2.M();
                if (zH4 || objM14 == fVar) {
                    objM14 = new go.f(b0Var, w6Var, b1Var7, 2);
                    sVar2.k0(objM14);
                }
                Function0 function04 = (Function0) objM14;
                boolean zBooleanValue = ((Boolean) b1VarN.getValue()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) b1VarN2.getValue()).booleanValue();
                boolean zH5 = sVar2.h(this);
                Object objM15 = sVar2.M();
                if (zH5 || objM15 == fVar) {
                    objM15 = new no.m(this, i12);
                    sVar2.k0(objM15);
                }
                Function1 function1 = (Function1) objM15;
                boolean zH6 = sVar2.h(this) | sVar2.h(b0Var) | sVar2.f(w6Var);
                Object objM16 = sVar2.M();
                if (zH6 || objM16 == fVar) {
                    w6Var2 = w6Var;
                    x1 x1Var = new x1(18, this, b0Var, w6Var2, b1Var7);
                    sVar2.k0(x1Var);
                    objM16 = x1Var;
                } else {
                    w6Var2 = w6Var;
                }
                s sVar6 = sVar2;
                po.c.e(w6Var2, function04, zBooleanValue, zBooleanValue2, function1, (Function1) objM16, sVar6, 0);
                sVar3 = sVar6;
                sVar3.q(z11);
            } else {
                sVar3 = sVar2;
                sVar3.a0(1618615516);
                sVar3.q(z11);
            }
        } else {
            sVar3.U();
        }
        w1 w1VarS = sVar3.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new j(this, order, b1Var, b1Var2, b1Var3, b1Var4, b1Var5, b1Var6, i11, 1);
        }
    }

    public final boolean K() {
        return C().A.n().getCanSwipeOffline() || r0.u(this);
    }

    public final d L() {
        d dVar = this.l;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("helpDeskConstant");
        return null;
    }

    @Override // go.w
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final m0 C() {
        return (m0) this.f9179j.getValue();
    }

    public final void N(n0 n0Var) {
        a0 a0Var = new a0();
        z zVar = z.DISCOVER;
        zVar.getClass();
        a0Var.f30138a = zVar;
        n0Var.getClass();
        a0Var.f30147j = n0Var;
        a0Var.c(this);
    }

    public final void O(BasicItem basicItem) {
        m0 m0VarC = C();
        String strMo340getItemIdFvU5WIY = basicItem.getInformation().mo340getItemIdFvU5WIY();
        f70.i iVar = f70.i.STCB_RECOMMENDATION;
        m0VarC.getClass();
        strMo340getItemIdFvU5WIY.getClass();
        iVar.getClass();
        ko.b bVar = m0VarC.I;
        bVar.getClass();
        f70.g gVar = bVar.f26484a;
        mk.c cVar = new mk.c(strMo340getItemIdFvU5WIY, ItemViewActivity.class);
        cVar.f29986i = iVar;
        gVar.a(cVar.a());
    }

    public final void Q(String str) {
        m0 m0VarC = C();
        m0VarC.getClass();
        str.getClass();
        ko.b bVar = m0VarC.I;
        bVar.getClass();
        bVar.f26484a.a(new f70.b(StoreViewActivity.class, u.x(new Pair("STORE_ID", StoreId.m269boximpl(str)), new Pair("ORIGIN", f70.i.UNKNOWN)), false, false, false, null, null, null, null, false, 1020));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R() {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity.R():void");
    }

    public final void S(String str, boolean z11) {
        dv.d dVarY;
        BasicItemInformation information;
        PaymentState paymentState;
        CancellingEntity cancellingEntity;
        if (str == null) {
            this.f9184p = true;
            return;
        }
        Pair pair = new Pair(dv.a.STATE, new dv.c(str));
        Pair pair2 = new Pair(dv.a.SWIPE_ACTIVE, new dv.c(Boolean.valueOf(z11)));
        Pair pair3 = new Pair(dv.a.NOTIFICATION_ENABLED, new dv.c(Boolean.valueOf(NotificationManagerCompat.from(this).areNotificationsEnabled())));
        dv.a aVar = dv.a.ORDER_ID;
        Order order = (Order) C().f22215i.f45488a.getValue();
        String strA = null;
        Pair pair4 = new Pair(aVar, new dv.c(order != null ? order.m429getOrderIdreIZeYA() : null));
        dv.a aVar2 = dv.a.ITEM_TYPE;
        Order order2 = (Order) C().f22215i.f45488a.getValue();
        Pair pair5 = new Pair(aVar2, new dv.c(order2 != null ? order2.orderTypeMappedToItemTypeForTracking() : null));
        dv.a aVar3 = dv.a.CANCELLING_ENTITY;
        Order order3 = (Order) C().f22215i.f45488a.getValue();
        Pair pair6 = new Pair(aVar3, new dv.c((order3 == null || (cancellingEntity = order3.getCancellingEntity()) == null) ? null : cancellingEntity.name()));
        dv.a aVar4 = dv.a.PAYMENT_STATE;
        Order order4 = (Order) C().f22215i.f45488a.getValue();
        Pair pair7 = new Pair(aVar4, new dv.c((order4 == null || (paymentState = order4.getPaymentState()) == null) ? null : paymentState.name()));
        Pair pair8 = new Pair(dv.a.COLLECTION_TYPE, new dv.c(C().d()));
        dv.a aVar5 = dv.a.STCB_RECOMMENDED_ITEM_ID;
        BasicItem basicItem = (BasicItem) C().f31248b0.f45488a.getValue();
        Pair pair9 = new Pair(aVar5, new dv.c((basicItem == null || (information = basicItem.getInformation()) == null) ? null : information.mo340getItemIdFvU5WIY()));
        dv.a aVar6 = dv.a.OPENED_FROM;
        f70.i iVar = (f70.i) C().f31266y.a("ORIGIN");
        if (iVar != null && (dVarY = zz.f.y(iVar)) != null) {
            strA = dVarY.a();
        }
        if (strA == null) {
            strA = "";
        }
        C().l(i.SCREEN_ORDER, g.E(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair(aVar6, new dv.c(strA))));
        this.f9184p = false;
    }

    @Override // go.w, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        f0.S(this, true);
        super.onCreate(bundle);
        a70.a.t(this, lv.s.B);
        c cVar = null;
        v80.f0.B(m1.c(this), null, null, new v(this, null), 3);
        c cVar2 = this.f9180k;
        if (cVar2 != null) {
            cVar = cVar2;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
        }
        c.b(cVar, this, new no.m(this, 5), 2);
        Object value = this.f9182n.getValue();
        value.getClass();
        ((f30.d) value).b().addOnCompleteListener(new k(this, 0));
        getOnBackPressedDispatcher().a(this.f9190v);
        e.f.a(this, new u3.d(new lk.a(this, 23), true, -259528348));
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void onResume() {
        String invitationId;
        super.onResume();
        if (!this.f9189u) {
            m0 m0VarC = C();
            boolean z11 = m0VarC.f31265s0;
            h1 h1Var = m0VarC.f22215i;
            if (z11) {
                Order order = (Order) h1Var.f45488a.getValue();
                if (order != null) {
                    m0VarC.b(order.m429getOrderIdreIZeYA());
                }
            } else {
                Order order2 = (Order) h1Var.f45488a.getValue();
                if (order2 != null && (invitationId = order2.getInvitationId()) != null) {
                    v80.f0.B(m1.d(m0VarC), null, null, new g0(m0VarC, invitationId, false, null), 3);
                }
            }
        }
        if (E()) {
            C().a();
        }
        C().m();
        S(this.f9186r, this.f9185q);
    }
}
