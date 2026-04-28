package com.adyen.checkout.action.core;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.checkout.action.core.internal.ActionHandlingConfigurationBuilder;
import com.adyen.checkout.adyen3ds2.Adyen3DS2Configuration;
import com.adyen.checkout.await.AwaitConfiguration;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.AnalyticsConfiguration;
import com.adyen.checkout.components.core.internal.BaseConfigurationBuilder;
import com.adyen.checkout.components.core.internal.Configuration;
import com.adyen.checkout.core.Environment;
import com.adyen.checkout.qrcode.QRCodeConfiguration;
import com.adyen.checkout.redirect.RedirectConfiguration;
import com.adyen.checkout.twint.action.TwintActionConfiguration;
import com.adyen.checkout.voucher.VoucherConfiguration;
import com.adyen.checkout.wechatpay.WeChatPayActionConfiguration;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001$Ba\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012*\u0010\f\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0012\u0004\u0012\u00020\u00010\rj\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0012\u0004\u0012\u00020\u0001`\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u001eH\u0007J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001cHÖ\u0001R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R2\u0010\f\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0012\u0004\u0012\u00020\u00010\rj\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0012\u0004\u0012\u00020\u0001`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006%"}, d2 = {"Lcom/adyen/checkout/action/core/GenericActionConfiguration;", "Lcom/adyen/checkout/components/core/internal/Configuration;", "shopperLocale", "Ljava/util/Locale;", "environment", "Lcom/adyen/checkout/core/Environment;", "clientKey", "", "analyticsConfiguration", "Lcom/adyen/checkout/components/core/AnalyticsConfiguration;", "amount", "Lcom/adyen/checkout/components/core/Amount;", "availableActionConfigs", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lkotlin/collections/HashMap;", "(Ljava/util/Locale;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;Lcom/adyen/checkout/components/core/AnalyticsConfiguration;Lcom/adyen/checkout/components/core/Amount;Ljava/util/HashMap;)V", "getAmount", "()Lcom/adyen/checkout/components/core/Amount;", "getAnalyticsConfiguration", "()Lcom/adyen/checkout/components/core/AnalyticsConfiguration;", "getClientKey", "()Ljava/lang/String;", "getEnvironment", "()Lcom/adyen/checkout/core/Environment;", "getShopperLocale", "()Ljava/util/Locale;", "describeContents", "", "getAllConfigurations", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "action-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
public final class GenericActionConfiguration implements Configuration {

    @NotNull
    public static final Parcelable.Creator<GenericActionConfiguration> CREATOR = new Creator();

    @Nullable
    private final Amount amount;

    @Nullable
    private final AnalyticsConfiguration analyticsConfiguration;

    @NotNull
    private final HashMap<Class<?>, Configuration> availableActionConfigs;

    @NotNull
    private final String clientKey;

    @NotNull
    private final Environment environment;

    @Nullable
    private final Locale shopperLocale;

