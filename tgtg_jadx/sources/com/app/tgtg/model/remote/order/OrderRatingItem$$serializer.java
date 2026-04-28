package com.app.tgtg.model.remote.order;

import c50.w;
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
import m90.m1;
import m90.r1;
import o30.f0;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/order/OrderRatingItem.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/order/OrderRatingItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/order/OrderRatingItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/order/OrderRatingItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class OrderRatingItem$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final OrderRatingItem$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        OrderRatingItem$$serializer orderRatingItem$$serializer = new OrderRatingItem$$serializer();
        INSTANCE = orderRatingItem$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.order.OrderRatingItem", orderRatingItem$$serializer, 10);
        e1Var.j("overall", false);
        e1Var.j("bag_content", false);
        e1Var.j("service", false);
        e1Var.j("positive_feedback", true);
        e1Var.j("bag_contents_description", true);
        e1Var.j("nps_rating", true);
        e1Var.j("has_shopped_in_store_before", true);
        e1Var.j("has_bought_more_on_pickup", true);
        e1Var.j("extra_purchase_amount", true);
        e1Var.j("has_visited_store_because_of_bag", true);
        descriptor = e1Var;
    }

    private OrderRatingItem$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerB = f0.B((KSerializer) OrderRatingItem.$childSerializers[3].getValue());
        r1 r1Var = r1.f29848a;
        KSerializer kSerializerB2 = f0.B(r1Var);
        KSerializer kSerializerB3 = f0.B(NpsRating$$serializer.INSTANCE);
        g gVar = g.f29797a;
        KSerializer kSerializerB4 = f0.B(gVar);
        KSerializer kSerializerB5 = f0.B(gVar);
        KSerializer kSerializerB6 = f0.B(r1Var);
        KSerializer kSerializerB7 = f0.B(gVar);
        Rating$$serializer rating$$serializer = Rating$$serializer.INSTANCE;
        return new KSerializer[]{rating$$serializer, rating$$serializer, rating$$serializer, kSerializerB, kSerializerB2, kSerializerB3, kSerializerB4, kSerializerB5, kSerializerB6, kSerializerB7};
    }

    @Override // i90.b
    @NotNull
    public final OrderRatingItem deserialize(@NotNull Decoder decoder) {
        j[] jVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr2 = OrderRatingItem.$childSerializers;
        String str = null;
        Boolean bool = null;
        Rating rating = null;
        Rating rating2 = null;
        Rating rating3 = null;
        List list = null;
        String str2 = null;
        NpsRating npsRating = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        int i11 = 0;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    continue;
                case 0:
                    jVarArr = jVarArr2;
                    rating = (Rating) aVarC.n(serialDescriptor, 0, Rating$$serializer.INSTANCE, rating);
                    i11 |= 1;
                    break;
                case 1:
                    jVarArr = jVarArr2;
                    rating2 = (Rating) aVarC.n(serialDescriptor, 1, Rating$$serializer.INSTANCE, rating2);
                    i11 |= 2;
                    break;
                case 2:
                    jVarArr = jVarArr2;
                    rating3 = (Rating) aVarC.n(serialDescriptor, 2, Rating$$serializer.INSTANCE, rating3);
                    i11 |= 4;
                    break;
                case 3:
                    jVarArr = jVarArr2;
                    list = (List) aVarC.m(serialDescriptor, 3, (b) jVarArr[3].getValue(), list);
                    i11 |= 8;
                    break;
                case 4:
                    jVarArr = jVarArr2;
                    str2 = (String) aVarC.m(serialDescriptor, 4, r1.f29848a, str2);
                    i11 |= 16;
                    break;
                case 5:
                    jVarArr = jVarArr2;
                    npsRating = (NpsRating) aVarC.m(serialDescriptor, 5, NpsRating$$serializer.INSTANCE, npsRating);
                    i11 |= 32;
                    break;
                case 6:
                    jVarArr = jVarArr2;
                    bool2 = (Boolean) aVarC.m(serialDescriptor, 6, g.f29797a, bool2);
                    i11 |= 64;
                    break;
                case 7:
                    jVarArr = jVarArr2;
                    bool3 = (Boolean) aVarC.m(serialDescriptor, 7, g.f29797a, bool3);
                    i11 |= 128;
                    break;
                case 8:
                    jVarArr = jVarArr2;
                    str = (String) aVarC.m(serialDescriptor, 8, r1.f29848a, str);
                    i11 |= 256;
                    break;
                case 9:
                    jVarArr = jVarArr2;
                    bool = (Boolean) aVarC.m(serialDescriptor, 9, g.f29797a, bool);
                    i11 |= 512;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
            jVarArr2 = jVarArr;
        }
        aVarC.b(serialDescriptor);
        return new OrderRatingItem(i11, rating, rating2, rating3, list, str2, npsRating, bool2, bool3, str, bool, (m1) null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull OrderRatingItem value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        OrderRatingItem.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
