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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0001/BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020#HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020#HÖ\u0001R&\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR&\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u000f¨\u00060"}, d2 = {"Lcom/adyen/checkout/components/core/paymentmethod/GooglePayPaymentMethod;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "type", "", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, PaymentMethodDetails.SDK_DATA, GooglePayPaymentMethod.GOOGLE_PAY_TOKEN, GooglePayPaymentMethod.GOOGLE_PAY_CARD_NETWORK, GooglePayPaymentMethod.THREEDS2_SDK_VERSION, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCheckoutAttemptId$annotations", "()V", "getCheckoutAttemptId", "()Ljava/lang/String;", "setCheckoutAttemptId", "(Ljava/lang/String;)V", "getGooglePayCardNetwork", "setGooglePayCardNetwork", "getGooglePayToken", "setGooglePayToken", "getSdkData", "setSdkData", "getThreeDS2SdkVersion$annotations", "getThreeDS2SdkVersion", "setThreeDS2SdkVersion", "getType", "setType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GooglePayPaymentMethod extends PaymentMethodDetails {

    @NotNull
    private static final String GOOGLE_PAY_CARD_NETWORK = "googlePayCardNetwork";

    @NotNull
    private static final String GOOGLE_PAY_TOKEN = "googlePayToken";

    @NotNull
    private static final String THREEDS2_SDK_VERSION = "threeDS2SdkVersion";

    @Nullable
    private String checkoutAttemptId;

    @Nullable
    private String googlePayCardNetwork;

    @Nullable
    private String googlePayToken;

    @Nullable
    private String sdkData;

    @Nullable
    private String threeDS2SdkVersion;

    @Nullable
    private String type;

    @NotNull
    public static final Parcelable.Creator<GooglePayPaymentMethod> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<GooglePayPaymentMethod> SERIALIZER = new ModelObject.Serializer<GooglePayPaymentMethod>() { // from class: com.adyen.checkout.components.core.paymentmethod.GooglePayPaymentMethod$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public GooglePayPaymentMethod deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            return new GooglePayPaymentMethod(JsonUtilsKt.getStringOrNull(jsonObject, "type"), JsonUtilsKt.getStringOrNull(jsonObject, PaymentMethodDetails.CHECKOUT_ATTEMPT_ID), JsonUtilsKt.getStringOrNull(jsonObject, PaymentMethodDetails.SDK_DATA), JsonUtilsKt.getStringOrNull(jsonObject, "googlePayToken"), JsonUtilsKt.getStringOrNull(jsonObject, "googlePayCardNetwork"), JsonUtilsKt.getStringOrNull(jsonObject, "threeDS2SdkVersion"));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull GooglePayPaymentMethod modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt(PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, modelObject.getCheckoutAttemptId());
                jSONObject.putOpt(PaymentMethodDetails.SDK_DATA, modelObject.getSdkData());
                jSONObject.putOpt("googlePayToken", modelObject.getGooglePayToken());
                jSONObject.putOpt("googlePayCardNetwork", modelObject.getGooglePayCardNetwork());
                jSONObject.putOpt("threeDS2SdkVersion", modelObject.getThreeDS2SdkVersion());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(GooglePayPaymentMethod.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ GooglePayPaymentMethod(String str, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6);
    }

    public static /* synthetic */ GooglePayPaymentMethod copy$default(GooglePayPaymentMethod googlePayPaymentMethod, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = googlePayPaymentMethod.type;
        }
        if ((i11 & 2) != 0) {
            str2 = googlePayPaymentMethod.checkoutAttemptId;
        }
        if ((i11 & 4) != 0) {
            str3 = googlePayPaymentMethod.sdkData;
        }
        if ((i11 & 8) != 0) {
            str4 = googlePayPaymentMethod.googlePayToken;
        }
        if ((i11 & 16) != 0) {
            str5 = googlePayPaymentMethod.googlePayCardNetwork;
        }
        if ((i11 & 32) != 0) {
            str6 = googlePayPaymentMethod.threeDS2SdkVersion;
        }
        String str7 = str5;
        String str8 = str6;
        return googlePayPaymentMethod.copy(str, str2, str3, str4, str7, str8);
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
    public final String getGooglePayToken() {
        return this.googlePayToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getGooglePayCardNetwork() {
        return this.googlePayCardNetwork;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getThreeDS2SdkVersion() {
        return this.threeDS2SdkVersion;
    }

    @NotNull
    public final GooglePayPaymentMethod copy(@Nullable String type, @Nullable String checkoutAttemptId, @Nullable String sdkData, @Nullable String googlePayToken, @Nullable String googlePayCardNetwork, @Nullable String threeDS2SdkVersion) {
        return new GooglePayPaymentMethod(type, checkoutAttemptId, sdkData, googlePayToken, googlePayCardNetwork, threeDS2SdkVersion);
    }

    @Override // com.adyen.checkout.core.internal.data.model.ModelObject, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GooglePayPaymentMethod)) {
            return false;
        }
        GooglePayPaymentMethod googlePayPaymentMethod = (GooglePayPaymentMethod) other;
        return Intrinsics.areEqual(this.type, googlePayPaymentMethod.type) && Intrinsics.areEqual(this.checkoutAttemptId, googlePayPaymentMethod.checkoutAttemptId) && Intrinsics.areEqual(this.sdkData, googlePayPaymentMethod.sdkData) && Intrinsics.areEqual(this.googlePayToken, googlePayPaymentMethod.googlePayToken) && Intrinsics.areEqual(this.googlePayCardNetwork, googlePayPaymentMethod.googlePayCardNetwork) && Intrinsics.areEqual(this.threeDS2SdkVersion, googlePayPaymentMethod.threeDS2SdkVersion);
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    @Nullable
    public String getCheckoutAttemptId() {
        return this.checkoutAttemptId;
    }

    @Nullable
    public final String getGooglePayCardNetwork() {
        return this.googlePayCardNetwork;
    }

    @Nullable
    public final String getGooglePayToken() {
        return this.googlePayToken;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    @Nullable
    public String getSdkData() {
        return this.sdkData;
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
        String str4 = this.googlePayToken;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.googlePayCardNetwork;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.threeDS2SdkVersion;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setCheckoutAttemptId(@Nullable String str) {
        this.checkoutAttemptId = str;
    }

    public final void setGooglePayCardNetwork(@Nullable String str) {
        this.googlePayCardNetwork = str;
    }

    public final void setGooglePayToken(@Nullable String str) {
        this.googlePayToken = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setSdkData(@Nullable String str) {
        this.sdkData = str;
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
        String str4 = this.googlePayToken;
        String str5 = this.googlePayCardNetwork;
        String str6 = this.threeDS2SdkVersion;
        StringBuilder sbT = f.t("GooglePayPaymentMethod(type=", str, ", checkoutAttemptId=", str2, ", sdkData=");
        s.A(sbT, str3, ", googlePayToken=", str4, ", googlePayCardNetwork=");
        return f.o(sbT, str5, ", threeDS2SdkVersion=", str6, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.type);
        parcel.writeString(this.checkoutAttemptId);
        parcel.writeString(this.sdkData);
        parcel.writeString(this.googlePayToken);
        parcel.writeString(this.googlePayCardNetwork);
        parcel.writeString(this.threeDS2SdkVersion);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GooglePayPaymentMethod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GooglePayPaymentMethod createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new GooglePayPaymentMethod(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GooglePayPaymentMethod[] newArray(int i11) {
            return new GooglePayPaymentMethod[i11];
        }
    }

    @d
    public static /* synthetic */ void getCheckoutAttemptId$annotations() {
    }

    @d
    public static /* synthetic */ void getThreeDS2SdkVersion$annotations() {
    }

    public GooglePayPaymentMethod(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.type = str;
        this.checkoutAttemptId = str2;
        this.sdkData = str3;
        this.googlePayToken = str4;
        this.googlePayCardNetwork = str5;
        this.threeDS2SdkVersion = str6;
    }
}
