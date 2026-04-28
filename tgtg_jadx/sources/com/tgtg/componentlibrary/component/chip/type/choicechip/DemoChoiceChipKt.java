package com.tgtg.componentlibrary.component.chip.type.choicechip;

import a3.p0;
import b4.a;
import b4.q;
import b4.t;
import b5.d;
import b5.h;
import com.tgtg.componentlibrary.component.chip.model.ChipSemanticsKt;
import com.tgtg.componentlibrary.component.p000switch.PantrySwitchKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.b;
import d2.c;
import d2.g;
import d2.h2;
import d2.i;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.w;
import d2.y;
import g3.b0;
import g3.r9;
import i4.g0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.b1;
import m3.f;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0006²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"", "DemoChoiceChip", "(Lm3/n;I)V", "", "isEnabled", "isSelected", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDemoChoiceChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DemoChoiceChip.kt\ncom/tgtg/componentlibrary/component/chip/type/choicechip/DemoChoiceChipKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,182:1\n75#2:183\n75#2:184\n75#2:185\n75#2:369\n75#2:370\n87#3:186\n85#3,8:187\n87#3:312\n85#3,8:313\n94#3:358\n94#3:368\n81#4,6:195\n88#4,6:210\n81#4,6:226\n88#4,6:241\n96#4:286\n81#4,6:321\n88#4,6:336\n96#4:357\n96#4:367\n81#4,6:377\n88#4,6:392\n96#4:401\n391#5,9:201\n400#5:216\n391#5,9:232\n400#5:247\n401#5,2:284\n391#5,9:327\n400#5:342\n401#5,2:355\n401#5,2:365\n391#5,9:383\n400#5,3:398\n99#6:217\n97#6,8:218\n106#6:287\n99#6,6:371\n106#6:402\n1128#7,6:248\n1128#7,6:254\n1128#7,6:260\n1128#7,6:266\n1128#7,6:272\n1128#7,6:278\n1128#7,6:288\n1128#7,6:294\n1128#7,6:300\n1128#7,6:306\n1128#7,6:343\n1128#7,6:349\n1128#7,6:359\n85#8:403\n117#8,2:404\n85#8:406\n117#8,2:407\n*S KotlinDebug\n*F\n+ 1 DemoChoiceChip.kt\ncom/tgtg/componentlibrary/component/chip/type/choicechip/DemoChoiceChipKt\n*L\n35#1:183\n36#1:184\n37#1:185\n137#1:369\n138#1:370\n39#1:186\n39#1:187,8\n109#1:312\n109#1:313,8\n109#1:358\n39#1:368\n39#1:195,6\n39#1:210,6\n53#1:226,6\n53#1:241,6\n53#1:286\n109#1:321,6\n109#1:336,6\n109#1:357\n39#1:367\n139#1:377,6\n139#1:392,6\n139#1:401\n39#1:201,9\n39#1:216\n53#1:232,9\n53#1:247\n53#1:284,2\n109#1:327,9\n109#1:342\n109#1:355,2\n39#1:365,2\n139#1:383,9\n139#1:398,3\n53#1:217\n53#1:218,8\n53#1:287\n139#1:371,6\n139#1:402\n59#1:248,6\n60#1:254,6\n61#1:260,6\n66#1:266,6\n71#1:272,6\n76#1:278,6\n89#1:288,6\n94#1:294,6\n95#1:300,6\n105#1:306,6\n113#1:343,6\n114#1:349,6\n126#1:359,6\n94#1:403\n94#1:404,2\n95#1:406\n95#1:407,2\n*E\n"})
public final class DemoChoiceChipKt {
    public static final void DemoChoiceChip(@Nullable n nVar, int i11) {
        h hVar;
        d dVar;
        s sVar = (s) nVar;
        sVar.c0(-2110899117);
        if (sVar.R(i11 & 1, i11 != 0)) {
            m mVar = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            j jVar = (j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.h hVar2 = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            t tVarJ = v1.n.j(m2.f13850c, hVar2.f43905a, g0.f23254b);
            float f11 = mVar.f44010f;
            float f12 = mVar.l;
            t tVarR = v1.n.r(c.A(tVarJ, f11, mVar.f44011g), v1.n.q(sVar), true);
            b bVar = i.f13801a;
            g gVarG = i.g(mVar.f44008d);
            b4.i iVar = b4.d.f5694m;
            y yVarA = w.a(gVarG, iVar, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = a.c(tVarR, sVar);
            b5.j.R.getClass();
            h hVar3 = b5.i.f5839b;
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
            d dVar2 = b5.i.f5845h;
            m3.i.z(sVar, dVar2);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            u0 u0Var = jVar.f43957f;
            u0 u0Var2 = jVar.f43959h;
            r9.d("Choice Chip", null, hVar2.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, 6, 0, 131066);
            q qVar = q.f5711a;
            t tVarR2 = v1.n.r(m2.d(qVar, 1.0f), v1.n.q(sVar), false);
            i2 i2VarA = h2.a(i.g(f12), b4.d.f5692j, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = a.c(tVarR2, sVar);
            sVar.e0();
            if (sVar.S) {
                hVar = hVar3;
                sVar.k(hVar);
            } else {
                hVar = hVar3;
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC2, gVar4, sVar);
            Object objM = sVar.M();
            f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.TRUE);
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            boolean zBooleanValue = ((Boolean) b1Var.component1()).booleanValue();
            Function1 function1Component2 = b1Var.component2();
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM2);
            }
            b1 b1Var2 = (b1) objM2;
            boolean zBooleanValue2 = ((Boolean) b1Var2.component1()).booleanValue();
            Function1 function1Component22 = b1Var2.component2();
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM3);
            }
            b1 b1Var3 = (b1) objM3;
            boolean zBooleanValue3 = ((Boolean) b1Var3.component1()).booleanValue();
            Function1 function1Component23 = b1Var3.component2();
            boolean zF = sVar.f(function1Component2) | sVar.g(zBooleanValue);
            Object objM4 = sVar.M();
            if (zF || objM4 == fVar) {
                dVar = dVar2;
                objM4 = new b0(function1Component2, zBooleanValue, 3);
                sVar.k0(objM4);
            } else {
                dVar = dVar2;
            }
            Function0 function0 = (Function0) objM4;
            h hVar4 = hVar;
            d dVar3 = dVar;
            PantryChoiceChipKt.PantryChoiceChip("All", zBooleanValue, function0, null, null, false, false, sVar, 6, 120);
            boolean zF2 = sVar.f(function1Component22) | sVar.g(zBooleanValue2);
            Object objM5 = sVar.M();
            if (zF2 || objM5 == fVar) {
                objM5 = new b0(function1Component22, zBooleanValue2, 4);
                sVar.k0(objM5);
            }
            PantryChoiceChipKt.PantryChoiceChip("Vegetarian", zBooleanValue2, (Function0) objM5, null, null, false, false, sVar, 6, 120);
            boolean zF3 = sVar.f(function1Component23) | sVar.g(zBooleanValue3);
            Object objM6 = sVar.M();
            if (zF3 || objM6 == fVar) {
                objM6 = new b0(function1Component23, zBooleanValue3, 5);
                sVar.k0(objM6);
            }
            PantryChoiceChipKt.PantryChoiceChip("Vegan", zBooleanValue3, (Function0) objM6, null, null, false, false, sVar, 6, 120);
            sVar.q(true);
            r9.d("With elevation (e.g. over map)", c.D(qVar, 0.0f, mVar.f44008d, 0.0f, 0.0f, 13), hVar2.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, 6, 0, 131064);
            Object objM7 = sVar.M();
            if (objM7 == fVar) {
                objM7 = new jq.a(16);
                sVar.k0(objM7);
            }
            PantryChoiceChipKt.PantryChoiceChip("Category", false, (Function0) objM7, null, "Filter by category", false, true, sVar, 1597878, 40);
            Object objM8 = sVar.M();
            if (objM8 == fVar) {
                objM8 = m3.i.w(Boolean.TRUE);
                sVar.k0(objM8);
            }
            b1 b1Var4 = (b1) objM8;
            Object objM9 = sVar.M();
            if (objM9 == fVar) {
                objM9 = m3.i.w(Boolean.TRUE);
                sVar.k0(objM9);
            }
            b1 b1Var5 = (b1) objM9;
            r9.d("Active: Option", null, hVar2.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, 6, 0, 131066);
            boolean zBooleanValue4 = ((Boolean) b1Var5.getValue()).booleanValue();
            Object objM10 = sVar.M();
            if (objM10 == fVar) {
                objM10 = new jq.a(17);
                sVar.k0(objM10);
            }
            PantryChoiceChipKt.PantryChoiceChip("Option", zBooleanValue4, (Function0) objM10, null, null, ((Boolean) b1Var4.getValue()).booleanValue(), false, sVar, 390, 88);
            t tVarD = c.D(qVar, 0.0f, mVar.f44008d, 0.0f, 0.0f, 13);
            y yVarA2 = w.a(i.g(f12), iVar, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            t tVarC3 = a.c(tVarD, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar4);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA2, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            a0.y(iHashCode3, sVar, gVar3, sVar, dVar3);
            m3.i.C(tVarC3, gVar4, sVar);
            boolean zBooleanValue5 = ((Boolean) b1Var4.getValue()).booleanValue();
            Object objM11 = sVar.M();
            if (objM11 == fVar) {
                objM11 = new p0(b1Var4, 28);
                sVar.k0(objM11);
            }
            a("Enabled", zBooleanValue5, (Function1) objM11, sVar, 390);
            boolean zBooleanValue6 = ((Boolean) b1Var5.getValue()).booleanValue();
            Object objM12 = sVar.M();
            if (objM12 == fVar) {
                objM12 = new p0(b1Var5, 29);
                sVar.k0(objM12);
            }
            a(ChipSemanticsKt.CHIP_STATE_DESCRIPTION_SELECTED, zBooleanValue6, (Function1) objM12, sVar, 390);
            sVar.q(true);
            r9.d("Label (long text truncates)", c.D(qVar, 0.0f, mVar.l, 0.0f, 0.0f, 13), hVar2.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, 6, 0, 131064);
            sVar = sVar;
            Object objM13 = sVar.M();
            if (objM13 == fVar) {
                objM13 = new jq.a(18);
                sVar.k0(objM13);
            }
            PantryChoiceChipKt.PantryChoiceChip("Very long label that should truncate with ellipsis after one line", false, (Function0) objM13, null, null, false, false, sVar, 438, 120);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c60.b(i11, 20);
        }
    }

    public static final void a(String str, boolean z11, Function1 function1, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-978125968);
        int i12 = i11 | (sVar.g(z11) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            j jVar = (j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            t tVarD = m2.d(q.f5711a, 1.0f);
            i2 i2VarA = h2.a(i.f13807g, b4.d.f5693k, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = a.c(tVarD, sVar);
            b5.j.R.getClass();
            h hVar2 = b5.i.f5839b;
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
            u0 u0Var = jVar.f43958g;
            long j9 = hVar.J;
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            r9.d(str, new n1(1.0f, true), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, 6, 0, 131064);
            sVar = sVar;
            PantrySwitchKt.LargePantrySwitch(z11, null, function1, true, sVar, ((i12 >> 3) & 14) | 3456, 2);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new l60.a(str, z11, function1, i11, 0);
        }
    }
}
