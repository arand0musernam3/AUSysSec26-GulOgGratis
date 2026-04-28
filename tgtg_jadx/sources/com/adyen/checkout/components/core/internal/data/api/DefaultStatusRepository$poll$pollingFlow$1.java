package com.adyen.checkout.components.core.internal.data.api;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x70.c;
import y80.j;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$pollingFlow$1", f = "StatusRepository.kt", l = {71, 72}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly80/j;", "", "", "<anonymous>", "(Ly80/j;)V"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nStatusRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatusRepository.kt\ncom/adyen/checkout/components/core/internal/data/api/DefaultStatusRepository$poll$pollingFlow$1\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,147:1\n326#2:148\n*S KotlinDebug\n*F\n+ 1 StatusRepository.kt\ncom/adyen/checkout/components/core/internal/data/api/DefaultStatusRepository$poll$pollingFlow$1\n*L\n70#1:148\n*E\n"})
public final class DefaultStatusRepository$poll$pollingFlow$1 extends i implements Function2<j, c<? super Unit>, Object> {
    final /* synthetic */ String $paymentData;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefaultStatusRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultStatusRepository$poll$pollingFlow$1(String str, DefaultStatusRepository defaultStatusRepository, c<? super DefaultStatusRepository$poll$pollingFlow$1> cVar) {
        super(2, cVar);
        this.$paymentData = str;
        this.this$0 = defaultStatusRepository;
    }

    @Override // z70.a
    @NotNull
    public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
        DefaultStatusRepository$poll$pollingFlow$1 defaultStatusRepository$poll$pollingFlow$1 = new DefaultStatusRepository$poll$pollingFlow$1(this.$paymentData, this.this$0, cVar);
        defaultStatusRepository$poll$pollingFlow$1.L$0 = obj;
        return defaultStatusRepository$poll$pollingFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull j jVar, @Nullable c<? super Unit> cVar) {
        return ((DefaultStatusRepository$poll$pollingFlow$1) create(jVar, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (v80.f0.o(r4, r6) != r0) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0051 -> B:7:0x0013). Please report as a decompilation issue!!! */
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
            y80.j r1 = (y80.j) r1
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
            y80.j r1 = (y80.j) r1
            ba0.g.M(r7)
            goto L43
        L24:
            ba0.g.M(r7)
            java.lang.Object r7 = r6.L$0
            y80.j r7 = (y80.j) r7
        L2b:
            kotlin.coroutines.CoroutineContext r1 = r6.getContext()
            boolean r1 = v80.f0.x(r1)
            if (r1 == 0) goto L54
            java.lang.String r1 = r6.$paymentData
            r6.L$0 = r7
            r6.label = r3
            java.lang.Object r1 = r7.emit(r1, r6)
            if (r1 != r0) goto L42
            goto L53
        L42:
            r1 = r7
        L43:
            com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository r7 = r6.this$0
            long r4 = com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository.access$getDelay$p(r7)
            r6.L$0 = r1
            r6.label = r2
            java.lang.Object r7 = v80.f0.o(r4, r6)
            if (r7 != r0) goto L13
        L53:
            return r0
        L54:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$pollingFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
