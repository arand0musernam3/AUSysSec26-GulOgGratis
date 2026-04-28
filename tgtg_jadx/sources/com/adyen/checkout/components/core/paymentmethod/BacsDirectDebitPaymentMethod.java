package com.adyen.checkout.components.core.paymentmethod;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import e0.f;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0001.BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\"HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"HÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR&\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\rR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\r¨\u0006/"}, d2 = {"Lcom/adyen/checkout/components/core/paymentmethod/BacsDirectDebitPaymentMethod;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "type", "", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, PaymentMethodDetails.SDK_DATA, BacsDirectDebitPaymentMethod.HOLDER_NAME, BacsDirectDebitPaymentMethod.BANK_ACCOUNT_NUMBER, BacsDirectDebitPaymentMethod.BANK_LOCATION_ID, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankAccountNumber", "()Ljava/lang/String;", "setBankAccountNumber", "(Ljava/lang/String;)V", "getBankLocationId", "setBankLocationId", "getCheckoutAttemptId$annotations", "()V", "getCheckoutAttemptId", "setCheckoutAttemptId", "getHolderName", "setHolderName", "getSdkData", "setSdkData", "getType", "setType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BacsDirectDebitPaymentMethod extends PaymentMethodDetails {

    @NotNull
    private static final String BANK_ACCOUNT_NUMBER = "bankAccountNumber";

    @NotNull
    private static final String BANK_LOCATION_ID = "bankLocationId";

    @NotNull
    private static final String HOLDER_NAME = "holderName";

    @NotNull
    public static final String PAYMENT_METHOD_TYPE = "directdebit_GB";

    @Nullable
    private String bankAccountNumber;

    @Nullable
    private String bankLocationId;

    @Nullable
    private String checkoutAttemptId;

    @Nullable
    private String holderName;

    @Nullable
    private String sdkData;

    @Nullable
    private String type;

    @NotNull
    public static final Parcelable.Creator<BacsDirectDebitPaymentMethod> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<BacsDirectDebitPaymentMethod> SERIALIZER = new ModelObject.Serializer<BacsDirectDebitPaymentMethod>() { // from class: com.adyen.checkout.components.core.paymentmethod.BacsDirectDebitPaymentMethod$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public BacsDirectDebitPaymentMethod deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            return new BacsDirectDebitPaymentMethod(JsonUtilsKt.getStringOrNull(jsonObject, "type"), JsonUtilsKt.getStringOrNull(jsonObject, PaymentMethodDetails.CHECKOUT_ATTEMPT_ID), JsonUtilsKt.getStringOrNull(jsonObject, PaymentMethodDetails.SDK_DATA), JsonUtilsKt.getStringOrNull(jsonObject, "holderName"), JsonUtilsKt.getStringOrNull(jsonObject, "bankAccountNumber"), JsonUtilsKt.getStringOrNull(jsonObject, "bankLocationId"));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull BacsDirectDebitPaymentMethod modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt(PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, modelObject.getCheckoutAttemptId());
                jSONObject.putOpt(PaymentMethodDetails.SDK_DATA, modelObject.getSdkData());
                jSONObject.putOpt("holderName", modelObject.getHolderName());
                jSONObject.putOpt("bankAccountNumber", modelObject.getBankAccountNumber());
                jSONObject.putOpt("bankLocationId", modelObject.getBankLocationId());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(BacsDirectDebitPaymentMethod.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ BacsDirectDebitPaymentMethod(String str, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, str4, str5, str6);
    }

    public static /* synthetic */ BacsDirectDebitPaymentMethod copy$default(BacsDirectDebitPaymentMethod bacsDirectDebitPaymentMethod, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bacsDirectDebitPaymentMethod.type;
        }
        if ((i11 & 2) != 0) {
            str2 = bacsDirectDebitPaymentMethod.checkoutAttemptId;
        }
        if ((i11 & 4) != 0) {
            str3 = bacsDirectDebitPaymentMethod.sdkData;
        }
        if ((i11 & 8) != 0) {
            str4 = bacsDirectDebitPaymentMethod.holderName;
        }
        if ((i11 & 16) != 0) {
            str5 = bacsDirectDebitPaymentMethod.bankAccountNumber;
        }
        if ((i11 & 32) != 0) {
            str6 = bacsDirectDebitPaymentMethod.bankLocationId;
        }
        String str7 = str5;
        String str8 = str6;
        return bacsDirectDebitPaymentMethod.copy(str, str2, str3, str4, str7, str8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCheckoutAttemptId() {
        return this.checkoutAttemptId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSdkData() {
        return this.sdkData;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHolderName() {
        return this.holderName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBankLocationId() {
        return this.bankLocationId;
    }

    @NotNull
    public final BacsDirectDebitPaymentMethod copy(@Nullable String type, @Nullable String checkoutAttemptId, @Nullable String sdkData, @Nullable String holderName, @Nullable String bankAccountNumber, @Nullable String bankLocationId) {
        return new BacsDirectDebitPaymentMethod(type, checkoutAttemptId, sdkData, holderName, bankAccountNumber, bankLocationId);
    }

    @Override // com.adyen.checkout.core.internal.data.model.ModelObject, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BacsDirectDebitPaymentMethod)) {
            return false;
        }
        BacsDirectDebitPaymentMethod bacsDirectDebitPaymentMethod = (BacsDirectDebitPaymentMethod) other;
        return Intrinsics.areEqual(this.type, bacsDirectDebitPaymentMethod.type) && Intrinsics.areEqual(this.checkoutAttemptId, bacsDirectDebitPaymentMethod.checkoutAttemptId) && Intrinsics.areEqual(this.sdkData, bacsDirectDebitPaymentMethod.sdkData) && Intrinsics.areEqual(this.holderName, bacsDirectDebitPaymentMethod.holderName) && Intrinsics.areEqual(this.bankAccountNumber, bacsDirectDebitPaymentMethod.bankAccountNumber) && Intrinsics.areEqual(this.bankLocationId, bacsDirectDebitPaymentMethod.bankLocationId);
    }

    @Nullable
    public final String getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    @Nullable
    public final String getBankLocationId() {
        return this.bankLocationId;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    @Nullable
    public String getCheckoutAttemptId() {
        return this.checkoutAttemptId;
    }

    @Nullable
    public final String getHolderName() {
        return this.holderName;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    @Nullable
    public String getSdkData() {
        return this.sdkData;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    @Nullable
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.checkoutAttemptId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sdkData;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.holderName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bankAccountNumber;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.bankLocationId;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setBankAccountNumber(@Nullable String str) {
        this.bankAccountNumber = str;
    }

    public final void setBankLocationId(@Nullable String str) {
        this.bankLocationId = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setCheckoutAttemptId(@Nullable String str) {
        this.checkoutAttemptId = str;
    }

    public final void setHolderName(@Nullable String str) {
        this.holderName = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setSdkData(@Nullable String str) {
        this.sdkData = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setType(@Nullable String str) {
        this.type = str;
    }

    @NotNull
    public String toString() {
        String str = this.type;
        String str2 = this.checkoutAttemptId;
        String str3 = this.sdkData;
        String str4 = this.holderName;
        String str5 = this.bankAccountNumber;
        String str6 = this.bankLocationId;
        StringBuilder sbT = f.t("BacsDirectDebitPaymentMethod(type=", str, ", checkoutAttemptId=", str2, ", sdkData=");
        s.A(sbT, str3, ", holderName=", str4, ", bankAccountNumber=");
        return f.o(sbT, str5, ", bankLocationId=", str6, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.type);
        parcel.writeString(this.checkoutAttemptId);
        parcel.writeString(this.sdkData);
        parcel.writeString(this.holderName);
        parcel.writeString(this.bankAccountNumber);
        parcel.writeString(this.bankLocationId);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BacsDirectDebitPaymentMethod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BacsDirectDebitPaymentMethod createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new BacsDirectDebitPaymentMethod(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BacsDirectDebitPaymentMethod[] newArray(int i11) {
            return new BacsDirectDebitPaymentMethod[i11];
        }
    }

    public BacsDirectDebitPaymentMethod(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.type = str;
        this.checkoutAttemptId = str2;
        this.sdkData = str3;
        this.holderName = str4;
        this.bankAccountNumber = str5;
        this.bankLocationId = str6;
    }

    @d
    public static /* synthetic */ void getCheckoutAttemptId$annotations() {
    }
}
