package com.adyen.checkout.components.core.internal.analytics.data.remote;

import com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupRequest;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/data/remote/AnalyticsSetupProvider;", "", "provide", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupRequest;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AnalyticsSetupProvider {
    @NotNull
    AnalyticsSetupRequest provide();
}
