package zendesk.conversationkit.android.internal;

import com.app.tgtg.model.local.AppConstants;
import com.braze.h2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import y80.a2;
import y80.f1;
import y80.j;
import y80.r;
import y80.y1;
import zendesk.conversationkit.android.ConnectionStatus;
import zendesk.conversationkit.android.ConversationKitEvent;
import zendesk.conversationkit.android.ConversationKitEventListener;
import zendesk.conversationkit.android.ConversationKitSettings;
import zendesk.conversationkit.android.internal.Action;
import zendesk.conversationkit.android.internal.attachments.AttachmentDownloader;
import zendesk.conversationkit.android.model.Config;
import zendesk.conversationkit.android.model.User;
import zendesk.logger.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 Q2\u00020\u0001:\u0001QBI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\u001a0\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b!\u0010 J\r\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&H\u0086@¢\u0006\u0004\b'\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010)H\u0086@¢\u0006\u0004\b*\u0010(J$\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-\"\u0004\b\u0000\u0010+2\u0006\u0010,\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0017H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00105\u001a\u00020\u00172\u0006\u00102\u001a\u00020\fH\u0000¢\u0006\u0004\b3\u00104J\u001d\u00108\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002060\u0014H\u0000¢\u0006\u0004\b7\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010=R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010>R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010?R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010@R$\u0010B\u001a\u00020\f2\u0006\u0010A\u001a\u00020\f8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bB\u0010>\u001a\u0004\bC\u0010DR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001d0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020I0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020I0L8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P¨\u0006R"}, d2 = {"Lzendesk/conversationkit/android/internal/ConversationKitStore;", "Lzendesk/conversationkit/android/internal/ActionDispatcher;", "Lzendesk/conversationkit/android/ConversationKitSettings;", "conversationKitSettings", "Lzendesk/conversationkit/android/model/Config;", "config", "Lzendesk/conversationkit/android/internal/EffectProcessor;", "effectProcessor", "Lv80/b0;", "coroutineScope", "Lzendesk/conversationkit/android/internal/ConversationKitDispatchers;", "conversationKitDispatchers", "Lzendesk/conversationkit/android/internal/AccessLevel;", "initialAccessLevel", "Lzendesk/conversationkit/android/internal/ConnectivityObserver;", "connectivityObserver", "Lzendesk/conversationkit/android/internal/attachments/AttachmentDownloader;", "attachmentDownloader", "<init>", "(Lzendesk/conversationkit/android/ConversationKitSettings;Lzendesk/conversationkit/android/model/Config;Lzendesk/conversationkit/android/internal/EffectProcessor;Lv80/b0;Lzendesk/conversationkit/android/internal/ConversationKitDispatchers;Lzendesk/conversationkit/android/internal/AccessLevel;Lzendesk/conversationkit/android/internal/ConnectivityObserver;Lzendesk/conversationkit/android/internal/attachments/AttachmentDownloader;)V", "", "Lzendesk/conversationkit/android/ConversationKitEvent$ConnectionStatusChanged;", "events", "", "updateConnectionStatus", "(Ljava/util/List;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/Action;", "launchAll", "(Ljava/util/List;)V", "Lzendesk/conversationkit/android/ConversationKitEventListener;", "listener", "addEventListener", "(Lzendesk/conversationkit/android/ConversationKitEventListener;)V", "removeEventListener", "getSettings", "()Lzendesk/conversationkit/android/ConversationKitSettings;", "getConfig", "()Lzendesk/conversationkit/android/model/Config;", "", "getClientId", "(Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/model/User;", "getCurrentUser", "T", "action", "Lzendesk/conversationkit/android/ConversationKitResult;", "dispatch", "(Lzendesk/conversationkit/android/internal/Action;Lx70/c;)Ljava/lang/Object;", "invalidate", "()V", "newAccessLevel", "changeAccessLevel$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/AccessLevel;)V", "changeAccessLevel", "Lzendesk/conversationkit/android/ConversationKitEvent;", "notifyAllEventListeners$zendesk_conversationkit_conversationkit_android", "notifyAllEventListeners", "Lzendesk/conversationkit/android/ConversationKitSettings;", "Lzendesk/conversationkit/android/model/Config;", "Lzendesk/conversationkit/android/internal/EffectProcessor;", "Lv80/b0;", "Lzendesk/conversationkit/android/internal/ConversationKitDispatchers;", "Lzendesk/conversationkit/android/internal/AccessLevel;", "Lzendesk/conversationkit/android/internal/ConnectivityObserver;", "Lzendesk/conversationkit/android/internal/attachments/AttachmentDownloader;", "value", "accessLevel", "getAccessLevel$zendesk_conversationkit_conversationkit_android", "()Lzendesk/conversationkit/android/internal/AccessLevel;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "listeners", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ly80/f1;", "Lzendesk/conversationkit/android/ConnectionStatus;", "_connectionStatusFlow", "Ly80/f1;", "Ly80/y1;", "connectionStatusFlow", "Ly80/y1;", "getConnectionStatusFlow", "()Ly80/y1;", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationKitStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationKitStore.kt\nzendesk/conversationkit/android/internal/ConversationKitStore\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,223:1\n1#2:224\n808#3,11:225\n827#3:236\n855#3,2:237\n1869#3:239\n1870#3:245\n1869#3,2:246\n230#4,5:240\n*S KotlinDebug\n*F\n+ 1 ConversationKitStore.kt\nzendesk/conversationkit/android/internal/ConversationKitStore\n*L\n153#1:225,11\n176#1:236\n176#1:237,2\n180#1:239\n180#1:245\n216#1:246,2\n181#1:240,5\n*E\n"})
public final class ConversationKitStore implements ActionDispatcher {

