package com.app.tgtg.model.remote.order;

import c50.w;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.ItemId$$serializer;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.OrderId$$serializer;
import com.app.tgtg.model.remote.UserId;
import com.app.tgtg.model.remote.UserId$$serializer;
import com.app.tgtg.model.remote.order.OrderInfo;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import l90.a;
import l90.b;
import m90.c1;
import m90.d0;
import m90.e1;
import m90.g;
import m90.r1;
import o30.f0;
import org.jetbrains.annotations.NotNull;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/order/OrderInfo.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/order/OrderInfo;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/order/OrderInfo;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/order/OrderInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class OrderInfo$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final OrderInfo$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        OrderInfo$$serializer orderInfo$$serializer = new OrderInfo$$serializer();
        INSTANCE = orderInfo$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.order.OrderInfo", orderInfo$$serializer, 7);
        e1Var.j("id", false);
        e1Var.j("item_id", false);
        e1Var.j("order_line", false);
        e1Var.j("reserved_at", false);
        e1Var.j("state", false);
        e1Var.j("user_id", false);
        e1Var.j("might_be_eligible_for_reward", true);
        descriptor = e1Var;
    }

    private OrderInfo$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{OrderId$$serializer.INSTANCE, ItemId$$serializer.INSTANCE, OrderLine$$serializer.INSTANCE, f0.B(r1.f29848a), OrderInfo.OrderInfoStateSerializer.INSTANCE, UserId$$serializer.INSTANCE, g.f29797a};
    }

    @Override // i90.b
    @NotNull
    public final OrderInfo deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        boolean z11 = true;
        int i11 = 0;
        boolean zT = false;
        String strM217unboximpl = null;
        String strM205unboximpl = null;
        OrderLine orderLine = null;
        String str = null;
        OrderInfo.OrderInfoState orderInfoState = null;
        String strM294unboximpl = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    OrderId orderId = (OrderId) aVarC.n(serialDescriptor, 0, OrderId$$serializer.INSTANCE, strM217unboximpl != null ? OrderId.m209boximpl(strM217unboximpl) : null);
                    strM217unboximpl = orderId != null ? orderId.m217unboximpl() : null;
                    i11 |= 1;
                    break;
                case 1:
                    ItemId itemId = (ItemId) aVarC.n(serialDescriptor, 1, ItemId$$serializer.INSTANCE, strM205unboximpl != null ? ItemId.m197boximpl(strM205unboximpl) : null);
                    strM205unboximpl = itemId != null ? itemId.m205unboximpl() : null;
                    i11 |= 2;
                    break;
                case 2:
                    orderLine = (OrderLine) aVarC.n(serialDescriptor, 2, OrderLine$$serializer.INSTANCE, orderLine);
                    i11 |= 4;
                    break;
                case 3:
                    str = (String) aVarC.m(serialDescriptor, 3, r1.f29848a, str);
                    i11 |= 8;
                    break;
                case 4:
                    orderInfoState = (OrderInfo.OrderInfoState) aVarC.n(serialDescriptor, 4, OrderInfo.OrderInfoStateSerializer.INSTANCE, orderInfoState);
                    i11 |= 16;
                    break;
                case 5:
                    UserId userId = (UserId) aVarC.n(serialDescriptor, 5, UserId$$serializer.INSTANCE, strM294unboximpl != null ? UserId.m286boximpl(strM294unboximpl) : null);
                    strM294unboximpl = userId != null ? userId.m294unboximpl() : null;
                    i11 |= 32;
                    break;
                case 6:
                    zT = aVarC.t(serialDescriptor, 6);
                    i11 |= 64;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new OrderInfo(i11, strM217unboximpl, strM205unboximpl, orderLine, str, orderInfoState, strM294unboximpl, zT, null, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull OrderInfo value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b bVarC = encoder.c(serialDescriptor);
        OrderInfo.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
