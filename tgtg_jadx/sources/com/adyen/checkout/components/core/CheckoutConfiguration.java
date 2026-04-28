package com.adyen.checkout.components.core;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.checkout.components.core.internal.util.CheckoutConfigurationMarker;
import com.adyen.checkout.core.Environment;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.internal.util.LocaleUtil;
import i4.a;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@CheckoutConfigurationMarker
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010%\n\u0002\b\u0004\b\u0007\u0018\u0000 C2\u00020\u0001:\u0001CB]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012BS\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0013B\u0011\b\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0011\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001f*\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010!J)\u0010$\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001f*\u00020\u00012\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0007¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u00142\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u00105R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u00108R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b\r\u0010=R&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0010\u0010>\u0012\u0004\b?\u0010\u0018R \u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "Lcom/adyen/checkout/components/core/internal/Configuration;", "Lcom/adyen/checkout/core/Environment;", "environment", "", "clientKey", "Ljava/util/Locale;", "shopperLocale", "Lcom/adyen/checkout/components/core/Amount;", "amount", "Lcom/adyen/checkout/components/core/AnalyticsConfiguration;", "analyticsConfiguration", "", "isSubmitButtonVisible", "Lkotlin/Function1;", "", "configurationBlock", "<init>", "(Lcom/adyen/checkout/core/Environment;Ljava/lang/String;Ljava/util/Locale;Lcom/adyen/checkout/components/core/Amount;Lcom/adyen/checkout/components/core/AnalyticsConfiguration;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;)V", "(Lcom/adyen/checkout/core/Environment;Ljava/lang/String;Ljava/util/Locale;Lcom/adyen/checkout/components/core/Amount;Lcom/adyen/checkout/components/core/AnalyticsConfiguration;Lkotlin/jvm/functions/Function1;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "validateContents", "()V", "key", "configuration", "addConfiguration", "(Ljava/lang/String;Lcom/adyen/checkout/components/core/internal/Configuration;)V", "addActionConfiguration", "(Lcom/adyen/checkout/components/core/internal/Configuration;)V", "T", "getConfiguration", "(Ljava/lang/String;)Lcom/adyen/checkout/components/core/internal/Configuration;", "Ljava/lang/Class;", "configClass", "getActionConfiguration", "(Ljava/lang/Class;)Lcom/adyen/checkout/components/core/internal/Configuration;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/adyen/checkout/core/Environment;", "getEnvironment", "()Lcom/adyen/checkout/core/Environment;", "Ljava/lang/String;", "getClientKey", "()Ljava/lang/String;", "Ljava/util/Locale;", "getShopperLocale", "()Ljava/util/Locale;", "Lcom/adyen/checkout/components/core/Amount;", "getAmount", "()Lcom/adyen/checkout/components/core/Amount;", "Lcom/adyen/checkout/components/core/AnalyticsConfiguration;", "getAnalyticsConfiguration", "()Lcom/adyen/checkout/components/core/AnalyticsConfiguration;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Lkotlin/jvm/functions/Function1;", "getConfigurationBlock$annotations", "", "availableConfigurations", "Ljava/util/Map;", "CREATOR", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCheckoutConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutConfiguration.kt\ncom/adyen/checkout/components/core/CheckoutConfiguration\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,177:1\n216#2,2:178\n*S KotlinDebug\n*F\n+ 1 CheckoutConfiguration.kt\ncom/adyen/checkout/components/core/CheckoutConfiguration\n*L\n157#1:178,2\n*E\n"})
public final class CheckoutConfiguration implements com.adyen.checkout.components.core.internal.Configuration {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Amount amount;

    @Nullable
    private final AnalyticsConfiguration analyticsConfiguration;

    @NotNull
    private final Map<String, com.adyen.checkout.components.core.internal.Configuration> availableConfigurations;

    @NotNull
    private final String clientKey;

    @NotNull
    private final Function1<CheckoutConfiguration, Unit> configurationBlock;

    @NotNull
    private final Environment environment;

    @Nullable
    private final Boolean isSubmitButtonVisible;

    @Nullable
    private final Locale shopperLocale;

