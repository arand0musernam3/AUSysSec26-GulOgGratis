package com.adyen.checkout.sessions.core.internal;

import ba0.g;
import com.adyen.checkout.components.core.ActionComponentData;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.OrderRequest;
import com.adyen.checkout.components.core.OrderResponse;
import com.adyen.checkout.components.core.PaymentComponentState;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManager;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.sessions.core.SessionModel;
import com.adyen.checkout.sessions.core.SessionPaymentResult;
import com.adyen.checkout.sessions.core.internal.SessionCallResult;
import com.adyen.checkout.sessions.core.internal.data.api.SessionRepository;
import com.adyen.checkout.sessions.core.internal.data.model.SessionDetailsResponse;
import com.adyen.checkout.sessions.core.internal.data.model.SessionPaymentsResponse;
import com.app.tgtg.model.local.AppConstants;
import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x70.c;
import y70.a;
import y80.a2;
import y80.f1;
import y80.i;
import y80.r;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJB\u0010\u0014\u001a\u00020\u0013\"\f\b\u0000\u0010\r*\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000e\u001a\u00028\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J4\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ<\u0010\u001c\u001a\u00020\u001b2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\f2\u0016\u0010\u0010\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\u00060\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u001c\u0010\u0015J&\u0010\u001f\u001a\u00020\u001e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d2\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u001f\u0010 J4\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00060\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b$\u0010%J\u001c\u0010(\u001a\u00020'2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010&H\u0086@¢\u0006\u0004\b(\u0010)J\u0018\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b,\u0010-J\u001c\u0010.\u001a\u00020\u00132\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\fH\u0082@¢\u0006\u0004\b.\u0010/J\u0013\u00101\u001a\u00020\u0006*\u000200H\u0002¢\u0006\u0004\b1\u00102J\u0013\u00103\u001a\u00020\u0006*\u000200H\u0002¢\u0006\u0004\b3\u00102J\u0015\u00104\u001a\u00020\u0006*\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b4\u00105J\u0018\u00106\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b6\u00107J\u001c\u00108\u001a\u00020\u001b2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\fH\u0082@¢\u0006\u0004\b8\u0010/J\u0010\u00109\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b9\u0010:J\u0018\u0010;\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0082@¢\u0006\u0004\b;\u0010<Jl\u0010B\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020=2\u001c\u0010\u0010\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060>\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f2\u001c\u0010?\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000>\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f2\u0006\u0010@\u001a\u00020\u00112\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0082@¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020E2\u0006\u0010D\u001a\u00020\u0011H\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020I2\u0006\u0010H\u001a\u000200H\u0002¢\u0006\u0004\bJ\u0010KJ\u0013\u0010M\u001a\u00020L*\u000200H\u0002¢\u0006\u0004\bM\u0010NJ\u0013\u0010M\u001a\u00020L*\u00020OH\u0002¢\u0006\u0004\bM\u0010PR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010QR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010RR*\u0010\u0007\u001a\u00020\u00062\u0006\u0010S\u001a\u00020\u00068\u0000@BX\u0081\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010T\u0012\u0004\bW\u0010X\u001a\u0004\bU\u0010VR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00040Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001d\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00040\\8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010b¨\u0006c"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionInteractor;", "", "Lcom/adyen/checkout/sessions/core/internal/data/api/SessionRepository;", "sessionRepository", "Lcom/adyen/checkout/sessions/core/SessionModel;", "sessionModel", "", "isFlowTakenOver", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "<init>", "(Lcom/adyen/checkout/sessions/core/internal/data/api/SessionRepository;Lcom/adyen/checkout/sessions/core/SessionModel;ZLcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;)V", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "T", "paymentComponentState", "Lkotlin/Function1;", "merchantCall", "", "merchantCallName", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Payments;", "onPaymentsCallRequested", "(Lcom/adyen/checkout/components/core/PaymentComponentState;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lcom/adyen/checkout/components/core/ActionComponentData;", "actionComponentData", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Details;", "onDetailsCallRequested", "(Lcom/adyen/checkout/components/core/ActionComponentData;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Balance;", "checkBalance", "Lkotlin/Function0;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$CreateOrder;", "createOrder", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lcom/adyen/checkout/components/core/OrderRequest;", "order", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$CancelOrder;", "cancelOrder", "(Lcom/adyen/checkout/components/core/OrderRequest;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lcom/adyen/checkout/components/core/OrderResponse;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$UpdatePaymentMethods;", "updatePaymentMethods", "(Lcom/adyen/checkout/components/core/OrderResponse;Lx70/c;)Ljava/lang/Object;", "storedPaymentMethodId", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$RemoveStoredPaymentMethod;", "removeStoredPaymentMethod", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "makePaymentsCallInternal", "(Lcom/adyen/checkout/components/core/PaymentComponentState;Lx70/c;)Ljava/lang/Object;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionPaymentsResponse;", "isRefusedInPartialPaymentFlow", "(Lcom/adyen/checkout/sessions/core/internal/data/model/SessionPaymentsResponse;)Z", "isRefused", "isNonFullyPaid", "(Lcom/adyen/checkout/components/core/OrderResponse;)Z", "makeDetailsCallInternal", "(Lcom/adyen/checkout/components/core/ActionComponentData;Lx70/c;)Ljava/lang/Object;", "makeCheckBalanceCallInternal", "makeCreateOrderInternal", "(Lx70/c;)Ljava/lang/Object;", "makeCancelOrderCallInternal", "(Lcom/adyen/checkout/components/core/OrderRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult;", "Lx70/c;", "internalCall", "merchantMethodName", "takenOverFactory", "checkIfCallWasHandled", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lx70/c;)Ljava/lang/Object;", "sessionData", "", "updateSessionData", "(Ljava/lang/String;)V", "response", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Payments$NotFullyPaidOrder;", "onNonFullyPaidOrder", "(Lcom/adyen/checkout/sessions/core/internal/data/model/SessionPaymentsResponse;)Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Payments$NotFullyPaidOrder;", "Lcom/adyen/checkout/sessions/core/SessionPaymentResult;", "mapToSessionPaymentResult", "(Lcom/adyen/checkout/sessions/core/internal/data/model/SessionPaymentsResponse;)Lcom/adyen/checkout/sessions/core/SessionPaymentResult;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDetailsResponse;", "(Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDetailsResponse;)Lcom/adyen/checkout/sessions/core/SessionPaymentResult;", "Lcom/adyen/checkout/sessions/core/internal/data/api/SessionRepository;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "<set-?>", "Z", "isFlowTakenOver$sessions_core_release", "()Z", "isFlowTakenOver$sessions_core_release$annotations", "()V", "Ly80/f1;", "_sessionFlow", "Ly80/f1;", "Ly80/i;", "sessionFlow", "Ly80/i;", "getSessionFlow", "()Ly80/i;", "getSessionModel", "()Lcom/adyen/checkout/sessions/core/SessionModel;", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSessionInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionInteractor.kt\ncom/adyen/checkout/sessions/core/internal/SessionInteractor\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,319:1\n230#2,5:320\n*S KotlinDebug\n*F\n+ 1 SessionInteractor.kt\ncom/adyen/checkout/sessions/core/internal/SessionInteractor\n*L\n290#1:320,5\n*E\n"})
public final class SessionInteractor {

