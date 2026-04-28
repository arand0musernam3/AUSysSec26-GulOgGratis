package com.adyen.checkout.sessions.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.components.core.Amount;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/data/model/SessionBalanceRequest;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", SessionBalanceRequest.SESSION_DATA, "", SessionBalanceRequest.PAYMENT_METHOD, "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", SessionBalanceRequest.AMOUNT, "Lcom/adyen/checkout/components/core/Amount;", "(Ljava/lang/String;Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;Lcom/adyen/checkout/components/core/Amount;)V", "getAmount", "()Lcom/adyen/checkout/components/core/Amount;", "getPaymentMethod", "()Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "getSessionData", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionBalanceRequest extends ModelObject {

    @NotNull
    private static final String AMOUNT = "amount";

    @NotNull
    private static final String PAYMENT_METHOD = "paymentMethod";

    @NotNull
    private static final String SESSION_DATA = "sessionData";

    @Nullable
    private final Amount amount;

    @Nullable
    private final PaymentMethodDetails paymentMethod;

    @NotNull
    private final String sessionData;

    @NotNull
    public static final Parcelable.Creator<SessionBalanceRequest> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<SessionBalanceRequest> SERIALIZER = new ModelObject.Serializer<SessionBalanceRequest>() { // from class: com.adyen.checkout.sessions.core.internal.data.model.SessionBalanceRequest$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public SessionBalanceRequest deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            try {
                String stringOrNull = JsonUtilsKt.getStringOrNull(jsonObject, "sessionData");
                if (stringOrNull == null) {
                    stringOrNull = "";
                }
                return new SessionBalanceRequest(stringOrNull, (PaymentMethodDetails) ModelUtils.deserializeOpt(jsonObject.optJSONObject("paymentMethod"), PaymentMethodDetails.SERIALIZER), (Amount) ModelUtils.deserializeOpt(jsonObject.optJSONObject("amount"), Amount.SERIALIZER));
            } catch (JSONException e5) {
                w.j(SessionBalanceRequest.class, e5);
                return null;
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull SessionBalanceRequest modelObject) {
            modelObject.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("sessionData", modelObject.getSessionData());
                jSONObject.putOpt("paymentMethod", ModelUtils.serializeOpt(modelObject.getPaymentMethod(), PaymentMethodDetails.SERIALIZER));
                jSONObject.putOpt("amount", ModelUtils.serializeOpt(modelObject.getAmount(), Amount.SERIALIZER));
                return jSONObject;
            } catch (JSONException e5) {
                w.j(SessionBalanceRequest.class, e5);
                return null;
            }
        }
    };

    public SessionBalanceRequest(@NotNull String str, @Nullable PaymentMethodDetails paymentMethodDetails, @Nullable Amount amount) {
        str.getClass();
        this.sessionData = str;
        this.paymentMethod = paymentMethodDetails;
        this.amount = amount;
    }

    public static /* synthetic */ SessionBalanceRequest copy$default(SessionBalanceRequest sessionBalanceRequest, String str, PaymentMethodDetails paymentMethodDetails, Amount amount, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionBalanceRequest.sessionData;
        }
        if ((i11 & 2) != 0) {
            paymentMethodDetails = sessionBalanceRequest.paymentMethod;
        }
        if ((i11 & 4) != 0) {
            amount = sessionBalanceRequest.amount;
        }
        return sessionBalanceRequest.copy(str, paymentMethodDetails, amount);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionData() {
        return this.sessionData;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PaymentMethodDetails getPaymentMethod() {
        return this.paymentMethod;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Amount getAmount() {
        return this.amount;
    }

    @NotNull
    public final SessionBalanceRequest copy(@NotNull String sessionData, @Nullable PaymentMethodDetails paymentMethod, @Nullable Amount amount) {
        sessionData.getClass();
        return new SessionBalanceRequest(sessionData, paymentMethod, amount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionBalanceRequest)) {
            return false;
        }
        SessionBalanceRequest sessionBalanceRequest = (SessionBalanceRequest) other;
        return Intrinsics.areEqual(this.sessionData, sessionBalanceRequest.sessionData) && Intrinsics.areEqual(this.paymentMethod, sessionBalanceRequest.paymentMethod) && Intrinsics.areEqual(this.amount, sessionBalanceRequest.amount);
    }

    @Nullable
    public final Amount getAmount() {
        return this.amount;
    }

    @Nullable
    public final PaymentMethodDetails getPaymentMethod() {
        return this.paymentMethod;
    }

    @NotNull
    public final String getSessionData() {
        return this.sessionData;
    }

    public int hashCode() {
        int iHashCode = this.sessionData.hashCode() * 31;
        PaymentMethodDetails paymentMethodDetails = this.paymentMethod;
        int iHashCode2 = (iHashCode + (paymentMethodDetails == null ? 0 : paymentMethodDetails.hashCode())) * 31;
        Amount amount = this.amount;
        return iHashCode2 + (amount != null ? amount.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SessionBalanceRequest(sessionData=" + this.sessionData + ", paymentMethod=" + this.paymentMethod + ", amount=" + this.amount + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.sessionData);
        parcel.writeParcelable(this.paymentMethod, flags);
        parcel.writeParcelable(this.amount, flags);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionBalanceRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SessionBalanceRequest createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new SessionBalanceRequest(parcel.readString(), (PaymentMethodDetails) parcel.readParcelable(SessionBalanceRequest.class.getClassLoader()), (Amount) parcel.readParcelable(SessionBalanceRequest.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SessionBalanceRequest[] newArray(int i11) {
            return new SessionBalanceRequest[i11];
        }
    }
}
