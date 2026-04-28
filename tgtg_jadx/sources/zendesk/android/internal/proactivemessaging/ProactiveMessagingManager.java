package zendesk.android.internal.proactivemessaging;

import ba0.g;
import com.app.tgtg.model.local.AppConstants;
import com.braze.h2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import x70.c;
import y70.a;
import y80.j;
import z70.e;
import z70.i;
import zendesk.android.internal.di.ZendeskInitializedComponentScope;
import zendesk.android.internal.frontendevents.analyticsevents.ProactiveMessagingAnalyticsManager;
import zendesk.android.internal.proactivemessaging.model.Campaign;
import zendesk.android.internal.proactivemessaging.model.Trigger;
import zendesk.android.internal.proactivemessaging.model.TriggerType;
import zendesk.android.pageviewevents.PageView;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.core.ui.android.internal.app.ProcessLifecycleEventObserver;
import zendesk.core.ui.android.internal.local.LocaleProvider;
import zendesk.logger.Logger;
import zendesk.messaging.android.internal.di.MessagingComponentKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@ZendeskInitializedComponentScope
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010%\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 >2\u00020\u0001:\u0001>BQ\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020!H\u0002¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020!H\u0002¢\u0006\u0004\b'\u0010%J\u000f\u0010(\u001a\u00020!H\u0002¢\u0006\u0004\b(\u0010%J\u000f\u0010)\u001a\u00020!H\u0002¢\u0006\u0004\b)\u0010%J\u001e\u0010*\u001a\u00020!2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0082@¢\u0006\u0004\b*\u0010+J\u0018\u0010.\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u0018H\u0080@¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00104R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00105R2\u00109\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020807068\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b=\u0010%\u001a\u0004\b;\u0010<¨\u0006?"}, d2 = {"Lzendesk/android/internal/proactivemessaging/ProactiveMessagingManager;", "", "Lzendesk/core/ui/android/internal/app/ProcessLifecycleEventObserver;", "processLifecycleEventObserver", "Lv80/b0;", "coroutineScope", "Lzendesk/core/ui/android/internal/local/LocaleProvider;", "localeProvider", "Lzendesk/android/internal/proactivemessaging/VisitTypeProvider;", "visitTypeProvider", "Lzendesk/conversationkit/android/ConversationKit;", "conversationKit", "Lzendesk/android/internal/proactivemessaging/ProactiveMessagingRepository;", "proactiveMessagingRepository", "Lkotlin/Function0;", "", MessagingComponentKt.CURRENT_TIME_PROVIDER, "Lzendesk/android/internal/frontendevents/analyticsevents/ProactiveMessagingAnalyticsManager;", "proactiveMessagingAnalyticsManager", "<init>", "(Lzendesk/core/ui/android/internal/app/ProcessLifecycleEventObserver;Lv80/b0;Lzendesk/core/ui/android/internal/local/LocaleProvider;Lzendesk/android/internal/proactivemessaging/VisitTypeProvider;Lzendesk/conversationkit/android/ConversationKit;Lzendesk/android/internal/proactivemessaging/ProactiveMessagingRepository;Lkotlin/jvm/functions/Function0;Lzendesk/android/internal/frontendevents/analyticsevents/ProactiveMessagingAnalyticsManager;)V", "", "hasActiveConversations", "(Lx70/c;)Ljava/lang/Object;", "Lzendesk/android/pageviewevents/PageView;", "event", "areAllJobsCompleted", "(Lzendesk/android/pageviewevents/PageView;)Z", "Lzendesk/android/internal/proactivemessaging/model/Trigger;", "trigger", "", "Lzendesk/android/internal/proactivemessaging/EvaluationResult;", "evaluationResults", "", "evaluateTrigger", "(Lzendesk/android/internal/proactivemessaging/model/Trigger;Ljava/util/List;Lzendesk/android/pageviewevents/PageView;Lx70/c;)Ljava/lang/Object;", "clearAllTimers", "()V", "pause", "stopAllTimers", "resume", "resumeAllTimers", "reportToCts", "(Ljava/util/List;Lx70/c;)Ljava/lang/Object;", "evaluate$zendesk_zendesk_android", "(Lzendesk/android/pageviewevents/PageView;Lx70/c;)Ljava/lang/Object;", "evaluate", "Lzendesk/core/ui/android/internal/app/ProcessLifecycleEventObserver;", "Lv80/b0;", "Lzendesk/core/ui/android/internal/local/LocaleProvider;", "Lzendesk/android/internal/proactivemessaging/VisitTypeProvider;", "Lzendesk/conversationkit/android/ConversationKit;", "Lzendesk/android/internal/proactivemessaging/ProactiveMessagingRepository;", "Lkotlin/jvm/functions/Function0;", "", "", "Lzendesk/android/internal/proactivemessaging/EvaluationState;", "evaluationStatesByPageView", "Ljava/util/Map;", "getEvaluationStatesByPageView$zendesk_zendesk_android", "()Ljava/util/Map;", "getEvaluationStatesByPageView$zendesk_zendesk_android$annotations", "Companion", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nProactiveMessagingManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProactiveMessagingManager.kt\nzendesk/android/internal/proactivemessaging/ProactiveMessagingManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,239:1\n1563#2:240\n1634#2,3:241\n774#2:244\n865#2,2:245\n1491#2:247\n1516#2,3:248\n1519#2,3:258\n1068#2:263\n1761#2,3:264\n1869#2:267\n1869#2,2:268\n1870#2:270\n1869#2:271\n1869#2,2:272\n1870#2:274\n1869#2:275\n1869#2,2:276\n1870#2:278\n2756#2:279\n1563#2:281\n1634#2,2:282\n1563#2:284\n1634#2,3:285\n1636#2:288\n384#3,7:251\n216#4,2:261\n1#5:280\n*S KotlinDebug\n*F\n+ 1 ProactiveMessagingManager.kt\nzendesk/android/internal/proactivemessaging/ProactiveMessagingManager\n*L\n81#1:240\n81#1:241,3\n93#1:244\n93#1:245,2\n96#1:247\n96#1:248,3\n96#1:258,3\n109#1:263\n111#1:264,3\n119#1:267\n120#1:268,2\n119#1:270\n169#1:271\n170#1:272,2\n169#1:274\n188#1:275\n189#1:276,2\n188#1:278\n207#1:279\n209#1:281\n209#1:282,2\n212#1:284\n212#1:285,3\n209#1:288\n96#1:251,7\n97#1:261,2\n207#1:280\n*E\n"})
public final class ProactiveMessagingManager {
    private static final int CONVERSATIONS_PAGE_SIZE = 10;

