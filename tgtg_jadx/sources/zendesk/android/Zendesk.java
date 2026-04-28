package zendesk.android;

import a90.p;
import android.content.Context;
import ba0.g;
import com.app.tgtg.model.local.AppConstants;
import com.braze.h2;
import e90.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.d2;
import v80.f0;
import v80.p0;
import v80.r;
import x70.c;
import z70.e;
import z70.i;
import zendesk.android.ZendeskResult;
import zendesk.android.events.ZendeskEventListener;
import zendesk.android.events.internal.ZendeskEventDispatcher;
import zendesk.android.internal.NotInitializedConversationKit;
import zendesk.android.internal.di.ZendeskInitializedComponentScope;
import zendesk.android.internal.frontendevents.pageviewevents.NotInitializedPageViewEvents;
import zendesk.android.internal.frontendevents.pageviewevents.PageViewEvents;
import zendesk.android.messaging.Messaging;
import zendesk.android.messaging.MessagingFactory;
import zendesk.android.messaging.internal.NotInitializedMessaging;
import zendesk.android.pageviewevents.PageView;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.logger.Logger;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@ZendeskInitializedComponentScope
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B1\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0012J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ\u001c\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00180\u0016H\u0086@¢\u0006\u0004\b \u0010!J)\u0010 \u001a\u00020\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001d¢\u0006\u0004\b \u0010\"J1\u0010%\u001a\u00020\u00102\u0006\u0010$\u001a\u00020#2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001d¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0017H\u0086@¢\u0006\u0004\b'\u0010!J\u001d\u0010'\u001a\u00020\u00102\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001b¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010,R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010-R$\u0010\u0003\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lzendesk/android/Zendesk;", "", "Lzendesk/android/messaging/Messaging;", AnalyticsProcessor.CHANNEL, "Lv80/b0;", "scope", "Lzendesk/android/events/internal/ZendeskEventDispatcher;", "eventDispatcher", "Lzendesk/conversationkit/android/ConversationKit;", "conversationKit", "Lzendesk/android/internal/frontendevents/pageviewevents/PageViewEvents;", "pageViewEvents", "<init>", "(Lzendesk/android/messaging/Messaging;Lv80/b0;Lzendesk/android/events/internal/ZendeskEventDispatcher;Lzendesk/conversationkit/android/ConversationKit;Lzendesk/android/internal/frontendevents/pageviewevents/PageViewEvents;)V", "Lzendesk/android/events/ZendeskEventListener;", "listener", "", "addEventListener", "(Lzendesk/android/events/ZendeskEventListener;)V", "removeEventListener", "", "jwt", "Lzendesk/android/ZendeskResult;", "Lzendesk/android/ZendeskUser;", "", "loginUser", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lzendesk/android/SuccessCallback;", "successCallback", "Lzendesk/android/FailureCallback;", "failureCallback", "(Ljava/lang/String;Lzendesk/android/SuccessCallback;Lzendesk/android/FailureCallback;)V", "logoutUser", "(Lx70/c;)Ljava/lang/Object;", "(Lzendesk/android/SuccessCallback;Lzendesk/android/FailureCallback;)V", "Lzendesk/android/pageviewevents/PageView;", "pageView", "sendPageView", "(Lzendesk/android/pageviewevents/PageView;Lzendesk/android/SuccessCallback;Lzendesk/android/FailureCallback;)V", "getCurrentUser", "(Lzendesk/android/SuccessCallback;)V", "scope$1", "Lv80/b0;", "Lzendesk/android/events/internal/ZendeskEventDispatcher;", "Lzendesk/conversationkit/android/ConversationKit;", "Lzendesk/android/internal/frontendevents/pageviewevents/PageViewEvents;", "value", "Lzendesk/android/messaging/Messaging;", "getMessaging", "()Lzendesk/android/messaging/Messaging;", "Companion", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Zendesk {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String LOG_TAG = "Zendesk";

    @Nullable
    private static ZendeskAuthenticationDelegate authenticationDelegate;

    @NotNull
    private static final e90.a initializeMutex;

    @NotNull
    private static b0 scope;

    @NotNull
    private static final r supervisorJob;

    /* JADX INFO: renamed from: zendesk, reason: collision with root package name */
    @Nullable
    private static Zendesk f47528zendesk;

    @NotNull
    private ConversationKit conversationKit;

    @NotNull
    private final ZendeskEventDispatcher eventDispatcher;

    @NotNull
    private Messaging messaging;

    @NotNull
    private PageViewEvents pageViewEvents;

    /* JADX INFO: renamed from: scope$1, reason: from kotlin metadata */
    @NotNull
    private final b0 scope;

    /* JADX INFO: renamed from: zendesk.android.Zendesk$addEventListener$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.Zendesk$addEventListener$1", f = "Zendesk.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass1 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ ZendeskEventListener $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ZendeskEventListener zendeskEventListener, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$listener = zendeskEventListener;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return Zendesk.this.new AnonymousClass1(this.$listener, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            Zendesk.this.eventDispatcher.addEventListener(this.$listener);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.android.Zendesk$getCurrentUser$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.Zendesk", f = "Zendesk.kt", l = {AppConstants.PERMISSIONS_REQUEST_CALL_PHONE}, m = "getCurrentUser")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C01831 extends z70.c {
        int label;
        /* synthetic */ Object result;

        public C01831(c<? super C01831> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Zendesk.this.getCurrentUser(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.android.Zendesk$getCurrentUser$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.Zendesk$getCurrentUser$2", f = "Zendesk.kt", l = {216, 217}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass2 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ SuccessCallback<ZendeskUser> $successCallback;
        int label;

        /* JADX INFO: renamed from: zendesk.android.Zendesk$getCurrentUser$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @e(c = "zendesk.android.Zendesk$getCurrentUser$2$1", f = "Zendesk.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
        public static final class AnonymousClass1 extends i implements Function2<b0, c<? super Unit>, Object> {
            final /* synthetic */ SuccessCallback<ZendeskUser> $successCallback;
            final /* synthetic */ ZendeskUser $user;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SuccessCallback<ZendeskUser> successCallback, ZendeskUser zendeskUser, c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.$successCallback = successCallback;
                this.$user = zendeskUser;
            }

            @Override // z70.a
            public final c<Unit> create(Object obj, c<?> cVar) {
                return new AnonymousClass1(this.$successCallback, this.$user, cVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
                return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
            }

            @Override // z70.a
            public final Object invokeSuspend(Object obj) {
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
                this.$successCallback.onSuccess(this.$user);
                return Unit.f26487a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SuccessCallback<ZendeskUser> successCallback, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$successCallback = successCallback;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return Zendesk.this.new AnonymousClass2(this.$successCallback, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        
            if (v80.f0.K(r1, r4, r6) == r0) goto L15;
         */
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
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1b
                if (r1 == r4) goto L17
                if (r1 != r3) goto L11
                ba0.g.M(r7)
                goto L3f
            L11:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r7)
                return r2
            L17:
                ba0.g.M(r7)
                goto L29
            L1b:
                ba0.g.M(r7)
                zendesk.android.Zendesk r7 = zendesk.android.Zendesk.this
                r6.label = r4
                java.lang.Object r7 = r7.getCurrentUser(r6)
                if (r7 != r0) goto L29
                goto L3e
            L29:
                zendesk.android.ZendeskUser r7 = (zendesk.android.ZendeskUser) r7
                c90.f r1 = v80.p0.f42144a
                w80.c r1 = a90.p.f1044a
                zendesk.android.Zendesk$getCurrentUser$2$1 r4 = new zendesk.android.Zendesk$getCurrentUser$2$1
                zendesk.android.SuccessCallback<zendesk.android.ZendeskUser> r5 = r6.$successCallback
                r4.<init>(r5, r7, r2)
                r6.label = r3
                java.lang.Object r7 = v80.f0.K(r1, r4, r6)
                if (r7 != r0) goto L3f
            L3e:
                return r0
            L3f:
                kotlin.Unit r7 = kotlin.Unit.f26487a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.android.Zendesk.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zendesk.android.Zendesk$loginUser$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.Zendesk", f = "Zendesk.kt", l = {108}, m = "loginUser")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C01841 extends z70.c {
        int label;
        /* synthetic */ Object result;

        public C01841(c<? super C01841> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Zendesk.this.loginUser(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.android.Zendesk$loginUser$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.Zendesk$loginUser$2", f = "Zendesk.kt", l = {127, 128}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C01852 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ FailureCallback<Throwable> $failureCallback;
        final /* synthetic */ String $jwt;
        final /* synthetic */ SuccessCallback<ZendeskUser> $successCallback;
        int label;

        /* JADX INFO: renamed from: zendesk.android.Zendesk$loginUser$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @e(c = "zendesk.android.Zendesk$loginUser$2$1", f = "Zendesk.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
        public static final class AnonymousClass1 extends i implements Function2<b0, c<? super Unit>, Object> {
            final /* synthetic */ FailureCallback<Throwable> $failureCallback;
            final /* synthetic */ ZendeskResult<ZendeskUser, Throwable> $result;
            final /* synthetic */ SuccessCallback<ZendeskUser> $successCallback;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(ZendeskResult<ZendeskUser, ? extends Throwable> zendeskResult, FailureCallback<Throwable> failureCallback, SuccessCallback<ZendeskUser> successCallback, c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.$result = zendeskResult;
                this.$failureCallback = failureCallback;
                this.$successCallback = successCallback;
            }

            @Override // z70.a
            public final c<Unit> create(Object obj, c<?> cVar) {
                return new AnonymousClass1(this.$result, this.$failureCallback, this.$successCallback, cVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
                return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
            }

            @Override // z70.a
            public final Object invokeSuspend(Object obj) {
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
                ZendeskResult<ZendeskUser, Throwable> zendeskResult = this.$result;
                if (zendeskResult instanceof ZendeskResult.Failure) {
                    this.$failureCallback.onFailure((Throwable) ((ZendeskResult.Failure) zendeskResult).getError());
                } else {
                    if (!(zendeskResult instanceof ZendeskResult.Success)) {
                        e40.a.f();
                        return null;
                    }
                    this.$successCallback.onSuccess((ZendeskUser) ((ZendeskResult.Success) zendeskResult).getValue());
                }
                return Unit.f26487a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01852(String str, FailureCallback<Throwable> failureCallback, SuccessCallback<ZendeskUser> successCallback, c<? super C01852> cVar) {
            super(2, cVar);
            this.$jwt = str;
            this.$failureCallback = failureCallback;
            this.$successCallback = successCallback;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return Zendesk.this.new C01852(this.$jwt, this.$failureCallback, this.$successCallback, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((C01852) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (v80.f0.K(r1, r4, r7) == r0) goto L15;
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
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1b
                if (r1 == r4) goto L17
                if (r1 != r3) goto L11
                ba0.g.M(r8)
                goto L43
            L11:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r8)
                return r2
            L17:
                ba0.g.M(r8)
                goto L2b
            L1b:
                ba0.g.M(r8)
                zendesk.android.Zendesk r8 = zendesk.android.Zendesk.this
                java.lang.String r1 = r7.$jwt
                r7.label = r4
                java.lang.Object r8 = r8.loginUser(r1, r7)
                if (r8 != r0) goto L2b
                goto L42
            L2b:
                zendesk.android.ZendeskResult r8 = (zendesk.android.ZendeskResult) r8
                c90.f r1 = v80.p0.f42144a
                w80.c r1 = a90.p.f1044a
                zendesk.android.Zendesk$loginUser$2$1 r4 = new zendesk.android.Zendesk$loginUser$2$1
                zendesk.android.FailureCallback<java.lang.Throwable> r5 = r7.$failureCallback
                zendesk.android.SuccessCallback<zendesk.android.ZendeskUser> r6 = r7.$successCallback
                r4.<init>(r8, r5, r6, r2)
                r7.label = r3
                java.lang.Object r8 = v80.f0.K(r1, r4, r7)
                if (r8 != r0) goto L43
            L42:
                return r0
            L43:
                kotlin.Unit r8 = kotlin.Unit.f26487a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.android.Zendesk.C01852.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zendesk.android.Zendesk$logoutUser$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.Zendesk", f = "Zendesk.kt", l = {145}, m = "logoutUser")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C01861 extends z70.c {
        int label;
        /* synthetic */ Object result;

        public C01861(c<? super C01861> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Zendesk.this.logoutUser(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.android.Zendesk$logoutUser$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.Zendesk$logoutUser$2", f = "Zendesk.kt", l = {163, 164}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C01872 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ FailureCallback<Throwable> $failureCallback;
        final /* synthetic */ SuccessCallback<Unit> $successCallback;
        int label;

        /* JADX INFO: renamed from: zendesk.android.Zendesk$logoutUser$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @e(c = "zendesk.android.Zendesk$logoutUser$2$1", f = "Zendesk.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
        public static final class AnonymousClass1 extends i implements Function2<b0, c<? super Unit>, Object> {
            final /* synthetic */ FailureCallback<Throwable> $failureCallback;
            final /* synthetic */ ZendeskResult<Unit, Throwable> $result;
            final /* synthetic */ SuccessCallback<Unit> $successCallback;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(ZendeskResult<Unit, ? extends Throwable> zendeskResult, FailureCallback<Throwable> failureCallback, SuccessCallback<Unit> successCallback, c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.$result = zendeskResult;
                this.$failureCallback = failureCallback;
                this.$successCallback = successCallback;
            }

            @Override // z70.a
            public final c<Unit> create(Object obj, c<?> cVar) {
                return new AnonymousClass1(this.$result, this.$failureCallback, this.$successCallback, cVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
                return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
            }

            @Override // z70.a
            public final Object invokeSuspend(Object obj) {
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
                ZendeskResult<Unit, Throwable> zendeskResult = this.$result;
                if (zendeskResult instanceof ZendeskResult.Failure) {
                    this.$failureCallback.onFailure((Throwable) ((ZendeskResult.Failure) zendeskResult).getError());
                } else {
                    if (!(zendeskResult instanceof ZendeskResult.Success)) {
                        e40.a.f();
                        return null;
                    }
                    SuccessCallback<Unit> successCallback = this.$successCallback;
                    ((ZendeskResult.Success) zendeskResult).getValue();
                    successCallback.onSuccess(Unit.f26487a);
                }
                return Unit.f26487a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01872(FailureCallback<Throwable> failureCallback, SuccessCallback<Unit> successCallback, c<? super C01872> cVar) {
            super(2, cVar);
            this.$failureCallback = failureCallback;
            this.$successCallback = successCallback;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return Zendesk.this.new C01872(this.$failureCallback, this.$successCallback, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((C01872) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            if (v80.f0.K(r1, r4, r7) == r0) goto L15;
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
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1b
                if (r1 == r4) goto L17
                if (r1 != r3) goto L11
                ba0.g.M(r8)
                goto L41
            L11:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r8)
                return r2
            L17:
                ba0.g.M(r8)
                goto L29
            L1b:
                ba0.g.M(r8)
                zendesk.android.Zendesk r8 = zendesk.android.Zendesk.this
                r7.label = r4
                java.lang.Object r8 = r8.logoutUser(r7)
                if (r8 != r0) goto L29
                goto L40
            L29:
                zendesk.android.ZendeskResult r8 = (zendesk.android.ZendeskResult) r8
                c90.f r1 = v80.p0.f42144a
                w80.c r1 = a90.p.f1044a
                zendesk.android.Zendesk$logoutUser$2$1 r4 = new zendesk.android.Zendesk$logoutUser$2$1
                zendesk.android.FailureCallback<java.lang.Throwable> r5 = r7.$failureCallback
                zendesk.android.SuccessCallback<kotlin.Unit> r6 = r7.$successCallback
                r4.<init>(r8, r5, r6, r2)
                r7.label = r3
                java.lang.Object r8 = v80.f0.K(r1, r4, r7)
                if (r8 != r0) goto L41
            L40:
                return r0
            L41:
                kotlin.Unit r8 = kotlin.Unit.f26487a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.android.Zendesk.C01872.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zendesk.android.Zendesk$removeEventListener$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.Zendesk$removeEventListener$1", f = "Zendesk.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C01881 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ ZendeskEventListener $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01881(ZendeskEventListener zendeskEventListener, c<? super C01881> cVar) {
            super(2, cVar);
            this.$listener = zendeskEventListener;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return Zendesk.this.new C01881(this.$listener, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((C01881) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            Zendesk.this.eventDispatcher.removeEventListener(this.$listener);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.android.Zendesk$sendPageView$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.Zendesk$sendPageView$1", f = "Zendesk.kt", l = {186, 187}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C01891 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ FailureCallback<Throwable> $failureCallback;
        final /* synthetic */ PageView $pageView;
        final /* synthetic */ SuccessCallback<Unit> $successCallback;
        int label;

        /* JADX INFO: renamed from: zendesk.android.Zendesk$sendPageView$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @e(c = "zendesk.android.Zendesk$sendPageView$1$1", f = "Zendesk.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
        public static final class C00291 extends i implements Function2<b0, c<? super Unit>, Object> {
            final /* synthetic */ FailureCallback<Throwable> $failureCallback;
            final /* synthetic */ ZendeskResult<Unit, Throwable> $result;
            final /* synthetic */ SuccessCallback<Unit> $successCallback;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C00291(ZendeskResult<Unit, ? extends Throwable> zendeskResult, FailureCallback<Throwable> failureCallback, SuccessCallback<Unit> successCallback, c<? super C00291> cVar) {
                super(2, cVar);
                this.$result = zendeskResult;
                this.$failureCallback = failureCallback;
                this.$successCallback = successCallback;
            }

            @Override // z70.a
            public final c<Unit> create(Object obj, c<?> cVar) {
                return new C00291(this.$result, this.$failureCallback, this.$successCallback, cVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
                return ((C00291) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
            }

            @Override // z70.a
            public final Object invokeSuspend(Object obj) {
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
                ZendeskResult<Unit, Throwable> zendeskResult = this.$result;
                if (zendeskResult instanceof ZendeskResult.Failure) {
                    this.$failureCallback.onFailure((Throwable) ((ZendeskResult.Failure) zendeskResult).getError());
                } else {
                    if (!(zendeskResult instanceof ZendeskResult.Success)) {
                        e40.a.f();
                        return null;
                    }
                    SuccessCallback<Unit> successCallback = this.$successCallback;
                    ((ZendeskResult.Success) zendeskResult).getValue();
                    successCallback.onSuccess(Unit.f26487a);
                }
                return Unit.f26487a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01891(PageView pageView, FailureCallback<Throwable> failureCallback, SuccessCallback<Unit> successCallback, c<? super C01891> cVar) {
            super(2, cVar);
            this.$pageView = pageView;
            this.$failureCallback = failureCallback;
            this.$successCallback = successCallback;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return Zendesk.this.new C01891(this.$pageView, this.$failureCallback, this.$successCallback, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((C01891) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (v80.f0.K(r1, r4, r7) == r0) goto L15;
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
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1b
                if (r1 == r4) goto L17
                if (r1 != r3) goto L11
                ba0.g.M(r8)
                goto L47
            L11:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r8)
                return r2
            L17:
                ba0.g.M(r8)
                goto L2f
            L1b:
                ba0.g.M(r8)
                zendesk.android.Zendesk r8 = zendesk.android.Zendesk.this
                zendesk.android.internal.frontendevents.pageviewevents.PageViewEvents r8 = zendesk.android.Zendesk.access$getPageViewEvents$p(r8)
                zendesk.android.pageviewevents.PageView r1 = r7.$pageView
                r7.label = r4
                java.lang.Object r8 = r8.sendPageViewEvent(r1, r7)
                if (r8 != r0) goto L2f
                goto L46
            L2f:
                zendesk.android.ZendeskResult r8 = (zendesk.android.ZendeskResult) r8
                c90.f r1 = v80.p0.f42144a
                w80.c r1 = a90.p.f1044a
                zendesk.android.Zendesk$sendPageView$1$1 r4 = new zendesk.android.Zendesk$sendPageView$1$1
                zendesk.android.FailureCallback<java.lang.Throwable> r5 = r7.$failureCallback
                zendesk.android.SuccessCallback<kotlin.Unit> r6 = r7.$successCallback
                r4.<init>(r8, r5, r6, r2)
                r7.label = r3
                java.lang.Object r8 = v80.f0.K(r1, r4, r7)
                if (r8 != r0) goto L47
            L46:
                return r0
            L47:
                kotlin.Unit r8 = kotlin.Unit.f26487a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.android.Zendesk.C01891.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        d2 d2VarD = f0.d();
        supervisorJob = d2VarD;
        scope = f0.b(p0.f42144a.plus(d2VarD));
        initializeMutex = d.a();
    }

    public Zendesk(@NotNull Messaging messaging, @NotNull b0 b0Var, @NotNull ZendeskEventDispatcher zendeskEventDispatcher, @NotNull ConversationKit conversationKit, @NotNull PageViewEvents pageViewEvents) {
        messaging.getClass();
        b0Var.getClass();
        zendeskEventDispatcher.getClass();
        conversationKit.getClass();
        pageViewEvents.getClass();
        this.scope = b0Var;
        this.eventDispatcher = zendeskEventDispatcher;
        this.conversationKit = conversationKit;
        this.pageViewEvents = pageViewEvents;
        this.messaging = messaging;
    }

    @NotNull
    public static final Zendesk getInstance() {
        return INSTANCE.getInstance();
    }

    public static final void initialize(@NotNull Context context, @NotNull String str, @NotNull SuccessCallback<Zendesk> successCallback, @NotNull FailureCallback<Throwable> failureCallback, @Nullable MessagingFactory messagingFactory) {
        INSTANCE.initialize(context, str, successCallback, failureCallback, messagingFactory);
    }

    public static final void invalidate() {
        INSTANCE.invalidate();
    }

    public final void addEventListener(@NotNull ZendeskEventListener listener) {
        listener.getClass();
        f0.B(this.scope, null, null, new AnonymousClass1(listener, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getCurrentUser(@org.jetbrains.annotations.NotNull x70.c<? super zendesk.android.ZendeskUser> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof zendesk.android.Zendesk.C01831
            if (r0 == 0) goto L13
            r0 = r5
            zendesk.android.Zendesk$getCurrentUser$1 r0 = (zendesk.android.Zendesk.C01831) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.android.Zendesk$getCurrentUser$1 r0 = new zendesk.android.Zendesk$getCurrentUser$1
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
            if (r5 == 0) goto L45
            zendesk.android.ZendeskUser r5 = zendesk.android.ZendeskUserKt.toZendeskUser(r5)
            return r5
        L45:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.android.Zendesk.getCurrentUser(x70.c):java.lang.Object");
    }

    @NotNull
    public final Messaging getMessaging() {
        return this.messaging;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loginUser(java.lang.String r5, x70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.android.Zendesk.C01841
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.android.Zendesk$loginUser$1 r0 = (zendesk.android.Zendesk.C01841) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.android.Zendesk$loginUser$1 r0 = new zendesk.android.Zendesk$loginUser$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r6)
            goto L3c
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r6)
            zendesk.conversationkit.android.ConversationKit r6 = r4.conversationKit
            r0.label = r3
            java.lang.Object r6 = r6.loginUser(r5, r0)
            if (r6 != r1) goto L3c
            return r1
        L3c:
            zendesk.conversationkit.android.ConversationKitResult r6 = (zendesk.conversationkit.android.ConversationKitResult) r6
            boolean r5 = r6 instanceof zendesk.conversationkit.android.ConversationKitResult.Failure
            if (r5 == 0) goto L4e
            zendesk.android.ZendeskResult$Failure r5 = new zendesk.android.ZendeskResult$Failure
            zendesk.conversationkit.android.ConversationKitResult$Failure r6 = (zendesk.conversationkit.android.ConversationKitResult.Failure) r6
            java.lang.Throwable r6 = r6.getCause()
            r5.<init>(r6)
            return r5
        L4e:
            boolean r5 = r6 instanceof zendesk.conversationkit.android.ConversationKitResult.Success
            if (r5 == 0) goto L64
            zendesk.android.ZendeskResult$Success r5 = new zendesk.android.ZendeskResult$Success
            zendesk.conversationkit.android.ConversationKitResult$Success r6 = (zendesk.conversationkit.android.ConversationKitResult.Success) r6
            java.lang.Object r6 = r6.getValue()
            zendesk.conversationkit.android.model.User r6 = (zendesk.conversationkit.android.model.User) r6
            zendesk.android.ZendeskUser r6 = zendesk.android.ZendeskUserKt.toZendeskUser(r6)
            r5.<init>(r6)
            return r5
        L64:
            e40.a.f()
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.android.Zendesk.loginUser(java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object logoutUser(x70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof zendesk.android.Zendesk.C01861
            if (r0 == 0) goto L13
            r0 = r5
            zendesk.android.Zendesk$logoutUser$1 r0 = (zendesk.android.Zendesk.C01861) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.android.Zendesk$logoutUser$1 r0 = new zendesk.android.Zendesk$logoutUser$1
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
            java.lang.Object r5 = r5.logoutUser(r0)
            if (r5 != r1) goto L3c
            return r1
        L3c:
            zendesk.conversationkit.android.ConversationKitResult r5 = (zendesk.conversationkit.android.ConversationKitResult) r5
            boolean r0 = r5 instanceof zendesk.conversationkit.android.ConversationKitResult.Failure
            if (r0 == 0) goto L4e
            zendesk.android.ZendeskResult$Failure r0 = new zendesk.android.ZendeskResult$Failure
            zendesk.conversationkit.android.ConversationKitResult$Failure r5 = (zendesk.conversationkit.android.ConversationKitResult.Failure) r5
            java.lang.Throwable r5 = r5.getCause()
            r0.<init>(r5)
            return r0
        L4e:
            boolean r0 = r5 instanceof zendesk.conversationkit.android.ConversationKitResult.Success
            if (r0 == 0) goto L5f
            zendesk.android.ZendeskResult$Success r0 = new zendesk.android.ZendeskResult$Success
            zendesk.conversationkit.android.ConversationKitResult$Success r5 = (zendesk.conversationkit.android.ConversationKitResult.Success) r5
            r5.getValue()
            kotlin.Unit r5 = kotlin.Unit.f26487a
            r0.<init>(r5)
            return r0
        L5f:
            e40.a.f()
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.android.Zendesk.logoutUser(x70.c):java.lang.Object");
    }

    public final void removeEventListener(@NotNull ZendeskEventListener listener) {
        listener.getClass();
        f0.B(this.scope, null, null, new C01881(listener, null), 3);
    }

    public final void sendPageView(@NotNull PageView pageView, @NotNull SuccessCallback<Unit> successCallback, @NotNull FailureCallback<Throwable> failureCallback) {
        pageView.getClass();
        successCallback.getClass();
        failureCallback.getClass();
        f0.B(this.scope, null, null, new C01891(pageView, failureCallback, successCallback, null), 3);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012JB\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0011\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0017\u0010\u0003R\u001a\u0010\u001b\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lzendesk/android/Zendesk$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "channelKey", "Lzendesk/android/SuccessCallback;", "Lzendesk/android/Zendesk;", "successCallback", "Lzendesk/android/FailureCallback;", "", "failureCallback", "Lzendesk/android/messaging/MessagingFactory;", "messagingFactory", "", "initialize", "(Landroid/content/Context;Ljava/lang/String;Lzendesk/android/SuccessCallback;Lzendesk/android/FailureCallback;Lzendesk/android/messaging/MessagingFactory;)V", "", "restoreSession", "Lzendesk/android/ZendeskResult;", "(Landroid/content/Context;Ljava/lang/String;Lzendesk/android/messaging/MessagingFactory;ZLx70/c;)Ljava/lang/Object;", "invalidate", "getInstance", "()Lzendesk/android/Zendesk;", "getInstance$annotations", "instance", "Lzendesk/android/ZendeskAuthenticationDelegate;", "authenticationDelegate", "Lzendesk/android/ZendeskAuthenticationDelegate;", "getAuthenticationDelegate", "()Lzendesk/android/ZendeskAuthenticationDelegate;", "setAuthenticationDelegate", "(Lzendesk/android/ZendeskAuthenticationDelegate;)V", "LOG_TAG", "Ljava/lang/String;", "Lv80/r;", "supervisorJob", "Lv80/r;", "Lv80/b0;", "scope", "Lv80/b0;", "Le90/a;", "initializeMutex", "Le90/a;", "zendesk", "Lzendesk/android/Zendesk;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nZendesk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zendesk.kt\nzendesk/android/Zendesk$Companion\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,396:1\n116#2,11:397\n*S KotlinDebug\n*F\n+ 1 Zendesk.kt\nzendesk/android/Zendesk$Companion\n*L\n337#1:397,11\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object initialize$default(Companion companion, Context context, String str, MessagingFactory messagingFactory, boolean z11, c cVar, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                messagingFactory = null;
            }
            MessagingFactory messagingFactory2 = messagingFactory;
            if ((i11 & 8) != 0) {
                z11 = false;
            }
            return companion.initialize(context, str, messagingFactory2, z11, cVar);
        }

        @Nullable
        public final ZendeskAuthenticationDelegate getAuthenticationDelegate() {
            return Zendesk.authenticationDelegate;
        }

        @NotNull
        public final Zendesk getInstance() {
            Zendesk zendesk2 = Zendesk.f47528zendesk;
            return zendesk2 == null ? new Zendesk(NotInitializedMessaging.INSTANCE, Zendesk.scope, new ZendeskEventDispatcher(p.f1044a), NotInitializedConversationKit.INSTANCE, NotInitializedPageViewEvents.INSTANCE) : zendesk2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0105  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x010c A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #2 {all -> 0x0033, blocks: (B:14:0x002e, B:44:0x0106, B:46:0x010c, B:36:0x00a5), top: B:54:0x0022 }] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r10v0, types: [android.content.Context, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v1 */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v11 */
        /* JADX WARN: Type inference failed for: r10v18 */
        /* JADX WARN: Type inference failed for: r10v19 */
        /* JADX WARN: Type inference failed for: r10v2, types: [e90.a] */
        /* JADX WARN: Type inference failed for: r10v20 */
        /* JADX WARN: Type inference failed for: r10v21 */
        /* JADX WARN: Type inference failed for: r10v3 */
        /* JADX WARN: Type inference failed for: r10v4, types: [e90.a] */
        /* JADX WARN: Type inference failed for: r10v8 */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v4, types: [android.content.Context] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object initialize(android.content.Context r10, java.lang.String r11, zendesk.android.messaging.MessagingFactory r12, boolean r13, x70.c r14) {
            /*
                Method dump skipped, instruction units count: 298
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.android.Zendesk.Companion.initialize(android.content.Context, java.lang.String, zendesk.android.messaging.MessagingFactory, boolean, x70.c):java.lang.Object");
        }

        public final void invalidate() {
            ZendeskEventDispatcher zendeskEventDispatcher;
            ConversationKit conversationKit;
            Logger.d(Zendesk.LOG_TAG, "Invalidating Zendesk instance", new Object[0]);
            Zendesk zendesk2 = Zendesk.f47528zendesk;
            if (zendesk2 != null && (conversationKit = zendesk2.conversationKit) != null) {
                conversationKit.invalidate();
            }
            Zendesk zendesk3 = Zendesk.f47528zendesk;
            if (zendesk3 != null) {
                zendesk3.messaging = NotInitializedMessaging.INSTANCE;
            }
            Zendesk zendesk4 = Zendesk.f47528zendesk;
            if (zendesk4 != null) {
                zendesk4.conversationKit = NotInitializedConversationKit.INSTANCE;
            }
            Zendesk zendesk5 = Zendesk.f47528zendesk;
            if (zendesk5 != null) {
                zendesk5.pageViewEvents = NotInitializedPageViewEvents.INSTANCE;
            }
            Zendesk zendesk6 = Zendesk.f47528zendesk;
            if (zendesk6 != null && (zendeskEventDispatcher = zendesk6.eventDispatcher) != null) {
                zendeskEventDispatcher.removeAllEventListeners();
            }
            f0.m(Zendesk.supervisorJob);
            Zendesk.scope = f0.b(p0.f42144a.plus(Zendesk.supervisorJob));
            Zendesk.f47528zendesk = null;
        }

        public final void setAuthenticationDelegate(@Nullable ZendeskAuthenticationDelegate zendeskAuthenticationDelegate) {
            Zendesk.authenticationDelegate = zendeskAuthenticationDelegate;
        }

        private Companion() {
        }

        public static /* synthetic */ void getInstance$annotations() {
        }

        public static /* synthetic */ void initialize$default(Companion companion, Context context, String str, SuccessCallback successCallback, FailureCallback failureCallback, MessagingFactory messagingFactory, int i11, Object obj) {
            if ((i11 & 16) != 0) {
                messagingFactory = null;
            }
            companion.initialize(context, str, (SuccessCallback<Zendesk>) successCallback, (FailureCallback<Throwable>) failureCallback, messagingFactory);
        }

        public final void initialize(@NotNull Context context, @NotNull String str, @NotNull SuccessCallback<Zendesk> successCallback, @NotNull FailureCallback<Throwable> failureCallback) {
            context.getClass();
            str.getClass();
            successCallback.getClass();
            failureCallback.getClass();
            initialize$default(this, context, str, successCallback, failureCallback, (MessagingFactory) null, 16, (Object) null);
        }

        public final void initialize(@NotNull Context context, @NotNull String channelKey, @NotNull SuccessCallback<Zendesk> successCallback, @NotNull FailureCallback<Throwable> failureCallback, @Nullable MessagingFactory messagingFactory) {
            context.getClass();
            channelKey.getClass();
            successCallback.getClass();
            failureCallback.getClass();
            f0.B(Zendesk.scope, null, null, new Zendesk$Companion$initialize$1(context, channelKey, messagingFactory, failureCallback, successCallback, null), 3);
        }
    }

    public static final void initialize(@NotNull Context context, @NotNull String str, @NotNull SuccessCallback<Zendesk> successCallback, @NotNull FailureCallback<Throwable> failureCallback) {
        INSTANCE.initialize(context, str, successCallback, failureCallback);
    }

    public final void getCurrentUser(@NotNull SuccessCallback<ZendeskUser> successCallback) {
        successCallback.getClass();
        f0.B(this.scope, null, null, new AnonymousClass2(successCallback, null), 3);
    }

    public final void logoutUser(@NotNull SuccessCallback<Unit> successCallback, @NotNull FailureCallback<Throwable> failureCallback) {
        successCallback.getClass();
        failureCallback.getClass();
        f0.B(this.scope, null, null, new C01872(failureCallback, successCallback, null), 3);
    }

    public final void loginUser(@NotNull String jwt, @NotNull SuccessCallback<ZendeskUser> successCallback, @NotNull FailureCallback<Throwable> failureCallback) {
        jwt.getClass();
        successCallback.getClass();
        failureCallback.getClass();
        f0.B(this.scope, null, null, new C01852(jwt, failureCallback, successCallback, null), 3);
    }
}
