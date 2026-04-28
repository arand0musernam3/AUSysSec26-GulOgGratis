package com.tgtg.componentlibrary.component.radiobutton.ext;

import com.braze.models.FeatureFlag;
import com.tgtg.componentlibrary.component.radiobutton.model.RadioButtonColors;
import kotlin.Metadata;
import m3.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/tgtg/componentlibrary/component/radiobutton/model/RadioButtonColors;", "", FeatureFlag.ENABLED, "selected", "Li4/v;", "radioDotColor", "(Lcom/tgtg/componentlibrary/component/radiobutton/model/RadioButtonColors;ZZLm3/n;I)J", "radioBorderColor", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class RadioButtonColorsExtKt {
    public static final long radioBorderColor(@NotNull RadioButtonColors radioButtonColors, boolean z11, boolean z12, @Nullable n nVar, int i11) {
        radioButtonColors.getClass();
        return (z11 && z12) ? radioButtonColors.m924getSelectedBorderColor0d7_KjU() : (!z11 || z12) ? (z11 || !z12) ? radioButtonColors.m922getDisabledUnselectedBorderColor0d7_KjU() : radioButtonColors.m920getDisabledSelectedBorderColor0d7_KjU() : radioButtonColors.m926getUnselectedBorderColor0d7_KjU();
    }

    public static final long radioDotColor(@NotNull RadioButtonColors radioButtonColors, boolean z11, boolean z12, @Nullable n nVar, int i11) {
        radioButtonColors.getClass();
        return (z11 && z12) ? radioButtonColors.m925getSelectedDotColor0d7_KjU() : (!z11 || z12) ? (z11 || !z12) ? radioButtonColors.m922getDisabledUnselectedBorderColor0d7_KjU() : radioButtonColors.m921getDisabledSelectedDotColor0d7_KjU() : radioButtonColors.m926getUnselectedBorderColor0d7_KjU();
    }
}
