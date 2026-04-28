package com.app.tgtg.model.remote.brief;

import c50.w;
import com.app.tgtg.model.remote.StoreId;
import com.app.tgtg.model.remote.StoreId$$serializer;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/brief/BriefStoreInfo.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/brief/BriefStoreInfo;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/brief/BriefStoreInfo;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/brief/BriefStoreInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class BriefStoreInfo$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final BriefStoreInfo$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        BriefStoreInfo$$serializer briefStoreInfo$$serializer = new BriefStoreInfo$$serializer();
        INSTANCE = briefStoreInfo$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.brief.BriefStoreInfo", briefStoreInfo$$serializer, 5);
        e1Var.j("store_id", true);
        e1Var.j("store_display_name", true);
        e1Var.j("country_iso_code", false);
        e1Var.j("logo_url", false);
        e1Var.j("storeTimeZone", false);
        descriptor = e1Var;
    }

    private BriefStoreInfo$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerB = f0.B(StoreId$$serializer.INSTANCE);
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{kSerializerB, f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var)};
    }

    @Override // i90.b
    @NotNull
    public final BriefStoreInfo deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        boolean z11 = true;
        int i11 = 0;
        String strM277unboximpl = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                StoreId storeId = (StoreId) aVarC.m(serialDescriptor, 0, StoreId$$serializer.INSTANCE, strM277unboximpl != null ? StoreId.m269boximpl(strM277unboximpl) : null);
                strM277unboximpl = storeId != null ? storeId.m277unboximpl() : null;
                i11 |= 1;
            } else if (iW == 1) {
                str = (String) aVarC.m(serialDescriptor, 1, r1.f29848a, str);
                i11 |= 2;
            } else if (iW == 2) {
                str2 = (String) aVarC.m(serialDescriptor, 2, r1.f29848a, str2);
                i11 |= 4;
            } else if (iW == 3) {
                str3 = (String) aVarC.m(serialDescriptor, 3, r1.f29848a, str3);
                i11 |= 8;
            } else {
                if (iW != 4) {
                    w.e(iW);
                    return null;
                }
                str4 = (String) aVarC.m(serialDescriptor, 4, r1.f29848a, str4);
                i11 |= 16;
            }
        }
        aVarC.b(serialDescriptor);
        return new BriefStoreInfo(i11, strM277unboximpl, str, str2, str3, str4, null, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull BriefStoreInfo value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b bVarC = encoder.c(serialDescriptor);
        BriefStoreInfo.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
