package zendesk.conversationkit.android.model;

import c50.w;
import i90.b;
import java.util.Date;
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
import m90.g;
import m90.m1;
import m90.r1;
import m90.v;
import o30.f0;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;
import zendesk.conversationkit.android.model.ConversationRoutingStatus;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"zendesk/conversationkit/android/model/Conversation.$serializer", "Lm90/d0;", "Lzendesk/conversationkit/android/model/Conversation;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lzendesk/conversationkit/android/model/Conversation;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lzendesk/conversationkit/android/model/Conversation;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class Conversation$$serializer implements d0 {

    @NotNull
    public static final Conversation$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Conversation$$serializer conversation$$serializer = new Conversation$$serializer();
        INSTANCE = conversation$$serializer;
        e1 e1Var = new e1("zendesk.conversationkit.android.model.Conversation", conversation$$serializer, 17);
        e1Var.j("id", false);
        e1Var.j("displayName", false);
        e1Var.j("description", false);
        e1Var.j("iconUrl", false);
        e1Var.j("type", false);
        e1Var.j("isDefault", false);
        e1Var.j("business", false);
        e1Var.j("businessLastRead", false);
        e1Var.j("lastUpdatedAt", false);
        e1Var.j("myself", false);
        e1Var.j("participants", false);
        e1Var.j("messages", false);
        e1Var.j("hasPrevious", false);
        e1Var.j("status", false);
        e1Var.j("metadata", false);
        e1Var.j("routingStatus", true);
        e1Var.j("createdAt", false);
        descriptor = e1Var;
    }

    private Conversation$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = Conversation.$childSerializers;
        r1 r1Var = r1.f29848a;
        g gVar = g.f29797a;
        return new KSerializer[]{r1Var, f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), jVarArr[4].getValue(), gVar, jVarArr[6].getValue(), f0.B((KSerializer) jVarArr[7].getValue()), f0.B(v.f29868a), f0.B(Participant$$serializer.INSTANCE), jVarArr[10].getValue(), jVarArr[11].getValue(), gVar, jVarArr[13].getValue(), f0.B((KSerializer) jVarArr[14].getValue()), ConversationRoutingStatus.ConversationRoutingStatusSerializer.INSTANCE, f0.B((KSerializer) jVarArr[16].getValue())};
    }

    @Override // i90.b
    @NotNull
    public final Conversation deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        ConversationRoutingStatus conversationRoutingStatus;
        String str3;
        int i11;
        String str4;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = Conversation.$childSerializers;
        Double d3 = null;
        ConversationRoutingStatus conversationRoutingStatus2 = null;
        Map map = null;
        ConversationStatus conversationStatus = null;
        Participant participant = null;
        List list = null;
        Date date = null;
        String str5 = null;
        String str6 = null;
        ConversationType conversationType = null;
        List list2 = null;
        List list3 = null;
        Date date2 = null;
        String strU = null;
        String str7 = null;
        int i12 = 0;
        boolean z11 = true;
        boolean zT = false;
        boolean zT2 = false;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    str = str5;
                    str2 = str6;
                    z11 = false;
                    str5 = str;
                    str6 = str2;
                    break;
                case 0:
                    conversationRoutingStatus = conversationRoutingStatus2;
                    str3 = str5;
                    str2 = str6;
                    strU = aVarC.u(serialDescriptor, 0);
                    i12 |= 1;
                    str5 = str3;
                    conversationRoutingStatus2 = conversationRoutingStatus;
                    str6 = str2;
                    break;
                case 1:
                    conversationRoutingStatus = conversationRoutingStatus2;
                    str2 = str6;
                    str3 = str5;
                    str7 = (String) aVarC.m(serialDescriptor, 1, r1.f29848a, str7);
                    i12 |= 2;
                    str5 = str3;
                    conversationRoutingStatus2 = conversationRoutingStatus;
                    str6 = str2;
                    break;
                case 2:
                    conversationRoutingStatus = conversationRoutingStatus2;
                    str2 = str6;
                    str5 = (String) aVarC.m(serialDescriptor, 2, r1.f29848a, str5);
                    i12 |= 4;
                    conversationRoutingStatus2 = conversationRoutingStatus;
                    str6 = str2;
                    break;
                case 3:
                    str6 = (String) aVarC.m(serialDescriptor, 3, r1.f29848a, str6);
                    i12 |= 8;
                    str5 = str5;
                    conversationRoutingStatus2 = conversationRoutingStatus2;
                    break;
                case 4:
                    str = str5;
                    str2 = str6;
                    conversationType = (ConversationType) aVarC.n(serialDescriptor, 4, (b) jVarArr[4].getValue(), conversationType);
                    i12 |= 16;
                    str5 = str;
                    str6 = str2;
                    break;
                case 5:
                    str4 = str5;
                    zT = aVarC.t(serialDescriptor, 5);
                    i12 |= 32;
                    str5 = str4;
                    break;
                case 6:
                    str = str5;
                    str2 = str6;
                    list3 = (List) aVarC.n(serialDescriptor, 6, (b) jVarArr[6].getValue(), list3);
                    i12 |= 64;
                    str5 = str;
                    str6 = str2;
                    break;
                case 7:
                    str = str5;
                    str2 = str6;
                    date2 = (Date) aVarC.m(serialDescriptor, 7, (b) jVarArr[7].getValue(), date2);
                    i12 |= 128;
                    str5 = str;
                    str6 = str2;
                    break;
                case 8:
                    str = str5;
                    str2 = str6;
                    d3 = (Double) aVarC.m(serialDescriptor, 8, v.f29868a, d3);
                    i12 |= 256;
                    str5 = str;
                    str6 = str2;
                    break;
                case 9:
                    str = str5;
                    str2 = str6;
                    participant = (Participant) aVarC.m(serialDescriptor, 9, Participant$$serializer.INSTANCE, participant);
                    i12 |= 512;
                    str5 = str;
                    str6 = str2;
                    break;
                case 10:
                    str = str5;
                    str2 = str6;
                    list = (List) aVarC.n(serialDescriptor, 10, (b) jVarArr[10].getValue(), list);
                    i12 |= 1024;
                    str5 = str;
                    str6 = str2;
                    break;
                case 11:
                    str = str5;
                    str2 = str6;
                    list2 = (List) aVarC.n(serialDescriptor, 11, (b) jVarArr[11].getValue(), list2);
                    i12 |= NewHope.SENDB_BYTES;
                    str5 = str;
                    str6 = str2;
                    break;
                case 12:
                    str4 = str5;
                    zT2 = aVarC.t(serialDescriptor, 12);
                    i12 |= 4096;
                    str5 = str4;
                    break;
                case 13:
                    str = str5;
                    str2 = str6;
                    conversationStatus = (ConversationStatus) aVarC.n(serialDescriptor, 13, (b) jVarArr[13].getValue(), conversationStatus);
                    i12 |= 8192;
                    str5 = str;
                    str6 = str2;
                    break;
                case 14:
                    str = str5;
                    str2 = str6;
                    map = (Map) aVarC.m(serialDescriptor, 14, (b) jVarArr[14].getValue(), map);
                    i12 |= BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
                    str5 = str;
                    str6 = str2;
                    break;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    str = str5;
                    str2 = str6;
                    conversationRoutingStatus2 = (ConversationRoutingStatus) aVarC.n(serialDescriptor, 15, ConversationRoutingStatus.ConversationRoutingStatusSerializer.INSTANCE, conversationRoutingStatus2);
                    i11 = 32768;
                    i12 |= i11;
                    str5 = str;
                    str6 = str2;
                    break;
                case 16:
                    str = str5;
                    str2 = str6;
                    date = (Date) aVarC.m(serialDescriptor, 16, (b) jVarArr[16].getValue(), date);
                    i11 = 65536;
                    i12 |= i11;
                    str5 = str;
                    str6 = str2;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        String str8 = str6;
        String str9 = str7;
        aVarC.b(serialDescriptor);
        Date date3 = date;
        return new Conversation(i12, strU, str9, str5, str8, conversationType, zT, list3, date2, d3, participant, list, list2, zT2, conversationStatus, map, conversationRoutingStatus2, date3, (m1) null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Conversation value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        Conversation.write$Self$zendesk_conversationkit_conversationkit_android(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
