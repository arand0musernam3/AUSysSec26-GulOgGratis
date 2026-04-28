package com.adyen.checkout.components.core.internal.analytics.data.remote;

import android.app.Application;
import android.os.Build;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsPlatformParams;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsSource;
import com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupRequest;
import com.adyen.checkout.components.core.internal.ui.model.AnalyticsParamsLevel;
import e40.a;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\tH\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/data/remote/DefaultAnalyticsSetupProvider;", "Lcom/adyen/checkout/components/core/internal/analytics/data/remote/AnalyticsSetupProvider;", "application", "Landroid/app/Application;", "shopperLocale", "Ljava/util/Locale;", "isCreatedByDropIn", "", "analyticsLevel", "Lcom/adyen/checkout/components/core/internal/ui/model/AnalyticsParamsLevel;", "amount", "Lcom/adyen/checkout/components/core/Amount;", "source", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsSource;", "sessionId", "", "(Landroid/app/Application;Ljava/util/Locale;ZLcom/adyen/checkout/components/core/internal/ui/model/AnalyticsParamsLevel;Lcom/adyen/checkout/components/core/Amount;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsSource;Ljava/lang/String;)V", "getComponentQueryParameter", "getFlavorQueryParameter", "getLevelQueryParameter", "analyticsParamsLevel", "provide", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupRequest;", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultAnalyticsSetupProvider implements AnalyticsSetupProvider {

    @NotNull
    private static final String ANALYTICS_LEVEL_ALL = "all";

    @NotNull
    private static final String ANALYTICS_LEVEL_INITIAL = "initial";

    @NotNull
    private static final String COMPONENTS = "components";

    @NotNull
    private static final String DROP_IN = "dropin";

    @Nullable
    private final Amount amount;

    @NotNull
    private final AnalyticsParamsLevel analyticsLevel;

    @NotNull
    private final Application application;
    private final boolean isCreatedByDropIn;

    @Nullable
    private final String sessionId;

    @NotNull
    private final Locale shopperLocale;

    @NotNull
    private final AnalyticsSource source;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnalyticsParamsLevel.values().length];
            try {
                iArr[AnalyticsParamsLevel.INITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnalyticsParamsLevel.ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DefaultAnalyticsSetupProvider(@NotNull Application application, @NotNull Locale locale, boolean z11, @NotNull AnalyticsParamsLevel analyticsParamsLevel, @Nullable Amount amount, @NotNull AnalyticsSource analyticsSource, @Nullable String str) {
        application.getClass();
        locale.getClass();
        analyticsParamsLevel.getClass();
        analyticsSource.getClass();
        this.application = application;
        this.shopperLocale = locale;
        this.isCreatedByDropIn = z11;
        this.analyticsLevel = analyticsParamsLevel;
        this.amount = amount;
        this.source = analyticsSource;
        this.sessionId = str;
    }

    private final String getComponentQueryParameter(AnalyticsSource source) {
        if (source instanceof AnalyticsSource.DropIn) {
            return DROP_IN;
        }
        if (source instanceof AnalyticsSource.PaymentComponent) {
            return ((AnalyticsSource.PaymentComponent) source).getPaymentMethodType();
        }
        a.f();
        return null;
    }

    private final String getFlavorQueryParameter(boolean isCreatedByDropIn) {
        return isCreatedByDropIn ? DROP_IN : COMPONENTS;
    }

    private final String getLevelQueryParameter(AnalyticsParamsLevel analyticsParamsLevel) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[analyticsParamsLevel.ordinal()];
        if (i11 == 1) {
            return ANALYTICS_LEVEL_INITIAL;
        }
        if (i11 == 2) {
            return ANALYTICS_LEVEL_ALL;
        }
        a.f();
        return null;
    }

    @Override // com.adyen.checkout.components.core.internal.analytics.data.remote.AnalyticsSetupProvider
    @NotNull
    public AnalyticsSetupRequest provide() {
        AnalyticsPlatformParams analyticsPlatformParams = AnalyticsPlatformParams.INSTANCE;
        String version = analyticsPlatformParams.getVersion();
        String platform = analyticsPlatformParams.getPlatform();
        String languageTag = this.shopperLocale.toLanguageTag();
        String componentQueryParameter = getComponentQueryParameter(this.source);
        String flavorQueryParameter = getFlavorQueryParameter(this.isCreatedByDropIn);
        String levelQueryParameter = getLevelQueryParameter(this.analyticsLevel);
        String str = Build.BRAND;
        String str2 = Build.MODEL;
        String packageName = this.application.getPackageName();
        String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
        int i11 = this.application.getResources().getDisplayMetrics().widthPixels;
        return new AnalyticsSetupRequest(version, AnalyticsPlatformParams.channel, platform, languageTag, componentQueryParameter, flavorQueryParameter, levelQueryParameter, str, str2, packageName, strValueOf, null, Integer.valueOf(i11), this.source.getPaymentMethods(), this.amount, this.sessionId);
    }
}
