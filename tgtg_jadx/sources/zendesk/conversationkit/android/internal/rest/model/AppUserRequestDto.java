package zendesk.conversationkit.android.internal.rest.model;

import au.a;
import i90.h;
import j4.s;
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
import zendesk.messaging.android.internal.messagingscreen.MessagingScreenViewModel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0081\b\u0018\u0000 R2\u00020\u0001:\u0002SRB\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u009b\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u001e\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b,\u0010-J¢\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b0\u0010\u001fJ\u0010\u00101\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106J'\u0010?\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010@\u001a\u0004\bA\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010B\u001a\u0004\bC\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010B\u001a\u0004\bD\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\bE\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bF\u0010\u001fR%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bH\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010I\u001a\u0004\bJ\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bK\u0010\u001fR\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010L\u001a\u0004\bM\u0010)R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010N\u001a\u0004\bO\u0010+R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010P\u001a\u0004\bQ\u0010-¨\u0006T"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/AppUserRequestDto;", "", "Lzendesk/conversationkit/android/internal/rest/model/ClientDto;", "client", "", "userId", "givenName", "surname", "email", "", "properties", "Lzendesk/conversationkit/android/internal/rest/model/Intent;", "intent", "signedCampaignData", "", "Lzendesk/conversationkit/android/internal/rest/model/MessageDto;", "messages", "Lzendesk/conversationkit/android/internal/rest/model/PostbackDto;", "postback", "Lzendesk/conversationkit/android/internal/rest/model/CreateConversationRequestDto;", MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, "<init>", "(Lzendesk/conversationkit/android/internal/rest/model/ClientDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lzendesk/conversationkit/android/internal/rest/model/Intent;Ljava/lang/String;Ljava/util/List;Lzendesk/conversationkit/android/internal/rest/model/PostbackDto;Lzendesk/conversationkit/android/internal/rest/model/CreateConversationRequestDto;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/conversationkit/android/internal/rest/model/ClientDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lzendesk/conversationkit/android/internal/rest/model/Intent;Ljava/lang/String;Ljava/util/List;Lzendesk/conversationkit/android/internal/rest/model/PostbackDto;Lzendesk/conversationkit/android/internal/rest/model/CreateConversationRequestDto;Lm90/m1;)V", "component1", "()Lzendesk/conversationkit/android/internal/rest/model/ClientDto;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Ljava/util/Map;", "component7", "()Lzendesk/conversationkit/android/internal/rest/model/Intent;", "component8", "component9", "()Ljava/util/List;", "component10", "()Lzendesk/conversationkit/android/internal/rest/model/PostbackDto;", "component11", "()Lzendesk/conversationkit/android/internal/rest/model/CreateConversationRequestDto;", "copy", "(Lzendesk/conversationkit/android/internal/rest/model/ClientDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lzendesk/conversationkit/android/internal/rest/model/Intent;Ljava/lang/String;Ljava/util/List;Lzendesk/conversationkit/android/internal/rest/model/PostbackDto;Lzendesk/conversationkit/android/internal/rest/model/CreateConversationRequestDto;)Lzendesk/conversationkit/android/internal/rest/model/AppUserRequestDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/rest/model/AppUserRequestDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lzendesk/conversationkit/android/internal/rest/model/ClientDto;", "getClient", "Ljava/lang/String;", "getUserId", "getGivenName", "getSurname", "getEmail", "Ljava/util/Map;", "getProperties", "Lzendesk/conversationkit/android/internal/rest/model/Intent;", "getIntent", "getSignedCampaignData", "Ljava/util/List;", "getMessages", "Lzendesk/conversationkit/android/internal/rest/model/PostbackDto;", "getPostback", "Lzendesk/conversationkit/android/internal/rest/model/CreateConversationRequestDto;", "getConversation", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AppUserRequestDto {

    @NotNull
    private static final j[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ClientDto client;

    @Nullable
    private final CreateConversationRequestDto conversation;

    @Nullable
    private final String email;

    @Nullable
    private final String givenName;

    @NotNull
    private final Intent intent;

    @Nullable
    private final List<MessageDto> messages;

    @Nullable
    private final PostbackDto postback;

    @Nullable
    private final Map<String, Object> properties;

    @Nullable
    private final String signedCampaignData;

    @Nullable
    private final String surname;

    @Nullable
    private final String userId;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, null, null, null, null, l.a(mVar, new a(18)), l.a(mVar, new a(19)), null, l.a(mVar, new a(20)), null, null};
    }

    public /* synthetic */ AppUserRequestDto(int i11, ClientDto clientDto, String str, String str2, String str3, String str4, Map map, Intent intent, String str5, List list, PostbackDto postbackDto, CreateConversationRequestDto createConversationRequestDto, m1 m1Var) {
        if (1 != (i11 & 1)) {
            c1.j(i11, 1, AppUserRequestDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.client = clientDto;
        if ((i11 & 2) == 0) {
            this.userId = null;
        } else {
            this.userId = str;
        }
        if ((i11 & 4) == 0) {
            this.givenName = null;
        } else {
            this.givenName = str2;
        }
        if ((i11 & 8) == 0) {
            this.surname = null;
        } else {
            this.surname = str3;
        }
        if ((i11 & 16) == 0) {
            this.email = null;
        } else {
            this.email = str4;
        }
        if ((i11 & 32) == 0) {
            this.properties = null;
        } else {
            this.properties = map;
        }
        if ((i11 & 64) == 0) {
            this.intent = Intent.CONVERSATION_START;
        } else {
            this.intent = intent;
        }
        if ((i11 & 128) == 0) {
            this.signedCampaignData = null;
        } else {
            this.signedCampaignData = str5;
        }
        if ((i11 & 256) == 0) {
            this.messages = null;
        } else {
            this.messages = list;
        }
        if ((i11 & 512) == 0) {
            this.postback = null;
        } else {
            this.postback = postbackDto;
        }
        if ((i11 & 1024) == 0) {
            this.conversation = null;
        } else {
            this.conversation = createConversationRequestDto;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new f0(r1.f29848a, new i90.a(Reflection.getOrCreateKotlinClass(Object.class), new KSerializer[0]), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return Intent.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new d(MessageDto$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppUserRequestDto copy$default(AppUserRequestDto appUserRequestDto, ClientDto clientDto, String str, String str2, String str3, String str4, Map map, Intent intent, String str5, List list, PostbackDto postbackDto, CreateConversationRequestDto createConversationRequestDto, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            clientDto = appUserRequestDto.client;
        }
        if ((i11 & 2) != 0) {
            str = appUserRequestDto.userId;
        }
        if ((i11 & 4) != 0) {
            str2 = appUserRequestDto.givenName;
        }
        if ((i11 & 8) != 0) {
            str3 = appUserRequestDto.surname;
        }
        if ((i11 & 16) != 0) {
            str4 = appUserRequestDto.email;
        }
        if ((i11 & 32) != 0) {
            map = appUserRequestDto.properties;
        }
        if ((i11 & 64) != 0) {
            intent = appUserRequestDto.intent;
        }
        if ((i11 & 128) != 0) {
            str5 = appUserRequestDto.signedCampaignData;
        }
        if ((i11 & 256) != 0) {
            list = appUserRequestDto.messages;
        }
        if ((i11 & 512) != 0) {
            postbackDto = appUserRequestDto.postback;
        }
        if ((i11 & 1024) != 0) {
            createConversationRequestDto = appUserRequestDto.conversation;
        }
        PostbackDto postbackDto2 = postbackDto;
        CreateConversationRequestDto createConversationRequestDto2 = createConversationRequestDto;
        String str6 = str5;
        List list2 = list;
        Map map2 = map;
        Intent intent2 = intent;
        String str7 = str4;
        String str8 = str2;
        return appUserRequestDto.copy(clientDto, str, str8, str3, str7, map2, intent2, str6, list2, postbackDto2, createConversationRequestDto2);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(AppUserRequestDto self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.i(serialDesc, 0, ClientDto$$serializer.INSTANCE, self.client);
        if (output.C(serialDesc) || self.userId != null) {
            output.r(serialDesc, 1, r1.f29848a, self.userId);
        }
        if (output.C(serialDesc) || self.givenName != null) {
            output.r(serialDesc, 2, r1.f29848a, self.givenName);
        }
        if (output.C(serialDesc) || self.surname != null) {
            output.r(serialDesc, 3, r1.f29848a, self.surname);
        }
        if (output.C(serialDesc) || self.email != null) {
            output.r(serialDesc, 4, r1.f29848a, self.email);
        }
        if (output.C(serialDesc) || self.properties != null) {
            output.r(serialDesc, 5, (KSerializer) jVarArr[5].getValue(), self.properties);
        }
        if (output.C(serialDesc) || self.intent != Intent.CONVERSATION_START) {
            output.i(serialDesc, 6, (KSerializer) jVarArr[6].getValue(), self.intent);
        }
        if (output.C(serialDesc) || self.signedCampaignData != null) {
            output.r(serialDesc, 7, r1.f29848a, self.signedCampaignData);
        }
        if (output.C(serialDesc) || self.messages != null) {
            output.r(serialDesc, 8, (KSerializer) jVarArr[8].getValue(), self.messages);
        }
        if (output.C(serialDesc) || self.postback != null) {
            output.r(serialDesc, 9, PostbackDto$$serializer.INSTANCE, self.postback);
        }
        if (!output.C(serialDesc) && self.conversation == null) {
            return;
        }
        output.r(serialDesc, 10, CreateConversationRequestDto$$serializer.INSTANCE, self.conversation);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ClientDto getClient() {
        return this.client;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final PostbackDto getPostback() {
        return this.postback;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final CreateConversationRequestDto getConversation() {
        return this.conversation;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGivenName() {
        return this.givenName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final Map<String, Object> component6() {
        return this.properties;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Intent getIntent() {
        return this.intent;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSignedCampaignData() {
        return this.signedCampaignData;
    }

    @Nullable
    public final List<MessageDto> component9() {
        return this.messages;
    }

    @NotNull
    public final AppUserRequestDto copy(@NotNull ClientDto client, @Nullable String userId, @Nullable String givenName, @Nullable String surname, @Nullable String email, @Nullable Map<String, ? extends Object> properties, @NotNull Intent intent, @Nullable String signedCampaignData, @Nullable List<MessageDto> messages, @Nullable PostbackDto postback, @Nullable CreateConversationRequestDto conversation) {
        client.getClass();
        intent.getClass();
        return new AppUserRequestDto(client, userId, givenName, surname, email, properties, intent, signedCampaignData, messages, postback, conversation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppUserRequestDto)) {
            return false;
        }
        AppUserRequestDto appUserRequestDto = (AppUserRequestDto) other;
        return Intrinsics.areEqual(this.client, appUserRequestDto.client) && Intrinsics.areEqual(this.userId, appUserRequestDto.userId) && Intrinsics.areEqual(this.givenName, appUserRequestDto.givenName) && Intrinsics.areEqual(this.surname, appUserRequestDto.surname) && Intrinsics.areEqual(this.email, appUserRequestDto.email) && Intrinsics.areEqual(this.properties, appUserRequestDto.properties) && this.intent == appUserRequestDto.intent && Intrinsics.areEqual(this.signedCampaignData, appUserRequestDto.signedCampaignData) && Intrinsics.areEqual(this.messages, appUserRequestDto.messages) && Intrinsics.areEqual(this.postback, appUserRequestDto.postback) && Intrinsics.areEqual(this.conversation, appUserRequestDto.conversation);
    }

    @NotNull
    public final ClientDto getClient() {
        return this.client;
    }

    @Nullable
    public final CreateConversationRequestDto getConversation() {
        return this.conversation;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final String getGivenName() {
        return this.givenName;
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
    public final PostbackDto getPostback() {
        return this.postback;
    }

    @Nullable
    public final Map<String, Object> getProperties() {
        return this.properties;
    }

    @Nullable
    public final String getSignedCampaignData() {
        return this.signedCampaignData;
    }

    @Nullable
    public final String getSurname() {
        return this.surname;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = this.client.hashCode() * 31;
        String str = this.userId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.givenName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.surname;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.email;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, Object> map = this.properties;
        int iHashCode6 = (this.intent.hashCode() + ((iHashCode5 + (map == null ? 0 : map.hashCode())) * 31)) * 31;
        String str5 = this.signedCampaignData;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<MessageDto> list = this.messages;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        PostbackDto postbackDto = this.postback;
        int iHashCode9 = (iHashCode8 + (postbackDto == null ? 0 : postbackDto.hashCode())) * 31;
        CreateConversationRequestDto createConversationRequestDto = this.conversation;
        return iHashCode9 + (createConversationRequestDto != null ? createConversationRequestDto.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ClientDto clientDto = this.client;
        String str = this.userId;
        String str2 = this.givenName;
        String str3 = this.surname;
        String str4 = this.email;
        Map<String, Object> map = this.properties;
        Intent intent = this.intent;
        String str5 = this.signedCampaignData;
        List<MessageDto> list = this.messages;
        PostbackDto postbackDto = this.postback;
        CreateConversationRequestDto createConversationRequestDto = this.conversation;
        StringBuilder sb2 = new StringBuilder("AppUserRequestDto(client=");
        sb2.append(clientDto);
        sb2.append(", userId=");
        sb2.append(str);
        sb2.append(", givenName=");
        s.A(sb2, str2, ", surname=", str3, ", email=");
        sb2.append(str4);
        sb2.append(", properties=");
        sb2.append(map);
        sb2.append(", intent=");
        sb2.append(intent);
        sb2.append(", signedCampaignData=");
        sb2.append(str5);
        sb2.append(", messages=");
        sb2.append(list);
        sb2.append(", postback=");
        sb2.append(postbackDto);
        sb2.append(", conversation=");
        sb2.append(createConversationRequestDto);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/AppUserRequestDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/rest/model/AppUserRequestDto;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return AppUserRequestDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AppUserRequestDto(@NotNull ClientDto clientDto, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Map<String, ? extends Object> map, @NotNull Intent intent, @Nullable String str5, @Nullable List<MessageDto> list, @Nullable PostbackDto postbackDto, @Nullable CreateConversationRequestDto createConversationRequestDto) {
        clientDto.getClass();
        intent.getClass();
        this.client = clientDto;
        this.userId = str;
        this.givenName = str2;
        this.surname = str3;
        this.email = str4;
        this.properties = map;
        this.intent = intent;
        this.signedCampaignData = str5;
        this.messages = list;
        this.postback = postbackDto;
        this.conversation = createConversationRequestDto;
    }

    public /* synthetic */ AppUserRequestDto(ClientDto clientDto, String str, String str2, String str3, String str4, Map map, Intent intent, String str5, List list, PostbackDto postbackDto, CreateConversationRequestDto createConversationRequestDto, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(clientDto, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : map, (i11 & 64) != 0 ? Intent.CONVERSATION_START : intent, (i11 & 128) != 0 ? null : str5, (i11 & 256) != 0 ? null : list, (i11 & 512) != 0 ? null : postbackDto, (i11 & 1024) != 0 ? null : createConversationRequestDto);
    }
}
