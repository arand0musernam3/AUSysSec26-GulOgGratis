package com.app.tgtg.model.remote.specialrewards;

import c50.w;
import com.app.tgtg.model.remote.RewardId;
import com.app.tgtg.model.remote.RewardId$$serializer;
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
import m90.g;
import m90.r1;
import o30.f0;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.jetbrains.annotations.NotNull;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/specialrewards/SpecialReward.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/specialrewards/SpecialReward;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/specialrewards/SpecialReward;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/specialrewards/SpecialReward;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class SpecialReward$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final SpecialReward$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SpecialReward$$serializer specialReward$$serializer = new SpecialReward$$serializer();
        INSTANCE = specialReward$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.specialrewards.SpecialReward", specialReward$$serializer, 13);
        e1Var.j("reward_id", false);
        e1Var.j("reward_name", false);
        e1Var.j("store_id", false);
        e1Var.j("status", false);
        e1Var.j("expiration_date_utc", false);
        e1Var.j("store_logo_url", false);
        e1Var.j("store_name", false);
        e1Var.j("store_address", false);
        e1Var.j("reward_properties_first_line_text", false);
        e1Var.j("reward_properties_second_line_text", false);
        e1Var.j("terms_url", false);
        e1Var.j("redeemed_at_utc", true);
        e1Var.j("is_expiring_soon", true);
        descriptor = e1Var;
    }

    private SpecialReward$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{RewardId$$serializer.INSTANCE, r1Var, StoreId$$serializer.INSTANCE, r1Var, f0.B(r1Var), f0.B(r1Var), r1Var, r1Var, r1Var, f0.B(r1Var), r1Var, f0.B(r1Var), g.f29797a};
    }

    @Override // i90.b
    @NotNull
    public final SpecialReward deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        boolean z11 = true;
        String str = null;
        int i11 = 0;
        String strM265unboximpl = null;
        String str2 = null;
        String strM277unboximpl = null;
        String strU = null;
        String str3 = null;
        String str4 = null;
        String strU2 = null;
        String strU3 = null;
        String strU4 = null;
        String strU5 = null;
        String strU6 = null;
        boolean zT = false;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    RewardId rewardId = (RewardId) aVarC.n(serialDescriptor, 0, RewardId$$serializer.INSTANCE, strM265unboximpl != null ? RewardId.m257boximpl(strM265unboximpl) : null);
                    i11 |= 1;
                    strM265unboximpl = rewardId != null ? rewardId.m265unboximpl() : null;
                    break;
                case 1:
                    strU = aVarC.u(serialDescriptor, 1);
                    i11 |= 2;
                    break;
                case 2:
                    StoreId storeId = (StoreId) aVarC.n(serialDescriptor, 2, StoreId$$serializer.INSTANCE, strM277unboximpl != null ? StoreId.m269boximpl(strM277unboximpl) : null);
                    strM277unboximpl = storeId != null ? storeId.m277unboximpl() : null;
                    i11 |= 4;
                    break;
                case 3:
                    strU2 = aVarC.u(serialDescriptor, 3);
                    i11 |= 8;
                    break;
                case 4:
                    str3 = (String) aVarC.m(serialDescriptor, 4, r1.f29848a, str3);
                    i11 |= 16;
                    break;
                case 5:
                    str4 = (String) aVarC.m(serialDescriptor, 5, r1.f29848a, str4);
                    i11 |= 32;
                    break;
                case 6:
                    strU3 = aVarC.u(serialDescriptor, 6);
                    i11 |= 64;
                    break;
                case 7:
                    strU4 = aVarC.u(serialDescriptor, 7);
                    i11 |= 128;
                    break;
                case 8:
                    strU5 = aVarC.u(serialDescriptor, 8);
                    i11 |= 256;
                    break;
                case 9:
                    str = (String) aVarC.m(serialDescriptor, 9, r1.f29848a, str);
                    i11 |= 512;
                    break;
                case 10:
                    strU6 = aVarC.u(serialDescriptor, 10);
                    i11 |= 1024;
                    break;
                case 11:
                    str2 = (String) aVarC.m(serialDescriptor, 11, r1.f29848a, str2);
                    i11 |= NewHope.SENDB_BYTES;
                    break;
                case 12:
                    zT = aVarC.t(serialDescriptor, 12);
                    i11 |= 4096;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new SpecialReward(i11, strM265unboximpl, strU, strM277unboximpl, strU2, str3, str4, strU3, strU4, strU5, str, strU6, str2, zT, null, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull SpecialReward value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b bVarC = encoder.c(serialDescriptor);
        SpecialReward.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
