package com.app.tgtg.model.remote.manufacturer.response;

import com.app.tgtg.model.remote.user.requests.UserAddress;
import com.app.tgtg.model.remote.user.requests.UserAddress$$serializer;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.g;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b)\u0010'\u001a\u0004\b\u0005\u0010\u0019¨\u0006,"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/AddressSearchFetchResponse;", "", "Lcom/app/tgtg/model/remote/user/requests/UserAddress;", "address", "", "isDisabled", "<init>", "(Lcom/app/tgtg/model/remote/user/requests/UserAddress;Ljava/lang/Boolean;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/user/requests/UserAddress;Ljava/lang/Boolean;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/manufacturer/response/AddressSearchFetchResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/app/tgtg/model/remote/user/requests/UserAddress;", "component2", "()Ljava/lang/Boolean;", "copy", "(Lcom/app/tgtg/model/remote/user/requests/UserAddress;Ljava/lang/Boolean;)Lcom/app/tgtg/model/remote/manufacturer/response/AddressSearchFetchResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/user/requests/UserAddress;", "getAddress", "getAddress$annotations", "()V", "Ljava/lang/Boolean;", "isDisabled$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class AddressSearchFetchResponse {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final UserAddress address;

    @Nullable
    private final Boolean isDisabled;

    public /* synthetic */ AddressSearchFetchResponse(int i11, UserAddress userAddress, Boolean bool, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, AddressSearchFetchResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.address = userAddress;
        this.isDisabled = bool;
    }

    public static /* synthetic */ AddressSearchFetchResponse copy$default(AddressSearchFetchResponse addressSearchFetchResponse, UserAddress userAddress, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            userAddress = addressSearchFetchResponse.address;
        }
        if ((i11 & 2) != 0) {
            bool = addressSearchFetchResponse.isDisabled;
        }
        return addressSearchFetchResponse.copy(userAddress, bool);
    }

    public static final /* synthetic */ void write$Self$app(AddressSearchFetchResponse self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, UserAddress$$serializer.INSTANCE, self.address);
        output.r(serialDesc, 1, g.f29797a, self.isDisabled);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UserAddress getAddress() {
        return this.address;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsDisabled() {
        return this.isDisabled;
    }

    @NotNull
    public final AddressSearchFetchResponse copy(@NotNull UserAddress address, @Nullable Boolean isDisabled) {
        address.getClass();
        return new AddressSearchFetchResponse(address, isDisabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressSearchFetchResponse)) {
            return false;
        }
        AddressSearchFetchResponse addressSearchFetchResponse = (AddressSearchFetchResponse) other;
        return Intrinsics.areEqual(this.address, addressSearchFetchResponse.address) && Intrinsics.areEqual(this.isDisabled, addressSearchFetchResponse.isDisabled);
    }

    @NotNull
    public final UserAddress getAddress() {
        return this.address;
    }

    public int hashCode() {
        int iHashCode = this.address.hashCode() * 31;
        Boolean bool = this.isDisabled;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    @Nullable
    public final Boolean isDisabled() {
        return this.isDisabled;
    }

    @NotNull
    public String toString() {
        return "AddressSearchFetchResponse(address=" + this.address + ", isDisabled=" + this.isDisabled + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/AddressSearchFetchResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/response/AddressSearchFetchResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AddressSearchFetchResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @i90.g("address")
    public static /* synthetic */ void getAddress$annotations() {
    }

    @i90.g("is_disabled")
    public static /* synthetic */ void isDisabled$annotations() {
    }

    public AddressSearchFetchResponse(@NotNull UserAddress userAddress, @Nullable Boolean bool) {
        userAddress.getClass();
        this.address = userAddress;
        this.isDisabled = bool;
    }
}
