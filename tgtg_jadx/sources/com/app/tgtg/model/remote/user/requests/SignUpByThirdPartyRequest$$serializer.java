package com.app.tgtg.model.remote.user.requests;

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
import m90.g;
import m90.m1;
import m90.r1;
import o30.f0;
import org.jetbrains.annotations.NotNull;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/user/requests/SignUpByThirdPartyRequest.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/user/requests/SignUpByThirdPartyRequest;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/user/requests/SignUpByThirdPartyRequest;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/user/requests/SignUpByThirdPartyRequest;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class SignUpByThirdPartyRequest$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final SignUpByThirdPartyRequest$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SignUpByThirdPartyRequest$$serializer signUpByThirdPartyRequest$$serializer = new SignUpByThirdPartyRequest$$serializer();
        INSTANCE = signUpByThirdPartyRequest$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.user.requests.SignUpByThirdPartyRequest", signUpByThirdPartyRequest$$serializer, 7);
        e1Var.j("access_token", true);
        e1Var.j("device_type", false);
        e1Var.j("provider", false);
        e1Var.j("country_id", true);
        e1Var.j("newsletter_opt_in", true);
        e1Var.j("push_notification_opt_in", true);
        e1Var.j("has_braze_sdk", true);
        descriptor = e1Var;
    }

    private SignUpByThirdPartyRequest$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        r1 r1Var = r1.f29848a;
        KSerializer kSerializerB = f0.B(r1Var);
        KSerializer kSerializerB2 = f0.B(r1Var);
        g gVar = g.f29797a;
        return new KSerializer[]{kSerializerB, r1Var, r1Var, kSerializerB2, gVar, gVar, gVar};
    }

    @Override // i90.b
    @NotNull
    public final SignUpByThirdPartyRequest deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        int i11 = 0;
        boolean zT = false;
        boolean zT2 = false;
        boolean zT3 = false;
        String str = null;
        String strU = null;
        String strU2 = null;
        String str2 = null;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    str = (String) aVarC.m(serialDescriptor, 0, r1.f29848a, str);
                    i11 |= 1;
                    break;
                case 1:
                    strU = aVarC.u(serialDescriptor, 1);
                    i11 |= 2;
                    break;
                case 2:
                    strU2 = aVarC.u(serialDescriptor, 2);
                    i11 |= 4;
                    break;
                case 3:
                    str2 = (String) aVarC.m(serialDescriptor, 3, r1.f29848a, str2);
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
                    zT3 = aVarC.t(serialDescriptor, 6);
                    i11 |= 64;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new SignUpByThirdPartyRequest(i11, str, strU, strU2, str2, zT, zT2, zT3, (m1) null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull SignUpByThirdPartyRequest value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b bVarC = encoder.c(serialDescriptor);
        SignUpByThirdPartyRequest.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
