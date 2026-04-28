package bx;

import a3.o2;
import a3.p0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.webkit.URLUtil;
import android.widget.Toast;
import androidx.lifecycle.s1;
import androidx.recyclerview.widget.m0;
import b4.q;
import b4.t;
import bx.o;
import c5.v0;
import c5.x1;
import com.app.tgtg.R;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.item.ItemTagInfo;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.FlashSalesItem;
import com.app.tgtg.model.remote.item.response.ManufacturerItem;
import com.app.tgtg.model.remote.manufacturer.response.Brand;
import com.app.tgtg.model.remote.manufacturer.response.ManufacturerInformation;
import com.app.tgtg.model.remote.order.AdditionalOrderInformation;
import com.app.tgtg.model.remote.order.Changes;
import com.app.tgtg.model.remote.order.OldValue;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderItem;
import com.app.tgtg.model.remote.order.OrderState;
import com.app.tgtg.model.remote.order.UpdateNotificationType;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.SpecificationLine;
import com.app.tgtg.model.remote.profile.response.ProfileFeature;
import com.app.tgtg.model.remote.profile.response.StoreSignupCardDetails;
import com.app.tgtg.model.remote.user.requests.CollectionTime;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.b2;
import d2.g0;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.p;
import d2.w;
import d2.w0;
import d2.y;
import d2.z;
import d40.t1;
import g3.o6;
import g3.r9;
import g3.s0;
import g3.u;
import g3.v;
import i4.l0;
import j5.r;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.b0;
import kotlinx.coroutines.DispatchException;
import m3.b1;
import m3.d3;
import m3.i;
import m3.k1;
import m3.m;
import m3.n;
import m3.s;
import m3.u1;
import m3.w1;
import mv.r0;
import o00.x0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import v1.a0;
import z4.c0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static i4.f f6743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static i4.c f6744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static k4.b f6745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static p4.f f6746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f6747e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f6748f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f6749g = 0;

    public static final void A(go.a aVar, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(527487656);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i13 = 0;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            float f11 = 24;
            b4.t tVarB = d2.c.B(b4.q.f5711a, f11, 0.0f, 2);
            jb.u.m(d2.c.D(tVarB, 0.0f, f11, 0.0f, 0.0f, 13), f0.U(sVar, R.string.charity_orderview_information_reservation_id_label), null, false, sVar, 6, 12);
            b4.t tVarD = d2.c.D(tVarB, 0.0f, 2, 0.0f, 0.0f, 13);
            Order order = aVar.f20698a;
            String strT = f0.T(R.string.orderview_information_item_info, new Object[]{String.valueOf(order.getQuantity()), f0.H(R.plurals.charity_orderview_information_item_info_label, sVar, order.getQuantity())}, sVar);
            String upperCase = b0.y(4, order.m429getOrderIdreIZeYA()).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            h0.g.g(tVarD, strT, upperCase, false, null, null, sVar, 6, 56);
            sVar = sVar;
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new go.r(aVar, i11, i13);
        }
    }

    public static final void B(m3.n nVar, int i11) {
        m3.s sVar;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(1522327425);
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
            w1VarS.f29476d = new g60.a(i11, 8);
        }
    }

    public static final void C(go.a aVar, Function0 function0, m3.n nVar, int i11) {
        int i12;
        Order order = aVar.f20698a;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1129810873);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function0) ? 32 : 16;
        }
        if (!sVar.R(i12 & 1, (i12 & 19) != 18)) {
            sVar.U();
        } else if (order.getState() != OrderState.ACTIVE) {
            sVar.a0(-1462828656);
            m0.c.P(((i12 >> 3) & 14) | MLKEMEngine.KyberPolyBytes, d2.c.B(b4.q.f5711a, 24, 0.0f, 2), order, function0, sVar);
            sVar.q(false);
        } else {
            sVar.a0(-1462650871);
            sVar.q(false);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.x(aVar, function0, i11, 8);
        }
    }

    public static final void D(int i11, long j9, b4.t tVar, ManufacturerItem manufacturerItem, m3.n nVar) {
        ManufacturerItem manufacturerItem2;
        long j11;
        m3.s sVar;
        b4.t tVar2;
        String name;
        Brand brand;
        manufacturerItem.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1043791887);
        int i12 = i11 | 6;
        if ((i11 & 48) == 0) {
            manufacturerItem2 = manufacturerItem;
            i12 |= sVar2.h(manufacturerItem2) ? 32 : 16;
        } else {
            manufacturerItem2 = manufacturerItem;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            j11 = j9;
            i12 |= sVar2.e(j11) ? 256 : 128;
        } else {
            j11 = j9;
        }
        if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
            ManufacturerInformation manufacturerInformation = manufacturerItem2.getInformation().getManufacturerInformation();
            String brandName = (manufacturerInformation == null || (brand = manufacturerInformation.getBrand()) == null) ? null : brand.getBrandName();
            if (brandName == null || brandName.length() == 0) {
                name = manufacturerItem2.getInformation().getName();
                if (name == null) {
                    name = "";
                }
            } else {
                name = r8.k.m(brandName, " - ", manufacturerItem2.getInformation().getName());
            }
            int length = name.length();
            tVar2 = b4.q.f5711a;
            if (length > 0) {
                sVar2.a0(-40665389);
                r9.d(name, tVar2, j11, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, lv.v.l, sVar2, ((i12 << 3) & 112) | (i12 & 896), 12607872, 110584);
                sVar = sVar2;
                sVar.q(false);
            } else {
                sVar = sVar2;
                sVar.a0(-40446095);
                sVar.q(false);
            }
        } else {
            sVar = sVar2;
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new eg.h(tVar2, manufacturerItem2, j9, i11);
        }
    }

    public static final void E(final String str, final OrderState orderState, final List list, final i80.n nVar, m3.n nVar2, final int i11) {
        w1 w1VarS;
        Function2 function2;
        String strT;
        int i12;
        b4.q qVar;
        int i13;
        boolean z11;
        m3.s sVar = (m3.s) nVar2;
        sVar.c0(-795048789);
        int i14 = (i11 & 6) == 0 ? (sVar.f(str) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i14 |= sVar.d(orderState.ordinal()) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i14 |= sVar.h(list) ? 256 : 128;
        }
        int i15 = i11 & 3072;
        int i16 = NewHope.SENDB_BYTES;
        if (i15 == 0) {
            i14 |= sVar.h(nVar) ? 2048 : 1024;
        }
        int i17 = 1;
        boolean z12 = false;
        if (!sVar.R(i14 & 1, (i14 & 1171) != 1170)) {
            sVar.U();
        } else {
            if (orderState == OrderState.CANCELLED || orderState == OrderState.REFUNDED || orderState == OrderState.ACTIVE) {
                w1VarS = sVar.s();
                if (w1VarS != null) {
                    final int i18 = 0;
                    function2 = new Function2() { // from class: mo.b
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i18) {
                                case 0:
                                    ((Integer) obj2).intValue();
                                    o.E(str, orderState, list, nVar, (n) obj, i.F(i11 | 1));
                                    break;
                                default:
                                    ((Integer) obj2).intValue();
                                    o.E(str, orderState, list, nVar, (n) obj, i.F(i11 | 1));
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    };
                    w1VarS.f29476d = function2;
                }
                return;
            }
            if (list == null) {
                sVar.a0(1446600109);
                sVar.q(false);
            } else {
                sVar.a0(1446600110);
                float f11 = lv.t.f28254h;
                b4.q qVar2 = b4.q.f5711a;
                d2.c.f(m2.e(qVar2, f11), sVar);
                sVar.a0(462309641);
                int i19 = 0;
                for (Object obj : list) {
                    int i21 = i19 + 1;
                    if (i19 < 0) {
                        d0.n();
                        throw null;
                    }
                    String str2 = (String) obj;
                    if (list.size() == i17) {
                        strT = b3.i.j(-1272831829, R.string.mnu_order_track_and_trace_button_single, sVar, sVar, z12);
                    } else {
                        sVar.a0(-1272725561);
                        strT = f0.T(R.string.mnu_order_track_and_trace_button_multi, new Object[]{Integer.valueOf(i21)}, sVar);
                        sVar.q(z12);
                    }
                    if (URLUtil.isValidUrl(str2)) {
                        sVar.a0(-1272461782);
                        l2.f fVarA = l2.g.a(100);
                        b2 b2Var = g3.p.f19253a;
                        String str3 = strT;
                        i13 = i17;
                        i12 = i16;
                        qVar = qVar2;
                        g3.o oVarA = g3.p.a(lv.s.J, 0L, 0L, 0L, sVar, 14);
                        a0 a0VarB = v1.n.b((float) 1.8d, lv.s.f28217b);
                        b4.t tVarD = m2.d(qVar, 1.0f);
                        int i22 = ((i14 & 14) == 4 ? i13 : 0) | ((i14 & 7168) == i12 ? i13 : 0) | (sVar.f(str2) ? 1 : 0) | (sVar.f(str3) ? 1 : 0);
                        Object objM = sVar.M();
                        if (i22 != 0 || objM == m3.m.f29332a) {
                            androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.c cVar = new androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.c(14, nVar, str, str2, str3);
                            sVar.k0(cVar);
                            objM = cVar;
                        }
                        m3.s sVar2 = sVar;
                        s0.a((Function0) objM, tVarD, false, fVarA, oVarA, null, a0VarB, null, null, u3.e.e(2089494889, sVar, new o6(str3, 3)), sVar2, 806879280, 420);
                        sVar = sVar2;
                        z11 = false;
                        sVar.q(false);
                    } else {
                        i12 = i16;
                        qVar = qVar2;
                        i13 = i17;
                        z11 = z12;
                        sVar.a0(-1271121714);
                        sVar.q(z11);
                    }
                    i16 = i12;
                    qVar2 = qVar;
                    z12 = z11;
                    i19 = i21;
                    i17 = i13;
                }
                boolean z13 = z12;
                sVar.q(z13);
                sVar.q(z13);
            }
        }
        w1VarS = sVar.s();
        if (w1VarS != null) {
            final int i23 = 1;
            function2 = new Function2() { // from class: mo.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj22) {
                    switch (i23) {
                        case 0:
                            ((Integer) obj22).intValue();
                            o.E(str, orderState, list, nVar, (n) obj2, i.F(i11 | 1));
                            break;
                        default:
                            ((Integer) obj22).intValue();
                            o.E(str, orderState, list, nVar, (n) obj2, i.F(i11 | 1));
                            break;
                    }
                    return Unit.f26487a;
                }
            };
            w1VarS.f29476d = function2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void F(b4.t tVar, boolean z11, float[] fArr, Function1 function1, m3.n nVar, int i11) {
        int i12;
        int i13;
        boolean z12;
        boolean z13;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1813075079);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i14 = i12 | 48;
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i14 = i12 | 176;
        }
        if ((i11 & 3072) == 0) {
            i14 |= sVar.h(fArr != 0 ? new l0(fArr) : null) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i14 |= sVar.h(function1) ? 16384 : 8192;
        }
        if ((i14 & 9363) == 9362 && sVar.B()) {
            sVar.U();
            z13 = z11;
        } else {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                i13 = i14 & (-897);
                z12 = true;
            } else {
                sVar.U();
                i13 = i14 & (-897);
                z12 = z11;
            }
            sVar.r();
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                m3.d0 d0Var = new m3.d0(m3.i.o(kotlin.coroutines.g.f26549a, sVar));
                sVar.k0(d0Var);
                objM = d0Var;
            }
            v80.b0 b0Var = ((m3.d0) objM).f29260a;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new k1.e(b0Var);
                sVar.k0(objM2);
            }
            k1.e eVar = (k1.e) objM2;
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = new im.a(22);
                sVar.k0(objM3);
            }
            Function1 function12 = (Function1) objM3;
            boolean zH = sVar.h(eVar);
            Object objM4 = sVar.M();
            if (zH || objM4 == fVar) {
                objM4 = new jd.a(eVar, 6);
                sVar.k0(objM4);
            }
            Function1 function13 = (Function1) objM4;
            boolean zH2 = sVar.h(fArr != 0 ? new l0(fArr) : null) | ((57344 & i13) == 16384) | sVar.e(0L) | sVar.h(eVar) | ((i13 & 112) == 32);
            Object objM5 = sVar.M();
            if (zH2 || objM5 == fVar) {
                objM5 = new a3.b(eVar, function1, z12, fArr);
                sVar.k0(objM5);
            }
            c6.r.a(function12, tVar, function13, null, (Function1) objM5, sVar, ((i13 << 3) & 112) | 6, 8);
            z13 = z12;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.m(tVar, z13, (Serializable) fArr, (u70.f) function1, i11, 6);
        }
    }

    public static final void G(ap.n nVar, m3.n nVar2, int i11) {
        ap.n nVar3;
        b1 b1Var;
        m3.s sVar = (m3.s) nVar2;
        sVar.c0(1648224869);
        int i12 = i11 | (sVar.h(nVar) ? 4 : 2);
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(nVar.f4557a0);
                sVar.k0(objM);
            }
            b1 b1Var2 = (b1) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new g4.v();
                sVar.k0(objM2);
            }
            g4.v vVar = (g4.v) objM2;
            b1 b1VarN = m3.i.n(nVar.f4569k, sVar, 0);
            Object value = b1VarN.getValue();
            boolean zF = sVar.f(b1VarN) | sVar.h(nVar);
            Object objM3 = sVar.M();
            if (zF || objM3 == fVar) {
                objM3 = new dp.o(b1VarN, nVar, null, 3);
                sVar.k0(objM3);
            }
            m3.i.h(value, (Function2) objM3, sVar);
            g0 g0Var = m2.f13850c;
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(g0Var, sVar);
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
            b4.k kVar = b4.d.f5687e;
            d2.u uVar = d2.u.f13938a;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarR = v1.n.r(uVar.a(qVar, kVar), v1.n.q(sVar), true);
            d2.y yVarA = d2.w.a(d2.i.f13805e, b4.d.f5695n, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarR, sVar);
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
            Object objM4 = sVar.M();
            if (objM4 == fVar) {
                objM4 = new cp.i(17);
                sVar.k0(objM4);
            }
            r9.d(f0.U(sVar, R.string.order_rating_what_did_you_get), j5.r.c(qVar, false, (Function1) objM4), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28272k, sVar, 0, 12582912, 131068);
            long j9 = lv.s.J;
            b4.t tVarJ = v1.n.j(qVar, j9, i4.g0.f23254b);
            String str = (String) b1Var2.getValue();
            Object objM5 = sVar.M();
            if (objM5 == fVar) {
                b1Var = b1Var2;
                objM5 = new p0(b1Var, 6);
                sVar.k0(objM5);
            } else {
                b1Var = b1Var2;
            }
            cp.a.p(tVarJ, j9, str, vVar, (Function1) objM5, sVar, 27702, 0);
            sVar.q(true);
            b4.t tVarD = d2.c.D(uVar.a(qVar, b4.d.f5690h), 0.0f, 0.0f, 0.0f, lv.t.f28253g, 7);
            String str2 = (String) b1Var.getValue();
            nVar3 = nVar;
            s1.i.a(Boolean.valueOf(str2 == null || StringsKt.H(str2)), tVarD, null, null, "CTA", null, u3.e.e(944706990, sVar, new dm.e(1, nVar3, b1Var)), sVar, 1597440, 44);
            sVar = sVar;
            sVar.q(true);
        } else {
            nVar3 = nVar;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new dp.m(nVar3, i11, 4);
        }
    }

    public static final String H(Object[] objArr, int i11, int i12, kotlin.collections.m mVar) {
        StringBuilder sb2 = new StringBuilder((i12 * 3) + 2);
        sb2.append("[");
        for (int i13 = 0; i13 < i12; i13++) {
            if (i13 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i11 + i13];
            if (obj == mVar) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public static final t2.c I(u3.d dVar, m3.n nVar, int i11) {
        boolean z11 = (((i11 & 14) ^ 6) > 4 && ((m3.s) nVar).f(dVar)) || (i11 & 6) == 4;
        m3.s sVar = (m3.s) nVar;
        Object objM = sVar.M();
        m3.f fVar = m3.m.f29332a;
        if (z11 || objM == fVar) {
            objM = new t2.c(dVar);
            sVar.k0(objM);
        }
        t2.c cVar = (t2.c) objM;
        boolean zF = sVar.f(cVar);
        Object objM2 = sVar.M();
        if (zF || objM2 == fVar) {
            objM2 = new sg.c(cVar, 4);
            sVar.k0(objM2);
        }
        m3.i.d(cVar, (Function1) objM2, sVar);
        return cVar;
    }

    public static final Boolean J(boolean z11) {
        return Boolean.valueOf(z11);
    }

    public static final void K(int i11) {
        new Integer(i11);
    }

    public static final y9.t L(Context context, Class cls, String str) {
        if (StringsKt.H(str)) {
            i4.a.f("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        }
        if (!Intrinsics.areEqual(str, ":memory:")) {
            return new y9.t(context, cls, str);
        }
        i4.a.f("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        return null;
    }

    public static boolean M(ag.l lVar) {
        Activity activity = lVar.f1443a;
        if (r0.u(activity)) {
            return false;
        }
        Toast.makeText(activity, R.string.generic_error_unable_to_connect_to_internet_please_try_again_later, 0).show();
        f70.i iVar = lVar.f1445c;
        f70.i iVar2 = f70.i.WIDGET;
        if (iVar != iVar2) {
            return true;
        }
        mv.a0 a0Var = new mv.a0();
        iVar2.getClass();
        a0Var.f30139b = iVar2;
        a0Var.c(activity);
        return true;
    }

    public static final void N(Object[] objArr, int i11, int i12) {
        objArr.getClass();
        while (i11 < i12) {
            objArr[i11] = null;
            i11++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlinx.serialization.KSerializer O(i2.x r6, kotlin.reflect.KType r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bx.o.O(i2.x, kotlin.reflect.KType, boolean):kotlinx.serialization.KSerializer");
    }

    public static final void P(Function2 function2, v80.a aVar, v80.a aVar2) {
        try {
            x70.c cVarB = y70.f.b(y70.f.a(function2, aVar, aVar2));
            u70.o oVar = u70.q.f40850b;
            a90.g.h(Unit.f26487a, cVarB);
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).f26625a;
            }
            u70.o oVar2 = u70.q.f40850b;
            aVar2.resumeWith(ba0.g.j(th));
            throw th;
        }
    }

    public static void Q(ag.l lVar, Intent intent, String str) {
        intent.putExtra("ITEM_ID", ItemId.m197boximpl(str));
        Activity activity = lVar.f1443a;
        intent.putExtra("RESUME_PAYMENT_FLOW", false);
        intent.putExtra("ORIGIN", lVar.f1445c);
        intent.putExtra("DISPLAY_TYPE", (String) null);
        intent.putExtra("FILLER_TYPE", (String) null);
        intent.putExtra("CATEGORY_TYPE", lVar.f1444b);
        intent.putExtra("DEEPLINK_PARAMETERS_MAP", (Serializable) null);
        activity.startActivityForResult(intent, AppConstants.REQUEST_CODE_ITEM_VIEW, mv.a.b(activity));
    }

    public static final double R(long j9) {
        return ((j9 >>> 11) * ((double) NewHope.SENDB_BYTES)) + (j9 & 2047);
    }

    public static final String S(int i11, long j9) {
        if (j9 >= 0) {
            String string = Long.toString(j9, CharsKt.checkRadix(i11));
            string.getClass();
            return string;
        }
        long j11 = i11;
        long j12 = ((j9 >>> 1) / j11) << 1;
        long j13 = j9 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        StringBuilder sb2 = new StringBuilder();
        String string2 = Long.toString(j12, CharsKt.checkRadix(i11));
        string2.getClass();
        sb2.append(string2);
        String string3 = Long.toString(j13, CharsKt.checkRadix(i11));
        string3.getClass();
        sb2.append(string3);
        return sb2.toString();
    }

    public static void T(int i11, int i12) {
        String strM;
        if (i11 < 0 || i11 >= i12) {
            if (i11 < 0) {
                strM = t1.M("%s (%s) must not be negative", "index", Integer.valueOf(i11));
            } else {
                if (i12 < 0) {
                    i4.a.f(e0.f.h(i12, "negative size: ", new StringBuilder(String.valueOf(i12).length() + 15)));
                    return;
                }
                strM = t1.M("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i11), Integer.valueOf(i12));
            }
            throw new IndexOutOfBoundsException(strM);
        }
    }

    public static void U(int i11, int i12, int i13) {
        if (i11 < 0 || i12 < i11 || i12 > i13) {
            throw new IndexOutOfBoundsException((i11 < 0 || i11 > i13) ? V(i11, i13, "start index") : (i12 < 0 || i12 > i13) ? V(i12, i13, "end index") : t1.M("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11)));
        }
    }

    public static String V(int i11, int i12, String str) {
        if (i11 < 0) {
            return t1.M("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return t1.M("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        i4.a.f(e0.f.h(i12, "negative size: ", new StringBuilder(String.valueOf(i12).length() + 15)));
        return null;
    }

    public static final void a(go.a aVar, Function0 function0, Function0 function02, boolean z11, m3.n nVar, int i11) {
        int i12;
        Function0 function03;
        long j9 = aVar.f20699b;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(399433197);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function0) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            function03 = function02;
            i12 |= sVar.h(function03) ? 256 : 128;
        } else {
            function03 = function02;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.g(z11) ? NewHope.SENDB_BYTES : 1024;
        }
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            boolean z12 = aVar.f20705h;
            oo.a.k(Long.valueOf(j9), aVar.f20698a.getOrderType(), Boolean.valueOf(z12), function0, vi.c.z(b4.q.f5711a, aVar.f20700c), sVar, (i12 << 6) & 7168, 0);
            oo.a.L(z11, Long.valueOf(j9), Boolean.valueOf(z12), function03, null, aVar.f20703f, sVar, ((i12 >> 9) & 14) | ((i12 << 3) & 7168));
            sVar = sVar;
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.m(aVar, function0, function02, z11, i11, 3);
        }
    }

    public static final void b(go.a aVar, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(831311174);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.h(aVar) ? 4 : 2);
        } else {
            i12 = i11;
        }
        int i13 = 0;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            float f11 = 16;
            float f12 = 24;
            b4.q qVar = b4.q.f5711a;
            s0.g(d2.c.A(qVar, f12, f11), 1, lv.s.H, sVar, 432, 0);
            if (aVar.f20704g != null) {
                sVar.a0(810037194);
                b4.t tVarA = b4.a.a(d2.c.A(m2.f13850c, f12, f11), c5.m2.f7291a, new go.s(aVar, i13));
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
                if (1.0f <= 0.0d) {
                    e2.a.a("invalid weight; must be greater than zero");
                }
                r9.d(f0.U(sVar, R.string.charity_item_ingredients), new n1(1.0f, true), lv.s.f28217b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28281u, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                v1.n.d(x0.z(R.drawable.ic_open_in_new, sVar, 0), "OpenInNew", m2.m(qVar, f12), null, null, 0.0f, null, sVar, 440, 120);
                sVar = sVar;
                sVar.q(true);
                sVar.q(false);
            } else {
                sVar.a0(810786991);
                b4.t tVarZ = d2.c.z(m2.f13850c, lv.t.f28253g);
                d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
                int iHashCode2 = Long.hashCode(sVar.T);
                u3.i iVarL2 = sVar.l();
                b4.t tVarC2 = b4.a.c(tVarZ, sVar);
                b5.j.R.getClass();
                b5.h hVar2 = b5.i.f5839b;
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar2);
                } else {
                    sVar.n0();
                }
                m3.i.C(yVarA, b5.i.f5843f, sVar);
                m3.i.C(iVarL2, b5.i.f5842e, sVar);
                m3.i.v(sVar, Integer.valueOf(iHashCode2), b5.i.f5844g);
                m3.i.z(sVar, b5.i.f5845h);
                m3.i.C(tVarC2, b5.i.f5841d, sVar);
                String strU = f0.U(sVar, R.string.charity_item_ingredients);
                m5.u0 u0Var = lv.v.f28275o;
                long j9 = lv.s.C;
                r9.d(strU, null, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                r9.d(f0.U(sVar, R.string.charity_item_no_allergens), d2.c.D(qVar, 0.0f, lv.t.f28252f, 0.0f, 0.0f, 13), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, 432, 12582912, 131064);
                sVar = sVar;
                sVar.q(true);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new go.r(aVar, i11, 2);
        }
    }

    public static final void c(go.a aVar, Function0 function0, Function0 function02, Function0 function03, Function0 function04, boolean z11, List list, boolean z12, m3.n nVar, int i11) {
        int i12;
        Function0 function05;
        Function0 function06;
        Function0 function07;
        boolean z13;
        Order order = aVar.f20698a;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-222092440);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            function05 = function0;
            i12 |= sVar.h(function05) ? 32 : 16;
        } else {
            function05 = function0;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            function06 = function02;
            i12 |= sVar.h(function06) ? 256 : 128;
        } else {
            function06 = function02;
        }
        if ((i11 & 3072) == 0) {
            function07 = function03;
            i12 |= sVar.h(function07) ? NewHope.SENDB_BYTES : 1024;
        } else {
            function07 = function03;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(function04) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            z13 = z11;
            i12 |= sVar.g(z13) ? 131072 : 65536;
        } else {
            z13 = z11;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.h(list) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar.g(z12) ? 8388608 : 4194304;
        }
        if (sVar.R(i12 & 1, (4793491 & i12) != 4793490)) {
            z5.c cVar = (z5.c) sVar.j(x1.f7416h);
            float fC0 = cVar.c0(12);
            float fC02 = cVar.c0(80);
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = new l2.d(new go.o(fC0, fC02, 0));
                sVar.k0(objM);
            }
            l2.d dVar = (l2.d) objM;
            int i13 = go.t.$EnumSwitchMapping$0[order.getState().ordinal()];
            b4.q qVar = b4.q.f5711a;
            if (i13 == 1 || i13 == 2) {
                sVar.a0(-2105271604);
                s0.b(m2.d(qVar, 1.0f), dVar, s0.p(lv.s.J, sVar, 6), s0.q(2, 0.0f, 0.0f, 0.0f, 62), null, u3.e.e(1730245310, sVar, new cg.b(aVar, function0, function02, function03, function04, z11, list, z12)), sVar, 196662, 16);
                sVar = sVar;
                sVar.q(false);
            } else {
                sVar.a0(-2104415229);
                s0.b(m2.d(qVar, 1.0f), l2.g.b(16), s0.p(ho.r.a(order), sVar, 0), null, null, u3.e.e(-1944955691, sVar, new go.p(aVar, function05, function06, function07, function04, z13, z12, 0)), sVar, 196614, 24);
                sVar = sVar;
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new go.q(aVar, function0, function02, function03, function04, z11, list, z12, i11);
        }
    }

    public static final void d(go.a aVar, Function0 function0, Function0 function02, Function0 function03, Function0 function04, boolean z11, List list, boolean z12, m3.n nVar, int i11, int i12) {
        List list2;
        int i13;
        List list3;
        Order order;
        boolean z13;
        boolean z14;
        b4.q qVar;
        boolean z15;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(939077647);
        int i14 = i11 | (sVar.h(aVar) ? 4 : 2) | (sVar.h(function0) ? 32 : 16) | (sVar.h(function02) ? 256 : 128) | (sVar.h(function03) ? NewHope.SENDB_BYTES : 1024) | (sVar.h(function04) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar.g(z11) ? 131072 : 65536);
        int i15 = i12 & 64;
        if (i15 != 0) {
            i13 = i14 | 1572864;
            list2 = list;
        } else {
            list2 = list;
            i13 = i14 | (sVar.h(list2) ? 1048576 : 524288);
        }
        int i16 = i13 | (sVar.g(z12) ? 8388608 : 4194304);
        if (sVar.R(i16 & 1, (4793491 & i16) != 4793490)) {
            List list4 = i15 != 0 ? n0.f26529a : list2;
            Context context = (Context) sVar.j(v0.f7390b);
            Order order2 = aVar.f20698a;
            if (ho.r.c(order2.getStoreTimeZone()) || !(order2.getState() == OrderState.ACTIVE || order2.getState() == OrderState.COLLECTION_DELEGATED)) {
                order = order2;
                z13 = false;
            } else {
                order = order2;
                z13 = true;
            }
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            List list5 = list4;
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.q qVar2 = b4.q.f5711a;
            b4.t tVarC = b4.a.c(qVar2, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            boolean z16 = z13;
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
            float f11 = 24;
            d2.c.f(m2.e(qVar2, f11), sVar);
            int i17 = i16 & 14;
            C(aVar, function02, sVar, i17 | ((i16 >> 3) & 112));
            int i18 = (i16 >> 12) & 896;
            Order order3 = order;
            u(aVar, context, list5, z16, sVar, i17 | i18);
            A(aVar, sVar, i17);
            OrderState state = order3.getState();
            OrderState orderState = OrderState.ACTIVE;
            if (state == orderState || order3.getState() == OrderState.COLLECTION_OFFERED || order3.getState() == OrderState.COLLECTION_DELEGATED) {
                z14 = true;
                sVar.a0(-1568560541);
                e(aVar, sVar, i17);
                int i19 = i16 >> 6;
                m(aVar, function03, list5, sVar, (i19 & 112) | i17 | i18);
                if (order3.isEdible()) {
                    sVar.a0(-1568429690);
                    b(aVar, sVar, i17);
                    sVar.q(false);
                } else {
                    sVar.a0(-1568376835);
                    sVar.q(false);
                }
                if (z12) {
                    list3 = list5;
                    sVar.a0(-1568053443);
                    sVar.q(false);
                } else {
                    sVar.a0(-1568323484);
                    cg.j.b(0L, 0, sVar, 1);
                    if (order3.getState() == orderState || order3.getState() == OrderState.COLLECTION_OFFERED) {
                        sVar.a0(-1568184573);
                        list3 = list5;
                        a(aVar, function0, function04, z11, sVar, (i16 & 126) | (i19 & 896) | (i19 & 7168));
                        sVar.q(false);
                    } else {
                        sVar.a0(-1568067331);
                        sVar.q(false);
                        list3 = list5;
                    }
                    sVar.q(false);
                }
                sVar.q(false);
            } else {
                sVar.a0(-1568024148);
                m(aVar, function03, list5, sVar, ((i16 >> 6) & 112) | i17 | i18);
                if (order3.isEdible()) {
                    sVar.a0(-1567931706);
                    b(aVar, sVar, i17);
                    sVar.q(false);
                } else {
                    sVar.a0(-1567878851);
                    sVar.q(false);
                }
                if (order3.isRated()) {
                    sVar.a0(-1567835885);
                    b4.t tVarD = d2.c.D(qVar2, 0.0f, 16, 0.0f, 0.0f, 13);
                    qVar = qVar2;
                    i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
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
                    Integer overallRating = order3.getOverallRating();
                    z14 = true;
                    z15 = false;
                    cp.a.i(overallRating != null ? overallRating.intValue() : 0, false, null, 0L, 0L, null, sVar, 0, 254);
                    sVar.q(true);
                    sVar.q(false);
                } else {
                    qVar = qVar2;
                    z14 = true;
                    z15 = false;
                    sVar.a0(-1567672515);
                    sVar.q(false);
                }
                d2.c.f(d2.c.z(qVar, f11), sVar);
                sVar.q(z15);
                list3 = list5;
            }
            sVar.q(z14);
        } else {
            sVar.U();
            list3 = list2;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new go.q(aVar, function0, function02, function03, function04, z11, list3, z12, i11, i12);
        }
    }

    public static final void e(go.a aVar, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1010597131);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i13 = 1;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            String itemCollectionInfo = aVar.f20698a.getItemCollectionInfo();
            if (itemCollectionInfo == null || itemCollectionInfo.length() == 0) {
                sVar.a0(1022273037);
                sVar.q(false);
            } else {
                sVar.a0(1021746409);
                ex.i.c(R.string.charity_orderview_information_collection_instructions_label, null, null, u3.e.e(-376654267, sVar, new a3.m2(aVar, 9)), sVar, 3072, 6);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new go.r(aVar, i11, i13);
        }
    }

    public static final void f(final ManufacturerItem manufacturerItem, final float f11, m3.n nVar, final int i11) {
        manufacturerItem.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-832934398);
        int i12 = (sVar.h(manufacturerItem) ? 4 : 2) | i11 | (sVar.c(f11) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
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
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            b4.t tVarE = m2.e(m2.d(qVar, 1.0f), 160);
            float f12 = lv.t.f28249c;
            z20.b.c(f4.g.b(d2.c.D(tVarE, f12, f12, f12, 0.0f, 8), l2.g.b(8)), manufacturerItem, f11, sVar, (i12 << 3) & 1008);
            List<ItemTagInfo> itemTags = manufacturerItem.getItemTags();
            if (itemTags == null || itemTags.isEmpty()) {
                sVar.a0(-669963962);
                sVar.q(false);
            } else {
                sVar.a0(-670209017);
                b4.t tVarD = b4.a.d(d2.u.f13938a.a(qVar, kVar), 1.0f);
                float f13 = 12;
                bg.m.d(d2.c.v(tVarD, f13, f13), manufacturerItem.getItemTags(), null, sVar, 0, 4);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(f11, i11) { // from class: eg.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ float f15990b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(1);
                    o.f(this.f15989a, this.f15990b, (n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    public static final void g(Order order, i80.n nVar, m3.n nVar2, int i11) {
        m3.s sVar;
        int i12;
        int i13;
        Unit unit;
        b1 b1Var;
        ?? r14;
        m3.s sVar2;
        i80.n nVar3 = nVar;
        order.getClass();
        nVar3.getClass();
        m3.s sVar3 = (m3.s) nVar2;
        sVar3.c0(1218067308);
        int i14 = (sVar3.h(order) ? 4 : 2) | i11 | (sVar3.h(nVar3) ? 32 : 16);
        int i15 = 0;
        if (sVar3.R(i14 & 1, (i14 & 19) != 18)) {
            Object objM = sVar3.M();
            Object obj = m3.m.f29332a;
            if (objM == obj) {
                objM = m3.i.w(new z5.f(0));
                sVar3.k0(objM);
            }
            b1 b1Var2 = (b1) objM;
            Object objM2 = sVar3.M();
            if (objM2 == obj) {
                objM2 = m3.i.w(new z5.f(0));
                sVar3.k0(objM2);
            }
            z5.c cVar = (z5.c) sVar3.j(x1.f7416h);
            b1 b1Var3 = (b1) objM2;
            wi.a.k(lv.s.H, 0.0f, sVar3, 6, 2);
            m3.s sVar4 = sVar3;
            float f11 = lv.t.f28253g;
            b4.q qVar = b4.q.f5711a;
            d2.c.f(m2.e(qVar, f11), sVar4);
            t1.b(f0.U(sVar4, R.string.mnu_order_title_details), null, null, null, sVar4, 3504);
            List<OrderItem> orderItems = order.getOrderItems();
            if (orderItems == null) {
                sVar4.a0(-734892763);
                sVar4.q(false);
                i12 = i14;
                r14 = 0;
                unit = null;
                i13 = 1;
                sVar2 = sVar4;
            } else {
                sVar4.a0(-734892762);
                m3.s sVar5 = sVar4;
                for (OrderItem orderItem : orderItems) {
                    float f12 = lv.t.f28251e;
                    d2.c.f(m2.e(qVar, f12), sVar5);
                    i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar5, i15);
                    int iHashCode = Long.hashCode(sVar5.T);
                    u3.i iVarL = sVar5.l();
                    b4.t tVarC = b4.a.c(qVar, sVar5);
                    b5.j.R.getClass();
                    Function0 function0 = b5.i.f5839b;
                    sVar5.e0();
                    if (sVar5.S) {
                        sVar5.k(function0);
                    } else {
                        sVar5.n0();
                    }
                    m3.i.C(i2VarA, b5.i.f5843f, sVar5);
                    m3.i.C(iVarL, b5.i.f5842e, sVar5);
                    m3.i.v(sVar5, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar5, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar5);
                    b4.t tVarB = m2.b(qVar, ((z5.f) b1Var2.getValue()).f47277a, 0.0f, 2);
                    boolean zF = sVar5.f(cVar);
                    Object objM3 = sVar5.M();
                    if (zF || objM3 == obj) {
                        objM3 = new o2(cVar, b1Var2, 4);
                        sVar5.k0(objM3);
                    }
                    b4.t tVarP = c0.p(tVarB, (Function1) objM3);
                    String str = orderItem.getQuantity() + "x";
                    m5.u0 u0Var = lv.v.f28274n;
                    long j9 = lv.s.C;
                    m3.s sVar6 = sVar5;
                    z5.c cVar2 = cVar;
                    int i16 = i14;
                    r9.d(str, tVarP, j9, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, u0Var, sVar6, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
                    b4.t tVarB2 = d2.c.B(qVar, f12, 0.0f, 2);
                    if (1.0f <= 0.0d) {
                        e2.a.a("invalid weight; must be greater than zero");
                    }
                    r9.d(String.valueOf(orderItem.getItemName()), b3.i.e(1.0f, tVarB2, true), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar6, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                    b4.t tVarB3 = m2.b(qVar, ((z5.f) b1Var3.getValue()).f47277a, 0.0f, 2);
                    boolean zF2 = sVar6.f(cVar2);
                    Object objM4 = sVar6.M();
                    if (zF2 || objM4 == obj) {
                        b1Var = b1Var3;
                        objM4 = new o2(cVar2, b1Var, 5);
                        sVar6.k0(objM4);
                    } else {
                        b1Var = b1Var3;
                    }
                    r9.d(mv.d.i(orderItem.getItemPrice(), orderItem.getQuantity()), c0.p(tVarB3, (Function1) objM4), j9, 0L, null, 0L, null, new x5.k(6), 0L, 0, false, 0, 0, null, lv.v.f28275o, sVar6, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
                    m3.s sVar7 = sVar6;
                    sVar7.q(true);
                    cVar = cVar2;
                    b1Var3 = b1Var;
                    i14 = i16;
                    i15 = 0;
                    sVar5 = sVar7;
                }
                i12 = i14;
                boolean z11 = i15;
                i13 = 1;
                sVar5.q(z11);
                unit = Unit.f26487a;
                sVar2 = sVar5;
                r14 = z11;
            }
            if (unit == null) {
                sVar2.a0(-733476806);
                String str2 = order.getQuantity() + " x " + order.getItemName();
                d2.c.f(m2.e(qVar, lv.t.f28254h), sVar2);
                t1.b(f0.U(sVar2, R.string.mnu_order_header_items), str2, f0.U(sVar2, R.string.mnu_order_header_total), mv.d.i(order.getTotalPrice(), i13), sVar2, 0);
                sVar2.q(r14);
            } else {
                sVar2.a0(-1963369010);
                sVar2.q(r14);
            }
            float f13 = lv.t.f28254h;
            d2.c.f(m2.e(qVar, f13), sVar2);
            if (!Intrinsics.areEqual(order.isMultiItem(), Boolean.TRUE) || order.getSpecificationLines() == null) {
                sVar2.a0(-732834858);
                w(order, sVar2, i12 & 14);
                sVar2.q(r14);
            } else {
                sVar2.a0(-732946551);
                v(order.getSpecificationLines(), order.getTotalPrice(), sVar2, r14);
                sVar2.q(r14);
            }
            if (order.getState() == OrderState.ACTIVE || order.getState() == OrderState.SHIPPED || order.getState() == OrderState.DELIVERED) {
                sVar2.a0(-732654934);
                d2.c.f(m2.e(qVar, f13), sVar2);
                j(order.getState(), sVar2, r14);
                String strM429getOrderIdreIZeYA = order.m429getOrderIdreIZeYA();
                OrderState state = order.getState();
                AdditionalOrderInformation additionalOrderInformation = order.getAdditionalOrderInformation();
                nVar3 = nVar;
                E(strM429getOrderIdreIZeYA, state, additionalOrderInformation != null ? additionalOrderInformation.getTrackAndTraceUrls() : null, nVar3, sVar2, (i12 << 6) & 7168);
                sVar2.q(r14);
                sVar = sVar2;
            } else {
                sVar2.a0(-732366634);
                sVar2.q(r14);
                nVar3 = nVar;
                sVar = sVar2;
            }
        } else {
            sVar3.U();
            sVar = sVar3;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new kq.c(order, nVar3, i11, 8);
        }
    }

    public static final void h(BasicItem basicItem, long j9, m3.n nVar, int i11) {
        BasicItem basicItem2;
        int i12;
        basicItem.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-625039673);
        if ((i11 & 6) == 0) {
            basicItem2 = basicItem;
            i12 = i11 | (sVar.h(basicItem2) ? 4 : 2);
        } else {
            basicItem2 = basicItem;
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.e(j9) ? 32 : 16;
        }
        if (!sVar.R(i12 & 1, (i12 & 19) != 18)) {
            sVar.U();
        } else if (basicItem2.getDistance() == 0.0d) {
            sVar.a0(-1873352741);
            sVar.q(false);
        } else {
            sVar.a0(-1873555698);
            r9.d(mv.d.h(basicItem2.getDistance()), null, j9, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, lv.v.f28276p, sVar, (i12 << 3) & 896, 12607872, 110586);
            sVar = sVar;
            sVar.q(false);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new fg.l(basicItem, j9, i11, 0);
        }
    }

    public static final void i(List list, List list2, Function1 function1, m3.n nVar, int i11) {
        m3.s sVar;
        list.getClass();
        function1.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1156736235);
        int i12 = i11 | (sVar2.h(list) ? 4 : 2) | (sVar2.h(list2) ? 32 : 16) | (sVar2.h(function1) ? 256 : 128);
        int i13 = 1;
        if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
            boolean zF = sVar2.f(list) | sVar2.f(list2);
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            Object obj = objM;
            if (zF || objM == fVar) {
                z3.u uVar = new z3.u();
                int i14 = 0;
                for (Object obj2 : list) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        d0.n();
                        throw null;
                    }
                    uVar.put(Integer.valueOf(i14), Boolean.valueOf(list2.contains((CollectionTime) obj2)));
                    i14 = i15;
                }
                sVar2.k0(uVar);
                obj = uVar;
            }
            z3.u uVar2 = (z3.u) obj;
            b4.t tVarA = d2.c.A(m2.f13850c, lv.t.f28253g, lv.t.f28252f);
            d2.b bVar = d2.i.f13801a;
            float f11 = lv.t.f28254h;
            d2.y yVarA = d2.w.a(d2.i.g(f11), b4.a.f5678c, sVar2, 6);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            b4.t tVarC = b4.a.c(tVarA, sVar2);
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
            r9.d(f0.U(sVar2, R.string.profile_collection_times_selection), null, lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.l, sVar2, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            m3.s sVar3 = sVar2;
            b4.t tVarB = d2.c.B(b4.q.f5711a, 0.0f, f11, 1);
            sVar3.a0(839837990);
            int i16 = 10;
            ArrayList arrayList = new ArrayList(e0.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(f0.U(sVar3, ((CollectionTime) it.next()).getFullLabelRes()));
            }
            sVar3.q(false);
            boolean zF2 = sVar3.f(uVar2);
            Object objM2 = sVar3.M();
            if (zF2 || objM2 == fVar) {
                objM2 = new o9.f(uVar2, i13);
                sVar3.k0(objM2);
            }
            cg.j.k(arrayList, (Function1) objM2, tVarB, uVar2, sVar3, MLKEMEngine.KyberPolyBytes);
            d2.c.f(d2.z.a(), sVar3);
            b4.t tVarD = d2.c.D(new w0(b4.d.f5695n), 0.0f, 0.0f, 0.0f, lv.t.f28254h, 7);
            lv.q qVar = lv.q.REGULAR;
            lv.e eVar = lv.e.LARGE;
            String strU = f0.U(sVar3, R.string.preferred_collection_time_save_changes);
            boolean zF3 = sVar3.f(uVar2) | sVar3.h(list) | ((i12 & 896) == 256);
            Object objM3 = sVar3.M();
            if (zF3 || objM3 == fVar) {
                objM3 = new lw.o(uVar2, function1, list, i16);
                sVar3.k0(objM3);
            }
            v0.n.l(tVarD, strU, null, qVar, eVar, false, false, null, null, (Function0) objM3, sVar3, 27648, 484);
            sVar3.q(true);
            sVar = sVar3;
        } else {
            sVar2.U();
            sVar = sVar2;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ki.h(list, list2, function1, false, i11, 20);
        }
    }

    public static final void j(final OrderState orderState, m3.n nVar, final int i11) {
        final int i12;
        w1 w1VarS;
        Function2 function2;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1907279961);
        int i13 = (sVar.d(orderState.ordinal()) ? 4 : 2) | i11;
        final int i14 = 0;
        if (!sVar.R(i13 & 1, (i13 & 3) != 2)) {
            i12 = 1;
            sVar.U();
        } else {
            if (orderState != OrderState.ACTIVE && orderState != OrderState.DELIVERED && orderState != OrderState.SHIPPED) {
                w1VarS = sVar.s();
                if (w1VarS != null) {
                    function2 = new Function2(orderState, i11, i14) { // from class: mo.a

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f30044a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ OrderState f30045b;

                        {
                            this.f30044a = i14;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i15 = this.f30044a;
                            n nVar2 = (n) obj;
                            ((Integer) obj2).getClass();
                            switch (i15) {
                                case 0:
                                    o.j(this.f30045b, nVar2, i.F(1));
                                    break;
                                default:
                                    o.j(this.f30045b, nVar2, i.F(1));
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    };
                    w1VarS.f29476d = function2;
                }
                return;
            }
            b4.q qVar = b4.q.f5711a;
            b4.t tVarJ = v1.n.j(m2.d(qVar, 1.0f), lv.s.f28241v, l2.g.b(8));
            float f11 = lv.t.f28251e;
            float f12 = lv.t.f28253g;
            b4.t tVarC = d2.c.C(tVarJ, f12, f11, f12, f11);
            b4.j jVar = b4.d.f5693k;
            i2 i2VarA = h2.a(d2.i.f13801a, jVar, sVar, 48);
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
            v1.n.d(x0.z(R.drawable.ic_mail, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
            i12 = 1;
            r9.d(f0.U(sVar, R.string.mnu_order_email_notification), b3.i.g(jVar, d2.c.D(qVar, f11, 0.0f, 0.0f, 0.0f, 14)), lv.s.f28238s, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, lv.v.f28276p, sVar, MLKEMEngine.KyberPolyBytes, 12607872, 110584);
            sVar = sVar;
            sVar.q(true);
        }
        w1VarS = sVar.s();
        if (w1VarS != null) {
            function2 = new Function2(orderState, i11, i12) { // from class: mo.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f30044a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OrderState f30045b;

                {
                    this.f30044a = i12;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i15 = this.f30044a;
                    n nVar2 = (n) obj;
                    ((Integer) obj2).getClass();
                    switch (i15) {
                        case 0:
                            o.j(this.f30045b, nVar2, i.F(1));
                            break;
                        default:
                            o.j(this.f30045b, nVar2, i.F(1));
                            break;
                    }
                    return Unit.f26487a;
                }
            };
            w1VarS.f29476d = function2;
        }
    }

    public static final void k(int i11, long j9, b4.t tVar, ManufacturerItem manufacturerItem, m3.n nVar) {
        b4.t tVar2;
        manufacturerItem.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(399147953);
        int i12 = i11 | 6 | (sVar.h(manufacturerItem) ? 32 : 16) | (sVar.e(j9) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            float f11 = lv.t.f28251e;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarZ = d2.c.z(qVar, f11);
            d2.b bVar = d2.i.f13801a;
            d2.y yVarA = d2.w.a(d2.i.g(lv.t.f28249c), b4.d.f5694m, sVar, 6);
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
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            D(i12 & 1008, j9, null, manufacturerItem, sVar);
            n(((i12 >> 3) & 14) | (i12 & 896), j9, null, manufacturerItem, sVar);
            sVar.q(true);
            tVar2 = qVar;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new eg.g(tVar2, manufacturerItem, j9, i11, 0);
        }
    }

    public static final void l(int i11, List list, Function0 function0, m3.n nVar) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-170331271);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.h(function0) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(list) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            b4.q qVar = b4.q.f5711a;
            float f11 = 16;
            b4.t tVarA = b4.a.a(d2.c.D(m2.d(qVar, 1.0f), 24, f11, f11, 0.0f, 8), c5.m2.f7291a, new bm.f(12, function0));
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
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
            b4.k kVar = b4.d.f5686d;
            d2.u uVar = d2.u.f13938a;
            b4.t tVarA2 = uVar.a(qVar, kVar);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarA2, sVar);
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
            r9.d(f0.U(sVar, R.string.charity_orderview_information_donation_inventory_label), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(lv.v.f28274n, lv.s.f28217b, 0L, q5.r.f36044i, null, 0L, null, 0, 0L, null, null, 16777210), sVar, 0, 0, 131070);
            sVar = sVar;
            if (list == null || list.isEmpty()) {
                sVar.a0(1500081331);
                sVar.q(false);
                sVar.q(true);
                v1.n.d(x0.z(R.drawable.ic_chevron_right, sVar, 0), "Donation inventory arrow", uVar.a(m2.m(qVar, 40), b4.d.f5688f), null, null, 0.0f, new i4.o(lv.s.f28217b, 5), sVar, 1572920, 56);
                sVar.q(true);
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((Changes) it.next()).getType() == UpdateNotificationType.INVENTORY_CHANGED) {
                        sVar.a0(1500039047);
                        na0.a.T(sVar, 0);
                        sVar.q(false);
                        break;
                    }
                }
                sVar.a0(1500081331);
                sVar.q(false);
                sVar.q(true);
                v1.n.d(x0.z(R.drawable.ic_chevron_right, sVar, 0), "Donation inventory arrow", uVar.a(m2.m(qVar, 40), b4.d.f5688f), null, null, 0.0f, new i4.o(lv.s.f28217b, 5), sVar, 1572920, 56);
                sVar.q(true);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.x(function0, list, i11, 9);
        }
    }

    public static final void m(go.a aVar, Function0 function0, List list, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1109025547);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function0) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(list) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            AdditionalOrderInformation additionalOrderInformation = aVar.f20698a.getAdditionalOrderInformation();
            if (additionalOrderInformation == null || !additionalOrderInformation.getHasProducts()) {
                sVar.a0(-2091212211);
                sVar.q(false);
            } else {
                sVar.a0(-2091442851);
                s0.g(d2.c.A(b4.q.f5711a, 24, 16), 1, lv.s.H, sVar, 432, 0);
                l((i12 >> 3) & 126, list, function0, sVar);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.a(aVar, function0, list, i11, 7);
        }
    }

    public static final void n(int i11, long j9, b4.t tVar, ManufacturerItem manufacturerItem, m3.n nVar) {
        ManufacturerItem manufacturerItem2;
        int i12;
        long j11;
        m3.s sVar;
        b4.t tVar2;
        manufacturerItem.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(1427057925);
        if ((i11 & 6) == 0) {
            manufacturerItem2 = manufacturerItem;
            i12 = (sVar2.h(manufacturerItem2) ? 4 : 2) | i11;
        } else {
            manufacturerItem2 = manufacturerItem;
            i12 = i11;
        }
        int i13 = i12 | 48;
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            j11 = j9;
            i13 |= sVar2.e(j11) ? 256 : 128;
        } else {
            j11 = j9;
        }
        if (sVar2.R(i13 & 1, (i13 & 147) != 146)) {
            String subtitle = manufacturerItem2.getInformation().getSubtitle();
            if (subtitle == null) {
                subtitle = "";
            }
            int length = subtitle.length();
            tVar2 = b4.q.f5711a;
            if (length > 0) {
                sVar2.a0(1896576804);
                r9.d(subtitle, tVar2, j11, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, lv.v.f28276p, sVar2, i13 & 1008, 12607872, 110584);
                sVar = sVar2;
                sVar.q(false);
            } else {
                sVar = sVar2;
                sVar.a0(1896791293);
                sVar.q(false);
            }
        } else {
            sVar = sVar2;
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new eg.h(manufacturerItem2, tVar2, j9, i11);
        }
    }

    public static final void o(b4.t tVar, Function0 function0, Function0 function02, Function0 function03, Function1 function1, m3.n nVar, int i11) {
        int i12;
        Function0 function04;
        b5.h hVar;
        b5.h hVar2;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(84714197);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function0) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(function02) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(function03) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(function1) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if (sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            g0 g0Var = m2.f13850c;
            b4.t tVarThen = tVar.then(g0Var);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarThen, sVar);
            b5.j.R.getClass();
            b5.h hVar3 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar3);
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
            n4.b bVarZ = x0.z(2131231004, sVar, 0);
            b4.k kVar = b4.d.f5687e;
            v1.n.d(bVarZ, "CharityWelcome", g0Var, kVar, z4.l.f47166a, 0.0f, null, sVar, 28088, 96);
            b4.t tVarThen2 = tVar.then(g0Var);
            i4.v vVar = new i4.v(lv.s.Q);
            i4.v vVar2 = new i4.v(lv.s.T);
            i4.v vVar3 = new i4.v(lv.s.W);
            long j9 = lv.s.X;
            d2.p.a(v1.n.i(tVarThen2, qb.e.I(d0.h(vVar, vVar2, vVar3, new i4.v(j9), new i4.v(j9)), 0.0f, 0.0f, 14), 0.0f, 6), sVar, 0);
            b4.q qVar = b4.q.f5711a;
            b4.t tVarThen3 = d2.c.E(qVar).then(g0Var);
            b4.i iVar = b4.d.f5695n;
            d2.d dVar2 = d2.i.f13803c;
            d2.y yVarA = d2.w.a(dVar2, iVar, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarThen3, sVar);
            sVar.e0();
            if (sVar.S) {
                hVar = hVar3;
                sVar.k(hVar);
            } else {
                hVar = hVar3;
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            b5.h hVar4 = hVar;
            int i13 = i12;
            v1.n.d(x0.z(R.drawable.tgtg_donations, sVar, 0), "TgtgDonations", d2.c.D(qVar, 0.0f, lv.t.f28256j, 0.0f, 0.0f, 13), null, null, 0.0f, null, sVar, 440, 120);
            b4.t tVarU = m2.u(qVar, null, 3);
            float f11 = lv.t.f28254h;
            b4.t tVarB = d2.c.B(tVarU, f11, 0.0f, 2);
            float f12 = lv.t.f28253g;
            r9.d(f0.U(sVar, R.string.login_charity_welcome_text), d2.c.D(tVarB, 0.0f, f12, 0.0f, 0.0f, 13), lv.s.C, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, 432, 12582912, 130040);
            b4.t tVarD = d2.c.D(d2.c.B(m2.u(qVar, null, 3), f11, 0.0f, 2), 0.0f, f12, 0.0f, 0.0f, 13);
            cm.c cVar = new cm.c(function1, function0, 0);
            c5.s sVar2 = c5.m2.f7291a;
            b4.t tVarA = b4.a.a(tVarD, sVar2, cVar);
            String strU = f0.U(sVar, R.string.login_charity_learn_more);
            m5.u0 u0Var = lv.v.f28283w;
            r9.d(strU, tVarA, lv.s.f28217b, 0L, null, 0L, x5.l.f43854c, null, 0L, 0, false, 0, 0, null, u0Var, sVar, 805306752, 12582912, 130552);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            d2.c.f(new n1(1.0f, true), sVar);
            b4.t tVarT = d2.c.t(d2.c.D(v1.n.i(m2.u(m2.d(tVar, 1.0f), null, 3), qb.e.I(d0.h(new i4.v(lv.s.P), new i4.v(lv.s.O), new i4.v(lv.s.N), new i4.v(lv.s.M), new i4.v(lv.s.L)), 0.0f, 0.0f, 14), 0.0f, 6), 0.0f, 0.0f, 0.0f, f11, 7));
            d2.y yVarA2 = d2.w.a(dVar2, b4.d.f5694m, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            b4.t tVarC3 = b4.a.c(tVarT, sVar);
            sVar.e0();
            if (sVar.S) {
                hVar2 = hVar4;
                sVar.k(hVar2);
            } else {
                hVar2 = hVar4;
                sVar.n0();
            }
            m3.i.C(yVarA2, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            w.a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            b4.t tVarB2 = d2.c.B(m2.d(qVar, 1.0f), f12, 0.0f, 2);
            String strU2 = f0.U(sVar, R.string.login_charity_login);
            boolean z11 = ((i13 & 896) == 256) | ((i13 & 57344) == 16384);
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new bs.b(3, function1, function02);
                sVar.k0(objM);
            }
            b5.h hVar5 = hVar2;
            v0.n.l(tVarB2, strU2, null, null, null, false, false, null, null, (Function0) objM, sVar, 6, 508);
            function04 = function03;
            b4.t tVarA2 = b4.a.a(d2.c.D(d2.c.B(m2.e(m2.d(qVar, 1.0f), 40), f11, 0.0f, 2), 0.0f, lv.t.f28251e, 0.0f, 0.0f, 13), sVar2, new cm.c(function1, function04, 1));
            u0 u0VarD2 = d2.p.d(kVar, false);
            int iHashCode4 = Long.hashCode(sVar.T);
            u3.i iVarL4 = sVar.l();
            b4.t tVarC4 = b4.a.c(tVarA2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar5);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD2, gVar, sVar);
            m3.i.C(iVarL4, gVar2, sVar);
            w.a0.y(iHashCode4, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC4, gVar4, sVar);
            r9.d(f0.U(sVar, R.string.login_charity_back), null, lv.s.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            sVar = sVar;
            sVar.q(true);
            sVar.q(true);
            sVar.q(true);
            sVar.q(true);
        } else {
            function04 = function03;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cm.a(tVar, function0, function02, function04, function1, i11, 0);
        }
    }

    public static final void p(final ManufacturerItem manufacturerItem, final boolean z11, final Function0 function0, m3.n nVar, int i11) {
        manufacturerItem.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-477202340);
        int i12 = i11 | (sVar.h(manufacturerItem) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.h(function0) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            d3 d3Var = v0.f7390b;
            final String strA = r0.a((Context) sVar.j(d3Var), manufacturerItem);
            final float fE = d70.a.e(sVar, w.b.u((Context) sVar.j(d3Var)));
            final float f11 = m0.DEFAULT_SWIPE_ANIMATION_DURATION;
            boolean zT = r0.t(manufacturerItem);
            final long j9 = zT ? lv.s.C : lv.s.D;
            float f12 = zT ? 1.0f : 0.5f;
            d3 d3Var2 = x1.f7416h;
            final float f13 = f12;
            m3.i.a(b3.i.t(((z5.c) sVar.j(d3Var2)).a(), 1.0f, d3Var2), u3.e.e(2045041948, sVar, new Function2() { // from class: eg.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    t tVarD;
                    n nVar2 = (n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    s sVar2 = (s) nVar2;
                    if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        q qVar = q.f5711a;
                        t tVarG = m2.g(qVar, f11, 0.0f, 2);
                        final boolean z12 = z11;
                        if (z12) {
                            sVar2.a0(-266269393);
                            tVarD = m2.q(qVar, d70.a.e(sVar2, w.b.u((Context) sVar2.j(v0.f7390b))));
                            sVar2.q(false);
                        } else {
                            sVar2.a0(-266146881);
                            sVar2.q(false);
                            tVarD = m2.d(qVar, 1.0f);
                        }
                        t tVarThen = tVarG.then(tVarD);
                        String str = strA;
                        boolean zF = sVar2.f(str);
                        Object objM = sVar2.M();
                        m3.f fVar = m.f29332a;
                        if (zF || objM == fVar) {
                            objM = new c60.e(str, 21);
                            sVar2.k0(objM);
                        }
                        t tVarA = d2.c.A(r.c(tVarThen, false, (Function1) objM), lv.t.f28251e, lv.t.f28249c);
                        u uVarP = s0.p(lv.s.J, sVar2, 6);
                        l2.f fVarB = l2.g.b(12);
                        v vVarQ = s0.q(2, 0.0f, 0.0f, 0.0f, 62);
                        Function0 function02 = function0;
                        boolean zF2 = sVar2.f(function02);
                        Object objM2 = sVar2.M();
                        if (zF2 || objM2 == fVar) {
                            objM2 = new ar.d(25, function02);
                            sVar2.k0(objM2);
                        }
                        final float f14 = fE;
                        final ManufacturerItem manufacturerItem2 = manufacturerItem;
                        final float f15 = f13;
                        final long j11 = j9;
                        s0.c((Function0) objM2, tVarA, false, fVarB, uVarP, vVarQ, u3.e.e(34854673, sVar2, new i80.n() { // from class: eg.e
                            @Override // i80.n
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                n nVar3 = (n) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((z) obj3).getClass();
                                s sVar3 = (s) nVar3;
                                if (sVar3.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    boolean z13 = z12;
                                    q qVar2 = q.f5711a;
                                    t tVarJ = v1.n.j(z13 ? m2.q(qVar2, f14) : m2.d(qVar2, 1.0f), lv.s.K, i4.g0.f23254b);
                                    u0 u0VarD = p.d(b4.d.f5683a, false);
                                    int iHashCode = Long.hashCode(sVar3.T);
                                    u3.i iVarL = sVar3.l();
                                    t tVarC = b4.a.c(tVarJ, sVar3);
                                    b5.j.R.getClass();
                                    b5.h hVar = b5.i.f5839b;
                                    sVar3.e0();
                                    if (sVar3.S) {
                                        sVar3.k(hVar);
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
                                    y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar3, 0);
                                    int iHashCode2 = Long.hashCode(sVar3.T);
                                    u3.i iVarL2 = sVar3.l();
                                    t tVarC2 = b4.a.c(qVar2, sVar3);
                                    sVar3.e0();
                                    if (sVar3.S) {
                                        sVar3.k(hVar);
                                    } else {
                                        sVar3.n0();
                                    }
                                    m3.i.C(yVarA, gVar, sVar3);
                                    m3.i.C(iVarL2, gVar2, sVar3);
                                    w.a0.y(iHashCode2, sVar3, gVar3, sVar3, dVar);
                                    m3.i.C(tVarC2, gVar4, sVar3);
                                    ManufacturerItem manufacturerItem3 = manufacturerItem2;
                                    o.f(manufacturerItem3, f15, sVar3, 0);
                                    long j12 = j11;
                                    o.k(0, j12, null, manufacturerItem3, sVar3);
                                    ex.i.h(m2.d(m2.e(qVar2, 2), 1.0f), lv.s.H, sVar3, 54);
                                    o.q(0, j12, null, manufacturerItem3, sVar3);
                                    sVar3.q(true);
                                    sVar3.q(true);
                                } else {
                                    sVar3.U();
                                }
                                return Unit.f26487a;
                            }
                        }), sVar2, 100663296, 196);
                    } else {
                        sVar2.U();
                    }
                    return Unit.f26487a;
                }
            }), sVar, 56);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.d(manufacturerItem, z11, function0, i11, 4);
        }
    }

    public static final void q(int i11, long j9, b4.t tVar, ManufacturerItem manufacturerItem, m3.n nVar) {
        m3.s sVar;
        b4.t tVar2;
        b4.q qVar;
        boolean z11;
        manufacturerItem.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1049817582);
        int i12 = i11 | 6 | (sVar2.h(manufacturerItem) ? 32 : 16) | (sVar2.e(j9) ? 256 : 128);
        if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
            float f11 = lv.t.f28251e;
            b4.q qVar2 = b4.q.f5711a;
            b4.t tVarZ = d2.c.z(qVar2, f11);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar2, 48);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            b4.t tVarC = b4.a.c(tVarZ, sVar2);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(i2VarA, gVar, sVar2);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar2, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar2, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar2);
            ManufacturerInformation manufacturerInformation = manufacturerItem.getInformation().getManufacturerInformation();
            if ((manufacturerInformation != null ? manufacturerInformation.getBottleDeposit() : null) == null) {
                sVar2.a0(-372348674);
                sVar2.q(false);
                sVar = sVar2;
                qVar = qVar2;
                z11 = true;
            } else {
                sVar2.a0(-372348673);
                b4.k kVar = b4.d.f5687e;
                b4.t tVarA = d2.c.A(v1.n.j(f4.g.b(qVar2, l2.g.b(16)), lv.s.I, i4.g0.f23254b), lv.t.f28252f, lv.t.f28249c);
                u0 u0VarD = d2.p.d(kVar, false);
                int iHashCode2 = Long.hashCode(sVar2.T);
                u3.i iVarL2 = sVar2.l();
                b4.t tVarC2 = b4.a.c(tVarA, sVar2);
                sVar2.e0();
                if (sVar2.S) {
                    sVar2.k(hVar);
                } else {
                    sVar2.n0();
                }
                m3.i.C(u0VarD, gVar, sVar2);
                m3.i.C(iVarL2, gVar2, sVar2);
                w.a0.y(iHashCode2, sVar2, gVar3, sVar2, dVar);
                m3.i.C(tVarC2, gVar4, sVar2);
                qVar = qVar2;
                z11 = true;
                r9.d(r0.f((Context) sVar2.j(v0.f7390b), mv.d.m(manufacturerItem).getStoreLocation().getAddress().getPickupCountry().getIsoCode()), null, lv.s.C, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, lv.v.f28276p, sVar2, MLKEMEngine.KyberPolyBytes, 12607872, 110586);
                sVar = sVar2;
                sVar.q(true);
                sVar.q(false);
            }
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            d2.c.f(new n1(1.0f, z11), sVar);
            int i13 = i12 >> 3;
            t1.e(manufacturerItem, sVar, i13 & 14);
            t1.h(manufacturerItem, j9, sVar, i13 & 126);
            sVar.q(z11);
            tVar2 = qVar;
        } else {
            sVar = sVar2;
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new eg.g(tVar2, manufacturerItem, j9, i11, 1);
        }
    }

    public static final void r(b4.t tVar, BasicItem basicItem, long j9, m3.n nVar, int i11) {
        b4.t tVar2;
        basicItem.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1760414367);
        int i12 = i11 | 6 | (sVar.h(basicItem) ? 32 : 16) | (sVar.e(j9) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            float f11 = lv.t.f28251e;
            float f12 = lv.t.f28249c;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = m2.d(d2.c.C(qVar, f11, f12, f11, f11), 1.0f);
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
            if (basicItem instanceof FlashSalesItem) {
                sVar.a0(-494687041);
                sVar.q(false);
            } else {
                sVar.a0(-495021469);
                s(basicItem, j9, sVar, (i12 >> 3) & 126);
                s0.o(m2.q(m2.e(d2.c.D(qVar, f12, 0.0f, f12, 0.0f, 10), 14), 1), 0.0f, lv.s.H, sVar, 390, 2);
                sVar.q(false);
            }
            h(basicItem, j9, sVar, (i12 >> 3) & 126);
            sVar.q(true);
            tVar2 = qVar;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new fg.k(tVar2, basicItem, j9, i11);
        }
    }

    public static final void s(BasicItem basicItem, long j9, m3.n nVar, int i11) {
        int i12;
        m3.s sVar;
        basicItem.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1365810861);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar2.h(basicItem) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.e(j9) ? 32 : 16;
        }
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            sVar = sVar2;
            r9.d(mv.p0.t((Context) sVar2.j(v0.f7390b), basicItem), null, j9, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, lv.v.f28276p, sVar, (i12 << 3) & 896, 12607872, 110586);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new fg.l(basicItem, j9, i11, 1);
        }
    }

    public static final void t(b4.t tVar, Context context, Changes changes, go.a aVar, boolean z11, m3.n nVar, int i11) {
        Order order = aVar.f20698a;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(149894933);
        int i12 = (sVar.h(context) ? 32 : 16) | i11 | (sVar.h(changes) ? 256 : 128);
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(aVar) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.g(z11) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if (sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            OldValue oldValue = changes.getOldValue();
            String strC = mv.p0.c(context, oldValue != null ? oldValue.getIntervalStart() : null);
            boolean zC = ho.r.c(order.getStoreTimeZone());
            OldValue oldValue2 = changes.getOldValue();
            String intervalStart = oldValue2 != null ? oldValue2.getIntervalStart() : null;
            OldValue oldValue3 = changes.getOldValue();
            String strB = ho.r.b(zC, new PickupInterval(intervalStart, oldValue3 != null ? oldValue3.getIntervalEnd() : null), order.getStoreTimeZone(), sVar);
            m5.u0 u0Var = lv.v.f28274n;
            long j9 = lv.s.E;
            x5.l lVar = x5.l.f43855d;
            h0.g.g(tVar, strC, strB, z11, m5.u0.a(u0Var, j9, 0L, null, null, 0L, lVar, 0, 0L, null, null, 16773118), m5.u0.a(u0Var, j9, 0L, null, null, 0L, lVar, 0, 0L, null, null, 16773118), sVar, 6 | ((i12 >> 3) & 7168), 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new eg.b(tVar, context, changes, aVar, z11, i11, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void u(go.a r21, android.content.Context r22, java.util.List r23, boolean r24, m3.n r25, int r26) {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bx.o.u(go.a, android.content.Context, java.util.List, boolean, m3.n, int):void");
    }

    public static final void v(List list, Price price, m3.n nVar, int i11) {
        b4.q qVar;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(625114080);
        int i12 = (sVar.h(list) ? 4 : 2) | i11 | (sVar.f(price) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            float f11 = mVar.f44015k;
            b4.q qVar2 = b4.q.f5711a;
            d2.c.f(m2.m(qVar2, f11), sVar);
            b4.t tVarZ = d2.c.z(v1.n.j(qVar2, hVar.f43907b, l2.g.b(((x60.k) sVar.j(PantryThemeKt.getLocalPantryRadius())).f43980d)), mVar.f44015k);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarZ, sVar);
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
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(qVar2, sVar);
            sVar.e0();
            b4.q qVar3 = qVar2;
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            sVar.a0(-178502420);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SpecificationLine specificationLine = (SpecificationLine) it.next();
                String displayValue = specificationLine.getDisplayValue();
                if (displayValue == null) {
                    sVar.a0(-1532562);
                    sVar.q(false);
                    qVar = qVar3;
                } else {
                    sVar.a0(-1532561);
                    qVar = qVar3;
                    vi.c.o(displayValue, mv.d.i(specificationLine.getAmount(), 1), null, 0L, sVar, 0, 12);
                    b3.i.y(qVar, mVar.l, sVar, false);
                }
                qVar3 = qVar;
            }
            sVar.q(false);
            vi.c.o(f0.U(sVar, R.string.checkout_view_label_total_amount), mv.d.i(price, 1), jVar.f43959h, hVar.J, sVar, 0, 0);
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new kq.c(list, price, i11, 9);
        }
    }

    public static final void w(Order order, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1020897153);
        int i12 = (sVar.h(order) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            long j9 = lv.s.I;
            l2.f fVarB = l2.g.b(8);
            b4.q qVar = b4.q.f5711a;
            b4.t tVarZ = d2.c.z(v1.n.j(qVar, j9, fVarB), lv.t.f28253g);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
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
            String strU = f0.U(sVar, R.string.mnu_order_total);
            m5.u0 u0Var = lv.v.f28275o;
            long j11 = lv.s.C;
            r9.d(strU, null, j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            b4.t tVarM = m2.m(qVar, lv.t.f28251e);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            d2.c.f(tVarM.then(new n1(1.0f, true)), sVar);
            r9.d(mv.d.i(order.getTotalPrice(), 1), null, j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            sVar = sVar;
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new co.v(order, i11, 5);
        }
    }

    public static final void x(b4.t tVar, Price price, Function0 function0, m3.n nVar, int i11) {
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1208767381);
        int i12 = (sVar.f(tVar) ? 4 : 2) | i11 | (sVar.d(R.string.profile_page_impact_money_card_header) ? 32 : 16) | (sVar.f(price) ? 256 : 128) | (sVar.h(function0) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            float f11 = lv.t.f28253g;
            s0.b(b4.a.a(d2.c.C(tVar, lv.t.f28251e, f11, f11, lv.t.f28249c), c5.m2.f7291a, new on.l(8, function0)), l2.g.b(o30.e0.s(sVar, R.dimen.profile_card_corner_radius)), s0.p(lv.s.J, sVar, 6), s0.q(2, 0.0f, 0.0f, 0.0f, 62), null, u3.e.e(1045959815, sVar, new a3.m2(price, 23)), sVar, 196608, 16);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ki.h(tVar, price, function0, i11, 25);
        }
    }

    public static final void y(mn.l lVar, ProfileFeature profileFeature, Function0 function0, m3.n nVar, int i11) {
        mn.l lVar2;
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(585772701);
        int i12 = (i11 & 6) == 0 ? i11 | 2 : i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(profileFeature) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(function0) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                s1 s1VarA = z8.a.a(sVar);
                if (s1VarA == null) {
                    com.braze.h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                lVar = (mn.l) t1.K(Reflection.getOrCreateKotlinClass(mn.l.class), s1VarA, o30.e0.r(s1VarA, sVar), s1VarA instanceof androidx.lifecycle.p ? ((androidx.lifecycle.p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar);
            } else {
                sVar.U();
            }
            mn.l lVar3 = lVar;
            sVar.r();
            Object objM = sVar.M();
            x70.c cVar = null;
            if (objM == m3.m.f29332a) {
                lVar3.getClass();
                Boolean bool = (Boolean) v80.f0.E(kotlin.coroutines.g.f26549a, new mn.f(lVar3, cVar, 6));
                bool.getClass();
                objM = m3.i.w(bool);
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            StoreSignupCardDetails storeSignupDetails = profileFeature.getStoreSignupDetails();
            if (storeSignupDetails == null) {
                sVar.a0(302703616);
                sVar.q(false);
                lVar2 = lVar3;
            } else {
                sVar.a0(302703617);
                lVar2 = lVar3;
                s1.y.d(!((Boolean) b1Var.getValue()).booleanValue(), null, null, s1.r0.o(3, null).a(s1.r0.j(null, 15)).a(s1.r0.e(null, 3)), null, u3.e.e(2008188975, sVar, new cn.x(29, storeSignupDetails, lVar3, function0, b1Var)), sVar, 199680, 22);
                sVar.q(false);
            }
        } else {
            sVar.U();
            lVar2 = lVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.a(lVar2, profileFeature, function0, i11, 22);
        }
    }

    public static final void z(b4.t tVar, u1 u1Var, u3.d dVar, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-714464401);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(u1Var) ? 32 : 16;
        }
        int i13 = i11 & MLKEMEngine.KyberPolyBytes;
        u3.d dVar2 = r2.g.f37560a;
        if (i13 == 0) {
            i12 |= sVar.h(dVar2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(dVar) ? NewHope.SENDB_BYTES : 1024;
        }
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                k1 k1Var = new k1(null, m3.f.f29272d);
                sVar.k0(k1Var);
                objM = k1Var;
            }
            t2.c cVarI = I(dVar2, sVar, (i12 >> 6) & 14);
            m3.i.a(u1Var.a(cVarI), u3.e.e(274270255, sVar, new lp.v(14, tVar, (b1) objM, dVar, cVarI)), sVar, 56);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.a(tVar, u1Var, dVar, i11, 19);
        }
    }
}
