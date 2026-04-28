package com.adyen.checkout.card.internal.ui.model;

import com.adyen.checkout.card.KCPAuthVisibility;
import com.adyen.checkout.card.SocialSecurityNumberVisibility;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.internal.ui.model.AnalyticsParams;
import com.adyen.checkout.components.core.internal.ui.model.ButtonParams;
import com.adyen.checkout.components.core.internal.ui.model.CommonComponentParams;
import com.adyen.checkout.components.core.internal.ui.model.ComponentParams;
import com.adyen.checkout.core.CardBrand;
import com.adyen.checkout.core.Environment;
import com.adyen.checkout.ui.core.internal.ui.model.AddressParams;
import e0.f;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ\t\u0010?\u001a\u00020\u0004HÂ\u0003J\t\u0010@\u001a\u00020\u0015HÆ\u0003J\t\u0010A\u001a\u00020\u0017HÆ\u0003J\t\u0010B\u001a\u00020\u0019HÆ\u0003J\t\u0010C\u001a\u00020\u0006HÆ\u0003J\t\u0010D\u001a\u00020\u0006HÆ\u0003J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010G\u001a\u00020\u0006HÆ\u0003J\t\u0010H\u001a\u00020\u000fHÆ\u0003J\t\u0010I\u001a\u00020\u0011HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u008b\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019HÆ\u0001J\u0013\u0010L\u001a\u00020\u00062\b\u0010M\u001a\u0004\u0018\u00010NHÖ\u0003J\t\u0010O\u001a\u00020PHÖ\u0001J\t\u0010Q\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0012\u0010!\u001a\u00020\"X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0012\u0010%\u001a\u00020\fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0012\u0010*\u001a\u00020+X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0012\u00100\u001a\u00020\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u00101R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u00101R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u00101R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0012\u00104\u001a\u000205X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00107R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b8\u0010'R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>¨\u0006R"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/model/CardComponentParams;", "Lcom/adyen/checkout/components/core/internal/ui/model/ComponentParams;", "Lcom/adyen/checkout/components/core/internal/ui/model/ButtonParams;", "commonComponentParams", "Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParams;", "isSubmitButtonVisible", "", "isHolderNameRequired", "supportedCardBrands", "", "Lcom/adyen/checkout/core/CardBrand;", "shopperReference", "", "isStorePaymentFieldVisible", "socialSecurityNumberVisibility", "Lcom/adyen/checkout/card/SocialSecurityNumberVisibility;", "kcpAuthVisibility", "Lcom/adyen/checkout/card/KCPAuthVisibility;", "installmentParams", "Lcom/adyen/checkout/card/internal/ui/model/InstallmentParams;", "addressParams", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressParams;", "cvcVisibility", "Lcom/adyen/checkout/card/internal/ui/model/CVCVisibility;", "storedCVCVisibility", "Lcom/adyen/checkout/card/internal/ui/model/StoredCVCVisibility;", "(Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParams;ZZLjava/util/List;Ljava/lang/String;ZLcom/adyen/checkout/card/SocialSecurityNumberVisibility;Lcom/adyen/checkout/card/KCPAuthVisibility;Lcom/adyen/checkout/card/internal/ui/model/InstallmentParams;Lcom/adyen/checkout/ui/core/internal/ui/model/AddressParams;Lcom/adyen/checkout/card/internal/ui/model/CVCVisibility;Lcom/adyen/checkout/card/internal/ui/model/StoredCVCVisibility;)V", "getAddressParams", "()Lcom/adyen/checkout/ui/core/internal/ui/model/AddressParams;", "amount", "Lcom/adyen/checkout/components/core/Amount;", "getAmount", "()Lcom/adyen/checkout/components/core/Amount;", "analyticsParams", "Lcom/adyen/checkout/components/core/internal/ui/model/AnalyticsParams;", "getAnalyticsParams", "()Lcom/adyen/checkout/components/core/internal/ui/model/AnalyticsParams;", "clientKey", "getClientKey", "()Ljava/lang/String;", "getCvcVisibility", "()Lcom/adyen/checkout/card/internal/ui/model/CVCVisibility;", "environment", "Lcom/adyen/checkout/core/Environment;", "getEnvironment", "()Lcom/adyen/checkout/core/Environment;", "getInstallmentParams", "()Lcom/adyen/checkout/card/internal/ui/model/InstallmentParams;", "isCreatedByDropIn", "()Z", "getKcpAuthVisibility", "()Lcom/adyen/checkout/card/KCPAuthVisibility;", "shopperLocale", "Ljava/util/Locale;", "getShopperLocale", "()Ljava/util/Locale;", "getShopperReference", "getSocialSecurityNumberVisibility", "()Lcom/adyen/checkout/card/SocialSecurityNumberVisibility;", "getStoredCVCVisibility", "()Lcom/adyen/checkout/card/internal/ui/model/StoredCVCVisibility;", "getSupportedCardBrands", "()Ljava/util/List;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CardComponentParams implements ComponentParams, ButtonParams {

    @NotNull
    private final AddressParams addressParams;

    @NotNull
    private final CommonComponentParams commonComponentParams;

    @NotNull
    private final CVCVisibility cvcVisibility;

    @Nullable
    private final InstallmentParams installmentParams;
    private final boolean isHolderNameRequired;
    private final boolean isStorePaymentFieldVisible;
    private final boolean isSubmitButtonVisible;

    @NotNull
    private final KCPAuthVisibility kcpAuthVisibility;

    @Nullable
    private final String shopperReference;

    @NotNull
    private final SocialSecurityNumberVisibility socialSecurityNumberVisibility;

    @NotNull
    private final StoredCVCVisibility storedCVCVisibility;

    @NotNull
    private final List<CardBrand> supportedCardBrands;

    public CardComponentParams(@NotNull CommonComponentParams commonComponentParams, boolean z11, boolean z12, @NotNull List<CardBrand> list, @Nullable String str, boolean z13, @NotNull SocialSecurityNumberVisibility socialSecurityNumberVisibility, @NotNull KCPAuthVisibility kCPAuthVisibility, @Nullable InstallmentParams installmentParams, @NotNull AddressParams addressParams, @NotNull CVCVisibility cVCVisibility, @NotNull StoredCVCVisibility storedCVCVisibility) {
        commonComponentParams.getClass();
        list.getClass();
        socialSecurityNumberVisibility.getClass();
        kCPAuthVisibility.getClass();
        addressParams.getClass();
        cVCVisibility.getClass();
        storedCVCVisibility.getClass();
        this.commonComponentParams = commonComponentParams;
        this.isSubmitButtonVisible = z11;
        this.isHolderNameRequired = z12;
        this.supportedCardBrands = list;
        this.shopperReference = str;
        this.isStorePaymentFieldVisible = z13;
        this.socialSecurityNumberVisibility = socialSecurityNumberVisibility;
        this.kcpAuthVisibility = kCPAuthVisibility;
        this.installmentParams = installmentParams;
        this.addressParams = addressParams;
        this.cvcVisibility = cVCVisibility;
        this.storedCVCVisibility = storedCVCVisibility;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final CommonComponentParams getCommonComponentParams() {
        return this.commonComponentParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardComponentParams copy$default(CardComponentParams cardComponentParams, CommonComponentParams commonComponentParams, boolean z11, boolean z12, List list, String str, boolean z13, SocialSecurityNumberVisibility socialSecurityNumberVisibility, KCPAuthVisibility kCPAuthVisibility, InstallmentParams installmentParams, AddressParams addressParams, CVCVisibility cVCVisibility, StoredCVCVisibility storedCVCVisibility, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            commonComponentParams = cardComponentParams.commonComponentParams;
        }
        if ((i11 & 2) != 0) {
            z11 = cardComponentParams.isSubmitButtonVisible;
        }
        if ((i11 & 4) != 0) {
            z12 = cardComponentParams.isHolderNameRequired;
        }
        if ((i11 & 8) != 0) {
            list = cardComponentParams.supportedCardBrands;
        }
        if ((i11 & 16) != 0) {
            str = cardComponentParams.shopperReference;
        }
        if ((i11 & 32) != 0) {
            z13 = cardComponentParams.isStorePaymentFieldVisible;
        }
        if ((i11 & 64) != 0) {
            socialSecurityNumberVisibility = cardComponentParams.socialSecurityNumberVisibility;
        }
        if ((i11 & 128) != 0) {
            kCPAuthVisibility = cardComponentParams.kcpAuthVisibility;
        }
        if ((i11 & 256) != 0) {
            installmentParams = cardComponentParams.installmentParams;
        }
        if ((i11 & 512) != 0) {
            addressParams = cardComponentParams.addressParams;
        }
        if ((i11 & 1024) != 0) {
            cVCVisibility = cardComponentParams.cvcVisibility;
        }
        if ((i11 & NewHope.SENDB_BYTES) != 0) {
            storedCVCVisibility = cardComponentParams.storedCVCVisibility;
        }
        CVCVisibility cVCVisibility2 = cVCVisibility;
        StoredCVCVisibility storedCVCVisibility2 = storedCVCVisibility;
        InstallmentParams installmentParams2 = installmentParams;
        AddressParams addressParams2 = addressParams;
        SocialSecurityNumberVisibility socialSecurityNumberVisibility2 = socialSecurityNumberVisibility;
        KCPAuthVisibility kCPAuthVisibility2 = kCPAuthVisibility;
        String str2 = str;
        boolean z14 = z13;
        return cardComponentParams.copy(commonComponentParams, z11, z12, list, str2, z14, socialSecurityNumberVisibility2, kCPAuthVisibility2, installmentParams2, addressParams2, cVCVisibility2, storedCVCVisibility2);
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final AddressParams getAddressParams() {
        return this.addressParams;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final CVCVisibility getCvcVisibility() {
        return this.cvcVisibility;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final StoredCVCVisibility getStoredCVCVisibility() {
        return this.storedCVCVisibility;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsSubmitButtonVisible() {
        return this.isSubmitButtonVisible;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsHolderNameRequired() {
        return this.isHolderNameRequired;
    }

    @NotNull
    public final List<CardBrand> component4() {
        return this.supportedCardBrands;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getShopperReference() {
        return this.shopperReference;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsStorePaymentFieldVisible() {
        return this.isStorePaymentFieldVisible;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SocialSecurityNumberVisibility getSocialSecurityNumberVisibility() {
        return this.socialSecurityNumberVisibility;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final KCPAuthVisibility getKcpAuthVisibility() {
        return this.kcpAuthVisibility;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final InstallmentParams getInstallmentParams() {
        return this.installmentParams;
    }

    @NotNull
    public final CardComponentParams copy(@NotNull CommonComponentParams commonComponentParams, boolean isSubmitButtonVisible, boolean isHolderNameRequired, @NotNull List<CardBrand> supportedCardBrands, @Nullable String shopperReference, boolean isStorePaymentFieldVisible, @NotNull SocialSecurityNumberVisibility socialSecurityNumberVisibility, @NotNull KCPAuthVisibility kcpAuthVisibility, @Nullable InstallmentParams installmentParams, @NotNull AddressParams addressParams, @NotNull CVCVisibility cvcVisibility, @NotNull StoredCVCVisibility storedCVCVisibility) {
        commonComponentParams.getClass();
        supportedCardBrands.getClass();
        socialSecurityNumberVisibility.getClass();
        kcpAuthVisibility.getClass();
        addressParams.getClass();
        cvcVisibility.getClass();
        storedCVCVisibility.getClass();
        return new CardComponentParams(commonComponentParams, isSubmitButtonVisible, isHolderNameRequired, supportedCardBrands, shopperReference, isStorePaymentFieldVisible, socialSecurityNumberVisibility, kcpAuthVisibility, installmentParams, addressParams, cvcVisibility, storedCVCVisibility);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardComponentParams)) {
            return false;
        }
        CardComponentParams cardComponentParams = (CardComponentParams) other;
        return Intrinsics.areEqual(this.commonComponentParams, cardComponentParams.commonComponentParams) && this.isSubmitButtonVisible == cardComponentParams.isSubmitButtonVisible && this.isHolderNameRequired == cardComponentParams.isHolderNameRequired && Intrinsics.areEqual(this.supportedCardBrands, cardComponentParams.supportedCardBrands) && Intrinsics.areEqual(this.shopperReference, cardComponentParams.shopperReference) && this.isStorePaymentFieldVisible == cardComponentParams.isStorePaymentFieldVisible && this.socialSecurityNumberVisibility == cardComponentParams.socialSecurityNumberVisibility && this.kcpAuthVisibility == cardComponentParams.kcpAuthVisibility && Intrinsics.areEqual(this.installmentParams, cardComponentParams.installmentParams) && Intrinsics.areEqual(this.addressParams, cardComponentParams.addressParams) && this.cvcVisibility == cardComponentParams.cvcVisibility && this.storedCVCVisibility == cardComponentParams.storedCVCVisibility;
    }

    @NotNull
    public final AddressParams getAddressParams() {
        return this.addressParams;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    @Nullable
    public Amount getAmount() {
        return this.commonComponentParams.getAmount();
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    @NotNull
    public AnalyticsParams getAnalyticsParams() {
        return this.commonComponentParams.getAnalyticsParams();
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    @NotNull
    public String getClientKey() {
        return this.commonComponentParams.getClientKey();
    }

    @NotNull
    public final CVCVisibility getCvcVisibility() {
        return this.cvcVisibility;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    @NotNull
    public Environment getEnvironment() {
        return this.commonComponentParams.getEnvironment();
    }

    @Nullable
    public final InstallmentParams getInstallmentParams() {
        return this.installmentParams;
    }

    @NotNull
    public final KCPAuthVisibility getKcpAuthVisibility() {
        return this.kcpAuthVisibility;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    @NotNull
    public Locale getShopperLocale() {
        return this.commonComponentParams.getShopperLocale();
    }

    @Nullable
    public final String getShopperReference() {
        return this.shopperReference;
    }

    @NotNull
    public final SocialSecurityNumberVisibility getSocialSecurityNumberVisibility() {
        return this.socialSecurityNumberVisibility;
    }

    @NotNull
    public final StoredCVCVisibility getStoredCVCVisibility() {
        return this.storedCVCVisibility;
    }

    @NotNull
    public final List<CardBrand> getSupportedCardBrands() {
        return this.supportedCardBrands;
    }

    public int hashCode() {
        int iC = f.c(this.supportedCardBrands, k.e(k.e(this.commonComponentParams.hashCode() * 31, 31, this.isSubmitButtonVisible), 31, this.isHolderNameRequired), 31);
        String str = this.shopperReference;
        int iHashCode = (this.kcpAuthVisibility.hashCode() + ((this.socialSecurityNumberVisibility.hashCode() + k.e((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.isStorePaymentFieldVisible)) * 31)) * 31;
        InstallmentParams installmentParams = this.installmentParams;
        return this.storedCVCVisibility.hashCode() + ((this.cvcVisibility.hashCode() + ((this.addressParams.hashCode() + ((iHashCode + (installmentParams != null ? installmentParams.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    public boolean isCreatedByDropIn() {
        return this.commonComponentParams.isCreatedByDropIn();
    }

    public final boolean isHolderNameRequired() {
        return this.isHolderNameRequired;
    }

    public final boolean isStorePaymentFieldVisible() {
        return this.isStorePaymentFieldVisible;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ButtonParams
    public boolean isSubmitButtonVisible() {
        return this.isSubmitButtonVisible;
    }

    @NotNull
    public String toString() {
        CommonComponentParams commonComponentParams = this.commonComponentParams;
        boolean z11 = this.isSubmitButtonVisible;
        boolean z12 = this.isHolderNameRequired;
        List<CardBrand> list = this.supportedCardBrands;
        String str = this.shopperReference;
        boolean z13 = this.isStorePaymentFieldVisible;
        SocialSecurityNumberVisibility socialSecurityNumberVisibility = this.socialSecurityNumberVisibility;
        KCPAuthVisibility kCPAuthVisibility = this.kcpAuthVisibility;
        InstallmentParams installmentParams = this.installmentParams;
        AddressParams addressParams = this.addressParams;
        CVCVisibility cVCVisibility = this.cvcVisibility;
        StoredCVCVisibility storedCVCVisibility = this.storedCVCVisibility;
        StringBuilder sb2 = new StringBuilder("CardComponentParams(commonComponentParams=");
        sb2.append(commonComponentParams);
        sb2.append(", isSubmitButtonVisible=");
        sb2.append(z11);
        sb2.append(", isHolderNameRequired=");
        sb2.append(z12);
        sb2.append(", supportedCardBrands=");
        sb2.append(list);
        sb2.append(", shopperReference=");
        k.z(sb2, str, ", isStorePaymentFieldVisible=", z13, ", socialSecurityNumberVisibility=");
        sb2.append(socialSecurityNumberVisibility);
        sb2.append(", kcpAuthVisibility=");
        sb2.append(kCPAuthVisibility);
        sb2.append(", installmentParams=");
        sb2.append(installmentParams);
        sb2.append(", addressParams=");
        sb2.append(addressParams);
        sb2.append(", cvcVisibility=");
        sb2.append(cVCVisibility);
        sb2.append(", storedCVCVisibility=");
        sb2.append(storedCVCVisibility);
        sb2.append(")");
        return sb2.toString();
    }
}
