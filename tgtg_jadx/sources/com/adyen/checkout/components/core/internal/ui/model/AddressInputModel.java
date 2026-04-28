package com.adyen.checkout.components.core.internal.ui.model;

import b3.i;
import com.appsflyer.AdRevenueScheme;
import e0.f;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003JY\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020\u00192\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\u0006\u0010.\u001a\u00020/J\u0006\u00100\u001a\u00020/J\u000e\u00101\u001a\u00020/2\u0006\u00102\u001a\u00020\u0000J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010\u000f¨\u00064"}, d2 = {"Lcom/adyen/checkout/components/core/internal/ui/model/AddressInputModel;", "", "postalCode", "", "street", "stateOrProvince", "houseNumberOrName", "apartmentSuite", "city", AdRevenueScheme.COUNTRY, "countryDisplayName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApartmentSuite", "()Ljava/lang/String;", "setApartmentSuite", "(Ljava/lang/String;)V", "getCity", "setCity", "getCountry", "setCountry", "getCountryDisplayName", "setCountryDisplayName", "getHouseNumberOrName", "setHouseNumberOrName", "isEmpty", "", "()Z", "getPostalCode", "setPostalCode", "getStateOrProvince", "setStateOrProvince", "getStreet", "setStreet", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "reset", "", "resetAll", "set", "addressInputModel", "toString", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AddressInputModel {

    @NotNull
    private String apartmentSuite;

    @NotNull
    private String city;

    @NotNull
    private String country;

    @NotNull
    private String countryDisplayName;

    @NotNull
    private String houseNumberOrName;

    @NotNull
    private String postalCode;

    @NotNull
    private String stateOrProvince;

    @NotNull
    private String street;

    public /* synthetic */ AddressInputModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? "" : str5, (i11 & 32) != 0 ? "" : str6, (i11 & 64) != 0 ? "" : str7, (i11 & 128) != 0 ? "" : str8);
    }

    public static /* synthetic */ AddressInputModel copy$default(AddressInputModel addressInputModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = addressInputModel.postalCode;
        }
        if ((i11 & 2) != 0) {
            str2 = addressInputModel.street;
        }
        if ((i11 & 4) != 0) {
            str3 = addressInputModel.stateOrProvince;
        }
        if ((i11 & 8) != 0) {
            str4 = addressInputModel.houseNumberOrName;
        }
        if ((i11 & 16) != 0) {
            str5 = addressInputModel.apartmentSuite;
        }
        if ((i11 & 32) != 0) {
            str6 = addressInputModel.city;
        }
        if ((i11 & 64) != 0) {
            str7 = addressInputModel.country;
        }
        if ((i11 & 128) != 0) {
            str8 = addressInputModel.countryDisplayName;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return addressInputModel.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStateOrProvince() {
        return this.stateOrProvince;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHouseNumberOrName() {
        return this.houseNumberOrName;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getApartmentSuite() {
        return this.apartmentSuite;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCountryDisplayName() {
        return this.countryDisplayName;
    }

    @NotNull
    public final AddressInputModel copy(@NotNull String postalCode, @NotNull String street, @NotNull String stateOrProvince, @NotNull String houseNumberOrName, @NotNull String apartmentSuite, @NotNull String city, @NotNull String country, @NotNull String countryDisplayName) {
        i.B(postalCode, street, stateOrProvince, houseNumberOrName, apartmentSuite);
        city.getClass();
        country.getClass();
        countryDisplayName.getClass();
        return new AddressInputModel(postalCode, street, stateOrProvince, houseNumberOrName, apartmentSuite, city, country, countryDisplayName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressInputModel)) {
            return false;
        }
        AddressInputModel addressInputModel = (AddressInputModel) other;
        return Intrinsics.areEqual(this.postalCode, addressInputModel.postalCode) && Intrinsics.areEqual(this.street, addressInputModel.street) && Intrinsics.areEqual(this.stateOrProvince, addressInputModel.stateOrProvince) && Intrinsics.areEqual(this.houseNumberOrName, addressInputModel.houseNumberOrName) && Intrinsics.areEqual(this.apartmentSuite, addressInputModel.apartmentSuite) && Intrinsics.areEqual(this.city, addressInputModel.city) && Intrinsics.areEqual(this.country, addressInputModel.country) && Intrinsics.areEqual(this.countryDisplayName, addressInputModel.countryDisplayName);
    }

    @NotNull
    public final String getApartmentSuite() {
        return this.apartmentSuite;
    }

    @NotNull
    public final String getCity() {
        return this.city;
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final String getCountryDisplayName() {
        return this.countryDisplayName;
    }

    @NotNull
    public final String getHouseNumberOrName() {
        return this.houseNumberOrName;
    }

    @NotNull
    public final String getPostalCode() {
        return this.postalCode;
    }

    @NotNull
    public final String getStateOrProvince() {
        return this.stateOrProvince;
    }

    @NotNull
    public final String getStreet() {
        return this.street;
    }

    public int hashCode() {
        return this.countryDisplayName.hashCode() + l1.b(l1.b(l1.b(l1.b(l1.b(l1.b(this.postalCode.hashCode() * 31, 31, this.street), 31, this.stateOrProvince), 31, this.houseNumberOrName), 31, this.apartmentSuite), 31, this.city), 31, this.country);
    }

    public final boolean isEmpty() {
        return this.postalCode.length() == 0 && this.street.length() == 0 && this.stateOrProvince.length() == 0 && this.houseNumberOrName.length() == 0 && this.apartmentSuite.length() == 0 && this.city.length() == 0 && this.country.length() == 0;
    }

    public final void reset() {
        this.postalCode = "";
        this.street = "";
        this.stateOrProvince = "";
        this.houseNumberOrName = "";
        this.apartmentSuite = "";
        this.city = "";
        this.countryDisplayName = "";
    }

    public final void resetAll() {
        this.country = "";
        this.postalCode = "";
        this.street = "";
        this.stateOrProvince = "";
        this.houseNumberOrName = "";
        this.apartmentSuite = "";
        this.city = "";
        this.countryDisplayName = "";
    }

    public final void set(@NotNull AddressInputModel addressInputModel) {
        addressInputModel.getClass();
        this.postalCode = addressInputModel.postalCode;
        this.street = addressInputModel.street;
        this.stateOrProvince = addressInputModel.stateOrProvince;
        this.houseNumberOrName = addressInputModel.houseNumberOrName;
        this.apartmentSuite = addressInputModel.apartmentSuite;
        this.city = addressInputModel.city;
        this.country = addressInputModel.country;
        this.countryDisplayName = addressInputModel.countryDisplayName;
    }

    public final void setApartmentSuite(@NotNull String str) {
        str.getClass();
        this.apartmentSuite = str;
    }

    public final void setCity(@NotNull String str) {
        str.getClass();
        this.city = str;
    }

    public final void setCountry(@NotNull String str) {
        str.getClass();
        this.country = str;
    }

    public final void setCountryDisplayName(@NotNull String str) {
        str.getClass();
        this.countryDisplayName = str;
    }

    public final void setHouseNumberOrName(@NotNull String str) {
        str.getClass();
        this.houseNumberOrName = str;
    }

    public final void setPostalCode(@NotNull String str) {
        str.getClass();
        this.postalCode = str;
    }

    public final void setStateOrProvince(@NotNull String str) {
        str.getClass();
        this.stateOrProvince = str;
    }

    public final void setStreet(@NotNull String str) {
        str.getClass();
        this.street = str;
    }

    @NotNull
    public String toString() {
        String str = this.postalCode;
        String str2 = this.street;
        String str3 = this.stateOrProvince;
        String str4 = this.houseNumberOrName;
        String str5 = this.apartmentSuite;
        String str6 = this.city;
        String str7 = this.country;
        String str8 = this.countryDisplayName;
        StringBuilder sbT = f.t("AddressInputModel(postalCode=", str, ", street=", str2, ", stateOrProvince=");
        s.A(sbT, str3, ", houseNumberOrName=", str4, ", apartmentSuite=");
        s.A(sbT, str5, ", city=", str6, ", country=");
        return f.o(sbT, str7, ", countryDisplayName=", str8, ")");
    }

    public AddressInputModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        i.B(str, str2, str3, str4, str5);
        a0.C(str6, str7, str8);
        this.postalCode = str;
        this.street = str2;
        this.stateOrProvince = str3;
        this.houseNumberOrName = str4;
        this.apartmentSuite = str5;
        this.city = str6;
        this.country = str7;
        this.countryDisplayName = str8;
    }

    public AddressInputModel() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
