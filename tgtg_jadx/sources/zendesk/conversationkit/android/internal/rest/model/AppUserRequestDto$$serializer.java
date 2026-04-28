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
import zendesk.messaging.android.internal.messagingscreen.MessagingScreenViewModel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"zendesk/conversationkit/android/internal/rest/model/AppUserRequestDto.$serializer", "Lm90/d0;", "Lzendesk/conversationkit/android/internal/rest/model/AppUserRequestDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lzendesk/conversationkit/android/internal/rest/model/AppUserRequestDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lzendesk/conversationkit/android/internal/rest/model/AppUserRequestDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class AppUserRequestDto$$serializer implements d0 {

    @NotNull
    public static final AppUserRequestDto$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        AppUserRequestDto$$serializer appUserRequestDto$$serializer = new AppUserRequestDto$$serializer();
        INSTANCE = appUserRequestDto$$serializer;
        e1 e1Var = new e1("zendesk.conversationkit.android.internal.rest.model.AppUserRequestDto", appUserRequestDto$$serializer, 11);
        e1Var.j("client", false);
        e1Var.j("userId", true);
        e1Var.j("givenName", true);
        e1Var.j("surname", true);
        e1Var.j("email", true);
        e1Var.j("properties", true);
        e1Var.j("intent", true);
        e1Var.j("signedCampaignData", true);
        e1Var.j("messages", true);
        e1Var.j("postback", true);
        e1Var.j(MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, true);
        descriptor = e1Var;
    }

    private AppUserRequestDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = AppUserRequestDto.$childSerializers;
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{ClientDto$$serializer.INSTANCE, f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B((KSerializer) jVarArr[5].getValue()), jVarArr[6].getValue(), f0.B(r1Var), f0.B((KSerializer) jVarArr[8].getValue()), f0.B(PostbackDto$$serializer.INSTANCE), f0.B(CreateConversationRequestDto$$serializer.INSTANCE)};
    }

    @Override // i90.b
    @NotNull
    public final AppUserRequestDto deserialize(@NotNull Decoder decoder) {
        j[] jVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr2 = AppUserRequestDto.$childSerializers;
        List list = null;
        PostbackDto postbackDto = null;
        CreateConversationRequestDto createConversationRequestDto = null;
        ClientDto clientDto = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Map map = null;
        Intent intent = null;
        String str5 = null;
        int i11 = 0;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    continue;
                case 0:
                    jVarArr = jVarArr2;
                    clientDto = (ClientDto) aVarC.n(serialDescriptor, 0, ClientDto$$serializer.INSTANCE, clientDto);
                    i11 |= 1;
                    break;
                case 1:
                    jVarArr = jVarArr2;
                    str = (String) aVarC.m(serialDescriptor, 1, r1.f29848a, str);
                    i11 |= 2;
                    break;
                case 2:
                    jVarArr = jVarArr2;
                    str2 = (String) aVarC.m(serialDescriptor, 2, r1.f29848a, str2);
                    i11 |= 4;
                    break;
                case 3:
                    jVarArr = jVarArr2;
                    str3 = (String) aVarC.m(serialDescriptor, 3, r1.f29848a, str3);
                    i11 |= 8;
                    break;
                case 4:
                    jVarArr = jVarArr2;
                    str4 = (String) aVarC.m(serialDescriptor, 4, r1.f29848a, str4);
                    i11 |= 16;
                    break;
                case 5:
                    jVarArr = jVarArr2;
                    map = (Map) aVarC.m(serialDescriptor, 5, (b) jVarArr[5].getValue(), map);
                    i11 |= 32;
                    break;
                case 6:
                    jVarArr = jVarArr2;
                    intent = (Intent) aVarC.n(serialDescriptor, 6, (b) jVarArr[6].getValue(), intent);
                    i11 |= 64;
                    break;
                case 7:
                    jVarArr = jVarArr2;
                    str5 = (String) aVarC.m(serialDescriptor, 7, r1.f29848a, str5);
                    i11 |= 128;
                    break;
                case 8:
                    jVarArr = jVarArr2;
                    list = (List) aVarC.m(serialDescriptor, 8, (b) jVarArr[8].getValue(), list);
                    i11 |= 256;
                    break;
                case 9:
                    jVarArr = jVarArr2;
                    postbackDto = (PostbackDto) aVarC.m(serialDescriptor, 9, PostbackDto$$serializer.INSTANCE, postbackDto);
                    i11 |= 512;
                    break;
                case 10:
                    jVarArr = jVarArr2;
                    createConversationRequestDto = (CreateConversationRequestDto) aVarC.m(serialDescriptor, 10, CreateConversationRequestDto$$serializer.INSTANCE, createConversationRequestDto);
                    i11 |= 1024;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
            jVarArr2 = jVarArr;
        }
        aVarC.b(serialDescriptor);
        return new AppUserRequestDto(i11, clientDto, str, str2, str3, str4, map, intent, str5, list, postbackDto, createConversationRequestDto, (m1) null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull AppUserRequestDto value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        AppUserRequestDto.write$Self$zendesk_conversationkit_conversationkit_android(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
