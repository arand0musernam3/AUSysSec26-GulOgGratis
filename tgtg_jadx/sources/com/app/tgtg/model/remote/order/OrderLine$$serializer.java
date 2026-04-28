package com.app.tgtg.model.remote.order;

import c50.w;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
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
import m90.l0;
import org.jetbrains.annotations.NotNull;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/order/OrderLine.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/order/OrderLine;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/order/OrderLine;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/order/OrderLine;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class OrderLine$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final OrderLine$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        OrderLine$$serializer orderLine$$serializer = new OrderLine$$serializer();
        INSTANCE = orderLine$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.order.OrderLine", orderLine$$serializer, 6);
        e1Var.j("item_price_excluding_taxes", false);
        e1Var.j("item_price_including_taxes", false);
        e1Var.j("quantity", false);
        e1Var.j("total_price", false);
        e1Var.j("total_price_excluding_taxes", false);
        e1Var.j("total_price_including_taxes", false);
        descriptor = e1Var;
    }

    private OrderLine$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        Price$$serializer price$$serializer = Price$$serializer.INSTANCE;
        return new KSerializer[]{price$$serializer, price$$serializer, l0.f29821a, price$$serializer, price$$serializer, price$$serializer};
    }

    @Override // i90.b
    @NotNull
    public final OrderLine deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        int i11 = 0;
        int iQ = 0;
        Price price = null;
        Price price2 = null;
        Price price3 = null;
        Price price4 = null;
        Price price5 = null;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    price = (Price) aVarC.n(serialDescriptor, 0, Price$$serializer.INSTANCE, price);
                    i11 |= 1;
                    break;
                case 1:
                    price2 = (Price) aVarC.n(serialDescriptor, 1, Price$$serializer.INSTANCE, price2);
                    i11 |= 2;
                    break;
                case 2:
                    iQ = aVarC.q(serialDescriptor, 2);
                    i11 |= 4;
                    break;
                case 3:
                    price3 = (Price) aVarC.n(serialDescriptor, 3, Price$$serializer.INSTANCE, price3);
                    i11 |= 8;
                    break;
                case 4:
                    price4 = (Price) aVarC.n(serialDescriptor, 4, Price$$serializer.INSTANCE, price4);
                    i11 |= 16;
                    break;
                case 5:
                    price5 = (Price) aVarC.n(serialDescriptor, 5, Price$$serializer.INSTANCE, price5);
                    i11 |= 32;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new OrderLine(i11, price, price2, iQ, price3, price4, price5, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull OrderLine value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b bVarC = encoder.c(serialDescriptor);
        OrderLine.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
