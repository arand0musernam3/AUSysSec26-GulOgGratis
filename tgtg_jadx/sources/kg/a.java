package kg;

import a3.p0;
import androidx.compose.foundation.b;
import b4.q;
import b4.t;
import bn.p;
import c5.x1;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.manufacturer.response.AddressSearchElement;
import com.google.android.gms.internal.measurement.cg;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.c;
import d2.h2;
import d2.i;
import d2.i2;
import d2.m2;
import d2.w;
import d2.y;
import d2.z;
import g3.j5;
import g3.r9;
import i2.e;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l2.g;
import lv.v;
import m2.d1;
import m3.b1;
import m3.f;
import m3.i1;
import m3.n;
import m3.s;
import m3.w1;
import o00.x0;
import o30.f0;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import u3.d;
import w.a0;
import x60.h;
import x60.j;
import x60.k;
import x60.l;
import x60.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f26365a = new d(new j60.a(5), false, 132893371);

    public static final void a(AddressSearchElement addressSearchElement, Function2 function2, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(66570703);
        int i12 = i11 | (sVar.f(addressSearchElement) ? 4 : 2) | (sVar.h(function2) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            j jVar = (j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            m mVar = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            h hVar = (h) sVar.j(PantryThemeKt.getLocalPantryColor());
            k kVar = (k) sVar.j(PantryThemeKt.getLocalPantryRadius());
            l lVar = (l) sVar.j(PantryThemeKt.getLocalPantrySize());
            float f11 = mVar.l;
            float f12 = mVar.f44017n;
            q qVar = q.f5711a;
            c.f(m2.m(qVar, f11), sVar);
            t tVarK = v1.n.k(m2.d(qVar, 1.0f), 1, hVar.f43922i0, g.b(kVar.f43977a));
            boolean z11 = ((i12 & 14) == 4) | ((i12 & 112) == 32);
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new e(15, function2, addressSearchElement);
                sVar.k0(objM);
            }
            t tVarA = c.A(b.c(tVarK, false, null, null, (Function0) objM, 15), f12, mVar.l);
            i2 i2VarA = h2.a(i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarA, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
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
            g3.i2.a(x0.z(addressSearchElement.isFound() ? R.drawable.ic_map_marker_outline : R.drawable.ic_building05, sVar, 0), "", m2.m(qVar, lVar.f44002o), hVar.K, sVar, 56, 0);
            c.f(m2.m(qVar, f12), sVar);
            y yVarA = w.a(i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            r9.d(addressSearchElement.getText(), null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43958g, sVar, 0, 0, 131066);
            r9.d(addressSearchElement.getDetails(), null, hVar.K, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43958g, sVar, 0, 0, 131066);
            sVar = sVar;
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new gn.i(addressSearchElement, function2, i11, 27);
        }
    }

    public static final void b(List list, Function0 function0, Function2 function2, Function2 function22, n nVar, int i11) {
        List list2;
        function0.getClass();
        function2.getClass();
        function22.getClass();
        s sVar = (s) nVar;
        sVar.c0(1830855501);
        int i12 = i11 | (sVar.h(list) ? 4 : 2) | (sVar.h(function0) ? 32 : 16) | (sVar.h(function2) ? 256 : 128) | (sVar.h(function22) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            g4.l lVar = (g4.l) sVar.j(x1.f7417i);
            m mVar = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            y yVarA = w.a(i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            q qVar = q.f5711a;
            t tVarC = b4.a.c(qVar, sVar);
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
            r9.d(f0.U(sVar, R.string.checkout_overview_parcel_title_delivery_to), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28279s, sVar, 0, 12582912, 131070);
            sVar = sVar;
            c.f(m2.e(qVar, mVar.f44015k), sVar);
            boolean z11 = (i12 & 112) == 32;
            Object objM = sVar.M();
            f fVar = m3.m.f29332a;
            if (z11 || objM == fVar) {
                objM = new j5(27, function0);
                sVar.k0(objM);
            }
            Function0 function02 = (Function0) objM;
            boolean z12 = (i12 & 896) == 256;
            Object objM2 = sVar.M();
            if (z12 || objM2 == fVar) {
                objM2 = new b3.n(17, function2);
                sVar.k0(objM2);
            }
            d(function02, (Function2) objM2, sVar, 0);
            list2 = list;
            s1.y.b(z.f13980a, cg.q(list), null, null, null, null, u3.e.e(-211214785, sVar, new ap.e(list2, lVar, function22, 8)), sVar, 1572870, 30);
            sVar.q(true);
        } else {
            list2 = list;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new p(list2, function0, i11, function2, function22, 22);
        }
    }

    public static final void c(List list, Function2 function2, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-2103057500);
        int i12 = (sVar.h(list) ? 4 : 2) | i11 | (sVar.h(function2) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            t tVarB = c.B(q.f5711a, 0.0f, ((m) sVar.j(PantryThemeKt.getLocalPantrySpacing())).f44015k, 1);
            y yVarA = w.a(i.f13803c, b4.d.f5694m, sVar, 0);
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
            sVar.a0(-477644858);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AddressSearchElement addressSearchElement = (AddressSearchElement) it.next();
                boolean z11 = (i12 & 112) == 32;
                Object objM = sVar.M();
                if (z11 || objM == m3.m.f29332a) {
                    objM = new b3.n(16, function2);
                    sVar.k0(objM);
                }
                a(addressSearchElement, (Function2) objM, sVar, 0);
            }
            sVar.q(false);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new gn.i(list, function2, i11, 26);
        }
    }

    public static final void d(Function0 function0, Function2 function2, n nVar, int i11) {
        m mVar;
        long j9;
        boolean z11;
        f fVar;
        v2.h hVar;
        int i12;
        b1 b1Var;
        i1 i1Var;
        Function2 function22 = function2;
        s sVar = (s) nVar;
        sVar.c0(444206637);
        int i13 = (sVar.h(function0) ? 4 : 2) | i11 | (sVar.h(function22) ? 32 : 16);
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            v2.h hVarF = v2.k.f(sVar);
            Object objM = sVar.M();
            f fVar2 = m3.m.f29332a;
            if (objM == fVar2) {
                objM = m3.i.w(Boolean.FALSE);
                sVar.k0(objM);
            }
            b1 b1Var2 = (b1) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar2) {
                objM2 = new i1(500L);
                sVar.k0(objM2);
            }
            i1 i1Var2 = (i1) objM2;
            Object objM3 = sVar.M();
            if (objM3 == fVar2) {
                objM3 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM3);
            }
            b1 b1Var3 = (b1) objM3;
            g4.l lVar = (g4.l) sVar.j(x1.f7417i);
            j jVar = (j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            m mVar2 = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            h hVar2 = (h) sVar.j(PantryThemeKt.getLocalPantryColor());
            k kVar = (k) sVar.j(PantryThemeKt.getLocalPantryRadius());
            x60.a aVar = (x60.a) sVar.j(PantryThemeKt.getLocalPantryBorder());
            l lVar2 = (l) sVar.j(PantryThemeKt.getLocalPantrySize());
            t tVarD = m2.d(q.f5711a, 1.0f);
            float f11 = aVar.f43895b;
            if (((Boolean) b1Var2.getValue()).booleanValue()) {
                mVar = mVar2;
                j9 = hVar2.N;
            } else {
                mVar = mVar2;
                j9 = hVar2.f43922i0;
            }
            t tVarK = v1.n.k(tVarD, f11, j9, g.b(kVar.f43979c));
            Object objM4 = sVar.M();
            if (objM4 == fVar2) {
                objM4 = new p0(b1Var2, 27);
                sVar.k0(objM4);
            }
            m2.t.c(hVarF, g4.d.i(tVarK, (Function1) objM4), false, jVar.f43958g, new d1(1, 0, 122), v2.e.f41932b, null, null, new g40.b(mVar, lVar2, hVarF, hVar2, jVar, lVar, function2), null, sVar, 100663296, 24220);
            sVar = sVar;
            CharSequence charSequence = hVarF.b().f41928c;
            int i14 = i13 & 112;
            boolean zF = sVar.f(hVarF) | (i14 == 32);
            Object objM5 = sVar.M();
            if (zF || objM5 == fVar2) {
                z11 = false;
                fVar = fVar2;
                hVar = hVarF;
                i12 = 32;
                co.n nVar2 = new co.n(hVar, function2, b1Var3, i1Var2, null, 3);
                b1Var = b1Var3;
                i1Var = i1Var2;
                sVar.k0(nVar2);
                objM5 = nVar2;
            } else {
                i12 = 32;
                z11 = false;
                fVar = fVar2;
                hVar = hVarF;
                i1Var = i1Var2;
                b1Var = b1Var3;
            }
            m3.i.h(charSequence, (Function2) objM5, sVar);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.a0(569920477);
                Long lValueOf = Long.valueOf(i1Var.h());
                boolean zF2 = sVar.f(hVar) | (i14 == i12 ? true : z11);
                Object objM6 = sVar.M();
                if (zF2 || objM6 == fVar) {
                    v2.h hVar3 = hVar;
                    function22 = function2;
                    h2.a0 a0Var = new h2.a0(function22, hVar3, i1Var, null, 17);
                    sVar.k0(a0Var);
                    objM6 = a0Var;
                } else {
                    function22 = function2;
                }
                m3.i.h(lValueOf, (Function2) objM6, sVar);
                sVar.q(z11);
            } else {
                function22 = function2;
                sVar.a0(570066549);
                sVar.q(z11);
            }
            if (((Boolean) b1Var2.getValue()).booleanValue()) {
                function0.invoke();
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new gn.i(function0, function22, i11, 24);
        }
    }
}
