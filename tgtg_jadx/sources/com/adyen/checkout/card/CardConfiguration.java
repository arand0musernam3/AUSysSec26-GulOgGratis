package com.adyen.checkout.card;

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
import com.adyen.checkout.core.CardBrand;
import com.adyen.checkout.core.CardType;
import com.adyen.checkout.core.Environment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0002CDBµ\u0001\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0012\u0010\u0010\u001a\u000e\u0012\b\u0012\u00060\u0012j\u0002`\u0013\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010 \u001a\u00020!¢\u0006\u0002\u0010\"J\t\u0010<\u001a\u00020=HÖ\u0001J\u0019\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020=HÖ\u0001R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010 \u001a\u00020!X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u00102\u001a\u0004\b\u0016\u00101R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u00102\u001a\u0004\b\u0017\u00101R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u00102\u001a\u0004\b\u000f\u00101R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u00102\u001a\u0004\b\u0015\u00101R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\n\n\u0002\u00102\u001a\u0004\b\r\u00101R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b7\u0010*R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u001d\u0010\u0010\u001a\u000e\u0012\b\u0012\u00060\u0012j\u0002`\u0013\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;¨\u0006E"}, d2 = {"Lcom/adyen/checkout/card/CardConfiguration;", "Lcom/adyen/checkout/components/core/internal/Configuration;", "Lcom/adyen/checkout/components/core/internal/ButtonConfiguration;", "shopperLocale", "Ljava/util/Locale;", "environment", "Lcom/adyen/checkout/core/Environment;", "clientKey", "", "analyticsConfiguration", "Lcom/adyen/checkout/components/core/AnalyticsConfiguration;", "amount", "Lcom/adyen/checkout/components/core/Amount;", "isSubmitButtonVisible", "", "isHolderNameRequired", "supportedCardBrands", "", "Lcom/adyen/checkout/core/CardBrand;", "Lcom/adyen/checkout/card/CardBrand;", "shopperReference", "isStorePaymentFieldVisible", "isHideCvc", "isHideCvcStoredCard", "socialSecurityNumberVisibility", "Lcom/adyen/checkout/card/SocialSecurityNumberVisibility;", "kcpAuthVisibility", "Lcom/adyen/checkout/card/KCPAuthVisibility;", "installmentConfiguration", "Lcom/adyen/checkout/card/InstallmentConfiguration;", "addressConfiguration", "Lcom/adyen/checkout/card/AddressConfiguration;", "genericActionConfiguration", "Lcom/adyen/checkout/action/core/GenericActionConfiguration;", "(Ljava/util/Locale;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;Lcom/adyen/checkout/components/core/AnalyticsConfiguration;Lcom/adyen/checkout/components/core/Amount;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/adyen/checkout/card/SocialSecurityNumberVisibility;Lcom/adyen/checkout/card/KCPAuthVisibility;Lcom/adyen/checkout/card/InstallmentConfiguration;Lcom/adyen/checkout/card/AddressConfiguration;Lcom/adyen/checkout/action/core/GenericActionConfiguration;)V", "getAddressConfiguration", "()Lcom/adyen/checkout/card/AddressConfiguration;", "getAmount", "()Lcom/adyen/checkout/components/core/Amount;", "getAnalyticsConfiguration", "()Lcom/adyen/checkout/components/core/AnalyticsConfiguration;", "getClientKey", "()Ljava/lang/String;", "getEnvironment", "()Lcom/adyen/checkout/core/Environment;", "getGenericActionConfiguration$card_release", "()Lcom/adyen/checkout/action/core/GenericActionConfiguration;", "getInstallmentConfiguration", "()Lcom/adyen/checkout/card/InstallmentConfiguration;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getKcpAuthVisibility", "()Lcom/adyen/checkout/card/KCPAuthVisibility;", "getShopperLocale", "()Ljava/util/Locale;", "getShopperReference", "getSocialSecurityNumberVisibility", "()Lcom/adyen/checkout/card/SocialSecurityNumberVisibility;", "getSupportedCardBrands", "()Ljava/util/List;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
public final class CardConfiguration implements Configuration, ButtonConfiguration {

