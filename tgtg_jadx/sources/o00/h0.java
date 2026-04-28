package o00;

import a3.m3;
import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import com.app.tgtg.model.remote.item.response.HeaderItem;
import com.app.tgtg.model.remote.manufacturer.response.BasketResponse;
import com.google.android.gms.internal.measurement.cg;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.h2;
import d2.i2;
import d2.k2;
import d2.m2;
import g3.r9;
import g9.f0;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m3.c3;
import m3.w1;
import o00.h0;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h0 implements s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f31663a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f31664b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f31665c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Thread f31666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f31667e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f31668f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f31669g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f31670h = 0;

    public static String[] A(Context context, String str, Bundle bundle) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i11 = bundle.getInt(str, -1);
        if (i11 == -1) {
            wd.a.I("QuirkSettingsLoader", "Resource ID not found for key: ".concat(str));
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i11);
        } catch (Resources.NotFoundException e5) {
            wd.a.J("QuirkSettingsLoader", "Quirk class names resource not found: " + i11, e5);
            return new String[0];
        }
    }

    public static int B(int i11) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i11 <= 0) {
            i4.a.f(r8.k.h(i11, "x (", ") must be > 0"));
            return 0;
        }
        switch (n30.a.f30495a[roundingMode.ordinal()]) {
            case 1:
                if (!((i11 > 0) & (((i11 + (-1)) & i11) == 0))) {
                    j4.d.f("mode was UNNECESSARY, but rounding was necessary");
                    return 0;
                }
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i11 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i11);
                return (31 - iNumberOfLeadingZeros) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros) - i11))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i11);
    }

    public static j30.l C(j30.l lVar) {
        return ((lVar instanceof j30.n) || (lVar instanceof j30.m)) ? lVar : lVar instanceof Serializable ? new j30.m(lVar) : new j30.n(lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashSet D(java.lang.String[] r8) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r1 = r8.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L4a
            r3 = r8[r2]
            java.lang.String r4 = "QuirkSettingsLoader"
            java.lang.Class r5 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L2f
            java.lang.Class<s0.n1> r6 = s0.n1.class
            boolean r6 = r6.isAssignableFrom(r5)     // Catch: java.lang.ClassNotFoundException -> L2f
            if (r6 == 0) goto L1a
            goto L42
        L1a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L2f
            r5.<init>()     // Catch: java.lang.ClassNotFoundException -> L2f
            r5.append(r3)     // Catch: java.lang.ClassNotFoundException -> L2f
            java.lang.String r6 = " does not implement the Quirk interface."
            r5.append(r6)     // Catch: java.lang.ClassNotFoundException -> L2f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.ClassNotFoundException -> L2f
            wd.a.I(r4, r5)     // Catch: java.lang.ClassNotFoundException -> L2f
            goto L41
        L2f:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Class not found: "
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            wd.a.J(r4, r3, r5)
        L41:
            r5 = 0
        L42:
            if (r5 == 0) goto L47
            r0.add(r5)
        L47:
            int r2 = r2 + 1
            goto L7
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o00.h0.D(java.lang.String[]):java.util.HashSet");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object E(int r6, java.lang.Object r7, q5.a0 r8, q5.r r9, int r10) {
        /*
            boolean r0 = r7 instanceof android.graphics.Typeface
            if (r0 != 0) goto L5
            return r7
        L5:
            r0 = r6 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L29
            q5.r r0 = r8.f35992b
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r9)
            if (r0 != 0) goto L29
            q5.r r0 = q5.r.f36039d
            int r3 = r9.compareTo(r0)
            if (r3 < 0) goto L29
            q5.r r3 = r8.f35992b
            int r3 = r3.f36049a
            int r0 = r0.f36049a
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r3, r0)
            if (r0 >= 0) goto L29
            r0 = r2
            goto L2a
        L29:
            r0 = r1
        L2a:
            r3 = 2
            r6 = r6 & r3
            if (r6 == 0) goto L35
            int r6 = r8.f35993c
            if (r10 != r6) goto L33
            goto L35
        L33:
            r6 = r2
            goto L36
        L35:
            r6 = r1
        L36:
            if (r6 != 0) goto L3b
            if (r0 != 0) goto L3b
            return r7
        L3b:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 >= r5) goto L5c
            if (r6 == 0) goto L47
            if (r10 != r2) goto L47
            r6 = r2
            goto L48
        L47:
            r6 = r1
        L48:
            if (r6 == 0) goto L4e
            if (r0 == 0) goto L4e
            r1 = 3
            goto L55
        L4e:
            if (r0 == 0) goto L52
            r1 = r2
            goto L55
        L52:
            if (r6 == 0) goto L55
            r1 = r3
        L55:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r7, r1)
            return r6
        L5c:
            if (r0 == 0) goto L61
            int r9 = r9.f36049a
            goto L65
        L61:
            q5.r r9 = r8.f35992b
            int r9 = r9.f36049a
        L65:
            if (r6 == 0) goto L6b
            if (r10 != r2) goto L70
        L69:
            r1 = r2
            goto L70
        L6b:
            int r6 = r8.f35993c
            if (r6 != r2) goto L70
            goto L69
        L70:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            android.graphics.Typeface r6 = a3.a3.e(r7, r9, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o00.h0.E(int, java.lang.Object, q5.a0, q5.r, int):java.lang.Object");
    }

    public static int F(Context context, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i11});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static String G(int i11) {
        return w.a0.l("OperatingMode(mode=", i11, ')');
    }

    /* JADX WARN: Path cross not found for [B:30:0x008d, B:24:0x0077], limit reached: 43 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00e7 -> B:41:0x00f3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H(ld.a r17, td.i r18, td.o r19, fd.g r20, z70.c r21) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o00.h0.H(ld.a, td.i, td.o, fd.g, z70.c):java.lang.Object");
    }

    public static final void a(um.u uVar, BasketResponse basketResponse, boolean z11, m3.n nVar, int i11) {
        int i12;
        String strJ;
        basketResponse.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1859309073);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? sVar.f(uVar) : sVar.h(uVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(basketResponse) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.g(z11) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            boolean z12 = false;
            g3.s0.g(null, 1, lv.s.I, sVar, 432, 1);
            float f11 = lv.t.f28253g;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarZ = d2.c.z(qVar, f11);
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
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            b4.t tVarD = m2.d(qVar, 1.0f);
            if (basketResponse.getCanCheckout()) {
                strJ = b3.i.j(835600449, com.app.tgtg.R.string.mnu_basket_screen_checkout_cta, sVar, sVar, false);
            } else {
                sVar.a0(835385092);
                strJ = o30.f0.T(com.app.tgtg.R.string.mnu_basket_screen_checkout_cta_text_missing, new Object[]{mv.d.i(basketResponse.getRequiredAmountToCheckout(), 1)}, sVar);
                sVar.q(false);
            }
            lv.q qVar2 = lv.q.REGULAR;
            lv.e eVar = lv.e.LARGE;
            boolean z13 = z11 && basketResponse.getCanCheckout();
            boolean zH = ((i12 & 896) == 256) | sVar.h(basketResponse);
            if ((i12 & 14) == 4 || ((i12 & 8) != 0 && sVar.h(uVar))) {
                z12 = true;
            }
            boolean z14 = zH | z12;
            Object objM = sVar.M();
            if (z14 || objM == m3.m.f29332a) {
                objM = new bg.b(z11, basketResponse, uVar, 6);
                sVar.k0(objM);
            }
            sVar = sVar;
            v0.n.l(tVarD, strJ, null, qVar2, eVar, z13, false, null, null, (Function0) objM, sVar, 27654, 452);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new m3(uVar, basketResponse, z11, i11, 13);
        }
    }

    public static final void b(Function0 function0, m3.n nVar, int i11) {
        m3.s sVar;
        function0.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1783322950);
        int i12 = (sVar2.h(function0) ? 4 : 2) | i11;
        if (sVar2.R(i12 & 1, (i12 & 3) != 2)) {
            Integer numValueOf = Integer.valueOf(com.app.tgtg.R.string.mnu_basket_screen_status_delivery_fee);
            Integer numValueOf2 = Integer.valueOf(com.app.tgtg.R.string.mnu_basket_screen_status_fee_popup_body);
            int i13 = i12 & 14;
            boolean z11 = i13 == 4;
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (z11 || objM == fVar) {
                objM = new vm.r(1, function0);
                sVar2.k0(objM);
            }
            Function0 function02 = (Function0) objM;
            boolean z12 = i13 == 4;
            Object objM2 = sVar2.M();
            if (z12 || objM2 == fVar) {
                objM2 = new vm.r(2, function0);
                sVar2.k0(objM2);
            }
            sVar = sVar2;
            cg.j.i(numValueOf, null, null, numValueOf2, com.app.tgtg.R.string.mnu_basket_screen_status_fee_popup_cta_okay, 0L, function02, null, null, 0L, 0L, (Function0) objM2, null, Integer.valueOf(com.app.tgtg.R.drawable.truck_blob), sVar, 0, 0, 6054);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.z(i11, 27, function0);
        }
    }

    public static final void c(HeaderItem headerItem, m3.n nVar, int i11) {
        float f11;
        x60.m mVar;
        x60.k kVar;
        x60.h hVar;
        b5.d dVar;
        b5.g gVar;
        b5.g gVar2;
        b5.g gVar3;
        b5.h hVar2;
        float f12;
        b5.g gVar4;
        b4.k kVar2;
        boolean z11;
        float f13;
        b4.q qVar;
        b5.h hVar3;
        b5.g gVar5;
        b4.k kVar3;
        b5.g gVar6;
        b5.h hVar4;
        float f14;
        float f15;
        x60.k kVar4;
        b5.g gVar7;
        b5.g gVar8;
        b5.d dVar2;
        boolean z12;
        boolean z13;
        boolean z14;
        x60.h hVar5;
        b4.k kVar5 = b4.d.f5687e;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-23080522);
        int i12 = i11 | (sVar.f(headerItem) ? 4 : 2);
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.m mVar2 = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.k kVar6 = (x60.k) sVar.j(PantryThemeKt.getLocalPantryRadius());
            x60.h hVar6 = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            float f16 = mVar2.f44015k;
            float f17 = mVar2.f44016m;
            float f18 = mVar2.f44017n;
            float f19 = mVar2.l;
            b4.q qVar2 = b4.q.f5711a;
            b4.t tVarA = d2.c.A(qVar2, f16, f19);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarA, sVar);
            b5.j.R.getClass();
            b5.h hVar7 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar7);
            } else {
                sVar.n0();
            }
            b5.g gVar9 = b5.i.f5843f;
            m3.i.C(yVarA, gVar9, sVar);
            b5.g gVar10 = b5.i.f5842e;
            m3.i.C(iVarL, gVar10, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar11 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar11);
            b5.d dVar3 = b5.i.f5845h;
            m3.i.z(sVar, dVar3);
            b5.g gVar12 = b5.i.f5841d;
            m3.i.C(tVarC, gVar12, sVar);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(qVar2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar7);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar9, sVar);
            m3.i.C(iVarL2, gVar10, sVar);
            w.a0.y(iHashCode2, sVar, gVar11, sVar, dVar3);
            m3.i.C(tVarC2, gVar12, sVar);
            String title = headerItem.getTitle();
            if (title == null) {
                sVar.a0(240904609);
                sVar.q(false);
                z11 = false;
                kVar2 = kVar5;
                gVar = gVar10;
                hVar2 = hVar7;
                dVar = dVar3;
                gVar2 = gVar11;
                gVar3 = gVar12;
                f12 = f19;
                qVar = qVar2;
                gVar4 = gVar9;
                hVar = hVar6;
                f11 = f17;
                f13 = f18;
                mVar = mVar2;
                kVar = kVar6;
            } else {
                sVar.a0(240904610);
                if (1.0f <= 0.0d) {
                    e2.a.a("invalid weight; must be greater than zero");
                }
                f11 = f17;
                mVar = mVar2;
                kVar = kVar6;
                hVar = hVar6;
                dVar = dVar3;
                gVar = gVar10;
                gVar2 = gVar11;
                gVar3 = gVar12;
                hVar2 = hVar7;
                f12 = f19;
                gVar4 = gVar9;
                kVar2 = kVar5;
                z11 = false;
                f13 = f18;
                qVar = qVar2;
                r9.d(title, new d2.n1(1.0f, false), hVar6.J, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 2, 0, null, jVar.f43957f, sVar, 0, 24576, 113656);
                sVar = sVar;
                sVar.q(false);
            }
            String subtitle = headerItem.getSubtitle();
            if (subtitle == null) {
                sVar.a0(241284235);
                sVar.q(z11);
                gVar5 = gVar4;
                kVar3 = kVar2;
                f15 = f11;
                kVar4 = kVar;
                f14 = f12;
                hVar4 = hVar2;
                gVar7 = gVar;
                gVar8 = gVar2;
                dVar2 = dVar;
                gVar6 = gVar3;
                z12 = true;
            } else {
                r8.k.t(f13, 241284236, qVar, sVar, sVar);
                x60.k kVar7 = kVar;
                float f20 = f11;
                float f21 = f12;
                b4.t tVarA2 = d2.c.A(v1.n.j(qVar, lv.s.I, l2.g.b(kVar7.f43980d)), f21, f20);
                b4.k kVar8 = kVar2;
                z4.u0 u0VarD = d2.p.d(kVar8, z11);
                int iHashCode3 = Long.hashCode(sVar.T);
                u3.i iVarL3 = sVar.l();
                b4.t tVarC3 = b4.a.c(tVarA2, sVar);
                sVar.e0();
                if (sVar.S) {
                    hVar3 = hVar2;
                    sVar.k(hVar3);
                } else {
                    hVar3 = hVar2;
                    sVar.n0();
                }
                b5.g gVar13 = gVar4;
                m3.i.C(u0VarD, gVar13, sVar);
                m3.i.C(iVarL3, gVar, sVar);
                w.a0.y(iHashCode3, sVar, gVar2, sVar, dVar);
                b5.g gVar14 = gVar3;
                m3.i.C(tVarC3, gVar14, sVar);
                m3.s sVar2 = sVar;
                gVar5 = gVar13;
                kVar3 = kVar8;
                gVar6 = gVar14;
                hVar4 = hVar3;
                f14 = f21;
                f15 = f20;
                kVar4 = kVar7;
                gVar7 = gVar;
                gVar8 = gVar2;
                dVar2 = dVar;
                r9.d(subtitle, null, lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar2, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                sVar = sVar2;
                z12 = true;
                sVar.q(true);
                sVar.q(z11);
            }
            if (Intrinsics.areEqual(headerItem.getShowNew(), Boolean.TRUE)) {
                r8.k.t(f13, 242036048, qVar, sVar, sVar);
                hVar5 = hVar;
                b4.t tVarA3 = d2.c.A(v1.n.j(qVar, hVar5.I, l2.g.b(kVar4.f43980d)), f14, f15);
                z4.u0 u0VarD2 = d2.p.d(kVar3, z11);
                int iHashCode4 = Long.hashCode(sVar.T);
                u3.i iVarL4 = sVar.l();
                b4.t tVarC4 = b4.a.c(tVarA3, sVar);
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar4);
                } else {
                    sVar.n0();
                }
                m3.i.C(u0VarD2, gVar5, sVar);
                m3.i.C(iVarL4, gVar7, sVar);
                w.a0.y(iHashCode4, sVar, gVar8, sVar, dVar2);
                m3.i.C(tVarC4, gVar6, sVar);
                m3.s sVar3 = sVar;
                z14 = z12;
                r9.d(o30.f0.U(sVar, com.app.tgtg.R.string.mnu_list_category_header_new), null, hVar5.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar3, 0, 12582912, 131066);
                sVar = sVar3;
                sVar.q(z14);
                z13 = false;
                sVar.q(false);
            } else {
                z13 = z11;
                z14 = z12;
                hVar5 = hVar;
                sVar.a0(242776018);
                sVar.q(z13);
            }
            sVar.q(z14);
            d2.c.f(m2.m(qVar, mVar.f44020q), sVar);
            String description = headerItem.getDescription();
            if (description == null) {
                sVar.a0(770824723);
                sVar.q(z13);
            } else {
                sVar.a0(770824724);
                m3.s sVar4 = sVar;
                r9.d(description, null, hVar5.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar4, 0, 12582912, 131066);
                sVar = sVar4;
                sVar.q(false);
            }
            sVar.q(z14);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new an.g(headerItem, i11);
        }
    }

    public static final void d(Function0 function0, m3.n nVar, int i11) {
        m3.s sVar;
        function0.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-709156709);
        int i12 = (sVar2.h(function0) ? 4 : 2) | i11;
        if (sVar2.R(i12 & 1, (i12 & 3) != 2)) {
            Integer numValueOf = Integer.valueOf(com.app.tgtg.R.string.mnu_basket_screen_status_max_popup_title);
            Integer numValueOf2 = Integer.valueOf(com.app.tgtg.R.string.mnu_basket_screen_status_max_popup_body);
            int i13 = i12 & 14;
            boolean z11 = i13 == 4;
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (z11 || objM == fVar) {
                objM = new rr.a(29, function0);
                sVar2.k0(objM);
            }
            Function0 function02 = (Function0) objM;
            boolean z12 = i13 == 4;
            Object objM2 = sVar2.M();
            if (z12 || objM2 == fVar) {
                objM2 = new vm.r(0, function0);
                sVar2.k0(objM2);
            }
            sVar = sVar2;
            cg.j.i(numValueOf, null, null, numValueOf2, com.app.tgtg.R.string.mnu_basket_screen_status_fee_popup_cta_okay, 0L, function02, null, null, 0L, 0L, (Function0) objM2, null, Integer.valueOf(com.app.tgtg.R.drawable.parcel_max_blob), sVar, 0, 0, 6054);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.z(i11, 26, function0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [i4.v] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r8v1, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r8v27, types: [m3.n, m3.s] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r9v18, types: [kotlin.jvm.functions.Function0] */
    public static final void e(final g9.f0 f0Var, String str, ep.d0 d0Var, final k8.d dVar, final Function0 function0, m3.n nVar, int i11) {
        final ep.d0 d0Var2;
        ?? r82;
        Object kVar;
        m3.b1 b1Var;
        m3.b1 b1Var2;
        m3.b1 b1Var3;
        m3.b1 b1Var4;
        m3.b1 b1Var5;
        Activity activity;
        String str2;
        m3.b1 b1Var6;
        int i12;
        int i13;
        m3.b1 b1Var7;
        k8.d dVar2;
        ep.d0 d0Var3;
        m3.b1 b1Var8;
        Context context;
        m3.b1 b1Var9;
        m3.b1 b1Var10;
        final m3.b1 b1Var11;
        Object obj;
        int i14;
        m3.b1 b1Var12;
        int i15;
        Context context2;
        m3.s sVar;
        g9.f0 f0Var2;
        m3.b1 b1Var13;
        Activity activity2;
        Context context3;
        Object dVar3;
        final Activity activity3;
        final Context context4;
        final g9.f0 f0Var3;
        String string;
        String str3;
        Function0 function02;
        ?? vVar;
        int i16;
        boolean z11;
        Object obj2;
        int i17;
        g9.z zVar;
        g9.f0 f0Var4 = f0Var;
        f0Var4.getClass();
        str.getClass();
        d0Var.getClass();
        dVar.getClass();
        function0.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1842906035);
        int i18 = i11 | (sVar2.h(f0Var4) ? 4 : 2) | (sVar2.f(str) ? 32 : 16) | (sVar2.h(d0Var) ? 256 : 128) | (sVar2.h(dVar) ? NewHope.SENDB_BYTES : 1024) | (sVar2.h(function0) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar2.R(i18 & 1, (i18 & 9363) != 9362)) {
            Context context5 = (Context) sVar2.j(c5.v0.f7390b);
            Activity activityE = mv.r0.e(context5);
            m3.b1 b1VarN = m3.i.n(d0Var.f16256q, sVar2, 0);
            m3.b1 b1VarN2 = m3.i.n(d0Var.f16251k, sVar2, 0);
            m3.b1 b1VarN3 = m3.i.n(d0Var.f16263x, sVar2, 0);
            m3.b1 b1VarN4 = m3.i.n(d0Var.f16265z, sVar2, 0);
            m3.b1 b1VarN5 = m3.i.n(d0Var.B, sVar2, 0);
            m3.b1 b1VarN6 = m3.i.n(d0Var.D, sVar2, 0);
            m3.b1 b1VarN7 = m3.i.n(d0Var.f16259t, sVar2, 0);
            m3.b1 b1VarN8 = m3.i.n(d0Var.f16261v, sVar2, 0);
            boolean zH = sVar2.h(d0Var) | sVar2.h(f0Var4);
            Object objM = sVar2.M();
            Object obj3 = m3.m.f29332a;
            x70.c cVar = null;
            if (zH || objM == obj3) {
                objM = new d8.c(d0Var, f0Var4, cVar, 10);
                sVar2.k0(objM);
            }
            m3.i.h(d0Var, (Function2) objM, sVar2);
            Object objM2 = sVar2.M();
            if (objM2 == obj3) {
                objM2 = m3.i.w(null);
                sVar2.k0(objM2);
            }
            m3.b1 b1Var14 = (m3.b1) objM2;
            Object objM3 = sVar2.M();
            if (objM3 == obj3) {
                objM3 = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM3);
            }
            m3.b1 b1Var15 = (m3.b1) objM3;
            Object objM4 = sVar2.M();
            if (objM4 == obj3) {
                objM4 = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM4);
            }
            m3.b1 b1Var16 = (m3.b1) objM4;
            m3.b1 b1Var17 = b1Var14;
            m3.b1 b1VarN9 = m3.i.n(d0Var.K, sVar2, 0);
            boolean zH2 = sVar2.h(dVar) | sVar2.f(b1VarN9) | sVar2.h(f0Var4) | sVar2.h(d0Var) | sVar2.h(context5);
            Object objM5 = sVar2.M();
            if (zH2 || objM5 == obj3) {
                b1Var = b1VarN3;
                b1Var2 = b1Var16;
                b1Var3 = b1VarN2;
                b1Var4 = b1Var15;
                b1Var5 = b1VarN4;
                activity = activityE;
                str2 = null;
                b1Var6 = b1VarN6;
                i12 = i18;
                i13 = 10;
                b1Var7 = b1VarN;
                kVar = new ap.k(dVar, f0Var4, d0Var, context5, b1VarN9, b1Var17, b1Var2, (x70.c) null);
                dVar2 = dVar;
                f0Var4 = f0Var4;
                d0Var3 = d0Var;
                b1Var17 = b1Var17;
                b1Var8 = b1VarN9;
                context = context5;
                sVar2.k0(kVar);
            } else {
                b1Var = b1VarN3;
                b1Var2 = b1Var16;
                b1Var3 = b1VarN2;
                b1Var5 = b1VarN4;
                activity = activityE;
                str2 = null;
                b1Var4 = b1Var15;
                b1Var6 = b1VarN6;
                i12 = i18;
                i13 = 10;
                b1Var7 = b1VarN;
                b1Var8 = b1VarN9;
                kVar = objM5;
                context = context5;
                d0Var3 = d0Var;
                dVar2 = dVar;
            }
            m3.i.h(dVar2, (Function2) kVar, sVar2);
            androidx.fragment.app.g1 g1Var = new androidx.fragment.app.g1(3);
            boolean zH3 = sVar2.h(f0Var4) | sVar2.h(d0Var3);
            Object objM6 = sVar2.M();
            if (zH3 || objM6 == obj3) {
                objM6 = new a3.y0(f0Var4, d0Var3, b1Var4, i13);
                sVar2.k0(objM6);
            }
            final e.n nVarN = jb.u.N(g1Var, (Function1) objM6, sVar2, 0);
            String strU = o30.f0.U(sVar2, com.app.tgtg.R.string.camera_permission_alert_box_title);
            String strU2 = o30.f0.U(sVar2, com.app.tgtg.R.string.camera_permission_alert_box_description);
            boolean zBooleanValue = ((Boolean) b1Var4.getValue()).booleanValue();
            Object objM7 = sVar2.M();
            if (objM7 == obj3) {
                objM7 = new bm.j(b1Var4, 14);
                sVar2.k0(objM7);
            }
            Function0 function03 = (Function0) objM7;
            boolean zH4 = sVar2.h(d0Var3);
            Object objM8 = sVar2.M();
            if (zH4 || objM8 == obj3) {
                objM8 = new ep.l(0, d0Var3, b1Var4);
                sVar2.k0(objM8);
            }
            final Context context6 = context;
            final m3.b1 b1Var18 = b1Var8;
            m3.b1 b1Var19 = b1Var2;
            final m3.b1 b1Var20 = b1Var7;
            final m3.b1 b1Var21 = b1VarN5;
            d0Var2 = d0Var;
            final m3.b1 b1Var22 = b1Var;
            ox.h.f(strU, strU2, zBooleanValue, function03, (Function0) objM8, null, null, null, sVar2, 3072, BERTags.FLAGS);
            String strU3 = o30.f0.U(sVar2, com.app.tgtg.R.string.camera_consent_dialog_title);
            String strU4 = o30.f0.U(sVar2, com.app.tgtg.R.string.camera_consent_dialog_description);
            boolean zBooleanValue2 = ((Boolean) b1Var19.getValue()).booleanValue();
            String strU5 = o30.f0.U(sVar2, com.app.tgtg.R.string.camera_consent_dialog_continue);
            String strU6 = o30.f0.U(sVar2, com.app.tgtg.R.string.camera_consent_dialog_not_now);
            Object objM9 = sVar2.M();
            if (objM9 == obj3) {
                b1Var9 = b1Var19;
                objM9 = new bm.j(b1Var9, 15);
                sVar2.k0(objM9);
            } else {
                b1Var9 = b1Var19;
            }
            Function0 function04 = (Function0) objM9;
            boolean zH5 = sVar2.h(d0Var2) | sVar2.h(f0Var) | sVar2.h(context6);
            Object objM10 = sVar2.M();
            if (zH5 || objM10 == obj3) {
                cg.d dVar4 = new cg.d(d0Var2, b1Var9, b1Var17, f0Var, context6, 2);
                b1Var10 = b1Var9;
                sVar2.k0(dVar4);
                objM10 = dVar4;
            } else {
                b1Var10 = b1Var9;
            }
            ox.h.f(strU3, strU4, zBooleanValue2, function04, (Function0) objM10, strU5, strU6, null, sVar2, 3072, 128);
            d2.g0 g0Var = m2.f13850c;
            z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            b4.t tVarC = b4.a.c(g0Var, sVar2);
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
            Object objM11 = sVar2.M();
            if (objM11 == obj3) {
                objM11 = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM11);
            }
            final m3.b1 b1Var23 = (m3.b1) objM11;
            Object objM12 = sVar2.M();
            if (objM12 == obj3) {
                objM12 = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM12);
            }
            final m3.b1 b1Var24 = (m3.b1) objM12;
            Object objM13 = sVar2.M();
            if (objM13 == obj3) {
                objM13 = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM13);
            }
            m3.b1 b1Var25 = (m3.b1) objM13;
            final m3.b1 b1Var26 = b1Var5;
            boolean zF = sVar2.f(b1Var21) | sVar2.h(context6) | sVar2.h(f0Var) | sVar2.h(nVarN) | sVar2.h(d0Var2) | sVar2.f(b1Var18) | sVar2.h(dVar) | sVar2.f(b1Var22) | sVar2.f(b1Var26);
            int i19 = i12 & 57344;
            boolean z12 = i19 == 16384;
            final m3.b1 b1Var27 = b1Var3;
            boolean zF2 = zF | z12 | sVar2.f(b1Var20) | sVar2.f(b1Var27);
            Object objM14 = sVar2.M();
            if (zF2 || objM14 == obj3) {
                b1Var11 = b1Var25;
                obj = obj3;
                i14 = i12;
                b1Var12 = b1Var6;
                i15 = i19;
                final m3.b1 b1Var28 = b1Var17;
                final m3.b1 b1Var29 = b1Var10;
                objM14 = new Function1() { // from class: ep.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        g9.c0 c0Var = (g9.c0) obj4;
                        c0Var.getClass();
                        String str4 = hp.r.INSTANCE.f22335a;
                        c3 c3Var = b1Var21;
                        Context context7 = context6;
                        final f0 f0Var5 = f0Var;
                        e.n nVar2 = nVarN;
                        final d0 d0Var4 = d0Var2;
                        zz.f.m(c0Var, str4, new u3.d(new d(c3Var, context7, f0Var5, nVar2, d0Var4, 0), true, -1137523516));
                        zz.f.m(c0Var, hp.o.INSTANCE.f22335a, new u3.d(new e(d0Var4, b1Var18, f0Var5, context7, dVar, b1Var28, b1Var29, b1Var23, b1Var24), true, -1930037971));
                        zz.f.m(c0Var, hp.s.INSTANCE.f22335a, new u3.d(new f(b1Var22, d0Var4, f0Var5), true, 720980556));
                        zz.f.m(c0Var, hp.q.INSTANCE.f22335a, new u3.d(new dp.s(1, b1Var26, f0Var5, d0Var4, function0), true, -922968213));
                        final int i21 = 0;
                        zz.f.m(c0Var, hp.u.INSTANCE.f22335a, new u3.d(new i80.o() { // from class: ep.g
                            @Override // i80.o
                            public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                                int i22 = i21;
                                m3.n nVar3 = (m3.n) obj7;
                                ((Integer) obj8).getClass();
                                ((s1.l) obj5).getClass();
                                ((g9.l) obj6).getClass();
                                switch (i22) {
                                    case 0:
                                        m3.s sVar3 = (m3.s) nVar3;
                                        d0 d0Var5 = d0Var4;
                                        boolean zH6 = sVar3.h(d0Var5);
                                        f0 f0Var6 = f0Var5;
                                        boolean zH7 = zH6 | sVar3.h(f0Var6);
                                        Object objM15 = sVar3.M();
                                        m3.f fVar = m3.m.f29332a;
                                        if (zH7 || objM15 == fVar) {
                                            objM15 = new k(d0Var5, f0Var6, 0);
                                            sVar3.k0(objM15);
                                        }
                                        Function1 function1 = (Function1) objM15;
                                        boolean zH8 = sVar3.h(f0Var6);
                                        Object objM16 = sVar3.M();
                                        if (zH8 || objM16 == fVar) {
                                            objM16 = new dq.g(f0Var6, 2);
                                            sVar3.k0(objM16);
                                        }
                                        Function0 function05 = (Function0) objM16;
                                        boolean zH9 = sVar3.h(d0Var5);
                                        Object objM17 = sVar3.M();
                                        if (zH9 || objM17 == fVar) {
                                            objM17 = new j(d0Var5, 1);
                                            sVar3.k0(objM17);
                                        }
                                        lp.d.t(d0Var5, function1, function05, (Function1) objM17, sVar3, 0);
                                        return Unit.f26487a;
                                    default:
                                        Unit unit = Unit.f26487a;
                                        m3.s sVar4 = (m3.s) nVar3;
                                        d0 d0Var6 = d0Var4;
                                        boolean zH10 = sVar4.h(d0Var6);
                                        Object objM18 = sVar4.M();
                                        m3.f fVar2 = m3.m.f29332a;
                                        if (zH10 || objM18 == fVar2) {
                                            objM18 = new n(d0Var6, null, 2);
                                            sVar4.k0(objM18);
                                        }
                                        m3.i.h(unit, (Function2) objM18, sVar4);
                                        boolean zH11 = sVar4.h(d0Var6);
                                        f0 f0Var7 = f0Var5;
                                        boolean zH12 = zH11 | sVar4.h(f0Var7);
                                        Object objM19 = sVar4.M();
                                        if (zH12 || objM19 == fVar2) {
                                            objM19 = new k(d0Var6, f0Var7, 1);
                                            sVar4.k0(objM19);
                                        }
                                        Function1 function12 = (Function1) objM19;
                                        boolean zH13 = sVar4.h(d0Var6);
                                        Object objM20 = sVar4.M();
                                        if (zH13 || objM20 == fVar2) {
                                            objM20 = new j(d0Var6, 3);
                                            sVar4.k0(objM20);
                                        }
                                        lp.r.j(d0Var6, function12, (Function1) objM20, sVar4, 0);
                                        return unit;
                                }
                            }
                        }, true, 1728050314));
                        zz.f.m(c0Var, hp.v.INSTANCE.f22335a, new u3.d(new f(d0Var4, b1Var20, f0Var5, 1), true, 84101545));
                        final int i22 = 1;
                        zz.f.m(c0Var, hp.x.INSTANCE.f22335a, new u3.d(new i80.o() { // from class: ep.g
                            @Override // i80.o
                            public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                                int i222 = i22;
                                m3.n nVar3 = (m3.n) obj7;
                                ((Integer) obj8).getClass();
                                ((s1.l) obj5).getClass();
                                ((g9.l) obj6).getClass();
                                switch (i222) {
                                    case 0:
                                        m3.s sVar3 = (m3.s) nVar3;
                                        d0 d0Var5 = d0Var4;
                                        boolean zH6 = sVar3.h(d0Var5);
                                        f0 f0Var6 = f0Var5;
                                        boolean zH7 = zH6 | sVar3.h(f0Var6);
                                        Object objM15 = sVar3.M();
                                        m3.f fVar = m3.m.f29332a;
                                        if (zH7 || objM15 == fVar) {
                                            objM15 = new k(d0Var5, f0Var6, 0);
                                            sVar3.k0(objM15);
                                        }
                                        Function1 function1 = (Function1) objM15;
                                        boolean zH8 = sVar3.h(f0Var6);
                                        Object objM16 = sVar3.M();
                                        if (zH8 || objM16 == fVar) {
                                            objM16 = new dq.g(f0Var6, 2);
                                            sVar3.k0(objM16);
                                        }
                                        Function0 function05 = (Function0) objM16;
                                        boolean zH9 = sVar3.h(d0Var5);
                                        Object objM17 = sVar3.M();
                                        if (zH9 || objM17 == fVar) {
                                            objM17 = new j(d0Var5, 1);
                                            sVar3.k0(objM17);
                                        }
                                        lp.d.t(d0Var5, function1, function05, (Function1) objM17, sVar3, 0);
                                        return Unit.f26487a;
                                    default:
                                        Unit unit = Unit.f26487a;
                                        m3.s sVar4 = (m3.s) nVar3;
                                        d0 d0Var6 = d0Var4;
                                        boolean zH10 = sVar4.h(d0Var6);
                                        Object objM18 = sVar4.M();
                                        m3.f fVar2 = m3.m.f29332a;
                                        if (zH10 || objM18 == fVar2) {
                                            objM18 = new n(d0Var6, null, 2);
                                            sVar4.k0(objM18);
                                        }
                                        m3.i.h(unit, (Function2) objM18, sVar4);
                                        boolean zH11 = sVar4.h(d0Var6);
                                        f0 f0Var7 = f0Var5;
                                        boolean zH12 = zH11 | sVar4.h(f0Var7);
                                        Object objM19 = sVar4.M();
                                        if (zH12 || objM19 == fVar2) {
                                            objM19 = new k(d0Var6, f0Var7, 1);
                                            sVar4.k0(objM19);
                                        }
                                        Function1 function12 = (Function1) objM19;
                                        boolean zH13 = sVar4.h(d0Var6);
                                        Object objM20 = sVar4.M();
                                        if (zH13 || objM20 == fVar2) {
                                            objM20 = new j(d0Var6, 3);
                                            sVar4.k0(objM20);
                                        }
                                        lp.r.j(d0Var6, function12, (Function1) objM20, sVar4, 0);
                                        return unit;
                                }
                            }
                        }, true, -1559847224));
                        zz.f.m(c0Var, hp.t.INSTANCE.f22335a, new u3.d(new cn.v(f0Var5, d0Var4, b1Var11, 2), true, 1091171303));
                        zz.f.m(c0Var, hp.w.INSTANCE.f22335a, new u3.d(new f(d0Var4, b1Var27, f0Var5, 2), true, -552777466));
                        return Unit.f26487a;
                    }
                };
                b1Var21 = b1Var21;
                context2 = context6;
                d0Var2 = d0Var2;
                sVar = sVar2;
                sVar.k0(objM14);
            } else {
                b1Var11 = b1Var25;
                obj = obj3;
                context2 = context6;
                i14 = i12;
                b1Var12 = b1Var6;
                i15 = i19;
                sVar = sVar2;
            }
            Function1 function1 = (Function1) objM14;
            int i21 = i14 & 14;
            m3.s sVar3 = sVar;
            m3.b1 b1Var30 = b1Var21;
            b0.z.h(f0Var, str, null, null, null, null, null, null, null, function1, sVar3, i14 & 126, 1020);
            final m3.b1 b1Var31 = b1Var12;
            final Activity activity4 = activity;
            boolean zH6 = sVar3.h(f0Var) | sVar3.f(b1Var31) | sVar3.h(activity4) | sVar3.h(d0Var2) | sVar3.h(context2);
            Object objM15 = sVar3.M();
            Object obj4 = obj;
            if (zH6 || objM15 == obj4) {
                final int i22 = 1;
                final Context context7 = context2;
                final ep.d0 d0Var4 = d0Var2;
                Function0 function05 = new Function0() { // from class: ep.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i22) {
                            case 0:
                                h0.f(f0Var, b1Var31, activity4, d0Var4, context7);
                                break;
                            default:
                                h0.f(f0Var, b1Var31, activity4, d0Var4, context7);
                                break;
                        }
                        return Unit.f26487a;
                    }
                };
                f0Var2 = f0Var;
                b1Var13 = b1Var31;
                activity2 = activity4;
                context3 = context7;
                sVar3.k0(function05);
                objM15 = function05;
            } else {
                b1Var13 = b1Var31;
                activity2 = activity4;
                context3 = context2;
                f0Var2 = f0Var;
            }
            jf.e.a(false, (Function0) objM15, sVar3, 0, 1);
            g9.l lVar = (g9.l) m3.i.m(new y80.g1(f0Var2.f20186b.f27556z), null, null, sVar3, 48, 2).getValue();
            String str4 = (lVar == null || (zVar = lVar.f20163b) == null) ? str2 : zVar.f20258b.f27564f;
            boolean zAreEqual = Intrinsics.areEqual(str4, hp.t.INSTANCE.f22335a);
            boolean z13 = zAreEqual && ((String) d0Var2.f16247g.a("SHARED_RECIPE_TOKEN")) != null;
            boolean zAreEqual2 = Intrinsics.areEqual(str4, hp.x.INSTANCE.f22335a);
            boolean zH7 = sVar3.h(f0Var2) | sVar3.h(d0Var2) | sVar3.h(context3) | sVar3.h(activity2) | (i15 == 16384);
            Object objM16 = sVar3.M();
            if (zH7 || objM16 == obj4) {
                Context context8 = context3;
                activity3 = activity2;
                g9.f0 f0Var5 = f0Var2;
                dVar3 = new cg.d(d0Var2, context8, activity3, f0Var5, function0, 1);
                context4 = context8;
                f0Var3 = f0Var5;
                sVar3.k0(dVar3);
            } else {
                dVar3 = objM16;
                context4 = context3;
                activity3 = activity2;
                f0Var3 = f0Var2;
            }
            Function0 function06 = (Function0) dVar3;
            boolean zH8 = sVar3.h(f0Var3) | sVar3.f(b1Var13) | sVar3.h(activity3) | sVar3.h(d0Var2) | sVar3.h(context4);
            Object objM17 = sVar3.M();
            if (zH8 || objM17 == obj4) {
                final int i23 = 0;
                final m3.b1 b1Var32 = b1Var13;
                final ep.d0 d0Var5 = d0Var2;
                Function0 function07 = new Function0() { // from class: ep.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i23) {
                            case 0:
                                h0.f(f0Var3, b1Var32, activity3, d0Var5, context4);
                                break;
                            default:
                                h0.f(f0Var3, b1Var32, activity3, d0Var5, context4);
                                break;
                        }
                        return Unit.f26487a;
                    }
                };
                sVar3.k0(function07);
                objM17 = function07;
            }
            Function0 function08 = (Function0) objM17;
            Boolean bool = (Boolean) b1Var24.getValue();
            bool.getClass();
            Object objM18 = sVar3.M();
            if (objM18 == obj4) {
                objM18 = new bm.j(b1Var23, 13);
                sVar3.k0(objM18);
            }
            Function0 function09 = (Function0) objM18;
            if (zAreEqual) {
                hp.g gVar = (hp.g) b1VarN7.getValue();
                if (gVar != null) {
                    string = gVar.f22276b;
                    str3 = string;
                }
                str3 = str2;
            } else {
                if (zAreEqual2) {
                    string = context4.getString(com.app.tgtg.R.string.fridge_history_title);
                    str3 = string;
                }
                str3 = str2;
            }
            boolean zBooleanValue3 = zAreEqual ? ((Boolean) b1Var11.getValue()).booleanValue() : false;
            if (zAreEqual) {
                vVar = new i4.v(lv.s.J);
                function02 = function06;
            } else {
                function02 = function06;
                vVar = str2;
            }
            if (cg.q((Collection) b1VarN8.getValue())) {
                sVar3.a0(-1575805631);
                boolean zH9 = sVar3.h(f0Var3);
                Object objM19 = sVar3.M();
                if (zH9 || objM19 == obj4) {
                    i16 = 1;
                    objM19 = new dq.g(f0Var3, i16);
                    sVar3.k0(objM19);
                } else {
                    i16 = 1;
                }
                obj2 = (Function0) objM19;
                z11 = false;
                sVar3.q(false);
            } else {
                i16 = 1;
                z11 = false;
                sVar3.a0(-1575650569);
                sVar3.q(false);
                obj2 = str2;
            }
            boolean z14 = z11;
            ?? r13 = i16;
            lp.r.h(f0Var3, function02, function08, bool, function09, str3, zBooleanValue3, vVar, z13, obj2, sVar3, i21 | 24576);
            ?? r83 = sVar3;
            hp.a aVar = (hp.a) b1Var30.getValue();
            if (aVar == null) {
                r83.a0(-1575539435);
                r83.q(z14);
            } else {
                r83.a0(-1575539434);
                int i24 = ep.o.$EnumSwitchMapping$0[aVar.ordinal()];
                if (i24 == r13) {
                    i17 = com.app.tgtg.R.string.recipe_save_limit_exceeded_error;
                } else {
                    if (i24 != 2) {
                        e40.a.f();
                        return;
                    }
                    i17 = com.app.tgtg.R.string.recipe_rate_limit_exceeded_error;
                }
                int i25 = i17;
                b4.t tVarD = b4.a.d(d2.u.f13938a.a(d2.c.D(d2.c.t(b4.q.f5711a), 0.0f, 0.0f, 0.0f, lv.t.f28255i, 7), b4.d.f5690h), 1.0f);
                boolean zD = r83.d(aVar.ordinal()) | r83.h(d0Var2);
                Object objM20 = r83.M();
                if (zD || objM20 == obj4) {
                    objM20 = new bs.b(29, aVar, d0Var2);
                    r83.k0(objM20);
                }
                cg.j.f(tVarD, true, com.app.tgtg.R.drawable.ic_info_green, i25, 5000L, 8, (Function0) objM20, r83, 1769904, 0);
                r83.q(z14);
            }
            r83.q(r13);
            r82 = r83;
        } else {
            d0Var2 = d0Var;
            m3.s sVar4 = sVar2;
            sVar4.U();
            r82 = sVar4;
        }
        w1 w1VarS = r82.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ap.b(f0Var, str, d0Var2, dVar, function0, i11, 7);
        }
    }

    public static final void f(g9.f0 f0Var, c3 c3Var, Activity activity, ep.d0 d0Var, Context context) {
        g9.z zVar;
        g9.l lVarH = f0Var.f20186b.h();
        String str = (lVarH == null || (zVar = lVarH.f20163b) == null) ? null : zVar.f20258b.f27564f;
        if (Intrinsics.areEqual(str, hp.u.INSTANCE.f22335a)) {
            if (Intrinsics.areEqual(c3Var.getValue(), Boolean.FALSE)) {
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            } else {
                if (g9.p.i(f0Var, hp.o.INSTANCE.f22335a, false) || activity == null) {
                    return;
                }
                activity.finish();
                return;
            }
        }
        if (Intrinsics.areEqual(str, hp.s.INSTANCE.f22335a)) {
            d0Var.p(context);
            if (f0Var.g() || activity == null) {
                return;
            }
            activity.finish();
            return;
        }
        if (Intrinsics.areEqual(str, hp.q.INSTANCE.f22335a)) {
            if (g9.p.i(f0Var, hp.o.INSTANCE.f22335a, false) || activity == null) {
                return;
            }
            activity.finish();
            return;
        }
        if (Intrinsics.areEqual(str, hp.t.INSTANCE.f22335a)) {
            h(f0Var, d0Var);
            if (f0Var.g() || activity == null) {
                return;
            }
            activity.finish();
            return;
        }
        if (str == null) {
            if (activity != null) {
                activity.finish();
            }
        } else {
            if (f0Var.g() || activity == null) {
                return;
            }
            activity.finish();
        }
    }

    public static final void g(ep.d0 d0Var, Function0 function0) {
        a2 a2Var = d0Var.f16250j;
        kotlin.collections.n0 n0Var = kotlin.collections.n0.f26529a;
        a2Var.j(n0Var);
        d0Var.l = n0Var;
        d0Var.f16254o.clear();
        d0Var.f16255p.j(n0Var);
        d0Var.f16252m.j(n0Var);
        d0Var.f16257r = null;
        d0Var.f16258s.j(null);
        d0Var.I = null;
        function0.invoke();
    }

    public static final void h(g9.f0 f0Var, ep.d0 d0Var) {
        g9.z zVar;
        g9.l lVarH = f0Var.f20186b.h();
        if (Intrinsics.areEqual((lVarH == null || (zVar = lVarH.f20163b) == null) ? null : zVar.f20258b.f27564f, hp.t.INSTANCE.f22335a)) {
            hp.g gVar = (hp.g) d0Var.f16259t.f45488a.getValue();
            d0Var.r(cv.i.ACTION_CLOSE_RECIPE, h0.g.E(new Pair(dv.a.TITLE, new dv.c(gVar != null ? gVar.f22276b : null))));
        }
    }

    public static final long i(float f11, float f12) {
        return (((long) Float.floatToRawIntBits(f12)) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
    }

    public static final void j(BasketResponse basketResponse, Function0 function0, m3.n nVar, int i11) {
        Function0 function02;
        b5.h hVar;
        boolean z11;
        b5.h hVar2;
        basketResponse.getClass();
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1291493039);
        int i12 = i11 | (sVar.h(basketResponse) ? 4 : 2) | (sVar.h(function0) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            d2.d dVar = d2.i.f13803c;
            b4.i iVar = b4.d.f5694m;
            d2.y yVarA = d2.w.a(dVar, iVar, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC = b4.a.c(qVar, sVar);
            b5.j.R.getClass();
            b5.h hVar3 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar3);
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
            float f11 = lv.t.f28253g;
            d2.c.f(m2.m(qVar, f11), sVar);
            wi.a.k(lv.s.G, 0.0f, sVar, 6, 2);
            long j9 = lv.s.J;
            i4.r0 r0Var = i4.g0.f23254b;
            b4.t tVarZ = d2.c.z(v1.n.j(qVar, j9, r0Var), f11);
            d2.y yVarA2 = d2.w.a(dVar, iVar, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarZ, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar3);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA2, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC2, gVar4, sVar);
            float f12 = 8;
            b4.t tVarZ2 = d2.c.z(v1.n.j(qVar, lv.s.I, l2.g.b(f12)), f11);
            d2.y yVarA3 = d2.w.a(dVar, iVar, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            b4.t tVarC3 = b4.a.c(tVarZ2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar3);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA3, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            w.a0.y(iHashCode3, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC3, gVar4, sVar);
            b4.t tVarD = m2.d(qVar, 1.0f);
            b4.j jVar = b4.d.f5693k;
            d2.b bVar = d2.i.f13801a;
            i2 i2VarA = h2.a(bVar, jVar, sVar, 48);
            int iHashCode4 = Long.hashCode(sVar.T);
            u3.i iVarL4 = sVar.l();
            b4.t tVarC4 = b4.a.c(tVarD, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar3);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL4, gVar2, sVar);
            w.a0.y(iHashCode4, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC4, gVar4, sVar);
            String strU = o30.f0.U(sVar, com.app.tgtg.R.string.mnu_basket_screen_status_org_value);
            m5.u0 u0Var = lv.v.f28276p;
            long j11 = lv.s.D;
            r9.d(strU, null, j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            float f13 = lv.t.f28251e;
            b4.t tVarM = m2.m(qVar, f13);
            k2 k2Var = k2.f13824a;
            d2.c.f(k2Var.a(1.0f, tVarM, true), sVar);
            r9.d(mv.d.i(basketResponse.getBasketValue(), 1), null, j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            sVar.q(true);
            d2.c.f(m2.m(qVar, f13), sVar);
            b4.t tVarD2 = m2.d(qVar, 1.0f);
            i2 i2VarA2 = h2.a(bVar, jVar, sVar, 48);
            int iHashCode5 = Long.hashCode(sVar.T);
            u3.i iVarL5 = sVar.l();
            b4.t tVarC5 = b4.a.c(tVarD2, sVar);
            sVar.e0();
            if (sVar.S) {
                hVar = hVar3;
                sVar.k(hVar);
            } else {
                hVar = hVar3;
                sVar.n0();
            }
            m3.i.C(i2VarA2, gVar, sVar);
            m3.i.C(iVarL5, gVar2, sVar);
            w.a0.y(iHashCode5, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC5, gVar4, sVar);
            String strU2 = o30.f0.U(sVar, com.app.tgtg.R.string.mnu_basket_screen_status_our_price);
            m5.u0 u0Var2 = lv.v.f28275o;
            long j12 = lv.s.C;
            b5.h hVar4 = hVar;
            r9.d(strU2, null, j12, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            d2.c.f(k2Var.a(1.0f, m2.m(qVar, f13), true), sVar);
            r9.d(mv.d.i(basketResponse.getBasketSubtotalPrice(), 1), null, j12, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            sVar.q(true);
            if (Intrinsics.areEqual(basketResponse.getFreeDelivery(), Boolean.TRUE)) {
                sVar.a0(-239439373);
                b4.t tVarD3 = m2.d(qVar, 1.0f);
                i2 i2VarA3 = h2.a(bVar, jVar, sVar, 48);
                int iHashCode6 = Long.hashCode(sVar.T);
                u3.i iVarL6 = sVar.l();
                b4.t tVarC6 = b4.a.c(tVarD3, sVar);
                sVar.e0();
                if (sVar.S) {
                    hVar2 = hVar4;
                    sVar.k(hVar2);
                } else {
                    hVar2 = hVar4;
                    sVar.n0();
                }
                m3.i.C(i2VarA3, gVar, sVar);
                m3.i.C(iVarL6, gVar2, sVar);
                w.a0.y(iHashCode6, sVar, gVar3, sVar, dVar2);
                m3.i.C(tVarC6, gVar4, sVar);
                b5.h hVar5 = hVar2;
                r9.d(o30.f0.U(sVar, com.app.tgtg.R.string.mnu_basket_screen_status_delivery_fee), null, j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                d2.c.f(k2Var.a(1.0f, m2.m(qVar, f13), true), sVar);
                b4.k kVar = b4.d.f5687e;
                b4.t tVarA = d2.c.A(v1.n.j(f4.g.b(qVar, l2.g.b(f12)), lv.s.f28225f, r0Var), f13, lv.t.f28248b);
                z4.u0 u0VarD = d2.p.d(kVar, false);
                int iHashCode7 = Long.hashCode(sVar.T);
                u3.i iVarL7 = sVar.l();
                b4.t tVarC7 = b4.a.c(tVarA, sVar);
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar5);
                } else {
                    sVar.n0();
                }
                m3.i.C(u0VarD, gVar, sVar);
                m3.i.C(iVarL7, gVar2, sVar);
                w.a0.y(iHashCode7, sVar, gVar3, sVar, dVar2);
                m3.i.C(tVarC7, gVar4, sVar);
                r9.d(o30.f0.U(sVar, com.app.tgtg.R.string.mnu_basket_screen_status_delivery_free), null, j9, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, lv.v.f28277q, sVar, MLKEMEngine.KyberPolyBytes, 12607872, 110586);
                sVar = sVar;
                z11 = true;
                e0.f.D(sVar, true, true, false);
                function02 = function0;
            } else {
                sVar.a0(-237954845);
                i2 i2VarA4 = h2.a(bVar, jVar, sVar, 48);
                int iHashCode8 = Long.hashCode(sVar.T);
                u3.i iVarL8 = sVar.l();
                b4.t tVarC8 = b4.a.c(qVar, sVar);
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar4);
                } else {
                    sVar.n0();
                }
                m3.i.C(i2VarA4, gVar, sVar);
                m3.i.C(iVarL8, gVar2, sVar);
                w.a0.y(iHashCode8, sVar, gVar3, sVar, dVar2);
                m3.i.C(tVarC8, gVar4, sVar);
                r9.d(o30.f0.U(sVar, com.app.tgtg.R.string.mnu_basket_screen_status_fee_info), null, j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                d2.c.f(m2.m(qVar, lv.t.f28249c), sVar);
                function02 = function0;
                g3.i2.a(x0.z(com.app.tgtg.R.drawable.ic_info, sVar, 0), null, b4.a.a(m2.m(qVar, 20), c5.m2.f7291a, new on.l(20, function02)), j12, sVar, 3128, 0);
                sVar = sVar;
                z11 = true;
                sVar.q(true);
                sVar.q(false);
            }
            e0.f.D(sVar, z11, z11, z11);
        } else {
            function02 = function0;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new rk.a0(basketResponse, function02, i11, 16);
        }
    }

    public static final Object[] k(Object[] objArr, int i11, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        kotlin.collections.x.i(0, i11, 6, objArr, objArr2);
        kotlin.collections.x.d(i11 + 2, i11, objArr.length, objArr, objArr2);
        objArr2[i11] = obj;
        objArr2[i11 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] l(int i11, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        kotlin.collections.x.i(0, i11, 6, objArr, objArr2);
        kotlin.collections.x.d(i11, i11 + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] m(int i11, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        kotlin.collections.x.i(0, i11, 6, objArr, objArr2);
        kotlin.collections.x.d(i11, i11 + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static IOException n(File file, IOException iOException) {
        StringBuilder sb2 = new StringBuilder("Inoperable file:");
        try {
            sb2.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb2.append(" failed to attach additional metadata");
        }
        return new IOException(sb2.toString(), iOException);
    }

    public static IOException o(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        return parentFile == null ? n(file, iOException) : parentFile.exists() ? parentFile.isFile() ? parentFile.canRead() ? parentFile.canWrite() ? n(file, iOException) : n(file, iOException) : parentFile.canWrite() ? n(file, iOException) : n(file, iOException) : parentFile.canRead() ? parentFile.canWrite() ? n(file, iOException) : n(file, iOException) : parentFile.canWrite() ? n(file, iOException) : n(file, iOException) : n(file, iOException);
    }

    public static s0.o1 p(Context context, Bundle bundle) {
        boolean z11 = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] strArrA = A(context, "androidx.camera.core.quirks.FORCE_ENABLED", bundle);
        String[] strArrA2 = A(context, "androidx.camera.core.quirks.FORCE_DISABLED", bundle);
        wd.a.p("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
        wd.a.p("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = " + z11);
        wd.a.p("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(strArrA));
        wd.a.p("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(strArrA2));
        return new s0.o1(z11, new HashSet(D(strArrA)), new HashSet(D(strArrA2)));
    }

    public static final void q(View view) {
        view.getClass();
        o80.j jVarA = o80.l.a(new h7.b1(view, null));
        while (jVarA.hasNext()) {
            ArrayList arrayList = y((View) jVarA.next()).f44024a;
            for (int iG = kotlin.collections.d0.g(arrayList); -1 < iG; iG--) {
                ((c5.m3) arrayList.get(iG)).f7292a.d();
            }
        }
    }

    public static u30.b r(String str, String str2) {
        a50.a aVar = new a50.a(str, str2);
        u30.a aVarA = u30.b.a(a50.a.class);
        aVarA.f40667e = 1;
        aVarA.f40668f = new mp.a(aVar, 15);
        return aVarA.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r0 > 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r4 > 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r4 < 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int s(int r4, int r5) {
        /*
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            r0.getClass()
            if (r5 == 0) goto L4b
            int r1 = r4 / r5
            int r2 = r5 * r1
            int r2 = r4 - r2
            if (r2 != 0) goto L10
            goto L43
        L10:
            r4 = r4 ^ r5
            int r4 = r4 >> 31
            r4 = r4 | 1
            int[] r3 = n30.a.f30495a
            int r0 = r0.ordinal()
            r0 = r3[r0]
            switch(r0) {
                case 1: goto L41;
                case 2: goto L43;
                case 3: goto L3d;
                case 4: goto L3f;
                case 5: goto L3a;
                case 6: goto L26;
                case 7: goto L26;
                case 8: goto L26;
                default: goto L20;
            }
        L20:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L26:
            int r0 = java.lang.Math.abs(r2)
            int r5 = java.lang.Math.abs(r5)
            int r5 = r5 - r0
            int r0 = r0 - r5
            if (r0 != 0) goto L37
            java.math.RoundingMode r4 = java.math.RoundingMode.HALF_UP
            java.math.RoundingMode r4 = java.math.RoundingMode.HALF_EVEN
            goto L43
        L37:
            if (r0 <= 0) goto L43
            goto L3f
        L3a:
            if (r4 <= 0) goto L43
            goto L3f
        L3d:
            if (r4 >= 0) goto L43
        L3f:
            int r1 = r1 + r4
            return r1
        L41:
            if (r2 != 0) goto L44
        L43:
            return r1
        L44:
            java.lang.String r4 = "mode was UNNECESSARY, but rounding was necessary"
            j4.d.f(r4)
        L49:
            r4 = 0
            return r4
        L4b:
            java.lang.String r4 = "/ by zero"
            j4.d.f(r4)
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: o00.h0.s(int, int):int");
    }

    public static u30.b t(String str, org.bouncycastle.jce.provider.a aVar) {
        u30.a aVarA = u30.b.a(a50.a.class);
        aVarA.f40667e = 1;
        aVarA.a(u30.i.a(Context.class));
        aVarA.f40668f = new a50.d(0, str, aVar);
        return aVarA.b();
    }

    public static Object u(Context context) {
        ComponentCallbacks2 componentCallbacks2T = u00.d.t(context.getApplicationContext());
        boolean z11 = componentCallbacks2T instanceof r70.b;
        Class<?> cls = componentCallbacks2T.getClass();
        if (z11) {
            return ((r70.b) componentCallbacks2T).a();
        }
        i4.a.f(w.a0.k(cls, "Hilt BroadcastReceiver must be attached to an @HiltAndroidApp Application. Found: "));
        return null;
    }

    public static final long v(long j9) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j9 & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static fx.c w(JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        String string = jSONObject.getString("event_name");
        String string2 = jSONObject.getString("method");
        string2.getClass();
        Locale locale = Locale.ENGLISH;
        locale.getClass();
        String upperCase = string2.toUpperCase(locale);
        upperCase.getClass();
        fx.b bVarValueOf = fx.b.valueOf(upperCase);
        String string3 = jSONObject.getString("event_type");
        string3.getClass();
        String upperCase2 = string3.toUpperCase(locale);
        upperCase2.getClass();
        fx.a aVarValueOf = fx.a.valueOf(upperCase2);
        String string4 = jSONObject.getString("app_version");
        JSONArray jSONArray = jSONObject.getJSONArray("path");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
            jSONObject2.getClass();
            arrayList.add(new fx.f(jSONObject2));
        }
        String strOptString = jSONObject.optString("path_type", "absolute");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("parameters");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            int length2 = jSONArrayOptJSONArray.length();
            for (int i12 = 0; i12 < length2; i12++) {
                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i12);
                jSONObject3.getClass();
                arrayList2.add(new fx.d(jSONObject3));
            }
        }
        String strOptString2 = jSONObject.optString("component_id");
        String strOptString3 = jSONObject.optString("activity_name");
        string.getClass();
        string4.getClass();
        strOptString2.getClass();
        strOptString.getClass();
        strOptString3.getClass();
        return new fx.c(string, bVarValueOf, aVarValueOf, string4, arrayList, arrayList2, strOptString2, strOptString, strOptString3);
    }

    public static final Object x(h8.a aVar, h8.e eVar, Serializable serializable) {
        aVar.getClass();
        eVar.getClass();
        Object objB = aVar.b(eVar);
        return objB == null ? serializable : objB;
    }

    public static final x7.a y(View view) {
        x7.a aVar = (x7.a) view.getTag(com.app.tgtg.R.id.pooling_container_listener_holder_tag);
        if (aVar != null) {
            return aVar;
        }
        x7.a aVar2 = new x7.a();
        view.setTag(com.app.tgtg.R.id.pooling_container_listener_holder_tag, aVar2);
        return aVar2;
    }

    public static final int z(int i11, int i12) {
        return (i11 >> i12) & 31;
    }
}
