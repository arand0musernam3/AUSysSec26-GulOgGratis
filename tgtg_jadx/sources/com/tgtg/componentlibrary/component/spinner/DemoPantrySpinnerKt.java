package com.tgtg.componentlibrary.component.spinner;

import b4.a;
import b4.d;
import b4.q;
import b4.t;
import b5.h;
import com.tgtg.componentlibrary.component.spinner.model.SpinnerSize;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.b;
import d2.c;
import d2.g;
import d2.i;
import d2.w;
import d2.y;
import g3.r9;
import i4.g0;
import i4.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.n;
import m3.s;
import m3.w1;
import m5.u0;
import org.jetbrains.annotations.Nullable;
import w.a0;
import x60.j;
import x60.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "DemoPantrySpinner", "(Lm3/n;I)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDemoPantrySpinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DemoPantrySpinner.kt\ncom/tgtg/componentlibrary/component/spinner/DemoPantrySpinnerKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,79:1\n75#2:80\n75#2:81\n75#2:82\n87#3:83\n85#3,8:84\n87#3:114\n83#3,10:115\n94#3:150\n87#3:151\n83#3,10:152\n94#3:187\n87#3:188\n83#3,10:189\n94#3:224\n87#3:225\n83#3,10:226\n94#3:261\n94#3:265\n81#4,6:92\n88#4,6:107\n81#4,6:125\n88#4,6:140\n96#4:149\n81#4,6:162\n88#4,6:177\n96#4:186\n81#4,6:199\n88#4,6:214\n96#4:223\n81#4,6:236\n88#4,6:251\n96#4:260\n96#4:264\n391#5,9:98\n400#5:113\n391#5,9:131\n400#5,3:146\n391#5,9:168\n400#5,3:183\n391#5,9:205\n400#5,3:220\n391#5,9:242\n400#5,3:257\n401#5,2:262\n*S KotlinDebug\n*F\n+ 1 DemoPantrySpinner.kt\ncom/tgtg/componentlibrary/component/spinner/DemoPantrySpinnerKt\n*L\n22#1:80\n23#1:81\n24#1:82\n26#1:83\n26#1:84,8\n35#1:114\n35#1:115,10\n35#1:150\n40#1:151\n40#1:152,10\n40#1:187\n45#1:188\n45#1:189,10\n45#1:224\n50#1:225\n50#1:226,10\n50#1:261\n26#1:265\n26#1:92,6\n26#1:107,6\n35#1:125,6\n35#1:140,6\n35#1:149\n40#1:162,6\n40#1:177,6\n40#1:186\n45#1:199,6\n45#1:214,6\n45#1:223\n50#1:236,6\n50#1:251,6\n50#1:260\n26#1:264\n26#1:98,9\n26#1:113\n35#1:131,9\n35#1:146,3\n40#1:168,9\n40#1:183,3\n45#1:205,9\n45#1:220,3\n50#1:242,9\n50#1:257,3\n26#1:262,2\n*E\n"})
public final class DemoPantrySpinnerKt {
    public static final void DemoPantrySpinner(@Nullable n nVar, int i11) {
        h hVar;
        h hVar2;
        h hVar3;
        s sVar = (s) nVar;
        sVar.c0(-1373082381);
        if (sVar.R(i11 & 1, i11 != 0)) {
            m mVar = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            j jVar = (j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.h hVar4 = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            long j9 = hVar4.f43905a;
            r0 r0Var = g0.f23254b;
            q qVar = q.f5711a;
            t tVarJ = v1.n.j(qVar, j9, r0Var);
            float f11 = mVar.f44010f;
            float f12 = mVar.l;
            t tVarR = v1.n.r(c.A(tVarJ, f11, mVar.f44011g), v1.n.q(sVar), true);
            b bVar = i.f13801a;
            g gVarG = i.g(mVar.f44008d);
            b4.i iVar = d.f5694m;
            y yVarA = w.a(gVarG, iVar, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = a.c(tVarR, sVar);
            b5.j.R.getClass();
            h hVar5 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar5);
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
            u0 u0Var = jVar.f43957f;
            u0 u0Var2 = jVar.f43959h;
            r9.d("Sizes", null, hVar4.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, 6, 0, 131066);
            y yVarA2 = w.a(i.g(f12), iVar, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                hVar = hVar5;
                sVar.k(hVar);
            } else {
                hVar = hVar5;
                sVar.n0();
            }
            m3.i.C(yVarA2, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            h hVar6 = hVar;
            r9.d("Tiny", null, hVar4.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, 6, 0, 131066);
            PantrySpinnerKt.m939PantrySpinneriJQMabo(SpinnerSize.Tiny, 0L, sVar, 6, 2);
            sVar.q(true);
            y yVarA3 = w.a(i.g(f12), iVar, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            t tVarC3 = a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                hVar2 = hVar6;
                sVar.k(hVar2);
            } else {
                hVar2 = hVar6;
                sVar.n0();
            }
            m3.i.C(yVarA3, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            h hVar7 = hVar2;
            r9.d("Small", null, hVar4.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, 6, 0, 131066);
            PantrySpinnerKt.m939PantrySpinneriJQMabo(SpinnerSize.Small, 0L, sVar, 6, 2);
            sVar.q(true);
            y yVarA4 = w.a(i.g(f12), iVar, sVar, 0);
            int iHashCode4 = Long.hashCode(sVar.T);
            u3.i iVarL4 = sVar.l();
            t tVarC4 = a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                hVar3 = hVar7;
                sVar.k(hVar3);
            } else {
                hVar3 = hVar7;
                sVar.n0();
            }
            m3.i.C(yVarA4, gVar, sVar);
            m3.i.C(iVarL4, gVar2, sVar);
            a0.y(iHashCode4, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC4, gVar4, sVar);
            h hVar8 = hVar3;
            r9.d("Medium", null, hVar4.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, 6, 0, 131066);
            PantrySpinnerKt.m939PantrySpinneriJQMabo(SpinnerSize.Medium, 0L, sVar, 6, 2);
            sVar.q(true);
            y yVarA5 = w.a(i.g(f12), iVar, sVar, 0);
            int iHashCode5 = Long.hashCode(sVar.T);
            u3.i iVarL5 = sVar.l();
            t tVarC5 = a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar8);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA5, gVar, sVar);
            m3.i.C(iVarL5, gVar2, sVar);
            a0.y(iHashCode5, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC5, gVar4, sVar);
            r9.d("Large", null, hVar4.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, 6, 0, 131066);
            sVar = sVar;
            PantrySpinnerKt.m939PantrySpinneriJQMabo(SpinnerSize.Large, 0L, sVar, 6, 2);
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new on.j(i11, 16);
        }
    }
}
