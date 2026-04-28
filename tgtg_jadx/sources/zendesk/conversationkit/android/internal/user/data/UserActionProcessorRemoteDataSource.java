package zendesk.conversationkit.android.internal.user.data;

import com.app.tgtg.model.local.AppConstants;
import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y70.a;
import z70.c;
import z70.e;
import zendesk.conversationkit.android.ConversationKitSettings;
import zendesk.conversationkit.android.internal.ClientDtoProvider;
import zendesk.conversationkit.android.internal.faye.SunCoFayeClient;
import zendesk.conversationkit.android.internal.rest.UserRestClient;
import zendesk.conversationkit.android.internal.rest.model.ActivityDataDto;
import zendesk.conversationkit.android.internal.rest.model.ActivityDataRequestDto;
import zendesk.conversationkit.android.internal.rest.model.AuthorDto;
import zendesk.conversationkit.android.internal.rest.model.ClientDto;
import zendesk.conversationkit.android.internal.rest.model.PostbackDto;
import zendesk.conversationkit.android.internal.rest.model.SendPostbackRequestDto;
import zendesk.conversationkit.android.internal.rest.model.UpdateAppUserLocaleDto;
import zendesk.conversationkit.android.internal.rest.model.UpdatePushTokenDto;
import zendesk.conversationkit.android.internal.rest.user.model.LogoutRequestBody;
import zendesk.conversationkit.android.internal.user.Jwt;
import zendesk.conversationkit.android.model.AuthorType;
import zendesk.conversationkit.android.model.Config;
import zendesk.conversationkit.android.model.WaitTimeDataResponse;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 Z2\u00020\u0001:\u0001ZB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J>\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0086@¢\u0006\u0004\b\u001f\u0010 JB\u0010$\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\"\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b$\u0010%JP\u0010*\u001a\u00020)2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00102\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010&2\u0006\u0010(\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b*\u0010+J(\u0010-\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b-\u0010.JB\u00100\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010/\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b0\u0010%J\\\u00108\u001a\u0002062\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\b\u00102\u001a\u0004\u0018\u0001012\u0006\u00103\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0086@¢\u0006\u0004\b8\u00109JT\u0010:\u001a\u0002062\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00102\b\u00102\u001a\u0004\u0018\u0001012\u0006\u00103\u001a\u00020\u00102\u0006\u00107\u001a\u0002062\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0086@¢\u0006\u0004\b:\u0010;JZ\u0010?\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010=\u001a\u00020<2\b\u0010>\u001a\u0004\u0018\u00010\u00102\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010&2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b?\u0010@JD\u0010A\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00102\b\u0010>\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0086@¢\u0006\u0004\bA\u0010%J2\u0010B\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0086@¢\u0006\u0004\bB\u0010CJ \u0010E\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010D\u001a\u00020\u0010H\u0086@¢\u0006\u0004\bE\u0010FJ(\u0010G\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0086@¢\u0006\u0004\bG\u0010.J(\u0010K\u001a\u00020J2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00102\u0006\u0010I\u001a\u00020HH\u0086@¢\u0006\u0004\bK\u0010LJ(\u0010P\u001a\u00020O2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010N\u001a\u00020MH\u0086@¢\u0006\u0004\bP\u0010QJ \u0010S\u001a\u00020R2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0010H\u0086@¢\u0006\u0004\bS\u0010FR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010TR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010UR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010VR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010WR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010XR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010Y¨\u0006["}, d2 = {"Lzendesk/conversationkit/android/internal/user/data/UserActionProcessorRemoteDataSource;", "", "Lzendesk/conversationkit/android/ConversationKitSettings;", "conversationKitSettings", "Lzendesk/conversationkit/android/model/Config;", "config", "Lzendesk/conversationkit/android/internal/faye/SunCoFayeClient;", "sunCoFayeClient", "Lzendesk/conversationkit/android/internal/rest/UserRestClient;", "userRestClient", "Lzendesk/conversationkit/android/internal/ClientDtoProvider;", "clientDtoProvider", "Lzendesk/conversationkit/android/internal/user/Jwt$Decoder;", "jwtDecoder", "<init>", "(Lzendesk/conversationkit/android/ConversationKitSettings;Lzendesk/conversationkit/android/model/Config;Lzendesk/conversationkit/android/internal/faye/SunCoFayeClient;Lzendesk/conversationkit/android/internal/rest/UserRestClient;Lzendesk/conversationkit/android/internal/ClientDtoProvider;Lzendesk/conversationkit/android/internal/user/Jwt$Decoder;)V", "", Bayeux.KEY_CLIENT_ID, "pushToken", "Lzendesk/conversationkit/android/internal/rest/model/ClientDto;", "buildClient", "(Ljava/lang/String;Ljava/lang/String;)Lzendesk/conversationkit/android/internal/rest/model/ClientDto;", "jwt", "appUserId", "sessionToken", "Lzendesk/conversationkit/android/model/User;", "login", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "authorization", "Lzendesk/conversationkit/android/model/AuthenticationType;", "authenticationType", "getAppUser", "(Ljava/lang/String;Lzendesk/conversationkit/android/model/AuthenticationType;Lx70/c;)Ljava/lang/Object;", "conversationId", "actionId", "", "sendPostbackAction", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "", "metadata", "userId", "Lzendesk/conversationkit/android/model/Conversation;", "updateConversation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "pushNotificationToken", "updatePushToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "activityType", "sendActivityData", "Ljava/util/Date;", "created", "localId", "Lzendesk/conversationkit/android/model/MessageContent$FileUpload;", "messageContent", "Lzendesk/conversationkit/android/model/Message;", InAppMessageBase.MESSAGE, "uploadFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/model/MessageContent$FileUpload;Lzendesk/conversationkit/android/model/Message;Lx70/c;)Ljava/lang/Object;", "sendMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lzendesk/conversationkit/android/model/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/model/ConversationType;", "conversationType", "signedCampaignData", "createConversation", "(Ljava/lang/String;Lzendesk/conversationkit/android/model/ConversationType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "proactiveMessageReferral", "logout", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "deviceLocale", "updateAppUserLocale", "(Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "getConversation", "", "beforeTimestamp", "Lzendesk/conversationkit/android/model/MessageList;", "getMessages", "(Ljava/lang/String;Ljava/lang/String;DLx70/c;)Ljava/lang/Object;", "", "offset", "Lzendesk/conversationkit/android/model/ConversationsPagination;", "getConversations", "(Ljava/lang/String;Ljava/lang/String;ILx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/model/WaitTimeDataResponse;", "fetchWaitTimeData", "Lzendesk/conversationkit/android/ConversationKitSettings;", "Lzendesk/conversationkit/android/model/Config;", "Lzendesk/conversationkit/android/internal/faye/SunCoFayeClient;", "Lzendesk/conversationkit/android/internal/rest/UserRestClient;", "Lzendesk/conversationkit/android/internal/ClientDtoProvider;", "Lzendesk/conversationkit/android/internal/user/Jwt$Decoder;", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UserActionProcessorRemoteDataSource {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String LOG_TAG = "UserActionProcessorRemoteDataSource";

    @NotNull
    private final ClientDtoProvider clientDtoProvider;

    @NotNull
    private final Config config;

    @NotNull
    private final ConversationKitSettings conversationKitSettings;

    @NotNull
    private final Jwt.Decoder jwtDecoder;

    @NotNull
    private final SunCoFayeClient sunCoFayeClient;

    @NotNull
    private final UserRestClient userRestClient;

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$createConversation$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource", f = "UserActionProcessorRemoteDataSource.kt", l = {480}, m = "createConversation")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(x70.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRemoteDataSource.this.createConversation(null, null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$getAppUser$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource", f = "UserActionProcessorRemoteDataSource.kt", l = {146}, m = "getAppUser")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03331 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C03331(x70.c<? super C03331> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRemoteDataSource.this.getAppUser(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$getConversation$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource", f = "UserActionProcessorRemoteDataSource.kt", l = {605}, m = "getConversation")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03341 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C03341(x70.c<? super C03341> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRemoteDataSource.this.getConversation(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$getConversations$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource", f = "UserActionProcessorRemoteDataSource.kt", l = {664}, m = "getConversations")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03351 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C03351(x70.c<? super C03351> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRemoteDataSource.this.getConversations(null, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$getMessages$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource", f = "UserActionProcessorRemoteDataSource.kt", l = {635}, m = "getMessages")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03361 extends c {
        int label;
        /* synthetic */ Object result;

        public C03361(x70.c<? super C03361> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRemoteDataSource.this.getMessages(null, null, 0.0d, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$login$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource", f = "UserActionProcessorRemoteDataSource.kt", l = {122}, m = "login")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03371 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C03371(x70.c<? super C03371> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRemoteDataSource.this.login(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$proactiveMessageReferral$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource", f = "UserActionProcessorRemoteDataSource.kt", l = {525}, m = "proactiveMessageReferral")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03381 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C03381(x70.c<? super C03381> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRemoteDataSource.this.proactiveMessageReferral(null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$sendMessage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource", f = "UserActionProcessorRemoteDataSource.kt", l = {430}, m = "sendMessage")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03391 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C03391(x70.c<? super C03391> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRemoteDataSource.this.sendMessage(null, null, null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$updateConversation$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource", f = "UserActionProcessorRemoteDataSource.kt", l = {AppConstants.GO_TO_GPS_SETTINGS}, m = "updateConversation")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03401 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C03401(x70.c<? super C03401> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRemoteDataSource.this.updateConversation(null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$uploadFile$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource", f = "UserActionProcessorRemoteDataSource.kt", l = {361, 362, 383}, m = "uploadFile")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03411 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        public C03411(x70.c<? super C03411> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserActionProcessorRemoteDataSource.this.uploadFile(null, null, null, null, null, null, null, null, null, this);
        }
    }

    public UserActionProcessorRemoteDataSource(@NotNull ConversationKitSettings conversationKitSettings, @NotNull Config config, @NotNull SunCoFayeClient sunCoFayeClient, @NotNull UserRestClient userRestClient, @NotNull ClientDtoProvider clientDtoProvider, @NotNull Jwt.Decoder decoder) {
        conversationKitSettings.getClass();
        config.getClass();
        sunCoFayeClient.getClass();
        userRestClient.getClass();
        clientDtoProvider.getClass();
        decoder.getClass();
        this.conversationKitSettings = conversationKitSettings;
        this.config = config;
        this.sunCoFayeClient = sunCoFayeClient;
        this.userRestClient = userRestClient;
        this.clientDtoProvider = clientDtoProvider;
        this.jwtDecoder = decoder;
    }

    private final ClientDto buildClient(String clientId, String pushToken) {
        return this.clientDtoProvider.buildClient(this.conversationKitSettings.getIntegrationId(), clientId, pushToken);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createConversation(@org.jetbrains.annotations.NotNull java.lang.String r17, @org.jetbrains.annotations.NotNull zendesk.conversationkit.android.model.ConversationType r18, @org.jetbrains.annotations.Nullable java.lang.String r19, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r20, @org.jetbrains.annotations.NotNull java.lang.String r21, @org.jetbrains.annotations.Nullable java.lang.String r22, @org.jetbrains.annotations.NotNull java.lang.String r23, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Conversation> r24) {
        /*
            r16 = this;
            r0 = r16
            r1 = r24
            boolean r2 = r1 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource.AnonymousClass1
            if (r2 == 0) goto L17
            r2 = r1
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$createConversation$1 r2 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource.AnonymousClass1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$createConversation$1 r2 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$createConversation$1
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.result
            y70.a r3 = y70.a.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L36
            if (r4 != r5) goto L2f
            java.lang.Object r2 = r2.L$0
            java.lang.String r2 = (java.lang.String) r2
            ba0.g.M(r1)
            goto L73
        L2f:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r1)
            r1 = 0
            return r1
        L36:
            ba0.g.M(r1)
            zendesk.conversationkit.android.internal.rest.UserRestClient r1 = r0.userRestClient
            zendesk.conversationkit.android.internal.rest.model.CreateConversationRequestDto r6 = new zendesk.conversationkit.android.internal.rest.model.CreateConversationRequestDto
            if (r19 == 0) goto L4e
            int r4 = r19.length()
            if (r4 != 0) goto L46
            goto L4e
        L46:
            zendesk.conversationkit.android.internal.rest.model.Intent r4 = zendesk.conversationkit.android.internal.rest.model.Intent.PROACTIVE
        L48:
            r7 = r22
            r8 = r4
            r4 = r21
            goto L51
        L4e:
            zendesk.conversationkit.android.internal.rest.model.Intent r4 = zendesk.conversationkit.android.internal.rest.model.Intent.CONVERSATION_START
            goto L48
        L51:
            zendesk.conversationkit.android.internal.rest.model.ClientDto r9 = r0.buildClient(r4, r7)
            r14 = 48
            r15 = 0
            r11 = 0
            r12 = 0
            r7 = r18
            r10 = r19
            r13 = r20
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r4 = r23
            r2.L$0 = r4
            r2.label = r5
            r5 = r17
            java.lang.Object r1 = r1.createConversation(r5, r6, r2)
            if (r1 != r3) goto L72
            return r3
        L72:
            r2 = r4
        L73:
            zendesk.conversationkit.android.internal.rest.model.ConversationResponseDto r1 = (zendesk.conversationkit.android.internal.rest.model.ConversationResponseDto) r1
            zendesk.conversationkit.android.model.Conversation r1 = zendesk.conversationkit.android.model.ConversationKt.toConversation(r1, r2)
            zendesk.conversationkit.android.model.Conversation r1 = zendesk.conversationkit.android.model.ConversationKt.enrichFormResponseFields(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource.createConversation(java.lang.String, zendesk.conversationkit.android.model.ConversationType, java.lang.String, java.util.Map, java.lang.String, java.lang.String, java.lang.String, x70.c):java.lang.Object");
    }

    @Nullable
    public final Object fetchWaitTimeData(@NotNull String str, @NotNull String str2, @NotNull x70.c<? super WaitTimeDataResponse> cVar) {
        return this.userRestClient.getWaitTimeData(str, str2, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getAppUser(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull zendesk.conversationkit.android.model.AuthenticationType r6, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.User> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource.C03331
            if (r0 == 0) goto L13
            r0 = r7
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$getAppUser$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource.C03331) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$getAppUser$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$getAppUser$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2c
            java.lang.Object r5 = r0.L$0
            r6 = r5
            zendesk.conversationkit.android.model.AuthenticationType r6 = (zendesk.conversationkit.android.model.AuthenticationType) r6
            ba0.g.M(r7)
            goto L43
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L33:
            ba0.g.M(r7)
            zendesk.conversationkit.android.internal.rest.UserRestClient r7 = r4.userRestClient
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.getAppUser(r5, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            zendesk.conversationkit.android.internal.rest.model.AppUserResponseDto r7 = (zendesk.conversationkit.android.internal.rest.model.AppUserResponseDto) r7
            zendesk.conversationkit.android.model.Config r5 = r4.config
            zendesk.conversationkit.android.model.App r5 = r5.getApp()
            java.lang.String r5 = r5.getId()
            zendesk.conversationkit.android.model.User r5 = zendesk.conversationkit.android.model.UserKt.toUser(r7, r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource.getAppUser(java.lang.String, zendesk.conversationkit.android.model.AuthenticationType, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getConversation(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Conversation> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource.C03341
            if (r0 == 0) goto L13
            r0 = r8
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$getConversation$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource.C03341) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$getConversation$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$getConversation$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2c
            java.lang.Object r5 = r0.L$0
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            ba0.g.M(r8)
            goto L43
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L33:
            ba0.g.M(r8)
            zendesk.conversationkit.android.internal.rest.UserRestClient r8 = r4.userRestClient
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r8.getConversation(r5, r6, r0)
            if (r8 != r1) goto L43
            return r1
        L43:
            zendesk.conversationkit.android.internal.rest.model.ConversationResponseDto r8 = (zendesk.conversationkit.android.internal.rest.model.ConversationResponseDto) r8
            zendesk.conversationkit.android.model.Conversation r5 = zendesk.conversationkit.android.model.ConversationKt.toConversation(r8, r7)
            zendesk.conversationkit.android.model.Conversation r5 = zendesk.conversationkit.android.model.ConversationKt.enrichFormResponseFields(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource.getConversation(java.lang.String, java.lang.String, java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getConversations(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull java.lang.String r6, int r7, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.ConversationsPagination> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource.C03351
            if (r0 == 0) goto L13
            r0 = r8
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$getConversations$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource.C03351) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$getConversations$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$getConversations$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2c
            java.lang.Object r5 = r0.L$0
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            ba0.g.M(r8)
            goto L43
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L33:
            ba0.g.M(r8)
            zendesk.conversationkit.android.internal.rest.UserRestClient r8 = r4.userRestClient
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r8 = r8.getConversations(r5, r6, r7, r0)
            if (r8 != r1) goto L43
            return r1
        L43:
            zendesk.conversationkit.android.internal.rest.model.ConversationsResponseDto r8 = (zendesk.conversationkit.android.internal.rest.model.ConversationsResponseDto) r8
            zendesk.conversationkit.android.model.ConversationsPagination r5 = zendesk.conversationkit.android.internal.rest.model.ConversationsResponseDtoKt.toConversationsPagination(r8, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource.getConversations(java.lang.String, java.lang.String, int, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getMessages(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9, double r10, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.MessageList> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource.C03361
            if (r0 == 0) goto L14
            r0 = r12
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$getMessages$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource.C03361) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$getMessages$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$getMessages$1
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.result
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            ba0.g.M(r12)
            goto L41
        L29:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L30:
            ba0.g.M(r12)
            zendesk.conversationkit.android.internal.rest.UserRestClient r1 = r7.userRestClient
            r6.label = r2
            r2 = r8
            r3 = r9
            r4 = r10
            java.lang.Object r12 = r1.getMessages(r2, r3, r4, r6)
            if (r12 != r0) goto L41
            return r0
        L41:
            zendesk.conversationkit.android.internal.rest.model.MessageListResponseDto r12 = (zendesk.conversationkit.android.internal.rest.model.MessageListResponseDto) r12
            zendesk.conversationkit.android.model.MessageList r8 = zendesk.conversationkit.android.model.MessageKt.toMessageList(r12)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource.getMessages(java.lang.String, java.lang.String, double, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object login(@org.jetbrains.annotations.NotNull java.lang.String r14, @org.jetbrains.annotations.NotNull java.lang.String r15, @org.jetbrains.annotations.Nullable java.lang.String r16, @org.jetbrains.annotations.Nullable java.lang.String r17, @org.jetbrains.annotations.Nullable java.lang.String r18, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.User> r19) {
        /*
            r13 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource.C03371
            if (r2 == 0) goto L17
            r2 = r1
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$login$1 r2 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource.C03371) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$login$1 r2 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$login$1
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.result
            y70.a r3 = y70.a.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L36
            if (r4 != r5) goto L2f
            java.lang.Object r14 = r2.L$0
            java.lang.String r14 = (java.lang.String) r14
            ba0.g.M(r1)
            goto L91
        L2f:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r14)
            r14 = 0
            return r14
        L36:
            ba0.g.M(r1)
            r4 = r17
            zendesk.conversationkit.android.internal.rest.model.ClientDto r8 = r13.buildClient(r15, r4)
            r1 = 0
            java.lang.String r4 = "UserActionProcessorRemoteDataSource"
            if (r0 != 0) goto L66
            java.lang.String r0 = "Building login request... [merge=false]"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            zendesk.logger.Logger.d(r4, r0, r1)
            zendesk.conversationkit.android.internal.rest.user.model.LoginRequestBody r6 = new zendesk.conversationkit.android.internal.rest.user.model.LoginRequestBody
            zendesk.conversationkit.android.internal.user.Jwt$Decoder r0 = r13.jwtDecoder
            zendesk.conversationkit.android.ConversationKitResult r0 = r0.decode(r14)
            java.lang.Object r0 = zendesk.conversationkit.android.ConversationKitResultKt.getOrThrow(r0)
            zendesk.conversationkit.android.internal.user.Jwt r0 = (zendesk.conversationkit.android.internal.user.Jwt) r0
            java.lang.String r7 = r0.getExternalId()
            r11 = 12
            r12 = 0
            r9 = 0
            r10 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L84
        L66:
            java.lang.String r6 = "Building login request... [merge=true]"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            zendesk.logger.Logger.d(r4, r6, r1)
            zendesk.conversationkit.android.internal.rest.user.model.LoginRequestBody r6 = new zendesk.conversationkit.android.internal.rest.user.model.LoginRequestBody
            zendesk.conversationkit.android.internal.user.Jwt$Decoder r1 = r13.jwtDecoder
            zendesk.conversationkit.android.ConversationKitResult r1 = r1.decode(r14)
            java.lang.Object r1 = zendesk.conversationkit.android.ConversationKitResultKt.getOrThrow(r1)
            zendesk.conversationkit.android.internal.user.Jwt r1 = (zendesk.conversationkit.android.internal.user.Jwt) r1
            java.lang.String r1 = r1.getExternalId()
            r4 = r16
            r6.<init>(r1, r8, r4, r0)
        L84:
            zendesk.conversationkit.android.internal.rest.UserRestClient r0 = r13.userRestClient
            r2.L$0 = r14
            r2.label = r5
            java.lang.Object r1 = r0.loginAppUser(r14, r6, r2)
            if (r1 != r3) goto L91
            return r3
        L91:
            zendesk.conversationkit.android.internal.rest.model.AppUserResponseDto r1 = (zendesk.conversationkit.android.internal.rest.model.AppUserResponseDto) r1
            zendesk.conversationkit.android.model.Config r0 = r13.config
            zendesk.conversationkit.android.model.App r0 = r0.getApp()
            java.lang.String r0 = r0.getId()
            zendesk.conversationkit.android.model.AuthenticationType$Jwt r2 = new zendesk.conversationkit.android.model.AuthenticationType$Jwt
            r2.<init>(r14)
            zendesk.conversationkit.android.model.User r14 = zendesk.conversationkit.android.model.UserKt.toUser(r1, r0, r2)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource.login(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, x70.c):java.lang.Object");
    }

    @Nullable
    public final Object logout(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @NotNull x70.c<? super Unit> cVar) {
        Object objLogoutAppUser = this.userRestClient.logoutAppUser(str, str2, new LogoutRequestBody(buildClient(str3, str4)), cVar);
        return objLogoutAppUser == a.COROUTINE_SUSPENDED ? objLogoutAppUser : Unit.f26487a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object proactiveMessageReferral(@org.jetbrains.annotations.NotNull java.lang.String r14, @org.jetbrains.annotations.NotNull java.lang.String r15, @org.jetbrains.annotations.Nullable java.lang.String r16, @org.jetbrains.annotations.NotNull java.lang.String r17, @org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.Nullable java.lang.String r19, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Conversation> r20) {
        /*
            r13 = this;
            r0 = r20
            boolean r1 = r0 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource.C03381
            if (r1 == 0) goto L15
            r1 = r0
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$proactiveMessageReferral$1 r1 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource.C03381) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$proactiveMessageReferral$1 r1 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$proactiveMessageReferral$1
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.result
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L34
            if (r3 != r4) goto L2d
            java.lang.Object r14 = r1.L$0
            java.lang.String r14 = (java.lang.String) r14
            ba0.g.M(r0)
            goto L6e
        L2d:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r14)
            r14 = 0
            return r14
        L34:
            ba0.g.M(r0)
            zendesk.conversationkit.android.internal.rest.UserRestClient r0 = r13.userRestClient
            zendesk.conversationkit.android.internal.rest.model.ProactiveMessageReferralDto r5 = new zendesk.conversationkit.android.internal.rest.model.ProactiveMessageReferralDto
            zendesk.conversationkit.android.internal.rest.model.AuthorDto r9 = new zendesk.conversationkit.android.internal.rest.model.AuthorDto
            zendesk.conversationkit.android.model.AuthorType r3 = zendesk.conversationkit.android.model.AuthorType.USER
            java.lang.String r8 = r3.getValue()
            r3 = r18
            r6 = r19
            zendesk.conversationkit.android.internal.rest.model.ClientDto r3 = r13.buildClient(r3, r6)
            r11 = 8
            r12 = 0
            r10 = 0
            r7 = r17
            r6 = r9
            r9 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r9 = r6
            r11 = 22
            r7 = 0
            r8 = 0
            r6 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r7 = r17
            r1.L$0 = r7
            r1.label = r4
            java.lang.Object r0 = r0.proactiveMessageReferral(r14, r15, r5, r1)
            if (r0 != r2) goto L6d
            return r2
        L6d:
            r14 = r7
        L6e:
            zendesk.conversationkit.android.internal.rest.model.ConversationResponseDto r0 = (zendesk.conversationkit.android.internal.rest.model.ConversationResponseDto) r0
            zendesk.conversationkit.android.model.Conversation r14 = zendesk.conversationkit.android.model.ConversationKt.toConversation(r0, r14)
            zendesk.conversationkit.android.model.Conversation r14 = zendesk.conversationkit.android.model.ConversationKt.enrichFormResponseFields(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource.proactiveMessageReferral(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, x70.c):java.lang.Object");
    }

    @Nullable
    public final Object sendActivityData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @NotNull String str6, @NotNull x70.c<? super Unit> cVar) {
        Object objSendActivityData = this.userRestClient.sendActivityData(str, str2, new ActivityDataRequestDto(new AuthorDto(str3, AuthorType.USER.getValue(), buildClient(str4, str5), (String) null, 8, (DefaultConstructorMarker) null), new ActivityDataDto(str6)), cVar);
        return objSendActivityData == a.COROUTINE_SUSPENDED ? objSendActivityData : Unit.f26487a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendMessage(@org.jetbrains.annotations.NotNull java.lang.String r24, @org.jetbrains.annotations.NotNull java.lang.String r25, @org.jetbrains.annotations.Nullable java.util.Date r26, @org.jetbrains.annotations.NotNull java.lang.String r27, @org.jetbrains.annotations.NotNull zendesk.conversationkit.android.model.Message r28, @org.jetbrains.annotations.NotNull java.lang.String r29, @org.jetbrains.annotations.NotNull java.lang.String r30, @org.jetbrains.annotations.Nullable java.lang.String r31, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Message> r32) {
        /*
            r23 = this;
            r0 = r23
            r1 = r32
            boolean r2 = r1 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource.C03391
            if (r2 == 0) goto L17
            r2 = r1
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$sendMessage$1 r2 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource.C03391) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$sendMessage$1 r2 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$sendMessage$1
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.result
            y70.a r3 = y70.a.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L3c
            if (r4 != r5) goto L35
            java.lang.Object r3 = r2.L$1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.L$0
            java.util.Date r2 = (java.util.Date) r2
            ba0.g.M(r1)
            r6 = r2
            r7 = r3
            goto L78
        L35:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r1)
            r1 = 0
            return r1
        L3c:
            ba0.g.M(r1)
            zendesk.conversationkit.android.internal.rest.UserRestClient r1 = r0.userRestClient
            zendesk.conversationkit.android.internal.rest.model.SendMessageRequestDto r4 = new zendesk.conversationkit.android.internal.rest.model.SendMessageRequestDto
            zendesk.conversationkit.android.internal.rest.model.AuthorDto r6 = new zendesk.conversationkit.android.internal.rest.model.AuthorDto
            zendesk.conversationkit.android.model.AuthorType r7 = zendesk.conversationkit.android.model.AuthorType.USER
            java.lang.String r7 = r7.getValue()
            r8 = r30
            r9 = r31
            zendesk.conversationkit.android.internal.rest.model.ClientDto r8 = r0.buildClient(r8, r9)
            java.lang.String r9 = r28.getLocalId()
            r10 = r29
            r6.<init>(r10, r7, r8, r9)
            zendesk.conversationkit.android.internal.rest.model.SendMessageDto r7 = zendesk.conversationkit.android.model.MessageKt.toSendMessageDto(r28)
            r4.<init>(r6, r7)
            r6 = r26
            r2.L$0 = r6
            r7 = r27
            r2.L$1 = r7
            r2.label = r5
            r8 = r24
            r9 = r25
            java.lang.Object r1 = r1.sendMessage(r8, r9, r4, r2)
            if (r1 != r3) goto L78
            return r3
        L78:
            zendesk.conversationkit.android.internal.rest.model.SendMessageResponseDto r1 = (zendesk.conversationkit.android.internal.rest.model.SendMessageResponseDto) r1
            java.util.List r1 = r1.getMessages()
            java.lang.Object r1 = kotlin.collections.CollectionsKt.O(r1)
            zendesk.conversationkit.android.internal.rest.model.MessageDto r1 = (zendesk.conversationkit.android.internal.rest.model.MessageDto) r1
            zendesk.conversationkit.android.model.Message r8 = zendesk.conversationkit.android.model.MessageKt.toMessage(r1, r6, r7)
            zendesk.conversationkit.android.model.MessageStatus$Sent r11 = new zendesk.conversationkit.android.model.MessageStatus$Sent
            r1 = 0
            r11.<init>(r1, r5, r1)
            r21 = 2043(0x7fb, float:2.863E-42)
            r22 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            zendesk.conversationkit.android.model.Message r1 = zendesk.conversationkit.android.model.Message.copy$default(r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource.sendMessage(java.lang.String, java.lang.String, java.util.Date, java.lang.String, zendesk.conversationkit.android.model.Message, java.lang.String, java.lang.String, java.lang.String, x70.c):java.lang.Object");
    }

    @Nullable
    public final Object sendPostbackAction(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @NotNull String str6, @NotNull x70.c<? super Unit> cVar) {
        Object objSendPostbackAction = this.userRestClient.sendPostbackAction(str, str2, new SendPostbackRequestDto(new AuthorDto(str3, AuthorType.USER.getValue(), buildClient(str4, str5), (String) null, 8, (DefaultConstructorMarker) null), new PostbackDto(str6)), cVar);
        return objSendPostbackAction == a.COROUTINE_SUSPENDED ? objSendPostbackAction : Unit.f26487a;
    }

    @Nullable
    public final Object updateAppUserLocale(@NotNull String str, @NotNull String str2, @NotNull x70.c<? super Unit> cVar) {
        Object objUpdateAppUserLocale = this.userRestClient.updateAppUserLocale(str, new UpdateAppUserLocaleDto(str2), cVar);
        return objUpdateAppUserLocale == a.COROUTINE_SUSPENDED ? objUpdateAppUserLocale : Unit.f26487a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateConversation(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.Nullable java.lang.String r6, @org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Conversation> r11) {
        /*
            r4 = this;
            boolean r0 = r11 instanceof zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource.C03401
            if (r0 == 0) goto L13
            r0 = r11
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$updateConversation$1 r0 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource.C03401) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$updateConversation$1 r0 = new zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource$updateConversation$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2c
            java.lang.Object r5 = r0.L$0
            r10 = r5
            java.lang.String r10 = (java.lang.String) r10
            ba0.g.M(r11)
            goto L4c
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L33:
            ba0.g.M(r11)
            zendesk.conversationkit.android.internal.rest.UserRestClient r11 = r4.userRestClient
            zendesk.conversationkit.android.internal.rest.model.UpdateConversationRequestDto r2 = new zendesk.conversationkit.android.internal.rest.model.UpdateConversationRequestDto
            zendesk.conversationkit.android.internal.rest.model.ClientDto r5 = r4.buildClient(r5, r6)
            r2.<init>(r5, r9)
            r0.L$0 = r10
            r0.label = r3
            java.lang.Object r11 = r11.updateConversation(r7, r8, r2, r0)
            if (r11 != r1) goto L4c
            return r1
        L4c:
            zendesk.conversationkit.android.internal.rest.model.ConversationResponseDto r11 = (zendesk.conversationkit.android.internal.rest.model.ConversationResponseDto) r11
            zendesk.conversationkit.android.model.Conversation r5 = zendesk.conversationkit.android.model.ConversationKt.toConversation(r11, r10)
            zendesk.conversationkit.android.model.Conversation r5 = zendesk.conversationkit.android.model.ConversationKt.enrichFormResponseFields(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource.updateConversation(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.lang.String, x70.c):java.lang.Object");
    }

    @Nullable
    public final Object updatePushToken(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull x70.c<? super Unit> cVar) {
        Object objUpdatePushToken = this.userRestClient.updatePushToken(str, str2, new UpdatePushTokenDto(str3, this.conversationKitSettings.getIntegrationId()), cVar);
        return objUpdatePushToken == a.COROUTINE_SUSPENDED ? objUpdatePushToken : Unit.f26487a;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object uploadFile(@org.jetbrains.annotations.NotNull java.lang.String r21, @org.jetbrains.annotations.NotNull java.lang.String r22, @org.jetbrains.annotations.NotNull java.lang.String r23, @org.jetbrains.annotations.Nullable java.util.Date r24, @org.jetbrains.annotations.NotNull java.lang.String r25, @org.jetbrains.annotations.NotNull java.lang.String r26, @org.jetbrains.annotations.Nullable java.lang.String r27, @org.jetbrains.annotations.NotNull zendesk.conversationkit.android.model.MessageContent.FileUpload r28, @org.jetbrains.annotations.NotNull zendesk.conversationkit.android.model.Message r29, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.model.Message> r30) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.user.data.UserActionProcessorRemoteDataSource.uploadFile(java.lang.String, java.lang.String, java.lang.String, java.util.Date, java.lang.String, java.lang.String, java.lang.String, zendesk.conversationkit.android.model.MessageContent$FileUpload, zendesk.conversationkit.android.model.Message, x70.c):java.lang.Object");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/conversationkit/android/internal/user/data/UserActionProcessorRemoteDataSource$Companion;", "", "<init>", "()V", "LOG_TAG", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ UserActionProcessorRemoteDataSource(ConversationKitSettings conversationKitSettings, Config config, SunCoFayeClient sunCoFayeClient, UserRestClient userRestClient, ClientDtoProvider clientDtoProvider, Jwt.Decoder decoder, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(conversationKitSettings, config, sunCoFayeClient, userRestClient, clientDtoProvider, (i11 & 32) != 0 ? new Jwt.Decoder() : decoder);
    }
}
