package com.app.tgtg.model.remote.user.requests;

import c50.w;
import com.appsflyer.AdRevenueScheme;
import i90.b;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.c1;
import m90.d0;
import m90.e1;
import m90.g;
import m90.m1;
import m90.r1;
import nr.a;
import o30.f0;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/user/requests/UserAddress.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/user/requests/UserAddress;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/user/requests/UserAddress;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/user/requests/UserAddress;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class UserAddress$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final UserAddress$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        UserAddress$$serializer userAddress$$serializer = new UserAddress$$serializer();
        INSTANCE = userAddress$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.user.requests.UserAddress", userAddress$$serializer, 18);
        e1Var.j("name", true);
        e1Var.j("email", true);
        e1Var.j("phone_country_code", true);
        e1Var.j("phone", true);
        e1Var.j("address1", true);
        e1Var.j("address2", true);
        e1Var.j("city", true);
        e1Var.j("state", true);
        e1Var.j("postal_code", true);
        e1Var.j(AdRevenueScheme.COUNTRY, true);
        e1Var.j("street_name", true);
        e1Var.j("house_number", true);
        e1Var.j("house_number_addition", true);
        e1Var.j("user_address_type", true);
        e1Var.j("user_address_id", true);
        e1Var.j("delivery_access_code", true);
        e1Var.j("no_delivery_access_code", true);
        e1Var.j("delivery_instructions", true);
        descriptor = e1Var;
    }

    private UserAddress$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = UserAddress.$childSerializers;
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B((KSerializer) jVarArr[13].getValue()), f0.B(r1Var), f0.B(r1Var), g.f29797a, f0.B(r1Var)};
    }

    @Override // i90.b
    @NotNull
    public final UserAddress deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        int i11;
        a aVar;
        String str3;
        String str4;
        a aVar2;
        String str5;
        String str6;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = UserAddress.$childSerializers;
        String str7 = null;
        a aVar3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        String str22 = null;
        int i12 = 0;
        boolean z11 = true;
        boolean zT = false;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    aVar = aVar3;
                    str3 = str16;
                    str4 = str21;
                    z11 = false;
                    str8 = str8;
                    str16 = str3;
                    aVar3 = aVar;
                    str21 = str4;
                    break;
                case 0:
                    aVar = aVar3;
                    str3 = str16;
                    str4 = str21;
                    str19 = (String) aVarC.m(serialDescriptor, 0, r1.f29848a, str19);
                    i12 |= 1;
                    str8 = str8;
                    str15 = str15;
                    str16 = str3;
                    aVar3 = aVar;
                    str21 = str4;
                    break;
                case 1:
                    aVar2 = aVar3;
                    str5 = str15;
                    str6 = str16;
                    str20 = (String) aVarC.m(serialDescriptor, 1, r1.f29848a, str20);
                    i12 |= 2;
                    str21 = str21;
                    str15 = str5;
                    str16 = str6;
                    aVar3 = aVar2;
                    break;
                case 2:
                    aVar2 = aVar3;
                    str5 = str15;
                    str6 = str16;
                    str21 = (String) aVarC.m(serialDescriptor, 2, r1.f29848a, str21);
                    i12 |= 4;
                    str15 = str5;
                    str16 = str6;
                    aVar3 = aVar2;
                    break;
                case 3:
                    aVar2 = aVar3;
                    str6 = str16;
                    str5 = str15;
                    str22 = (String) aVarC.m(serialDescriptor, 3, r1.f29848a, str22);
                    i12 |= 8;
                    str15 = str5;
                    str16 = str6;
                    aVar3 = aVar2;
                    break;
                case 4:
                    aVar2 = aVar3;
                    str6 = str16;
                    str15 = (String) aVarC.m(serialDescriptor, 4, r1.f29848a, str15);
                    i12 |= 16;
                    str16 = str6;
                    aVar3 = aVar2;
                    break;
                case 5:
                    aVar2 = aVar3;
                    str16 = (String) aVarC.m(serialDescriptor, 5, r1.f29848a, str16);
                    i12 |= 32;
                    str15 = str15;
                    aVar3 = aVar2;
                    break;
                case 6:
                    str = str15;
                    str2 = str16;
                    str17 = (String) aVarC.m(serialDescriptor, 6, r1.f29848a, str17);
                    i12 |= 64;
                    str15 = str;
                    str16 = str2;
                    break;
                case 7:
                    str = str15;
                    str2 = str16;
                    str18 = (String) aVarC.m(serialDescriptor, 7, r1.f29848a, str18);
                    i12 |= 128;
                    str15 = str;
                    str16 = str2;
                    break;
                case 8:
                    str = str15;
                    str2 = str16;
                    str7 = (String) aVarC.m(serialDescriptor, 8, r1.f29848a, str7);
                    i12 |= 256;
                    str15 = str;
                    str16 = str2;
                    break;
                case 9:
                    str = str15;
                    str2 = str16;
                    str10 = (String) aVarC.m(serialDescriptor, 9, r1.f29848a, str10);
                    i12 |= 512;
                    str15 = str;
                    str16 = str2;
                    break;
                case 10:
                    str = str15;
                    str2 = str16;
                    str11 = (String) aVarC.m(serialDescriptor, 10, r1.f29848a, str11);
                    i12 |= 1024;
                    str15 = str;
                    str16 = str2;
                    break;
                case 11:
                    str = str15;
                    str2 = str16;
                    str9 = (String) aVarC.m(serialDescriptor, 11, r1.f29848a, str9);
                    i12 |= NewHope.SENDB_BYTES;
                    str15 = str;
                    str16 = str2;
                    break;
                case 12:
                    str = str15;
                    str2 = str16;
                    str8 = (String) aVarC.m(serialDescriptor, 12, r1.f29848a, str8);
                    i12 |= 4096;
                    str15 = str;
                    str16 = str2;
                    break;
                case 13:
                    str = str15;
                    str2 = str16;
                    aVar3 = (a) aVarC.m(serialDescriptor, 13, (b) jVarArr[13].getValue(), aVar3);
                    i12 |= 8192;
                    str15 = str;
                    str16 = str2;
                    break;
                case 14:
                    str = str15;
                    str2 = str16;
                    str12 = (String) aVarC.m(serialDescriptor, 14, r1.f29848a, str12);
                    i12 |= BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
                    str15 = str;
                    str16 = str2;
                    break;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    str = str15;
                    str2 = str16;
                    str13 = (String) aVarC.m(serialDescriptor, 15, r1.f29848a, str13);
                    i11 = 32768;
                    i12 |= i11;
                    str15 = str;
                    str16 = str2;
                    break;
                case 16:
                    zT = aVarC.t(serialDescriptor, 16);
                    i12 |= 65536;
                    str15 = str15;
                    break;
                case 17:
                    str = str15;
                    str2 = str16;
                    str14 = (String) aVarC.m(serialDescriptor, 17, r1.f29848a, str14);
                    i11 = 131072;
                    i12 |= i11;
                    str15 = str;
                    str16 = str2;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        a aVar4 = aVar3;
        String str23 = str16;
        aVarC.b(serialDescriptor);
        return new UserAddress(i12, str19, str20, str21, str22, str15, str23, str17, str18, str7, str10, str11, str9, str8, aVar4, str12, str13, zT, str14, (m1) null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull UserAddress value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        UserAddress.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
