package com.app.tgtg.model.remote.order;

import a80.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.ItemId$$serializer;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.OrderId$$serializer;
import com.app.tgtg.model.remote.UserId;
import com.app.tgtg.model.remote.UserId$$serializer;
import com.app.tgtg.model.remote.serializer.EnumWithUnknownSerializer;
import e0.f;
import i90.g;
import i90.h;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v0.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 Q2\u00020\u0001:\u0004RSTQBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B_\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010$\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010 J\u0010\u0010'\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b)\u0010 J\u0010\u0010+\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b+\u0010,JX\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b0\u0010 J\u0010\u00101\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b1\u0010\u0018J\u001a\u00104\u001a\u00020\u000e2\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105J'\u0010=\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0001¢\u0006\u0004\b;\u0010<R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010>\u0012\u0004\b@\u0010A\u001a\u0004\b?\u0010 R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010>\u0012\u0004\bC\u0010A\u001a\u0004\bB\u0010 R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010D\u0012\u0004\bF\u0010A\u001a\u0004\bE\u0010%R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010>\u0012\u0004\bH\u0010A\u001a\u0004\bG\u0010 R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010I\u0012\u0004\bK\u0010A\u001a\u0004\bJ\u0010(R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010>\u0012\u0004\bM\u0010A\u001a\u0004\bL\u0010 R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010N\u0012\u0004\bP\u0010A\u001a\u0004\bO\u0010,¨\u0006U"}, d2 = {"Lcom/app/tgtg/model/remote/order/OrderInfo;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/OrderId;", "orderId", "Lcom/app/tgtg/model/remote/ItemId;", "itemId", "Lcom/app/tgtg/model/remote/order/OrderLine;", "orderLine", "", "reservedAt", "Lcom/app/tgtg/model/remote/order/OrderInfo$OrderInfoState;", "state", "Lcom/app/tgtg/model/remote/UserId;", "userId", "", "eligibleForReward", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/order/OrderLine;Ljava/lang/String;Lcom/app/tgtg/model/remote/order/OrderInfo$OrderInfoState;Ljava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/order/OrderLine;Ljava/lang/String;Lcom/app/tgtg/model/remote/order/OrderInfo$OrderInfoState;Ljava/lang/String;ZLm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1-reIZeYA", "()Ljava/lang/String;", "component1", "component2-FvU5WIY", "component2", "component3", "()Lcom/app/tgtg/model/remote/order/OrderLine;", "component4", "component5", "()Lcom/app/tgtg/model/remote/order/OrderInfo$OrderInfoState;", "component6-8nKqa5U", "component6", "component7", "()Z", "copy-bxVwaF4", "(Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/order/OrderLine;Ljava/lang/String;Lcom/app/tgtg/model/remote/order/OrderInfo$OrderInfoState;Ljava/lang/String;Z)Lcom/app/tgtg/model/remote/order/OrderInfo;", "copy", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/order/OrderInfo;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getOrderId-reIZeYA", "getOrderId-reIZeYA$annotations", "()V", "getItemId-FvU5WIY", "getItemId-FvU5WIY$annotations", "Lcom/app/tgtg/model/remote/order/OrderLine;", "getOrderLine", "getOrderLine$annotations", "getReservedAt", "getReservedAt$annotations", "Lcom/app/tgtg/model/remote/order/OrderInfo$OrderInfoState;", "getState", "getState$annotations", "getUserId-8nKqa5U", "getUserId-8nKqa5U$annotations", "Z", "getEligibleForReward", "getEligibleForReward$annotations", "Companion", "OrderInfoState", "OrderInfoStateSerializer", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class OrderInfo implements Parcelable {
    public static final int $stable = 0;
    private final boolean eligibleForReward;

    @NotNull
    private final String itemId;

    @NotNull
    private final String orderId;

    @NotNull
    private final OrderLine orderLine;

    @Nullable
    private final String reservedAt;

    @NotNull
    private final OrderInfoState state;

    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<OrderInfo> CREATOR = new Creator();

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/app/tgtg/model/remote/order/OrderInfo$OrderInfoStateSerializer;", "Lcom/app/tgtg/model/remote/serializer/EnumWithUnknownSerializer;", "Lcom/app/tgtg/model/remote/order/OrderInfo$OrderInfoState;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OrderInfoStateSerializer extends EnumWithUnknownSerializer<OrderInfoState> {

        @NotNull
        public static final OrderInfoStateSerializer INSTANCE = new OrderInfoStateSerializer();
        public static final int $stable = 8;

        private OrderInfoStateSerializer() {
            super(OrderInfoState.getEntries(), OrderInfoState.UNKNOWN);
        }
    }

    private /* synthetic */ OrderInfo(int i11, String str, String str2, OrderLine orderLine, String str3, OrderInfoState orderInfoState, String str4, boolean z11, m1 m1Var) {
        if (63 != (i11 & 63)) {
            c1.j(i11, 63, OrderInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.orderId = str;
        this.itemId = str2;
        this.orderLine = orderLine;
        this.reservedAt = str3;
        this.state = orderInfoState;
        this.userId = str4;
        if ((i11 & 64) == 0) {
            this.eligibleForReward = false;
        } else {
            this.eligibleForReward = z11;
        }
    }

    /* JADX INFO: renamed from: copy-bxVwaF4$default, reason: not valid java name */
    public static /* synthetic */ OrderInfo m432copybxVwaF4$default(OrderInfo orderInfo, String str, String str2, OrderLine orderLine, String str3, OrderInfoState orderInfoState, String str4, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orderInfo.orderId;
        }
        if ((i11 & 2) != 0) {
            str2 = orderInfo.itemId;
        }
        if ((i11 & 4) != 0) {
            orderLine = orderInfo.orderLine;
        }
        if ((i11 & 8) != 0) {
            str3 = orderInfo.reservedAt;
        }
        if ((i11 & 16) != 0) {
            orderInfoState = orderInfo.state;
        }
        if ((i11 & 32) != 0) {
            str4 = orderInfo.userId;
        }
        if ((i11 & 64) != 0) {
            z11 = orderInfo.eligibleForReward;
        }
        String str5 = str4;
        boolean z12 = z11;
        OrderInfoState orderInfoState2 = orderInfoState;
        OrderLine orderLine2 = orderLine;
        return orderInfo.m439copybxVwaF4(str, str2, orderLine2, str3, orderInfoState2, str5, z12);
    }

    public static final /* synthetic */ void write$Self$app(OrderInfo self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, OrderId$$serializer.INSTANCE, OrderId.m209boximpl(self.orderId));
        output.i(serialDesc, 1, ItemId$$serializer.INSTANCE, ItemId.m197boximpl(self.itemId));
        output.i(serialDesc, 2, OrderLine$$serializer.INSTANCE, self.orderLine);
        output.r(serialDesc, 3, r1.f29848a, self.reservedAt);
        output.i(serialDesc, 4, OrderInfoStateSerializer.INSTANCE, self.state);
        output.i(serialDesc, 5, UserId$$serializer.INSTANCE, UserId.m286boximpl(self.userId));
        if (output.C(serialDesc) || self.eligibleForReward) {
            output.p(serialDesc, 6, self.eligibleForReward);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: component1-reIZeYA, reason: not valid java name and from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2-FvU5WIY, reason: not valid java name and from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OrderLine getOrderLine() {
        return this.orderLine;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReservedAt() {
        return this.reservedAt;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OrderInfoState getState() {
        return this.state;
    }

    @NotNull
    /* JADX INFO: renamed from: component6-8nKqa5U, reason: not valid java name and from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getEligibleForReward() {
        return this.eligibleForReward;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-bxVwaF4, reason: not valid java name */
    public final OrderInfo m439copybxVwaF4(@NotNull String orderId, @NotNull String itemId, @NotNull OrderLine orderLine, @Nullable String reservedAt, @NotNull OrderInfoState state, @NotNull String userId, boolean eligibleForReward) {
        orderId.getClass();
        itemId.getClass();
        orderLine.getClass();
        state.getClass();
        userId.getClass();
        return new OrderInfo(orderId, itemId, orderLine, reservedAt, state, userId, eligibleForReward, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderInfo)) {
            return false;
        }
        OrderInfo orderInfo = (OrderInfo) other;
        return OrderId.m213equalsimpl0(this.orderId, orderInfo.orderId) && ItemId.m201equalsimpl0(this.itemId, orderInfo.itemId) && Intrinsics.areEqual(this.orderLine, orderInfo.orderLine) && Intrinsics.areEqual(this.reservedAt, orderInfo.reservedAt) && this.state == orderInfo.state && UserId.m290equalsimpl0(this.userId, orderInfo.userId) && this.eligibleForReward == orderInfo.eligibleForReward;
    }

    public final boolean getEligibleForReward() {
        return this.eligibleForReward;
    }

    @NotNull
    /* JADX INFO: renamed from: getItemId-FvU5WIY, reason: not valid java name */
    public final String m440getItemIdFvU5WIY() {
        return this.itemId;
    }

    @NotNull
    /* JADX INFO: renamed from: getOrderId-reIZeYA, reason: not valid java name */
    public final String m441getOrderIdreIZeYA() {
        return this.orderId;
    }

    @NotNull
    public final OrderLine getOrderLine() {
        return this.orderLine;
    }

    @Nullable
    public final String getReservedAt() {
        return this.reservedAt;
    }

    @NotNull
    public final OrderInfoState getState() {
        return this.state;
    }

    @NotNull
    /* JADX INFO: renamed from: getUserId-8nKqa5U, reason: not valid java name */
    public final String m442getUserId8nKqa5U() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = (this.orderLine.hashCode() + ((ItemId.m202hashCodeimpl(this.itemId) + (OrderId.m214hashCodeimpl(this.orderId) * 31)) * 31)) * 31;
        String str = this.reservedAt;
        return Boolean.hashCode(this.eligibleForReward) + ((UserId.m291hashCodeimpl(this.userId) + ((this.state.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String strM215toStringimpl = OrderId.m215toStringimpl(this.orderId);
        String strM203toStringimpl = ItemId.m203toStringimpl(this.itemId);
        OrderLine orderLine = this.orderLine;
        String str = this.reservedAt;
        OrderInfoState orderInfoState = this.state;
        String strM292toStringimpl = UserId.m292toStringimpl(this.userId);
        boolean z11 = this.eligibleForReward;
        StringBuilder sbT = f.t("OrderInfo(orderId=", strM215toStringimpl, ", itemId=", strM203toStringimpl, ", orderLine=");
        sbT.append(orderLine);
        sbT.append(", reservedAt=");
        sbT.append(str);
        sbT.append(", state=");
        sbT.append(orderInfoState);
        sbT.append(", userId=");
        sbT.append(strM292toStringimpl);
        sbT.append(", eligibleForReward=");
        return s.o(sbT, z11, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        OrderId.m216writeToParcelimpl(this.orderId, dest, flags);
        ItemId.m204writeToParcelimpl(this.itemId, dest, flags);
        this.orderLine.writeToParcel(dest, flags);
        dest.writeString(this.reservedAt);
        dest.writeString(this.state.name());
        UserId.m293writeToParcelimpl(this.userId, dest, flags);
        dest.writeInt(this.eligibleForReward ? 1 : 0);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/app/tgtg/model/remote/order/OrderInfo$OrderInfoState;", "", "<init>", "(Ljava/lang/String;I)V", "CREATED", "RESERVED", "RESERVED_TNC_ACCEPTANCE_PENDING", "ABORTED", "USER_ABORTED", "PAYMENT_INITIATED", "PAID", "CANCELLED", "REDEEMED", "UNREDEEMED", "NOT_COLLECTED", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h(with = OrderInfoStateSerializer.class)
    public static final class OrderInfoState {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ OrderInfoState[] $VALUES;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        public static final OrderInfoState CREATED = new OrderInfoState("CREATED", 0);
        public static final OrderInfoState RESERVED = new OrderInfoState("RESERVED", 1);
        public static final OrderInfoState RESERVED_TNC_ACCEPTANCE_PENDING = new OrderInfoState("RESERVED_TNC_ACCEPTANCE_PENDING", 2);
        public static final OrderInfoState ABORTED = new OrderInfoState("ABORTED", 3);
        public static final OrderInfoState USER_ABORTED = new OrderInfoState("USER_ABORTED", 4);
        public static final OrderInfoState PAYMENT_INITIATED = new OrderInfoState("PAYMENT_INITIATED", 5);
        public static final OrderInfoState PAID = new OrderInfoState("PAID", 6);
        public static final OrderInfoState CANCELLED = new OrderInfoState("CANCELLED", 7);
        public static final OrderInfoState REDEEMED = new OrderInfoState("REDEEMED", 8);
        public static final OrderInfoState UNREDEEMED = new OrderInfoState("UNREDEEMED", 9);
        public static final OrderInfoState NOT_COLLECTED = new OrderInfoState("NOT_COLLECTED", 10);
        public static final OrderInfoState UNKNOWN = new OrderInfoState("UNKNOWN", 11);

        private static final /* synthetic */ OrderInfoState[] $values() {
            return new OrderInfoState[]{CREATED, RESERVED, RESERVED_TNC_ACCEPTANCE_PENDING, ABORTED, USER_ABORTED, PAYMENT_INITIATED, PAID, CANCELLED, REDEEMED, UNREDEEMED, NOT_COLLECTED, UNKNOWN};
        }

        static {
            OrderInfoState[] orderInfoStateArr$values = $values();
            $VALUES = orderInfoStateArr$values;
            $ENTRIES = n.w(orderInfoStateArr$values);
            INSTANCE = new Companion(null);
        }

        private OrderInfoState(String str, int i11) {
        }

        @NotNull
        public static a getEntries() {
            return $ENTRIES;
        }

        public static OrderInfoState valueOf(String str) {
            return (OrderInfoState) Enum.valueOf(OrderInfoState.class, str);
        }

        public static OrderInfoState[] values() {
            return (OrderInfoState[]) $VALUES.clone();
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/OrderInfo$OrderInfoState$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/OrderInfo$OrderInfoState;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return OrderInfoStateSerializer.INSTANCE;
            }

            private Companion() {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/OrderInfo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/OrderInfo;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return OrderInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderInfo createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new OrderInfo(OrderId.CREATOR.createFromParcel(parcel).m217unboximpl(), ItemId.CREATOR.createFromParcel(parcel).m205unboximpl(), OrderLine.CREATOR.createFromParcel(parcel), parcel.readString(), OrderInfoState.valueOf(parcel.readString()), UserId.CREATOR.createFromParcel(parcel).m294unboximpl(), parcel.readInt() != 0, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderInfo[] newArray(int i11) {
            return new OrderInfo[i11];
        }
    }

    @g("might_be_eligible_for_reward")
    public static /* synthetic */ void getEligibleForReward$annotations() {
    }

    @g("item_id")
    /* JADX INFO: renamed from: getItemId-FvU5WIY$annotations, reason: not valid java name */
    public static /* synthetic */ void m433getItemIdFvU5WIY$annotations() {
    }

    @g("id")
    /* JADX INFO: renamed from: getOrderId-reIZeYA$annotations, reason: not valid java name */
    public static /* synthetic */ void m434getOrderIdreIZeYA$annotations() {
    }

    @g("order_line")
    public static /* synthetic */ void getOrderLine$annotations() {
    }

    @g("reserved_at")
    public static /* synthetic */ void getReservedAt$annotations() {
    }

    @g("state")
    public static /* synthetic */ void getState$annotations() {
    }

    @g("user_id")
    /* JADX INFO: renamed from: getUserId-8nKqa5U$annotations, reason: not valid java name */
    public static /* synthetic */ void m435getUserId8nKqa5U$annotations() {
    }

    public /* synthetic */ OrderInfo(String str, String str2, OrderLine orderLine, String str3, OrderInfoState orderInfoState, String str4, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, orderLine, str3, orderInfoState, str4, z11);
    }

    public /* synthetic */ OrderInfo(int i11, String str, String str2, OrderLine orderLine, String str3, OrderInfoState orderInfoState, String str4, boolean z11, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, orderLine, str3, orderInfoState, str4, z11, m1Var);
    }

    private OrderInfo(String str, String str2, OrderLine orderLine, String str3, OrderInfoState orderInfoState, String str4, boolean z11) {
        str.getClass();
        str2.getClass();
        orderLine.getClass();
        orderInfoState.getClass();
        str4.getClass();
        this.orderId = str;
        this.itemId = str2;
        this.orderLine = orderLine;
        this.reservedAt = str3;
        this.state = orderInfoState;
        this.userId = str4;
        this.eligibleForReward = z11;
    }

    public /* synthetic */ OrderInfo(String str, String str2, OrderLine orderLine, String str3, OrderInfoState orderInfoState, String str4, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, orderLine, str3, orderInfoState, str4, (i11 & 64) != 0 ? false : z11, null);
    }
}
