package com.adyen.checkout.components.core;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.core.internal.util.JSONObjectParceler;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0017HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/adyen/checkout/components/core/ActionComponentData;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "paymentData", "", "details", "Lorg/json/JSONObject;", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "getDetails", "()Lorg/json/JSONObject;", "setDetails", "(Lorg/json/JSONObject;)V", "getPaymentData", "()Ljava/lang/String;", "setPaymentData", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ActionComponentData extends ModelObject {

    @NotNull
    private static final String DETAILS = "details";

    @NotNull
    private static final String PAYMENT_DATA = "paymentData";

    @Nullable
    private JSONObject details;

    @Nullable
    private String paymentData;

    @NotNull
    public static final Parcelable.Creator<ActionComponentData> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<ActionComponentData> SERIALIZER = new ModelObject.Serializer<ActionComponentData>() { // from class: com.adyen.checkout.components.core.ActionComponentData$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public ActionComponentData deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            return new ActionComponentData(JsonUtilsKt.getStringOrNull(jsonObject, "paymentData"), jsonObject.optJSONObject(ErrorBundle.DETAIL_ENTRY));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull ActionComponentData modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("paymentData", modelObject.getPaymentData());
                jSONObject.putOpt(ErrorBundle.DETAIL_ENTRY, modelObject.getDetails());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(ActionComponentData.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ ActionComponentData(String str, JSONObject jSONObject, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : jSONObject);
    }

    public static /* synthetic */ ActionComponentData copy$default(ActionComponentData actionComponentData, String str, JSONObject jSONObject, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = actionComponentData.paymentData;
        }
        if ((i11 & 2) != 0) {
            jSONObject = actionComponentData.details;
        }
        return actionComponentData.copy(str, jSONObject);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPaymentData() {
        return this.paymentData;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JSONObject getDetails() {
        return this.details;
    }

    @NotNull
    public final ActionComponentData copy(@Nullable String paymentData, @Nullable JSONObject details) {
        return new ActionComponentData(paymentData, details);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionComponentData)) {
            return false;
        }
        ActionComponentData actionComponentData = (ActionComponentData) other;
        return Intrinsics.areEqual(this.paymentData, actionComponentData.paymentData) && Intrinsics.areEqual(this.details, actionComponentData.details);
    }

    @Nullable
    public final JSONObject getDetails() {
        return this.details;
    }

    @Nullable
    public final String getPaymentData() {
        return this.paymentData;
    }

    public int hashCode() {
        String str = this.paymentData;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        JSONObject jSONObject = this.details;
        return iHashCode + (jSONObject != null ? jSONObject.hashCode() : 0);
    }

    public final void setDetails(@Nullable JSONObject jSONObject) {
        this.details = jSONObject;
    }

    public final void setPaymentData(@Nullable String str) {
        this.paymentData = str;
    }

    @NotNull
    public String toString() {
        return "ActionComponentData(paymentData=" + this.paymentData + ", details=" + this.details + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.paymentData);
        JSONObjectParceler.INSTANCE.write(this.details, parcel, flags);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ActionComponentData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ActionComponentData createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new ActionComponentData(parcel.readString(), JSONObjectParceler.INSTANCE.create(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ActionComponentData[] newArray(int i11) {
            return new ActionComponentData[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActionComponentData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public ActionComponentData(@Nullable String str, @Nullable JSONObject jSONObject) {
        this.paymentData = str;
        this.details = jSONObject;
    }
}
