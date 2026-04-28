package com.app.tgtg.model.remote.item;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.AdRevenueScheme;
import e0.f;
import i90.g;
import i90.h;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0002LKBO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0017J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010 JX\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010 J'\u00101\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b/\u00100R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u00102\u0012\u0004\b6\u00107\u001a\u0004\b3\u0010 \"\u0004\b4\u00105R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u00102\u0012\u0004\b:\u00107\u001a\u0004\b8\u0010 \"\u0004\b9\u00105R*\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010;\u0012\u0004\b?\u00107\u001a\u0004\b<\u0010#\"\u0004\b=\u0010>R*\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u00102\u0012\u0004\bB\u00107\u001a\u0004\b@\u0010 \"\u0004\bA\u00105R*\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u00102\u0012\u0004\bE\u00107\u001a\u0004\bC\u0010 \"\u0004\bD\u00105R*\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u00102\u0012\u0004\bH\u00107\u001a\u0004\bF\u0010 \"\u0004\bG\u00105R\u0011\u0010J\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bI\u0010#¨\u0006M"}, d2 = {"Lcom/app/tgtg/model/remote/item/Address;", "Landroid/os/Parcelable;", "", "streetAddress", "city", "Lcom/app/tgtg/model/remote/item/PickupCountry;", "pickupCountry_", "county", "postalCode", "stateOrProvince", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/PickupCountry;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/PickupCountry;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/app/tgtg/model/remote/item/PickupCountry;", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/PickupCountry;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/item/Address;", "toString", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/Address;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getStreetAddress", "setStreetAddress", "(Ljava/lang/String;)V", "getStreetAddress$annotations", "()V", "getCity", "setCity", "getCity$annotations", "Lcom/app/tgtg/model/remote/item/PickupCountry;", "getPickupCountry_", "setPickupCountry_", "(Lcom/app/tgtg/model/remote/item/PickupCountry;)V", "getPickupCountry_$annotations", "getCounty", "setCounty", "getCounty$annotations", "getPostalCode", "setPostalCode", "getPostalCode$annotations", "getStateOrProvince", "setStateOrProvince", "getStateOrProvince$annotations", "getPickupCountry", "pickupCountry", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class Address implements Parcelable {

    @Nullable
    private String city;

    @Nullable
    private String county;

    @Nullable
    private PickupCountry pickupCountry_;

    @Nullable
    private String postalCode;

    @Nullable
    private String stateOrProvince;

    @Nullable
    private String streetAddress;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<Address> CREATOR = new Creator();

    public /* synthetic */ Address(int i11, String str, String str2, PickupCountry pickupCountry, String str3, String str4, String str5, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.streetAddress = null;
        } else {
            this.streetAddress = str;
        }
        if ((i11 & 2) == 0) {
            this.city = null;
        } else {
            this.city = str2;
        }
        if ((i11 & 4) == 0) {
            this.pickupCountry_ = null;
        } else {
            this.pickupCountry_ = pickupCountry;
        }
        if ((i11 & 8) == 0) {
            this.county = null;
        } else {
            this.county = str3;
        }
        if ((i11 & 16) == 0) {
            this.postalCode = null;
        } else {
            this.postalCode = str4;
        }
        if ((i11 & 32) == 0) {
            this.stateOrProvince = null;
        } else {
            this.stateOrProvince = str5;
        }
    }

    public static /* synthetic */ Address copy$default(Address address, String str, String str2, PickupCountry pickupCountry, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = address.streetAddress;
        }
        if ((i11 & 2) != 0) {
            str2 = address.city;
        }
        if ((i11 & 4) != 0) {
            pickupCountry = address.pickupCountry_;
        }
        if ((i11 & 8) != 0) {
            str3 = address.county;
        }
        if ((i11 & 16) != 0) {
            str4 = address.postalCode;
        }
        if ((i11 & 32) != 0) {
            str5 = address.stateOrProvince;
        }
        String str6 = str4;
        String str7 = str5;
        return address.copy(str, str2, pickupCountry, str3, str6, str7);
    }

    public static final /* synthetic */ void write$Self$app(Address self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.streetAddress != null) {
            output.r(serialDesc, 0, r1.f29848a, self.streetAddress);
        }
        if (output.C(serialDesc) || self.city != null) {
            output.r(serialDesc, 1, r1.f29848a, self.city);
        }
        if (output.C(serialDesc) || self.pickupCountry_ != null) {
            output.r(serialDesc, 2, PickupCountry$$serializer.INSTANCE, self.pickupCountry_);
        }
        if (output.C(serialDesc) || self.county != null) {
            output.r(serialDesc, 3, r1.f29848a, self.county);
        }
        if (output.C(serialDesc) || self.postalCode != null) {
            output.r(serialDesc, 4, r1.f29848a, self.postalCode);
        }
        if (!output.C(serialDesc) && self.stateOrProvince == null) {
            return;
        }
        output.r(serialDesc, 5, r1.f29848a, self.stateOrProvince);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStreetAddress() {
        return this.streetAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PickupCountry getPickupCountry_() {
        return this.pickupCountry_;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCounty() {
        return this.county;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStateOrProvince() {
        return this.stateOrProvince;
    }

    @NotNull
    public final Address copy(@Nullable String streetAddress, @Nullable String city, @Nullable PickupCountry pickupCountry_, @Nullable String county, @Nullable String postalCode, @Nullable String stateOrProvince) {
        return new Address(streetAddress, city, pickupCountry_, county, postalCode, stateOrProvince);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Address)) {
            return false;
        }
        Address address = (Address) other;
        return Intrinsics.areEqual(this.streetAddress, address.streetAddress) && Intrinsics.areEqual(this.city, address.city) && Intrinsics.areEqual(getPickupCountry(), address.getPickupCountry()) && Intrinsics.areEqual(this.county, address.county) && Intrinsics.areEqual(this.postalCode, address.postalCode) && Intrinsics.areEqual(this.stateOrProvince, address.stateOrProvince);
    }

    @Nullable
    public final String getCity() {
        return this.city;
    }

    @Nullable
    public final String getCounty() {
        return this.county;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final PickupCountry getPickupCountry() {
        PickupCountry pickupCountry = this.pickupCountry_;
        if (pickupCountry != null) {
            pickupCountry.getClass();
            return pickupCountry;
        }
        return new PickupCountry((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    @Nullable
    public final PickupCountry getPickupCountry_() {
        return this.pickupCountry_;
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
    public final String getStreetAddress() {
        return this.streetAddress;
    }

    public int hashCode() {
        return Objects.hash(this.streetAddress, this.city, getPickupCountry(), this.county, this.postalCode, this.stateOrProvince);
    }

    public final void setCity(@Nullable String str) {
        this.city = str;
    }

    public final void setCounty(@Nullable String str) {
        this.county = str;
    }

    public final void setPickupCountry_(@Nullable PickupCountry pickupCountry) {
        this.pickupCountry_ = pickupCountry;
    }

    public final void setPostalCode(@Nullable String str) {
        this.postalCode = str;
    }

    public final void setStateOrProvince(@Nullable String str) {
        this.stateOrProvince = str;
    }

    public final void setStreetAddress(@Nullable String str) {
        this.streetAddress = str;
    }

    @NotNull
    public String toString() {
        String str = this.streetAddress;
        String str2 = this.city;
        PickupCountry pickupCountry = this.pickupCountry_;
        String str3 = this.county;
        String str4 = this.postalCode;
        String str5 = this.stateOrProvince;
        StringBuilder sbT = f.t("Address(streetAddress=", str, ", city=", str2, ", pickupCountry_=");
        sbT.append(pickupCountry);
        sbT.append(", county=");
        sbT.append(str3);
        sbT.append(", postalCode=");
        return f.o(sbT, str4, ", stateOrProvince=", str5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.streetAddress);
        dest.writeString(this.city);
        PickupCountry pickupCountry = this.pickupCountry_;
        if (pickupCountry == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pickupCountry.writeToParcel(dest, flags);
        }
        dest.writeString(this.county);
        dest.writeString(this.postalCode);
        dest.writeString(this.stateOrProvince);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/Address$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/Address;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Address$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Address> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Address createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Address(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PickupCountry.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Address[] newArray(int i11) {
            return new Address[i11];
        }
    }

    @g("city")
    public static /* synthetic */ void getCity$annotations() {
    }

    @g("county")
    public static /* synthetic */ void getCounty$annotations() {
    }

    @g(AdRevenueScheme.COUNTRY)
    public static /* synthetic */ void getPickupCountry_$annotations() {
    }

    @g("postal_code")
    public static /* synthetic */ void getPostalCode$annotations() {
    }

    @g("state_or_province")
    public static /* synthetic */ void getStateOrProvince$annotations() {
    }

    @g("address_line")
    public static /* synthetic */ void getStreetAddress$annotations() {
    }

    public Address() {
        this((String) null, (String) null, (PickupCountry) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public Address(@Nullable String str, @Nullable String str2, @Nullable PickupCountry pickupCountry, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.streetAddress = str;
        this.city = str2;
        this.pickupCountry_ = pickupCountry;
        this.county = str3;
        this.postalCode = str4;
        this.stateOrProvince = str5;
    }

    public /* synthetic */ Address(String str, String str2, PickupCountry pickupCountry, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : pickupCountry, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5);
    }
}
