package com.adyen.checkout.components.core.internal.data.api;

import at.o;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.adyen.checkout.components.core.internal.util.ChannelExtensionsKt;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.core.DispatcherProvider;
import com.braze.h2;
import e0.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.time.TimeMark;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p80.c;
import p80.d;
import p80.g;
import p80.h;
import p80.u;
import p80.v;
import u70.p;
import u70.q;
import v80.x;
import x80.m;
import y70.a;
import y80.i;
import y80.j;
import y80.r;
import y80.w;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u0004H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00192\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0016\u0010#\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Lcom/adyen/checkout/components/core/internal/data/api/DefaultStatusRepository;", "Lcom/adyen/checkout/components/core/internal/data/api/StatusRepository;", "Lcom/adyen/checkout/components/core/internal/data/api/StatusService;", "statusService", "", "clientKey", "Lp80/v;", "timeSource", "Lv80/x;", "coroutineDispatcher", "<init>", "(Lcom/adyen/checkout/components/core/internal/data/api/StatusService;Ljava/lang/String;Lp80/v;Lv80/x;)V", "paymentData", "Lu70/q;", "Lcom/adyen/checkout/components/core/internal/data/model/StatusResponse;", "fetchStatus-gIAlu-s", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "fetchStatus", "Lkotlin/time/TimeMark;", "startTime", "", "maxPollingDuration", "", "updateDelay", "(Lkotlin/time/TimeMark;J)Z", "Ly80/i;", "poll", "(Ljava/lang/String;J)Ly80/i;", "", "refreshStatus", "(Ljava/lang/String;)V", "Lcom/adyen/checkout/components/core/internal/data/api/StatusService;", "Ljava/lang/String;", "Lp80/v;", "Lv80/x;", "delay", "J", "Lx80/m;", "refreshFlow", "Lx80/m;", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStatusRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatusRepository.kt\ncom/adyen/checkout/components/core/internal/data/api/DefaultStatusRepository\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,147:1\n49#2:148\n51#2:152\n24#2:153\n26#2:157\n46#3:149\n51#3:151\n46#3:154\n51#3:156\n35#3,6:158\n105#4:150\n105#4:155\n16#5,17:164\n*S KotlinDebug\n*F\n+ 1 StatusRepository.kt\ncom/adyen/checkout/components/core/internal/data/api/DefaultStatusRepository\n*L\n81#1:148\n81#1:152\n84#1:153\n84#1:157\n81#1:149\n81#1:151\n84#1:154\n84#1:156\n89#1:158,6\n81#1:150\n84#1:155\n134#1:164,17\n*E\n"})
public final class DefaultStatusRepository implements StatusRepository {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long DEBOUNCE_TIME;
    private static final long POLLING_DELAY_FAST;
    private static final long POLLING_DELAY_SLOW;
    private static final long POLLING_THRESHOLD;

    @NotNull
    private final String clientKey;

    @NotNull
    private final x coroutineDispatcher;
    private long delay;

    @NotNull
    private final m refreshFlow;

    @NotNull
    private final StatusService statusService;

    @NotNull
    private final v timeSource;

    static {
        c cVar = d.f34559b;
        h hVar = h.SECONDS;
        POLLING_DELAY_FAST = d.f(g.g(2, hVar));
        POLLING_DELAY_SLOW = d.f(g.g(10, hVar));
        POLLING_THRESHOLD = d.f(g.g(60, hVar));
        DEBOUNCE_TIME = d.f(g.g(100, h.MILLISECONDS));
    }

