package com.app.tgtg.model.remote.item;

import android.os.Parcel;
import android.os.Parcelable;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010 J\u001d\u0010%\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\n¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b)\u0010*J4\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b-\u0010(R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0003\u0010.\u0012\u0004\b/\u00100R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u00101\u0012\u0004\b5\u00100\u001a\u0004\b2\u0010(\"\u0004\b3\u00104R*\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u00106\u0012\u0004\b:\u00100\u001a\u0004\b7\u0010*\"\u0004\b8\u00109R\u0011\u0010<\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b;\u0010\u0010¨\u0006?"}, d2 = {"Lcom/app/tgtg/model/remote/item/PickupLocation;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/item/Address;", "address_", "", "information", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "latLngInfo", "<init>", "(Lcom/app/tgtg/model/remote/item/Address;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/LatLngInfo;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/item/Address;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/LatLngInfo;Lm90/m1;)V", "component1", "()Lcom/app/tgtg/model/remote/item/Address;", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/PickupLocation;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component2", "()Ljava/lang/String;", "component3", "()Lcom/app/tgtg/model/remote/item/LatLngInfo;", "copy", "(Lcom/app/tgtg/model/remote/item/Address;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/LatLngInfo;)Lcom/app/tgtg/model/remote/item/PickupLocation;", "toString", "Lcom/app/tgtg/model/remote/item/Address;", "getAddress_$annotations", "()V", "Ljava/lang/String;", "getInformation", "setInformation", "(Ljava/lang/String;)V", "getInformation$annotations", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "getLatLngInfo", "setLatLngInfo", "(Lcom/app/tgtg/model/remote/item/LatLngInfo;)V", "getLatLngInfo$annotations", "getAddress", "address", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class PickupLocation implements Parcelable {

    @Nullable
    private Address address_;

    @Nullable
    private String information;

    @Nullable
    private LatLngInfo latLngInfo;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<PickupLocation> CREATOR = new Creator();

    public /* synthetic */ PickupLocation(int i11, Address address, String str, LatLngInfo latLngInfo, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.address_ = null;
        } else {
            this.address_ = address;
        }
        if ((i11 & 2) == 0) {
            this.information = null;
        } else {
            this.information = str;
        }
        if ((i11 & 4) == 0) {
            this.latLngInfo = null;
        } else {
            this.latLngInfo = latLngInfo;
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final Address getAddress_() {
        return this.address_;
    }

    public static /* synthetic */ PickupLocation copy$default(PickupLocation pickupLocation, Address address, String str, LatLngInfo latLngInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            address = pickupLocation.address_;
        }
        if ((i11 & 2) != 0) {
            str = pickupLocation.information;
        }
        if ((i11 & 4) != 0) {
            latLngInfo = pickupLocation.latLngInfo;
        }
        return pickupLocation.copy(address, str, latLngInfo);
    }

    public static final /* synthetic */ void write$Self$app(PickupLocation self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.address_ != null) {
            output.r(serialDesc, 0, Address$$serializer.INSTANCE, self.address_);
        }
        if (output.C(serialDesc) || self.information != null) {
            output.r(serialDesc, 1, r1.f29848a, self.information);
        }
        if (!output.C(serialDesc) && self.latLngInfo == null) {
            return;
        }
        output.r(serialDesc, 2, LatLngInfo$$serializer.INSTANCE, self.latLngInfo);
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInformation() {
        return this.information;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LatLngInfo getLatLngInfo() {
        return this.latLngInfo;
    }

    @NotNull
    public final PickupLocation copy(@Nullable Address address_, @Nullable String information, @Nullable LatLngInfo latLngInfo) {
        return new PickupLocation(address_, information, latLngInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickupLocation)) {
            return false;
        }
        PickupLocation pickupLocation = (PickupLocation) other;
        return Intrinsics.areEqual(getAddress(), pickupLocation.getAddress()) && Intrinsics.areEqual(this.information, pickupLocation.information) && Intrinsics.areEqual(this.latLngInfo, pickupLocation.latLngInfo);
    }

    @NotNull
    public final Address getAddress() {
        if (this.address_ == null) {
            this.address_ = new Address((String) null, (String) null, (PickupCountry) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
        }
        Address address = this.address_;
        address.getClass();
        return address;
    }

    @Nullable
    public final String getInformation() {
        return this.information;
    }

    @Nullable
    public final LatLngInfo getLatLngInfo() {
        return this.latLngInfo;
    }

    public int hashCode() {
        return Objects.hash(getAddress(), this.information, this.latLngInfo);
    }

    public final void setInformation(@Nullable String str) {
        this.information = str;
    }

    public final void setLatLngInfo(@Nullable LatLngInfo latLngInfo) {
        this.latLngInfo = latLngInfo;
    }

    @NotNull
    public String toString() {
        return "PickupLocation(address_=" + this.address_ + ", information=" + this.information + ", latLngInfo=" + this.latLngInfo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        Address address = this.address_;
        if (address == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            address.writeToParcel(dest, flags);
        }
        dest.writeString(this.information);
        LatLngInfo latLngInfo = this.latLngInfo;
        if (latLngInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            latLngInfo.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/PickupLocation$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/PickupLocation;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PickupLocation$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PickupLocation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PickupLocation createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new PickupLocation(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? LatLngInfo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PickupLocation[] newArray(int i11) {
            return new PickupLocation[i11];
        }
    }

    @g("address")
    private static /* synthetic */ void getAddress_$annotations() {
    }

    @g("information")
    public static /* synthetic */ void getInformation$annotations() {
    }

    @g("location")
    public static /* synthetic */ void getLatLngInfo$annotations() {
    }

    public PickupLocation() {
        this((Address) null, (String) null, (LatLngInfo) null, 7, (DefaultConstructorMarker) null);
    }

    public PickupLocation(@Nullable Address address, @Nullable String str, @Nullable LatLngInfo latLngInfo) {
        this.address_ = address;
        this.information = str;
        this.latLngInfo = latLngInfo;
    }

    public /* synthetic */ PickupLocation(Address address, String str, LatLngInfo latLngInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : address, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : latLngInfo);
    }
}
