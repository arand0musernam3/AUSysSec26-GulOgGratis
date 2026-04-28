package com.adyen.checkout.components.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/adyen/checkout/components/core/internal/data/model/OrderStatusRequest;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", OrderStatusRequest.ORDER_DATA, "", "(Ljava/lang/String;)V", "getOrderData", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class OrderStatusRequest extends ModelObject {

    @NotNull
    private static final String ORDER_DATA = "orderData";

    @NotNull
    private final String orderData;

    @NotNull
    public static final Parcelable.Creator<OrderStatusRequest> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<OrderStatusRequest> SERIALIZER = new ModelObject.Serializer<OrderStatusRequest>() { // from class: com.adyen.checkout.components.core.internal.data.model.OrderStatusRequest$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public OrderStatusRequest deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            try {
                String string = jsonObject.getString("orderData");
                string.getClass();
                return new OrderStatusRequest(string);
            } catch (JSONException e5) {
                w.j(OrderStatusRequest.class, e5);
                return null;
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull OrderStatusRequest modelObject) {
            modelObject.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("orderData", modelObject.getOrderData());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(OrderStatusRequest.class, e5);
                return null;
            }
        }
    };

    public OrderStatusRequest(@NotNull String str) {
        str.getClass();
        this.orderData = str;
    }

    public static /* synthetic */ OrderStatusRequest copy$default(OrderStatusRequest orderStatusRequest, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orderStatusRequest.orderData;
        }
        return orderStatusRequest.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderData() {
        return this.orderData;
    }

    @NotNull
    public final OrderStatusRequest copy(@NotNull String orderData) {
        orderData.getClass();
        return new OrderStatusRequest(orderData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OrderStatusRequest) && Intrinsics.areEqual(this.orderData, ((OrderStatusRequest) other).orderData);
    }

    @NotNull
    public final String getOrderData() {
        return this.orderData;
    }

    public int hashCode() {
        return this.orderData.hashCode();
    }

    @NotNull
    public String toString() {
        return a0.p("OrderStatusRequest(orderData=", this.orderData, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.orderData);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderStatusRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OrderStatusRequest createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new OrderStatusRequest(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OrderStatusRequest[] newArray(int i11) {
            return new OrderStatusRequest[i11];
        }
    }
}
