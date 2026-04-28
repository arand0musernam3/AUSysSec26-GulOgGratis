package com.adyen.checkout.components.core;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.exception.CheckoutException;
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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/adyen/checkout/components/core/BalanceResult;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", BalanceResult.BALANCE, "Lcom/adyen/checkout/components/core/Amount;", BalanceResult.TRANSACTION_LIMIT, "(Lcom/adyen/checkout/components/core/Amount;Lcom/adyen/checkout/components/core/Amount;)V", "getBalance", "()Lcom/adyen/checkout/components/core/Amount;", "getTransactionLimit", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BalanceResult extends ModelObject {

    @NotNull
    private static final String BALANCE = "balance";

    @NotNull
    private static final String TRANSACTION_LIMIT = "transactionLimit";

    @Nullable
    private final Amount balance;

    @Nullable
    private final Amount transactionLimit;

    @NotNull
    public static final Parcelable.Creator<BalanceResult> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<BalanceResult> SERIALIZER = new ModelObject.Serializer<BalanceResult>() { // from class: com.adyen.checkout.components.core.BalanceResult$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public BalanceResult deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("balance");
            ModelObject.Serializer<Amount> serializer = Amount.SERIALIZER;
            Amount amount = (Amount) ModelUtils.deserializeOpt(jSONObjectOptJSONObject, serializer);
            if (amount != null) {
                return new BalanceResult(amount, (Amount) ModelUtils.deserializeOpt(jsonObject.optJSONObject("transactionLimit"), serializer));
            }
            throw new CheckoutException("Balance not found", null, 2, null);
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull BalanceResult modelObject) {
            modelObject.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                Amount balance = modelObject.getBalance();
                ModelObject.Serializer<Amount> serializer = Amount.SERIALIZER;
                jSONObject.putOpt("balance", ModelUtils.serializeOpt(balance, serializer));
                jSONObject.putOpt("transactionLimit", ModelUtils.serializeOpt(modelObject.getTransactionLimit(), serializer));
                return jSONObject;
            } catch (JSONException e5) {
                w.j(BalanceResult.class, e5);
                return null;
            }
        }
    };

    public BalanceResult(@Nullable Amount amount, @Nullable Amount amount2) {
        this.balance = amount;
        this.transactionLimit = amount2;
    }

    public static /* synthetic */ BalanceResult copy$default(BalanceResult balanceResult, Amount amount, Amount amount2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            amount = balanceResult.balance;
        }
        if ((i11 & 2) != 0) {
            amount2 = balanceResult.transactionLimit;
        }
        return balanceResult.copy(amount, amount2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Amount getBalance() {
        return this.balance;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Amount getTransactionLimit() {
        return this.transactionLimit;
    }

    @NotNull
    public final BalanceResult copy(@Nullable Amount balance, @Nullable Amount transactionLimit) {
        return new BalanceResult(balance, transactionLimit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BalanceResult)) {
            return false;
        }
        BalanceResult balanceResult = (BalanceResult) other;
        return Intrinsics.areEqual(this.balance, balanceResult.balance) && Intrinsics.areEqual(this.transactionLimit, balanceResult.transactionLimit);
    }

    @Nullable
    public final Amount getBalance() {
        return this.balance;
    }

    @Nullable
    public final Amount getTransactionLimit() {
        return this.transactionLimit;
    }

    public int hashCode() {
        Amount amount = this.balance;
        int iHashCode = (amount == null ? 0 : amount.hashCode()) * 31;
        Amount amount2 = this.transactionLimit;
        return iHashCode + (amount2 != null ? amount2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BalanceResult(balance=" + this.balance + ", transactionLimit=" + this.transactionLimit + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        Amount amount = this.balance;
        if (amount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount.writeToParcel(parcel, flags);
        }
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
    public static final class Creator implements Parcelable.Creator<BalanceResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BalanceResult createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new BalanceResult(parcel.readInt() == 0 ? null : Amount.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Amount.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BalanceResult[] newArray(int i11) {
            return new BalanceResult[i11];
        }
    }
}