    public DefaultStatusRepository(@NotNull StatusService statusService, @NotNull String str, @NotNull v vVar, @NotNull x xVar) {
        statusService.getClass();
        str.getClass();
        vVar.getClass();
        xVar.getClass();
        this.statusService = statusService;
        this.clientKey = str;
        this.timeSource = vVar;
        this.coroutineDispatcher = xVar;
        this.refreshFlow = ChannelExtensionsKt.bufferedChannel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: fetchStatus-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m87fetchStatusgIAlus(java.lang.String r6, x70.c<? super u70.q<com.adyen.checkout.components.core.internal.data.model.StatusResponse>> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$fetchStatus$1
            if (r0 == 0) goto L13
            r0 = r7
            com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$fetchStatus$1 r0 = (com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$fetchStatus$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$fetchStatus$1 r0 = new com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$fetchStatus$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r7)
            goto L42
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L2e:
            ba0.g.M(r7)
            v80.x r7 = r5.coroutineDispatcher
            com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$fetchStatus$2 r2 = new com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$fetchStatus$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.label = r3
            java.lang.Object r7 = v80.f0.K(r7, r2, r0)
            if (r7 != r1) goto L42
            return r1
        L42:
            u70.q r7 = (u70.q) r7
            java.lang.Object r6 = r7.f40851a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository.m87fetchStatusgIAlus(java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean updateDelay(TimeMark startTime, long maxPollingDuration) {
        long jF = d.f(startTime.a());
        if (jF <= POLLING_THRESHOLD) {
            this.delay = POLLING_DELAY_FAST;
            return true;
        }
        if (jF > maxPollingDuration) {
            return false;
        }
        this.delay = POLLING_DELAY_SLOW;
        return true;
    }

    @Override // com.adyen.checkout.components.core.internal.data.api.StatusRepository
    @NotNull
    public i poll(@NotNull String paymentData, long maxPollingDuration) {
        paymentData.getClass();
        TimeMark timeMarkA = this.timeSource.a();
        updateDelay(timeMarkA, maxPollingDuration);
        final i iVarK = r.k(r.v(new o(new DefaultStatusRepository$poll$pollingFlow$1(paymentData, this, null)), r.w(this.refreshFlow)), DEBOUNCE_TIME);
        final i iVar = new i() { // from class: com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$$inlined$map$1

            /* JADX INFO: renamed from: com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 StatusRepository.kt\ncom/adyen/checkout/components/core/internal/data/api/DefaultStatusRepository\n*L\n1#1,49:1\n50#2:50\n82#3:51\n*E\n"})
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;
                final /* synthetic */ DefaultStatusRepository this$0;

                /* JADX INFO: renamed from: com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$$inlined$map$1$2$1, reason: invalid class name */
                @e(c = "com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$$inlined$map$1$2", f = "StatusRepository.kt", l = {51, 50}, m = "emit")
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class AnonymousClass1 extends z70.c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(x70.c cVar) {
                        super(cVar);
                    }

                    @Override // z70.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar, DefaultStatusRepository defaultStatusRepository) {
                    this.$this_unsafeFlow = jVar;
                    this.this$0 = defaultStatusRepository;
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
                
                    if (r7.emit(r2, r0) == r1) goto L22;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // y80.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, x70.c r8) throws java.lang.Throwable {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$$inlined$map$1$2$1 r0 = (com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$$inlined$map$1$2$1 r0 = new com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        y70.a r1 = y70.a.COROUTINE_SUSPENDED
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3d
                        if (r2 == r4) goto L31
                        if (r2 != r3) goto L2a
                        ba0.g.M(r8)
                        goto L65
                    L2a:
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        com.braze.h2.b(r7)
                        r7 = 0
                        return r7
                    L31:
                        java.lang.Object r7 = r0.L$0
                        y80.j r7 = (y80.j) r7
                        ba0.g.M(r8)
                        u70.q r8 = (u70.q) r8
                        java.lang.Object r8 = r8.f40851a
                        goto L54
                    L3d:
                        ba0.g.M(r8)
                        y80.j r8 = r6.$this_unsafeFlow
                        java.lang.String r7 = (java.lang.String) r7
                        com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository r2 = r6.this$0
                        r0.L$0 = r8
                        r0.label = r4
                        java.lang.Object r7 = com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository.m86access$fetchStatusgIAlus(r2, r7, r0)
                        if (r7 != r1) goto L51
                        goto L64
                    L51:
                        r5 = r8
                        r8 = r7
                        r7 = r5
                    L54:
                        u70.q r2 = new u70.q
                        r2.<init>(r8)
                        r8 = 0
                        r0.L$0 = r8
                        r0.label = r3
                        java.lang.Object r7 = r7.emit(r2, r0)
                        if (r7 != r1) goto L65
                    L64:
                        return r1
                    L65:
                        kotlin.Unit r7 = kotlin.Unit.f26487a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, x70.c):java.lang.Object");
                }
            }

            @Override // y80.i
            public Object collect(j jVar, x70.c cVar) {
                Object objCollect = iVarK.collect(new AnonymousClass2(jVar, this), cVar);
                return objCollect == a.COROUTINE_SUSPENDED ? objCollect : Unit.f26487a;
            }
        };
        return new w(new o(new DefaultStatusRepository$poll$$inlined$transform$1(new i() { // from class: com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$$inlined$filterNot$1

            /* JADX INFO: renamed from: com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$$inlined$filterNot$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 StatusRepository.kt\ncom/adyen/checkout/components/core/internal/data/api/DefaultStatusRepository\n*L\n1#1,49:1\n25#2:50\n26#2:52\n87#3:51\n*E\n"})
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;

                /* JADX INFO: renamed from: com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$$inlined$filterNot$1$2$1, reason: invalid class name */
                @e(c = "com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$$inlined$filterNot$1$2", f = "StatusRepository.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class AnonymousClass1 extends z70.c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(x70.c cVar) {
                        super(cVar);
                    }

                    @Override // z70.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // y80.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, x70.c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$$inlined$filterNot$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$$inlined$filterNot$1$2$1 r0 = (com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$$inlined$filterNot$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$$inlined$filterNot$1$2$1 r0 = new com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$$inlined$filterNot$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        y70.a r1 = y70.a.COROUTINE_SUSPENDED
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2e
                        if (r2 != r3) goto L27
                        ba0.g.M(r6)
                        goto L49
                    L27:
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        com.braze.h2.b(r5)
                        r5 = 0
                        return r5
                    L2e:
                        ba0.g.M(r6)
                        y80.j r6 = r4.$this_unsafeFlow
                        r2 = r5
                        u70.q r2 = (u70.q) r2
                        java.lang.Object r2 = r2.f40851a
                        java.lang.Throwable r2 = u70.q.a(r2)
                        boolean r2 = r2 instanceof java.net.UnknownHostException
                        if (r2 != 0) goto L49
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L49
                        return r1
                    L49:
                        kotlin.Unit r5 = kotlin.Unit.f26487a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$$inlined$filterNot$1.AnonymousClass2.emit(java.lang.Object, x70.c):java.lang.Object");
                }
            }

            @Override // y80.i
            public Object collect(j jVar, x70.c cVar) {
                Object objCollect = iVar.collect(new AnonymousClass2(jVar), cVar);
                return objCollect == a.COROUTINE_SUSPENDED ? objCollect : Unit.f26487a;
            }
        }, null, this, timeMarkA, maxPollingDuration)), new AnonymousClass4(null), 5);
    }

    @Override // com.adyen.checkout.components.core.internal.data.api.StatusRepository
    public void refreshStatus(@NotNull String paymentData) {
        paymentData.getClass();
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.VERBOSE;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = DefaultStatusRepository.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "refreshStatus", null);
        }
        this.refreshFlow.h(paymentData);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/components/core/internal/data/api/DefaultStatusRepository$Companion;", "", "()V", "DEBOUNCE_TIME", "", "getDEBOUNCE_TIME$components_core_release$annotations", "getDEBOUNCE_TIME$components_core_release", "()J", "POLLING_DELAY_FAST", "POLLING_DELAY_SLOW", "POLLING_THRESHOLD", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getDEBOUNCE_TIME$components_core_release() {
            return DefaultStatusRepository.DEBOUNCE_TIME;
        }

        private Companion() {
        }

        public static /* synthetic */ void getDEBOUNCE_TIME$components_core_release$annotations() {
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$4", f = "StatusRepository.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lu70/q;", "Lcom/adyen/checkout/components/core/internal/data/model/StatusResponse;", "it", "", "<anonymous>", "(Lu70/q;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nStatusRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatusRepository.kt\ncom/adyen/checkout/components/core/internal/data/api/DefaultStatusRepository$poll$4\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,147:1\n16#2,17:148\n*S KotlinDebug\n*F\n+ 1 StatusRepository.kt\ncom/adyen/checkout/components/core/internal/data/api/DefaultStatusRepository$poll$4\n*L\n103#1:148,17\n*E\n"})
    public static final class AnonymousClass4 extends z70.i implements Function2<q<? extends StatusResponse>, x70.c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass4(x70.c<? super AnonymousClass4> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final x70.c<Unit> create(@Nullable Object obj, @NotNull x70.c<?> cVar) {
            AnonymousClass4 anonymousClass4 = DefaultStatusRepository.this.new AnonymousClass4(cVar);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Nullable
        public final Object invoke(@NotNull Object obj, @Nullable x70.c<? super Unit> cVar) {
            return ((AnonymousClass4) create(new q(obj), cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
            Object obj2 = ((q) this.L$0).f40851a;
            DefaultStatusRepository defaultStatusRepository = DefaultStatusRepository.this;
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = defaultStatusRepository.getClass().getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                String strConcat = "CO.".concat(name);
                AdyenLogger logger = companion.getLogger();
                if (obj2 instanceof p) {
                    obj2 = null;
                }
                StatusResponse statusResponse = (StatusResponse) obj2;
                logger.log(adyenLogLevel, strConcat, f.k("Emitting status: ", statusResponse != null ? statusResponse.getResultCode() : null), null);
            }
            return Unit.f26487a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((q) obj).f40851a, (x70.c<? super Unit>) obj2);
        }
    }

    public /* synthetic */ DefaultStatusRepository(StatusService statusService, String str, v vVar, x xVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(statusService, str, (i11 & 4) != 0 ? u.f34584a : vVar, (i11 & 8) != 0 ? DispatcherProvider.INSTANCE.getIO() : xVar);
    }
}
