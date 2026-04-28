package com.adyen.checkout.components.core.paymentmethod;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010 \u001a\u00020!HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!HÖ\u0001R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000f¨\u0006("}, d2 = {"Lcom/adyen/checkout/components/core/paymentmethod/GiftCardPaymentMethod;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "type", "", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, PaymentMethodDetails.SDK_DATA, GiftCardPaymentMethod.ENCRYPTED_CARD_NUMBER, GiftCardPaymentMethod.ENCRYPTED_SECURITY_CODE, GiftCardPaymentMethod.ENCRYPTED_EXPIRY_MONTH, GiftCardPaymentMethod.ENCRYPTED_EXPIRY_YEAR, GiftCardPaymentMethod.BRAND, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBrand", "()Ljava/lang/String;", "setBrand", "(Ljava/lang/String;)V", "getCheckoutAttemptId$annotations", "()V", "getCheckoutAttemptId", "setCheckoutAttemptId", "getEncryptedCardNumber", "setEncryptedCardNumber", "getEncryptedExpiryMonth", "setEncryptedExpiryMonth", "getEncryptedExpiryYear", "setEncryptedExpiryYear", "getEncryptedSecurityCode", "setEncryptedSecurityCode", "getSdkData", "setSdkData", "getType", "setType", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GiftCardPaymentMethod extends PaymentMethodDetails {

    @NotNull
    private static final String BRAND = "brand";

    @NotNull
    private static final String ENCRYPTED_CARD_NUMBER = "encryptedCardNumber";

    @NotNull
    private static final String ENCRYPTED_EXPIRY_MONTH = "encryptedExpiryMonth";

    @NotNull
    private static final String ENCRYPTED_EXPIRY_YEAR = "encryptedExpiryYear";

    @NotNull
    private static final String ENCRYPTED_SECURITY_CODE = "encryptedSecurityCode";

    @NotNull
    public static final String PAYMENT_METHOD_TYPE = "giftcard";

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
    private String encryptedSecurityCode;

    @Nullable
    private String sdkData;

    @Nullable
    private String type;

    @NotNull
    public static final Parcelable.Creator<GiftCardPaymentMethod> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<GiftCardPaymentMethod> SERIALIZER = new ModelObject.Serializer<GiftCardPaymentMethod>() { // from class: com.adyen.checkout.components.core.paymentmethod.GiftCardPaymentMethod$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public GiftCardPaymentMethod deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            return new GiftCardPaymentMethod(JsonUtilsKt.getStringOrNull(jsonObject, "type"), JsonUtilsKt.getStringOrNull(jsonObject, PaymentMethodDetails.CHECKOUT_ATTEMPT_ID), JsonUtilsKt.getStringOrNull(jsonObject, PaymentMethodDetails.SDK_DATA), JsonUtilsKt.getStringOrNull(jsonObject, "encryptedCardNumber"), JsonUtilsKt.getStringOrNull(jsonObject, "encryptedSecurityCode"), JsonUtilsKt.getStringOrNull(jsonObject, "encryptedExpiryMonth"), JsonUtilsKt.getStringOrNull(jsonObject, "encryptedExpiryYear"), JsonUtilsKt.getStringOrNull(jsonObject, "brand"));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull GiftCardPaymentMethod modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt(PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, modelObject.getCheckoutAttemptId());
                jSONObject.putOpt(PaymentMethodDetails.SDK_DATA, modelObject.getSdkData());
                jSONObject.putOpt("encryptedCardNumber", modelObject.getEncryptedCardNumber());
                jSONObject.putOpt("encryptedSecurityCode", modelObject.getEncryptedSecurityCode());
                jSONObject.putOpt("encryptedExpiryMonth", modelObject.getEncryptedExpiryMonth());
                jSONObject.putOpt("encryptedExpiryYear", modelObject.getEncryptedExpiryYear());
                jSONObject.putOpt("brand", modelObject.getBrand());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(GooglePayPaymentMethod.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ GiftCardPaymentMethod(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, str4, str5, str6, str7, str8);
    }

    @Override // com.adyen.checkout.core.internal.data.model.ModelObject, android.os.Parcelable
    public int describeContents() {
        return 0;
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
    public final String getEncryptedSecurityCode() {
        return this.encryptedSecurityCode;
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

    public final void setEncryptedSecurityCode(@Nullable String str) {
        this.encryptedSecurityCode = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setSdkData(@Nullable String str) {
        this.sdkData = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setType(@Nullable String str) {
        this.type = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.type);
        parcel.writeString(this.checkoutAttemptId);
        parcel.writeString(this.sdkData);
        parcel.writeString(this.encryptedCardNumber);
        parcel.writeString(this.encryptedSecurityCode);
        parcel.writeString(this.encryptedExpiryMonth);
        parcel.writeString(this.encryptedExpiryYear);
        parcel.writeString(this.brand);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GiftCardPaymentMethod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GiftCardPaymentMethod createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new GiftCardPaymentMethod(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GiftCardPaymentMethod[] newArray(int i11) {
            return new GiftCardPaymentMethod[i11];
        }
    }

    public GiftCardPaymentMethod(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.type = str;
        this.checkoutAttemptId = str2;
        this.sdkData = str3;
        this.encryptedCardNumber = str4;
        this.encryptedSecurityCode = str5;
        this.encryptedExpiryMonth = str6;
        this.encryptedExpiryYear = str7;
        this.brand = str8;
    }

    @d
    public static /* synthetic */ void getCheckoutAttemptId$annotations() {
    }
}
