package zendesk.messaging.android.internal.messagingscreen;

import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import androidx.lifecycle.o0;
import ba0.g;
import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import x70.c;
import y80.a2;
import y80.f1;
import y80.h1;
import y80.r;
import y80.y1;
import z70.e;
import z70.i;
import zendesk.android.messaging.MessagingScreen;
import zendesk.messaging.android.internal.MessagingEntryPointHandler;
import zendesk.messaging.android.internal.SavedStateHandleDelegate;
import zendesk.messaging.android.internal.analytics.AnalyticsEventType;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;
import zendesk.messaging.android.internal.events.MessagingEventDispatcher;
import zendesk.messaging.android.internal.extension.MessagingFragmentScreenKtxKt;
import zendesk.messaging.android.internal.messagingscreen.MessagingFragmentScreen;
import zendesk.messaging.android.internal.messagingscreen.MessagingScreenAction;
import zendesk.messaging.android.internal.messagingscreen.MessagingScreenState;
import zendesk.messaging.android.push.internal.NotificationBuilder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 I2\u00020\u0001:\u0001IB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001e\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0010H\u0002¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0010H\u0002¢\u0006\u0004\b(\u0010%J\u000f\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020)H\u0002¢\u0006\u0004\b,\u0010+J\u0015\u0010/\u001a\u00020\u00102\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00103R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00104R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00105R/\u0010\u000f\u001a\u00020\u000e*\u00020\u00062\u0006\u00106\u001a\u00020\u000e8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001c0=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001e\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010?R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00040A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00040D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenViewModel;", "Landroidx/lifecycle/l1;", "Lzendesk/messaging/android/internal/MessagingEntryPointHandler;", "messagingEntryPointHandler", "Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenState;", "initialState", "Landroidx/lifecycle/c1;", "stateHandle", "Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;", "analyticsProcessor", "Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "messagingEventDispatcher", "<init>", "(Lzendesk/messaging/android/internal/MessagingEntryPointHandler;Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenState;Landroidx/lifecycle/c1;Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;)V", "Lzendesk/android/messaging/MessagingScreen;", "messagingScreen", "", "resolveEntryScreen", "(Lzendesk/android/messaging/MessagingScreen;)V", "", "messagingFragmentScreen", "sendMessagingScreenInternalAnalytics", "(Lzendesk/android/messaging/MessagingScreen;Ljava/lang/String;)V", "Lzendesk/android/messaging/MessagingScreen$ExitAction;", "messagingScreenExitAction", "getMessagingScreenExitActionAnalyticValue", "(Lzendesk/android/messaging/MessagingScreen$ExitAction;)Ljava/lang/String;", "conversationId", "", "proactiveId", "loadConversationScreen", "(Ljava/lang/String;Ljava/lang/Integer;)V", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType;", "eventType", "sendInternalAnalyticsEvent", "(Lzendesk/messaging/android/internal/analytics/AnalyticsEventType;)V", "sendProactiveMessageClickedEvent", "()V", "sendNotificationOpenedEvent", "(Ljava/lang/String;)V", "sendMessagingOpenedEvent", "", "isPushNotification", "()Z", "isProactiveNotification", "Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenAction;", "action", "process", "(Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenAction;)V", "Lzendesk/messaging/android/internal/MessagingEntryPointHandler;", "Landroidx/lifecycle/c1;", "Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;", "Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "Ljava/lang/String;", "<set-?>", "messagingScreen$delegate", "Lzendesk/messaging/android/internal/SavedStateHandleDelegate$MessagingScreenDelegate;", "getMessagingScreen$zendesk_messaging_messaging_android", "(Landroidx/lifecycle/c1;)Lzendesk/android/messaging/MessagingScreen;", "setMessagingScreen$zendesk_messaging_messaging_android", "(Landroidx/lifecycle/c1;Lzendesk/android/messaging/MessagingScreen;)V", "Landroidx/lifecycle/o0;", "proactiveNotificationId", "Landroidx/lifecycle/o0;", "proactiveCampaignId", "Ly80/f1;", "_messagingScreenState", "Ly80/f1;", "Ly80/y1;", "messagingScreenState", "Ly80/y1;", "getMessagingScreenState", "()Ly80/y1;", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessagingScreenViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessagingScreenViewModel.kt\nzendesk/messaging/android/internal/messagingscreen/MessagingScreenViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,265:1\n230#2,5:266\n230#2,5:271\n230#2,5:276\n230#2,3:281\n233#2,2:285\n1#3:284\n*S KotlinDebug\n*F\n+ 1 MessagingScreenViewModel.kt\nzendesk/messaging/android/internal/messagingscreen/MessagingScreenViewModel\n*L\n92#1:266,5\n101#1:271,5\n195#1:276,5\n196#1:281,3\n196#1:285,2\n*E\n"})
public final class MessagingScreenViewModel extends l1 {

