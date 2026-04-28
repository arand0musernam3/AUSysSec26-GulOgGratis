package com.adyen.checkout.sessions.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.core.exception.CheckoutException;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/data/model/SessionBalanceResponse;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", SessionBalanceResponse.SESSION_DATA, "", SessionBalanceResponse.BALANCE, "Lcom/adyen/checkout/components/core/Amount;", SessionBalanceResponse.TRANSACTION_LIMIT, "(Ljava/lang/String;Lcom/adyen/checkout/components/core/Amount;Lcom/adyen/checkout/components/core/Amount;)V", "getBalance", "()Lcom/adyen/checkout/components/core/Amount;", "getSessionData", "()Ljava/lang/String;", "getTransactionLimit", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionBalanceResponse extends ModelObject {

    @NotNull
    private static final String BALANCE = "balance";

    @NotNull
    private static final String SESSION_DATA = "sessionData";

    @NotNull
    private static final String TRANSACTION_LIMIT = "transactionLimit";

    @NotNull
    private final Amount balance;

    @NotNull
    private final String sessionData;

    @Nullable
    private final Amount transactionLimit;

    @NotNull
    public static final Parcelable.Creator<SessionBalanceResponse> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<SessionBalanceResponse> SERIALIZER = new ModelObject.Serializer<SessionBalanceResponse>() { // from class: com.adyen.checkout.sessions.core.internal.data.model.SessionBalanceResponse$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public SessionBalanceResponse deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            String stringOrNull = JsonUtilsKt.getStringOrNull(jsonObject, "sessionData");
            if (stringOrNull == null) {
                stringOrNull = "";
            }
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("balance");
            ModelObject.Serializer<Amount> serializer = Amount.SERIALIZER;
            Amount amount = (Amount) ModelUtils.deserializeOpt(jSONObjectOptJSONObject, serializer);
            if (amount != null) {
                return new SessionBalanceResponse(stringOrNull, amount, (Amount) ModelUtils.deserializeOpt(jsonObject.optJSONObject("transactionLimit"), serializer));
            }
            throw new CheckoutException("Balance not found", null, 2, null);
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull SessionBalanceResponse modelObject) {
            modelObject.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("sessionData", modelObject.getSessionData());
                Amount balance = modelObject.getBalance();
                ModelObject.Serializer<Amount> serializer = Amount.SERIALIZER;
                jSONObject.putOpt("balance", ModelUtils.serializeOpt(balance, serializer));
                jSONObject.putOpt("transactionLimit", ModelUtils.serializeOpt(modelObject.getTransactionLimit(), serializer));
                return jSONObject;
            } catch (JSONException e5) {
                w.j(SessionBalanceResponse.class, e5);
                return null;
            }
        }
    };

    public SessionBalanceResponse(@NotNull String str, @NotNull Amount amount, @Nullable Amount amount2) {
        str.getClass();
        amount.getClass();
        this.sessionData = str;
        this.balance = amount;
        this.transactionLimit = amount2;
    }

    public static /* synthetic */ SessionBalanceResponse copy$default(SessionBalanceResponse sessionBalanceResponse, String str, Amount amount, Amount amount2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionBalanceResponse.sessionData;
        }
        if ((i11 & 2) != 0) {
            amount = sessionBalanceResponse.balance;
        }
        if ((i11 & 4) != 0) {
            amount2 = sessionBalanceResponse.transactionLimit;
        }
        return sessionBalanceResponse.copy(str, amount, amount2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionData() {
        return this.sessionData;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Amount getBalance() {
        return this.balance;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Amount getTransactionLimit() {
        return this.transactionLimit;
    }

    @NotNull
    public final SessionBalanceResponse copy(@NotNull String sessionData, @NotNull Amount balance, @Nullable Amount transactionLimit) {
        sessionData.getClass();
        balance.getClass();
        return new SessionBalanceResponse(sessionData, balance, transactionLimit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionBalanceResponse)) {
            return false;
        }
        SessionBalanceResponse sessionBalanceResponse = (SessionBalanceResponse) other;
        return Intrinsics.areEqual(this.sessionData, sessionBalanceResponse.sessionData) && Intrinsics.areEqual(this.balance, sessionBalanceResponse.balance) && Intrinsics.areEqual(this.transactionLimit, sessionBalanceResponse.transactionLimit);
    }

    @NotNull
    public final Amount getBalance() {
        return this.balance;
    }

    @NotNull
    public final String getSessionData() {
        return this.sessionData;
    }

    @Nullable
    public final Amount getTransactionLimit() {
        return this.transactionLimit;
    }

    public int hashCode() {
        int iHashCode = (this.balance.hashCode() + (this.sessionData.hashCode() * 31)) * 31;
        Amount amount = this.transactionLimit;
        return iHashCode + (amount == null ? 0 : amount.hashCode());
    }

    @NotNull
    public String toString() {
        return "SessionBalanceResponse(sessionData=" + this.sessionData + ", balance=" + this.balance + ", transactionLimit=" + this.transactionLimit + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.sessionData);
        parcel.writeParcelable(this.balance, flags);
        parcel.writeParcelable(this.transactionLimit, flags);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionBalanceResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SessionBalanceResponse createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new SessionBalanceResponse(parcel.readString(), (Amount) parcel.readParcelable(SessionBalanceResponse.class.getClassLoader()), (Amount) parcel.readParcelable(SessionBalanceResponse.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SessionBalanceResponse[] newArray(int i11) {
            return new SessionBalanceResponse[i11];
        }
    }
}
