package w0;

import a3.t0;
import a3.u1;
import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import b4.q;
import b4.t;
import bg.a1;
import c5.d2;
import cn.x;
import co.u;
import com.adyen.checkout.components.core.Address;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import com.app.tgtg.model.remote.user.response.C2CReferralResponse;
import com.app.tgtg.model.remote.user.response.C2CRewardDetails;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.p;
import g3.a2;
import g3.d5;
import g3.ga;
import g3.r9;
import g3.x5;
import g3.y7;
import g9.j;
import i4.g0;
import i4.r0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.LongCompanionObject;
import lv.v;
import m2.h0;
import m3.b1;
import m3.c3;
import m3.h1;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import m5.h;
import m5.i;
import m5.o;
import m90.z0;
import mv.p0;
import o00.x0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import p4.z;
import q9.g;
import s0.b0;
import s1.y;
import s1.y0;
import w.a0;
import x5.k;
import y80.r;
import y9.i0;
import z4.c0;
import z4.l;
import z4.u0;
import zendesk.messaging.android.internal.conversationscreen.TimeConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile c f42812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static p4.f f42813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f42814c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f42815d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f42816e = 0;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static jg.c A(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case 2099:
                    if (str.equals("AT")) {
                        return jg.c.AT;
                    }
                    break;
                case 2115:
                    if (str.equals("BE")) {
                        return jg.c.BE;
                    }
                    break;
                case 2177:
                    if (str.equals("DE")) {
                        return jg.c.DE;
                    }
                    break;
                case 2183:
                    if (str.equals("DK")) {
                        return jg.c.DK;
                    }
                    break;
                case 2222:
                    if (str.equals("ES")) {
                        return jg.c.ES;
                    }
                    break;
                case 2252:
                    if (str.equals("FR")) {
                        return jg.c.FR;
                    }
                    break;
                case 2267:
                    if (str.equals("GB")) {
                        return jg.c.GB;
                    }
                    break;
                case 2347:
                    if (str.equals("IT")) {
                        return jg.c.IT;
                    }
                    break;
                case 2494:
                    if (str.equals("NL")) {
                        return jg.c.NL;
                    }
                    break;
                case 2556:
                    if (str.equals("PL")) {
                        return jg.c.PL;
                    }
                    break;
                case 2564:
                    if (str.equals("PT")) {
                        return jg.c.PT;
                    }
                    break;
                case 2718:
                    if (str.equals("US")) {
                        return jg.c.US;
                    }
                    break;
            }
        }
        return jg.c.DEFAULT;
    }

    public static final boolean B(h hVar) {
        int length = hVar.f29538b.length();
        List list = hVar.f29537a;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                m5.f fVar = (m5.f) list.get(i11);
                if ((fVar.f29529a instanceof o) && i.b(0, length, fVar.f29530b, fVar.f29531c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean C(int i11) {
        return i11 != 0 && x6.c.b(i11) > 0.5d;
    }

    public static final void D(String str) {
        str.getClass();
        throw new IllegalArgumentException(a0.p("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static int E(int i11, float f11, int i12) {
        return x6.c.c(x6.c.e(i12, Math.round(Color.alpha(i12) * f11)), i11);
    }

    public static final ArrayList F(Map map, Function1 function1) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            j jVar = (j) entry.getValue();
            Boolean boolValueOf = jVar != null ? Boolean.valueOf(jVar.f20150b) : null;
            boolValueOf.getClass();
            if (!boolValueOf.booleanValue() && !jVar.f20151c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) function1.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final ArrayList G(List list, List list2, n nVar, int i11) {
        List list3;
        ArrayList arrayList;
        s sVar = (s) nVar;
        Object objM = sVar.M();
        m3.f fVar = m.f29332a;
        if (objM == fVar) {
            objM = new LinkedHashSet();
            sVar.k0(objM);
        }
        Set set = (Set) objM;
        Object objM2 = sVar.M();
        if (objM2 == fVar) {
            objM2 = new LinkedHashSet();
            sVar.k0(objM2);
        }
        Set set2 = (Set) objM2;
        sVar.a0(110758886);
        if (list instanceof RandomAccess) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            int i12 = 0;
            while (i12 < size) {
                List list4 = list2;
                arrayList.add(s((n9.e) list.get(i12), list4, set, set2, sVar, i11 & 112));
                i12++;
                list2 = list4;
            }
            list3 = list2;
        } else {
            list3 = list2;
            arrayList = new ArrayList(e0.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(s((n9.e) it.next(), list3, set, set2, sVar, i11 & 112));
            }
        }
        ArrayList arrayList2 = arrayList;
        sVar.q(false);
        g(arrayList2, list3, set, set2, sVar, i11 & 112);
        return arrayList2;
    }

    public static final void a(t tVar, List list, Date date, int i11, Function1 function1, n nVar, int i12) {
        t tVar2;
        float f11;
        t tVar3;
        boolean z11;
        date.getClass();
        s sVar = (s) nVar;
        sVar.c0(1722556666);
        int i13 = i12 | (sVar.h(list) ? 32 : 16) | (sVar.h(date) ? 256 : 128) | (sVar.d(i11) ? NewHope.SENDB_BYTES : 1024) | (sVar.h(function1) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar.R(i13 & 1, (i13 & 9363) != 9362)) {
            tVar2 = tVar;
            float f12 = 1.0f;
            float f13 = 8;
            t tVarB = d2.c.B(m2.d(m2.t(tVar2, 3), 1.0f), f13, 0.0f, 2);
            i2 i2VarA = h2.a(d2.i.g(f13), b4.d.f5692j, sVar, 6);
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
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            sVar.a0(-410801642);
            int i14 = 0;
            for (Object obj : list) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    d0.n();
                    throw null;
                }
                Date date2 = (Date) obj;
                if (f12 <= 0.0d) {
                    e2.a.a("invalid weight; must be greater than zero");
                }
                n1 n1Var = new n1(f12, true);
                boolean zD = ((57344 & i13) == 16384) | sVar.d(i14);
                Object objM = sVar.M();
                if (zD || objM == m.f29332a) {
                    objM = new lp.s(i14, 2, function1);
                    sVar.k0(objM);
                }
                t tVarJ = d2.j(androidx.compose.foundation.b.c(n1Var, false, null, null, (Function0) objM, 15), "CharityPlanDay");
                boolean z12 = p0.z(date, date2);
                if (i14 == i11) {
                    f11 = f12;
                    tVar3 = tVarJ;
                    z11 = true;
                } else {
                    f11 = f12;
                    tVar3 = tVarJ;
                    z11 = false;
                }
                w.b.c(tVar3, date2, z12, z11, sVar, 0);
                f12 = f11;
                i14 = i15;
            }
            sVar.q(false);
            sVar.q(true);
        } else {
            tVar2 = tVar;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new t0(tVar2, list, date, i11, function1, i12);
        }
    }

    public static final void b(sm.b bVar, t tVar, Function0 function0, n nVar, int i11, int i12) {
        t tVar2;
        int i13;
        t tVar3;
        int i14;
        bVar.getClass();
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(-492629840);
        int i15 = i11 | (sVar.d(bVar.ordinal()) ? 4 : 2);
        int i16 = i12 & 2;
        if (i16 != 0) {
            i13 = i15 | 48;
            tVar2 = tVar;
        } else {
            tVar2 = tVar;
            i13 = i15 | (sVar.f(tVar2) ? 32 : 16);
        }
        int i17 = i13 | (sVar.h(function0) ? 256 : 128);
        if (sVar.R(i17 & 1, (i17 & 147) != 146)) {
            tVar3 = i16 != 0 ? q.f5711a : tVar2;
            int i18 = sm.a.$EnumSwitchMapping$0[bVar.ordinal()];
            if (i18 == 1) {
                i14 = R.drawable.current_location_button_default;
            } else {
                if (i18 != 2) {
                    e40.a.f();
                    return;
                }
                i14 = R.drawable.current_location_button_active;
            }
            n4.b bVarZ = x0.z(i14, sVar, 0);
            t tVarB = f4.g.b(tVar3, l2.g.a(60));
            boolean z11 = (i17 & 896) == 256;
            Object objM = sVar.M();
            if (z11 || objM == m.f29332a) {
                objM = new rr.a(10, function0);
                sVar.k0(objM);
            }
            v1.n.d(bVarZ, null, androidx.compose.foundation.b.c(tVarB, false, null, null, (Function0) objM, 15), null, null, 0.0f, null, sVar, 56, 120);
        } else {
            sVar.U();
            tVar3 = tVar2;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.a(bVar, tVar3, function0, i11, i12, 18);
        }
    }

    public static final void c(oq.s sVar, jd.f fVar, n nVar, int i11) {
        fVar.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(1834423802);
        int i12 = (sVar2.f(sVar) ? 4 : 2) | i11 | (sVar2.f(fVar) ? 32 : 16);
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            d5 d5VarC = ga.c(sVar2);
            C2CReferralResponse c2CReferralResponse = sVar.f32952a;
            C2CRewardDetails c2cReferralRewardDetails = c2CReferralResponse.getC2cReferralRewardDetails();
            x5.a(v4.f.a(m2.f13850c, d5VarC.f18456c, null), u3.e.e(-649615426, sVar2, new tq.a(fVar, 3, (byte) 0)), null, null, null, 0, 0L, 0L, null, u3.e.e(-2023019959, sVar2, new x(mv.d.i(c2cReferralRewardDetails != null ? c2cReferralRewardDetails.getC2cReferralRewardPrice() : null, 1), sVar, fVar, c2CReferralResponse)), sVar2, 805306416, 508);
        } else {
            sVar2.U();
        }
        w1 w1VarS = sVar2.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new rk.a0(sVar, fVar, i11, 11);
        }
    }

    public static final void d(r9.d dVar, boolean z11, Function0 function0, Function0 function02, n nVar, int i11) {
        Function0 function03;
        s sVar = (s) nVar;
        sVar.c0(1220469155);
        int i12 = i11 | (sVar.f(dVar) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | MLKEMEngine.KyberPolyBytes | (sVar.h(function02) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            Object objM = sVar.M();
            m3.f fVar = m.f29332a;
            if (objM == fVar) {
                objM = new qw.c(20);
                sVar.k0(objM);
            }
            Function0 function04 = (Function0) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new qw.c(21);
                sVar.k0(objM2);
            }
            Function0 function05 = (Function0) objM2;
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = new qw.c(22);
                sVar.k0(objM3);
            }
            int i13 = (i12 & 14) | 3504;
            int i14 = i12 << 9;
            e(dVar, false, function05, (Function0) objM3, z11, function04, function02, sVar, i13 | (57344 & i14) | 196608 | (i14 & 3670016));
            function03 = function04;
        } else {
            sVar.U();
            function03 = function0;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.c((Object) dVar, z11, function03, (Object) function02, i11, 8);
        }
    }

    public static final void e(final r9.d dVar, final boolean z11, final Function0 function0, final Function0 function02, final boolean z12, final Function0 function03, final Function0 function04, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(898330592);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(dVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.g(z12) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.h(function03) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.h(function04) ? 1048576 : 524288;
        }
        if (sVar.R(i12 & 1, (599187 & i12) != 599186)) {
            q9.d dVarA = r9.b.a(sVar);
            if (dVarA == null) {
                com.braze.h2.b("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
                return;
            }
            q9.c navigationEventDispatcher = dVarA.getNavigationEventDispatcher();
            int i13 = i12 & 14;
            boolean z13 = i13 == 4;
            Object objM = sVar.M();
            m3.f fVar = m.f29332a;
            if (z13 || objM == fVar) {
                objM = new r9.a((q9.g) dVar.f37801c.getValue(), new z0(dVar, 21));
                sVar.k0(objM);
            }
            final r9.a aVar = (r9.a) objM;
            boolean zH = ((i12 & 3670016) == 1048576) | ((57344 & i12) == 16384) | sVar.h(aVar) | ((458752 & i12) == 131072) | (i13 == 4);
            Object objM2 = sVar.M();
            if (zH || objM2 == fVar) {
                Function0 function05 = new Function0() { // from class: r9.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        q9.i iVar;
                        q9.i iVar2;
                        a aVar2 = aVar;
                        boolean z14 = aVar2.f36374f;
                        boolean z15 = z11;
                        if (z14 != z15) {
                            aVar2.f36374f = z15;
                            q9.c cVar = aVar2.f36375g;
                            if (cVar != null && (iVar2 = cVar.f36366b) != null) {
                                iVar2.b();
                            }
                        }
                        aVar2.f37787i = function0;
                        aVar2.f37788j = function02;
                        aVar2.g(z12);
                        aVar2.f37789k = function03;
                        aVar2.l = function04;
                        d dVar2 = dVar;
                        g gVar = (g) dVar2.f37801c.getValue();
                        List list = (List) dVar2.f37800b.getValue();
                        List list2 = (List) dVar2.f37802d.getValue();
                        gVar.getClass();
                        list.getClass();
                        list2.getClass();
                        aVar2.f36369a = gVar;
                        aVar2.f36370b = list;
                        aVar2.f36371c = list2;
                        q9.c cVar2 = aVar2.f36375g;
                        if (cVar2 != null && (iVar = cVar2.f36366b) != null) {
                            iVar.d(aVar2);
                        }
                        return Unit.f26487a;
                    }
                };
                sVar.k0(function05);
                objM2 = function05;
            }
            m3.i.j((Function0) objM2, sVar);
            boolean zH2 = sVar.h(aVar) | (i13 == 4) | sVar.h(navigationEventDispatcher);
            Object objM3 = sVar.M();
            if (zH2 || objM3 == fVar) {
                objM3 = new h0(dVar, aVar, navigationEventDispatcher, 10);
                sVar.k0(objM3);
            }
            m3.i.d(dVar, (Function1) objM3, sVar);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new y7(dVar, z11, function0, function02, z12, function03, function04, i11);
        }
    }

    public static final void f(DiscoverBucket discoverBucket, String str, Function1 function1, n nVar, int i11) {
        int i12;
        s sVar;
        str.getClass();
        function1.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(-1056163137);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.h(discoverBucket) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.f(str) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar2.h(function1) ? 256 : 128;
        }
        if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
            q qVar = q.f5711a;
            t tVarD = m2.d(qVar, 1.0f);
            u0 u0VarD = p.d(b4.d.f5687e, false);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            t tVarC = b4.a.c(tVarD, sVar2);
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
            t tVarE = m2.e(m2.d(qVar, 1.0f), 1);
            long j9 = lv.s.f28217b;
            r0 r0Var = g0.f23254b;
            p.a(v1.n.j(tVarE, j9, r0Var), sVar2, 6);
            v1.n.d(x0.z(R.drawable.gfx_instagram_icon, sVar2, 0), null, m2.e(v1.n.j(qVar, lv.s.J, r0Var), 40), null, l.f47167b, 0.0f, null, sVar2, 25016, 104);
            sVar2.q(true);
            d2.c.f(m2.e(qVar, lv.t.f28253g), sVar2);
            String socialTitle = discoverBucket != null ? discoverBucket.getSocialTitle() : null;
            if (socialTitle == null) {
                socialTitle = b3.i.j(-1360466021, R.string.discover_not_live_here_insta_header, sVar2, sVar2, false);
            } else {
                sVar2.a0(-1360467106);
                sVar2.q(false);
            }
            m5.u0 u0Var = v.l;
            long j11 = lv.s.C;
            boolean z11 = true;
            r9.d(socialTitle, m2.d(qVar, 1.0f), j11, 0L, null, 0L, null, new k(3), 0L, 0, false, 0, 0, null, u0Var, sVar2, 432, 12582912, 130040);
            d2.c.f(m2.e(qVar, lv.t.f28251e), sVar2);
            String socialDescription = discoverBucket != null ? discoverBucket.getSocialDescription() : null;
            if (socialDescription == null) {
                socialDescription = b3.i.j(-1360454880, R.string.discover_not_live_here_insta_description, sVar2, sVar2, false);
            } else {
                sVar2.a0(-1360456151);
                sVar2.q(false);
            }
            r9.d(socialDescription, m2.d(qVar, 1.0f), j11, 0L, null, 0L, null, new k(3), 0L, 0, false, 0, 0, null, v.f28274n, sVar2, 432, 12582912, 130040);
            d2.c.f(m2.e(qVar, lv.t.f28254h), sVar2);
            t tVarD2 = m2.d(qVar, 1.0f);
            String socialButton = discoverBucket != null ? discoverBucket.getSocialButton() : null;
            if (socialButton == null) {
                socialButton = b3.i.j(-1360441733, R.string.discover_not_live_here_insta_button, sVar2, sVar2, false);
            } else {
                sVar2.a0(-1360442849);
                sVar2.q(false);
            }
            String str2 = socialButton;
            lv.e eVar = lv.e.LARGE;
            lv.q qVar2 = lv.q.REGULAR;
            boolean z12 = (i12 & 896) == 256;
            if ((i12 & 112) != 32) {
                z11 = false;
            }
            boolean z13 = z12 | z11;
            Object objM = sVar2.M();
            if (z13 || objM == m.f29332a) {
                objM = new iq.e(function1, str, 0);
                sVar2.k0(objM);
            }
            sVar = sVar2;
            v0.n.l(tVarD2, str2, null, qVar2, eVar, false, false, null, null, (Function0) objM, sVar, 27654, 484);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.a(discoverBucket, str, function1, i11, 11);
        }
    }

    public static final void g(ArrayList arrayList, List list, Set set, Set set2, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-720826424);
        int i12 = (i11 & 6) == 0 ? (sVar.h(arrayList) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(list) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(set) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(set2) ? NewHope.SENDB_BYTES : 1024;
        }
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            b1 b1VarB = m3.i.B(arrayList, sVar);
            b1 b1VarB2 = m3.i.B(list, sVar);
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                Object obj = ((n9.e) arrayList.get(i13)).f30742b;
                set.add(obj);
                List listR0 = CollectionsKt.r0(arrayList);
                boolean zF = sVar.f(b1VarB) | sVar.h(obj) | sVar.h(set) | sVar.h(set2) | sVar.f(b1VarB2);
                Object objM = sVar.M();
                if (zF || objM == m.f29332a) {
                    a1 a1Var = new a1(obj, set, set2, b1VarB, b1VarB2, 6);
                    sVar.k0(a1Var);
                    objM = a1Var;
                }
                m3.i.c(obj, listR0, (Function1) objM, sVar);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new t0(arrayList, list, i11, set, set2, 14);
        }
    }

    public static final void h(int i11, Function0 function0, n nVar, int i12) {
        s sVar = (s) nVar;
        sVar.c0(1908740917);
        int i13 = (sVar.d(i11) ? 4 : 2) | i12 | (sVar.h(function0) ? 32 : 16);
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            t tVarZ = d2.c.z(m2.d(q.f5711a, 1.0f), 16);
            boolean z11 = (i13 & 112) == 32;
            Object objM = sVar.M();
            if (z11 || objM == m.f29332a) {
                objM = new ki.a(6, function0);
                sVar.k0(objM);
            }
            t tVarC = androidx.compose.foundation.b.c(tVarZ, false, null, null, (Function0) objM, 15);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC2 = b4.a.c(tVarC, sVar);
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
            m5.u0 u0Var = v.f28274n;
            long j9 = lv.s.C;
            String strU = f0.U(sVar, i11);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            r9.d(strU, new n1(1.0f, true), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            sVar = sVar;
            v1.n.d(x0.z(R.drawable.system_icon_chevron_right_primary_30, sVar, 0), null, null, b4.d.f5688f, null, 0.0f, new i4.o(lv.s.E, 5), sVar, 1575992, 52);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a2(i11, function0, i12, 2);
        }
    }

    public static final void i(ek.q qVar, n nVar, int i11) {
        qVar.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1336287935);
        int i12 = (sVar.h(qVar) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            hk.c cVarB = qVar.b();
            if (cVarB == null) {
                sVar.a0(698109337);
                sVar.q(false);
            } else {
                sVar.a0(698109338);
                d2.g0 g0Var = m2.f13850c;
                long j9 = lv.s.J;
                x5.a(v1.n.j(g0Var, j9, g0.f23254b), null, null, null, null, 0, j9, 0L, null, u3.e.e(1708924678, sVar, new u1(22, cVarB, qVar)), sVar, 806879238, 446);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new jk.c(qVar, i11, 1);
        }
    }

    public static final void j(int i11, co.q qVar, co.c cVar, boolean z11, Function0 function0, n nVar, int i12) {
        int i13;
        t tVar;
        float f11;
        qVar.getClass();
        cVar.getClass();
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(-690926991);
        if ((i12 & 6) == 0) {
            i13 = (sVar.d(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar.d(qVar.ordinal()) ? 32 : 16;
        }
        if ((i12 & MLKEMEngine.KyberPolyBytes) == 0) {
            i13 |= sVar.d(cVar.ordinal()) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= sVar.g(z11) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= sVar.h(function0) ? 16384 : 8192;
        }
        if (sVar.R(i13 & 1, (i13 & 9363) != 9362)) {
            co.q qVar2 = co.q.MINIMISED;
            c3 c3VarA = t1.d.a(qVar == qVar2 ? 56 : 72, t1.c.k(200, 0, null, 6), "size", sVar, 432, 8);
            Object objM = sVar.M();
            m3.f fVar = m.f29332a;
            if (objM == fVar) {
                objM = a0.s(0, sVar);
            }
            h1 h1Var = (h1) objM;
            q qVar3 = q.f5711a;
            if (qVar != qVar2) {
                sVar.a0(-1922244020);
                boolean z12 = (i13 & 57344) == 16384;
                Object objM2 = sVar.M();
                if (z12 || objM2 == fVar) {
                    objM2 = new ar.d(14, function0);
                    sVar.k0(objM2);
                }
                t tVarC = androidx.compose.foundation.b.c(qVar3, false, null, null, (Function0) objM2, 15);
                sVar.q(false);
                tVar = tVarC;
            } else {
                sVar.a0(-1922171015);
                sVar.q(false);
                tVar = qVar3;
            }
            l2.f fVar2 = l2.g.f26790a;
            t tVarJ = v1.n.j(m2.m(d2.c.z(f4.g.b(v1.n.k(f4.g.k(tVar, 10, fVar2, false, 0L, 0L, 28), 2, lv.s.J, fVar2), fVar2), 1), ((z5.f) c3VarA.getValue()).f47277a), lv.s.C, g0.f23254b);
            u0 u0VarD = p.d(b4.d.f5687e, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC2 = b4.a.c(tVarJ, sVar);
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
            m3.i.C(tVarC2, b5.i.f5841d, sVar);
            v1.n.d(x0.z(R.drawable.icon_unread_msg, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
            sVar.q(true);
            if (cVar == co.c.START) {
                sVar.a0(-1921486163);
                sVar.q(false);
                f11 = lv.t.f28258m;
            } else {
                sVar.a0(-1921443569);
                f11 = (-d70.a.e(sVar, h1Var.h())) - lv.t.f28251e;
                sVar.q(false);
            }
            boolean z13 = !z11 && qVar == co.q.MAXIMISED;
            s1.x0 x0VarD = s1.r0.d(t1.c.k(300, 0, null, 6), 2);
            y0 y0VarE = s1.r0.e(t1.c.k(300, 0, null, 6), 2);
            t tVarW = d2.c.w(qVar3, f11, 0.0f, 2);
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = new co.t(h1Var, 3);
                sVar.k0(objM3);
            }
            y.d(z13, c0.q(tVarW, (Function1) objM3), x0VarD, y0VarE, null, u3.e.e(-1555140791, sVar, new cg.t(i11, 2)), sVar, 200064, 16);
            sVar = sVar;
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new u(i11, qVar, cVar, z11, function0, i12, 1);
        }
    }

    public static long k(boolean z11, int i11, ib.a aVar, long j9, long j11, int i12, boolean z12, long j12, long j13, long j14, long j15) {
        aVar.getClass();
        if (j15 != LongCompanionObject.MAX_VALUE && z12) {
            if (i12 != 0) {
                long j16 = j11 + TimeConstants.FIFTEEN_MINUTES_DIFFERENCE;
                if (j15 < j16) {
                    return j16;
                }
            }
            return j15;
        }
        if (z11) {
            long jScalb = aVar == ib.a.LINEAR ? j9 * ((long) i11) : (long) Math.scalb(j9, i11 - 1);
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j11 + jScalb;
        }
        if (!z12) {
            return j11 == -1 ? LongCompanionObject.MAX_VALUE : j11 + j12;
        }
        long j17 = i12 == 0 ? j11 + j12 : j11 + j14;
        return (j13 == j14 || i12 != 0) ? j17 : (j14 - j13) + j17;
    }

    public static int m(int i11, int i12) {
        return x6.c.e(i11, (Color.alpha(i11) * i12) / 255);
    }

    public static final m0.p n(String str, String str2, s0.k kVar) {
        str.getClass();
        ArrayList arrayListJ = d0.j(str);
        if (str2 != null) {
            arrayListJ.add(str2);
        }
        return new m0.p(arrayListJ, kVar);
    }

    public static final h8.a o() {
        return new h8.a(true);
    }

    public static final aa.n p(y9.v vVar, boolean z11, String[] strArr, Function1 function1) {
        y9.k kVarG = vVar.g();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        kVarG.getClass();
        y9.p0 p0Var = kVarG.f45683b;
        Pair pairG = p0Var.g(strArr2);
        String[] strArr3 = (String[]) pairG.f26485a;
        int[] iArr = (int[]) pairG.f26486b;
        strArr3.getClass();
        iArr.getClass();
        return new aa.n(r.e(new at.o(new i0(p0Var, iArr, strArr3, null)), -1), vVar, z11, function1);
    }

    public static final long q(i2.e0 e0Var) {
        return j80.c.c(e0Var.m() * e0Var.q()) + (((long) e0Var.l()) * ((long) e0Var.q()));
    }

    public static void r(Object obj, String str, String str2) {
        String strConcat = "TRuntime.".concat(str);
        if (Log.isLoggable(strConcat, 3)) {
            Log.d(strConcat, String.format(str2, obj));
        }
    }

    public static final n9.e s(n9.e eVar, List list, Set set, Set set2, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.a0(-1239021605);
        b1 b1VarB = m3.i.B(list, sVar);
        Object obj = eVar.f30742b;
        sVar.Y(-993800456, obj);
        n9.e eVar2 = new n9.e(eVar, u3.e.e(-1349345695, sVar, new co.e(set2, obj, set, b1VarB, list, eVar, 2)));
        sVar.q(false);
        sVar.q(false);
        return eVar2;
    }

    public static void u(String str, String str2, Exception exc) {
        String strConcat = "TRuntime.".concat(str);
        if (Log.isLoggable(strConcat, 6)) {
            Log.e(strConcat, str2, exc);
        }
    }

    public static final m0.p v(s0.c cVar, s0.c cVar2) {
        String strD = cVar2 != null ? cVar2.f38278a.d() : null;
        s0.k kVar = ((b0) cVar.f38305c).f38284a;
        kVar.getClass();
        String strD2 = cVar.f38278a.d();
        strD2.getClass();
        return n(strD2, strD, kVar);
    }

    public static final String w(z4.t0 t0Var) {
        String string;
        Object objJ = c0.j(t0Var);
        if (objJ == null) {
            t0Var.G();
            objJ = null;
        }
        return (objJ == null || (string = objJ.toString()) == null) ? Address.ADDRESS_NULL_PLACEHOLDER : string;
    }

    public static final p4.f x() {
        p4.f fVar = f42813b;
        if (fVar != null) {
            return fVar;
        }
        p4.e eVar = new p4.e("AutoMirrored.Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        n0 n0Var = p4.h0.f34349a;
        i4.x0 x0Var = new i4.x0(i4.v.f23309b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new p4.n(20.0f, 11.0f));
        arrayList.add(new p4.l(7.83f));
        arrayList.add(new p4.u(5.59f, -5.59f));
        arrayList.add(new p4.m(12.0f, 4.0f));
        arrayList.add(new p4.u(-8.0f, 8.0f));
        arrayList.add(new p4.u(8.0f, 8.0f));
        arrayList.add(new p4.u(1.41f, -1.41f));
        arrayList.add(new p4.m(7.83f, 13.0f));
        arrayList.add(new p4.l(20.0f));
        arrayList.add(new z(-2.0f));
        arrayList.add(p4.j.f34357c);
        p4.e.a(eVar, arrayList, x0Var);
        p4.f fVarB = eVar.b();
        f42813b = fVarB;
        return fVarB;
    }

    public static int y(int i11, View view) {
        Context context = view.getContext();
        TypedValue typedValueI = ex.i.I(view.getContext(), view.getClass().getCanonicalName(), i11);
        int i12 = typedValueI.resourceId;
        return i12 != 0 ? context.getColor(i12) : typedValueI.data;
    }

    public static int z(Context context, int i11, int i12) {
        Integer numValueOf;
        TypedValue typedValueF = ex.i.F(context, i11);
        if (typedValueF != null) {
            int i13 = typedValueF.resourceId;
            numValueOf = Integer.valueOf(i13 != 0 ? context.getColor(i13) : typedValueF.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i12;
    }

    public abstract void l(o30.d0 d0Var, Set set);

    public abstract int t(o30.d0 d0Var);
}
