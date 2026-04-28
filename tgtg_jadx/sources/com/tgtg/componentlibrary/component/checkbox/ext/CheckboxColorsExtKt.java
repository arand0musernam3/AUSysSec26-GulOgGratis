package com.tgtg.componentlibrary.component.checkbox.ext;

import com.braze.models.FeatureFlag;
import com.tgtg.componentlibrary.component.checkbox.model.CheckboxColors;
import kotlin.Metadata;
import l5.a;
import m3.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\b\u0010\u0007\u001a\u001b\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tgtg/componentlibrary/component/checkbox/model/CheckboxColors;", "", FeatureFlag.ENABLED, "Ll5/a;", "state", "Li4/v;", "boxColor", "(Lcom/tgtg/componentlibrary/component/checkbox/model/CheckboxColors;ZLl5/a;Lm3/n;I)J", "borderColor", "iconTint", "(Lcom/tgtg/componentlibrary/component/checkbox/model/CheckboxColors;ZLm3/n;I)J", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class CheckboxColorsExtKt {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.Indeterminate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final long borderColor(@NotNull CheckboxColors checkboxColors, boolean z11, @NotNull a aVar, @Nullable n nVar, int i11) {
        checkboxColors.getClass();
        aVar.getClass();
        if (z11) {
            int i12 = WhenMappings.$EnumSwitchMapping$0[aVar.ordinal()];
            if (i12 == 1) {
                return checkboxColors.m693getEnabledCheckedBorderColor0d7_KjU();
            }
            if (i12 == 2) {
                return checkboxColors.m695getEnabledIndeterminateBorderColor0d7_KjU();
            }
            if (i12 == 3) {
                return checkboxColors.m696getEnabledUncheckedBorderColor0d7_KjU();
            }
            e40.a.f();
            return 0L;
        }
        int i13 = WhenMappings.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i13 == 1) {
            return checkboxColors.m684getDisabledCheckedBorderColor0d7_KjU();
        }
        if (i13 == 2) {
            return checkboxColors.m688getDisabledIndeterminateBorderColor0d7_KjU();
        }
        if (i13 == 3) {
            return checkboxColors.m691getDisabledUncheckedBorderColor0d7_KjU();
        }
        e40.a.f();
        return 0L;
    }

    public static final long boxColor(@NotNull CheckboxColors checkboxColors, boolean z11, @NotNull a aVar, @Nullable n nVar, int i11) {
        checkboxColors.getClass();
        aVar.getClass();
        if (z11) {
            int i12 = WhenMappings.$EnumSwitchMapping$0[aVar.ordinal()];
            if (i12 == 1) {
                return checkboxColors.m683getCheckedBoxColor0d7_KjU();
            }
            if (i12 == 2) {
                return checkboxColors.m698getIndeterminateBoxColor0d7_KjU();
            }
            if (i12 == 3) {
                return checkboxColors.m699getUncheckedBoxColor0d7_KjU();
            }
            e40.a.f();
            return 0L;
        }
        int i13 = WhenMappings.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i13 == 1) {
            return checkboxColors.m685getDisabledCheckedBoxColor0d7_KjU();
        }
        if (i13 == 2) {
            return checkboxColors.m689getDisabledIndeterminateBoxColor0d7_KjU();
        }
        if (i13 == 3) {
            return checkboxColors.m692getDisabledUncheckedBoxColor0d7_KjU();
        }
        e40.a.f();
        return 0L;
    }

    public static final long iconTint(@NotNull CheckboxColors checkboxColors, boolean z11, @Nullable n nVar, int i11) {
        checkboxColors.getClass();
        return z11 ? checkboxColors.m694getEnabledIconColor0d7_KjU() : checkboxColors.m687getDisabledIconColor0d7_KjU();
    }
}
