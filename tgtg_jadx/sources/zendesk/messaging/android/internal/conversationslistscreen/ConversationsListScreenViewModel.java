package zendesk.messaging.android.internal.conversationslistscreen;

import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import com.braze.h2;
import com.google.android.gms.internal.measurement.cg;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import v80.i1;
import x80.m;
import y80.a2;
import y80.f1;
import y80.h1;
import y80.i;
import y80.r;
import y80.y1;
import zendesk.android.events.NewConversationButtonClickedDetails;
import zendesk.android.events.NewConversationSource;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.conversationkit.android.ConnectionStatus;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.conversationkit.android.ConversationKitEvent;
import zendesk.conversationkit.android.ConversationKitEventListener;
import zendesk.core.ui.android.internal.model.ConversationEntry;
import zendesk.logger.Logger;
import zendesk.messaging.android.internal.VisibleScreenTracker;
import zendesk.messaging.android.internal.analytics.AnalyticsEventType;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;
import zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenActions;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListStateHelperKt;
import zendesk.messaging.android.internal.events.MessagingEventDispatcher;
import zendesk.messaging.android.internal.model.MessagingTheme;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 T2\u00020\u0001:\u0001TB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0012H\u0002¢\u0006\u0004\b!\u0010\u001bJ\u000f\u0010\"\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\"\u0010\u001bJ\u000f\u0010#\u001a\u00020\u0012H\u0002¢\u0006\u0004\b#\u0010\u001bJ\u0012\u0010%\u001a\u0004\u0018\u00010$H\u0082@¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b'\u0010&J*\u0010-\u001a\u00020\u00122\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\b\b\u0002\u0010,\u001a\u00020+H\u0082@¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00122\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00122\u0006\u00100\u001a\u000203H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0012H\u0002¢\u0006\u0004\b6\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00108R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010:R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020@0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020@0C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020I0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020I0L8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006U"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenViewModel;", "Landroidx/lifecycle/l1;", "Lzendesk/android/messaging/model/MessagingSettings;", "messagingSettings", "Lzendesk/conversationkit/android/ConversationKit;", "conversationKit", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationsListRepository;", "repository", "Lzendesk/messaging/android/internal/VisibleScreenTracker;", "visibleScreenTracker", "Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "messagingEventDispatcher", "Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;", "analyticsProcessor", "<init>", "(Lzendesk/android/messaging/model/MessagingSettings;Lzendesk/conversationkit/android/ConversationKit;Lzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationsListRepository;Lzendesk/messaging/android/internal/VisibleScreenTracker;Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;)V", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenActions;", "conversationsListScreenActions", "", "dispatchAction", "(Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenActions;)V", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "newTheme", "refreshTheme$zendesk_messaging_messaging_android", "(Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "refreshTheme", "processMessagingClosedEvent", "()V", "onCleared", "Lzendesk/messaging/android/internal/analytics/AnalyticsEventType;", "eventType", "sendInternalAnalyticsEvent", "(Lzendesk/messaging/android/internal/analytics/AnalyticsEventType;)V", "resumeConversationKitConnection", "loadMoreConversations", "refreshEntryPointState", "Lzendesk/conversationkit/android/model/User;", "getCurrentUser", "(Lx70/c;)Ljava/lang/Object;", "loadConversations", "", "Lzendesk/conversationkit/android/model/Conversation;", "conversations", "", "hasMore", "hideLoadingIndicatorViewAndUpdateConversationsList", "(Ljava/util/List;ZLx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/ConversationKitEvent;", "event", "updateStateFromConversationKitEvent", "(Lzendesk/conversationkit/android/ConversationKitEvent;)V", "Lzendesk/conversationkit/android/ConversationKitEvent$ConnectionStatusChanged;", "handleConnectionStatusChanged", "(Lzendesk/conversationkit/android/ConversationKitEvent$ConnectionStatusChanged;)V", "createNewConversation", "Lzendesk/conversationkit/android/ConversationKit;", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationsListRepository;", "Lzendesk/messaging/android/internal/VisibleScreenTracker;", "Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;", "Lv80/i1;", "refreshListStateJob", "Lv80/i1;", "Lx80/m;", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenNavigationEvents;", "_navigationChannel", "Lx80/m;", "Ly80/i;", "navigationChannel", "Ly80/i;", "getNavigationChannel", "()Ly80/i;", "Ly80/f1;", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;", "_conversationsListScreenStateFlow", "Ly80/f1;", "Ly80/y1;", "conversationsListScreenStateFlow", "Ly80/y1;", "getConversationsListScreenStateFlow", "()Ly80/y1;", "Lzendesk/conversationkit/android/ConversationKitEventListener;", "eventListener", "Lzendesk/conversationkit/android/ConversationKitEventListener;", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationsListScreenViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationsListScreenViewModel.kt\nzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,550:1\n230#2,5:551\n230#2,5:556\n230#2,5:561\n230#2,5:566\n230#2,5:571\n230#2,5:576\n230#2,5:581\n230#2,5:586\n230#2,3:591\n233#2,2:598\n1563#3:594\n1634#3,3:595\n*S KotlinDebug\n*F\n+ 1 ConversationsListScreenViewModel.kt\nzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenViewModel\n*L\n132#1:551,5\n220#1:556,5\n236#1:561,5\n361#1:566,5\n392#1:571,5\n400#1:576,5\n427#1:581,5\n455#1:586,5\n505#1:591,3\n505#1:598,2\n510#1:594\n510#1:595,3\n*E\n"})
public final class ConversationsListScreenViewModel extends l1 {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String LOG_TAG = "ConversationsListViewModel";

    @NotNull
    private final f1 _conversationsListScreenStateFlow;

    @NotNull
    private final m _navigationChannel;

    @NotNull
    private final AnalyticsProcessor analyticsProcessor;

    @NotNull
    private final ConversationKit conversationKit;

    @NotNull
    private final y1 conversationsListScreenStateFlow;

    @NotNull
    private final ConversationKitEventListener eventListener;

    @NotNull
    private final MessagingEventDispatcher messagingEventDispatcher;

    @NotNull
    private final i navigationChannel;

    @Nullable
    private i1 refreshListStateJob;

    @NotNull
    private final ConversationsListRepository repository;

    @NotNull
    private final VisibleScreenTracker visibleScreenTracker;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConversationsListState.values().length];
            try {
                iArr[ConversationsListState.FAILED_ENTRY_POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConversationsListState.FAILED_CONVERSATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel$createNewConversation$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel$createNewConversation$2", f = "ConversationsListScreenViewModel.kt", l = {463, 479}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nConversationsListScreenViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationsListScreenViewModel.kt\nzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenViewModel$createNewConversation$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,550:1\n230#2,5:551\n230#2,5:556\n*S KotlinDebug\n*F\n+ 1 ConversationsListScreenViewModel.kt\nzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenViewModel$createNewConversation$2\n*L\n465#1:551,5\n487#1:556,5\n*E\n"})
    public static final class AnonymousClass2 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        public AnonymousClass2(x70.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationsListScreenViewModel.this.new AnonymousClass2(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
        
            if (r13.f(r1, r12) == r0) goto L21;
         */
        @Override // z70.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                y70.a r0 = y70.a.COROUTINE_SUSPENDED
                int r1 = r12.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L11
                ba0.g.M(r13)
                goto Lb5
            L11:
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r13)
            L16:
                r13 = 0
                return r13
            L18:
                ba0.g.M(r13)
                goto L2e
            L1c:
                ba0.g.M(r13)
                zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel r13 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.this
                zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository r13 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.access$getRepository$p(r13)
                r12.label = r3
                java.lang.Object r13 = r13.createNewConversation$zendesk_messaging_messaging_android(r12)
                if (r13 != r0) goto L2e
                goto L8c
            L2e:
                zendesk.conversationkit.android.ConversationKitResult r13 = (zendesk.conversationkit.android.ConversationKitResult) r13
                boolean r1 = r13 instanceof zendesk.conversationkit.android.ConversationKitResult.Success
                if (r1 == 0) goto L8d
                zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel r1 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.this
                y80.f1 r1 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.access$get_conversationsListScreenStateFlow$p(r1)
                zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel r3 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.this
            L3c:
                r4 = r1
                y80.a2 r4 = (y80.a2) r4
                java.lang.Object r5 = r4.getValue()
                r9 = r5
                zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState r9 = (zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState) r9
                zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository r6 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.access$getRepository$p(r3)
                r10 = 2
                r11 = 0
                r7 = 1
                r8 = 0
                zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState r6 = zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository.updateCreateConversationState$zendesk_messaging_messaging_android$default(r6, r7, r8, r9, r10, r11)
                boolean r4 = r4.g(r5, r6)
                if (r4 == 0) goto L3c
                zendesk.conversationkit.android.ConversationKitResult$Success r13 = (zendesk.conversationkit.android.ConversationKitResult.Success) r13
                java.lang.Object r13 = r13.getValue()
                zendesk.conversationkit.android.model.Conversation r13 = (zendesk.conversationkit.android.model.Conversation) r13
                java.lang.String r4 = r13.getId()
                zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel r13 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.this
                zendesk.messaging.android.internal.events.MessagingEventDispatcher r3 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.access$getMessagingEventDispatcher$p(r13)
                r8 = 6
                r9 = 0
                r5 = 0
                r7 = 0
                zendesk.messaging.android.internal.events.MessagingEventDispatcher.handleConversationStartedEvent$zendesk_messaging_messaging_android$default(r3, r4, r5, r7, r8, r9)
                zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel r13 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.this
                zendesk.messaging.android.internal.analytics.AnalyticsEventType$AnalyticsEventTypeWithSource$ConversationOpenedNewConversationButton r1 = zendesk.messaging.android.internal.analytics.AnalyticsEventType.AnalyticsEventTypeWithSource.ConversationOpenedNewConversationButton.INSTANCE
                zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.access$sendInternalAnalyticsEvent(r13, r1)
                zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel r13 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.this
                x80.m r13 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.access$get_navigationChannel$p(r13)
                zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenNavigationEvents$ConversationScreen r1 = new zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenNavigationEvents$ConversationScreen
                r1.<init>(r4)
                r12.label = r2
                java.lang.Object r13 = r13.f(r1, r12)
                if (r13 != r0) goto Lb5
            L8c:
                return r0
            L8d:
                boolean r13 = r13 instanceof zendesk.conversationkit.android.ConversationKitResult.Failure
                if (r13 == 0) goto Lb8
                zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel r13 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.this
                y80.f1 r13 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.access$get_conversationsListScreenStateFlow$p(r13)
                zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel r0 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.this
            L99:
                r1 = r13
                y80.a2 r1 = (y80.a2) r1
                java.lang.Object r2 = r1.getValue()
                r6 = r2
                zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState r6 = (zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState) r6
                zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository r3 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.access$getRepository$p(r0)
                r7 = 2
                r8 = 0
                r4 = 0
                r5 = 0
                zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState r3 = zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository.updateCreateConversationState$zendesk_messaging_messaging_android$default(r3, r4, r5, r6, r7, r8)
                boolean r1 = r1.g(r2, r3)
                if (r1 == 0) goto L99
            Lb5:
                kotlin.Unit r13 = kotlin.Unit.f26487a
                return r13
            Lb8:
                e40.a.f()
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel$dispatchAction$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel$dispatchAction$2", f = "ConversationsListScreenViewModel.kt", l = {377}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nConversationsListScreenViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationsListScreenViewModel.kt\nzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenViewModel$dispatchAction$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,550:1\n230#2,5:551\n*S KotlinDebug\n*F\n+ 1 ConversationsListScreenViewModel.kt\nzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenViewModel$dispatchAction$2\n*L\n376#1:551,5\n*E\n"})
    public static final class C04482 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public C04482(x70.c<? super C04482> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationsListScreenViewModel.this.new C04482(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04482) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x004a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0048 -> B:12:0x004b). Please report as a decompilation issue!!! */
        @Override // z70.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Exception {
            /*
                r7 = this;
                y70.a r0 = y70.a.COROUTINE_SUSPENDED
                int r1 = r7.label
                r2 = 1
                if (r1 == 0) goto L1e
                if (r1 != r2) goto L17
                java.lang.Object r1 = r7.L$2
                java.lang.Object r3 = r7.L$1
                zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel r3 = (zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel) r3
                java.lang.Object r4 = r7.L$0
                y80.f1 r4 = (y80.f1) r4
                ba0.g.M(r8)
                goto L4b
            L17:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r8)
                r8 = 0
                return r8
            L1e:
                ba0.g.M(r8)
                zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel r8 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.this
                y80.f1 r8 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.access$get_conversationsListScreenStateFlow$p(r8)
                zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel r1 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.this
                r3 = r1
            L2a:
                r4 = r8
                y80.a2 r4 = (y80.a2) r4
                java.lang.Object r1 = r4.getValue()
                r8 = r1
                zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState r8 = (zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState) r8
                zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository r5 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.access$getRepository$p(r3)
                int r6 = r8.getCurrentPaginationOffset()
                r7.L$0 = r4
                r7.L$1 = r3
                r7.L$2 = r1
                r7.label = r2
                java.lang.Object r8 = r5.refreshConversationsList$zendesk_messaging_messaging_android(r8, r2, r6, r7)
                if (r8 != r0) goto L4b
                return r0
            L4b:
                zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState r8 = (zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState) r8
                y80.a2 r4 = (y80.a2) r4
                boolean r8 = r4.g(r1, r8)
                if (r8 == 0) goto L58
                kotlin.Unit r8 = kotlin.Unit.f26487a
                return r8
            L58:
                r8 = r4
                goto L2a
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.C04482.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel$getCurrentUser$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel", f = "ConversationsListScreenViewModel.kt", l = {200}, m = "getCurrentUser")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends z70.c {
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
            return ConversationsListScreenViewModel.this.getCurrentUser(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel$handleConnectionStatusChanged$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel$handleConnectionStatusChanged$2", f = "ConversationsListScreenViewModel.kt", l = {441, 443}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nConversationsListScreenViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationsListScreenViewModel.kt\nzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenViewModel$handleConnectionStatusChanged$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,550:1\n230#2,5:551\n*S KotlinDebug\n*F\n+ 1 ConversationsListScreenViewModel.kt\nzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenViewModel$handleConnectionStatusChanged$2\n*L\n442#1:551,5\n*E\n"})
    public static final class C04492 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public C04492(x70.c<? super C04492> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationsListScreenViewModel.this.new C04492(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04492) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
        
            if (r13.f(r1, r12) == r0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
        
            if (r13 != r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
        
            return r0;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0061 -> B:17:0x0064). Please report as a decompilation issue!!! */
        @Override // z70.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                y70.a r0 = y70.a.COROUTINE_SUSPENDED
                int r1 = r12.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L25
                if (r1 == r3) goto L21
                if (r1 != r2) goto L1a
                java.lang.Object r1 = r12.L$2
                java.lang.Object r3 = r12.L$1
                zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel r3 = (zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel) r3
                java.lang.Object r4 = r12.L$0
                y80.f1 r4 = (y80.f1) r4
                ba0.g.M(r13)
                goto L64
            L1a:
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r13)
                r13 = 0
                return r13
            L21:
                ba0.g.M(r13)
                goto L39
            L25:
                ba0.g.M(r13)
                zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel r13 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.this
                x80.m r13 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.access$get_navigationChannel$p(r13)
                zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenNavigationEvents$NotificationPermissions r1 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenNavigationEvents.NotificationPermissions.INSTANCE
                r12.label = r3
                java.lang.Object r13 = r13.f(r1, r12)
                if (r13 != r0) goto L39
                goto L63
            L39:
                zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel r13 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.this
                y80.f1 r13 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.access$get_conversationsListScreenStateFlow$p(r13)
                zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel r1 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.this
                r3 = r1
            L42:
                r4 = r13
                y80.a2 r4 = (y80.a2) r4
                java.lang.Object r1 = r4.getValue()
                r6 = r1
                zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState r6 = (zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState) r6
                zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository r5 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.access$getRepository$p(r3)
                r12.L$0 = r4
                r12.L$1 = r3
                r12.L$2 = r1
                r12.label = r2
                r7 = 0
                r8 = 0
                r10 = 6
                r11 = 0
                r9 = r12
                java.lang.Object r13 = zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository.refreshConversationsList$zendesk_messaging_messaging_android$default(r5, r6, r7, r8, r9, r10, r11)
                if (r13 != r0) goto L64
            L63:
                return r0
            L64:
                zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState r13 = (zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState) r13
                y80.a2 r4 = (y80.a2) r4
                boolean r13 = r4.g(r1, r13)
                if (r13 == 0) goto L71
                kotlin.Unit r13 = kotlin.Unit.f26487a
                return r13
            L71:
                r13 = r4
                goto L42
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.C04492.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel$hideLoadingIndicatorViewAndUpdateConversationsList$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel", f = "ConversationsListScreenViewModel.kt", l = {237}, m = "hideLoadingIndicatorViewAndUpdateConversationsList")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C04501 extends z70.c {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C04501(x70.c<? super C04501> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsListScreenViewModel.this.hideLoadingIndicatorViewAndUpdateConversationsList(null, false, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel$loadConversations$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel", f = "ConversationsListScreenViewModel.kt", l = {210, 213, 217}, m = "loadConversations")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C04511 extends z70.c {
        int label;
        /* synthetic */ Object result;

        public C04511(x70.c<? super C04511> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsListScreenViewModel.this.loadConversations(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel$loadMoreConversations$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel$loadMoreConversations$2", f = "ConversationsListScreenViewModel.kt", l = {146, 152}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nConversationsListScreenViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationsListScreenViewModel.kt\nzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenViewModel$loadMoreConversations$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,550:1\n230#2,5:551\n230#2,5:556\n*S KotlinDebug\n*F\n+ 1 ConversationsListScreenViewModel.kt\nzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenViewModel$loadMoreConversations$2\n*L\n151#1:551,5\n161#1:556,5\n*E\n"})
    public static final class C04522 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        public C04522(x70.c<? super C04522> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationsListScreenViewModel.this.new C04522(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04522) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
        
            if (r2 == r1) goto L19;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0097 -> B:21:0x009d). Please report as a decompilation issue!!! */
        @Override // z70.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instruction units count: 258
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.C04522.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel$refreshEntryPointState$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel$refreshEntryPointState$1", f = "ConversationsListScreenViewModel.kt", l = {183}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nConversationsListScreenViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationsListScreenViewModel.kt\nzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenViewModel$refreshEntryPointState$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,550:1\n230#2,5:551\n*S KotlinDebug\n*F\n+ 1 ConversationsListScreenViewModel.kt\nzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenViewModel$refreshEntryPointState$1\n*L\n188#1:551,5\n*E\n"})
    public static final class C04531 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        public C04531(x70.c<? super C04531> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationsListScreenViewModel.this.new C04531(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04531) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) throws Exception {
            a2 a2Var;
            Object value;
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            try {
                if (i11 == 0) {
                    ba0.g.M(obj);
                    ConversationsListScreenViewModel conversationsListScreenViewModel = ConversationsListScreenViewModel.this;
                    this.label = 1;
                    if (conversationsListScreenViewModel.loadConversations(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
            } catch (Exception e5) {
                if (e5 instanceof CancellationException) {
                    throw e5;
                }
                f1 f1Var = ConversationsListScreenViewModel.this._conversationsListScreenStateFlow;
                do {
                    a2Var = (a2) f1Var;
                    value = a2Var.getValue();
                } while (!a2Var.g(value, ConversationsListStateHelperKt.errorState(e5, (ConversationsListScreenState) value, ConversationsListState.FAILED_ENTRY_POINT)));
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel$resumeConversationKitConnection$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel$resumeConversationKitConnection$1", f = "ConversationsListScreenViewModel.kt", l = {125}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04541 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        public C04541(x70.c<? super C04541> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationsListScreenViewModel.this.new C04541(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04541) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                ConversationKit conversationKit = ConversationsListScreenViewModel.this.conversationKit;
                this.label = 1;
                if (conversationKit.resume(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel$sendInternalAnalyticsEvent$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel$sendInternalAnalyticsEvent$1", f = "ConversationsListScreenViewModel.kt", l = {120}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04551 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ AnalyticsEventType $eventType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04551(AnalyticsEventType analyticsEventType, x70.c<? super C04551> cVar) {
            super(2, cVar);
            this.$eventType = analyticsEventType;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationsListScreenViewModel.this.new C04551(this.$eventType, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04551) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                AnalyticsProcessor analyticsProcessor = ConversationsListScreenViewModel.this.analyticsProcessor;
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
                ba0.g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel$updateStateFromConversationKitEvent$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel$updateStateFromConversationKitEvent$1", f = "ConversationsListScreenViewModel.kt", l = {254, 266, 289, 306, 315, 327}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nConversationsListScreenViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationsListScreenViewModel.kt\nzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenViewModel$updateStateFromConversationKitEvent$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,550:1\n230#2,5:551\n230#2,5:556\n230#2,5:561\n230#2,5:566\n230#2,5:571\n*S KotlinDebug\n*F\n+ 1 ConversationsListScreenViewModel.kt\nzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenViewModel$updateStateFromConversationKitEvent$1\n*L\n253#1:551,5\n269#1:556,5\n305#1:561,5\n314#1:566,5\n326#1:571,5\n*E\n"})
    public static final class C04561 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ ConversationKitEvent $event;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ ConversationsListScreenViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04561(ConversationKitEvent conversationKitEvent, ConversationsListScreenViewModel conversationsListScreenViewModel, x70.c<? super C04561> cVar) {
            super(2, cVar);
            this.$event = conversationKitEvent;
            this.this$0 = conversationsListScreenViewModel;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return new C04561(this.$event, this.this$0, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04561) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0114, code lost:
        
            if (r2 == r9) goto L78;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x01fe, code lost:
        
            if (r4 != r9) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0247, code lost:
        
            if (r4 != r9) goto L67;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x014c  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x018a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x018c  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x01a8  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x029e  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x02af  */
        /* JADX WARN: Type inference failed for: r12v2 */
        /* JADX WARN: Type inference failed for: r12v3 */
        /* JADX WARN: Type inference failed for: r12v4 */
        /* JADX WARN: Type inference failed for: r12v5 */
        /* JADX WARN: Type inference failed for: r12v7 */
        /* JADX WARN: Type inference failed for: r12v8 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00e4 -> B:19:0x00e6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x01a8 -> B:44:0x01ab). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x01fe -> B:57:0x0202). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0247 -> B:67:0x024a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x029e -> B:80:0x02a4). Please report as a decompilation issue!!! */
        @Override // z70.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r37) {
            /*
                Method dump skipped, instruction units count: 714
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.C04561.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ConversationsListScreenViewModel(@NotNull MessagingSettings messagingSettings, @NotNull ConversationKit conversationKit, @NotNull ConversationsListRepository conversationsListRepository, @NotNull VisibleScreenTracker visibleScreenTracker, @NotNull MessagingEventDispatcher messagingEventDispatcher, @NotNull AnalyticsProcessor analyticsProcessor) {
        messagingSettings.getClass();
        conversationKit.getClass();
        conversationsListRepository.getClass();
        visibleScreenTracker.getClass();
        messagingEventDispatcher.getClass();
        analyticsProcessor.getClass();
        this.conversationKit = conversationKit;
        this.repository = conversationsListRepository;
        this.visibleScreenTracker = visibleScreenTracker;
        this.messagingEventDispatcher = messagingEventDispatcher;
        this.analyticsProcessor = analyticsProcessor;
        x80.i iVarA = cg.a(0, null, null, 7);
        this._navigationChannel = iVarA;
        this.navigationChannel = r.w(iVarA);
        a2 a2VarC = r.c(new ConversationsListScreenState(null, messagingSettings.getTitle(), messagingSettings.getDescription(), messagingSettings.getLogoUrl(), messagingSettings.isMultiConversationsEnabled(), messagingSettings.getCanUserCreateMoreConversations(), null, null, false, null, ConversationsListState.LOADING, false, 0, null, null, 0, 64449, null));
        this._conversationsListScreenStateFlow = a2VarC;
        this.conversationsListScreenStateFlow = new h1(a2VarC);
        ConversationKitEventListener conversationKitEventListener = new ConversationKitEventListener() { // from class: zendesk.messaging.android.internal.conversationslistscreen.g
            @Override // zendesk.conversationkit.android.ConversationKitEventListener
            public final void onEvent(ConversationKitEvent conversationKitEvent) {
                ConversationsListScreenViewModel.eventListener$lambda$0(this.f47748a, conversationKitEvent);
            }
        };
        this.eventListener = conversationKitEventListener;
        resumeConversationKitConnection();
        refreshEntryPointState();
        conversationKit.addEventListener(conversationKitEventListener);
    }

    private final void createNewConversation() {
        a2 a2Var;
        Object value;
        f1 f1Var = this._conversationsListScreenStateFlow;
        do {
            a2Var = (a2) f1Var;
            value = a2Var.getValue();
        } while (!a2Var.g(value, ConversationsListRepository.updateCreateConversationState$zendesk_messaging_messaging_android$default(this.repository, false, true, (ConversationsListScreenState) value, 1, null)));
        f0.B(m1.d(this), null, null, new AnonymousClass2(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void eventListener$lambda$0(ConversationsListScreenViewModel conversationsListScreenViewModel, ConversationKitEvent conversationKitEvent) {
        conversationKitEvent.getClass();
        if ((conversationKitEvent instanceof ConversationKitEvent.MessageReceived) || (conversationKitEvent instanceof ConversationKitEvent.MessageUpdated) || (conversationKitEvent instanceof ConversationKitEvent.ConnectionStatusChanged) || (conversationKitEvent instanceof ConversationKitEvent.ConversationAddedSuccess) || (conversationKitEvent instanceof ConversationKitEvent.ConversationRemovedSuccess) || (conversationKitEvent instanceof ConversationKitEvent.ActivityEventReceived)) {
            conversationsListScreenViewModel.updateStateFromConversationKitEvent(conversationKitEvent);
        } else {
            Logger.d(LOG_TAG, conversationKitEvent.getClass().getSimpleName().concat(" received."), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getCurrentUser(x70.c<? super zendesk.conversationkit.android.model.User> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel$getCurrentUser$1 r0 = (zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel$getCurrentUser$1 r0 = new zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel$getCurrentUser$1
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
            zendesk.conversationkit.android.ConversationKit r5 = r4.conversationKit
            r0.label = r3
            java.lang.Object r5 = r5.getCurrentUser(r0)
            if (r5 != r1) goto L3c
            return r1
        L3c:
            zendesk.conversationkit.android.model.User r5 = (zendesk.conversationkit.android.model.User) r5
            if (r5 != 0) goto L4b
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r0 = "ConversationsListViewModel"
            java.lang.String r1 = "No user created yet."
            zendesk.logger.Logger.i(r0, r1, r5)
            goto L2c
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.getCurrentUser(x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleConnectionStatusChanged(ConversationKitEvent.ConnectionStatusChanged event) {
        a2 a2Var;
        Object value;
        f1 f1Var = this._conversationsListScreenStateFlow;
        do {
            a2Var = (a2) f1Var;
            value = a2Var.getValue();
        } while (!a2Var.g(value, ConversationsListStateHelperKt.connectionStatus((ConversationsListScreenState) value, event.getConnectionStatus())));
        ConversationsListState conversationsListState = ((ConversationsListScreenState) this.conversationsListScreenStateFlow.getValue()).getConversationsListState();
        if (event.getConnectionStatus() != ConnectionStatus.CONNECTED_REALTIME || conversationsListState == ConversationsListState.LOADING || conversationsListState == ConversationsListState.FAILED_ENTRY_POINT) {
            return;
        }
        i1 i1Var = this.refreshListStateJob;
        if (i1Var == null || i1Var.a0()) {
            this.refreshListStateJob = f0.B(m1.d(this), null, null, new C04492(null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0061 -> B:18:0x0064). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hideLoadingIndicatorViewAndUpdateConversationsList(java.util.List<zendesk.conversationkit.android.model.Conversation> r11, boolean r12, x70.c<? super kotlin.Unit> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.C04501
            if (r0 == 0) goto L13
            r0 = r13
            zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel$hideLoadingIndicatorViewAndUpdateConversationsList$1 r0 = (zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.C04501) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel$hideLoadingIndicatorViewAndUpdateConversationsList$1 r0 = new zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel$hideLoadingIndicatorViewAndUpdateConversationsList$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L36
            boolean r11 = r0.Z$0
            java.lang.Object r12 = r0.L$2
            java.lang.Object r2 = r0.L$1
            y80.f1 r2 = (y80.f1) r2
            java.lang.Object r4 = r0.L$0
            java.util.List r4 = (java.util.List) r4
            ba0.g.M(r13)
            r8 = r11
            r9 = r0
            r7 = r4
            goto L64
        L36:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r11)
            r11 = 0
            return r11
        L3d:
            ba0.g.M(r13)
            y80.f1 r13 = r10._conversationsListScreenStateFlow
            r7 = r11
            r8 = r12
            r9 = r0
        L45:
            r2 = r13
            y80.a2 r2 = (y80.a2) r2
            java.lang.Object r12 = r2.getValue()
            r5 = r12
            zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState r5 = (zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState) r5
            zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository r4 = r10.repository
            zendesk.messaging.android.internal.conversationslistscreen.ConversationsListState r6 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListState.SUCCESS
            r9.L$0 = r7
            r9.L$1 = r2
            r9.L$2 = r12
            r9.Z$0 = r8
            r9.label = r3
            java.lang.Object r13 = r4.conversationsListStateChange$zendesk_messaging_messaging_android(r5, r6, r7, r8, r9)
            if (r13 != r1) goto L64
            return r1
        L64:
            zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState r13 = (zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState) r13
            r11 = r2
            y80.a2 r11 = (y80.a2) r11
            boolean r12 = r11.g(r12, r13)
            if (r12 == 0) goto L72
            kotlin.Unit r11 = kotlin.Unit.f26487a
            return r11
        L72:
            r13 = r11
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.hideLoadingIndicatorViewAndUpdateConversationsList(java.util.List, boolean, x70.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object hideLoadingIndicatorViewAndUpdateConversationsList$default(ConversationsListScreenViewModel conversationsListScreenViewModel, List list, boolean z11, x70.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = n0.f26529a;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return conversationsListScreenViewModel.hideLoadingIndicatorViewAndUpdateConversationsList(list, z11, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (r8.f(r2, r0) != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadConversations(x70.c<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.C04511
            if (r0 == 0) goto L13
            r0 = r8
            zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel$loadConversations$1 r0 = (zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.C04511) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel$loadConversations$1 r0 = new zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel$loadConversations$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2d
            ba0.g.M(r8)
            goto L7e
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
        L32:
            r8 = 0
            return r8
        L34:
            ba0.g.M(r8)
            goto L71
        L38:
            ba0.g.M(r8)
            goto L4c
        L3c:
            ba0.g.M(r8)
            zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository r8 = r7.repository
            r0.label = r5
            r2 = 0
            r6 = 0
            java.lang.Object r8 = zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository.fetchConversations$zendesk_messaging_messaging_android$default(r8, r2, r0, r5, r6)
            if (r8 != r1) goto L4c
            goto L7d
        L4c:
            zendesk.conversationkit.android.ConversationKitResult r8 = (zendesk.conversationkit.android.ConversationKitResult) r8
            boolean r2 = r8 instanceof zendesk.conversationkit.android.ConversationKitResult.Success
            if (r2 == 0) goto L81
            zendesk.conversationkit.android.ConversationKitResult$Success r8 = (zendesk.conversationkit.android.ConversationKitResult.Success) r8
            java.lang.Object r2 = r8.getValue()
            zendesk.conversationkit.android.model.ConversationsPagination r2 = (zendesk.conversationkit.android.model.ConversationsPagination) r2
            java.util.List r2 = r2.getConversations()
            java.lang.Object r8 = r8.getValue()
            zendesk.conversationkit.android.model.ConversationsPagination r8 = (zendesk.conversationkit.android.model.ConversationsPagination) r8
            boolean r8 = r8.getHasMore()
            r0.label = r4
            java.lang.Object r8 = r7.hideLoadingIndicatorViewAndUpdateConversationsList(r2, r8, r0)
            if (r8 != r1) goto L71
            goto L7d
        L71:
            x80.m r8 = r7._navigationChannel
            zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenNavigationEvents$NotificationPermissions r2 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenNavigationEvents.NotificationPermissions.INSTANCE
            r0.label = r3
            java.lang.Object r8 = r8.f(r2, r0)
            if (r8 != r1) goto L7e
        L7d:
            return r1
        L7e:
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        L81:
            boolean r0 = r8 instanceof zendesk.conversationkit.android.ConversationKitResult.Failure
            if (r0 == 0) goto La7
            y80.f1 r0 = r7._conversationsListScreenStateFlow
        L87:
            r1 = r0
            y80.a2 r1 = (y80.a2) r1
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState r3 = (zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState) r3
            r4 = r8
            zendesk.conversationkit.android.ConversationKitResult$Failure r4 = (zendesk.conversationkit.android.ConversationKitResult.Failure) r4
            java.lang.Throwable r4 = r4.getCause()
            zendesk.messaging.android.internal.conversationslistscreen.ConversationsListState r5 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListState.FAILED_ENTRY_POINT
            zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState r3 = zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListStateHelperKt.errorState(r4, r3, r5)
            boolean r1 = r1.g(r2, r3)
            if (r1 == 0) goto L87
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        La7:
            e40.a.f()
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel.loadConversations(x70.c):java.lang.Object");
    }

    private final void loadMoreConversations() {
        a2 a2Var;
        Object value;
        ConversationsListScreenState conversationsListScreenState;
        ConversationsListRepository conversationsListRepository;
        s80.b conversations;
        ConversationEntry.LoadMoreStatus loadMoreStatus;
        if (!((ConversationsListScreenState) this.conversationsListScreenStateFlow.getValue()).getShouldLoadMore() || ((ConversationsListScreenState) this.conversationsListScreenStateFlow.getValue()).getLoadMoreStatus() == ConversationEntry.LoadMoreStatus.FAILED) {
            return;
        }
        f1 f1Var = this._conversationsListScreenStateFlow;
        do {
            a2Var = (a2) f1Var;
            value = a2Var.getValue();
            conversationsListScreenState = (ConversationsListScreenState) value;
            conversationsListRepository = this.repository;
            conversations = conversationsListScreenState.getConversations();
            loadMoreStatus = ConversationEntry.LoadMoreStatus.LOADING;
        } while (!a2Var.g(value, conversationsListScreenState.copy((Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 1) != 0 ? conversationsListScreenState.messagingTheme : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 2) != 0 ? conversationsListScreenState.title : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4) != 0 ? conversationsListScreenState.description : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 8) != 0 ? conversationsListScreenState.logoUrl : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 16) != 0 ? conversationsListScreenState.isMultiConvoEnabled : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 32) != 0 ? conversationsListScreenState.canUserCreateMoreConversations : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 64) != 0 ? conversationsListScreenState.conversations : conversationsListRepository.addLoadMoreEntry$zendesk_messaging_messaging_android(conversations, loadMoreStatus, conversationsListScreenState.getMessagingTheme()), (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 128) != 0 ? conversationsListScreenState.connectionStatus : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 256) != 0 ? conversationsListScreenState.showDeniedPermission : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 512) != 0 ? conversationsListScreenState.createConversationState : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 1024) != 0 ? conversationsListScreenState.conversationsListState : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & NewHope.SENDB_BYTES) != 0 ? conversationsListScreenState.shouldLoadMore : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4096) != 0 ? conversationsListScreenState.currentPaginationOffset : 0, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 8192) != 0 ? conversationsListScreenState.loadMoreStatus : loadMoreStatus, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? conversationsListScreenState.receivedMessageAuthor : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 32768) != 0 ? conversationsListScreenState.receivedMessageUnreadCount : 0)));
        f0.B(m1.d(this), null, null, new C04522(null), 3);
    }

    private final void refreshEntryPointState() {
        f0.B(m1.d(this), null, null, new C04531(null), 3);
    }

    private final void resumeConversationKitConnection() {
        f0.B(m1.d(this), null, null, new C04541(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendInternalAnalyticsEvent(AnalyticsEventType eventType) {
        f0.B(m1.d(this), null, null, new C04551(eventType, null), 3);
    }

    private final void updateStateFromConversationKitEvent(ConversationKitEvent event) {
        f0.B(m1.d(this), null, null, new C04561(event, this, null), 3);
    }

    public final void dispatchAction(@NotNull ConversationsListScreenActions conversationsListScreenActions) {
        a2 a2Var;
        Object value;
        ConversationsListScreenState conversationsListScreenState;
        a2 a2Var2;
        Object value2;
        ConversationsListScreenState conversationsListScreenState2;
        a2 a2Var3;
        Object value3;
        ConversationsListScreenState conversationsListScreenState3;
        conversationsListScreenActions.getClass();
        if (conversationsListScreenActions instanceof ConversationsListScreenActions.CreateConversation) {
            createNewConversation();
            sendInternalAnalyticsEvent(AnalyticsEventType.NewConversationButtonClicked.INSTANCE);
            MessagingEventDispatcher.handleNewConversationButtonClicked$zendesk_messaging_messaging_android$default(this.messagingEventDispatcher, null, 0L, new NewConversationButtonClickedDetails(NewConversationSource.CONVERSATION_LIST), 3, null);
            return;
        }
        if (conversationsListScreenActions instanceof ConversationsListScreenActions.DismissCreateConversationError) {
            f1 f1Var = this._conversationsListScreenStateFlow;
            do {
                a2Var3 = (a2) f1Var;
                value3 = a2Var3.getValue();
                conversationsListScreenState3 = (ConversationsListScreenState) value3;
            } while (!a2Var3.g(value3, conversationsListScreenState3.copy((Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 1) != 0 ? conversationsListScreenState3.messagingTheme : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 2) != 0 ? conversationsListScreenState3.title : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4) != 0 ? conversationsListScreenState3.description : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 8) != 0 ? conversationsListScreenState3.logoUrl : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 16) != 0 ? conversationsListScreenState3.isMultiConvoEnabled : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 32) != 0 ? conversationsListScreenState3.canUserCreateMoreConversations : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 64) != 0 ? conversationsListScreenState3.conversations : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 128) != 0 ? conversationsListScreenState3.connectionStatus : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 256) != 0 ? conversationsListScreenState3.showDeniedPermission : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 512) != 0 ? conversationsListScreenState3.createConversationState : CreateConversationState.IDLE, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 1024) != 0 ? conversationsListScreenState3.conversationsListState : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & NewHope.SENDB_BYTES) != 0 ? conversationsListScreenState3.shouldLoadMore : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4096) != 0 ? conversationsListScreenState3.currentPaginationOffset : 0, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 8192) != 0 ? conversationsListScreenState3.loadMoreStatus : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? conversationsListScreenState3.receivedMessageAuthor : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 32768) != 0 ? conversationsListScreenState3.receivedMessageUnreadCount : 0)));
            return;
        }
        if (conversationsListScreenActions instanceof ConversationsListScreenActions.LoadConversations) {
            loadMoreConversations();
            return;
        }
        if (conversationsListScreenActions instanceof ConversationsListScreenActions.Retry) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[((ConversationsListScreenState) this.conversationsListScreenStateFlow.getValue()).getConversationsListState().ordinal()];
            if (i11 == 1) {
                refreshEntryPointState();
                return;
            }
            if (i11 != 2) {
                return;
            }
            i1 i1Var = this.refreshListStateJob;
            if (i1Var == null || i1Var.a0()) {
                this.refreshListStateJob = f0.B(m1.d(this), null, null, new C04482(null), 3);
                return;
            }
            return;
        }
        if (conversationsListScreenActions instanceof ConversationsListScreenActions.ResetLoadMoreStatus) {
            f1 f1Var2 = this._conversationsListScreenStateFlow;
            do {
                a2Var2 = (a2) f1Var2;
                value2 = a2Var2.getValue();
                conversationsListScreenState2 = (ConversationsListScreenState) value2;
            } while (!a2Var2.g(value2, conversationsListScreenState2.copy((Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 1) != 0 ? conversationsListScreenState2.messagingTheme : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 2) != 0 ? conversationsListScreenState2.title : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4) != 0 ? conversationsListScreenState2.description : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 8) != 0 ? conversationsListScreenState2.logoUrl : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 16) != 0 ? conversationsListScreenState2.isMultiConvoEnabled : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 32) != 0 ? conversationsListScreenState2.canUserCreateMoreConversations : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 64) != 0 ? conversationsListScreenState2.conversations : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 128) != 0 ? conversationsListScreenState2.connectionStatus : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 256) != 0 ? conversationsListScreenState2.showDeniedPermission : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 512) != 0 ? conversationsListScreenState2.createConversationState : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 1024) != 0 ? conversationsListScreenState2.conversationsListState : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & NewHope.SENDB_BYTES) != 0 ? conversationsListScreenState2.shouldLoadMore : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4096) != 0 ? conversationsListScreenState2.currentPaginationOffset : 0, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 8192) != 0 ? conversationsListScreenState2.loadMoreStatus : ConversationEntry.LoadMoreStatus.NONE, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? conversationsListScreenState2.receivedMessageAuthor : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 32768) != 0 ? conversationsListScreenState2.receivedMessageUnreadCount : 0)));
            return;
        }
        if (!Intrinsics.areEqual(conversationsListScreenActions, ConversationsListScreenActions.ResetReceivedMessageAuthor.INSTANCE)) {
            if (conversationsListScreenActions instanceof ConversationsListScreenActions.OpenConversation) {
                sendInternalAnalyticsEvent(AnalyticsEventType.AnalyticsEventTypeWithSource.ConversationOpenedExistingConversation.INSTANCE);
                return;
            } else {
                e40.a.f();
                return;
            }
        }
        f1 f1Var3 = this._conversationsListScreenStateFlow;
        do {
            a2Var = (a2) f1Var3;
            value = a2Var.getValue();
            conversationsListScreenState = (ConversationsListScreenState) value;
        } while (!a2Var.g(value, conversationsListScreenState.copy((Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 1) != 0 ? conversationsListScreenState.messagingTheme : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 2) != 0 ? conversationsListScreenState.title : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4) != 0 ? conversationsListScreenState.description : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 8) != 0 ? conversationsListScreenState.logoUrl : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 16) != 0 ? conversationsListScreenState.isMultiConvoEnabled : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 32) != 0 ? conversationsListScreenState.canUserCreateMoreConversations : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 64) != 0 ? conversationsListScreenState.conversations : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 128) != 0 ? conversationsListScreenState.connectionStatus : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 256) != 0 ? conversationsListScreenState.showDeniedPermission : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 512) != 0 ? conversationsListScreenState.createConversationState : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 1024) != 0 ? conversationsListScreenState.conversationsListState : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & NewHope.SENDB_BYTES) != 0 ? conversationsListScreenState.shouldLoadMore : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4096) != 0 ? conversationsListScreenState.currentPaginationOffset : 0, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 8192) != 0 ? conversationsListScreenState.loadMoreStatus : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? conversationsListScreenState.receivedMessageAuthor : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 32768) != 0 ? conversationsListScreenState.receivedMessageUnreadCount : 0)));
    }

    @NotNull
    public final y1 getConversationsListScreenStateFlow() {
        return this.conversationsListScreenStateFlow;
    }

    @NotNull
    public final i getNavigationChannel() {
        return this.navigationChannel;
    }

    @Override // androidx.lifecycle.l1
    public void onCleared() {
        super.onCleared();
        Logger.d(LOG_TAG, "Completing the observation of a conversationsListScreenState.", new Object[0]);
        this.conversationKit.removeEventListener(this.eventListener);
    }

    public final void processMessagingClosedEvent() {
        MessagingEventDispatcher.handleMessagingClosedEvent$zendesk_messaging_messaging_android$default(this.messagingEventDispatcher, null, 0L, 3, null);
    }

    public final void refreshTheme$zendesk_messaging_messaging_android(@NotNull MessagingTheme newTheme) {
        ArrayList arrayList;
        Object objCopy$default;
        newTheme.getClass();
        MessagingTheme messagingTheme = newTheme;
        if (Intrinsics.areEqual(((ConversationsListScreenState) this.conversationsListScreenStateFlow.getValue()).getMessagingTheme(), messagingTheme)) {
            return;
        }
        f1 f1Var = this._conversationsListScreenStateFlow;
        while (true) {
            a2 a2Var = (a2) f1Var;
            Object value = a2Var.getValue();
            ConversationsListScreenState conversationsListScreenState = (ConversationsListScreenState) value;
            int notifyColor = messagingTheme.getNotifyColor();
            int onBackgroundColor = messagingTheme.getOnBackgroundColor();
            s80.b<ConversationEntry> conversations = conversationsListScreenState.getConversations();
            ArrayList arrayList2 = new ArrayList(e0.o(conversations, 10));
            for (ConversationEntry conversationEntry : conversations) {
                if (conversationEntry instanceof ConversationEntry.ConversationItem) {
                    arrayList = arrayList2;
                    objCopy$default = ConversationEntry.ConversationItem.copy$default((ConversationEntry.ConversationItem) conversationEntry, null, null, null, null, null, null, null, null, 0, null, notifyColor, 0, onBackgroundColor, onBackgroundColor, onBackgroundColor, onBackgroundColor, 0, 68607, null);
                } else {
                    arrayList = arrayList2;
                    if (!(conversationEntry instanceof ConversationEntry.LoadMore)) {
                        e40.a.f();
                        return;
                    }
                    objCopy$default = ConversationEntry.LoadMore.copy$default((ConversationEntry.LoadMore) conversationEntry, null, messagingTheme.getOnBackgroundColor(), messagingTheme.getPrimaryColor(), null, null, 25, null);
                }
                arrayList.add(objCopy$default);
                arrayList2 = arrayList;
            }
            f1 f1Var2 = f1Var;
            if (a2Var.g(value, conversationsListScreenState.copy((Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 1) != 0 ? conversationsListScreenState.messagingTheme : messagingTheme, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 2) != 0 ? conversationsListScreenState.title : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4) != 0 ? conversationsListScreenState.description : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 8) != 0 ? conversationsListScreenState.logoUrl : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 16) != 0 ? conversationsListScreenState.isMultiConvoEnabled : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 32) != 0 ? conversationsListScreenState.canUserCreateMoreConversations : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 64) != 0 ? conversationsListScreenState.conversations : o30.f0.V(arrayList2), (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 128) != 0 ? conversationsListScreenState.connectionStatus : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 256) != 0 ? conversationsListScreenState.showDeniedPermission : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 512) != 0 ? conversationsListScreenState.createConversationState : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 1024) != 0 ? conversationsListScreenState.conversationsListState : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & NewHope.SENDB_BYTES) != 0 ? conversationsListScreenState.shouldLoadMore : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4096) != 0 ? conversationsListScreenState.currentPaginationOffset : 0, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 8192) != 0 ? conversationsListScreenState.loadMoreStatus : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? conversationsListScreenState.receivedMessageAuthor : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 32768) != 0 ? conversationsListScreenState.receivedMessageUnreadCount : 0))) {
                return;
            }
            messagingTheme = newTheme;
            f1Var = f1Var2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenViewModel$Companion;", "", "<init>", "()V", "LOG_TAG", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