    @NotNull
    private static final String LOG_TAG = "PM-Manager";

    @NotNull
    private final ConversationKit conversationKit;

    @NotNull
    private final b0 coroutineScope;

    @NotNull
    private final Function0<Long> currentTimeProvider;

    @NotNull
    private final Map<PageView, List<EvaluationState>> evaluationStatesByPageView;

    @NotNull
    private final LocaleProvider localeProvider;

    @NotNull
    private final ProactiveMessagingRepository proactiveMessagingRepository;

    @NotNull
    private final ProcessLifecycleEventObserver processLifecycleEventObserver;

    @NotNull
    private final VisitTypeProvider visitTypeProvider;

    /* JADX INFO: renamed from: zendesk.android.internal.proactivemessaging.ProactiveMessagingManager$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.internal.proactivemessaging.ProactiveMessagingManager$1", f = "ProactiveMessagingManager.kt", l = {56}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass1 extends i implements Function2<b0, c<? super Unit>, Object> {
        int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return ProactiveMessagingManager.this.new AnonymousClass1(cVar);
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
                y80.i iVarIsInForeground = ProactiveMessagingManager.this.processLifecycleEventObserver.isInForeground();
                final ProactiveMessagingManager proactiveMessagingManager = ProactiveMessagingManager.this;
                j jVar = new j() { // from class: zendesk.android.internal.proactivemessaging.ProactiveMessagingManager.1.1
                    public final Object emit(boolean z11, c<? super Unit> cVar) {
                        ProactiveMessagingManager proactiveMessagingManager2 = proactiveMessagingManager;
                        if (z11) {
                            proactiveMessagingManager2.resume();
                        } else {
                            proactiveMessagingManager2.pause();
                        }
                        return Unit.f26487a;
                    }

                    @Override // y80.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, c cVar) {
                        return emit(((Boolean) obj2).booleanValue(), (c<? super Unit>) cVar);
                    }
                };
                this.label = 1;
                if (iVarIsInForeground.collect(jVar, this) == aVar) {
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

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TriggerType.values().length];
            try {
                iArr[TriggerType.ON_PAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TriggerType.LOAD_PAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TriggerType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: zendesk.android.internal.proactivemessaging.ProactiveMessagingManager$hasActiveConversations$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.internal.proactivemessaging.ProactiveMessagingManager", f = "ProactiveMessagingManager.kt", l = {103}, m = "hasActiveConversations")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C01941 extends z70.c {
        int label;
        /* synthetic */ Object result;

