package com.app.tgtg.model.remote.voucher;

import c50.w;
import com.app.tgtg.model.remote.VoucherId;
import com.app.tgtg.model.remote.VoucherId$$serializer;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
import com.app.tgtg.model.remote.voucher.response.VoucherFilterResponse;
import com.app.tgtg.model.remote.voucher.response.VoucherFilterResponse$$serializer;
import com.app.tgtg.model.remote.voucher.response.VoucherType;
import com.app.tgtg.model.remote.voucher.response.VoucherTypeSerializer;
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
import o30.f0;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/voucher/CountryBasedVoucher.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/voucher/CountryBasedVoucher;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/voucher/CountryBasedVoucher;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/voucher/CountryBasedVoucher;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class CountryBasedVoucher$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final CountryBasedVoucher$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        CountryBasedVoucher$$serializer countryBasedVoucher$$serializer = new CountryBasedVoucher$$serializer();
        INSTANCE = countryBasedVoucher$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.voucher.CountryBasedVoucher", countryBasedVoucher$$serializer, 18);
        e1Var.j("id", false);
        e1Var.j("name", false);
        e1Var.j("short_description", false);
        e1Var.j("valid_from", false);
        e1Var.j("valid_to", false);
        e1Var.j("country_id", false);
        e1Var.j("state", false);
        e1Var.j("store_filter_type", false);
        e1Var.j("terms_link", false);
        e1Var.j("version", false);
        e1Var.j("type", false);
        e1Var.j("max_item_price", false);
        e1Var.j("items_left", false);
        e1Var.j("number_of_items", false);
        e1Var.j("filter_type", true);
        e1Var.j("filter_list", true);
        e1Var.j("applicable_item_types", true);
        e1Var.j("eligible_platforms", true);
        e1Var.k(new CountryBasedVoucher$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("version"));
        descriptor = e1Var;
    }

    private CountryBasedVoucher$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = CountryBasedVoucher.$childSerializers;
        r1 r1Var = r1.f29848a;
        KSerializer kSerializerB = f0.B(r1Var);
        KSerializer kSerializerB2 = f0.B(r1Var);
        VoucherFilterTypeSerializer voucherFilterTypeSerializer = VoucherFilterTypeSerializer.INSTANCE;
        KSerializer kSerializerB3 = f0.B(voucherFilterTypeSerializer);
        KSerializer kSerializerB4 = f0.B(r1Var);
        KSerializer kSerializerB5 = f0.B(Price$$serializer.INSTANCE);
        l0 l0Var = l0.f29821a;
        return new KSerializer[]{VoucherId$$serializer.INSTANCE, r1Var, kSerializerB, r1Var, r1Var, kSerializerB2, VoucherStateSerializer.INSTANCE, kSerializerB3, kSerializerB4, VoucherVersionSerializer.INSTANCE, VoucherTypeSerializer.INSTANCE, kSerializerB5, l0Var, f0.B(l0Var), f0.B(voucherFilterTypeSerializer), f0.B(VoucherFilterResponse$$serializer.INSTANCE), f0.B((KSerializer) jVarArr[16].getValue()), f0.B(r1Var)};
    }

    @Override // i90.b
    @NotNull
    public final CountryBasedVoucher deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        int i11;
        VoucherFilterResponse voucherFilterResponse;
        String str3;
        String str4;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = CountryBasedVoucher.$childSerializers;
        VoucherFilterResponse voucherFilterResponse2 = null;
        VoucherFilterType voucherFilterType = null;
        Integer num = null;
        Price price = null;
        List list = null;
        VoucherFilterType voucherFilterType2 = null;
        int i12 = 0;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        VoucherVersion voucherVersion = null;
        VoucherType voucherType = null;
        String str8 = null;
        VoucherState voucherState = null;
        boolean z11 = true;
        String strM306unboximpl = null;
        String strU = null;
        String strU2 = null;
        String strU3 = null;
        int iQ = 0;
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
                    String str9 = str7;
                    str3 = str8;
                    VoucherId voucherId = (VoucherId) aVarC.n(serialDescriptor, 0, VoucherId$$serializer.INSTANCE, strM306unboximpl != null ? VoucherId.m298boximpl(strM306unboximpl) : null);
                    strM306unboximpl = voucherId != null ? voucherId.m306unboximpl() : null;
                    i12 |= 1;
                    str7 = str9;
                    str8 = str3;
                    voucherFilterResponse2 = voucherFilterResponse;
                    break;
                case 1:
                    voucherFilterResponse = voucherFilterResponse2;
                    strU = aVarC.u(serialDescriptor, 1);
                    i12 |= 2;
                    str7 = str7;
                    voucherFilterResponse2 = voucherFilterResponse;
                    break;
                case 2:
                    voucherFilterResponse = voucherFilterResponse2;
                    str3 = str8;
                    str7 = (String) aVarC.m(serialDescriptor, 2, r1.f29848a, str7);
                    i12 |= 4;
                    str8 = str3;
                    voucherFilterResponse2 = voucherFilterResponse;
                    break;
                case 3:
                    voucherFilterResponse = voucherFilterResponse2;
                    str4 = str7;
                    strU2 = aVarC.u(serialDescriptor, 3);
                    i12 |= 8;
                    str7 = str4;
                    voucherFilterResponse2 = voucherFilterResponse;
                    break;
                case 4:
                    voucherFilterResponse = voucherFilterResponse2;
                    str4 = str7;
                    strU3 = aVarC.u(serialDescriptor, 4);
                    i12 |= 16;
                    str7 = str4;
                    voucherFilterResponse2 = voucherFilterResponse;
                    break;
                case 5:
                    str4 = str7;
                    voucherFilterResponse = voucherFilterResponse2;
                    str8 = (String) aVarC.m(serialDescriptor, 5, r1.f29848a, str8);
                    i12 |= 32;
                    str7 = str4;
                    voucherFilterResponse2 = voucherFilterResponse;
                    break;
                case 6:
                    str = str7;
                    str2 = str8;
                    voucherState = (VoucherState) aVarC.n(serialDescriptor, 6, VoucherStateSerializer.INSTANCE, voucherState);
                    i12 |= 64;
                    str7 = str;
                    str8 = str2;
                    break;
                case 7:
                    str = str7;
                    str2 = str8;
                    voucherFilterType2 = (VoucherFilterType) aVarC.m(serialDescriptor, 7, VoucherFilterTypeSerializer.INSTANCE, voucherFilterType2);
                    i12 |= 128;
                    str7 = str;
                    str8 = str2;
                    break;
                case 8:
                    str = str7;
                    str2 = str8;
                    str6 = (String) aVarC.m(serialDescriptor, 8, r1.f29848a, str6);
                    i12 |= 256;
                    str7 = str;
                    str8 = str2;
                    break;
                case 9:
                    str = str7;
                    str2 = str8;
                    voucherVersion = (VoucherVersion) aVarC.n(serialDescriptor, 9, VoucherVersionSerializer.INSTANCE, voucherVersion);
                    i12 |= 512;
                    str7 = str;
                    str8 = str2;
                    break;
                case 10:
                    str = str7;
                    str2 = str8;
                    voucherType = (VoucherType) aVarC.n(serialDescriptor, 10, VoucherTypeSerializer.INSTANCE, voucherType);
                    i12 |= 1024;
                    str7 = str;
                    str8 = str2;
                    break;
                case 11:
                    str = str7;
                    str2 = str8;
                    price = (Price) aVarC.m(serialDescriptor, 11, Price$$serializer.INSTANCE, price);
                    i12 |= NewHope.SENDB_BYTES;
                    str7 = str;
                    str8 = str2;
                    break;
                case 12:
                    iQ = aVarC.q(serialDescriptor, 12);
                    i12 |= 4096;
                    str7 = str7;
                    break;
                case 13:
                    str = str7;
                    str2 = str8;
                    num = (Integer) aVarC.m(serialDescriptor, 13, l0.f29821a, num);
                    i12 |= 8192;
                    str7 = str;
                    str8 = str2;
                    break;
                case 14:
                    str = str7;
                    str2 = str8;
                    voucherFilterType = (VoucherFilterType) aVarC.m(serialDescriptor, 14, VoucherFilterTypeSerializer.INSTANCE, voucherFilterType);
                    i12 |= BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
                    str7 = str;
                    str8 = str2;
                    break;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    str = str7;
                    str2 = str8;
                    voucherFilterResponse2 = (VoucherFilterResponse) aVarC.m(serialDescriptor, 15, VoucherFilterResponse$$serializer.INSTANCE, voucherFilterResponse2);
                    i11 = 32768;
                    i12 |= i11;
                    str7 = str;
                    str8 = str2;
                    break;
                case 16:
                    str = str7;
                    str2 = str8;
                    list = (List) aVarC.m(serialDescriptor, 16, (b) jVarArr[16].getValue(), list);
                    i11 = 65536;
                    i12 |= i11;
                    str7 = str;
                    str8 = str2;
                    break;
                case 17:
                    str = str7;
                    str2 = str8;
                    str5 = (String) aVarC.m(serialDescriptor, 17, r1.f29848a, str5);
                    i11 = 131072;
                    i12 |= i11;
                    str7 = str;
                    str8 = str2;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new CountryBasedVoucher(i12, strM306unboximpl, strU, str7, strU2, strU3, str8, voucherState, voucherFilterType2, str6, voucherVersion, voucherType, price, iQ, num, voucherFilterType, voucherFilterResponse2, list, str5, null, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull CountryBasedVoucher value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        CountryBasedVoucher.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