    private GenericActionConfiguration(Locale locale, Environment environment, String str, AnalyticsConfiguration analyticsConfiguration, Amount amount, HashMap<Class<?>, Configuration> map) {
        this.shopperLocale = locale;
        this.environment = environment;
        this.clientKey = str;
        this.analyticsConfiguration = analyticsConfiguration;
        this.amount = amount;
        this.availableActionConfigs = map;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final List<Configuration> getAllConfigurations() {
        Collection<Configuration> collectionValues = this.availableActionConfigs.values();
        collectionValues.getClass();
        return CollectionsKt.r0(collectionValues);
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

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeSerializable(this.shopperLocale);
        parcel.writeParcelable(this.environment, flags);
        parcel.writeString(this.clientKey);
        parcel.writeParcelable(this.analyticsConfiguration, flags);
        parcel.writeParcelable(this.amount, flags);
        HashMap<Class<?>, Configuration> map = this.availableActionConfigs;
        parcel.writeInt(map.size());
        for (Map.Entry<Class<?>, Configuration> entry : map.entrySet()) {
            parcel.writeSerializable(entry.getKey());
            parcel.writeParcelable(entry.getValue(), flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GenericActionConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GenericActionConfiguration createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            Locale locale = (Locale) parcel.readSerializable();
            Environment environment = (Environment) parcel.readParcelable(GenericActionConfiguration.class.getClassLoader());
            String string = parcel.readString();
            AnalyticsConfiguration analyticsConfiguration = (AnalyticsConfiguration) parcel.readParcelable(GenericActionConfiguration.class.getClassLoader());
            Amount amount = (Amount) parcel.readParcelable(GenericActionConfiguration.class.getClassLoader());
            int i11 = parcel.readInt();
            HashMap map = new HashMap(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                map.put(parcel.readSerializable(), parcel.readParcelable(GenericActionConfiguration.class.getClassLoader()));
            }
            return new GenericActionConfiguration(locale, environment, string, analyticsConfiguration, amount, map, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GenericActionConfiguration[] newArray(int i11) {
            return new GenericActionConfiguration[i11];
        }
    }

    public /* synthetic */ GenericActionConfiguration(Locale locale, Environment environment, String str, AnalyticsConfiguration analyticsConfiguration, Amount amount, HashMap map, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale, environment, str, analyticsConfiguration, amount, map);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003B\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001f\b\u0017\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bB\u001f\b\u0016\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0002H\u0014R:\u0010\u000f\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0012\u0004\u0012\u00020\u00120\u0010j\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0012\u0004\u0012\u00020\u0012`\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006&"}, d2 = {"Lcom/adyen/checkout/action/core/GenericActionConfiguration$Builder;", "Lcom/adyen/checkout/components/core/internal/BaseConfigurationBuilder;", "Lcom/adyen/checkout/action/core/GenericActionConfiguration;", "Lcom/adyen/checkout/action/core/internal/ActionHandlingConfigurationBuilder;", "environment", "Lcom/adyen/checkout/core/Environment;", "clientKey", "", "(Lcom/adyen/checkout/core/Environment;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;)V", "shopperLocale", "Ljava/util/Locale;", "(Ljava/util/Locale;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;)V", "availableActionConfigs", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lcom/adyen/checkout/components/core/internal/Configuration;", "Lkotlin/collections/HashMap;", "getAvailableActionConfigs", "()Ljava/util/HashMap;", "add3ds2ActionConfiguration", "configuration", "Lcom/adyen/checkout/adyen3ds2/Adyen3DS2Configuration;", "addAwaitActionConfiguration", "Lcom/adyen/checkout/await/AwaitConfiguration;", "addQRCodeActionConfiguration", "Lcom/adyen/checkout/qrcode/QRCodeConfiguration;", "addRedirectActionConfiguration", "Lcom/adyen/checkout/redirect/RedirectConfiguration;", "addTwintActionConfiguration", "Lcom/adyen/checkout/twint/action/TwintActionConfiguration;", "addVoucherActionConfiguration", "Lcom/adyen/checkout/voucher/VoucherConfiguration;", "addWeChatPayActionConfiguration", "Lcom/adyen/checkout/wechatpay/WeChatPayActionConfiguration;", "buildInternal", "action-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Builder extends BaseConfigurationBuilder<GenericActionConfiguration, Builder> implements ActionHandlingConfigurationBuilder<Builder> {

        @NotNull
        private final HashMap<Class<?>, Configuration> availableActionConfigs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @d
        public Builder(@NotNull Context context, @NotNull Environment environment, @NotNull String str) {
            super(context, environment, str);
            context.getClass();
            environment.getClass();
            str.getClass();
            this.availableActionConfigs = new HashMap<>();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.adyen.checkout.action.core.internal.ActionHandlingConfigurationBuilder
        @NotNull
        public Builder add3ds2ActionConfiguration(@NotNull Adyen3DS2Configuration configuration) {
            configuration.getClass();
            this.availableActionConfigs.put(configuration.getClass(), configuration);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.adyen.checkout.action.core.internal.ActionHandlingConfigurationBuilder
        @NotNull
        public Builder addAwaitActionConfiguration(@NotNull AwaitConfiguration configuration) {
            configuration.getClass();
            this.availableActionConfigs.put(configuration.getClass(), configuration);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.adyen.checkout.action.core.internal.ActionHandlingConfigurationBuilder
        @NotNull
        public Builder addQRCodeActionConfiguration(@NotNull QRCodeConfiguration configuration) {
            configuration.getClass();
            this.availableActionConfigs.put(configuration.getClass(), configuration);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.adyen.checkout.action.core.internal.ActionHandlingConfigurationBuilder
        @NotNull
        public Builder addRedirectActionConfiguration(@NotNull RedirectConfiguration configuration) {
            configuration.getClass();
            this.availableActionConfigs.put(configuration.getClass(), configuration);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.adyen.checkout.action.core.internal.ActionHandlingConfigurationBuilder
        @NotNull
        public Builder addTwintActionConfiguration(@NotNull TwintActionConfiguration configuration) {
            configuration.getClass();
            this.availableActionConfigs.put(configuration.getClass(), configuration);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.adyen.checkout.action.core.internal.ActionHandlingConfigurationBuilder
        @NotNull
        public Builder addVoucherActionConfiguration(@NotNull VoucherConfiguration configuration) {
            configuration.getClass();
            this.availableActionConfigs.put(configuration.getClass(), configuration);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.adyen.checkout.action.core.internal.ActionHandlingConfigurationBuilder
        @NotNull
        public Builder addWeChatPayActionConfiguration(@NotNull WeChatPayActionConfiguration configuration) {
            configuration.getClass();
            this.availableActionConfigs.put(configuration.getClass(), configuration);
            return this;
        }

        @Override // com.adyen.checkout.components.core.internal.BaseConfigurationBuilder
        @NotNull
        public GenericActionConfiguration buildInternal() {
            return new GenericActionConfiguration(getShopperLocale(), getEnvironment(), getClientKey(), getAnalyticsConfiguration(), getAmount(), this.availableActionConfigs, null);
        }

        @NotNull
        public final HashMap<Class<?>, Configuration> getAvailableActionConfigs() {
            return this.availableActionConfigs;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull Environment environment, @NotNull String str) {
            super(environment, str);
            environment.getClass();
            str.getClass();
            this.availableActionConfigs = new HashMap<>();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull Locale locale, @NotNull Environment environment, @NotNull String str) {
            super(locale, environment, str);
            locale.getClass();
            environment.getClass();
            str.getClass();
            this.availableActionConfigs = new HashMap<>();
        }
    }
}
