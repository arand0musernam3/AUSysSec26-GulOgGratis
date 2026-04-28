package com.adyen.checkout.components.core.internal.data.api;

import ba0.g;
import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.TimeMark;
import x70.c;
import y70.a;
import y80.j;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$$inlined$transform$1", f = "StatusRepository.kt", l = {36}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Ly80/j;", "", "<anonymous>", "(Ly80/j;)V"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1\n*L\n1#1,40:1\n*E\n"})
public final class DefaultStatusRepository$poll$$inlined$transform$1 extends i implements Function2<j, c<? super Unit>, Object> {
    final /* synthetic */ long $maxPollingDuration$inlined;
    final /* synthetic */ TimeMark $startTime$inlined;
    final /* synthetic */ y80.i $this_transform;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefaultStatusRepository this$0;

    /* JADX INFO: renamed from: com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$$inlined$transform$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1\n+ 2 StatusRepository.kt\ncom/adyen/checkout/components/core/internal/data/api/DefaultStatusRepository\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 4 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,38:1\n90#2,4:39\n96#2,2:44\n98#2,2:63\n101#2:66\n326#3:43\n326#3:65\n16#4,17:46\n*S KotlinDebug\n*F\n+ 1 StatusRepository.kt\ncom/adyen/checkout/components/core/internal/data/api/DefaultStatusRepository\n*L\n93#1:43\n99#1:65\n97#1:46,17\n*E\n"})
    public static final class AnonymousClass1<T> implements j {
        final /* synthetic */ j $$this$flow;
        final /* synthetic */ long $maxPollingDuration$inlined;
        final /* synthetic */ TimeMark $startTime$inlined;
        final /* synthetic */ DefaultStatusRepository this$0;

        /* JADX INFO: renamed from: com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        @e(c = "com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$$inlined$transform$1$1", f = "StatusRepository.kt", l = {39, 63}, m = "emit")
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C00201 extends z70.c {
            Object L$0;
            Object L$1;
            Object L$2;
            int label;
            /* synthetic */ Object result;

            public C00201(c cVar) {
                super(cVar);
            }

            @Override // z70.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass1.this.emit(null, this);
            }
        }

        public AnonymousClass1(j jVar, DefaultStatusRepository defaultStatusRepository, TimeMark timeMark, long j9) {
            this.this$0 = defaultStatusRepository;
            this.$startTime$inlined = timeMark;
            this.$maxPollingDuration$inlined = j9;
            this.$$this$flow = jVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x00e1, code lost:
        
            if (r9.emit(r10, r0) == r1) goto L36;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // y80.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r9, x70.c<? super kotlin.Unit> r10) {
            /*
                Method dump skipped, instruction units count: 238
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$$inlined$transform$1.AnonymousClass1.emit(java.lang.Object, x70.c):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultStatusRepository$poll$$inlined$transform$1(y80.i iVar, c cVar, DefaultStatusRepository defaultStatusRepository, TimeMark timeMark, long j9) {
        super(2, cVar);
        this.$this_transform = iVar;
        this.this$0 = defaultStatusRepository;
        this.$startTime$inlined = timeMark;
        this.$maxPollingDuration$inlined = j9;
    }

    @Override // z70.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        DefaultStatusRepository$poll$$inlined$transform$1 defaultStatusRepository$poll$$inlined$transform$1 = new DefaultStatusRepository$poll$$inlined$transform$1(this.$this_transform, cVar, this.this$0, this.$startTime$inlined, this.$maxPollingDuration$inlined);
        defaultStatusRepository$poll$$inlined$transform$1.L$0 = obj;
        return defaultStatusRepository$poll$$inlined$transform$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(j jVar, c<? super Unit> cVar) {
        return ((DefaultStatusRepository$poll$$inlined$transform$1) create(jVar, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            g.M(obj);
            j jVar = (j) this.L$0;
            y80.i iVar = this.$this_transform;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(jVar, this.this$0, this.$startTime$inlined, this.$maxPollingDuration$inlined);
            this.label = 1;
            if (iVar.collect(anonymousClass1, this) == aVar) {
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
