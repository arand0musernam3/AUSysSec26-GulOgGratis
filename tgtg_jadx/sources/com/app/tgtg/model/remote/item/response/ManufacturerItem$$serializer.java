package com.app.tgtg.model.remote.item.response;

import c50.w;
import com.app.tgtg.model.remote.item.Ingredients;
import com.app.tgtg.model.remote.item.Ingredients$$serializer;
import com.app.tgtg.model.remote.item.ItemCardType;
import com.app.tgtg.model.remote.item.ItemCardType$$serializer;
import com.app.tgtg.model.remote.item.ManufacturerItemInformation;
import com.app.tgtg.model.remote.item.ManufacturerItemInformation$$serializer;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/item/response/ManufacturerItem.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/item/response/ManufacturerItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/item/response/ManufacturerItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/item/response/ManufacturerItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class ManufacturerItem$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final ManufacturerItem$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ManufacturerItem$$serializer manufacturerItem$$serializer = new ManufacturerItem$$serializer();
        INSTANCE = manufacturerItem$$serializer;
        $stable = 8;
        e1 e1Var = new e1("MANUFACTURER", manufacturerItem$$serializer, 22);
        e1Var.j("onFavoriteChangedListener", true);
        e1Var.j("item", false);
        e1Var.j("store", true);
        e1Var.j("display_name", true);
        e1Var.j("pickup_location", true);
        e1Var.j("pickup_interval", false);
        e1Var.j("items_available", true);
        e1Var.j("distance", true);
        e1Var.j("favorite", true);
        e1Var.j("subscribed_to_notification", true);
        e1Var.j("in_sales_window", true);
        e1Var.j("purchase_end", true);
        e1Var.j("sold_out_at", true);
        e1Var.j("sharing_url", true);
        e1Var.j("user_purchase_limit", true);
        e1Var.j("next_sales_window_purchase_start", true);
        e1Var.j("item_type", true);
        e1Var.j("new_item", true);
        e1Var.j("item_tags", true);
        e1Var.j("item_card", true);
        e1Var.j("item_ingredients", true);
        e1Var.j("matches_filters", true);
        e1Var.k(new BasicItem$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("item_type"));
        descriptor = e1Var;
    }

    private ManufacturerItem$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = ManufacturerItem.$childSerializers;
        KSerializer kSerializerB = f0.B((KSerializer) jVarArr[0].getValue());
        KSerializer kSerializerB2 = f0.B(StoreInformation$$serializer.INSTANCE);
        r1 r1Var = r1.f29848a;
        KSerializer kSerializerB3 = f0.B(PickupInterval$$serializer.INSTANCE);
        g gVar = g.f29797a;
        KSerializer kSerializerB4 = f0.B(gVar);
        KSerializer kSerializerB5 = f0.B(r1Var);
        KSerializer kSerializerB6 = f0.B(r1Var);
        KSerializer kSerializerB7 = f0.B(r1Var);
        KSerializer kSerializerB8 = f0.B(r1Var);
        KSerializer kSerializerB9 = f0.B((KSerializer) jVarArr[18].getValue());
        KSerializer kSerializerB10 = f0.B(ItemCardType$$serializer.INSTANCE);
        KSerializer kSerializerB11 = f0.B(Ingredients$$serializer.INSTANCE);
        KSerializer kSerializerB12 = f0.B(gVar);
        l0 l0Var = l0.f29821a;
        return new KSerializer[]{kSerializerB, ManufacturerItemInformation$$serializer.INSTANCE, kSerializerB2, r1Var, PickupLocation$$serializer.INSTANCE, kSerializerB3, l0Var, v.f29868a, gVar, gVar, kSerializerB4, kSerializerB5, kSerializerB6, kSerializerB7, l0Var, kSerializerB8, ItemTypeSerializer.INSTANCE, gVar, kSerializerB9, kSerializerB10, kSerializerB11, kSerializerB12};
    }

    @Override // i90.b
    @NotNull
    public final ManufacturerItem deserialize(@NotNull Decoder decoder) {
        StoreInformation storeInformation;
        PickupLocation pickupLocation;
        int i11;
        ItemCardType itemCardType;
        PickupLocation pickupLocation2;
        Function1 function1;
        PickupLocation pickupLocation3;
        StoreInformation storeInformation2;
        StoreInformation storeInformation3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = ManufacturerItem.$childSerializers;
        Boolean bool = null;
        ItemCardType itemCardType2 = null;
        List list = null;
        ItemType itemType = null;
        String str = null;
        String str2 = null;
        Boolean bool2 = null;
        StoreInformation storeInformation4 = null;
        Ingredients ingredients = null;
        PickupLocation pickupLocation4 = null;
        PickupInterval pickupInterval = null;
        String strU = null;
        Function1 function12 = null;
        ManufacturerItemInformation manufacturerItemInformation = null;
        double dY = 0.0d;
        int i12 = 0;
        boolean z11 = true;
        int iQ = 0;
        boolean zT = false;
        boolean zT2 = false;
        int iQ2 = 0;
        boolean zT3 = false;
        String str3 = null;
        String str4 = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    itemCardType = itemCardType2;
                    pickupLocation2 = pickupLocation4;
                    function1 = function12;
                    z11 = false;
                    list = list;
                    pickupLocation4 = pickupLocation2;
                    function12 = function1;
                    itemCardType2 = itemCardType;
                    break;
                case 0:
                    itemCardType = itemCardType2;
                    pickupLocation2 = pickupLocation4;
                    function1 = (Function1) aVarC.m(serialDescriptor, 0, (b) jVarArr[0].getValue(), function12);
                    i12 |= 1;
                    list = list;
                    storeInformation4 = storeInformation4;
                    pickupLocation4 = pickupLocation2;
                    function12 = function1;
                    itemCardType2 = itemCardType;
                    break;
                case 1:
                    itemCardType = itemCardType2;
                    pickupLocation3 = pickupLocation4;
                    manufacturerItemInformation = (ManufacturerItemInformation) aVarC.n(serialDescriptor, 1, ManufacturerItemInformation$$serializer.INSTANCE, manufacturerItemInformation);
                    i12 |= 2;
                    storeInformation4 = storeInformation4;
                    pickupLocation4 = pickupLocation3;
                    itemCardType2 = itemCardType;
                    break;
                case 2:
                    itemCardType = itemCardType2;
                    pickupLocation3 = pickupLocation4;
                    storeInformation4 = (StoreInformation) aVarC.m(serialDescriptor, 2, StoreInformation$$serializer.INSTANCE, storeInformation4);
                    i12 |= 4;
                    pickupLocation4 = pickupLocation3;
                    itemCardType2 = itemCardType;
                    break;
                case 3:
                    itemCardType = itemCardType2;
                    storeInformation2 = storeInformation4;
                    strU = aVarC.u(serialDescriptor, 3);
                    i12 |= 8;
                    storeInformation4 = storeInformation2;
                    itemCardType2 = itemCardType;
                    break;
                case 4:
                    storeInformation2 = storeInformation4;
                    itemCardType = itemCardType2;
                    pickupLocation4 = (PickupLocation) aVarC.n(serialDescriptor, 4, PickupLocation$$serializer.INSTANCE, pickupLocation4);
                    i12 |= 16;
                    storeInformation4 = storeInformation2;
                    itemCardType2 = itemCardType;
                    break;
                case 5:
                    storeInformation = storeInformation4;
                    pickupLocation = pickupLocation4;
                    pickupInterval = (PickupInterval) aVarC.m(serialDescriptor, 5, PickupInterval$$serializer.INSTANCE, pickupInterval);
                    i12 |= 32;
                    storeInformation4 = storeInformation;
                    pickupLocation4 = pickupLocation;
                    break;
                case 6:
                    storeInformation3 = storeInformation4;
                    iQ = aVarC.q(serialDescriptor, 6);
                    i12 |= 64;
                    storeInformation4 = storeInformation3;
                    break;
                case 7:
                    storeInformation3 = storeInformation4;
                    dY = aVarC.y(serialDescriptor, 7);
                    i12 |= 128;
                    storeInformation4 = storeInformation3;
                    break;
                case 8:
                    storeInformation3 = storeInformation4;
                    zT = aVarC.t(serialDescriptor, 8);
                    i12 |= 256;
                    storeInformation4 = storeInformation3;
                    break;
                case 9:
                    storeInformation3 = storeInformation4;
                    zT2 = aVarC.t(serialDescriptor, 9);
                    i12 |= 512;
                    storeInformation4 = storeInformation3;
                    break;
                case 10:
                    storeInformation = storeInformation4;
                    pickupLocation = pickupLocation4;
                    bool = (Boolean) aVarC.m(serialDescriptor, 10, g.f29797a, bool);
                    i12 |= 1024;
                    storeInformation4 = storeInformation;
                    pickupLocation4 = pickupLocation;
                    break;
                case 11:
                    storeInformation = storeInformation4;
                    pickupLocation = pickupLocation4;
                    str3 = (String) aVarC.m(serialDescriptor, 11, r1.f29848a, str3);
                    i12 |= NewHope.SENDB_BYTES;
                    storeInformation4 = storeInformation;
                    pickupLocation4 = pickupLocation;
                    break;
                case 12:
                    storeInformation = storeInformation4;
                    pickupLocation = pickupLocation4;
                    str4 = (String) aVarC.m(serialDescriptor, 12, r1.f29848a, str4);
                    i12 |= 4096;
                    storeInformation4 = storeInformation;
                    pickupLocation4 = pickupLocation;
                    break;
                case 13:
                    storeInformation = storeInformation4;
                    pickupLocation = pickupLocation4;
                    str = (String) aVarC.m(serialDescriptor, 13, r1.f29848a, str);
                    i12 |= 8192;
                    storeInformation4 = storeInformation;
                    pickupLocation4 = pickupLocation;
                    break;
                case 14:
                    storeInformation3 = storeInformation4;
                    iQ2 = aVarC.q(serialDescriptor, 14);
                    i12 |= BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
                    storeInformation4 = storeInformation3;
                    break;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    storeInformation = storeInformation4;
                    pickupLocation = pickupLocation4;
                    str2 = (String) aVarC.m(serialDescriptor, 15, r1.f29848a, str2);
                    i11 = 32768;
                    i12 |= i11;
                    storeInformation4 = storeInformation;
                    pickupLocation4 = pickupLocation;
                    break;
                case 16:
                    storeInformation = storeInformation4;
                    pickupLocation = pickupLocation4;
                    itemType = (ItemType) aVarC.n(serialDescriptor, 16, ItemTypeSerializer.INSTANCE, itemType);
                    i11 = 65536;
                    i12 |= i11;
                    storeInformation4 = storeInformation;
                    pickupLocation4 = pickupLocation;
                    break;
                case 17:
                    storeInformation3 = storeInformation4;
                    zT3 = aVarC.t(serialDescriptor, 17);
                    i12 |= 131072;
                    storeInformation4 = storeInformation3;
                    break;
                case 18:
                    storeInformation = storeInformation4;
                    pickupLocation = pickupLocation4;
                    list = (List) aVarC.m(serialDescriptor, 18, (b) jVarArr[18].getValue(), list);
                    i11 = 262144;
                    i12 |= i11;
                    storeInformation4 = storeInformation;
                    pickupLocation4 = pickupLocation;
                    break;
                case 19:
                    storeInformation = storeInformation4;
                    pickupLocation = pickupLocation4;
                    itemCardType2 = (ItemCardType) aVarC.m(serialDescriptor, 19, ItemCardType$$serializer.INSTANCE, itemCardType2);
                    i11 = 524288;
                    i12 |= i11;
                    storeInformation4 = storeInformation;
                    pickupLocation4 = pickupLocation;
                    break;
                case 20:
                    storeInformation = storeInformation4;
                    pickupLocation = pickupLocation4;
                    ingredients = (Ingredients) aVarC.m(serialDescriptor, 20, Ingredients$$serializer.INSTANCE, ingredients);
                    i11 = 1048576;
                    i12 |= i11;
                    storeInformation4 = storeInformation;
                    pickupLocation4 = pickupLocation;
                    break;
                case 21:
                    storeInformation = storeInformation4;
                    pickupLocation = pickupLocation4;
                    bool2 = (Boolean) aVarC.m(serialDescriptor, 21, g.f29797a, bool2);
                    i11 = 2097152;
                    i12 |= i11;
                    storeInformation4 = storeInformation;
                    pickupLocation4 = pickupLocation;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        ItemCardType itemCardType3 = itemCardType2;
        PickupLocation pickupLocation5 = pickupLocation4;
        Function1 function13 = function12;
        ManufacturerItemInformation manufacturerItemInformation2 = manufacturerItemInformation;
        aVarC.b(serialDescriptor);
        return new ManufacturerItem(i12, function13, manufacturerItemInformation2, storeInformation4, strU, pickupLocation5, pickupInterval, iQ, dY, zT, zT2, bool, str3, str4, str, iQ2, str2, itemType, zT3, list, itemCardType3, ingredients, bool2, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ManufacturerItem value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        ManufacturerItem.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
