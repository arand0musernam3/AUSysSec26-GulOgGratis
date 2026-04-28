package com.app.tgtg.model.remote.payment;

import c50.w;
import com.adyen.checkout.core.Environment;
import com.app.tgtg.model.remote.order.response.PaymentProvider;
import com.app.tgtg.model.remote.order.response.PaymentProviderSerializer;
import com.app.tgtg.model.remote.order.response.ProviderType;
import com.app.tgtg.model.remote.order.response.ProviderTypeSerializer;
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
import m90.m1;
import m90.r1;
import o30.f0;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/payment/PaymentMethods.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/payment/PaymentMethods;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/payment/PaymentMethods;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/payment/PaymentMethods;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class PaymentMethods$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final PaymentMethods$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        PaymentMethods$$serializer paymentMethods$$serializer = new PaymentMethods$$serializer();
        INSTANCE = paymentMethods$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.payment.PaymentMethods", paymentMethods$$serializer, 15);
        e1Var.j("type", true);
        e1Var.j("payment_provider", true);
        e1Var.j("payment_type", true);
        e1Var.j("recurring_info", true);
        e1Var.j("images", true);
        e1Var.j("identifier", true);
        e1Var.j("display_value", true);
        e1Var.j("has_vouchers_enabled", true);
        e1Var.j("adyen_api_payload", true);
        e1Var.j("save_payment_method", true);
        e1Var.j("status", true);
        e1Var.j("show_zip_code", true);
        e1Var.j("preferred", true);
        e1Var.j("live_url_prefix", true);
        e1Var.j("available_amount", false);
        descriptor = e1Var;
    }

    private PaymentMethods$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerB = f0.B(ProviderTypeSerializer.INSTANCE);
        KSerializer kSerializerB2 = f0.B(PaymentProviderSerializer.INSTANCE);
        KSerializer kSerializerB3 = f0.B(PaymentTypeSerializer.INSTANCE);
        KSerializer kSerializerB4 = f0.B(RecurringPaymentInformation$$serializer.INSTANCE);
        KSerializer kSerializerB5 = f0.B(PaymentIcons$$serializer.INSTANCE);
        r1 r1Var = r1.f29848a;
        KSerializer kSerializerB6 = f0.B(r1Var);
        KSerializer kSerializerB7 = f0.B(r1Var);
        KSerializer kSerializerB8 = f0.B(r1Var);
        KSerializer kSerializerB9 = f0.B(Price$$serializer.INSTANCE);
        g gVar = g.f29797a;
        return new KSerializer[]{kSerializerB, kSerializerB2, kSerializerB3, kSerializerB4, kSerializerB5, kSerializerB6, kSerializerB7, gVar, kSerializerB8, gVar, CardStatusSerializer.INSTANCE, gVar, gVar, AdyenEnvironmentStringSerializer.INSTANCE, kSerializerB9};
    }

    @Override // i90.b
    @NotNull
    public final PaymentMethods deserialize(@NotNull Decoder decoder) {
        boolean z11;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        CardStatus cardStatus = null;
        Environment environment = null;
        Price price = null;
        ProviderType providerType = null;
        PaymentProvider paymentProvider = null;
        PaymentType paymentType = null;
        RecurringPaymentInformation recurringPaymentInformation = null;
        PaymentIcons paymentIcons = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i11 = 0;
        boolean z12 = true;
        boolean zT = false;
        boolean zT2 = false;
        boolean zT3 = false;
        boolean zT4 = false;
        while (z12) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z12 = false;
                    continue;
                case 0:
                    z11 = z12;
                    providerType = (ProviderType) aVarC.m(serialDescriptor, 0, ProviderTypeSerializer.INSTANCE, providerType);
                    i11 |= 1;
                    break;
                case 1:
                    z11 = z12;
                    paymentProvider = (PaymentProvider) aVarC.m(serialDescriptor, 1, PaymentProviderSerializer.INSTANCE, paymentProvider);
                    i11 |= 2;
                    break;
                case 2:
                    z11 = z12;
                    paymentType = (PaymentType) aVarC.m(serialDescriptor, 2, PaymentTypeSerializer.INSTANCE, paymentType);
                    i11 |= 4;
                    break;
                case 3:
                    z11 = z12;
                    recurringPaymentInformation = (RecurringPaymentInformation) aVarC.m(serialDescriptor, 3, RecurringPaymentInformation$$serializer.INSTANCE, recurringPaymentInformation);
                    i11 |= 8;
                    break;
                case 4:
                    z11 = z12;
                    paymentIcons = (PaymentIcons) aVarC.m(serialDescriptor, 4, PaymentIcons$$serializer.INSTANCE, paymentIcons);
                    i11 |= 16;
                    break;
                case 5:
                    z11 = z12;
                    str = (String) aVarC.m(serialDescriptor, 5, r1.f29848a, str);
                    i11 |= 32;
                    break;
                case 6:
                    z11 = z12;
                    str2 = (String) aVarC.m(serialDescriptor, 6, r1.f29848a, str2);
                    i11 |= 64;
                    break;
                case 7:
                    zT = aVarC.t(serialDescriptor, 7);
                    i11 |= 128;
                    continue;
                case 8:
                    z11 = z12;
                    str3 = (String) aVarC.m(serialDescriptor, 8, r1.f29848a, str3);
                    i11 |= 256;
                    break;
                case 9:
                    zT2 = aVarC.t(serialDescriptor, 9);
                    i11 |= 512;
                    continue;
                case 10:
                    z11 = z12;
                    cardStatus = (CardStatus) aVarC.n(serialDescriptor, 10, CardStatusSerializer.INSTANCE, cardStatus);
                    i11 |= 1024;
                    break;
                case 11:
                    zT3 = aVarC.t(serialDescriptor, 11);
                    i11 |= NewHope.SENDB_BYTES;
                    continue;
                case 12:
                    zT4 = aVarC.t(serialDescriptor, 12);
                    i11 |= 4096;
                    continue;
                case 13:
                    z11 = z12;
                    environment = (Environment) aVarC.n(serialDescriptor, 13, AdyenEnvironmentStringSerializer.INSTANCE, environment);
                    i11 |= 8192;
                    break;
                case 14:
                    z11 = z12;
                    price = (Price) aVarC.m(serialDescriptor, 14, Price$$serializer.INSTANCE, price);
                    i11 |= BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
            z12 = z11;
        }
        aVarC.b(serialDescriptor);
        return new PaymentMethods(i11, providerType, paymentProvider, paymentType, recurringPaymentInformation, paymentIcons, str, str2, zT, str3, zT2, cardStatus, zT3, zT4, environment, price, (m1) null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull PaymentMethods value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b bVarC = encoder.c(serialDescriptor);
        PaymentMethods.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
