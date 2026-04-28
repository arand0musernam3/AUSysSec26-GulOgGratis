package com.adyen.checkout.googlepay;

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

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0015HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/adyen/checkout/googlepay/BillingAddressParameters;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", BillingAddressParameters.FORMAT, "", "isPhoneNumberRequired", "", "(Ljava/lang/String;Z)V", "getFormat", "()Ljava/lang/String;", "setFormat", "(Ljava/lang/String;)V", "()Z", "setPhoneNumberRequired", "(Z)V", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BillingAddressParameters extends ModelObject {

    @NotNull
    private static final String FORMAT = "format";

    @NotNull
    private static final String PHONE_NUMBER_REQUIRED = "phoneNumberRequired";

    @Nullable
    private String format;
    private boolean isPhoneNumberRequired;

    @NotNull
    public static final Parcelable.Creator<BillingAddressParameters> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<BillingAddressParameters> SERIALIZER = new ModelObject.Serializer<BillingAddressParameters>() { // from class: com.adyen.checkout.googlepay.BillingAddressParameters$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public BillingAddressParameters deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            String stringOrNull = JsonUtilsKt.getStringOrNull(jsonObject, "format");
            Boolean booleanOrNull = JsonUtilsKt.getBooleanOrNull(jsonObject, "phoneNumberRequired");
            return new BillingAddressParameters(stringOrNull, booleanOrNull != null ? booleanOrNull.booleanValue() : false);
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull BillingAddressParameters modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("format", modelObject.getFormat());
                jSONObject.putOpt("phoneNumberRequired", Boolean.valueOf(modelObject.isPhoneNumberRequired()));
                return jSONObject;
            } catch (JSONException e5) {
                w.j(BillingAddressParameters.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ BillingAddressParameters(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? false : z11);
    }

    public static /* synthetic */ BillingAddressParameters copy$default(BillingAddressParameters billingAddressParameters, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = billingAddressParameters.format;
        }
        if ((i11 & 2) != 0) {
            z11 = billingAddressParameters.isPhoneNumberRequired;
        }
        return billingAddressParameters.copy(str, z11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFormat() {
        return this.format;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsPhoneNumberRequired() {
        return this.isPhoneNumberRequired;
    }

    @NotNull
    public final BillingAddressParameters copy(@Nullable String format, boolean isPhoneNumberRequired) {
        return new BillingAddressParameters(format, isPhoneNumberRequired);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillingAddressParameters)) {
            return false;
        }
        BillingAddressParameters billingAddressParameters = (BillingAddressParameters) other;
        return Intrinsics.areEqual(this.format, billingAddressParameters.format) && this.isPhoneNumberRequired == billingAddressParameters.isPhoneNumberRequired;
    }

    @Nullable
    public final String getFormat() {
        return this.format;
    }

    public int hashCode() {
        String str = this.format;
        return Boolean.hashCode(this.isPhoneNumberRequired) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final boolean isPhoneNumberRequired() {
        return this.isPhoneNumberRequired;
    }

    public final void setFormat(@Nullable String str) {
        this.format = str;
    }

    public final void setPhoneNumberRequired(boolean z11) {
        this.isPhoneNumberRequired = z11;
    }

    @NotNull
    public String toString() {
        return "BillingAddressParameters(format=" + this.format + ", isPhoneNumberRequired=" + this.isPhoneNumberRequired + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.format);
        parcel.writeInt(this.isPhoneNumberRequired ? 1 : 0);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BillingAddressParameters> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BillingAddressParameters createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new BillingAddressParameters(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BillingAddressParameters[] newArray(int i11) {
            return new BillingAddressParameters[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BillingAddressParameters() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public BillingAddressParameters(@Nullable String str, boolean z11) {
        this.format = str;
        this.isPhoneNumberRequired = z11;
    }
}
