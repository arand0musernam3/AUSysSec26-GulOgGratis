package zendesk.messaging.android.internal.conversationscreen.waittimebanner;

import at.o;
import ba0.g;
import com.braze.h2;
import com.google.android.gms.internal.measurement.cg;
import e0.f;
import i80.n;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.HttpException;
import v80.b0;
import v80.f0;
import x70.c;
import x80.m;
import y70.a;
import y80.a2;
import y80.f1;
import y80.i;
import y80.j;
import y80.r;
import y80.u;
import y80.w;
import z70.e;
import zendesk.conversationkit.android.ConnectionStatus;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.conversationkit.android.ConversationKitEvent;
import zendesk.conversationkit.android.ConversationKitEventListener;
import zendesk.conversationkit.android.internal.faye.WsResponseTimeDto;
import zendesk.conversationkit.android.model.ActivityData;
import zendesk.conversationkit.android.model.ActivityEvent;
import zendesk.conversationkit.android.model.ConfigKt;
import zendesk.conversationkit.android.model.ConversationRoutingStatus;
import zendesk.conversationkit.android.model.RestRetryPolicy;
import zendesk.conversationkit.android.model.WaitTimeConfig;
import zendesk.conversationkit.android.model.WaitTimeConfigKt;
import zendesk.logger.Logger;
import zendesk.messaging.android.internal.conversationscreen.ConversationScreenEvent;
import zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerAnalyticsEvent;
import zendesk.ui.android.conversation.waittimebanner.ResponseTime;
import zendesk.ui.android.conversation.waittimebanner.WaitTimeBannerType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 R2\u00020\u0001:\u0001RB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0010J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010\u0010J!\u0010#\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b%\u0010&J7\u0010.\u001a\u00020-2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010)\u001a\u0004\u0018\u00010'2\b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010,\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b.\u0010/J'\u00102\u001a\u000201*\u0002002\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010)\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b2\u00103J'\u00104\u001a\u000201*\u0002002\b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010,\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u000201H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u000201H\u0002¢\u0006\u0004\b8\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010;R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020-0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020-0\u00118\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010\u0013R\u0016\u0010B\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010DR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020F0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020F0\u00118\u0006¢\u0006\f\n\u0004\bI\u0010@\u001a\u0004\bJ\u0010\u0013R\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020K0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010HR\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020K0\u00118\u0006¢\u0006\f\n\u0004\bM\u0010@\u001a\u0004\bN\u0010\u0013R\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006S"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/waittimebanner/WaitTimeBannerService;", "", "Lzendesk/conversationkit/android/ConversationKit;", "conversationKit", "Lv80/b0;", "coroutineScope", "Lzendesk/messaging/android/internal/conversationscreen/waittimebanner/ExponentialBackoffFullJitter;", "exponentialBackoffFullJitter", "<init>", "(Lzendesk/conversationkit/android/ConversationKit;Lv80/b0;Lzendesk/messaging/android/internal/conversationscreen/waittimebanner/ExponentialBackoffFullJitter;)V", "", "conversationId", "", "subscribe", "(Ljava/lang/String;)V", "unsubscribe", "()V", "Ly80/i;", "pollingWithRetries", "()Ly80/i;", "checkPollingStatus", "Lzendesk/conversationkit/android/ConversationKitEvent$ActivityEventReceived;", "event", "processActivityEventReceivedEvent", "(Lzendesk/conversationkit/android/ConversationKitEvent$ActivityEventReceived;)V", "Lzendesk/conversationkit/android/ConversationKitEvent$ConversationUpdated;", "processConversationUpdatedEvent", "(Lzendesk/conversationkit/android/ConversationKitEvent$ConversationUpdated;)V", "Lzendesk/conversationkit/android/ConversationKitEvent$ConnectionStatusChanged;", "processConnectionStatusChangedEvent", "(Lzendesk/conversationkit/android/ConversationKitEvent$ConnectionStatusChanged;)V", "processUserAccessRevokedEvent", "activityEventReceived", "Lzendesk/conversationkit/android/model/ActivityData;", "activityData", "handleWaitTimeExpectationEvent", "(Lzendesk/conversationkit/android/ConversationKitEvent$ActivityEventReceived;Lzendesk/conversationkit/android/model/ActivityData;)V", "getWaitTimeForConversation", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "", "lowerResponseTime", "upperResponseTime", "", "queuePosition", "lowestQueuePosition", "Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerType;", "processBannerStateUpdate", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerType;", "Lzendesk/conversationkit/android/model/WaitTimeConfig;", "", "shouldDisplayResponseTime", "(Lzendesk/conversationkit/android/model/WaitTimeConfig;Ljava/lang/Long;Ljava/lang/Long;)Z", "shouldDisplayQueuePosition", "(Lzendesk/conversationkit/android/model/WaitTimeConfig;Ljava/lang/Integer;Ljava/lang/Integer;)Z", "isBannerStateQueued", "()Z", "isWaitTimeBannerEnabled", "Lzendesk/conversationkit/android/ConversationKit;", "Lv80/b0;", "Lzendesk/messaging/android/internal/conversationscreen/waittimebanner/ExponentialBackoffFullJitter;", "Ly80/f1;", "_waitTimeBannerType", "Ly80/f1;", "waitTimeBannerState", "Ly80/i;", "getWaitTimeBannerState", "retries", "I", "Ljava/lang/String;", "Lx80/m;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenEvent;", "_eventsChannel", "Lx80/m;", "eventsChannel", "getEventsChannel", "Lzendesk/messaging/android/internal/conversationscreen/waittimebanner/WaitTimeBannerAnalyticsEvent;", "_analyticsChannelEvents", "analyticsChannelEvents", "getAnalyticsChannelEvents", "Lzendesk/conversationkit/android/ConversationKitEventListener;", "listener", "Lzendesk/conversationkit/android/ConversationKitEventListener;", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWaitTimeBannerService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WaitTimeBannerService.kt\nzendesk/messaging/android/internal/conversationscreen/waittimebanner/WaitTimeBannerService\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,460:1\n230#2,5:461\n230#2,5:466\n230#2,5:471\n230#2,5:476\n230#2,5:481\n230#2,5:486\n230#2,5:491\n230#2,5:496\n*S KotlinDebug\n*F\n+ 1 WaitTimeBannerService.kt\nzendesk/messaging/android/internal/conversationscreen/waittimebanner/WaitTimeBannerService\n*L\n139#1:461,5\n142#1:466,5\n170#1:471,5\n197#1:476,5\n219#1:481,5\n242#1:486,5\n248#1:491,5\n329#1:496,5\n*E\n"})
public final class WaitTimeBannerService {

