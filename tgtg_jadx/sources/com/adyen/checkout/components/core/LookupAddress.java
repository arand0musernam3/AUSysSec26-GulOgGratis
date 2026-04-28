package com.adyen.checkout.components.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/adyen/checkout/components/core/LookupAddress;", "", "id", "", "address", "Lcom/adyen/checkout/components/core/AddressData;", "(Ljava/lang/String;Lcom/adyen/checkout/components/core/AddressData;)V", "getAddress", "()Lcom/adyen/checkout/components/core/AddressData;", "getId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LookupAddress {

    @NotNull
    private final AddressData address;

    @NotNull
    private final String id;

    public LookupAddress(@NotNull String str, @NotNull AddressData addressData) {
        str.getClass();
        addressData.getClass();
        this.id = str;
        this.address = addressData;
    }

    public static /* synthetic */ LookupAddress copy$default(LookupAddress lookupAddress, String str, AddressData addressData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = lookupAddress.id;
        }
        if ((i11 & 2) != 0) {
            addressData = lookupAddress.address;
        }
        return lookupAddress.copy(str, addressData);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AddressData getAddress() {
        return this.address;
    }

    @NotNull
    public final LookupAddress copy(@NotNull String id2, @NotNull AddressData address) {
        id2.getClass();
        address.getClass();
        return new LookupAddress(id2, address);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LookupAddress)) {
            return false;
        }
        LookupAddress lookupAddress = (LookupAddress) other;
        return Intrinsics.areEqual(this.id, lookupAddress.id) && Intrinsics.areEqual(this.address, lookupAddress.address);
    }

    @NotNull
    public final AddressData getAddress() {
        return this.address;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.address.hashCode() + (this.id.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "LookupAddress(id=" + this.id + ", address=" + this.address + ")";
    }
}
