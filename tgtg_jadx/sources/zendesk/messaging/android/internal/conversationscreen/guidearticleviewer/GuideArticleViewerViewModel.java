package zendesk.messaging.android.internal.conversationscreen.guidearticleviewer;

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
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import v80.b0;
import v80.f0;
import x70.c;
import x80.m;
import y80.a2;
import y80.f1;
import y80.h1;
import y80.i;
import y80.r;
import y80.y1;
import z70.e;
import zendesk.guidekit.android.GuideKit;
import zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerAction;
import zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerEvent;
import zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerState;
import zendesk.messaging.android.internal.events.MessagingEventDispatcher;
import zendesk.messaging.android.internal.model.MessagingTheme;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001.B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00132\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\n*\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020&0)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerViewModel;", "Landroidx/lifecycle/l1;", "Lzendesk/guidekit/android/GuideKit;", "guideKit", "Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "messagingEventDispatcher", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerState;", "initialState", "<init>", "(Lzendesk/guidekit/android/GuideKit;Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerState;)V", "", "isRestrictedArticle", "", "loadArticle", "(Z)V", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerAction$RefreshTheme;", "action", "updateTheme", "(Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerAction$RefreshTheme;)V", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerAction$Load;", "loadGuideArticle", "(Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerAction$Load;Z)V", "shouldUpdateBackStack", "(Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerState;)Z", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerAction;", "process", "(Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerAction;)V", "Lzendesk/guidekit/android/GuideKit;", "Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "Ly80/f1;", "_articleViewerState", "Ly80/f1;", "Ly80/y1;", "articleViewerState", "Ly80/y1;", "getArticleViewerState", "()Ly80/y1;", "Lx80/m;", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerEvent;", "_eventsChannel", "Lx80/m;", "Ly80/i;", "eventsChannel", "Ly80/i;", "getEventsChannel", "()Ly80/i;", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGuideArticleViewerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuideArticleViewerViewModel.kt\nzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,209:1\n230#2,5:210\n230#2,5:215\n*S KotlinDebug\n*F\n+ 1 GuideArticleViewerViewModel.kt\nzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerViewModel\n*L\n111#1:210,5\n133#1:215,5\n*E\n"})
public final class GuideArticleViewerViewModel extends l1 {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String LOG_TAG = "GuideArticleVM";

    @NotNull
    private final f1 _articleViewerState;

    @NotNull
    private final m _eventsChannel;

    @NotNull
    private final y1 articleViewerState;

    @NotNull
    private final i eventsChannel;

    @NotNull
    private final GuideKit guideKit;

