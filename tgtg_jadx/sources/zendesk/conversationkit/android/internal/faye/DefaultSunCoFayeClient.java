package zendesk.conversationkit.android.internal.faye;

import ba0.g;
import com.app.tgtg.model.local.AppConstants;
import com.braze.h2;
import com.braze.models.inappmessage.InAppMessageBase;
import j4.s;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.SerializationException;
import mn.j;
import n90.c;
import n90.c0;
import n90.n;
import n90.o;
import n90.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import v80.k;
import v80.l;
import y70.a;
import y70.f;
import y80.a2;
import y80.f1;
import y80.r;
import z70.e;
import z70.i;
import zendesk.conversationkit.android.ConnectionStatus;
import zendesk.conversationkit.android.internal.Action;
import zendesk.conversationkit.android.internal.ActionDispatcher;
import zendesk.conversationkit.android.internal.extension.SafeResumeWithExceptionKt;
import zendesk.conversationkit.android.internal.rest.model.MessageDto;
import zendesk.conversationkit.android.internal.rest.model.UserMergeDataDTO;
import zendesk.conversationkit.android.model.ActivityDataKt;
import zendesk.conversationkit.android.model.AuthenticationType;
import zendesk.conversationkit.android.model.ConversationStatus;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.MessageKt;
import zendesk.conversationkit.android.model.RealtimeSettings;
import zendesk.conversationkit.android.model.User;
import zendesk.conversationkit.android.model.UserMerge;
import zendesk.conversationkit.android.model.UserMergeKt;
import zendesk.faye.BayeuxOptionalFields;
import zendesk.faye.DisconnectMessage;
import zendesk.faye.FayeClient;
import zendesk.faye.FayeClientError;
import zendesk.faye.FayeClientListener;
import zendesk.faye.SubscribeMessage;
import zendesk.faye.UnsubscribeMessage;
import zendesk.faye.internal.Bayeux;
import zendesk.logger.Logger;
import zendesk.messaging.android.internal.messagingscreen.MessagingScreenViewModel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 ]2\u00020\u00012\u00020\u0002:\u0001]B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J!\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u0011J\u000f\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u0011J\u001f\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010\u001fJ\u0018\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000fH\u0016¢\u0006\u0004\b*\u0010\u0011J\u0017\u0010+\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b-\u0010,J\u000f\u0010.\u001a\u00020\u000fH\u0016¢\u0006\u0004\b.\u0010\u0011J\u0012\u00100\u001a\u0004\u0018\u00010/H\u0082@¢\u0006\u0004\b0\u0010&J\u000f\u00101\u001a\u00020\u000fH\u0002¢\u0006\u0004\b1\u0010\u0011J\u001f\u00105\u001a\u00020\u001b2\u0006\u00102\u001a\u00020/2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u000f2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b9\u0010:J\u001f\u0010=\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020<H\u0002¢\u0006\u0004\b=\u0010>J'\u0010C\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u001b2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u001bH\u0002¢\u0006\u0004\bE\u0010,J\u0017\u0010F\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u001bH\u0002¢\u0006\u0004\bF\u0010,J5\u0010L\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u001b2\u0006\u0010H\u001a\u00020G2\u0014\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020J\u0018\u00010IH\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020NH\u0002¢\u0006\u0004\bP\u0010QR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010RR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010SR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010TR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010UR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010VR\u0016\u0010X\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010Z\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010YR\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020'0[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\\¨\u0006^"}, d2 = {"Lzendesk/conversationkit/android/internal/faye/DefaultSunCoFayeClient;", "Lzendesk/conversationkit/android/internal/faye/SunCoFayeClient;", "Lzendesk/faye/FayeClientListener;", "Lzendesk/faye/FayeClient;", "fayeClient", "Lzendesk/conversationkit/android/internal/ActionDispatcher;", "actionDispatcher", "Lv80/b0;", "coroutineScope", "Ln90/c;", "json", "Lzendesk/conversationkit/android/internal/faye/SunCoFayeInMemoryDataSource;", "sunCoFayeInMemoryDataSource", "<init>", "(Lzendesk/faye/FayeClient;Lzendesk/conversationkit/android/internal/ActionDispatcher;Lv80/b0;Ln90/c;Lzendesk/conversationkit/android/internal/faye/SunCoFayeInMemoryDataSource;)V", "", "connect", "()V", "disconnect", "Lzendesk/faye/FayeClientError;", "fayeClientError", "", "throwable", "onClientError", "(Lzendesk/faye/FayeClientError;Ljava/lang/Throwable;)V", "onConnectedToServer", "onDisconnectedFromServer", "", "channel", InAppMessageBase.MESSAGE, "onMessagePublished", "(Ljava/lang/String;Ljava/lang/String;)V", "onMessageReceived", "messageId", "Lzendesk/conversationkit/android/model/Message;", "awaitFileUploadResult", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "awaitClientConnected", "(Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/ConnectionStatus;", "connectionStatus", "()Lzendesk/conversationkit/android/ConnectionStatus;", "invalidate", "onSubscribedToChannel", "(Ljava/lang/String;)V", "onUnsubscribedFromChannel", "subscribe", "Lzendesk/conversationkit/android/model/RealtimeSettings;", "fetchRealTimeSettings", "unsubscribe", "realtimeSettings", "Lzendesk/conversationkit/android/model/AuthenticationType;", "authenticationType", "getAuthenticationType", "(Lzendesk/conversationkit/android/model/RealtimeSettings;Lzendesk/conversationkit/android/model/AuthenticationType;)Ljava/lang/String;", "Ln90/b0;", "event", "processEvent", "(Ln90/b0;)V", "conversationId", "Lzendesk/conversationkit/android/internal/rest/model/MessageDto;", "processMessageEvent", "(Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/model/MessageDto;)V", "Lzendesk/conversationkit/android/internal/faye/WsActivityEventDto;", "activity", "Lzendesk/conversationkit/android/internal/faye/WsConversationDto;", MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, "processActivityEvent", "(Ljava/lang/String;Lzendesk/conversationkit/android/internal/faye/WsActivityEventDto;Lzendesk/conversationkit/android/internal/faye/WsConversationDto;)V", "processConversationAddedEvent", "processConversationRemovedEvent", "Lzendesk/conversationkit/android/model/ConversationStatus;", "status", "", "", "metadata", "processConversationUpdatedEvent", "(Ljava/lang/String;Lzendesk/conversationkit/android/model/ConversationStatus;Ljava/util/Map;)V", "Lzendesk/conversationkit/android/model/UserMerge;", "userMerge", "processUserMergeEvent", "(Lzendesk/conversationkit/android/model/UserMerge;)V", "Lzendesk/faye/FayeClient;", "Lzendesk/conversationkit/android/internal/ActionDispatcher;", "Lv80/b0;", "Ln90/c;", "Lzendesk/conversationkit/android/internal/faye/SunCoFayeInMemoryDataSource;", "", "currentConnectionAttempts", "I", "currentSubscriptionAttempts", "Ly80/f1;", "Ly80/f1;", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSunCoFayeClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SunCoFayeClient.kt\nzendesk/conversationkit/android/internal/faye/DefaultSunCoFayeClient\n+ 2 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 6 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 7 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 8 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,629:1\n29#2,3:630\n230#3,5:633\n1#4:638\n426#5,11:639\n17#6:650\n19#6:654\n46#7:651\n51#7:653\n105#8:652\n*S KotlinDebug\n*F\n+ 1 SunCoFayeClient.kt\nzendesk/conversationkit/android/internal/faye/DefaultSunCoFayeClient\n*L\n240#1:630,3\n277#1:633,5\n381#1:639,11\n457#1:650\n457#1:654\n457#1:651\n457#1:653\n457#1:652\n*E\n"})
public final class DefaultSunCoFayeClient implements SunCoFayeClient, FayeClientListener {