        public C01941(c<? super C01941> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProactiveMessagingManager.this.hasActiveConversations(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.android.internal.proactivemessaging.ProactiveMessagingManager$reportToCts$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.internal.proactivemessaging.ProactiveMessagingManager", f = "ProactiveMessagingManager.kt", l = {AppConstants.PERMISSIONS_REQUEST_CALL_PHONE, 208, 217, AppConstants.GPS_SETTINGS}, m = "reportToCts")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C01951 extends z70.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C01951(c<? super C01951> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProactiveMessagingManager.this.reportToCts(null, this);
        }
    }

    public ProactiveMessagingManager(@NotNull ProcessLifecycleEventObserver processLifecycleEventObserver, @NotNull b0 b0Var, @NotNull LocaleProvider localeProvider, @NotNull VisitTypeProvider visitTypeProvider, @NotNull ConversationKit conversationKit, @NotNull ProactiveMessagingRepository proactiveMessagingRepository, @NotNull Function0<Long> function0, @NotNull ProactiveMessagingAnalyticsManager proactiveMessagingAnalyticsManager) {
        processLifecycleEventObserver.getClass();
        b0Var.getClass();
        localeProvider.getClass();
        visitTypeProvider.getClass();
        conversationKit.getClass();
        proactiveMessagingRepository.getClass();
        function0.getClass();
        proactiveMessagingAnalyticsManager.getClass();
        this.processLifecycleEventObserver = processLifecycleEventObserver;
        this.coroutineScope = b0Var;
        this.localeProvider = localeProvider;
        this.visitTypeProvider = visitTypeProvider;
        this.conversationKit = conversationKit;
        this.proactiveMessagingRepository = proactiveMessagingRepository;
        this.currentTimeProvider = function0;
        this.evaluationStatesByPageView = new LinkedHashMap();
        f0.B(b0Var, null, null, new AnonymousClass1(null), 3);
        proactiveMessagingAnalyticsManager.subscribe();
    }

