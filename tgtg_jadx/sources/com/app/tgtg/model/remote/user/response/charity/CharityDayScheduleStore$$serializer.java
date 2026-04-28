package com.app.tgtg.model.remote.user.response.charity;

import c50.w;
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
import m90.v;
import o30.f0;
import org.jetbrains.annotations.NotNull;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/user/response/charity/CharityDayScheduleStore.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/user/response/charity/CharityDayScheduleStore;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/user/response/charity/CharityDayScheduleStore;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/user/response/charity/CharityDayScheduleStore;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class CharityDayScheduleStore$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final CharityDayScheduleStore$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        CharityDayScheduleStore$$serializer charityDayScheduleStore$$serializer = new CharityDayScheduleStore$$serializer();
        INSTANCE = charityDayScheduleStore$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.user.response.charity.CharityDayScheduleStore", charityDayScheduleStore$$serializer, 10);
        e1Var.j("id", false);
        e1Var.j("name", false);
        e1Var.j("logo_url", false);
        e1Var.j("address", false);
        e1Var.j("latitude", false);
        e1Var.j("longitude", false);
        e1Var.j("pickup_window_start", false);
        e1Var.j("pickup_window_end", false);
        e1Var.j("store_branch", false);
        e1Var.j("collector_type", false);
        descriptor = e1Var;
    }

    private CharityDayScheduleStore$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        r1 r1Var = r1.f29848a;
        KSerializer kSerializerB = f0.B(r1Var);
        v vVar = v.f29868a;
        return new KSerializer[]{r1Var, r1Var, kSerializerB, r1Var, vVar, vVar, r1Var, r1Var, r1Var, CharityPlanCollectorTypeSerializer.INSTANCE};
    }

    @Override // i90.b
    @NotNull
    public final CharityDayScheduleStore deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        CharityPlanCollectorType charityPlanCollectorType = null;
        int i11 = 0;
        String strU = null;
        String strU2 = null;
        String str = null;
        String strU3 = null;
        String strU4 = null;
        String strU5 = null;
        String strU6 = null;
        double dY = 0.0d;
        double dY2 = 0.0d;
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
                    strU2 = aVarC.u(serialDescriptor, 1);
                    i11 |= 2;
                    break;
                case 2:
                    str = (String) aVarC.m(serialDescriptor, 2, r1.f29848a, str);
                    i11 |= 4;
                    break;
                case 3:
                    strU3 = aVarC.u(serialDescriptor, 3);
                    i11 |= 8;
                    break;
                case 4:
                    dY = aVarC.y(serialDescriptor, 4);
                    i11 |= 16;
                    break;
                case 5:
                    dY2 = aVarC.y(serialDescriptor, 5);
                    i11 |= 32;
                    break;
                case 6:
                    strU4 = aVarC.u(serialDescriptor, 6);
                    i11 |= 64;
                    break;
                case 7:
                    strU5 = aVarC.u(serialDescriptor, 7);
                    i11 |= 128;
                    break;
                case 8:
                    strU6 = aVarC.u(serialDescriptor, 8);
                    i11 |= 256;
                    break;
                case 9:
                    charityPlanCollectorType = (CharityPlanCollectorType) aVarC.n(serialDescriptor, 9, CharityPlanCollectorTypeSerializer.INSTANCE, charityPlanCollectorType);
                    i11 |= 512;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new CharityDayScheduleStore(i11, strU, strU2, str, strU3, dY, dY2, strU4, strU5, strU6, charityPlanCollectorType, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull CharityDayScheduleStore value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b bVarC = encoder.c(serialDescriptor);
        CharityDayScheduleStore.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
