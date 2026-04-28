package wd;

import aa.l0;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.ViewModelStore;
import b4.d;
import b4.q;
import b5.h;
import b5.j;
import b5.s1;
import bn.p;
import c4.f;
import cg.u;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import com.app.tgtg.model.remote.mapService.response.FilterCategory;
import com.app.tgtg.model.remote.user.response.C2CReferralResponse;
import d2.c;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.y;
import f70.i;
import g3.d5;
import g3.ga;
import g3.r9;
import g3.x5;
import g3.y0;
import h8.e;
import i4.v0;
import j5.m;
import j5.t;
import j5.w;
import j5.x;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Pair;
import kotlin.collections.g1;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import lv.v;
import m3.s;
import m3.w1;
import m5.u0;
import mv.p0;
import n90.c0;
import n90.n;
import n90.o;
import o00.x0;
import o30.e0;
import o30.g0;
import o30.j0;
import oo.z;
import oq.r;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.json.JSONException;
import org.json.JSONObject;
import v80.f0;
import w.a0;
import z4.l;
import z5.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f43384a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f43385b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f43386c = 0;

    public static final boolean A(i iVar) {
        iVar.getClass();
        return iVar == i.DEEP_LINK || iVar == i.WIDGET;
    }

    public static boolean B(int i11, String str) {
        return f43385b <= i11 || Log.isLoggable(str, i11);
    }

    public static final e C(String str) {
        str.getClass();
        return new e(str);
    }

    public static final n D(c0 c0Var, String str, String str2) {
        c0Var.getClass();
        str.getClass();
        return c0Var.b(str, o.b(str2));
    }

    public static Executor E(final Executor executor, final j0 j0Var) {
        executor.getClass();
        return executor == g0.INSTANCE ? executor : new Executor() { // from class: o30.u0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e5) {
                    j0Var.n(e5);
                }
            }
        };
    }

    public static final Object F(Function2 function2) {
        Thread.interrupted();
        return f0.E(g.f26549a, new l0(function2, null));
    }

    public static final e G(String str) {
        str.getClass();
        return new e(str);
    }

    public static final void H(t tVar, int i11, al.e eVar) {
        t tVar2;
        o3.e eVar2 = new o3.e(new t[16], 0);
        List listI = tVar.i(false, false);
        while (true) {
            eVar2.c(eVar2.f31832c, listI);
            while (true) {
                int i12 = eVar2.f31832c;
                if (i12 == 0) {
                    return;
                }
                tVar2 = (t) eVar2.l(i12 - 1);
                boolean zE = w.e(tVar2);
                j5.n nVar = tVar2.f24696d;
                if (!zE) {
                    if (nVar.f24682a.b(x.f24715i)) {
                        continue;
                    } else {
                        s1 s1VarD = tVar2.d();
                        if (s1VarD == null) {
                            throw b3.i.D("Expected semantics node to have a coordinator.");
                        }
                        k kVarH = android.support.v4.media.session.a.H(z4.c0.f(s1VarD, true));
                        if (kVarH.f47282a < kVarH.f47284c && kVarH.f47283b < kVarH.f47285d) {
                            Function2 function2 = (Function2) w.d(nVar, m.f24661e);
                            j5.k kVar = (j5.k) w.d(nVar, x.f24727v);
                            if (function2 == null || kVar == null || ((Number) kVar.f24634b.invoke()).floatValue() <= 0.0f) {
                                break;
                            }
                            int i13 = 1 + i11;
                            eVar.invoke(new i5.i(tVar2, i13, kVarH, s1VarD));
                            H(tVar2, i13, eVar);
                        }
                    }
                }
            }
            listI = tVar2.i(false, false);
        }
    }

    public static void I(String str, String str2) {
        if (B(5, str)) {
            Log.w(str, str2);
        }
    }

    public static void J(String str, String str2, Throwable th2) {
        if (B(5, str)) {
            Log.w(str, str2, th2);
        }
    }

    public static final void a(FilterCategory filterCategory, b4.t tVar, m3.n nVar, int i11) {
        String iconUrlLight;
        s sVar = (s) nVar;
        sVar.c0(-1533194299);
        int i12 = (sVar.f(filterCategory) ? 4 : 2) | i11 | MLKEMEngine.KyberPolyBytes;
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            String iconUrlLight2 = filterCategory.getIconUrlLight();
            if (iconUrlLight2 == null || StringsKt.H(iconUrlLight2)) {
                String iconUrlDark = filterCategory.getIconUrlDark();
                if (iconUrlDark == null || StringsKt.H(iconUrlDark)) {
                    String iconUrlLight3 = filterCategory.getIconUrlLight();
                    iconUrlLight = (iconUrlLight3 == null || StringsKt.H(iconUrlLight3)) ? null : filterCategory.getIconUrlLight();
                } else {
                    iconUrlLight = filterCategory.getIconUrlDark();
                }
            } else {
                iconUrlLight = filterCategory.getIconUrlLight();
            }
            String str = iconUrlLight;
            if (str != null) {
                sVar.a0(1586055304);
                gd.o.a(str, null, m2.f13850c, l.f47167b, sVar, 1572912, 0, 1976);
                sVar.q(false);
            } else {
                sVar.a0(1586235197);
                sVar.q(false);
            }
            tVar = q.f5711a;
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new gn.i(filterCategory, tVar, i11, 23);
        }
    }

    public static final void b(int i11, b4.t tVar, Function0 function0, m3.n nVar) {
        int i12;
        s sVar;
        function0.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(-1491753902);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar2.f(tVar) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(function0) ? 32 : 16;
        }
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            b4.t tVarJ = v1.n.j(tVar, lv.s.I, i4.g0.f23254b);
            y yVarA = d2.w.a(d2.i.f13805e, d.f5695n, sVar2, 54);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            b4.t tVarC = b4.a.c(tVarJ, sVar2);
            j.R.getClass();
            h hVar = b5.i.f5839b;
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
            float f11 = 112;
            q qVar = q.f5711a;
            v1.n.d(x0.z(R.drawable.charity_calendar, sVar2, 0), "ProductImage", m2.h(m2.l(qVar, f11), f11), null, null, 0.0f, new i4.o(lv.s.G, 5), sVar2, 1573304, 56);
            int i13 = i12;
            int i14 = 4;
            r9.d(o30.f0.U(sVar2, R.string.charity_plan_you_are_unavailable), c.B(m2.t(m2.d(qVar, 1.0f), 3), 16, 0.0f, 2), lv.s.D, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28274n, sVar2, 432, 12582912, 130040);
            b4.t tVarD = c.D(qVar, 0.0f, 24, 0.0f, 0.0f, 13);
            String strU = o30.f0.U(sVar2, R.string.charity_plan_manage_collection_days);
            boolean z11 = (i13 & 112) == 32;
            Object objM = sVar2.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new z(i14, function0);
                sVar2.k0(objM);
            }
            v0.n.l(tVarD, strU, null, null, null, false, false, null, null, (Function0) objM, sVar2, 6, 508);
            sVar = sVar2;
            sVar.q(true);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new hj.a(tVar, function0, i11, 2, (byte) 0);
        }
    }

    public static final f c(String str) {
        return new f(g1.b(str));
    }

    public static final void d(u uVar, m3.n nVar, int i11) {
        u uVar2;
        uVar.getClass();
        s sVar = (s) nVar;
        sVar.c0(-192930242);
        int i12 = i11 | (sVar.h(uVar) ? 4 : 2);
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            float f11 = lv.t.f28252f;
            q qVar = q.f5711a;
            b4.t tVarD = c.D(qVar, 0.0f, f11, 0.0f, 0.0f, 13);
            i2 i2VarA = h2.a(d2.i.f13801a, d.f5692j, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarD, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
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
            float f12 = 20;
            b4.t tVarJ = v1.n.j(m2.e(m2.q(qVar, f12), f12), lv.s.I, l2.g.b(f12));
            String str = uVar.f8127b;
            u0 u0Var = v.f28275o;
            long j9 = lv.s.C;
            r9.d(str, tVarJ, j9, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            b4.t tVarD2 = c.D(qVar, lv.t.f28253g, 0.0f, 0.0f, 0.0f, 14);
            y yVarA = d2.w.a(d2.i.f13803c, d.f5694m, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarD2, sVar);
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
            uVar2 = uVar;
            r9.d(uVar.f8128c, m2.d(qVar, 1.0f), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar, 432, 12582912, 131064);
            sVar = sVar;
            String str2 = uVar2.f8130e;
            if (str2 == null) {
                sVar.a0(-768739668);
                sVar.q(false);
            } else {
                sVar.a0(-768739667);
                r9.d(str2, b4.a.a(c.D(m2.d(qVar, 1.0f), 0.0f, lv.t.f28249c, 0.0f, 0.0f, 13), c5.m2.f7291a, new cg.x(uVar2, 1)), j9, 0L, null, 0L, x5.l.f43854c, null, 0L, 0, false, 0, 0, null, v.f28283w, sVar, 805306752, 12582912, 130552);
                sVar = sVar;
                sVar.q(false);
            }
            sVar.q(true);
            sVar.q(true);
        } else {
            uVar2 = uVar;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.v(uVar2, i11, 1);
        }
    }

    public static final void e(r rVar, jd.f fVar, m3.n nVar, int i11) {
        s sVar;
        fVar.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(257301736);
        int i12 = (sVar2.f(rVar) ? 4 : 2) | i11 | (sVar2.f(fVar) ? 32 : 16);
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            d5 d5VarC = ga.c(sVar2);
            C2CReferralResponse c2CReferralResponse = rVar.f32951a;
            sVar = sVar2;
            x5.a(v4.f.a(m2.f13850c, d5VarC.f18456c, null), u3.e.e(454212268, sVar2, new tq.a(fVar, 4, (byte) 0)), null, null, null, 0, 0L, 0L, null, u3.e.e(-752521673, sVar2, new ii.i((int) p0.a(p0.h(c2CReferralResponse.getC2cReferralPeriodEndAtUtc()), true), p0.n(c2CReferralResponse.getC2cReferralPeriodEndAtUtc()), fVar, c2CReferralResponse, 1)), sVar, 805306416, 508);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new rk.a0(rVar, fVar, i11, 12);
        }
    }

    public static final void f(Function0 function0, Function0 function02, m3.n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(1624780805);
        int i12 = (sVar.h(function02) ? 32 : 16) | i11;
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = new vm.r(16, function0);
                sVar.k0(objM);
            }
            ex.i.b((Function0) objM, new d6.a0(3), u3.e.e(1378727388, sVar, new cg.g0(function02, function0, 14)), sVar, 432, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.g0(function0, function02, i11, 15);
        }
    }

    public static final void g(DiscoverBucket discoverBucket, String str, Function0 function0, Function1 function1, m3.n nVar, int i11) {
        function0.getClass();
        function1.getClass();
        s sVar = (s) nVar;
        sVar.c0(696652715);
        int i12 = i11 | (sVar.h(discoverBucket) ? 4 : 2) | (sVar.f(str) ? 32 : 16) | (sVar.h(function0) ? 256 : 128) | (sVar.h(function1) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            q qVar = q.f5711a;
            b4.t tVarD = m2.d(qVar, 1.0f);
            float f11 = lv.t.f28255i;
            float f12 = lv.t.f28253g;
            b4.t tVarA = c.A(tVarD, f11, f12);
            y yVarA = d2.w.a(d2.i.f13803c, d.f5695n, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarA, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
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
            String title = discoverBucket != null ? discoverBucket.getTitle() : null;
            if (title == null) {
                title = b3.i.j(-501151210, R.string.discover_not_live_here_title, sVar, sVar, false);
            } else {
                sVar.a0(-501151737);
                sVar.q(false);
            }
            u0 u0Var = v.f28270i;
            String str2 = title;
            long j9 = lv.s.C;
            r9.d(str2, m2.d(qVar, 1.0f), j9, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0Var, sVar, 432, 12582912, 130040);
            c.f(m2.e(qVar, lv.t.f28254h), sVar);
            String subtext = discoverBucket != null ? discoverBucket.getSubtext() : null;
            if (subtext == null) {
                subtext = b3.i.j(-501139460, R.string.discover_not_live_here_description, sVar, sVar, false);
            } else {
                sVar.a0(-501140545);
                sVar.q(false);
            }
            r9.d(subtext, m2.d(qVar, 1.0f), j9, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28274n, sVar, 432, 12582912, 130040);
            sVar = sVar;
            c.f(m2.e(qVar, f12), sVar);
            String button = discoverBucket != null ? discoverBucket.getButton() : null;
            if (button == null) {
                button = b3.i.j(-501126793, R.string.discover_not_live_here_button, sVar, sVar, false);
            } else {
                sVar.a0(-501127351);
                sVar.q(false);
            }
            v0.n.o(qVar, button, null, null, null, false, function0, sVar, 6, (i12 >> 6) & 14, 1020);
            if (str == null || str.length() == 0) {
                sVar.a0(1645283137);
                sVar.q(false);
            } else {
                sVar.a0(1645096703);
                w0.e.f(discoverBucket, str, function1, sVar, (i12 & 126) | ((i12 >> 3) & 896));
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new p(discoverBucket, str, i11, function0, function1, 16);
        }
    }

    public static final void h(jl.d dVar, m3.n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-738843148);
        int i12 = i11 | (sVar.h(dVar) ? 4 : 2);
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            d2.g0 g0Var = m2.f13850c;
            b4.i iVar = d.f5695n;
            d2.b bVar = d2.i.f13801a;
            y yVarA = d2.w.a(d2.i.g(lv.t.f28254h), iVar, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(g0Var, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
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
            String str = dVar.f25308a;
            if (str == null) {
                str = "";
            }
            r9.d(str, null, lv.s.f28215a, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28264c, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130042);
            String str2 = dVar.f25309b;
            if (str2 == null) {
                str2 = "";
            }
            u0 u0Var = v.f28274n;
            long j9 = lv.s.C;
            float f11 = lv.t.f28255i;
            q qVar = q.f5711a;
            r9.d(str2, c.B(qVar, f11, 0.0f, 2), j9, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0Var, sVar, 432, 12582912, 130040);
            b4.t tVarD = c.D(m2.d(qVar, 1.0f), 0.0f, f11, 0.0f, 0.0f, 13);
            z4.u0 u0VarD = d2.p.d(d.f5683a, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarD, sVar);
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
            sVar = sVar;
            v1.n.d(x0.z(2131231898, sVar, 0), "Surprise bag", m2.d(qVar, 1.0f), null, l.f47169d, 0.0f, null, sVar, 25016, 104);
            x0.f((he.k) e0.D(new le.q("hand-two_doodle-sticker.lottie"), sVar, 6).getValue(), c.v(d2.u.f13938a.a(m2.m(qVar, 80), d.f5685c), -70, 20), false, 0.0f, Integer.MAX_VALUE, false, null, sVar, 1572864, 0, 4194236);
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new y0(dVar, i11, 25);
        }
    }

    public static final LinkedHashMap i(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            itKeys.getClass();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                next.getClass();
                String string = jSONObject.getString(next);
                string.getClass();
                linkedHashMap.put(next, string);
            }
            return linkedHashMap;
        } catch (JSONException e5) {
            StringBuilder sbS = e0.f.s("Error parsing JSON: ", str, " \n");
            sbS.append(e5.getMessage());
            Log.e("Datadome", sbS.toString());
            return linkedHashMap;
        }
    }

    public static Object j(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final e k(String str) {
        str.getClass();
        return new e(str);
    }

    public static final Pair l(q90.z zVar) {
        Charset charset = Charsets.UTF_8;
        if (zVar != null) {
            Regex regex = q90.z.f36633e;
            Charset charsetA = zVar.a(null);
            if (charsetA == null) {
                try {
                    zVar = q90.y.a(zVar + "; charset=utf-8");
                } catch (IllegalArgumentException unused) {
                    zVar = null;
                }
            } else {
                charset = charsetA;
            }
        }
        return new Pair(charset, zVar);
    }

    public static final boolean m(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj != obj2 && !Intrinsics.areEqual(obj, obj2)) {
                if (obj != null && obj2 != null) {
                    if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                        if (!m((Bundle) obj, (Bundle) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                        if (!kotlin.collections.v.b((Object[]) obj, (Object[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                        if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                        if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                        if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                        if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                        if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                        if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                        if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                        if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(obj, obj2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static final int n(Bundle bundle) {
        Iterator<String> it = bundle.keySet().iterator();
        int iN = 1;
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            iN = (iN * 31) + (obj instanceof Bundle ? n((Bundle) obj) : obj instanceof Object[] ? Arrays.deepHashCode((Object[]) obj) : obj instanceof byte[] ? Arrays.hashCode((byte[]) obj) : obj instanceof short[] ? Arrays.hashCode((short[]) obj) : obj instanceof int[] ? Arrays.hashCode((int[]) obj) : obj instanceof long[] ? Arrays.hashCode((long[]) obj) : obj instanceof float[] ? Arrays.hashCode((float[]) obj) : obj instanceof double[] ? Arrays.hashCode((double[]) obj) : obj instanceof char[] ? Arrays.hashCode((char[]) obj) : obj instanceof boolean[] ? Arrays.hashCode((boolean[]) obj) : obj != null ? obj.hashCode() : 0);
        }
        return iN;
    }

    public static z20.e o(Context context) {
        t10.c cVar;
        synchronized (z20.b.class) {
            try {
                if (z20.b.f46933a == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    z20.b.f46933a = new t10.c(new l8.m(context, false));
                }
                cVar = z20.b.f46933a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (z20.e) ((a30.c) cVar.f39648a).a();
    }

    public static void p(String str, String str2) {
        if (B(3, str)) {
            Log.d(str, str2);
        }
    }

    public static final e q(String str) {
        str.getClass();
        return new e(str);
    }

    public static void r(String str, String str2) {
        if (B(6, str)) {
            Log.e(str, str2);
        }
    }

    public static void s(String str, String str2, Throwable th2) {
        if (B(6, str)) {
            Log.e(str, str2, th2);
        }
    }

    public static final e t(String str) {
        str.getClass();
        return new e(str);
    }

    public static final b4.t u(b4.t tVar, boolean z11, float f11, long j9, float f12, v0 v0Var) {
        tVar.getClass();
        v0Var.getClass();
        return z11 ? c.z(v1.n.k(tVar, f11, j9, v0Var), f12) : tVar;
    }

    public static final qb.h v(qb.o oVar) {
        oVar.getClass();
        return new qb.h(oVar.f36828a, oVar.f36846t);
    }

    public static final String[] w(c4.o oVar) {
        oVar.getClass();
        return (String[]) ((f) oVar).f7035b.toArray(new String[0]);
    }

    public static g9.q x(ViewModelStore viewModelStore) {
        viewModelStore.getClass();
        o70.d dVar = g9.r.f20212a;
        y8.a aVar = y8.a.f45423b;
        dVar.getClass();
        aVar.getClass();
        com.google.firebase.messaging.a0 a0Var = new com.google.firebase.messaging.a0(viewModelStore, dVar, aVar);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(g9.q.class);
        orCreateKotlinClass.getClass();
        String qualifiedName = orCreateKotlinClass.getQualifiedName();
        if (qualifiedName != null) {
            return (g9.q) a0Var.M("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
        }
        i4.a.f("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static void y(String str, String str2) {
        if (B(4, str)) {
            Log.i(str, str2);
        }
    }

    public static final e z(String str) {
        str.getClass();
        return new e(str);
    }
}
