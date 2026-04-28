package zendesk.conversationkit.android.model;

import c50.w;
import i90.b;
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
import m90.g;
import m90.r1;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;
import zendesk.conversationkit.android.model.MessageAction;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"zendesk/conversationkit/android/model/MessageAction.WebView.$serializer", "Lm90/d0;", "Lzendesk/conversationkit/android/model/MessageAction$WebView;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lzendesk/conversationkit/android/model/MessageAction$WebView;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lzendesk/conversationkit/android/model/MessageAction$WebView;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class MessageAction$WebView$$serializer implements d0 {

    @NotNull
    public static final MessageAction$WebView$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        MessageAction$WebView$$serializer messageAction$WebView$$serializer = new MessageAction$WebView$$serializer();
        INSTANCE = messageAction$WebView$$serializer;
        e1 e1Var = new e1("webview", messageAction$WebView$$serializer, 10);
        e1Var.j("messageActionType", false);
        e1Var.j("id", false);
        e1Var.j("metadata", true);
        e1Var.j(TextBundle.TEXT_ENTRY, false);
        e1Var.j("uri", false);
        e1Var.j("fallback", false);
        e1Var.j("default", false);
        e1Var.j("openOnReceive", false);
        e1Var.j("size", false);
        e1Var.j("sourceType", false);
        descriptor = e1Var;
    }

    private MessageAction$WebView$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = MessageAction.WebView.$childSerializers;
        r1 r1Var = r1.f29848a;
        g gVar = g.f29797a;
        return new KSerializer[]{jVarArr[0].getValue(), r1Var, jVarArr[2].getValue(), r1Var, r1Var, r1Var, gVar, gVar, jVarArr[8].getValue(), jVarArr[9].getValue()};
    }

    @Override // i90.b
    @NotNull
    public final MessageAction.WebView deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = MessageAction.WebView.$childSerializers;
        MessageActionSize messageActionSize = null;
        MessageSourceType messageSourceType = null;
        MessageActionType messageActionType = null;
        String strU = null;
        Map map = null;
        String strU2 = null;
        String strU3 = null;
        String strU4 = null;
        boolean z11 = true;
        int i11 = 0;
        boolean zT = false;
        boolean zT2 = false;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    messageActionType = (MessageActionType) aVarC.n(serialDescriptor, 0, (b) jVarArr[0].getValue(), messageActionType);
                    i11 |= 1;
                    break;
                case 1:
                    strU = aVarC.u(serialDescriptor, 1);
                    i11 |= 2;
                    break;
                case 2:
                    map = (Map) aVarC.n(serialDescriptor, 2, (b) jVarArr[2].getValue(), map);
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
                    strU4 = aVarC.u(serialDescriptor, 5);
                    i11 |= 32;
                    break;
                case 6:
                    zT = aVarC.t(serialDescriptor, 6);
                    i11 |= 64;
                    break;
                case 7:
                    zT2 = aVarC.t(serialDescriptor, 7);
                    i11 |= 128;
                    break;
                case 8:
                    messageActionSize = (MessageActionSize) aVarC.n(serialDescriptor, 8, (b) jVarArr[8].getValue(), messageActionSize);
                    i11 |= 256;
                    break;
                case 9:
                    messageSourceType = (MessageSourceType) aVarC.n(serialDescriptor, 9, (b) jVarArr[9].getValue(), messageSourceType);
                    i11 |= 512;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new MessageAction.WebView(i11, messageActionType, strU, map, strU2, strU3, strU4, zT, zT2, messageActionSize, messageSourceType, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull MessageAction.WebView value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        MessageAction.WebView.write$Self$zendesk_conversationkit_conversationkit_android(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
