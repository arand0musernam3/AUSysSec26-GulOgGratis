package com.adyen.checkout.components.core.internal.ui.model;

import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.core.Environment;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jj\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001f\u0010\u0016¨\u0006/"}, d2 = {"Lcom/adyen/checkout/components/core/internal/ui/model/SessionParams;", "", "environment", "Lcom/adyen/checkout/core/Environment;", "clientKey", "", "enableStoreDetails", "", "installmentConfiguration", "Lcom/adyen/checkout/components/core/internal/ui/model/SessionInstallmentConfiguration;", "showRemovePaymentMethodButton", "amount", "Lcom/adyen/checkout/components/core/Amount;", "returnUrl", "shopperLocale", "Ljava/util/Locale;", "(Lcom/adyen/checkout/core/Environment;Ljava/lang/String;Ljava/lang/Boolean;Lcom/adyen/checkout/components/core/internal/ui/model/SessionInstallmentConfiguration;Ljava/lang/Boolean;Lcom/adyen/checkout/components/core/Amount;Ljava/lang/String;Ljava/util/Locale;)V", "getAmount", "()Lcom/adyen/checkout/components/core/Amount;", "getClientKey", "()Ljava/lang/String;", "getEnableStoreDetails", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEnvironment", "()Lcom/adyen/checkout/core/Environment;", "getInstallmentConfiguration", "()Lcom/adyen/checkout/components/core/internal/ui/model/SessionInstallmentConfiguration;", "getReturnUrl", "getShopperLocale", "()Ljava/util/Locale;", "getShowRemovePaymentMethodButton", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/adyen/checkout/core/Environment;Ljava/lang/String;Ljava/lang/Boolean;Lcom/adyen/checkout/components/core/internal/ui/model/SessionInstallmentConfiguration;Ljava/lang/Boolean;Lcom/adyen/checkout/components/core/Amount;Ljava/lang/String;Ljava/util/Locale;)Lcom/adyen/checkout/components/core/internal/ui/model/SessionParams;", "equals", "other", "hashCode", "", "toString", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionParams {

    @Nullable
    private final Amount amount;

    @NotNull
    private final String clientKey;

    @Nullable
    private final Boolean enableStoreDetails;

    @NotNull
    private final Environment environment;

    @Nullable
    private final SessionInstallmentConfiguration installmentConfiguration;

    @Nullable
    private final String returnUrl;

    @Nullable
    private final Locale shopperLocale;

    @Nullable
    private final Boolean showRemovePaymentMethodButton;

    public SessionParams(@NotNull Environment environment, @NotNull String str, @Nullable Boolean bool, @Nullable SessionInstallmentConfiguration sessionInstallmentConfiguration, @Nullable Boolean bool2, @Nullable Amount amount, @Nullable String str2, @Nullable Locale locale) {
        environment.getClass();
        str.getClass();
        this.environment = environment;
        this.clientKey = str;
        this.enableStoreDetails = bool;
        this.installmentConfiguration = sessionInstallmentConfiguration;
        this.showRemovePaymentMethodButton = bool2;
        this.amount = amount;
        this.returnUrl = str2;
        this.shopperLocale = locale;
    }

    public static /* synthetic */ SessionParams copy$default(SessionParams sessionParams, Environment environment, String str, Boolean bool, SessionInstallmentConfiguration sessionInstallmentConfiguration, Boolean bool2, Amount amount, String str2, Locale locale, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            environment = sessionParams.environment;
        }
        if ((i11 & 2) != 0) {
            str = sessionParams.clientKey;
        }
        if ((i11 & 4) != 0) {
            bool = sessionParams.enableStoreDetails;
        }
        if ((i11 & 8) != 0) {
            sessionInstallmentConfiguration = sessionParams.installmentConfiguration;
        }
        if ((i11 & 16) != 0) {
            bool2 = sessionParams.showRemovePaymentMethodButton;
        }
        if ((i11 & 32) != 0) {
            amount = sessionParams.amount;
        }
        if ((i11 & 64) != 0) {
            str2 = sessionParams.returnUrl;
        }
        if ((i11 & 128) != 0) {
            locale = sessionParams.shopperLocale;
        }
        String str3 = str2;
        Locale locale2 = locale;
        Boolean bool3 = bool2;
        Amount amount2 = amount;
        return sessionParams.copy(environment, str, bool, sessionInstallmentConfiguration, bool3, amount2, str3, locale2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Environment getEnvironment() {
        return this.environment;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getClientKey() {
        return this.clientKey;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getEnableStoreDetails() {
        return this.enableStoreDetails;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SessionInstallmentConfiguration getInstallmentConfiguration() {
        return this.installmentConfiguration;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getShowRemovePaymentMethodButton() {
        return this.showRemovePaymentMethodButton;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Amount getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Locale getShopperLocale() {
        return this.shopperLocale;
    }

    @NotNull
    public final SessionParams copy(@NotNull Environment environment, @NotNull String clientKey, @Nullable Boolean enableStoreDetails, @Nullable SessionInstallmentConfiguration installmentConfiguration, @Nullable Boolean showRemovePaymentMethodButton, @Nullable Amount amount, @Nullable String returnUrl, @Nullable Locale shopperLocale) {
        environment.getClass();
        clientKey.getClass();
        return new SessionParams(environment, clientKey, enableStoreDetails, installmentConfiguration, showRemovePaymentMethodButton, amount, returnUrl, shopperLocale);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionParams)) {
            return false;
        }
        SessionParams sessionParams = (SessionParams) other;
        return Intrinsics.areEqual(this.environment, sessionParams.environment) && Intrinsics.areEqual(this.clientKey, sessionParams.clientKey) && Intrinsics.areEqual(this.enableStoreDetails, sessionParams.enableStoreDetails) && Intrinsics.areEqual(this.installmentConfiguration, sessionParams.installmentConfiguration) && Intrinsics.areEqual(this.showRemovePaymentMethodButton, sessionParams.showRemovePaymentMethodButton) && Intrinsics.areEqual(this.amount, sessionParams.amount) && Intrinsics.areEqual(this.returnUrl, sessionParams.returnUrl) && Intrinsics.areEqual(this.shopperLocale, sessionParams.shopperLocale);
    }

    @Nullable
    public final Amount getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getClientKey() {
        return this.clientKey;
    }

    @Nullable
    public final Boolean getEnableStoreDetails() {
        return this.enableStoreDetails;
    }

    @NotNull
    public final Environment getEnvironment() {
        return this.environment;
    }

    @Nullable
    public final SessionInstallmentConfiguration getInstallmentConfiguration() {
        return this.installmentConfiguration;
    }

    @Nullable
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    @Nullable
    public final Locale getShopperLocale() {
        return this.shopperLocale;
    }

    @Nullable
    public final Boolean getShowRemovePaymentMethodButton() {
        return this.showRemovePaymentMethodButton;
    }

    public int hashCode() {
        int iB = l1.b(this.environment.hashCode() * 31, 31, this.clientKey);
        Boolean bool = this.enableStoreDetails;
        int iHashCode = (iB + (bool == null ? 0 : bool.hashCode())) * 31;
        SessionInstallmentConfiguration sessionInstallmentConfiguration = this.installmentConfiguration;
        int iHashCode2 = (iHashCode + (sessionInstallmentConfiguration == null ? 0 : sessionInstallmentConfiguration.hashCode())) * 31;
        Boolean bool2 = this.showRemovePaymentMethodButton;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Amount amount = this.amount;
        int iHashCode4 = (iHashCode3 + (amount == null ? 0 : amount.hashCode())) * 31;
        String str = this.returnUrl;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Locale locale = this.shopperLocale;
        return iHashCode5 + (locale != null ? locale.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SessionParams(environment=" + this.environment + ", clientKey=" + this.clientKey + ", enableStoreDetails=" + this.enableStoreDetails + ", installmentConfiguration=" + this.installmentConfiguration + ", showRemovePaymentMethodButton=" + this.showRemovePaymentMethodButton + ", amount=" + this.amount + ", returnUrl=" + this.returnUrl + ", shopperLocale=" + this.shopperLocale + ")";
    }
}
