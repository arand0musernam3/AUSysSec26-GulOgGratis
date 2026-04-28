package com.adyen.checkout.components.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import c50.w;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.core.internal.data.model.ModelUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/adyen/checkout/components/core/internal/data/model/OrderStatusResponse;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", OrderStatusResponse.PAYMENT_METHODS, "", "Lcom/adyen/checkout/components/core/internal/data/model/OrderPaymentMethod;", OrderStatusResponse.REMAINING_AMOUNT, "Lcom/adyen/checkout/components/core/Amount;", "(Ljava/util/List;Lcom/adyen/checkout/components/core/Amount;)V", "getPaymentMethods", "()Ljava/util/List;", "getRemainingAmount", "()Lcom/adyen/checkout/components/core/Amount;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class OrderStatusResponse extends ModelObject {

    @NotNull
    private static final String PAYMENT_METHODS = "paymentMethods";

    @NotNull
    private static final String REMAINING_AMOUNT = "remainingAmount";

    @NotNull
    private final List<OrderPaymentMethod> paymentMethods;

    @Nullable
    private final Amount remainingAmount;

    @NotNull
    public static final Parcelable.Creator<OrderStatusResponse> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<OrderStatusResponse> SERIALIZER = new ModelObject.Serializer<OrderStatusResponse>() { // from class: com.adyen.checkout.components.core.internal.data.model.OrderStatusResponse$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public OrderStatusResponse deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            try {
                List listDeserializeOptList = ModelUtils.deserializeOptList(jsonObject.optJSONArray("paymentMethods"), OrderPaymentMethod.SERIALIZER);
                if (listDeserializeOptList == null) {
                    listDeserializeOptList = n0.f26529a;
                }
                return new OrderStatusResponse(listDeserializeOptList, (Amount) ModelUtils.deserializeOpt(jsonObject.optJSONObject("remainingAmount"), Amount.SERIALIZER));
            } catch (JSONException e5) {
                w.j(OrderStatusResponse.class, e5);
                return null;
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull OrderStatusResponse modelObject) {
            modelObject.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("paymentMethods", ModelUtils.serializeOptList(modelObject.getPaymentMethods(), OrderPaymentMethod.SERIALIZER));
                jSONObject.putOpt("remainingAmount", modelObject.getRemainingAmount());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(OrderStatusResponse.class, e5);
                return null;
            }
        }
    };

    public OrderStatusResponse(@NotNull List<OrderPaymentMethod> list, @Nullable Amount amount) {
        list.getClass();
        this.paymentMethods = list;
        this.remainingAmount = amount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderStatusResponse copy$default(OrderStatusResponse orderStatusResponse, List list, Amount amount, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = orderStatusResponse.paymentMethods;
        }
        if ((i11 & 2) != 0) {
            amount = orderStatusResponse.remainingAmount;
        }
        return orderStatusResponse.copy(list, amount);
    }

    @NotNull
    public final List<OrderPaymentMethod> component1() {
        return this.paymentMethods;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Amount getRemainingAmount() {
        return this.remainingAmount;
    }

    @NotNull
    public final OrderStatusResponse copy(@NotNull List<OrderPaymentMethod> paymentMethods, @Nullable Amount remainingAmount) {
        paymentMethods.getClass();
        return new OrderStatusResponse(paymentMethods, remainingAmount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderStatusResponse)) {
            return false;
        }
        OrderStatusResponse orderStatusResponse = (OrderStatusResponse) other;
        return Intrinsics.areEqual(this.paymentMethods, orderStatusResponse.paymentMethods) && Intrinsics.areEqual(this.remainingAmount, orderStatusResponse.remainingAmount);
    }

    @NotNull
    public final List<OrderPaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }

    @Nullable
    public final Amount getRemainingAmount() {
        return this.remainingAmount;
    }

    public int hashCode() {
        int iHashCode = this.paymentMethods.hashCode() * 31;
        Amount amount = this.remainingAmount;
        return iHashCode + (amount == null ? 0 : amount.hashCode());
    }

    @NotNull
    public String toString() {
        return "OrderStatusResponse(paymentMethods=" + this.paymentMethods + ", remainingAmount=" + this.remainingAmount + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        Iterator itR = i.r(this.paymentMethods, parcel);
        while (itR.hasNext()) {
            ((OrderPaymentMethod) itR.next()).writeToParcel(parcel, flags);
        }
        Amount amount = this.remainingAmount;
        if (amount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount.writeToParcel(parcel, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderStatusResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OrderStatusResponse createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            int iC = 0;
            while (iC != i11) {
                iC = i.c(OrderPaymentMethod.CREATOR, parcel, arrayList, iC, 1);
            }
            return new OrderStatusResponse(arrayList, parcel.readInt() == 0 ? null : Amount.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OrderStatusResponse[] newArray(int i11) {
            return new OrderStatusResponse[i11];
        }
    }
}
