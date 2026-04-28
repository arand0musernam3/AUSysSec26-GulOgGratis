package com.app.tgtg.model.remote.mapService.request;

import c50.w;
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
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/mapService/request/FilteredBy.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/mapService/request/FilteredBy;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/mapService/request/FilteredBy;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/mapService/request/FilteredBy;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class FilteredBy$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final FilteredBy$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        FilteredBy$$serializer filteredBy$$serializer = new FilteredBy$$serializer();
        INSTANCE = filteredBy$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.mapService.request.FilteredBy", filteredBy$$serializer, 5);
        e1Var.j("item_categories", false);
        e1Var.j("diet_categories", false);
        e1Var.j("pickup_intervals", false);
        e1Var.j("search_phrase", false);
        e1Var.j("with_stock_only", false);
        descriptor = e1Var;
    }

    private FilteredBy$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = FilteredBy.$childSerializers;
        return new KSerializer[]{jVarArr[0].getValue(), jVarArr[1].getValue(), f0.B((KSerializer) jVarArr[2].getValue()), f0.B(r1.f29848a), g.f29797a};
    }

    @Override // i90.b
    @NotNull
    public final FilteredBy deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = FilteredBy.$childSerializers;
        int i11 = 0;
        boolean zT = false;
        List list = null;
        List list2 = null;
        List list3 = null;
        String str = null;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                list = (List) aVarC.n(serialDescriptor, 0, (b) jVarArr[0].getValue(), list);
                i11 |= 1;
            } else if (iW == 1) {
                list2 = (List) aVarC.n(serialDescriptor, 1, (b) jVarArr[1].getValue(), list2);
                i11 |= 2;
            } else if (iW == 2) {
                list3 = (List) aVarC.m(serialDescriptor, 2, (b) jVarArr[2].getValue(), list3);
                i11 |= 4;
            } else if (iW == 3) {
                str = (String) aVarC.m(serialDescriptor, 3, r1.f29848a, str);
                i11 |= 8;
            } else {
                if (iW != 4) {
                    w.e(iW);
                    return null;
                }
                zT = aVarC.t(serialDescriptor, 4);
                i11 |= 16;
            }
        }
        aVarC.b(serialDescriptor);
        return new FilteredBy(i11, list, list2, list3, str, zT, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull FilteredBy value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        FilteredBy.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
