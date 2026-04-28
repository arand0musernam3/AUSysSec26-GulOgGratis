package com.app.tgtg.model.remote.invitation;

import c50.w;
import com.app.tgtg.model.remote.item.response.AllergensInfo;
import com.app.tgtg.model.remote.item.response.AllergensInfo$$serializer;
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
import o30.f0;
import org.jetbrains.annotations.NotNull;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/invitation/InvitationFromDeeplinkResponse.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/invitation/InvitationFromDeeplinkResponse;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/invitation/InvitationFromDeeplinkResponse;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/invitation/InvitationFromDeeplinkResponse;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class InvitationFromDeeplinkResponse$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final InvitationFromDeeplinkResponse$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        InvitationFromDeeplinkResponse$$serializer invitationFromDeeplinkResponse$$serializer = new InvitationFromDeeplinkResponse$$serializer();
        INSTANCE = invitationFromDeeplinkResponse$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.invitation.InvitationFromDeeplinkResponse", invitationFromDeeplinkResponse$$serializer, 3);
        e1Var.j("invitation", false);
        e1Var.j("order_data", false);
        e1Var.j("allergens_data", false);
        descriptor = e1Var;
    }

    private InvitationFromDeeplinkResponse$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{f0.B(Invitation$$serializer.INSTANCE), f0.B(OrderDataForInvitation$$serializer.INSTANCE), f0.B(AllergensInfo$$serializer.INSTANCE)};
    }

    @Override // i90.b
    @NotNull
    public final InvitationFromDeeplinkResponse deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        int i11 = 0;
        Invitation invitation = null;
        OrderDataForInvitation orderDataForInvitation = null;
        AllergensInfo allergensInfo = null;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                invitation = (Invitation) aVarC.m(serialDescriptor, 0, Invitation$$serializer.INSTANCE, invitation);
                i11 |= 1;
            } else if (iW == 1) {
                orderDataForInvitation = (OrderDataForInvitation) aVarC.m(serialDescriptor, 1, OrderDataForInvitation$$serializer.INSTANCE, orderDataForInvitation);
                i11 |= 2;
            } else {
                if (iW != 2) {
                    w.e(iW);
                    return null;
                }
                allergensInfo = (AllergensInfo) aVarC.m(serialDescriptor, 2, AllergensInfo$$serializer.INSTANCE, allergensInfo);
                i11 |= 4;
            }
        }
        aVarC.b(serialDescriptor);
        return new InvitationFromDeeplinkResponse(i11, invitation, orderDataForInvitation, allergensInfo, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull InvitationFromDeeplinkResponse value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b bVarC = encoder.c(serialDescriptor);
        InvitationFromDeeplinkResponse.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
