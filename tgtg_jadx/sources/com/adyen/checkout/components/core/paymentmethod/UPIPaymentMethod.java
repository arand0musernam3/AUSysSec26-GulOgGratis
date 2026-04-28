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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0001*B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001eHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0019\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eHÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\n\"\u0004\b\u0016\u0010\f¨\u0006+"}, d2 = {"Lcom/adyen/checkout/components/core/paymentmethod/UPIPaymentMethod;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "type", "", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, PaymentMethodDetails.SDK_DATA, UPIPaymentMethod.VIRTUAL_PAYMENT_ADDRESS, "appId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "getCheckoutAttemptId$annotations", "()V", "getCheckoutAttemptId", "setCheckoutAttemptId", "getSdkData", "setSdkData", "getType", "setType", "getVirtualPaymentAddress", "setVirtualPaymentAddress", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class UPIPaymentMethod extends PaymentMethodDetails {

    @NotNull
    private static final String APP_ID = "appId";

    @NotNull
    private static final String VIRTUAL_PAYMENT_ADDRESS = "virtualPaymentAddress";

    @Nullable
    private String appId;

    @Nullable
    private String checkoutAttemptId;

    @Nullable
    private String sdkData;

    @Nullable
    private String type;

    @Nullable
    private String virtualPaymentAddress;

    @NotNull
    public static final Parcelable.Creator<UPIPaymentMethod> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<UPIPaymentMethod> SERIALIZER = new ModelObject.Serializer<UPIPaymentMethod>() { // from class: com.adyen.checkout.components.core.paymentmethod.UPIPaymentMethod$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public UPIPaymentMethod deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            return new UPIPaymentMethod(JsonUtilsKt.getStringOrNull(jsonObject, "type"), JsonUtilsKt.getStringOrNull(jsonObject, PaymentMethodDetails.CHECKOUT_ATTEMPT_ID), JsonUtilsKt.getStringOrNull(jsonObject, PaymentMethodDetails.SDK_DATA), JsonUtilsKt.getStringOrNull(jsonObject, "virtualPaymentAddress"), JsonUtilsKt.getStringOrNull(jsonObject, "appId"));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull UPIPaymentMethod modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt(PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, modelObject.getCheckoutAttemptId());
                jSONObject.putOpt(PaymentMethodDetails.SDK_DATA, modelObject.getSdkData());
                jSONObject.putOpt("virtualPaymentAddress", modelObject.getVirtualPaymentAddress());
                jSONObject.putOpt("appId", modelObject.getAppId());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(UPIPaymentMethod.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ UPIPaymentMethod(String str, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, str4, str5);
    }

    public static /* synthetic */ UPIPaymentMethod copy$default(UPIPaymentMethod uPIPaymentMethod, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = uPIPaymentMethod.type;
        }
        if ((i11 & 2) != 0) {
            str2 = uPIPaymentMethod.checkoutAttemptId;
        }
        if ((i11 & 4) != 0) {
            str3 = uPIPaymentMethod.sdkData;
        }
        if ((i11 & 8) != 0) {
            str4 = uPIPaymentMethod.virtualPaymentAddress;
        }
        if ((i11 & 16) != 0) {
            str5 = uPIPaymentMethod.appId;
        }
        String str6 = str5;
        String str7 = str3;
        return uPIPaymentMethod.copy(str, str2, str7, str4, str6);
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
    public final String getVirtualPaymentAddress() {
        return this.virtualPaymentAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final UPIPaymentMethod copy(@Nullable String type, @Nullable String checkoutAttemptId, @Nullable String sdkData, @Nullable String virtualPaymentAddress, @Nullable String appId) {
        return new UPIPaymentMethod(type, checkoutAttemptId, sdkData, virtualPaymentAddress, appId);
    }

    @Override // com.adyen.checkout.core.internal.data.model.ModelObject, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UPIPaymentMethod)) {
            return false;
        }
        UPIPaymentMethod uPIPaymentMethod = (UPIPaymentMethod) other;
        return Intrinsics.areEqual(this.type, uPIPaymentMethod.type) && Intrinsics.areEqual(this.checkoutAttemptId, uPIPaymentMethod.checkoutAttemptId) && Intrinsics.areEqual(this.sdkData, uPIPaymentMethod.sdkData) && Intrinsics.areEqual(this.virtualPaymentAddress, uPIPaymentMethod.virtualPaymentAddress) && Intrinsics.areEqual(this.appId, uPIPaymentMethod.appId);
    }

    @Nullable
    public final String getAppId() {
        return this.appId;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    @Nullable
    public String getCheckoutAttemptId() {
        return this.checkoutAttemptId;
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

    @Nullable
    public final String getVirtualPaymentAddress() {
        return this.virtualPaymentAddress;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.checkoutAttemptId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sdkData;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.virtualPaymentAddress;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.appId;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setAppId(@Nullable String str) {
        this.appId = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setCheckoutAttemptId(@Nullable String str) {
        this.checkoutAttemptId = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setSdkData(@Nullable String str) {
        this.sdkData = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setVirtualPaymentAddress(@Nullable String str) {
        this.virtualPaymentAddress = str;
    }

    @NotNull
    public String toString() {
        String str = this.type;
        String str2 = this.checkoutAttemptId;
        String str3 = this.sdkData;
        String str4 = this.virtualPaymentAddress;
        String str5 = this.appId;
        StringBuilder sbT = f.t("UPIPaymentMethod(type=", str, ", checkoutAttemptId=", str2, ", sdkData=");
        s.A(sbT, str3, ", virtualPaymentAddress=", str4, ", appId=");
        return k.p(sbT, str5, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.type);
        parcel.writeString(this.checkoutAttemptId);
        parcel.writeString(this.sdkData);
        parcel.writeString(this.virtualPaymentAddress);
        parcel.writeString(this.appId);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UPIPaymentMethod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UPIPaymentMethod createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new UPIPaymentMethod(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UPIPaymentMethod[] newArray(int i11) {
            return new UPIPaymentMethod[i11];
        }
    }

    public UPIPaymentMethod(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.type = str;
        this.checkoutAttemptId = str2;
        this.sdkData = str3;
        this.virtualPaymentAddress = str4;
        this.appId = str5;
    }

    @d
    public static /* synthetic */ void getCheckoutAttemptId$annotations() {
    }
}
