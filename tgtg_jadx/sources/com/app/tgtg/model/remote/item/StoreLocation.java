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
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\u001eJ\u001d\u0010#\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\n¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b)\u0010*J2\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b-\u0010(R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010.\u0012\u0004\b2\u00103\u001a\u0004\b/\u0010&\"\u0004\b0\u00101R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u00104\u0012\u0004\b8\u00103\u001a\u0004\b5\u0010(\"\u0004\b6\u00107R*\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u00109\u0012\u0004\b=\u00103\u001a\u0004\b:\u0010*\"\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lcom/app/tgtg/model/remote/item/StoreLocation;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/item/Address;", "address", "", "information", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "latLngInfo", "<init>", "(Lcom/app/tgtg/model/remote/item/Address;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/LatLngInfo;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/item/Address;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/LatLngInfo;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/StoreLocation;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/item/Address;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/app/tgtg/model/remote/item/LatLngInfo;", "copy", "(Lcom/app/tgtg/model/remote/item/Address;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/LatLngInfo;)Lcom/app/tgtg/model/remote/item/StoreLocation;", "toString", "Lcom/app/tgtg/model/remote/item/Address;", "getAddress", "setAddress", "(Lcom/app/tgtg/model/remote/item/Address;)V", "getAddress$annotations", "()V", "Ljava/lang/String;", "getInformation", "setInformation", "(Ljava/lang/String;)V", "getInformation$annotations", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "getLatLngInfo", "setLatLngInfo", "(Lcom/app/tgtg/model/remote/item/LatLngInfo;)V", "getLatLngInfo$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class StoreLocation implements Parcelable {

    @NotNull
    private Address address;

    @Nullable
    private String information;

    @Nullable
    private LatLngInfo latLngInfo;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<StoreLocation> CREATOR = new Creator();

    public /* synthetic */ StoreLocation(int i11, Address address, String str, LatLngInfo latLngInfo, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.address = new Address((String) null, (String) null, (PickupCountry) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
        } else {
            this.address = address;
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

    public static /* synthetic */ StoreLocation copy$default(StoreLocation storeLocation, Address address, String str, LatLngInfo latLngInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            address = storeLocation.address;
        }
        if ((i11 & 2) != 0) {
            str = storeLocation.information;
        }
        if ((i11 & 4) != 0) {
            latLngInfo = storeLocation.latLngInfo;
        }
        return storeLocation.copy(address, str, latLngInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$app(com.app.tgtg.model.remote.item.StoreLocation r10, l90.b r11, kotlinx.serialization.descriptors.SerialDescriptor r12) {
        /*
            boolean r0 = r11.C(r12)
            if (r0 == 0) goto L7
            goto L1d
        L7:
            com.app.tgtg.model.remote.item.Address r0 = r10.address
            com.app.tgtg.model.remote.item.Address r1 = new com.app.tgtg.model.remote.item.Address
            r8 = 63
            r9 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L25
        L1d:
            com.app.tgtg.model.remote.item.Address$$serializer r0 = com.app.tgtg.model.remote.item.Address$$serializer.INSTANCE
            com.app.tgtg.model.remote.item.Address r1 = r10.address
            r2 = 0
            r11.i(r12, r2, r0, r1)
        L25:
            boolean r0 = r11.C(r12)
            if (r0 == 0) goto L2c
            goto L30
        L2c:
            java.lang.String r0 = r10.information
            if (r0 == 0) goto L38
        L30:
            m90.r1 r0 = m90.r1.f29848a
            java.lang.String r1 = r10.information
            r2 = 1
            r11.r(r12, r2, r0, r1)
        L38:
            boolean r0 = r11.C(r12)
            if (r0 == 0) goto L3f
            goto L43
        L3f:
            com.app.tgtg.model.remote.item.LatLngInfo r0 = r10.latLngInfo
            if (r0 == 0) goto L4b
        L43:
            com.app.tgtg.model.remote.item.LatLngInfo$$serializer r0 = com.app.tgtg.model.remote.item.LatLngInfo$$serializer.INSTANCE
            com.app.tgtg.model.remote.item.LatLngInfo r10 = r10.latLngInfo
            r1 = 2
            r11.r(r12, r1, r0, r10)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.item.StoreLocation.write$Self$app(com.app.tgtg.model.remote.item.StoreLocation, l90.b, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Address getAddress() {
        return this.address;
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
    public final StoreLocation copy(@NotNull Address address, @Nullable String information, @Nullable LatLngInfo latLngInfo) {
        address.getClass();
        return new StoreLocation(address, information, latLngInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoreLocation)) {
            return false;
        }
        StoreLocation storeLocation = (StoreLocation) other;
        return Intrinsics.areEqual(this.address, storeLocation.address) && Intrinsics.areEqual(this.information, storeLocation.information) && Intrinsics.areEqual(this.latLngInfo, storeLocation.latLngInfo);
    }

    @NotNull
    public final Address getAddress() {
        return this.address;
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
        return Objects.hash(this.address, this.information, this.latLngInfo);
    }

    public final void setAddress(@NotNull Address address) {
        address.getClass();
        this.address = address;
    }

    public final void setInformation(@Nullable String str) {
        this.information = str;
    }

    public final void setLatLngInfo(@Nullable LatLngInfo latLngInfo) {
        this.latLngInfo = latLngInfo;
    }

    @NotNull
    public String toString() {
        return "StoreLocation(address=" + this.address + ", information=" + this.information + ", latLngInfo=" + this.latLngInfo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.address.writeToParcel(dest, flags);
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
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/StoreLocation$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/StoreLocation;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return StoreLocation$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StoreLocation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StoreLocation createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new StoreLocation(Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : LatLngInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StoreLocation[] newArray(int i11) {
            return new StoreLocation[i11];
        }
    }

    @g("address")
    public static /* synthetic */ void getAddress$annotations() {
    }

    @g("information")
    public static /* synthetic */ void getInformation$annotations() {
    }

    @g("location")
    public static /* synthetic */ void getLatLngInfo$annotations() {
    }

    public StoreLocation() {
        this((Address) null, (String) null, (LatLngInfo) null, 7, (DefaultConstructorMarker) null);
    }

    public StoreLocation(@NotNull Address address, @Nullable String str, @Nullable LatLngInfo latLngInfo) {
        address.getClass();
        this.address = address;
        this.information = str;
        this.latLngInfo = latLngInfo;
    }

    public /* synthetic */ StoreLocation(Address address, String str, LatLngInfo latLngInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new Address((String) null, (String) null, (PickupCountry) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null) : address, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : latLngInfo);
    }
}
