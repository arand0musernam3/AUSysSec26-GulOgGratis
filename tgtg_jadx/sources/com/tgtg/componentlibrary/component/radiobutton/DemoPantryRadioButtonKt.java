package com.tgtg.componentlibrary.component.radiobutton;

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
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "DemoPantryRadioButton", "(Lm3/n;I)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDemoPantryRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DemoPantryRadioButton.kt\ncom/tgtg/componentlibrary/component/radiobutton/DemoPantryRadioButtonKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,114:1\n75#2:115\n75#2:116\n75#2:152\n75#2:153\n75#2:154\n87#3:117\n85#3,8:118\n94#3:151\n81#4,6:126\n88#4,6:141\n96#4:150\n81#4,6:161\n88#4,6:176\n96#4:185\n391#5,9:132\n400#5,3:147\n391#5,9:167\n400#5,3:182\n99#6,6:155\n106#6:186\n*S KotlinDebug\n*F\n+ 1 DemoPantryRadioButton.kt\ncom/tgtg/componentlibrary/component/radiobutton/DemoPantryRadioButtonKt\n*L\n29#1:115\n33#1:116\n80#1:152\n81#1:153\n82#1:154\n31#1:117\n31#1:118,8\n31#1:151\n31#1:126,6\n31#1:141,6\n31#1:150\n84#1:161,6\n84#1:176,6\n84#1:185\n31#1:132,9\n31#1:147,3\n84#1:167,9\n84#1:182,3\n84#1:155,6\n84#1:186\n*E\n"})
public final class DemoPantryRadioButtonKt {
    public static final void DemoPantryRadioButton(@Nullable n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-358360377);
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
            ComposableSingletons$DemoPantryRadioButtonKt composableSingletons$DemoPantryRadioButtonKt = ComposableSingletons$DemoPantryRadioButtonKt.INSTANCE;
            a("Interactive", composableSingletons$DemoPantryRadioButtonKt.getLambda$256063018$app_release(), sVar, 54);
            a("Unchecked", composableSingletons$DemoPantryRadioButtonKt.m910getLambda$2063143647$app_release(), sVar, 54);
            a("Disabled (Checked)", composableSingletons$DemoPantryRadioButtonKt.getLambda$1527960674$app_release(), sVar, 54);
            a("Disabled (Unchecked)", composableSingletons$DemoPantryRadioButtonKt.getLambda$824097699$app_release(), sVar, 54);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new on.j(i11, 14);
        }
    }

    public static final void a(String str, Function2 function2, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(-988634426);
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
            i12 = 1;
            r9.d(str, new n1(1.0f, true), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, 6, 0, 131064);
            sVar = sVar;
            a0.w(6, function2, sVar, true);
        } else {
            i12 = 1;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new i60.a(str, function2, i11, i12);
        }
    }
}