    /* JADX WARN: Illegal instructions before constructor call */
    @SuppressLint({"ParcelClassLoader"})
    private CheckoutConfiguration(Parcel parcel) {
        Serializable serializable = parcel.readSerializable();
        Locale locale = serializable instanceof Locale ? (Locale) serializable : null;
        Parcelable parcelable = parcel.readParcelable(Environment.class.getClassLoader());
        if (parcelable == null) {
            a.f("Required value was null.");
            throw null;
        }
        Environment environment = (Environment) parcelable;
        String string = parcel.readString();
        if (string == null) {
            a.f("Required value was null.");
            throw null;
        }
        Amount amount = (Amount) parcel.readParcelable(Amount.class.getClassLoader());
        AnalyticsConfiguration analyticsConfiguration = (AnalyticsConfiguration) parcel.readParcelable(AnalyticsConfiguration.class.getClassLoader());
        Object value = parcel.readValue(null);
        this(environment, string, locale, amount, analyticsConfiguration, value instanceof Boolean ? (Boolean) value : null, null, 64, null);
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            String string2 = parcel.readString();
            if (string2 == null) {
                a.f("Required value was null.");
                throw null;
            }
            Serializable serializable2 = parcel.readSerializable();
            serializable2.getClass();
            Parcelable parcelable2 = parcel.readParcelable(((Class) serializable2).getClassLoader());
            if (parcelable2 == null) {
                a.f("Required value was null.");
                throw null;
            }
            this.availableConfigurations.put(string2, (com.adyen.checkout.components.core.internal.Configuration) parcelable2);
        }
    }

    private final void validateContents() {
        Locale shopperLocale = getShopperLocale();
        if (shopperLocale == null || LocaleUtil.isValidLocale(shopperLocale)) {
            return;
        }
        throw new CheckoutException("Invalid shopper locale: " + getShopperLocale() + ".", null, 2, null);
    }

    public final void addActionConfiguration(@NotNull com.adyen.checkout.components.core.internal.Configuration configuration) {
        configuration.getClass();
        this.availableConfigurations.put(configuration.getClass().getName(), configuration);
    }

    public final void addConfiguration(@NotNull String key, @NotNull com.adyen.checkout.components.core.internal.Configuration configuration) {
        key.getClass();
        configuration.getClass();
        this.availableConfigurations.put(key, configuration);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 1;
    }

    @Nullable
    public final <T extends com.adyen.checkout.components.core.internal.Configuration> T getActionConfiguration(@NotNull Class<T> configClass) {
        configClass.getClass();
        com.adyen.checkout.components.core.internal.Configuration configuration = this.availableConfigurations.get(configClass.getName());
        if (configuration instanceof com.adyen.checkout.components.core.internal.Configuration) {
            return (T) configuration;
        }
        return null;
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

    @Nullable
    public final <T extends com.adyen.checkout.components.core.internal.Configuration> T getConfiguration(@NotNull String key) {
        key.getClass();
        com.adyen.checkout.components.core.internal.Configuration configuration = this.availableConfigurations.get(key);
        if (configuration instanceof com.adyen.checkout.components.core.internal.Configuration) {
            return (T) configuration;
        }
        return null;
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
    /* JADX INFO: renamed from: isSubmitButtonVisible, reason: from getter */
    public final Boolean getIsSubmitButtonVisible() {
        return this.isSubmitButtonVisible;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeSerializable(getShopperLocale());
        dest.writeParcelable(getEnvironment(), flags);
        dest.writeString(getClientKey());
        dest.writeParcelable(getAmount(), flags);
        dest.writeParcelable(getAnalyticsConfiguration(), flags);
        dest.writeValue(this.isSubmitButtonVisible);
        dest.writeInt(this.availableConfigurations.size());
        for (Map.Entry<String, com.adyen.checkout.components.core.internal.Configuration> entry : this.availableConfigurations.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeSerializable(entry.getValue().getClass());
            dest.writeParcelable(entry.getValue(), flags);
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.components.core.CheckoutConfiguration$CREATOR, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/adyen/checkout/components/core/CheckoutConfiguration$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "()V", "createFromParcel", "source", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<CheckoutConfiguration> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CheckoutConfiguration createFromParcel(@NotNull Parcel source) {
            source.getClass();
            return new CheckoutConfiguration(source, null);
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CheckoutConfiguration[] newArray(int size) {
            return new CheckoutConfiguration[size];
        }
    }

    private static /* synthetic */ void getConfigurationBlock$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckoutConfiguration(@NotNull Environment environment, @NotNull String str, @Nullable Locale locale, @Nullable Amount amount, @Nullable AnalyticsConfiguration analyticsConfiguration, @Nullable Boolean bool, @NotNull Function1<? super CheckoutConfiguration, Unit> function1) {
        environment.getClass();
        str.getClass();
        function1.getClass();
        this.environment = environment;
        this.clientKey = str;
        this.shopperLocale = locale;
        this.amount = amount;
        this.analyticsConfiguration = analyticsConfiguration;
        this.isSubmitButtonVisible = bool;
        this.configurationBlock = function1;
        this.availableConfigurations = new LinkedHashMap();
        function1.invoke(this);
        validateContents();
    }

    public /* synthetic */ CheckoutConfiguration(Environment environment, String str, Locale locale, Amount amount, AnalyticsConfiguration analyticsConfiguration, Boolean bool, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(environment, str, (i11 & 4) != 0 ? null : locale, (i11 & 8) != 0 ? null : amount, (i11 & 16) != 0 ? null : analyticsConfiguration, (i11 & 32) != 0 ? null : bool, (i11 & 64) != 0 ? new Function1<CheckoutConfiguration, Unit>() { // from class: com.adyen.checkout.components.core.CheckoutConfiguration.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CheckoutConfiguration) obj);
                return Unit.f26487a;
            }

            public final void invoke(@NotNull CheckoutConfiguration checkoutConfiguration) {
                checkoutConfiguration.getClass();
            }
        } : function1);
    }

    public /* synthetic */ CheckoutConfiguration(Environment environment, String str, Locale locale, Amount amount, AnalyticsConfiguration analyticsConfiguration, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(environment, str, (i11 & 4) != 0 ? null : locale, (i11 & 8) != 0 ? null : amount, (i11 & 16) != 0 ? null : analyticsConfiguration, (i11 & 32) != 0 ? new Function1<CheckoutConfiguration, Unit>() { // from class: com.adyen.checkout.components.core.CheckoutConfiguration.2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CheckoutConfiguration) obj);
                return Unit.f26487a;
            }

            public final void invoke(@NotNull CheckoutConfiguration checkoutConfiguration) {
                checkoutConfiguration.getClass();
            }
        } : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CheckoutConfiguration(@NotNull Environment environment, @NotNull String str, @Nullable Locale locale, @Nullable Amount amount, @Nullable AnalyticsConfiguration analyticsConfiguration, @NotNull Function1<? super CheckoutConfiguration, Unit> function1) {
        this(environment, str, locale, amount, analyticsConfiguration, null, function1);
        environment.getClass();
        str.getClass();
        function1.getClass();
    }

    public /* synthetic */ CheckoutConfiguration(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }
}
