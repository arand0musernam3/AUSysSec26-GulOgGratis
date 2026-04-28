package com.adyen.checkout.ideal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.adyen.checkout.action.core.GenericActionConfiguration;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.AnalyticsConfiguration;
import com.adyen.checkout.core.Environment;
import com.adyen.checkout.issuerlist.IssuerListViewType;
import com.adyen.checkout.issuerlist.internal.IssuerListConfiguration;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u00010B[\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\t\u0010)\u001a\u00020*HÖ\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020*HÖ\u0001R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR \u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\u0010\n\u0002\u0010\"\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\u0010\n\u0002\u0010\"\u0012\u0004\b#\u0010\u001f\u001a\u0004\b\u000e\u0010!R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001e\u0010\f\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010(¨\u00061"}, d2 = {"Lcom/adyen/checkout/ideal/IdealConfiguration;", "Lcom/adyen/checkout/issuerlist/internal/IssuerListConfiguration;", "shopperLocale", "Ljava/util/Locale;", "environment", "Lcom/adyen/checkout/core/Environment;", "clientKey", "", "analyticsConfiguration", "Lcom/adyen/checkout/components/core/AnalyticsConfiguration;", "amount", "Lcom/adyen/checkout/components/core/Amount;", "viewType", "Lcom/adyen/checkout/issuerlist/IssuerListViewType;", "isSubmitButtonVisible", "", "hideIssuerLogos", "genericActionConfiguration", "Lcom/adyen/checkout/action/core/GenericActionConfiguration;", "(Ljava/util/Locale;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;Lcom/adyen/checkout/components/core/AnalyticsConfiguration;Lcom/adyen/checkout/components/core/Amount;Lcom/adyen/checkout/issuerlist/IssuerListViewType;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/adyen/checkout/action/core/GenericActionConfiguration;)V", "getAmount", "()Lcom/adyen/checkout/components/core/Amount;", "getAnalyticsConfiguration", "()Lcom/adyen/checkout/components/core/AnalyticsConfiguration;", "getClientKey", "()Ljava/lang/String;", "getEnvironment", "()Lcom/adyen/checkout/core/Environment;", "getGenericActionConfiguration", "()Lcom/adyen/checkout/action/core/GenericActionConfiguration;", "getHideIssuerLogos$annotations", "()V", "getHideIssuerLogos", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "isSubmitButtonVisible$annotations", "getShopperLocale", "()Ljava/util/Locale;", "getViewType$annotations", "getViewType", "()Lcom/adyen/checkout/issuerlist/IssuerListViewType;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "ideal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
public final class IdealConfiguration extends IssuerListConfiguration {

    @NotNull
    public static final Parcelable.Creator<IdealConfiguration> CREATOR = new Creator();

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
    private final Boolean hideIssuerLogos;

    @Nullable
    private final Boolean isSubmitButtonVisible;

    @Nullable
    private final Locale shopperLocale;

    @Nullable
    private final IssuerListViewType viewType;

    private IdealConfiguration(Locale locale, Environment environment, String str, AnalyticsConfiguration analyticsConfiguration, Amount amount, IssuerListViewType issuerListViewType, Boolean bool, Boolean bool2, GenericActionConfiguration genericActionConfiguration) {
        this.shopperLocale = locale;
        this.environment = environment;
        this.clientKey = str;
        this.analyticsConfiguration = analyticsConfiguration;
        this.amount = amount;
        this.viewType = issuerListViewType;
        this.isSubmitButtonVisible = bool;
        this.hideIssuerLogos = bool2;
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

    @Override // com.adyen.checkout.issuerlist.internal.IssuerListConfiguration
    @NotNull
    public GenericActionConfiguration getGenericActionConfiguration() {
        return this.genericActionConfiguration;
    }

    @Override // com.adyen.checkout.issuerlist.internal.IssuerListConfiguration
    @Nullable
    public Boolean getHideIssuerLogos() {
        return this.hideIssuerLogos;
    }

    @Override // com.adyen.checkout.components.core.internal.Configuration
    @Nullable
    public Locale getShopperLocale() {
        return this.shopperLocale;
    }

    @Override // com.adyen.checkout.issuerlist.internal.IssuerListConfiguration
    @Nullable
    public IssuerListViewType getViewType() {
        return this.viewType;
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
        IssuerListViewType issuerListViewType = this.viewType;
        if (issuerListViewType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(issuerListViewType.name());
        }
        Boolean bool = this.isSubmitButtonVisible;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            i.v(parcel, 1, bool);
        }
        Boolean bool2 = this.hideIssuerLogos;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            i.v(parcel, 1, bool2);
        }
        parcel.writeParcelable(this.genericActionConfiguration, flags);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0017\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\nB\u001f\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0014J\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0017J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0011H\u0017J\u0010\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016H\u0017¨\u0006\u0017"}, d2 = {"Lcom/adyen/checkout/ideal/IdealConfiguration$Builder;", "Lcom/adyen/checkout/issuerlist/internal/IssuerListConfiguration$IssuerListBuilder;", "Lcom/adyen/checkout/ideal/IdealConfiguration;", "environment", "Lcom/adyen/checkout/core/Environment;", "clientKey", "", "(Lcom/adyen/checkout/core/Environment;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;)V", "shopperLocale", "Ljava/util/Locale;", "(Ljava/util/Locale;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;)V", "buildInternal", "setHideIssuerLogos", "hideIssuerLogos", "", "setSubmitButtonVisible", "isSubmitButtonVisible", "setViewType", "viewType", "Lcom/adyen/checkout/issuerlist/IssuerListViewType;", "ideal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Builder extends IssuerListConfiguration.IssuerListBuilder<IdealConfiguration, Builder> {
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
        public IdealConfiguration buildInternal() {
            return new IdealConfiguration(getShopperLocale(), getEnvironment(), getClientKey(), getAnalyticsConfiguration(), getAmount(), getViewType(), getIsSubmitButtonVisible(), getHideIssuerLogos(), getGenericActionConfigurationBuilder().build(), null);
        }

        @Override // com.adyen.checkout.issuerlist.internal.IssuerListConfiguration.IssuerListBuilder
        @d
        @NotNull
        public Builder setHideIssuerLogos(boolean hideIssuerLogos) {
            return this;
        }

        @Override // com.adyen.checkout.issuerlist.internal.IssuerListConfiguration.IssuerListBuilder, com.adyen.checkout.components.core.internal.ButtonConfigurationBuilder
        @d
        @NotNull
        public Builder setSubmitButtonVisible(boolean isSubmitButtonVisible) {
            return this;
        }

        @Override // com.adyen.checkout.issuerlist.internal.IssuerListConfiguration.IssuerListBuilder
        @d
        @NotNull
        public Builder setViewType(@NotNull IssuerListViewType viewType) {
            viewType.getClass();
            return this;
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
    public static final class Creator implements Parcelable.Creator<IdealConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final IdealConfiguration createFromParcel(@NotNull Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            Locale locale = (Locale) parcel.readSerializable();
            Environment environment = (Environment) parcel.readParcelable(IdealConfiguration.class.getClassLoader());
            String string = parcel.readString();
            AnalyticsConfiguration analyticsConfiguration = (AnalyticsConfiguration) parcel.readParcelable(IdealConfiguration.class.getClassLoader());
            Amount amount = (Amount) parcel.readParcelable(IdealConfiguration.class.getClassLoader());
            Boolean boolValueOf2 = null;
            IssuerListViewType issuerListViewTypeValueOf = parcel.readInt() == 0 ? null : IssuerListViewType.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new IdealConfiguration(locale, environment, string, analyticsConfiguration, amount, issuerListViewTypeValueOf, boolValueOf, boolValueOf2, (GenericActionConfiguration) parcel.readParcelable(IdealConfiguration.class.getClassLoader()), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final IdealConfiguration[] newArray(int i11) {
            return new IdealConfiguration[i11];
        }
    }

    @d
    public static /* synthetic */ void getHideIssuerLogos$annotations() {
    }

    @d
    public static /* synthetic */ void getViewType$annotations() {
    }

    @d
    public static /* synthetic */ void isSubmitButtonVisible$annotations() {
    }

    public /* synthetic */ IdealConfiguration(Locale locale, Environment environment, String str, AnalyticsConfiguration analyticsConfiguration, Amount amount, IssuerListViewType issuerListViewType, Boolean bool, Boolean bool2, GenericActionConfiguration genericActionConfiguration, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale, environment, str, analyticsConfiguration, amount, issuerListViewType, bool, bool2, genericActionConfiguration);
    }
}
