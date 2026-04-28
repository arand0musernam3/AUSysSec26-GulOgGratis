package com.adyen.checkout.voucher.internal.ui.model;

import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.internal.ui.model.OutputData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0002\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003Jr\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u0007HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006/"}, d2 = {"Lcom/adyen/checkout/voucher/internal/ui/model/VoucherOutputData;", "Lcom/adyen/checkout/components/core/internal/ui/model/OutputData;", "isValid", "", Action.PAYMENT_METHOD_TYPE, "", "introductionTextResource", "", "reference", "totalAmount", "Lcom/adyen/checkout/components/core/Amount;", "storeAction", "Lcom/adyen/checkout/voucher/internal/ui/model/VoucherStoreAction;", "instructionUrl", "informationFields", "", "Lcom/adyen/checkout/voucher/internal/ui/model/VoucherInformationField;", "(ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/adyen/checkout/components/core/Amount;Lcom/adyen/checkout/voucher/internal/ui/model/VoucherStoreAction;Ljava/lang/String;Ljava/util/List;)V", "getInformationFields", "()Ljava/util/List;", "getInstructionUrl", "()Ljava/lang/String;", "getIntroductionTextResource", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "getPaymentMethodType", "getReference", "getStoreAction", "()Lcom/adyen/checkout/voucher/internal/ui/model/VoucherStoreAction;", "getTotalAmount", "()Lcom/adyen/checkout/components/core/Amount;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/adyen/checkout/components/core/Amount;Lcom/adyen/checkout/voucher/internal/ui/model/VoucherStoreAction;Ljava/lang/String;Ljava/util/List;)Lcom/adyen/checkout/voucher/internal/ui/model/VoucherOutputData;", "equals", "other", "", "hashCode", "toString", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VoucherOutputData implements OutputData {

    @Nullable
    private final List<VoucherInformationField> informationFields;

    @Nullable
    private final String instructionUrl;

    @Nullable
    private final Integer introductionTextResource;
    private final boolean isValid;

    @Nullable
    private final String paymentMethodType;

    @Nullable
    private final String reference;

    @Nullable
    private final VoucherStoreAction storeAction;

    @Nullable
    private final Amount totalAmount;

    public VoucherOutputData(boolean z11, @Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable Amount amount, @Nullable VoucherStoreAction voucherStoreAction, @Nullable String str3, @Nullable List<VoucherInformationField> list) {
        this.isValid = z11;
        this.paymentMethodType = str;
        this.introductionTextResource = num;
        this.reference = str2;
        this.totalAmount = amount;
        this.storeAction = voucherStoreAction;
        this.instructionUrl = str3;
        this.informationFields = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VoucherOutputData copy$default(VoucherOutputData voucherOutputData, boolean z11, String str, Integer num, String str2, Amount amount, VoucherStoreAction voucherStoreAction, String str3, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = voucherOutputData.isValid;
        }
        if ((i11 & 2) != 0) {
            str = voucherOutputData.paymentMethodType;
        }
        if ((i11 & 4) != 0) {
            num = voucherOutputData.introductionTextResource;
        }
        if ((i11 & 8) != 0) {
            str2 = voucherOutputData.reference;
        }
        if ((i11 & 16) != 0) {
            amount = voucherOutputData.totalAmount;
        }
        if ((i11 & 32) != 0) {
            voucherStoreAction = voucherOutputData.storeAction;
        }
        if ((i11 & 64) != 0) {
            str3 = voucherOutputData.instructionUrl;
        }
        if ((i11 & 128) != 0) {
            list = voucherOutputData.informationFields;
        }
        String str4 = str3;
        List list2 = list;
        Amount amount2 = amount;
        VoucherStoreAction voucherStoreAction2 = voucherStoreAction;
        return voucherOutputData.copy(z11, str, num, str2, amount2, voucherStoreAction2, str4, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getIntroductionTextResource() {
        return this.introductionTextResource;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReference() {
        return this.reference;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Amount getTotalAmount() {
        return this.totalAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final VoucherStoreAction getStoreAction() {
        return this.storeAction;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getInstructionUrl() {
        return this.instructionUrl;
    }

    @Nullable
    public final List<VoucherInformationField> component8() {
        return this.informationFields;
    }

    @NotNull
    public final VoucherOutputData copy(boolean isValid, @Nullable String paymentMethodType, @Nullable Integer introductionTextResource, @Nullable String reference, @Nullable Amount totalAmount, @Nullable VoucherStoreAction storeAction, @Nullable String instructionUrl, @Nullable List<VoucherInformationField> informationFields) {
        return new VoucherOutputData(isValid, paymentMethodType, introductionTextResource, reference, totalAmount, storeAction, instructionUrl, informationFields);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoucherOutputData)) {
            return false;
        }
        VoucherOutputData voucherOutputData = (VoucherOutputData) other;
        return this.isValid == voucherOutputData.isValid && Intrinsics.areEqual(this.paymentMethodType, voucherOutputData.paymentMethodType) && Intrinsics.areEqual(this.introductionTextResource, voucherOutputData.introductionTextResource) && Intrinsics.areEqual(this.reference, voucherOutputData.reference) && Intrinsics.areEqual(this.totalAmount, voucherOutputData.totalAmount) && Intrinsics.areEqual(this.storeAction, voucherOutputData.storeAction) && Intrinsics.areEqual(this.instructionUrl, voucherOutputData.instructionUrl) && Intrinsics.areEqual(this.informationFields, voucherOutputData.informationFields);
    }

    @Nullable
    public final List<VoucherInformationField> getInformationFields() {
        return this.informationFields;
    }

    @Nullable
    public final String getInstructionUrl() {
        return this.instructionUrl;
    }

    @Nullable
    public final Integer getIntroductionTextResource() {
        return this.introductionTextResource;
    }

    @Nullable
    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    @Nullable
    public final String getReference() {
        return this.reference;
    }

    @Nullable
    public final VoucherStoreAction getStoreAction() {
        return this.storeAction;
    }

    @Nullable
    public final Amount getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isValid) * 31;
        String str = this.paymentMethodType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.introductionTextResource;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.reference;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Amount amount = this.totalAmount;
        int iHashCode5 = (iHashCode4 + (amount == null ? 0 : amount.hashCode())) * 31;
        VoucherStoreAction voucherStoreAction = this.storeAction;
        int iHashCode6 = (iHashCode5 + (voucherStoreAction == null ? 0 : voucherStoreAction.hashCode())) * 31;
        String str3 = this.instructionUrl;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<VoucherInformationField> list = this.informationFields;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.OutputData
    /* JADX INFO: renamed from: isValid */
    public boolean getIsValid() {
        return this.isValid;
    }

    @NotNull
    public String toString() {
        return "VoucherOutputData(isValid=" + this.isValid + ", paymentMethodType=" + this.paymentMethodType + ", introductionTextResource=" + this.introductionTextResource + ", reference=" + this.reference + ", totalAmount=" + this.totalAmount + ", storeAction=" + this.storeAction + ", instructionUrl=" + this.instructionUrl + ", informationFields=" + this.informationFields + ")";
    }
}
