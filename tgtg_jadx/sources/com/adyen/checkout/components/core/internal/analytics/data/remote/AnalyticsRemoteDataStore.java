package com.adyen.checkout.components.core.internal.analytics.data.remote;

import com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupRequest;
import com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupResponse;
import com.adyen.checkout.components.core.internal.data.model.AnalyticsTrackRequest;
import com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/data/remote/AnalyticsRemoteDataStore;", "", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupRequest;", "request", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupResponse;", "fetchCheckoutAttemptId", "(Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackRequest;", "", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, "", "sendEvents", "(Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackRequest;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "", "getInfoSize", "()I", "infoSize", "getLogSize", "logSize", "getErrorSize", "errorSize", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AnalyticsRemoteDataStore {
    @Nullable
    Object fetchCheckoutAttemptId(@NotNull AnalyticsSetupRequest analyticsSetupRequest, @NotNull c<? super AnalyticsSetupResponse> cVar);

    int getErrorSize();

    int getInfoSize();

    int getLogSize();

    @Nullable
    Object sendEvents(@NotNull AnalyticsTrackRequest analyticsTrackRequest, @NotNull String str, @NotNull c<? super Unit> cVar);
}