    @NotNull
    private static final String LOG_TAG = "ConversationKitStore";

    @NotNull
    private final f1 _connectionStatusFlow;

    @NotNull
    private AccessLevel accessLevel;

    @NotNull
    private final AttachmentDownloader attachmentDownloader;

    @NotNull
    private final Config config;

    @NotNull
    private final y1 connectionStatusFlow;

    @NotNull
    private final ConnectivityObserver connectivityObserver;

    @NotNull
    private final ConversationKitDispatchers conversationKitDispatchers;

    @NotNull
    private final ConversationKitSettings conversationKitSettings;

    @NotNull
    private final b0 coroutineScope;

    @NotNull
    private final EffectProcessor effectProcessor;

    @NotNull
    private final AccessLevel initialAccessLevel;

    @NotNull
    private final ConcurrentLinkedQueue<ConversationKitEventListener> listeners;

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.ConversationKitStore$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.conversationkit.android.internal.ConversationKitStore$1", f = "ConversationKitStore.kt", l = {64}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass1 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        public AnonymousClass1(x70.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationKitStore.this.new AnonymousClass1(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                y80.i iVarObserveNetworkState = ConversationKitStore.this.connectivityObserver.observeNetworkState();
                final ConversationKitStore conversationKitStore = ConversationKitStore.this;
                j jVar = new j() { // from class: zendesk.conversationkit.android.internal.ConversationKitStore.1.1
                    public final Object emit(ConnectionStatus connectionStatus, x70.c<? super Unit> cVar) {
                        Object objDispatch = conversationKitStore.dispatch(new Action.NetworkConnectionStatusUpdate(connectionStatus), cVar);
                        return objDispatch == y70.a.COROUTINE_SUSPENDED ? objDispatch : Unit.f26487a;
                    }

                    @Override // y80.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, x70.c cVar) {
                        return emit((ConnectionStatus) obj2, (x70.c<? super Unit>) cVar);
                    }
                };
                this.label = 1;
                if (iVarObserveNetworkState.collect(jVar, this) == aVar) {
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

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.ConversationKitStore$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.conversationkit.android.internal.ConversationKitStore$2", f = "ConversationKitStore.kt", l = {69}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass2 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        public AnonymousClass2(x70.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationKitStore.this.new AnonymousClass2(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                y80.i attachmentChannel = ConversationKitStore.this.attachmentDownloader.getAttachmentChannel();
                final ConversationKitStore conversationKitStore = ConversationKitStore.this;
                j jVar = new j() { // from class: zendesk.conversationkit.android.internal.ConversationKitStore.2.1
                    public final Object emit(Action action, x70.c<? super Unit> cVar) {
                        Object objDispatch = conversationKitStore.dispatch(action, cVar);
                        return objDispatch == y70.a.COROUTINE_SUSPENDED ? objDispatch : Unit.f26487a;
                    }

                    @Override // y80.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, x70.c cVar) {
                        return emit((Action) obj2, (x70.c<? super Unit>) cVar);
                    }
                };
                this.label = 1;
                if (attachmentChannel.collect(jVar, this) == aVar) {
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

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.ConversationKitStore$dispatch$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.conversationkit.android.internal.ConversationKitStore", f = "ConversationKitStore.kt", l = {146, AppConstants.CONTACT_US_REQUEST_FILE, 152, 156, 165}, m = "dispatch")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02101<T> extends z70.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C02101(x70.c<? super C02101> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationKitStore.this.dispatch(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.ConversationKitStore$dispatch$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.conversationkit.android.internal.ConversationKitStore$dispatch$3", f = "ConversationKitStore.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nConversationKitStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationKitStore.kt\nzendesk/conversationkit/android/internal/ConversationKitStore$dispatch$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,223:1\n827#2:224\n855#2,2:225\n*S KotlinDebug\n*F\n+ 1 ConversationKitStore.kt\nzendesk/conversationkit/android/internal/ConversationKitStore$dispatch$3\n*L\n158#1:224\n158#1:225,2\n*E\n"})
    public static final class AnonymousClass3 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ EffectProcessorResult $effectResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(EffectProcessorResult effectProcessorResult, x70.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$effectResult = effectProcessorResult;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationKitStore.this.new AnonymousClass3(this.$effectResult, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass3) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
            ConversationKitStore conversationKitStore = ConversationKitStore.this;
            List<ConversationKitEvent> events = this.$effectResult.getEvents();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : events) {
                if (!(((ConversationKitEvent) obj2) instanceof ConversationKitEvent.ConnectionStatusChanged)) {
                    arrayList.add(obj2);
                }
            }
            conversationKitStore.notifyAllEventListeners$zendesk_conversationkit_conversationkit_android(arrayList);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.ConversationKitStore$updateConnectionStatus$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.conversationkit.android.internal.ConversationKitStore", f = "ConversationKitStore.kt", l = {177}, m = "updateConnectionStatus")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02111 extends z70.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C02111(x70.c<? super C02111> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationKitStore.this.updateConnectionStatus(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.ConversationKitStore$updateConnectionStatus$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.conversationkit.android.internal.ConversationKitStore$updateConnectionStatus$2", f = "ConversationKitStore.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C02122 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ List<ConversationKitEvent.ConnectionStatusChanged> $newStatusEvents;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02122(List<ConversationKitEvent.ConnectionStatusChanged> list, x70.c<? super C02122> cVar) {
            super(2, cVar);
            this.$newStatusEvents = list;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationKitStore.this.new C02122(this.$newStatusEvents, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C02122) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
            ConversationKitStore.this.notifyAllEventListeners$zendesk_conversationkit_conversationkit_android(this.$newStatusEvents);
            return Unit.f26487a;
        }
    }

    public ConversationKitStore(@NotNull ConversationKitSettings conversationKitSettings, @NotNull Config config, @NotNull EffectProcessor effectProcessor, @NotNull b0 b0Var, @NotNull ConversationKitDispatchers conversationKitDispatchers, @NotNull AccessLevel accessLevel, @NotNull ConnectivityObserver connectivityObserver, @NotNull AttachmentDownloader attachmentDownloader) {
        conversationKitSettings.getClass();
        config.getClass();
        effectProcessor.getClass();
        b0Var.getClass();
        conversationKitDispatchers.getClass();
        accessLevel.getClass();
        connectivityObserver.getClass();
        attachmentDownloader.getClass();
        this.conversationKitSettings = conversationKitSettings;
        this.config = config;
        this.effectProcessor = effectProcessor;
        this.coroutineScope = b0Var;
        this.conversationKitDispatchers = conversationKitDispatchers;
        this.initialAccessLevel = accessLevel;
        this.connectivityObserver = connectivityObserver;
        this.attachmentDownloader = attachmentDownloader;
        this.accessLevel = accessLevel;
        this.listeners = new ConcurrentLinkedQueue<>();
        a2 a2VarC = r.c(ConnectionStatus.DISCONNECTED);
        this._connectionStatusFlow = a2VarC;
        this.connectionStatusFlow = a2VarC;
        f0.B(b0Var, null, null, new AnonymousClass1(null), 3);
        f0.B(b0Var, null, null, new AnonymousClass2(null), 3);
    }

    private final void launchAll(List<? extends Action> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            f0.B(this.coroutineScope, null, null, new ConversationKitStore$launchAll$1$1(this, (Action) it.next(), null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeEventListener$lambda$0(ConversationKitEventListener conversationKitEventListener, ConversationKitEventListener conversationKitEventListener2) {
        return Intrinsics.areEqual(conversationKitEventListener2, conversationKitEventListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateConnectionStatus(java.util.List<zendesk.conversationkit.android.ConversationKitEvent.ConnectionStatusChanged> r8, x70.c<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof zendesk.conversationkit.android.internal.ConversationKitStore.C02111
            if (r0 == 0) goto L13
            r0 = r9
            zendesk.conversationkit.android.internal.ConversationKitStore$updateConnectionStatus$1 r0 = (zendesk.conversationkit.android.internal.ConversationKitStore.C02111) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.ConversationKitStore$updateConnectionStatus$1 r0 = new zendesk.conversationkit.android.internal.ConversationKitStore$updateConnectionStatus$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r8 = r0.L$0
            java.util.List r8 = (java.util.List) r8
            ba0.g.M(r9)
            goto L73
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L32:
            ba0.g.M(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r2 = r8.iterator()
        L3e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L5c
            java.lang.Object r4 = r2.next()
            r5 = r4
            zendesk.conversationkit.android.ConversationKitEvent$ConnectionStatusChanged r5 = (zendesk.conversationkit.android.ConversationKitEvent.ConnectionStatusChanged) r5
            zendesk.conversationkit.android.ConnectionStatus r5 = r5.getConnectionStatus()
            y80.y1 r6 = r7.connectionStatusFlow
            java.lang.Object r6 = r6.getValue()
            if (r5 != r6) goto L58
            goto L3e
        L58:
            r9.add(r4)
            goto L3e
        L5c:
            zendesk.conversationkit.android.internal.ConversationKitDispatchers r2 = r7.conversationKitDispatchers
            v80.x r2 = r2.main()
            zendesk.conversationkit.android.internal.ConversationKitStore$updateConnectionStatus$2 r4 = new zendesk.conversationkit.android.internal.ConversationKitStore$updateConnectionStatus$2
            r5 = 0
            r4.<init>(r9, r5)
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r9 = v80.f0.K(r2, r4, r0)
            if (r9 != r1) goto L73
            return r1
        L73:
            java.util.Iterator r8 = r8.iterator()
        L77:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L9a
            java.lang.Object r9 = r8.next()
            zendesk.conversationkit.android.ConversationKitEvent$ConnectionStatusChanged r9 = (zendesk.conversationkit.android.ConversationKitEvent.ConnectionStatusChanged) r9
            y80.f1 r0 = r7._connectionStatusFlow
        L85:
            r1 = r0
            y80.a2 r1 = (y80.a2) r1
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            zendesk.conversationkit.android.ConnectionStatus r3 = (zendesk.conversationkit.android.ConnectionStatus) r3
            zendesk.conversationkit.android.ConnectionStatus r3 = r9.getConnectionStatus()
            boolean r1 = r1.g(r2, r3)
            if (r1 == 0) goto L85
            goto L77
        L9a:
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.ConversationKitStore.updateConnectionStatus(java.util.List, x70.c):java.lang.Object");
    }

    public final void addEventListener(@NotNull ConversationKitEventListener listener) {
        listener.getClass();
        this.listeners.add(listener);
    }

    public final void changeAccessLevel$zendesk_conversationkit_conversationkit_android(@NotNull AccessLevel newAccessLevel) {
        newAccessLevel.getClass();
        Logger.d(LOG_TAG, e0.f.k("Changing access level to ", newAccessLevel.getLogName()), new Object[0]);
        this.accessLevel = newAccessLevel;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2 A[PHI: r10
      0x00d2: PHI (r10v9 zendesk.conversationkit.android.internal.EffectProcessorResult) = 
      (r10v8 zendesk.conversationkit.android.internal.EffectProcessorResult)
      (r10v19 zendesk.conversationkit.android.internal.EffectProcessorResult)
     binds: [B:49:0x00cf, B:19:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // zendesk.conversationkit.android.internal.ActionDispatcher
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.lang.Object dispatch(@org.jetbrains.annotations.NotNull zendesk.conversationkit.android.internal.Action r10, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.ConversationKitResult<? extends T>> r11) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.ConversationKitStore.dispatch(zendesk.conversationkit.android.internal.Action, x70.c):java.lang.Object");
    }

    @NotNull
    /* JADX INFO: renamed from: getAccessLevel$zendesk_conversationkit_conversationkit_android, reason: from getter */
    public final AccessLevel getAccessLevel() {
        return this.accessLevel;
    }

    @Nullable
    public final Object getClientId(@NotNull x70.c<? super String> cVar) {
        return this.accessLevel.getClientId(cVar);
    }

    @NotNull
    public final Config getConfig() {
        return this.config;
    }

    @NotNull
    public final y1 getConnectionStatusFlow() {
        return this.connectionStatusFlow;
    }

    @Nullable
    public final Object getCurrentUser(@NotNull x70.c<? super User> cVar) {
        return this.accessLevel.getCurrentUser(cVar);
    }

    @NotNull
    /* JADX INFO: renamed from: getSettings, reason: from getter */
    public final ConversationKitSettings getConversationKitSettings() {
        return this.conversationKitSettings;
    }

    @Override // zendesk.conversationkit.android.internal.ActionDispatcher
    public void invalidate() {
        this.accessLevel.invalidate();
        this.listeners.clear();
    }

    public final void notifyAllEventListeners$zendesk_conversationkit_conversationkit_android(@NotNull List<? extends ConversationKitEvent> events) {
        events.getClass();
        for (ConversationKitEvent conversationKitEvent : events) {
            Iterator<ConversationKitEventListener> it = this.listeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().onEvent(conversationKitEvent);
            }
        }
    }

    public final void removeEventListener(@NotNull ConversationKitEventListener listener) {
        listener.getClass();
        ConcurrentLinkedQueue<ConversationKitEventListener> concurrentLinkedQueue = this.listeners;
        b bVar = new b(listener, 22);
        concurrentLinkedQueue.getClass();
        i0.u(concurrentLinkedQueue, bVar, true);
    }

    public /* synthetic */ ConversationKitStore(ConversationKitSettings conversationKitSettings, Config config, EffectProcessor effectProcessor, b0 b0Var, ConversationKitDispatchers conversationKitDispatchers, AccessLevel accessLevel, ConnectivityObserver connectivityObserver, AttachmentDownloader attachmentDownloader, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(conversationKitSettings, config, effectProcessor, b0Var, (i11 & 16) != 0 ? new DefaultConversationKitDispatchers() : conversationKitDispatchers, accessLevel, connectivityObserver, attachmentDownloader);
    }
}
