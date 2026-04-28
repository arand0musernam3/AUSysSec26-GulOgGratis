package com.app.tgtg.model.remote.item.response;

import c50.w;
import com.app.tgtg.model.remote.item.CharityItemInformation;
import com.app.tgtg.model.remote.item.CharityItemInformation$$serializer;
import com.app.tgtg.model.remote.item.Ingredients;
import com.app.tgtg.model.remote.item.Ingredients$$serializer;
import com.app.tgtg.model.remote.item.ItemCardType;
import com.app.tgtg.model.remote.item.ItemCardType$$serializer;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/item/response/CharityItem.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/item/response/CharityItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/item/response/CharityItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/item/response/CharityItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class CharityItem$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final CharityItem$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        CharityItem$$serializer charityItem$$serializer = new CharityItem$$serializer();
        INSTANCE = charityItem$$serializer;
        $stable = 8;
        e1 e1Var = new e1("CHARITY", charityItem$$serializer, 24);
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
        e1Var.j("item_ingredients", true);
        e1Var.j("matches_filters", true);
        e1Var.k(new BasicItem$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("item_type"));
        descriptor = e1Var;
    }

    private CharityItem$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = CharityItem.$childSerializers;
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
        KSerializer kSerializerB12 = f0.B(Ingredients$$serializer.INSTANCE);
        KSerializer kSerializerB13 = f0.B(gVar);
        l0 l0Var = l0.f29821a;
        return new KSerializer[]{kSerializerB, r1Var, kSerializerB2, v.f29868a, CharityItemInformation$$serializer.INSTANCE, l0Var, gVar, kSerializerB3, PickupLocation$$serializer.INSTANCE, kSerializerB4, kSerializerB5, kSerializerB6, gVar, gVar, kSerializerB7, l0Var, kSerializerB8, ItemTypeSerializer.INSTANCE, gVar, kSerializerB9, kSerializerB10, kSerializerB11, kSerializerB12, kSerializerB13};
    }

    @Override // i90.b
    @NotNull
    public final CharityItem deserialize(@NotNull Decoder decoder) {
        PickupInterval pickupInterval;
        PickupLocation pickupLocation;
        int i11;
        List list;
        PickupInterval pickupInterval2;
        Function1 function1;
        List list2;
        PickupInterval pickupInterval3;
        PickupInterval pickupInterval4;
        PickupLocation pickupLocation2;
        PickupInterval pickupInterval5;
        int i12;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = CharityItem.$childSerializers;
        PickupInterval pickupInterval6 = null;
        List list3 = null;
        String str = null;
        ItemType itemType = null;
        String str2 = null;
        StoreInformation storeInformation = null;
        Ingredients ingredients = null;
        ItemCardType itemCardType = null;
        Boolean bool = null;
        String str3 = null;
        String str4 = null;
        String strU = null;
        Function1 function12 = null;
        String str5 = null;
        CharityItemInformation charityItemInformation = null;
        double dY = 0.0d;
        int i13 = 0;
        boolean z11 = true;
        int iQ = 0;
        boolean zT = false;
        boolean zT2 = false;
        boolean zT3 = false;
        int iQ2 = 0;
        boolean zT4 = false;
        PickupLocation pickupLocation3 = null;
        String str6 = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    list = list3;
                    pickupInterval2 = pickupInterval6;
                    function1 = function12;
                    z11 = false;
                    list3 = list;
                    function12 = function1;
                    pickupInterval6 = pickupInterval2;
                    break;
                case 0:
                    list = list3;
                    pickupInterval2 = pickupInterval6;
                    function1 = (Function1) aVarC.m(serialDescriptor, 0, (b) jVarArr[0].getValue(), function12);
                    i13 |= 1;
                    str5 = str5;
                    pickupLocation3 = pickupLocation3;
                    list3 = list;
                    function12 = function1;
                    pickupInterval6 = pickupInterval2;
                    break;
                case 1:
                    list2 = list3;
                    pickupInterval3 = pickupInterval6;
                    strU = aVarC.u(serialDescriptor, 1);
                    i13 |= 2;
                    pickupInterval6 = pickupInterval3;
                    list3 = list2;
                    break;
                case 2:
                    list2 = list3;
                    pickupInterval4 = pickupInterval6;
                    pickupLocation2 = pickupLocation3;
                    str5 = (String) aVarC.m(serialDescriptor, 2, r1.f29848a, str5);
                    i13 |= 4;
                    pickupInterval6 = pickupInterval4;
                    pickupLocation3 = pickupLocation2;
                    list3 = list2;
                    break;
                case 3:
                    list2 = list3;
                    pickupInterval3 = pickupInterval6;
                    dY = aVarC.y(serialDescriptor, 3);
                    i13 |= 8;
                    pickupInterval6 = pickupInterval3;
                    list3 = list2;
                    break;
                case 4:
                    list2 = list3;
                    pickupLocation2 = pickupLocation3;
                    pickupInterval4 = pickupInterval6;
                    charityItemInformation = (CharityItemInformation) aVarC.n(serialDescriptor, 4, CharityItemInformation$$serializer.INSTANCE, charityItemInformation);
                    i13 |= 16;
                    pickupInterval6 = pickupInterval4;
                    pickupLocation3 = pickupLocation2;
                    list3 = list2;
                    break;
                case 5:
                    list2 = list3;
                    pickupInterval5 = pickupInterval6;
                    iQ = aVarC.q(serialDescriptor, 5);
                    i13 |= 32;
                    pickupInterval6 = pickupInterval5;
                    list3 = list2;
                    break;
                case 6:
                    list2 = list3;
                    pickupInterval5 = pickupInterval6;
                    zT = aVarC.t(serialDescriptor, 6);
                    i13 |= 64;
                    pickupInterval6 = pickupInterval5;
                    list3 = list2;
                    break;
                case 7:
                    list2 = list3;
                    pickupLocation2 = pickupLocation3;
                    pickupInterval6 = (PickupInterval) aVarC.m(serialDescriptor, 7, PickupInterval$$serializer.INSTANCE, pickupInterval6);
                    i13 |= 128;
                    pickupLocation3 = pickupLocation2;
                    list3 = list2;
                    break;
                case 8:
                    pickupInterval3 = pickupInterval6;
                    list2 = list3;
                    pickupLocation3 = (PickupLocation) aVarC.n(serialDescriptor, 8, PickupLocation$$serializer.INSTANCE, pickupLocation3);
                    i13 |= 256;
                    pickupInterval6 = pickupInterval3;
                    list3 = list2;
                    break;
                case 9:
                    pickupInterval = pickupInterval6;
                    pickupLocation = pickupLocation3;
                    str6 = (String) aVarC.m(serialDescriptor, 9, r1.f29848a, str6);
                    i13 |= 512;
                    pickupInterval6 = pickupInterval;
                    pickupLocation3 = pickupLocation;
                    break;
                case 10:
                    pickupInterval = pickupInterval6;
                    pickupLocation = pickupLocation3;
                    str2 = (String) aVarC.m(serialDescriptor, 10, r1.f29848a, str2);
                    i13 |= 1024;
                    pickupInterval6 = pickupInterval;
                    pickupLocation3 = pickupLocation;
                    break;
                case 11:
                    pickupInterval = pickupInterval6;
                    pickupLocation = pickupLocation3;
                    storeInformation = (StoreInformation) aVarC.m(serialDescriptor, 11, StoreInformation$$serializer.INSTANCE, storeInformation);
                    i13 |= NewHope.SENDB_BYTES;
                    pickupInterval6 = pickupInterval;
                    pickupLocation3 = pickupLocation;
                    break;
                case 12:
                    pickupInterval2 = pickupInterval6;
                    zT2 = aVarC.t(serialDescriptor, 12);
                    i13 |= 4096;
                    pickupInterval6 = pickupInterval2;
                    break;
                case 13:
                    pickupInterval2 = pickupInterval6;
                    zT3 = aVarC.t(serialDescriptor, 13);
                    i13 |= 8192;
                    pickupInterval6 = pickupInterval2;
                    break;
                case 14:
                    pickupInterval = pickupInterval6;
                    pickupLocation = pickupLocation3;
                    str3 = (String) aVarC.m(serialDescriptor, 14, r1.f29848a, str3);
                    i13 |= BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
                    pickupInterval6 = pickupInterval;
                    pickupLocation3 = pickupLocation;
                    break;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    pickupInterval2 = pickupInterval6;
                    iQ2 = aVarC.q(serialDescriptor, 15);
                    i12 = 32768;
                    i13 |= i12;
                    pickupInterval6 = pickupInterval2;
                    break;
                case 16:
                    pickupInterval = pickupInterval6;
                    pickupLocation = pickupLocation3;
                    str4 = (String) aVarC.m(serialDescriptor, 16, r1.f29848a, str4);
                    i11 = 65536;
                    i13 |= i11;
                    pickupInterval6 = pickupInterval;
                    pickupLocation3 = pickupLocation;
                    break;
                case 17:
                    pickupInterval = pickupInterval6;
                    pickupLocation = pickupLocation3;
                    itemType = (ItemType) aVarC.n(serialDescriptor, 17, ItemTypeSerializer.INSTANCE, itemType);
                    i11 = 131072;
                    i13 |= i11;
                    pickupInterval6 = pickupInterval;
                    pickupLocation3 = pickupLocation;
                    break;
                case 18:
                    pickupInterval2 = pickupInterval6;
                    zT4 = aVarC.t(serialDescriptor, 18);
                    i12 = 262144;
                    i13 |= i12;
                    pickupInterval6 = pickupInterval2;
                    break;
                case 19:
                    pickupInterval = pickupInterval6;
                    pickupLocation = pickupLocation3;
                    str = (String) aVarC.m(serialDescriptor, 19, r1.f29848a, str);
                    i11 = 524288;
                    i13 |= i11;
                    pickupInterval6 = pickupInterval;
                    pickupLocation3 = pickupLocation;
                    break;
                case 20:
                    pickupInterval = pickupInterval6;
                    pickupLocation = pickupLocation3;
                    list3 = (List) aVarC.m(serialDescriptor, 20, (b) jVarArr[20].getValue(), list3);
                    i11 = 1048576;
                    i13 |= i11;
                    pickupInterval6 = pickupInterval;
                    pickupLocation3 = pickupLocation;
                    break;
                case 21:
                    pickupInterval = pickupInterval6;
                    pickupLocation = pickupLocation3;
                    itemCardType = (ItemCardType) aVarC.m(serialDescriptor, 21, ItemCardType$$serializer.INSTANCE, itemCardType);
                    i11 = 2097152;
                    i13 |= i11;
                    pickupInterval6 = pickupInterval;
                    pickupLocation3 = pickupLocation;
                    break;
                case 22:
                    pickupInterval = pickupInterval6;
                    pickupLocation = pickupLocation3;
                    ingredients = (Ingredients) aVarC.m(serialDescriptor, 22, Ingredients$$serializer.INSTANCE, ingredients);
                    i11 = 4194304;
                    i13 |= i11;
                    pickupInterval6 = pickupInterval;
                    pickupLocation3 = pickupLocation;
                    break;
                case 23:
                    pickupInterval = pickupInterval6;
                    pickupLocation = pickupLocation3;
                    bool = (Boolean) aVarC.m(serialDescriptor, 23, g.f29797a, bool);
                    i11 = 8388608;
                    i13 |= i11;
                    pickupInterval6 = pickupInterval;
                    pickupLocation3 = pickupLocation;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        PickupInterval pickupInterval7 = pickupInterval6;
        PickupLocation pickupLocation4 = pickupLocation3;
        Function1 function13 = function12;
        String str7 = str5;
        aVarC.b(serialDescriptor);
        return new CharityItem(i13, function13, strU, str7, dY, charityItemInformation, iQ, zT, pickupInterval7, pickupLocation4, str6, str2, storeInformation, zT2, zT3, str3, iQ2, str4, itemType, zT4, str, list3, itemCardType, ingredients, bool, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull CharityItem value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        CharityItem.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
