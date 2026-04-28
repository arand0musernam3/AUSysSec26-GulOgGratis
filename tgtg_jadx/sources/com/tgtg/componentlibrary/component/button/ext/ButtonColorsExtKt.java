package com.tgtg.componentlibrary.component.button.ext;

import com.braze.models.FeatureFlag;
import com.tgtg.componentlibrary.component.button.model.ButtonColors;
import com.tgtg.componentlibrary.component.button.model.ButtonVariant;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import e40.a;
import i4.v;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.n;
import m3.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x60.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\b\u0010\u0007\u001a\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tgtg/componentlibrary/component/button/model/ButtonColors;", "", FeatureFlag.ENABLED, "isHovered", "isPressed", "Li4/v;", "containerColor", "(Lcom/tgtg/componentlibrary/component/button/model/ButtonColors;ZZZLm3/n;I)J", "contentColor", "Lcom/tgtg/componentlibrary/component/button/model/ButtonVariant;", "variant", "buttonColorsFor", "(Lcom/tgtg/componentlibrary/component/button/model/ButtonVariant;Lm3/n;I)Lcom/tgtg/componentlibrary/component/button/model/ButtonColors;", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nButtonColorsExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ButtonColorsExt.kt\ncom/tgtg/componentlibrary/component/button/ext/ButtonColorsExtKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,90:1\n75#2:91\n*S KotlinDebug\n*F\n+ 1 ButtonColorsExt.kt\ncom/tgtg/componentlibrary/component/button/ext/ButtonColorsExtKt\n*L\n31#1:91\n*E\n"})
public final class ButtonColorsExtKt {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonVariant.values().length];
            try {
                iArr[ButtonVariant.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonVariant.Subtle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonVariant.TextTransparent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonVariant.Accent.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ButtonVariant.Negative.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final ButtonColors buttonColorsFor(@NotNull ButtonVariant buttonVariant, @Nullable n nVar, int i11) {
        buttonVariant.getClass();
        h hVar = (h) ((s) nVar).j(PantryThemeKt.getLocalPantryColor());
        int i12 = WhenMappings.$EnumSwitchMapping$0[buttonVariant.ordinal()];
        if (i12 == 1) {
            long j9 = hVar.f43925k;
            long j11 = hVar.f43906a0;
            return new ButtonColors(j9, j11, hVar.l, j11, hVar.f43928m, j11, hVar.A, hVar.V, hVar.f43927l0, null);
        }
        if (i12 == 2) {
            long j12 = hVar.f43917g;
            long j13 = hVar.J;
            return new ButtonColors(j12, j13, hVar.f43934p, j13, hVar.f43936q, j13, hVar.A, hVar.V, hVar.f43927l0, null);
        }
        if (i12 == 3) {
            int i13 = v.f23316i;
            long j14 = v.f23314g;
            long j15 = hVar.J;
            return new ButtonColors(j14, j15, hVar.f43930n, j15, hVar.f43932o, j15, j14, hVar.V, hVar.f43927l0, null);
        }
        if (i12 == 4) {
            long j16 = hVar.f43923j;
            long j17 = hVar.W;
            return new ButtonColors(j16, j17, hVar.f43919h, j17, hVar.f43921i, j17, hVar.A, hVar.V, hVar.f43927l0, null);
        }
        if (i12 != 5) {
            a.f();
            return null;
        }
        long j18 = hVar.f43940s;
        long j19 = hVar.L;
        return new ButtonColors(j18, j19, hVar.f43942t, j19, hVar.f43943u, j19, hVar.A, hVar.V, hVar.f43927l0, null);
    }

    public static final long containerColor(@NotNull ButtonColors buttonColors, boolean z11, boolean z12, boolean z13, @Nullable n nVar, int i11) {
        buttonColors.getClass();
        return !z11 ? buttonColors.m625getContainerColorDisabled0d7_KjU() : z13 ? buttonColors.m627getContainerColorPressed0d7_KjU() : z12 ? buttonColors.m626getContainerColorHover0d7_KjU() : buttonColors.m624getContainerColor0d7_KjU();
    }

    public static final long contentColor(@NotNull ButtonColors buttonColors, boolean z11, boolean z12, boolean z13, @Nullable n nVar, int i11) {
        buttonColors.getClass();
        return !z11 ? buttonColors.m629getContentColorDisabled0d7_KjU() : z13 ? buttonColors.m631getContentColorPressed0d7_KjU() : z12 ? buttonColors.m630getContentColorHover0d7_KjU() : buttonColors.m628getContentColor0d7_KjU();
    }
}
