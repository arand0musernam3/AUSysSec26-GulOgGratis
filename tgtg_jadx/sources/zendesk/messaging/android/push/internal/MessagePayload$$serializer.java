package zendesk.messaging.android.push.internal;

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
import m90.q0;
import m90.r1;
import m90.v;
import o30.f0;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"zendesk/messaging/android/push/internal/MessagePayload.$serializer", "Lm90/d0;", "Lzendesk/messaging/android/push/internal/MessagePayload;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lzendesk/messaging/android/push/internal/MessagePayload;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lzendesk/messaging/android/push/internal/MessagePayload;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class MessagePayload$$serializer implements d0 {

    @NotNull
    public static final MessagePayload$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        MessagePayload$$serializer messagePayload$$serializer = new MessagePayload$$serializer();
        INSTANCE = messagePayload$$serializer;
        e1 e1Var = new e1("zendesk.messaging.android.push.internal.MessagePayload", messagePayload$$serializer, 11);
        e1Var.j("_id", false);
        e1Var.j("authorId", false);
        e1Var.j("role", false);
        e1Var.j("name", false);
        e1Var.j("avatarUrl", false);
        e1Var.j("received", false);
        e1Var.j("type", false);
        e1Var.j(TextBundle.TEXT_ENTRY, false);
        e1Var.j("mediaUrl", false);
        e1Var.j("mediaType", false);
        e1Var.j("mediaSize", false);
        descriptor = e1Var;
    }

    private MessagePayload$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{r1Var, r1Var, r1Var, f0.B(r1Var), f0.B(r1Var), v.f29868a, r1Var, f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B(q0.f29842a)};
    }

    @Override // i90.b
    @NotNull
    public final MessagePayload deserialize(@NotNull Decoder decoder) {
        boolean z11;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        String str = null;
        Long l = null;
        String strU = null;
        String strU2 = null;
        String strU3 = null;
        String str2 = null;
        String str3 = null;
        String strU4 = null;
        double dY = 0.0d;
        int i11 = 0;
        boolean z12 = true;
        String str4 = null;
        String str5 = null;
        while (z12) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z12 = false;
                    continue;
                case 0:
                    z11 = z12;
                    strU = aVarC.u(serialDescriptor, 0);
                    i11 |= 1;
                    break;
                case 1:
                    strU2 = aVarC.u(serialDescriptor, 1);
                    i11 |= 2;
                    continue;
                case 2:
                    strU3 = aVarC.u(serialDescriptor, 2);
                    i11 |= 4;
                    continue;
                case 3:
                    z11 = z12;
                    str2 = (String) aVarC.m(serialDescriptor, 3, r1.f29848a, str2);
                    i11 |= 8;
                    break;
                case 4:
                    z11 = z12;
                    str3 = (String) aVarC.m(serialDescriptor, 4, r1.f29848a, str3);
                    i11 |= 16;
                    break;
                case 5:
                    dY = aVarC.y(serialDescriptor, 5);
                    i11 |= 32;
                    continue;
                case 6:
                    strU4 = aVarC.u(serialDescriptor, 6);
                    i11 |= 64;
                    continue;
                case 7:
                    z11 = z12;
                    str = (String) aVarC.m(serialDescriptor, 7, r1.f29848a, str);
                    i11 |= 128;
                    break;
                case 8:
                    z11 = z12;
                    str4 = (String) aVarC.m(serialDescriptor, 8, r1.f29848a, str4);
                    i11 |= 256;
                    break;
                case 9:
                    z11 = z12;
                    str5 = (String) aVarC.m(serialDescriptor, 9, r1.f29848a, str5);
                    i11 |= 512;
                    break;
                case 10:
                    z11 = z12;
                    l = (Long) aVarC.m(serialDescriptor, 10, q0.f29842a, l);
                    i11 |= 1024;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
            z12 = z11;
        }
        aVarC.b(serialDescriptor);
        return new MessagePayload(i11, strU, strU2, strU3, str2, str3, dY, strU4, str, str4, str5, l, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull MessagePayload value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b bVarC = encoder.c(serialDescriptor);
        MessagePayload.write$Self$zendesk_messaging_messaging_android(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
