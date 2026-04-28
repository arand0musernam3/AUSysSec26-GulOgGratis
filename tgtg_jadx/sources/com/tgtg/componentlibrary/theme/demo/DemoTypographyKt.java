package com.tgtg.componentlibrary.theme.demo;

import b4.a;
import b4.d;
import b4.q;
import b4.t;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.c;
import d2.i;
import d2.m2;
import d2.w;
import d2.y;
import g3.r9;
import ho.k;
import i4.g0;
import i4.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.n;
import m3.s;
import m3.w1;
import m5.u0;
import org.jetbrains.annotations.Nullable;
import x60.h;
import x60.j;
import x60.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "DemoTypography", "(Lm3/n;I)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDemoTypography.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DemoTypography.kt\ncom/tgtg/componentlibrary/theme/demo/DemoTypographyKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,142:1\n75#2:143\n75#2:144\n75#2:145\n75#2:182\n75#2:183\n87#3:146\n84#3,9:147\n94#3:181\n81#4,6:156\n88#4,6:171\n96#4:180\n391#5,9:162\n400#5,3:177\n*S KotlinDebug\n*F\n+ 1 DemoTypography.kt\ncom/tgtg/componentlibrary/theme/demo/DemoTypographyKt\n*L\n25#1:143\n26#1:144\n27#1:145\n86#1:182\n87#1:183\n29#1:146\n29#1:147,9\n29#1:181\n29#1:156,6\n29#1:171,6\n29#1:180\n29#1:162,9\n29#1:177,3\n*E\n"})
public final class DemoTypographyKt {
    public static final void DemoTypography(@Nullable n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(931943419);
        if (sVar.R(i11 & 1, i11 != 0)) {
            j jVar = (j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            h hVar = (h) sVar.j(PantryThemeKt.getLocalPantryColor());
            m mVar = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            long j9 = hVar.f43905a;
            r0 r0Var = g0.f23254b;
            q qVar = q.f5711a;
            t tVarJ = v1.n.j(qVar, j9, r0Var);
            float f11 = mVar.f44015k;
            float f12 = mVar.f44008d;
            t tVarD = m2.d(v1.n.r(c.A(tVarJ, f11, f11), v1.n.q(sVar), true), 1.0f);
            y yVarA = w.a(i.f13803c, d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = a.c(tVarD, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            a("displayLarge", jVar.f43952a, sVar, 6);
            a("displayMedium", jVar.f43953b, sVar, 6);
            a("displaySmall", jVar.f43954c, sVar, 6);
            c.f(m2.e(qVar, f12), sVar);
            a("headingLarge", jVar.f43955d, sVar, 6);
            a("headingMedium", jVar.f43956e, sVar, 6);
            a("headingSmall", jVar.f43957f, sVar, 6);
            c.f(m2.e(qVar, f12), sVar);
            a("bodyTextMedium", jVar.f43958g, sVar, 6);
            a("bodyTextMediumBold", jVar.f43959h, sVar, 6);
            a("bodyTextSmall", jVar.f43960i, sVar, 6);
            a("bodyTextSmallBold", jVar.f43961j, sVar, 6);
            a("bodyTextXSmall", jVar.f43962k, sVar, 6);
            c.f(m2.e(qVar, f12), sVar);
            a("labelsLarge", jVar.f43965o, sVar, 6);
            a("labelsMedium", jVar.f43966p, sVar, 6);
            a("labelsSmall", jVar.f43967q, sVar, 6);
            a("labelsXSmall", jVar.f43968r, sVar, 6);
            c.f(m2.e(qVar, f12), sVar);
            a("linksMedium", jVar.l, sVar, 6);
            a("linksSmall", jVar.f43963m, sVar, 6);
            a("linksXSmall", jVar.f43964n, sVar, 6);
            c.f(m2.e(qVar, mVar.f44007c), sVar);
            a("buttonsLarge", jVar.f43973w, sVar, 6);
            a("buttonsMedium", jVar.f43974x, sVar, 6);
            a("buttonsSmall", jVar.f43975y, sVar, 6);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new on.j(i11, 26);
        }
    }

    public static final void a(String str, u0 u0Var, n nVar, int i11) {
        u0 u0Var2 = u0Var;
        s sVar = (s) nVar;
        sVar.c0(662374240);
        int i12 = i11 | (sVar.f(u0Var2) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            m mVar = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            r9.d(str, null, ((h) sVar.j(PantryThemeKt.getLocalPantryColor())).J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, 6, (i12 << 18) & 29360128, 131066);
            u0Var2 = u0Var2;
            sVar = sVar;
            c.f(m2.e(q.f5711a, mVar.l), sVar);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new k(str, u0Var2, i11);
        }
    }
}
