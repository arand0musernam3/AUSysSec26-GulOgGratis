package com.app.tgtg.model.remote.brief;

import c50.w;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.OrderId$$serializer;
import com.app.tgtg.model.remote.UserId;
import com.app.tgtg.model.remote.UserId$$serializer;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.item.PickupInterval$$serializer;
import com.app.tgtg.model.remote.order.OrderState;
import com.app.tgtg.model.remote.order.OrderStateSerializer;
import com.app.tgtg.model.remote.order.OrderType;
import com.app.tgtg.model.remote.order.OrderTypeSerializer;
import i90.b;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import l90.a;
import m90.c1;
import m90.d0;
import m90.e1;
import m90.g;
import m90.r1;
import o30.f0;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/brief/BriefOrder.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/brief/BriefOrder;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/brief/BriefOrder;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/brief/BriefOrder;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class BriefOrder$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final BriefOrder$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        BriefOrder$$serializer briefOrder$$serializer = new BriefOrder$$serializer();
        INSTANCE = briefOrder$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.brief.BriefOrder", briefOrder$$serializer, 14);
        e1Var.j("user_id", false);
        e1Var.j("order_id", false);
        e1Var.j("order_state", false);
        e1Var.j("order_type", false);
        e1Var.j("rating_info", false);
        e1Var.j("store_info", false);
        e1Var.j("item_info", false);
        e1Var.j("refund_or_cancel_info", false);
        e1Var.j("pickup_window", false);
        e1Var.j("last_updated_at_utc", false);
        e1Var.j("time_of_purchase_utc", false);
        e1Var.j("invitation_id", false);
        e1Var.j("is_multi_item", false);
        e1Var.j("changeState", true);
        descriptor = e1Var;
    }

    private BriefOrder$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = BriefOrder.$childSerializers;
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{f0.B(UserId$$serializer.INSTANCE), OrderId$$serializer.INSTANCE, f0.B(OrderStateSerializer.INSTANCE), f0.B(OrderTypeSerializer.INSTANCE), f0.B(BriefRatingInfo$$serializer.INSTANCE), f0.B(BriefStoreInfo$$serializer.INSTANCE), f0.B(BriefItemInfo$$serializer.INSTANCE), f0.B(BriefRefundOrCancelInfo$$serializer.INSTANCE), f0.B(PickupInterval$$serializer.INSTANCE), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B(g.f29797a), jVarArr[13].getValue()};
    }

    @Override // i90.b
    @NotNull
    public final BriefOrder deserialize(@NotNull Decoder decoder) {
        String str;
        OrderState orderState;
        String str2;
        String str3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = BriefOrder.$childSerializers;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        PickupInterval pickupInterval = null;
        Boolean bool = null;
        BriefRefundOrCancelInfo briefRefundOrCancelInfo = null;
        int i11 = 0;
        BriefOrderChangeState briefOrderChangeState = null;
        String strM217unboximpl = null;
        OrderState orderState2 = null;
        OrderType orderType = null;
        BriefRatingInfo briefRatingInfo = null;
        BriefStoreInfo briefStoreInfo = null;
        BriefItemInfo briefItemInfo = null;
        boolean z11 = true;
        String strM294unboximpl = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    str3 = str4;
                    z11 = false;
                    str4 = str3;
                    break;
                case 0:
                    str = str4;
                    String str7 = strM217unboximpl;
                    orderState = orderState2;
                    UserId userId = (UserId) aVarC.m(serialDescriptor, 0, UserId$$serializer.INSTANCE, strM294unboximpl != null ? UserId.m286boximpl(strM294unboximpl) : null);
                    strM294unboximpl = userId != null ? userId.m294unboximpl() : null;
                    i11 |= 1;
                    strM217unboximpl = str7;
                    str4 = str;
                    orderState2 = orderState;
                    break;
                case 1:
                    str = str4;
                    String str8 = strM217unboximpl;
                    orderState = orderState2;
                    OrderId orderId = (OrderId) aVarC.n(serialDescriptor, 1, OrderId$$serializer.INSTANCE, str8 != null ? OrderId.m209boximpl(str8) : null);
                    strM217unboximpl = orderId != null ? orderId.m217unboximpl() : null;
                    i11 |= 2;
                    str4 = str;
                    orderState2 = orderState;
                    break;
                case 2:
                    str3 = str4;
                    orderState2 = (OrderState) aVarC.m(serialDescriptor, 2, OrderStateSerializer.INSTANCE, orderState2);
                    i11 |= 4;
                    strM217unboximpl = strM217unboximpl;
                    str4 = str3;
                    break;
                case 3:
                    str2 = strM217unboximpl;
                    orderState = orderState2;
                    orderType = (OrderType) aVarC.m(serialDescriptor, 3, OrderTypeSerializer.INSTANCE, orderType);
                    i11 |= 8;
                    strM217unboximpl = str2;
                    orderState2 = orderState;
                    break;
                case 4:
                    str2 = strM217unboximpl;
                    orderState = orderState2;
                    briefRatingInfo = (BriefRatingInfo) aVarC.m(serialDescriptor, 4, BriefRatingInfo$$serializer.INSTANCE, briefRatingInfo);
                    i11 |= 16;
                    strM217unboximpl = str2;
                    orderState2 = orderState;
                    break;
                case 5:
                    str2 = strM217unboximpl;
                    orderState = orderState2;
                    briefStoreInfo = (BriefStoreInfo) aVarC.m(serialDescriptor, 5, BriefStoreInfo$$serializer.INSTANCE, briefStoreInfo);
                    i11 |= 32;
                    strM217unboximpl = str2;
                    orderState2 = orderState;
                    break;
                case 6:
                    str2 = strM217unboximpl;
                    orderState = orderState2;
                    briefItemInfo = (BriefItemInfo) aVarC.m(serialDescriptor, 6, BriefItemInfo$$serializer.INSTANCE, briefItemInfo);
                    i11 |= 64;
                    strM217unboximpl = str2;
                    orderState2 = orderState;
                    break;
                case 7:
                    str2 = strM217unboximpl;
                    orderState = orderState2;
                    briefRefundOrCancelInfo = (BriefRefundOrCancelInfo) aVarC.m(serialDescriptor, 7, BriefRefundOrCancelInfo$$serializer.INSTANCE, briefRefundOrCancelInfo);
                    i11 |= 128;
                    strM217unboximpl = str2;
                    orderState2 = orderState;
                    break;
                case 8:
                    str2 = strM217unboximpl;
                    orderState = orderState2;
                    pickupInterval = (PickupInterval) aVarC.m(serialDescriptor, 8, PickupInterval$$serializer.INSTANCE, pickupInterval);
                    i11 |= 256;
                    strM217unboximpl = str2;
                    orderState2 = orderState;
                    break;
                case 9:
                    str2 = strM217unboximpl;
                    orderState = orderState2;
                    str6 = (String) aVarC.m(serialDescriptor, 9, r1.f29848a, str6);
                    i11 |= 512;
                    strM217unboximpl = str2;
                    orderState2 = orderState;
                    break;
                case 10:
                    str2 = strM217unboximpl;
                    orderState = orderState2;
                    str5 = (String) aVarC.m(serialDescriptor, 10, r1.f29848a, str5);
                    i11 |= 1024;
                    strM217unboximpl = str2;
                    orderState2 = orderState;
                    break;
                case 11:
                    str2 = strM217unboximpl;
                    orderState = orderState2;
                    str4 = (String) aVarC.m(serialDescriptor, 11, r1.f29848a, str4);
                    i11 |= NewHope.SENDB_BYTES;
                    strM217unboximpl = str2;
                    orderState2 = orderState;
                    break;
                case 12:
                    str2 = strM217unboximpl;
                    orderState = orderState2;
                    bool = (Boolean) aVarC.m(serialDescriptor, 12, g.f29797a, bool);
                    i11 |= 4096;
                    strM217unboximpl = str2;
                    orderState2 = orderState;
                    break;
                case 13:
                    str2 = strM217unboximpl;
                    orderState = orderState2;
                    briefOrderChangeState = (BriefOrderChangeState) aVarC.n(serialDescriptor, 13, (b) jVarArr[13].getValue(), briefOrderChangeState);
                    i11 |= 8192;
                    strM217unboximpl = str2;
                    orderState2 = orderState;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        String str9 = strM217unboximpl;
        OrderState orderState3 = orderState2;
        aVarC.b(serialDescriptor);
        return new BriefOrder(i11, strM294unboximpl, str9, orderState3, orderType, briefRatingInfo, briefStoreInfo, briefItemInfo, briefRefundOrCancelInfo, pickupInterval, str6, str5, str4, bool, briefOrderChangeState, null, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull BriefOrder value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        BriefOrder.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
