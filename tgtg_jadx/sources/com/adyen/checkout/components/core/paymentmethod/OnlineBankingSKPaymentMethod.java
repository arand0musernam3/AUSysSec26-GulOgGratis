package com.adyen.checkout.components.core.paymentmethod;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import e0.f;
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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001&B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001R&\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r¨\u0006'"}, d2 = {"Lcom/adyen/checkout/components/core/paymentmethod/OnlineBankingSKPaymentMethod;", "Lcom/adyen/checkout/components/core/paymentmethod/IssuerListPaymentMethod;", "type", "", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, PaymentMethodDetails.SDK_DATA, IssuerListPaymentMethod.ISSUER, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCheckoutAttemptId$annotations", "()V", "getCheckoutAttemptId", "()Ljava/lang/String;", "setCheckoutAttemptId", "(Ljava/lang/String;)V", "getIssuer", "setIssuer", "getSdkData", "setSdkData", "getType", "setType", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class OnlineBankingSKPaymentMethod extends IssuerListPaymentMethod {

    @NotNull
    public static final String PAYMENT_METHOD_TYPE = "onlineBanking_SK";

    @Nullable
    private String checkoutAttemptId;

    @Nullable
    private String issuer;

    @Nullable
    private String sdkData;

    @Nullable
    private String type;

    @NotNull
    public static final Parcelable.Creator<OnlineBankingSKPaymentMethod> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<OnlineBankingSKPaymentMethod> SERIALIZER = new ModelObject.Serializer<OnlineBankingSKPaymentMethod>() { // from class: com.adyen.checkout.components.core.paymentmethod.OnlineBankingSKPaymentMethod$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public OnlineBankingSKPaymentMethod deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            return new OnlineBankingSKPaymentMethod(JsonUtilsKt.getStringOrNull(jsonObject, "type"), JsonUtilsKt.getStringOrNull(jsonObject, PaymentMethodDetails.CHECKOUT_ATTEMPT_ID), JsonUtilsKt.getStringOrNull(jsonObject, PaymentMethodDetails.SDK_DATA), JsonUtilsKt.getStringOrNull(jsonObject, IssuerListPaymentMethod.ISSUER));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull OnlineBankingSKPaymentMethod modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt(PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, modelObject.getCheckoutAttemptId());
                jSONObject.putOpt(PaymentMethodDetails.SDK_DATA, modelObject.getSdkData());
                jSONObject.putOpt(IssuerListPaymentMethod.ISSUER, modelObject.getIssuer());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(OnlineBankingSKPaymentMethod.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ OnlineBankingSKPaymentMethod(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4);
    }

    public static /* synthetic */ OnlineBankingSKPaymentMethod copy$default(OnlineBankingSKPaymentMethod onlineBankingSKPaymentMethod, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = onlineBankingSKPaymentMethod.type;
        }
        if ((i11 & 2) != 0) {
            str2 = onlineBankingSKPaymentMethod.checkoutAttemptId;
        }
        if ((i11 & 4) != 0) {
            str3 = onlineBankingSKPaymentMethod.sdkData;
        }
        if ((i11 & 8) != 0) {
            str4 = onlineBankingSKPaymentMethod.issuer;
        }
        return onlineBankingSKPaymentMethod.copy(str, str2, str3, str4);
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
    public final String getIssuer() {
        return this.issuer;
    }

    @NotNull
    public final OnlineBankingSKPaymentMethod copy(@Nullable String type, @Nullable String checkoutAttemptId, @Nullable String sdkData, @Nullable String issuer) {
        return new OnlineBankingSKPaymentMethod(type, checkoutAttemptId, sdkData, issuer);
    }

    @Override // com.adyen.checkout.core.internal.data.model.ModelObject, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnlineBankingSKPaymentMethod)) {
            return false;
        }
        OnlineBankingSKPaymentMethod onlineBankingSKPaymentMethod = (OnlineBankingSKPaymentMethod) other;
        return Intrinsics.areEqual(this.type, onlineBankingSKPaymentMethod.type) && Intrinsics.areEqual(this.checkoutAttemptId, onlineBankingSKPaymentMethod.checkoutAttemptId) && Intrinsics.areEqual(this.sdkData, onlineBankingSKPaymentMethod.sdkData) && Intrinsics.areEqual(this.issuer, onlineBankingSKPaymentMethod.issuer);
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    @Nullable
    public String getCheckoutAttemptId() {
        return this.checkoutAttemptId;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.IssuerListPaymentMethod
    @Nullable
    public String getIssuer() {
        return this.issuer;
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
        String str4 = this.issuer;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setCheckoutAttemptId(@Nullable String str) {
        this.checkoutAttemptId = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.IssuerListPaymentMethod
    public void setIssuer(@Nullable String str) {
        this.issuer = str;
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
        return f.o(f.t("OnlineBankingSKPaymentMethod(type=", str, ", checkoutAttemptId=", str2, ", sdkData="), this.sdkData, ", issuer=", this.issuer, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.type);
        parcel.writeString(this.checkoutAttemptId);
        parcel.writeString(this.sdkData);
        parcel.writeString(this.issuer);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OnlineBankingSKPaymentMethod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OnlineBankingSKPaymentMethod createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new OnlineBankingSKPaymentMethod(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OnlineBankingSKPaymentMethod[] newArray(int i11) {
            return new OnlineBankingSKPaymentMethod[i11];
        }
    }

    @d
    public static /* synthetic */ void getCheckoutAttemptId$annotations() {
    }

    public OnlineBankingSKPaymentMethod() {
        this(null, null, null, null, 15, null);
    }

    public OnlineBankingSKPaymentMethod(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.type = str;
        this.checkoutAttemptId = str2;
        this.sdkData = str3;
        this.issuer = str4;
    }
}
