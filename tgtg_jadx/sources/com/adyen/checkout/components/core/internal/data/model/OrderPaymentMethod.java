package com.adyen.checkout.components.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.core.internal.data.model.ModelUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006!"}, d2 = {"Lcom/adyen/checkout/components/core/internal/data/model/OrderPaymentMethod;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "type", "", OrderPaymentMethod.AMOUNT, "Lcom/adyen/checkout/components/core/Amount;", OrderPaymentMethod.LAST_FOUR, OrderPaymentMethod.TRANSACTION_LIMIT, "(Ljava/lang/String;Lcom/adyen/checkout/components/core/Amount;Ljava/lang/String;Lcom/adyen/checkout/components/core/Amount;)V", "getAmount", "()Lcom/adyen/checkout/components/core/Amount;", "getLastFour", "()Ljava/lang/String;", "getTransactionLimit", "getType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class OrderPaymentMethod extends ModelObject {

    @NotNull
    private static final String AMOUNT = "amount";

    @NotNull
    private static final String LAST_FOUR = "lastFour";

    @NotNull
    private static final String TRANSACTION_LIMIT = "transactionLimit";

    @NotNull
    private static final String TYPE = "type";

    @Nullable
    private final Amount amount;

    @NotNull
    private final String lastFour;

    @Nullable
    private final Amount transactionLimit;

    @NotNull
    private final String type;

    @NotNull
    public static final Parcelable.Creator<OrderPaymentMethod> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<OrderPaymentMethod> SERIALIZER = new ModelObject.Serializer<OrderPaymentMethod>() { // from class: com.adyen.checkout.components.core.internal.data.model.OrderPaymentMethod$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public OrderPaymentMethod deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            try {
                String string = jsonObject.getString("type");
                String string2 = jsonObject.getString("lastFour");
                JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("amount");
                ModelObject.Serializer<Amount> serializer = Amount.SERIALIZER;
                Amount amount = (Amount) ModelUtils.deserializeOpt(jSONObjectOptJSONObject, serializer);
                Amount amount2 = (Amount) ModelUtils.deserializeOpt(jsonObject.optJSONObject("transactionLimit"), serializer);
                string.getClass();
                string2.getClass();
                return new OrderPaymentMethod(string, amount, string2, amount2);
            } catch (JSONException e5) {
                w.j(OrderPaymentMethod.class, e5);
                return null;
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull OrderPaymentMethod modelObject) {
            modelObject.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt("lastFour", modelObject.getLastFour());
                Amount amount = modelObject.getAmount();
                ModelObject.Serializer<Amount> serializer = Amount.SERIALIZER;
                jSONObject.putOpt("amount", ModelUtils.serializeOpt(amount, serializer));
                jSONObject.putOpt("transactionLimit", ModelUtils.serializeOpt(modelObject.getTransactionLimit(), serializer));
                return jSONObject;
            } catch (JSONException e5) {
                w.j(OrderPaymentMethod.class, e5);
                return null;
            }
        }
    };

    public OrderPaymentMethod(@NotNull String str, @Nullable Amount amount, @NotNull String str2, @Nullable Amount amount2) {
        str.getClass();
        str2.getClass();
        this.type = str;
        this.amount = amount;
        this.lastFour = str2;
        this.transactionLimit = amount2;
    }

    public static /* synthetic */ OrderPaymentMethod copy$default(OrderPaymentMethod orderPaymentMethod, String str, Amount amount, String str2, Amount amount2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orderPaymentMethod.type;
        }
        if ((i11 & 2) != 0) {
            amount = orderPaymentMethod.amount;
        }
        if ((i11 & 4) != 0) {
            str2 = orderPaymentMethod.lastFour;
        }
        if ((i11 & 8) != 0) {
            amount2 = orderPaymentMethod.transactionLimit;
        }
        return orderPaymentMethod.copy(str, amount, str2, amount2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Amount getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastFour() {
        return this.lastFour;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Amount getTransactionLimit() {
        return this.transactionLimit;
    }

    @NotNull
    public final OrderPaymentMethod copy(@NotNull String type, @Nullable Amount amount, @NotNull String lastFour, @Nullable Amount transactionLimit) {
        type.getClass();
        lastFour.getClass();
        return new OrderPaymentMethod(type, amount, lastFour, transactionLimit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderPaymentMethod)) {
            return false;
        }
        OrderPaymentMethod orderPaymentMethod = (OrderPaymentMethod) other;
        return Intrinsics.areEqual(this.type, orderPaymentMethod.type) && Intrinsics.areEqual(this.amount, orderPaymentMethod.amount) && Intrinsics.areEqual(this.lastFour, orderPaymentMethod.lastFour) && Intrinsics.areEqual(this.transactionLimit, orderPaymentMethod.transactionLimit);
    }

    @Nullable
    public final Amount getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getLastFour() {
        return this.lastFour;
    }

    @Nullable
    public final Amount getTransactionLimit() {
        return this.transactionLimit;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Amount amount = this.amount;
        int iB = l1.b((iHashCode + (amount == null ? 0 : amount.hashCode())) * 31, 31, this.lastFour);
        Amount amount2 = this.transactionLimit;
        return iB + (amount2 != null ? amount2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OrderPaymentMethod(type=" + this.type + ", amount=" + this.amount + ", lastFour=" + this.lastFour + ", transactionLimit=" + this.transactionLimit + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.type);
        Amount amount = this.amount;
        if (amount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.lastFour);
        Amount amount2 = this.transactionLimit;
        if (amount2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount2.writeToParcel(parcel, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderPaymentMethod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OrderPaymentMethod createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new OrderPaymentMethod(parcel.readString(), parcel.readInt() == 0 ? null : Amount.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? Amount.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OrderPaymentMethod[] newArray(int i11) {
            return new OrderPaymentMethod[i11];
        }
    }
}
