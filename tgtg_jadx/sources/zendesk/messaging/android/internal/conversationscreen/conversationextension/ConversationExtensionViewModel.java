package zendesk.messaging.android.internal.conversationscreen.conversationextension;

import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import ba0.g;
import com.braze.h2;
import com.google.android.gms.internal.measurement.cg;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import v80.b0;
import v80.f0;
import x80.m;
import y80.a2;
import y80.f1;
import y80.h1;
import y80.i;
import y80.r;
import y80.x1;
import y80.y1;
import z70.e;
import zendesk.core.ui.android.internal.model.MessageActionSize;
import zendesk.core.ui.android.internal.model.MessageSourceType;
import zendesk.messaging.android.internal.analytics.AnalyticsEventType;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;
import zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionAction;
import zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionEvent;
import zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionState;
import zendesk.messaging.android.internal.events.MessagingEventDispatcher;
import zendesk.messaging.android.internal.model.MessagingTheme;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u000eJ\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020-008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionViewModel;", "Landroidx/lifecycle/l1;", "Landroidx/lifecycle/c1;", "savedStateHandle", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionState;", "initialState", "Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;", "analyticsProcessor", "Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "messagingEventDispatcher", "<init>", "(Landroidx/lifecycle/c1;Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionState;Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;)V", "", "sendConversationExtensionDisplayedEvent", "()V", "", "size", "getAnalyticSizeValue", "(Ljava/lang/String;)Ljava/lang/String;", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction$Load;", "action", "processLoad", "(Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction$Load;)V", "processBack", "", "shouldUpdateBackStack", "(Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionState;)Z", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction$RefreshTheme;", "updateTheme", "(Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction$RefreshTheme;)V", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction;", "process", "(Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionAction;)V", "Landroidx/lifecycle/c1;", "Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;", "Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "Ly80/f1;", "_conversationExtensionState", "Ly80/f1;", "Ly80/y1;", "conversationExtensionState", "Ly80/y1;", "getConversationExtensionState", "()Ly80/y1;", "Lx80/m;", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionEvent;", "_eventsChannel", "Lx80/m;", "Ly80/i;", "eventsChannel", "Ly80/i;", "getEventsChannel", "()Ly80/i;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationExtensionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationExtensionViewModel.kt\nzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,215:1\n230#2,5:216\n230#2,5:221\n230#2,5:226\n230#2,5:231\n230#2,5:236\n230#2,5:241\n*S KotlinDebug\n*F\n+ 1 ConversationExtensionViewModel.kt\nzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionViewModel\n*L\n89#1:216,5\n95#1:221,5\n117#1:226,5\n166#1:231,5\n186#1:236,5\n209#1:241,5\n*E\n"})
public final class ConversationExtensionViewModel extends l1 {

    @NotNull
    private final f1 _conversationExtensionState;

    @NotNull
    private final m _eventsChannel;

    @NotNull
    private final AnalyticsProcessor analyticsProcessor;

    @NotNull
    private final y1 conversationExtensionState;

    @NotNull
    private final i eventsChannel;

    @NotNull
    private final MessagingEventDispatcher messagingEventDispatcher;

