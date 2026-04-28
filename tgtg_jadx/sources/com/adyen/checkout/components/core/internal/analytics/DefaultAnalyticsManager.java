package com.adyen.checkout.components.core.internal.analytics;

import ba0.g;
import com.adyen.checkout.components.core.internal.analytics.CheckoutAttemptIdState;
import com.adyen.checkout.components.core.internal.analytics.data.AnalyticsRepository;
import com.adyen.checkout.components.core.internal.ui.model.AnalyticsParams;
import com.adyen.checkout.components.core.internal.ui.model.AnalyticsParamsLevel;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.core.DispatcherProvider;
import com.braze.h2;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p80.d;
import p80.h;
import u70.o;
import u70.p;
import u70.q;
import v80.b0;
import v80.f0;
import v80.i1;
import v80.x;
import x70.c;
import y70.a;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 02\u00020\u0001:\u00010B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/DefaultAnalyticsManager;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Lcom/adyen/checkout/components/core/internal/analytics/data/AnalyticsRepository;", "analyticsRepository", "Lcom/adyen/checkout/components/core/internal/ui/model/AnalyticsParams;", "analyticsParams", "Lv80/x;", "coroutineDispatcher", "<init>", "(Lcom/adyen/checkout/components/core/internal/analytics/data/AnalyticsRepository;Lcom/adyen/checkout/components/core/internal/ui/model/AnalyticsParams;Lv80/x;)V", "", "startTimer", "()V", "stopTimer", "sendEvents", "(Lx70/c;)Ljava/lang/Object;", "", "cannotSendEvents", "()Z", "", "owner", "Lv80/b0;", "coroutineScope", "initialize", "(Ljava/lang/Object;Lv80/b0;)V", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent;", "event", "trackEvent", "(Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent;)V", "", "getCheckoutAttemptId", "()Ljava/lang/String;", "clear", "(Ljava/lang/Object;)V", "Lcom/adyen/checkout/components/core/internal/analytics/data/AnalyticsRepository;", "Lcom/adyen/checkout/components/core/internal/ui/model/AnalyticsParams;", "Lv80/x;", "Lcom/adyen/checkout/components/core/internal/analytics/CheckoutAttemptIdState;", "checkoutAttemptIdState", "Lcom/adyen/checkout/components/core/internal/analytics/CheckoutAttemptIdState;", "isInitialized", "Z", "Lv80/b0;", "Lv80/i1;", "timerJob", "Lv80/i1;", "ownerReference", "Ljava/lang/String;", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultAnalyticsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultAnalyticsManager.kt\ncom/adyen/checkout/components/core/internal/analytics/DefaultAnalyticsManager\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n+ 3 ResultExt.kt\ncom/adyen/checkout/core/internal/util/ResultExtKt\n*L\n1#1,160:1\n16#2,17:161\n16#2,17:178\n16#2,17:195\n16#2,17:212\n16#2,17:229\n21#2,12:252\n16#2,17:264\n16#2,17:281\n17#3,6:246\n*S KotlinDebug\n*F\n+ 1 DefaultAnalyticsManager.kt\ncom/adyen/checkout/components/core/internal/analytics/DefaultAnalyticsManager\n*L\n45#1:161,17\n74#1:178,17\n89#1:195,17\n95#1:212,17\n113#1:229,17\n121#1:252,12\n135#1:264,17\n139#1:281,17\n117#1:246,6\n*E\n"})
public final class DefaultAnalyticsManager implements AnalyticsManager {

    @NotNull
    public static final String CHECKOUT_ATTEMPT_ID_NOT_FETCHED = "checkoutAttemptId-not-fetched";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long DISPATCH_INTERVAL_MILLIS;

    @NotNull
    public static final String FAILED_CHECKOUT_ATTEMPT_ID = "fetch-checkoutAttemptId-failed";

    @NotNull
    private final AnalyticsParams analyticsParams;

