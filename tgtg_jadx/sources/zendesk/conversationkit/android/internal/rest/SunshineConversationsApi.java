package zendesk.conversationkit.android.internal.rest;

import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q90.a0;
import ra0.a;
import ra0.f;
import ra0.i;
import ra0.k;
import ra0.l;
import ra0.o;
import ra0.p;
import ra0.q;
import ra0.s;
import ra0.t;
import x70.c;
import zendesk.conversationkit.android.internal.rest.model.ActivityDataRequestDto;
import zendesk.conversationkit.android.internal.rest.model.AppUserRequestDto;
import zendesk.conversationkit.android.internal.rest.model.AppUserResponseDto;
import zendesk.conversationkit.android.internal.rest.model.AuthorDto;
import zendesk.conversationkit.android.internal.rest.model.ConversationResponseDto;
import zendesk.conversationkit.android.internal.rest.model.ConversationsResponseDto;
import zendesk.conversationkit.android.internal.rest.model.CreateConversationRequestDto;
import zendesk.conversationkit.android.internal.rest.model.MessageListResponseDto;
import zendesk.conversationkit.android.internal.rest.model.MetadataDto;
import zendesk.conversationkit.android.internal.rest.model.ProactiveMessageReferralDto;
import zendesk.conversationkit.android.internal.rest.model.SendMessageRequestDto;
import zendesk.conversationkit.android.internal.rest.model.SendMessageResponseDto;
import zendesk.conversationkit.android.internal.rest.model.SendPostbackRequestDto;
import zendesk.conversationkit.android.internal.rest.model.UpdateAppUserLocaleDto;
import zendesk.conversationkit.android.internal.rest.model.UpdateConversationRequestDto;
import zendesk.conversationkit.android.internal.rest.model.UpdatePushTokenDto;
import zendesk.conversationkit.android.internal.rest.model.UploadFileResponseDto;
import zendesk.conversationkit.android.internal.rest.user.SunshineAppUserService;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 F2\u00020\u0001:\u0001FJ.\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ.\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\rJ.\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\rJ8\u0010\u0013\u001a\u00020\u000f2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014J8\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0018\u0010\u0019J8\u0010\u001c\u001a\u00020\u000f2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u001b\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010!\u001a\u00020 2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u001f\u001a\u00020\u001eH§@¢\u0006\u0004\b!\u0010\"J8\u0010%\u001a\u00020\u000f2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010$\u001a\u00020#H§@¢\u0006\u0004\b%\u0010&J8\u0010*\u001a\u00020)2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010(\u001a\u00020'H§@¢\u0006\u0004\b*\u0010+JL\u00103\u001a\u0002022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010-\u001a\u00020,2\b\b\u0001\u0010/\u001a\u00020.2\b\b\u0001\u00101\u001a\u000200H§@¢\u0006\u0004\b3\u00104J8\u00108\u001a\u0002072\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u00106\u001a\u000205H§@¢\u0006\u0004\b8\u00109J8\u0010<\u001a\u0002072\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010;\u001a\u00020:H§@¢\u0006\u0004\b<\u0010=JB\u0010@\u001a\u0002072\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010?\u001a\u00020>H§@¢\u0006\u0004\b@\u0010AJ8\u0010D\u001a\u0002072\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010C\u001a\u00020BH§@¢\u0006\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/SunshineConversationsApi;", "Lzendesk/conversationkit/android/internal/rest/user/SunshineAppUserService;", "", "appId", Bayeux.KEY_CLIENT_ID, "Lzendesk/conversationkit/android/internal/rest/model/AppUserRequestDto;", "appUserRequestDto", "Lzendesk/conversationkit/android/internal/rest/model/AppUserResponseDto;", "createAppUser", "(Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/AppUserRequestDto;Lx70/c;)Ljava/lang/Object;", "authorization", "appUserId", "getAppUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "conversationId", "Lzendesk/conversationkit/android/internal/rest/model/ConversationResponseDto;", "getConversation", "Lzendesk/conversationkit/android/internal/rest/model/ProactiveMessageReferralDto;", "proactiveMessageReferralDto", "proactiveMessageReferral", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/ProactiveMessageReferralDto;Lx70/c;)Ljava/lang/Object;", "", "beforeTimestamp", "Lzendesk/conversationkit/android/internal/rest/model/MessageListResponseDto;", "getMessages", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/rest/model/CreateConversationRequestDto;", "createConversationRequestDto", "createConversation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/CreateConversationRequestDto;Lx70/c;)Ljava/lang/Object;", "", "offset", "Lzendesk/conversationkit/android/internal/rest/model/ConversationsResponseDto;", "getConversations", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/rest/model/UpdateConversationRequestDto;", "updateConversationRequestDto", "updateConversation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/UpdateConversationRequestDto;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/rest/model/SendMessageRequestDto;", "sendMessageRequestDto", "Lzendesk/conversationkit/android/internal/rest/model/SendMessageResponseDto;", "sendMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/SendMessageRequestDto;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/rest/model/AuthorDto;", "authorDto", "Lzendesk/conversationkit/android/internal/rest/model/MetadataDto;", "metadataDto", "Lq90/a0;", "file", "Lzendesk/conversationkit/android/internal/rest/model/UploadFileResponseDto;", "uploadFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/AuthorDto;Lzendesk/conversationkit/android/internal/rest/model/MetadataDto;Lq90/a0;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/rest/model/ActivityDataRequestDto;", "activityDataDto", "", "sendActivityData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/ActivityDataRequestDto;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/rest/model/SendPostbackRequestDto;", "sendPostbackRequestDto", "sendPostbackAction", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/SendPostbackRequestDto;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/rest/model/UpdatePushTokenDto;", "updatePushTokenDto", "updatePushToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/UpdatePushTokenDto;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/rest/model/UpdateAppUserLocaleDto;", "updateAppUserLocaleDto", "updateAppUserLocale", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/UpdateAppUserLocaleDto;Lx70/c;)Ljava/lang/Object;", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SunshineConversationsApi extends SunshineAppUserService {

    @Deprecated
    @NotNull
    public static final String APP_ID_PATH = "appId";

    @Deprecated
    @NotNull
    public static final String APP_USER_ID_PATH = "appUserId";

    @Deprecated
    @NotNull
    public static final String AUTHORIZATION_HEADER = "Authorization";

    @Deprecated
    @NotNull
    public static final String CONVERSATION_ID_PATH = "conversationId";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final /* synthetic */ Companion INSTANCE = Companion.$$INSTANCE;

    @Deprecated
    @NotNull
    public static final String JSON_CONTENT_TYPE = "Content-Type:application/json";

    @Deprecated
    @NotNull
    public static final String OFFSET = "offset";

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/SunshineConversationsApi$Companion;", "", "<init>", "()V", "JSON_CONTENT_TYPE", "", "AUTHORIZATION_HEADER", "APP_ID_PATH", "APP_USER_ID_PATH", "CONVERSATION_ID_PATH", "OFFSET", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String APP_ID_PATH = "appId";

        @NotNull
        public static final String APP_USER_ID_PATH = "appUserId";

        @NotNull
        public static final String AUTHORIZATION_HEADER = "Authorization";

        @NotNull
        public static final String CONVERSATION_ID_PATH = "conversationId";

        @NotNull
        public static final String JSON_CONTENT_TYPE = "Content-Type:application/json";

        @NotNull
        public static final String OFFSET = "offset";

        private Companion() {
        }
    }

    @k({"Content-Type:application/json"})
    @o("v2/apps/{appId}/appusers")
    @Nullable
    Object createAppUser(@s("appId") @NotNull String str, @NotNull @i("x-smooch-clientid") String str2, @NotNull @a AppUserRequestDto appUserRequestDto, @NotNull c<? super AppUserResponseDto> cVar);

    @k({"Content-Type:application/json"})
    @o("v2/apps/{appId}/appusers/{appUserId}/conversations")
    @Nullable
    Object createConversation(@NotNull @i("Authorization") String str, @s("appId") @NotNull String str2, @s("appUserId") @NotNull String str3, @NotNull @a CreateConversationRequestDto createConversationRequestDto, @NotNull c<? super ConversationResponseDto> cVar);

    @f("v2/apps/{appId}/appusers/{appUserId}")
    @k({"Content-Type:application/json"})
    @Nullable
    Object getAppUser(@NotNull @i("Authorization") String str, @s("appId") @NotNull String str2, @s("appUserId") @NotNull String str3, @NotNull c<? super AppUserResponseDto> cVar);

    @f("v2/apps/{appId}/conversations/{conversationId}")
    @k({"Content-Type:application/json"})
    @Nullable
    Object getConversation(@NotNull @i("Authorization") String str, @s("appId") @NotNull String str2, @s("conversationId") @NotNull String str3, @NotNull c<? super ConversationResponseDto> cVar);

    @f("v2/apps/{appId}/appusers/{appUserId}/conversations")
    @k({"Content-Type:application/json"})
    @Nullable
    Object getConversations(@NotNull @i("Authorization") String str, @s("appId") @NotNull String str2, @s("appUserId") @NotNull String str3, @t("offset") int i11, @NotNull c<? super ConversationsResponseDto> cVar);

    @f("v2/apps/{appId}/conversations/{conversationId}/messages")
    @k({"Content-Type:application/json"})
    @Nullable
    Object getMessages(@NotNull @i("Authorization") String str, @s("appId") @NotNull String str2, @s("conversationId") @NotNull String str3, @t("before") double d3, @NotNull c<? super MessageListResponseDto> cVar);

    @k({"Content-Type:application/json"})
    @o("v2/apps/{appId}/conversations/{conversationId}/referral")
    @Nullable
    Object proactiveMessageReferral(@NotNull @i("Authorization") String str, @s("appId") @NotNull String str2, @s("conversationId") @NotNull String str3, @NotNull @a ProactiveMessageReferralDto proactiveMessageReferralDto, @NotNull c<? super ConversationResponseDto> cVar);

    @k({"Content-Type:application/json"})
    @o("v2/apps/{appId}/conversations/{conversationId}/activity")
    @Nullable
    Object sendActivityData(@NotNull @i("Authorization") String str, @s("appId") @NotNull String str2, @s("conversationId") @NotNull String str3, @NotNull @a ActivityDataRequestDto activityDataRequestDto, @NotNull c<? super Unit> cVar);

    @k({"Content-Type:application/json"})
    @o("v2/apps/{appId}/conversations/{conversationId}/messages")
    @Nullable
    Object sendMessage(@NotNull @i("Authorization") String str, @s("appId") @NotNull String str2, @s("conversationId") @NotNull String str3, @NotNull @a SendMessageRequestDto sendMessageRequestDto, @NotNull c<? super SendMessageResponseDto> cVar);

    @k({"Content-Type:application/json"})
    @o("v2/apps/{appId}/conversations/{conversationId}/postback")
    @Nullable
    Object sendPostbackAction(@NotNull @i("Authorization") String str, @s("appId") @NotNull String str2, @s("conversationId") @NotNull String str3, @NotNull @a SendPostbackRequestDto sendPostbackRequestDto, @NotNull c<? super Unit> cVar);

    @k({"Content-Type:application/json"})
    @p("v2/apps/{appId}/appusers/{appUserId}")
    @Nullable
    Object updateAppUserLocale(@NotNull @i("Authorization") String str, @s("appId") @NotNull String str2, @s("appUserId") @NotNull String str3, @NotNull @a UpdateAppUserLocaleDto updateAppUserLocaleDto, @NotNull c<? super Unit> cVar);

    @k({"Content-Type:application/json"})
    @p("v2/apps/{appId}/conversations/{conversationId}")
    @Nullable
    Object updateConversation(@NotNull @i("Authorization") String str, @s("appId") @NotNull String str2, @s("conversationId") @NotNull String str3, @NotNull @a UpdateConversationRequestDto updateConversationRequestDto, @NotNull c<? super ConversationResponseDto> cVar);

    @k({"Content-Type:application/json"})
    @p("v2/apps/{appId}/appusers/{appUserId}/clients/{clientId}")
    @Nullable
    Object updatePushToken(@NotNull @i("Authorization") String str, @s("appId") @NotNull String str2, @s("appUserId") @NotNull String str3, @s(Bayeux.KEY_CLIENT_ID) @NotNull String str4, @NotNull @a UpdatePushTokenDto updatePushTokenDto, @NotNull c<? super Unit> cVar);

    @o("v2/apps/{appId}/conversations/{conversationId}/files")
    @l
    @Nullable
    Object uploadFile(@NotNull @i("Authorization") String str, @s("appId") @NotNull String str2, @s("conversationId") @NotNull String str3, @NotNull @q("author") AuthorDto authorDto, @NotNull @q(InAppMessageBase.MESSAGE) MetadataDto metadataDto, @NotNull @q a0 a0Var, @NotNull c<? super UploadFileResponseDto> cVar);
}
