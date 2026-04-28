package com.app.tgtg.model.remote.widgets.response;

import c50.w;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.ItemId$$serializer;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.item.PickupInterval$$serializer;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.Picture$$serializer;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import l90.a;
import l90.b;
import m90.c1;
import m90.d0;
import m90.e1;
import m90.r1;
import o30.f0;
import org.jetbrains.annotations.NotNull;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/widgets/response/FavouriteWidgetItem.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/widgets/response/FavouriteWidgetItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/widgets/response/FavouriteWidgetItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/widgets/response/FavouriteWidgetItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class FavouriteWidgetItem$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final FavouriteWidgetItem$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        FavouriteWidgetItem$$serializer favouriteWidgetItem$$serializer = new FavouriteWidgetItem$$serializer();
        INSTANCE = favouriteWidgetItem$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.widgets.response.FavouriteWidgetItem", favouriteWidgetItem$$serializer, 8);
        e1Var.j("item_id", false);
        e1Var.j("display_name", false);
        e1Var.j("cover_picture", false);
        e1Var.j("logo_picture", false);
        e1Var.j("pickup_interval", false);
        e1Var.j("store_name", false);
        e1Var.j("item_name", false);
        e1Var.j("branch_name", true);
        descriptor = e1Var;
    }

    private FavouriteWidgetItem$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerB = f0.B(ItemId$$serializer.INSTANCE);
        r1 r1Var = r1.f29848a;
        KSerializer kSerializerB2 = f0.B(r1Var);
        Picture$$serializer picture$$serializer = Picture$$serializer.INSTANCE;
        return new KSerializer[]{kSerializerB, kSerializerB2, f0.B(picture$$serializer), f0.B(picture$$serializer), f0.B(PickupInterval$$serializer.INSTANCE), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var)};
    }

    @Override // i90.b
    @NotNull
    public final FavouriteWidgetItem deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        boolean z11 = true;
        int i11 = 0;
        String strM205unboximpl = null;
        String str = null;
        Picture picture = null;
        Picture picture2 = null;
        PickupInterval pickupInterval = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    ItemId itemId = (ItemId) aVarC.m(serialDescriptor, 0, ItemId$$serializer.INSTANCE, strM205unboximpl != null ? ItemId.m197boximpl(strM205unboximpl) : null);
                    strM205unboximpl = itemId != null ? itemId.m205unboximpl() : null;
                    i11 |= 1;
                    break;
                case 1:
                    str = (String) aVarC.m(serialDescriptor, 1, r1.f29848a, str);
                    i11 |= 2;
                    break;
                case 2:
                    picture = (Picture) aVarC.m(serialDescriptor, 2, Picture$$serializer.INSTANCE, picture);
                    i11 |= 4;
                    break;
                case 3:
                    picture2 = (Picture) aVarC.m(serialDescriptor, 3, Picture$$serializer.INSTANCE, picture2);
                    i11 |= 8;
                    break;
                case 4:
                    pickupInterval = (PickupInterval) aVarC.m(serialDescriptor, 4, PickupInterval$$serializer.INSTANCE, pickupInterval);
                    i11 |= 16;
                    break;
                case 5:
                    str2 = (String) aVarC.m(serialDescriptor, 5, r1.f29848a, str2);
                    i11 |= 32;
                    break;
                case 6:
                    str3 = (String) aVarC.m(serialDescriptor, 6, r1.f29848a, str3);
                    i11 |= 64;
                    break;
                case 7:
                    str4 = (String) aVarC.m(serialDescriptor, 7, r1.f29848a, str4);
                    i11 |= 128;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new FavouriteWidgetItem(i11, strM205unboximpl, str, picture, picture2, pickupInterval, str2, str3, str4, null, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull FavouriteWidgetItem value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b bVarC = encoder.c(serialDescriptor);
        FavouriteWidgetItem.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
