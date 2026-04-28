package com.app.tgtg.model.remote.profile.response;

import c50.w;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.Order$$serializer;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
import com.app.tgtg.model.remote.profile.ProfileCO2Saved;
import com.app.tgtg.model.remote.profile.ProfileCO2Saved$$serializer;
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
import o30.f0;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/profile/response/ProfileScreenResponse.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/profile/response/ProfileScreenResponse;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/profile/response/ProfileScreenResponse;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/profile/response/ProfileScreenResponse;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class ProfileScreenResponse$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final ProfileScreenResponse$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ProfileScreenResponse$$serializer profileScreenResponse$$serializer = new ProfileScreenResponse$$serializer();
        INSTANCE = profileScreenResponse$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.profile.response.ProfileScreenResponse", profileScreenResponse$$serializer, 6);
        e1Var.j("latest_completed_order", false);
        e1Var.j("co2e_saved", false);
        e1Var.j("money_saved", false);
        e1Var.j("pendingOrders", false);
        e1Var.j("feature_details", false);
        e1Var.j("voucher_tooltip", false);
        descriptor = e1Var;
    }

    private ProfileScreenResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = ProfileScreenResponse.$childSerializers;
        return new KSerializer[]{f0.B(Order$$serializer.INSTANCE), f0.B(ProfileCO2Saved$$serializer.INSTANCE), f0.B(Price$$serializer.INSTANCE), f0.B((KSerializer) jVarArr[3].getValue()), jVarArr[4].getValue(), f0.B(ProfileVoucherTooltip$$serializer.INSTANCE)};
    }

    @Override // i90.b
    @NotNull
    public final ProfileScreenResponse deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = ProfileScreenResponse.$childSerializers;
        int i11 = 0;
        Order order = null;
        ProfileCO2Saved profileCO2Saved = null;
        Price price = null;
        List list = null;
        List list2 = null;
        ProfileVoucherTooltip profileVoucherTooltip = null;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    order = (Order) aVarC.m(serialDescriptor, 0, Order$$serializer.INSTANCE, order);
                    i11 |= 1;
                    break;
                case 1:
                    profileCO2Saved = (ProfileCO2Saved) aVarC.m(serialDescriptor, 1, ProfileCO2Saved$$serializer.INSTANCE, profileCO2Saved);
                    i11 |= 2;
                    break;
                case 2:
                    price = (Price) aVarC.m(serialDescriptor, 2, Price$$serializer.INSTANCE, price);
                    i11 |= 4;
                    break;
                case 3:
                    list = (List) aVarC.m(serialDescriptor, 3, (b) jVarArr[3].getValue(), list);
                    i11 |= 8;
                    break;
                case 4:
                    list2 = (List) aVarC.n(serialDescriptor, 4, (b) jVarArr[4].getValue(), list2);
                    i11 |= 16;
                    break;
                case 5:
                    profileVoucherTooltip = (ProfileVoucherTooltip) aVarC.m(serialDescriptor, 5, ProfileVoucherTooltip$$serializer.INSTANCE, profileVoucherTooltip);
                    i11 |= 32;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new ProfileScreenResponse(i11, order, profileCO2Saved, price, list, list2, profileVoucherTooltip, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ProfileScreenResponse value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        ProfileScreenResponse.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
