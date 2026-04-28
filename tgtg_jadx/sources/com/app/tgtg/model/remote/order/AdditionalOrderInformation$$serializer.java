package com.app.tgtg.model.remote.order;

import c50.w;
import com.app.tgtg.model.remote.item.DeliveryMethod;
import com.app.tgtg.model.remote.item.DeliveryMethodSerializer;
import com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionMethod;
import com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionMethodSerializer;
import com.app.tgtg.model.remote.user.requests.UserAddress;
import com.app.tgtg.model.remote.user.requests.UserAddress$$serializer;
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
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/order/AdditionalOrderInformation.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/order/AdditionalOrderInformation;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/order/AdditionalOrderInformation;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/order/AdditionalOrderInformation;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class AdditionalOrderInformation$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final AdditionalOrderInformation$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        AdditionalOrderInformation$$serializer additionalOrderInformation$$serializer = new AdditionalOrderInformation$$serializer();
        INSTANCE = additionalOrderInformation$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.order.AdditionalOrderInformation", additionalOrderInformation$$serializer, 14);
        e1Var.j("charity_item_description", true);
        e1Var.j("manifest_url", true);
        e1Var.j("redeeming_user_name", true);
        e1Var.j("pickup_document_has_been_generated", true);
        e1Var.j("redeemed_at", true);
        e1Var.j("shipping_address", true);
        e1Var.j("track_and_trace_urls", true);
        e1Var.j("estimated_delivery", true);
        e1Var.j("delivery_method", false);
        e1Var.j("has_products", true);
        e1Var.j("order_delivery_method", false);
        e1Var.j("delivery_option_title", false);
        e1Var.j("delivery_option_address", false);
        e1Var.j("expected_delivery_utc", false);
        descriptor = e1Var;
    }

    private AdditionalOrderInformation$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = AdditionalOrderInformation.$childSerializers;
        r1 r1Var = r1.f29848a;
        KSerializer kSerializerB = f0.B(r1Var);
        KSerializer kSerializerB2 = f0.B(r1Var);
        KSerializer kSerializerB3 = f0.B(r1Var);
        g gVar = g.f29797a;
        return new KSerializer[]{kSerializerB, kSerializerB2, kSerializerB3, f0.B(gVar), f0.B(r1Var), f0.B(UserAddress$$serializer.INSTANCE), f0.B((KSerializer) jVarArr[6].getValue()), f0.B(r1Var), f0.B(DeliveryMethodSerializer.INSTANCE), gVar, f0.B(DeliveryOptionMethodSerializer.INSTANCE), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var)};
    }

    @Override // i90.b
    @NotNull
    public final AdditionalOrderInformation deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = AdditionalOrderInformation.$childSerializers;
        DeliveryMethod deliveryMethod = null;
        String str5 = null;
        String str6 = null;
        DeliveryOptionMethod deliveryOptionMethod = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Boolean bool = null;
        String str11 = null;
        UserAddress userAddress = null;
        List list = null;
        String str12 = null;
        int i11 = 0;
        boolean z11 = true;
        boolean zT = false;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    str3 = str5;
                    z11 = false;
                    i11 = i11;
                    str5 = str3;
                    break;
                case 0:
                    str3 = str5;
                    str8 = (String) aVarC.m(serialDescriptor, 0, r1.f29848a, str8);
                    i11 |= 1;
                    str5 = str3;
                    break;
                case 1:
                    str4 = str8;
                    str9 = (String) aVarC.m(serialDescriptor, 1, r1.f29848a, str9);
                    i11 |= 2;
                    str8 = str4;
                    break;
                case 2:
                    str = str8;
                    str2 = str9;
                    str10 = (String) aVarC.m(serialDescriptor, 2, r1.f29848a, str10);
                    i11 |= 4;
                    str8 = str;
                    str9 = str2;
                    break;
                case 3:
                    str = str8;
                    str2 = str9;
                    bool = (Boolean) aVarC.m(serialDescriptor, 3, g.f29797a, bool);
                    i11 |= 8;
                    str8 = str;
                    str9 = str2;
                    break;
                case 4:
                    str = str8;
                    str2 = str9;
                    str11 = (String) aVarC.m(serialDescriptor, 4, r1.f29848a, str11);
                    i11 |= 16;
                    str8 = str;
                    str9 = str2;
                    break;
                case 5:
                    str = str8;
                    str2 = str9;
                    userAddress = (UserAddress) aVarC.m(serialDescriptor, 5, UserAddress$$serializer.INSTANCE, userAddress);
                    i11 |= 32;
                    str8 = str;
                    str9 = str2;
                    break;
                case 6:
                    str = str8;
                    str2 = str9;
                    list = (List) aVarC.m(serialDescriptor, 6, (b) jVarArr[6].getValue(), list);
                    i11 |= 64;
                    str8 = str;
                    str9 = str2;
                    break;
                case 7:
                    str = str8;
                    str2 = str9;
                    str12 = (String) aVarC.m(serialDescriptor, 7, r1.f29848a, str12);
                    i11 |= 128;
                    str8 = str;
                    str9 = str2;
                    break;
                case 8:
                    str = str8;
                    str2 = str9;
                    deliveryMethod = (DeliveryMethod) aVarC.m(serialDescriptor, 8, DeliveryMethodSerializer.INSTANCE, deliveryMethod);
                    i11 |= 256;
                    str8 = str;
                    str9 = str2;
                    break;
                case 9:
                    str4 = str8;
                    zT = aVarC.t(serialDescriptor, 9);
                    i11 |= 512;
                    str8 = str4;
                    break;
                case 10:
                    str = str8;
                    str2 = str9;
                    deliveryOptionMethod = (DeliveryOptionMethod) aVarC.m(serialDescriptor, 10, DeliveryOptionMethodSerializer.INSTANCE, deliveryOptionMethod);
                    i11 |= 1024;
                    str8 = str;
                    str9 = str2;
                    break;
                case 11:
                    str = str8;
                    str2 = str9;
                    str7 = (String) aVarC.m(serialDescriptor, 11, r1.f29848a, str7);
                    i11 |= NewHope.SENDB_BYTES;
                    str8 = str;
                    str9 = str2;
                    break;
                case 12:
                    str = str8;
                    str2 = str9;
                    str6 = (String) aVarC.m(serialDescriptor, 12, r1.f29848a, str6);
                    i11 |= 4096;
                    str8 = str;
                    str9 = str2;
                    break;
                case 13:
                    str = str8;
                    str2 = str9;
                    str5 = (String) aVarC.m(serialDescriptor, 13, r1.f29848a, str5);
                    i11 |= 8192;
                    str8 = str;
                    str9 = str2;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new AdditionalOrderInformation(i11, str8, str9, str10, bool, str11, userAddress, list, str12, deliveryMethod, zT, deliveryOptionMethod, str7, str6, str5, (m1) null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull AdditionalOrderInformation value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        AdditionalOrderInformation.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
