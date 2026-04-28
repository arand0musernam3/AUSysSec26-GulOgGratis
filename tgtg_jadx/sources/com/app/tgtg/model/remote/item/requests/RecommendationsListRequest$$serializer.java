package com.app.tgtg.model.remote.item.requests;

import c50.w;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.ItemId$$serializer;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.LatLngInfo$$serializer;
import com.braze.models.BrazeGeofence;
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
import m90.l0;
import m90.r1;
import m90.v;
import o30.f0;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/item/requests/RecommendationsListRequest.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/item/requests/RecommendationsListRequest;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/item/requests/RecommendationsListRequest;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/item/requests/RecommendationsListRequest;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class RecommendationsListRequest$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final RecommendationsListRequest$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RecommendationsListRequest$$serializer recommendationsListRequest$$serializer = new RecommendationsListRequest$$serializer();
        INSTANCE = recommendationsListRequest$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.item.requests.RecommendationsListRequest", recommendationsListRequest$$serializer, 9);
        e1Var.j("type", false);
        e1Var.j("origin", false);
        e1Var.j(BrazeGeofence.RADIUS_METERS, false);
        e1Var.j("item_id", false);
        e1Var.j("sorting", false);
        e1Var.j("item_stock_option", false);
        e1Var.j("store_location", false);
        e1Var.j("pickup_intervals", true);
        e1Var.j("size", false);
        descriptor = e1Var;
    }

    private RecommendationsListRequest$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = RecommendationsListRequest.$childSerializers;
        LatLngInfo$$serializer latLngInfo$$serializer = LatLngInfo$$serializer.INSTANCE;
        KSerializer kSerializerB = f0.B(ItemId$$serializer.INSTANCE);
        KSerializer kSerializerB2 = f0.B(latLngInfo$$serializer);
        KSerializer kSerializerB3 = f0.B((KSerializer) jVarArr[7].getValue());
        KSerializer kSerializerB4 = f0.B(l0.f29821a);
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{r1Var, latLngInfo$$serializer, v.f29868a, kSerializerB, r1Var, r1Var, kSerializerB2, kSerializerB3, kSerializerB4};
    }

    @Override // i90.b
    @NotNull
    public final RecommendationsListRequest deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = RecommendationsListRequest.$childSerializers;
        double dY = 0.0d;
        LatLngInfo latLngInfo = null;
        List list = null;
        int i11 = 0;
        Integer num = null;
        LatLngInfo latLngInfo2 = null;
        String strM205unboximpl = null;
        String strU = null;
        String strU2 = null;
        String strU3 = null;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    strU = aVarC.u(serialDescriptor, 0);
                    i11 |= 1;
                    break;
                case 1:
                    latLngInfo2 = (LatLngInfo) aVarC.n(serialDescriptor, 1, LatLngInfo$$serializer.INSTANCE, latLngInfo2);
                    i11 |= 2;
                    break;
                case 2:
                    dY = aVarC.y(serialDescriptor, 2);
                    i11 |= 4;
                    break;
                case 3:
                    ItemId itemId = (ItemId) aVarC.m(serialDescriptor, 3, ItemId$$serializer.INSTANCE, strM205unboximpl != null ? ItemId.m197boximpl(strM205unboximpl) : null);
                    strM205unboximpl = itemId != null ? itemId.m205unboximpl() : null;
                    i11 |= 8;
                    break;
                case 4:
                    strU2 = aVarC.u(serialDescriptor, 4);
                    i11 |= 16;
                    break;
                case 5:
                    strU3 = aVarC.u(serialDescriptor, 5);
                    i11 |= 32;
                    break;
                case 6:
                    latLngInfo = (LatLngInfo) aVarC.m(serialDescriptor, 6, LatLngInfo$$serializer.INSTANCE, latLngInfo);
                    i11 |= 64;
                    break;
                case 7:
                    list = (List) aVarC.m(serialDescriptor, 7, (b) jVarArr[7].getValue(), list);
                    i11 |= 128;
                    break;
                case 8:
                    num = (Integer) aVarC.m(serialDescriptor, 8, l0.f29821a, num);
                    i11 |= 256;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new RecommendationsListRequest(i11, strU, latLngInfo2, dY, strM205unboximpl, strU2, strU3, latLngInfo, list, num, null, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull RecommendationsListRequest value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        RecommendationsListRequest.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
