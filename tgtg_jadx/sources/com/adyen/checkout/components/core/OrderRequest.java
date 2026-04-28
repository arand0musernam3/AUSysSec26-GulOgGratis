package com.adyen.checkout.components.core;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/adyen/checkout/components/core/OrderRequest;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", OrderRequest.PSP_REFERENCE, "", OrderRequest.ORDER_DATA, "(Ljava/lang/String;Ljava/lang/String;)V", "getOrderData", "()Ljava/lang/String;", "getPspReference", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class OrderRequest extends ModelObject {

    @NotNull
    private static final String ORDER_DATA = "orderData";

    @NotNull
    private static final String PSP_REFERENCE = "pspReference";

    @NotNull
    private final String orderData;

    @NotNull
    private final String pspReference;

    @NotNull
    public static final Parcelable.Creator<OrderRequest> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<OrderRequest> SERIALIZER = new ModelObject.Serializer<OrderRequest>() { // from class: com.adyen.checkout.components.core.OrderRequest$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public OrderRequest deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            String stringOrNull = JsonUtilsKt.getStringOrNull(jsonObject, "pspReference");
            if (stringOrNull == null) {
                stringOrNull = "";
            }
            String stringOrNull2 = JsonUtilsKt.getStringOrNull(jsonObject, "orderData");
            return new OrderRequest(stringOrNull, stringOrNull2 != null ? stringOrNull2 : "");
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull OrderRequest modelObject) {
            modelObject.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("pspReference", modelObject.getPspReference());
                jSONObject.putOpt("orderData", modelObject.getOrderData());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(OrderRequest.class, e5);
                return null;
            }
        }
    };

    public OrderRequest(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.pspReference = str;
        this.orderData = str2;
    }

    public static /* synthetic */ OrderRequest copy$default(OrderRequest orderRequest, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orderRequest.pspReference;
        }
        if ((i11 & 2) != 0) {
            str2 = orderRequest.orderData;
        }
        return orderRequest.copy(str, str2);
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

    @NotNull
    public final OrderRequest copy(@NotNull String pspReference, @NotNull String orderData) {
        pspReference.getClass();
        orderData.getClass();
        return new OrderRequest(pspReference, orderData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderRequest)) {
            return false;
        }
        OrderRequest orderRequest = (OrderRequest) other;
        return Intrinsics.areEqual(this.pspReference, orderRequest.pspReference) && Intrinsics.areEqual(this.orderData, orderRequest.orderData);
    }

    @NotNull
    public final String getOrderData() {
        return this.orderData;
    }

    @NotNull
    public final String getPspReference() {
        return this.pspReference;
    }

    public int hashCode() {
        return this.orderData.hashCode() + (this.pspReference.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a.d("OrderRequest(pspReference=", this.pspReference, ", orderData=", this.orderData, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.pspReference);
        parcel.writeString(this.orderData);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OrderRequest createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new OrderRequest(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OrderRequest[] newArray(int i11) {
            return new OrderRequest[i11];
        }
    }
}
