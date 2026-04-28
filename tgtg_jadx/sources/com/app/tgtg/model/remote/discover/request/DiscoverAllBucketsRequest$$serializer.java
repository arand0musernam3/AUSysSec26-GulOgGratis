package com.app.tgtg.model.remote.discover.request;

import c50.w;
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
import m90.g;
import m90.m1;
import m90.r1;
import m90.v;
import o30.f0;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/discover/request/DiscoverAllBucketsRequest.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/discover/request/DiscoverAllBucketsRequest;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/discover/request/DiscoverAllBucketsRequest;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/discover/request/DiscoverAllBucketsRequest;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class DiscoverAllBucketsRequest$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final DiscoverAllBucketsRequest$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        DiscoverAllBucketsRequest$$serializer discoverAllBucketsRequest$$serializer = new DiscoverAllBucketsRequest$$serializer();
        INSTANCE = discoverAllBucketsRequest$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.discover.request.DiscoverAllBucketsRequest", discoverAllBucketsRequest$$serializer, 10);
        e1Var.j("origin", true);
        e1Var.j(BrazeGeofence.RADIUS_METERS, true);
        e1Var.j("supported_buckets", true);
        e1Var.j("experimental_group", true);
        e1Var.j("accessibility_enabled", true);
        e1Var.j("debug_mode", false);
        e1Var.j("is_gps", true);
        e1Var.j("origin_updated", true);
        e1Var.j("filters", true);
        e1Var.j("crm_campaign", true);
        descriptor = e1Var;
    }

    private DiscoverAllBucketsRequest$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = DiscoverAllBucketsRequest.$childSerializers;
        KSerializer kSerializerB = f0.B(LatLngInfo$$serializer.INSTANCE);
        KSerializer kSerializerB2 = f0.B(v.f29868a);
        KSerializer kSerializerB3 = f0.B((KSerializer) jVarArr[2].getValue());
        KSerializer kSerializerB4 = f0.B(r1.f29848a);
        g gVar = g.f29797a;
        return new KSerializer[]{kSerializerB, kSerializerB2, kSerializerB3, kSerializerB4, f0.B(gVar), gVar, f0.B(gVar), f0.B(gVar), f0.B((KSerializer) jVarArr[8].getValue()), f0.B(CRMCampaign$$serializer.INSTANCE)};
    }

    @Override // i90.b
    @NotNull
    public final DiscoverAllBucketsRequest deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = DiscoverAllBucketsRequest.$childSerializers;
        List list = null;
        CRMCampaign cRMCampaign = null;
        LatLngInfo latLngInfo = null;
        Double d3 = null;
        List list2 = null;
        String str = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        boolean z11 = true;
        int i11 = 0;
        boolean zT = false;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    latLngInfo = (LatLngInfo) aVarC.m(serialDescriptor, 0, LatLngInfo$$serializer.INSTANCE, latLngInfo);
                    i11 |= 1;
                    break;
                case 1:
                    d3 = (Double) aVarC.m(serialDescriptor, 1, v.f29868a, d3);
                    i11 |= 2;
                    break;
                case 2:
                    list2 = (List) aVarC.m(serialDescriptor, 2, (b) jVarArr[2].getValue(), list2);
                    i11 |= 4;
                    break;
                case 3:
                    str = (String) aVarC.m(serialDescriptor, 3, r1.f29848a, str);
                    i11 |= 8;
                    break;
                case 4:
                    bool = (Boolean) aVarC.m(serialDescriptor, 4, g.f29797a, bool);
                    i11 |= 16;
                    break;
                case 5:
                    zT = aVarC.t(serialDescriptor, 5);
                    i11 |= 32;
                    break;
                case 6:
                    bool2 = (Boolean) aVarC.m(serialDescriptor, 6, g.f29797a, bool2);
                    i11 |= 64;
                    break;
                case 7:
                    bool3 = (Boolean) aVarC.m(serialDescriptor, 7, g.f29797a, bool3);
                    i11 |= 128;
                    break;
                case 8:
                    list = (List) aVarC.m(serialDescriptor, 8, (b) jVarArr[8].getValue(), list);
                    i11 |= 256;
                    break;
                case 9:
                    cRMCampaign = (CRMCampaign) aVarC.m(serialDescriptor, 9, CRMCampaign$$serializer.INSTANCE, cRMCampaign);
                    i11 |= 512;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new DiscoverAllBucketsRequest(i11, latLngInfo, d3, list2, str, bool, zT, bool2, bool3, list, cRMCampaign, (m1) null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull DiscoverAllBucketsRequest value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        DiscoverAllBucketsRequest.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
