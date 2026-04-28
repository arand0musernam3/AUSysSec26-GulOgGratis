package com.adyen.checkout.components.core;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.appsflyer.AdRevenueScheme;
import e0.f;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001+BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020$HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006,"}, d2 = {"Lcom/adyen/checkout/components/core/Address;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", Address.CITY, "", "country", Address.HOUSE_NUMBER_OR_NAME, Address.POSTAL_CODE, Address.STATE_OR_PROVINCE, Address.STREET, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCity", "()Ljava/lang/String;", "setCity", "(Ljava/lang/String;)V", "getCountry", "setCountry", "getHouseNumberOrName", "setHouseNumberOrName", "getPostalCode", "setPostalCode", "getStateOrProvince", "setStateOrProvince", "getStreet", "setStreet", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Address extends ModelObject {

    @NotNull
    public static final String ADDRESS_COUNTRY_NULL_PLACEHOLDER = "ZZ";

    @NotNull
    public static final String ADDRESS_NULL_PLACEHOLDER = "null";

    @NotNull
    private static final String CITY = "city";

    @NotNull
    private static final String COUNTRY = "country";

    @NotNull
    private static final String HOUSE_NUMBER_OR_NAME = "houseNumberOrName";

    @NotNull
    private static final String POSTAL_CODE = "postalCode";

    @NotNull
    private static final String STATE_OR_PROVINCE = "stateOrProvince";

    @NotNull
    private static final String STREET = "street";

    @Nullable
    private String city;

    @Nullable
    private String country;

    @Nullable
    private String houseNumberOrName;

    @Nullable
    private String postalCode;

    @Nullable
    private String stateOrProvince;

    @Nullable
    private String street;

    @NotNull
    public static final Parcelable.Creator<Address> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<Address> SERIALIZER = new ModelObject.Serializer<Address>() { // from class: com.adyen.checkout.components.core.Address$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public Address deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            return new Address(JsonUtilsKt.getStringOrNull(jsonObject, "city"), JsonUtilsKt.getStringOrNull(jsonObject, AdRevenueScheme.COUNTRY), JsonUtilsKt.getStringOrNull(jsonObject, "houseNumberOrName"), JsonUtilsKt.getStringOrNull(jsonObject, "postalCode"), JsonUtilsKt.getStringOrNull(jsonObject, "stateOrProvince"), JsonUtilsKt.getStringOrNull(jsonObject, "street"));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull Address modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("city", modelObject.getCity());
                jSONObject.putOpt(AdRevenueScheme.COUNTRY, modelObject.getCountry());
                jSONObject.putOpt("houseNumberOrName", modelObject.getHouseNumberOrName());
                jSONObject.putOpt("postalCode", modelObject.getPostalCode());
                jSONObject.putOpt("stateOrProvince", modelObject.getStateOrProvince());
                jSONObject.putOpt("street", modelObject.getStreet());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(Address.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ Address(String str, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6);
    }

    public static /* synthetic */ Address copy$default(Address address, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = address.city;
        }
        if ((i11 & 2) != 0) {
            str2 = address.country;
        }
        if ((i11 & 4) != 0) {
            str3 = address.houseNumberOrName;
        }
        if ((i11 & 8) != 0) {
            str4 = address.postalCode;
        }
        if ((i11 & 16) != 0) {
            str5 = address.stateOrProvince;
        }
        if ((i11 & 32) != 0) {
            str6 = address.street;
        }
        String str7 = str5;
        String str8 = str6;
        return address.copy(str, str2, str3, str4, str7, str8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHouseNumberOrName() {
        return this.houseNumberOrName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStateOrProvince() {
        return this.stateOrProvince;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    @NotNull
    public final Address copy(@Nullable String city, @Nullable String country, @Nullable String houseNumberOrName, @Nullable String postalCode, @Nullable String stateOrProvince, @Nullable String street) {
        return new Address(city, country, houseNumberOrName, postalCode, stateOrProvince, street);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Address)) {
            return false;
        }
        Address address = (Address) other;
        return Intrinsics.areEqual(this.city, address.city) && Intrinsics.areEqual(this.country, address.country) && Intrinsics.areEqual(this.houseNumberOrName, address.houseNumberOrName) && Intrinsics.areEqual(this.postalCode, address.postalCode) && Intrinsics.areEqual(this.stateOrProvince, address.stateOrProvince) && Intrinsics.areEqual(this.street, address.street);
    }

    @Nullable
    public final String getCity() {
        return this.city;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    public final String getHouseNumberOrName() {
        return this.houseNumberOrName;
    }

    @Nullable
    public final String getPostalCode() {
        return this.postalCode;
    }

    @Nullable
    public final String getStateOrProvince() {
        return this.stateOrProvince;
    }

    @Nullable
    public final String getStreet() {
        return this.street;
    }

    public int hashCode() {
        String str = this.city;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.country;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.houseNumberOrName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.postalCode;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.stateOrProvince;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.street;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setCity(@Nullable String str) {
        this.city = str;
    }

    public final void setCountry(@Nullable String str) {
        this.country = str;
    }

    public final void setHouseNumberOrName(@Nullable String str) {
        this.houseNumberOrName = str;
    }

    public final void setPostalCode(@Nullable String str) {
        this.postalCode = str;
    }

    public final void setStateOrProvince(@Nullable String str) {
        this.stateOrProvince = str;
    }

    public final void setStreet(@Nullable String str) {
        this.street = str;
    }

    @NotNull
    public String toString() {
        String str = this.city;
        String str2 = this.country;
        String str3 = this.houseNumberOrName;
        String str4 = this.postalCode;
        String str5 = this.stateOrProvince;
        String str6 = this.street;
        StringBuilder sbT = f.t("Address(city=", str, ", country=", str2, ", houseNumberOrName=");
        s.A(sbT, str3, ", postalCode=", str4, ", stateOrProvince=");
        return f.o(sbT, str5, ", street=", str6, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.city);
        parcel.writeString(this.country);
        parcel.writeString(this.houseNumberOrName);
        parcel.writeString(this.postalCode);
        parcel.writeString(this.stateOrProvince);
        parcel.writeString(this.street);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Address> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Address createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new Address(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Address[] newArray(int i11) {
            return new Address[i11];
        }
    }

    public Address() {
        this(null, null, null, null, null, null, 63, null);
    }

    public Address(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.city = str;
        this.country = str2;
        this.houseNumberOrName = str3;
        this.postalCode = str4;
        this.stateOrProvince = str5;
        this.street = str6;
    }
}
