package com.tgtg.componentlibrary.component.chip.ext;

import com.tgtg.componentlibrary.component.chip.model.ChipColors;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import i4.g0;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.n;
import m3.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x60.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a#\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\t\u0010\b\u001a#\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/tgtg/componentlibrary/component/chip/model/ChipColors;", "chipColors", "(Lm3/n;I)Lcom/tgtg/componentlibrary/component/chip/model/ChipColors;", "", "isEnabled", "isSelected", "Li4/v;", "containerColor", "(Lcom/tgtg/componentlibrary/component/chip/model/ChipColors;ZZLm3/n;I)J", "contentColor", "borderColor", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChipColorsExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChipColorsExt.kt\ncom/tgtg/componentlibrary/component/chip/ext/ChipColorsExtKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,51:1\n75#2:52\n*S KotlinDebug\n*F\n+ 1 ChipColorsExt.kt\ncom/tgtg/componentlibrary/component/chip/ext/ChipColorsExtKt\n*L\n11#1:52\n*E\n"})
public final class ChipColorsExtKt {
    public static final long borderColor(@NotNull ChipColors chipColors, boolean z11, boolean z12, @Nullable n nVar, int i11) {
        chipColors.getClass();
        return !z11 ? chipColors.m742getBorderColorDisabled0d7_KjU() : z12 ? chipColors.m743getBorderColorSelected0d7_KjU() : chipColors.m741getBorderColor0d7_KjU();
    }

    @NotNull
    public static final ChipColors chipColors(@Nullable n nVar, int i11) {
        h hVar = (h) ((s) nVar).j(PantryThemeKt.getLocalPantryColor());
        return new ChipColors(hVar.G, hVar.J, hVar.f43947x, hVar.f43908b0, hVar.A, hVar.V, hVar.f43927l0, hVar.f43926k0, hVar.f43935p0, hVar.f43924j0, null);
    }

    public static final long containerColor(@NotNull ChipColors chipColors, boolean z11, boolean z12, @Nullable n nVar, int i11) {
        chipColors.getClass();
        return !z11 ? chipColors.m745getContainerColorDisabled0d7_KjU() : z12 ? g0.k(chipColors.m746getContainerOverlayColorSelected0d7_KjU(), chipColors.m744getContainerColor0d7_KjU()) : chipColors.m744getContainerColor0d7_KjU();
    }

    public static final long contentColor(@NotNull ChipColors chipColors, boolean z11, boolean z12, @Nullable n nVar, int i11) {
        chipColors.getClass();
        return !z11 ? chipColors.m748getContentColorDisabled0d7_KjU() : z12 ? chipColors.m749getContentColorSelected0d7_KjU() : chipColors.m747getContentColor0d7_KjU();
    }
}
