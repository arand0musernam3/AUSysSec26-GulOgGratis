package com.adyen.checkout.googlepay.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.core.internal.data.model.ModelUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0001%B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001eHÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006&"}, d2 = {"Lcom/adyen/checkout/googlepay/internal/data/model/GooglePayPaymentMethodModel;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "type", "", GooglePayPaymentMethodModel.PARAMETERS, "Lcom/adyen/checkout/googlepay/internal/data/model/CardParameters;", GooglePayPaymentMethodModel.TOKENIZATION_SPECIFICATION, "Lcom/adyen/checkout/googlepay/internal/data/model/PaymentMethodTokenizationSpecification;", "(Ljava/lang/String;Lcom/adyen/checkout/googlepay/internal/data/model/CardParameters;Lcom/adyen/checkout/googlepay/internal/data/model/PaymentMethodTokenizationSpecification;)V", "getParameters", "()Lcom/adyen/checkout/googlepay/internal/data/model/CardParameters;", "setParameters", "(Lcom/adyen/checkout/googlepay/internal/data/model/CardParameters;)V", "getTokenizationSpecification", "()Lcom/adyen/checkout/googlepay/internal/data/model/PaymentMethodTokenizationSpecification;", "setTokenizationSpecification", "(Lcom/adyen/checkout/googlepay/internal/data/model/PaymentMethodTokenizationSpecification;)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GooglePayPaymentMethodModel extends ModelObject {

    @NotNull
    private static final String PARAMETERS = "parameters";

    @NotNull
    private static final String TOKENIZATION_SPECIFICATION = "tokenizationSpecification";

    @NotNull
    private static final String TYPE = "type";

    @Nullable
    private CardParameters parameters;

    @Nullable
    private PaymentMethodTokenizationSpecification tokenizationSpecification;

    @Nullable
    private String type;

    @NotNull
    public static final Parcelable.Creator<GooglePayPaymentMethodModel> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<GooglePayPaymentMethodModel> SERIALIZER = new ModelObject.Serializer<GooglePayPaymentMethodModel>() { // from class: com.adyen.checkout.googlepay.internal.data.model.GooglePayPaymentMethodModel$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public GooglePayPaymentMethodModel deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            GooglePayPaymentMethodModel googlePayPaymentMethodModel = new GooglePayPaymentMethodModel(null, null, null, 7, null);
            googlePayPaymentMethodModel.setType(JsonUtilsKt.getStringOrNull(jsonObject, "type"));
            googlePayPaymentMethodModel.setParameters((CardParameters) ModelUtils.deserializeOpt(jsonObject.optJSONObject("parameters"), CardParameters.SERIALIZER));
            googlePayPaymentMethodModel.setTokenizationSpecification((PaymentMethodTokenizationSpecification) ModelUtils.deserializeOpt(jsonObject.optJSONObject("tokenizationSpecification"), PaymentMethodTokenizationSpecification.SERIALIZER));
            return googlePayPaymentMethodModel;
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull GooglePayPaymentMethodModel modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt("parameters", ModelUtils.serializeOpt(modelObject.getParameters(), CardParameters.SERIALIZER));
                jSONObject.putOpt("tokenizationSpecification", ModelUtils.serializeOpt(modelObject.getTokenizationSpecification(), PaymentMethodTokenizationSpecification.SERIALIZER));
                return jSONObject;
            } catch (JSONException e5) {
                w.j(GooglePayPaymentMethodModel.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ GooglePayPaymentMethodModel(String str, CardParameters cardParameters, PaymentMethodTokenizationSpecification paymentMethodTokenizationSpecification, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : cardParameters, (i11 & 4) != 0 ? null : paymentMethodTokenizationSpecification);
    }

    public static /* synthetic */ GooglePayPaymentMethodModel copy$default(GooglePayPaymentMethodModel googlePayPaymentMethodModel, String str, CardParameters cardParameters, PaymentMethodTokenizationSpecification paymentMethodTokenizationSpecification, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = googlePayPaymentMethodModel.type;
        }
        if ((i11 & 2) != 0) {
            cardParameters = googlePayPaymentMethodModel.parameters;
        }
        if ((i11 & 4) != 0) {
            paymentMethodTokenizationSpecification = googlePayPaymentMethodModel.tokenizationSpecification;
        }
        return googlePayPaymentMethodModel.copy(str, cardParameters, paymentMethodTokenizationSpecification);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CardParameters getParameters() {
        return this.parameters;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PaymentMethodTokenizationSpecification getTokenizationSpecification() {
        return this.tokenizationSpecification;
    }

    @NotNull
    public final GooglePayPaymentMethodModel copy(@Nullable String type, @Nullable CardParameters parameters, @Nullable PaymentMethodTokenizationSpecification tokenizationSpecification) {
        return new GooglePayPaymentMethodModel(type, parameters, tokenizationSpecification);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GooglePayPaymentMethodModel)) {
            return false;
        }
        GooglePayPaymentMethodModel googlePayPaymentMethodModel = (GooglePayPaymentMethodModel) other;
        return Intrinsics.areEqual(this.type, googlePayPaymentMethodModel.type) && Intrinsics.areEqual(this.parameters, googlePayPaymentMethodModel.parameters) && Intrinsics.areEqual(this.tokenizationSpecification, googlePayPaymentMethodModel.tokenizationSpecification);
    }

    @Nullable
    public final CardParameters getParameters() {
        return this.parameters;
    }

    @Nullable
    public final PaymentMethodTokenizationSpecification getTokenizationSpecification() {
        return this.tokenizationSpecification;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        CardParameters cardParameters = this.parameters;
        int iHashCode2 = (iHashCode + (cardParameters == null ? 0 : cardParameters.hashCode())) * 31;
        PaymentMethodTokenizationSpecification paymentMethodTokenizationSpecification = this.tokenizationSpecification;
        return iHashCode2 + (paymentMethodTokenizationSpecification != null ? paymentMethodTokenizationSpecification.hashCode() : 0);
    }

    public final void setParameters(@Nullable CardParameters cardParameters) {
        this.parameters = cardParameters;
    }

    public final void setTokenizationSpecification(@Nullable PaymentMethodTokenizationSpecification paymentMethodTokenizationSpecification) {
        this.tokenizationSpecification = paymentMethodTokenizationSpecification;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    @NotNull
    public String toString() {
        return "GooglePayPaymentMethodModel(type=" + this.type + ", parameters=" + this.parameters + ", tokenizationSpecification=" + this.tokenizationSpecification + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.type);
        CardParameters cardParameters = this.parameters;
        if (cardParameters == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cardParameters.writeToParcel(parcel, flags);
        }
        PaymentMethodTokenizationSpecification paymentMethodTokenizationSpecification = this.tokenizationSpecification;
        if (paymentMethodTokenizationSpecification == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentMethodTokenizationSpecification.writeToParcel(parcel, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GooglePayPaymentMethodModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GooglePayPaymentMethodModel createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new GooglePayPaymentMethodModel(parcel.readString(), parcel.readInt() == 0 ? null : CardParameters.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PaymentMethodTokenizationSpecification.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GooglePayPaymentMethodModel[] newArray(int i11) {
            return new GooglePayPaymentMethodModel[i11];
        }
    }

    public GooglePayPaymentMethodModel() {
        this(null, null, null, 7, null);
    }

    public GooglePayPaymentMethodModel(@Nullable String str, @Nullable CardParameters cardParameters, @Nullable PaymentMethodTokenizationSpecification paymentMethodTokenizationSpecification) {
        this.type = str;
        this.parameters = cardParameters;
        this.tokenizationSpecification = paymentMethodTokenizationSpecification;
    }
}
