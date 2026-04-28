package com.adyen.checkout.components.core.internal.data.api;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Lcom/adyen/checkout/components/core/internal/data/api/OrderStatusRepository;", "", "Lcom/adyen/checkout/components/core/internal/data/api/OrderStatusService;", "orderStatusService", "<init>", "(Lcom/adyen/checkout/components/core/internal/data/api/OrderStatusService;)V", "", "clientKey", "orderData", "Lu70/q;", "Lcom/adyen/checkout/components/core/internal/data/model/OrderStatusResponse;", "getOrderStatus-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "getOrderStatus", "Lcom/adyen/checkout/components/core/internal/data/api/OrderStatusService;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOrderStatusRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderStatusRepository.kt\ncom/adyen/checkout/components/core/internal/data/api/OrderStatusRepository\n+ 2 ResultExt.kt\ncom/adyen/checkout/core/internal/util/ResultExtKt\n+ 3 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,36:1\n17#2,2:37\n19#2,4:56\n16#3,17:39\n*S KotlinDebug\n*F\n+ 1 OrderStatusRepository.kt\ncom/adyen/checkout/components/core/internal/data/api/OrderStatusRepository\n*L\n26#1:37,2\n26#1:56,4\n27#1:39,17\n*E\n"})
public final class OrderStatusRepository {

    @NotNull
    private final OrderStatusService orderStatusService;

    public OrderStatusRepository(@NotNull OrderStatusService orderStatusService) {
        orderStatusService.getClass();
        this.orderStatusService = orderStatusService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: getOrderStatus-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m88getOrderStatus0E7RQCE(@org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull x70.c<? super u70.q<com.adyen.checkout.components.core.internal.data.model.OrderStatusResponse>> r12) {
        /*
            r9 = this;
            java.lang.String r0 = "CO."
            boolean r1 = r12 instanceof com.adyen.checkout.components.core.internal.data.api.OrderStatusRepository$getOrderStatus$1
            if (r1 == 0) goto L15
            r1 = r12
            com.adyen.checkout.components.core.internal.data.api.OrderStatusRepository$getOrderStatus$1 r1 = (com.adyen.checkout.components.core.internal.data.api.OrderStatusRepository$getOrderStatus$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            com.adyen.checkout.components.core.internal.data.api.OrderStatusRepository$getOrderStatus$1 r1 = new com.adyen.checkout.components.core.internal.data.api.OrderStatusRepository$getOrderStatus$1
            r1.<init>(r9, r12)
        L1a:
            java.lang.Object r12 = r1.result
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r1.label
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L34
            if (r3 != r4) goto L2e
            ba0.g.M(r12)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            goto L83
        L2a:
            r10 = move-exception
            goto L88
        L2c:
            r10 = move-exception
            goto L90
        L2e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r10)
            return r5
        L34:
            ba0.g.M(r12)
            u70.o r12 = u70.q.f40850b     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            com.adyen.checkout.core.AdyenLogLevel r12 = com.adyen.checkout.core.AdyenLogLevel.DEBUG     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            com.adyen.checkout.core.AdyenLogger$Companion r3 = com.adyen.checkout.core.AdyenLogger.INSTANCE     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            com.adyen.checkout.core.AdyenLogger r6 = r3.getLogger()     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            boolean r6 = r6.shouldLog(r12)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            if (r6 == 0) goto L73
            java.lang.Class<com.adyen.checkout.components.core.internal.data.api.OrderStatusRepository> r6 = com.adyen.checkout.components.core.internal.data.api.OrderStatusRepository.class
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            r7 = 36
            java.lang.String r7 = kotlin.text.StringsKt.Y(r6, r7)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            r8 = 46
            java.lang.String r7 = kotlin.text.StringsKt.W(r8, r7, r7)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            int r8 = r7.length()     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            if (r8 != 0) goto L60
            goto L66
        L60:
            java.lang.String r6 = "Kt"
            java.lang.String r6 = kotlin.text.StringsKt.O(r7, r6)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
        L66:
            java.lang.String r0 = r0.concat(r6)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            com.adyen.checkout.core.AdyenLogger r3 = r3.getLogger()     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            java.lang.String r6 = "Getting order status"
            r3.log(r12, r0, r6, r5)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
        L73:
            com.adyen.checkout.components.core.internal.data.model.OrderStatusRequest r12 = new com.adyen.checkout.components.core.internal.data.model.OrderStatusRequest     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            com.adyen.checkout.components.core.internal.data.api.OrderStatusService r11 = r9.orderStatusService     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            r1.label = r4     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            java.lang.Object r12 = r11.getOrderStatus$components_core_release(r12, r10, r1)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            if (r12 != r2) goto L83
            return r2
        L83:
            com.adyen.checkout.components.core.internal.data.model.OrderStatusResponse r12 = (com.adyen.checkout.components.core.internal.data.model.OrderStatusResponse) r12     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            u70.o r10 = u70.q.f40850b     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            return r12
        L88:
            u70.o r11 = u70.q.f40850b
            u70.p r11 = new u70.p
            r11.<init>(r10)
            return r11
        L90:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.components.core.internal.data.api.OrderStatusRepository.m88getOrderStatus0E7RQCE(java.lang.String, java.lang.String, x70.c):java.lang.Object");
    }
}
