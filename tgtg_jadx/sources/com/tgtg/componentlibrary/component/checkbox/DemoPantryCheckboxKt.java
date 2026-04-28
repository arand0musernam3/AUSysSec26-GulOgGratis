package com.tgtg.componentlibrary.component.checkbox;

import b4.a;
import b4.d;
import b4.q;
import b4.t;
import b5.j;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.b;
import d2.c;
import d2.h2;
import d2.i;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.w;
import d2.y;
import g3.r9;
import i4.g0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.n;
import m3.s;
import m3.w1;
import m5.u0;
import org.jetbrains.annotations.Nullable;
import w.a0;
import x60.h;
import x60.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "DemoPantryCheckbox", "(Lm3/n;I)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDemoPantryCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DemoPantryCheckbox.kt\ncom/tgtg/componentlibrary/component/checkbox/DemoPantryCheckboxKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,166:1\n75#2:167\n75#2:168\n75#2:204\n75#2:205\n75#2:206\n87#3:169\n85#3,8:170\n94#3:203\n81#4,6:178\n88#4,6:193\n96#4:202\n81#4,6:213\n88#4,6:228\n96#4:237\n391#5,9:184\n400#5,3:199\n391#5,9:219\n400#5,3:234\n99#6,6:207\n106#6:238\n*S KotlinDebug\n*F\n+ 1 DemoPantryCheckbox.kt\ncom/tgtg/componentlibrary/component/checkbox/DemoPantryCheckboxKt\n*L\n30#1:167\n34#1:168\n132#1:204\n133#1:205\n134#1:206\n32#1:169\n32#1:170,8\n32#1:203\n32#1:178,6\n32#1:193,6\n32#1:202\n136#1:213,6\n136#1:228,6\n136#1:237\n32#1:184,9\n32#1:199,3\n136#1:219,9\n136#1:234,3\n136#1:207,6\n136#1:238\n*E\n"})
public final class DemoPantryCheckboxKt {
    public static final void DemoPantryCheckbox(@Nullable n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-50339313);
        if (sVar.R(i11 & 1, i11 != 0)) {
            m mVar = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            t tVarD = m2.d(v1.n.r(c.A(v1.n.j(q.f5711a, ((h) sVar.j(PantryThemeKt.getLocalPantryColor())).f43905a, g0.f23254b), mVar.f44010f, mVar.f44011g), v1.n.q(sVar), true), 1.0f);
            b bVar = i.f13801a;
            y yVarA = w.a(i.g(mVar.f44007c), d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = a.c(tVarD, sVar);
            j.R.getClass();
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
            ComposableSingletons$DemoPantryCheckboxKt composableSingletons$DemoPantryCheckboxKt = ComposableSingletons$DemoPantryCheckboxKt.INSTANCE;
            a("Checked", composableSingletons$DemoPantryCheckboxKt.getLambda$1609921966$app_release(), sVar, 54);
            a("Unchecked", composableSingletons$DemoPantryCheckboxKt.m660getLambda$1654150057$app_release(), sVar, 54);
            a("Tri-state (On)", composableSingletons$DemoPantryCheckboxKt.m662getLambda$604280842$app_release(), sVar, 54);
            a("Tri-state (Off)", composableSingletons$DemoPantryCheckboxKt.getLambda$445588373$app_release(), sVar, 54);
            a("Tri-state (Indeterminate)", composableSingletons$DemoPantryCheckboxKt.getLambda$1495457588$app_release(), sVar, 54);
            a("Tri-state Disabled (On)", composableSingletons$DemoPantryCheckboxKt.m661getLambda$1749640493$app_release(), sVar, 54);
            a("Tri-state Disabled (Off)", composableSingletons$DemoPantryCheckboxKt.m663getLambda$699771278$app_release(), sVar, 54);
            a("Tri-state Disabled (Indeterminate)", composableSingletons$DemoPantryCheckboxKt.getLambda$350097937$app_release(), sVar, 54);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c60.b(i11, 16);
        }
    }

    public static final void a(String str, Function2 function2, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(2133099574);
        if (sVar.R(i11 & 1, (i11 & 19) != 18)) {
            m mVar = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            h hVar = (h) sVar.j(PantryThemeKt.getLocalPantryColor());
            t tVarD = m2.d(q.f5711a, 1.0f);
            b bVar = i.f13801a;
            i2 i2VarA = h2.a(i.g(mVar.f44005a), d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = a.c(tVarD, sVar);
            j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            u0 u0Var = jVar.f43959h;
            long j9 = hVar.J;
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            r9.d(str, new n1(1.0f, true), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, 6, 0, 131064);
            sVar = sVar;
            a0.w(6, function2, sVar, true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new i60.a(str, function2, i11, 0);
        }
    }
}
