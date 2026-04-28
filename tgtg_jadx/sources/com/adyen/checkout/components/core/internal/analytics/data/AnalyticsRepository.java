package com.adyen.checkout.components.core.internal.analytics.data;

import com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent;
import com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/data/AnalyticsRepository;", "", "", "fetchCheckoutAttemptId", "(Lx70/c;)Ljava/lang/Object;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent;", "event", "", "storeEvent", "(Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent;Lx70/c;)Ljava/lang/Object;", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, "sendEvents", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AnalyticsRepository {
    @Nullable
    Object fetchCheckoutAttemptId(@NotNull c<? super String> cVar);

    @Nullable
    Object sendEvents(@NotNull String str, @NotNull c<? super Unit> cVar);

    @Nullable
    Object storeEvent(@NotNull AnalyticsEvent analyticsEvent, @NotNull c<? super Unit> cVar);
}
