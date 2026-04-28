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
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b?\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 O2\u00020\u0001:\u0001OB©\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J±\u0001\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010B\u001a\u00020CHÖ\u0001J\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010GHÖ\u0003J\t\u0010H\u001a\u00020CHÖ\u0001J\t\u0010I\u001a\u00020\u0003HÖ\u0001J\u0019\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020CHÖ\u0001R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0013\"\u0004\b+\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010\u0015R&\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b.\u0010\u0017\u001a\u0004\b/\u0010\u0013\"\u0004\b0\u0010\u0015R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0013\"\u0004\b2\u0010\u0015¨\u0006P"}, d2 = {"Lcom/adyen/checkout/components/core/paymentmethod/CardPaymentMethod;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "type", "", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, PaymentMethodDetails.SDK_DATA, CardPaymentMethod.ENCRYPTED_CARD_NUMBER, CardPaymentMethod.ENCRYPTED_EXPIRY_MONTH, CardPaymentMethod.ENCRYPTED_EXPIRY_YEAR, CardPaymentMethod.ENCRYPTED_SECURITY_CODE, CardPaymentMethod.ENCRYPTED_PASSWORD, CardPaymentMethod.HOLDER_NAME, CardPaymentMethod.STORED_PAYMENT_METHOD_ID, CardPaymentMethod.TAX_NUMBER, CardPaymentMethod.BRAND, CardPaymentMethod.THREEDS2_SDK_VERSION, CardPaymentMethod.FUNDING_SOURCE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBrand", "()Ljava/lang/String;", "setBrand", "(Ljava/lang/String;)V", "getCheckoutAttemptId$annotations", "()V", "getCheckoutAttemptId", "setCheckoutAttemptId", "getEncryptedCardNumber", "setEncryptedCardNumber", "getEncryptedExpiryMonth", "setEncryptedExpiryMonth", "getEncryptedExpiryYear", "setEncryptedExpiryYear", "getEncryptedPassword", "setEncryptedPassword", "getEncryptedSecurityCode", "setEncryptedSecurityCode", "getFundingSource", "setFundingSource", "getHolderName", "setHolderName", "getSdkData", "setSdkData", "getStoredPaymentMethodId", "setStoredPaymentMethodId", "getTaxNumber", "setTaxNumber", "getThreeDS2SdkVersion$annotations", "getThreeDS2SdkVersion", "setThreeDS2SdkVersion", "getType", "setType", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CardPaymentMethod extends PaymentMethodDetails {

    @NotNull
    private static final String BRAND = "brand";

    @NotNull
    private static final String ENCRYPTED_CARD_NUMBER = "encryptedCardNumber";

    @NotNull
    private static final String ENCRYPTED_EXPIRY_MONTH = "encryptedExpiryMonth";

    @NotNull
    private static final String ENCRYPTED_EXPIRY_YEAR = "encryptedExpiryYear";

    @NotNull
    private static final String ENCRYPTED_PASSWORD = "encryptedPassword";

    @NotNull
    private static final String ENCRYPTED_SECURITY_CODE = "encryptedSecurityCode";

    @NotNull
    private static final String FUNDING_SOURCE = "fundingSource";

    @NotNull
    private static final String HOLDER_NAME = "holderName";

    @NotNull
    public static final String PAYMENT_METHOD_TYPE = "scheme";

    @NotNull
    private static final String STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";

    @NotNull
    private static final String TAX_NUMBER = "taxNumber";

    @NotNull
    private static final String THREEDS2_SDK_VERSION = "threeDS2SdkVersion";

    @Nullable
    private String brand;

    @Nullable
    private String checkoutAttemptId;

    @Nullable
    private String encryptedCardNumber;

    @Nullable
    private String encryptedExpiryMonth;

    @Nullable
    private String encryptedExpiryYear;

    @Nullable
    private String encryptedPassword;

    @Nullable
    private String encryptedSecurityCode;

    @Nullable
    private String fundingSource;

    @Nullable
    private String holderName;

    @Nullable
    private String sdkData;

    @Nullable
    private String storedPaymentMethodId;

    @Nullable
    private String taxNumber;

    @Nullable
    private String threeDS2SdkVersion;

    @Nullable
    private String type;

    @NotNull
    public static final Parcelable.Creator<CardPaymentMethod> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<CardPaymentMethod> SERIALIZER = new ModelObject.Serializer<CardPaymentMethod>() { // from class: com.adyen.checkout.components.core.paymentmethod.CardPaymentMethod$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public CardPaymentMethod deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            return new CardPaymentMethod(JsonUtilsKt.getStringOrNull(jsonObject, "type"), JsonUtilsKt.getStringOrNull(jsonObject, PaymentMethodDetails.CHECKOUT_ATTEMPT_ID), JsonUtilsKt.getStringOrNull(jsonObject, PaymentMethodDetails.SDK_DATA), JsonUtilsKt.getStringOrNull(jsonObject, "encryptedCardNumber"), JsonUtilsKt.getStringOrNull(jsonObject, "encryptedExpiryMonth"), JsonUtilsKt.getStringOrNull(jsonObject, "encryptedExpiryYear"), JsonUtilsKt.getStringOrNull(jsonObject, "encryptedSecurityCode"), JsonUtilsKt.getStringOrNull(jsonObject, "encryptedPassword"), JsonUtilsKt.getStringOrNull(jsonObject, "holderName"), JsonUtilsKt.getStringOrNull(jsonObject, "storedPaymentMethodId"), JsonUtilsKt.getStringOrNull(jsonObject, "taxNumber"), JsonUtilsKt.getStringOrNull(jsonObject, "brand"), JsonUtilsKt.getStringOrNull(jsonObject, "threeDS2SdkVersion"), JsonUtilsKt.getStringOrNull(jsonObject, "fundingSource"));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull CardPaymentMethod modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt(PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, modelObject.getCheckoutAttemptId());
                jSONObject.putOpt(PaymentMethodDetails.SDK_DATA, modelObject.getSdkData());
                jSONObject.putOpt("encryptedCardNumber", modelObject.getEncryptedCardNumber());
                jSONObject.putOpt("encryptedExpiryMonth", modelObject.getEncryptedExpiryMonth());
                jSONObject.putOpt("encryptedExpiryYear", modelObject.getEncryptedExpiryYear());
                jSONObject.putOpt("encryptedSecurityCode", modelObject.getEncryptedSecurityCode());
                jSONObject.putOpt("holderName", modelObject.getHolderName());
                jSONObject.putOpt("storedPaymentMethodId", modelObject.getStoredPaymentMethodId());
                jSONObject.putOpt("encryptedPassword", modelObject.getEncryptedPassword());
                jSONObject.putOpt("taxNumber", modelObject.getTaxNumber());
                jSONObject.putOpt("brand", modelObject.getBrand());
                jSONObject.putOpt("threeDS2SdkVersion", modelObject.getThreeDS2SdkVersion());
                jSONObject.putOpt("fundingSource", modelObject.getFundingSource());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(CardPaymentMethod.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ CardPaymentMethod(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & 512) != 0 ? null : str10, (i11 & 1024) != 0 ? null : str11, (i11 & NewHope.SENDB_BYTES) != 0 ? null : str12, (i11 & 4096) != 0 ? null : str13, (i11 & 8192) != 0 ? null : str14);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getStoredPaymentMethodId() {
        return this.storedPaymentMethodId;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTaxNumber() {
        return this.taxNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getThreeDS2SdkVersion() {
        return this.threeDS2SdkVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getFundingSource() {
        return this.fundingSource;
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
    public final String getEncryptedCardNumber() {
        return this.encryptedCardNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEncryptedExpiryMonth() {
        return this.encryptedExpiryMonth;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEncryptedExpiryYear() {
        return this.encryptedExpiryYear;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEncryptedSecurityCode() {
        return this.encryptedSecurityCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getEncryptedPassword() {
        return this.encryptedPassword;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getHolderName() {
        return this.holderName;
    }

    @NotNull
    public final CardPaymentMethod copy(@Nullable String type, @Nullable String checkoutAttemptId, @Nullable String sdkData, @Nullable String encryptedCardNumber, @Nullable String encryptedExpiryMonth, @Nullable String encryptedExpiryYear, @Nullable String encryptedSecurityCode, @Nullable String encryptedPassword, @Nullable String holderName, @Nullable String storedPaymentMethodId, @Nullable String taxNumber, @Nullable String brand, @Nullable String threeDS2SdkVersion, @Nullable String fundingSource) {
        return new CardPaymentMethod(type, checkoutAttemptId, sdkData, encryptedCardNumber, encryptedExpiryMonth, encryptedExpiryYear, encryptedSecurityCode, encryptedPassword, holderName, storedPaymentMethodId, taxNumber, brand, threeDS2SdkVersion, fundingSource);
    }

    @Override // com.adyen.checkout.core.internal.data.model.ModelObject, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardPaymentMethod)) {
            return false;
        }
        CardPaymentMethod cardPaymentMethod = (CardPaymentMethod) other;
        return Intrinsics.areEqual(this.type, cardPaymentMethod.type) && Intrinsics.areEqual(this.checkoutAttemptId, cardPaymentMethod.checkoutAttemptId) && Intrinsics.areEqual(this.sdkData, cardPaymentMethod.sdkData) && Intrinsics.areEqual(this.encryptedCardNumber, cardPaymentMethod.encryptedCardNumber) && Intrinsics.areEqual(this.encryptedExpiryMonth, cardPaymentMethod.encryptedExpiryMonth) && Intrinsics.areEqual(this.encryptedExpiryYear, cardPaymentMethod.encryptedExpiryYear) && Intrinsics.areEqual(this.encryptedSecurityCode, cardPaymentMethod.encryptedSecurityCode) && Intrinsics.areEqual(this.encryptedPassword, cardPaymentMethod.encryptedPassword) && Intrinsics.areEqual(this.holderName, cardPaymentMethod.holderName) && Intrinsics.areEqual(this.storedPaymentMethodId, cardPaymentMethod.storedPaymentMethodId) && Intrinsics.areEqual(this.taxNumber, cardPaymentMethod.taxNumber) && Intrinsics.areEqual(this.brand, cardPaymentMethod.brand) && Intrinsics.areEqual(this.threeDS2SdkVersion, cardPaymentMethod.threeDS2SdkVersion) && Intrinsics.areEqual(this.fundingSource, cardPaymentMethod.fundingSource);
    }

    @Nullable
    public final String getBrand() {
        return this.brand;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    @Nullable
    public String getCheckoutAttemptId() {
        return this.checkoutAttemptId;
    }

    @Nullable
    public final String getEncryptedCardNumber() {
        return this.encryptedCardNumber;
    }

    @Nullable
    public final String getEncryptedExpiryMonth() {
        return this.encryptedExpiryMonth;
    }

    @Nullable
    public final String getEncryptedExpiryYear() {
        return this.encryptedExpiryYear;
    }

    @Nullable
    public final String getEncryptedPassword() {
        return this.encryptedPassword;
    }

    @Nullable
    public final String getEncryptedSecurityCode() {
        return this.encryptedSecurityCode;
    }

    @Nullable
    public final String getFundingSource() {
        return this.fundingSource;
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

    @Nullable
    public final String getStoredPaymentMethodId() {
        return this.storedPaymentMethodId;
    }

    @Nullable
    public final String getTaxNumber() {
        return this.taxNumber;
    }

    @Nullable
    public final String getThreeDS2SdkVersion() {
        return this.threeDS2SdkVersion;
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
        String str4 = this.encryptedCardNumber;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.encryptedExpiryMonth;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.encryptedExpiryYear;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.encryptedSecurityCode;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.encryptedPassword;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.holderName;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.storedPaymentMethodId;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.taxNumber;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.brand;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.threeDS2SdkVersion;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.fundingSource;
        return iHashCode13 + (str14 != null ? str14.hashCode() : 0);
    }

    public final void setBrand(@Nullable String str) {
        this.brand = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setCheckoutAttemptId(@Nullable String str) {
        this.checkoutAttemptId = str;
    }

    public final void setEncryptedCardNumber(@Nullable String str) {
        this.encryptedCardNumber = str;
    }

    public final void setEncryptedExpiryMonth(@Nullable String str) {
        this.encryptedExpiryMonth = str;
    }

    public final void setEncryptedExpiryYear(@Nullable String str) {
        this.encryptedExpiryYear = str;
    }

    public final void setEncryptedPassword(@Nullable String str) {
        this.encryptedPassword = str;
    }

    public final void setEncryptedSecurityCode(@Nullable String str) {
        this.encryptedSecurityCode = str;
    }

    public final void setFundingSource(@Nullable String str) {
        this.fundingSource = str;
    }

    public final void setHolderName(@Nullable String str) {
        this.holderName = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setSdkData(@Nullable String str) {
        this.sdkData = str;
    }

    public final void setStoredPaymentMethodId(@Nullable String str) {
        this.storedPaymentMethodId = str;
    }

    public final void setTaxNumber(@Nullable String str) {
        this.taxNumber = str;
    }

    public final void setThreeDS2SdkVersion(@Nullable String str) {
        this.threeDS2SdkVersion = str;
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
        String str4 = this.encryptedCardNumber;
        String str5 = this.encryptedExpiryMonth;
        String str6 = this.encryptedExpiryYear;
        String str7 = this.encryptedSecurityCode;
        String str8 = this.encryptedPassword;
        String str9 = this.holderName;
        String str10 = this.storedPaymentMethodId;
        String str11 = this.taxNumber;
        String str12 = this.brand;
        String str13 = this.threeDS2SdkVersion;
        String str14 = this.fundingSource;
        StringBuilder sbT = f.t("CardPaymentMethod(type=", str, ", checkoutAttemptId=", str2, ", sdkData=");
        s.A(sbT, str3, ", encryptedCardNumber=", str4, ", encryptedExpiryMonth=");
        s.A(sbT, str5, ", encryptedExpiryYear=", str6, ", encryptedSecurityCode=");
        s.A(sbT, str7, ", encryptedPassword=", str8, ", holderName=");
        s.A(sbT, str9, ", storedPaymentMethodId=", str10, ", taxNumber=");
        s.A(sbT, str11, ", brand=", str12, ", threeDS2SdkVersion=");
        return f.o(sbT, str13, ", fundingSource=", str14, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.type);
        parcel.writeString(this.checkoutAttemptId);
        parcel.writeString(this.sdkData);
        parcel.writeString(this.encryptedCardNumber);
        parcel.writeString(this.encryptedExpiryMonth);
        parcel.writeString(this.encryptedExpiryYear);
        parcel.writeString(this.encryptedSecurityCode);
        parcel.writeString(this.encryptedPassword);
        parcel.writeString(this.holderName);
        parcel.writeString(this.storedPaymentMethodId);
        parcel.writeString(this.taxNumber);
        parcel.writeString(this.brand);
        parcel.writeString(this.threeDS2SdkVersion);
        parcel.writeString(this.fundingSource);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CardPaymentMethod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CardPaymentMethod createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new CardPaymentMethod(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CardPaymentMethod[] newArray(int i11) {
            return new CardPaymentMethod[i11];
        }
    }

    @d
    public static /* synthetic */ void getCheckoutAttemptId$annotations() {
    }

    @d
    public static /* synthetic */ void getThreeDS2SdkVersion$annotations() {
    }

    public CardPaymentMethod(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14) {
        this.type = str;
        this.checkoutAttemptId = str2;
        this.sdkData = str3;
        this.encryptedCardNumber = str4;
        this.encryptedExpiryMonth = str5;
        this.encryptedExpiryYear = str6;
        this.encryptedSecurityCode = str7;
        this.encryptedPassword = str8;
        this.holderName = str9;
        this.storedPaymentMethodId = str10;
        this.taxNumber = str11;
        this.brand = str12;
        this.threeDS2SdkVersion = str13;
        this.fundingSource = str14;
    }
}
