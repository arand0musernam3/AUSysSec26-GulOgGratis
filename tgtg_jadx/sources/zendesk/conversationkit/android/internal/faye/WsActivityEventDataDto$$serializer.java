package zendesk.conversationkit.android.internal.faye;

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
import m90.q0;
import m90.r1;
import m90.v;
import o30.f0;
import org.jetbrains.annotations.NotNull;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"zendesk/conversationkit/android/internal/faye/WsActivityEventDataDto.$serializer", "Lm90/d0;", "Lzendesk/conversationkit/android/internal/faye/WsActivityEventDataDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lzendesk/conversationkit/android/internal/faye/WsActivityEventDataDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lzendesk/conversationkit/android/internal/faye/WsActivityEventDataDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class WsActivityEventDataDto$$serializer implements d0 {

    @NotNull
    public static final WsActivityEventDataDto$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        WsActivityEventDataDto$$serializer wsActivityEventDataDto$$serializer = new WsActivityEventDataDto$$serializer();
        INSTANCE = wsActivityEventDataDto$$serializer;
        e1 e1Var = new e1("zendesk.conversationkit.android.internal.faye.WsActivityEventDataDto", wsActivityEventDataDto$$serializer, 6);
        e1Var.j("name", true);
        e1Var.j("avatarUrl", true);
        e1Var.j("lastRead", true);
        e1Var.j("responseTime", true);
        e1Var.j("queuePosition", true);
        e1Var.j("lowestQueuePosition", true);
        descriptor = e1Var;
    }

    private WsActivityEventDataDto$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        r1 r1Var = r1.f29848a;
        KSerializer kSerializerB = f0.B(r1Var);
        KSerializer kSerializerB2 = f0.B(r1Var);
        KSerializer kSerializerB3 = f0.B(v.f29868a);
        KSerializer kSerializerB4 = f0.B(WsResponseTimeDto$$serializer.INSTANCE);
        q0 q0Var = q0.f29842a;
        return new KSerializer[]{kSerializerB, kSerializerB2, kSerializerB3, kSerializerB4, f0.B(q0Var), f0.B(q0Var)};
    }

    @Override // i90.b
    @NotNull
    public final WsActivityEventDataDto deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        int i11 = 0;
        String str = null;
        String str2 = null;
        Double d3 = null;
        WsResponseTimeDto wsResponseTimeDto = null;
        Long l = null;
        Long l7 = null;
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
                    str2 = (String) aVarC.m(serialDescriptor, 1, r1.f29848a, str2);
                    i11 |= 2;
                    break;
                case 2:
                    d3 = (Double) aVarC.m(serialDescriptor, 2, v.f29868a, d3);
                    i11 |= 4;
                    break;
                case 3:
                    wsResponseTimeDto = (WsResponseTimeDto) aVarC.m(serialDescriptor, 3, WsResponseTimeDto$$serializer.INSTANCE, wsResponseTimeDto);
                    i11 |= 8;
                    break;
                case 4:
                    l = (Long) aVarC.m(serialDescriptor, 4, q0.f29842a, l);
                    i11 |= 16;
                    break;
                case 5:
                    l7 = (Long) aVarC.m(serialDescriptor, 5, q0.f29842a, l7);
                    i11 |= 32;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new WsActivityEventDataDto(i11, str, str2, d3, wsResponseTimeDto, l, l7, (m1) null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull WsActivityEventDataDto value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b bVarC = encoder.c(serialDescriptor);
        WsActivityEventDataDto.write$Self$zendesk_conversationkit_conversationkit_android(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
