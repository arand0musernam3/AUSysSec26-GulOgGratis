package com.app.tgtg.model.remote.item.response;

import c50.w;
import com.app.tgtg.model.remote.item.Ingredients;
import com.app.tgtg.model.remote.item.Ingredients$$serializer;
import com.app.tgtg.model.remote.item.ItemCardType;
import com.app.tgtg.model.remote.item.ItemCardType$$serializer;
import com.app.tgtg.model.remote.item.ItemSpecialReward;
import com.app.tgtg.model.remote.item.ItemSpecialReward$$serializer;
import com.app.tgtg.model.remote.item.MagicBagItemInformation;
import com.app.tgtg.model.remote.item.MagicBagItemInformation$$serializer;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.item.PickupInterval$$serializer;
import com.app.tgtg.model.remote.item.PickupLocation;
import com.app.tgtg.model.remote.item.PickupLocation$$serializer;
import com.app.tgtg.model.remote.item.StoreInformation;
import com.app.tgtg.model.remote.item.StoreInformation$$serializer;
import i90.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.c1;
import m90.d0;
import m90.e1;
import m90.g;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/item/response/Item.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/item/response/Item;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/item/response/Item;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/item/response/Item;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class Item$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final Item$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Item$$serializer item$$serializer = new Item$$serializer();
        INSTANCE = item$$serializer;
        $stable = 8;
        e1 e1Var = new e1("MAGIC_BAG", item$$serializer, 25);
        e1Var.j("onFavoriteChangedListener", true);
        e1Var.j("display_name", true);
        e1Var.j("display_description", true);
        e1Var.j("distance", true);
        e1Var.j("item", false);
        e1Var.j("items_available", true);
        e1Var.j("new_item", true);
        e1Var.j("pickup_interval", true);
        e1Var.j("pickup_location", true);
        e1Var.j("purchase_end", true);
        e1Var.j("sold_out_at", true);
        e1Var.j("store", true);
        e1Var.j("favorite", true);
        e1Var.j("subscribed_to_notification", true);
        e1Var.j("sharing_url", true);
        e1Var.j("user_purchase_limit", true);
        e1Var.j("next_sales_window_purchase_start", true);
        e1Var.j("item_type", true);
        e1Var.j("isSelected", true);
        e1Var.j("reservation_blocked_until", true);
        e1Var.j("item_tags", true);
        e1Var.j("item_card", true);
        e1Var.j("item_special_reward", true);
        e1Var.j("item_ingredients", true);
        e1Var.j("matches_filters", true);
        e1Var.k(new BasicItem$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("item_type"));
        descriptor = e1Var;
    }

    private Item$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = Item.$childSerializers;
        KSerializer kSerializerB = f0.B((KSerializer) jVarArr[0].getValue());
        r1 r1Var = r1.f29848a;
        KSerializer kSerializerB2 = f0.B(r1Var);
        g gVar = g.f29797a;
        KSerializer kSerializerB3 = f0.B(PickupInterval$$serializer.INSTANCE);
        KSerializer kSerializerB4 = f0.B(r1Var);
        KSerializer kSerializerB5 = f0.B(r1Var);
        KSerializer kSerializerB6 = f0.B(StoreInformation$$serializer.INSTANCE);
        KSerializer kSerializerB7 = f0.B(r1Var);
        KSerializer kSerializerB8 = f0.B(r1Var);
        KSerializer kSerializerB9 = f0.B(r1Var);
        KSerializer kSerializerB10 = f0.B((KSerializer) jVarArr[20].getValue());
        KSerializer kSerializerB11 = f0.B(ItemCardType$$serializer.INSTANCE);
        KSerializer kSerializerB12 = f0.B(ItemSpecialReward$$serializer.INSTANCE);
        KSerializer kSerializerB13 = f0.B(Ingredients$$serializer.INSTANCE);
        KSerializer kSerializerB14 = f0.B(gVar);
        l0 l0Var = l0.f29821a;
        return new KSerializer[]{kSerializerB, r1Var, kSerializerB2, v.f29868a, MagicBagItemInformation$$serializer.INSTANCE, l0Var, gVar, kSerializerB3, PickupLocation$$serializer.INSTANCE, kSerializerB4, kSerializerB5, kSerializerB6, gVar, gVar, kSerializerB7, l0Var, kSerializerB8, ItemTypeSerializer.INSTANCE, gVar, kSerializerB9, kSerializerB10, kSerializerB11, kSerializerB12, kSerializerB13, kSerializerB14};
    }

    @Override // i90.b
    @NotNull
    public final Item deserialize(@NotNull Decoder decoder) {
        PickupLocation pickupLocation;
        String str;
        int i11;
        List list;
        PickupLocation pickupLocation2;
        Function1 function1;
        List list2;
        PickupLocation pickupLocation3;
        PickupLocation pickupLocation4;
        String str2;
        int i12;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = Item.$childSerializers;
        List list3 = null;
        String str3 = null;
        ItemType itemType = null;
        String str4 = null;
        StoreInformation storeInformation = null;
        ItemSpecialReward itemSpecialReward = null;
        ItemCardType itemCardType = null;
        Ingredients ingredients = null;
        String str5 = null;
        String str6 = null;
        Boolean bool = null;
        String strU = null;
        Function1 function12 = null;
        String str7 = null;
        MagicBagItemInformation magicBagItemInformation = null;
        PickupInterval pickupInterval = null;
        double dY = 0.0d;
        boolean z11 = true;
        int iQ = 0;
        boolean zT = false;
        boolean zT2 = false;
        boolean zT3 = false;
        int iQ2 = 0;
        boolean zT4 = false;
        PickupLocation pickupLocation5 = null;
        String str8 = null;
        int i13 = 0;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    list = list3;
                    pickupLocation2 = pickupLocation5;
                    function1 = function12;
                    z11 = false;
                    list3 = list;
                    function12 = function1;
                    pickupLocation5 = pickupLocation2;
                    break;
                case 0:
                    list = list3;
                    pickupLocation2 = pickupLocation5;
                    function1 = (Function1) aVarC.m(serialDescriptor, 0, (b) jVarArr[0].getValue(), function12);
                    i13 |= 1;
                    str7 = str7;
                    str8 = str8;
                    list3 = list;
                    function12 = function1;
                    pickupLocation5 = pickupLocation2;
                    break;
                case 1:
                    list2 = list3;
                    pickupLocation3 = pickupLocation5;
                    strU = aVarC.u(serialDescriptor, 1);
                    i13 |= 2;
                    pickupLocation5 = pickupLocation3;
                    list3 = list2;
                    break;
                case 2:
                    list2 = list3;
                    pickupLocation4 = pickupLocation5;
                    str2 = str8;
                    str7 = (String) aVarC.m(serialDescriptor, 2, r1.f29848a, str7);
                    i13 |= 4;
                    pickupLocation5 = pickupLocation4;
                    str8 = str2;
                    list3 = list2;
                    break;
                case 3:
                    list2 = list3;
                    pickupLocation3 = pickupLocation5;
                    dY = aVarC.y(serialDescriptor, 3);
                    i13 |= 8;
                    pickupLocation5 = pickupLocation3;
                    list3 = list2;
                    break;
                case 4:
                    list2 = list3;
                    pickupLocation4 = pickupLocation5;
                    str2 = str8;
                    magicBagItemInformation = (MagicBagItemInformation) aVarC.n(serialDescriptor, 4, MagicBagItemInformation$$serializer.INSTANCE, magicBagItemInformation);
                    i13 |= 16;
                    pickupLocation5 = pickupLocation4;
                    str8 = str2;
                    list3 = list2;
                    break;
                case 5:
                    list2 = list3;
                    pickupLocation3 = pickupLocation5;
                    iQ = aVarC.q(serialDescriptor, 5);
                    i13 |= 32;
                    pickupLocation5 = pickupLocation3;
                    list3 = list2;
                    break;
                case 6:
                    list2 = list3;
                    pickupLocation3 = pickupLocation5;
                    zT = aVarC.t(serialDescriptor, 6);
                    i13 |= 64;
                    pickupLocation5 = pickupLocation3;
                    list3 = list2;
                    break;
                case 7:
                    list2 = list3;
                    str2 = str8;
                    pickupLocation4 = pickupLocation5;
                    pickupInterval = (PickupInterval) aVarC.m(serialDescriptor, 7, PickupInterval$$serializer.INSTANCE, pickupInterval);
                    i13 |= 128;
                    pickupLocation5 = pickupLocation4;
                    str8 = str2;
                    list3 = list2;
                    break;
                case 8:
                    list2 = list3;
                    str2 = str8;
                    pickupLocation5 = (PickupLocation) aVarC.n(serialDescriptor, 8, PickupLocation$$serializer.INSTANCE, pickupLocation5);
                    i13 |= 256;
                    str8 = str2;
                    list3 = list2;
                    break;
                case 9:
                    pickupLocation3 = pickupLocation5;
                    list2 = list3;
                    str8 = (String) aVarC.m(serialDescriptor, 9, r1.f29848a, str8);
                    i13 |= 512;
                    pickupLocation5 = pickupLocation3;
                    list3 = list2;
                    break;
                case 10:
                    pickupLocation = pickupLocation5;
                    str = str8;
                    str4 = (String) aVarC.m(serialDescriptor, 10, r1.f29848a, str4);
                    i13 |= 1024;
                    pickupLocation5 = pickupLocation;
                    str8 = str;
                    break;
                case 11:
                    pickupLocation = pickupLocation5;
                    str = str8;
                    storeInformation = (StoreInformation) aVarC.m(serialDescriptor, 11, StoreInformation$$serializer.INSTANCE, storeInformation);
                    i13 |= NewHope.SENDB_BYTES;
                    pickupLocation5 = pickupLocation;
                    str8 = str;
                    break;
                case 12:
                    pickupLocation2 = pickupLocation5;
                    zT2 = aVarC.t(serialDescriptor, 12);
                    i13 |= 4096;
                    pickupLocation5 = pickupLocation2;
                    break;
                case 13:
                    pickupLocation2 = pickupLocation5;
                    zT3 = aVarC.t(serialDescriptor, 13);
                    i13 |= 8192;
                    pickupLocation5 = pickupLocation2;
                    break;
                case 14:
                    pickupLocation = pickupLocation5;
                    str = str8;
                    str5 = (String) aVarC.m(serialDescriptor, 14, r1.f29848a, str5);
                    i13 |= BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
                    pickupLocation5 = pickupLocation;
                    str8 = str;
                    break;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    pickupLocation2 = pickupLocation5;
                    iQ2 = aVarC.q(serialDescriptor, 15);
                    i12 = 32768;
                    i13 |= i12;
                    pickupLocation5 = pickupLocation2;
                    break;
                case 16:
                    pickupLocation = pickupLocation5;
                    str = str8;
                    str6 = (String) aVarC.m(serialDescriptor, 16, r1.f29848a, str6);
                    i11 = 65536;
                    i13 |= i11;
                    pickupLocation5 = pickupLocation;
                    str8 = str;
                    break;
                case 17:
                    pickupLocation = pickupLocation5;
                    str = str8;
                    itemType = (ItemType) aVarC.n(serialDescriptor, 17, ItemTypeSerializer.INSTANCE, itemType);
                    i11 = 131072;
                    i13 |= i11;
                    pickupLocation5 = pickupLocation;
                    str8 = str;
                    break;
                case 18:
                    pickupLocation2 = pickupLocation5;
                    zT4 = aVarC.t(serialDescriptor, 18);
                    i12 = 262144;
                    i13 |= i12;
                    pickupLocation5 = pickupLocation2;
                    break;
                case 19:
                    pickupLocation = pickupLocation5;
                    str = str8;
                    str3 = (String) aVarC.m(serialDescriptor, 19, r1.f29848a, str3);
                    i11 = 524288;
                    i13 |= i11;
                    pickupLocation5 = pickupLocation;
                    str8 = str;
                    break;
                case 20:
                    pickupLocation = pickupLocation5;
                    str = str8;
                    list3 = (List) aVarC.m(serialDescriptor, 20, (b) jVarArr[20].getValue(), list3);
                    i11 = 1048576;
                    i13 |= i11;
                    pickupLocation5 = pickupLocation;
                    str8 = str;
                    break;
                case 21:
                    pickupLocation = pickupLocation5;
                    str = str8;
                    itemCardType = (ItemCardType) aVarC.m(serialDescriptor, 21, ItemCardType$$serializer.INSTANCE, itemCardType);
                    i11 = 2097152;
                    i13 |= i11;
                    pickupLocation5 = pickupLocation;
                    str8 = str;
                    break;
                case 22:
                    pickupLocation = pickupLocation5;
                    str = str8;
                    itemSpecialReward = (ItemSpecialReward) aVarC.m(serialDescriptor, 22, ItemSpecialReward$$serializer.INSTANCE, itemSpecialReward);
                    i11 = 4194304;
                    i13 |= i11;
                    pickupLocation5 = pickupLocation;
                    str8 = str;
                    break;
                case 23:
                    pickupLocation = pickupLocation5;
                    str = str8;
                    ingredients = (Ingredients) aVarC.m(serialDescriptor, 23, Ingredients$$serializer.INSTANCE, ingredients);
                    i11 = 8388608;
                    i13 |= i11;
                    pickupLocation5 = pickupLocation;
                    str8 = str;
                    break;
                case 24:
                    pickupLocation = pickupLocation5;
                    str = str8;
                    bool = (Boolean) aVarC.m(serialDescriptor, 24, g.f29797a, bool);
                    i11 = 16777216;
                    i13 |= i11;
                    pickupLocation5 = pickupLocation;
                    str8 = str;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        List list4 = list3;
        Function1 function13 = function12;
        String str9 = str7;
        aVarC.b(serialDescriptor);
        ItemCardType itemCardType2 = itemCardType;
        String str10 = strU;
        PickupInterval pickupInterval2 = pickupInterval;
        String str11 = str5;
        return new Item(i13, function13, str10, str9, dY, magicBagItemInformation, iQ, zT, pickupInterval2, pickupLocation5, str8, str4, storeInformation, zT2, zT3, str11, iQ2, str6, itemType, zT4, str3, list4, itemCardType2, itemSpecialReward, ingredients, bool, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Item value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        Item.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
