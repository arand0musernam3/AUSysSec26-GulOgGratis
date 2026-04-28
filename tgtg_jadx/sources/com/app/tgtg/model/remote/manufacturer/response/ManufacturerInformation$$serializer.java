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
import m90.l0;
import m90.m1;
import m90.r1;
import o30.f0;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/manufacturer/response/ManufacturerInformation.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerInformation;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerInformation;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerInformation;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class ManufacturerInformation$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final ManufacturerInformation$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ManufacturerInformation$$serializer manufacturerInformation$$serializer = new ManufacturerInformation$$serializer();
        INSTANCE = manufacturerInformation$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.manufacturer.response.ManufacturerInformation", manufacturerInformation$$serializer, 15);
        e1Var.j("boxWeightGrams", true);
        e1Var.j("box_width_mm", true);
        e1Var.j("box_height_mm", true);
        e1Var.j("box_length_mm", true);
        e1Var.j("estimated_delivery", true);
        e1Var.j("minimum_expiration_date", true);
        e1Var.j("product_count", true);
        e1Var.j("item_surprise_level", true);
        e1Var.j("faq_list", true);
        e1Var.j("items_sold_today", true);
        e1Var.j("brand", true);
        e1Var.j("price_before_discount", true);
        e1Var.j("free_delivery", true);
        e1Var.j("parcel_type", true);
        e1Var.j("bottle_deposit", true);
        descriptor = e1Var;
    }

    private ManufacturerInformation$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = ManufacturerInformation.$childSerializers;
        l0 l0Var = l0.f29821a;
        r1 r1Var = r1.f29848a;
        KSerializer kSerializerB = f0.B(r1Var);
        KSerializer kSerializerB2 = f0.B(r1Var);
        KSerializer kSerializerB3 = f0.B((KSerializer) jVarArr[8].getValue());
        KSerializer kSerializerB4 = f0.B(l0Var);
        KSerializer kSerializerB5 = f0.B(Brand$$serializer.INSTANCE);
        Price$$serializer price$$serializer = Price$$serializer.INSTANCE;
        return new KSerializer[]{l0Var, l0Var, l0Var, l0Var, kSerializerB, kSerializerB2, l0Var, l0Var, kSerializerB3, kSerializerB4, kSerializerB5, f0.B(price$$serializer), g.f29797a, f0.B(r1Var), f0.B(price$$serializer)};
    }

    @Override // i90.b
    @NotNull
    public final ManufacturerInformation deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = ManufacturerInformation.$childSerializers;
        List list = null;
        Integer num = null;
        Brand brand = null;
        Price price = null;
        String str = null;
        Price price2 = null;
        String str2 = null;
        String str3 = null;
        boolean z11 = true;
        int i11 = 0;
        int iQ = 0;
        int iQ2 = 0;
        int iQ3 = 0;
        int iQ4 = 0;
        int iQ5 = 0;
        int iQ6 = 0;
        boolean zT = false;
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
                    iQ3 = aVarC.q(serialDescriptor, 2);
                    i11 |= 4;
                    break;
                case 3:
                    iQ4 = aVarC.q(serialDescriptor, 3);
                    i11 |= 8;
                    break;
                case 4:
                    str2 = (String) aVarC.m(serialDescriptor, 4, r1.f29848a, str2);
                    i11 |= 16;
                    break;
                case 5:
                    str3 = (String) aVarC.m(serialDescriptor, 5, r1.f29848a, str3);
                    i11 |= 32;
                    break;
                case 6:
                    iQ5 = aVarC.q(serialDescriptor, 6);
                    i11 |= 64;
                    break;
                case 7:
                    iQ6 = aVarC.q(serialDescriptor, 7);
                    i11 |= 128;
                    break;
                case 8:
                    list = (List) aVarC.m(serialDescriptor, 8, (b) jVarArr[8].getValue(), list);
                    i11 |= 256;
                    break;
                case 9:
                    num = (Integer) aVarC.m(serialDescriptor, 9, l0.f29821a, num);
                    i11 |= 512;
                    break;
                case 10:
                    brand = (Brand) aVarC.m(serialDescriptor, 10, Brand$$serializer.INSTANCE, brand);
                    i11 |= 1024;
                    break;
                case 11:
                    price = (Price) aVarC.m(serialDescriptor, 11, Price$$serializer.INSTANCE, price);
                    i11 |= NewHope.SENDB_BYTES;
                    break;
                case 12:
                    zT = aVarC.t(serialDescriptor, 12);
                    i11 |= 4096;
                    break;
                case 13:
                    str = (String) aVarC.m(serialDescriptor, 13, r1.f29848a, str);
                    i11 |= 8192;
                    break;
                case 14:
                    price2 = (Price) aVarC.m(serialDescriptor, 14, Price$$serializer.INSTANCE, price2);
                    i11 |= BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        int i12 = iQ4;
        Brand brand2 = brand;
        int i13 = i11;
        int i14 = iQ5;
        Price price3 = price;
        return new ManufacturerInformation(i13, iQ, iQ2, iQ3, i12, str2, str3, i14, iQ6, list, num, brand2, price3, zT, str, price2, (m1) null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ManufacturerInformation value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        ManufacturerInformation.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