    private final boolean areAllJobsCompleted(PageView event) {
        if (this.evaluationStatesByPageView.get(event) == null || !(!r5.isEmpty())) {
            return true;
        }
        Iterator<T> it = this.evaluationStatesByPageView.keySet().iterator();
        boolean z11 = true;
        while (it.hasNext()) {
            List<EvaluationState> list = this.evaluationStatesByPageView.get((PageView) it.next());
            if (list != null) {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    z11 = ((EvaluationState) it2.next()).getJob().a0() && z11;
                }
            }
        }
        return z11;
    }

    private final void clearAllTimers() {
        stopAllTimers();
        this.evaluationStatesByPageView.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object evaluateTrigger(Trigger trigger, List<EvaluationResult> list, PageView pageView, c<? super Unit> cVar) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[trigger.getType().ordinal()];
        if (i11 == 1) {
            EvaluationState evaluationState = new EvaluationState(list, f0.B(this.coroutineScope, null, null, new ProactiveMessagingManager$evaluateTrigger$job$1(trigger, this, list, null), 3), ((Number) this.currentTimeProvider.invoke()).longValue(), 0L, 8, null);
            List<EvaluationState> arrayList = this.evaluationStatesByPageView.get(pageView);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(evaluationState);
            this.evaluationStatesByPageView.put(pageView, arrayList);
        } else {
            if (i11 == 2) {
                Object objReportToCts = reportToCts(list, cVar);
                return objReportToCts == a.COROUTINE_SUSPENDED ? objReportToCts : Unit.f26487a;
            }
            if (i11 != 3) {
                e40.a.f();
                return null;
            }
            Logger.d(LOG_TAG, "TriggerType UNKNOWN", new Object[0]);
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hasActiveConversations(x70.c<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof zendesk.android.internal.proactivemessaging.ProactiveMessagingManager.C01941
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.android.internal.proactivemessaging.ProactiveMessagingManager$hasActiveConversations$1 r0 = (zendesk.android.internal.proactivemessaging.ProactiveMessagingManager.C01941) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.android.internal.proactivemessaging.ProactiveMessagingManager$hasActiveConversations$1 r0 = new zendesk.android.internal.proactivemessaging.ProactiveMessagingManager$hasActiveConversations$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2f
            if (r2 != r4) goto L28
            ba0.g.M(r6)
            goto L3d
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
        L2d:
            r6 = 0
            return r6
        L2f:
            ba0.g.M(r6)
            zendesk.conversationkit.android.ConversationKit r6 = r5.conversationKit
            r0.label = r4
            java.lang.Object r6 = r6.getConversations(r3, r4, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            zendesk.conversationkit.android.ConversationKitResult r6 = (zendesk.conversationkit.android.ConversationKitResult) r6
            boolean r0 = r6 instanceof zendesk.conversationkit.android.ConversationKitResult.Failure
            if (r0 == 0) goto L44
            goto L85
        L44:
            boolean r0 = r6 instanceof zendesk.conversationkit.android.ConversationKitResult.Success
            if (r0 == 0) goto L8a
            zendesk.conversationkit.android.ConversationKitResult$Success r6 = (zendesk.conversationkit.android.ConversationKitResult.Success) r6
            java.lang.Object r6 = r6.getValue()
            zendesk.conversationkit.android.model.ConversationsPagination r6 = (zendesk.conversationkit.android.model.ConversationsPagination) r6
            java.util.List r6 = r6.getConversations()
            zendesk.android.internal.proactivemessaging.ProactiveMessagingManager$hasActiveConversations$$inlined$sortedByDescending$1 r0 = new zendesk.android.internal.proactivemessaging.ProactiveMessagingManager$hasActiveConversations$$inlined$sortedByDescending$1
            r0.<init>()
            java.util.List r6 = kotlin.collections.CollectionsKt.l0(r6, r0)
            r0 = 10
            java.util.List r6 = kotlin.collections.CollectionsKt.m0(r6, r0)
            if (r6 == 0) goto L6c
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L6c
            goto L85
        L6c:
            java.util.Iterator r6 = r6.iterator()
        L70:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r0 = r6.next()
            zendesk.conversationkit.android.model.Conversation r0 = (zendesk.conversationkit.android.model.Conversation) r0
            zendesk.conversationkit.android.model.ConversationStatus r0 = r0.getStatus()
            zendesk.conversationkit.android.model.ConversationStatus r1 = zendesk.conversationkit.android.model.ConversationStatus.ACTIVE
            if (r0 != r1) goto L70
            r3 = r4
        L85:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L8a:
            e40.a.f()
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.android.internal.proactivemessaging.ProactiveMessagingManager.hasActiveConversations(x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pause() {
        Logger.d(LOG_TAG, "Paused", new Object[0]);
        stopAllTimers();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r13 == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0128, code lost:
    
        if (r13.addProactiveMessage(r12, r0) == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reportToCts(java.util.List<zendesk.android.internal.proactivemessaging.EvaluationResult> r12, x70.c<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.android.internal.proactivemessaging.ProactiveMessagingManager.reportToCts(java.util.List, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resume() {
        Logger.d(LOG_TAG, "Resumed", new Object[0]);
        resumeAllTimers();
    }

    private final void resumeAllTimers() {
        Iterator<T> it = this.evaluationStatesByPageView.keySet().iterator();
        while (it.hasNext()) {
            List<EvaluationState> list = this.evaluationStatesByPageView.get((PageView) it.next());
            if (list != null) {
                for (EvaluationState evaluationState : list) {
                    if (evaluationState.getRemainingSeconds() > 0) {
                        evaluationState.setJob(f0.B(this.coroutineScope, null, null, new ProactiveMessagingManager$resumeAllTimers$1$1$1(evaluationState, this, null), 3));
                    }
                }
            }
        }
    }

    private final void stopAllTimers() {
        Campaign campaign;
        Trigger trigger;
        Integer duration;
        Iterator<T> it = this.evaluationStatesByPageView.keySet().iterator();
        while (it.hasNext()) {
            List<EvaluationState> list = this.evaluationStatesByPageView.get((PageView) it.next());
            if (list != null) {
                for (EvaluationState evaluationState : list) {
                    long jLongValue = ((Number) this.currentTimeProvider.invoke()).longValue() - evaluationState.getStartTime();
                    EvaluationResult evaluationResult = (EvaluationResult) CollectionsKt.firstOrNull(evaluationState.getEvaluationResults());
                    evaluationState.setRemainingSeconds((TimeUnit.SECONDS.toMillis((evaluationResult == null || (campaign = evaluationResult.getCampaign()) == null || (trigger = campaign.getTrigger()) == null || (duration = trigger.getDuration()) == null) ? 0L : duration.intValue()) - jLongValue) / 1000);
                    evaluationState.getJob().a(null);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
    
        if (r10 == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object evaluate$zendesk_zendesk_android(@org.jetbrains.annotations.NotNull zendesk.android.pageviewevents.PageView r9, @org.jetbrains.annotations.NotNull x70.c<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.android.internal.proactivemessaging.ProactiveMessagingManager.evaluate$zendesk_zendesk_android(zendesk.android.pageviewevents.PageView, x70.c):java.lang.Object");
    }

    @NotNull
    public final Map<PageView, List<EvaluationState>> getEvaluationStatesByPageView$zendesk_zendesk_android() {
        return this.evaluationStatesByPageView;
    }

    public static /* synthetic */ void getEvaluationStatesByPageView$zendesk_zendesk_android$annotations() {
    }
}
