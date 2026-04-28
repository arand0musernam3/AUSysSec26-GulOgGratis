package com.app.tgtg.model.remote.item;

import c50.w;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.ItemId$$serializer;
import com.app.tgtg.model.remote.item.response.AllergensInfo;
import com.app.tgtg.model.remote.item.response.AllergensInfo$$serializer;
import com.app.tgtg.model.remote.item.response.PackagingOptions;
import com.app.tgtg.model.remote.manufacturer.response.ManufacturerInformation;
import com.app.tgtg.model.remote.manufacturer.response.ManufacturerInformation$$serializer;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/item/ManufacturerItemInformation.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/item/ManufacturerItemInformation;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/item/ManufacturerItemInformation;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/item/ManufacturerItemInformation;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class ManufacturerItemInformation$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final ManufacturerItemInformation$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ManufacturerItemInformation$$serializer manufacturerItemInformation$$serializer = new ManufacturerItemInformation$$serializer();
        INSTANCE = manufacturerItemInformation$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.item.ManufacturerItemInformation", manufacturerItemInformation$$serializer, 21);
        e1Var.j("cover_picture", true);
        e1Var.j("name", true);
        e1Var.j("description", true);
        e1Var.j("item_id", false);
        e1Var.j("item_price", false);
        e1Var.j("item_value", false);
        e1Var.j("logo_picture", true);
        e1Var.j("item_category", true);
        e1Var.j("diet_categories", true);
        e1Var.j("packaging_option", true);
        e1Var.j("positive_rating_reasons", true);
        e1Var.j("average_overall_rating", true);
        e1Var.j("manufacturer_item_properties", true);
        e1Var.j("allergens_info", true);
        e1Var.j("price_info", true);
        e1Var.j("sold_out_at_dynamic_item_price", true);
        e1Var.j("subtitle", true);
        e1Var.j("description_translated", true);
        e1Var.j("collection_info", true);
        e1Var.j("smiley_report_link", true);
        e1Var.j("is_edible", true);
        descriptor = e1Var;
    }

    private ManufacturerItemInformation$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = ManufacturerItemInformation.$childSerializers;
        Picture$$serializer picture$$serializer = Picture$$serializer.INSTANCE;
        r1 r1Var = r1.f29848a;
        Price$$serializer price$$serializer = Price$$serializer.INSTANCE;
        return new KSerializer[]{f0.B(picture$$serializer), f0.B(r1Var), f0.B(r1Var), ItemId$$serializer.INSTANCE, price$$serializer, f0.B(price$$serializer), f0.B(picture$$serializer), ItemCategorySerializer.INSTANCE, jVarArr[8].getValue(), jVarArr[9].getValue(), f0.B((KSerializer) jVarArr[10].getValue()), f0.B(AverageItemRating$$serializer.INSTANCE), f0.B(ManufacturerInformation$$serializer.INSTANCE), f0.B(AllergensInfo$$serializer.INSTANCE), f0.B(DynamicPriceInfo$$serializer.INSTANCE), f0.B(price$$serializer), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), g.f29797a};
    }

    @Override // i90.b
    @NotNull
    public final ManufacturerItemInformation deserialize(@NotNull Decoder decoder) {
        List list;
        ItemCategory itemCategory;
        AverageItemRating averageItemRating;
        List list2;
        List list3;
        ItemCategory itemCategory2;
        int i11;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = ManufacturerItemInformation.$childSerializers;
        AverageItemRating averageItemRating2 = null;
        List list4 = null;
        PackagingOptions packagingOptions = null;
        List list5 = null;
        ManufacturerInformation manufacturerInformation = null;
        ItemCategory itemCategory3 = null;
        int i12 = 0;
        DynamicPriceInfo dynamicPriceInfo = null;
        Price price = null;
        String str = null;
        AllergensInfo allergensInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z11 = true;
        String strM205unboximpl = null;
        Picture picture = null;
        String str5 = null;
        String str6 = null;
        Price price2 = null;
        Price price3 = null;
        Picture picture2 = null;
        boolean zT = false;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    list = list5;
                    itemCategory = itemCategory3;
                    z11 = false;
                    packagingOptions = packagingOptions;
                    list4 = list4;
                    itemCategory3 = itemCategory;
                    list5 = list;
                    break;
                case 0:
                    averageItemRating = averageItemRating2;
                    list2 = list4;
                    list3 = list5;
                    itemCategory2 = itemCategory3;
                    picture = (Picture) aVarC.m(serialDescriptor, 0, Picture$$serializer.INSTANCE, picture);
                    i12 |= 1;
                    packagingOptions = packagingOptions;
                    list4 = list2;
                    itemCategory3 = itemCategory2;
                    list5 = list3;
                    averageItemRating2 = averageItemRating;
                    break;
                case 1:
                    averageItemRating = averageItemRating2;
                    list3 = list5;
                    itemCategory2 = itemCategory3;
                    list2 = list4;
                    str5 = (String) aVarC.m(serialDescriptor, 1, r1.f29848a, str5);
                    i12 |= 2;
                    list4 = list2;
                    itemCategory3 = itemCategory2;
                    list5 = list3;
                    averageItemRating2 = averageItemRating;
                    break;
                case 2:
                    averageItemRating = averageItemRating2;
                    list3 = list5;
                    itemCategory2 = itemCategory3;
                    str6 = (String) aVarC.m(serialDescriptor, 2, r1.f29848a, str6);
                    i12 |= 4;
                    itemCategory3 = itemCategory2;
                    list5 = list3;
                    averageItemRating2 = averageItemRating;
                    break;
                case 3:
                    averageItemRating = averageItemRating2;
                    list3 = list5;
                    itemCategory2 = itemCategory3;
                    price2 = price2;
                    ItemId itemId = (ItemId) aVarC.n(serialDescriptor, 3, ItemId$$serializer.INSTANCE, strM205unboximpl != null ? ItemId.m197boximpl(strM205unboximpl) : null);
                    strM205unboximpl = itemId != null ? itemId.m205unboximpl() : null;
                    i12 |= 8;
                    itemCategory3 = itemCategory2;
                    list5 = list3;
                    averageItemRating2 = averageItemRating;
                    break;
                case 4:
                    averageItemRating = averageItemRating2;
                    list3 = list5;
                    itemCategory2 = itemCategory3;
                    price2 = (Price) aVarC.n(serialDescriptor, 4, Price$$serializer.INSTANCE, price2);
                    i12 |= 16;
                    itemCategory3 = itemCategory2;
                    list5 = list3;
                    averageItemRating2 = averageItemRating;
                    break;
                case 5:
                    averageItemRating = averageItemRating2;
                    list3 = list5;
                    itemCategory2 = itemCategory3;
                    price3 = (Price) aVarC.m(serialDescriptor, 5, Price$$serializer.INSTANCE, price3);
                    i12 |= 32;
                    itemCategory3 = itemCategory2;
                    list5 = list3;
                    averageItemRating2 = averageItemRating;
                    break;
                case 6:
                    averageItemRating = averageItemRating2;
                    list3 = list5;
                    itemCategory2 = itemCategory3;
                    picture2 = (Picture) aVarC.m(serialDescriptor, 6, Picture$$serializer.INSTANCE, picture2);
                    i12 |= 64;
                    itemCategory3 = itemCategory2;
                    list5 = list3;
                    averageItemRating2 = averageItemRating;
                    break;
                case 7:
                    averageItemRating = averageItemRating2;
                    list3 = list5;
                    itemCategory3 = (ItemCategory) aVarC.n(serialDescriptor, 7, ItemCategorySerializer.INSTANCE, itemCategory3);
                    i12 |= 128;
                    list5 = list3;
                    averageItemRating2 = averageItemRating;
                    break;
                case 8:
                    averageItemRating = averageItemRating2;
                    list5 = (List) aVarC.n(serialDescriptor, 8, (b) jVarArr[8].getValue(), list5);
                    i12 |= 256;
                    itemCategory3 = itemCategory3;
                    averageItemRating2 = averageItemRating;
                    break;
                case 9:
                    list = list5;
                    itemCategory = itemCategory3;
                    packagingOptions = (PackagingOptions) aVarC.n(serialDescriptor, 9, (b) jVarArr[9].getValue(), packagingOptions);
                    i12 |= 512;
                    itemCategory3 = itemCategory;
                    list5 = list;
                    break;
                case 10:
                    list = list5;
                    itemCategory = itemCategory3;
                    list4 = (List) aVarC.m(serialDescriptor, 10, (b) jVarArr[10].getValue(), list4);
                    i12 |= 1024;
                    itemCategory3 = itemCategory;
                    list5 = list;
                    break;
                case 11:
                    list = list5;
                    itemCategory = itemCategory3;
                    averageItemRating2 = (AverageItemRating) aVarC.m(serialDescriptor, 11, AverageItemRating$$serializer.INSTANCE, averageItemRating2);
                    i12 |= NewHope.SENDB_BYTES;
                    itemCategory3 = itemCategory;
                    list5 = list;
                    break;
                case 12:
                    list = list5;
                    itemCategory = itemCategory3;
                    manufacturerInformation = (ManufacturerInformation) aVarC.m(serialDescriptor, 12, ManufacturerInformation$$serializer.INSTANCE, manufacturerInformation);
                    i12 |= 4096;
                    itemCategory3 = itemCategory;
                    list5 = list;
                    break;
                case 13:
                    list = list5;
                    itemCategory = itemCategory3;
                    allergensInfo = (AllergensInfo) aVarC.m(serialDescriptor, 13, AllergensInfo$$serializer.INSTANCE, allergensInfo);
                    i12 |= 8192;
                    itemCategory3 = itemCategory;
                    list5 = list;
                    break;
                case 14:
                    list = list5;
                    itemCategory = itemCategory3;
                    dynamicPriceInfo = (DynamicPriceInfo) aVarC.m(serialDescriptor, 14, DynamicPriceInfo$$serializer.INSTANCE, dynamicPriceInfo);
                    i12 |= BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
                    itemCategory3 = itemCategory;
                    list5 = list;
                    break;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    list = list5;
                    itemCategory = itemCategory3;
                    price = (Price) aVarC.m(serialDescriptor, 15, Price$$serializer.INSTANCE, price);
                    i11 = 32768;
                    i12 |= i11;
                    itemCategory3 = itemCategory;
                    list5 = list;
                    break;
                case 16:
                    list = list5;
                    itemCategory = itemCategory3;
                    str = (String) aVarC.m(serialDescriptor, 16, r1.f29848a, str);
                    i11 = 65536;
                    i12 |= i11;
                    itemCategory3 = itemCategory;
                    list5 = list;
                    break;
                case 17:
                    list = list5;
                    itemCategory = itemCategory3;
                    str2 = (String) aVarC.m(serialDescriptor, 17, r1.f29848a, str2);
                    i11 = 131072;
                    i12 |= i11;
                    itemCategory3 = itemCategory;
                    list5 = list;
                    break;
                case 18:
                    list = list5;
                    itemCategory = itemCategory3;
                    str3 = (String) aVarC.m(serialDescriptor, 18, r1.f29848a, str3);
                    i11 = 262144;
                    i12 |= i11;
                    itemCategory3 = itemCategory;
                    list5 = list;
                    break;
                case 19:
                    itemCategory = itemCategory3;
                    list = list5;
                    str4 = (String) aVarC.m(serialDescriptor, 19, r1.f29848a, str4);
                    i11 = 524288;
                    i12 |= i11;
                    itemCategory3 = itemCategory;
                    list5 = list;
                    break;
                case 20:
                    zT = aVarC.t(serialDescriptor, 20);
                    i12 |= 1048576;
                    itemCategory3 = itemCategory3;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        AverageItemRating averageItemRating3 = averageItemRating2;
        List list6 = list4;
        List list7 = list5;
        ItemCategory itemCategory4 = itemCategory3;
        Picture picture3 = picture;
        String str7 = str5;
        String str8 = str6;
        aVarC.b(serialDescriptor);
        return new ManufacturerItemInformation(i12, picture3, str7, str8, strM205unboximpl, price2, price3, picture2, itemCategory4, list7, packagingOptions, list6, averageItemRating3, manufacturerInformation, allergensInfo, dynamicPriceInfo, price, str, str2, str3, str4, zT, null, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ManufacturerItemInformation value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        ManufacturerItemInformation.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
