package com.adyen.checkout.card.internal.ui.model;

import b3.i;
import com.adyen.checkout.card.internal.ui.view.InstallmentModel;
import com.adyen.checkout.components.core.internal.ui.model.AddressInputModel;
import com.adyen.checkout.components.core.internal.ui.model.InputData;
import com.adyen.checkout.core.CardBrand;
import e0.f;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u000eHÆ\u0003J\u0011\u00108\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\fHÆ\u0003J\u008b\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u0010C\u001a\u00020\u000e2\b\u0010D\u001a\u0004\u0018\u00010EHÖ\u0003J\t\u0010F\u001a\u00020GHÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010%\"\u0004\b&\u0010'R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001a\"\u0004\b)\u0010\u001cR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010\u001cR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001a\"\u0004\b-\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001a\"\u0004\b/\u0010\u001cR\"\u0010\u000f\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001a\"\u0004\b5\u0010\u001c¨\u0006I"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/model/CardInputData;", "Lcom/adyen/checkout/components/core/internal/ui/model/InputData;", "cardNumber", "", "expiryDate", "securityCode", "holderName", "socialSecurityNumber", "kcpBirthDateOrTaxNumber", "kcpCardPassword", "postalCode", "address", "Lcom/adyen/checkout/components/core/internal/ui/model/AddressInputModel;", "isStorePaymentMethodSwitchChecked", "", "selectedCardBrand", "Lcom/adyen/checkout/core/CardBrand;", "Lcom/adyen/checkout/card/CardBrand;", "installmentOption", "Lcom/adyen/checkout/card/internal/ui/view/InstallmentModel;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/components/core/internal/ui/model/AddressInputModel;ZLcom/adyen/checkout/core/CardBrand;Lcom/adyen/checkout/card/internal/ui/view/InstallmentModel;)V", "getAddress", "()Lcom/adyen/checkout/components/core/internal/ui/model/AddressInputModel;", "setAddress", "(Lcom/adyen/checkout/components/core/internal/ui/model/AddressInputModel;)V", "getCardNumber", "()Ljava/lang/String;", "setCardNumber", "(Ljava/lang/String;)V", "getExpiryDate", "setExpiryDate", "getHolderName", "setHolderName", "getInstallmentOption", "()Lcom/adyen/checkout/card/internal/ui/view/InstallmentModel;", "setInstallmentOption", "(Lcom/adyen/checkout/card/internal/ui/view/InstallmentModel;)V", "()Z", "setStorePaymentMethodSwitchChecked", "(Z)V", "getKcpBirthDateOrTaxNumber", "setKcpBirthDateOrTaxNumber", "getKcpCardPassword", "setKcpCardPassword", "getPostalCode", "setPostalCode", "getSecurityCode", "setSecurityCode", "getSelectedCardBrand", "()Lcom/adyen/checkout/core/CardBrand;", "setSelectedCardBrand", "(Lcom/adyen/checkout/core/CardBrand;)V", "getSocialSecurityNumber", "setSocialSecurityNumber", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CardInputData implements InputData {

    @NotNull
    private AddressInputModel address;

    @NotNull
    private String cardNumber;

    @NotNull
    private String expiryDate;

    @NotNull
    private String holderName;

    @Nullable
    private InstallmentModel installmentOption;
    private boolean isStorePaymentMethodSwitchChecked;

    @NotNull
    private String kcpBirthDateOrTaxNumber;

    @NotNull
    private String kcpCardPassword;

    @NotNull
    private String postalCode;

    @NotNull
    private String securityCode;

    @Nullable
    private CardBrand selectedCardBrand;

    @NotNull
    private String socialSecurityNumber;

    public /* synthetic */ CardInputData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, AddressInputModel addressInputModel, boolean z11, CardBrand cardBrand, InstallmentModel installmentModel, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? "" : str5, (i11 & 32) != 0 ? "" : str6, (i11 & 64) != 0 ? "" : str7, (i11 & 128) == 0 ? str8 : "", (i11 & 256) != 0 ? new AddressInputModel(null, null, null, null, null, null, null, null, 255, null) : addressInputModel, (i11 & 512) != 0 ? false : z11, (i11 & 1024) != 0 ? null : cardBrand, (i11 & NewHope.SENDB_BYTES) != 0 ? null : installmentModel);
    }

    public static /* synthetic */ CardInputData copy$default(CardInputData cardInputData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, AddressInputModel addressInputModel, boolean z11, CardBrand cardBrand, InstallmentModel installmentModel, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cardInputData.cardNumber;
        }
        if ((i11 & 2) != 0) {
            str2 = cardInputData.expiryDate;
        }
        if ((i11 & 4) != 0) {
            str3 = cardInputData.securityCode;
        }
        if ((i11 & 8) != 0) {
            str4 = cardInputData.holderName;
        }
        if ((i11 & 16) != 0) {
            str5 = cardInputData.socialSecurityNumber;
        }
        if ((i11 & 32) != 0) {
            str6 = cardInputData.kcpBirthDateOrTaxNumber;
        }
        if ((i11 & 64) != 0) {
            str7 = cardInputData.kcpCardPassword;
        }
        if ((i11 & 128) != 0) {
            str8 = cardInputData.postalCode;
        }
        if ((i11 & 256) != 0) {
            addressInputModel = cardInputData.address;
        }
        if ((i11 & 512) != 0) {
            z11 = cardInputData.isStorePaymentMethodSwitchChecked;
        }
        if ((i11 & 1024) != 0) {
            cardBrand = cardInputData.selectedCardBrand;
        }
        if ((i11 & NewHope.SENDB_BYTES) != 0) {
            installmentModel = cardInputData.installmentOption;
        }
        CardBrand cardBrand2 = cardBrand;
        InstallmentModel installmentModel2 = installmentModel;
        AddressInputModel addressInputModel2 = addressInputModel;
        boolean z12 = z11;
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return cardInputData.copy(str, str2, str3, str4, str11, str12, str9, str10, addressInputModel2, z12, cardBrand2, installmentModel2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsStorePaymentMethodSwitchChecked() {
        return this.isStorePaymentMethodSwitchChecked;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final CardBrand getSelectedCardBrand() {
        return this.selectedCardBrand;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final InstallmentModel getInstallmentOption() {
        return this.installmentOption;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExpiryDate() {
        return this.expiryDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSecurityCode() {
        return this.securityCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHolderName() {
        return this.holderName;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getKcpBirthDateOrTaxNumber() {
        return this.kcpBirthDateOrTaxNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getKcpCardPassword() {
        return this.kcpCardPassword;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final AddressInputModel getAddress() {
        return this.address;
    }

    @NotNull
    public final CardInputData copy(@NotNull String cardNumber, @NotNull String expiryDate, @NotNull String securityCode, @NotNull String holderName, @NotNull String socialSecurityNumber, @NotNull String kcpBirthDateOrTaxNumber, @NotNull String kcpCardPassword, @NotNull String postalCode, @NotNull AddressInputModel address, boolean isStorePaymentMethodSwitchChecked, @Nullable CardBrand selectedCardBrand, @Nullable InstallmentModel installmentOption) {
        i.B(cardNumber, expiryDate, securityCode, holderName, socialSecurityNumber);
        kcpBirthDateOrTaxNumber.getClass();
        kcpCardPassword.getClass();
        postalCode.getClass();
        address.getClass();
        return new CardInputData(cardNumber, expiryDate, securityCode, holderName, socialSecurityNumber, kcpBirthDateOrTaxNumber, kcpCardPassword, postalCode, address, isStorePaymentMethodSwitchChecked, selectedCardBrand, installmentOption);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardInputData)) {
            return false;
        }
        CardInputData cardInputData = (CardInputData) other;
        return Intrinsics.areEqual(this.cardNumber, cardInputData.cardNumber) && Intrinsics.areEqual(this.expiryDate, cardInputData.expiryDate) && Intrinsics.areEqual(this.securityCode, cardInputData.securityCode) && Intrinsics.areEqual(this.holderName, cardInputData.holderName) && Intrinsics.areEqual(this.socialSecurityNumber, cardInputData.socialSecurityNumber) && Intrinsics.areEqual(this.kcpBirthDateOrTaxNumber, cardInputData.kcpBirthDateOrTaxNumber) && Intrinsics.areEqual(this.kcpCardPassword, cardInputData.kcpCardPassword) && Intrinsics.areEqual(this.postalCode, cardInputData.postalCode) && Intrinsics.areEqual(this.address, cardInputData.address) && this.isStorePaymentMethodSwitchChecked == cardInputData.isStorePaymentMethodSwitchChecked && Intrinsics.areEqual(this.selectedCardBrand, cardInputData.selectedCardBrand) && Intrinsics.areEqual(this.installmentOption, cardInputData.installmentOption);
    }

    @NotNull
    public final AddressInputModel getAddress() {
        return this.address;
    }

    @NotNull
    public final String getCardNumber() {
        return this.cardNumber;
    }

    @NotNull
    public final String getExpiryDate() {
        return this.expiryDate;
    }

    @NotNull
    public final String getHolderName() {
        return this.holderName;
    }

    @Nullable
    public final InstallmentModel getInstallmentOption() {
        return this.installmentOption;
    }

    @NotNull
    public final String getKcpBirthDateOrTaxNumber() {
        return this.kcpBirthDateOrTaxNumber;
    }

    @NotNull
    public final String getKcpCardPassword() {
        return this.kcpCardPassword;
    }

    @NotNull
    public final String getPostalCode() {
        return this.postalCode;
    }

    @NotNull
    public final String getSecurityCode() {
        return this.securityCode;
    }

    @Nullable
    public final CardBrand getSelectedCardBrand() {
        return this.selectedCardBrand;
    }

    @NotNull
    public final String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    public int hashCode() {
        int iE = k.e((this.address.hashCode() + l1.b(l1.b(l1.b(l1.b(l1.b(l1.b(l1.b(this.cardNumber.hashCode() * 31, 31, this.expiryDate), 31, this.securityCode), 31, this.holderName), 31, this.socialSecurityNumber), 31, this.kcpBirthDateOrTaxNumber), 31, this.kcpCardPassword), 31, this.postalCode)) * 31, 31, this.isStorePaymentMethodSwitchChecked);
        CardBrand cardBrand = this.selectedCardBrand;
        int iHashCode = (iE + (cardBrand == null ? 0 : cardBrand.hashCode())) * 31;
        InstallmentModel installmentModel = this.installmentOption;
        return iHashCode + (installmentModel != null ? installmentModel.hashCode() : 0);
    }

    public final boolean isStorePaymentMethodSwitchChecked() {
        return this.isStorePaymentMethodSwitchChecked;
    }

    public final void setAddress(@NotNull AddressInputModel addressInputModel) {
        addressInputModel.getClass();
        this.address = addressInputModel;
    }

    public final void setCardNumber(@NotNull String str) {
        str.getClass();
        this.cardNumber = str;
    }

    public final void setExpiryDate(@NotNull String str) {
        str.getClass();
        this.expiryDate = str;
    }

    public final void setHolderName(@NotNull String str) {
        str.getClass();
        this.holderName = str;
    }

    public final void setInstallmentOption(@Nullable InstallmentModel installmentModel) {
        this.installmentOption = installmentModel;
    }

    public final void setKcpBirthDateOrTaxNumber(@NotNull String str) {
        str.getClass();
        this.kcpBirthDateOrTaxNumber = str;
    }

    public final void setKcpCardPassword(@NotNull String str) {
        str.getClass();
        this.kcpCardPassword = str;
    }

    public final void setPostalCode(@NotNull String str) {
        str.getClass();
        this.postalCode = str;
    }

    public final void setSecurityCode(@NotNull String str) {
        str.getClass();
        this.securityCode = str;
    }

    public final void setSelectedCardBrand(@Nullable CardBrand cardBrand) {
        this.selectedCardBrand = cardBrand;
    }

    public final void setSocialSecurityNumber(@NotNull String str) {
        str.getClass();
        this.socialSecurityNumber = str;
    }

    public final void setStorePaymentMethodSwitchChecked(boolean z11) {
        this.isStorePaymentMethodSwitchChecked = z11;
    }

    @NotNull
    public String toString() {
        String str = this.cardNumber;
        String str2 = this.expiryDate;
        String str3 = this.securityCode;
        String str4 = this.holderName;
        String str5 = this.socialSecurityNumber;
        String str6 = this.kcpBirthDateOrTaxNumber;
        String str7 = this.kcpCardPassword;
        String str8 = this.postalCode;
        AddressInputModel addressInputModel = this.address;
        boolean z11 = this.isStorePaymentMethodSwitchChecked;
        CardBrand cardBrand = this.selectedCardBrand;
        InstallmentModel installmentModel = this.installmentOption;
        StringBuilder sbT = f.t("CardInputData(cardNumber=", str, ", expiryDate=", str2, ", securityCode=");
        s.A(sbT, str3, ", holderName=", str4, ", socialSecurityNumber=");
        s.A(sbT, str5, ", kcpBirthDateOrTaxNumber=", str6, ", kcpCardPassword=");
        s.A(sbT, str7, ", postalCode=", str8, ", address=");
        sbT.append(addressInputModel);
        sbT.append(", isStorePaymentMethodSwitchChecked=");
        sbT.append(z11);
        sbT.append(", selectedCardBrand=");
        sbT.append(cardBrand);
        sbT.append(", installmentOption=");
        sbT.append(installmentModel);
        sbT.append(")");
        return sbT.toString();
    }

    public CardInputData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull AddressInputModel addressInputModel, boolean z11, @Nullable CardBrand cardBrand, @Nullable InstallmentModel installmentModel) {
        i.B(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        str8.getClass();
        addressInputModel.getClass();
        this.cardNumber = str;
        this.expiryDate = str2;
        this.securityCode = str3;
        this.holderName = str4;
        this.socialSecurityNumber = str5;
        this.kcpBirthDateOrTaxNumber = str6;
        this.kcpCardPassword = str7;
        this.postalCode = str8;
        this.address = addressInputModel;
        this.isStorePaymentMethodSwitchChecked = z11;
        this.selectedCardBrand = cardBrand;
        this.installmentOption = installmentModel;
    }

    public CardInputData() {
        this(null, null, null, null, null, null, null, null, null, false, null, null, 4095, null);
    }
}
