package com.tgtg.componentlibrary.component.chip.impl;

import com.tgtg.componentlibrary.component.chip.ext.ChipColorsExtKt;
import com.tgtg.componentlibrary.component.chip.model.ChipColors;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.n;
import m3.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s1.d1;
import t1.c;
import t1.w;
import t1.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tgtg/componentlibrary/component/chip/model/ChipColors;", "colors", "", "isEnabled", "isSelected", "Lt1/x;", "Li4/v;", "animationSpec", "Lcom/tgtg/componentlibrary/component/chip/impl/ChipAnimations;", "rememberChipAnimations", "(Lcom/tgtg/componentlibrary/component/chip/model/ChipColors;ZZLt1/x;Lm3/n;I)Lcom/tgtg/componentlibrary/component/chip/impl/ChipAnimations;", "chipAnimationSpec", "(Lm3/n;I)Lt1/x;", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChipAnimations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChipAnimations.kt\ncom/tgtg/componentlibrary/component/chip/impl/ChipAnimationsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,55:1\n75#2:56\n*S KotlinDebug\n*F\n+ 1 ChipAnimations.kt\ncom/tgtg/componentlibrary/component/chip/impl/ChipAnimationsKt\n*L\n52#1:56\n*E\n"})
public final class ChipAnimationsKt {
    @NotNull
    public static final x chipAnimationSpec(@Nullable n nVar, int i11) {
        ((x60.n) ((s) nVar).j(PantryThemeKt.getLocalPantryTransition())).getClass();
        return c.k(100, 0, w.f39595c, 2);
    }

    @NotNull
    public static final ChipAnimations rememberChipAnimations(@NotNull ChipColors chipColors, boolean z11, boolean z12, @NotNull x xVar, @Nullable n nVar, int i11) {
        chipColors.getClass();
        xVar.getClass();
        int i12 = i11 & 1022;
        int i13 = (i11 >> 6) & 112;
        return new ChipAnimations(d1.a(ChipColorsExtKt.containerColor(chipColors, z11, z12, nVar, i12), xVar, null, nVar, i13, 12), d1.a(ChipColorsExtKt.contentColor(chipColors, z11, z12, nVar, i12), xVar, null, nVar, i13, 12), d1.a(ChipColorsExtKt.borderColor(chipColors, z11, z12, nVar, i12), xVar, null, nVar, i13, 12));
    }
}
