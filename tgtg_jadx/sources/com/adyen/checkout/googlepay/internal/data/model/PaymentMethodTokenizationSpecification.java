package com.adyen.checkout.googlepay.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0017HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/adyen/checkout/googlepay/internal/data/model/PaymentMethodTokenizationSpecification;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "type", "", PaymentMethodTokenizationSpecification.PARAMETERS, "Lcom/adyen/checkout/googlepay/internal/data/model/TokenizationParameters;", "(Ljava/lang/String;Lcom/adyen/checkout/googlepay/internal/data/model/TokenizationParameters;)V", "getParameters", "()Lcom/adyen/checkout/googlepay/internal/data/model/TokenizationParameters;", "setParameters", "(Lcom/adyen/checkout/googlepay/internal/data/model/TokenizationParameters;)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PaymentMethodTokenizationSpecification extends ModelObject {

    @NotNull
    private static final String PARAMETERS = "parameters";

    @NotNull
    private static final String TYPE = "type";

    @Nullable
    private TokenizationParameters parameters;

    @Nullable
    private String type;

    @NotNull
    public static final Parcelable.Creator<PaymentMethodTokenizationSpecification> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<PaymentMethodTokenizationSpecification> SERIALIZER = new ModelObject.Serializer<PaymentMethodTokenizationSpecification>() { // from class: com.adyen.checkout.googlepay.internal.data.model.PaymentMethodTokenizationSpecification$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public PaymentMethodTokenizationSpecification deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            return new PaymentMethodTokenizationSpecification(jsonObject.getString("type"), (TokenizationParameters) ModelUtils.deserializeOpt(jsonObject.optJSONObject("parameters"), TokenizationParameters.SERIALIZER));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull PaymentMethodTokenizationSpecification modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt("parameters", ModelUtils.serializeOpt(modelObject.getParameters(), TokenizationParameters.SERIALIZER));
                return jSONObject;
            } catch (JSONException e5) {
                w.j(PaymentMethodTokenizationSpecification.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ PaymentMethodTokenizationSpecification(String str, TokenizationParameters tokenizationParameters, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : tokenizationParameters);
    }

    public static /* synthetic */ PaymentMethodTokenizationSpecification copy$default(PaymentMethodTokenizationSpecification paymentMethodTokenizationSpecification, String str, TokenizationParameters tokenizationParameters, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = paymentMethodTokenizationSpecification.type;
        }
        if ((i11 & 2) != 0) {
            tokenizationParameters = paymentMethodTokenizationSpecification.parameters;
        }
        return paymentMethodTokenizationSpecification.copy(str, tokenizationParameters);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TokenizationParameters getParameters() {
        return this.parameters;
    }

    @NotNull
    public final PaymentMethodTokenizationSpecification copy(@Nullable String type, @Nullable TokenizationParameters parameters) {
        return new PaymentMethodTokenizationSpecification(type, parameters);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodTokenizationSpecification)) {
            return false;
        }
        PaymentMethodTokenizationSpecification paymentMethodTokenizationSpecification = (PaymentMethodTokenizationSpecification) other;
        return Intrinsics.areEqual(this.type, paymentMethodTokenizationSpecification.type) && Intrinsics.areEqual(this.parameters, paymentMethodTokenizationSpecification.parameters);
    }

    @Nullable
    public final TokenizationParameters getParameters() {
        return this.parameters;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        TokenizationParameters tokenizationParameters = this.parameters;
        return iHashCode + (tokenizationParameters != null ? tokenizationParameters.hashCode() : 0);
    }

    public final void setParameters(@Nullable TokenizationParameters tokenizationParameters) {
        this.parameters = tokenizationParameters;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    @NotNull
    public String toString() {
        return "PaymentMethodTokenizationSpecification(type=" + this.type + ", parameters=" + this.parameters + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.type);
        TokenizationParameters tokenizationParameters = this.parameters;
        if (tokenizationParameters == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tokenizationParameters.writeToParcel(parcel, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentMethodTokenizationSpecification> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PaymentMethodTokenizationSpecification createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new PaymentMethodTokenizationSpecification(parcel.readString(), parcel.readInt() == 0 ? null : TokenizationParameters.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PaymentMethodTokenizationSpecification[] newArray(int i11) {
            return new PaymentMethodTokenizationSpecification[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodTokenizationSpecification() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public PaymentMethodTokenizationSpecification(@Nullable String str, @Nullable TokenizationParameters tokenizationParameters) {
        this.type = str;
        this.parameters = tokenizationParameters;
    }
}