    @NotNull
    private static final String LOG_TAG = "WaitTimeBannerService";
    private static final int MINIMUM_QUEUE_POSITION = 1;
    private static final int TOO_MANY_REQUEST_HTTP_CODE = 429;

    @NotNull
    private final m _analyticsChannelEvents;

    @NotNull
    private final m _eventsChannel;

    @NotNull
    private final f1 _waitTimeBannerType;

    @NotNull
    private final i analyticsChannelEvents;

    @Nullable
    private String conversationId;

    @NotNull
    private final ConversationKit conversationKit;

    @NotNull
    private final b0 coroutineScope;

    @NotNull
    private final i eventsChannel;

    @NotNull
    private final ExponentialBackoffFullJitter exponentialBackoffFullJitter;

    @NotNull
    private final ConversationKitEventListener listener;
    private int retries;

    @NotNull
    private final i waitTimeBannerState;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ConversationRoutingStatus.values().length];
            try {
                iArr[ConversationRoutingStatus.QUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConversationRoutingStatus.ASSIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConversationRoutingStatus.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ActivityData.values().length];
            try {
                iArr2[ActivityData.CONVERSATION_ROUTING_QUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ActivityData.CONVERSATION_ROUTING_ASSIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ActivityData.CONVERSATION_ROUTING_CLEARED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService$checkPollingStatus$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService$checkPollingStatus$1", f = "WaitTimeBannerService.kt", l = {435}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass1 extends z70.i implements Function2<b0, c<? super Unit>, Object> {
        int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return WaitTimeBannerService.this.new AnonymousClass1(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                m mVar = WaitTimeBannerService.this._eventsChannel;
                ConversationScreenEvent.StartPolling startPolling = ConversationScreenEvent.StartPolling.INSTANCE;
                this.label = 1;
                if (mVar.f(startPolling, this) == aVar) {
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService$checkPollingStatus$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService$checkPollingStatus$2", f = "WaitTimeBannerService.kt", l = {437}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass2 extends z70.i implements Function2<b0, c<? super Unit>, Object> {
        int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return WaitTimeBannerService.this.new AnonymousClass2(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                m mVar = WaitTimeBannerService.this._eventsChannel;
                ConversationScreenEvent.StopPolling stopPolling = ConversationScreenEvent.StopPolling.INSTANCE;
                this.label = 1;
                if (mVar.f(stopPolling, this) == aVar) {
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService$getWaitTimeForConversation$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService", f = "WaitTimeBannerService.kt", l = {325}, m = "getWaitTimeForConversation")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C04381 extends z70.c {
        int label;
        /* synthetic */ Object result;

        public C04381(c<? super C04381> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WaitTimeBannerService.this.getWaitTimeForConversation(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService$handleWaitTimeExpectationEvent$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService$handleWaitTimeExpectationEvent$2", f = "WaitTimeBannerService.kt", l = {229}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04392 extends z70.i implements Function2<b0, c<? super Unit>, Object> {
        int label;

        public C04392(c<? super C04392> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return WaitTimeBannerService.this.new C04392(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((C04392) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                m mVar = WaitTimeBannerService.this._analyticsChannelEvents;
                WaitTimeBannerAnalyticsEvent.TrackAgentQueued trackAgentQueued = WaitTimeBannerAnalyticsEvent.TrackAgentQueued.INSTANCE;
                this.label = 1;
                if (mVar.f(trackAgentQueued, this) == aVar) {
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService$handleWaitTimeExpectationEvent$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService$handleWaitTimeExpectationEvent$3", f = "WaitTimeBannerService.kt", l = {237}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass3 extends z70.i implements Function2<b0, c<? super Unit>, Object> {
        int label;

        public AnonymousClass3(c<? super AnonymousClass3> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return WaitTimeBannerService.this.new AnonymousClass3(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((AnonymousClass3) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                m mVar = WaitTimeBannerService.this._analyticsChannelEvents;
                WaitTimeBannerAnalyticsEvent.TrackAgentAssigned trackAgentAssigned = WaitTimeBannerAnalyticsEvent.TrackAgentAssigned.INSTANCE;
                this.label = 1;
                if (mVar.f(trackAgentAssigned, this) == aVar) {
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService$pollingWithRetries$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService$pollingWithRetries$1", f = "WaitTimeBannerService.kt", l = {274, 275}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly80/j;", "", "<anonymous>", "(Ly80/j;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04401 extends z70.i implements Function2<j, c<? super Unit>, Object> {
        int label;

        public C04401(c<? super C04401> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return WaitTimeBannerService.this.new C04401(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(j jVar, c<? super Unit> cVar) {
            return ((C04401) create(jVar, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005d -> B:15:0x0029). Please report as a decompilation issue!!! */
        @Override // z70.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                y70.a r0 = y70.a.COROUTINE_SUSPENDED
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto L10
                ba0.g.M(r7)
                goto L29
            L10:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r7)
            L15:
                r7 = 0
                return r7
            L17:
                ba0.g.M(r7)
                goto L46
            L1b:
                ba0.g.M(r7)
                zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService r7 = zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService.this
                boolean r7 = zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService.access$isWaitTimeBannerEnabled(r7)
                if (r7 != 0) goto L29
                kotlin.Unit r7 = kotlin.Unit.f26487a
                return r7
            L29:
                kotlin.coroutines.CoroutineContext r7 = r6.getContext()
                boolean r7 = v80.f0.x(r7)
                if (r7 == 0) goto L66
                zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService r7 = zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService.this
                java.lang.String r7 = zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService.access$getConversationId$p(r7)
                if (r7 == 0) goto L60
                zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService r1 = zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService.this
                r6.label = r3
                java.lang.Object r7 = zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService.access$getWaitTimeForConversation(r1, r7, r6)
                if (r7 != r0) goto L46
                goto L5f
            L46:
                zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService r7 = zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService.this
                zendesk.messaging.android.internal.conversationscreen.waittimebanner.ExponentialBackoffFullJitter r7 = zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService.access$getExponentialBackoffFullJitter$p(r7)
                zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService r1 = zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService.this
                int r1 = zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService.access$getRetries$p(r1)
                int r1 = r1 + r3
                long r4 = r7.getBackoffTime(r1)
                r6.label = r2
                java.lang.Object r7 = v80.f0.o(r4, r6)
                if (r7 != r0) goto L29
            L5f:
                return r0
            L60:
                java.lang.String r7 = "Conversation ID is null"
                com.braze.h2.b(r7)
                goto L15
            L66:
                kotlin.Unit r7 = kotlin.Unit.f26487a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService.C04401.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService$pollingWithRetries$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService$pollingWithRetries$3", f = "WaitTimeBannerService.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly80/j;", "", "<anonymous>", "(Ly80/j;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04423 extends z70.i implements Function2<j, c<? super Unit>, Object> {
        int label;

        public C04423(c<? super C04423> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return WaitTimeBannerService.this.new C04423(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(j jVar, c<? super Unit> cVar) {
            return ((C04423) create(jVar, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            Logger.i(WaitTimeBannerService.LOG_TAG, f.k("Polling started for conversation ID: ", WaitTimeBannerService.this.conversationId), new Object[0]);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService$pollingWithRetries$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService$pollingWithRetries$4", f = "WaitTimeBannerService.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly80/j;", "", "", "it", "<anonymous>", "(Ly80/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass4 extends z70.i implements n {
        int label;

        public AnonymousClass4(c<? super AnonymousClass4> cVar) {
            super(3, cVar);
        }

        @Override // i80.n
        public final Object invoke(j jVar, Throwable th2, c<? super Unit> cVar) {
            return WaitTimeBannerService.this.new AnonymousClass4(cVar).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            Logger.i(WaitTimeBannerService.LOG_TAG, f.k("Polling stopped for conversation ID: ", WaitTimeBannerService.this.conversationId), new Object[0]);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService$processConnectionStatusChangedEvent$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService$processConnectionStatusChangedEvent$1", f = "WaitTimeBannerService.kt", l = {157}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04431 extends z70.i implements Function2<b0, c<? super Unit>, Object> {
        int label;

        public C04431(c<? super C04431> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return WaitTimeBannerService.this.new C04431(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((C04431) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                m mVar = WaitTimeBannerService.this._eventsChannel;
                ConversationScreenEvent.StopPolling stopPolling = ConversationScreenEvent.StopPolling.INSTANCE;
                this.label = 1;
                if (mVar.f(stopPolling, this) == aVar) {
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService$processConversationUpdatedEvent$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService$processConversationUpdatedEvent$1", f = "WaitTimeBannerService.kt", l = {133}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04441 extends z70.i implements Function2<b0, c<? super Unit>, Object> {
        int label;

        public C04441(c<? super C04441> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return WaitTimeBannerService.this.new C04441(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((C04441) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                m mVar = WaitTimeBannerService.this._eventsChannel;
                ConversationScreenEvent.StartPolling startPolling = ConversationScreenEvent.StartPolling.INSTANCE;
                this.label = 1;
                if (mVar.f(startPolling, this) == aVar) {
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

    public WaitTimeBannerService(@NotNull ConversationKit conversationKit, @NotNull b0 b0Var, @NotNull ExponentialBackoffFullJitter exponentialBackoffFullJitter) {
        conversationKit.getClass();
        b0Var.getClass();
        exponentialBackoffFullJitter.getClass();
        this.conversationKit = conversationKit;
        this.coroutineScope = b0Var;
        this.exponentialBackoffFullJitter = exponentialBackoffFullJitter;
        a2 a2VarC = r.c(WaitTimeBannerType.Cleared.INSTANCE);
        this._waitTimeBannerType = a2VarC;
        this.waitTimeBannerState = new w(a2VarC, new WaitTimeBannerService$waitTimeBannerState$1(this, null), 5);
        x80.i iVarA = cg.a(0, null, null, 7);
        this._eventsChannel = iVarA;
        this.eventsChannel = r.w(iVarA);
        x80.i iVarA2 = cg.a(0, null, null, 7);
        this._analyticsChannelEvents = iVarA2;
        this.analyticsChannelEvents = r.w(iVarA2);
        this.listener = new ib0.a(this, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getWaitTimeForConversation(java.lang.String r8, x70.c<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService.C04381
            if (r0 == 0) goto L13
            r0 = r9
            zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService$getWaitTimeForConversation$1 r0 = (zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService.C04381) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService$getWaitTimeForConversation$1 r0 = new zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService$getWaitTimeForConversation$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r9)
            goto L3c
        L27:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
        L2c:
            r8 = 0
            return r8
        L2e:
            ba0.g.M(r9)
            zendesk.conversationkit.android.ConversationKit r9 = r7.conversationKit
            r0.label = r3
            java.lang.Object r9 = r9.getWaitTimeForConversation(r8, r0)
            if (r9 != r1) goto L3c
            return r1
        L3c:
            zendesk.conversationkit.android.ConversationKitResult r9 = (zendesk.conversationkit.android.ConversationKitResult) r9
            boolean r8 = r9 instanceof zendesk.conversationkit.android.ConversationKitResult.Failure
            if (r8 != 0) goto Lb5
            boolean r8 = r9 instanceof zendesk.conversationkit.android.ConversationKitResult.Success
            if (r8 == 0) goto Lb0
            y80.f1 r8 = r7._waitTimeBannerType
        L48:
            r0 = r8
            y80.a2 r0 = (y80.a2) r0
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            zendesk.ui.android.conversation.waittimebanner.WaitTimeBannerType r2 = (zendesk.ui.android.conversation.waittimebanner.WaitTimeBannerType) r2
            r2 = r9
            zendesk.conversationkit.android.ConversationKitResult$Success r2 = (zendesk.conversationkit.android.ConversationKitResult.Success) r2
            java.lang.Object r3 = r2.getValue()
            zendesk.conversationkit.android.model.WaitTimeData r3 = (zendesk.conversationkit.android.model.WaitTimeData) r3
            zendesk.conversationkit.android.model.ResponseTimeDto r3 = r3.getResponseTimeDto()
            r4 = 0
            if (r3 == 0) goto L6d
            int r3 = r3.getLower()
            long r5 = (long) r3
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r5)
            goto L6e
        L6d:
            r3 = r4
        L6e:
            java.lang.Object r5 = r2.getValue()
            zendesk.conversationkit.android.model.WaitTimeData r5 = (zendesk.conversationkit.android.model.WaitTimeData) r5
            zendesk.conversationkit.android.model.ResponseTimeDto r5 = r5.getResponseTimeDto()
            if (r5 == 0) goto L85
            int r4 = r5.getUpper()
            long r4 = (long) r4
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
            r4 = r6
        L85:
            java.lang.Object r5 = r2.getValue()
            zendesk.conversationkit.android.model.WaitTimeData r5 = (zendesk.conversationkit.android.model.WaitTimeData) r5
            int r5 = r5.getQueuePosition()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            java.lang.Object r2 = r2.getValue()
            zendesk.conversationkit.android.model.WaitTimeData r2 = (zendesk.conversationkit.android.model.WaitTimeData) r2
            int r2 = r2.getLowestQueuePosition()
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r2)
            zendesk.ui.android.conversation.waittimebanner.WaitTimeBannerType r2 = r7.processBannerStateUpdate(r3, r4, r6, r5)
            boolean r0 = r0.g(r1, r2)
            if (r0 == 0) goto L48
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        Lb0:
            e40.a.f()
            goto L2c
        Lb5:
            zendesk.conversationkit.android.ConversationKitResult$Failure r9 = (zendesk.conversationkit.android.ConversationKitResult.Failure) r9
            java.lang.Throwable r8 = r9.getCause()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService.getWaitTimeForConversation(java.lang.String, x70.c):java.lang.Object");
    }

    private final void handleWaitTimeExpectationEvent(ConversationKitEvent.ActivityEventReceived activityEventReceived, ActivityData activityData) {
        a2 a2Var;
        Object value;
        Long lValueOf;
        Long lValueOf2;
        Integer numValueOf;
        Long lowestQueuePosition;
        a2 a2Var2;
        Object value2;
        a2 a2Var3;
        Object value3;
        int i11 = activityData == null ? -1 : WhenMappings.$EnumSwitchMapping$1[activityData.ordinal()];
        if (i11 == 1) {
            f1 f1Var = this._waitTimeBannerType;
            do {
                a2Var = (a2) f1Var;
                value = a2Var.getValue();
                ActivityEvent activityEvent = activityEventReceived.getActivityEvent();
                WsResponseTimeDto responseTime = activityEvent.getResponseTime();
                lValueOf = responseTime != null ? Long.valueOf(responseTime.getLower()) : null;
                WsResponseTimeDto responseTime2 = activityEvent.getResponseTime();
                lValueOf2 = responseTime2 != null ? Long.valueOf(responseTime2.getUpper()) : null;
                Long queuePosition = activityEvent.getQueuePosition();
                numValueOf = queuePosition != null ? Integer.valueOf((int) queuePosition.longValue()) : null;
                lowestQueuePosition = activityEvent.getLowestQueuePosition();
            } while (!a2Var.g(value, processBannerStateUpdate(lValueOf, lValueOf2, numValueOf, lowestQueuePosition != null ? Integer.valueOf((int) lowestQueuePosition.longValue()) : null)));
            f0.B(this.coroutineScope, null, null, new C04392(null), 3);
            return;
        }
        if (i11 == 2) {
            f0.B(this.coroutineScope, null, null, new AnonymousClass3(null), 3);
            f1 f1Var2 = this._waitTimeBannerType;
            do {
                a2Var2 = (a2) f1Var2;
                value2 = a2Var2.getValue();
            } while (!a2Var2.g(value2, WaitTimeBannerType.Assigned.INSTANCE));
            return;
        }
        if (i11 != 3) {
            return;
        }
        f1 f1Var3 = this._waitTimeBannerType;
        do {
            a2Var3 = (a2) f1Var3;
            value3 = a2Var3.getValue();
        } while (!a2Var3.g(value3, WaitTimeBannerType.Cleared.INSTANCE));
    }

    private final boolean isBannerStateQueued() {
        return ((a2) this._waitTimeBannerType).getValue() instanceof WaitTimeBannerType.Queued;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isWaitTimeBannerEnabled() {
        WaitTimeConfig waitTimeConfig = this.conversationKit.getConfig().getIntegration().getWaitTimeConfig();
        return waitTimeConfig.getWaitTimeEnabled() || waitTimeConfig.getQueuePositionEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void listener$lambda$0(WaitTimeBannerService waitTimeBannerService, ConversationKitEvent conversationKitEvent) {
        conversationKitEvent.getClass();
        if (conversationKitEvent instanceof ConversationKitEvent.ActivityEventReceived) {
            waitTimeBannerService.processActivityEventReceivedEvent((ConversationKitEvent.ActivityEventReceived) conversationKitEvent);
            return;
        }
        if (conversationKitEvent instanceof ConversationKitEvent.ConversationUpdated) {
            waitTimeBannerService.processConversationUpdatedEvent((ConversationKitEvent.ConversationUpdated) conversationKitEvent);
        } else if (conversationKitEvent instanceof ConversationKitEvent.ConnectionStatusChanged) {
            waitTimeBannerService.processConnectionStatusChangedEvent((ConversationKitEvent.ConnectionStatusChanged) conversationKitEvent);
        } else if (conversationKitEvent instanceof ConversationKitEvent.UserAccessRevoked) {
            waitTimeBannerService.processUserAccessRevokedEvent();
        }
    }

    private final void processActivityEventReceivedEvent(ConversationKitEvent.ActivityEventReceived event) {
        if (Intrinsics.areEqual(event.getActivityEvent().getConversationId(), this.conversationId)) {
            handleWaitTimeExpectationEvent(event, event.getActivityEvent().getActivityData());
        }
    }

    private final WaitTimeBannerType processBannerStateUpdate(Long lowerResponseTime, Long upperResponseTime, Integer queuePosition, Integer lowestQueuePosition) {
        int i11;
        int iIntValue;
        WaitTimeConfig waitTimeConfig = this.conversationKit.getConfig().getIntegration().getWaitTimeConfig();
        if (!WaitTimeConfigKt.shouldShowBanner(waitTimeConfig, lowerResponseTime, upperResponseTime, queuePosition, lowestQueuePosition)) {
            return WaitTimeBannerType.Cleared.INSTANCE;
        }
        ResponseTime responseTime = new ResponseTime(lowerResponseTime != null ? lowerResponseTime.longValue() : 0L, upperResponseTime != null ? upperResponseTime.longValue() : 0L);
        boolean zShouldDisplayResponseTime = shouldDisplayResponseTime(waitTimeConfig, lowerResponseTime, upperResponseTime);
        boolean zShouldDisplayQueuePosition = shouldDisplayQueuePosition(waitTimeConfig, queuePosition, lowestQueuePosition);
        int i12 = 1;
        if (queuePosition != null) {
            int iIntValue2 = queuePosition.intValue();
            if (iIntValue2 < 1) {
                iIntValue2 = 1;
            }
            i11 = iIntValue2;
        } else {
            i11 = 1;
        }
        if (lowestQueuePosition != null && (iIntValue = lowestQueuePosition.intValue()) >= 1) {
            i12 = iIntValue;
        }
        return new WaitTimeBannerType.Queued(zShouldDisplayResponseTime, responseTime, zShouldDisplayQueuePosition, i11, i12);
    }

    private final void processConnectionStatusChangedEvent(ConversationKitEvent.ConnectionStatusChanged event) {
        if (event.getConnectionStatus() == ConnectionStatus.DISCONNECTED) {
            f0.B(this.coroutineScope, null, null, new C04431(null), 3);
        } else {
            checkPollingStatus();
        }
    }

    private final void processConversationUpdatedEvent(ConversationKitEvent.ConversationUpdated event) {
        a2 a2Var;
        Object value;
        a2 a2Var2;
        Object value2;
        if (Intrinsics.areEqual(event.getConversation().getId(), this.conversationId)) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[event.getConversation().getRoutingStatus().ordinal()];
            if (i11 == 1) {
                if (isBannerStateQueued()) {
                    return;
                }
                f0.B(this.coroutineScope, null, null, new C04441(null), 3);
                return;
            }
            if (i11 == 2) {
                f1 f1Var = this._waitTimeBannerType;
                do {
                    a2Var = (a2) f1Var;
                    value = a2Var.getValue();
                } while (!a2Var.g(value, WaitTimeBannerType.Assigned.INSTANCE));
                return;
            }
            if (i11 != 3) {
                e40.a.f();
                return;
            }
            f1 f1Var2 = this._waitTimeBannerType;
            do {
                a2Var2 = (a2) f1Var2;
                value2 = a2Var2.getValue();
            } while (!a2Var2.g(value2, WaitTimeBannerType.Cleared.INSTANCE));
        }
    }

    private final void processUserAccessRevokedEvent() {
        a2 a2Var;
        Object value;
        f1 f1Var = this._waitTimeBannerType;
        do {
            a2Var = (a2) f1Var;
            value = a2Var.getValue();
        } while (!a2Var.g(value, WaitTimeBannerType.Cleared.INSTANCE));
    }

    private final boolean shouldDisplayQueuePosition(WaitTimeConfig waitTimeConfig, Integer num, Integer num2) {
        return (!waitTimeConfig.getQueuePositionEnabled() || num == null || num2 == null) ? false : true;
    }

    private final boolean shouldDisplayResponseTime(WaitTimeConfig waitTimeConfig, Long l, Long l7) {
        return (!waitTimeConfig.getWaitTimeEnabled() || l == null || l7 == null) ? false : true;
    }

    public final void checkPollingStatus() {
        if (isWaitTimeBannerEnabled()) {
            String str = this.conversationId;
            if (str == null) {
                Logger.e(LOG_TAG, "Conversation ID should not be null", new Object[0]);
            }
            boolean zShouldContinuePoll = WaitTimeConfigKt.shouldContinuePoll(this.conversationKit.getConfig().getIntegration().getWaitTimeConfig());
            if (isBannerStateQueued() && str != null && zShouldContinuePoll) {
                f0.B(this.coroutineScope, null, null, new AnonymousClass1(null), 3);
            } else {
                f0.B(this.coroutineScope, null, null, new AnonymousClass2(null), 3);
            }
        }
    }

    @NotNull
    public final i getAnalyticsChannelEvents() {
        return this.analyticsChannelEvents;
    }

    @NotNull
    public final i getEventsChannel() {
        return this.eventsChannel;
    }

    @NotNull
    public final i getWaitTimeBannerState() {
        return this.waitTimeBannerState;
    }

    @NotNull
    public final i pollingWithRetries() {
        return new u(new w(new C04423(null), new w(new o(new C04401(null)), new C04412(null))), new AnonymousClass4(null));
    }

    public final void subscribe(@NotNull String conversationId) {
        conversationId.getClass();
        if (isWaitTimeBannerEnabled()) {
            this.conversationId = conversationId;
            this.conversationKit.addEventListener(this.listener);
        }
    }

    public final void unsubscribe() {
        a2 a2Var;
        Object value;
        if (isWaitTimeBannerEnabled()) {
            this.conversationId = null;
            this.retries = 0;
            f1 f1Var = this._waitTimeBannerType;
            do {
                a2Var = (a2) f1Var;
                value = a2Var.getValue();
            } while (!a2Var.g(value, WaitTimeBannerType.Cleared.INSTANCE));
            this.conversationKit.removeEventListener(this.listener);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService$pollingWithRetries$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationscreen.waittimebanner.WaitTimeBannerService$pollingWithRetries$2", f = "WaitTimeBannerService.kt", l = {296}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly80/j;", "", "", "cause", "", "<unused var>", "", "<anonymous>", "(Ly80/j;Ljava/lang/Throwable;J)Z"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nWaitTimeBannerService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WaitTimeBannerService.kt\nzendesk/messaging/android/internal/conversationscreen/waittimebanner/WaitTimeBannerService$pollingWithRetries$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,460:1\n230#2,5:461\n*S KotlinDebug\n*F\n+ 1 WaitTimeBannerService.kt\nzendesk/messaging/android/internal/conversationscreen/waittimebanner/WaitTimeBannerService$pollingWithRetries$2\n*L\n302#1:461,5\n*E\n"})
    public static final class C04412 extends z70.i implements i80.o {
        /* synthetic */ Object L$0;
        int label;

        public C04412(c<? super C04412> cVar) {
            super(4, cVar);
        }

        @Override // i80.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((j) obj, (Throwable) obj2, ((Number) obj3).longValue(), (c<? super Boolean>) obj4);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a2 a2Var;
            Object value;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                Throwable th2 = (Throwable) this.L$0;
                Logger.i(WaitTimeBannerService.LOG_TAG, f.k("Polling failed for conversation ID: ", WaitTimeBannerService.this.conversationId), th2, new Object[0]);
                if (th2 instanceof HttpException) {
                    RestRetryPolicy restRetryPolicy = WaitTimeBannerService.this.conversationKit.getConfig().getRestRetryPolicy();
                    int i12 = ((HttpException) th2).f37956a;
                    if ((i12 == WaitTimeBannerService.TOO_MANY_REQUEST_HTTP_CODE || i12 == 500) && WaitTimeBannerService.this.retries < restRetryPolicy.getMaxRetries()) {
                        long jExponentialBackoffInterval = ConfigKt.exponentialBackoffInterval(WaitTimeBannerService.this.conversationKit.getConfig(), WaitTimeBannerService.this.retries);
                        Logger.i(WaitTimeBannerService.LOG_TAG, s.d("Retrying in " + jExponentialBackoffInterval + " seconds for\n                                |conversation ID: " + WaitTimeBannerService.this.conversationId + ", retry: " + WaitTimeBannerService.this.retries), new Object[0]);
                        long millis = TimeUnit.SECONDS.toMillis(jExponentialBackoffInterval);
                        this.label = 1;
                        if (f0.o(millis, this) == aVar) {
                            return aVar;
                        }
                    }
                }
                f1 f1Var = WaitTimeBannerService.this._waitTimeBannerType;
                do {
                    a2Var = (a2) f1Var;
                    value = a2Var.getValue();
                } while (!a2Var.g(value, WaitTimeBannerType.Cleared.INSTANCE));
                return Boolean.FALSE;
            }
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            WaitTimeBannerService.this.retries++;
            return Boolean.TRUE;
        }

        public final Object invoke(j jVar, Throwable th2, long j9, c<? super Boolean> cVar) {
            C04412 c04412 = WaitTimeBannerService.this.new C04412(cVar);
            c04412.L$0 = th2;
            return c04412.invokeSuspend(Unit.f26487a);
        }
    }
}
