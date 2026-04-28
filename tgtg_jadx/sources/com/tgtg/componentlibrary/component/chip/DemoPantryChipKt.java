package com.tgtg.componentlibrary.component.chip;

import a3.m3;
import a3.p0;
import a3.u1;
import b4.a;
import b4.d;
import b4.q;
import b4.t;
import com.tgtg.componentlibrary.component.chip.DemoPantryChipKt;
import com.tgtg.componentlibrary.component.chip.model.ChipSemanticsKt;
import com.tgtg.componentlibrary.component.chip.model.ChipVariant;
import com.tgtg.componentlibrary.component.chip.type.choicechip.PantryChoiceChipKt;
import com.tgtg.componentlibrary.component.chip.type.filterchip.variant.AvatarFilterChipKt;
import com.tgtg.componentlibrary.component.chip.type.filterchip.variant.IconFilterChipKt;
import com.tgtg.componentlibrary.component.chip.type.filterchip.variant.TextOnlyFilterChipKt;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.variant.AvatarSelectionChipKt;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.variant.IconSelectionChipKt;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.variant.TextOnlySelectionChipKt;
import com.tgtg.componentlibrary.component.p000switch.PantrySwitchKt;
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
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.jetbrains.annotations.Nullable;
import u3.e;
import x60.h;
import x60.j;
import x60.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0010²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\f\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\r\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000e\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"", "DemoPantryChip", "(Lm3/n;I)V", "Lcom/tgtg/componentlibrary/component/chip/model/ChipVariant;", "selectionVariant", "", "selectionEnabled", "selectionSelected", "selectionElevated", "choiceEnabled", "choiceSelected", "choiceElevated", "filterVariant", "filterEnabled", "filterSelected", "filterElevated", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDemoPantryChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DemoPantryChip.kt\ncom/tgtg/componentlibrary/component/chip/DemoPantryChipKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,405:1\n75#2:406\n75#2:407\n75#2:408\n75#2:582\n75#2:583\n75#2:584\n75#2:621\n75#2:653\n75#2:654\n75#2:659\n75#2:660\n87#3:409\n85#3,8:410\n94#3:581\n87#3:622\n85#3,8:623\n94#3:658\n81#4,6:418\n88#4,6:433\n96#4:580\n81#4,6:631\n88#4,6:646\n96#4:657\n81#4,6:667\n88#4,6:682\n96#4:691\n391#5,9:424\n400#5:439\n401#5,2:578\n391#5,9:637\n400#5:652\n401#5,2:655\n391#5,9:673\n400#5,3:688\n1128#6,6:440\n1128#6,6:446\n1128#6,6:452\n1128#6,6:458\n1128#6,6:464\n1128#6,6:470\n1128#6,6:476\n1128#6,6:482\n1128#6,6:488\n1128#6,6:494\n1128#6,6:500\n1128#6,6:506\n1128#6,6:512\n1128#6,6:518\n1128#6,6:524\n1128#6,6:530\n1128#6,6:536\n1128#6,6:542\n1128#6,6:548\n1128#6,6:554\n1128#6,6:560\n1128#6,6:566\n1128#6,6:572\n1128#6,6:585\n1128#6,6:591\n1128#6,6:597\n1128#6,6:603\n1128#6,6:609\n1128#6,6:615\n1128#6,6:726\n1128#6,6:732\n1128#6,6:738\n99#7,6:661\n106#7:692\n85#8:693\n117#8,2:694\n85#8:696\n117#8,2:697\n85#8:699\n117#8,2:700\n85#8:702\n117#8,2:703\n85#8:705\n117#8,2:706\n85#8:708\n117#8,2:709\n85#8:711\n117#8,2:712\n85#8:714\n117#8,2:715\n85#8:717\n117#8,2:718\n85#8:720\n117#8,2:721\n85#8:723\n117#8,2:724\n*S KotlinDebug\n*F\n+ 1 DemoPantryChip.kt\ncom/tgtg/componentlibrary/component/chip/DemoPantryChipKt\n*L\n54#1:406\n55#1:407\n56#1:408\n174#1:582\n175#1:583\n176#1:584\n337#1:621\n344#1:653\n345#1:654\n360#1:659\n361#1:660\n58#1:409\n58#1:410,8\n58#1:581\n338#1:622\n338#1:623,8\n338#1:658\n58#1:418,6\n58#1:433,6\n58#1:580\n338#1:631,6\n338#1:646,6\n338#1:657\n362#1:667,6\n362#1:682,6\n362#1:691\n58#1:424,9\n58#1:439\n58#1:578,2\n338#1:637,9\n338#1:652\n338#1:655,2\n362#1:673,9\n362#1:688,3\n79#1:440,6\n80#1:446,6\n81#1:452,6\n82#1:458,6\n86#1:464,6\n98#1:470,6\n99#1:476,6\n100#1:482,6\n116#1:488,6\n117#1:494,6\n118#1:500,6\n125#1:506,6\n131#1:512,6\n132#1:518,6\n133#1:524,6\n143#1:530,6\n144#1:536,6\n145#1:542,6\n146#1:548,6\n150#1:554,6\n162#1:560,6\n163#1:566,6\n164#1:572,6\n237#1:585,6\n245#1:591,6\n265#1:597,6\n295#1:603,6\n303#1:609,6\n323#1:615,6\n191#1:726,6\n198#1:732,6\n205#1:738,6\n362#1:661,6\n362#1:692\n79#1:693\n79#1:694,2\n80#1:696\n80#1:697,2\n81#1:699\n81#1:700,2\n82#1:702\n82#1:703,2\n116#1:705\n116#1:706,2\n117#1:708\n117#1:709,2\n118#1:711\n118#1:712,2\n143#1:714\n143#1:715,2\n144#1:717\n144#1:718,2\n145#1:720\n145#1:721,2\n146#1:723\n146#1:724,2\n*E\n"})
public final class DemoPantryChipKt {

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

