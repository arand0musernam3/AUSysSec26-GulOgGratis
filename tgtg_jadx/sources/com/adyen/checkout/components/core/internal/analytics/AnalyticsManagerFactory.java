package com.adyen.checkout.components.core.internal.analytics;

import android.app.Application;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.internal.analytics.data.DefaultAnalyticsRepository;
import com.adyen.checkout.components.core.internal.analytics.data.local.ErrorAnalyticsLocalDataStore;
import com.adyen.checkout.components.core.internal.analytics.data.local.InfoAnalyticsLocalDataStore;
import com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore;
import com.adyen.checkout.components.core.internal.analytics.data.remote.AnalyticsTrackRequestProvider;
import com.adyen.checkout.components.core.internal.analytics.data.remote.DefaultAnalyticsRemoteDataStore;
import com.adyen.checkout.components.core.internal.analytics.data.remote.DefaultAnalyticsSetupProvider;
import com.adyen.checkout.components.core.internal.data.api.AnalyticsService;
import com.adyen.checkout.components.core.internal.ui.model.AnalyticsParams;
import com.adyen.checkout.components.core.internal.ui.model.ComponentParams;
import com.adyen.checkout.core.Environment;
import com.adyen.checkout.core.internal.data.api.HttpClientFactory;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJR\u0010\u0003\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f¨\u0006\u0019"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManagerFactory;", "", "()V", "provide", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "componentParams", "Lcom/adyen/checkout/components/core/internal/ui/model/ComponentParams;", "application", "Landroid/app/Application;", "source", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsSource;", "sessionId", "", "shopperLocale", "Ljava/util/Locale;", "environment", "Lcom/adyen/checkout/core/Environment;", "clientKey", "analyticsParams", "Lcom/adyen/checkout/components/core/internal/ui/model/AnalyticsParams;", "isCreatedByDropIn", "", "amount", "Lcom/adyen/checkout/components/core/Amount;", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AnalyticsManagerFactory {
    private static final int ERROR_SIZE = 5;
    private static final int INFO_SIZE = 50;
    private static final int LOG_SIZE = 5;

    @NotNull
    public final AnalyticsManager provide(@NotNull Locale shopperLocale, @NotNull Environment environment, @NotNull String clientKey, @NotNull AnalyticsParams analyticsParams, boolean isCreatedByDropIn, @Nullable Amount amount, @NotNull Application application, @NotNull AnalyticsSource source, @Nullable String sessionId) {
        shopperLocale.getClass();
        environment.getClass();
        clientKey.getClass();
        analyticsParams.getClass();
        application.getClass();
        source.getClass();
        return new DefaultAnalyticsManager(new DefaultAnalyticsRepository(new InfoAnalyticsLocalDataStore(), new LogAnalyticsLocalDataStore(), new ErrorAnalyticsLocalDataStore(), new DefaultAnalyticsRemoteDataStore(new AnalyticsService(HttpClientFactory.INSTANCE.getAnalyticsHttpClient(environment), null, 2, null), clientKey, 50, 5, 5), new DefaultAnalyticsSetupProvider(application, shopperLocale, isCreatedByDropIn, analyticsParams.getLevel(), amount, source, sessionId), new AnalyticsTrackRequestProvider()), analyticsParams, null, 4, null);
    }

    @NotNull
    public final AnalyticsManager provide(@NotNull ComponentParams componentParams, @NotNull Application application, @NotNull AnalyticsSource source, @Nullable String sessionId) {
        componentParams.getClass();
        application.getClass();
        source.getClass();
        return provide(componentParams.getShopperLocale(), componentParams.getEnvironment(), componentParams.getClientKey(), componentParams.getAnalyticsParams(), componentParams.isCreatedByDropIn(), componentParams.getAmount(), application, source, sessionId);
    }
}
