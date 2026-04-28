package com.tgtg.componentlibrary.component.chip.ext;

import com.tgtg.componentlibrary.component.chip.model.ChipGeometry;
import com.tgtg.componentlibrary.component.chip.model.ChipVariant;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.n;
import m3.s;
import m5.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x60.a;
import x60.j;
import x60.k;
import x60.l;
import x60.m;
import z5.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\b\u0010\u0007\u001a\u001b\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\t\u0010\u0007\u001a\u001b\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\n\u0010\u0007\u001a\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u000b\u0010\u0007\u001a\u001b\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/tgtg/componentlibrary/component/chip/model/ChipGeometry;", "chipGeometry", "(Lm3/n;I)Lcom/tgtg/componentlibrary/component/chip/model/ChipGeometry;", "Lcom/tgtg/componentlibrary/component/chip/model/ChipVariant;", "variant", "Lz5/f;", "endPadding", "(Lcom/tgtg/componentlibrary/component/chip/model/ChipGeometry;Lcom/tgtg/componentlibrary/component/chip/model/ChipVariant;Lm3/n;I)F", "startPadding", "topPadding", "bottomPadding", "minWidth", "", "isSelected", "borderSize", "(Lcom/tgtg/componentlibrary/component/chip/model/ChipGeometry;ZLm3/n;I)F", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChipGeometryExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChipGeometryExt.kt\ncom/tgtg/componentlibrary/component/chip/ext/ChipGeometryExtKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,67:1\n75#2:68\n75#2:69\n75#2:70\n75#2:71\n75#2:72\n*S KotlinDebug\n*F\n+ 1 ChipGeometryExt.kt\ncom/tgtg/componentlibrary/component/chip/ext/ChipGeometryExtKt\n*L\n15#1:68\n16#1:69\n17#1:70\n18#1:71\n19#1:72\n*E\n"})
public final class ChipGeometryExtKt {
    public static final float borderSize(@NotNull ChipGeometry chipGeometry, boolean z11, @Nullable n nVar, int i11) {
        chipGeometry.getClass();
        return z11 ? chipGeometry.m773getBorderSizeSelectedD9Ej5fM() : chipGeometry.m772getBorderSizeD9Ej5fM();
    }

    public static final float bottomPadding(@NotNull ChipGeometry chipGeometry, @NotNull ChipVariant chipVariant, @Nullable n nVar, int i11) {
        chipGeometry.getClass();
        chipVariant.getClass();
        return chipVariant == ChipVariant.Avatar ? chipGeometry.m774getBottomPaddingWithAvatarD9Ej5fM() : chipGeometry.m788getVerticalPaddingD9Ej5fM();
    }

    @NotNull
    public static final ChipGeometry chipGeometry(@Nullable n nVar, int i11) {
        s sVar = (s) nVar;
        l lVar = (l) sVar.j(PantryThemeKt.getLocalPantrySize());
        m mVar = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
        k kVar = (k) sVar.j(PantryThemeKt.getLocalPantryRadius());
        j jVar = (j) sVar.j(PantryThemeKt.getLocalPantryTypography());
        a aVar = (a) sVar.j(PantryThemeKt.getLocalPantryBorder());
        float f11 = lVar.f43991c;
        float f12 = lVar.f43992d;
        float f13 = lVar.f43994f;
        float f14 = mVar.f44017n;
        float f15 = mVar.l;
        float f16 = mVar.f44016m;
        float f17 = kVar.f43979c;
        u0 u0Var = jVar.f43967q;
        float f18 = lVar.f43999k;
        float f19 = lVar.l;
        float f20 = aVar.f43895b;
        float f21 = aVar.f43896c;
        return new ChipGeometry(f11, f12, f13, f14, f15, f16, f17, u0Var, f18, f15, f16, f14, f16, f16, f20, f21, f21, f16, new f(f19), null);
    }

    public static final float endPadding(@NotNull ChipGeometry chipGeometry, @NotNull ChipVariant chipVariant, @Nullable n nVar, int i11) {
        chipGeometry.getClass();
        chipVariant.getClass();
        return chipVariant == ChipVariant.Avatar ? chipGeometry.m777getEndPaddingWithAvatarD9Ej5fM() : chipGeometry.m781getHorizontalPaddingD9Ej5fM();
    }

    public static final float minWidth(@NotNull ChipGeometry chipGeometry, @NotNull ChipVariant chipVariant, @Nullable n nVar, int i11) {
        chipGeometry.getClass();
        chipVariant.getClass();
        return chipVariant == ChipVariant.Avatar ? chipGeometry.m785getMinWidthWithAvatarD9Ej5fM() : chipGeometry.m784getMinWidthD9Ej5fM();
    }

    public static final float startPadding(@NotNull ChipGeometry chipGeometry, @NotNull ChipVariant chipVariant, @Nullable n nVar, int i11) {
        chipGeometry.getClass();
        chipVariant.getClass();
        return chipVariant == ChipVariant.Avatar ? chipGeometry.m786getStartPaddingWithAvatarD9Ej5fM() : chipGeometry.m781getHorizontalPaddingD9Ej5fM();
    }

    public static final float topPadding(@NotNull ChipGeometry chipGeometry, @NotNull ChipVariant chipVariant, @Nullable n nVar, int i11) {
        chipGeometry.getClass();
        chipVariant.getClass();
        return chipVariant == ChipVariant.Avatar ? chipGeometry.m787getTopPaddingWithAvatarD9Ej5fM() : chipGeometry.m788getVerticalPaddingD9Ej5fM();
    }
}
