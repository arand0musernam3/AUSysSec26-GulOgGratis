package com.app.tgtg.model.remote.manufacturer.response;

import eu.a;
import i90.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.g;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b*\u0010(\u001a\u0004\b\u0006\u0010\u001a¨\u0006-"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/FindAddressMatchResponse;", "", "", "Lcom/app/tgtg/model/remote/manufacturer/response/AddressSearchElement;", "addresses", "", "isDisabled", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/Boolean;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/manufacturer/response/FindAddressMatchResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Boolean;", "copy", "(Ljava/util/List;Ljava/lang/Boolean;)Lcom/app/tgtg/model/remote/manufacturer/response/FindAddressMatchResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAddresses", "getAddresses$annotations", "()V", "Ljava/lang/Boolean;", "isDisabled$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class FindAddressMatchResponse {

    @NotNull
    private final List<AddressSearchElement> addresses;

    @Nullable
    private final Boolean isDisabled;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final j[] $childSerializers = {l.a(m.PUBLICATION, new a(22)), null};

    public /* synthetic */ FindAddressMatchResponse(int i11, List list, Boolean bool, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, FindAddressMatchResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.addresses = list;
        this.isDisabled = bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(AddressSearchElement$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FindAddressMatchResponse copy$default(FindAddressMatchResponse findAddressMatchResponse, List list, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = findAddressMatchResponse.addresses;
        }
        if ((i11 & 2) != 0) {
            bool = findAddressMatchResponse.isDisabled;
        }
        return findAddressMatchResponse.copy(list, bool);
    }

    public static final /* synthetic */ void write$Self$app(FindAddressMatchResponse self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.addresses);
        output.r(serialDesc, 1, g.f29797a, self.isDisabled);
    }

    @NotNull
    public final List<AddressSearchElement> component1() {
        return this.addresses;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsDisabled() {
        return this.isDisabled;
    }

    @NotNull
    public final FindAddressMatchResponse copy(@NotNull List<AddressSearchElement> addresses, @Nullable Boolean isDisabled) {
        addresses.getClass();
        return new FindAddressMatchResponse(addresses, isDisabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FindAddressMatchResponse)) {
            return false;
        }
        FindAddressMatchResponse findAddressMatchResponse = (FindAddressMatchResponse) other;
        return Intrinsics.areEqual(this.addresses, findAddressMatchResponse.addresses) && Intrinsics.areEqual(this.isDisabled, findAddressMatchResponse.isDisabled);
    }

    @NotNull
    public final List<AddressSearchElement> getAddresses() {
        return this.addresses;
    }

    public int hashCode() {
        int iHashCode = this.addresses.hashCode() * 31;
        Boolean bool = this.isDisabled;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    @Nullable
    public final Boolean isDisabled() {
        return this.isDisabled;
    }

    @NotNull
    public String toString() {
        return "FindAddressMatchResponse(addresses=" + this.addresses + ", isDisabled=" + this.isDisabled + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/FindAddressMatchResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/response/FindAddressMatchResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FindAddressMatchResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @i90.g("addresses")
    public static /* synthetic */ void getAddresses$annotations() {
    }

    @i90.g("is_disabled")
    public static /* synthetic */ void isDisabled$annotations() {
    }

    public FindAddressMatchResponse(@NotNull List<AddressSearchElement> list, @Nullable Boolean bool) {
        list.getClass();
        this.addresses = list;
        this.isDisabled = bool;
    }
}
