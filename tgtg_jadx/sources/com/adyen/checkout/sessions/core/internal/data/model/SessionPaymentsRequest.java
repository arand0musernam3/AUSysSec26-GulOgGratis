package com.adyen.checkout.sessions.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.components.core.PaymentComponentData;
import com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.core.internal.data.model.ModelUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0014HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/data/model/SessionPaymentsRequest;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", SessionPaymentsRequest.SESSION_DATA, "", "paymentComponentData", "Lcom/adyen/checkout/components/core/PaymentComponentData;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "(Ljava/lang/String;Lcom/adyen/checkout/components/core/PaymentComponentData;)V", "getPaymentComponentData", "()Lcom/adyen/checkout/components/core/PaymentComponentData;", "getSessionData", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionPaymentsRequest extends ModelObject {

    @NotNull
    private static final String SESSION_DATA = "sessionData";

    @NotNull
    private final PaymentComponentData<? extends PaymentMethodDetails> paymentComponentData;

    @NotNull
    private final String sessionData;

    @NotNull
    public static final Parcelable.Creator<SessionPaymentsRequest> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<SessionPaymentsRequest> SERIALIZER = new ModelObject.Serializer<SessionPaymentsRequest>() { // from class: com.adyen.checkout.sessions.core.internal.data.model.SessionPaymentsRequest$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public SessionPaymentsRequest deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            try {
                String stringOrNull = JsonUtilsKt.getStringOrNull(jsonObject, "sessionData");
                if (stringOrNull == null) {
                    stringOrNull = "";
                }
                ModelObject modelObjectDeserializeOpt = ModelUtils.deserializeOpt(jsonObject, PaymentComponentData.SERIALIZER);
                modelObjectDeserializeOpt.getClass();
                return new SessionPaymentsRequest(stringOrNull, (PaymentComponentData) modelObjectDeserializeOpt);
            } catch (JSONException e5) {
                w.j(SessionPaymentsRequest.class, e5);
                return null;
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull SessionPaymentsRequest modelObject) {
            modelObject.getClass();
            JSONObject jSONObject = new JSONObject(PaymentComponentData.SERIALIZER.serialize(modelObject.getPaymentComponentData()).toString());
            try {
                jSONObject.putOpt("sessionData", modelObject.getSessionData());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(SessionPaymentsRequest.class, e5);
                return null;
            }
        }
    };

    public SessionPaymentsRequest(@NotNull String str, @NotNull PaymentComponentData<? extends PaymentMethodDetails> paymentComponentData) {
        str.getClass();
        paymentComponentData.getClass();
        this.sessionData = str;
        this.paymentComponentData = paymentComponentData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionPaymentsRequest copy$default(SessionPaymentsRequest sessionPaymentsRequest, String str, PaymentComponentData paymentComponentData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionPaymentsRequest.sessionData;
        }
        if ((i11 & 2) != 0) {
            paymentComponentData = sessionPaymentsRequest.paymentComponentData;
        }
        return sessionPaymentsRequest.copy(str, paymentComponentData);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionData() {
        return this.sessionData;
    }

    @NotNull
    public final PaymentComponentData<? extends PaymentMethodDetails> component2() {
        return this.paymentComponentData;
    }

    @NotNull
    public final SessionPaymentsRequest copy(@NotNull String sessionData, @NotNull PaymentComponentData<? extends PaymentMethodDetails> paymentComponentData) {
        sessionData.getClass();
        paymentComponentData.getClass();
        return new SessionPaymentsRequest(sessionData, paymentComponentData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionPaymentsRequest)) {
            return false;
        }
        SessionPaymentsRequest sessionPaymentsRequest = (SessionPaymentsRequest) other;
        return Intrinsics.areEqual(this.sessionData, sessionPaymentsRequest.sessionData) && Intrinsics.areEqual(this.paymentComponentData, sessionPaymentsRequest.paymentComponentData);
    }

    @NotNull
    public final PaymentComponentData<? extends PaymentMethodDetails> getPaymentComponentData() {
        return this.paymentComponentData;
    }

    @NotNull
    public final String getSessionData() {
        return this.sessionData;
    }

    public int hashCode() {
        return this.paymentComponentData.hashCode() + (this.sessionData.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "SessionPaymentsRequest(sessionData=" + this.sessionData + ", paymentComponentData=" + this.paymentComponentData + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.sessionData);
        parcel.writeParcelable(this.paymentComponentData, flags);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionPaymentsRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SessionPaymentsRequest createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new SessionPaymentsRequest(parcel.readString(), (PaymentComponentData) parcel.readParcelable(SessionPaymentsRequest.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SessionPaymentsRequest[] newArray(int i11) {
            return new SessionPaymentsRequest[i11];
        }
    }
}
