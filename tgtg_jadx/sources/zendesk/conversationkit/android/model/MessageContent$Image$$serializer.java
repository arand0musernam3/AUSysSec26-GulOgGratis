package zendesk.conversationkit.android.model;

import c50.w;
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
import m90.g;
import m90.m1;
import m90.q0;
import m90.r1;
import o30.f0;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;
import zendesk.conversationkit.android.model.MessageContent;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"zendesk/conversationkit/android/model/MessageContent.Image.$serializer", "Lm90/d0;", "Lzendesk/conversationkit/android/model/MessageContent$Image;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lzendesk/conversationkit/android/model/MessageContent$Image;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lzendesk/conversationkit/android/model/MessageContent$Image;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class MessageContent$Image$$serializer implements d0 {

    @NotNull
    public static final MessageContent$Image$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        MessageContent$Image$$serializer messageContent$Image$$serializer = new MessageContent$Image$$serializer();
        INSTANCE = messageContent$Image$$serializer;
        e1 e1Var = new e1("image", messageContent$Image$$serializer, 11);
        e1Var.j(TextBundle.TEXT_ENTRY, false);
        e1Var.j("mediaUrl", false);
        e1Var.j("localUri", false);
        e1Var.j("mediaType", false);
        e1Var.j("mediaSize", false);
        e1Var.j("actions", true);
        e1Var.j("attachmentId", false);
        e1Var.j("htmlText", true);
        e1Var.j("altText", true);
        e1Var.j("sourceType", true);
        e1Var.j("blockChatInput", true);
        descriptor = e1Var;
    }

    private MessageContent$Image$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = MessageContent.Image.$childSerializers;
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{r1Var, r1Var, f0.B(r1Var), r1Var, q0.f29842a, f0.B((KSerializer) jVarArr[5].getValue()), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), jVarArr[9].getValue(), f0.B(g.f29797a)};
    }

    @Override // i90.b
    @NotNull
    public final MessageContent.Image deserialize(@NotNull Decoder decoder) {
        j[] jVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr2 = MessageContent.Image.$childSerializers;
        List list = null;
        String str = null;
        MessageSourceType messageSourceType = null;
        String strU = null;
        String strU2 = null;
        String str2 = null;
        String strU3 = null;
        Boolean bool = null;
        long jK = 0;
        int i11 = 0;
        boolean z11 = true;
        String str3 = null;
        String str4 = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    jVarArr = jVarArr2;
                    z11 = false;
                    break;
                case 0:
                    jVarArr = jVarArr2;
                    strU = aVarC.u(serialDescriptor, 0);
                    i11 |= 1;
                    break;
                case 1:
                    jVarArr = jVarArr2;
                    strU2 = aVarC.u(serialDescriptor, 1);
                    i11 |= 2;
                    break;
                case 2:
                    jVarArr = jVarArr2;
                    str2 = (String) aVarC.m(serialDescriptor, 2, r1.f29848a, str2);
                    i11 |= 4;
                    break;
                case 3:
                    jVarArr = jVarArr2;
                    strU3 = aVarC.u(serialDescriptor, 3);
                    i11 |= 8;
                    break;
                case 4:
                    jVarArr = jVarArr2;
                    jK = aVarC.k(serialDescriptor, 4);
                    i11 |= 16;
                    break;
                case 5:
                    jVarArr = jVarArr2;
                    list = (List) aVarC.m(serialDescriptor, 5, (b) jVarArr[5].getValue(), list);
                    i11 |= 32;
                    break;
                case 6:
                    jVarArr = jVarArr2;
                    str3 = (String) aVarC.m(serialDescriptor, 6, r1.f29848a, str3);
                    i11 |= 64;
                    break;
                case 7:
                    jVarArr = jVarArr2;
                    str4 = (String) aVarC.m(serialDescriptor, 7, r1.f29848a, str4);
                    i11 |= 128;
                    break;
                case 8:
                    jVarArr = jVarArr2;
                    str = (String) aVarC.m(serialDescriptor, 8, r1.f29848a, str);
                    i11 |= 256;
                    break;
                case 9:
                    jVarArr = jVarArr2;
                    messageSourceType = (MessageSourceType) aVarC.n(serialDescriptor, 9, (b) jVarArr[9].getValue(), messageSourceType);
                    i11 |= 512;
                    break;
                case 10:
                    jVarArr = jVarArr2;
                    bool = (Boolean) aVarC.m(serialDescriptor, 10, g.f29797a, bool);
                    i11 |= 1024;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
            jVarArr2 = jVarArr;
        }
        aVarC.b(serialDescriptor);
        return new MessageContent.Image(i11, strU, strU2, str2, strU3, jK, list, str3, str4, str, messageSourceType, bool, (m1) null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull MessageContent.Image value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        MessageContent.Image.write$Self$zendesk_conversationkit_conversationkit_android(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