    @Nullable
    private final AddressConfiguration addressConfiguration;

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
    private final InstallmentConfiguration installmentConfiguration;

    @Nullable
    private final Boolean isHideCvc;

    @Nullable
    private final Boolean isHideCvcStoredCard;

    @Nullable
    private final Boolean isHolderNameRequired;

    @Nullable
    private final Boolean isStorePaymentFieldVisible;

    @Nullable
    private final Boolean isSubmitButtonVisible;

    @Nullable
    private final KCPAuthVisibility kcpAuthVisibility;

    @Nullable
    private final Locale shopperLocale;

    @Nullable
    private final String shopperReference;

    @Nullable
    private final SocialSecurityNumberVisibility socialSecurityNumberVisibility;

    @Nullable
    private final List<CardBrand> supportedCardBrands;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<CardConfiguration> CREATOR = new Creator();

    @NotNull
    private static final List<CardBrand> DEFAULT_SUPPORTED_CARDS_LIST = d0.h(new CardBrand(CardType.VISA), new CardBrand(CardType.AMERICAN_EXPRESS), new CardBrand(CardType.MASTERCARD));

    private CardConfiguration(Locale locale, Environment environment, String str, AnalyticsConfiguration analyticsConfiguration, Amount amount, Boolean bool, Boolean bool2, List<CardBrand> list, String str2, Boolean bool3, Boolean bool4, Boolean bool5, SocialSecurityNumberVisibility socialSecurityNumberVisibility, KCPAuthVisibility kCPAuthVisibility, InstallmentConfiguration installmentConfiguration, AddressConfiguration addressConfiguration, GenericActionConfiguration genericActionConfiguration) {
        this.shopperLocale = locale;
        this.environment = environment;
        this.clientKey = str;
        this.analyticsConfiguration = analyticsConfiguration;
        this.amount = amount;
        this.isSubmitButtonVisible = bool;
        this.isHolderNameRequired = bool2;
        this.supportedCardBrands = list;
        this.shopperReference = str2;
        this.isStorePaymentFieldVisible = bool3;
        this.isHideCvc = bool4;
        this.isHideCvcStoredCard = bool5;
        this.socialSecurityNumberVisibility = socialSecurityNumberVisibility;
        this.kcpAuthVisibility = kCPAuthVisibility;
        this.installmentConfiguration = installmentConfiguration;
        this.addressConfiguration = addressConfiguration;
        this.genericActionConfiguration = genericActionConfiguration;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final AddressConfiguration getAddressConfiguration() {
        return this.addressConfiguration;
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
    /* JADX INFO: renamed from: getGenericActionConfiguration$card_release, reason: from getter */
    public final GenericActionConfiguration getGenericActionConfiguration() {
        return this.genericActionConfiguration;
    }

    @Nullable
    public final InstallmentConfiguration getInstallmentConfiguration() {
        return this.installmentConfiguration;
    }

    @Nullable
    public final KCPAuthVisibility getKcpAuthVisibility() {
        return this.kcpAuthVisibility;
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
    public final SocialSecurityNumberVisibility getSocialSecurityNumberVisibility() {
        return this.socialSecurityNumberVisibility;
    }

    @Nullable
    public final List<CardBrand> getSupportedCardBrands() {
        return this.supportedCardBrands;
    }

    @Nullable
    /* JADX INFO: renamed from: isHideCvc, reason: from getter */
    public final Boolean getIsHideCvc() {
        return this.isHideCvc;
    }

    @Nullable
    /* JADX INFO: renamed from: isHideCvcStoredCard, reason: from getter */
    public final Boolean getIsHideCvcStoredCard() {
        return this.isHideCvcStoredCard;
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
        List<CardBrand> list = this.supportedCardBrands;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itQ = i.q(parcel, 1, list);
            while (itQ.hasNext()) {
                parcel.writeParcelable((Parcelable) itQ.next(), flags);
            }
        }
        parcel.writeString(this.shopperReference);
        Boolean bool3 = this.isStorePaymentFieldVisible;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            i.v(parcel, 1, bool3);
        }
        Boolean bool4 = this.isHideCvc;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            i.v(parcel, 1, bool4);
        }
        Boolean bool5 = this.isHideCvcStoredCard;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            i.v(parcel, 1, bool5);
        }
        SocialSecurityNumberVisibility socialSecurityNumberVisibility = this.socialSecurityNumberVisibility;
        if (socialSecurityNumberVisibility == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(socialSecurityNumberVisibility.name());
        }
        KCPAuthVisibility kCPAuthVisibility = this.kcpAuthVisibility;
        if (kCPAuthVisibility == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(kCPAuthVisibility.name());
        }
        InstallmentConfiguration installmentConfiguration = this.installmentConfiguration;
        if (installmentConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            installmentConfiguration.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.addressConfiguration, flags);
        parcel.writeParcelable(this.genericActionConfiguration, flags);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/adyen/checkout/card/CardConfiguration$Companion;", "", "()V", "DEFAULT_SUPPORTED_CARDS_LIST", "", "Lcom/adyen/checkout/core/CardBrand;", "Lcom/adyen/checkout/card/CardBrand;", "getDEFAULT_SUPPORTED_CARDS_LIST", "()Ljava/util/List;", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<CardBrand> getDEFAULT_SUPPORTED_CARDS_LIST() {
            return CardConfiguration.DEFAULT_SUPPORTED_CARDS_LIST;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CardConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CardConfiguration createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            Locale locale = (Locale) parcel.readSerializable();
            Environment environment = (Environment) parcel.readParcelable(CardConfiguration.class.getClassLoader());
            String string = parcel.readString();
            AnalyticsConfiguration analyticsConfiguration = (AnalyticsConfiguration) parcel.readParcelable(CardConfiguration.class.getClassLoader());
            Amount amount = (Amount) parcel.readParcelable(CardConfiguration.class.getClassLoader());
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readParcelable(CardConfiguration.class.getClassLoader()));
                }
            }
            return new CardConfiguration(locale, environment, string, analyticsConfiguration, amount, boolValueOf, boolValueOf2, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : SocialSecurityNumberVisibility.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : KCPAuthVisibility.valueOf(parcel.readString()), parcel.readInt() != 0 ? InstallmentConfiguration.CREATOR.createFromParcel(parcel) : null, (AddressConfiguration) parcel.readParcelable(CardConfiguration.class.getClassLoader()), (GenericActionConfiguration) parcel.readParcelable(CardConfiguration.class.getClassLoader()), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CardConfiguration[] newArray(int i11) {
            return new CardConfiguration[i11];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0003B\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001f\b\u0017\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bB\u001f\b\u0016\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000eJ\b\u0010D\u001a\u00020\u0002H\u0014J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u001e\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u001cH\u0007J\u0010\u0010\"\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u001cH\u0007J\u0010\u0010$\u001a\u00020\u00002\u0006\u0010G\u001a\u00020\u001cH\u0007J\u0010\u0010H\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010/\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,H\u0007J\u0010\u00104\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u0007H\u0007J\u0010\u0010I\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u001cH\u0007J\u0010\u0010:\u001a\u00020\u00002\u0006\u00106\u001a\u000207H\u0007J\u0010\u0010*\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u001cH\u0017J)\u0010K\u001a\u00020\u00002\u001a\u0010L\u001a\u000e\u0012\n\b\u0001\u0012\u00060>j\u0002`?0M\"\u00060>j\u0002`?H\u0007¢\u0006\u0002\u0010NJ)\u0010K\u001a\u00020\u00002\u001a\u0010O\u001a\u000e\u0012\n\b\u0001\u0012\u00060Pj\u0002`Q0M\"\u00060Pj\u0002`QH\u0007¢\u0006\u0002\u0010RR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010!\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u001e\u0010#\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b#\u0010\u001d\"\u0004\b$\u0010\u001fR\u001e\u0010%\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010\u001fR(\u0010'\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010 \u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001d\"\u0004\b*\u0010\u001fR\u001c\u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00101\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u00106\u001a\u0004\u0018\u000107X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R&\u0010<\u001a\u000e\u0012\b\u0012\u00060>j\u0002`?\u0018\u00010=X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006S"}, d2 = {"Lcom/adyen/checkout/card/CardConfiguration$Builder;", "Lcom/adyen/checkout/action/core/internal/ActionHandlingPaymentMethodConfigurationBuilder;", "Lcom/adyen/checkout/card/CardConfiguration;", "Lcom/adyen/checkout/components/core/internal/ButtonConfigurationBuilder;", "environment", "Lcom/adyen/checkout/core/Environment;", "clientKey", "", "(Lcom/adyen/checkout/core/Environment;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;)V", "shopperLocale", "Ljava/util/Locale;", "(Ljava/util/Locale;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;)V", "addressConfiguration", "Lcom/adyen/checkout/card/AddressConfiguration;", "getAddressConfiguration", "()Lcom/adyen/checkout/card/AddressConfiguration;", "setAddressConfiguration", "(Lcom/adyen/checkout/card/AddressConfiguration;)V", "installmentConfiguration", "Lcom/adyen/checkout/card/InstallmentConfiguration;", "getInstallmentConfiguration", "()Lcom/adyen/checkout/card/InstallmentConfiguration;", "setInstallmentConfiguration", "(Lcom/adyen/checkout/card/InstallmentConfiguration;)V", "isHideCvc", "", "()Ljava/lang/Boolean;", "setHideCvc", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isHideCvcStoredCard", "setHideCvcStoredCard", "isHolderNameRequired", "setHolderNameRequired", "isStorePaymentFieldVisible", "setStorePaymentFieldVisible", "isSubmitButtonVisible", "isSubmitButtonVisible$annotations", "()V", "setSubmitButtonVisible", "kcpAuthVisibility", "Lcom/adyen/checkout/card/KCPAuthVisibility;", "getKcpAuthVisibility", "()Lcom/adyen/checkout/card/KCPAuthVisibility;", "setKcpAuthVisibility", "(Lcom/adyen/checkout/card/KCPAuthVisibility;)V", "shopperReference", "getShopperReference", "()Ljava/lang/String;", "setShopperReference", "(Ljava/lang/String;)V", "socialSecurityNumberVisibility", "Lcom/adyen/checkout/card/SocialSecurityNumberVisibility;", "getSocialSecurityNumberVisibility", "()Lcom/adyen/checkout/card/SocialSecurityNumberVisibility;", "setSocialSecurityNumberVisibility", "(Lcom/adyen/checkout/card/SocialSecurityNumberVisibility;)V", "supportedCardBrands", "", "Lcom/adyen/checkout/core/CardBrand;", "Lcom/adyen/checkout/card/CardBrand;", "getSupportedCardBrands", "()Ljava/util/List;", "setSupportedCardBrands", "(Ljava/util/List;)V", "buildInternal", "hideCvc", "hideCvcStoredCard", "holderNameRequired", "setInstallmentConfigurations", "setShowStorePaymentField", "showStorePaymentField", "setSupportedCardTypes", "supportCardBrands", "", "([Lcom/adyen/checkout/core/CardBrand;)Lcom/adyen/checkout/card/CardConfiguration$Builder;", "supportCardTypes", "Lcom/adyen/checkout/core/CardType;", "Lcom/adyen/checkout/card/CardType;", "([Lcom/adyen/checkout/core/CardType;)Lcom/adyen/checkout/card/CardConfiguration$Builder;", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    @SourceDebugExtension({"SMAP\nCardConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardConfiguration.kt\ncom/adyen/checkout/card/CardConfiguration$Builder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,373:1\n1557#2:374\n1628#2,3:375\n*S KotlinDebug\n*F\n+ 1 CardConfiguration.kt\ncom/adyen/checkout/card/CardConfiguration$Builder\n*L\n147#1:374\n147#1:375,3\n*E\n"})
    public static final class Builder extends ActionHandlingPaymentMethodConfigurationBuilder<CardConfiguration, Builder> implements ButtonConfigurationBuilder {

        @Nullable
        private AddressConfiguration addressConfiguration;

        @Nullable
        private InstallmentConfiguration installmentConfiguration;

        @Nullable
        private Boolean isHideCvc;

        @Nullable
        private Boolean isHideCvcStoredCard;

        @Nullable
        private Boolean isHolderNameRequired;

        @Nullable
        private Boolean isStorePaymentFieldVisible;

        @Nullable
        private Boolean isSubmitButtonVisible;

        @Nullable
        private KCPAuthVisibility kcpAuthVisibility;

        @Nullable
        private String shopperReference;

        @Nullable
        private SocialSecurityNumberVisibility socialSecurityNumberVisibility;

        @Nullable
        private List<CardBrand> supportedCardBrands;

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
        public CardConfiguration buildInternal() {
            return new CardConfiguration(getShopperLocale(), getEnvironment(), getClientKey(), getAnalyticsConfiguration(), getAmount(), this.isSubmitButtonVisible, this.isHolderNameRequired, this.supportedCardBrands, this.shopperReference, this.isStorePaymentFieldVisible, this.isHideCvc, this.isHideCvcStoredCard, this.socialSecurityNumberVisibility, this.kcpAuthVisibility, this.installmentConfiguration, this.addressConfiguration, getGenericActionConfigurationBuilder().build(), null);
        }

        @Nullable
        public final AddressConfiguration getAddressConfiguration() {
            return this.addressConfiguration;
        }

        @Nullable
        public final InstallmentConfiguration getInstallmentConfiguration() {
            return this.installmentConfiguration;
        }

        @Nullable
        public final KCPAuthVisibility getKcpAuthVisibility() {
            return this.kcpAuthVisibility;
        }

        @Nullable
        public final String getShopperReference() {
            return this.shopperReference;
        }

        @Nullable
        public final SocialSecurityNumberVisibility getSocialSecurityNumberVisibility() {
            return this.socialSecurityNumberVisibility;
        }

        @Nullable
        public final List<CardBrand> getSupportedCardBrands() {
            return this.supportedCardBrands;
        }

        @Nullable
        /* JADX INFO: renamed from: isHideCvc, reason: from getter */
        public final Boolean getIsHideCvc() {
            return this.isHideCvc;
        }

        @Nullable
        /* JADX INFO: renamed from: isHideCvcStoredCard, reason: from getter */
        public final Boolean getIsHideCvcStoredCard() {
            return this.isHideCvcStoredCard;
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

        @Nullable
        /* JADX INFO: renamed from: isSubmitButtonVisible, reason: from getter */
        public final Boolean getIsSubmitButtonVisible() {
            return this.isSubmitButtonVisible;
        }

        @d
        @NotNull
        public final Builder setAddressConfiguration(@NotNull AddressConfiguration addressConfiguration) {
            addressConfiguration.getClass();
            this.addressConfiguration = addressConfiguration;
            return this;
        }

        @d
        @NotNull
        public final Builder setHideCvc(boolean hideCvc) {
            this.isHideCvc = Boolean.valueOf(hideCvc);
            return this;
        }

        @d
        @NotNull
        public final Builder setHideCvcStoredCard(boolean hideCvcStoredCard) {
            this.isHideCvcStoredCard = Boolean.valueOf(hideCvcStoredCard);
            return this;
        }

        @d
        @NotNull
        public final Builder setHolderNameRequired(boolean holderNameRequired) {
            this.isHolderNameRequired = Boolean.valueOf(holderNameRequired);
            return this;
        }

        public final void setInstallmentConfiguration(@Nullable InstallmentConfiguration installmentConfiguration) {
            this.installmentConfiguration = installmentConfiguration;
        }

        @d
        @NotNull
        public final Builder setInstallmentConfigurations(@NotNull InstallmentConfiguration installmentConfiguration) {
            installmentConfiguration.getClass();
            this.installmentConfiguration = installmentConfiguration;
            return this;
        }

        @d
        @NotNull
        public final Builder setKcpAuthVisibility(@NotNull KCPAuthVisibility kcpAuthVisibility) {
            kcpAuthVisibility.getClass();
            this.kcpAuthVisibility = kcpAuthVisibility;
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
            this.isStorePaymentFieldVisible = Boolean.valueOf(showStorePaymentField);
            return this;
        }

        @d
        @NotNull
        public final Builder setSocialSecurityNumberVisibility(@NotNull SocialSecurityNumberVisibility socialSecurityNumberVisibility) {
            socialSecurityNumberVisibility.getClass();
            this.socialSecurityNumberVisibility = socialSecurityNumberVisibility;
            return this;
        }

        public final void setStorePaymentFieldVisible(@Nullable Boolean bool) {
            this.isStorePaymentFieldVisible = bool;
        }

        @Override // com.adyen.checkout.components.core.internal.ButtonConfigurationBuilder
        @d
        @NotNull
        public Builder setSubmitButtonVisible(boolean isSubmitButtonVisible) {
            this.isSubmitButtonVisible = Boolean.valueOf(isSubmitButtonVisible);
            return this;
        }

        public final void setSupportedCardBrands(@Nullable List<CardBrand> list) {
            this.supportedCardBrands = list;
        }

        @d
        @NotNull
        public final Builder setSupportedCardTypes(@NotNull CardType... supportCardTypes) {
            supportCardTypes.getClass();
            List listH = d0.h(Arrays.copyOf(supportCardTypes, supportCardTypes.length));
            ArrayList arrayList = new ArrayList(e0.o(listH, 10));
            Iterator it = listH.iterator();
            while (it.hasNext()) {
                arrayList.add(new CardBrand((CardType) it.next()));
            }
            this.supportedCardBrands = arrayList;
            return this;
        }

        /* JADX INFO: renamed from: setAddressConfiguration, reason: collision with other method in class */
        public final void m76setAddressConfiguration(@Nullable AddressConfiguration addressConfiguration) {
            this.addressConfiguration = addressConfiguration;
        }

        /* JADX INFO: renamed from: setKcpAuthVisibility, reason: collision with other method in class */
        public final void m77setKcpAuthVisibility(@Nullable KCPAuthVisibility kCPAuthVisibility) {
            this.kcpAuthVisibility = kCPAuthVisibility;
        }

        /* JADX INFO: renamed from: setShopperReference, reason: collision with other method in class */
        public final void m78setShopperReference(@Nullable String str) {
            this.shopperReference = str;
        }

        /* JADX INFO: renamed from: setSocialSecurityNumberVisibility, reason: collision with other method in class */
        public final void m79setSocialSecurityNumberVisibility(@Nullable SocialSecurityNumberVisibility socialSecurityNumberVisibility) {
            this.socialSecurityNumberVisibility = socialSecurityNumberVisibility;
        }

        public final void setHideCvc(@Nullable Boolean bool) {
            this.isHideCvc = bool;
        }

        public final void setHideCvcStoredCard(@Nullable Boolean bool) {
            this.isHideCvcStoredCard = bool;
        }

        public final void setHolderNameRequired(@Nullable Boolean bool) {
            this.isHolderNameRequired = bool;
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

        @d
        @NotNull
        public final Builder setSupportedCardTypes(@NotNull CardBrand... supportCardBrands) {
            supportCardBrands.getClass();
            this.supportedCardBrands = d0.h(Arrays.copyOf(supportCardBrands, supportCardBrands.length));
            return this;
        }
    }

    public /* synthetic */ CardConfiguration(Locale locale, Environment environment, String str, AnalyticsConfiguration analyticsConfiguration, Amount amount, Boolean bool, Boolean bool2, List list, String str2, Boolean bool3, Boolean bool4, Boolean bool5, SocialSecurityNumberVisibility socialSecurityNumberVisibility, KCPAuthVisibility kCPAuthVisibility, InstallmentConfiguration installmentConfiguration, AddressConfiguration addressConfiguration, GenericActionConfiguration genericActionConfiguration, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale, environment, str, analyticsConfiguration, amount, bool, bool2, list, str2, bool3, bool4, bool5, socialSecurityNumberVisibility, kCPAuthVisibility, installmentConfiguration, addressConfiguration, genericActionConfiguration);
    }
}