    @NotNull
    private static final String JSON_EVENTS = "events";

    @NotNull
    private static final String LOG_TAG = "SunCoFayeClient";

    @NotNull
    private static final String SUBSCRIBE_EXT_FIELD_APP_ID = "appId";

    @NotNull
    private static final String SUBSCRIBE_EXT_FIELD_APP_USER_ID = "appUserId";

    @NotNull
    private static final String SUBSCRIBE_EXT_FIELD_JWT = "jwt";

    @NotNull
    private static final String SUBSCRIBE_EXT_FIELD_SESSION_TOKEN = "sessionToken";

    @NotNull
    private final ActionDispatcher actionDispatcher;

    @NotNull
    private f1 connectionStatus;

    @NotNull
    private final b0 coroutineScope;
    private int currentConnectionAttempts;
    private int currentSubscriptionAttempts;

    @NotNull
    private final FayeClient fayeClient;

    @NotNull
    private final c json;

    @NotNull
    private final SunCoFayeInMemoryDataSource sunCoFayeInMemoryDataSource;

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$connect$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$connect$1", f = "SunCoFayeClient.kt", l = {133, 135, 138, 144}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nSunCoFayeClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SunCoFayeClient.kt\nzendesk/conversationkit/android/internal/faye/DefaultSunCoFayeClient$connect$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,629:1\n230#2,5:630\n230#2,5:635\n*S KotlinDebug\n*F\n+ 1 SunCoFayeClient.kt\nzendesk/conversationkit/android/internal/faye/DefaultSunCoFayeClient$connect$1\n*L\n137#1:630,5\n143#1:635,5\n*E\n"})
    public static final class AnonymousClass1 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        public AnonymousClass1(x70.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return DefaultSunCoFayeClient.this.new AnonymousClass1(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00cb, code lost:
        
            if (r11.dispatch(r1, r10) == r0) goto L37;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
        @Override // z70.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 209
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$fetchRealTimeSettings$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient", f = "SunCoFayeClient.kt", l = {152}, m = "fetchRealTimeSettings")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02321 extends z70.c {
        int label;
        /* synthetic */ Object result;

        public C02321(x70.c<? super C02321> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultSunCoFayeClient.this.fetchRealTimeSettings(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$onClientError$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$onClientError$1", f = "SunCoFayeClient.kt", l = {181, 188, 203}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C02331 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ FayeClientError $fayeClientError;
        final /* synthetic */ Throwable $throwable;
        Object L$0;
        int label;
        final /* synthetic */ DefaultSunCoFayeClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02331(FayeClientError fayeClientError, Throwable th2, DefaultSunCoFayeClient defaultSunCoFayeClient, x70.c<? super C02331> cVar) {
            super(2, cVar);
            this.$fayeClientError = fayeClientError;
            this.$throwable = th2;
            this.this$0 = defaultSunCoFayeClient;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return new C02331(this.$fayeClientError, this.$throwable, this.this$0, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C02331) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0088 A[PHI: r1
          0x0088: PHI (r1v3 zendesk.conversationkit.android.model.RealtimeSettings) = 
          (r1v2 zendesk.conversationkit.android.model.RealtimeSettings)
          (r1v2 zendesk.conversationkit.android.model.RealtimeSettings)
          (r1v2 zendesk.conversationkit.android.model.RealtimeSettings)
          (r1v9 zendesk.conversationkit.android.model.RealtimeSettings)
         binds: [B:16:0x0058, B:18:0x0064, B:20:0x0085, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0124  */
        @Override // z70.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 307
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient.C02331.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$onDisconnectedFromServer$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$onDisconnectedFromServer$2", f = "SunCoFayeClient.kt", l = {279}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass2 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        public AnonymousClass2(x70.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return DefaultSunCoFayeClient.this.new AnonymousClass2(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                ActionDispatcher actionDispatcher = DefaultSunCoFayeClient.this.actionDispatcher;
                Action.RealtimeConnectionStatusUpdate realtimeConnectionStatusUpdate = new Action.RealtimeConnectionStatusUpdate(ConnectionStatus.DISCONNECTED);
                this.label = 1;
                if (actionDispatcher.dispatch(realtimeConnectionStatusUpdate, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$onSubscribedToChannel$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$onSubscribedToChannel$1", f = "SunCoFayeClient.kt", l = {580}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nSunCoFayeClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SunCoFayeClient.kt\nzendesk/conversationkit/android/internal/faye/DefaultSunCoFayeClient$onSubscribedToChannel$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,629:1\n230#2,5:630\n*S KotlinDebug\n*F\n+ 1 SunCoFayeClient.kt\nzendesk/conversationkit/android/internal/faye/DefaultSunCoFayeClient$onSubscribedToChannel$1\n*L\n579#1:630,5\n*E\n"})
    public static final class C02341 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        public C02341(x70.c<? super C02341> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return DefaultSunCoFayeClient.this.new C02341(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C02341) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a2 a2Var;
            Object value;
            ConnectionStatus connectionStatus;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                f1 f1Var = DefaultSunCoFayeClient.this.connectionStatus;
                do {
                    a2Var = (a2) f1Var;
                    value = a2Var.getValue();
                    connectionStatus = ConnectionStatus.CONNECTED_REALTIME;
                } while (!a2Var.g(value, connectionStatus));
                ActionDispatcher actionDispatcher = DefaultSunCoFayeClient.this.actionDispatcher;
                Action.RealtimeConnectionStatusUpdate realtimeConnectionStatusUpdate = new Action.RealtimeConnectionStatusUpdate(connectionStatus);
                this.label = 1;
                if (actionDispatcher.dispatch(realtimeConnectionStatusUpdate, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$onUnsubscribedFromChannel$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$onUnsubscribedFromChannel$1", f = "SunCoFayeClient.kt", l = {594}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nSunCoFayeClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SunCoFayeClient.kt\nzendesk/conversationkit/android/internal/faye/DefaultSunCoFayeClient$onUnsubscribedFromChannel$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,629:1\n230#2,5:630\n*S KotlinDebug\n*F\n+ 1 SunCoFayeClient.kt\nzendesk/conversationkit/android/internal/faye/DefaultSunCoFayeClient$onUnsubscribedFromChannel$1\n*L\n593#1:630,5\n*E\n"})
    public static final class C02351 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        public C02351(x70.c<? super C02351> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return DefaultSunCoFayeClient.this.new C02351(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C02351) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a2 a2Var;
            Object value;
            ConnectionStatus connectionStatus;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                f1 f1Var = DefaultSunCoFayeClient.this.connectionStatus;
                do {
                    a2Var = (a2) f1Var;
                    value = a2Var.getValue();
                    connectionStatus = ConnectionStatus.DISCONNECTED;
                } while (!a2Var.g(value, connectionStatus));
                ActionDispatcher actionDispatcher = DefaultSunCoFayeClient.this.actionDispatcher;
                Action.RealtimeConnectionStatusUpdate realtimeConnectionStatusUpdate = new Action.RealtimeConnectionStatusUpdate(connectionStatus);
                this.label = 1;
                if (actionDispatcher.dispatch(realtimeConnectionStatusUpdate, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$processActivityEvent$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$processActivityEvent$1", f = "SunCoFayeClient.kt", l = {503}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C02361 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ WsActivityEventDto $activity;
        final /* synthetic */ WsConversationDto $conversation;
        final /* synthetic */ String $conversationId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02361(WsActivityEventDto wsActivityEventDto, String str, WsConversationDto wsConversationDto, x70.c<? super C02361> cVar) {
            super(2, cVar);
            this.$activity = wsActivityEventDto;
            this.$conversationId = str;
            this.$conversation = wsConversationDto;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return DefaultSunCoFayeClient.this.new C02361(this.$activity, this.$conversationId, this.$conversation, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C02361) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                ActionDispatcher actionDispatcher = DefaultSunCoFayeClient.this.actionDispatcher;
                Action.ActivityEventReceived activityEventReceived = new Action.ActivityEventReceived(ActivityDataKt.toActivityEvent(this.$activity, this.$conversationId, this.$conversation.getAppMakerLastRead()));
                this.label = 1;
                if (actionDispatcher.dispatch(activityEventReceived, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$processConversationAddedEvent$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$processConversationAddedEvent$1", f = "SunCoFayeClient.kt", l = {516}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C02371 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ String $conversationId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02371(String str, x70.c<? super C02371> cVar) {
            super(2, cVar);
            this.$conversationId = str;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return DefaultSunCoFayeClient.this.new C02371(this.$conversationId, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C02371) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                ActionDispatcher actionDispatcher = DefaultSunCoFayeClient.this.actionDispatcher;
                Action.ConversationAdded conversationAdded = new Action.ConversationAdded(this.$conversationId);
                this.label = 1;
                if (actionDispatcher.dispatch(conversationAdded, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$processConversationRemovedEvent$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$processConversationRemovedEvent$1", f = "SunCoFayeClient.kt", l = {529}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C02381 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ String $conversationId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02381(String str, x70.c<? super C02381> cVar) {
            super(2, cVar);
            this.$conversationId = str;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return DefaultSunCoFayeClient.this.new C02381(this.$conversationId, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C02381) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                ActionDispatcher actionDispatcher = DefaultSunCoFayeClient.this.actionDispatcher;
                Action.ConversationRemoved conversationRemoved = new Action.ConversationRemoved(this.$conversationId);
                this.label = 1;
                if (actionDispatcher.dispatch(conversationRemoved, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$processConversationUpdatedEvent$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$processConversationUpdatedEvent$1", f = "SunCoFayeClient.kt", l = {549}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C02391 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ String $conversationId;
        final /* synthetic */ Map<String, Object> $metadata;
        final /* synthetic */ ConversationStatus $status;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02391(String str, ConversationStatus conversationStatus, Map<String, ? extends Object> map, x70.c<? super C02391> cVar) {
            super(2, cVar);
            this.$conversationId = str;
            this.$status = conversationStatus;
            this.$metadata = map;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return DefaultSunCoFayeClient.this.new C02391(this.$conversationId, this.$status, this.$metadata, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C02391) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                ActionDispatcher actionDispatcher = DefaultSunCoFayeClient.this.actionDispatcher;
                Action.ConversationUpdate conversationUpdate = new Action.ConversationUpdate(this.$conversationId, this.$status, this.$metadata);
                this.label = 1;
                if (actionDispatcher.dispatch(conversationUpdate, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$processMessageEvent$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$processMessageEvent$1", f = "SunCoFayeClient.kt", l = {480}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C02401 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ String $conversationId;
        final /* synthetic */ MessageDto $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02401(String str, MessageDto messageDto, x70.c<? super C02401> cVar) {
            super(2, cVar);
            this.$conversationId = str;
            this.$message = messageDto;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return DefaultSunCoFayeClient.this.new C02401(this.$conversationId, this.$message, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C02401) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                ActionDispatcher actionDispatcher = DefaultSunCoFayeClient.this.actionDispatcher;
                Action.MessageReceived messageReceived = new Action.MessageReceived(this.$conversationId, MessageKt.toMessage$default(this.$message, null, null, 3, null));
                this.label = 1;
                if (actionDispatcher.dispatch(messageReceived, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$processUserMergeEvent$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$processUserMergeEvent$1", f = "SunCoFayeClient.kt", l = {565}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C02411 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ UserMerge $userMerge;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02411(UserMerge userMerge, x70.c<? super C02411> cVar) {
            super(2, cVar);
            this.$userMerge = userMerge;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return DefaultSunCoFayeClient.this.new C02411(this.$userMerge, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C02411) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                ActionDispatcher actionDispatcher = DefaultSunCoFayeClient.this.actionDispatcher;
                Action.UserMergeReceived userMergeReceived = new Action.UserMergeReceived(this.$userMerge);
                this.label = 1;
                if (actionDispatcher.dispatch(userMergeReceived, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$subscribe$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$subscribe$1", f = "SunCoFayeClient.kt", l = {602}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C02421 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        public C02421(x70.c<? super C02421> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return DefaultSunCoFayeClient.this.new C02421(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C02421) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                SunCoFayeInMemoryDataSource sunCoFayeInMemoryDataSource = DefaultSunCoFayeClient.this.sunCoFayeInMemoryDataSource;
                this.label = 1;
                obj = sunCoFayeInMemoryDataSource.getUser(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            User user = (User) obj;
            RealtimeSettings realtimeSettings = user.getRealtimeSettings();
            AuthenticationType authenticationType = user.getAuthenticationType();
            DefaultSunCoFayeClient.this.currentConnectionAttempts = 0;
            DefaultSunCoFayeClient.this.fayeClient.send(new SubscribeMessage(s.k("/sdk/apps/", realtimeSettings.getAppId(), "/appusers/", realtimeSettings.getUserId()), new BayeuxOptionalFields(DefaultSunCoFayeClient.this.getAuthenticationType(realtimeSettings, authenticationType), null, 2, null)));
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$unsubscribe$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$unsubscribe$1", f = "SunCoFayeClient.kt", l = {AppConstants.GPS_SETTINGS}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C02431 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        public C02431(x70.c<? super C02431> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return DefaultSunCoFayeClient.this.new C02431(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C02431) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                SunCoFayeInMemoryDataSource sunCoFayeInMemoryDataSource = DefaultSunCoFayeClient.this.sunCoFayeInMemoryDataSource;
                this.label = 1;
                obj = sunCoFayeInMemoryDataSource.getUser(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            User user = (User) obj;
            RealtimeSettings realtimeSettings = user.getRealtimeSettings();
            DefaultSunCoFayeClient.this.fayeClient.send(new UnsubscribeMessage(s.k("/sdk/apps/", realtimeSettings.getAppId(), "/appusers/", realtimeSettings.getUserId()), new BayeuxOptionalFields(DefaultSunCoFayeClient.this.getAuthenticationType(realtimeSettings, user.getAuthenticationType()), null, 2, null)));
            return Unit.f26487a;
        }
    }

    public DefaultSunCoFayeClient(@NotNull FayeClient fayeClient, @NotNull ActionDispatcher actionDispatcher, @NotNull b0 b0Var, @NotNull c cVar, @NotNull SunCoFayeInMemoryDataSource sunCoFayeInMemoryDataSource) {
        fayeClient.getClass();
        actionDispatcher.getClass();
        b0Var.getClass();
        cVar.getClass();
        sunCoFayeInMemoryDataSource.getClass();
        this.fayeClient = fayeClient;
        this.actionDispatcher = actionDispatcher;
        this.coroutineScope = b0Var;
        this.json = cVar;
        this.sunCoFayeInMemoryDataSource = sunCoFayeInMemoryDataSource;
        fayeClient.addListener(this);
        this.connectionStatus = r.c(ConnectionStatus.DISCONNECTED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchRealTimeSettings(x70.c<? super zendesk.conversationkit.android.model.RealtimeSettings> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient.C02321
            if (r0 == 0) goto L13
            r0 = r5
            zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$fetchRealTimeSettings$1 r0 = (zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient.C02321) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$fetchRealTimeSettings$1 r0 = new zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$fetchRealTimeSettings$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r5)
            goto L3c
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
        L2c:
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r5)
            zendesk.conversationkit.android.internal.faye.SunCoFayeInMemoryDataSource r5 = r4.sunCoFayeInMemoryDataSource
            r0.label = r3
            java.lang.Object r5 = r5.getUser(r0)
            if (r5 != r1) goto L3c
            return r1
        L3c:
            zendesk.conversationkit.android.model.User r5 = (zendesk.conversationkit.android.model.User) r5
            zendesk.conversationkit.android.model.RealtimeSettings r5 = r5.getRealtimeSettings()
            boolean r0 = r5.getEnabled()
            if (r0 != 0) goto L5b
            java.lang.String r5 = r5.getUserId()
            java.lang.String r0 = "Realtime is not enabled for the user with id "
            java.lang.String r5 = e0.f.k(r0, r5)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "SunCoFayeClient"
            zendesk.logger.Logger.w(r1, r5, r0)
            goto L2c
        L5b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient.fetchRealTimeSettings(x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAuthenticationType(RealtimeSettings realtimeSettings, AuthenticationType authenticationType) {
        c0 c0Var = new c0();
        wd.a.D(c0Var, "appId", realtimeSettings.getAppId());
        wd.a.D(c0Var, "appUserId", realtimeSettings.getUserId());
        if (authenticationType instanceof AuthenticationType.SessionToken) {
            wd.a.D(c0Var, SUBSCRIBE_EXT_FIELD_SESSION_TOKEN, ((AuthenticationType.SessionToken) authenticationType).getValue());
        } else if (authenticationType instanceof AuthenticationType.Jwt) {
            wd.a.D(c0Var, SUBSCRIBE_EXT_FIELD_JWT, ((AuthenticationType.Jwt) authenticationType).getValue());
        } else if (!Intrinsics.areEqual(authenticationType, AuthenticationType.Unauthenticated.INSTANCE)) {
            e40.a.f();
            return null;
        }
        return c0Var.a().toString();
    }

    private final void processActivityEvent(String conversationId, WsActivityEventDto activity, WsConversationDto conversation) {
        f0.B(this.coroutineScope, null, null, new C02361(activity, conversationId, conversation, null), 3);
    }

    private final void processConversationAddedEvent(String conversationId) {
        f0.B(this.coroutineScope, null, null, new C02371(conversationId, null), 3);
    }

    private final void processConversationRemovedEvent(String conversationId) {
        f0.B(this.coroutineScope, null, null, new C02381(conversationId, null), 3);
    }

    private final void processConversationUpdatedEvent(String conversationId, ConversationStatus status, Map<String, ? extends Object> metadata) {
        f0.B(this.coroutineScope, null, null, new C02391(conversationId, status, metadata, null), 3);
    }

    private final void processEvent(n90.b0 event) {
        String string = event.toString();
        try {
            WsFayeMessageDto wsFayeMessageDto = (WsFayeMessageDto) this.json.b(WsFayeMessageDto.INSTANCE.serializer(), string);
            String type = wsFayeMessageDto.getType();
            String id2 = wsFayeMessageDto.getConversation().getId();
            if (Intrinsics.areEqual(type, WsFayeMessageType.MESSAGE.getValue()) && wsFayeMessageDto.getMessage() != null) {
                if (id2 != null) {
                    processMessageEvent(id2, wsFayeMessageDto.getMessage());
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(type, WsFayeMessageType.ACTIVITY.getValue()) && wsFayeMessageDto.getActivity() != null) {
                if (id2 != null) {
                    processActivityEvent(id2, wsFayeMessageDto.getActivity(), wsFayeMessageDto.getConversation());
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(type, WsFayeMessageType.CONVERSATION_ADDED.getValue())) {
                if (id2 != null) {
                    processConversationAddedEvent(id2);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(type, WsFayeMessageType.CONVERSATION_REMOVED.getValue())) {
                if (id2 != null) {
                    processConversationRemovedEvent(id2);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(type, WsFayeMessageType.CONVERSATION_UPDATE.getValue())) {
                if (id2 == null || wsFayeMessageDto.getConversation().getStatus() == null) {
                    return;
                }
                processConversationUpdatedEvent(id2, wsFayeMessageDto.getConversation().getStatus(), wsFayeMessageDto.getConversation().getMetadata());
                return;
            }
            if (!Intrinsics.areEqual(type, WsFayeMessageType.USER_MERGE.getValue())) {
                Logger.w(LOG_TAG, "The message has a type which cannot be processed: " + wsFayeMessageDto, new Object[0]);
                return;
            }
            UserMergeDataDTO userMergeDataDTO = null;
            try {
                n nVar = (n) event.get(Bayeux.KEY_DATA);
                n90.b0 b0VarG = nVar != null ? o.g(nVar) : null;
                if (b0VarG != null) {
                    userMergeDataDTO = (UserMergeDataDTO) this.json.b(UserMergeDataDTO.INSTANCE.serializer(), b0VarG.toString());
                }
            } catch (SerializationException unused) {
            }
            if (userMergeDataDTO != null) {
                processUserMergeEvent(UserMergeKt.toUserMerge(userMergeDataDTO));
            }
        } catch (SerializationException e5) {
            Logger.e(LOG_TAG, "Failed to deserialize: ".concat(string), e5, new Object[0]);
        }
    }

    private final void processMessageEvent(String conversationId, MessageDto message) {
        f0.B(this.coroutineScope, null, null, new C02401(conversationId, message, null), 3);
    }

    private final void processUserMergeEvent(UserMerge userMerge) {
        f0.B(this.coroutineScope, null, null, new C02411(userMerge, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unsubscribe() {
        f0.B(this.coroutineScope, null, null, new C02431(null), 3);
    }

    @Override // zendesk.conversationkit.android.internal.faye.SunCoFayeClient
    @Nullable
    public Object awaitClientConnected(@NotNull x70.c<? super Unit> cVar) {
        if (((a2) this.connectionStatus).getValue() == ConnectionStatus.CONNECTED_REALTIME) {
            return Unit.f26487a;
        }
        final f1 f1Var = this.connectionStatus;
        Object objH = r.h(new j(new y80.i() { // from class: zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$awaitClientConnected$$inlined$filter$1

            /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$awaitClientConnected$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SunCoFayeClient.kt\nzendesk/conversationkit/android/internal/faye/DefaultSunCoFayeClient\n*L\n1#1,49:1\n18#2:50\n19#2:52\n457#3:51\n*E\n"})
            public static final class AnonymousClass2<T> implements y80.j {
                final /* synthetic */ y80.j $this_unsafeFlow;

                /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$awaitClientConnected$$inlined$filter$1$2$1, reason: invalid class name */
                @e(c = "zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$awaitClientConnected$$inlined$filter$1$2", f = "SunCoFayeClient.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class AnonymousClass1 extends z70.c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(x70.c cVar) {
                        super(cVar);
                    }

                    @Override // z70.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(y80.j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // y80.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, x70.c r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$awaitClientConnected$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$awaitClientConnected$$inlined$filter$1$2$1 r0 = (zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$awaitClientConnected$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$awaitClientConnected$$inlined$filter$1$2$1 r0 = new zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$awaitClientConnected$$inlined$filter$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        y70.a r1 = y70.a.COROUTINE_SUSPENDED
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2e
                        if (r2 != r3) goto L27
                        ba0.g.M(r7)
                        goto L43
                    L27:
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        com.braze.h2.b(r6)
                        r6 = 0
                        return r6
                    L2e:
                        ba0.g.M(r7)
                        y80.j r7 = r5.$this_unsafeFlow
                        r2 = r6
                        zendesk.conversationkit.android.ConnectionStatus r2 = (zendesk.conversationkit.android.ConnectionStatus) r2
                        zendesk.conversationkit.android.ConnectionStatus r4 = zendesk.conversationkit.android.ConnectionStatus.CONNECTED_REALTIME
                        if (r2 != r4) goto L43
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L43
                        return r1
                    L43:
                        kotlin.Unit r6 = kotlin.Unit.f26487a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$awaitClientConnected$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, x70.c):java.lang.Object");
                }
            }

            @Override // y80.i
            public Object collect(y80.j jVar, x70.c cVar2) {
                Object objCollect = f1Var.collect(new AnonymousClass2(jVar), cVar2);
                return objCollect == a.COROUTINE_SUSPENDED ? objCollect : Unit.f26487a;
            }
        }, 16), cVar);
        return objH == a.COROUTINE_SUSPENDED ? objH : Unit.f26487a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$awaitFileUploadResult$2$uploadMessageListener$1, zendesk.faye.FayeClientListener] */
    @Override // zendesk.conversationkit.android.internal.faye.SunCoFayeClient
    @Nullable
    public Object awaitFileUploadResult(@NotNull final String str, @NotNull x70.c<? super Message> cVar) {
        final l lVar = new l(1, f.b(cVar));
        lVar.t();
        final ?? r42 = new FayeClientListener() { // from class: zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$awaitFileUploadResult$2$uploadMessageListener$1
            @Override // zendesk.faye.FayeClientListener
            public void onClientError(FayeClientError fayeClientError, Throwable throwable) {
                fayeClientError.getClass();
                Logger.e("SunCoFayeClient", fayeClientError.name(), throwable, new Object[0]);
                this.this$0.fayeClient.removeListener(this);
                SafeResumeWithExceptionKt.safeResumeWithException(lVar, new IllegalStateException("Faye client listener error"));
            }

            @Override // zendesk.faye.FayeClientListener
            public void onDisconnectedFromServer() {
                this.this$0.fayeClient.removeListener(this);
                SafeResumeWithExceptionKt.safeResumeWithException(lVar, new IllegalStateException("Faye disconnected from server"));
            }

            @Override // zendesk.faye.FayeClientListener
            public void onMessagePublished(String channel, String message) {
                channel.getClass();
                message.getClass();
            }

            @Override // zendesk.faye.FayeClientListener
            public void onMessageReceived(String channel, String message) {
                n nVar;
                String string;
                channel.getClass();
                message.getClass();
                try {
                    c cVar2 = this.this$0.json;
                    cVar2.getClass();
                    n nVar2 = (n) o.g((n) cVar2.b(q.f30781a, message)).get("events");
                    String string2 = null;
                    n90.e eVarF = nVar2 != null ? o.f(nVar2) : null;
                    if (eVarF == null || eVarF.f30756a.isEmpty()) {
                        return;
                    }
                    n90.b0 b0VarG = o.g(eVarF.get(0));
                    WsFayeMessageDto wsFayeMessageDto = (WsFayeMessageDto) this.this$0.json.b(WsFayeMessageDto.INSTANCE.serializer(), b0VarG.toString());
                    String type = wsFayeMessageDto.getType();
                    if (Intrinsics.areEqual(type, WsFayeMessageType.MESSAGE.getValue())) {
                        MessageDto message2 = wsFayeMessageDto.getMessage();
                        if (Intrinsics.areEqual(message2 != null ? message2.getId() : null, str)) {
                            this.this$0.fayeClient.removeListener(this);
                            k kVar = lVar;
                            u70.o oVar = u70.q.f40850b;
                            kVar.resumeWith(MessageKt.toMessage$default(wsFayeMessageDto.getMessage(), null, null, 3, null));
                            return;
                        }
                    }
                    if (Intrinsics.areEqual(type, WsFayeMessageType.UPLOAD_FAILED.getValue())) {
                        try {
                            n nVar3 = (n) b0VarG.get(Bayeux.KEY_DATA);
                            if (nVar3 != null && (nVar = (n) o.g(nVar3).get("messageId")) != null && (string = nVar.toString()) != null) {
                                char[] cArr = {'\"'};
                                int length = string.length() - 1;
                                int i11 = 0;
                                boolean z11 = false;
                                while (i11 <= length) {
                                    boolean zS = y.s(cArr, string.charAt(!z11 ? i11 : length));
                                    if (z11) {
                                        if (!zS) {
                                            break;
                                        } else {
                                            length--;
                                        }
                                    } else if (zS) {
                                        i11++;
                                    } else {
                                        z11 = true;
                                    }
                                }
                                string2 = string.subSequence(i11, length + 1).toString();
                            }
                        } catch (SerializationException unused) {
                        }
                        if (Intrinsics.areEqual(string2, str)) {
                            this.this$0.fayeClient.removeListener(this);
                            SafeResumeWithExceptionKt.safeResumeWithException(lVar, new UnsupportedOperationException("Failed to upload file"));
                        }
                    }
                } catch (Exception e5) {
                    Logger.e("SunCoFayeClient", "Unable to processed events for file upload: ".concat(message), e5, new Object[0]);
                    this.this$0.fayeClient.removeListener(this);
                    SafeResumeWithExceptionKt.safeResumeWithException(lVar, e5);
                }
            }

            @Override // zendesk.faye.FayeClientListener
            public void onSubscribedToChannel(String channel) {
                channel.getClass();
            }

            @Override // zendesk.faye.FayeClientListener
            public void onUnsubscribedFromChannel(String channel) {
                channel.getClass();
                this.this$0.fayeClient.removeListener(this);
                SafeResumeWithExceptionKt.safeResumeWithException(lVar, new IllegalStateException("Faye client unsubscribed from channel"));
            }

            @Override // zendesk.faye.FayeClientListener
            public void onConnectedToServer() {
            }
        };
        this.fayeClient.addListener(r42);
        lVar.v(new Function1<Throwable, Unit>() { // from class: zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient$awaitFileUploadResult$2$1
            public final void invoke(Throwable th2) {
                this.this$0.fayeClient.removeListener(r42);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.f26487a;
            }
        });
        Object objS = lVar.s();
        a aVar = a.COROUTINE_SUSPENDED;
        return objS;
    }

    @Override // zendesk.conversationkit.android.internal.faye.SunCoFayeClient
    public void connect() {
        f0.B(this.coroutineScope, null, null, new AnonymousClass1(null), 3);
    }

    @Override // zendesk.conversationkit.android.internal.faye.SunCoFayeClient
    @NotNull
    public ConnectionStatus connectionStatus() {
        return (ConnectionStatus) ((a2) this.connectionStatus).getValue();
    }

    @Override // zendesk.conversationkit.android.internal.faye.SunCoFayeClient
    public void disconnect() {
        this.fayeClient.send(new DisconnectMessage(null, 1, null));
    }

    @Override // zendesk.conversationkit.android.internal.faye.SunCoFayeClient
    public void invalidate() {
        disconnect();
        this.fayeClient.removeListener(this);
    }

    @Override // zendesk.faye.FayeClientListener
    public void onClientError(@NotNull FayeClientError fayeClientError, @Nullable Throwable throwable) {
        fayeClientError.getClass();
        f0.B(this.coroutineScope, null, null, new C02331(fayeClientError, throwable, this, null), 3);
    }

    @Override // zendesk.faye.FayeClientListener
    public void onConnectedToServer() {
        subscribe();
    }

    @Override // zendesk.faye.FayeClientListener
    public void onDisconnectedFromServer() {
        a2 a2Var;
        Object value;
        f1 f1Var = this.connectionStatus;
        do {
            a2Var = (a2) f1Var;
            value = a2Var.getValue();
        } while (!a2Var.g(value, ConnectionStatus.DISCONNECTED));
        f0.B(this.coroutineScope, null, null, new AnonymousClass2(null), 3);
    }

    @Override // zendesk.faye.FayeClientListener
    public void onMessagePublished(@NotNull String channel, @NotNull String message) {
        channel.getClass();
        message.getClass();
    }

    @Override // zendesk.faye.FayeClientListener
    public void onMessageReceived(@NotNull String channel, @NotNull String message) {
        channel.getClass();
        message.getClass();
        try {
            c cVar = this.json;
            cVar.getClass();
            n nVar = (n) o.g((n) cVar.b(q.f30781a, message)).get(JSON_EVENTS);
            n90.e eVarF = nVar != null ? o.f(nVar) : null;
            if (eVarF != null) {
                Iterator it = eVarF.f30756a.iterator();
                while (it.hasNext()) {
                    try {
                        processEvent(o.g((n) it.next()));
                    } catch (Exception e5) {
                        Logger.e(LOG_TAG, "Unable to processed events: " + eVarF, e5, new Object[0]);
                    }
                }
            }
        } catch (Exception e11) {
            Logger.e(LOG_TAG, "Unable to processed message: ".concat(message), e11, new Object[0]);
        }
    }

    @Override // zendesk.faye.FayeClientListener
    public void onSubscribedToChannel(@NotNull String channel) {
        channel.getClass();
        f0.B(this.coroutineScope, null, null, new C02341(null), 3);
    }

    @Override // zendesk.faye.FayeClientListener
    public void onUnsubscribedFromChannel(@NotNull String channel) {
        channel.getClass();
        f0.B(this.coroutineScope, null, null, new C02351(null), 3);
    }

    @Override // zendesk.conversationkit.android.internal.faye.SunCoFayeClient
    public void subscribe() {
        f0.B(this.coroutineScope, null, null, new C02421(null), 3);
    }
}
