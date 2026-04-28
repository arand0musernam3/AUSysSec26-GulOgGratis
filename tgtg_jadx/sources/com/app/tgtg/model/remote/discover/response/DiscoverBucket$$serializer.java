package com.app.tgtg.model.remote.discover.response;

import c50.w;
import com.app.tgtg.model.remote.item.AppliedFilter;
import com.app.tgtg.model.remote.item.AppliedFilter$$serializer;
import com.app.tgtg.model.remote.item.response.Item;
import com.app.tgtg.model.remote.item.response.Item$$serializer;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.Order$$serializer;
import com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails;
import com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails$$serializer;
import i90.b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import l90.a;
import m90.c1;
import m90.d0;
import m90.e1;
import m90.m1;
import m90.r1;
import o30.f0;
import org.bouncycastle.i18n.MessageBundle;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/discover/response/DiscoverBucket.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/discover/response/DiscoverBucket;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/discover/response/DiscoverBucket;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/discover/response/DiscoverBucket;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class DiscoverBucket$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final DiscoverBucket$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        DiscoverBucket$$serializer discoverBucket$$serializer = new DiscoverBucket$$serializer();
        INSTANCE = discoverBucket$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.discover.response.DiscoverBucket", discoverBucket$$serializer, 27);
        e1Var.j("bucket_type", false);
        e1Var.j("display_type", false);
        e1Var.j(MessageBundle.TITLE_ENTRY, true);
        e1Var.j("description", true);
        e1Var.j("subtitle", true);
        e1Var.j("secondary_description", true);
        e1Var.j("items", true);
        e1Var.j("stores", true);
        e1Var.j("actions", true);
        e1Var.j("subtext", true);
        e1Var.j("button", true);
        e1Var.j("spacer", true);
        e1Var.j("donation", true);
        e1Var.j("context", true);
        e1Var.j("headline", true);
        e1Var.j("order", true);
        e1Var.j("collected_on", true);
        e1Var.j("question", true);
        e1Var.j("social_title", true);
        e1Var.j("social_description", true);
        e1Var.j("social_button", true);
        e1Var.j("filler_type", false);
        e1Var.j("icon_url", true);
        e1Var.j("filters", true);
        e1Var.j("applied_filters", true);
        e1Var.j("loyalty_card_details", true);
        e1Var.j("tag", true);
        descriptor = e1Var;
    }

    private DiscoverBucket$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = DiscoverBucket.$childSerializers;
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{r1Var, r1Var, r1Var, f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B((KSerializer) jVarArr[6].getValue()), f0.B((KSerializer) jVarArr[7].getValue()), f0.B((KSerializer) jVarArr[8].getValue()), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B(Item$$serializer.INSTANCE), f0.B(r1Var), f0.B(r1Var), f0.B(Order$$serializer.INSTANCE), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), r1Var, f0.B(r1Var), f0.B((KSerializer) jVarArr[23].getValue()), f0.B(AppliedFilter$$serializer.INSTANCE), f0.B(LoyaltyCardDetails$$serializer.INSTANCE), f0.B(r1Var)};
    }

    @Override // i90.b
    @NotNull
    public final DiscoverBucket deserialize(@NotNull Decoder decoder) {
        String str;
        int i11;
        int i12;
        ArrayList arrayList;
        String str2;
        String str3;
        ArrayList arrayList2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = DiscoverBucket.$childSerializers;
        ArrayList arrayList3 = null;
        String str4 = null;
        String str5 = null;
        AppliedFilter appliedFilter = null;
        LoyaltyCardDetails loyaltyCardDetails = null;
        String str6 = null;
        Order order = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String strU = null;
        String strU2 = null;
        String strU3 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        String str16 = null;
        String str17 = null;
        String strU4 = null;
        String str18 = null;
        Item item = null;
        int i13 = 0;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    arrayList = arrayList3;
                    z11 = false;
                    i13 = i13;
                    str5 = str5;
                    arrayList5 = arrayList5;
                    arrayList3 = arrayList;
                    break;
                case 0:
                    str2 = str4;
                    str3 = str5;
                    arrayList = arrayList3;
                    strU = aVarC.u(serialDescriptor, 0);
                    arrayList5 = arrayList5;
                    i13 |= 1;
                    str4 = str2;
                    str5 = str3;
                    arrayList3 = arrayList;
                    break;
                case 1:
                    str2 = str4;
                    str3 = str5;
                    arrayList = arrayList3;
                    arrayList2 = arrayList5;
                    strU2 = aVarC.u(serialDescriptor, 1);
                    i13 |= 2;
                    arrayList5 = arrayList2;
                    str4 = str2;
                    str5 = str3;
                    arrayList3 = arrayList;
                    break;
                case 2:
                    str = str4;
                    strU3 = aVarC.u(serialDescriptor, 2);
                    arrayList5 = arrayList5;
                    arrayList3 = arrayList3;
                    i13 |= 4;
                    str4 = str;
                    break;
                case 3:
                    str2 = str4;
                    str3 = str5;
                    arrayList = arrayList3;
                    arrayList2 = arrayList5;
                    str13 = (String) aVarC.m(serialDescriptor, 3, r1.f29848a, str13);
                    i13 |= 8;
                    arrayList5 = arrayList2;
                    str4 = str2;
                    str5 = str3;
                    arrayList3 = arrayList;
                    break;
                case 4:
                    str2 = str4;
                    str3 = str5;
                    arrayList = arrayList3;
                    arrayList2 = arrayList5;
                    str14 = (String) aVarC.m(serialDescriptor, 4, r1.f29848a, str14);
                    i13 |= 16;
                    arrayList5 = arrayList2;
                    str4 = str2;
                    str5 = str3;
                    arrayList3 = arrayList;
                    break;
                case 5:
                    str2 = str4;
                    str3 = str5;
                    arrayList = arrayList3;
                    arrayList2 = arrayList5;
                    str15 = (String) aVarC.m(serialDescriptor, 5, r1.f29848a, str15);
                    i13 |= 32;
                    arrayList5 = arrayList2;
                    str4 = str2;
                    str5 = str3;
                    arrayList3 = arrayList;
                    break;
                case 6:
                    str2 = str4;
                    str3 = str5;
                    arrayList = arrayList3;
                    arrayList2 = arrayList5;
                    arrayList4 = (ArrayList) aVarC.m(serialDescriptor, 6, (b) jVarArr[6].getValue(), arrayList4);
                    i13 |= 64;
                    arrayList5 = arrayList2;
                    str4 = str2;
                    str5 = str3;
                    arrayList3 = arrayList;
                    break;
                case 7:
                    str2 = str4;
                    str3 = str5;
                    arrayList = arrayList3;
                    arrayList5 = (ArrayList) aVarC.m(serialDescriptor, 7, (b) jVarArr[7].getValue(), arrayList5);
                    i13 |= 128;
                    str4 = str2;
                    str5 = str3;
                    arrayList3 = arrayList;
                    break;
                case 8:
                    str2 = str4;
                    str3 = str5;
                    arrayList = arrayList3;
                    arrayList6 = (ArrayList) aVarC.m(serialDescriptor, 8, (b) jVarArr[8].getValue(), arrayList6);
                    i13 |= 256;
                    str4 = str2;
                    str5 = str3;
                    arrayList3 = arrayList;
                    break;
                case 9:
                    str2 = str4;
                    str3 = str5;
                    arrayList = arrayList3;
                    str16 = (String) aVarC.m(serialDescriptor, 9, r1.f29848a, str16);
                    i13 |= 512;
                    str4 = str2;
                    str5 = str3;
                    arrayList3 = arrayList;
                    break;
                case 10:
                    str2 = str4;
                    str3 = str5;
                    arrayList = arrayList3;
                    str17 = (String) aVarC.m(serialDescriptor, 10, r1.f29848a, str17);
                    i13 |= 1024;
                    str4 = str2;
                    str5 = str3;
                    arrayList3 = arrayList;
                    break;
                case 11:
                    str2 = str4;
                    str3 = str5;
                    arrayList = arrayList3;
                    str18 = (String) aVarC.m(serialDescriptor, 11, r1.f29848a, str18);
                    i13 |= NewHope.SENDB_BYTES;
                    str4 = str2;
                    str5 = str3;
                    arrayList3 = arrayList;
                    break;
                case 12:
                    str3 = str5;
                    arrayList = arrayList3;
                    str2 = str4;
                    item = (Item) aVarC.m(serialDescriptor, 12, Item$$serializer.INSTANCE, item);
                    i13 |= 4096;
                    str4 = str2;
                    str5 = str3;
                    arrayList3 = arrayList;
                    break;
                case 13:
                    str3 = str5;
                    arrayList = arrayList3;
                    str4 = (String) aVarC.m(serialDescriptor, 13, r1.f29848a, str4);
                    i13 |= 8192;
                    str5 = str3;
                    arrayList3 = arrayList;
                    break;
                case 14:
                    str = str4;
                    str6 = (String) aVarC.m(serialDescriptor, 14, r1.f29848a, str6);
                    i13 |= BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
                    str4 = str;
                    break;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    str = str4;
                    i11 = i13;
                    order = (Order) aVarC.m(serialDescriptor, 15, Order$$serializer.INSTANCE, order);
                    i12 = 32768;
                    i13 = i11 | i12;
                    str4 = str;
                    break;
                case 16:
                    str = str4;
                    i11 = i13;
                    str7 = (String) aVarC.m(serialDescriptor, 16, r1.f29848a, str7);
                    i12 = 65536;
                    i13 = i11 | i12;
                    str4 = str;
                    break;
                case 17:
                    str = str4;
                    i11 = i13;
                    str8 = (String) aVarC.m(serialDescriptor, 17, r1.f29848a, str8);
                    i12 = 131072;
                    i13 = i11 | i12;
                    str4 = str;
                    break;
                case 18:
                    str = str4;
                    i11 = i13;
                    str9 = (String) aVarC.m(serialDescriptor, 18, r1.f29848a, str9);
                    i12 = 262144;
                    i13 = i11 | i12;
                    str4 = str;
                    break;
                case 19:
                    str = str4;
                    i11 = i13;
                    str10 = (String) aVarC.m(serialDescriptor, 19, r1.f29848a, str10);
                    i12 = 524288;
                    i13 = i11 | i12;
                    str4 = str;
                    break;
                case 20:
                    str = str4;
                    i11 = i13;
                    str11 = (String) aVarC.m(serialDescriptor, 20, r1.f29848a, str11);
                    i12 = 1048576;
                    i13 = i11 | i12;
                    str4 = str;
                    break;
                case 21:
                    str = str4;
                    i11 = i13;
                    strU4 = aVarC.u(serialDescriptor, 21);
                    i12 = 2097152;
                    i13 = i11 | i12;
                    str4 = str;
                    break;
                case 22:
                    str = str4;
                    i11 = i13;
                    str12 = (String) aVarC.m(serialDescriptor, 22, r1.f29848a, str12);
                    i12 = 4194304;
                    i13 = i11 | i12;
                    str4 = str;
                    break;
                case 23:
                    str = str4;
                    i11 = i13;
                    arrayList3 = (ArrayList) aVarC.m(serialDescriptor, 23, (b) jVarArr[23].getValue(), arrayList3);
                    i12 = 8388608;
                    i13 = i11 | i12;
                    str4 = str;
                    break;
                case 24:
                    str = str4;
                    i11 = i13;
                    appliedFilter = (AppliedFilter) aVarC.m(serialDescriptor, 24, AppliedFilter$$serializer.INSTANCE, appliedFilter);
                    i12 = 16777216;
                    i13 = i11 | i12;
                    str4 = str;
                    break;
                case 25:
                    str = str4;
                    i11 = i13;
                    loyaltyCardDetails = (LoyaltyCardDetails) aVarC.m(serialDescriptor, 25, LoyaltyCardDetails$$serializer.INSTANCE, loyaltyCardDetails);
                    i12 = 33554432;
                    i13 = i11 | i12;
                    str4 = str;
                    break;
                case 26:
                    str = str4;
                    i11 = i13;
                    str5 = (String) aVarC.m(serialDescriptor, 26, r1.f29848a, str5);
                    i12 = 67108864;
                    i13 = i11 | i12;
                    str4 = str;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        ArrayList arrayList7 = arrayList3;
        ArrayList arrayList8 = arrayList5;
        int i14 = i13;
        String str19 = str13;
        aVarC.b(serialDescriptor);
        ArrayList arrayList9 = arrayList6;
        String str20 = str9;
        String str21 = str14;
        String str22 = str6;
        String str23 = strU;
        String str24 = str17;
        String str25 = str11;
        String str26 = str16;
        String str27 = str10;
        return new DiscoverBucket(i14, str23, strU2, strU3, str19, str21, str15, arrayList4, arrayList8, arrayList9, str26, str24, str18, item, str4, str22, order, str7, str8, str20, str27, str25, strU4, str12, arrayList7, appliedFilter, loyaltyCardDetails, str5, (m1) null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull DiscoverBucket value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        DiscoverBucket.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
