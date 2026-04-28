package wi;

import a3.m3;
import android.content.Context;
import b4.t;
import c5.a1;
import c5.v0;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.ParcelDeliveryOptionId;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionMethod;
import com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionsLocal;
import com.app.tgtg.model.remote.manufacturer.response.OpeningHourPeriod;
import com.app.tgtg.model.remote.manufacturer.response.ParcelMdoCategory;
import com.app.tgtg.model.remote.manufacturer.response.PickupOptionLocal;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.user.requests.UserAddress;
import com.google.android.gms.internal.measurement.cg;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.w;
import d2.y;
import g3.e0;
import g3.r9;
import i4.g0;
import i4.r0;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import lv.v;
import m3.b1;
import m3.w1;
import mv.p0;
import o00.x0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import w.a0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m {
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionMethod r19, final java.util.List r20, final java.lang.String r21, final java.lang.String r22, final boolean r23, final java.lang.String r24, final kotlin.jvm.functions.Function0 r25, final kotlin.jvm.functions.Function2 r26, m3.n r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wi.m.a(com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionMethod, java.util.List, java.lang.String, java.lang.String, boolean, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, m3.n, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v2, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r10v3, types: [m3.n, m3.s] */
    /* JADX WARN: Type inference failed for: r10v4, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r10v5, types: [m3.n, m3.s] */
    /* JADX WARN: Type inference failed for: r10v6, types: [m3.n, m3.s] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r12v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r21v0, types: [m3.n] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    public static final void b(DeliveryOptionsLocal deliveryOptionsLocal, String str, String str2, boolean z11, Function0 function0, Function2 function2, m3.n nVar, int i11) {
        DeliveryOptionsLocal deliveryOptionsLocal2;
        int i12;
        ?? r102;
        b4.q qVar;
        boolean z12;
        b4.i iVar;
        Iterator it;
        b4.q qVar2;
        boolean z13;
        boolean z14;
        ?? r103;
        ?? r104;
        b4.i iVar2 = b4.d.f5694m;
        function0.getClass();
        function2.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1842451574);
        if ((i11 & 6) == 0) {
            deliveryOptionsLocal2 = deliveryOptionsLocal;
            i12 = (sVar.h(deliveryOptionsLocal2) ? 4 : 2) | i11;
        } else {
            deliveryOptionsLocal2 = deliveryOptionsLocal;
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(str != null ? ParcelDeliveryOptionId.m221boximpl(str) : null) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.f(str2 != null ? ParcelDeliveryOptionId.m221boximpl(str2) : null) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.g(z11) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(function0) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.h(function2) ? 131072 : 65536;
        }
        int i13 = i12;
        if (sVar.R(i13 & 1, (i13 & 74899) != 74898)) {
            List<ParcelMdoCategory> parcelMdoCategories = deliveryOptionsLocal2.getParcelMdoCategories();
            if (parcelMdoCategories != null) {
                Iterator it2 = parcelMdoCategories.iterator();
                while (it2.hasNext()) {
                    ((ParcelMdoCategory) it2.next()).getMdoPickupOptions().size();
                }
            }
            List<ParcelMdoCategory> parcelMdoCategories2 = deliveryOptionsLocal2.getParcelMdoCategories();
            long j9 = lv.s.I;
            l2.f fVarB = l2.g.b(8);
            b4.q qVar3 = b4.q.f5711a;
            t tVarJ = v1.n.j(qVar3, j9, fVarB);
            float f11 = lv.t.f28252f;
            t tVarB = d2.c.B(tVarJ, f11, 0.0f, 2);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarB, sVar);
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
            y yVarA = w.a(d2.i.f13803c, iVar2, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(qVar3, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            d2.c.f(m2.m(qVar3, f11), sVar);
            if (parcelMdoCategories2 == null) {
                sVar.a0(126372707);
                sVar.q(false);
                qVar = qVar3;
                z12 = true;
                r104 = sVar;
            } else {
                ?? r22 = 0;
                sVar.a0(126372708);
                Iterator it3 = parcelMdoCategories2.iterator();
                ?? r105 = sVar;
                while (it3.hasNext()) {
                    ParcelMdoCategory parcelMdoCategory = (ParcelMdoCategory) it3.next();
                    y yVarA2 = w.a(d2.i.f13803c, iVar2, r105, r22);
                    int iHashCode3 = Long.hashCode(r105.T);
                    u3.i iVarL3 = r105.l();
                    t tVarC3 = b4.a.c(qVar3, r105);
                    b5.j.R.getClass();
                    b5.h hVar2 = b5.i.f5839b;
                    r105.e0();
                    if (r105.S) {
                        r105.k(hVar2);
                    } else {
                        r105.n0();
                    }
                    b5.g gVar5 = b5.i.f5843f;
                    m3.i.C(yVarA2, gVar5, r105);
                    b5.g gVar6 = b5.i.f5842e;
                    m3.i.C(iVarL3, gVar6, r105);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    b5.g gVar7 = b5.i.f5844g;
                    m3.i.v(r105, numValueOf2, gVar7);
                    b5.d dVar2 = b5.i.f5845h;
                    m3.i.z(r105, dVar2);
                    b5.g gVar8 = b5.i.f5841d;
                    m3.i.C(tVarC3, gVar8, r105);
                    DeliveryOptionMethod mdoCategoryType = parcelMdoCategory != null ? parcelMdoCategory.getMdoCategoryType() : null;
                    if (mdoCategoryType == null) {
                        r105.a0(-80466326);
                        r105.q(false);
                        iVar = iVar2;
                        it = it3;
                        z14 = false;
                        qVar2 = qVar3;
                        z13 = true;
                        r103 = r105;
                    } else {
                        r105.a0(-80466325);
                        t tVarD = m2.d(qVar3, 1.0f);
                        i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, r105, 48);
                        iVar = iVar2;
                        it = it3;
                        int iHashCode4 = Long.hashCode(r105.T);
                        u3.i iVarL4 = r105.l();
                        t tVarC4 = b4.a.c(tVarD, r105);
                        r105.e0();
                        if (r105.S) {
                            r105.k(hVar2);
                        } else {
                            r105.n0();
                        }
                        m3.i.C(i2VarA, gVar5, r105);
                        m3.i.C(iVarL4, gVar6, r105);
                        a0.y(iHashCode4, r105, gVar7, r105, dVar2);
                        m3.i.C(tVarC4, gVar8, r105);
                        ?? r21 = r105;
                        qVar2 = qVar3;
                        z13 = true;
                        r9.d(mdoCategoryType == DeliveryOptionMethod.PICKUP_POINT ? b3.i.j(-377336840, R.string.mnu_checkout_overview_delivery_category_pickup, r105, r105, false) : b3.i.j(-377184134, R.string.mnu_checkout_overview_delivery_category_home, r105, r105, false), null, lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28279s, r21, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                        ?? r106 = r21;
                        r106.q(true);
                        z14 = false;
                        b3.i.y(qVar2, lv.t.f28251e, r106, false);
                        r103 = r106;
                    }
                    List<PickupOptionLocal> mdoPickupOptions = parcelMdoCategory != null ? parcelMdoCategory.getMdoPickupOptions() : null;
                    if (mdoPickupOptions == null) {
                        r103.a0(-79508271);
                        r103.q(z14);
                    } else {
                        r103.a0(-79508270);
                        int i14 = i13 << 6;
                        a(parcelMdoCategory.getMdoCategoryType(), mdoPickupOptions, str, str2, z11, deliveryOptionsLocal.getPreselectedDeliveryOptionId(), function0, function2, r103, ((i13 << 3) & 65408) | (3670016 & i14) | (i14 & 29360128));
                        r103.q(z14);
                    }
                    b3.i.y(qVar2, lv.t.f28251e, r103, z13);
                    qVar3 = qVar2;
                    r22 = z14;
                    iVar2 = iVar;
                    it3 = it;
                    r105 = r103;
                }
                qVar = qVar3;
                z12 = true;
                r105.q(r22);
                r104 = r105;
            }
            d2.c.f(m2.m(qVar, lv.t.f28251e), r104);
            r104.q(z12);
            r104.q(z12);
            r102 = r104;
        } else {
            sVar.U();
            r102 = sVar;
        }
        w1 w1VarS = r102.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new e0(i11, 6, deliveryOptionsLocal, str, str2, function0, function2, z11);
        }
    }

    public static final void c(cj.q qVar, cj.e0 e0Var, UserAddress userAddress, String str, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function2 function2, m3.n nVar, int i11) {
        int i12;
        boolean z11;
        qVar.getClass();
        e0Var.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function04.getClass();
        function2.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1960150520);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(qVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(e0Var) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.f(userAddress) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(str != null ? ParcelDeliveryOptionId.m221boximpl(str) : null) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(function0) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.h(function02) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.h(function03) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar.h(function04) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= sVar.h(function2) ? 67108864 : 33554432;
        }
        int i13 = i12;
        if (sVar.R(i13 & 1, (38347923 & i13) != 38347922)) {
            b1 b1VarN = m3.i.n(e0Var.f8223n, sVar, 0);
            b1 b1VarN2 = m3.i.n(e0Var.f8212b0, sVar, 0);
            b4.i iVar = b4.d.f5694m;
            d2.d dVar = d2.i.f13803c;
            y yVarA = w.a(dVar, iVar, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.q qVar2 = b4.q.f5711a;
            t tVarC = b4.a.c(qVar2, sVar);
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
            int i14 = i13 >> 3;
            a.h(qVar, w0.e.A(qVar.i()), userAddress, function0, function02, function03, sVar, (i14 & 458752) | (i13 & 910) | (i14 & 7168) | (i14 & 57344));
            if (userAddress == null) {
                sVar.a0(-1361188348);
                sVar.q(false);
                z11 = true;
            } else {
                boolean z12 = false;
                sVar.a0(-1361188347);
                DeliveryOptionsLocal deliveryOptionsLocal = (DeliveryOptionsLocal) b1VarN.getValue();
                if (deliveryOptionsLocal == null) {
                    sVar.a0(496202994);
                    sVar.q(false);
                    z11 = true;
                } else {
                    sVar.a0(496202995);
                    t tVarB = d2.c.B(qVar2, lv.t.f28253g, 0.0f, 2);
                    u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    u3.i iVarL2 = sVar.l();
                    t tVarC2 = b4.a.c(tVarB, sVar);
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(u0VarD, gVar, sVar);
                    m3.i.C(iVarL2, gVar2, sVar);
                    a0.y(iHashCode2, sVar, gVar3, sVar, dVar2);
                    m3.i.C(tVarC2, gVar4, sVar);
                    y yVarA2 = w.a(dVar, iVar, sVar, 48);
                    int iHashCode3 = Long.hashCode(sVar.T);
                    u3.i iVarL3 = sVar.l();
                    t tVarC3 = b4.a.c(qVar2, sVar);
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(yVarA2, gVar, sVar);
                    m3.i.C(iVarL3, gVar2, sVar);
                    a0.y(iHashCode3, sVar, gVar3, sVar, dVar2);
                    m3.i.C(tVarC3, gVar4, sVar);
                    d2.c.f(m2.m(qVar2, lv.t.f28254h), sVar);
                    a.e(R.string.mnu_checkout_overview_parcel_title_shipping_method, sVar, 0);
                    d2.c.f(m2.m(qVar2, lv.t.f28251e), sVar);
                    ParcelDeliveryOptionId parcelDeliveryOptionId = (ParcelDeliveryOptionId) b1VarN2.getValue();
                    int i15 = i13 >> 9;
                    b(deliveryOptionsLocal, str, parcelDeliveryOptionId != null ? parcelDeliveryOptionId.m229unboximpl() : null, false, function04, function2, sVar, ((i13 >> 6) & 112) | 3072 | (i15 & 57344) | (i15 & 458752));
                    z11 = true;
                    z12 = false;
                    e0.f.D(sVar, true, true, false);
                }
                sVar.q(z12);
            }
            sVar.q(z11);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new vi.d(qVar, e0Var, userAddress, str, function0, function02, function03, function04, function2, i11, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(com.app.tgtg.model.remote.manufacturer.response.PickupOptionLocal r38, final boolean r39, final boolean r40, final wi.e r41, kotlin.jvm.functions.Function2 r42, kotlin.jvm.functions.Function0 r43, final kotlin.jvm.functions.Function2 r44, m3.n r45, final int r46, final int r47) {
        /*
            Method dump skipped, instruction units count: 981
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wi.m.d(com.app.tgtg.model.remote.manufacturer.response.PickupOptionLocal, boolean, boolean, wi.e, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, m3.n, int, int):void");
    }

    public static final void e(final boolean z11, final long j9, m3.n nVar, final int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-844084333);
        int i12 = (sVar.g(z11) ? 4 : 2) | i11 | 48 | (sVar.e(j9) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(new z5.f(20));
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = m3.i.w(new z5.f(2));
                sVar.k0(objM2);
            }
            b1 b1Var2 = (b1) objM2;
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = m3.i.w(new i4.v(j9));
                sVar.k0(objM3);
            }
            b1 b1Var3 = (b1) objM3;
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.q qVar = b4.q.f5711a;
            t tVarC = b4.a.c(qVar, sVar);
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
            l2.f fVar2 = l2.g.f26790a;
            t tVarM = m2.m(f4.g.b(qVar, fVar2), ((z5.f) b1Var.getValue()).f47277a);
            long j11 = ((i4.v) b1Var3.getValue()).f23317a;
            r0 r0Var = g0.f23254b;
            t tVarB = f4.g.b(d2.c.z(v1.n.j(tVarM, j11, r0Var), ((z5.f) b1Var2.getValue()).f47277a), fVar2);
            long j12 = lv.s.J;
            t tVarB2 = f4.g.b(d2.c.z(v1.n.j(tVarB, j12, r0Var), 2), fVar2);
            if (z11) {
                j12 = j9;
            }
            t tVarJ = v1.n.j(tVarB2, j12, r0Var);
            u0 u0VarD = d2.p.d(b4.d.f5687e, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarJ, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            sVar.q(true);
            sVar.a0(-1471222960);
            sVar.q(false);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(i11, j9, z11) { // from class: wi.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f43446a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f43447b;

                {
                    this.f43446a = z11;
                    this.f43447b = j9;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(1);
                    m.e(this.f43446a, this.f43447b, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void f(PickupOptionLocal pickupOptionLocal, m3.n nVar, int i11) {
        int i12;
        b4.q qVar;
        boolean z11;
        int i13;
        b4.q qVar2;
        b4.q qVar3;
        boolean z12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-2137827563);
        int i14 = (i11 & 6) == 0 ? i11 | (sVar.h(pickupOptionLocal) ? 4 : 2) : i11;
        if (sVar.R(i14 & 1, (i14 & 3) != 2)) {
            List<OpeningHourPeriod> openingHourPeriod = pickupOptionLocal.getOpeningHourPeriod();
            if (openingHourPeriod == null) {
                sVar.a0(2049260718);
                sVar.q(false);
            } else {
                sVar.a0(2049260719);
                boolean zIsEmpty = openingHourPeriod.isEmpty();
                b4.q qVar4 = b4.q.f5711a;
                if (zIsEmpty) {
                    i12 = 2;
                    qVar = qVar4;
                    z11 = true;
                    i13 = 0;
                    sVar.a0(-742854594);
                    sVar.q(false);
                } else {
                    sVar.a0(-743371612);
                    float f11 = lv.t.f28251e;
                    d2.c.f(m2.m(qVar4, f11), sVar);
                    t tVarB = d2.c.B(qVar4, f11, 0.0f, 2);
                    u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    t tVarC = b4.a.c(tVarB, sVar);
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
                    i12 = 2;
                    z11 = true;
                    r9.d(f0.U(sVar, R.string.mnu_checkout_overview_pickup_Opening_hours), d2.c.B(qVar4, f11, 0.0f, 2), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28275o, sVar, 432, 12582912, 131064);
                    sVar = sVar;
                    sVar.q(true);
                    qVar = qVar4;
                    i13 = 0;
                    b3.i.y(qVar, 2, sVar, false);
                }
                t tVarB2 = d2.c.B(qVar, lv.t.f28253g, 0.0f, i12);
                y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, i13);
                int iHashCode2 = Long.hashCode(sVar.T);
                u3.i iVarL2 = sVar.l();
                t tVarC2 = b4.a.c(tVarB2, sVar);
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
                sVar.a0(861790784);
                for (OpeningHourPeriod openingHourPeriod2 : openingHourPeriod) {
                    if ((openingHourPeriod2 != null ? openingHourPeriod2.getPeriodName() : null) == null || !cg.q(openingHourPeriod2.getOpeningHours())) {
                        qVar2 = qVar;
                        sVar.a0(-911363334);
                        sVar.q(false);
                    } else {
                        sVar.a0(-912219585);
                        i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
                        int iHashCode3 = Long.hashCode(sVar.T);
                        u3.i iVarL3 = sVar.l();
                        t tVarC3 = b4.a.c(qVar, sVar);
                        b5.j.R.getClass();
                        b5.h hVar3 = b5.i.f5839b;
                        sVar.e0();
                        if (sVar.S) {
                            sVar.k(hVar3);
                        } else {
                            sVar.n0();
                        }
                        m3.i.C(i2VarA, b5.i.f5843f, sVar);
                        m3.i.C(iVarL3, b5.i.f5842e, sVar);
                        m3.i.v(sVar, Integer.valueOf(iHashCode3), b5.i.f5844g);
                        m3.i.z(sVar, b5.i.f5845h);
                        m3.i.C(tVarC3, b5.i.f5841d, sVar);
                        if (openingHourPeriod2.getOpeningHours() == null) {
                            sVar.a0(1441681908);
                            z12 = false;
                            sVar.q(false);
                            qVar3 = qVar;
                        } else {
                            sVar.a0(1441681909);
                            String strL = r8.k.l(openingHourPeriod2.getPeriodName(), ": ");
                            int i15 = 0;
                            for (Object obj : openingHourPeriod2.getOpeningHours()) {
                                int i16 = i15 + 1;
                                if (i15 < 0) {
                                    d0.n();
                                    throw null;
                                }
                                String str = (String) obj;
                                if (i15 > 0) {
                                    strL = ((Object) strL) + " | ";
                                }
                                if (str == null) {
                                    str = "";
                                }
                                strL = ((Object) strL) + str;
                                i15 = i16;
                            }
                            m3.s sVar2 = sVar;
                            qVar3 = qVar;
                            r9.d(strL, null, lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar2, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                            sVar = sVar2;
                            z12 = false;
                            sVar.q(false);
                        }
                        sVar.q(z11);
                        qVar2 = qVar3;
                        b3.i.y(qVar2, i12, sVar, z12);
                    }
                    qVar = qVar2;
                }
                e0.f.D(sVar, false, z11, false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c60.c(pickupOptionLocal, i11, 27);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [m3.n, m3.s] */
    /* JADX WARN: Type inference failed for: r14v11, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r14v4, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r14v5, types: [m3.n, m3.s] */
    /* JADX WARN: Type inference failed for: r14v6, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r14v8, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r14v9, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r24v1, types: [m3.n] */
    /* JADX WARN: Type inference failed for: r24v2, types: [m3.n] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v26 */
    public static final void g(PickupOptionLocal pickupOptionLocal, String str, boolean z11, m3.n nVar, int i11) {
        PickupOptionLocal pickupOptionLocal2;
        int i12;
        ?? r14;
        b4.q qVar;
        ?? r12;
        ?? r142;
        ?? r143;
        ?? r144;
        ?? r145 = (m3.s) nVar;
        r145.c0(-2077422506);
        if ((i11 & 6) == 0) {
            pickupOptionLocal2 = pickupOptionLocal;
            i12 = (r145.h(pickupOptionLocal2) ? 4 : 2) | i11;
        } else {
            pickupOptionLocal2 = pickupOptionLocal;
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= r145.f(str != null ? ParcelDeliveryOptionId.m221boximpl(str) : null) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= r145.g(z11) ? 256 : 128;
        }
        if (r145.R(i12 & 1, (i12 & 147) != 146)) {
            b4.q qVar2 = b4.q.f5711a;
            t tVarB = d2.c.B(m2.d(qVar2, 1.0f), lv.t.f28253g, 0.0f, 2);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, r145, 48);
            int iHashCode = Long.hashCode(r145.T);
            u3.i iVarL = r145.l();
            t tVarC = b4.a.c(tVarB, r145);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            r145.e0();
            if (r145.S) {
                r145.k(hVar);
            } else {
                r145.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, r145);
            m3.i.C(iVarL, b5.i.f5842e, r145);
            m3.i.v(r145, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(r145, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, r145);
            e(str == null ? false : ParcelDeliveryOptionId.m225equalsimpl0(pickupOptionLocal2.m403getDeliveryOptionIdViwp_pU(), str), str == null ? false : ParcelDeliveryOptionId.m225equalsimpl0(pickupOptionLocal2.m403getDeliveryOptionIdViwp_pU(), str) ? lv.s.f28217b : lv.s.C, r145, 0);
            d2.c.f(m2.m(qVar2, lv.t.f28252f), r145);
            Picture carrierIcon = pickupOptionLocal2.getCarrierIcon();
            String currentUrl = carrierIcon != null ? carrierIcon.getCurrentUrl() : null;
            if (currentUrl == null) {
                r145.a0(-1413161837);
                r145.q(false);
                qVar = qVar2;
                r12 = 0;
            } else {
                r145.a0(-1413161836);
                float f11 = 8;
                qVar = qVar2;
                r12 = 0;
                gd.o.c(currentUrl, null, v1.n.k(f4.g.b(m2.q(m2.e(qVar2, 24), 62), l2.g.b(f11)), 1, lv.s.H, l2.g.b(f11)), x0.z(R.drawable.gfx_tgtg_logo_green_small, r145, 0), null, null, z4.l.f47166a, 0.0f, null, r145, 4144, 6, 31728);
                r145.q(false);
            }
            String distance = pickupOptionLocal.getDistance();
            if (distance == null) {
                r145.a0(-1412624607);
                r145.q(r12);
                r142 = r145;
            } else {
                r145.a0(-1412624606);
                d2.c.f(m2.m(qVar, lv.t.f28251e), r145);
                n4.b bVarZ = x0.z(R.drawable.ic_location_green, r145, r12);
                long j9 = lv.s.D;
                g3.i2.a(bVarZ, "", m2.m(qVar, 20), j9, r145, 3512, 0);
                d2.c.f(m2.m(qVar, lv.t.f28249c), r145);
                r9.d(distance, null, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, r145, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                ?? r146 = r145;
                r146.q(r12);
                r142 = r146;
            }
            t tVarM = m2.m(qVar, lv.t.f28251e);
            if ((((double) 1.0f) > 0.0d ? 1 : r12) == 0) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            d2.c.f(tVarM.then(new n1(1.0f, true)), r142);
            if (z11) {
                r142.a0(-1411938483);
                String strI = mv.d.i(pickupOptionLocal.getDeliveryPrice(), 1);
                Price deliveryPrice = pickupOptionLocal.getDeliveryPrice();
                if (Intrinsics.areEqual(deliveryPrice != null ? Double.valueOf(deliveryPrice.getValue()) : null, 0.0d)) {
                    r142.a0(-1411801556);
                    float f12 = 8;
                    ?? r24 = r142;
                    r9.d(f0.U(r142, R.string.mnu_basket_screen_status_delivery_free), d2.c.A(v1.n.j(qVar, lv.s.f28225f, l2.g.b(f12)), f12, 4), lv.s.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28277q, r24, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                    ?? r147 = r24;
                    r147.q(r12);
                    r144 = r147;
                } else {
                    r142.a0(-1411357822);
                    ?? r242 = r142;
                    r9.d(strI, null, lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28275o, r242, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                    ?? r148 = r242;
                    r148.q(r12);
                    r144 = r148;
                }
                r144.q(r12);
                r143 = r144;
            } else {
                r142.a0(-1411259056);
                r142.q(r12);
                r143 = r142;
            }
            r143.q(true);
            r14 = r143;
        } else {
            r145.U();
            r14 = r145;
        }
        w1 w1VarS = r14.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new m3(pickupOptionLocal, str, z11, i11, 14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public static final void h(PickupOptionLocal pickupOptionLocal, DeliveryOptionMethod deliveryOptionMethod, m3.n nVar, int i11) {
        int i12;
        int i13;
        int i14;
        b4.q qVar;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1345114574);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.h(pickupOptionLocal) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.d(deliveryOptionMethod == null ? -1 : deliveryOptionMethod.ordinal()) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            float f11 = lv.t.f28253g;
            b4.q qVar2 = b4.q.f5711a;
            t tVarB = d2.c.B(qVar2, f11, 0.0f, 2);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarB, sVar);
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
            String title = pickupOptionLocal.getTitle();
            if (title == null) {
                sVar.a0(1208512282);
                sVar.q(false);
                i13 = 2;
                qVar = qVar2;
                i14 = 0;
            } else {
                sVar.a0(1208512283);
                i13 = 2;
                i14 = 0;
                qVar = qVar2;
                r9.d(title, null, lv.s.C, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, v.f28275o, sVar, MLKEMEngine.KyberPolyBytes, 12607872, 110586);
                sVar = sVar;
                b3.i.y(qVar, 2, sVar, false);
            }
            String address = pickupOptionLocal.getAddress();
            if (address == null) {
                sVar.a0(1208864318);
                sVar.q(i14);
            } else {
                sVar.a0(1208864319);
                m3.s sVar2 = sVar;
                r9.d(address, null, lv.s.C, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, v.f28274n, sVar2, MLKEMEngine.KyberPolyBytes, 12607872, 110586);
                sVar = sVar2;
                b3.i.y(qVar, i13, sVar, i14);
            }
            String expectedDeliveryTime = pickupOptionLocal.getExpectedDeliveryTime();
            if (expectedDeliveryTime == null) {
                sVar.a0(1209241185);
                sVar.q(i14);
            } else {
                sVar.a0(1209241186);
                String strT = f0.T(R.string.mnu_checkout_overview_pickup_arrives_at, new Object[]{expectedDeliveryTime}, sVar);
                if (deliveryOptionMethod == DeliveryOptionMethod.PICKUP_POINT) {
                    sVar.a0(535817946);
                    m3.s sVar3 = sVar;
                    r9.d(strT, null, lv.s.D, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, v.f28274n, sVar3, MLKEMEngine.KyberPolyBytes, 12607872, 110586);
                    sVar = sVar3;
                    sVar.q(i14);
                } else {
                    sVar.a0(536119514);
                    m3.s sVar4 = sVar;
                    r9.d(strT, null, lv.s.C, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, v.f28274n, sVar4, MLKEMEngine.KyberPolyBytes, 12607872, 110586);
                    sVar = sVar4;
                    sVar.q(i14);
                }
                b3.i.y(qVar, i13, sVar, i14);
            }
            if (deliveryOptionMethod != DeliveryOptionMethod.PICKUP_POINT) {
                sVar.a0(-99510115);
                String cutOffTime = pickupOptionLocal.getCutOffTime();
                if (cutOffTime == null) {
                    sVar.a0(1210153732);
                    sVar.q(i14);
                } else {
                    sVar.a0(1210153733);
                    Context context = (Context) sVar.j(v0.f7390b);
                    a1 a1Var = p0.f30209a;
                    context.getClass();
                    String str = null;
                    try {
                        Date dateF = p0.F(cutOffTime);
                        if (dateF != null) {
                            if (dateF.getDate() == ZonedDateTime.now().getDayOfMonth()) {
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
                                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                String strG = androidx.core.app.e.g(context, R.string.mnu_checkout_overview_pickup_order_by_time);
                                strG.getClass();
                                str = String.format(strG, Arrays.copyOf(new Object[]{simpleDateFormat.format(dateF)}, 1));
                            } else {
                                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd MMMM", Locale.getDefault());
                                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                                String strG2 = androidx.core.app.e.g(context, R.string.mnu_checkout_overview_pickup_order_by_date);
                                strG2.getClass();
                                str = String.format(strG2, Arrays.copyOf(new Object[]{simpleDateFormat2.format(dateF)}, 1));
                            }
                        }
                    } catch (Exception e5) {
                        sa0.a.f38953a.c(e0.f.k("exception parsing pickupCutOff date, e = ", e5.getMessage()), new Object[i14]);
                    }
                    if (str == null) {
                        str = "";
                    }
                    m3.s sVar5 = sVar;
                    r9.d(str, null, lv.s.D, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, v.f28274n, sVar5, MLKEMEngine.KyberPolyBytes, 12607872, 110586);
                    sVar = sVar5;
                    b3.i.y(qVar, i13, sVar, i14);
                }
                sVar.q(i14);
            } else {
                sVar.a0(1210587454);
                sVar.q(i14);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ug.i(pickupOptionLocal, deliveryOptionMethod, i11, 16);
        }
    }
}
