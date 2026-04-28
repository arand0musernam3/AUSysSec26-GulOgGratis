package com.app.tgtg.model.remote.user.requests;

import com.app.tgtg.model.remote.user.response.Address;
import com.app.tgtg.model.remote.user.response.Address$$serializer;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0019¨\u0006,"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/OnboardingUserAddress;", "", "", "type", "Lcom/app/tgtg/model/remote/user/response/Address;", "address", "<init>", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/user/response/Address;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/app/tgtg/model/remote/user/response/Address;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/requests/OnboardingUserAddress;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/app/tgtg/model/remote/user/response/Address;", "copy", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/user/response/Address;)Lcom/app/tgtg/model/remote/user/requests/OnboardingUserAddress;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getType$annotations", "()V", "Lcom/app/tgtg/model/remote/user/response/Address;", "getAddress", "getAddress$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class OnboardingUserAddress {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Address address;

    @NotNull
    private final String type;

    public /* synthetic */ OnboardingUserAddress(int i11, String str, Address address, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, OnboardingUserAddress$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = str;
        this.address = address;
    }

    public static /* synthetic */ OnboardingUserAddress copy$default(OnboardingUserAddress onboardingUserAddress, String str, Address address, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = onboardingUserAddress.type;
        }
        if ((i11 & 2) != 0) {
            address = onboardingUserAddress.address;
        }
        return onboardingUserAddress.copy(str, address);
    }

    public static final /* synthetic */ void write$Self$app(OnboardingUserAddress self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.type);
        output.i(serialDesc, 1, Address$$serializer.INSTANCE, self.address);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Address getAddress() {
        return this.address;
    }

    @NotNull
    public final OnboardingUserAddress copy(@NotNull String type, @NotNull Address address) {
        type.getClass();
        address.getClass();
        return new OnboardingUserAddress(type, address);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingUserAddress)) {
            return false;
        }
        OnboardingUserAddress onboardingUserAddress = (OnboardingUserAddress) other;
        return Intrinsics.areEqual(this.type, onboardingUserAddress.type) && Intrinsics.areEqual(this.address, onboardingUserAddress.address);
    }

    @NotNull
    public final Address getAddress() {
        return this.address;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.address.hashCode() + (this.type.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "OnboardingUserAddress(type=" + this.type + ", address=" + this.address + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/OnboardingUserAddress$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/requests/OnboardingUserAddress;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return OnboardingUserAddress$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("address")
    public static /* synthetic */ void getAddress$annotations() {
    }

    @g("type")
    public static /* synthetic */ void getType$annotations() {
    }

    public OnboardingUserAddress(@NotNull String str, @NotNull Address address) {
        str.getClass();
        address.getClass();
        this.type = str;
        this.address = address;
    }
}