    @NotNull
    private final c1 savedStateHandle;

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionViewModel$process$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionViewModel$process$3", f = "ConversationExtensionViewModel.kt", l = {108}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass3 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        public AnonymousClass3(x70.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationExtensionViewModel.this.new AnonymousClass3(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass3) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                m mVar = ConversationExtensionViewModel.this._eventsChannel;
                ConversationExtensionEvent.Close close = ConversationExtensionEvent.Close.INSTANCE;
                this.label = 1;
                if (mVar.f(close, this) == aVar) {
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionViewModel$processBack$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionViewModel$processBack$2", f = "ConversationExtensionViewModel.kt", l = {198}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass2 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        public AnonymousClass2(x70.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationExtensionViewModel.this.new AnonymousClass2(cVar);
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
                g.M(obj);
                m mVar = ConversationExtensionViewModel.this._eventsChannel;
                ConversationExtensionEvent.Close close = ConversationExtensionEvent.Close.INSTANCE;
                this.label = 1;
                if (mVar.f(close, this) == aVar) {
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionViewModel$sendConversationExtensionDisplayedEvent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionViewModel$sendConversationExtensionDisplayedEvent$1", f = "ConversationExtensionViewModel.kt", l = {138}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass1 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ String $size;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, x70.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$size = str;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationExtensionViewModel.this.new AnonymousClass1(this.$size, cVar);
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
                g.M(obj);
                AnalyticsProcessor analyticsProcessor = ConversationExtensionViewModel.this.analyticsProcessor;
                String str = (String) ConversationExtensionViewModel.this.savedStateHandle.a(ConversationExtensionBottomSheetFragment.ARG_CONVERSATION_EXTENSION_LAUNCH_TYPE);
                if (str == null) {
                    str = "";
                }
                AnalyticsEventType.ConversationExtensionDisplayed conversationExtensionDisplayed = new AnalyticsEventType.ConversationExtensionDisplayed(str, ConversationExtensionViewModel.this.getAnalyticSizeValue(this.$size));
                this.label = 1;
                if (analyticsProcessor.process(conversationExtensionDisplayed, this) == aVar) {
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

    public ConversationExtensionViewModel(@NotNull c1 c1Var, @NotNull ConversationExtensionState conversationExtensionState, @NotNull AnalyticsProcessor analyticsProcessor, @NotNull MessagingEventDispatcher messagingEventDispatcher) {
        c1Var.getClass();
        conversationExtensionState.getClass();
        analyticsProcessor.getClass();
        messagingEventDispatcher.getClass();
        this.savedStateHandle = c1Var;
        this.analyticsProcessor = analyticsProcessor;
        this.messagingEventDispatcher = messagingEventDispatcher;
        a2 a2VarC = r.c(conversationExtensionState);
        this._conversationExtensionState = a2VarC;
        this.conversationExtensionState = r.x(new h1(a2VarC), m1.d(this), new x1(0L, LongCompanionObject.MAX_VALUE), a2VarC.getValue());
        x80.i iVarA = cg.a(0, null, null, 7);
        this._eventsChannel = iVarA;
        this.eventsChannel = r.w(iVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAnalyticSizeValue(String size) {
        try {
            return MessageActionSize.valueOf(size).getAnalyticsValue();
        } catch (IllegalArgumentException unused) {
            return "";
        }
    }

    private final void processBack() {
        a2 a2Var;
        Object value;
        ConversationExtensionState conversationExtensionState;
        String str = (String) CollectionsKt.X(((ConversationExtensionState) ((a2) this._conversationExtensionState).getValue()).getBackStack());
        if (str == null) {
            f0.B(m1.d(this), null, null, new AnonymousClass2(null), 3);
            return;
        }
        List listK = CollectionsKt.K(((ConversationExtensionState) ((a2) this._conversationExtensionState).getValue()).getBackStack());
        f1 f1Var = this._conversationExtensionState;
        do {
            a2Var = (a2) f1Var;
            value = a2Var.getValue();
            conversationExtensionState = (ConversationExtensionState) value;
        } while (!a2Var.g(value, new ConversationExtensionState.Idle(listK, str, conversationExtensionState.getSize(), conversationExtensionState.getMessagingTheme(), conversationExtensionState.getTitle())));
        process(new ConversationExtensionAction.Load(str));
    }

    private final void processLoad(ConversationExtensionAction.Load action) {
        a2 a2Var;
        Object value;
        ConversationExtensionState conversationExtensionState;
        f1 f1Var = this._conversationExtensionState;
        do {
            a2Var = (a2) f1Var;
            value = a2Var.getValue();
            conversationExtensionState = (ConversationExtensionState) value;
        } while (!a2Var.g(value, new ConversationExtensionState.Loading((!shouldUpdateBackStack(conversationExtensionState) || Intrinsics.areEqual(conversationExtensionState.getUrl(), action.getUrl())) ? conversationExtensionState.getBackStack() : CollectionsKt.e0(conversationExtensionState.getBackStack(), conversationExtensionState.getUrl()), action.getUrl(), conversationExtensionState.getSize(), conversationExtensionState.getMessagingTheme(), conversationExtensionState.getTitle())));
    }

    private final void sendConversationExtensionDisplayedEvent() {
        String str = (String) this.savedStateHandle.a(ConversationExtensionBottomSheetFragment.ARG_CONVERSATION_EXTENSION_SIZE);
        if (str == null) {
            str = "";
        }
        MessageSourceType.Companion companion = MessageSourceType.INSTANCE;
        String str2 = (String) this.savedStateHandle.a(ConversationExtensionBottomSheetFragment.ARG_CONVERSATION_EXTENSION_SOURCE);
        if (str2 == null) {
            str2 = "";
        }
        if (companion.findByValue(str2) != MessageSourceType.SURVEY) {
            f0.B(m1.d(this), null, null, new AnonymousClass1(str, null), 3);
            String str3 = (String) this.savedStateHandle.a(ConversationExtensionBottomSheetFragment.ARG_CONVERSATION_EXTENSION_CONVERSATION_ID);
            String str4 = str3 == null ? "" : str3;
            if (str4.length() > 0) {
                MessagingEventDispatcher messagingEventDispatcher = this.messagingEventDispatcher;
                String str5 = (String) this.savedStateHandle.a(ConversationExtensionBottomSheetFragment.ARG_CONVERSATION_EXTENSION_URL);
                MessagingEventDispatcher.handleConversationExtensionDisplayedEvent$zendesk_messaging_messaging_android$default(messagingEventDispatcher, null, 0L, str4, str5 == null ? "" : str5, 3, null);
            }
        }
    }

    private final boolean shouldUpdateBackStack(ConversationExtensionState conversationExtensionState) {
        return conversationExtensionState instanceof ConversationExtensionState.Success;
    }

    private final void updateTheme(ConversationExtensionAction.RefreshTheme action) {
        a2 a2Var;
        Object value;
        if (Intrinsics.areEqual(action.getTheme(), ((ConversationExtensionState) this.conversationExtensionState.getValue()).getMessagingTheme())) {
            return;
        }
        f1 f1Var = this._conversationExtensionState;
        do {
            a2Var = (a2) f1Var;
            value = a2Var.getValue();
        } while (!a2Var.g(value, ConversationExtensionState.sealedCopy$default((ConversationExtensionState) value, null, null, null, action.getTheme(), null, 23, null)));
    }

    @NotNull
    public final y1 getConversationExtensionState() {
        return this.conversationExtensionState;
    }

    @NotNull
    public final i getEventsChannel() {
        return this.eventsChannel;
    }

    public final void process(@NotNull ConversationExtensionAction action) {
        a2 a2Var;
        Object value;
        ConversationExtensionState conversationExtensionState;
        a2 a2Var2;
        Object value2;
        ConversationExtensionState conversationExtensionState2;
        a2 a2Var3;
        Object value3;
        ConversationExtensionState conversationExtensionState3;
        String title;
        action.getClass();
        if (Intrinsics.areEqual(action, ConversationExtensionAction.Back.INSTANCE)) {
            processBack();
            return;
        }
        if (action instanceof ConversationExtensionAction.Load) {
            processLoad((ConversationExtensionAction.Load) action);
            return;
        }
        if (action instanceof ConversationExtensionAction.RefreshTheme) {
            updateTheme((ConversationExtensionAction.RefreshTheme) action);
            return;
        }
        if (Intrinsics.areEqual(action, ConversationExtensionAction.Reload.INSTANCE)) {
            process(new ConversationExtensionAction.Load(((ConversationExtensionState) this.conversationExtensionState.getValue()).getUrl()));
            return;
        }
        if (action instanceof ConversationExtensionAction.UpdateTitle) {
            f1 f1Var = this._conversationExtensionState;
            do {
                a2Var3 = (a2) f1Var;
                value3 = a2Var3.getValue();
                conversationExtensionState3 = (ConversationExtensionState) value3;
                title = ((ConversationExtensionAction.UpdateTitle) action).getTitle();
                if (title == null) {
                    title = "";
                }
            } while (!a2Var3.g(value3, ConversationExtensionState.sealedCopy$default(conversationExtensionState3, null, null, null, null, title, 15, null)));
            return;
        }
        if (Intrinsics.areEqual(action, ConversationExtensionAction.WebViewError.INSTANCE)) {
            f1 f1Var2 = this._conversationExtensionState;
            do {
                a2Var2 = (a2) f1Var2;
                value2 = a2Var2.getValue();
                conversationExtensionState2 = (ConversationExtensionState) value2;
            } while (!a2Var2.g(value2, new ConversationExtensionState.Error(conversationExtensionState2.getBackStack(), conversationExtensionState2.getUrl(), conversationExtensionState2.getSize(), conversationExtensionState2.getMessagingTheme(), "")));
            return;
        }
        if (Intrinsics.areEqual(action, ConversationExtensionAction.Close.INSTANCE)) {
            f0.B(m1.d(this), null, null, new AnonymousClass3(null), 3);
            return;
        }
        if (action instanceof ConversationExtensionAction.UpdateUrl) {
            process(new ConversationExtensionAction.Load(((ConversationExtensionAction.UpdateUrl) action).getUrl()));
            return;
        }
        if (!Intrinsics.areEqual(action, ConversationExtensionAction.LoadingComplete.INSTANCE)) {
            e40.a.f();
            return;
        }
        f1 f1Var3 = this._conversationExtensionState;
        do {
            a2Var = (a2) f1Var3;
            value = a2Var.getValue();
            conversationExtensionState = (ConversationExtensionState) value;
        } while (!a2Var.g(value, new ConversationExtensionState.Success(conversationExtensionState.getBackStack(), conversationExtensionState.getUrl(), conversationExtensionState.getSize(), conversationExtensionState.getMessagingTheme(), conversationExtensionState.getTitle())));
        sendConversationExtensionDisplayedEvent();
    }

    public ConversationExtensionViewModel(c1 c1Var, ConversationExtensionState conversationExtensionState, AnalyticsProcessor analyticsProcessor, MessagingEventDispatcher messagingEventDispatcher, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 2) != 0) {
            n0 n0Var = n0.f26529a;
            String str = (String) c1Var.a(ConversationExtensionBottomSheetFragment.ARG_CONVERSATION_EXTENSION_URL);
            String str2 = str == null ? "" : str;
            String str3 = (String) c1Var.a(ConversationExtensionBottomSheetFragment.ARG_CONVERSATION_EXTENSION_SIZE);
            conversationExtensionState = new ConversationExtensionState.Idle(n0Var, str2, str3 == null ? "" : str3, MessagingTheme.INSTANCE.getDEFAULT(), "");
        }
        this(c1Var, conversationExtensionState, analyticsProcessor, messagingEventDispatcher);
    }
}
