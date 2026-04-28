package com.adyen.checkout.components.core.internal.analytics.data.remote;

import com.adyen.checkout.components.core.internal.data.api.AnalyticsService;
import com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupRequest;
import com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupResponse;
import com.adyen.checkout.components.core.internal.data.model.AnalyticsTrackRequest;
import com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x70.c;
import y70.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/data/remote/DefaultAnalyticsRemoteDataStore;", "Lcom/adyen/checkout/components/core/internal/analytics/data/remote/AnalyticsRemoteDataStore;", "Lcom/adyen/checkout/components/core/internal/data/api/AnalyticsService;", "analyticsService", "", "clientKey", "", "infoSize", "logSize", "errorSize", "<init>", "(Lcom/adyen/checkout/components/core/internal/data/api/AnalyticsService;Ljava/lang/String;III)V", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupRequest;", "request", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupResponse;", "fetchCheckoutAttemptId", "(Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackRequest;", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, "", "sendEvents", "(Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackRequest;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lcom/adyen/checkout/components/core/internal/data/api/AnalyticsService;", "Ljava/lang/String;", "I", "getInfoSize", "()I", "getLogSize", "getErrorSize", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultAnalyticsRemoteDataStore implements AnalyticsRemoteDataStore {

    @NotNull
    private final AnalyticsService analyticsService;

    @NotNull
    private final String clientKey;
    private final int errorSize;
    private final int infoSize;
    private final int logSize;

    public DefaultAnalyticsRemoteDataStore(@NotNull AnalyticsService analyticsService, @NotNull String str, int i11, int i12, int i13) {
        analyticsService.getClass();
        str.getClass();
        this.analyticsService = analyticsService;
        this.clientKey = str;
        this.infoSize = i11;
        this.logSize = i12;
        this.errorSize = i13;
    }

    @Override // com.adyen.checkout.components.core.internal.analytics.data.remote.AnalyticsRemoteDataStore
    @Nullable
    public Object fetchCheckoutAttemptId(@NotNull AnalyticsSetupRequest analyticsSetupRequest, @NotNull c<? super AnalyticsSetupResponse> cVar) {
        return this.analyticsService.setupAnalytics$components_core_release(analyticsSetupRequest, this.clientKey, cVar);
    }

    @Override // com.adyen.checkout.components.core.internal.analytics.data.remote.AnalyticsRemoteDataStore
    public int getErrorSize() {
        return this.errorSize;
    }

    @Override // com.adyen.checkout.components.core.internal.analytics.data.remote.AnalyticsRemoteDataStore
    public int getInfoSize() {
        return this.infoSize;
    }

    @Override // com.adyen.checkout.components.core.internal.analytics.data.remote.AnalyticsRemoteDataStore
    public int getLogSize() {
        return this.logSize;
    }

    @Override // com.adyen.checkout.components.core.internal.analytics.data.remote.AnalyticsRemoteDataStore
    @Nullable
    public Object sendEvents(@NotNull AnalyticsTrackRequest analyticsTrackRequest, @NotNull String str, @NotNull c<? super Unit> cVar) {
        Object objSendEvents$components_core_release = this.analyticsService.sendEvents$components_core_release(analyticsTrackRequest, str, this.clientKey, cVar);
        return objSendEvents$components_core_release == a.COROUTINE_SUSPENDED ? objSendEvents$components_core_release : Unit.f26487a;
    }
}
