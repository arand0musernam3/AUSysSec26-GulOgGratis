package com.adyen.checkout.components.core.internal.analytics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "", "owner", "Lv80/b0;", "coroutineScope", "", "initialize", "(Ljava/lang/Object;Lv80/b0;)V", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent;", "event", "trackEvent", "(Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent;)V", "", "getCheckoutAttemptId", "()Ljava/lang/String;", "clear", "(Ljava/lang/Object;)V", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AnalyticsManager {
    void clear(@NotNull Object owner);

    @NotNull
    String getCheckoutAttemptId();

    void initialize(@NotNull Object owner, @NotNull b0 coroutineScope);

    void trackEvent(@NotNull AnalyticsEvent event);
}
