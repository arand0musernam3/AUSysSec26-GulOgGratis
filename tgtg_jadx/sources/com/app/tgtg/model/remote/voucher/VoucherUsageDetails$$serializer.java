package com.app.tgtg.model.remote.voucher;

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
import m90.l0;
import m90.m1;
import m90.r1;
import o30.f0;
import org.jetbrains.annotations.NotNull;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/voucher/VoucherUsageDetails.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/voucher/VoucherUsageDetails;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/voucher/VoucherUsageDetails;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/voucher/VoucherUsageDetails;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class VoucherUsageDetails$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final VoucherUsageDetails$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        VoucherUsageDetails$$serializer voucherUsageDetails$$serializer = new VoucherUsageDetails$$serializer();
        INSTANCE = voucherUsageDetails$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.voucher.VoucherUsageDetails", voucherUsageDetails$$serializer, 6);
        e1Var.j("store_name", false);
        e1Var.j("type", true);
        e1Var.j("created_at_utc", false);
        e1Var.j("num_of_items", true);
        e1Var.j("store_logo_url", false);
        e1Var.j("amount", false);
        descriptor = e1Var;
    }

    private VoucherUsageDetails$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{r1Var, UsageDetailsTypeSerializer.INSTANCE, r1Var, l0.f29821a, f0.B(r1Var), f0.B(Price$$serializer.INSTANCE)};
    }

    @Override // i90.b
    @NotNull
    public final VoucherUsageDetails deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        int i11 = 0;
        int iQ = 0;
        String strU = null;
        UsageDetailsType usageDetailsType = null;
        String strU2 = null;
        String str = null;
        Price price = null;
        boolean z11 = true;
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
                    usageDetailsType = (UsageDetailsType) aVarC.n(serialDescriptor, 1, UsageDetailsTypeSerializer.INSTANCE, usageDetailsType);
                    i11 |= 2;
                    break;
                case 2:
                    strU2 = aVarC.u(serialDescriptor, 2);
                    i11 |= 4;
                    break;
                case 3:
                    iQ = aVarC.q(serialDescriptor, 3);
                    i11 |= 8;
                    break;
                case 4:
                    str = (String) aVarC.m(serialDescriptor, 4, r1.f29848a, str);
                    i11 |= 16;
                    break;
                case 5:
                    price = (Price) aVarC.m(serialDescriptor, 5, Price$$serializer.INSTANCE, price);
                    i11 |= 32;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new VoucherUsageDetails(i11, strU, usageDetailsType, strU2, iQ, str, price, (m1) null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull VoucherUsageDetails value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b bVarC = encoder.c(serialDescriptor);
        VoucherUsageDetails.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
