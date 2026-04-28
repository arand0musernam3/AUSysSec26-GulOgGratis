package com.app.tgtg.model.remote.manufacturer.request;

import b3.i;
import e0.f;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.l0;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ4\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b,\u0010'\u001a\u0004\b+\u0010\u001a¨\u0006/"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/request/DeliveryOptionsRequest;", "", "", "itemId", "userAddressId", "", "quantity", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/manufacturer/request/DeliveryOptionsRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/app/tgtg/model/remote/manufacturer/request/DeliveryOptionsRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getItemId", "getItemId$annotations", "()V", "getUserAddressId", "getUserAddressId$annotations", "Ljava/lang/Integer;", "getQuantity", "getQuantity$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DeliveryOptionsRequest {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String itemId;

    @Nullable
    private final Integer quantity;

    @Nullable
    private final String userAddressId;

    public /* synthetic */ DeliveryOptionsRequest(int i11, String str, String str2, Integer num, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, DeliveryOptionsRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.itemId = str;
        this.userAddressId = str2;
        this.quantity = num;
    }

    public static /* synthetic */ DeliveryOptionsRequest copy$default(DeliveryOptionsRequest deliveryOptionsRequest, String str, String str2, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = deliveryOptionsRequest.itemId;
        }
        if ((i11 & 2) != 0) {
            str2 = deliveryOptionsRequest.userAddressId;
        }
        if ((i11 & 4) != 0) {
            num = deliveryOptionsRequest.quantity;
        }
        return deliveryOptionsRequest.copy(str, str2, num);
    }

    public static final /* synthetic */ void write$Self$app(DeliveryOptionsRequest self, b output, SerialDescriptor serialDesc) {
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 0, r1Var, self.itemId);
        output.r(serialDesc, 1, r1Var, self.userAddressId);
        output.r(serialDesc, 2, l0.f29821a, self.quantity);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserAddressId() {
        return this.userAddressId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final DeliveryOptionsRequest copy(@Nullable String itemId, @Nullable String userAddressId, @Nullable Integer quantity) {
        return new DeliveryOptionsRequest(itemId, userAddressId, quantity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryOptionsRequest)) {
            return false;
        }
        DeliveryOptionsRequest deliveryOptionsRequest = (DeliveryOptionsRequest) other;
        return Intrinsics.areEqual(this.itemId, deliveryOptionsRequest.itemId) && Intrinsics.areEqual(this.userAddressId, deliveryOptionsRequest.userAddressId) && Intrinsics.areEqual(this.quantity, deliveryOptionsRequest.quantity);
    }

    @Nullable
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    public final Integer getQuantity() {
        return this.quantity;
    }

    @Nullable
    public final String getUserAddressId() {
        return this.userAddressId;
    }

    public int hashCode() {
        String str = this.itemId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userAddressId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.quantity;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.itemId;
        String str2 = this.userAddressId;
        return i.m(f.t("DeliveryOptionsRequest(itemId=", str, ", userAddressId=", str2, ", quantity="), this.quantity, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/request/DeliveryOptionsRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/request/DeliveryOptionsRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DeliveryOptionsRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("item_id")
    public static /* synthetic */ void getItemId$annotations() {
    }

    @g("quantity")
    public static /* synthetic */ void getQuantity$annotations() {
    }

    @g("user_address_id")
    public static /* synthetic */ void getUserAddressId$annotations() {
    }

    public DeliveryOptionsRequest(@Nullable String str, @Nullable String str2, @Nullable Integer num) {
        this.itemId = str;
        this.userAddressId = str2;
        this.quantity = num;
    }
}
