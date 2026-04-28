package zendesk.conversationkit.android.model;

import c50.w;
import i90.b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import l90.a;
import m90.c1;
import m90.d0;
import m90.e1;
import m90.r1;
import o30.f0;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"zendesk/conversationkit/android/model/MessageItem.$serializer", "Lm90/d0;", "Lzendesk/conversationkit/android/model/MessageItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lzendesk/conversationkit/android/model/MessageItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lzendesk/conversationkit/android/model/MessageItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class MessageItem$$serializer implements d0 {

    @NotNull
    public static final MessageItem$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        MessageItem$$serializer messageItem$$serializer = new MessageItem$$serializer();
        INSTANCE = messageItem$$serializer;
        e1 e1Var = new e1("zendesk.conversationkit.android.model.MessageItem", messageItem$$serializer, 7);
        e1Var.j(MessageBundle.TITLE_ENTRY, false);
        e1Var.j("description", false);
        e1Var.j("actions", false);
        e1Var.j("size", false);
        e1Var.j("metadata", false);
        e1Var.j("mediaUrl", false);
        e1Var.j("mediaType", false);
        descriptor = e1Var;
    }

    private MessageItem$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = MessageItem.$childSerializers;
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{r1Var, f0.B(r1Var), jVarArr[2].getValue(), jVarArr[3].getValue(), f0.B((KSerializer) jVarArr[4].getValue()), f0.B(r1Var), f0.B(r1Var)};
    }

    @Override // i90.b
    @NotNull
    public final MessageItem deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = MessageItem.$childSerializers;
        int i11 = 0;
        String strU = null;
        String str = null;
        List list = null;
        MessageItemSize messageItemSize = null;
        Map map = null;
        String str2 = null;
        String str3 = null;
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
                    list = (List) aVarC.n(serialDescriptor, 2, (b) jVarArr[2].getValue(), list);
                    i11 |= 4;
                    break;
                case 3:
                    messageItemSize = (MessageItemSize) aVarC.n(serialDescriptor, 3, (b) jVarArr[3].getValue(), messageItemSize);
                    i11 |= 8;
                    break;
                case 4:
                    map = (Map) aVarC.m(serialDescriptor, 4, (b) jVarArr[4].getValue(), map);
                    i11 |= 16;
                    break;
                case 5:
                    str2 = (String) aVarC.m(serialDescriptor, 5, r1.f29848a, str2);
                    i11 |= 32;
                    break;
                case 6:
                    str3 = (String) aVarC.m(serialDescriptor, 6, r1.f29848a, str3);
                    i11 |= 64;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new MessageItem(i11, strU, str, list, messageItemSize, map, str2, str3, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull MessageItem value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        MessageItem.write$Self$zendesk_conversationkit_conversationkit_android(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
