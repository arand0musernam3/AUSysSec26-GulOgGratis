package com.app.tgtg.model.remote.order.request;

import c50.w;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/order/request/OrderRatingRequest.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/order/request/OrderRatingRequest;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/order/request/OrderRatingRequest;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/order/request/OrderRatingRequest;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class OrderRatingRequest$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final OrderRatingRequest$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        OrderRatingRequest$$serializer orderRatingRequest$$serializer = new OrderRatingRequest$$serializer();
        INSTANCE = orderRatingRequest$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.order.request.OrderRatingRequest", orderRatingRequest$$serializer, 11);
        e1Var.j("overall_experience", false);
        e1Var.j("collection_experience", false);
        e1Var.j("food_quality", false);
        e1Var.j("contents_variety", false);
        e1Var.j("food_quantity", false);
        e1Var.j("usp_question", false);
        e1Var.j("has_bought_more_on_pickup", false);
        e1Var.j("has_shopped_in_store_before", false);
        e1Var.j("has_visited_store_because_of_bag", false);
        e1Var.j("bag_contents_description", false);
        e1Var.j("extra_purchase_amount", false);
        descriptor = e1Var;
    }

    private OrderRatingRequest$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        g gVar = g.f29797a;
        KSerializer kSerializerB = f0.B(gVar);
        KSerializer kSerializerB2 = f0.B(gVar);
        KSerializer kSerializerB3 = f0.B(gVar);
        r1 r1Var = r1.f29848a;
        KSerializer kSerializerB4 = f0.B(r1Var);
        KSerializer kSerializerB5 = f0.B(r1Var);
        RatingCategory$$serializer ratingCategory$$serializer = RatingCategory$$serializer.INSTANCE;
        return new KSerializer[]{ratingCategory$$serializer, ratingCategory$$serializer, ratingCategory$$serializer, ratingCategory$$serializer, ratingCategory$$serializer, ratingCategory$$serializer, kSerializerB, kSerializerB2, kSerializerB3, kSerializerB4, kSerializerB5};
    }

    @Override // i90.b
    @NotNull
    public final OrderRatingRequest deserialize(@NotNull Decoder decoder) {
        boolean z11;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        String str = null;
        String str2 = null;
        RatingCategory ratingCategory = null;
        RatingCategory ratingCategory2 = null;
        RatingCategory ratingCategory3 = null;
        RatingCategory ratingCategory4 = null;
        RatingCategory ratingCategory5 = null;
        RatingCategory ratingCategory6 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        int i11 = 0;
        boolean z12 = true;
        while (z12) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z12 = false;
                    continue;
                case 0:
                    z11 = z12;
                    ratingCategory = (RatingCategory) aVarC.n(serialDescriptor, 0, RatingCategory$$serializer.INSTANCE, ratingCategory);
                    i11 |= 1;
                    break;
                case 1:
                    z11 = z12;
                    ratingCategory2 = (RatingCategory) aVarC.n(serialDescriptor, 1, RatingCategory$$serializer.INSTANCE, ratingCategory2);
                    i11 |= 2;
                    break;
                case 2:
                    z11 = z12;
                    ratingCategory3 = (RatingCategory) aVarC.n(serialDescriptor, 2, RatingCategory$$serializer.INSTANCE, ratingCategory3);
                    i11 |= 4;
                    break;
                case 3:
                    z11 = z12;
                    ratingCategory4 = (RatingCategory) aVarC.n(serialDescriptor, 3, RatingCategory$$serializer.INSTANCE, ratingCategory4);
                    i11 |= 8;
                    break;
                case 4:
                    z11 = z12;
                    ratingCategory5 = (RatingCategory) aVarC.n(serialDescriptor, 4, RatingCategory$$serializer.INSTANCE, ratingCategory5);
                    i11 |= 16;
                    break;
                case 5:
                    z11 = z12;
                    ratingCategory6 = (RatingCategory) aVarC.n(serialDescriptor, 5, RatingCategory$$serializer.INSTANCE, ratingCategory6);
                    i11 |= 32;
                    break;
                case 6:
                    z11 = z12;
                    bool = (Boolean) aVarC.m(serialDescriptor, 6, g.f29797a, bool);
                    i11 |= 64;
                    break;
                case 7:
                    z11 = z12;
                    bool2 = (Boolean) aVarC.m(serialDescriptor, 7, g.f29797a, bool2);
                    i11 |= 128;
                    break;
                case 8:
                    z11 = z12;
                    bool3 = (Boolean) aVarC.m(serialDescriptor, 8, g.f29797a, bool3);
                    i11 |= 256;
                    break;
                case 9:
                    z11 = z12;
                    str = (String) aVarC.m(serialDescriptor, 9, r1.f29848a, str);
                    i11 |= 512;
                    break;
                case 10:
                    z11 = z12;
                    str2 = (String) aVarC.m(serialDescriptor, 10, r1.f29848a, str2);
                    i11 |= 1024;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
            z12 = z11;
        }
        aVarC.b(serialDescriptor);
        return new OrderRatingRequest(i11, ratingCategory, ratingCategory2, ratingCategory3, ratingCategory4, ratingCategory5, ratingCategory6, bool, bool2, bool3, str, str2, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull OrderRatingRequest value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b bVarC = encoder.c(serialDescriptor);
        OrderRatingRequest.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
