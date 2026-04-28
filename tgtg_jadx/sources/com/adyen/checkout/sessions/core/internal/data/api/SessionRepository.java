package com.adyen.checkout.sessions.core.internal.data.api;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u0011H\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ0\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\f2\u0006\u0010\t\u001a\u00020\b2\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J$\u0010'\u001a\b\u0012\u0004\u0012\u00020$0\f2\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&J,\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010\u000fJ,\u0010/\u001a\b\u0012\u0004\u0012\u00020,0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u0004H\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/data/api/SessionRepository;", "", "Lcom/adyen/checkout/sessions/core/internal/data/api/SessionService;", "sessionService", "", "clientKey", "<init>", "(Lcom/adyen/checkout/sessions/core/internal/data/api/SessionService;Ljava/lang/String;)V", "Lcom/adyen/checkout/sessions/core/SessionModel;", "sessionModel", "Lcom/adyen/checkout/components/core/OrderRequest;", "order", "Lu70/q;", "Lcom/adyen/checkout/sessions/core/SessionSetupResponse;", "setupSession-0E7RQCE", "(Lcom/adyen/checkout/sessions/core/SessionModel;Lcom/adyen/checkout/components/core/OrderRequest;Lx70/c;)Ljava/lang/Object;", "setupSession", "Lcom/adyen/checkout/components/core/PaymentComponentData;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "paymentComponentData", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionPaymentsResponse;", "submitPayment-0E7RQCE", "(Lcom/adyen/checkout/sessions/core/SessionModel;Lcom/adyen/checkout/components/core/PaymentComponentData;Lx70/c;)Ljava/lang/Object;", "submitPayment", "Lcom/adyen/checkout/components/core/ActionComponentData;", "actionComponentData", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDetailsResponse;", "submitDetails-0E7RQCE", "(Lcom/adyen/checkout/sessions/core/SessionModel;Lcom/adyen/checkout/components/core/ActionComponentData;Lx70/c;)Ljava/lang/Object;", "submitDetails", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "paymentComponentState", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionBalanceResponse;", "checkBalance-0E7RQCE", "(Lcom/adyen/checkout/sessions/core/SessionModel;Lcom/adyen/checkout/components/core/PaymentComponentState;Lx70/c;)Ljava/lang/Object;", "checkBalance", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionOrderResponse;", "createOrder-gIAlu-s", "(Lcom/adyen/checkout/sessions/core/SessionModel;Lx70/c;)Ljava/lang/Object;", "createOrder", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionCancelOrderResponse;", "cancelOrder-0E7RQCE", "cancelOrder", "storedPaymentMethodId", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDisableTokenResponse;", "disableToken-0E7RQCE", "(Lcom/adyen/checkout/sessions/core/SessionModel;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "disableToken", "Lcom/adyen/checkout/sessions/core/internal/data/api/SessionService;", "Ljava/lang/String;", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSessionRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionRepository.kt\ncom/adyen/checkout/sessions/core/internal/data/api/SessionRepository\n+ 2 ResultExt.kt\ncom/adyen/checkout/core/internal/util/ResultExtKt\n*L\n1#1,129:1\n17#2,6:130\n17#2,6:136\n17#2,6:142\n17#2,6:148\n17#2,6:154\n17#2,6:160\n17#2,6:166\n*S KotlinDebug\n*F\n+ 1 SessionRepository.kt\ncom/adyen/checkout/sessions/core/internal/data/api/SessionRepository\n*L\n43#1:130,6\n55#1:136,6\n67#1:142,6\n83#1:148,6\n96#1:154,6\n108#1:160,6\n120#1:166,6\n*E\n"})
public final class SessionRepository {

    @NotNull
    private final String clientKey;

    @NotNull
    private final SessionService sessionService;

