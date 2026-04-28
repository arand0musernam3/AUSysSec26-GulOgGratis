package com.adyen.checkout.components.core;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.core.internal.data.model.ModelUtils;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006!"}, d2 = {"Lcom/adyen/checkout/components/core/OrderResponse;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", OrderResponse.PSP_REFERENCE, "", OrderResponse.ORDER_DATA, OrderResponse.AMOUNT, "Lcom/adyen/checkout/components/core/Amount;", OrderResponse.REMAINING_AMOUNT, "(Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/components/core/Amount;Lcom/adyen/checkout/components/core/Amount;)V", "getAmount", "()Lcom/adyen/checkout/components/core/Amount;", "getOrderData", "()Ljava/lang/String;", "getPspReference", "getRemainingAmount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class OrderResponse extends ModelObject {

    @NotNull
    private static final String AMOUNT = "amount";

    @NotNull
    private static final String ORDER_DATA = "orderData";

    @NotNull
    private static final String PSP_REFERENCE = "pspReference";

    @NotNull
    private static final String REMAINING_AMOUNT = "remainingAmount";

    @Nullable
    private final Amount amount;

    @NotNull
    private final String orderData;

    @NotNull
    private final String pspReference;

    @Nullable
    private final Amount remainingAmount;

    @NotNull
    public static final Parcelable.Creator<OrderResponse> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<OrderResponse> SERIALIZER = new ModelObject.Serializer<OrderResponse>() { // from class: com.adyen.checkout.components.core.OrderResponse$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public OrderResponse deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            String stringOrNull = JsonUtilsKt.getStringOrNull(jsonObject, "pspReference");
            if (stringOrNull == null) {
                stringOrNull = "";
            }
            String stringOrNull2 = JsonUtilsKt.getStringOrNull(jsonObject, "orderData");
            String str = stringOrNull2 != null ? stringOrNull2 : "";
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("amount");
            ModelObject.Serializer<Amount> serializer = Amount.SERIALIZER;
            return new OrderResponse(stringOrNull, str, (Amount) ModelUtils.deserializeOpt(jSONObjectOptJSONObject, serializer), (Amount) ModelUtils.deserializeOpt(jsonObject.optJSONObject("remainingAmount"), serializer));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull OrderResponse modelObject) {
            modelObject.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("pspReference", modelObject.getPspReference());
                jSONObject.putOpt("orderData", modelObject.getOrderData());
                Amount amount = modelObject.getAmount();
                ModelObject.Serializer<Amount> serializer = Amount.SERIALIZER;
                jSONObject.putOpt("amount", ModelUtils.serializeOpt(amount, serializer));
                jSONObject.putOpt("remainingAmount", ModelUtils.serializeOpt(modelObject.getRemainingAmount(), serializer));
                return jSONObject;
            } catch (JSONException e5) {
                w.j(OrderResponse.class, e5);
                return null;
            }
        }
    };

    public OrderResponse(@NotNull String str, @NotNull String str2, @Nullable Amount amount, @Nullable Amount amount2) {
        str.getClass();
        str2.getClass();
        this.pspReference = str;
        this.orderData = str2;
        this.amount = amount;
        this.remainingAmount = amount2;
    }

    public static /* synthetic */ OrderResponse copy$default(OrderResponse orderResponse, String str, String str2, Amount amount, Amount amount2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orderResponse.pspReference;
        }
        if ((i11 & 2) != 0) {
            str2 = orderResponse.orderData;
        }
        if ((i11 & 4) != 0) {
            amount = orderResponse.amount;
        }
        if ((i11 & 8) != 0) {
            amount2 = orderResponse.remainingAmount;
        }
        return orderResponse.copy(str, str2, amount, amount2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPspReference() {
        return this.pspReference;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrderData() {
        return this.orderData;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Amount getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Amount getRemainingAmount() {
        return this.remainingAmount;
    }

    @NotNull
    public final OrderResponse copy(@NotNull String pspReference, @NotNull String orderData, @Nullable Amount amount, @Nullable Amount remainingAmount) {
        pspReference.getClass();
        orderData.getClass();
        return new OrderResponse(pspReference, orderData, amount, remainingAmount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderResponse)) {
            return false;
        }
        OrderResponse orderResponse = (OrderResponse) other;
        return Intrinsics.areEqual(this.pspReference, orderResponse.pspReference) && Intrinsics.areEqual(this.orderData, orderResponse.orderData) && Intrinsics.areEqual(this.amount, orderResponse.amount) && Intrinsics.areEqual(this.remainingAmount, orderResponse.remainingAmount);
    }

    @Nullable
    public final Amount getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getOrderData() {
        return this.orderData;
    }

    @NotNull
    public final String getPspReference() {
        return this.pspReference;
    }

    @Nullable
    public final Amount getRemainingAmount() {
        return this.remainingAmount;
    }

    public int hashCode() {
        int iB = l1.b(this.pspReference.hashCode() * 31, 31, this.orderData);
        Amount amount = this.amount;
        int iHashCode = (iB + (amount == null ? 0 : amount.hashCode())) * 31;
        Amount amount2 = this.remainingAmount;
        return iHashCode + (amount2 != null ? amount2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.pspReference;
        String str2 = this.orderData;
        Amount amount = this.amount;
        Amount amount2 = this.remainingAmount;
        StringBuilder sbT = f.t("OrderResponse(pspReference=", str, ", orderData=", str2, ", amount=");
        sbT.append(amount);
        sbT.append(", remainingAmount=");
        sbT.append(amount2);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.pspReference);
        parcel.writeString(this.orderData);
        Amount amount = this.amount;
        if (amount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount.writeToParcel(parcel, flags);
        }
        Amount amount2 = this.remainingAmount;
        if (amount2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount2.writeToParcel(parcel, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OrderResponse createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new OrderResponse(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Amount.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Amount.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OrderResponse[] newArray(int i11) {
            return new OrderResponse[i11];
        }
    }
}
