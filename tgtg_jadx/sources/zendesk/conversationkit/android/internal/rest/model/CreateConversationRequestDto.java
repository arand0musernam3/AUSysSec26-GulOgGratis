package zendesk.conversationkit.android.internal.rest.model;

import bb0.a;
import i90.h;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.f0;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import zendesk.conversationkit.android.model.ConversationType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u0000 F2\u00020\u0001:\u0002GFBa\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bs\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b+\u0010,J\u001e\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b-\u0010.Jp\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b1\u0010(J\u0010\u00102\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010(R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bA\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bC\u0010,R%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010D\u001a\u0004\bE\u0010.¨\u0006H"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/CreateConversationRequestDto;", "", "Lzendesk/conversationkit/android/model/ConversationType;", "type", "Lzendesk/conversationkit/android/internal/rest/model/Intent;", "intent", "Lzendesk/conversationkit/android/internal/rest/model/ClientDto;", "client", "", "signedCampaignData", "", "Lzendesk/conversationkit/android/internal/rest/model/MessageDto;", "messages", "Lzendesk/conversationkit/android/internal/rest/model/PostbackDto;", "postback", "", "metadata", "<init>", "(Lzendesk/conversationkit/android/model/ConversationType;Lzendesk/conversationkit/android/internal/rest/model/Intent;Lzendesk/conversationkit/android/internal/rest/model/ClientDto;Ljava/lang/String;Ljava/util/List;Lzendesk/conversationkit/android/internal/rest/model/PostbackDto;Ljava/util/Map;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/conversationkit/android/model/ConversationType;Lzendesk/conversationkit/android/internal/rest/model/Intent;Lzendesk/conversationkit/android/internal/rest/model/ClientDto;Ljava/lang/String;Ljava/util/List;Lzendesk/conversationkit/android/internal/rest/model/PostbackDto;Ljava/util/Map;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/rest/model/CreateConversationRequestDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lzendesk/conversationkit/android/model/ConversationType;", "component2", "()Lzendesk/conversationkit/android/internal/rest/model/Intent;", "component3", "()Lzendesk/conversationkit/android/internal/rest/model/ClientDto;", "component4", "()Ljava/lang/String;", "component5", "()Ljava/util/List;", "component6", "()Lzendesk/conversationkit/android/internal/rest/model/PostbackDto;", "component7", "()Ljava/util/Map;", "copy", "(Lzendesk/conversationkit/android/model/ConversationType;Lzendesk/conversationkit/android/internal/rest/model/Intent;Lzendesk/conversationkit/android/internal/rest/model/ClientDto;Ljava/lang/String;Ljava/util/List;Lzendesk/conversationkit/android/internal/rest/model/PostbackDto;Ljava/util/Map;)Lzendesk/conversationkit/android/internal/rest/model/CreateConversationRequestDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lzendesk/conversationkit/android/model/ConversationType;", "getType", "Lzendesk/conversationkit/android/internal/rest/model/Intent;", "getIntent", "Lzendesk/conversationkit/android/internal/rest/model/ClientDto;", "getClient", "Ljava/lang/String;", "getSignedCampaignData", "Ljava/util/List;", "getMessages", "Lzendesk/conversationkit/android/internal/rest/model/PostbackDto;", "getPostback", "Ljava/util/Map;", "getMetadata", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CreateConversationRequestDto {

    @NotNull
    private static final j[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ClientDto client;

    @NotNull
    private final Intent intent;

    @Nullable
    private final List<MessageDto> messages;

    @Nullable
    private final Map<String, Object> metadata;

    @Nullable
    private final PostbackDto postback;

    @Nullable
    private final String signedCampaignData;

    @NotNull
    private final ConversationType type;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{l.a(mVar, new a(1)), l.a(mVar, new a(2)), null, null, l.a(mVar, new a(3)), null, l.a(mVar, new a(4))};
    }

    public /* synthetic */ CreateConversationRequestDto(int i11, ConversationType conversationType, Intent intent, ClientDto clientDto, String str, List list, PostbackDto postbackDto, Map map, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, CreateConversationRequestDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = conversationType;
        this.intent = intent;
        this.client = clientDto;
        if ((i11 & 8) == 0) {
            this.signedCampaignData = null;
        } else {
            this.signedCampaignData = str;
        }
        if ((i11 & 16) == 0) {
            this.messages = null;
        } else {
            this.messages = list;
        }
        if ((i11 & 32) == 0) {
            this.postback = null;
        } else {
            this.postback = postbackDto;
        }
        if ((i11 & 64) == 0) {
            this.metadata = null;
        } else {
            this.metadata = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ConversationType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return Intent.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new d(MessageDto$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new f0(r1.f29848a, new i90.a(Reflection.getOrCreateKotlinClass(Object.class), new KSerializer[0]), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateConversationRequestDto copy$default(CreateConversationRequestDto createConversationRequestDto, ConversationType conversationType, Intent intent, ClientDto clientDto, String str, List list, PostbackDto postbackDto, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            conversationType = createConversationRequestDto.type;
        }
        if ((i11 & 2) != 0) {
            intent = createConversationRequestDto.intent;
        }
        if ((i11 & 4) != 0) {
            clientDto = createConversationRequestDto.client;
        }
        if ((i11 & 8) != 0) {
            str = createConversationRequestDto.signedCampaignData;
        }
        if ((i11 & 16) != 0) {
            list = createConversationRequestDto.messages;
        }
        if ((i11 & 32) != 0) {
            postbackDto = createConversationRequestDto.postback;
        }
        if ((i11 & 64) != 0) {
            map = createConversationRequestDto.metadata;
        }
        PostbackDto postbackDto2 = postbackDto;
        Map map2 = map;
        List list2 = list;
        ClientDto clientDto2 = clientDto;
        return createConversationRequestDto.copy(conversationType, intent, clientDto2, str, list2, postbackDto2, map2);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(CreateConversationRequestDto self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.i(serialDesc, 0, (KSerializer) jVarArr[0].getValue(), self.type);
        output.i(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.intent);
        output.i(serialDesc, 2, ClientDto$$serializer.INSTANCE, self.client);
        if (output.C(serialDesc) || self.signedCampaignData != null) {
            output.r(serialDesc, 3, r1.f29848a, self.signedCampaignData);
        }
        if (output.C(serialDesc) || self.messages != null) {
            output.r(serialDesc, 4, (KSerializer) jVarArr[4].getValue(), self.messages);
        }
        if (output.C(serialDesc) || self.postback != null) {
            output.r(serialDesc, 5, PostbackDto$$serializer.INSTANCE, self.postback);
        }
        if (!output.C(serialDesc) && self.metadata == null) {
            return;
        }
        output.r(serialDesc, 6, (KSerializer) jVarArr[6].getValue(), self.metadata);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ConversationType getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Intent getIntent() {
        return this.intent;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ClientDto getClient() {
        return this.client;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSignedCampaignData() {
        return this.signedCampaignData;
    }

    @Nullable
    public final List<MessageDto> component5() {
        return this.messages;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PostbackDto getPostback() {
        return this.postback;
    }

    @Nullable
    public final Map<String, Object> component7() {
        return this.metadata;
    }

    @NotNull
    public final CreateConversationRequestDto copy(@NotNull ConversationType type, @NotNull Intent intent, @NotNull ClientDto client, @Nullable String signedCampaignData, @Nullable List<MessageDto> messages, @Nullable PostbackDto postback, @Nullable Map<String, ? extends Object> metadata) {
        type.getClass();
        intent.getClass();
        client.getClass();
        return new CreateConversationRequestDto(type, intent, client, signedCampaignData, messages, postback, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateConversationRequestDto)) {
            return false;
        }
        CreateConversationRequestDto createConversationRequestDto = (CreateConversationRequestDto) other;
        return this.type == createConversationRequestDto.type && this.intent == createConversationRequestDto.intent && Intrinsics.areEqual(this.client, createConversationRequestDto.client) && Intrinsics.areEqual(this.signedCampaignData, createConversationRequestDto.signedCampaignData) && Intrinsics.areEqual(this.messages, createConversationRequestDto.messages) && Intrinsics.areEqual(this.postback, createConversationRequestDto.postback) && Intrinsics.areEqual(this.metadata, createConversationRequestDto.metadata);
    }

    @NotNull
    public final ClientDto getClient() {
        return this.client;
    }

    @NotNull
    public final Intent getIntent() {
        return this.intent;
    }

    @Nullable
    public final List<MessageDto> getMessages() {
        return this.messages;
    }

    @Nullable
    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    @Nullable
    public final PostbackDto getPostback() {
        return this.postback;
    }

    @Nullable
    public final String getSignedCampaignData() {
        return this.signedCampaignData;
    }

    @NotNull
    public final ConversationType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.client.hashCode() + ((this.intent.hashCode() + (this.type.hashCode() * 31)) * 31)) * 31;
        String str = this.signedCampaignData;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<MessageDto> list = this.messages;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        PostbackDto postbackDto = this.postback;
        int iHashCode4 = (iHashCode3 + (postbackDto == null ? 0 : postbackDto.hashCode())) * 31;
        Map<String, Object> map = this.metadata;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CreateConversationRequestDto(type=" + this.type + ", intent=" + this.intent + ", client=" + this.client + ", signedCampaignData=" + this.signedCampaignData + ", messages=" + this.messages + ", postback=" + this.postback + ", metadata=" + this.metadata + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/CreateConversationRequestDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/rest/model/CreateConversationRequestDto;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return CreateConversationRequestDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CreateConversationRequestDto(@NotNull ConversationType conversationType, @NotNull Intent intent, @NotNull ClientDto clientDto, @Nullable String str, @Nullable List<MessageDto> list, @Nullable PostbackDto postbackDto, @Nullable Map<String, ? extends Object> map) {
        conversationType.getClass();
        intent.getClass();
        clientDto.getClass();
        this.type = conversationType;
        this.intent = intent;
        this.client = clientDto;
        this.signedCampaignData = str;
        this.messages = list;
        this.postback = postbackDto;
        this.metadata = map;
    }

    public /* synthetic */ CreateConversationRequestDto(ConversationType conversationType, Intent intent, ClientDto clientDto, String str, List list, PostbackDto postbackDto, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(conversationType, intent, clientDto, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : list, (i11 & 32) != 0 ? null : postbackDto, (i11 & 64) != 0 ? null : map);
    }
}
