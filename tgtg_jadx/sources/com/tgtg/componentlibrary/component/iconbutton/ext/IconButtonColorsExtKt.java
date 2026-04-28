package com.tgtg.componentlibrary.component.iconbutton.ext;

import com.braze.models.FeatureFlag;
import com.tgtg.componentlibrary.component.iconbutton.model.IconButtonColors;
import com.tgtg.componentlibrary.component.iconbutton.model.IconButtonVariant;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import e40.a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.n;
import m3.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x60.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\b\u001a\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/tgtg/componentlibrary/component/iconbutton/model/IconButtonColors;", "", FeatureFlag.ENABLED, "isHovered", "isPressed", "isLoading", "Li4/v;", "containerColor", "(Lcom/tgtg/componentlibrary/component/iconbutton/model/IconButtonColors;ZZZZLm3/n;I)J", "contentColor", "Lcom/tgtg/componentlibrary/component/iconbutton/model/IconButtonVariant;", "variant", "iconButtonColorsFor", "(Lcom/tgtg/componentlibrary/component/iconbutton/model/IconButtonVariant;Lm3/n;I)Lcom/tgtg/componentlibrary/component/iconbutton/model/IconButtonColors;", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIconButtonColorsExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButtonColorsExt.kt\ncom/tgtg/componentlibrary/component/iconbutton/ext/IconButtonColorsExtKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,86:1\n75#2:87\n*S KotlinDebug\n*F\n+ 1 IconButtonColorsExt.kt\ncom/tgtg/componentlibrary/component/iconbutton/ext/IconButtonColorsExtKt\n*L\n43#1:87\n*E\n"})
public final class IconButtonColorsExtKt {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IconButtonVariant.values().length];
            try {
                iArr[IconButtonVariant.Subtle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconButtonVariant.IconOnly.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IconButtonVariant.Accent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final long containerColor(@NotNull IconButtonColors iconButtonColors, boolean z11, boolean z12, boolean z13, boolean z14, @Nullable n nVar, int i11) {
        iconButtonColors.getClass();
        return !z11 ? iconButtonColors.m830getContainerColorDisabled0d7_KjU() : z13 ? iconButtonColors.m833getContainerColorPressed0d7_KjU() : z12 ? iconButtonColors.m831getContainerColorHover0d7_KjU() : z14 ? iconButtonColors.m832getContainerColorLoading0d7_KjU() : iconButtonColors.m829getContainerColor0d7_KjU();
    }

    public static final long contentColor(@NotNull IconButtonColors iconButtonColors, boolean z11, boolean z12, boolean z13, boolean z14, @Nullable n nVar, int i11) {
        iconButtonColors.getClass();
        return !z11 ? iconButtonColors.m835getContentColorDisabled0d7_KjU() : z13 ? iconButtonColors.m838getContentColorPressed0d7_KjU() : z12 ? iconButtonColors.m836getContentColorHover0d7_KjU() : z14 ? iconButtonColors.m837getContentColorLoading0d7_KjU() : iconButtonColors.m834getContentColor0d7_KjU();
    }

    @NotNull
    public static final IconButtonColors iconButtonColorsFor(@NotNull IconButtonVariant iconButtonVariant, @Nullable n nVar, int i11) {
        iconButtonVariant.getClass();
        h hVar = (h) ((s) nVar).j(PantryThemeKt.getLocalPantryColor());
        int i12 = WhenMappings.$EnumSwitchMapping$0[iconButtonVariant.ordinal()];
        if (i12 == 1) {
            long j9 = hVar.f43917g;
            long j11 = hVar.J;
            return new IconButtonColors(j9, j11, hVar.f43934p, j11, j9, j11, hVar.A, hVar.V, j9, j11, hVar.f43927l0, null);
        }
        if (i12 == 2) {
            long j12 = hVar.f43944u0;
            long j13 = hVar.J;
            return new IconButtonColors(j12, j13, hVar.f43930n, j13, hVar.f43932o, j13, j12, hVar.V, j12, j13, hVar.f43927l0, null);
        }
        if (i12 != 3) {
            a.f();
            return null;
        }
        long j14 = hVar.f43923j;
        long j15 = hVar.W;
        return new IconButtonColors(j14, j15, hVar.f43919h, j15, hVar.f43921i, j15, hVar.A, hVar.V, j14, j15, hVar.f43927l0, null);
    }
}
