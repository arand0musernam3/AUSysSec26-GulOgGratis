package com.app.tgtg.model.remote.order;

import c50.w;
import com.app.tgtg.model.remote.VoucherId;
import com.app.tgtg.model.remote.VoucherId$$serializer;
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
import org.jetbrains.annotations.NotNull;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/order/AuthorizationPayload.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/order/AuthorizationPayload;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/order/AuthorizationPayload;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/order/AuthorizationPayload;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class AuthorizationPayload$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final AuthorizationPayload$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        AuthorizationPayload$$serializer authorizationPayload$$serializer = new AuthorizationPayload$$serializer();
        INSTANCE = authorizationPayload$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.order.AuthorizationPayload", authorizationPayload$$serializer, 9);
        e1Var.j("biometrics_protected_secret", true);
        e1Var.j("voucher_id", true);
        e1Var.j("save_payment_method", true);
        e1Var.j("payment_type", true);
        e1Var.j("type", true);
        e1Var.j("payload", true);
        e1Var.j("details_payload", true);
        e1Var.j("payment_method_token", true);
        e1Var.j("zip_code", true);
        descriptor = e1Var;
    }

    private AuthorizationPayload$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{f0.B(r1Var), f0.B(VoucherId$$serializer.INSTANCE), g.f29797a, f0.B(r1Var), f0.B(AuthPayloadSerializer.INSTANCE), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var)};
    }

    @Override // i90.b
    @NotNull
    public final AuthorizationPayload deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        boolean z11 = true;
        String str = null;
        int i11 = 0;
        String str2 = null;
        String strM306unboximpl = null;
        boolean zT = false;
        String str3 = null;
        AuthPayloadType authPayloadType = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    str2 = (String) aVarC.m(serialDescriptor, 0, r1.f29848a, str2);
                    i11 |= 1;
                    break;
                case 1:
                    VoucherId voucherId = (VoucherId) aVarC.m(serialDescriptor, 1, VoucherId$$serializer.INSTANCE, strM306unboximpl != null ? VoucherId.m298boximpl(strM306unboximpl) : null);
                    strM306unboximpl = voucherId != null ? voucherId.m306unboximpl() : null;
                    i11 |= 2;
                    break;
                case 2:
                    zT = aVarC.t(serialDescriptor, 2);
                    i11 |= 4;
                    break;
                case 3:
                    str3 = (String) aVarC.m(serialDescriptor, 3, r1.f29848a, str3);
                    i11 |= 8;
                    break;
                case 4:
                    authPayloadType = (AuthPayloadType) aVarC.m(serialDescriptor, 4, AuthPayloadSerializer.INSTANCE, authPayloadType);
                    i11 |= 16;
                    break;
                case 5:
                    str4 = (String) aVarC.m(serialDescriptor, 5, r1.f29848a, str4);
                    i11 |= 32;
                    break;
                case 6:
                    str5 = (String) aVarC.m(serialDescriptor, 6, r1.f29848a, str5);
                    i11 |= 64;
                    break;
                case 7:
                    str6 = (String) aVarC.m(serialDescriptor, 7, r1.f29848a, str6);
                    i11 |= 128;
                    break;
                case 8:
                    str = (String) aVarC.m(serialDescriptor, 8, r1.f29848a, str);
                    i11 |= 256;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new AuthorizationPayload(i11, str2, strM306unboximpl, zT, str3, authPayloadType, str4, str5, str6, str, null, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull AuthorizationPayload value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b bVarC = encoder.c(serialDescriptor);
        AuthorizationPayload.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
