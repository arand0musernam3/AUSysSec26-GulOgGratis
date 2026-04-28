package com.adyen.checkout.components.core;

import b3.i;
import com.appsflyer.AdRevenueScheme;
import e0.f;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JQ\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, d2 = {"Lcom/adyen/checkout/components/core/AddressData;", "", "postalCode", "", "street", "stateOrProvince", "houseNumberOrName", "apartmentSuite", "city", AdRevenueScheme.COUNTRY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApartmentSuite", "()Ljava/lang/String;", "getCity", "getCountry", "getHouseNumberOrName", "getPostalCode", "getStateOrProvince", "getStreet", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AddressData {

    @Nullable
    private final String apartmentSuite;

    @NotNull
    private final String city;

    @NotNull
    private final String country;

    @NotNull
    private final String houseNumberOrName;

    @NotNull
    private final String postalCode;

    @NotNull
    private final String stateOrProvince;

    @NotNull
    private final String street;

    public AddressData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @NotNull String str6, @NotNull String str7) {
        i.B(str, str2, str3, str4, str6);
        str7.getClass();
        this.postalCode = str;
        this.street = str2;
        this.stateOrProvince = str3;
        this.houseNumberOrName = str4;
        this.apartmentSuite = str5;
        this.city = str6;
        this.country = str7;
    }

    public static /* synthetic */ AddressData copy$default(AddressData addressData, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = addressData.postalCode;
        }
        if ((i11 & 2) != 0) {
            str2 = addressData.street;
        }
        if ((i11 & 4) != 0) {
            str3 = addressData.stateOrProvince;
        }
        if ((i11 & 8) != 0) {
            str4 = addressData.houseNumberOrName;
        }
        if ((i11 & 16) != 0) {
            str5 = addressData.apartmentSuite;
        }
        if ((i11 & 32) != 0) {
            str6 = addressData.city;
        }
        if ((i11 & 64) != 0) {
            str7 = addressData.country;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return addressData.copy(str, str2, str11, str4, str10, str8, str9);
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

    @Nullable
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
    public final AddressData copy(@NotNull String postalCode, @NotNull String street, @NotNull String stateOrProvince, @NotNull String houseNumberOrName, @Nullable String apartmentSuite, @NotNull String city, @NotNull String country) {
        i.B(postalCode, street, stateOrProvince, houseNumberOrName, city);
        country.getClass();
        return new AddressData(postalCode, street, stateOrProvince, houseNumberOrName, apartmentSuite, city, country);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressData)) {
            return false;
        }
        AddressData addressData = (AddressData) other;
        return Intrinsics.areEqual(this.postalCode, addressData.postalCode) && Intrinsics.areEqual(this.street, addressData.street) && Intrinsics.areEqual(this.stateOrProvince, addressData.stateOrProvince) && Intrinsics.areEqual(this.houseNumberOrName, addressData.houseNumberOrName) && Intrinsics.areEqual(this.apartmentSuite, addressData.apartmentSuite) && Intrinsics.areEqual(this.city, addressData.city) && Intrinsics.areEqual(this.country, addressData.country);
    }

    @Nullable
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
        int iB = l1.b(l1.b(l1.b(this.postalCode.hashCode() * 31, 31, this.street), 31, this.stateOrProvince), 31, this.houseNumberOrName);
        String str = this.apartmentSuite;
        return this.country.hashCode() + l1.b((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.city);
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
        StringBuilder sbT = f.t("AddressData(postalCode=", str, ", street=", str2, ", stateOrProvince=");
        s.A(sbT, str3, ", houseNumberOrName=", str4, ", apartmentSuite=");
        s.A(sbT, str5, ", city=", str6, ", country=");
        return k.p(sbT, str7, ")");
    }
}