    @NotNull
    private final MessagingEventDispatcher messagingEventDispatcher;

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel$loadArticle$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel$loadArticle$2", f = "GuideArticleViewerViewModel.kt", l = {126}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass2 extends z70.i implements Function2<b0, c<? super Unit>, Object> {
        int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return GuideArticleViewerViewModel.this.new AnonymousClass2(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                m mVar = GuideArticleViewerViewModel.this._eventsChannel;
                GuideArticleViewerEvent.Close close = GuideArticleViewerEvent.Close.INSTANCE;
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel$loadGuideArticle$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel$loadGuideArticle$1", f = "GuideArticleViewerViewModel.kt", l = {146, 163}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nGuideArticleViewerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuideArticleViewerViewModel.kt\nzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerViewModel$loadGuideArticle$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,209:1\n230#2,5:210\n230#2,5:215\n*S KotlinDebug\n*F\n+ 1 GuideArticleViewerViewModel.kt\nzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerViewModel$loadGuideArticle$1\n*L\n152#1:210,5\n190#1:215,5\n*E\n"})
    public static final class AnonymousClass1 extends z70.i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ GuideArticleViewerAction.Load $action;
        final /* synthetic */ boolean $isRestrictedArticle;
        Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel$loadGuideArticle$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @e(c = "zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel$loadGuideArticle$1$2", f = "GuideArticleViewerViewModel.kt", l = {177, 179}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
        public static final class AnonymousClass2 extends z70.i implements Function2<b0, c<? super Unit>, Object> {
            final /* synthetic */ GuideArticleViewerAction.Load $action;
            int label;
            final /* synthetic */ GuideArticleViewerViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(GuideArticleViewerViewModel guideArticleViewerViewModel, GuideArticleViewerAction.Load load, c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.this$0 = guideArticleViewerViewModel;
                this.$action = load;
            }

            @Override // z70.a
            public final c<Unit> create(Object obj, c<?> cVar) {
                return new AnonymousClass2(this.this$0, this.$action, cVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
                return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
            
                if (r8.f(r1, r7) == r0) goto L17;
             */
            @Override // z70.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    y70.a r0 = y70.a.COROUTINE_SUSPENDED
                    int r1 = r7.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1b
                    if (r1 == r3) goto L17
                    if (r1 != r2) goto L10
                    ba0.g.M(r8)
                    goto L64
                L10:
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    com.braze.h2.b(r8)
                    r8 = 0
                    return r8
                L17:
                    ba0.g.M(r8)
                    goto L38
                L1b:
                    ba0.g.M(r8)
                    zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel r8 = r7.this$0
                    x80.m r8 = zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel.access$get_eventsChannel$p(r8)
                    zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerEvent$LoadUrlInBrowser r1 = new zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerEvent$LoadUrlInBrowser
                    zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerAction$Load r4 = r7.$action
                    java.lang.String r4 = r4.getUrl()
                    r1.<init>(r4)
                    r7.label = r3
                    java.lang.Object r8 = r8.f(r1, r7)
                    if (r8 != r0) goto L38
                    goto L5e
                L38:
                    zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel r8 = r7.this$0
                    y80.y1 r8 = r8.getArticleViewerState()
                    java.lang.Object r8 = r8.getValue()
                    zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerState r8 = (zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerState) r8
                    java.util.List r8 = r8.getBackStack()
                    boolean r8 = r8.isEmpty()
                    zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel r1 = r7.this$0
                    if (r8 == 0) goto L5f
                    x80.m r8 = zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel.access$get_eventsChannel$p(r1)
                    zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerEvent$Close r1 = zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerEvent.Close.INSTANCE
                    r7.label = r2
                    java.lang.Object r8 = r8.f(r1, r7)
                    if (r8 != r0) goto L64
                L5e:
                    return r0
                L5f:
                    zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerAction$BackRestrictedArticle r8 = zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerAction.BackRestrictedArticle.INSTANCE
                    r1.process(r8)
                L64:
                    zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel r8 = r7.this$0
                    zendesk.messaging.android.internal.events.MessagingEventDispatcher r0 = zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel.access$getMessagingEventDispatcher$p(r8)
                    zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerAction$Load r8 = r7.$action
                    java.lang.String r4 = r8.getUrl()
                    r5 = 3
                    r6 = 0
                    r1 = 0
                    r2 = 0
                    zendesk.messaging.android.internal.events.MessagingEventDispatcher.handleArticleClickedBrowserEvent$zendesk_messaging_messaging_android$default(r0, r1, r2, r4, r5, r6)
                    kotlin.Unit r8 = kotlin.Unit.f26487a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel.AnonymousClass1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GuideArticleViewerAction.Load load, boolean z11, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$action = load;
            this.$isRestrictedArticle = z11;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return GuideArticleViewerViewModel.this.new AnonymousClass1(this.$action, this.$isRestrictedArticle, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00ea A[Catch: Exception -> 0x0024, RestrictedArticleException -> 0x013a, TryCatch #2 {RestrictedArticleException -> 0x013a, Exception -> 0x0024, blocks: (B:7:0x0018, B:35:0x00e6, B:37:0x00ea, B:41:0x00fd, B:14:0x0032, B:20:0x0078, B:21:0x0084, B:25:0x009f, B:29:0x00a8, B:31:0x00bf, B:17:0x0040), top: B:50:0x000a }] */
        @Override // z70.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 337
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel$process$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel$process$1", f = "GuideArticleViewerViewModel.kt", l = {65, 80}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nGuideArticleViewerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuideArticleViewerViewModel.kt\nzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerViewModel$process$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,209:1\n230#2,5:210\n*S KotlinDebug\n*F\n+ 1 GuideArticleViewerViewModel.kt\nzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerViewModel$process$1\n*L\n66#1:210,5\n*E\n"})
    public static final class C04361 extends z70.i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ GuideArticleViewerAction $action;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04361(GuideArticleViewerAction guideArticleViewerAction, c<? super C04361> cVar) {
            super(2, cVar);
            this.$action = guideArticleViewerAction;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return GuideArticleViewerViewModel.this.new C04361(this.$action, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((C04361) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00b1, code lost:
        
            if (r11.f(r1, r10) == r0) goto L26;
         */
        @Override // z70.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                y70.a r0 = y70.a.COROUTINE_SUSPENDED
                int r1 = r10.label
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L1c
                if (r1 == r2) goto L18
                if (r1 != r3) goto L11
                ba0.g.M(r11)
                goto Lb4
            L11:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r11)
                r11 = 0
                return r11
            L18:
                ba0.g.M(r11)
                goto L37
            L1c:
                ba0.g.M(r11)
                zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel r11 = zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel.this
                zendesk.guidekit.android.GuideKit r11 = zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel.access$getGuideKit$p(r11)
                zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerAction r1 = r10.$action
                zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerAction$Load r1 = (zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerAction.Load) r1
                java.lang.String r1 = r1.getUrl()
                r10.label = r2
                java.lang.Object r11 = r11.isValidGuideUrl(r1, r10)
                if (r11 != r0) goto L37
                goto Lb3
            L37:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel r1 = zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel.this
                if (r11 == 0) goto L9a
                y80.f1 r11 = zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel.access$get_articleViewerState$p(r1)
                zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerAction r2 = r10.$action
                zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel r4 = zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel.this
            L49:
                r0 = r11
                y80.a2 r0 = (y80.a2) r0
                java.lang.Object r1 = r0.getValue()
                r5 = r1
                zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerState r5 = (zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerState) r5
                java.lang.String r6 = r5.getUrl()
                r7 = r2
                zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerAction$Load r7 = (zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerAction.Load) r7
                java.lang.String r8 = r7.getUrl()
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r8)
                zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerState$Loading r8 = new zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerState$Loading
                boolean r9 = zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel.access$shouldUpdateBackStack(r4, r5)
                if (r9 == 0) goto L79
                if (r6 != 0) goto L79
                java.util.List r6 = r5.getBackStack()
                java.lang.String r9 = r5.getUrl()
                java.util.ArrayList r6 = kotlin.collections.CollectionsKt.e0(r6, r9)
                goto L7d
            L79:
                java.util.List r6 = r5.getBackStack()
            L7d:
                java.lang.String r7 = r7.getUrl()
                zendesk.messaging.android.internal.model.MessagingTheme r5 = r5.getMessagingTheme()
                r8.<init>(r6, r7, r5)
                boolean r0 = r0.g(r1, r8)
                if (r0 == 0) goto L49
                zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel r11 = zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel.this
                zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerAction r0 = r10.$action
                zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerAction$Load r0 = (zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerAction.Load) r0
                r1 = 0
                r2 = 0
                zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel.loadGuideArticle$default(r11, r0, r1, r3, r2)
                goto Lb4
            L9a:
                x80.m r11 = zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel.access$get_eventsChannel$p(r1)
                zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerEvent$LoadUrlInBrowser r1 = new zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerEvent$LoadUrlInBrowser
                zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerAction r2 = r10.$action
                zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerAction$Load r2 = (zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerAction.Load) r2
                java.lang.String r2 = r2.getUrl()
                r1.<init>(r2)
                r10.label = r3
                java.lang.Object r11 = r11.f(r1, r10)
                if (r11 != r0) goto Lb4
            Lb3:
                return r0
            Lb4:
                kotlin.Unit r11 = kotlin.Unit.f26487a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel.C04361.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel$process$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel$process$2", f = "GuideArticleViewerViewModel.kt", l = {95}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04372 extends z70.i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ GuideArticleViewerAction $action;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04372(GuideArticleViewerAction guideArticleViewerAction, c<? super C04372> cVar) {
            super(2, cVar);
            this.$action = guideArticleViewerAction;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return GuideArticleViewerViewModel.this.new C04372(this.$action, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((C04372) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                m mVar = GuideArticleViewerViewModel.this._eventsChannel;
                GuideArticleViewerEvent.LoadUrlInBrowser loadUrlInBrowser = new GuideArticleViewerEvent.LoadUrlInBrowser(((GuideArticleViewerAction.OpenAttachment) this.$action).getAttachment().getContentUrl());
                this.label = 1;
                if (mVar.f(loadUrlInBrowser, this) == aVar) {
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel$process$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel$process$3", f = "GuideArticleViewerViewModel.kt", l = {101}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass3 extends z70.i implements Function2<b0, c<? super Unit>, Object> {
        int label;

        public AnonymousClass3(c<? super AnonymousClass3> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return GuideArticleViewerViewModel.this.new AnonymousClass3(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((AnonymousClass3) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                m mVar = GuideArticleViewerViewModel.this._eventsChannel;
                GuideArticleViewerEvent.ShareUrl shareUrl = new GuideArticleViewerEvent.ShareUrl(((GuideArticleViewerState) GuideArticleViewerViewModel.this.getArticleViewerState().getValue()).getUrl());
                this.label = 1;
                if (mVar.f(shareUrl, this) == aVar) {
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

    public GuideArticleViewerViewModel(@NotNull GuideKit guideKit, @NotNull MessagingEventDispatcher messagingEventDispatcher, @NotNull GuideArticleViewerState guideArticleViewerState) {
        guideKit.getClass();
        messagingEventDispatcher.getClass();
        guideArticleViewerState.getClass();
        this.guideKit = guideKit;
        this.messagingEventDispatcher = messagingEventDispatcher;
        a2 a2VarC = r.c(guideArticleViewerState);
        this._articleViewerState = a2VarC;
        this.articleViewerState = new h1(a2VarC);
        x80.i iVarA = cg.a(0, null, null, 7);
        this._eventsChannel = iVarA;
        this.eventsChannel = r.w(iVarA);
    }

    private final void loadArticle(boolean isRestrictedArticle) {
        a2 a2Var;
        Object value;
        String str = (String) CollectionsKt.X(((GuideArticleViewerState) this.articleViewerState.getValue()).getBackStack());
        if (str == null) {
            f0.B(m1.d(this), null, null, new AnonymousClass2(null), 3);
            return;
        }
        List listK = CollectionsKt.K(((GuideArticleViewerState) this.articleViewerState.getValue()).getBackStack());
        f1 f1Var = this._articleViewerState;
        do {
            a2Var = (a2) f1Var;
            value = a2Var.getValue();
        } while (!a2Var.g(value, new GuideArticleViewerState.Idle(listK, str, ((GuideArticleViewerState) value).getMessagingTheme())));
        loadGuideArticle(new GuideArticleViewerAction.Load(str), isRestrictedArticle);
    }

    private final void loadGuideArticle(GuideArticleViewerAction.Load action, boolean isRestrictedArticle) {
        f0.B(m1.d(this), null, null, new AnonymousClass1(action, isRestrictedArticle, null), 3);
    }

    public static /* synthetic */ void loadGuideArticle$default(GuideArticleViewerViewModel guideArticleViewerViewModel, GuideArticleViewerAction.Load load, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        guideArticleViewerViewModel.loadGuideArticle(load, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldUpdateBackStack(GuideArticleViewerState guideArticleViewerState) {
        return guideArticleViewerState instanceof GuideArticleViewerState.SuccessGuideArticle;
    }

    private final void updateTheme(GuideArticleViewerAction.RefreshTheme action) {
        a2 a2Var;
        Object value;
        if (Intrinsics.areEqual(action.getTheme(), ((GuideArticleViewerState) this.articleViewerState.getValue()).getMessagingTheme())) {
            return;
        }
        f1 f1Var = this._articleViewerState;
        do {
            a2Var = (a2) f1Var;
            value = a2Var.getValue();
        } while (!a2Var.g(value, GuideArticleViewerState.sealedCopy$default((GuideArticleViewerState) value, null, null, action.getTheme(), 3, null)));
    }

    @NotNull
    public final y1 getArticleViewerState() {
        return this.articleViewerState;
    }

    @NotNull
    public final i getEventsChannel() {
        return this.eventsChannel;
    }

    public final void process(@NotNull GuideArticleViewerAction action) {
        action.getClass();
        if (Intrinsics.areEqual(action, GuideArticleViewerAction.Back.INSTANCE)) {
            loadArticle(false);
            return;
        }
        if (Intrinsics.areEqual(action, GuideArticleViewerAction.BackRestrictedArticle.INSTANCE)) {
            loadArticle(true);
            return;
        }
        if (action instanceof GuideArticleViewerAction.Load) {
            f0.B(m1.d(this), null, null, new C04361(action, null), 3);
            return;
        }
        if (action instanceof GuideArticleViewerAction.RefreshTheme) {
            updateTheme((GuideArticleViewerAction.RefreshTheme) action);
            return;
        }
        if (Intrinsics.areEqual(action, GuideArticleViewerAction.Reload.INSTANCE)) {
            process(new GuideArticleViewerAction.Load(((GuideArticleViewerState) this.articleViewerState.getValue()).getUrl()));
            return;
        }
        if (action instanceof GuideArticleViewerAction.OpenAttachment) {
            f0.B(m1.d(this), null, null, new C04372(action, null), 3);
        } else if (Intrinsics.areEqual(action, GuideArticleViewerAction.Share.INSTANCE)) {
            f0.B(m1.d(this), null, null, new AnonymousClass3(null), 3);
        } else {
            e40.a.f();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerViewModel$Companion;", "", "<init>", "()V", "LOG_TAG", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public GuideArticleViewerViewModel(GuideKit guideKit, MessagingEventDispatcher messagingEventDispatcher, GuideArticleViewerState guideArticleViewerState, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(guideKit, messagingEventDispatcher, (i11 & 4) != 0 ? new GuideArticleViewerState.Idle(n0.f26529a, "", MessagingTheme.INSTANCE.getDEFAULT()) : guideArticleViewerState);
    }
}
