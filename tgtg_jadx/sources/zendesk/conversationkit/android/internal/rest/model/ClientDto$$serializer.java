package zendesk.conversationkit.android.internal.rest.model;

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
import m90.m1;
import m90.r1;
import o30.f0;
import org.jetbrains.annotations.NotNull;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"zendesk/conversationkit/android/internal/rest/model/ClientDto.$serializer", "Lm90/d0;", "Lzendesk/conversationkit/android/internal/rest/model/ClientDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lzendesk/conversationkit/android/internal/rest/model/ClientDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lzendesk/conversationkit/android/internal/rest/model/ClientDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class ClientDto$$serializer implements d0 {

    @NotNull
    public static final ClientDto$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ClientDto$$serializer clientDto$$serializer = new ClientDto$$serializer();
        INSTANCE = clientDto$$serializer;
        e1 e1Var = new e1("zendesk.conversationkit.android.internal.rest.model.ClientDto", clientDto$$serializer, 9);
        e1Var.j("id", false);
        e1Var.j("status", true);
        e1Var.j("lastSeen", true);
        e1Var.j("platform", false);
        e1Var.j("integrationId", false);
        e1Var.j("pushNotificationToken", false);
        e1Var.j("appVersion", false);
        e1Var.j("displayName", true);
        e1Var.j("info", true);
        descriptor = e1Var;
    }

    private ClientDto$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{r1Var, f0.B(r1Var), f0.B(r1Var), r1Var, r1Var, f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B(ClientInfoDto$$serializer.INSTANCE)};
    }

    @Override // i90.b
    @NotNull
    public final ClientDto deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        String strU = null;
        String str = null;
        String str2 = null;
        String strU2 = null;
        String strU3 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ClientInfoDto clientInfoDto = null;
        int i11 = 0;
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
                    str = (String) aVarC.m(serialDescriptor, 1, r1.f29848a, str);
                    i11 |= 2;
                    break;
                case 2:
                    str2 = (String) aVarC.m(serialDescriptor, 2, r1.f29848a, str2);
                    i11 |= 4;
                    break;
                case 3:
                    strU2 = aVarC.u(serialDescriptor, 3);
                    i11 |= 8;
                    break;
                case 4:
                    strU3 = aVarC.u(serialDescriptor, 4);
                    i11 |= 16;
                    break;
                case 5:
                    str3 = (String) aVarC.m(serialDescriptor, 5, r1.f29848a, str3);
                    i11 |= 32;
                    break;
                case 6:
                    str4 = (String) aVarC.m(serialDescriptor, 6, r1.f29848a, str4);
                    i11 |= 64;
                    break;
                case 7:
                    str5 = (String) aVarC.m(serialDescriptor, 7, r1.f29848a, str5);
                    i11 |= 128;
                    break;
                case 8:
                    clientInfoDto = (ClientInfoDto) aVarC.m(serialDescriptor, 8, ClientInfoDto$$serializer.INSTANCE, clientInfoDto);
                    i11 |= 256;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new ClientDto(i11, strU, str, str2, strU2, strU3, str3, str4, str5, clientInfoDto, (m1) null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ClientDto value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b bVarC = encoder.c(serialDescriptor);
        ClientDto.write$Self$zendesk_conversationkit_conversationkit_android(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