    @Deprecated
    @NotNull
    public static final String CONVERSATION_LIST_SCREEN_ANALYTICS_NAME = "conversationListScreen";

    @Deprecated
    @NotNull
    public static final String CONVERSATION_SCREEN_ANALYTICS_NAME = "conversationScreen";

    @Deprecated
    @NotNull
    public static final String MESSAGING_SCREEN_CONVERSATION = "conversation";

    @Deprecated
    @NotNull
    public static final String MESSAGING_SCREEN_CONVERSATIONS_LIST = "conversationListScreen";

    @Deprecated
    @NotNull
    public static final String MESSAGING_SCREEN_EXIT_ACTION_CLOSE_ANALYTIC_VALUE = "close";

    @Deprecated
    @NotNull
    public static final String MESSAGING_SCREEN_EXIT_ACTION_CONVERSATION_LIST_ANALYTIC_VALUE = "conversationlist";

    @Deprecated
    @NotNull
    public static final String MESSAGING_SCREEN_EXIT_ACTION_DEFAULT_VALUE = "close";

    @Deprecated
    @NotNull
    public static final String MESSAGING_SCREEN_MOST_RECENT_ACTIVE_CONVERSATION = "mostRecentActiveConversation";

    @Deprecated
    @NotNull
    public static final String MESSAGING_SCREEN_NEW_CONVERSATION = "newConversation";

    @Deprecated
    public static final int PROACTIVE_ID_DEFAULT = -1;

    @NotNull
    private final f1 _messagingScreenState;

    @NotNull
    private final AnalyticsProcessor analyticsProcessor;

    @Nullable
    private String conversationId;

    @NotNull
    private final MessagingEntryPointHandler messagingEntryPointHandler;

    @NotNull
    private final MessagingEventDispatcher messagingEventDispatcher;

    /* JADX INFO: renamed from: messagingScreen$delegate, reason: from kotlin metadata */
    @NotNull
    private final SavedStateHandleDelegate.MessagingScreenDelegate messagingScreen;

    @NotNull
    private final y1 messagingScreenState;

    @NotNull
    private o0 proactiveCampaignId;

    @NotNull
    private o0 proactiveNotificationId;

