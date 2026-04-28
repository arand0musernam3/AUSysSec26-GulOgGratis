package com.adyen.checkout.components.core.internal;

import android.content.Context;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.AnalyticsConfiguration;
import com.adyen.checkout.components.core.internal.BaseConfigurationBuilder;
import com.adyen.checkout.components.core.internal.Configuration;
import com.adyen.checkout.components.core.internal.util.AmountExtensionsKt;
import com.adyen.checkout.components.core.internal.util.ValidationUtils;
import com.adyen.checkout.core.Environment;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.internal.util.LocaleUtil;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00002\u00020\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u001f\b\u0017\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\fB\u001f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u000fJ\u000b\u0010(\u001a\u00028\u0000¢\u0006\u0002\u0010)J\r\u0010*\u001a\u00028\u0000H$¢\u0006\u0002\u0010)J\u0015\u0010\u0014\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¢\u0006\u0002\u0010+J\u0013\u0010\u001a\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010,J\u0013\u0010&\u001a\u00028\u00012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010-R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006."}, d2 = {"Lcom/adyen/checkout/components/core/internal/BaseConfigurationBuilder;", "ConfigurationT", "Lcom/adyen/checkout/components/core/internal/Configuration;", "BuilderT", "", "environment", "Lcom/adyen/checkout/core/Environment;", "clientKey", "", "(Lcom/adyen/checkout/core/Environment;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;)V", "shopperLocale", "Ljava/util/Locale;", "(Ljava/util/Locale;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;)V", "amount", "Lcom/adyen/checkout/components/core/Amount;", "getAmount", "()Lcom/adyen/checkout/components/core/Amount;", "setAmount", "(Lcom/adyen/checkout/components/core/Amount;)V", "analyticsConfiguration", "Lcom/adyen/checkout/components/core/AnalyticsConfiguration;", "getAnalyticsConfiguration", "()Lcom/adyen/checkout/components/core/AnalyticsConfiguration;", "setAnalyticsConfiguration", "(Lcom/adyen/checkout/components/core/AnalyticsConfiguration;)V", "getClientKey", "()Ljava/lang/String;", "setClientKey", "(Ljava/lang/String;)V", "getEnvironment", "()Lcom/adyen/checkout/core/Environment;", "setEnvironment", "(Lcom/adyen/checkout/core/Environment;)V", "getShopperLocale", "()Ljava/util/Locale;", "setShopperLocale", "(Ljava/util/Locale;)V", "build", "()Lcom/adyen/checkout/components/core/internal/Configuration;", "buildInternal", "(Lcom/adyen/checkout/components/core/Amount;)Lcom/adyen/checkout/components/core/internal/BaseConfigurationBuilder;", "(Lcom/adyen/checkout/components/core/AnalyticsConfiguration;)Lcom/adyen/checkout/components/core/internal/BaseConfigurationBuilder;", "(Ljava/util/Locale;)Lcom/adyen/checkout/components/core/internal/BaseConfigurationBuilder;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class BaseConfigurationBuilder<ConfigurationT extends Configuration, BuilderT extends BaseConfigurationBuilder<ConfigurationT, BuilderT>> {

    @Nullable
    private Amount amount;

    @Nullable
    private AnalyticsConfiguration analyticsConfiguration;

    @NotNull
    private String clientKey;

    @NotNull
    private Environment environment;

    @Nullable
    private Locale shopperLocale;

    public BaseConfigurationBuilder(@Nullable Locale locale, @NotNull Environment environment, @NotNull String str) {
        environment.getClass();
        str.getClass();
        this.shopperLocale = locale;
        this.environment = environment;
        this.clientKey = str;
        if (!ValidationUtils.INSTANCE.isClientKeyValid$components_core_release(str, environment)) {
            throw new CheckoutException("Client key is not valid.", null, 2, null);
        }
    }

    @NotNull
    public final ConfigurationT build() {
        Locale locale = this.shopperLocale;
        if (locale == null || LocaleUtil.isValidLocale(locale)) {
            return (ConfigurationT) buildInternal();
        }
        throw new CheckoutException("Invalid shopper locale: " + this.shopperLocale + ".", null, 2, null);
    }

    @NotNull
    public abstract ConfigurationT buildInternal();

    @Nullable
    public final Amount getAmount() {
        return this.amount;
    }

    @Nullable
    public final AnalyticsConfiguration getAnalyticsConfiguration() {
        return this.analyticsConfiguration;
    }

    @NotNull
    public final String getClientKey() {
        return this.clientKey;
    }

    @NotNull
    public final Environment getEnvironment() {
        return this.environment;
    }

    @Nullable
    public final Locale getShopperLocale() {
        return this.shopperLocale;
    }

    @NotNull
    public BuilderT setAmount(@NotNull Amount amount) {
        amount.getClass();
        AmountExtensionsKt.validate(amount);
        this.amount = amount;
        return this;
    }

    @NotNull
    public final BuilderT setAnalyticsConfiguration(@NotNull AnalyticsConfiguration analyticsConfiguration) {
        analyticsConfiguration.getClass();
        this.analyticsConfiguration = analyticsConfiguration;
        return this;
    }

    public final void setClientKey(@NotNull String str) {
        str.getClass();
        this.clientKey = str;
    }

    public final void setEnvironment(@NotNull Environment environment) {
        environment.getClass();
        this.environment = environment;
    }

    @NotNull
    public final BuilderT setShopperLocale(@NotNull Locale shopperLocale) {
        shopperLocale.getClass();
        this.shopperLocale = shopperLocale;
        return this;
    }

    /* JADX INFO: renamed from: setAnalyticsConfiguration, reason: collision with other method in class */
    public final void m83setAnalyticsConfiguration(@Nullable AnalyticsConfiguration analyticsConfiguration) {
        this.analyticsConfiguration = analyticsConfiguration;
    }

    /* JADX INFO: renamed from: setShopperLocale, reason: collision with other method in class */
    public final void m84setShopperLocale(@Nullable Locale locale) {
        this.shopperLocale = locale;
    }

    /* JADX INFO: renamed from: setAmount, reason: collision with other method in class */
    public final void m82setAmount(@Nullable Amount amount) {
        this.amount = amount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseConfigurationBuilder(@NotNull Environment environment, @NotNull String str) {
        this((Locale) null, environment, str);
        environment.getClass();
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @d
    public BaseConfigurationBuilder(@NotNull Context context, @NotNull Environment environment, @NotNull String str) {
        this((Locale) null, environment, str);
        context.getClass();
        environment.getClass();
        str.getClass();
    }
}
