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
import r8.k;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00012BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020&HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020&HÖ\u0001R&\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010¨\u00063"}, d2 = {"Lcom/adyen/checkout/components/core/paymentmethod/ACHDirectDebitPaymentMethod;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "type", "", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, PaymentMethodDetails.SDK_DATA, ACHDirectDebitPaymentMethod.ENCRYPTED_BANK_ACCOUNT_NUMBER, ACHDirectDebitPaymentMethod.ENCRYPTED_BANK_LOCATION_ID, ACHDirectDebitPaymentMethod.OWNER_NAME, ACHDirectDebitPaymentMethod.STORED_PAYMENT_METHOD_ID, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCheckoutAttemptId$annotations", "()V", "getCheckoutAttemptId", "()Ljava/lang/String;", "setCheckoutAttemptId", "(Ljava/lang/String;)V", "getEncryptedBankAccountNumber", "setEncryptedBankAccountNumber", "getEncryptedBankLocationId", "setEncryptedBankLocationId", "getOwnerName", "setOwnerName", "getSdkData", "setSdkData", "getStoredPaymentMethodId", "setStoredPaymentMethodId", "getType", "setType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ACHDirectDebitPaymentMethod extends PaymentMethodDetails {

    @NotNull
    private static final String ENCRYPTED_BANK_ACCOUNT_NUMBER = "encryptedBankAccountNumber";

    @NotNull
    private static final String ENCRYPTED_BANK_LOCATION_ID = "encryptedBankLocationId";

    @NotNull
    private static final String OWNER_NAME = "ownerName";

    @NotNull
    public static final String PAYMENT_METHOD_TYPE = "ach";

    @NotNull
    private static final String STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";

    @Nullable
    private String checkoutAttemptId;

    @Nullable
    private String encryptedBankAccountNumber;

    @Nullable
    private String encryptedBankLocationId;

    @Nullable
    private String ownerName;

    @Nullable
    private String sdkData;

    @Nullable
    private String storedPaymentMethodId;

    @Nullable
    private String type;

    @NotNull
    public static final Parcelable.Creator<ACHDirectDebitPaymentMethod> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<ACHDirectDebitPaymentMethod> SERIALIZER = new ModelObject.Serializer<ACHDirectDebitPaymentMethod>() { // from class: com.adyen.checkout.components.core.paymentmethod.ACHDirectDebitPaymentMethod$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public ACHDirectDebitPaymentMethod deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            return new ACHDirectDebitPaymentMethod(JsonUtilsKt.getStringOrNull(jsonObject, "type"), JsonUtilsKt.getStringOrNull(jsonObject, PaymentMethodDetails.CHECKOUT_ATTEMPT_ID), JsonUtilsKt.getStringOrNull(jsonObject, PaymentMethodDetails.SDK_DATA), JsonUtilsKt.getStringOrNull(jsonObject, "encryptedBankAccountNumber"), JsonUtilsKt.getStringOrNull(jsonObject, "encryptedBankLocationId"), JsonUtilsKt.getStringOrNull(jsonObject, "ownerName"), JsonUtilsKt.getStringOrNull(jsonObject, "storedPaymentMethodId"));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull ACHDirectDebitPaymentMethod modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt(PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, modelObject.getCheckoutAttemptId());
                jSONObject.putOpt(PaymentMethodDetails.SDK_DATA, modelObject.getSdkData());
                jSONObject.putOpt("encryptedBankAccountNumber", modelObject.getEncryptedBankAccountNumber());
                jSONObject.putOpt("encryptedBankLocationId", modelObject.getEncryptedBankLocationId());
                jSONObject.putOpt("ownerName", modelObject.getOwnerName());
                jSONObject.putOpt("storedPaymentMethodId", modelObject.getStoredPaymentMethodId());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(ACHDirectDebitPaymentMethod.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ ACHDirectDebitPaymentMethod(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7);
    }

    public static /* synthetic */ ACHDirectDebitPaymentMethod copy$default(ACHDirectDebitPaymentMethod aCHDirectDebitPaymentMethod, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = aCHDirectDebitPaymentMethod.type;
        }
        if ((i11 & 2) != 0) {
            str2 = aCHDirectDebitPaymentMethod.checkoutAttemptId;
        }
        if ((i11 & 4) != 0) {
            str3 = aCHDirectDebitPaymentMethod.sdkData;
        }
        if ((i11 & 8) != 0) {
            str4 = aCHDirectDebitPaymentMethod.encryptedBankAccountNumber;
        }
        if ((i11 & 16) != 0) {
            str5 = aCHDirectDebitPaymentMethod.encryptedBankLocationId;
        }
        if ((i11 & 32) != 0) {
            str6 = aCHDirectDebitPaymentMethod.ownerName;
        }
        if ((i11 & 64) != 0) {
            str7 = aCHDirectDebitPaymentMethod.storedPaymentMethodId;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return aCHDirectDebitPaymentMethod.copy(str, str2, str11, str4, str10, str8, str9);
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
    public final String getEncryptedBankAccountNumber() {
        return this.encryptedBankAccountNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEncryptedBankLocationId() {
        return this.encryptedBankLocationId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOwnerName() {
        return this.ownerName;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStoredPaymentMethodId() {
        return this.storedPaymentMethodId;
    }

    @NotNull
    public final ACHDirectDebitPaymentMethod copy(@Nullable String type, @Nullable String checkoutAttemptId, @Nullable String sdkData, @Nullable String encryptedBankAccountNumber, @Nullable String encryptedBankLocationId, @Nullable String ownerName, @Nullable String storedPaymentMethodId) {
        return new ACHDirectDebitPaymentMethod(type, checkoutAttemptId, sdkData, encryptedBankAccountNumber, encryptedBankLocationId, ownerName, storedPaymentMethodId);
    }

    @Override // com.adyen.checkout.core.internal.data.model.ModelObject, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ACHDirectDebitPaymentMethod)) {
            return false;
        }
        ACHDirectDebitPaymentMethod aCHDirectDebitPaymentMethod = (ACHDirectDebitPaymentMethod) other;
        return Intrinsics.areEqual(this.type, aCHDirectDebitPaymentMethod.type) && Intrinsics.areEqual(this.checkoutAttemptId, aCHDirectDebitPaymentMethod.checkoutAttemptId) && Intrinsics.areEqual(this.sdkData, aCHDirectDebitPaymentMethod.sdkData) && Intrinsics.areEqual(this.encryptedBankAccountNumber, aCHDirectDebitPaymentMethod.encryptedBankAccountNumber) && Intrinsics.areEqual(this.encryptedBankLocationId, aCHDirectDebitPaymentMethod.encryptedBankLocationId) && Intrinsics.areEqual(this.ownerName, aCHDirectDebitPaymentMethod.ownerName) && Intrinsics.areEqual(this.storedPaymentMethodId, aCHDirectDebitPaymentMethod.storedPaymentMethodId);
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    @Nullable
    public String getCheckoutAttemptId() {
        return this.checkoutAttemptId;
    }

    @Nullable
    public final String getEncryptedBankAccountNumber() {
        return this.encryptedBankAccountNumber;
    }

    @Nullable
    public final String getEncryptedBankLocationId() {
        return this.encryptedBankLocationId;
    }

    @Nullable
    public final String getOwnerName() {
        return this.ownerName;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    @Nullable
    public String getSdkData() {
        return this.sdkData;
    }

    @Nullable
    public final String getStoredPaymentMethodId() {
        return this.storedPaymentMethodId;
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
        String str4 = this.encryptedBankAccountNumber;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.encryptedBankLocationId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.ownerName;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.storedPaymentMethodId;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setCheckoutAttemptId(@Nullable String str) {
        this.checkoutAttemptId = str;
    }

    public final void setEncryptedBankAccountNumber(@Nullable String str) {
        this.encryptedBankAccountNumber = str;
    }

    public final void setEncryptedBankLocationId(@Nullable String str) {
        this.encryptedBankLocationId = str;
    }

    public final void setOwnerName(@Nullable String str) {
        this.ownerName = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setSdkData(@Nullable String str) {
        this.sdkData = str;
    }

    public final void setStoredPaymentMethodId(@Nullable String str) {
        this.storedPaymentMethodId = str;
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
        String str4 = this.encryptedBankAccountNumber;
        String str5 = this.encryptedBankLocationId;
        String str6 = this.ownerName;
        String str7 = this.storedPaymentMethodId;
        StringBuilder sbT = f.t("ACHDirectDebitPaymentMethod(type=", str, ", checkoutAttemptId=", str2, ", sdkData=");
        s.A(sbT, str3, ", encryptedBankAccountNumber=", str4, ", encryptedBankLocationId=");
        s.A(sbT, str5, ", ownerName=", str6, ", storedPaymentMethodId=");
        return k.p(sbT, str7, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.type);
        parcel.writeString(this.checkoutAttemptId);
        parcel.writeString(this.sdkData);
        parcel.writeString(this.encryptedBankAccountNumber);
        parcel.writeString(this.encryptedBankLocationId);
        parcel.writeString(this.ownerName);
        parcel.writeString(this.storedPaymentMethodId);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ACHDirectDebitPaymentMethod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ACHDirectDebitPaymentMethod createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new ACHDirectDebitPaymentMethod(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ACHDirectDebitPaymentMethod[] newArray(int i11) {
            return new ACHDirectDebitPaymentMethod[i11];
        }
    }

    @d
    public static /* synthetic */ void getCheckoutAttemptId$annotations() {
    }

    public ACHDirectDebitPaymentMethod(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.type = str;
        this.checkoutAttemptId = str2;
        this.sdkData = str3;
        this.encryptedBankAccountNumber = str4;
        this.encryptedBankLocationId = str5;
        this.ownerName = str6;
        this.storedPaymentMethodId = str7;
    }
}
