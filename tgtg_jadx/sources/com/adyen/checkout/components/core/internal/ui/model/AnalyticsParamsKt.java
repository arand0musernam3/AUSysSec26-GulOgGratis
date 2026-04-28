package com.adyen.checkout.components.core.internal.ui.model;

import com.adyen.checkout.components.core.AnalyticsConfiguration;
import com.adyen.checkout.components.core.AnalyticsLevel;
import e40.a;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002¨\u0006\u0004"}, d2 = {"getLevel", "Lcom/adyen/checkout/components/core/internal/ui/model/AnalyticsParamsLevel;", "analyticsConfiguration", "Lcom/adyen/checkout/components/core/AnalyticsConfiguration;", "components-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AnalyticsParamsKt {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnalyticsLevel.values().length];
            try {
                iArr[AnalyticsLevel.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnalyticsLevel.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnalyticsParamsLevel getLevel(AnalyticsConfiguration analyticsConfiguration) {
        AnalyticsLevel level = analyticsConfiguration != null ? analyticsConfiguration.getLevel() : null;
        int i11 = level == null ? -1 : WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
        if (i11 == -1) {
            return AnalyticsParamsLevel.ALL;
        }
        if (i11 == 1) {
            return AnalyticsParamsLevel.ALL;
        }
        if (i11 == 2) {
            return AnalyticsParamsLevel.INITIAL;
        }
        a.f();
        return null;
    }
}
