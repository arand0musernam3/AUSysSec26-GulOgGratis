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
import m90.r1;
import m90.v;
import o30.f0;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/manufacturer/response/DeliveryOption.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOption;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOption;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOption;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class DeliveryOption$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final DeliveryOption$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        DeliveryOption$$serializer deliveryOption$$serializer = new DeliveryOption$$serializer();
        INSTANCE = deliveryOption$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.manufacturer.response.DeliveryOption", deliveryOption$$serializer, 10);
        e1Var.j("delivery_method", false);
        e1Var.j("delivery_option_id", false);
        e1Var.j(MessageBundle.TITLE_ENTRY, false);
        e1Var.j("carrier_icon", false);
        e1Var.j("price", false);
        e1Var.j("expected_delivery_time", false);
        e1Var.j("cutoff_time", false);
        e1Var.j("distance", false);
        e1Var.j("address", false);
        e1Var.j("opening_hour_periods", false);
        descriptor = e1Var;
    }

    private DeliveryOption$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = DeliveryOption.$childSerializers;
        KSerializer kSerializerB = f0.B(DeliveryOptionMethodSerializer.INSTANCE);
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{kSerializerB, f0.B(r1Var), f0.B(r1Var), f0.B(Picture$$serializer.INSTANCE), f0.B(Price$$serializer.INSTANCE), f0.B(r1Var), f0.B(r1Var), f0.B(v.f29868a), f0.B(r1Var), f0.B((KSerializer) jVarArr[9].getValue())};
    }

    @Override // i90.b
    @NotNull
    public final DeliveryOption deserialize(@NotNull Decoder decoder) {
        j[] jVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr2 = DeliveryOption.$childSerializers;
        String str = null;
        List list = null;
        DeliveryOptionMethod deliveryOptionMethod = null;
        String str2 = null;
        String str3 = null;
        Picture picture = null;
        Price price = null;
        String str4 = null;
        String str5 = null;
        Double d3 = null;
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
                    deliveryOptionMethod = (DeliveryOptionMethod) aVarC.m(serialDescriptor, 0, DeliveryOptionMethodSerializer.INSTANCE, deliveryOptionMethod);
                    i11 |= 1;
                    break;
                case 1:
                    jVarArr = jVarArr2;
                    str2 = (String) aVarC.m(serialDescriptor, 1, r1.f29848a, str2);
                    i11 |= 2;
                    break;
                case 2:
                    jVarArr = jVarArr2;
                    str3 = (String) aVarC.m(serialDescriptor, 2, r1.f29848a, str3);
                    i11 |= 4;
                    break;
                case 3:
                    jVarArr = jVarArr2;
                    picture = (Picture) aVarC.m(serialDescriptor, 3, Picture$$serializer.INSTANCE, picture);
                    i11 |= 8;
                    break;
                case 4:
                    jVarArr = jVarArr2;
                    price = (Price) aVarC.m(serialDescriptor, 4, Price$$serializer.INSTANCE, price);
                    i11 |= 16;
                    break;
                case 5:
                    jVarArr = jVarArr2;
                    str4 = (String) aVarC.m(serialDescriptor, 5, r1.f29848a, str4);
                    i11 |= 32;
                    break;
                case 6:
                    jVarArr = jVarArr2;
                    str5 = (String) aVarC.m(serialDescriptor, 6, r1.f29848a, str5);
                    i11 |= 64;
                    break;
                case 7:
                    jVarArr = jVarArr2;
                    d3 = (Double) aVarC.m(serialDescriptor, 7, v.f29868a, d3);
                    i11 |= 128;
                    break;
                case 8:
                    jVarArr = jVarArr2;
                    str = (String) aVarC.m(serialDescriptor, 8, r1.f29848a, str);
                    i11 |= 256;
                    break;
                case 9:
                    jVarArr = jVarArr2;
                    list = (List) aVarC.m(serialDescriptor, 9, (b) jVarArr2[9].getValue(), list);
                    i11 |= 512;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
            jVarArr2 = jVarArr;
        }
        aVarC.b(serialDescriptor);
        return new DeliveryOption(i11, deliveryOptionMethod, str2, str3, picture, price, str4, str5, d3, str, list, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull DeliveryOption value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        DeliveryOption.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
