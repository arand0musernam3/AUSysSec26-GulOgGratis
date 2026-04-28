package com.adyen.checkout.components.core.action;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.adyen.checkout.components.core.action.SdkData;
import com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.core.internal.data.model.ModelUtils;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 **\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001*B5\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\tJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u0011JD\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u001cJ\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001eHÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\u0019\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eHÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001e\u0010\b\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\r¨\u0006+"}, d2 = {"Lcom/adyen/checkout/components/core/action/SdkAction;", "SdkDataT", "Lcom/adyen/checkout/components/core/action/SdkData;", "Lcom/adyen/checkout/components/core/action/Action;", "type", "", "paymentData", Action.PAYMENT_METHOD_TYPE, "sdkData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/components/core/action/SdkData;)V", "getPaymentData", "()Ljava/lang/String;", "setPaymentData", "(Ljava/lang/String;)V", "getPaymentMethodType", "setPaymentMethodType", "getSdkData", "()Lcom/adyen/checkout/components/core/action/SdkData;", "setSdkData", "(Lcom/adyen/checkout/components/core/action/SdkData;)V", "Lcom/adyen/checkout/components/core/action/SdkData;", "getType", "setType", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/components/core/action/SdkData;)Lcom/adyen/checkout/components/core/action/SdkAction;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SdkAction<SdkDataT extends SdkData> extends Action {

    @NotNull
    public static final String ACTION_TYPE = "sdk";

    @NotNull
    private static final String SDK_DATA = "sdkData";

    @Nullable
    private String paymentData;

    @Nullable
    private String paymentMethodType;

    @Nullable
    private SdkDataT sdkData;

    @Nullable
    private String type;

    @NotNull
    public static final Parcelable.Creator<SdkAction<?>> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<SdkAction<?>> SERIALIZER = new ModelObject.Serializer<SdkAction<?>>() { // from class: com.adyen.checkout.components.core.action.SdkAction$Companion$SERIALIZER$1
        private final ModelObject.Serializer<SdkData> getSdkDataSerializer(String paymentMethodType) {
            if (paymentMethodType == null || paymentMethodType.length() == 0) {
                throw new CheckoutException("SdkAction cannot be parsed with null paymentMethodType.", null, 2, null);
            }
            if (Intrinsics.areEqual(paymentMethodType, PaymentMethodTypes.TWINT)) {
                ModelObject.Serializer<TwintSdkData> serializer = TwintSdkData.SERIALIZER;
                serializer.getClass();
                return serializer;
            }
            if (!Intrinsics.areEqual(paymentMethodType, PaymentMethodTypes.WECHAT_PAY_SDK)) {
                throw new CheckoutException(f.k("sdkData not found for type paymentMethodType - ", paymentMethodType), null, 2, null);
            }
            ModelObject.Serializer<WeChatPaySdkData> serializer2 = WeChatPaySdkData.SERIALIZER;
            serializer2.getClass();
            return serializer2;
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public SdkAction<SdkData> deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            String stringOrNull = JsonUtilsKt.getStringOrNull(jsonObject, Action.PAYMENT_METHOD_TYPE);
            return new SdkAction<>(JsonUtilsKt.getStringOrNull(jsonObject, "type"), JsonUtilsKt.getStringOrNull(jsonObject, "paymentData"), stringOrNull, (SdkData) ModelUtils.deserializeOpt(jsonObject.optJSONObject(PaymentMethodDetails.SDK_DATA), getSdkDataSerializer(stringOrNull)));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull SdkAction<?> modelObject) {
            modelObject.getClass();
            ModelObject.Serializer<SdkData> sdkDataSerializer = getSdkDataSerializer(modelObject.getPaymentMethodType());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt("paymentData", modelObject.getPaymentData());
                jSONObject.putOpt(Action.PAYMENT_METHOD_TYPE, modelObject.getPaymentMethodType());
                jSONObject.putOpt(PaymentMethodDetails.SDK_DATA, ModelUtils.serializeOpt(modelObject.getSdkData(), sdkDataSerializer));
                return jSONObject;
            } catch (JSONException e5) {
                w.j(SdkAction.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ SdkAction(String str, String str2, String str3, SdkData sdkData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : sdkData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SdkAction copy$default(SdkAction sdkAction, String str, String str2, String str3, SdkData sdkData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sdkAction.type;
        }
        if ((i11 & 2) != 0) {
            str2 = sdkAction.paymentData;
        }
        if ((i11 & 4) != 0) {
            str3 = sdkAction.paymentMethodType;
        }
        if ((i11 & 8) != 0) {
            sdkData = sdkAction.sdkData;
        }
        return sdkAction.copy(str, str2, str3, sdkData);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentData() {
        return this.paymentData;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    @Nullable
    public final SdkDataT component4() {
        return this.sdkData;
    }

    @NotNull
    public final SdkAction<SdkDataT> copy(@Nullable String type, @Nullable String paymentData, @Nullable String paymentMethodType, @Nullable SdkDataT sdkData) {
        return new SdkAction<>(type, paymentData, paymentMethodType, sdkData);
    }

    @Override // com.adyen.checkout.core.internal.data.model.ModelObject, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdkAction)) {
            return false;
        }
        SdkAction sdkAction = (SdkAction) other;
        return Intrinsics.areEqual(this.type, sdkAction.type) && Intrinsics.areEqual(this.paymentData, sdkAction.paymentData) && Intrinsics.areEqual(this.paymentMethodType, sdkAction.paymentMethodType) && Intrinsics.areEqual(this.sdkData, sdkAction.sdkData);
    }

    @Override // com.adyen.checkout.components.core.action.Action
    @Nullable
    public String getPaymentData() {
        return this.paymentData;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    @Nullable
    public String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    @Nullable
    public final SdkDataT getSdkData() {
        return this.sdkData;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    @Nullable
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paymentData;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentMethodType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SdkDataT sdkdatat = this.sdkData;
        return iHashCode3 + (sdkdatat != null ? sdkdatat.hashCode() : 0);
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public void setPaymentData(@Nullable String str) {
        this.paymentData = str;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public void setPaymentMethodType(@Nullable String str) {
        this.paymentMethodType = str;
    }

    public final void setSdkData(@Nullable SdkDataT sdkdatat) {
        this.sdkData = sdkdatat;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public void setType(@Nullable String str) {
        this.type = str;
    }

    @NotNull
    public String toString() {
        String str = this.type;
        String str2 = this.paymentData;
        String str3 = this.paymentMethodType;
        SdkDataT sdkdatat = this.sdkData;
        StringBuilder sbT = f.t("SdkAction(type=", str, ", paymentData=", str2, ", paymentMethodType=");
        sbT.append(str3);
        sbT.append(", sdkData=");
        sbT.append(sdkdatat);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.type);
        parcel.writeString(this.paymentData);
        parcel.writeString(this.paymentMethodType);
        parcel.writeParcelable(this.sdkData, flags);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SdkAction<?>> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SdkAction<?> createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new SdkAction<>(parcel.readString(), parcel.readString(), parcel.readString(), (SdkData) parcel.readParcelable(SdkAction.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SdkAction<?>[] newArray(int i11) {
            return new SdkAction[i11];
        }
    }

    public SdkAction() {
        this(null, null, null, null, 15, null);
    }

    public SdkAction(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable SdkDataT sdkdatat) {
        this.type = str;
        this.paymentData = str2;
        this.paymentMethodType = str3;
        this.sdkData = sdkdatat;
    }
}
