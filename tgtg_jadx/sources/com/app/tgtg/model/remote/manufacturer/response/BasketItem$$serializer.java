package com.app.tgtg.model.remote.manufacturer.response;

import c50.w;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.Picture$$serializer;
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
import m90.l0;
import m90.r1;
import o30.f0;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/manufacturer/response/BasketItem.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/manufacturer/response/BasketItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/manufacturer/response/BasketItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/manufacturer/response/BasketItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class BasketItem$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final BasketItem$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        BasketItem$$serializer basketItem$$serializer = new BasketItem$$serializer();
        INSTANCE = basketItem$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.manufacturer.response.BasketItem", basketItem$$serializer, 9);
        e1Var.j("item_id", false);
        e1Var.j("item_name", false);
        e1Var.j("item_subtitle", false);
        e1Var.j("cover_picture", false);
        e1Var.j("item_value", false);
        e1Var.j("subtotal_price", false);
        e1Var.j("quantity", false);
        e1Var.j("max_available_quantity", false);
        e1Var.j("warnings", false);
        descriptor = e1Var;
    }

    private BasketItem$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = BasketItem.$childSerializers;
        r1 r1Var = r1.f29848a;
        Price$$serializer price$$serializer = Price$$serializer.INSTANCE;
        l0 l0Var = l0.f29821a;
        return new KSerializer[]{r1Var, r1Var, r1Var, f0.B(Picture$$serializer.INSTANCE), f0.B(price$$serializer), f0.B(price$$serializer), l0Var, l0Var, jVarArr[8].getValue()};
    }

    @Override // i90.b
    @NotNull
    public final BasketItem deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = BasketItem.$childSerializers;
        List list = null;
        String strU = null;
        String strU2 = null;
        String strU3 = null;
        Picture picture = null;
        Price price = null;
        Price price2 = null;
        boolean z11 = true;
        int i11 = 0;
        int iQ = 0;
        int iQ2 = 0;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    strU = aVarC.u(serialDescriptor, 0);
                    i11 |= 1;
                    break;
                case 1:
                    strU2 = aVarC.u(serialDescriptor, 1);
                    i11 |= 2;
                    break;
                case 2:
                    strU3 = aVarC.u(serialDescriptor, 2);
                    i11 |= 4;
                    break;
                case 3:
                    picture = (Picture) aVarC.m(serialDescriptor, 3, Picture$$serializer.INSTANCE, picture);
                    i11 |= 8;
                    break;
                case 4:
                    price = (Price) aVarC.m(serialDescriptor, 4, Price$$serializer.INSTANCE, price);
                    i11 |= 16;
                    break;
                case 5:
                    price2 = (Price) aVarC.m(serialDescriptor, 5, Price$$serializer.INSTANCE, price2);
                    i11 |= 32;
                    break;
                case 6:
                    iQ = aVarC.q(serialDescriptor, 6);
                    i11 |= 64;
                    break;
                case 7:
                    iQ2 = aVarC.q(serialDescriptor, 7);
                    i11 |= 128;
                    break;
                case 8:
                    list = (List) aVarC.n(serialDescriptor, 8, (b) jVarArr[8].getValue(), list);
                    i11 |= 256;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new BasketItem(i11, strU, strU2, strU3, picture, price, price2, iQ, iQ2, list, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull BasketItem value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        BasketItem.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
