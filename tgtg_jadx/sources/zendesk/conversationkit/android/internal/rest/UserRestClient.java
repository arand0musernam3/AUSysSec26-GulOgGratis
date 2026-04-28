package zendesk.conversationkit.android.internal.rest;

import e0.f;
import kotlin.Metadata;
import kotlin.Unit;
import org.bouncycastle.math.Primes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y70.a;
import z70.c;
import z70.e;
import zendesk.conversationkit.android.internal.rest.model.ActivityDataRequestDto;
import zendesk.conversationkit.android.internal.rest.model.AppUserResponseDto;
import zendesk.conversationkit.android.internal.rest.model.ConversationResponseDto;
import zendesk.conversationkit.android.internal.rest.model.ConversationsResponseDto;
import zendesk.conversationkit.android.internal.rest.model.CreateConversationRequestDto;
import zendesk.conversationkit.android.internal.rest.model.MessageListResponseDto;
import zendesk.conversationkit.android.internal.rest.model.ProactiveMessageReferralDto;
import zendesk.conversationkit.android.internal.rest.model.SendMessageRequestDto;
import zendesk.conversationkit.android.internal.rest.model.SendMessageResponseDto;
import zendesk.conversationkit.android.internal.rest.model.SendPostbackRequestDto;
import zendesk.conversationkit.android.internal.rest.model.UpdateAppUserLocaleDto;
import zendesk.conversationkit.android.internal.rest.model.UpdateConversationRequestDto;
import zendesk.conversationkit.android.internal.rest.model.UpdatePushTokenDto;
import zendesk.conversationkit.android.internal.rest.user.model.LoginRequestBody;
import zendesk.conversationkit.android.internal.rest.user.model.LogoutRequestBody;
import zendesk.conversationkit.android.model.WaitTimeDataResponse;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0017\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001b\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\u001f\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0086@¢\u0006\u0004\b\u001f\u0010 J(\u0010$\u001a\u00020#2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0086@¢\u0006\u0004\b$\u0010%J(\u0010)\u001a\u00020(2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0086@¢\u0006\u0004\b)\u0010*J(\u0010.\u001a\u00020-2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0086@¢\u0006\u0004\b.\u0010/J(\u00104\u001a\u0002032\u0006\u0010\r\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u00022\u0006\u00102\u001a\u000201H\u0086@¢\u0006\u0004\b4\u00105J(\u00108\u001a\u0002032\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u00107\u001a\u000206H\u0086@¢\u0006\u0004\b8\u00109J \u0010<\u001a\u0002032\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010;\u001a\u00020:H\u0086@¢\u0006\u0004\b<\u0010=J \u0010A\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020\u00022\u0006\u0010@\u001a\u00020?H\u0086@¢\u0006\u0004\bA\u0010BJ(\u0010E\u001a\u0002032\u0006\u0010>\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010D\u001a\u00020CH\u0086@¢\u0006\u0004\bE\u0010FJ(\u0010J\u001a\u00020I2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010H\u001a\u00020GH\u0086@¢\u0006\u0004\bJ\u0010KJ(\u0010N\u001a\u0002032\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010M\u001a\u00020LH\u0086@¢\u0006\u0004\bN\u0010OJ \u0010Q\u001a\u00020P2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0086@¢\u0006\u0004\bQ\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010RR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010RR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010SR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010TR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010U¨\u0006V"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/UserRestClient;", "", "", "appId", "appUserId", "Lzendesk/conversationkit/android/internal/rest/SunshineConversationsApi;", "sunshineConversationsApi", "Lzendesk/conversationkit/android/internal/rest/EndUserExpectationsApi;", "endUserExpectationsApi", "Lzendesk/conversationkit/android/internal/rest/RestClientFiles;", "restClientFiles", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/SunshineConversationsApi;Lzendesk/conversationkit/android/internal/rest/EndUserExpectationsApi;Lzendesk/conversationkit/android/internal/rest/RestClientFiles;)V", "authorization", "Lzendesk/conversationkit/android/internal/rest/model/AppUserResponseDto;", "getAppUser", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/rest/model/CreateConversationRequestDto;", "createConversationRequestDto", "Lzendesk/conversationkit/android/internal/rest/model/ConversationResponseDto;", "createConversation", "(Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/CreateConversationRequestDto;Lx70/c;)Ljava/lang/Object;", "conversationId", "getConversation", "(Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/rest/model/UpdateConversationRequestDto;", "updateConversationRequestDto", "updateConversation", "(Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/UpdateConversationRequestDto;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/rest/model/ProactiveMessageReferralDto;", "proactiveMessageReferralDto", "proactiveMessageReferral", "(Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/ProactiveMessageReferralDto;Lx70/c;)Ljava/lang/Object;", "", "beforeTimestamp", "Lzendesk/conversationkit/android/internal/rest/model/MessageListResponseDto;", "getMessages", "(Ljava/lang/String;Ljava/lang/String;DLx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/rest/model/SendMessageRequestDto;", "sendMessageRequestDto", "Lzendesk/conversationkit/android/internal/rest/model/SendMessageResponseDto;", "sendMessage", "(Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/SendMessageRequestDto;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/rest/model/UploadFileDto;", "uploadFileDto", "Lzendesk/conversationkit/android/internal/rest/model/UploadFileResponseDto;", "uploadFile", "(Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/UploadFileDto;Lx70/c;)Ljava/lang/Object;", Bayeux.KEY_CLIENT_ID, "Lzendesk/conversationkit/android/internal/rest/model/UpdatePushTokenDto;", "updatePushTokenDto", "", "updatePushToken", "(Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/UpdatePushTokenDto;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/rest/model/ActivityDataRequestDto;", "activityDataDto", "sendActivityData", "(Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/ActivityDataRequestDto;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/rest/model/UpdateAppUserLocaleDto;", "updateAppUserLocaleDto", "updateAppUserLocale", "(Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/UpdateAppUserLocaleDto;Lx70/c;)Ljava/lang/Object;", "jwt", "Lzendesk/conversationkit/android/internal/rest/user/model/LoginRequestBody;", "loginRequestBody", "loginAppUser", "(Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/user/model/LoginRequestBody;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/rest/user/model/LogoutRequestBody;", "logoutRequestBody", "logoutAppUser", "(Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/user/model/LogoutRequestBody;Lx70/c;)Ljava/lang/Object;", "", "offset", "Lzendesk/conversationkit/android/internal/rest/model/ConversationsResponseDto;", "getConversations", "(Ljava/lang/String;Ljava/lang/String;ILx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/rest/model/SendPostbackRequestDto;", "sendPostbackRequestDto", "sendPostbackAction", "(Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/SendPostbackRequestDto;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/model/WaitTimeDataResponse;", "getWaitTimeData", "Ljava/lang/String;", "Lzendesk/conversationkit/android/internal/rest/SunshineConversationsApi;", "Lzendesk/conversationkit/android/internal/rest/EndUserExpectationsApi;", "Lzendesk/conversationkit/android/internal/rest/RestClientFiles;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UserRestClient {

    @NotNull
    private final String appId;

    @NotNull
    private final String appUserId;

    @NotNull
    private final EndUserExpectationsApi endUserExpectationsApi;

    @NotNull
    private final RestClientFiles restClientFiles;

    @NotNull
    private final SunshineConversationsApi sunshineConversationsApi;

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.rest.UserRestClient$uploadFile$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.rest.UserRestClient", f = "UserRestClient.kt", l = {Primes.SMALL_FACTOR_LIMIT}, m = "uploadFile")
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
            return UserRestClient.this.uploadFile(null, null, null, this);
        }
    }

    public UserRestClient(@NotNull String str, @NotNull String str2, @NotNull SunshineConversationsApi sunshineConversationsApi, @NotNull EndUserExpectationsApi endUserExpectationsApi, @NotNull RestClientFiles restClientFiles) {
        str.getClass();
        str2.getClass();
        sunshineConversationsApi.getClass();
        endUserExpectationsApi.getClass();
        restClientFiles.getClass();
        this.appId = str;
        this.appUserId = str2;
        this.sunshineConversationsApi = sunshineConversationsApi;
        this.endUserExpectationsApi = endUserExpectationsApi;
        this.restClientFiles = restClientFiles;
    }

    @Nullable
    public final Object createConversation(@NotNull String str, @NotNull CreateConversationRequestDto createConversationRequestDto, @NotNull x70.c<? super ConversationResponseDto> cVar) {
        return this.sunshineConversationsApi.createConversation(str, this.appId, this.appUserId, createConversationRequestDto, cVar);
    }

    @Nullable
    public final Object getAppUser(@NotNull String str, @NotNull x70.c<? super AppUserResponseDto> cVar) {
        return this.sunshineConversationsApi.getAppUser(str, this.appId, this.appUserId, cVar);
    }

    @Nullable
    public final Object getConversation(@NotNull String str, @NotNull String str2, @NotNull x70.c<? super ConversationResponseDto> cVar) {
        return this.sunshineConversationsApi.getConversation(str, this.appId, str2, cVar);
    }

    @Nullable
    public final Object getConversations(@NotNull String str, @NotNull String str2, int i11, @NotNull x70.c<? super ConversationsResponseDto> cVar) {
        return this.sunshineConversationsApi.getConversations(str, this.appId, str2, i11, cVar);
    }

    @Nullable
    public final Object getMessages(@NotNull String str, @NotNull String str2, double d3, @NotNull x70.c<? super MessageListResponseDto> cVar) {
        return this.sunshineConversationsApi.getMessages(str, this.appId, str2, d3, cVar);
    }

    @Nullable
    public final Object getWaitTimeData(@NotNull String str, @NotNull String str2, @NotNull x70.c<? super WaitTimeDataResponse> cVar) {
        return this.endUserExpectationsApi.getWaitTimeData(str, str2, cVar);
    }

    @Nullable
    public final Object loginAppUser(@NotNull String str, @NotNull LoginRequestBody loginRequestBody, @NotNull x70.c<? super AppUserResponseDto> cVar) {
        return this.sunshineConversationsApi.loginAppUser(this.appId, f.k("Bearer ", str), loginRequestBody, cVar);
    }

    @Nullable
    public final Object logoutAppUser(@NotNull String str, @NotNull String str2, @NotNull LogoutRequestBody logoutRequestBody, @NotNull x70.c<? super Unit> cVar) {
        Object objLogoutAppUser = this.sunshineConversationsApi.logoutAppUser(this.appId, str2, f.k("Bearer ", str), logoutRequestBody, cVar);
        return objLogoutAppUser == a.COROUTINE_SUSPENDED ? objLogoutAppUser : Unit.f26487a;
    }

    @Nullable
    public final Object proactiveMessageReferral(@NotNull String str, @NotNull String str2, @NotNull ProactiveMessageReferralDto proactiveMessageReferralDto, @NotNull x70.c<? super ConversationResponseDto> cVar) {
        return this.sunshineConversationsApi.proactiveMessageReferral(str, this.appId, str2, proactiveMessageReferralDto, cVar);
    }

    @Nullable
    public final Object sendActivityData(@NotNull String str, @NotNull String str2, @NotNull ActivityDataRequestDto activityDataRequestDto, @NotNull x70.c<? super Unit> cVar) {
        Object objSendActivityData = this.sunshineConversationsApi.sendActivityData(str, this.appId, str2, activityDataRequestDto, cVar);
        return objSendActivityData == a.COROUTINE_SUSPENDED ? objSendActivityData : Unit.f26487a;
    }

    @Nullable
    public final Object sendMessage(@NotNull String str, @NotNull String str2, @NotNull SendMessageRequestDto sendMessageRequestDto, @NotNull x70.c<? super SendMessageResponseDto> cVar) {
        return this.sunshineConversationsApi.sendMessage(str, this.appId, str2, sendMessageRequestDto, cVar);
    }

    @Nullable
    public final Object sendPostbackAction(@NotNull String str, @NotNull String str2, @NotNull SendPostbackRequestDto sendPostbackRequestDto, @NotNull x70.c<? super Unit> cVar) {
        Object objSendPostbackAction = this.sunshineConversationsApi.sendPostbackAction(str, this.appId, str2, sendPostbackRequestDto, cVar);
        return objSendPostbackAction == a.COROUTINE_SUSPENDED ? objSendPostbackAction : Unit.f26487a;
    }

    @Nullable
    public final Object updateAppUserLocale(@NotNull String str, @NotNull UpdateAppUserLocaleDto updateAppUserLocaleDto, @NotNull x70.c<? super Unit> cVar) {
        Object objUpdateAppUserLocale = this.sunshineConversationsApi.updateAppUserLocale(str, this.appId, this.appUserId, updateAppUserLocaleDto, cVar);
        return objUpdateAppUserLocale == a.COROUTINE_SUSPENDED ? objUpdateAppUserLocale : Unit.f26487a;
    }

    @Nullable
    public final Object updateConversation(@NotNull String str, @NotNull String str2, @NotNull UpdateConversationRequestDto updateConversationRequestDto, @NotNull x70.c<? super ConversationResponseDto> cVar) {
        return this.sunshineConversationsApi.updateConversation(str, this.appId, str2, updateConversationRequestDto, cVar);
    }

    @Nullable
    public final Object updatePushToken(@NotNull String str, @NotNull String str2, @NotNull UpdatePushTokenDto updatePushTokenDto, @NotNull x70.c<? super Unit> cVar) {
        Object objUpdatePushToken = this.sunshineConversationsApi.updatePushToken(str, this.appId, this.appUserId, str2, updatePushTokenDto, cVar);
        return objUpdatePushToken == a.COROUTINE_SUSPENDED ? objUpdatePushToken : Unit.f26487a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object uploadFile(@org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull zendesk.conversationkit.android.internal.rest.model.UploadFileDto r12, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.internal.rest.model.UploadFileResponseDto> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof zendesk.conversationkit.android.internal.rest.UserRestClient.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r13
            zendesk.conversationkit.android.internal.rest.UserRestClient$uploadFile$1 r0 = (zendesk.conversationkit.android.internal.rest.UserRestClient.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r8 = r0
            goto L1a
        L14:
            zendesk.conversationkit.android.internal.rest.UserRestClient$uploadFile$1 r0 = new zendesk.conversationkit.android.internal.rest.UserRestClient$uploadFile$1
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r8.result
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2f
            java.lang.Object r10 = r8.L$0
            r12 = r10
            zendesk.conversationkit.android.internal.rest.model.UploadFileDto r12 = (zendesk.conversationkit.android.internal.rest.model.UploadFileDto) r12
            ba0.g.M(r13)
            goto L8d
        L2f:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r10)
            return r2
        L35:
            ba0.g.M(r13)
            zendesk.conversationkit.android.internal.rest.RestClientFiles r13 = r9.restClientFiles
            zendesk.conversationkit.android.internal.rest.model.Upload r1 = r12.getUpload()
            java.lang.String r1 = r1.getUri()
            zendesk.conversationkit.android.internal.rest.model.Upload r4 = r12.getUpload()
            java.lang.String r4 = r4.getName()
            java.io.File r13 = r13.getUploadFileForUri(r1, r4)
            kotlin.text.Regex r1 = q90.z.f36633e
            zendesk.conversationkit.android.internal.rest.model.Upload r1 = r12.getUpload()
            java.lang.String r1 = r1.getMimeType()
            r1.getClass()
            q90.z r2 = q90.y.a(r1)     // Catch: java.lang.IllegalArgumentException -> L5f
        L5f:
            zendesk.conversationkit.android.internal.rest.UserRestClient$uploadFile$uploadRequestBody$1 r1 = new zendesk.conversationkit.android.internal.rest.UserRestClient$uploadFile$uploadRequestBody$1
            r1.<init>(r13, r2)
            r13 = r1
            zendesk.conversationkit.android.internal.rest.SunshineConversationsApi r1 = r9.sunshineConversationsApi
            r2 = r3
            java.lang.String r3 = r9.appId
            zendesk.conversationkit.android.internal.rest.model.AuthorDto r5 = r12.getAuthor()
            zendesk.conversationkit.android.internal.rest.model.MetadataDto r6 = r12.getMetadata()
            zendesk.conversationkit.android.internal.rest.model.Upload r4 = r12.getUpload()
            java.lang.String r4 = r4.getName()
            java.lang.String r7 = "source"
            q90.a0 r7 = w.b.B(r7, r4, r13)
            r8.L$0 = r12
            r8.label = r2
            r2 = r10
            r4 = r11
            java.lang.Object r13 = r1.uploadFile(r2, r3, r4, r5, r6, r7, r8)
            if (r13 != r0) goto L8d
            return r0
        L8d:
            zendesk.conversationkit.android.internal.rest.model.UploadFileResponseDto r13 = (zendesk.conversationkit.android.internal.rest.model.UploadFileResponseDto) r13
            zendesk.conversationkit.android.internal.rest.RestClientFiles r10 = r9.restClientFiles
            zendesk.conversationkit.android.internal.rest.model.Upload r11 = r12.getUpload()
            java.lang.String r11 = r11.getName()
            r10.cleanUpUpload(r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.rest.UserRestClient.uploadFile(java.lang.String, java.lang.String, zendesk.conversationkit.android.internal.rest.model.UploadFileDto, x70.c):java.lang.Object");
    }
}
