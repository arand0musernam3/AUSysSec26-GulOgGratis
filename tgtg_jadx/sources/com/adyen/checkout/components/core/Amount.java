package com.adyen.checkout.components.core;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
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

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0017HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/adyen/checkout/components/core/Amount;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", Amount.CURRENCY, "", "value", "", "(Ljava/lang/String;J)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getValue", "()J", "setValue", "(J)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Amount extends ModelObject {

    @NotNull
    private static final String CURRENCY = "currency";

    @NotNull
    private static final String VALUE = "value";

    @Nullable
    private String currency;
    private long value;

    @NotNull
    public static final Parcelable.Creator<Amount> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<Amount> SERIALIZER = new ModelObject.Serializer<Amount>() { // from class: com.adyen.checkout.components.core.Amount$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public Amount deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            String stringOrNull = JsonUtilsKt.getStringOrNull(jsonObject, "currency");
            Long longOrNull = JsonUtilsKt.getLongOrNull(jsonObject, "value");
            return new Amount(stringOrNull, longOrNull != null ? longOrNull.longValue() : -1L);
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull Amount modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("currency", modelObject.getCurrency());
                jSONObject.putOpt("value", Long.valueOf(modelObject.getValue()));
                return jSONObject;
            } catch (JSONException e5) {
                w.j(Amount.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ Amount(String str, long j9, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? 0L : j9);
    }

    public static /* synthetic */ Amount copy$default(Amount amount, String str, long j9, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = amount.currency;
        }
        if ((i11 & 2) != 0) {
            j9 = amount.value;
        }
        return amount.copy(str, j9);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    @NotNull
    public final Amount copy(@Nullable String currency, long value) {
        return new Amount(currency, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Amount)) {
            return false;
        }
        Amount amount = (Amount) other;
        return Intrinsics.areEqual(this.currency, amount.currency) && this.value == amount.value;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.currency;
        return Long.hashCode(this.value) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setValue(long j9) {
        this.value = j9;
    }

    @NotNull
    public String toString() {
        StringBuilder sbN = i.n(this.value, "Amount(currency=", this.currency, ", value=");
        sbN.append(")");
        return sbN.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.currency);
        parcel.writeLong(this.value);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Amount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Amount createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new Amount(parcel.readString(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Amount[] newArray(int i11) {
            return new Amount[i11];
        }
    }

    public Amount() {
        this(null, 0L, 3, null);
    }

    public Amount(@Nullable String str, long j9) {
        this.currency = str;
        this.value = j9;
    }
}
