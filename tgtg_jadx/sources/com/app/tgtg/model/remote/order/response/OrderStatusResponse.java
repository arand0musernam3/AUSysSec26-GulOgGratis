package com.app.tgtg.model.remote.order.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.ItemId$$serializer;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.OrderId$$serializer;
import com.app.tgtg.model.remote.UserId;
import com.app.tgtg.model.remote.UserId$$serializer;
import com.app.tgtg.model.remote.order.OrderInfo;
import e0.f;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0010\u0010'\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0010\u0010(\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b(\u0010)J8\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010\"J\u0010\u0010/\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b/\u0010\u001bJ\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00105\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010\"R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00105\u0012\u0004\b:\u00108\u001a\u0004\b9\u0010\"R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00105\u0012\u0004\b<\u00108\u001a\u0004\b;\u0010\"R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010=\u0012\u0004\b?\u00108\u001a\u0004\b>\u0010)¨\u0006B"}, d2 = {"Lcom/app/tgtg/model/remote/order/response/OrderStatusResponse;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/OrderId;", "orderId", "Lcom/app/tgtg/model/remote/ItemId;", "itemId", "Lcom/app/tgtg/model/remote/UserId;", "userId", "Lcom/app/tgtg/model/remote/order/OrderInfo$OrderInfoState;", "state", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/order/OrderInfo$OrderInfoState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/order/OrderInfo$OrderInfoState;Lm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/order/response/OrderStatusResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1-reIZeYA", "()Ljava/lang/String;", "component1", "component2-FvU5WIY", "component2", "component3-8nKqa5U", "component3", "component4", "()Lcom/app/tgtg/model/remote/order/OrderInfo$OrderInfoState;", "copy-qNgj3M0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/order/OrderInfo$OrderInfoState;)Lcom/app/tgtg/model/remote/order/response/OrderStatusResponse;", "copy", "", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrderId-reIZeYA", "getOrderId-reIZeYA$annotations", "()V", "getItemId-FvU5WIY", "getItemId-FvU5WIY$annotations", "getUserId-8nKqa5U", "getUserId-8nKqa5U$annotations", "Lcom/app/tgtg/model/remote/order/OrderInfo$OrderInfoState;", "getState", "getState$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class OrderStatusResponse implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    private final String itemId;

    @NotNull
    private final String orderId;

    @NotNull
    private final OrderInfo.OrderInfoState state;

    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<OrderStatusResponse> CREATOR = new Creator();

    private /* synthetic */ OrderStatusResponse(int i11, String str, String str2, String str3, OrderInfo.OrderInfoState orderInfoState, m1 m1Var) {
        if (15 != (i11 & 15)) {
            c1.j(i11, 15, OrderStatusResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.orderId = str;
        this.itemId = str2;
        this.userId = str3;
        this.state = orderInfoState;
    }

    /* JADX INFO: renamed from: copy-qNgj3M0$default, reason: not valid java name */
    public static /* synthetic */ OrderStatusResponse m459copyqNgj3M0$default(OrderStatusResponse orderStatusResponse, String str, String str2, String str3, OrderInfo.OrderInfoState orderInfoState, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orderStatusResponse.orderId;
        }
        if ((i11 & 2) != 0) {
            str2 = orderStatusResponse.itemId;
        }
        if ((i11 & 4) != 0) {
            str3 = orderStatusResponse.userId;
        }
        if ((i11 & 8) != 0) {
            orderInfoState = orderStatusResponse.state;
        }
        return orderStatusResponse.m466copyqNgj3M0(str, str2, str3, orderInfoState);
    }

    public static final /* synthetic */ void write$Self$app(OrderStatusResponse self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, OrderId$$serializer.INSTANCE, OrderId.m209boximpl(self.orderId));
        output.i(serialDesc, 1, ItemId$$serializer.INSTANCE, ItemId.m197boximpl(self.itemId));
        output.i(serialDesc, 2, UserId$$serializer.INSTANCE, UserId.m286boximpl(self.userId));
        output.i(serialDesc, 3, OrderInfo.OrderInfoStateSerializer.INSTANCE, self.state);
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
    /* JADX INFO: renamed from: component3-8nKqa5U, reason: not valid java name and from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OrderInfo.OrderInfoState getState() {
        return this.state;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-qNgj3M0, reason: not valid java name */
    public final OrderStatusResponse m466copyqNgj3M0(@NotNull String orderId, @NotNull String itemId, @NotNull String userId, @NotNull OrderInfo.OrderInfoState state) {
        orderId.getClass();
        itemId.getClass();
        userId.getClass();
        state.getClass();
        return new OrderStatusResponse(orderId, itemId, userId, state, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderStatusResponse)) {
            return false;
        }
        OrderStatusResponse orderStatusResponse = (OrderStatusResponse) other;
        return OrderId.m213equalsimpl0(this.orderId, orderStatusResponse.orderId) && ItemId.m201equalsimpl0(this.itemId, orderStatusResponse.itemId) && UserId.m290equalsimpl0(this.userId, orderStatusResponse.userId) && this.state == orderStatusResponse.state;
    }

    @NotNull
    /* JADX INFO: renamed from: getItemId-FvU5WIY, reason: not valid java name */
    public final String m467getItemIdFvU5WIY() {
        return this.itemId;
    }

    @NotNull
    /* JADX INFO: renamed from: getOrderId-reIZeYA, reason: not valid java name */
    public final String m468getOrderIdreIZeYA() {
        return this.orderId;
    }

    @NotNull
    public final OrderInfo.OrderInfoState getState() {
        return this.state;
    }

    @NotNull
    /* JADX INFO: renamed from: getUserId-8nKqa5U, reason: not valid java name */
    public final String m469getUserId8nKqa5U() {
        return this.userId;
    }

    public int hashCode() {
        return this.state.hashCode() + ((UserId.m291hashCodeimpl(this.userId) + ((ItemId.m202hashCodeimpl(this.itemId) + (OrderId.m214hashCodeimpl(this.orderId) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String strM215toStringimpl = OrderId.m215toStringimpl(this.orderId);
        String strM203toStringimpl = ItemId.m203toStringimpl(this.itemId);
        String strM292toStringimpl = UserId.m292toStringimpl(this.userId);
        OrderInfo.OrderInfoState orderInfoState = this.state;
        StringBuilder sbT = f.t("OrderStatusResponse(orderId=", strM215toStringimpl, ", itemId=", strM203toStringimpl, ", userId=");
        sbT.append(strM292toStringimpl);
        sbT.append(", state=");
        sbT.append(orderInfoState);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        OrderId.m216writeToParcelimpl(this.orderId, dest, flags);
        ItemId.m204writeToParcelimpl(this.itemId, dest, flags);
        UserId.m293writeToParcelimpl(this.userId, dest, flags);
        dest.writeString(this.state.name());
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/response/OrderStatusResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/response/OrderStatusResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return OrderStatusResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderStatusResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderStatusResponse createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new OrderStatusResponse(OrderId.CREATOR.createFromParcel(parcel).m217unboximpl(), ItemId.CREATOR.createFromParcel(parcel).m205unboximpl(), UserId.CREATOR.createFromParcel(parcel).m294unboximpl(), OrderInfo.OrderInfoState.valueOf(parcel.readString()), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderStatusResponse[] newArray(int i11) {
            return new OrderStatusResponse[i11];
        }
    }

    @g("item_id")
    /* JADX INFO: renamed from: getItemId-FvU5WIY$annotations, reason: not valid java name */
    public static /* synthetic */ void m460getItemIdFvU5WIY$annotations() {
    }

    @g("id")
    /* JADX INFO: renamed from: getOrderId-reIZeYA$annotations, reason: not valid java name */
    public static /* synthetic */ void m461getOrderIdreIZeYA$annotations() {
    }

    @g("state")
    public static /* synthetic */ void getState$annotations() {
    }

    @g("user_id")
    /* JADX INFO: renamed from: getUserId-8nKqa5U$annotations, reason: not valid java name */
    public static /* synthetic */ void m462getUserId8nKqa5U$annotations() {
    }

    public /* synthetic */ OrderStatusResponse(String str, String str2, String str3, OrderInfo.OrderInfoState orderInfoState, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, orderInfoState);
    }

    public /* synthetic */ OrderStatusResponse(int i11, String str, String str2, String str3, OrderInfo.OrderInfoState orderInfoState, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, str3, orderInfoState, m1Var);
    }

    private OrderStatusResponse(String str, String str2, String str3, OrderInfo.OrderInfoState orderInfoState) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        orderInfoState.getClass();
        this.orderId = str;
        this.itemId = str2;
        this.userId = str3;
        this.state = orderInfoState;
    }
}
