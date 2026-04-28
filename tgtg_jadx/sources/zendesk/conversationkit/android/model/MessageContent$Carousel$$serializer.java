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
import o30.f0;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;
import zendesk.conversationkit.android.model.MessageContent;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"zendesk/conversationkit/android/model/MessageContent.Carousel.$serializer", "Lm90/d0;", "Lzendesk/conversationkit/android/model/MessageContent$Carousel;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lzendesk/conversationkit/android/model/MessageContent$Carousel;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lzendesk/conversationkit/android/model/MessageContent$Carousel;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class MessageContent$Carousel$$serializer implements d0 {

    @NotNull
    public static final MessageContent$Carousel$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        MessageContent$Carousel$$serializer messageContent$Carousel$$serializer = new MessageContent$Carousel$$serializer();
        INSTANCE = messageContent$Carousel$$serializer;
        e1 e1Var = new e1("carousel", messageContent$Carousel$$serializer, 3);
        e1Var.j("items", false);
        e1Var.j("sourceType", true);
        e1Var.j("blockChatInput", true);
        descriptor = e1Var;
    }

    private MessageContent$Carousel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = MessageContent.Carousel.$childSerializers;
        return new KSerializer[]{jVarArr[0].getValue(), jVarArr[1].getValue(), f0.B(g.f29797a)};
    }

    @Override // i90.b
    @NotNull
    public final MessageContent.Carousel deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = MessageContent.Carousel.$childSerializers;
        int i11 = 0;
        List list = null;
        MessageSourceType messageSourceType = null;
        Boolean bool = null;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                list = (List) aVarC.n(serialDescriptor, 0, (b) jVarArr[0].getValue(), list);
                i11 |= 1;
            } else if (iW == 1) {
                messageSourceType = (MessageSourceType) aVarC.n(serialDescriptor, 1, (b) jVarArr[1].getValue(), messageSourceType);
                i11 |= 2;
            } else {
                if (iW != 2) {
                    w.e(iW);
                    return null;
                }
                bool = (Boolean) aVarC.m(serialDescriptor, 2, g.f29797a, bool);
                i11 |= 4;
            }
        }
        aVarC.b(serialDescriptor);
        return new MessageContent.Carousel(i11, list, messageSourceType, bool, (m1) null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull MessageContent.Carousel value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        MessageContent.Carousel.write$Self$zendesk_conversationkit_conversationkit_android(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
