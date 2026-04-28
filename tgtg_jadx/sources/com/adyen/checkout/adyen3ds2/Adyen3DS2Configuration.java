package com.adyen.checkout.adyen3ds2;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.AnalyticsConfiguration;
import com.adyen.checkout.components.core.internal.BaseConfigurationBuilder;
import com.adyen.checkout.components.core.internal.Configuration;
import com.adyen.checkout.core.Environment;
import com.adyen.threeds2.customization.UiCustomization;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001$BI\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001eHÖ\u0001R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006%"}, d2 = {"Lcom/adyen/checkout/adyen3ds2/Adyen3DS2Configuration;", "Lcom/adyen/checkout/components/core/internal/Configuration;", "shopperLocale", "Ljava/util/Locale;", "environment", "Lcom/adyen/checkout/core/Environment;", "clientKey", "", "analyticsConfiguration", "Lcom/adyen/checkout/components/core/AnalyticsConfiguration;", "amount", "Lcom/adyen/checkout/components/core/Amount;", "uiCustomization", "Lcom/adyen/threeds2/customization/UiCustomization;", "threeDSRequestorAppURL", "(Ljava/util/Locale;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;Lcom/adyen/checkout/components/core/AnalyticsConfiguration;Lcom/adyen/checkout/components/core/Amount;Lcom/adyen/threeds2/customization/UiCustomization;Ljava/lang/String;)V", "getAmount", "()Lcom/adyen/checkout/components/core/Amount;", "getAnalyticsConfiguration", "()Lcom/adyen/checkout/components/core/AnalyticsConfiguration;", "getClientKey", "()Ljava/lang/String;", "getEnvironment", "()Lcom/adyen/checkout/core/Environment;", "getShopperLocale", "()Ljava/util/Locale;", "getThreeDSRequestorAppURL", "getUiCustomization", "()Lcom/adyen/threeds2/customization/UiCustomization;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
public final class Adyen3DS2Configuration implements Configuration {

    @NotNull
    public static final Parcelable.Creator<Adyen3DS2Configuration> CREATOR = new Creator();

    @Nullable
    private final Amount amount;

    @Nullable
    private final AnalyticsConfiguration analyticsConfiguration;

    @NotNull
    private final String clientKey;

    @NotNull
    private final Environment environment;

    @Nullable
    private final Locale shopperLocale;

    @Nullable
    private final String threeDSRequestorAppURL;

    @Nullable
    private final UiCustomization uiCustomization;

    private Adyen3DS2Configuration(Locale locale, Environment environment, String str, AnalyticsConfiguration analyticsConfiguration, Amount amount, UiCustomization uiCustomization, String str2) {
        this.shopperLocale = locale;
        this.environment = environment;
        this.clientKey = str;
        this.analyticsConfiguration = analyticsConfiguration;
        this.amount = amount;
        this.uiCustomization = uiCustomization;
        this.threeDSRequestorAppURL = str2;
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

    @Override // com.adyen.checkout.components.core.internal.Configuration
    @Nullable
    public Locale getShopperLocale() {
        return this.shopperLocale;
    }

    @Nullable
    public final String getThreeDSRequestorAppURL() {
        return this.threeDSRequestorAppURL;
    }

    @Nullable
    public final UiCustomization getUiCustomization() {
        return this.uiCustomization;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeSerializable(this.shopperLocale);
        parcel.writeParcelable(this.environment, flags);
        parcel.writeString(this.clientKey);
        parcel.writeParcelable(this.analyticsConfiguration, flags);
        parcel.writeParcelable(this.amount, flags);
        parcel.writeParcelable(this.uiCustomization, flags);
        parcel.writeString(this.threeDSRequestorAppURL);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0017\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\nB\u001f\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\rJ\b\u0010\u0019\u001a\u00020\u0002H\u0014J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0006H\u0007J\u0012\u0010\u0017\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/adyen/checkout/adyen3ds2/Adyen3DS2Configuration$Builder;", "Lcom/adyen/checkout/components/core/internal/BaseConfigurationBuilder;", "Lcom/adyen/checkout/adyen3ds2/Adyen3DS2Configuration;", "environment", "Lcom/adyen/checkout/core/Environment;", "clientKey", "", "(Lcom/adyen/checkout/core/Environment;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;)V", "shopperLocale", "Ljava/util/Locale;", "(Ljava/util/Locale;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;)V", "threeDSRequestorAppURL", "getThreeDSRequestorAppURL", "()Ljava/lang/String;", "setThreeDSRequestorAppURL", "(Ljava/lang/String;)V", "uiCustomization", "Lcom/adyen/threeds2/customization/UiCustomization;", "getUiCustomization", "()Lcom/adyen/threeds2/customization/UiCustomization;", "setUiCustomization", "(Lcom/adyen/threeds2/customization/UiCustomization;)V", "buildInternal", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Builder extends BaseConfigurationBuilder<Adyen3DS2Configuration, Builder> {

        @Nullable
        private String threeDSRequestorAppURL;

        @Nullable
        private UiCustomization uiCustomization;

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
        public Adyen3DS2Configuration buildInternal() {
            return new Adyen3DS2Configuration(getShopperLocale(), getEnvironment(), getClientKey(), getAnalyticsConfiguration(), getAmount(), this.uiCustomization, this.threeDSRequestorAppURL, null);
        }

        @Nullable
        public final String getThreeDSRequestorAppURL() {
            return this.threeDSRequestorAppURL;
        }

        @Nullable
        public final UiCustomization getUiCustomization() {
            return this.uiCustomization;
        }

        @d
        @NotNull
        public final Builder setThreeDSRequestorAppURL(@NotNull String threeDSRequestorAppURL) {
            threeDSRequestorAppURL.getClass();
            this.threeDSRequestorAppURL = threeDSRequestorAppURL;
            return this;
        }

        /* JADX INFO: renamed from: setUiCustomization, reason: collision with other method in class */
        public final void m72setUiCustomization(@Nullable UiCustomization uiCustomization) {
            this.uiCustomization = uiCustomization;
        }

        @d
        @NotNull
        public final Builder setUiCustomization(@Nullable UiCustomization uiCustomization) {
            this.uiCustomization = uiCustomization;
            return this;
        }

        /* JADX INFO: renamed from: setThreeDSRequestorAppURL, reason: collision with other method in class */
        public final void m71setThreeDSRequestorAppURL(@Nullable String str) {
            this.threeDSRequestorAppURL = str;
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
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Adyen3DS2Configuration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Adyen3DS2Configuration createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new Adyen3DS2Configuration((Locale) parcel.readSerializable(), (Environment) parcel.readParcelable(Adyen3DS2Configuration.class.getClassLoader()), parcel.readString(), (AnalyticsConfiguration) parcel.readParcelable(Adyen3DS2Configuration.class.getClassLoader()), (Amount) parcel.readParcelable(Adyen3DS2Configuration.class.getClassLoader()), (UiCustomization) parcel.readParcelable(Adyen3DS2Configuration.class.getClassLoader()), parcel.readString(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Adyen3DS2Configuration[] newArray(int i11) {
            return new Adyen3DS2Configuration[i11];
        }
    }

    public /* synthetic */ Adyen3DS2Configuration(Locale locale, Environment environment, String str, AnalyticsConfiguration analyticsConfiguration, Amount amount, UiCustomization uiCustomization, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale, environment, str, analyticsConfiguration, amount, uiCustomization, str2);
    }
}