    @NotNull
    private final f1 _sessionFlow;

    @Nullable
    private final AnalyticsManager analyticsManager;
    private boolean isFlowTakenOver;

    @NotNull
    private final i sessionFlow;

    @NotNull
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.SessionInteractor$cancelOrder$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.SessionInteractor$cancelOrder$2", f = "SessionInteractor.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends z70.i implements Function1<c<? super Boolean>, Object> {
        final /* synthetic */ Function1<OrderRequest, Boolean> $merchantCall;
        final /* synthetic */ OrderRequest $order;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super OrderRequest, Boolean> function1, OrderRequest orderRequest, c<? super AnonymousClass2> cVar) {
            super(1, cVar);
            this.$merchantCall = function1;
            this.$order = orderRequest;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@NotNull c<?> cVar) {
            return new AnonymousClass2(this.$merchantCall, this.$order, cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable c<? super Boolean> cVar) {
            return ((AnonymousClass2) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                g.M(obj);
                return this.$merchantCall.invoke(this.$order);
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.SessionInteractor$cancelOrder$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.SessionInteractor$cancelOrder$3", f = "SessionInteractor.kt", l = {199}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$CancelOrder;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass3 extends z70.i implements Function1<c<? super SessionCallResult.CancelOrder>, Object> {
        final /* synthetic */ OrderRequest $order;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(OrderRequest orderRequest, c<? super AnonymousClass3> cVar) {
            super(1, cVar);
            this.$order = orderRequest;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@NotNull c<?> cVar) {
            return SessionInteractor.this.new AnonymousClass3(this.$order, cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable c<? super SessionCallResult.CancelOrder> cVar) {
            return ((AnonymousClass3) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    g.M(obj);
                    return obj;
                }
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            SessionInteractor sessionInteractor = SessionInteractor.this;
            OrderRequest orderRequest = this.$order;
            this.label = 1;
            Object objMakeCancelOrderCallInternal = sessionInteractor.makeCancelOrderCallInternal(orderRequest, this);
            return objMakeCancelOrderCallInternal == aVar ? aVar : objMakeCancelOrderCallInternal;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.SessionInteractor$checkBalance$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.SessionInteractor$checkBalance$2", f = "SessionInteractor.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01112 extends z70.i implements Function1<c<? super Boolean>, Object> {
        final /* synthetic */ Function1<PaymentComponentState<?>, Boolean> $merchantCall;
        final /* synthetic */ PaymentComponentState<?> $paymentComponentState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C01112(Function1<? super PaymentComponentState<?>, Boolean> function1, PaymentComponentState<?> paymentComponentState, c<? super C01112> cVar) {
            super(1, cVar);
            this.$merchantCall = function1;
            this.$paymentComponentState = paymentComponentState;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@NotNull c<?> cVar) {
            return new C01112(this.$merchantCall, this.$paymentComponentState, cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable c<? super Boolean> cVar) {
            return ((C01112) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                g.M(obj);
                return this.$merchantCall.invoke(this.$paymentComponentState);
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.SessionInteractor$checkBalance$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.SessionInteractor$checkBalance$3", f = "SessionInteractor.kt", l = {140}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Balance;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01123 extends z70.i implements Function1<c<? super SessionCallResult.Balance>, Object> {
        final /* synthetic */ PaymentComponentState<?> $paymentComponentState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01123(PaymentComponentState<?> paymentComponentState, c<? super C01123> cVar) {
            super(1, cVar);
            this.$paymentComponentState = paymentComponentState;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@NotNull c<?> cVar) {
            return SessionInteractor.this.new C01123(this.$paymentComponentState, cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable c<? super SessionCallResult.Balance> cVar) {
            return ((C01123) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    g.M(obj);
                    return obj;
                }
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            SessionInteractor sessionInteractor = SessionInteractor.this;
            PaymentComponentState<?> paymentComponentState = this.$paymentComponentState;
            this.label = 1;
            Object objMakeCheckBalanceCallInternal = sessionInteractor.makeCheckBalanceCallInternal(paymentComponentState, this);
            return objMakeCheckBalanceCallInternal == aVar ? aVar : objMakeCheckBalanceCallInternal;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.SessionInteractor$checkIfCallWasHandled$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.SessionInteractor", f = "SessionInteractor.kt", l = {271, 279}, m = "checkIfCallWasHandled")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1<T extends SessionCallResult> extends z70.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
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
            return SessionInteractor.this.checkIfCallWasHandled(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.SessionInteractor$createOrder$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.SessionInteractor$createOrder$2", f = "SessionInteractor.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01142 extends z70.i implements Function1<c<? super Boolean>, Object> {
        final /* synthetic */ Function0<Boolean> $merchantCall;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01142(Function0<Boolean> function0, c<? super C01142> cVar) {
            super(1, cVar);
            this.$merchantCall = function0;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@NotNull c<?> cVar) {
            return new C01142(this.$merchantCall, cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable c<? super Boolean> cVar) {
            return ((C01142) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                g.M(obj);
                return this.$merchantCall.invoke();
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.SessionInteractor$createOrder$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.SessionInteractor$createOrder$3", f = "SessionInteractor.kt", l = {166}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$CreateOrder;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01153 extends z70.i implements Function1<c<? super SessionCallResult.CreateOrder>, Object> {
        int label;

        public C01153(c<? super C01153> cVar) {
            super(1, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@NotNull c<?> cVar) {
            return SessionInteractor.this.new C01153(cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable c<? super SessionCallResult.CreateOrder> cVar) {
            return ((C01153) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    g.M(obj);
                    return obj;
                }
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            SessionInteractor sessionInteractor = SessionInteractor.this;
            this.label = 1;
            Object objMakeCreateOrderInternal = sessionInteractor.makeCreateOrderInternal(this);
            return objMakeCreateOrderInternal == aVar ? aVar : objMakeCreateOrderInternal;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.SessionInteractor$makeCancelOrderCallInternal$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.SessionInteractor", f = "SessionInteractor.kt", l = {208}, m = "makeCancelOrderCallInternal")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01171 extends z70.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C01171(c<? super C01171> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionInteractor.this.makeCancelOrderCallInternal(null, this);
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.SessionInteractor$makeCheckBalanceCallInternal$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.SessionInteractor", f = "SessionInteractor.kt", l = {AppConstants.CONTACT_US_REQUEST_FILE}, m = "makeCheckBalanceCallInternal")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01181 extends z70.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C01181(c<? super C01181> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionInteractor.this.makeCheckBalanceCallInternal(null, this);
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.SessionInteractor$makeCreateOrderInternal$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.SessionInteractor", f = "SessionInteractor.kt", l = {173}, m = "makeCreateOrderInternal")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01191 extends z70.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C01191(c<? super C01191> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionInteractor.this.makeCreateOrderInternal(this);
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.SessionInteractor$makeDetailsCallInternal$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.SessionInteractor", f = "SessionInteractor.kt", l = {117}, m = "makeDetailsCallInternal")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01201 extends z70.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C01201(c<? super C01201> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionInteractor.this.makeDetailsCallInternal(null, this);
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.SessionInteractor$makePaymentsCallInternal$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.SessionInteractor", f = "SessionInteractor.kt", l = {67}, m = "makePaymentsCallInternal")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01211 extends z70.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C01211(c<? super C01211> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionInteractor.this.makePaymentsCallInternal(null, this);
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.SessionInteractor$onDetailsCallRequested$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.SessionInteractor$onDetailsCallRequested$2", f = "SessionInteractor.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01222 extends z70.i implements Function1<c<? super Boolean>, Object> {
        final /* synthetic */ ActionComponentData $actionComponentData;
        final /* synthetic */ Function1<ActionComponentData, Boolean> $merchantCall;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C01222(Function1<? super ActionComponentData, Boolean> function1, ActionComponentData actionComponentData, c<? super C01222> cVar) {
            super(1, cVar);
            this.$merchantCall = function1;
            this.$actionComponentData = actionComponentData;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@NotNull c<?> cVar) {
            return new C01222(this.$merchantCall, this.$actionComponentData, cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable c<? super Boolean> cVar) {
            return ((C01222) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                g.M(obj);
                return this.$merchantCall.invoke(this.$actionComponentData);
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.SessionInteractor$onDetailsCallRequested$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.SessionInteractor$onDetailsCallRequested$3", f = "SessionInteractor.kt", l = {110}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Details;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01233 extends z70.i implements Function1<c<? super SessionCallResult.Details>, Object> {
        final /* synthetic */ ActionComponentData $actionComponentData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01233(ActionComponentData actionComponentData, c<? super C01233> cVar) {
            super(1, cVar);
            this.$actionComponentData = actionComponentData;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@NotNull c<?> cVar) {
            return SessionInteractor.this.new C01233(this.$actionComponentData, cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable c<? super SessionCallResult.Details> cVar) {
            return ((C01233) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    g.M(obj);
                    return obj;
                }
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            SessionInteractor sessionInteractor = SessionInteractor.this;
            ActionComponentData actionComponentData = this.$actionComponentData;
            this.label = 1;
            Object objMakeDetailsCallInternal = sessionInteractor.makeDetailsCallInternal(actionComponentData, this);
            return objMakeDetailsCallInternal == aVar ? aVar : objMakeDetailsCallInternal;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.SessionInteractor$onPaymentsCallRequested$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.SessionInteractor$onPaymentsCallRequested$2", f = "SessionInteractor.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lcom/adyen/checkout/components/core/PaymentComponentState;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01252 extends z70.i implements Function1<c<? super Boolean>, Object> {
        final /* synthetic */ Function1<T, Boolean> $merchantCall;

        /* JADX INFO: Incorrect field signature: TT; */
        final /* synthetic */ PaymentComponentState $paymentComponentState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function1<-TT;Ljava/lang/Boolean;>;TT;Lx70/c<-Lcom/adyen/checkout/sessions/core/internal/SessionInteractor$onPaymentsCallRequested$2;>;)V */
        public C01252(Function1 function1, PaymentComponentState paymentComponentState, c cVar) {
            super(1, cVar);
            this.$merchantCall = function1;
            this.$paymentComponentState = paymentComponentState;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@NotNull c<?> cVar) {
            return new C01252(this.$merchantCall, this.$paymentComponentState, cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable c<? super Boolean> cVar) {
            return ((C01252) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                g.M(obj);
                return this.$merchantCall.invoke(this.$paymentComponentState);
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.SessionInteractor$onPaymentsCallRequested$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.SessionInteractor$onPaymentsCallRequested$3", f = "SessionInteractor.kt", l = {58}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0003H\u008a@"}, d2 = {"<anonymous>", "Lcom/adyen/checkout/sessions/core/internal/SessionCallResult$Payments;", "T", "Lcom/adyen/checkout/components/core/PaymentComponentState;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01263 extends z70.i implements Function1<c<? super SessionCallResult.Payments>, Object> {

        /* JADX INFO: Incorrect field signature: TT; */
        final /* synthetic */ PaymentComponentState $paymentComponentState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lcom/adyen/checkout/sessions/core/internal/SessionInteractor;TT;Lx70/c<-Lcom/adyen/checkout/sessions/core/internal/SessionInteractor$onPaymentsCallRequested$3;>;)V */
        public C01263(PaymentComponentState paymentComponentState, c cVar) {
            super(1, cVar);
            this.$paymentComponentState = paymentComponentState;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@NotNull c<?> cVar) {
            return SessionInteractor.this.new C01263(this.$paymentComponentState, cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable c<? super SessionCallResult.Payments> cVar) {
            return ((C01263) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    g.M(obj);
                    return obj;
                }
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            SessionInteractor sessionInteractor = SessionInteractor.this;
            PaymentComponentState paymentComponentState = this.$paymentComponentState;
            this.label = 1;
            Object objMakePaymentsCallInternal = sessionInteractor.makePaymentsCallInternal(paymentComponentState, this);
            return objMakePaymentsCallInternal == aVar ? aVar : objMakePaymentsCallInternal;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.SessionInteractor$removeStoredPaymentMethod$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.SessionInteractor", f = "SessionInteractor.kt", l = {252}, m = "removeStoredPaymentMethod")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01281 extends z70.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C01281(c<? super C01281> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionInteractor.this.removeStoredPaymentMethod(null, this);
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.SessionInteractor$updatePaymentMethods$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.SessionInteractor", f = "SessionInteractor.kt", l = {229}, m = "updatePaymentMethods")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01291 extends z70.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C01291(c<? super C01291> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionInteractor.this.updatePaymentMethods(null, this);
        }
    }

    public SessionInteractor(@NotNull SessionRepository sessionRepository, @NotNull SessionModel sessionModel, boolean z11, @Nullable AnalyticsManager analyticsManager) {
        sessionRepository.getClass();
        sessionModel.getClass();
        this.sessionRepository = sessionRepository;
        this.analyticsManager = analyticsManager;
        this.isFlowTakenOver = z11;
        a2 a2VarC = r.c(sessionModel);
        this._sessionFlow = a2VarC;
        this.sessionFlow = a2VarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T extends com.adyen.checkout.sessions.core.internal.SessionCallResult> java.lang.Object checkIfCallWasHandled(kotlin.jvm.functions.Function1<? super x70.c<? super java.lang.Boolean>, ? extends java.lang.Object> r6, kotlin.jvm.functions.Function1<? super x70.c<? super T>, ? extends java.lang.Object> r7, java.lang.String r8, kotlin.jvm.functions.Function0<? extends T> r9, x70.c<? super T> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof com.adyen.checkout.sessions.core.internal.SessionInteractor.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            com.adyen.checkout.sessions.core.internal.SessionInteractor$checkIfCallWasHandled$1 r0 = (com.adyen.checkout.sessions.core.internal.SessionInteractor.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.adyen.checkout.sessions.core.internal.SessionInteractor$checkIfCallWasHandled$1 r0 = new com.adyen.checkout.sessions.core.internal.SessionInteractor$checkIfCallWasHandled$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            ba0.g.M(r10)
            return r10
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L31:
            java.lang.Object r6 = r0.L$3
            r9 = r6
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            java.lang.Object r6 = r0.L$2
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r6 = r0.L$1
            r7 = r6
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            java.lang.Object r6 = r0.L$0
            com.adyen.checkout.sessions.core.internal.SessionInteractor r6 = (com.adyen.checkout.sessions.core.internal.SessionInteractor) r6
            ba0.g.M(r10)
            goto L5d
        L48:
            ba0.g.M(r10)
            r0.L$0 = r5
            r0.L$1 = r7
            r0.L$2 = r8
            r0.L$3 = r9
            r0.label = r4
            java.lang.Object r10 = r6.invoke(r0)
            if (r10 != r1) goto L5c
            goto L7a
        L5c:
            r6 = r5
        L5d:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L8a
            boolean r6 = r6.isFlowTakenOver
            r9 = 0
            if (r6 != 0) goto L7c
            r0.L$0 = r9
            r0.L$1 = r9
            r0.L$2 = r9
            r0.L$3 = r9
            r0.label = r3
            java.lang.Object r6 = r7.invoke(r0)
            if (r6 != r1) goto L7b
        L7a:
            return r1
        L7b:
            return r6
        L7c:
            com.adyen.checkout.core.exception.MethodNotImplementedException r6 = new com.adyen.checkout.core.exception.MethodNotImplementedException
            java.lang.String r7 = "Sessions flow was already taken over in a previous call, "
            java.lang.String r10 = " should be implemented"
            java.lang.String r7 = w.a0.p(r7, r8, r10)
            r6.<init>(r7, r9, r3, r9)
            throw r6
        L8a:
            boolean r7 = r6.isFlowTakenOver
            if (r7 != 0) goto L90
            r6.isFlowTakenOver = r4
        L90:
            java.lang.Object r6 = r9.invoke()
            com.adyen.checkout.sessions.core.internal.SessionCallResult r6 = (com.adyen.checkout.sessions.core.internal.SessionCallResult) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.sessions.core.internal.SessionInteractor.checkIfCallWasHandled(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, java.lang.String, kotlin.jvm.functions.Function0, x70.c):java.lang.Object");
    }

    private final SessionModel getSessionModel() {
        return (SessionModel) ((a2) this._sessionFlow).getValue();
    }

    private final boolean isNonFullyPaid(OrderResponse orderResponse) {
        Amount remainingAmount;
        return ((orderResponse == null || (remainingAmount = orderResponse.getRemainingAmount()) == null) ? 0L : remainingAmount.getValue()) > 0;
    }

    private final boolean isRefused(SessionPaymentsResponse sessionPaymentsResponse) {
        return y.k(sessionPaymentsResponse.getResultCode(), StatusResponseUtils.RESULT_REFUSED, true);
    }

    private final boolean isRefusedInPartialPaymentFlow(SessionPaymentsResponse sessionPaymentsResponse) {
        return isRefused(sessionPaymentsResponse) && isNonFullyPaid(sessionPaymentsResponse.getOrder());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object makeCancelOrderCallInternal(com.adyen.checkout.components.core.OrderRequest r5, x70.c<? super com.adyen.checkout.sessions.core.internal.SessionCallResult.CancelOrder> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.adyen.checkout.sessions.core.internal.SessionInteractor.C01171
            if (r0 == 0) goto L13
            r0 = r6
            com.adyen.checkout.sessions.core.internal.SessionInteractor$makeCancelOrderCallInternal$1 r0 = (com.adyen.checkout.sessions.core.internal.SessionInteractor.C01171) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.adyen.checkout.sessions.core.internal.SessionInteractor$makeCancelOrderCallInternal$1 r0 = new com.adyen.checkout.sessions.core.internal.SessionInteractor$makeCancelOrderCallInternal$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.L$0
            com.adyen.checkout.sessions.core.internal.SessionInteractor r5 = (com.adyen.checkout.sessions.core.internal.SessionInteractor) r5
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r6 = r6.f40851a
            goto L4b
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L36:
            ba0.g.M(r6)
            com.adyen.checkout.sessions.core.internal.data.api.SessionRepository r6 = r4.sessionRepository
            com.adyen.checkout.sessions.core.SessionModel r2 = r4.getSessionModel()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.m105cancelOrder0E7RQCE(r2, r5, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r5 = r4
        L4b:
            java.lang.Throwable r0 = u70.q.a(r6)
            if (r0 != 0) goto L5d
            com.adyen.checkout.sessions.core.internal.data.model.SessionCancelOrderResponse r6 = (com.adyen.checkout.sessions.core.internal.data.model.SessionCancelOrderResponse) r6
            java.lang.String r6 = r6.getSessionData()
            r5.updateSessionData(r6)
            com.adyen.checkout.sessions.core.internal.SessionCallResult$CancelOrder$Successful r5 = com.adyen.checkout.sessions.core.internal.SessionCallResult.CancelOrder.Successful.INSTANCE
            return r5
        L5d:
            com.adyen.checkout.sessions.core.internal.SessionCallResult$CancelOrder$Error r5 = new com.adyen.checkout.sessions.core.internal.SessionCallResult$CancelOrder$Error
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.sessions.core.internal.SessionInteractor.makeCancelOrderCallInternal(com.adyen.checkout.components.core.OrderRequest, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object makeCheckBalanceCallInternal(com.adyen.checkout.components.core.PaymentComponentState<?> r5, x70.c<? super com.adyen.checkout.sessions.core.internal.SessionCallResult.Balance> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.adyen.checkout.sessions.core.internal.SessionInteractor.C01181
            if (r0 == 0) goto L13
            r0 = r6
            com.adyen.checkout.sessions.core.internal.SessionInteractor$makeCheckBalanceCallInternal$1 r0 = (com.adyen.checkout.sessions.core.internal.SessionInteractor.C01181) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.adyen.checkout.sessions.core.internal.SessionInteractor$makeCheckBalanceCallInternal$1 r0 = new com.adyen.checkout.sessions.core.internal.SessionInteractor$makeCheckBalanceCallInternal$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.L$0
            com.adyen.checkout.sessions.core.internal.SessionInteractor r5 = (com.adyen.checkout.sessions.core.internal.SessionInteractor) r5
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r6 = r6.f40851a
            goto L4b
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L36:
            ba0.g.M(r6)
            com.adyen.checkout.sessions.core.internal.data.api.SessionRepository r6 = r4.sessionRepository
            com.adyen.checkout.sessions.core.SessionModel r2 = r4.getSessionModel()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.m106checkBalance0E7RQCE(r2, r5, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r5 = r4
        L4b:
            java.lang.Throwable r0 = u70.q.a(r6)
            if (r0 != 0) goto L6d
            com.adyen.checkout.sessions.core.internal.data.model.SessionBalanceResponse r6 = (com.adyen.checkout.sessions.core.internal.data.model.SessionBalanceResponse) r6
            java.lang.String r0 = r6.getSessionData()
            r5.updateSessionData(r0)
            com.adyen.checkout.components.core.BalanceResult r5 = new com.adyen.checkout.components.core.BalanceResult
            com.adyen.checkout.components.core.Amount r0 = r6.getBalance()
            com.adyen.checkout.components.core.Amount r6 = r6.getTransactionLimit()
            r5.<init>(r0, r6)
            com.adyen.checkout.sessions.core.internal.SessionCallResult$Balance$Successful r6 = new com.adyen.checkout.sessions.core.internal.SessionCallResult$Balance$Successful
            r6.<init>(r5)
            return r6
        L6d:
            com.adyen.checkout.sessions.core.internal.SessionCallResult$Balance$Error r5 = new com.adyen.checkout.sessions.core.internal.SessionCallResult$Balance$Error
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.sessions.core.internal.SessionInteractor.makeCheckBalanceCallInternal(com.adyen.checkout.components.core.PaymentComponentState, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object makeCreateOrderInternal(x70.c<? super com.adyen.checkout.sessions.core.internal.SessionCallResult.CreateOrder> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.adyen.checkout.sessions.core.internal.SessionInteractor.C01191
            if (r0 == 0) goto L13
            r0 = r5
            com.adyen.checkout.sessions.core.internal.SessionInteractor$makeCreateOrderInternal$1 r0 = (com.adyen.checkout.sessions.core.internal.SessionInteractor.C01191) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.adyen.checkout.sessions.core.internal.SessionInteractor$makeCreateOrderInternal$1 r0 = new com.adyen.checkout.sessions.core.internal.SessionInteractor$makeCreateOrderInternal$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.L$0
            com.adyen.checkout.sessions.core.internal.SessionInteractor r0 = (com.adyen.checkout.sessions.core.internal.SessionInteractor) r0
            ba0.g.M(r5)
            u70.q r5 = (u70.q) r5
            java.lang.Object r5 = r5.f40851a
            goto L4b
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L36:
            ba0.g.M(r5)
            com.adyen.checkout.sessions.core.internal.data.api.SessionRepository r5 = r4.sessionRepository
            com.adyen.checkout.sessions.core.SessionModel r2 = r4.getSessionModel()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.m107createOrdergIAlus(r2, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            r0 = r4
        L4b:
            java.lang.Throwable r1 = u70.q.a(r5)
            if (r1 != 0) goto L6e
            com.adyen.checkout.sessions.core.internal.data.model.SessionOrderResponse r5 = (com.adyen.checkout.sessions.core.internal.data.model.SessionOrderResponse) r5
            java.lang.String r1 = r5.getSessionData()
            r0.updateSessionData(r1)
            com.adyen.checkout.components.core.OrderResponse r0 = new com.adyen.checkout.components.core.OrderResponse
            java.lang.String r1 = r5.getPspReference()
            java.lang.String r5 = r5.getOrderData()
            r2 = 0
            r0.<init>(r1, r5, r2, r2)
            com.adyen.checkout.sessions.core.internal.SessionCallResult$CreateOrder$Successful r5 = new com.adyen.checkout.sessions.core.internal.SessionCallResult$CreateOrder$Successful
            r5.<init>(r0)
            return r5
        L6e:
            com.adyen.checkout.sessions.core.internal.SessionCallResult$CreateOrder$Error r5 = new com.adyen.checkout.sessions.core.internal.SessionCallResult$CreateOrder$Error
            r5.<init>(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.sessions.core.internal.SessionInteractor.makeCreateOrderInternal(x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object makeDetailsCallInternal(com.adyen.checkout.components.core.ActionComponentData r5, x70.c<? super com.adyen.checkout.sessions.core.internal.SessionCallResult.Details> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.adyen.checkout.sessions.core.internal.SessionInteractor.C01201
            if (r0 == 0) goto L13
            r0 = r6
            com.adyen.checkout.sessions.core.internal.SessionInteractor$makeDetailsCallInternal$1 r0 = (com.adyen.checkout.sessions.core.internal.SessionInteractor.C01201) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.adyen.checkout.sessions.core.internal.SessionInteractor$makeDetailsCallInternal$1 r0 = new com.adyen.checkout.sessions.core.internal.SessionInteractor$makeDetailsCallInternal$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.L$0
            com.adyen.checkout.sessions.core.internal.SessionInteractor r5 = (com.adyen.checkout.sessions.core.internal.SessionInteractor) r5
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r6 = r6.f40851a
            goto L4b
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L36:
            ba0.g.M(r6)
            com.adyen.checkout.sessions.core.internal.data.api.SessionRepository r6 = r4.sessionRepository
            com.adyen.checkout.sessions.core.SessionModel r2 = r4.getSessionModel()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.m110submitDetails0E7RQCE(r2, r5, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r5 = r4
        L4b:
            java.lang.Throwable r0 = u70.q.a(r6)
            if (r0 != 0) goto L70
            com.adyen.checkout.sessions.core.internal.data.model.SessionDetailsResponse r6 = (com.adyen.checkout.sessions.core.internal.data.model.SessionDetailsResponse) r6
            java.lang.String r0 = r6.getSessionData()
            r5.updateSessionData(r0)
            com.adyen.checkout.components.core.action.Action r0 = r6.getAction()
            if (r0 != 0) goto L6a
            com.adyen.checkout.sessions.core.internal.SessionCallResult$Details$Finished r0 = new com.adyen.checkout.sessions.core.internal.SessionCallResult$Details$Finished
            com.adyen.checkout.sessions.core.SessionPaymentResult r5 = r5.mapToSessionPaymentResult(r6)
            r0.<init>(r5)
            return r0
        L6a:
            com.adyen.checkout.sessions.core.internal.SessionCallResult$Details$Action r5 = new com.adyen.checkout.sessions.core.internal.SessionCallResult$Details$Action
            r5.<init>(r0)
            return r5
        L70:
            com.adyen.checkout.sessions.core.internal.SessionCallResult$Details$Error r5 = new com.adyen.checkout.sessions.core.internal.SessionCallResult$Details$Error
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.sessions.core.internal.SessionInteractor.makeDetailsCallInternal(com.adyen.checkout.components.core.ActionComponentData, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object makePaymentsCallInternal(com.adyen.checkout.components.core.PaymentComponentState<?> r10, x70.c<? super com.adyen.checkout.sessions.core.internal.SessionCallResult.Payments> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.adyen.checkout.sessions.core.internal.SessionInteractor.C01211
            if (r0 == 0) goto L13
            r0 = r11
            com.adyen.checkout.sessions.core.internal.SessionInteractor$makePaymentsCallInternal$1 r0 = (com.adyen.checkout.sessions.core.internal.SessionInteractor.C01211) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.adyen.checkout.sessions.core.internal.SessionInteractor$makePaymentsCallInternal$1 r0 = new com.adyen.checkout.sessions.core.internal.SessionInteractor$makePaymentsCallInternal$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L33
            java.lang.Object r10 = r0.L$1
            com.adyen.checkout.components.core.PaymentComponentState r10 = (com.adyen.checkout.components.core.PaymentComponentState) r10
            java.lang.Object r0 = r0.L$0
            com.adyen.checkout.sessions.core.internal.SessionInteractor r0 = (com.adyen.checkout.sessions.core.internal.SessionInteractor) r0
            ba0.g.M(r11)
            u70.q r11 = (u70.q) r11
            java.lang.Object r11 = r11.f40851a
            goto L55
        L33:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r10)
            r10 = 0
            return r10
        L3a:
            ba0.g.M(r11)
            com.adyen.checkout.sessions.core.internal.data.api.SessionRepository r11 = r9.sessionRepository
            com.adyen.checkout.sessions.core.SessionModel r2 = r9.getSessionModel()
            com.adyen.checkout.components.core.PaymentComponentData r4 = r10.getData()
            r0.L$0 = r9
            r0.L$1 = r10
            r0.label = r3
            java.lang.Object r11 = r11.m111submitPayment0E7RQCE(r2, r4, r0)
            if (r11 != r1) goto L54
            return r1
        L54:
            r0 = r9
        L55:
            java.lang.Throwable r1 = u70.q.a(r11)
            if (r1 != 0) goto L99
            com.adyen.checkout.sessions.core.internal.data.model.SessionPaymentsResponse r11 = (com.adyen.checkout.sessions.core.internal.data.model.SessionPaymentsResponse) r11
            java.lang.String r10 = r11.getSessionData()
            r0.updateSessionData(r10)
            com.adyen.checkout.components.core.action.Action r10 = r11.getAction()
            boolean r1 = r0.isRefusedInPartialPaymentFlow(r11)
            if (r1 == 0) goto L78
            com.adyen.checkout.sessions.core.internal.SessionCallResult$Payments$RefusedPartialPayment r10 = new com.adyen.checkout.sessions.core.internal.SessionCallResult$Payments$RefusedPartialPayment
            com.adyen.checkout.sessions.core.SessionPaymentResult r11 = r0.mapToSessionPaymentResult(r11)
            r10.<init>(r11)
            return r10
        L78:
            if (r10 == 0) goto L80
            com.adyen.checkout.sessions.core.internal.SessionCallResult$Payments$Action r11 = new com.adyen.checkout.sessions.core.internal.SessionCallResult$Payments$Action
            r11.<init>(r10)
            return r11
        L80:
            com.adyen.checkout.components.core.OrderResponse r10 = r11.getOrder()
            boolean r10 = r0.isNonFullyPaid(r10)
            if (r10 == 0) goto L8f
            com.adyen.checkout.sessions.core.internal.SessionCallResult$Payments$NotFullyPaidOrder r10 = r0.onNonFullyPaidOrder(r11)
            return r10
        L8f:
            com.adyen.checkout.sessions.core.internal.SessionCallResult$Payments$Finished r10 = new com.adyen.checkout.sessions.core.internal.SessionCallResult$Payments$Finished
            com.adyen.checkout.sessions.core.SessionPaymentResult r11 = r0.mapToSessionPaymentResult(r11)
            r10.<init>(r11)
            return r10
        L99:
            com.adyen.checkout.components.core.PaymentComponentData r10 = r10.getData()
            com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails r10 = r10.getPaymentMethod()
            if (r10 == 0) goto Lbd
            java.lang.String r3 = r10.getType()
            if (r3 == 0) goto Lbd
            com.adyen.checkout.components.core.internal.analytics.GenericEvents r2 = com.adyen.checkout.components.core.internal.analytics.GenericEvents.INSTANCE
            com.adyen.checkout.components.core.internal.analytics.ErrorEvent r4 = com.adyen.checkout.components.core.internal.analytics.ErrorEvent.API_PAYMENTS
            r7 = 12
            r8 = 0
            r5 = 0
            r6 = 0
            com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent$Error r10 = com.adyen.checkout.components.core.internal.analytics.GenericEvents.error$default(r2, r3, r4, r5, r6, r7, r8)
            com.adyen.checkout.components.core.internal.analytics.AnalyticsManager r11 = r0.analyticsManager
            if (r11 == 0) goto Lbd
            r11.trackEvent(r10)
        Lbd:
            com.adyen.checkout.sessions.core.internal.SessionCallResult$Payments$Error r10 = new com.adyen.checkout.sessions.core.internal.SessionCallResult$Payments$Error
            r10.<init>(r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.sessions.core.internal.SessionInteractor.makePaymentsCallInternal(com.adyen.checkout.components.core.PaymentComponentState, x70.c):java.lang.Object");
    }

    private final SessionPaymentResult mapToSessionPaymentResult(SessionPaymentsResponse sessionPaymentsResponse) {
        return new SessionPaymentResult(getSessionModel().getId(), sessionPaymentsResponse.getSessionResult(), sessionPaymentsResponse.getSessionData(), sessionPaymentsResponse.getResultCode(), sessionPaymentsResponse.getOrder());
    }

    private final SessionCallResult.Payments.NotFullyPaidOrder onNonFullyPaidOrder(SessionPaymentsResponse response) {
        if (response.getOrder() != null) {
            return new SessionCallResult.Payments.NotFullyPaidOrder(mapToSessionPaymentResult(response));
        }
        throw new CheckoutException("Order cannot be null.", null, 2, null);
    }

    public static /* synthetic */ Object updatePaymentMethods$default(SessionInteractor sessionInteractor, OrderResponse orderResponse, c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            orderResponse = null;
        }
        return sessionInteractor.updatePaymentMethods(orderResponse, cVar);
    }

    private final void updateSessionData(String sessionData) {
        a2 a2Var;
        Object value;
        f1 f1Var = this._sessionFlow;
        do {
            a2Var = (a2) f1Var;
            value = a2Var.getValue();
        } while (!a2Var.g(value, SessionModel.copy$default((SessionModel) value, null, sessionData, 1, null)));
    }

    @Nullable
    public final Object cancelOrder(@NotNull OrderRequest orderRequest, @NotNull Function1<? super OrderRequest, Boolean> function1, @NotNull String str, @NotNull c<? super SessionCallResult.CancelOrder> cVar) {
        return checkIfCallWasHandled(new AnonymousClass2(function1, orderRequest, null), new AnonymousClass3(orderRequest, null), str, new Function0<SessionCallResult.CancelOrder>() { // from class: com.adyen.checkout.sessions.core.internal.SessionInteractor.cancelOrder.4
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SessionCallResult.CancelOrder invoke() {
                return SessionCallResult.CancelOrder.TakenOver.INSTANCE;
            }
        }, cVar);
    }

    @Nullable
    public final Object checkBalance(@NotNull PaymentComponentState<?> paymentComponentState, @NotNull Function1<? super PaymentComponentState<?>, Boolean> function1, @NotNull String str, @NotNull c<? super SessionCallResult.Balance> cVar) {
        return checkIfCallWasHandled(new C01112(function1, paymentComponentState, null), new C01123(paymentComponentState, null), str, new Function0<SessionCallResult.Balance>() { // from class: com.adyen.checkout.sessions.core.internal.SessionInteractor.checkBalance.4
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SessionCallResult.Balance invoke() {
                return SessionCallResult.Balance.TakenOver.INSTANCE;
            }
        }, cVar);
    }

    @Nullable
    public final Object createOrder(@NotNull Function0<Boolean> function0, @NotNull String str, @NotNull c<? super SessionCallResult.CreateOrder> cVar) {
        return checkIfCallWasHandled(new C01142(function0, null), new C01153(null), str, new Function0<SessionCallResult.CreateOrder>() { // from class: com.adyen.checkout.sessions.core.internal.SessionInteractor.createOrder.4
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SessionCallResult.CreateOrder invoke() {
                return SessionCallResult.CreateOrder.TakenOver.INSTANCE;
            }
        }, cVar);
    }

    @NotNull
    public final i getSessionFlow() {
        return this.sessionFlow;
    }

    /* JADX INFO: renamed from: isFlowTakenOver$sessions_core_release, reason: from getter */
    public final boolean getIsFlowTakenOver() {
        return this.isFlowTakenOver;
    }

    @Nullable
    public final Object onDetailsCallRequested(@NotNull ActionComponentData actionComponentData, @NotNull Function1<? super ActionComponentData, Boolean> function1, @NotNull String str, @NotNull c<? super SessionCallResult.Details> cVar) {
        return checkIfCallWasHandled(new C01222(function1, actionComponentData, null), new C01233(actionComponentData, null), str, new Function0<SessionCallResult.Details>() { // from class: com.adyen.checkout.sessions.core.internal.SessionInteractor.onDetailsCallRequested.4
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SessionCallResult.Details invoke() {
                return SessionCallResult.Details.TakenOver.INSTANCE;
            }
        }, cVar);
    }

    @Nullable
    public final <T extends PaymentComponentState<?>> Object onPaymentsCallRequested(@NotNull T t9, @NotNull Function1<? super T, Boolean> function1, @NotNull String str, @NotNull c<? super SessionCallResult.Payments> cVar) {
        return checkIfCallWasHandled(new C01252(function1, t9, null), new C01263(t9, null), str, new Function0<SessionCallResult.Payments>() { // from class: com.adyen.checkout.sessions.core.internal.SessionInteractor.onPaymentsCallRequested.4
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SessionCallResult.Payments invoke() {
                return SessionCallResult.Payments.TakenOver.INSTANCE;
            }
        }, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object removeStoredPaymentMethod(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull x70.c<? super com.adyen.checkout.sessions.core.internal.SessionCallResult.RemoveStoredPaymentMethod> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.adyen.checkout.sessions.core.internal.SessionInteractor.C01281
            if (r0 == 0) goto L13
            r0 = r6
            com.adyen.checkout.sessions.core.internal.SessionInteractor$removeStoredPaymentMethod$1 r0 = (com.adyen.checkout.sessions.core.internal.SessionInteractor.C01281) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.adyen.checkout.sessions.core.internal.SessionInteractor$removeStoredPaymentMethod$1 r0 = new com.adyen.checkout.sessions.core.internal.SessionInteractor$removeStoredPaymentMethod$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.L$0
            com.adyen.checkout.sessions.core.internal.SessionInteractor r5 = (com.adyen.checkout.sessions.core.internal.SessionInteractor) r5
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r6 = r6.f40851a
            goto L4b
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L36:
            ba0.g.M(r6)
            com.adyen.checkout.sessions.core.internal.data.api.SessionRepository r6 = r4.sessionRepository
            com.adyen.checkout.sessions.core.SessionModel r2 = r4.getSessionModel()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.m108disableToken0E7RQCE(r2, r5, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r5 = r4
        L4b:
            java.lang.Throwable r0 = u70.q.a(r6)
            if (r0 != 0) goto L5d
            com.adyen.checkout.sessions.core.internal.data.model.SessionDisableTokenResponse r6 = (com.adyen.checkout.sessions.core.internal.data.model.SessionDisableTokenResponse) r6
            java.lang.String r6 = r6.getSessionData()
            r5.updateSessionData(r6)
            com.adyen.checkout.sessions.core.internal.SessionCallResult$RemoveStoredPaymentMethod$Successful r5 = com.adyen.checkout.sessions.core.internal.SessionCallResult.RemoveStoredPaymentMethod.Successful.INSTANCE
            return r5
        L5d:
            com.adyen.checkout.sessions.core.internal.SessionCallResult$RemoveStoredPaymentMethod$Error r5 = new com.adyen.checkout.sessions.core.internal.SessionCallResult$RemoveStoredPaymentMethod$Error
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.sessions.core.internal.SessionInteractor.removeStoredPaymentMethod(java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updatePaymentMethods(@org.jetbrains.annotations.Nullable com.adyen.checkout.components.core.OrderResponse r7, @org.jetbrains.annotations.NotNull x70.c<? super com.adyen.checkout.sessions.core.internal.SessionCallResult.UpdatePaymentMethods> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.adyen.checkout.sessions.core.internal.SessionInteractor.C01291
            if (r0 == 0) goto L13
            r0 = r8
            com.adyen.checkout.sessions.core.internal.SessionInteractor$updatePaymentMethods$1 r0 = (com.adyen.checkout.sessions.core.internal.SessionInteractor.C01291) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.adyen.checkout.sessions.core.internal.SessionInteractor$updatePaymentMethods$1 r0 = new com.adyen.checkout.sessions.core.internal.SessionInteractor$updatePaymentMethods$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.L$1
            com.adyen.checkout.components.core.OrderResponse r7 = (com.adyen.checkout.components.core.OrderResponse) r7
            java.lang.Object r0 = r0.L$0
            com.adyen.checkout.sessions.core.internal.SessionInteractor r0 = (com.adyen.checkout.sessions.core.internal.SessionInteractor) r0
            ba0.g.M(r8)
            u70.q r8 = (u70.q) r8
            java.lang.Object r8 = r8.f40851a
            goto L63
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L3b:
            ba0.g.M(r8)
            if (r7 == 0) goto L4e
            com.adyen.checkout.components.core.OrderRequest r8 = new com.adyen.checkout.components.core.OrderRequest
            java.lang.String r2 = r7.getPspReference()
            java.lang.String r5 = r7.getOrderData()
            r8.<init>(r2, r5)
            goto L4f
        L4e:
            r8 = r4
        L4f:
            com.adyen.checkout.sessions.core.internal.data.api.SessionRepository r2 = r6.sessionRepository
            com.adyen.checkout.sessions.core.SessionModel r5 = r6.getSessionModel()
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = r2.m109setupSession0E7RQCE(r5, r8, r0)
            if (r8 != r1) goto L62
            return r1
        L62:
            r0 = r6
        L63:
            java.lang.Throwable r1 = u70.q.a(r8)
            if (r1 != 0) goto L8c
            com.adyen.checkout.sessions.core.SessionSetupResponse r8 = (com.adyen.checkout.sessions.core.SessionSetupResponse) r8
            java.lang.String r1 = r8.getSessionData()
            r0.updateSessionData(r1)
            com.adyen.checkout.components.core.PaymentMethodsApiResponse r8 = r8.getPaymentMethodsApiResponse()
            if (r8 == 0) goto L7e
            com.adyen.checkout.sessions.core.internal.SessionCallResult$UpdatePaymentMethods$Successful r0 = new com.adyen.checkout.sessions.core.internal.SessionCallResult$UpdatePaymentMethods$Successful
            r0.<init>(r8, r7)
            return r0
        L7e:
            com.adyen.checkout.sessions.core.internal.SessionCallResult$UpdatePaymentMethods$Error r7 = new com.adyen.checkout.sessions.core.internal.SessionCallResult$UpdatePaymentMethods$Error
            com.adyen.checkout.core.exception.CheckoutException r8 = new com.adyen.checkout.core.exception.CheckoutException
            java.lang.String r0 = "Payment methods should not be null"
            r1 = 2
            r8.<init>(r0, r4, r1, r4)
            r7.<init>(r8)
            return r7
        L8c:
            com.adyen.checkout.sessions.core.internal.SessionCallResult$UpdatePaymentMethods$Error r7 = new com.adyen.checkout.sessions.core.internal.SessionCallResult$UpdatePaymentMethods$Error
            r7.<init>(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.sessions.core.internal.SessionInteractor.updatePaymentMethods(com.adyen.checkout.components.core.OrderResponse, x70.c):java.lang.Object");
    }

    public static /* synthetic */ void isFlowTakenOver$sessions_core_release$annotations() {
    }

    private final SessionPaymentResult mapToSessionPaymentResult(SessionDetailsResponse sessionDetailsResponse) {
        return new SessionPaymentResult(getSessionModel().getId(), sessionDetailsResponse.getSessionResult(), sessionDetailsResponse.getSessionData(), sessionDetailsResponse.getResultCode(), sessionDetailsResponse.getOrder());
    }
}
