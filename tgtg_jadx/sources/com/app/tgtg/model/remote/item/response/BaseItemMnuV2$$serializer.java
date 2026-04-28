package com.app.tgtg.model.remote.item.response;

import c50.w;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.ItemId$$serializer;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.Picture$$serializer;
import com.app.tgtg.model.remote.manufacturer.response.CateringProperties;
import com.app.tgtg.model.remote.manufacturer.response.CateringProperties$$serializer;
import com.app.tgtg.model.remote.manufacturer.response.ManufacturerItemProperties;
import com.app.tgtg.model.remote.manufacturer.response.ManufacturerItemProperties$$serializer;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
import i90.b;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/item/response/BaseItemMnuV2.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/item/response/BaseItemMnuV2;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/item/response/BaseItemMnuV2;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/item/response/BaseItemMnuV2;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class BaseItemMnuV2$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final BaseItemMnuV2$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        BaseItemMnuV2$$serializer baseItemMnuV2$$serializer = new BaseItemMnuV2$$serializer();
        INSTANCE = baseItemMnuV2$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.item.response.BaseItemMnuV2", baseItemMnuV2$$serializer, 17);
        e1Var.j("item_id", false);
        e1Var.j("item_type", false);
        e1Var.j("name", false);
        e1Var.j("subtitle", false);
        e1Var.j("item_price", false);
        e1Var.j("item_value", false);
        e1Var.j("available_stock", false);
        e1Var.j("cover_picture", false);
        e1Var.j("manufacturer_properties", true);
        e1Var.j("catering_properties", true);
        e1Var.j("tags", true);
        e1Var.j("store_name", true);
        e1Var.j("item_count", true);
        e1Var.j("context_label", true);
        e1Var.j("discount_label", true);
        e1Var.j("average_overall_rating", true);
        e1Var.j("currentQuantity", true);
        descriptor = e1Var;
    }

    private BaseItemMnuV2$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = BaseItemMnuV2.$childSerializers;
        r1 r1Var = r1.f29848a;
        KSerializer kSerializerB = f0.B(r1Var);
        KSerializer kSerializerB2 = f0.B(r1Var);
        Price$$serializer price$$serializer = Price$$serializer.INSTANCE;
        KSerializer kSerializerB3 = f0.B(price$$serializer);
        KSerializer kSerializerB4 = f0.B(price$$serializer);
        l0 l0Var = l0.f29821a;
        return new KSerializer[]{ItemId$$serializer.INSTANCE, ItemTypeSerializer.INSTANCE, kSerializerB, kSerializerB2, kSerializerB3, kSerializerB4, l0Var, f0.B(Picture$$serializer.INSTANCE), f0.B(ManufacturerItemProperties$$serializer.INSTANCE), f0.B(CateringProperties$$serializer.INSTANCE), f0.B((KSerializer) jVarArr[10].getValue()), f0.B(r1Var), f0.B(l0Var), f0.B(r1Var), f0.B(r1Var), f0.B(v.f29868a), l0Var};
    }

    @Override // i90.b
    @NotNull
    public final BaseItemMnuV2 deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        Integer num;
        String str3;
        String str4;
        String str5;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = BaseItemMnuV2.$childSerializers;
        Integer num2 = null;
        String str6 = null;
        List list = null;
        CateringProperties cateringProperties = null;
        String str7 = null;
        Picture picture = null;
        int i11 = 0;
        String str8 = null;
        Double d3 = null;
        String str9 = null;
        String str10 = null;
        Price price = null;
        Price price2 = null;
        ManufacturerItemProperties manufacturerItemProperties = null;
        boolean z11 = true;
        String strM205unboximpl = null;
        ItemType itemType = null;
        int iQ = 0;
        int iQ2 = 0;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    str2 = str10;
                    z11 = false;
                    str6 = str6;
                    str10 = str2;
                    break;
                case 0:
                    num = num2;
                    str3 = str9;
                    str4 = str10;
                    ItemType itemType2 = itemType;
                    String str11 = str6;
                    ItemId itemId = (ItemId) aVarC.n(serialDescriptor, 0, ItemId$$serializer.INSTANCE, strM205unboximpl != null ? ItemId.m197boximpl(strM205unboximpl) : null);
                    strM205unboximpl = itemId != null ? itemId.m205unboximpl() : null;
                    i11 |= 1;
                    itemType = itemType2;
                    str6 = str11;
                    str9 = str3;
                    str10 = str4;
                    num2 = num;
                    break;
                case 1:
                    num = num2;
                    str4 = str10;
                    str3 = str9;
                    itemType = (ItemType) aVarC.n(serialDescriptor, 1, ItemTypeSerializer.INSTANCE, itemType);
                    i11 |= 2;
                    str9 = str3;
                    str10 = str4;
                    num2 = num;
                    break;
                case 2:
                    num = num2;
                    str4 = str10;
                    str9 = (String) aVarC.m(serialDescriptor, 2, r1.f29848a, str9);
                    i11 |= 4;
                    str10 = str4;
                    num2 = num;
                    break;
                case 3:
                    num = num2;
                    str10 = (String) aVarC.m(serialDescriptor, 3, r1.f29848a, str10);
                    i11 |= 8;
                    str9 = str9;
                    num2 = num;
                    break;
                case 4:
                    str5 = str9;
                    str2 = str10;
                    price = (Price) aVarC.m(serialDescriptor, 4, Price$$serializer.INSTANCE, price);
                    i11 |= 16;
                    str9 = str5;
                    str10 = str2;
                    break;
                case 5:
                    str5 = str9;
                    str2 = str10;
                    price2 = (Price) aVarC.m(serialDescriptor, 5, Price$$serializer.INSTANCE, price2);
                    i11 |= 32;
                    str9 = str5;
                    str10 = str2;
                    break;
                case 6:
                    str = str9;
                    iQ = aVarC.q(serialDescriptor, 6);
                    i11 |= 64;
                    str9 = str;
                    break;
                case 7:
                    str5 = str9;
                    str2 = str10;
                    picture = (Picture) aVarC.m(serialDescriptor, 7, Picture$$serializer.INSTANCE, picture);
                    i11 |= 128;
                    str9 = str5;
                    str10 = str2;
                    break;
                case 8:
                    str5 = str9;
                    str2 = str10;
                    manufacturerItemProperties = (ManufacturerItemProperties) aVarC.m(serialDescriptor, 8, ManufacturerItemProperties$$serializer.INSTANCE, manufacturerItemProperties);
                    i11 |= 256;
                    str9 = str5;
                    str10 = str2;
                    break;
                case 9:
                    str5 = str9;
                    str2 = str10;
                    cateringProperties = (CateringProperties) aVarC.m(serialDescriptor, 9, CateringProperties$$serializer.INSTANCE, cateringProperties);
                    i11 |= 512;
                    str9 = str5;
                    str10 = str2;
                    break;
                case 10:
                    str5 = str9;
                    str2 = str10;
                    list = (List) aVarC.m(serialDescriptor, 10, (b) jVarArr[10].getValue(), list);
                    i11 |= 1024;
                    str9 = str5;
                    str10 = str2;
                    break;
                case 11:
                    str5 = str9;
                    str2 = str10;
                    str6 = (String) aVarC.m(serialDescriptor, 11, r1.f29848a, str6);
                    i11 |= NewHope.SENDB_BYTES;
                    str9 = str5;
                    str10 = str2;
                    break;
                case 12:
                    str5 = str9;
                    str2 = str10;
                    num2 = (Integer) aVarC.m(serialDescriptor, 12, l0.f29821a, num2);
                    i11 |= 4096;
                    str9 = str5;
                    str10 = str2;
                    break;
                case 13:
                    str5 = str9;
                    str2 = str10;
                    str7 = (String) aVarC.m(serialDescriptor, 13, r1.f29848a, str7);
                    i11 |= 8192;
                    str9 = str5;
                    str10 = str2;
                    break;
                case 14:
                    str5 = str9;
                    str2 = str10;
                    str8 = (String) aVarC.m(serialDescriptor, 14, r1.f29848a, str8);
                    i11 |= BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
                    str9 = str5;
                    str10 = str2;
                    break;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    str5 = str9;
                    str2 = str10;
                    d3 = (Double) aVarC.m(serialDescriptor, 15, v.f29868a, d3);
                    i11 |= 32768;
                    str9 = str5;
                    str10 = str2;
                    break;
                case 16:
                    str = str9;
                    iQ2 = aVarC.q(serialDescriptor, 16);
                    i11 |= 65536;
                    str9 = str;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        String str12 = str6;
        String str13 = str9;
        String str14 = str10;
        ItemType itemType3 = itemType;
        aVarC.b(serialDescriptor);
        return new BaseItemMnuV2(i11, strM205unboximpl, itemType3, str13, str14, price, price2, iQ, picture, manufacturerItemProperties, cateringProperties, list, str12, num2, str7, str8, d3, iQ2, null, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull BaseItemMnuV2 value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        BaseItemMnuV2.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
