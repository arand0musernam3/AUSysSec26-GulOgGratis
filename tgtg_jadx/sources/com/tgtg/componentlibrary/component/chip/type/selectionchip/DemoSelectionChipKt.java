package com.tgtg.componentlibrary.component.chip.type.selectionchip;

import b4.a;
import b4.d;
import b4.q;
import b4.t;
import b5.h;
import com.tgtg.componentlibrary.component.chip.model.ChipSemanticsKt;
import com.tgtg.componentlibrary.component.chip.model.ChipVariant;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.variant.AvatarSelectionChipKt;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.variant.IconSelectionChipKt;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.variant.TextOnlySelectionChipKt;
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
import g3.g6;
import g3.r9;
import i4.g0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.b1;
import m3.f;
import m3.n;
import m3.s;
import m3.w1;
import m5.u0;
import n90.p;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.Nullable;
import u3.e;
import w.a0;
import x60.j;
import x60.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\t²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"", "DemoSelectionChip", "(Lm3/n;I)V", "", "isEnabled", "isSelected", "isElevated", "Lcom/tgtg/componentlibrary/component/chip/model/ChipVariant;", "variant", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDemoSelectionChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DemoSelectionChip.kt\ncom/tgtg/componentlibrary/component/chip/type/selectionchip/DemoSelectionChipKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,268:1\n75#2:269\n75#2:270\n75#2:271\n75#2:473\n75#2:474\n87#3:272\n85#3,8:273\n87#3:416\n85#3,8:417\n94#3:468\n94#3:472\n81#4,6:281\n88#4,6:296\n81#4,6:312\n88#4,6:327\n96#4:372\n81#4,6:425\n88#4,6:440\n96#4:467\n96#4:471\n81#4,6:481\n88#4,6:496\n96#4:505\n391#5,9:287\n400#5:302\n391#5,9:318\n400#5:333\n401#5,2:370\n391#5,9:431\n400#5:446\n401#5,2:465\n401#5,2:469\n391#5,9:487\n400#5,3:502\n99#6:303\n97#6,8:304\n106#6:373\n99#6,6:475\n106#6:506\n1128#7,6:334\n1128#7,6:340\n1128#7,6:346\n1128#7,6:352\n1128#7,6:358\n1128#7,6:364\n1128#7,6:374\n1128#7,6:380\n1128#7,6:386\n1128#7,6:392\n1128#7,6:398\n1128#7,6:404\n1128#7,6:410\n1128#7,6:447\n1128#7,6:453\n1128#7,6:459\n1128#7,6:519\n1128#7,6:525\n1128#7,6:531\n85#8:507\n117#8,2:508\n85#8:510\n117#8,2:511\n85#8:513\n117#8,2:514\n85#8:516\n117#8,2:517\n*S KotlinDebug\n*F\n+ 1 DemoSelectionChip.kt\ncom/tgtg/componentlibrary/component/chip/type/selectionchip/DemoSelectionChipKt\n*L\n47#1:269\n48#1:270\n49#1:271\n223#1:473\n224#1:474\n51#1:272\n51#1:273,8\n172#1:416\n172#1:417,8\n172#1:468\n51#1:472\n51#1:281,6\n51#1:296,6\n61#1:312,6\n61#1:327,6\n61#1:372\n172#1:425,6\n172#1:440,6\n172#1:467\n51#1:471\n225#1:481,6\n225#1:496,6\n225#1:505\n51#1:287,9\n51#1:302\n61#1:318,9\n61#1:333\n61#1:370,2\n172#1:431,9\n172#1:446\n172#1:465,2\n51#1:469,2\n225#1:487,9\n225#1:502,3\n61#1:303\n61#1:304,8\n61#1:373\n225#1:475,6\n225#1:506\n67#1:334,6\n68#1:340,6\n69#1:346,6\n74#1:352,6\n80#1:358,6\n92#1:364,6\n109#1:374,6\n110#1:380,6\n111#1:386,6\n112#1:392,6\n138#1:398,6\n147#1:404,6\n168#1:410,6\n176#1:447,6\n177#1:453,6\n178#1:459,6\n195#1:519,6\n202#1:525,6\n209#1:531,6\n109#1:507\n109#1:508,2\n110#1:510\n110#1:511,2\n111#1:513\n111#1:514,2\n112#1:516\n112#1:517,2\n*E\n"})
public final class DemoSelectionChipKt {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChipVariant.values().length];
            try {
                iArr[ChipVariant.TextOnly.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChipVariant.Icon.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChipVariant.Avatar.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void DemoSelectionChip(@Nullable n nVar, int i11) {
        h hVar;
        f fVar;
        int i12;
        int i13;
        s sVar = (s) nVar;
        sVar.c0(-1764362624);
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
            b4.i iVar = d.f5694m;
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
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            u0 u0Var = jVar.f43957f;
            u0 u0Var2 = jVar.f43959h;
            r9.d("Selection Chip", null, hVar2.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, 6, 0, 131066);
            q qVar = q.f5711a;
            t tVarR2 = v1.n.r(m2.d(qVar, 1.0f), v1.n.q(sVar), false);
            i2 i2VarA = h2.a(i.g(f12), d.f5692j, sVar, 0);
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
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            Object objM = sVar.M();
            f fVar2 = m3.m.f29332a;
            if (objM == fVar2) {
                objM = m3.i.w(Boolean.TRUE);
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            boolean zBooleanValue = ((Boolean) b1Var.component1()).booleanValue();
            Function1 function1Component2 = b1Var.component2();
            Object objM2 = sVar.M();
            if (objM2 == fVar2) {
                objM2 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM2);
            }
            b1 b1Var2 = (b1) objM2;
            boolean zBooleanValue2 = ((Boolean) b1Var2.component1()).booleanValue();
            Function1 function1Component22 = b1Var2.component2();
            Object objM3 = sVar.M();
            if (objM3 == fVar2) {
                objM3 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM3);
            }
            b1 b1Var3 = (b1) objM3;
            boolean zBooleanValue3 = ((Boolean) b1Var3.component1()).booleanValue();
            Function1 function1Component23 = b1Var3.component2();
            boolean zF = sVar.f(function1Component23) | sVar.g(zBooleanValue3);
            Object objM4 = sVar.M();
            if (zF || objM4 == fVar2) {
                objM4 = new b0(function1Component23, zBooleanValue3, 9);
                sVar.k0(objM4);
            }
            h hVar4 = hVar;
            TextOnlySelectionChipKt.TextOnlySelectionChip("Organic", zBooleanValue3, (Function0) objM4, null, null, false, false, null, sVar, 6, 248);
            boolean zF2 = sVar.f(function1Component2) | sVar.g(zBooleanValue);
            Object objM5 = sVar.M();
            if (zF2 || objM5 == fVar2) {
                objM5 = new b0(function1Component2, zBooleanValue, 10);
                sVar.k0(objM5);
            }
            ComposableSingletons$DemoSelectionChipKt composableSingletons$DemoSelectionChipKt = ComposableSingletons$DemoSelectionChipKt.INSTANCE;
            IconSelectionChipKt.IconSelectionChip("Vegetarian", zBooleanValue, (Function0) objM5, null, null, false, false, composableSingletons$DemoSelectionChipKt.m803getLambda$2034626489$app_release(), sVar, 12582918, 120);
            boolean zF3 = sVar.f(function1Component22) | sVar.g(zBooleanValue2);
            Object objM6 = sVar.M();
            if (zF3 || objM6 == fVar2) {
                objM6 = new b0(function1Component22, zBooleanValue2, 11);
                sVar.k0(objM6);
            }
            AvatarSelectionChipKt.AvatarSelectionChip("Vegan", zBooleanValue2, (Function0) objM6, null, null, false, false, composableSingletons$DemoSelectionChipKt.m801getLambda$126989273$app_release(), sVar, 12582918, 120);
            sVar.q(true);
            Object objM7 = sVar.M();
            if (objM7 == fVar2) {
                objM7 = m3.i.w(Boolean.TRUE);
                sVar.k0(objM7);
            }
            b1 b1Var4 = (b1) objM7;
            Object objM8 = sVar.M();
            if (objM8 == fVar2) {
                objM8 = m3.i.w(Boolean.TRUE);
                sVar.k0(objM8);
            }
            b1 b1Var5 = (b1) objM8;
            Object objM9 = sVar.M();
            if (objM9 == fVar2) {
                objM9 = m3.i.w(Boolean.TRUE);
                sVar.k0(objM9);
            }
            b1 b1Var6 = (b1) objM9;
            Object objM10 = sVar.M();
            if (objM10 == fVar2) {
                objM10 = m3.i.w(ChipVariant.TextOnly);
                sVar.k0(objM10);
            }
            b1 b1Var7 = (b1) objM10;
            r9.d("Active: Vegetarian", null, hVar2.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, 6, 0, 131066);
            Function2<n, Integer, Unit> function2M802getLambda$1325083464$app_release = ((ChipVariant) b1Var7.getValue()) == ChipVariant.Icon ? composableSingletons$DemoSelectionChipKt.m802getLambda$1325083464$app_release() : null;
            int i14 = WhenMappings.$EnumSwitchMapping$0[((ChipVariant) b1Var7.getValue()).ordinal()];
            if (i14 != 1) {
                if (i14 == 2) {
                    fVar = fVar2;
                    sVar.a0(-1591290586);
                    boolean zBooleanValue4 = ((Boolean) b1Var5.getValue()).booleanValue();
                    boolean zBooleanValue5 = ((Boolean) b1Var4.getValue()).booleanValue();
                    boolean zBooleanValue6 = ((Boolean) b1Var6.getValue()).booleanValue();
                    Object objM11 = sVar.M();
                    if (objM11 == fVar) {
                        objM11 = new p(10);
                        sVar.k0(objM11);
                    }
                    IconSelectionChipKt.IconSelectionChip("Vegetarian", zBooleanValue4, (Function0) objM11, null, null, zBooleanValue5, zBooleanValue6, function2M802getLambda$1325083464$app_release, sVar, 390, 24);
                    i13 = 0;
                    sVar.q(false);
                } else {
                    if (i14 != 3) {
                        throw e0.f.v(sVar, -1713910042, false);
                    }
                    sVar.a0(-1590978447);
                    boolean zBooleanValue7 = ((Boolean) b1Var5.getValue()).booleanValue();
                    boolean zBooleanValue8 = ((Boolean) b1Var4.getValue()).booleanValue();
                    boolean zBooleanValue9 = ((Boolean) b1Var6.getValue()).booleanValue();
                    Object objM12 = sVar.M();
                    fVar = fVar2;
                    if (objM12 == fVar) {
                        objM12 = new p(11);
                        sVar.k0(objM12);
                    }
                    AvatarSelectionChipKt.AvatarSelectionChip("Vegetarian", zBooleanValue7, (Function0) objM12, null, null, zBooleanValue8, zBooleanValue9, composableSingletons$DemoSelectionChipKt.getLambda$1424426371$app_release(), sVar, 12583302, 24);
                    i13 = 0;
                    sVar.q(false);
                }
                i12 = i13;
            } else {
                fVar = fVar2;
                sVar.a0(-1591588062);
                boolean zBooleanValue10 = ((Boolean) b1Var5.getValue()).booleanValue();
                boolean zBooleanValue11 = ((Boolean) b1Var4.getValue()).booleanValue();
                boolean zBooleanValue12 = ((Boolean) b1Var6.getValue()).booleanValue();
                Object objM13 = sVar.M();
                if (objM13 == fVar) {
                    objM13 = new p(9);
                    sVar.k0(objM13);
                }
                TextOnlySelectionChipKt.TextOnlySelectionChip("Vegetarian", zBooleanValue10, (Function0) objM13, null, null, zBooleanValue11, zBooleanValue12, function2M802getLambda$1325083464$app_release, sVar, 390, 24);
                i12 = 0;
                sVar.q(false);
            }
            t tVarD = c.D(qVar, 0.0f, mVar.f44008d, 0.0f, 0.0f, 13);
            y yVarA2 = w.a(i.g(f12), iVar, sVar, i12);
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
            a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            boolean zBooleanValue13 = ((Boolean) b1Var4.getValue()).booleanValue();
            Object objM14 = sVar.M();
            if (objM14 == fVar) {
                objM14 = new li.c(b1Var4, 16);
                sVar.k0(objM14);
            }
            a("Enabled", zBooleanValue13, (Function1) objM14, sVar, 390);
            boolean zBooleanValue14 = ((Boolean) b1Var5.getValue()).booleanValue();
            Object objM15 = sVar.M();
            if (objM15 == fVar) {
                objM15 = new li.c(b1Var5, 17);
                sVar.k0(objM15);
            }
            a(ChipSemanticsKt.CHIP_STATE_DESCRIPTION_SELECTED, zBooleanValue14, (Function1) objM15, sVar, 390);
            boolean zBooleanValue15 = ((Boolean) b1Var6.getValue()).booleanValue();
            Object objM16 = sVar.M();
            if (objM16 == fVar) {
                objM16 = new li.c(b1Var6, 18);
                sVar.k0(objM16);
            }
            a("Elevated", zBooleanValue15, (Function1) objM16, sVar, 390);
            sVar.q(true);
            r9.d("Variant", c.D(qVar, 0.0f, mVar.l, 0.0f, 0.0f, 13), hVar2.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, 6, 0, 131064);
            sVar = sVar;
            g6.c(m2.d(c.B(qVar, 0.0f, f12, 1), 1.0f), 0.0f, e.e(-871942069, sVar, new gi.b(b1Var7, 3)), sVar, MLKEMEngine.KyberPolyBytes);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c60.b(i11, 29);
        }
    }

    public static final void a(String str, boolean z11, Function1 function1, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-1231600652);
        int i12 = i11 | (sVar.g(z11) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            j jVar = (j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            t tVarD = m2.d(q.f5711a, 1.0f);
            i2 i2VarA = h2.a(i.f13807g, d.f5693k, sVar, 54);
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
            w1VarS.f29476d = new l60.a(str, z11, function1, i11, 2);
        }
    }
}
