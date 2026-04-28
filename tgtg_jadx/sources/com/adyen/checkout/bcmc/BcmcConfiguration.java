package com.adyen.checkout.bcmc;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.adyen.checkout.action.core.GenericActionConfiguration;
import com.adyen.checkout.action.core.internal.ActionHandlingPaymentMethodConfigurationBuilder;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.AnalyticsConfiguration;
import com.adyen.checkout.components.core.internal.ButtonConfiguration;
import com.adyen.checkout.components.core.internal.ButtonConfigurationBuilder;
import com.adyen.checkout.components.core.internal.Configuration;
import com.adyen.checkout.core.Environment;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001+Be\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\t\u0010$\u001a\u00020%HÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020%HÖ\u0001R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0012\u001a\u00020\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u000f\u0010\u001fR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u0011\u0010\u001fR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\r\u0010\u001fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001a¨\u0006,"}, d2 = {"Lcom/adyen/checkout/bcmc/BcmcConfiguration;", "Lcom/adyen/checkout/components/core/internal/Configuration;", "Lcom/adyen/checkout/components/core/internal/ButtonConfiguration;", "shopperLocale", "Ljava/util/Locale;", "environment", "Lcom/adyen/checkout/core/Environment;", "clientKey", "", "analyticsConfiguration", "Lcom/adyen/checkout/components/core/AnalyticsConfiguration;", "amount", "Lcom/adyen/checkout/components/core/Amount;", "isSubmitButtonVisible", "", "isHolderNameRequired", "shopperReference", "isStorePaymentFieldVisible", "genericActionConfiguration", "Lcom/adyen/checkout/action/core/GenericActionConfiguration;", "(Ljava/util/Locale;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;Lcom/adyen/checkout/components/core/AnalyticsConfiguration;Lcom/adyen/checkout/components/core/Amount;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/adyen/checkout/action/core/GenericActionConfiguration;)V", "getAmount", "()Lcom/adyen/checkout/components/core/Amount;", "getAnalyticsConfiguration", "()Lcom/adyen/checkout/components/core/AnalyticsConfiguration;", "getClientKey", "()Ljava/lang/String;", "getEnvironment", "()Lcom/adyen/checkout/core/Environment;", "getGenericActionConfiguration$bcmc_release", "()Lcom/adyen/checkout/action/core/GenericActionConfiguration;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShopperLocale", "()Ljava/util/Locale;", "getShopperReference", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "bcmc_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
public final class BcmcConfiguration implements Configuration, ButtonConfiguration {

    @NotNull
    public static final Parcelable.Creator<BcmcConfiguration> CREATOR = new Creator();

    @Nullable
    private final Amount amount;

    @Nullable
    private final AnalyticsConfiguration analyticsConfiguration;

    @NotNull
    private final String clientKey;

    @NotNull
    private final Environment environment;

    @NotNull
    private final GenericActionConfiguration genericActionConfiguration;

    @Nullable
    private final Boolean isHolderNameRequired;

    @Nullable
    private final Boolean isStorePaymentFieldVisible;

    @Nullable
    private final Boolean isSubmitButtonVisible;

    @Nullable
    private final Locale shopperLocale;

    @Nullable
    private final String shopperReference;

