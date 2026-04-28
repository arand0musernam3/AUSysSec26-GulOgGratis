package com.adyen.checkout.googlepay;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtils;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB#\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0016HÖ\u0001R$\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/adyen/checkout/googlepay/ShippingAddressParameters;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", ShippingAddressParameters.ALLOWED_COUNTRY_CODES, "", "", "isPhoneNumberRequired", "", "(Ljava/util/List;Z)V", "getAllowedCountryCodes", "()Ljava/util/List;", "setAllowedCountryCodes", "(Ljava/util/List;)V", "()Z", "setPhoneNumberRequired", "(Z)V", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ShippingAddressParameters extends ModelObject {

    @NotNull
    private static final String ALLOWED_COUNTRY_CODES = "allowedCountryCodes";

    @NotNull
    private static final String PHONE_NUMBER_REQUIRED = "phoneNumberRequired";

    @Nullable
    private List<String> allowedCountryCodes;
    private boolean isPhoneNumberRequired;

    @NotNull
    public static final Parcelable.Creator<ShippingAddressParameters> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<ShippingAddressParameters> SERIALIZER = new ModelObject.Serializer<ShippingAddressParameters>() { // from class: com.adyen.checkout.googlepay.ShippingAddressParameters$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public ShippingAddressParameters deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            List<String> optStringList = JsonUtils.parseOptStringList(jsonObject.optJSONArray("allowedCountryCodes"));
            Boolean booleanOrNull = JsonUtilsKt.getBooleanOrNull(jsonObject, "phoneNumberRequired");
            return new ShippingAddressParameters(optStringList, booleanOrNull != null ? booleanOrNull.booleanValue() : false);
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull ShippingAddressParameters modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("allowedCountryCodes", JsonUtils.serializeOptStringList(modelObject.getAllowedCountryCodes()));
                jSONObject.putOpt("phoneNumberRequired", Boolean.valueOf(modelObject.isPhoneNumberRequired()));
                return jSONObject;
            } catch (JSONException e5) {
                w.j(ShippingAddressParameters.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ ShippingAddressParameters(List list, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? false : z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShippingAddressParameters copy$default(ShippingAddressParameters shippingAddressParameters, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = shippingAddressParameters.allowedCountryCodes;
        }
        if ((i11 & 2) != 0) {
            z11 = shippingAddressParameters.isPhoneNumberRequired;
        }
        return shippingAddressParameters.copy(list, z11);
    }

    @Nullable
    public final List<String> component1() {
        return this.allowedCountryCodes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsPhoneNumberRequired() {
        return this.isPhoneNumberRequired;
    }

    @NotNull
    public final ShippingAddressParameters copy(@Nullable List<String> allowedCountryCodes, boolean isPhoneNumberRequired) {
        return new ShippingAddressParameters(allowedCountryCodes, isPhoneNumberRequired);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShippingAddressParameters)) {
            return false;
        }
        ShippingAddressParameters shippingAddressParameters = (ShippingAddressParameters) other;
        return Intrinsics.areEqual(this.allowedCountryCodes, shippingAddressParameters.allowedCountryCodes) && this.isPhoneNumberRequired == shippingAddressParameters.isPhoneNumberRequired;
    }

    @Nullable
    public final List<String> getAllowedCountryCodes() {
        return this.allowedCountryCodes;
    }

    public int hashCode() {
        List<String> list = this.allowedCountryCodes;
        return Boolean.hashCode(this.isPhoneNumberRequired) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final boolean isPhoneNumberRequired() {
        return this.isPhoneNumberRequired;
    }

    public final void setAllowedCountryCodes(@Nullable List<String> list) {
        this.allowedCountryCodes = list;
    }

    public final void setPhoneNumberRequired(boolean z11) {
        this.isPhoneNumberRequired = z11;
    }

    @NotNull
    public String toString() {
        return "ShippingAddressParameters(allowedCountryCodes=" + this.allowedCountryCodes + ", isPhoneNumberRequired=" + this.isPhoneNumberRequired + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeStringList(this.allowedCountryCodes);
        parcel.writeInt(this.isPhoneNumberRequired ? 1 : 0);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ShippingAddressParameters> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ShippingAddressParameters createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new ShippingAddressParameters(parcel.createStringArrayList(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ShippingAddressParameters[] newArray(int i11) {
            return new ShippingAddressParameters[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShippingAddressParameters() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public ShippingAddressParameters(@Nullable List<String> list, boolean z11) {
        this.allowedCountryCodes = list;
        this.isPhoneNumberRequired = z11;
    }
}
