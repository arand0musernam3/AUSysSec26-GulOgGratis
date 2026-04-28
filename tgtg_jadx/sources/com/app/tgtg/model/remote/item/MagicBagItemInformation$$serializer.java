package com.app.tgtg.model.remote.item;

import c50.w;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.ItemId$$serializer;
import com.app.tgtg.model.remote.item.response.AllergensInfo;
import com.app.tgtg.model.remote.item.response.AllergensInfo$$serializer;
import com.app.tgtg.model.remote.item.response.PackagingOptions;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/item/MagicBagItemInformation.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/item/MagicBagItemInformation;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/item/MagicBagItemInformation;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/item/MagicBagItemInformation;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class MagicBagItemInformation$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final MagicBagItemInformation$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        MagicBagItemInformation$$serializer magicBagItemInformation$$serializer = new MagicBagItemInformation$$serializer();
        INSTANCE = magicBagItemInformation$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.item.MagicBagItemInformation", magicBagItemInformation$$serializer, 20);
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
        e1Var.j("allergens_info", true);
        e1Var.j("price_info", true);
        e1Var.j("price_recently_became_dynamic", true);
        e1Var.j("smiley_report_link", true);
        e1Var.j("sold_out_at_dynamic_item_price", true);
        e1Var.j("description_translated", true);
        e1Var.j("collection_info", true);
        e1Var.j("is_edible", true);
        descriptor = e1Var;
    }

    private MagicBagItemInformation$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = MagicBagItemInformation.$childSerializers;
        Picture$$serializer picture$$serializer = Picture$$serializer.INSTANCE;
        r1 r1Var = r1.f29848a;
        Price$$serializer price$$serializer = Price$$serializer.INSTANCE;
        g gVar = g.f29797a;
        return new KSerializer[]{f0.B(picture$$serializer), f0.B(r1Var), f0.B(r1Var), ItemId$$serializer.INSTANCE, price$$serializer, f0.B(price$$serializer), f0.B(picture$$serializer), ItemCategorySerializer.INSTANCE, jVarArr[8].getValue(), jVarArr[9].getValue(), f0.B((KSerializer) jVarArr[10].getValue()), f0.B(AverageItemRating$$serializer.INSTANCE), f0.B(AllergensInfo$$serializer.INSTANCE), f0.B(DynamicPriceInfo$$serializer.INSTANCE), f0.B(gVar), f0.B(r1Var), f0.B(price$$serializer), f0.B(r1Var), f0.B(r1Var), gVar};
    }

    @Override // i90.b
    @NotNull
    public final MagicBagItemInformation deserialize(@NotNull Decoder decoder) {
        ItemCategory itemCategory;
        Picture picture;
        AverageItemRating averageItemRating;
        List list;
        ItemCategory itemCategory2;
        Picture picture2;
        int i11;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = MagicBagItemInformation.$childSerializers;
        AverageItemRating averageItemRating2 = null;
        List list2 = null;
        PackagingOptions packagingOptions = null;
        List list3 = null;
        AllergensInfo allergensInfo = null;
        ItemCategory itemCategory3 = null;
        int i12 = 0;
        Boolean bool = null;
        String str = null;
        Price price = null;
        DynamicPriceInfo dynamicPriceInfo = null;
        String str2 = null;
        String str3 = null;
        Picture picture3 = null;
        boolean z11 = true;
        String strM205unboximpl = null;
        Picture picture4 = null;
        String str4 = null;
        String str5 = null;
        Price price2 = null;
        Price price3 = null;
        boolean zT = false;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    itemCategory = itemCategory3;
                    picture = picture3;
                    z11 = false;
                    packagingOptions = packagingOptions;
                    list2 = list2;
                    picture3 = picture;
                    itemCategory3 = itemCategory;
                    break;
                case 0:
                    averageItemRating = averageItemRating2;
                    list = list2;
                    itemCategory2 = itemCategory3;
                    picture2 = picture3;
                    picture4 = (Picture) aVarC.m(serialDescriptor, 0, Picture$$serializer.INSTANCE, picture4);
                    i12 |= 1;
                    packagingOptions = packagingOptions;
                    list2 = list;
                    picture3 = picture2;
                    itemCategory3 = itemCategory2;
                    averageItemRating2 = averageItemRating;
                    break;
                case 1:
                    averageItemRating = averageItemRating2;
                    itemCategory2 = itemCategory3;
                    picture2 = picture3;
                    list = list2;
                    str4 = (String) aVarC.m(serialDescriptor, 1, r1.f29848a, str4);
                    i12 |= 2;
                    list2 = list;
                    picture3 = picture2;
                    itemCategory3 = itemCategory2;
                    averageItemRating2 = averageItemRating;
                    break;
                case 2:
                    averageItemRating = averageItemRating2;
                    itemCategory2 = itemCategory3;
                    picture2 = picture3;
                    str5 = (String) aVarC.m(serialDescriptor, 2, r1.f29848a, str5);
                    i12 |= 4;
                    picture3 = picture2;
                    itemCategory3 = itemCategory2;
                    averageItemRating2 = averageItemRating;
                    break;
                case 3:
                    averageItemRating = averageItemRating2;
                    itemCategory2 = itemCategory3;
                    picture2 = picture3;
                    price2 = price2;
                    ItemId itemId = (ItemId) aVarC.n(serialDescriptor, 3, ItemId$$serializer.INSTANCE, strM205unboximpl != null ? ItemId.m197boximpl(strM205unboximpl) : null);
                    strM205unboximpl = itemId != null ? itemId.m205unboximpl() : null;
                    i12 |= 8;
                    picture3 = picture2;
                    itemCategory3 = itemCategory2;
                    averageItemRating2 = averageItemRating;
                    break;
                case 4:
                    averageItemRating = averageItemRating2;
                    itemCategory2 = itemCategory3;
                    picture2 = picture3;
                    price2 = (Price) aVarC.n(serialDescriptor, 4, Price$$serializer.INSTANCE, price2);
                    i12 |= 16;
                    picture3 = picture2;
                    itemCategory3 = itemCategory2;
                    averageItemRating2 = averageItemRating;
                    break;
                case 5:
                    averageItemRating = averageItemRating2;
                    itemCategory2 = itemCategory3;
                    picture2 = picture3;
                    price3 = (Price) aVarC.m(serialDescriptor, 5, Price$$serializer.INSTANCE, price3);
                    i12 |= 32;
                    picture3 = picture2;
                    itemCategory3 = itemCategory2;
                    averageItemRating2 = averageItemRating;
                    break;
                case 6:
                    averageItemRating = averageItemRating2;
                    itemCategory2 = itemCategory3;
                    picture3 = (Picture) aVarC.m(serialDescriptor, 6, Picture$$serializer.INSTANCE, picture3);
                    i12 |= 64;
                    itemCategory3 = itemCategory2;
                    averageItemRating2 = averageItemRating;
                    break;
                case 7:
                    averageItemRating = averageItemRating2;
                    itemCategory3 = (ItemCategory) aVarC.n(serialDescriptor, 7, ItemCategorySerializer.INSTANCE, itemCategory3);
                    i12 |= 128;
                    picture3 = picture3;
                    averageItemRating2 = averageItemRating;
                    break;
                case 8:
                    itemCategory = itemCategory3;
                    picture = picture3;
                    list3 = (List) aVarC.n(serialDescriptor, 8, (b) jVarArr[8].getValue(), list3);
                    i12 |= 256;
                    picture3 = picture;
                    itemCategory3 = itemCategory;
                    break;
                case 9:
                    itemCategory = itemCategory3;
                    picture = picture3;
                    packagingOptions = (PackagingOptions) aVarC.n(serialDescriptor, 9, (b) jVarArr[9].getValue(), packagingOptions);
                    i12 |= 512;
                    picture3 = picture;
                    itemCategory3 = itemCategory;
                    break;
                case 10:
                    itemCategory = itemCategory3;
                    picture = picture3;
                    list2 = (List) aVarC.m(serialDescriptor, 10, (b) jVarArr[10].getValue(), list2);
                    i12 |= 1024;
                    picture3 = picture;
                    itemCategory3 = itemCategory;
                    break;
                case 11:
                    itemCategory = itemCategory3;
                    picture = picture3;
                    averageItemRating2 = (AverageItemRating) aVarC.m(serialDescriptor, 11, AverageItemRating$$serializer.INSTANCE, averageItemRating2);
                    i12 |= NewHope.SENDB_BYTES;
                    picture3 = picture;
                    itemCategory3 = itemCategory;
                    break;
                case 12:
                    itemCategory = itemCategory3;
                    picture = picture3;
                    allergensInfo = (AllergensInfo) aVarC.m(serialDescriptor, 12, AllergensInfo$$serializer.INSTANCE, allergensInfo);
                    i12 |= 4096;
                    picture3 = picture;
                    itemCategory3 = itemCategory;
                    break;
                case 13:
                    itemCategory = itemCategory3;
                    picture = picture3;
                    dynamicPriceInfo = (DynamicPriceInfo) aVarC.m(serialDescriptor, 13, DynamicPriceInfo$$serializer.INSTANCE, dynamicPriceInfo);
                    i12 |= 8192;
                    picture3 = picture;
                    itemCategory3 = itemCategory;
                    break;
                case 14:
                    itemCategory = itemCategory3;
                    picture = picture3;
                    bool = (Boolean) aVarC.m(serialDescriptor, 14, g.f29797a, bool);
                    i12 |= BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
                    picture3 = picture;
                    itemCategory3 = itemCategory;
                    break;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    itemCategory = itemCategory3;
                    picture = picture3;
                    str = (String) aVarC.m(serialDescriptor, 15, r1.f29848a, str);
                    i11 = 32768;
                    i12 |= i11;
                    picture3 = picture;
                    itemCategory3 = itemCategory;
                    break;
                case 16:
                    itemCategory = itemCategory3;
                    picture = picture3;
                    price = (Price) aVarC.m(serialDescriptor, 16, Price$$serializer.INSTANCE, price);
                    i11 = 65536;
                    i12 |= i11;
                    picture3 = picture;
                    itemCategory3 = itemCategory;
                    break;
                case 17:
                    itemCategory = itemCategory3;
                    picture = picture3;
                    str2 = (String) aVarC.m(serialDescriptor, 17, r1.f29848a, str2);
                    i11 = 131072;
                    i12 |= i11;
                    picture3 = picture;
                    itemCategory3 = itemCategory;
                    break;
                case 18:
                    picture = picture3;
                    itemCategory = itemCategory3;
                    str3 = (String) aVarC.m(serialDescriptor, 18, r1.f29848a, str3);
                    i11 = 262144;
                    i12 |= i11;
                    picture3 = picture;
                    itemCategory3 = itemCategory;
                    break;
                case 19:
                    zT = aVarC.t(serialDescriptor, 19);
                    i12 |= 524288;
                    picture3 = picture3;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        AverageItemRating averageItemRating3 = averageItemRating2;
        List list4 = list2;
        ItemCategory itemCategory4 = itemCategory3;
        Picture picture5 = picture3;
        Picture picture6 = picture4;
        String str6 = str4;
        String str7 = str5;
        aVarC.b(serialDescriptor);
        return new MagicBagItemInformation(i12, picture6, str6, str7, strM205unboximpl, price2, price3, picture5, itemCategory4, list3, packagingOptions, list4, averageItemRating3, allergensInfo, dynamicPriceInfo, bool, str, price, str2, str3, zT, null, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull MagicBagItemInformation value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        MagicBagItemInformation.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
