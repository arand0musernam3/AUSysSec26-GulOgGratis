package lp;

import a3.p2;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.format.DateUtils;
import android.view.Surface;
import android.view.TextureView;
import androidx.recyclerview.widget.m0;
import bn.h0;
import c5.v0;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.app.tgtg.R;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n0;
import d2.n1;
import g3.b9;
import g3.r9;
import g3.s0;
import hp.f1;
import hp.p1;
import i4.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m3.b1;
import m3.c3;
import m3.w1;
import o00.x0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import y80.g1;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r {
    public static final void a(String str, m3.n nVar, int i11) {
        String str2;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(2121912864);
        int i12 = i11 | (sVar.f(str) ? 4 : 2);
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = m2.d(qVar, 1.0f);
            float f11 = lv.t.f28253g;
            b4.t tVarA = d2.c.A(tVarD, lv.t.f28255i, f11);
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
            n1 n1Var = new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            float f12 = 1;
            long j9 = lv.s.H;
            s0.g(n1Var, f12, j9, sVar, 432, 0);
            r9.d(str, d2.c.B(qVar, f11, 0.0f, 2), lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar, (i12 & 14) | 432, 12582912, 131064);
            str2 = str;
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            sVar = sVar;
            s0.g(new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), f12, j9, sVar, 432, 0);
            sVar.q(true);
        } else {
            str2 = str;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new h0(str2, i11, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    public static final void b(hp.g gVar, boolean z11, Function0 function0, b4.t tVar, m3.n nVar, int i11) {
        b4.t tVar2;
        m3.s sVar;
        ?? r11;
        gVar.getClass();
        function0.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(573543068);
        int i12 = i11 | (sVar2.h(gVar) ? 4 : 2) | (sVar2.g(z11) ? 32 : 16) | (sVar2.h(function0) ? 256 : 128) | 3072;
        if (sVar2.R(i12 & 1, (i12 & 1171) != 1170)) {
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = m2.d(qVar, 1.0f);
            i2 i2VarA = h2.a(d2.i.f13807g, b4.d.f5693k, sVar2, 54);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            b4.t tVarC = b4.a.c(tVarD, sVar2);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            b5.g gVar2 = b5.i.f5843f;
            m3.i.C(i2VarA, gVar2, sVar2);
            b5.g gVar3 = b5.i.f5842e;
            m3.i.C(iVarL, gVar3, sVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar4 = b5.i.f5844g;
            m3.i.v(sVar2, numValueOf, gVar4);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar2, dVar);
            b5.g gVar5 = b5.i.f5841d;
            m3.i.C(tVarC, gVar5, sVar2);
            i2 i2VarA2 = h2.a(d2.i.g(lv.t.f28251e), b4.d.f5692j, sVar2, 6);
            int iHashCode2 = Long.hashCode(sVar2.T);
            u3.i iVarL2 = sVar2.l();
            b4.t tVarC2 = b4.a.c(qVar, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(i2VarA2, gVar2, sVar2);
            m3.i.C(iVarL2, gVar3, sVar2);
            w.a0.y(iHashCode2, sVar2, gVar4, sVar2, dVar);
            m3.i.C(tVarC2, gVar5, sVar2);
            String str = gVar.f22284j;
            if (str == null || str.length() == 0) {
                r11 = 0;
                sVar2.a0(1056880782);
                sVar2.q(false);
            } else {
                sVar2.a0(1056673206);
                r11 = 0;
                d.d(x0.z(R.drawable.recipe_generator_clock, sVar2, 0), "", gVar.f22284j, false, sVar2, 56, 8);
                sVar2.q(false);
            }
            String str2 = gVar.f22280f;
            if (str2 == null || str2.length() == 0) {
                sVar2.a0(1057150606);
                sVar2.q(r11);
            } else {
                sVar2.a0(1056939186);
                d.d(x0.z(R.drawable.recipe_generator_person, sVar2, r11), "", gVar.f22280f, false, sVar2, 56, 8);
                sVar2.q(r11);
            }
            sVar2.q(true);
            b4.t tVarM = m2.m(qVar, 24);
            boolean z12 = (i12 & 896) == 256;
            Object objM = sVar2.M();
            if (z12 || objM == m3.m.f29332a) {
                objM = new ki.a(15, function0);
                sVar2.k0(objM);
            }
            byte b8 = 0;
            s0.h((Function0) objM, tVarM, false, null, null, null, u3.e.e(-891425062, sVar2, new q(z11, b8, b8)), sVar2, 1572912, 60);
            m3.s sVar3 = sVar2;
            sVar3.q(true);
            tVar2 = qVar;
            sVar = sVar3;
        } else {
            sVar2.U();
            tVar2 = tVar;
            sVar = sVar2;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.c(gVar, z11, function0, tVar2, i11, 6);
        }
    }

    public static final void c(int i11, int i12, Function1 function1, m3.n nVar) {
        int i13;
        function1.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(543289631);
        int i14 = (sVar.d(i11) ? 4 : 2) | i12 | (sVar.h(function1) ? 32 : 16);
        if (sVar.R(i14 & 1, (i14 & 19) != 18)) {
            i13 = i11;
            b9.d(i13, null, lv.s.J, lv.s.f28217b, u3.e.e(-1623884959, sVar, new cg.t(i11, 5)), null, u3.e.e(-2102273801, sVar, new defpackage.e(kotlin.collections.d0.h(f0.U(sVar, R.string.fridge_recipe_details_ingredients), f0.U(sVar, R.string.fridge_recipe_details_instructions)), i11, function1)), sVar, (i14 & 14) | 1600896);
        } else {
            i13 = i11;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c60.c(function1, i13, i12, 13);
        }
    }

    public static final void d(List list, Function1 function1, Function1 function12, Function0 function0, m3.n nVar, int i11) {
        list.getClass();
        function1.getClass();
        function12.getClass();
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-252994841);
        int i12 = i11 | (sVar.h(list) ? 4 : 2) | (sVar.h(function1) ? 32 : 16) | (sVar.h(function12) ? 256 : 128) | (sVar.h(function0) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            u.a(d2.c.F(v1.n.i(m2.f13850c, qb.e.I(kotlin.collections.d0.h(new i4.v(lv.s.J), new i4.v(lv.s.f28245z)), 0.0f, 0.0f, 14), 0.0f, 6)), list, function1, function12, function0, sVar, (i12 << 3) & 65520);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new v(list, function1, i11, function12, function0, 0);
        }
    }

    public static final void e(f1 f1Var, Function0 function0, m3.n nVar, int i11) {
        f1Var.getClass();
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1967087742);
        int i12 = (sVar.f(f1Var) ? 4 : 2) | i11 | (sVar.h(function0) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            boolean z11 = f1Var.f22274b;
            long j9 = z11 ? lv.s.f28217b : lv.s.f28245z;
            long j11 = z11 ? lv.s.J : lv.s.f28215a;
            b4.t tVarJ = v1.n.j(f4.g.b(b4.q.f5711a, l2.g.b(8)), j9, g0.f23254b);
            boolean z12 = (i12 & 112) == 32;
            Object objM = sVar.M();
            if (z12 || objM == m3.m.f29332a) {
                objM = new ki.a(17, function0);
                sVar.k0(objM);
            }
            b4.t tVarA = d2.c.A(androidx.compose.foundation.b.c(tVarJ, false, null, null, (Function0) objM, 15), lv.t.f28252f, lv.t.f28251e);
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
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            r9.d(f1Var.f22273a.f22328b, null, j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar, 0, 12582912, 131066);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new kq.c(f1Var, function0, i11, 3);
        }
    }

    public static final void f(int i11, List list, Function0 function0, Function1 function1, m3.n nVar) {
        List list2 = list;
        list2.getClass();
        function1.getClass();
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1567733106);
        int i12 = i11 | (sVar.h(list2) ? 4 : 2) | (sVar.h(function1) ? 32 : 16) | (sVar.h(function0) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            b4.q qVar = b4.q.f5711a;
            b4.t tVarI = v1.n.i(d2.c.t(m2.d(qVar, 1.0f)), qb.e.I(kotlin.collections.d0.h(new i4.v(lv.s.J), new i4.v(lv.s.f28245z)), 0.0f, 0.0f, 14), 0.0f, 6);
            float f11 = lv.t.f28254h;
            b4.t tVarE = d2.c.E(d2.c.D(tVarI, f11, lv.t.f28257k, f11, 0.0f, 8));
            b4.i iVar = b4.d.f5695n;
            d2.y yVarA = d2.w.a(d2.i.f13803c, iVar, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarE, sVar);
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
            r9.d(f0.U(sVar, R.string.recipe_preferences_title), null, lv.s.f28215a, 0L, null, 0L, null, new x5.k(3), lv.v.f28269h.f29656b.f29660c, 0, false, 0, 0, null, lv.v.f28264c, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 127994);
            d2.c.f(m2.e(qVar, lv.t.f28253g), sVar);
            r9.d(f0.U(sVar, R.string.recipe_preferences_subtitle), null, lv.s.C, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130042);
            sVar = sVar;
            d2.c.f(m2.e(qVar, lv.t.f28255i), sVar);
            b4.t tVarD = m2.d(d2.c.B(d2.z.a(), f11, 0.0f, 2), 1.0f);
            float f12 = lv.t.f28251e;
            list2 = list;
            n0.a(tVarD, d2.i.h(f12, iVar), d2.i.g(f12), null, 0, 0, u3.e.e(2125988109, sVar, new w(list2, function1, 0)), sVar, 1573296, 56);
            d2.c.f(d2.z.a(), sVar);
            if (list2.isEmpty()) {
                sVar.a0(-1504600289);
                v0.n.n(d2.c.B(m2.d(qVar, 1.0f), lv.t.f28251e, 0.0f, 2), f0.U(sVar, R.string.recipe_preferences_skip), null, null, lv.e.LARGE, false, false, null, null, function0, sVar, (1879048192 & (i12 << 21)) | 24582, 492);
                sVar.q(false);
                d2.c.f(m2.e(qVar, lv.t.f28254h), sVar);
                sVar.q(true);
            } else {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((f1) it.next()).f22274b) {
                        sVar.a0(-1504955270);
                        v0.n.l(d2.c.B(m2.d(qVar, 1.0f), lv.t.f28251e, 0.0f, 2), f0.U(sVar, R.string.recipe_preferences_get_recipes), null, null, lv.e.LARGE, false, false, null, null, function0, sVar, (1879048192 & (i12 << 21)) | 24582, 492);
                        sVar.q(false);
                        break;
                    }
                }
                sVar.a0(-1504600289);
                v0.n.n(d2.c.B(m2.d(qVar, 1.0f), lv.t.f28251e, 0.0f, 2), f0.U(sVar, R.string.recipe_preferences_skip), null, null, lv.e.LARGE, false, false, null, null, function0, sVar, (1879048192 & (i12 << 21)) | 24582, 492);
                sVar.q(false);
                d2.c.f(m2.e(qVar, lv.t.f28254h), sVar);
                sVar.q(true);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new gn.b0(list2, function1, function0, i11, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(int i11, b4.t tVar, List list, Function1 function1, m3.n nVar) {
        Function1 function12;
        m3.s sVar;
        boolean z11;
        float f11;
        Object obj;
        int i12;
        b1 b1Var;
        m3.s sVar2;
        function1.getClass();
        m3.s sVar3 = (m3.s) nVar;
        sVar3.c0(-196998269);
        int i13 = i11 | (sVar3.f(tVar) ? 4 : 2) | (sVar3.h(function1) ? 256 : 128);
        int i14 = 0;
        if (sVar3.R(i13 & 1, (i13 & 147) != 146)) {
            Object objM = sVar3.M();
            Object obj2 = m3.m.f29332a;
            if (objM == obj2) {
                objM = m3.i.w(null);
                sVar3.k0(objM);
            }
            b1 b1Var2 = (b1) objM;
            float f12 = lv.t.f28258m;
            float f13 = lv.t.f28251e;
            float f14 = 0;
            b4.t tVarV = d2.c.v(tVar, f13, f14);
            d2.y yVarA = d2.w.a(d2.i.g(f13), b4.d.f5696o, sVar3, 54);
            int iHashCode = Long.hashCode(sVar3.T);
            u3.i iVarL = sVar3.l();
            b4.t tVarC = b4.a.c(tVarV, sVar3);
            b5.j.R.getClass();
            Function0 function0 = b5.i.f5839b;
            sVar3.e0();
            if (sVar3.S) {
                sVar3.k(function0);
            } else {
                sVar3.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar3);
            m3.i.C(iVarL, b5.i.f5842e, sVar3);
            m3.i.v(sVar3, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar3, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar3);
            List listN0 = list != null ? CollectionsKt.n0(5, CollectionsKt.M(list)) : null;
            if (listN0 == null) {
                sVar3.a0(-1864964886);
                sVar3.q(false);
                function12 = function1;
                z11 = true;
                sVar2 = sVar3;
            } else {
                sVar3.a0(-1864964885);
                Iterator it = listN0.iterator();
                m3.s sVar4 = sVar3;
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    if (Intrinsics.areEqual((Uri) b1Var2.getValue(), uri)) {
                        f11 = f12;
                    } else {
                        f11 = f12;
                        f12 = f14;
                    }
                    float f15 = f11;
                    float f16 = f14;
                    m3.s sVar5 = sVar4;
                    c3 c3VarA = t1.d.a(f12, t1.c.k(m0.DEFAULT_SWIPE_ANIMATION_DURATION, i14, t1.w.f39593a, 2), null, sVar5, 0, 12);
                    i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar5, 48);
                    int iHashCode2 = Long.hashCode(sVar5.T);
                    u3.i iVarL2 = sVar5.l();
                    b4.q qVar = b4.q.f5711a;
                    b4.t tVarC2 = b4.a.c(qVar, sVar5);
                    b5.j.R.getClass();
                    Function0 function02 = b5.i.f5839b;
                    sVar5.e0();
                    if (sVar5.S) {
                        sVar5.k(function02);
                    } else {
                        sVar5.n0();
                    }
                    b5.g gVar = b5.i.f5843f;
                    m3.i.C(i2VarA, gVar, sVar5);
                    b5.g gVar2 = b5.i.f5842e;
                    m3.i.C(iVarL2, gVar2, sVar5);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    b5.g gVar3 = b5.i.f5844g;
                    m3.i.v(sVar5, numValueOf, gVar3);
                    b5.d dVar = b5.i.f5845h;
                    m3.i.z(sVar5, dVar);
                    b5.g gVar4 = b5.i.f5841d;
                    m3.i.C(tVarC2, gVar4, sVar5);
                    gd.i iVarE = gd.o.e(uri, sVar5, i14);
                    float f17 = 12;
                    Iterator it2 = it;
                    b4.t tVarK = v1.n.k(f4.g.b(m2.m(qVar, f15), l2.g.b(f17)), 2, lv.s.J, l2.g.b(f17));
                    boolean zH = sVar5.h(uri);
                    Object objM2 = sVar5.M();
                    if (zH || objM2 == obj2) {
                        objM2 = new i2.e(27, uri, b1Var2);
                        sVar5.k0(objM2);
                    }
                    b4.t tVarC3 = androidx.compose.foundation.b.c(tVarK, false, null, null, (Function0) objM2, 15);
                    Object obj3 = obj2;
                    m3.s sVar6 = sVar5;
                    int i15 = i13;
                    b1 b1Var3 = b1Var2;
                    v1.n.d(iVarE, null, tVarC3, null, z4.l.f47166a, 0.0f, null, sVar6, 24624, 104);
                    b4.t tVarQ = m2.q(qVar, ((z5.f) c3VarA.getValue()).f47277a);
                    u0 u0VarD = d2.p.d(b4.d.f5687e, false);
                    int iHashCode3 = Long.hashCode(sVar6.T);
                    u3.i iVarL3 = sVar6.l();
                    b4.t tVarC4 = b4.a.c(tVarQ, sVar6);
                    sVar6.e0();
                    if (sVar6.S) {
                        sVar6.k(function02);
                    } else {
                        sVar6.n0();
                    }
                    m3.i.C(u0VarD, gVar, sVar6);
                    m3.i.C(iVarL3, gVar2, sVar6);
                    w.a0.y(iHashCode3, sVar6, gVar3, sVar6, dVar);
                    m3.i.C(tVarC4, gVar4, sVar6);
                    if (Intrinsics.areEqual((Uri) b1Var3.getValue(), uri)) {
                        sVar6.a0(1780652432);
                        i13 = i15;
                        boolean zH2 = sVar6.h(uri) | ((i13 & 896) == 256);
                        Object objM3 = sVar6.M();
                        if (zH2) {
                            obj = obj3;
                        } else {
                            obj = obj3;
                            if (objM3 != obj) {
                                b1Var = b1Var3;
                            }
                            b1Var3 = b1Var;
                            s0.h((Function0) objM3, m2.m(qVar, 48), false, null, null, null, d.f28029n, sVar6, 1572912, 60);
                            i12 = 0;
                            sVar6.q(false);
                        }
                        b1Var = b1Var3;
                        objM3 = new a0.g(function1, uri, b1Var, 29);
                        sVar6.k0(objM3);
                        b1Var3 = b1Var;
                        s0.h((Function0) objM3, m2.m(qVar, 48), false, null, null, null, d.f28029n, sVar6, 1572912, 60);
                        i12 = 0;
                        sVar6.q(false);
                    } else {
                        i13 = i15;
                        obj = obj3;
                        i12 = 0;
                        sVar6.a0(1781241525);
                        sVar6.q(false);
                    }
                    sVar6.q(true);
                    sVar6.q(true);
                    f12 = f15;
                    obj2 = obj;
                    i14 = i12;
                    it = it2;
                    f14 = f16;
                    b1Var2 = b1Var3;
                    sVar4 = sVar6;
                }
                boolean z12 = i14;
                z11 = true;
                function12 = function1;
                sVar4.q(z12);
                sVar2 = sVar4;
            }
            sVar2.q(z11);
            sVar = sVar2;
        } else {
            function12 = function1;
            sVar3.U();
            sVar = sVar3;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bg.x0(tVar, list, function12, i11, 2);
        }
    }

    public static final void h(final g9.f0 f0Var, Function0 function0, final Function0 function02, final Boolean bool, final Function0 function03, final String str, final boolean z11, final i4.v vVar, final boolean z12, Function0 function04, m3.n nVar, final int i11) {
        Function0 function05;
        Function0 function06;
        int i12;
        b4.q qVar;
        int i13;
        boolean z13;
        int i14;
        d2.u uVar;
        int i15;
        boolean z14;
        b4.k kVar;
        g9.z zVar;
        b4.k kVar2 = b4.d.f5688f;
        f0Var.getClass();
        function0.getClass();
        function02.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(423727218);
        int i16 = i11 | (sVar.h(f0Var) ? 4 : 2) | (sVar.h(function0) ? 32 : 16) | (sVar.h(function02) ? 256 : 128) | (sVar.f(bool) ? NewHope.SENDB_BYTES : 1024) | (sVar.f(str) ? 131072 : 65536) | (sVar.g(z11) ? 1048576 : 524288) | (sVar.f(vVar) ? 8388608 : 4194304) | (sVar.g(z12) ? 67108864 : 33554432) | (sVar.h(function04) ? 536870912 : 268435456);
        if (sVar.R(i16 & 1, (306783379 & i16) != 306783378)) {
            g9.l lVar = (g9.l) m3.i.m(new g1(f0Var.f20186b.f27556z), null, null, sVar, 48, 2).getValue();
            String str2 = (lVar == null || (zVar = lVar.f20163b) == null) ? null : zVar.f20258b.f27564f;
            boolean z15 = Intrinsics.areEqual(str2, hp.v.INSTANCE.f22335a) && function04 != null;
            hp.r rVar = hp.r.INSTANCE;
            String str3 = rVar.f22335a;
            String str4 = rVar.f22335a;
            boolean z16 = (Intrinsics.areEqual(str2, str3) || (Intrinsics.areEqual(str2, hp.t.INSTANCE.f22335a) && z12)) ? false : true;
            hp.o oVar = hp.o.INSTANCE;
            String str5 = oVar.f22335a;
            String str6 = oVar.f22335a;
            boolean zAreEqual = Intrinsics.areEqual(str2, str5);
            float f11 = Intrinsics.areEqual(str2, str4) ? lv.t.f28254h : lv.t.f28251e;
            int i17 = (Intrinsics.areEqual(str2, str6) || Intrinsics.areEqual(str2, hp.s.INSTANCE.f22335a)) ? R.drawable.back_arrow_transparent : R.drawable.ic_arrow_back;
            int i18 = (Intrinsics.areEqual(str2, str6) || Intrinsics.areEqual(str2, str4) || Intrinsics.areEqual(str2, hp.s.INSTANCE.f22335a)) ? R.drawable.close_transparent_icon : R.drawable.system_icon_close_neutral_80;
            b4.q qVar2 = b4.q.f5711a;
            b4.t tVarE = d2.c.E(m2.d(qVar2, 1.0f));
            if (vVar != null) {
                i12 = i17;
                tVarE = v1.n.j(tVarE, vVar.f23317a, g0.f23254b);
            } else {
                i12 = i17;
            }
            b4.t tVarW = d2.c.w(d2.c.A(tVarE, lv.t.f28253g, lv.t.f28251e), 0.0f, f11, 1);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarW, sVar);
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
            int i19 = i18;
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(qVar2, sVar);
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
            m3.f fVar = m3.m.f29332a;
            if (z16) {
                sVar.a0(655799609);
                boolean z17 = (i16 & 896) == 256;
                Object objM = sVar.M();
                if (z17 || objM == fVar) {
                    objM = new ki.a(18, function02);
                    sVar.k0(objM);
                }
                i13 = i19;
                qVar = qVar2;
                s0.h((Function0) objM, null, false, null, null, null, u3.e.e(191839061, sVar, new c60.b(i12, 22)), sVar, 1572864, 62);
                sVar = sVar;
                sVar.q(false);
            } else {
                qVar = qVar2;
                i13 = i19;
                sVar.a0(656181126);
                sVar.q(false);
            }
            if (zAreEqual) {
                sVar.a0(656223503);
                Object objM2 = sVar.M();
                if (objM2 == fVar) {
                    objM2 = new ki.a(19, function03);
                    sVar.k0(objM2);
                }
                m3.s sVar2 = sVar;
                s0.h((Function0) objM2, null, Intrinsics.areEqual(bool, Boolean.TRUE), null, null, null, d.f28030o, sVar2, 1572864, 58);
                sVar = sVar2;
                z13 = false;
                sVar.q(false);
            } else {
                z13 = false;
                sVar.a0(656645382);
                sVar.q(false);
            }
            sVar.q(true);
            d2.u uVar2 = d2.u.f13938a;
            if (str == null || StringsKt.H(str)) {
                function05 = function04;
                i14 = i13;
                uVar = uVar2;
                i15 = i16;
                z14 = z13;
                kVar = kVar2;
                sVar.a0(-483162102);
                sVar.q(z14);
            } else {
                sVar.a0(-483659249);
                m3.s sVar3 = sVar;
                i15 = i16;
                function05 = function04;
                uVar = uVar2;
                kVar = kVar2;
                i14 = i13;
                z14 = z13;
                r9.d(str, d2.c.B(uVar2.a(qVar, b4.d.f5687e), lv.t.f28256j, 0.0f, 2), 0L, 0L, null, 0L, null, new x5.k(3), 0L, 2, false, z11 ? 1 : 3, 0, null, m5.u0.a(lv.v.f28271j, lv.s.C, 0L, q5.r.f36046k, null, 0L, null, 0, 0L, null, null, 16777210), sVar3, (i16 >> 15) & 14, MLKEMEngine.KyberPolyBytes, 109564);
                sVar = sVar3;
                sVar.q(z14);
            }
            if (z15) {
                sVar.a0(-483119384);
                boolean z18 = (i15 & 1879048192) == 536870912 ? true : z14;
                Object objM3 = sVar.M();
                if (z18 || objM3 == fVar) {
                    objM3 = new ki.a(20, function05);
                    sVar.k0(objM3);
                }
                m3.s sVar4 = sVar;
                s0.h((Function0) objM3, uVar.a(qVar, kVar), false, null, null, null, d.f28031p, sVar4, 1572864, 60);
                sVar = sVar4;
                sVar.q(z14);
                function06 = function0;
            } else {
                d2.u uVar3 = uVar;
                sVar.a0(-482728908);
                boolean z19 = (i15 & 112) == 32 ? true : z14;
                Object objM4 = sVar.M();
                if (z19 || objM4 == fVar) {
                    function06 = function0;
                    objM4 = new ki.a(21, function06);
                    sVar.k0(objM4);
                } else {
                    function06 = function0;
                }
                m3.s sVar5 = sVar;
                s0.h((Function0) objM4, uVar3.a(qVar, kVar), false, null, null, null, u3.e.e(152798001, sVar, new c60.b(i14, 23)), sVar5, 1572864, 60);
                sVar = sVar5;
                sVar.q(z14);
            }
            sVar.q(true);
        } else {
            function05 = function04;
            function06 = function0;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            final Function0 function07 = function05;
            final Function0 function08 = function06;
            w1VarS.f29476d = new Function2(function08, function02, bool, function03, str, z11, vVar, z12, function07, i11) { // from class: lp.x

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Function0 f28103b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Function0 f28104c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Boolean f28105d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Function0 f28106e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ String f28107f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ boolean f28108g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ i4.v f28109h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ boolean f28110i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ Function0 f28111j;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(24577);
                    r.h(this.f28102a, this.f28103b, this.f28104c, this.f28105d, this.f28106e, this.f28107f, this.f28108g, this.f28109h, this.f28110i, this.f28111j, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void i(final int i11, boolean z11, boolean z12, boolean z13, Function0 function0, m3.n nVar, final int i12) {
        final boolean z14;
        final boolean z15;
        final boolean z16;
        m3.s sVar;
        final Function0 function02;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(1029708704);
        int i13 = i12 | (sVar2.d(i11) ? 4 : 2) | 28080;
        if (sVar2.R(i13 & 1, (i13 & 9363) != 9362)) {
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = new jq.a(24);
                sVar2.k0(objM);
            }
            Function0 function03 = (Function0) objM;
            Context context = (Context) sVar2.j(v0.f7390b);
            boolean z17 = (i13 & 14) == 4;
            Object objM2 = sVar2.M();
            if (z17 || objM2 == fVar) {
                objM2 = Uri.parse("android.resource://" + context.getPackageName() + ExpiryDateInput.SEPARATOR + i11);
                sVar2.k0(objM2);
            }
            Uri uri = (Uri) objM2;
            d2.g0 g0Var = m2.f13850c;
            Object objM3 = sVar2.M();
            if (objM3 == fVar) {
                objM3 = new p2(10, function03);
                sVar2.k0(objM3);
            }
            Function1 function1 = (Function1) objM3;
            boolean zH = sVar2.h(uri);
            Object objM4 = sVar2.M();
            if (zH || objM4 == fVar) {
                objM4 = new hb0.o(24, uri, function03);
                sVar2.k0(objM4);
            }
            c6.r.b(function1, g0Var, (Function1) objM4, sVar2, 48, 0);
            sVar = sVar2;
            z14 = true;
            z15 = true;
            z16 = true;
            function02 = function03;
        } else {
            sVar2.U();
            z14 = z11;
            z15 = z12;
            z16 = z13;
            sVar = sVar2;
            function02 = function0;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(i11, z14, z15, z16, function02, i12) { // from class: lp.y

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f28112a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f28113b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f28114c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f28115d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Function0 f28116e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(1);
                    r.i(this.f28112a, this.f28113b, this.f28114c, this.f28115d, this.f28116e, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void j(ep.d0 d0Var, Function1 function1, Function1 function12, m3.n nVar, int i11) {
        d0Var.getClass();
        function1.getClass();
        function12.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-808346510);
        int i12 = i11 | (sVar.h(d0Var) ? 4 : 2) | (sVar.h(function1) ? 32 : 16) | (sVar.h(function12) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            Context context = (Context) sVar.j(v0.f7390b);
            Iterable iterable = (Iterable) m3.i.n(d0Var.f16261v, sVar, 0).getValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : iterable) {
                String dateTime = DateUtils.formatDateTime(context, ((p1) obj).f22318b, 131092);
                dateTime.getClass();
                Object arrayList = linkedHashMap.get(dateTime);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(dateTime, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            List listL0 = CollectionsKt.l0(z0.n(linkedHashMap), new a60.r(18));
            b4.t tVarD = d2.c.D(d2.c.F(v1.n.j(m2.f13850c, lv.s.J, g0.f23254b)), 0.0f, lv.t.l, 0.0f, 0.0f, 13);
            boolean zH = ((i12 & 112) == 32) | sVar.h(listL0) | ((i12 & 896) == 256);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new gn.k(listL0, function1, function12, 2);
                sVar.k0(objM);
            }
            ox.h.c(tVarD, null, null, null, null, null, false, null, (Function1) objM, sVar, 0, 510);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ki.h(d0Var, function1, function12, i11, 4);
        }
    }

    public static final void k(final TextureView textureView, Uri uri, final Function0 function0) {
        Object tag = textureView.getTag(-1412567295);
        MediaPlayer mediaPlayer = tag instanceof MediaPlayer ? (MediaPlayer) tag : null;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setOnPreparedListener(null);
                mediaPlayer.setOnVideoSizeChangedListener(null);
                mediaPlayer.setOnCompletionListener(null);
                mediaPlayer.setOnErrorListener(null);
                mediaPlayer.stop();
                mediaPlayer.release();
            } catch (Throwable th2) {
                sa0.a.f38953a.e(th2, "Release old player in attachPlayer error", new Object[0]);
            }
        }
        SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
        if (surfaceTexture == null) {
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        MediaPlayer mediaPlayer2 = new MediaPlayer();
        try {
            mediaPlayer2.setSurface(surface);
            mediaPlayer2.setDataSource(textureView.getContext(), uri);
            mediaPlayer2.setLooping(true);
            mediaPlayer2.setVolume(0.0f, 0.0f);
            try {
                mediaPlayer2.setVideoScalingMode(2);
            } catch (Throwable th3) {
                sa0.a.f38953a.k(th3, "Video scaling mode not supported on this device", new Object[0]);
            }
            mediaPlayer2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: lp.z
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer3) {
                    TextureView textureView2 = textureView;
                    textureView2.setScaleX(1.0f);
                    textureView2.setScaleY(1.0f);
                    textureView2.requestLayout();
                    mediaPlayer3.start();
                }
            });
            mediaPlayer2.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: lp.a0
                @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
                public final void onVideoSizeChanged(MediaPlayer mediaPlayer3, int i11, int i12) {
                    textureView.requestLayout();
                }
            });
            mediaPlayer2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: lp.b0
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer3) {
                    function0.invoke();
                }
            });
            mediaPlayer2.setOnErrorListener(new c0());
            mediaPlayer2.prepareAsync();
            textureView.setTag(-1412567295, mediaPlayer2);
        } catch (Throwable th4) {
            sa0.a.f38953a.e(th4, "Error preparing MediaPlayer for uri=%s", uri);
            mediaPlayer2.release();
            surface.release();
        }
    }
}
