package com.app.tgtg.model.remote.order.response;

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
import org.jetbrains.annotations.NotNull;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/order/response/OrderStatusResponse.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/order/response/OrderStatusResponse;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/order/response/OrderStatusResponse;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/order/response/OrderStatusResponse;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class OrderStatusResponse$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final OrderStatusResponse$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        OrderStatusResponse$$serializer orderStatusResponse$$serializer = new OrderStatusResponse$$serializer();
        INSTANCE = orderStatusResponse$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.order.response.OrderStatusResponse", orderStatusResponse$$serializer, 4);
        e1Var.j("id", false);
        e1Var.j("item_id", false);
        e1Var.j("user_id", false);
        e1Var.j("state", false);
        descriptor = e1Var;
    }

    private OrderStatusResponse$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{OrderId$$serializer.INSTANCE, ItemId$$serializer.INSTANCE, UserId$$serializer.INSTANCE, OrderInfo.OrderInfoStateSerializer.INSTANCE};
    }

    @Override // i90.b
    @NotNull
    public final OrderStatusResponse deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        boolean z11 = true;
        int i11 = 0;
        String strM217unboximpl = null;
        String strM205unboximpl = null;
        String strM294unboximpl = null;
        OrderInfo.OrderInfoState orderInfoState = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                OrderId orderId = (OrderId) aVarC.n(serialDescriptor, 0, OrderId$$serializer.INSTANCE, strM217unboximpl != null ? OrderId.m209boximpl(strM217unboximpl) : null);
                strM217unboximpl = orderId != null ? orderId.m217unboximpl() : null;
                i11 |= 1;
            } else if (iW == 1) {
                ItemId itemId = (ItemId) aVarC.n(serialDescriptor, 1, ItemId$$serializer.INSTANCE, strM205unboximpl != null ? ItemId.m197boximpl(strM205unboximpl) : null);
                strM205unboximpl = itemId != null ? itemId.m205unboximpl() : null;
                i11 |= 2;
            } else if (iW == 2) {
                UserId userId = (UserId) aVarC.n(serialDescriptor, 2, UserId$$serializer.INSTANCE, strM294unboximpl != null ? UserId.m286boximpl(strM294unboximpl) : null);
                strM294unboximpl = userId != null ? userId.m294unboximpl() : null;
                i11 |= 4;
            } else {
                if (iW != 3) {
                    w.e(iW);
                    return null;
                }
                orderInfoState = (OrderInfo.OrderInfoState) aVarC.n(serialDescriptor, 3, OrderInfo.OrderInfoStateSerializer.INSTANCE, orderInfoState);
                i11 |= 8;
            }
        }
        aVarC.b(serialDescriptor);
        return new OrderStatusResponse(i11, strM217unboximpl, strM205unboximpl, strM294unboximpl, orderInfoState, null, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull OrderStatusResponse value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b bVarC = encoder.c(serialDescriptor);
        OrderStatusResponse.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