    @NotNull
    private final c1 stateHandle;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty2(new MutablePropertyReference2Impl(MessagingScreenViewModel.class, "messagingScreen", "getMessagingScreen$zendesk_messaging_messaging_android(Landroidx/lifecycle/SavedStateHandle;)Lzendesk/android/messaging/MessagingScreen;", 0))};

    @NotNull
    private static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessagingScreen.ExitAction.values().length];
            try {
                iArr[MessagingScreen.ExitAction.Close.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessagingScreen.ExitAction.ReturnToConversationList.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.messagingscreen.MessagingScreenViewModel$resolveEntryScreen$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.messagingscreen.MessagingScreenViewModel$resolveEntryScreen$2", f = "MessagingScreenViewModel.kt", l = {103}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nMessagingScreenViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessagingScreenViewModel.kt\nzendesk/messaging/android/internal/messagingscreen/MessagingScreenViewModel$resolveEntryScreen$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,265:1\n230#2,5:266\n*S KotlinDebug\n*F\n+ 1 MessagingScreenViewModel.kt\nzendesk/messaging/android/internal/messagingscreen/MessagingScreenViewModel$resolveEntryScreen$2\n*L\n104#1:266,5\n*E\n"})
    public static final class AnonymousClass2 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ MessagingScreen $messagingScreen;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MessagingScreen messagingScreen, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$messagingScreen = messagingScreen;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return MessagingScreenViewModel.this.new AnonymousClass2(this.$messagingScreen, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a2 a2Var;
            Object value;
            Object success;
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                MessagingEntryPointHandler messagingEntryPointHandler = MessagingScreenViewModel.this.messagingEntryPointHandler;
                MessagingScreen messagingScreen = this.$messagingScreen;
                this.label = 1;
                obj = messagingEntryPointHandler.resolveEntryPoint(messagingScreen, this);
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
            MessagingFragmentScreen messagingFragmentScreen = (MessagingFragmentScreen) obj;
            f1 f1Var = MessagingScreenViewModel.this._messagingScreenState;
            MessagingScreenViewModel messagingScreenViewModel = MessagingScreenViewModel.this;
            MessagingScreen messagingScreen2 = this.$messagingScreen;
            do {
                a2Var = (a2) f1Var;
                value = a2Var.getValue();
                if (messagingFragmentScreen instanceof MessagingFragmentScreen.FailedResolvedFragmentScreen) {
                    success = new MessagingScreenState.Error(((MessagingFragmentScreen.FailedResolvedFragmentScreen) messagingFragmentScreen).getError());
                } else if (messagingFragmentScreen instanceof MessagingFragmentScreen.ConversationFragmentScreen) {
                    messagingScreenViewModel.sendMessagingScreenInternalAnalytics(messagingScreen2, MessagingScreenViewModel.CONVERSATION_SCREEN_ANALYTICS_NAME);
                    success = new MessagingScreenState.Success(false, messagingFragmentScreen, 1, null);
                } else if (messagingFragmentScreen instanceof MessagingFragmentScreen.ConversationListFragmentScreen) {
                    messagingScreenViewModel.sendMessagingScreenInternalAnalytics(messagingScreen2, "conversationListScreen");
                    success = new MessagingScreenState.Success(false, messagingFragmentScreen, 1, null);
                } else {
                    if (!(messagingFragmentScreen instanceof MessagingFragmentScreen.MainAppScreen)) {
                        e40.a.f();
                        return null;
                    }
                    success = new MessagingScreenState.Success(false, messagingFragmentScreen, 1, null);
                }
            } while (!a2Var.g(value, success));
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.messagingscreen.MessagingScreenViewModel$sendInternalAnalyticsEvent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.messagingscreen.MessagingScreenViewModel$sendInternalAnalyticsEvent$1", f = "MessagingScreenViewModel.kt", l = {214}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass1 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ AnalyticsEventType $eventType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AnalyticsEventType analyticsEventType, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$eventType = analyticsEventType;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return MessagingScreenViewModel.this.new AnonymousClass1(this.$eventType, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                AnalyticsProcessor analyticsProcessor = MessagingScreenViewModel.this.analyticsProcessor;
                AnalyticsEventType analyticsEventType = this.$eventType;
                this.label = 1;
                if (analyticsProcessor.process(analyticsEventType, this) == aVar) {
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.messagingscreen.MessagingScreenViewModel$sendMessagingScreenInternalAnalytics$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.messagingscreen.MessagingScreenViewModel$sendMessagingScreenInternalAnalytics$1", f = "MessagingScreenViewModel.kt", l = {165}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04621 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ String $messagingFragmentScreen;
        final /* synthetic */ String $messagingScreenExitAction;
        final /* synthetic */ String $messagingScreenNavigation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04621(String str, String str2, String str3, c<? super C04621> cVar) {
            super(2, cVar);
            this.$messagingScreenNavigation = str;
            this.$messagingFragmentScreen = str2;
            this.$messagingScreenExitAction = str3;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return MessagingScreenViewModel.this.new C04621(this.$messagingScreenNavigation, this.$messagingFragmentScreen, this.$messagingScreenExitAction, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((C04621) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                AnalyticsProcessor analyticsProcessor = MessagingScreenViewModel.this.analyticsProcessor;
                AnalyticsEventType.ShowMessagingAPI showMessagingAPI = new AnalyticsEventType.ShowMessagingAPI(this.$messagingScreenNavigation, this.$messagingFragmentScreen, this.$messagingScreenExitAction);
                this.label = 1;
                if (analyticsProcessor.process(showMessagingAPI, this) == aVar) {
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

    public MessagingScreenViewModel(@NotNull MessagingEntryPointHandler messagingEntryPointHandler, @NotNull MessagingScreenState messagingScreenState, @NotNull c1 c1Var, @NotNull AnalyticsProcessor analyticsProcessor, @NotNull MessagingEventDispatcher messagingEventDispatcher) {
        messagingEntryPointHandler.getClass();
        messagingScreenState.getClass();
        c1Var.getClass();
        analyticsProcessor.getClass();
        messagingEventDispatcher.getClass();
        this.messagingEntryPointHandler = messagingEntryPointHandler;
        this.stateHandle = c1Var;
        this.analyticsProcessor = analyticsProcessor;
        this.messagingEventDispatcher = messagingEventDispatcher;
        this.conversationId = (String) c1Var.b(MessagingActivity.CONVERSATION_ID_KEY, null, false).d();
        this.messagingScreen = new SavedStateHandleDelegate.MessagingScreenDelegate(MessagingActivity.MESSAGING_SCREEN_KEY, new MessagingScreen.MostRecentActiveConversation((MessagingScreen.ExitAction) null, 1, (DefaultConstructorMarker) null));
        this.proactiveNotificationId = c1Var.b(NotificationBuilder.PROACTIVE_NOTIFICATION_ID, -1, true);
        this.proactiveCampaignId = c1Var.b(NotificationBuilder.PROACTIVE_CAMPAIGN_ID, null, false);
        a2 a2VarC = r.c(messagingScreenState);
        this._messagingScreenState = a2VarC;
        this.messagingScreenState = new h1(a2VarC);
        if (isPushNotification()) {
            sendProactiveMessageClickedEvent();
            sendMessagingOpenedEvent();
            loadConversationScreen(this.conversationId, (Integer) this.proactiveNotificationId.d());
            sendNotificationOpenedEvent(this.conversationId);
        } else {
            resolveEntryScreen(getMessagingScreen$zendesk_messaging_messaging_android(c1Var));
        }
        sendInternalAnalyticsEvent(AnalyticsEventType.MessagingOpened.INSTANCE);
    }

    private final String getMessagingScreenExitActionAnalyticValue(MessagingScreen.ExitAction messagingScreenExitAction) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[messagingScreenExitAction.ordinal()];
        if (i11 == 1) {
            return "close";
        }
        if (i11 == 2) {
            return MESSAGING_SCREEN_EXIT_ACTION_CONVERSATION_LIST_ANALYTIC_VALUE;
        }
        e40.a.f();
        return null;
    }

    private final boolean isProactiveNotification() {
        Integer num = (Integer) this.proactiveNotificationId.d();
        return num == null || num.intValue() != -1;
    }

    private final boolean isPushNotification() {
        Integer num;
        return (this.conversationId == null && (num = (Integer) this.proactiveNotificationId.d()) != null && num.intValue() == -1) ? false : true;
    }

    private final void loadConversationScreen(String conversationId, Integer proactiveId) {
        a2 a2Var;
        Object value;
        f1 f1Var = this._messagingScreenState;
        do {
            a2Var = (a2) f1Var;
            value = a2Var.getValue();
        } while (!a2Var.g(value, MessagingScreenState.Loading.INSTANCE));
        f1 f1Var2 = this._messagingScreenState;
        while (true) {
            a2 a2Var2 = (a2) f1Var2;
            Object value2 = a2Var2.getValue();
            String str = conversationId;
            if (a2Var2.g(value2, new MessagingScreenState.Success(true, new MessagingFragmentScreen.ConversationFragmentScreen(str, (proactiveId != null && proactiveId.intValue() == -1) ? null : proactiveId, null, null, 12, null)))) {
                break;
            } else {
                conversationId = str;
            }
        }
        if (proactiveId != null && proactiveId.intValue() == -1) {
            sendInternalAnalyticsEvent(AnalyticsEventType.AnalyticsEventTypeWithSource.ConversationOpenedNotification.INSTANCE);
        } else {
            sendInternalAnalyticsEvent(AnalyticsEventType.AnalyticsEventTypeWithSource.ConversationOpenedProactiveMessage.INSTANCE);
        }
    }

    private final void resolveEntryScreen(MessagingScreen messagingScreen) {
        a2 a2Var;
        Object value;
        f1 f1Var = this._messagingScreenState;
        do {
            a2Var = (a2) f1Var;
            value = a2Var.getValue();
        } while (!a2Var.g(value, MessagingScreenState.Loading.INSTANCE));
        f0.B(m1.d(this), null, null, new AnonymousClass2(messagingScreen, null), 3);
    }

    private final void sendInternalAnalyticsEvent(AnalyticsEventType eventType) {
        f0.B(m1.d(this), null, null, new AnonymousClass1(eventType, null), 3);
    }

    private final void sendMessagingOpenedEvent() {
        MessagingEventDispatcher.handleMessagingOpenedEvent$zendesk_messaging_messaging_android$default(this.messagingEventDispatcher, null, 0L, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendMessagingScreenInternalAnalytics(MessagingScreen messagingScreen, String messagingFragmentScreen) {
        String str;
        String messagingScreenExitActionAnalyticValue;
        boolean z11 = messagingScreen instanceof MessagingScreen.MostRecentActiveConversation;
        if (z11) {
            str = MESSAGING_SCREEN_MOST_RECENT_ACTIVE_CONVERSATION;
        } else if (messagingScreen instanceof MessagingScreen.ConversationsList) {
            str = "conversationListScreen";
        } else if (messagingScreen instanceof MessagingScreen.Conversation) {
            str = MESSAGING_SCREEN_CONVERSATION;
        } else {
            if (!(messagingScreen instanceof MessagingScreen.NewConversation)) {
                e40.a.f();
                return;
            }
            str = MESSAGING_SCREEN_NEW_CONVERSATION;
        }
        String str2 = str;
        if (z11) {
            messagingScreenExitActionAnalyticValue = getMessagingScreenExitActionAnalyticValue(((MessagingScreen.MostRecentActiveConversation) messagingScreen).getOnExit());
        } else if (messagingScreen instanceof MessagingScreen.ConversationsList) {
            messagingScreenExitActionAnalyticValue = "close";
        } else if (messagingScreen instanceof MessagingScreen.Conversation) {
            messagingScreenExitActionAnalyticValue = getMessagingScreenExitActionAnalyticValue(((MessagingScreen.Conversation) messagingScreen).getOnExit());
        } else {
            if (!(messagingScreen instanceof MessagingScreen.NewConversation)) {
                e40.a.f();
                return;
            }
            messagingScreenExitActionAnalyticValue = getMessagingScreenExitActionAnalyticValue(((MessagingScreen.NewConversation) messagingScreen).getOnExit());
        }
        f0.B(m1.d(this), null, null, new C04621(str2, messagingFragmentScreen, messagingScreenExitActionAnalyticValue, null), 3);
    }

    private final void sendNotificationOpenedEvent(String conversationId) {
        if (conversationId == null || isProactiveNotification()) {
            return;
        }
        MessagingEventDispatcher.handleNotificationOpenedEvent$zendesk_messaging_messaging_android$default(this.messagingEventDispatcher, conversationId, null, 0L, 6, null);
    }

    private final void sendProactiveMessageClickedEvent() {
        Integer num = (Integer) this.proactiveNotificationId.d();
        String str = (String) this.proactiveCampaignId.d();
        if (num == null || str == null || str.length() == 0) {
            return;
        }
        MessagingEventDispatcher.handleProactiveMessageClickedEvent$zendesk_messaging_messaging_android$default(this.messagingEventDispatcher, null, 0L, num.intValue(), str, 3, null);
    }

    @NotNull
    public final MessagingScreen getMessagingScreen$zendesk_messaging_messaging_android(@NotNull c1 c1Var) {
        c1Var.getClass();
        return this.messagingScreen.getValue(c1Var, $$delegatedProperties[0]);
    }

    @NotNull
    public final y1 getMessagingScreenState() {
        return this.messagingScreenState;
    }

    public final void process(@NotNull MessagingScreenAction action) {
        a2 a2Var;
        Object value;
        action.getClass();
        if (action instanceof MessagingScreenAction.ResolveScreen) {
            resolveEntryScreen(getMessagingScreen$zendesk_messaging_messaging_android(this.stateHandle));
            return;
        }
        if (action instanceof MessagingScreenAction.LaunchConversationScreenFromNotification) {
            MessagingScreenAction.LaunchConversationScreenFromNotification launchConversationScreenFromNotification = (MessagingScreenAction.LaunchConversationScreenFromNotification) action;
            this.conversationId = launchConversationScreenFromNotification.getConversationId();
            loadConversationScreen(launchConversationScreenFromNotification.getConversationId(), (Integer) this.proactiveNotificationId.d());
            sendNotificationOpenedEvent(launchConversationScreenFromNotification.getConversationId());
            return;
        }
        if (!Intrinsics.areEqual(action, MessagingScreenAction.NavigationComplete.INSTANCE)) {
            e40.a.f();
            return;
        }
        Object value2 = ((a2) this._messagingScreenState).getValue();
        MessagingScreenState.Success success = value2 instanceof MessagingScreenState.Success ? (MessagingScreenState.Success) value2 : null;
        if (success != null && Intrinsics.areEqual(MessagingFragmentScreenKtxKt.getTagName(success.getScreen()), "ConversationFragment") && !success.isPushNotification()) {
            sendInternalAnalyticsEvent(AnalyticsEventType.AnalyticsEventTypeWithSource.ConversationOpenedLauncher.INSTANCE);
        }
        f1 f1Var = this._messagingScreenState;
        do {
            a2Var = (a2) f1Var;
            value = a2Var.getValue();
        } while (!a2Var.g(value, MessagingScreenState.Idle.INSTANCE));
        this.stateHandle.d(-1, NotificationBuilder.PROACTIVE_NOTIFICATION_ID);
        this.stateHandle.d(null, NotificationBuilder.PROACTIVE_CAMPAIGN_ID);
    }

    public final void setMessagingScreen$zendesk_messaging_messaging_android(@NotNull c1 c1Var, @NotNull MessagingScreen messagingScreen) {
        c1Var.getClass();
        messagingScreen.getClass();
        this.messagingScreen.setValue(c1Var, $$delegatedProperties[0], messagingScreen);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenViewModel$Companion;", "", "<init>", "()V", "PROACTIVE_ID_DEFAULT", "", "MESSAGING_SCREEN_MOST_RECENT_ACTIVE_CONVERSATION", "", "MESSAGING_SCREEN_CONVERSATIONS_LIST", "MESSAGING_SCREEN_CONVERSATION", "MESSAGING_SCREEN_NEW_CONVERSATION", "CONVERSATION_SCREEN_ANALYTICS_NAME", "CONVERSATION_LIST_SCREEN_ANALYTICS_NAME", "MESSAGING_SCREEN_EXIT_ACTION_DEFAULT_VALUE", "MESSAGING_SCREEN_EXIT_ACTION_CLOSE_ANALYTIC_VALUE", "MESSAGING_SCREEN_EXIT_ACTION_CONVERSATION_LIST_ANALYTIC_VALUE", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ MessagingScreenViewModel(MessagingEntryPointHandler messagingEntryPointHandler, MessagingScreenState messagingScreenState, c1 c1Var, AnalyticsProcessor analyticsProcessor, MessagingEventDispatcher messagingEventDispatcher, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(messagingEntryPointHandler, (i11 & 2) != 0 ? MessagingScreenState.Idle.INSTANCE : messagingScreenState, c1Var, analyticsProcessor, messagingEventDispatcher);
    }
}
