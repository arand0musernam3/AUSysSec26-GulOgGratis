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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001eHÖ\u0001R&\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010¨\u0006%"}, d2 = {"Lcom/adyen/checkout/components/core/paymentmethod/ConvenienceStoresJPPaymentMethod;", "Lcom/adyen/checkout/components/core/paymentmethod/EContextPaymentMethod;", "type", "", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, PaymentMethodDetails.SDK_DATA, EContextPaymentMethod.FIRST_NAME, EContextPaymentMethod.LAST_NAME, EContextPaymentMethod.TELEPHONE_NUMBER, EContextPaymentMethod.SHOPPER_EMAIL, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCheckoutAttemptId$annotations", "()V", "getCheckoutAttemptId", "()Ljava/lang/String;", "setCheckoutAttemptId", "(Ljava/lang/String;)V", "getFirstName", "setFirstName", "getLastName", "setLastName", "getSdkData", "setSdkData", "getShopperEmail", "setShopperEmail", "getTelephoneNumber", "setTelephoneNumber", "getType", "setType", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ConvenienceStoresJPPaymentMethod extends EContextPaymentMethod {

    @NotNull
    public static final String PAYMENT_METHOD_TYPE = "econtext_stores";

    @Nullable
    private String checkoutAttemptId;

    @Nullable
    private String firstName;

    @Nullable
    private String lastName;

    @Nullable
    private String sdkData;

    @Nullable
    private String shopperEmail;

    @Nullable
    private String telephoneNumber;

    @Nullable
    private String type;

    @NotNull
    public static final Parcelable.Creator<ConvenienceStoresJPPaymentMethod> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<ConvenienceStoresJPPaymentMethod> SERIALIZER = new ModelObject.Serializer<ConvenienceStoresJPPaymentMethod>() { // from class: com.adyen.checkout.components.core.paymentmethod.ConvenienceStoresJPPaymentMethod$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public ConvenienceStoresJPPaymentMethod deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            return new ConvenienceStoresJPPaymentMethod(JsonUtilsKt.getStringOrNull(jsonObject, "type"), JsonUtilsKt.getStringOrNull(jsonObject, PaymentMethodDetails.CHECKOUT_ATTEMPT_ID), JsonUtilsKt.getStringOrNull(jsonObject, PaymentMethodDetails.SDK_DATA), JsonUtilsKt.getStringOrNull(jsonObject, EContextPaymentMethod.FIRST_NAME), JsonUtilsKt.getStringOrNull(jsonObject, EContextPaymentMethod.LAST_NAME), JsonUtilsKt.getStringOrNull(jsonObject, EContextPaymentMethod.TELEPHONE_NUMBER), JsonUtilsKt.getStringOrNull(jsonObject, EContextPaymentMethod.SHOPPER_EMAIL));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull ConvenienceStoresJPPaymentMethod modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt(PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, modelObject.getCheckoutAttemptId());
                jSONObject.putOpt(PaymentMethodDetails.SDK_DATA, modelObject.getSdkData());
                jSONObject.putOpt(EContextPaymentMethod.FIRST_NAME, modelObject.getFirstName());
                jSONObject.putOpt(EContextPaymentMethod.LAST_NAME, modelObject.getLastName());
                jSONObject.putOpt(EContextPaymentMethod.TELEPHONE_NUMBER, modelObject.getTelephoneNumber());
                jSONObject.putOpt(EContextPaymentMethod.SHOPPER_EMAIL, modelObject.getShopperEmail());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(ConvenienceStoresJPPaymentMethod.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ ConvenienceStoresJPPaymentMethod(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7);
    }

    @Override // com.adyen.checkout.core.internal.data.model.ModelObject, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    @Nullable
    public String getCheckoutAttemptId() {
        return this.checkoutAttemptId;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod
    @Nullable
    public String getFirstName() {
        return this.firstName;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod
    @Nullable
    public String getLastName() {
        return this.lastName;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    @Nullable
    public String getSdkData() {
        return this.sdkData;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod
    @Nullable
    public String getShopperEmail() {
        return this.shopperEmail;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod
    @Nullable
    public String getTelephoneNumber() {
        return this.telephoneNumber;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    @Nullable
    public String getType() {
        return this.type;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setCheckoutAttemptId(@Nullable String str) {
        this.checkoutAttemptId = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod
    public void setFirstName(@Nullable String str) {
        this.firstName = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod
    public void setLastName(@Nullable String str) {
        this.lastName = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setSdkData(@Nullable String str) {
        this.sdkData = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod
    public void setShopperEmail(@Nullable String str) {
        this.shopperEmail = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod
    public void setTelephoneNumber(@Nullable String str) {
        this.telephoneNumber = str;
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
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.telephoneNumber);
        parcel.writeString(this.shopperEmail);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ConvenienceStoresJPPaymentMethod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ConvenienceStoresJPPaymentMethod createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new ConvenienceStoresJPPaymentMethod(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ConvenienceStoresJPPaymentMethod[] newArray(int i11) {
            return new ConvenienceStoresJPPaymentMethod[i11];
        }
    }

    @d
    public static /* synthetic */ void getCheckoutAttemptId$annotations() {
    }

    public ConvenienceStoresJPPaymentMethod() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public ConvenienceStoresJPPaymentMethod(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.type = str;
        this.checkoutAttemptId = str2;
        this.sdkData = str3;
        this.firstName = str4;
        this.lastName = str5;
        this.telephoneNumber = str6;
        this.shopperEmail = str7;
    }
}