    public SessionRepository(@NotNull SessionService sessionService, @NotNull String str) {
        sessionService.getClass();
        str.getClass();
        this.sessionService = sessionService;
        this.clientKey = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: cancelOrder-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m105cancelOrder0E7RQCE(@org.jetbrains.annotations.NotNull com.adyen.checkout.sessions.core.SessionModel r5, @org.jetbrains.annotations.NotNull com.adyen.checkout.components.core.OrderRequest r6, @org.jetbrains.annotations.NotNull x70.c<? super u70.q<com.adyen.checkout.sessions.core.internal.data.model.SessionCancelOrderResponse>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$cancelOrder$1
            if (r0 == 0) goto L13
            r0 = r7
            com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$cancelOrder$1 r0 = (com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$cancelOrder$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$cancelOrder$1 r0 = new com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$cancelOrder$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r7)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L55
        L27:
            r5 = move-exception
            goto L5a
        L29:
            r5 = move-exception
            goto L62
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r7)
            u70.o r7 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            com.adyen.checkout.sessions.core.internal.data.model.SessionCancelOrderRequest r7 = new com.adyen.checkout.sessions.core.internal.data.model.SessionCancelOrderRequest     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.String r2 = r5.getSessionData()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r2 != 0) goto L41
            java.lang.String r2 = ""
        L41:
            r7.<init>(r2, r6)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            com.adyen.checkout.sessions.core.internal.data.api.SessionService r6 = r4.sessionService     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.String r5 = r5.getId()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.String r2 = r4.clientKey     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.label = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r7 = r6.cancelOrder(r7, r5, r2, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r7 != r1) goto L55
            return r1
        L55:
            com.adyen.checkout.sessions.core.internal.data.model.SessionCancelOrderResponse r7 = (com.adyen.checkout.sessions.core.internal.data.model.SessionCancelOrderResponse) r7     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            u70.o r5 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            return r7
        L5a:
            u70.o r6 = u70.q.f40850b
            u70.p r6 = new u70.p
            r6.<init>(r5)
            return r6
        L62:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.sessions.core.internal.data.api.SessionRepository.m105cancelOrder0E7RQCE(com.adyen.checkout.sessions.core.SessionModel, com.adyen.checkout.components.core.OrderRequest, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: checkBalance-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m106checkBalance0E7RQCE(@org.jetbrains.annotations.NotNull com.adyen.checkout.sessions.core.SessionModel r6, @org.jetbrains.annotations.NotNull com.adyen.checkout.components.core.PaymentComponentState<?> r7, @org.jetbrains.annotations.NotNull x70.c<? super u70.q<com.adyen.checkout.sessions.core.internal.data.model.SessionBalanceResponse>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$checkBalance$1
            if (r0 == 0) goto L13
            r0 = r8
            com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$checkBalance$1 r0 = (com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$checkBalance$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$checkBalance$1 r0 = new com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$checkBalance$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r8)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L65
        L27:
            r6 = move-exception
            goto L6a
        L29:
            r6 = move-exception
            goto L72
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L32:
            ba0.g.M(r8)
            u70.o r8 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            com.adyen.checkout.sessions.core.internal.data.model.SessionBalanceRequest r8 = new com.adyen.checkout.sessions.core.internal.data.model.SessionBalanceRequest     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.String r2 = r6.getSessionData()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r2 != 0) goto L41
            java.lang.String r2 = ""
        L41:
            com.adyen.checkout.components.core.PaymentComponentData r4 = r7.getData()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails r4 = r4.getPaymentMethod()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            com.adyen.checkout.components.core.PaymentComponentData r7 = r7.getData()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            com.adyen.checkout.components.core.Amount r7 = r7.getAmount()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r8.<init>(r2, r4, r7)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            com.adyen.checkout.sessions.core.internal.data.api.SessionService r7 = r5.sessionService     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.String r6 = r6.getId()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.String r2 = r5.clientKey     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.label = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r8 = r7.checkBalance(r8, r6, r2, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r8 != r1) goto L65
            return r1
        L65:
            com.adyen.checkout.sessions.core.internal.data.model.SessionBalanceResponse r8 = (com.adyen.checkout.sessions.core.internal.data.model.SessionBalanceResponse) r8     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            u70.o r6 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            return r8
        L6a:
            u70.o r7 = u70.q.f40850b
            u70.p r7 = new u70.p
            r7.<init>(r6)
            return r7
        L72:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.sessions.core.internal.data.api.SessionRepository.m106checkBalance0E7RQCE(com.adyen.checkout.sessions.core.SessionModel, com.adyen.checkout.components.core.PaymentComponentState, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: createOrder-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m107createOrdergIAlus(@org.jetbrains.annotations.NotNull com.adyen.checkout.sessions.core.SessionModel r6, @org.jetbrains.annotations.NotNull x70.c<? super u70.q<com.adyen.checkout.sessions.core.internal.data.model.SessionOrderResponse>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$createOrder$1
            if (r0 == 0) goto L13
            r0 = r7
            com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$createOrder$1 r0 = (com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$createOrder$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$createOrder$1 r0 = new com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$createOrder$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r7)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L55
        L27:
            r6 = move-exception
            goto L5a
        L29:
            r6 = move-exception
            goto L62
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L32:
            ba0.g.M(r7)
            u70.o r7 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            com.adyen.checkout.sessions.core.internal.data.model.SessionOrderRequest r7 = new com.adyen.checkout.sessions.core.internal.data.model.SessionOrderRequest     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.String r2 = r6.getSessionData()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r2 != 0) goto L41
            java.lang.String r2 = ""
        L41:
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            com.adyen.checkout.sessions.core.internal.data.api.SessionService r2 = r5.sessionService     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.String r6 = r6.getId()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.String r4 = r5.clientKey     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.label = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r7 = r2.createOrder(r7, r6, r4, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r7 != r1) goto L55
            return r1
        L55:
            com.adyen.checkout.sessions.core.internal.data.model.SessionOrderResponse r7 = (com.adyen.checkout.sessions.core.internal.data.model.SessionOrderResponse) r7     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            u70.o r6 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            return r7
        L5a:
            u70.o r7 = u70.q.f40850b
            u70.p r7 = new u70.p
            r7.<init>(r6)
            return r7
        L62:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.sessions.core.internal.data.api.SessionRepository.m107createOrdergIAlus(com.adyen.checkout.sessions.core.SessionModel, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: disableToken-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m108disableToken0E7RQCE(@org.jetbrains.annotations.NotNull com.adyen.checkout.sessions.core.SessionModel r5, @org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull x70.c<? super u70.q<com.adyen.checkout.sessions.core.internal.data.model.SessionDisableTokenResponse>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$disableToken$1
            if (r0 == 0) goto L13
            r0 = r7
            com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$disableToken$1 r0 = (com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$disableToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$disableToken$1 r0 = new com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$disableToken$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r7)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L55
        L27:
            r5 = move-exception
            goto L5a
        L29:
            r5 = move-exception
            goto L62
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r7)
            u70.o r7 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            com.adyen.checkout.sessions.core.internal.data.model.SessionDisableTokenRequest r7 = new com.adyen.checkout.sessions.core.internal.data.model.SessionDisableTokenRequest     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.String r2 = r5.getSessionData()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r2 != 0) goto L41
            java.lang.String r2 = ""
        L41:
            r7.<init>(r2, r6)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            com.adyen.checkout.sessions.core.internal.data.api.SessionService r6 = r4.sessionService     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.String r5 = r5.getId()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.String r2 = r4.clientKey     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.label = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r7 = r6.disableToken(r7, r5, r2, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r7 != r1) goto L55
            return r1
        L55:
            com.adyen.checkout.sessions.core.internal.data.model.SessionDisableTokenResponse r7 = (com.adyen.checkout.sessions.core.internal.data.model.SessionDisableTokenResponse) r7     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            u70.o r5 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            return r7
        L5a:
            u70.o r6 = u70.q.f40850b
            u70.p r6 = new u70.p
            r6.<init>(r5)
            return r6
        L62:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.sessions.core.internal.data.api.SessionRepository.m108disableToken0E7RQCE(com.adyen.checkout.sessions.core.SessionModel, java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: setupSession-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m109setupSession0E7RQCE(@org.jetbrains.annotations.NotNull com.adyen.checkout.sessions.core.SessionModel r5, @org.jetbrains.annotations.Nullable com.adyen.checkout.components.core.OrderRequest r6, @org.jetbrains.annotations.NotNull x70.c<? super u70.q<com.adyen.checkout.sessions.core.SessionSetupResponse>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$setupSession$1
            if (r0 == 0) goto L13
            r0 = r7
            com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$setupSession$1 r0 = (com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$setupSession$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$setupSession$1 r0 = new com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$setupSession$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r7)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L55
        L27:
            r5 = move-exception
            goto L5a
        L29:
            r5 = move-exception
            goto L62
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r7)
            u70.o r7 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            com.adyen.checkout.sessions.core.internal.data.model.SessionSetupRequest r7 = new com.adyen.checkout.sessions.core.internal.data.model.SessionSetupRequest     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.String r2 = r5.getSessionData()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r2 != 0) goto L41
            java.lang.String r2 = ""
        L41:
            r7.<init>(r2, r6)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            com.adyen.checkout.sessions.core.internal.data.api.SessionService r6 = r4.sessionService     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.String r5 = r5.getId()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.String r2 = r4.clientKey     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.label = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r7 = r6.setupSession(r7, r5, r2, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r7 != r1) goto L55
            return r1
        L55:
            com.adyen.checkout.sessions.core.SessionSetupResponse r7 = (com.adyen.checkout.sessions.core.SessionSetupResponse) r7     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            u70.o r5 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            return r7
        L5a:
            u70.o r6 = u70.q.f40850b
            u70.p r6 = new u70.p
            r6.<init>(r5)
            return r6
        L62:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.sessions.core.internal.data.api.SessionRepository.m109setupSession0E7RQCE(com.adyen.checkout.sessions.core.SessionModel, com.adyen.checkout.components.core.OrderRequest, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: submitDetails-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m110submitDetails0E7RQCE(@org.jetbrains.annotations.NotNull com.adyen.checkout.sessions.core.SessionModel r6, @org.jetbrains.annotations.NotNull com.adyen.checkout.components.core.ActionComponentData r7, @org.jetbrains.annotations.NotNull x70.c<? super u70.q<com.adyen.checkout.sessions.core.internal.data.model.SessionDetailsResponse>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$submitDetails$1
            if (r0 == 0) goto L13
            r0 = r8
            com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$submitDetails$1 r0 = (com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$submitDetails$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$submitDetails$1 r0 = new com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$submitDetails$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r8)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L5d
        L27:
            r6 = move-exception
            goto L62
        L29:
            r6 = move-exception
            goto L6a
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L32:
            ba0.g.M(r8)
            u70.o r8 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            com.adyen.checkout.sessions.core.internal.data.model.SessionDetailsRequest r8 = new com.adyen.checkout.sessions.core.internal.data.model.SessionDetailsRequest     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.String r2 = r6.getSessionData()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r2 != 0) goto L41
            java.lang.String r2 = ""
        L41:
            java.lang.String r4 = r7.getPaymentData()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            org.json.JSONObject r7 = r7.getDetails()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r8.<init>(r2, r4, r7)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            com.adyen.checkout.sessions.core.internal.data.api.SessionService r7 = r5.sessionService     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.String r6 = r6.getId()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.String r2 = r5.clientKey     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.label = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r8 = r7.submitDetails(r8, r6, r2, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r8 != r1) goto L5d
            return r1
        L5d:
            com.adyen.checkout.sessions.core.internal.data.model.SessionDetailsResponse r8 = (com.adyen.checkout.sessions.core.internal.data.model.SessionDetailsResponse) r8     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            u70.o r6 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            return r8
        L62:
            u70.o r7 = u70.q.f40850b
            u70.p r7 = new u70.p
            r7.<init>(r6)
            return r7
        L6a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.sessions.core.internal.data.api.SessionRepository.m110submitDetails0E7RQCE(com.adyen.checkout.sessions.core.SessionModel, com.adyen.checkout.components.core.ActionComponentData, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: submitPayment-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m111submitPayment0E7RQCE(@org.jetbrains.annotations.NotNull com.adyen.checkout.sessions.core.SessionModel r5, @org.jetbrains.annotations.NotNull com.adyen.checkout.components.core.PaymentComponentData<? extends com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails> r6, @org.jetbrains.annotations.NotNull x70.c<? super u70.q<com.adyen.checkout.sessions.core.internal.data.model.SessionPaymentsResponse>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$submitPayment$1
            if (r0 == 0) goto L13
            r0 = r7
            com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$submitPayment$1 r0 = (com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$submitPayment$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$submitPayment$1 r0 = new com.adyen.checkout.sessions.core.internal.data.api.SessionRepository$submitPayment$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r7)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L55
        L27:
            r5 = move-exception
            goto L5a
        L29:
            r5 = move-exception
            goto L62
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r7)
            u70.o r7 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            com.adyen.checkout.sessions.core.internal.data.model.SessionPaymentsRequest r7 = new com.adyen.checkout.sessions.core.internal.data.model.SessionPaymentsRequest     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.String r2 = r5.getSessionData()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r2 != 0) goto L41
            java.lang.String r2 = ""
        L41:
            r7.<init>(r2, r6)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            com.adyen.checkout.sessions.core.internal.data.api.SessionService r6 = r4.sessionService     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.String r5 = r5.getId()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.String r2 = r4.clientKey     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.label = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r7 = r6.submitPayment(r7, r5, r2, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r7 != r1) goto L55
            return r1
        L55:
            com.adyen.checkout.sessions.core.internal.data.model.SessionPaymentsResponse r7 = (com.adyen.checkout.sessions.core.internal.data.model.SessionPaymentsResponse) r7     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            u70.o r5 = u70.q.f40850b     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            return r7
        L5a:
            u70.o r6 = u70.q.f40850b
            u70.p r6 = new u70.p
            r6.<init>(r5)
            return r6
        L62:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.sessions.core.internal.data.api.SessionRepository.m111submitPayment0E7RQCE(com.adyen.checkout.sessions.core.SessionModel, com.adyen.checkout.components.core.PaymentComponentData, x70.c):java.lang.Object");
    }
}
