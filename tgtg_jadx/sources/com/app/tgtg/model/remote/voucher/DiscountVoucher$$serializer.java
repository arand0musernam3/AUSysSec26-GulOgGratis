package com.app.tgtg.model.remote.voucher;

import c50.w;
import com.app.tgtg.model.remote.VoucherId;
import com.app.tgtg.model.remote.VoucherId$$serializer;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
import com.app.tgtg.model.remote.voucher.response.VoucherFilterResponse;
import com.app.tgtg.model.remote.voucher.response.VoucherFilterResponse$$serializer;
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
import m90.v;
import o30.f0;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/voucher/DiscountVoucher.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/voucher/DiscountVoucher;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/voucher/DiscountVoucher;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/voucher/DiscountVoucher;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class DiscountVoucher$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final DiscountVoucher$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        DiscountVoucher$$serializer discountVoucher$$serializer = new DiscountVoucher$$serializer();
        INSTANCE = discountVoucher$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.voucher.DiscountVoucher", discountVoucher$$serializer, 21);
        e1Var.j("id", false);
        e1Var.j("number_of_initial_orders", false);
        e1Var.j("number_of_orders_used", false);
        e1Var.j("name", false);
        e1Var.j("description", false);
        e1Var.j("terms_url", false);
        e1Var.j("state", false);
        e1Var.j("valid_from", false);
        e1Var.j("valid_to", false);
        e1Var.j("discount_percentage", false);
        e1Var.j("discount_amount", false);
        e1Var.j("max_discount_amount", false);
        e1Var.j("max_order_amount", false);
        e1Var.j("country_id", false);
        e1Var.j("store_filter_type", false);
        e1Var.j("currency", false);
        e1Var.j("orders", true);
        e1Var.j("filter_type", true);
        e1Var.j("filter_list", true);
        e1Var.j("applicable_item_types", true);
        e1Var.j("eligible_platforms", true);
        e1Var.k(new CountryBasedVoucher$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("version"));
        descriptor = e1Var;
    }

    private DiscountVoucher$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = DiscountVoucher.$childSerializers;
        l0 l0Var = l0.f29821a;
        r1 r1Var = r1.f29848a;
        Price$$serializer price$$serializer = Price$$serializer.INSTANCE;
        VoucherFilterTypeSerializer voucherFilterTypeSerializer = VoucherFilterTypeSerializer.INSTANCE;
        return new KSerializer[]{VoucherId$$serializer.INSTANCE, l0Var, l0Var, r1Var, r1Var, r1Var, VoucherStateSerializer.INSTANCE, r1Var, r1Var, f0.B(v.f29868a), f0.B(price$$serializer), f0.B(price$$serializer), f0.B(price$$serializer), f0.B(r1Var), f0.B(voucherFilterTypeSerializer), f0.B(r1Var), jVarArr[16].getValue(), f0.B(voucherFilterTypeSerializer), f0.B(VoucherFilterResponse$$serializer.INSTANCE), f0.B((KSerializer) jVarArr[19].getValue()), f0.B(r1Var)};
    }

    @Override // i90.b
    @NotNull
    public final DiscountVoucher deserialize(@NotNull Decoder decoder) {
        Double d3;
        VoucherState voucherState;
        int i11;
        VoucherFilterResponse voucherFilterResponse;
        Double d11;
        Double d12;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = DiscountVoucher.$childSerializers;
        VoucherFilterResponse voucherFilterResponse2 = null;
        VoucherFilterType voucherFilterType = null;
        List list = null;
        String str = null;
        List list2 = null;
        Double d13 = null;
        int i12 = 0;
        String str2 = null;
        Price price = null;
        Price price2 = null;
        Price price3 = null;
        String str3 = null;
        VoucherFilterType voucherFilterType2 = null;
        VoucherState voucherState2 = null;
        boolean z11 = true;
        String strM306unboximpl = null;
        int iQ = 0;
        int iQ2 = 0;
        String strU = null;
        String strU2 = null;
        String strU3 = null;
        String strU4 = null;
        String strU5 = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    voucherFilterResponse = voucherFilterResponse2;
                    z11 = false;
                    voucherFilterResponse2 = voucherFilterResponse;
                    break;
                case 0:
                    voucherFilterResponse = voucherFilterResponse2;
                    d11 = d13;
                    VoucherState voucherState3 = voucherState2;
                    VoucherId voucherId = (VoucherId) aVarC.n(serialDescriptor, 0, VoucherId$$serializer.INSTANCE, strM306unboximpl != null ? VoucherId.m298boximpl(strM306unboximpl) : null);
                    strM306unboximpl = voucherId != null ? voucherId.m306unboximpl() : null;
                    i12 |= 1;
                    voucherState2 = voucherState3;
                    d13 = d11;
                    voucherFilterResponse2 = voucherFilterResponse;
                    break;
                case 1:
                    voucherFilterResponse = voucherFilterResponse2;
                    d11 = d13;
                    iQ = aVarC.q(serialDescriptor, 1);
                    i12 |= 2;
                    d13 = d11;
                    voucherFilterResponse2 = voucherFilterResponse;
                    break;
                case 2:
                    voucherFilterResponse = voucherFilterResponse2;
                    d11 = d13;
                    iQ2 = aVarC.q(serialDescriptor, 2);
                    i12 |= 4;
                    d13 = d11;
                    voucherFilterResponse2 = voucherFilterResponse;
                    break;
                case 3:
                    voucherFilterResponse = voucherFilterResponse2;
                    d11 = d13;
                    strU = aVarC.u(serialDescriptor, 3);
                    i12 |= 8;
                    d13 = d11;
                    voucherFilterResponse2 = voucherFilterResponse;
                    break;
                case 4:
                    voucherFilterResponse = voucherFilterResponse2;
                    d11 = d13;
                    strU2 = aVarC.u(serialDescriptor, 4);
                    i12 |= 16;
                    d13 = d11;
                    voucherFilterResponse2 = voucherFilterResponse;
                    break;
                case 5:
                    voucherFilterResponse = voucherFilterResponse2;
                    d11 = d13;
                    strU3 = aVarC.u(serialDescriptor, 5);
                    i12 |= 32;
                    d13 = d11;
                    voucherFilterResponse2 = voucherFilterResponse;
                    break;
                case 6:
                    voucherFilterResponse = voucherFilterResponse2;
                    d11 = d13;
                    voucherState2 = (VoucherState) aVarC.n(serialDescriptor, 6, VoucherStateSerializer.INSTANCE, voucherState2);
                    i12 |= 64;
                    d13 = d11;
                    voucherFilterResponse2 = voucherFilterResponse;
                    break;
                case 7:
                    voucherFilterResponse = voucherFilterResponse2;
                    d12 = d13;
                    strU4 = aVarC.u(serialDescriptor, 7);
                    i12 |= 128;
                    d13 = d12;
                    voucherFilterResponse2 = voucherFilterResponse;
                    break;
                case 8:
                    voucherFilterResponse = voucherFilterResponse2;
                    d12 = d13;
                    strU5 = aVarC.u(serialDescriptor, 8);
                    i12 |= 256;
                    d13 = d12;
                    voucherFilterResponse2 = voucherFilterResponse;
                    break;
                case 9:
                    voucherFilterResponse = voucherFilterResponse2;
                    d13 = (Double) aVarC.m(serialDescriptor, 9, v.f29868a, d13);
                    i12 |= 512;
                    voucherState2 = voucherState2;
                    voucherFilterResponse2 = voucherFilterResponse;
                    break;
                case 10:
                    d3 = d13;
                    voucherState = voucherState2;
                    price = (Price) aVarC.m(serialDescriptor, 10, Price$$serializer.INSTANCE, price);
                    i12 |= 1024;
                    voucherState2 = voucherState;
                    d13 = d3;
                    break;
                case 11:
                    d3 = d13;
                    voucherState = voucherState2;
                    price2 = (Price) aVarC.m(serialDescriptor, 11, Price$$serializer.INSTANCE, price2);
                    i12 |= NewHope.SENDB_BYTES;
                    voucherState2 = voucherState;
                    d13 = d3;
                    break;
                case 12:
                    d3 = d13;
                    voucherState = voucherState2;
                    price3 = (Price) aVarC.m(serialDescriptor, 12, Price$$serializer.INSTANCE, price3);
                    i12 |= 4096;
                    voucherState2 = voucherState;
                    d13 = d3;
                    break;
                case 13:
                    d3 = d13;
                    voucherState = voucherState2;
                    str3 = (String) aVarC.m(serialDescriptor, 13, r1.f29848a, str3);
                    i12 |= 8192;
                    voucherState2 = voucherState;
                    d13 = d3;
                    break;
                case 14:
                    d3 = d13;
                    voucherState = voucherState2;
                    voucherFilterType2 = (VoucherFilterType) aVarC.m(serialDescriptor, 14, VoucherFilterTypeSerializer.INSTANCE, voucherFilterType2);
                    i12 |= BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
                    voucherState2 = voucherState;
                    d13 = d3;
                    break;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    d3 = d13;
                    voucherState = voucherState2;
                    str = (String) aVarC.m(serialDescriptor, 15, r1.f29848a, str);
                    i11 = 32768;
                    i12 |= i11;
                    voucherState2 = voucherState;
                    d13 = d3;
                    break;
                case 16:
                    d3 = d13;
                    voucherState = voucherState2;
                    list = (List) aVarC.n(serialDescriptor, 16, (b) jVarArr[16].getValue(), list);
                    i11 = 65536;
                    i12 |= i11;
                    voucherState2 = voucherState;
                    d13 = d3;
                    break;
                case 17:
                    d3 = d13;
                    voucherState = voucherState2;
                    voucherFilterType = (VoucherFilterType) aVarC.m(serialDescriptor, 17, VoucherFilterTypeSerializer.INSTANCE, voucherFilterType);
                    i11 = 131072;
                    i12 |= i11;
                    voucherState2 = voucherState;
                    d13 = d3;
                    break;
                case 18:
                    d3 = d13;
                    voucherState = voucherState2;
                    voucherFilterResponse2 = (VoucherFilterResponse) aVarC.m(serialDescriptor, 18, VoucherFilterResponse$$serializer.INSTANCE, voucherFilterResponse2);
                    i11 = 262144;
                    i12 |= i11;
                    voucherState2 = voucherState;
                    d13 = d3;
                    break;
                case 19:
                    d3 = d13;
                    voucherState = voucherState2;
                    list2 = (List) aVarC.m(serialDescriptor, 19, (b) jVarArr[19].getValue(), list2);
                    i11 = 524288;
                    i12 |= i11;
                    voucherState2 = voucherState;
                    d13 = d3;
                    break;
                case 20:
                    voucherState = voucherState2;
                    d3 = d13;
                    str2 = (String) aVarC.m(serialDescriptor, 20, r1.f29848a, str2);
                    i11 = 1048576;
                    i12 |= i11;
                    voucherState2 = voucherState;
                    d13 = d3;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        Double d14 = d13;
        aVarC.b(serialDescriptor);
        Price price4 = price;
        String str4 = str2;
        return new DiscountVoucher(i12, strM306unboximpl, iQ, iQ2, strU, strU2, strU3, voucherState2, strU4, strU5, d14, price4, price2, price3, str3, voucherFilterType2, str, list, voucherFilterType, voucherFilterResponse2, list2, str4, null, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull DiscountVoucher value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        DiscountVoucher.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