    @NotNull
    private final AnalyticsRepository analyticsRepository;

    @NotNull
    private CheckoutAttemptIdState checkoutAttemptIdState;

    @NotNull
    private final x coroutineDispatcher;

    @Nullable
    private b0 coroutineScope;
    private boolean isInitialized;

    @Nullable
    private String ownerReference;

    @Nullable
    private i1 timerJob;

    /* JADX INFO: renamed from: com.adyen.checkout.components.core.internal.analytics.DefaultAnalyticsManager$initialize$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.components.core.internal.analytics.DefaultAnalyticsManager$initialize$2", f = "DefaultAnalyticsManager.kt", l = {55}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nDefaultAnalyticsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultAnalyticsManager.kt\ncom/adyen/checkout/components/core/internal/analytics/DefaultAnalyticsManager$initialize$2\n+ 2 ResultExt.kt\ncom/adyen/checkout/core/internal/util/ResultExtKt\n+ 3 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,160:1\n17#2,6:161\n21#3,12:167\n*S KotlinDebug\n*F\n+ 1 DefaultAnalyticsManager.kt\ncom/adyen/checkout/components/core/internal/analytics/DefaultAnalyticsManager$initialize$2\n*L\n54#1:161,6\n65#1:167,12\n*E\n"})
    public static final class AnonymousClass2 extends i implements Function2<b0, c<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass2 anonymousClass2 = DefaultAnalyticsManager.this.new AnonymousClass2(cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            b0 b0Var;
            Throwable th2;
            Object pVar;
            CheckoutAttemptIdState available;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            try {
                if (i11 == 0) {
                    g.M(obj);
                    b0 b0Var2 = (b0) this.L$0;
                    DefaultAnalyticsManager defaultAnalyticsManager = DefaultAnalyticsManager.this;
                    try {
                        o oVar = q.f40850b;
                        AnalyticsRepository analyticsRepository = defaultAnalyticsManager.analyticsRepository;
                        this.L$0 = b0Var2;
                        this.label = 1;
                        Object objFetchCheckoutAttemptId = analyticsRepository.fetchCheckoutAttemptId(this);
                        if (objFetchCheckoutAttemptId == aVar) {
                            return aVar;
                        }
                        b0Var = b0Var2;
                        obj = objFetchCheckoutAttemptId;
                    } catch (Throwable th3) {
                        b0Var = b0Var2;
                        th2 = th3;
                        o oVar2 = q.f40850b;
                        pVar = new p(th2);
                    }
                } else {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b0Var = (b0) this.L$0;
                    try {
                        g.M(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        o oVar22 = q.f40850b;
                        pVar = new p(th2);
                    }
                }
                pVar = (String) obj;
                o oVar3 = q.f40850b;
                DefaultAnalyticsManager defaultAnalyticsManager2 = DefaultAnalyticsManager.this;
                Throwable thA = q.a(pVar);
                if (thA == null) {
                    String str = (String) pVar;
                    if (str != null) {
                        available = new CheckoutAttemptIdState.Available(str);
                        defaultAnalyticsManager2.startTimer();
                    } else {
                        available = CheckoutAttemptIdState.Failed.INSTANCE;
                    }
                    defaultAnalyticsManager2.checkoutAttemptIdState = available;
                } else {
                    AdyenLogLevel adyenLogLevel = AdyenLogLevel.WARN;
                    AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
                    if (companion.getLogger().shouldLog(adyenLogLevel)) {
                        String name = b0Var.getClass().getName();
                        String strY = StringsKt.Y(name, '$');
                        String strW = StringsKt.W('.', strY, strY);
                        if (strW.length() != 0) {
                            name = StringsKt.O(strW, "Kt");
                        }
                        companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Failed to fetch checkoutAttemptId.", thA);
                    }
                    defaultAnalyticsManager2.checkoutAttemptIdState = CheckoutAttemptIdState.Failed.INSTANCE;
                }
                return Unit.f26487a;
            } catch (CancellationException e5) {
                throw e5;
            }
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.components.core.internal.analytics.DefaultAnalyticsManager$sendEvents$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.components.core.internal.analytics.DefaultAnalyticsManager", f = "DefaultAnalyticsManager.kt", l = {118}, m = "sendEvents")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends z70.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultAnalyticsManager.this.sendEvents(this);
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.components.core.internal.analytics.DefaultAnalyticsManager$startTimer$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.components.core.internal.analytics.DefaultAnalyticsManager$startTimer$2", f = "DefaultAnalyticsManager.kt", l = {100, 101}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {1, 9, 0})
    public static final class C00842 extends i implements Function2<b0, c<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C00842(c<? super C00842> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            C00842 c00842 = DefaultAnalyticsManager.this.new C00842(cVar);
            c00842.L$0 = obj;
            return c00842;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super Unit> cVar) {
            return ((C00842) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        
            if (r7.sendEvents(r6) != r0) goto L7;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004d -> B:7:0x0013). Please report as a decompilation issue!!! */
        @Override // z70.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            /*
                r6 = this;
                y70.a r0 = y70.a.COROUTINE_SUSPENDED
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L15
                java.lang.Object r1 = r6.L$0
                v80.b0 r1 = (v80.b0) r1
                ba0.g.M(r7)
            L13:
                r7 = r1
                goto L2b
            L15:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r7)
                r7 = 0
                return r7
            L1c:
                java.lang.Object r1 = r6.L$0
                v80.b0 r1 = (v80.b0) r1
                ba0.g.M(r7)
                goto L43
            L24:
                ba0.g.M(r7)
                java.lang.Object r7 = r6.L$0
                v80.b0 r7 = (v80.b0) r7
            L2b:
                boolean r1 = v80.f0.y(r7)
                if (r1 == 0) goto L50
                com.adyen.checkout.components.core.internal.analytics.DefaultAnalyticsManager$Companion r1 = com.adyen.checkout.components.core.internal.analytics.DefaultAnalyticsManager.INSTANCE
                long r4 = r1.getDISPATCH_INTERVAL_MILLIS$components_core_release()
                r6.L$0 = r7
                r6.label = r3
                java.lang.Object r1 = v80.f0.o(r4, r6)
                if (r1 != r0) goto L42
                goto L4f
            L42:
                r1 = r7
            L43:
                com.adyen.checkout.components.core.internal.analytics.DefaultAnalyticsManager r7 = com.adyen.checkout.components.core.internal.analytics.DefaultAnalyticsManager.this
                r6.L$0 = r1
                r6.label = r2
                java.lang.Object r7 = com.adyen.checkout.components.core.internal.analytics.DefaultAnalyticsManager.access$sendEvents(r7, r6)
                if (r7 != r0) goto L13
            L4f:
                return r0
            L50:
                kotlin.Unit r7 = kotlin.Unit.f26487a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.components.core.internal.analytics.DefaultAnalyticsManager.C00842.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.components.core.internal.analytics.DefaultAnalyticsManager$trackEvent$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.components.core.internal.analytics.DefaultAnalyticsManager$trackEvent$2", f = "DefaultAnalyticsManager.kt", l = {79, 82}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nDefaultAnalyticsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultAnalyticsManager.kt\ncom/adyen/checkout/components/core/internal/analytics/DefaultAnalyticsManager$trackEvent$2\n+ 2 ResultExt.kt\ncom/adyen/checkout/core/internal/util/ResultExtKt\n+ 3 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,160:1\n17#2,6:161\n21#3,12:167\n*S KotlinDebug\n*F\n+ 1 DefaultAnalyticsManager.kt\ncom/adyen/checkout/components/core/internal/analytics/DefaultAnalyticsManager$trackEvent$2\n*L\n78#1:161,6\n87#1:167,12\n*E\n"})
    public static final class C00852 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ AnalyticsEvent $event;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00852(AnalyticsEvent analyticsEvent, c<? super C00852> cVar) {
            super(2, cVar);
            this.$event = analyticsEvent;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            C00852 c00852 = DefaultAnalyticsManager.this.new C00852(this.$event, cVar);
            c00852.L$0 = obj;
            return c00852;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super Unit> cVar) {
            return ((C00852) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v26 */
        /* JADX WARN: Type inference failed for: r1v27 */
        /* JADX WARN: Type inference failed for: r1v28 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
        @Override // z70.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 209
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.components.core.internal.analytics.DefaultAnalyticsManager.C00852.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        p80.c cVar = d.f34559b;
        DISPATCH_INTERVAL_MILLIS = d.f(p80.g.g(10, h.SECONDS));
    }

    public DefaultAnalyticsManager(@NotNull AnalyticsRepository analyticsRepository, @NotNull AnalyticsParams analyticsParams, @NotNull x xVar) {
        analyticsRepository.getClass();
        analyticsParams.getClass();
        xVar.getClass();
        this.analyticsRepository = analyticsRepository;
        this.analyticsParams = analyticsParams;
        this.coroutineDispatcher = xVar;
        this.checkoutAttemptIdState = CheckoutAttemptIdState.NotAvailable.INSTANCE;
    }

    private final boolean cannotSendEvents() {
        return this.analyticsParams.getLevel().getPriority() <= AnalyticsParamsLevel.INITIAL.getPriority();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendEvents(x70.c<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.components.core.internal.analytics.DefaultAnalyticsManager.sendEvents(x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startTimer() {
        stopTimer();
        b0 b0Var = this.coroutineScope;
        if (b0Var != null) {
            this.timerJob = f0.B(b0Var, this.coroutineDispatcher, null, new C00842(null), 2);
            return;
        }
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.WARN;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultAnalyticsManager.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Coroutine scope is null.", null);
        }
    }

    private final void stopTimer() {
        i1 i1Var = this.timerJob;
        if (i1Var != null) {
            i1Var.a(null);
        }
    }

    @Override // com.adyen.checkout.components.core.internal.analytics.AnalyticsManager
    public void clear(@NotNull Object owner) {
        owner.getClass();
        if (!Intrinsics.areEqual(this.ownerReference, Reflection.getOrCreateKotlinClass(owner.getClass()).getQualifiedName())) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = DefaultAnalyticsManager.class.getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Clear called by not the original owner, ignoring.", null);
                return;
            }
            return;
        }
        AdyenLogLevel adyenLogLevel2 = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion2 = AdyenLogger.INSTANCE;
        if (companion2.getLogger().shouldLog(adyenLogLevel2)) {
            String name2 = DefaultAnalyticsManager.class.getName();
            String strY2 = StringsKt.Y(name2, '$');
            String strW2 = StringsKt.W('.', strY2, strY2);
            if (strW2.length() != 0) {
                name2 = StringsKt.O(strW2, "Kt");
            }
            companion2.getLogger().log(adyenLogLevel2, "CO.".concat(name2), "Clearing analytics manager", null);
        }
        this.coroutineScope = null;
        this.checkoutAttemptIdState = CheckoutAttemptIdState.NotAvailable.INSTANCE;
        this.ownerReference = null;
        this.isInitialized = false;
        stopTimer();
        this.timerJob = null;
    }

    @Override // com.adyen.checkout.components.core.internal.analytics.AnalyticsManager
    @NotNull
    public String getCheckoutAttemptId() {
        CheckoutAttemptIdState checkoutAttemptIdState = this.checkoutAttemptIdState;
        if (checkoutAttemptIdState instanceof CheckoutAttemptIdState.Available) {
            return ((CheckoutAttemptIdState.Available) checkoutAttemptIdState).getCheckoutAttemptId();
        }
        if (Intrinsics.areEqual(checkoutAttemptIdState, CheckoutAttemptIdState.Failed.INSTANCE)) {
            return FAILED_CHECKOUT_ATTEMPT_ID;
        }
        if (Intrinsics.areEqual(checkoutAttemptIdState, CheckoutAttemptIdState.NotAvailable.INSTANCE)) {
            return CHECKOUT_ATTEMPT_ID_NOT_FETCHED;
        }
        e40.a.f();
        return null;
    }

    @Override // com.adyen.checkout.components.core.internal.analytics.AnalyticsManager
    public void initialize(@NotNull Object owner, @NotNull b0 coroutineScope) {
        owner.getClass();
        coroutineScope.getClass();
        if (!this.isInitialized) {
            this.isInitialized = true;
            this.ownerReference = Reflection.getOrCreateKotlinClass(owner.getClass()).getQualifiedName();
            this.coroutineScope = coroutineScope;
            f0.B(coroutineScope, this.coroutineDispatcher, null, new AnonymousClass2(null), 2);
            return;
        }
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultAnalyticsManager.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Already initialized, ignoring.", null);
        }
    }

    @Override // com.adyen.checkout.components.core.internal.analytics.AnalyticsManager
    public void trackEvent(@NotNull AnalyticsEvent event) {
        event.getClass();
        if (cannotSendEvents()) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = DefaultAnalyticsManager.class.getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Not allowed to track events, ignoring.", null);
                return;
            }
            return;
        }
        b0 b0Var = this.coroutineScope;
        if (b0Var != null) {
            f0.B(b0Var, this.coroutineDispatcher, null, new C00852(event, null), 2);
            return;
        }
        AdyenLogLevel adyenLogLevel2 = AdyenLogLevel.WARN;
        AdyenLogger.Companion companion2 = AdyenLogger.INSTANCE;
        if (companion2.getLogger().shouldLog(adyenLogLevel2)) {
            String name2 = DefaultAnalyticsManager.class.getName();
            String strY2 = StringsKt.Y(name2, '$');
            String strW2 = StringsKt.W('.', strY2, strY2);
            if (strW2.length() != 0) {
                name2 = StringsKt.O(strW2, "Kt");
            }
            companion2.getLogger().log(adyenLogLevel2, "CO.".concat(name2), "Coroutine scope is null. Tracking event failed.", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u001c\u0010\u0006\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0002¨\u0006\r"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/DefaultAnalyticsManager$Companion;", "", "()V", "CHECKOUT_ATTEMPT_ID_NOT_FETCHED", "", "getCHECKOUT_ATTEMPT_ID_NOT_FETCHED$components_core_release$annotations", "DISPATCH_INTERVAL_MILLIS", "", "getDISPATCH_INTERVAL_MILLIS$components_core_release$annotations", "getDISPATCH_INTERVAL_MILLIS$components_core_release", "()J", "FAILED_CHECKOUT_ATTEMPT_ID", "getFAILED_CHECKOUT_ATTEMPT_ID$components_core_release$annotations", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getDISPATCH_INTERVAL_MILLIS$components_core_release() {
            return DefaultAnalyticsManager.DISPATCH_INTERVAL_MILLIS;
        }

        private Companion() {
        }

        public static /* synthetic */ void getCHECKOUT_ATTEMPT_ID_NOT_FETCHED$components_core_release$annotations() {
        }

        public static /* synthetic */ void getDISPATCH_INTERVAL_MILLIS$components_core_release$annotations() {
        }

        public static /* synthetic */ void getFAILED_CHECKOUT_ATTEMPT_ID$components_core_release$annotations() {
        }
    }

    public /* synthetic */ DefaultAnalyticsManager(AnalyticsRepository analyticsRepository, AnalyticsParams analyticsParams, x xVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(analyticsRepository, analyticsParams, (i11 & 4) != 0 ? DispatcherProvider.INSTANCE.getIO() : xVar);
    }
}
