package com.app.tgtg.model.remote.manufacturer.response;

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
import m90.g;
import m90.l0;
import m90.m1;
import m90.r1;
import o30.f0;
import org.jetbrains.annotations.NotNull;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/manufacturer/response/ManufacturerItemProperties.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerItemProperties;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerItemProperties;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerItemProperties;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class ManufacturerItemProperties$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final ManufacturerItemProperties$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ManufacturerItemProperties$$serializer manufacturerItemProperties$$serializer = new ManufacturerItemProperties$$serializer();
        INSTANCE = manufacturerItemProperties$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.manufacturer.response.ManufacturerItemProperties", manufacturerItemProperties$$serializer, 10);
        e1Var.j("box_weight_grams", true);
        e1Var.j("box_width_mm", true);
        e1Var.j("box_height_mm", true);
        e1Var.j("box_length_mm", true);
        e1Var.j("estimated_delivery", true);
        e1Var.j("minimum_expiration_date", true);
        e1Var.j("brand", true);
        e1Var.j("is_discounted", true);
        e1Var.j("bottle_deposit", true);
        e1Var.j("free_delivery", true);
        descriptor = e1Var;
    }

    private ManufacturerItemProperties$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        l0 l0Var = l0.f29821a;
        KSerializer kSerializerB = f0.B(l0Var);
        KSerializer kSerializerB2 = f0.B(l0Var);
        KSerializer kSerializerB3 = f0.B(l0Var);
        KSerializer kSerializerB4 = f0.B(l0Var);
        r1 r1Var = r1.f29848a;
        KSerializer kSerializerB5 = f0.B(r1Var);
        KSerializer kSerializerB6 = f0.B(r1Var);
        KSerializer kSerializerB7 = f0.B(Brand$$serializer.INSTANCE);
        g gVar = g.f29797a;
        return new KSerializer[]{kSerializerB, kSerializerB2, kSerializerB3, kSerializerB4, kSerializerB5, kSerializerB6, kSerializerB7, f0.B(gVar), f0.B(Price$$serializer.INSTANCE), f0.B(gVar)};
    }

    @Override // i90.b
    @NotNull
    public final ManufacturerItemProperties deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        Boolean bool = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        String str = null;
        String str2 = null;
        Brand brand = null;
        Boolean bool2 = null;
        Price price = null;
        boolean z11 = true;
        int i11 = 0;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    num = (Integer) aVarC.m(serialDescriptor, 0, l0.f29821a, num);
                    i11 |= 1;
                    break;
                case 1:
                    num2 = (Integer) aVarC.m(serialDescriptor, 1, l0.f29821a, num2);
                    i11 |= 2;
                    break;
                case 2:
                    num3 = (Integer) aVarC.m(serialDescriptor, 2, l0.f29821a, num3);
                    i11 |= 4;
                    break;
                case 3:
                    num4 = (Integer) aVarC.m(serialDescriptor, 3, l0.f29821a, num4);
                    i11 |= 8;
                    break;
                case 4:
                    str = (String) aVarC.m(serialDescriptor, 4, r1.f29848a, str);
                    i11 |= 16;
                    break;
                case 5:
                    str2 = (String) aVarC.m(serialDescriptor, 5, r1.f29848a, str2);
                    i11 |= 32;
                    break;
                case 6:
                    brand = (Brand) aVarC.m(serialDescriptor, 6, Brand$$serializer.INSTANCE, brand);
                    i11 |= 64;
                    break;
                case 7:
                    bool2 = (Boolean) aVarC.m(serialDescriptor, 7, g.f29797a, bool2);
                    i11 |= 128;
                    break;
                case 8:
                    price = (Price) aVarC.m(serialDescriptor, 8, Price$$serializer.INSTANCE, price);
                    i11 |= 256;
                    break;
                case 9:
                    bool = (Boolean) aVarC.m(serialDescriptor, 9, g.f29797a, bool);
                    i11 |= 512;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new ManufacturerItemProperties(i11, num, num2, num3, num4, str, str2, brand, bool2, price, bool, (m1) null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ManufacturerItemProperties value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b bVarC = encoder.c(serialDescriptor);
        ManufacturerItemProperties.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