    private BcmcConfiguration(Locale locale, Environment environment, String str, AnalyticsConfiguration analyticsConfiguration, Amount amount, Boolean bool, Boolean bool2, String str2, Boolean bool3, GenericActionConfiguration genericActionConfiguration) {
        this.shopperLocale = locale;
        this.environment = environment;
        this.clientKey = str;
        this.analyticsConfiguration = analyticsConfiguration;
        this.amount = amount;
        this.isSubmitButtonVisible = bool;
        this.isHolderNameRequired = bool2;
        this.shopperReference = str2;
        this.isStorePaymentFieldVisible = bool3;
        this.genericActionConfiguration = genericActionConfiguration;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.adyen.checkout.components.core.internal.Configuration
    @Nullable
    public Amount getAmount() {
        return this.amount;
    }

    @Override // com.adyen.checkout.components.core.internal.Configuration
    @Nullable
    public AnalyticsConfiguration getAnalyticsConfiguration() {
        return this.analyticsConfiguration;
    }

    @Override // com.adyen.checkout.components.core.internal.Configuration
    @NotNull
    public String getClientKey() {
        return this.clientKey;
    }

    @Override // com.adyen.checkout.components.core.internal.Configuration
    @NotNull
    public Environment getEnvironment() {
        return this.environment;
    }

    @NotNull
    /* JADX INFO: renamed from: getGenericActionConfiguration$bcmc_release, reason: from getter */
    public final GenericActionConfiguration getGenericActionConfiguration() {
        return this.genericActionConfiguration;
    }

    @Override // com.adyen.checkout.components.core.internal.Configuration
    @Nullable
    public Locale getShopperLocale() {
        return this.shopperLocale;
    }

    @Nullable
    public final String getShopperReference() {
        return this.shopperReference;
    }

    @Nullable
    /* JADX INFO: renamed from: isHolderNameRequired, reason: from getter */
    public final Boolean getIsHolderNameRequired() {
        return this.isHolderNameRequired;
    }

    @Nullable
    /* JADX INFO: renamed from: isStorePaymentFieldVisible, reason: from getter */
    public final Boolean getIsStorePaymentFieldVisible() {
        return this.isStorePaymentFieldVisible;
    }

    @Override // com.adyen.checkout.components.core.internal.ButtonConfiguration
    @Nullable
    /* JADX INFO: renamed from: isSubmitButtonVisible, reason: from getter */
    public Boolean getIsSubmitButtonVisible() {
        return this.isSubmitButtonVisible;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeSerializable(this.shopperLocale);
        parcel.writeParcelable(this.environment, flags);
        parcel.writeString(this.clientKey);
        parcel.writeParcelable(this.analyticsConfiguration, flags);
        parcel.writeParcelable(this.amount, flags);
        Boolean bool = this.isSubmitButtonVisible;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            i.v(parcel, 1, bool);
        }
        Boolean bool2 = this.isHolderNameRequired;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            i.v(parcel, 1, bool2);
        }
        parcel.writeString(this.shopperReference);
        Boolean bool3 = this.isStorePaymentFieldVisible;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            i.v(parcel, 1, bool3);
        }
        parcel.writeParcelable(this.genericActionConfiguration, flags);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BcmcConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BcmcConfiguration createFromParcel(@NotNull Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            parcel.getClass();
            Locale locale = (Locale) parcel.readSerializable();
            Environment environment = (Environment) parcel.readParcelable(BcmcConfiguration.class.getClassLoader());
            String string = parcel.readString();
            AnalyticsConfiguration analyticsConfiguration = (AnalyticsConfiguration) parcel.readParcelable(BcmcConfiguration.class.getClassLoader());
            Amount amount = (Amount) parcel.readParcelable(BcmcConfiguration.class.getClassLoader());
            Boolean boolValueOf3 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BcmcConfiguration(locale, environment, string, analyticsConfiguration, amount, boolValueOf, boolValueOf2, string2, boolValueOf3, (GenericActionConfiguration) parcel.readParcelable(BcmcConfiguration.class.getClassLoader()), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BcmcConfiguration[] newArray(int i11) {
            return new BcmcConfiguration[i11];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0003B\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001f\b\u0017\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bB\u001f\b\u0016\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000eJ\b\u0010!\u001a\u00020\u0002H\u0014J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0007H\u0007J\u0010\u0010 \u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0010H\u0007J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0010H\u0017R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u0014\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0018\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010\u0013¨\u0006\""}, d2 = {"Lcom/adyen/checkout/bcmc/BcmcConfiguration$Builder;", "Lcom/adyen/checkout/action/core/internal/ActionHandlingPaymentMethodConfigurationBuilder;", "Lcom/adyen/checkout/bcmc/BcmcConfiguration;", "Lcom/adyen/checkout/components/core/internal/ButtonConfigurationBuilder;", "environment", "Lcom/adyen/checkout/core/Environment;", "clientKey", "", "(Lcom/adyen/checkout/core/Environment;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;)V", "shopperLocale", "Ljava/util/Locale;", "(Ljava/util/Locale;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;)V", "isHolderNameRequired", "", "()Ljava/lang/Boolean;", "setHolderNameRequired", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isSubmitButtonVisible", "isSubmitButtonVisible$annotations", "()V", "setSubmitButtonVisible", "shopperReference", "getShopperReference", "()Ljava/lang/String;", "setShopperReference", "(Ljava/lang/String;)V", "showStorePaymentField", "getShowStorePaymentField", "setShowStorePaymentField", "buildInternal", "bcmc_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Builder extends ActionHandlingPaymentMethodConfigurationBuilder<BcmcConfiguration, Builder> implements ButtonConfigurationBuilder {

        @Nullable
        private Boolean isHolderNameRequired;

        @Nullable
        private Boolean isSubmitButtonVisible;

        @Nullable
        private String shopperReference;

        @Nullable
        private Boolean showStorePaymentField;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @d
        public Builder(@NotNull Context context, @NotNull Environment environment, @NotNull String str) {
            super(context, environment, str);
            context.getClass();
            environment.getClass();
            str.getClass();
        }

        @Override // com.adyen.checkout.components.core.internal.BaseConfigurationBuilder
        @NotNull
        public BcmcConfiguration buildInternal() {
            return new BcmcConfiguration(getShopperLocale(), getEnvironment(), getClientKey(), getAnalyticsConfiguration(), getAmount(), this.isSubmitButtonVisible, this.isHolderNameRequired, this.shopperReference, this.showStorePaymentField, getGenericActionConfigurationBuilder().build(), null);
        }

        @Nullable
        public final String getShopperReference() {
            return this.shopperReference;
        }

        @Nullable
        public final Boolean getShowStorePaymentField() {
            return this.showStorePaymentField;
        }

        @Nullable
        /* JADX INFO: renamed from: isHolderNameRequired, reason: from getter */
        public final Boolean getIsHolderNameRequired() {
            return this.isHolderNameRequired;
        }

        @Nullable
        /* JADX INFO: renamed from: isSubmitButtonVisible, reason: from getter */
        public final Boolean getIsSubmitButtonVisible() {
            return this.isSubmitButtonVisible;
        }

        @d
        @NotNull
        public final Builder setHolderNameRequired(boolean isHolderNameRequired) {
            this.isHolderNameRequired = Boolean.valueOf(isHolderNameRequired);
            return this;
        }

        @d
        @NotNull
        public final Builder setShopperReference(@NotNull String shopperReference) {
            shopperReference.getClass();
            this.shopperReference = shopperReference;
            return this;
        }

        @d
        @NotNull
        public final Builder setShowStorePaymentField(boolean showStorePaymentField) {
            this.showStorePaymentField = Boolean.valueOf(showStorePaymentField);
            return this;
        }

        @Override // com.adyen.checkout.components.core.internal.ButtonConfigurationBuilder
        @d
        @NotNull
        public Builder setSubmitButtonVisible(boolean isSubmitButtonVisible) {
            this.isSubmitButtonVisible = Boolean.valueOf(isSubmitButtonVisible);
            return this;
        }

        /* JADX INFO: renamed from: setShopperReference, reason: collision with other method in class */
        public final void m75setShopperReference(@Nullable String str) {
            this.shopperReference = str;
        }

        public final void setHolderNameRequired(@Nullable Boolean bool) {
            this.isHolderNameRequired = bool;
        }

        public final void setShowStorePaymentField(@Nullable Boolean bool) {
            this.showStorePaymentField = bool;
        }

        public final void setSubmitButtonVisible(@Nullable Boolean bool) {
            this.isSubmitButtonVisible = bool;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull Environment environment, @NotNull String str) {
            super(environment, str);
            environment.getClass();
            str.getClass();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull Locale locale, @NotNull Environment environment, @NotNull String str) {
            super(locale, environment, str);
            locale.getClass();
            environment.getClass();
            str.getClass();
        }

        @d
        public static /* synthetic */ void isSubmitButtonVisible$annotations() {
        }
    }

    public /* synthetic */ BcmcConfiguration(Locale locale, Environment environment, String str, AnalyticsConfiguration analyticsConfiguration, Amount amount, Boolean bool, Boolean bool2, String str2, Boolean bool3, GenericActionConfiguration genericActionConfiguration, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale, environment, str, analyticsConfiguration, amount, bool, bool2, str2, bool3, genericActionConfiguration);
    }
}
