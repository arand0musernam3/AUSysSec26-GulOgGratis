package com.app.tgtg.model.remote.manufacturer.response;

import c50.w;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
import i90.b;
import java.util.List;
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
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/manufacturer/response/BasketResponse.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/manufacturer/response/BasketResponse;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/manufacturer/response/BasketResponse;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/manufacturer/response/BasketResponse;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class BasketResponse$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final BasketResponse$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        BasketResponse$$serializer basketResponse$$serializer = new BasketResponse$$serializer();
        INSTANCE = basketResponse$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.manufacturer.response.BasketResponse", basketResponse$$serializer, 9);
        e1Var.j("items_in_basket_list", false);
        e1Var.j("basket_subtotal_price", false);
        e1Var.j("basket_value", false);
        e1Var.j("can_checkout", false);
        e1Var.j("required_amount_to_checkout", false);
        e1Var.j("free_delivery", false);
        e1Var.j("required_amount_to_free_delivery", false);
        e1Var.j("estimated_delivery", false);
        e1Var.j("has_non_edible_item", false);
        descriptor = e1Var;
    }

    private BasketResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        Price$$serializer price$$serializer = Price$$serializer.INSTANCE;
        g gVar = g.f29797a;
        return new KSerializer[]{BasketResponse.$childSerializers[0].getValue(), f0.B(price$$serializer), f0.B(price$$serializer), gVar, f0.B(price$$serializer), f0.B(gVar), f0.B(price$$serializer), f0.B(r1.f29848a), f0.B(gVar)};
    }

    @Override // i90.b
    @NotNull
    public final BasketResponse deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = BasketResponse.$childSerializers;
        Boolean bool = null;
        List list = null;
        Price price = null;
        Price price2 = null;
        Price price3 = null;
        Boolean bool2 = null;
        Price price4 = null;
        String str = null;
        boolean z11 = true;
        int i11 = 0;
        boolean zT = false;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    list = (List) aVarC.n(serialDescriptor, 0, (b) jVarArr[0].getValue(), list);
                    i11 |= 1;
                    break;
                case 1:
                    price = (Price) aVarC.m(serialDescriptor, 1, Price$$serializer.INSTANCE, price);
                    i11 |= 2;
                    break;
                case 2:
                    price2 = (Price) aVarC.m(serialDescriptor, 2, Price$$serializer.INSTANCE, price2);
                    i11 |= 4;
                    break;
                case 3:
                    zT = aVarC.t(serialDescriptor, 3);
                    i11 |= 8;
                    break;
                case 4:
                    price3 = (Price) aVarC.m(serialDescriptor, 4, Price$$serializer.INSTANCE, price3);
                    i11 |= 16;
                    break;
                case 5:
                    bool2 = (Boolean) aVarC.m(serialDescriptor, 5, g.f29797a, bool2);
                    i11 |= 32;
                    break;
                case 6:
                    price4 = (Price) aVarC.m(serialDescriptor, 6, Price$$serializer.INSTANCE, price4);
                    i11 |= 64;
                    break;
                case 7:
                    str = (String) aVarC.m(serialDescriptor, 7, r1.f29848a, str);
                    i11 |= 128;
                    break;
                case 8:
                    bool = (Boolean) aVarC.m(serialDescriptor, 8, g.f29797a, bool);
                    i11 |= 256;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new BasketResponse(i11, list, price, price2, zT, price3, bool2, price4, str, bool, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull BasketResponse value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        BasketResponse.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
