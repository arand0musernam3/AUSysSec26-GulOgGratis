package zendesk.android.internal.frontendevents.pageviewevents;

import ba0.g;
import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import v80.x;
import x70.c;
import y70.a;
import z70.e;
import z70.i;
import zendesk.android.ZendeskResult;
import zendesk.android.internal.di.ZendeskInitializedComponentScope;
import zendesk.android.internal.frontendevents.FrontendEventsRepository;
import zendesk.android.internal.proactivemessaging.ProactiveMessagingManager;
import zendesk.android.pageviewevents.PageView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@ZendeskInitializedComponentScope
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B#\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0014"}, d2 = {"Lzendesk/android/internal/frontendevents/pageviewevents/DefaultPageViewEvents;", "Lzendesk/android/internal/frontendevents/pageviewevents/PageViewEvents;", "Lzendesk/android/internal/frontendevents/FrontendEventsRepository;", "frontendEventsRepository", "Lv80/x;", "ioDispatcher", "Lzendesk/android/internal/proactivemessaging/ProactiveMessagingManager;", "proactiveMessagingManager", "<init>", "(Lzendesk/android/internal/frontendevents/FrontendEventsRepository;Lv80/x;Lzendesk/android/internal/proactivemessaging/ProactiveMessagingManager;)V", "Lzendesk/android/pageviewevents/PageView;", "pageView", "Lzendesk/android/ZendeskResult;", "", "", "sendPageViewEvent", "(Lzendesk/android/pageviewevents/PageView;Lx70/c;)Ljava/lang/Object;", "Lzendesk/android/internal/frontendevents/FrontendEventsRepository;", "Lv80/x;", "Lzendesk/android/internal/proactivemessaging/ProactiveMessagingManager;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultPageViewEvents implements PageViewEvents {

    @NotNull
    private final FrontendEventsRepository frontendEventsRepository;

    @NotNull
    private final x ioDispatcher;

    @NotNull
    private final ProactiveMessagingManager proactiveMessagingManager;

    /* JADX INFO: renamed from: zendesk.android.internal.frontendevents.pageviewevents.DefaultPageViewEvents$sendPageViewEvent$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.internal.frontendevents.pageviewevents.DefaultPageViewEvents$sendPageViewEvent$2", f = "DefaultPageViewEvents.kt", l = {23, 24}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv80/b0;", "Lzendesk/android/ZendeskResult;", "", "", "<anonymous>", "(Lv80/b0;)Lzendesk/android/ZendeskResult;"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass2 extends i implements Function2<b0, c<? super ZendeskResult<? extends Unit, ? extends Throwable>>, Object> {
        final /* synthetic */ PageView $pageView;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PageView pageView, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$pageView = pageView;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return DefaultPageViewEvents.this.new AnonymousClass2(this.$pageView, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super ZendeskResult<Unit, ? extends Throwable>> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                FrontendEventsRepository frontendEventsRepository = DefaultPageViewEvents.this.frontendEventsRepository;
                PageView pageView = this.$pageView;
                this.label = 1;
                obj = frontendEventsRepository.sendPageViewEvent(pageView, this);
                if (obj != aVar) {
                }
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ZendeskResult zendeskResult = (ZendeskResult) this.L$0;
                g.M(obj);
                return zendeskResult;
            }
            g.M(obj);
            ZendeskResult zendeskResult2 = (ZendeskResult) obj;
            ProactiveMessagingManager proactiveMessagingManager = DefaultPageViewEvents.this.proactiveMessagingManager;
            PageView pageView2 = this.$pageView;
            this.L$0 = zendeskResult2;
            this.label = 2;
            return proactiveMessagingManager.evaluate$zendesk_zendesk_android(pageView2, this) == aVar ? aVar : zendeskResult2;
        }
    }

    public DefaultPageViewEvents(@NotNull FrontendEventsRepository frontendEventsRepository, @NotNull x xVar, @NotNull ProactiveMessagingManager proactiveMessagingManager) {
        frontendEventsRepository.getClass();
        xVar.getClass();
        proactiveMessagingManager.getClass();
        this.frontendEventsRepository = frontendEventsRepository;
        this.ioDispatcher = xVar;
        this.proactiveMessagingManager = proactiveMessagingManager;
    }

    @Override // zendesk.android.internal.frontendevents.pageviewevents.PageViewEvents
    @Nullable
    public Object sendPageViewEvent(@NotNull PageView pageView, @NotNull c<? super ZendeskResult<Unit, ? extends Throwable>> cVar) {
        return f0.K(this.ioDispatcher, new AnonymousClass2(pageView, null), cVar);
    }
}
