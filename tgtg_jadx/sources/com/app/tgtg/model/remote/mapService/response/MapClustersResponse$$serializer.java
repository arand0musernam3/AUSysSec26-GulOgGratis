package com.app.tgtg.model.remote.mapService.response;

import c50.w;
import com.app.tgtg.model.remote.mapService.ItemDetailLevel;
import com.app.tgtg.model.remote.mapService.ItemDetailLevelSerializer;
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
import m90.m1;
import o30.f0;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/mapService/response/MapClustersResponse.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/mapService/response/MapClustersResponse;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/mapService/response/MapClustersResponse;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/mapService/response/MapClustersResponse;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class MapClustersResponse$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final MapClustersResponse$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        MapClustersResponse$$serializer mapClustersResponse$$serializer = new MapClustersResponse$$serializer();
        INSTANCE = mapClustersResponse$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.mapService.response.MapClustersResponse", mapClustersResponse$$serializer, 6);
        e1Var.j("clusters", false);
        e1Var.j("item_detail_level", false);
        e1Var.j("location_detail_items", false);
        e1Var.j("full_detail_items", false);
        e1Var.j("filters", true);
        e1Var.j("sorting", true);
        descriptor = e1Var;
    }

    private MapClustersResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = MapClustersResponse.$childSerializers;
        return new KSerializer[]{jVarArr[0].getValue(), ItemDetailLevelSerializer.INSTANCE, f0.B((KSerializer) jVarArr[2].getValue()), f0.B((KSerializer) jVarArr[3].getValue()), f0.B(MapFilters$$serializer.INSTANCE), f0.B((KSerializer) jVarArr[5].getValue())};
    }

    @Override // i90.b
    @NotNull
    public final MapClustersResponse deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = MapClustersResponse.$childSerializers;
        int i11 = 0;
        List list = null;
        ItemDetailLevel itemDetailLevel = null;
        List list2 = null;
        List list3 = null;
        MapFilters mapFilters = null;
        List list4 = null;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    list = (List) aVarC.n(serialDescriptor, 0, (b) jVarArr[0].getValue(), list);
                    i11 |= 1;
                    break;
                case 1:
                    itemDetailLevel = (ItemDetailLevel) aVarC.n(serialDescriptor, 1, ItemDetailLevelSerializer.INSTANCE, itemDetailLevel);
                    i11 |= 2;
                    break;
                case 2:
                    list2 = (List) aVarC.m(serialDescriptor, 2, (b) jVarArr[2].getValue(), list2);
                    i11 |= 4;
                    break;
                case 3:
                    list3 = (List) aVarC.m(serialDescriptor, 3, (b) jVarArr[3].getValue(), list3);
                    i11 |= 8;
                    break;
                case 4:
                    mapFilters = (MapFilters) aVarC.m(serialDescriptor, 4, MapFilters$$serializer.INSTANCE, mapFilters);
                    i11 |= 16;
                    break;
                case 5:
                    list4 = (List) aVarC.m(serialDescriptor, 5, (b) jVarArr[5].getValue(), list4);
                    i11 |= 32;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new MapClustersResponse(i11, list, itemDetailLevel, list2, list3, mapFilters, list4, (m1) null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull MapClustersResponse value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        MapClustersResponse.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
