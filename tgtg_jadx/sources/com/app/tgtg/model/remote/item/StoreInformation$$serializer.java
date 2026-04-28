package com.app.tgtg.model.remote.item;

import c50.w;
import com.app.tgtg.model.remote.StoreId;
import com.app.tgtg.model.remote.StoreId$$serializer;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/item/StoreInformation.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/item/StoreInformation;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/item/StoreInformation;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/item/StoreInformation;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class StoreInformation$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final StoreInformation$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        StoreInformation$$serializer storeInformation$$serializer = new StoreInformation$$serializer();
        INSTANCE = storeInformation$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.item.StoreInformation", storeInformation$$serializer, 22);
        e1Var.j("store_id", true);
        e1Var.j("store_name", true);
        e1Var.j("branch", true);
        e1Var.j("tax_identifier", true);
        e1Var.j("website", true);
        e1Var.j("store_location", true);
        e1Var.j("logo_picture", true);
        e1Var.j("store_time_zone", true);
        e1Var.j("hidden", true);
        e1Var.j("items", true);
        e1Var.j("milestones", true);
        e1Var.j("distance", true);
        e1Var.j("cover_picture", true);
        e1Var.j("is_manufacturer", true);
        e1Var.j("description", true);
        e1Var.j("email", true);
        e1Var.j("phone_number", true);
        e1Var.j("delivery_method", true);
        e1Var.j("store_legal_information", true);
        e1Var.j("local_hero", true);
        e1Var.j("is_local_hero", true);
        e1Var.j("directions", true);
        descriptor = e1Var;
    }

    private StoreInformation$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = StoreInformation.$childSerializers;
        KSerializer kSerializerB = f0.B(StoreId$$serializer.INSTANCE);
        r1 r1Var = r1.f29848a;
        KSerializer kSerializerB2 = f0.B(r1Var);
        KSerializer kSerializerB3 = f0.B(r1Var);
        KSerializer kSerializerB4 = f0.B(r1Var);
        KSerializer kSerializerB5 = f0.B(r1Var);
        KSerializer kSerializerB6 = f0.B(StoreLocation$$serializer.INSTANCE);
        Picture$$serializer picture$$serializer = Picture$$serializer.INSTANCE;
        KSerializer kSerializerB7 = f0.B(picture$$serializer);
        KSerializer kSerializerB8 = f0.B(r1Var);
        KSerializer kSerializerB9 = f0.B((KSerializer) jVarArr[9].getValue());
        KSerializer kSerializerB10 = f0.B((KSerializer) jVarArr[10].getValue());
        KSerializer kSerializerB11 = f0.B(picture$$serializer);
        KSerializer kSerializerB12 = f0.B(r1Var);
        KSerializer kSerializerB13 = f0.B(r1Var);
        KSerializer kSerializerB14 = f0.B(r1Var);
        KSerializer kSerializerB15 = f0.B(DeliveryMethodSerializer.INSTANCE);
        KSerializer kSerializerB16 = f0.B(StoreLegalInformation$$serializer.INSTANCE);
        KSerializer kSerializerB17 = f0.B(LocalHero$$serializer.INSTANCE);
        KSerializer kSerializerB18 = f0.B(r1Var);
        g gVar = g.f29797a;
        return new KSerializer[]{kSerializerB, kSerializerB2, kSerializerB3, kSerializerB4, kSerializerB5, kSerializerB6, kSerializerB7, kSerializerB8, gVar, kSerializerB9, kSerializerB10, v.f29868a, kSerializerB11, gVar, kSerializerB12, kSerializerB13, kSerializerB14, kSerializerB15, kSerializerB16, kSerializerB17, gVar, kSerializerB18};
    }

    @Override // i90.b
    @NotNull
    public final StoreInformation deserialize(@NotNull Decoder decoder) {
        Picture picture;
        StoreLocation storeLocation;
        int i11;
        String str;
        Picture picture2;
        StoreLocation storeLocation2;
        String str2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = StoreInformation.$childSerializers;
        double dY = 0.0d;
        String str3 = null;
        Picture picture3 = null;
        List list = null;
        List list2 = null;
        String str4 = null;
        Picture picture4 = null;
        String str5 = null;
        int i12 = 0;
        String str6 = null;
        DeliveryMethod deliveryMethod = null;
        StoreLegalInformation storeLegalInformation = null;
        LocalHero localHero = null;
        String str7 = null;
        StoreLocation storeLocation3 = null;
        boolean z11 = true;
        String strM277unboximpl = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        boolean zT = false;
        boolean zT2 = false;
        boolean zT3 = false;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    picture3 = picture3;
                    storeLocation3 = storeLocation3;
                    break;
                case 0:
                    str = str3;
                    picture2 = picture4;
                    storeLocation2 = storeLocation3;
                    String str12 = str8;
                    str2 = str9;
                    Picture picture5 = picture3;
                    StoreId storeId = (StoreId) aVarC.m(serialDescriptor, 0, StoreId$$serializer.INSTANCE, strM277unboximpl != null ? StoreId.m269boximpl(strM277unboximpl) : null);
                    strM277unboximpl = storeId != null ? storeId.m277unboximpl() : null;
                    i12 |= 1;
                    str8 = str12;
                    picture3 = picture5;
                    str9 = str2;
                    storeLocation3 = storeLocation2;
                    picture4 = picture2;
                    str3 = str;
                    break;
                case 1:
                    str = str3;
                    picture2 = picture4;
                    storeLocation2 = storeLocation3;
                    str2 = str9;
                    str8 = (String) aVarC.m(serialDescriptor, 1, r1.f29848a, str8);
                    i12 |= 2;
                    str9 = str2;
                    storeLocation3 = storeLocation2;
                    picture4 = picture2;
                    str3 = str;
                    break;
                case 2:
                    str = str3;
                    picture2 = picture4;
                    storeLocation2 = storeLocation3;
                    str9 = (String) aVarC.m(serialDescriptor, 2, r1.f29848a, str9);
                    i12 |= 4;
                    storeLocation3 = storeLocation2;
                    picture4 = picture2;
                    str3 = str;
                    break;
                case 3:
                    str = str3;
                    picture2 = picture4;
                    storeLocation2 = storeLocation3;
                    str10 = (String) aVarC.m(serialDescriptor, 3, r1.f29848a, str10);
                    i12 |= 8;
                    storeLocation3 = storeLocation2;
                    picture4 = picture2;
                    str3 = str;
                    break;
                case 4:
                    str = str3;
                    picture2 = picture4;
                    storeLocation2 = storeLocation3;
                    str11 = (String) aVarC.m(serialDescriptor, 4, r1.f29848a, str11);
                    i12 |= 16;
                    storeLocation3 = storeLocation2;
                    picture4 = picture2;
                    str3 = str;
                    break;
                case 5:
                    str = str3;
                    picture2 = picture4;
                    storeLocation3 = (StoreLocation) aVarC.m(serialDescriptor, 5, StoreLocation$$serializer.INSTANCE, storeLocation3);
                    i12 |= 32;
                    picture4 = picture2;
                    str3 = str;
                    break;
                case 6:
                    str = str3;
                    picture4 = (Picture) aVarC.m(serialDescriptor, 6, Picture$$serializer.INSTANCE, picture4);
                    i12 |= 64;
                    storeLocation3 = storeLocation3;
                    str3 = str;
                    break;
                case 7:
                    picture = picture4;
                    storeLocation = storeLocation3;
                    str5 = (String) aVarC.m(serialDescriptor, 7, r1.f29848a, str5);
                    i12 |= 128;
                    storeLocation3 = storeLocation;
                    picture4 = picture;
                    break;
                case 8:
                    picture = picture4;
                    zT = aVarC.t(serialDescriptor, 8);
                    i12 |= 256;
                    picture4 = picture;
                    break;
                case 9:
                    picture = picture4;
                    storeLocation = storeLocation3;
                    list2 = (List) aVarC.m(serialDescriptor, 9, (b) jVarArr[9].getValue(), list2);
                    i12 |= 512;
                    storeLocation3 = storeLocation;
                    picture4 = picture;
                    break;
                case 10:
                    picture = picture4;
                    storeLocation = storeLocation3;
                    list = (List) aVarC.m(serialDescriptor, 10, (b) jVarArr[10].getValue(), list);
                    i12 |= 1024;
                    storeLocation3 = storeLocation;
                    picture4 = picture;
                    break;
                case 11:
                    picture = picture4;
                    dY = aVarC.y(serialDescriptor, 11);
                    i12 |= NewHope.SENDB_BYTES;
                    picture4 = picture;
                    break;
                case 12:
                    picture = picture4;
                    storeLocation = storeLocation3;
                    picture3 = (Picture) aVarC.m(serialDescriptor, 12, Picture$$serializer.INSTANCE, picture3);
                    i12 |= 4096;
                    storeLocation3 = storeLocation;
                    picture4 = picture;
                    break;
                case 13:
                    picture = picture4;
                    zT2 = aVarC.t(serialDescriptor, 13);
                    i12 |= 8192;
                    picture4 = picture;
                    break;
                case 14:
                    picture = picture4;
                    storeLocation = storeLocation3;
                    str3 = (String) aVarC.m(serialDescriptor, 14, r1.f29848a, str3);
                    i12 |= BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
                    storeLocation3 = storeLocation;
                    picture4 = picture;
                    break;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    picture = picture4;
                    storeLocation = storeLocation3;
                    str4 = (String) aVarC.m(serialDescriptor, 15, r1.f29848a, str4);
                    i11 = 32768;
                    i12 |= i11;
                    storeLocation3 = storeLocation;
                    picture4 = picture;
                    break;
                case 16:
                    picture = picture4;
                    storeLocation = storeLocation3;
                    str6 = (String) aVarC.m(serialDescriptor, 16, r1.f29848a, str6);
                    i11 = 65536;
                    i12 |= i11;
                    storeLocation3 = storeLocation;
                    picture4 = picture;
                    break;
                case 17:
                    picture = picture4;
                    storeLocation = storeLocation3;
                    deliveryMethod = (DeliveryMethod) aVarC.m(serialDescriptor, 17, DeliveryMethodSerializer.INSTANCE, deliveryMethod);
                    i11 = 131072;
                    i12 |= i11;
                    storeLocation3 = storeLocation;
                    picture4 = picture;
                    break;
                case 18:
                    picture = picture4;
                    storeLocation = storeLocation3;
                    storeLegalInformation = (StoreLegalInformation) aVarC.m(serialDescriptor, 18, StoreLegalInformation$$serializer.INSTANCE, storeLegalInformation);
                    i11 = 262144;
                    i12 |= i11;
                    storeLocation3 = storeLocation;
                    picture4 = picture;
                    break;
                case 19:
                    picture = picture4;
                    storeLocation = storeLocation3;
                    localHero = (LocalHero) aVarC.m(serialDescriptor, 19, LocalHero$$serializer.INSTANCE, localHero);
                    i11 = 524288;
                    i12 |= i11;
                    storeLocation3 = storeLocation;
                    picture4 = picture;
                    break;
                case 20:
                    picture = picture4;
                    zT3 = aVarC.t(serialDescriptor, 20);
                    i12 |= 1048576;
                    picture4 = picture;
                    break;
                case 21:
                    storeLocation = storeLocation3;
                    picture = picture4;
                    str7 = (String) aVarC.m(serialDescriptor, 21, r1.f29848a, str7);
                    i11 = 2097152;
                    i12 |= i11;
                    storeLocation3 = storeLocation;
                    picture4 = picture;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        Picture picture6 = picture3;
        Picture picture7 = picture4;
        StoreLocation storeLocation4 = storeLocation3;
        String str13 = str8;
        String str14 = str9;
        aVarC.b(serialDescriptor);
        return new StoreInformation(i12, strM277unboximpl, str13, str14, str10, str11, storeLocation4, picture7, str5, zT, list2, list, dY, picture6, zT2, str3, str4, str6, deliveryMethod, storeLegalInformation, localHero, zT3, str7, null, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull StoreInformation value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        StoreInformation.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
