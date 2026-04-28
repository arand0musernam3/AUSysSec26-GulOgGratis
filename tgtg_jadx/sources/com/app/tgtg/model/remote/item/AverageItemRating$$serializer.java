package com.app.tgtg.model.remote.item;

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
import m90.l0;
import m90.v;
import o30.f0;
import org.jetbrains.annotations.NotNull;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/item/AverageItemRating.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/item/AverageItemRating;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/item/AverageItemRating;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/item/AverageItemRating;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class AverageItemRating$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final AverageItemRating$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        AverageItemRating$$serializer averageItemRating$$serializer = new AverageItemRating$$serializer();
        INSTANCE = averageItemRating$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.item.AverageItemRating", averageItemRating$$serializer, 7);
        e1Var.j("month_count", false);
        e1Var.j("rating_count", false);
        e1Var.j("average_overall_rating", false);
        e1Var.j("average_collection_experience_rating", false);
        e1Var.j("average_food_quality_rating", false);
        e1Var.j("average_contents_variety_rating", false);
        e1Var.j("average_food_quantity_rating", false);
        descriptor = e1Var;
    }

    private AverageItemRating$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        v vVar = v.f29868a;
        KSerializer kSerializerB = f0.B(vVar);
        KSerializer kSerializerB2 = f0.B(vVar);
        KSerializer kSerializerB3 = f0.B(vVar);
        KSerializer kSerializerB4 = f0.B(vVar);
        l0 l0Var = l0.f29821a;
        return new KSerializer[]{l0Var, l0Var, vVar, kSerializerB, kSerializerB2, kSerializerB3, kSerializerB4};
    }

    @Override // i90.b
    @NotNull
    public final AverageItemRating deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        Double d3 = null;
        int i11 = 0;
        int iQ = 0;
        int iQ2 = 0;
        double dY = 0.0d;
        Double d11 = null;
        Double d12 = null;
        Double d13 = null;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    iQ = aVarC.q(serialDescriptor, 0);
                    i11 |= 1;
                    break;
                case 1:
                    iQ2 = aVarC.q(serialDescriptor, 1);
                    i11 |= 2;
                    break;
                case 2:
                    dY = aVarC.y(serialDescriptor, 2);
                    i11 |= 4;
                    break;
                case 3:
                    d11 = (Double) aVarC.m(serialDescriptor, 3, v.f29868a, d11);
                    i11 |= 8;
                    break;
                case 4:
                    d12 = (Double) aVarC.m(serialDescriptor, 4, v.f29868a, d12);
                    i11 |= 16;
                    break;
                case 5:
                    d13 = (Double) aVarC.m(serialDescriptor, 5, v.f29868a, d13);
                    i11 |= 32;
                    break;
                case 6:
                    d3 = (Double) aVarC.m(serialDescriptor, 6, v.f29868a, d3);
                    i11 |= 64;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new AverageItemRating(i11, iQ, iQ2, dY, d11, d12, d13, d3, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull AverageItemRating value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b bVarC = encoder.c(serialDescriptor);
        AverageItemRating.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
