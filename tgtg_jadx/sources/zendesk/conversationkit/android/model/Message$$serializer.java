package zendesk.conversationkit.android.model;

import c50.w;
import i90.b;
import java.util.Date;
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
import m90.v;
import o30.f0;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"zendesk/conversationkit/android/model/Message.$serializer", "Lm90/d0;", "Lzendesk/conversationkit/android/model/Message;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lzendesk/conversationkit/android/model/Message;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lzendesk/conversationkit/android/model/Message;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class Message$$serializer implements d0 {

    @NotNull
    public static final Message$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Message$$serializer message$$serializer = new Message$$serializer();
        INSTANCE = message$$serializer;
        e1 e1Var = new e1("zendesk.conversationkit.android.model.Message", message$$serializer, 11);
        e1Var.j("id", false);
        e1Var.j("author", false);
        e1Var.j("status", false);
        e1Var.j("created", false);
        e1Var.j("received", false);
        e1Var.j("beforeTimestamp", false);
        e1Var.j("content", false);
        e1Var.j("metadata", false);
        e1Var.j("sourceId", false);
        e1Var.j("localId", false);
        e1Var.j("payload", false);
        descriptor = e1Var;
    }

    private Message$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = Message.$childSerializers;
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{r1Var, Author$$serializer.INSTANCE, jVarArr[2].getValue(), f0.B((KSerializer) jVarArr[3].getValue()), jVarArr[4].getValue(), v.f29868a, jVarArr[6].getValue(), f0.B((KSerializer) jVarArr[7].getValue()), f0.B(r1Var), r1Var, f0.B(r1Var)};
    }

    @Override // i90.b
    @NotNull
    public final Message deserialize(@NotNull Decoder decoder) {
        j[] jVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr2 = Message.$childSerializers;
        MessageContent messageContent = null;
        String str = null;
        String strU = null;
        Author author = null;
        MessageStatus messageStatus = null;
        Date date = null;
        Date date2 = null;
        String strU2 = null;
        double dY = 0.0d;
        int i11 = 0;
        boolean z11 = true;
        Map map = null;
        String str2 = null;
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
                    author = (Author) aVarC.n(serialDescriptor, 1, Author$$serializer.INSTANCE, author);
                    i11 |= 2;
                    break;
                case 2:
                    jVarArr = jVarArr2;
                    messageStatus = (MessageStatus) aVarC.n(serialDescriptor, 2, (b) jVarArr[2].getValue(), messageStatus);
                    i11 |= 4;
                    break;
                case 3:
                    jVarArr = jVarArr2;
                    date = (Date) aVarC.m(serialDescriptor, 3, (b) jVarArr[3].getValue(), date);
                    i11 |= 8;
                    break;
                case 4:
                    jVarArr = jVarArr2;
                    date2 = (Date) aVarC.n(serialDescriptor, 4, (b) jVarArr[4].getValue(), date2);
                    i11 |= 16;
                    break;
                case 5:
                    jVarArr = jVarArr2;
                    dY = aVarC.y(serialDescriptor, 5);
                    i11 |= 32;
                    break;
                case 6:
                    jVarArr = jVarArr2;
                    messageContent = (MessageContent) aVarC.n(serialDescriptor, 6, (b) jVarArr[6].getValue(), messageContent);
                    i11 |= 64;
                    break;
                case 7:
                    jVarArr = jVarArr2;
                    map = (Map) aVarC.m(serialDescriptor, 7, (b) jVarArr[7].getValue(), map);
                    i11 |= 128;
                    break;
                case 8:
                    jVarArr = jVarArr2;
                    str2 = (String) aVarC.m(serialDescriptor, 8, r1.f29848a, str2);
                    i11 |= 256;
                    break;
                case 9:
                    jVarArr = jVarArr2;
                    strU2 = aVarC.u(serialDescriptor, 9);
                    i11 |= 512;
                    break;
                case 10:
                    jVarArr = jVarArr2;
                    str = (String) aVarC.m(serialDescriptor, 10, r1.f29848a, str);
                    i11 |= 1024;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
            jVarArr2 = jVarArr;
        }
        aVarC.b(serialDescriptor);
        return new Message(i11, strU, author, messageStatus, date, date2, dY, messageContent, map, str2, strU2, str, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Message value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        Message.write$Self$zendesk_conversationkit_conversationkit_android(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
