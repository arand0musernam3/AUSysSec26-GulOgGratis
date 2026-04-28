package com.tgtg.componentlibrary.component.chip.type.choicechip;

import a.a;
import b2.l;
import b4.q;
import b4.t;
import c60.f;
import com.tgtg.componentlibrary.component.chip.ext.ChipGeometryExtKt;
import com.tgtg.componentlibrary.component.chip.impl.ChipAnimations;
import com.tgtg.componentlibrary.component.chip.impl.ChipAnimationsKt;
import com.tgtg.componentlibrary.component.chip.impl.VariantChipImplKt;
import com.tgtg.componentlibrary.component.chip.model.ChipColors;
import com.tgtg.componentlibrary.component.chip.model.ChipGeometry;
import com.tgtg.componentlibrary.component.chip.model.ChipSemanticsKt;
import com.tgtg.componentlibrary.component.chip.model.ChipState;
import com.tgtg.componentlibrary.component.chip.model.ChipVariant;
import d2.c;
import g3.s5;
import g3.y0;
import i4.v;
import j5.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.b1;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import u3.e;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aW\u0010\f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f²\u0006\f\u0010\u000e\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"", TextBundle.TEXT_ENTRY, "", "isSelected", "Lkotlin/Function0;", "", "onClick", "Lb4/t;", "modifier", "contentDescription", "isEnabled", "isElevated", "PantryChoiceChip", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lb4/t;Ljava/lang/String;ZZLm3/n;II)V", "isFocused", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPantryChoiceChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PantryChoiceChip.kt\ncom/tgtg/componentlibrary/component/chip/type/choicechip/PantryChoiceChipKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,152:1\n1128#2,6:153\n85#3:159\n75#4:160\n*S KotlinDebug\n*F\n+ 1 PantryChoiceChip.kt\ncom/tgtg/componentlibrary/component/chip/type/choicechip/PantryChoiceChipKt\n*L\n74#1:153,6\n75#1:159\n100#1:160\n*E\n"})
public final class PantryChoiceChipKt {
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PantryChoiceChip(@org.jetbrains.annotations.NotNull final java.lang.String r18, final boolean r19, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r20, @org.jetbrains.annotations.Nullable b4.t r21, @org.jetbrains.annotations.Nullable java.lang.String r22, boolean r23, boolean r24, @org.jetbrains.annotations.Nullable m3.n r25, final int r26, final int r27) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tgtg.componentlibrary.component.chip.type.choicechip.PantryChoiceChipKt.PantryChoiceChip(java.lang.String, boolean, kotlin.jvm.functions.Function0, b4.t, java.lang.String, boolean, boolean, m3.n, int, int):void");
    }

    public static final void a(String str, String str2, ChipState chipState, Function0 function0, t tVar, ChipColors chipColors, ChipGeometry chipGeometry, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(1672331713);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(str2) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.f(chipState) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(function0) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.f(tVar) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.f(chipColors) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.f(chipGeometry) ? 1048576 : 524288;
        }
        int i13 = i12;
        if (sVar.R(i13 & 1, (i13 & 599187) != 599186)) {
            Object objM = sVar.M();
            if (objM == m.f29332a) {
                objM = a0.g(sVar);
            }
            l lVar = (l) objM;
            b1 b1VarV = a.v(lVar, sVar, 6);
            ChipAnimations chipAnimationsRememberChipAnimations = ChipAnimationsKt.rememberChipAnimations(chipColors, chipState.isEnabled(), chipState.isSelected(), ChipAnimationsKt.chipAnimationSpec(sVar, 0), sVar, (i13 >> 15) & 14);
            float fBorderSize = ChipGeometryExtKt.borderSize(chipGeometry, chipState.isSelected(), sVar, (i13 >> 18) & 14);
            int i14 = i13 >> 3;
            VariantChipImplKt.m728VariantChipImplRGNGP5c(str, str2, chipState.isSelected(), tVar, ChipVariant.TextOnly, chipGeometry, null, null, e.e(-997522557, sVar, new y0(chipGeometry, 29)), ((v) chipAnimationsRememberChipAnimations.getContainerColor().getValue()).f23317a, ((v) chipAnimationsRememberChipAnimations.getContentColor().getValue()).f23317a, ((v) chipAnimationsRememberChipAnimations.getBorderColor().getValue()).f23317a, fBorderSize, chipGeometry.m784getMinWidthD9Ej5fM(), ((Boolean) b1VarV.getValue()).booleanValue(), chipState.isElevated(), chipColors.m750getFocusRingColor0d7_KjU(), c.A(k2.c.a(q.f5711a, chipState.isSelected(), lVar, s5.a(chipGeometry.m776getCornerRadiusD9Ej5fM(), 4, 0L, true), chipState.isEnabled(), new j(3), function0), chipGeometry.m781getHorizontalPaddingD9Ej5fM(), chipGeometry.m788getVerticalPaddingD9Ej5fM()), ChipSemanticsKt.CHIP_STATE_DESCRIPTION_SELECTED, ChipSemanticsKt.CHIP_STATE_DESCRIPTION_NOT_SELECTED, chipState.isEnabled(), sVar, (i14 & 458752) | (i14 & 7168) | (i13 & 14) | 114843648 | (i13 & 112), 905969664, 0, 0);
            sVar = sVar;
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new f(str, str2, chipState, function0, tVar, chipColors, chipGeometry, i11);
        }
    }
}