    public static final void DemoPantryChip(@Nullable n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(1012626694);
        if (sVar.R(i11 & 1, i11 != 0)) {
            m mVar = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            j jVar = (j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            h hVar = (h) sVar.j(PantryThemeKt.getLocalPantryColor());
            t tVarR = v1.n.r(c.A(v1.n.j(m2.f13850c, hVar.f43905a, g0.f23254b), mVar.f44010f, mVar.f44011g), v1.n.q(sVar), true);
            b bVar = i.f13801a;
            y yVarA = w.a(i.g(mVar.f44008d), d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = a.c(tVarR, sVar);
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
            u0 u0Var = jVar.f43956e;
            u0 u0Var2 = jVar.f43957f;
            long j9 = hVar.J;
            float f11 = mVar.l;
            q qVar = q.f5711a;
            r9.d("Chip overview", c.D(qVar, 0.0f, 0.0f, 0.0f, f11, 7), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, 6, 0, 131064);
            r9.d("Selection Chip", null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, 6, 0, 131066);
            Object objM = sVar.M();
            f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(ChipVariant.TextOnly);
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = m3.i.w(Boolean.TRUE);
                sVar.k0(objM2);
            }
            b1 b1Var2 = (b1) objM2;
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = m3.i.w(Boolean.TRUE);
                sVar.k0(objM3);
            }
            b1 b1Var3 = (b1) objM3;
            Object objM4 = sVar.M();
            if (objM4 == fVar) {
                objM4 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM4);
            }
            b1 b1Var4 = (b1) objM4;
            ChipVariant chipVariant = (ChipVariant) b1Var.getValue();
            Object objM5 = sVar.M();
            if (objM5 == fVar) {
                objM5 = new p0(b1Var, 14);
                sVar.k0(objM5);
            }
            e(chipVariant, (Function1) objM5, sVar, 48);
            c((ChipVariant) b1Var.getValue(), ((Boolean) b1Var2.getValue()).booleanValue(), ((Boolean) b1Var3.getValue()).booleanValue(), ((Boolean) b1Var4.getValue()).booleanValue(), sVar, 0);
            boolean zBooleanValue = ((Boolean) b1Var2.getValue()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) b1Var3.getValue()).booleanValue();
            boolean zBooleanValue3 = ((Boolean) b1Var4.getValue()).booleanValue();
            Object objM6 = sVar.M();
            if (objM6 == fVar) {
                objM6 = new p0(b1Var2, 20);
                sVar.k0(objM6);
            }
            Function1 function1 = (Function1) objM6;
            Object objM7 = sVar.M();
            if (objM7 == fVar) {
                objM7 = new p0(b1Var3, 21);
                sVar.k0(objM7);
            }
            Function1 function12 = (Function1) objM7;
            Object objM8 = sVar.M();
            if (objM8 == fVar) {
                objM8 = new p0(b1Var4, 22);
                sVar.k0(objM8);
            }
            d(zBooleanValue, zBooleanValue2, zBooleanValue3, function1, function12, (Function1) objM8, sVar, 224256);
            r9.d("Choice Chip", c.D(qVar, 0.0f, mVar.f44008d, 0.0f, 0.0f, 13), hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, 6, 0, 131064);
            r9.d("Single variant", c.D(qVar, 0.0f, 0.0f, 0.0f, mVar.l, 7), hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43960i, sVar, 6, 0, 131064);
            Object objM9 = sVar.M();
            if (objM9 == fVar) {
                objM9 = m3.i.w(Boolean.TRUE);
                sVar.k0(objM9);
            }
            b1 b1Var5 = (b1) objM9;
            Object objM10 = sVar.M();
            if (objM10 == fVar) {
                objM10 = m3.i.w(Boolean.TRUE);
                sVar.k0(objM10);
            }
            b1 b1Var6 = (b1) objM10;
            Object objM11 = sVar.M();
            if (objM11 == fVar) {
                objM11 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM11);
            }
            b1 b1Var7 = (b1) objM11;
            boolean zBooleanValue4 = ((Boolean) b1Var6.getValue()).booleanValue();
            boolean zBooleanValue5 = ((Boolean) b1Var5.getValue()).booleanValue();
            boolean zBooleanValue6 = ((Boolean) b1Var7.getValue()).booleanValue();
            Object objM12 = sVar.M();
            if (objM12 == fVar) {
                objM12 = new iu.a(20);
                sVar.k0(objM12);
            }
            PantryChoiceChipKt.PantryChoiceChip("Option", zBooleanValue4, (Function0) objM12, null, null, zBooleanValue5, zBooleanValue6, sVar, 390, 24);
            boolean zBooleanValue7 = ((Boolean) b1Var5.getValue()).booleanValue();
            boolean zBooleanValue8 = ((Boolean) b1Var6.getValue()).booleanValue();
            boolean zBooleanValue9 = ((Boolean) b1Var7.getValue()).booleanValue();
            Object objM13 = sVar.M();
            if (objM13 == fVar) {
                objM13 = new p0(b1Var5, 23);
                sVar.k0(objM13);
            }
            Function1 function13 = (Function1) objM13;
            Object objM14 = sVar.M();
            if (objM14 == fVar) {
                objM14 = new p0(b1Var6, 24);
                sVar.k0(objM14);
            }
            Function1 function14 = (Function1) objM14;
            Object objM15 = sVar.M();
            if (objM15 == fVar) {
                objM15 = new p0(b1Var7, 15);
                sVar.k0(objM15);
            }
            d(zBooleanValue7, zBooleanValue8, zBooleanValue9, function13, function14, (Function1) objM15, sVar, 224256);
            r9.d("Filter Chip", c.D(qVar, 0.0f, mVar.f44008d, 0.0f, 0.0f, 13), hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, 6, 0, 131064);
            sVar = sVar;
            Object objM16 = sVar.M();
            if (objM16 == fVar) {
                objM16 = m3.i.w(ChipVariant.TextOnly);
                sVar.k0(objM16);
            }
            b1 b1Var8 = (b1) objM16;
            Object objM17 = sVar.M();
            if (objM17 == fVar) {
                objM17 = m3.i.w(Boolean.TRUE);
                sVar.k0(objM17);
            }
            b1 b1Var9 = (b1) objM17;
            Object objM18 = sVar.M();
            if (objM18 == fVar) {
                objM18 = m3.i.w(Boolean.TRUE);
                sVar.k0(objM18);
            }
            b1 b1Var10 = (b1) objM18;
            Object objM19 = sVar.M();
            if (objM19 == fVar) {
                objM19 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM19);
            }
            b1 b1Var11 = (b1) objM19;
            ChipVariant chipVariant2 = (ChipVariant) b1Var8.getValue();
            Object objM20 = sVar.M();
            if (objM20 == fVar) {
                objM20 = new p0(b1Var8, 16);
                sVar.k0(objM20);
            }
            e(chipVariant2, (Function1) objM20, sVar, 48);
            b((ChipVariant) b1Var8.getValue(), ((Boolean) b1Var9.getValue()).booleanValue(), ((Boolean) b1Var10.getValue()).booleanValue(), ((Boolean) b1Var11.getValue()).booleanValue(), sVar, 0);
            boolean zBooleanValue10 = ((Boolean) b1Var9.getValue()).booleanValue();
            boolean zBooleanValue11 = ((Boolean) b1Var10.getValue()).booleanValue();
            boolean zBooleanValue12 = ((Boolean) b1Var11.getValue()).booleanValue();
            Object objM21 = sVar.M();
            if (objM21 == fVar) {
                i12 = 17;
                objM21 = new p0(b1Var9, 17);
                sVar.k0(objM21);
            } else {
                i12 = 17;
            }
            Function1 function15 = (Function1) objM21;
            Object objM22 = sVar.M();
            if (objM22 == fVar) {
                objM22 = new p0(b1Var10, 18);
                sVar.k0(objM22);
            }
            Function1 function16 = (Function1) objM22;
            Object objM23 = sVar.M();
            if (objM23 == fVar) {
                objM23 = new p0(b1Var11, 19);
                sVar.k0(objM23);
            }
            d(zBooleanValue10, zBooleanValue11, zBooleanValue12, function15, function16, (Function1) objM23, sVar, 224256);
            sVar.q(true);
        } else {
            i12 = 17;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c60.b(i11, i12);
        }
    }

    public static final void a(String str, boolean z11, Function1 function1, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(-328906106);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.g(z11) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(function1) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            j jVar = (j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            h hVar = (h) sVar.j(PantryThemeKt.getLocalPantryColor());
            t tVarD = m2.d(q.f5711a, 1.0f);
            i2 i2VarA = h2.a(i.f13807g, d.f5693k, sVar, 54);
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
            r9.d(str, new n1(1.0f, true), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, i12 & 14, 0, 131064);
            sVar = sVar;
            PantrySwitchKt.LargePantrySwitch(z11, null, function1, true, sVar, ((i12 >> 3) & 14) | 3072 | (i12 & 896), 2);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new m3(i11, 6, str, function1, z11);
        }
    }

    public static final void b(ChipVariant chipVariant, boolean z11, boolean z12, boolean z13, n nVar, int i11) {
        ChipVariant chipVariant2;
        s sVar = (s) nVar;
        sVar.c0(-1151484488);
        int i12 = i11 | (sVar.d(chipVariant.ordinal()) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.g(z12) ? 256 : 128) | (sVar.g(z13) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            chipVariant2 = chipVariant;
            Function2<n, Integer, Unit> lambda$1242516022$app_release = chipVariant2 == ChipVariant.Icon ? ComposableSingletons$DemoPantryChipKt.INSTANCE.getLambda$1242516022$app_release() : null;
            int i13 = WhenMappings.$EnumSwitchMapping$0[chipVariant2.ordinal()];
            f fVar = m3.m.f29332a;
            if (i13 == 1) {
                sVar.a0(1524984224);
                Object objM = sVar.M();
                if (objM == fVar) {
                    objM = new iu.a(14);
                    sVar.k0(objM);
                }
                TextOnlyFilterChipKt.TextOnlyFilterChip("Filter", z12, (Function0) objM, null, null, z11, z13, lambda$1242516022$app_release, sVar, ((i12 >> 3) & 112) | 390 | ((i12 << 12) & 458752) | ((i12 << 9) & 3670016), 24);
                sVar.q(false);
            } else if (i13 == 2) {
                sVar.a0(1524992572);
                Object objM2 = sVar.M();
                if (objM2 == fVar) {
                    objM2 = new iu.a(15);
                    sVar.k0(objM2);
                }
                IconFilterChipKt.IconFilterChip("Filter", z12, (Function0) objM2, null, null, z11, z13, lambda$1242516022$app_release, sVar, ((i12 >> 3) & 112) | 390 | ((i12 << 12) & 458752) | ((i12 << 9) & 3670016), 24);
                sVar.q(false);
            } else {
                if (i13 != 3) {
                    throw e0.f.v(sVar, 1524983712, false);
                }
                sVar.a0(1525001345);
                Object objM3 = sVar.M();
                if (objM3 == fVar) {
                    objM3 = new iu.a(16);
                    sVar.k0(objM3);
                }
                AvatarFilterChipKt.AvatarFilterChip("Filter", z12, (Function0) objM3, null, null, z11, z13, ComposableSingletons$DemoPantryChipKt.INSTANCE.m721getLambda$1757395545$app_release(), sVar, ((i12 >> 3) & 112) | 12583302 | ((i12 << 12) & 458752) | ((i12 << 9) & 3670016), 24);
                sVar.q(false);
            }
        } else {
            chipVariant2 = chipVariant;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new j60.b(chipVariant2, z11, z12, z13, i11, 0);
        }
    }

    public static final void c(ChipVariant chipVariant, boolean z11, boolean z12, boolean z13, n nVar, int i11) {
        ChipVariant chipVariant2;
        s sVar = (s) nVar;
        sVar.c0(-817566544);
        int i12 = i11 | (sVar.d(chipVariant.ordinal()) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.g(z12) ? 256 : 128) | (sVar.g(z13) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            chipVariant2 = chipVariant;
            Function2<n, Integer, Unit> lambda$919676786$app_release = chipVariant2 == ChipVariant.Icon ? ComposableSingletons$DemoPantryChipKt.INSTANCE.getLambda$919676786$app_release() : null;
            int i13 = WhenMappings.$EnumSwitchMapping$0[chipVariant2.ordinal()];
            f fVar = m3.m.f29332a;
            if (i13 == 1) {
                sVar.a0(297581310);
                Object objM = sVar.M();
                if (objM == fVar) {
                    objM = new iu.a(17);
                    sVar.k0(objM);
                }
                TextOnlySelectionChipKt.TextOnlySelectionChip("Selection", z12, (Function0) objM, null, null, z11, z13, lambda$919676786$app_release, sVar, ((i12 >> 3) & 112) | 390 | ((i12 << 12) & 458752) | ((i12 << 9) & 3670016), 24);
                sVar.q(false);
            } else if (i13 == 2) {
                sVar.a0(297589850);
                Object objM2 = sVar.M();
                if (objM2 == fVar) {
                    objM2 = new iu.a(18);
                    sVar.k0(objM2);
                }
                IconSelectionChipKt.IconSelectionChip("Selection", z12, (Function0) objM2, null, null, z11, z13, lambda$919676786$app_release, sVar, ((i12 >> 3) & 112) | 390 | ((i12 << 12) & 458752) | ((i12 << 9) & 3670016), 24);
                sVar.q(false);
            } else {
                if (i13 != 3) {
                    throw e0.f.v(sVar, 297580810, false);
                }
                sVar.a0(297598815);
                Object objM3 = sVar.M();
                if (objM3 == fVar) {
                    objM3 = new iu.a(19);
                    sVar.k0(objM3);
                }
                AvatarSelectionChipKt.AvatarSelectionChip("Selection", z12, (Function0) objM3, null, null, z11, z13, ComposableSingletons$DemoPantryChipKt.INSTANCE.getLambda$144531901$app_release(), sVar, ((i12 >> 3) & 112) | 12583302 | ((i12 << 12) & 458752) | ((i12 << 9) & 3670016), 24);
                sVar.q(false);
            }
        } else {
            chipVariant2 = chipVariant;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new j60.b(chipVariant2, z11, z12, z13, i11, 1);
        }
    }

    public static final void d(final boolean z11, final boolean z12, final boolean z13, Function1 function1, Function1 function12, Function1 function13, n nVar, final int i11) {
        Function1 function14;
        Function1 function15;
        Function1 function16;
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.c0(-1425046225);
        int i12 = i11 | (sVar2.g(z11) ? 4 : 2) | (sVar2.g(z12) ? 32 : 16) | (sVar2.g(z13) ? 256 : 128);
        if (sVar2.R(i12 & 1, (i12 & 74899) != 74898)) {
            m mVar = (m) sVar2.j(PantryThemeKt.getLocalPantrySpacing());
            float f11 = mVar.f44008d;
            q qVar = q.f5711a;
            t tVarD = c.D(qVar, 0.0f, f11, 0.0f, 0.0f, 13);
            b bVar = i.f13801a;
            y yVarA = w.a(i.g(mVar.l), d.f5694m, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            t tVarC = a.c(tVarD, sVar2);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
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
            r9.d("States", c.D(qVar, 0.0f, 0.0f, 0.0f, mVar.l, 7), ((h) sVar2.j(PantryThemeKt.getLocalPantryColor())).J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((j) sVar2.j(PantryThemeKt.getLocalPantryTypography())).f43959h, sVar2, 6, 0, 131064);
            sVar = sVar2;
            function14 = function1;
            a("Enabled", z11, function14, sVar, ((i12 << 3) & 112) | 390);
            function15 = function12;
            a(ChipSemanticsKt.CHIP_STATE_DESCRIPTION_SELECTED, z12, function15, sVar, (i12 & 112) | 390);
            function16 = function13;
            a("Elevated", z13, function16, sVar, ((i12 >> 3) & 112) | 390);
            sVar.q(true);
        } else {
            function14 = function1;
            function15 = function12;
            function16 = function13;
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            final Function1 function17 = function16;
            final Function1 function18 = function14;
            final Function1 function19 = function15;
            w1VarS.f29476d = new Function2(z11, z12, z13, function18, function19, function17, i11) { // from class: j60.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f24751a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f24752b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f24753c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Function1 f24754d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Function1 f24755e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ Function1 f24756f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(224257);
                    DemoPantryChipKt.d(this.f24751a, this.f24752b, this.f24753c, this.f24754d, this.f24755e, this.f24756f, (n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void e(ChipVariant chipVariant, Function1 function1, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-1141195937);
        int i12 = i11 | (sVar.d(chipVariant.ordinal()) ? 4 : 2);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            j jVar = (j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            h hVar = (h) sVar.j(PantryThemeKt.getLocalPantryColor());
            m mVar = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            u0 u0Var = jVar.f43959h;
            long j9 = hVar.J;
            float f11 = mVar.l;
            q qVar = q.f5711a;
            r9.d("Variant", c.D(qVar, 0.0f, 0.0f, 0.0f, f11, 7), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, 6, 0, 131064);
            sVar = sVar;
            g6.c(m2.d(c.D(qVar, 0.0f, 0.0f, 0.0f, mVar.l, 7), 1.0f), 0.0f, e.e(-1983980118, sVar, new u1(14, chipVariant, function1)), sVar, MLKEMEngine.KyberPolyBytes);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new gn.i(chipVariant, function1, i11, 20);
        }
    }
}
