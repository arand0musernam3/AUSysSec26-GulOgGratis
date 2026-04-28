package zendesk.conversationkit.android.internal.rest.model;

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
import m90.m1;
import m90.r1;
import o30.f0;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;
import zendesk.conversationkit.android.model.ConversationType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"zendesk/conversationkit/android/internal/rest/model/CreateConversationRequestDto.$serializer", "Lm90/d0;", "Lzendesk/conversationkit/android/internal/rest/model/CreateConversationRequestDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lzendesk/conversationkit/android/internal/rest/model/CreateConversationRequestDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lzendesk/conversationkit/android/internal/rest/model/CreateConversationRequestDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class CreateConversationRequestDto$$serializer implements d0 {

    @NotNull
    public static final CreateConversationRequestDto$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        CreateConversationRequestDto$$serializer createConversationRequestDto$$serializer = new CreateConversationRequestDto$$serializer();
        INSTANCE = createConversationRequestDto$$serializer;
        e1 e1Var = new e1("zendesk.conversationkit.android.internal.rest.model.CreateConversationRequestDto", createConversationRequestDto$$serializer, 7);
        e1Var.j("type", false);
        e1Var.j("intent", false);
        e1Var.j("client", false);
        e1Var.j("signedCampaignData", true);
        e1Var.j("messages", true);
        e1Var.j("postback", true);
        e1Var.j("metadata", true);
        descriptor = e1Var;
    }

    private CreateConversationRequestDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = CreateConversationRequestDto.$childSerializers;
        return new KSerializer[]{jVarArr[0].getValue(), jVarArr[1].getValue(), ClientDto$$serializer.INSTANCE, f0.B(r1.f29848a), f0.B((KSerializer) jVarArr[4].getValue()), f0.B(PostbackDto$$serializer.INSTANCE), f0.B((KSerializer) jVarArr[6].getValue())};
    }

    @Override // i90.b
    @NotNull
    public final CreateConversationRequestDto deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = CreateConversationRequestDto.$childSerializers;
        int i11 = 0;
        ConversationType conversationType = null;
        Intent intent = null;
        ClientDto clientDto = null;
        String str = null;
        List list = null;
        PostbackDto postbackDto = null;
        Map map = null;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    conversationType = (ConversationType) aVarC.n(serialDescriptor, 0, (b) jVarArr[0].getValue(), conversationType);
                    i11 |= 1;
                    break;
                case 1:
                    intent = (Intent) aVarC.n(serialDescriptor, 1, (b) jVarArr[1].getValue(), intent);
                    i11 |= 2;
                    break;
                case 2:
                    clientDto = (ClientDto) aVarC.n(serialDescriptor, 2, ClientDto$$serializer.INSTANCE, clientDto);
                    i11 |= 4;
                    break;
                case 3:
                    str = (String) aVarC.m(serialDescriptor, 3, r1.f29848a, str);
                    i11 |= 8;
                    break;
                case 4:
                    list = (List) aVarC.m(serialDescriptor, 4, (b) jVarArr[4].getValue(), list);
                    i11 |= 16;
                    break;
                case 5:
                    postbackDto = (PostbackDto) aVarC.m(serialDescriptor, 5, PostbackDto$$serializer.INSTANCE, postbackDto);
                    i11 |= 32;
                    break;
                case 6:
                    map = (Map) aVarC.m(serialDescriptor, 6, (b) jVarArr[6].getValue(), map);
                    i11 |= 64;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new CreateConversationRequestDto(i11, conversationType, intent, clientDto, str, list, postbackDto, map, (m1) null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull CreateConversationRequestDto value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        CreateConversationRequestDto.write$Self$zendesk_conversationkit_conversationkit_android(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
