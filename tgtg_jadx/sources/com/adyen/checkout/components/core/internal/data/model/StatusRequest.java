package com.adyen.checkout.components.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000fHÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0017"}, d2 = {"Lcom/adyen/checkout/components/core/internal/data/model/StatusRequest;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "paymentData", "", "(Ljava/lang/String;)V", "getPaymentData", "()Ljava/lang/String;", "setPaymentData", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class StatusRequest extends ModelObject {

    @NotNull
    public static final String PAYMENT_DATA = "paymentData";

    @Nullable
    private String paymentData;

    @NotNull
    public static final Parcelable.Creator<StatusRequest> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<StatusRequest> SERIALIZER = new ModelObject.Serializer<StatusRequest>() { // from class: com.adyen.checkout.components.core.internal.data.model.StatusRequest$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public StatusRequest deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            return new StatusRequest(JsonUtilsKt.getStringOrNull(jsonObject, "paymentData"));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull StatusRequest modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("paymentData", modelObject.getPaymentData());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(StatusRequest.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ StatusRequest(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str);
    }

    public static /* synthetic */ StatusRequest copy$default(StatusRequest statusRequest, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = statusRequest.paymentData;
        }
        return statusRequest.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPaymentData() {
        return this.paymentData;
    }

    @NotNull
    public final StatusRequest copy(@Nullable String paymentData) {
        return new StatusRequest(paymentData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StatusRequest) && Intrinsics.areEqual(this.paymentData, ((StatusRequest) other).paymentData);
    }

    @Nullable
    public final String getPaymentData() {
        return this.paymentData;
    }

    public int hashCode() {
        String str = this.paymentData;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setPaymentData(@Nullable String str) {
        this.paymentData = str;
    }

    @NotNull
    public String toString() {
        return a0.p("StatusRequest(paymentData=", this.paymentData, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.paymentData);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StatusRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StatusRequest createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new StatusRequest(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StatusRequest[] newArray(int i11) {
            return new StatusRequest[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StatusRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public StatusRequest(@Nullable String str) {
        this.paymentData = str;
    }
}
