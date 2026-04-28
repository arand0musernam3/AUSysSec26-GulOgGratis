package com.app.tgtg.model.remote.invitation;

import com.app.tgtg.model.remote.brief.BriefItemInfo;
import com.app.tgtg.model.remote.brief.BriefItemInfo$$serializer;
import com.app.tgtg.model.remote.brief.BriefStoreInfo;
import com.app.tgtg.model.remote.brief.BriefStoreInfo$$serializer;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.item.PickupInterval$$serializer;
import com.app.tgtg.model.remote.item.StoreLocation;
import com.app.tgtg.model.remote.item.StoreLocation$$serializer;
import com.app.tgtg.model.remote.order.OrderType;
import com.app.tgtg.model.remote.order.OrderTypeSerializer;
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
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002GFB;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBU\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(JP\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u001eJ\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00103\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010\u001eR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00107\u0012\u0004\b9\u00106\u001a\u0004\b8\u0010 R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010:\u0012\u0004\b<\u00106\u001a\u0004\b;\u0010\"R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010=\u0012\u0004\b?\u00106\u001a\u0004\b>\u0010$R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010@\u0012\u0004\bB\u00106\u001a\u0004\bA\u0010&R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010C\u0012\u0004\bE\u00106\u001a\u0004\bD\u0010(¨\u0006H"}, d2 = {"Lcom/app/tgtg/model/remote/invitation/OrderDataForInvitation;", "", "", "quantity", "Lcom/app/tgtg/model/remote/brief/BriefStoreInfo;", "storeInfo", "Lcom/app/tgtg/model/remote/item/StoreLocation;", "pickupLocation", "Lcom/app/tgtg/model/remote/brief/BriefItemInfo;", "itemInfo", "Lcom/app/tgtg/model/remote/item/PickupInterval;", "pickupInterval", "Lcom/app/tgtg/model/remote/order/OrderType;", "orderType", "<init>", "(ILcom/app/tgtg/model/remote/brief/BriefStoreInfo;Lcom/app/tgtg/model/remote/item/StoreLocation;Lcom/app/tgtg/model/remote/brief/BriefItemInfo;Lcom/app/tgtg/model/remote/item/PickupInterval;Lcom/app/tgtg/model/remote/order/OrderType;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IILcom/app/tgtg/model/remote/brief/BriefStoreInfo;Lcom/app/tgtg/model/remote/item/StoreLocation;Lcom/app/tgtg/model/remote/brief/BriefItemInfo;Lcom/app/tgtg/model/remote/item/PickupInterval;Lcom/app/tgtg/model/remote/order/OrderType;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/invitation/OrderDataForInvitation;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Lcom/app/tgtg/model/remote/brief/BriefStoreInfo;", "component3", "()Lcom/app/tgtg/model/remote/item/StoreLocation;", "component4", "()Lcom/app/tgtg/model/remote/brief/BriefItemInfo;", "component5", "()Lcom/app/tgtg/model/remote/item/PickupInterval;", "component6", "()Lcom/app/tgtg/model/remote/order/OrderType;", "copy", "(ILcom/app/tgtg/model/remote/brief/BriefStoreInfo;Lcom/app/tgtg/model/remote/item/StoreLocation;Lcom/app/tgtg/model/remote/brief/BriefItemInfo;Lcom/app/tgtg/model/remote/item/PickupInterval;Lcom/app/tgtg/model/remote/order/OrderType;)Lcom/app/tgtg/model/remote/invitation/OrderDataForInvitation;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getQuantity", "getQuantity$annotations", "()V", "Lcom/app/tgtg/model/remote/brief/BriefStoreInfo;", "getStoreInfo", "getStoreInfo$annotations", "Lcom/app/tgtg/model/remote/item/StoreLocation;", "getPickupLocation", "getPickupLocation$annotations", "Lcom/app/tgtg/model/remote/brief/BriefItemInfo;", "getItemInfo", "getItemInfo$annotations", "Lcom/app/tgtg/model/remote/item/PickupInterval;", "getPickupInterval", "getPickupInterval$annotations", "Lcom/app/tgtg/model/remote/order/OrderType;", "getOrderType", "getOrderType$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class OrderDataForInvitation {

    @NotNull
    private final BriefItemInfo itemInfo;

    @Nullable
    private final OrderType orderType;

    @Nullable
    private final PickupInterval pickupInterval;

    @NotNull
    private final StoreLocation pickupLocation;
    private final int quantity;

    @NotNull
    private final BriefStoreInfo storeInfo;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ OrderDataForInvitation(int i11, int i12, BriefStoreInfo briefStoreInfo, StoreLocation storeLocation, BriefItemInfo briefItemInfo, PickupInterval pickupInterval, OrderType orderType, m1 m1Var) {
        if (63 != (i11 & 63)) {
            c1.j(i11, 63, OrderDataForInvitation$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.quantity = i12;
        this.storeInfo = briefStoreInfo;
        this.pickupLocation = storeLocation;
        this.itemInfo = briefItemInfo;
        this.pickupInterval = pickupInterval;
        this.orderType = orderType;
    }

    public static /* synthetic */ OrderDataForInvitation copy$default(OrderDataForInvitation orderDataForInvitation, int i11, BriefStoreInfo briefStoreInfo, StoreLocation storeLocation, BriefItemInfo briefItemInfo, PickupInterval pickupInterval, OrderType orderType, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = orderDataForInvitation.quantity;
        }
        if ((i12 & 2) != 0) {
            briefStoreInfo = orderDataForInvitation.storeInfo;
        }
        if ((i12 & 4) != 0) {
            storeLocation = orderDataForInvitation.pickupLocation;
        }
        if ((i12 & 8) != 0) {
            briefItemInfo = orderDataForInvitation.itemInfo;
        }
        if ((i12 & 16) != 0) {
            pickupInterval = orderDataForInvitation.pickupInterval;
        }
        if ((i12 & 32) != 0) {
            orderType = orderDataForInvitation.orderType;
        }
        PickupInterval pickupInterval2 = pickupInterval;
        OrderType orderType2 = orderType;
        return orderDataForInvitation.copy(i11, briefStoreInfo, storeLocation, briefItemInfo, pickupInterval2, orderType2);
    }

    public static final /* synthetic */ void write$Self$app(OrderDataForInvitation self, b output, SerialDescriptor serialDesc) {
        output.m(0, self.quantity, serialDesc);
        output.i(serialDesc, 1, BriefStoreInfo$$serializer.INSTANCE, self.storeInfo);
        output.i(serialDesc, 2, StoreLocation$$serializer.INSTANCE, self.pickupLocation);
        output.i(serialDesc, 3, BriefItemInfo$$serializer.INSTANCE, self.itemInfo);
        output.r(serialDesc, 4, PickupInterval$$serializer.INSTANCE, self.pickupInterval);
        output.r(serialDesc, 5, OrderTypeSerializer.INSTANCE, self.orderType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BriefStoreInfo getStoreInfo() {
        return this.storeInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final StoreLocation getPickupLocation() {
        return this.pickupLocation;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BriefItemInfo getItemInfo() {
        return this.itemInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PickupInterval getPickupInterval() {
        return this.pickupInterval;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final OrderType getOrderType() {
        return this.orderType;
    }

    @NotNull
    public final OrderDataForInvitation copy(int quantity, @NotNull BriefStoreInfo storeInfo, @NotNull StoreLocation pickupLocation, @NotNull BriefItemInfo itemInfo, @Nullable PickupInterval pickupInterval, @Nullable OrderType orderType) {
        storeInfo.getClass();
        pickupLocation.getClass();
        itemInfo.getClass();
        return new OrderDataForInvitation(quantity, storeInfo, pickupLocation, itemInfo, pickupInterval, orderType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDataForInvitation)) {
            return false;
        }
        OrderDataForInvitation orderDataForInvitation = (OrderDataForInvitation) other;
        return this.quantity == orderDataForInvitation.quantity && Intrinsics.areEqual(this.storeInfo, orderDataForInvitation.storeInfo) && Intrinsics.areEqual(this.pickupLocation, orderDataForInvitation.pickupLocation) && Intrinsics.areEqual(this.itemInfo, orderDataForInvitation.itemInfo) && Intrinsics.areEqual(this.pickupInterval, orderDataForInvitation.pickupInterval) && this.orderType == orderDataForInvitation.orderType;
    }

    @NotNull
    public final BriefItemInfo getItemInfo() {
        return this.itemInfo;
    }

    @Nullable
    public final OrderType getOrderType() {
        return this.orderType;
    }

    @Nullable
    public final PickupInterval getPickupInterval() {
        return this.pickupInterval;
    }

    @NotNull
    public final StoreLocation getPickupLocation() {
        return this.pickupLocation;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final BriefStoreInfo getStoreInfo() {
        return this.storeInfo;
    }

    public int hashCode() {
        int iHashCode = (this.itemInfo.hashCode() + ((this.pickupLocation.hashCode() + ((this.storeInfo.hashCode() + (Integer.hashCode(this.quantity) * 31)) * 31)) * 31)) * 31;
        PickupInterval pickupInterval = this.pickupInterval;
        int iHashCode2 = (iHashCode + (pickupInterval == null ? 0 : pickupInterval.hashCode())) * 31;
        OrderType orderType = this.orderType;
        return iHashCode2 + (orderType != null ? orderType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OrderDataForInvitation(quantity=" + this.quantity + ", storeInfo=" + this.storeInfo + ", pickupLocation=" + this.pickupLocation + ", itemInfo=" + this.itemInfo + ", pickupInterval=" + this.pickupInterval + ", orderType=" + this.orderType + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/invitation/OrderDataForInvitation$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/invitation/OrderDataForInvitation;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return OrderDataForInvitation$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("item_info")
    public static /* synthetic */ void getItemInfo$annotations() {
    }

    @g("order_type")
    public static /* synthetic */ void getOrderType$annotations() {
    }

    @g("pickup_interval")
    public static /* synthetic */ void getPickupInterval$annotations() {
    }

    @g("pickup_location")
    public static /* synthetic */ void getPickupLocation$annotations() {
    }

    @g("quantity")
    public static /* synthetic */ void getQuantity$annotations() {
    }

    @g("store_info")
    public static /* synthetic */ void getStoreInfo$annotations() {
    }

    public OrderDataForInvitation(int i11, @NotNull BriefStoreInfo briefStoreInfo, @NotNull StoreLocation storeLocation, @NotNull BriefItemInfo briefItemInfo, @Nullable PickupInterval pickupInterval, @Nullable OrderType orderType) {
        briefStoreInfo.getClass();
        storeLocation.getClass();
        briefItemInfo.getClass();
        this.quantity = i11;
        this.storeInfo = briefStoreInfo;
        this.pickupLocation = storeLocation;
        this.itemInfo = briefItemInfo;
        this.pickupInterval = pickupInterval;
        this.orderType = orderType;
    }
}
