package com.app.tgtg.model.remote.item.requests;

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
import m90.l0;
import m90.m1;
import m90.r1;
import m90.v;
import o30.f0;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/item/requests/ListItemRequest.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/item/requests/ListItemRequest;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/item/requests/ListItemRequest;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/item/requests/ListItemRequest;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class ListItemRequest$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final ListItemRequest$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ListItemRequest$$serializer listItemRequest$$serializer = new ListItemRequest$$serializer();
        INSTANCE = listItemRequest$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.item.requests.ListItemRequest", listItemRequest$$serializer, 15);
        e1Var.j("origin", false);
        e1Var.j(BrazeGeofence.RADIUS_METERS, false);
        e1Var.j("page_size", false);
        e1Var.j("page", false);
        e1Var.j("discover", false);
        e1Var.j("favorites_only", false);
        e1Var.j("item_categories", true);
        e1Var.j("diet_categories", true);
        e1Var.j("pickup_intervals", true);
        e1Var.j("search_phrase", true);
        e1Var.j("with_stock_only", false);
        e1Var.j("hidden_only", false);
        e1Var.j("sold_out_item_context", false);
        e1Var.j("sort_option", true);
        e1Var.j("expand_radius_if_not_enough_items", false);
        descriptor = e1Var;
    }

    private ListItemRequest$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = ListItemRequest.$childSerializers;
        KSerializer kSerializerB = f0.B(LatLngInfo$$serializer.INSTANCE);
        KSerializer kSerializerB2 = f0.B((KSerializer) jVarArr[6].getValue());
        KSerializer kSerializerB3 = f0.B((KSerializer) jVarArr[7].getValue());
        KSerializer kSerializerB4 = f0.B((KSerializer) jVarArr[8].getValue());
        r1 r1Var = r1.f29848a;
        KSerializer kSerializerB5 = f0.B(r1Var);
        KSerializer kSerializerB6 = f0.B(r1Var);
        KSerializer kSerializerB7 = f0.B(r1Var);
        l0 l0Var = l0.f29821a;
        g gVar = g.f29797a;
        return new KSerializer[]{kSerializerB, v.f29868a, l0Var, l0Var, gVar, gVar, kSerializerB2, kSerializerB3, kSerializerB4, kSerializerB5, gVar, gVar, kSerializerB6, kSerializerB7, gVar};
    }

    @Override // i90.b
    @NotNull
    public final ListItemRequest deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = ListItemRequest.$childSerializers;
        List list = null;
        String str = null;
        String str2 = null;
        LatLngInfo latLngInfo = null;
        String str3 = null;
        double dY = 0.0d;
        boolean z11 = true;
        int i11 = 0;
        int iQ = 0;
        int iQ2 = 0;
        boolean zT = false;
        boolean zT2 = false;
        boolean zT3 = false;
        boolean zT4 = false;
        boolean zT5 = false;
        List list2 = null;
        List list3 = null;
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
                    dY = aVarC.y(serialDescriptor, 1);
                    i11 |= 2;
                    break;
                case 2:
                    iQ = aVarC.q(serialDescriptor, 2);
                    i11 |= 4;
                    break;
                case 3:
                    iQ2 = aVarC.q(serialDescriptor, 3);
                    i11 |= 8;
                    break;
                case 4:
                    zT = aVarC.t(serialDescriptor, 4);
                    i11 |= 16;
                    break;
                case 5:
                    zT2 = aVarC.t(serialDescriptor, 5);
                    i11 |= 32;
                    break;
                case 6:
                    list = (List) aVarC.m(serialDescriptor, 6, (b) jVarArr[6].getValue(), list);
                    i11 |= 64;
                    break;
                case 7:
                    list2 = (List) aVarC.m(serialDescriptor, 7, (b) jVarArr[7].getValue(), list2);
                    i11 |= 128;
                    break;
                case 8:
                    list3 = (List) aVarC.m(serialDescriptor, 8, (b) jVarArr[8].getValue(), list3);
                    i11 |= 256;
                    break;
                case 9:
                    str = (String) aVarC.m(serialDescriptor, 9, r1.f29848a, str);
                    i11 |= 512;
                    break;
                case 10:
                    zT3 = aVarC.t(serialDescriptor, 10);
                    i11 |= 1024;
                    break;
                case 11:
                    zT4 = aVarC.t(serialDescriptor, 11);
                    i11 |= NewHope.SENDB_BYTES;
                    break;
                case 12:
                    str2 = (String) aVarC.m(serialDescriptor, 12, r1.f29848a, str2);
                    i11 |= 4096;
                    break;
                case 13:
                    str3 = (String) aVarC.m(serialDescriptor, 13, r1.f29848a, str3);
                    i11 |= 8192;
                    break;
                case 14:
                    zT5 = aVarC.t(serialDescriptor, 14);
                    i11 |= BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new ListItemRequest(i11, latLngInfo, dY, iQ, iQ2, zT, zT2, list, list2, list3, str, zT3, zT4, str2, str3, zT5, (m1) null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ListItemRequest value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        ListItemRequest.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
