package com.adyen.checkout.sessions.core.internal;

import ba0.g;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.OrderRequest;
import com.adyen.checkout.core.DispatcherProvider;
import com.adyen.checkout.core.Environment;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.internal.data.api.HttpClient;
import com.adyen.checkout.core.internal.data.api.HttpClientFactory;
import com.adyen.checkout.sessions.core.CheckoutSession;
import com.adyen.checkout.sessions.core.CheckoutSessionResult;
import com.adyen.checkout.sessions.core.SessionModel;
import com.adyen.checkout.sessions.core.SessionSetupResponse;
import com.adyen.checkout.sessions.core.internal.data.api.SessionRepository;
import com.adyen.checkout.sessions.core.internal.data.api.SessionService;
import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.q;
import v80.b0;
import v80.f0;
import v80.x;
import x70.c;
import y70.a;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u001c\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/CheckoutSessionInitializer;", "", "Lcom/adyen/checkout/sessions/core/SessionModel;", "sessionModel", "Lcom/adyen/checkout/core/Environment;", "environment", "", "clientKey", "Lcom/adyen/checkout/components/core/OrderRequest;", "Lcom/adyen/checkout/components/core/Order;", "order", "Lv80/x;", "coroutineDispatcher", "<init>", "(Lcom/adyen/checkout/sessions/core/SessionModel;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;Lcom/adyen/checkout/components/core/OrderRequest;Lv80/x;)V", "Lcom/adyen/checkout/components/core/Amount;", "overrideAmount", "Lcom/adyen/checkout/sessions/core/CheckoutSessionResult;", "setupSession", "(Lcom/adyen/checkout/components/core/Amount;Lx70/c;)Ljava/lang/Object;", "Lcom/adyen/checkout/sessions/core/SessionModel;", "Lcom/adyen/checkout/core/Environment;", "Ljava/lang/String;", "Lcom/adyen/checkout/components/core/OrderRequest;", "Lv80/x;", "Lcom/adyen/checkout/core/internal/data/api/HttpClient;", "httpClient", "Lcom/adyen/checkout/core/internal/data/api/HttpClient;", "Lcom/adyen/checkout/sessions/core/internal/data/api/SessionService;", "sessionService", "Lcom/adyen/checkout/sessions/core/internal/data/api/SessionService;", "Lcom/adyen/checkout/sessions/core/internal/data/api/SessionRepository;", "sessionRepository", "Lcom/adyen/checkout/sessions/core/internal/data/api/SessionRepository;", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CheckoutSessionInitializer {

    @NotNull
    private final String clientKey;

    @NotNull
    private final x coroutineDispatcher;

    @NotNull
    private final Environment environment;

    @NotNull
    private final HttpClient httpClient;

    @Nullable
    private final OrderRequest order;

    @NotNull
    private final SessionModel sessionModel;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final SessionService sessionService;

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.CheckoutSessionInitializer$setupSession$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.CheckoutSessionInitializer$setupSession$2", f = "CheckoutSessionInitializer.kt", l = {39}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "Lcom/adyen/checkout/sessions/core/CheckoutSessionResult;", "<anonymous>", "(Lv80/b0;)Lcom/adyen/checkout/sessions/core/CheckoutSessionResult;"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass2 extends i implements Function2<b0, c<? super CheckoutSessionResult>, Object> {
        final /* synthetic */ Amount $overrideAmount;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Amount amount, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$overrideAmount = amount;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return CheckoutSessionInitializer.this.new AnonymousClass2(this.$overrideAmount, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super CheckoutSessionResult> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM109setupSession0E7RQCE;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                SessionRepository sessionRepository = CheckoutSessionInitializer.this.sessionRepository;
                SessionModel sessionModel = CheckoutSessionInitializer.this.sessionModel;
                OrderRequest orderRequest = CheckoutSessionInitializer.this.order;
                this.label = 1;
                objM109setupSession0E7RQCE = sessionRepository.m109setupSession0E7RQCE(sessionModel, orderRequest, this);
                if (objM109setupSession0E7RQCE == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
                objM109setupSession0E7RQCE = ((q) obj).f40851a;
            }
            Amount amount = this.$overrideAmount;
            CheckoutSessionInitializer checkoutSessionInitializer = CheckoutSessionInitializer.this;
            Throwable thA = q.a(objM109setupSession0E7RQCE);
            if (thA != null) {
                return new CheckoutSessionResult.Error(new CheckoutException("Failed to fetch session", thA));
            }
            SessionSetupResponse sessionSetupResponse = (SessionSetupResponse) objM109setupSession0E7RQCE;
            if (amount == null) {
                amount = sessionSetupResponse.getAmount();
            }
            return new CheckoutSessionResult.Success(new CheckoutSession(SessionSetupResponse.copy$default(sessionSetupResponse, null, null, amount, null, null, null, null, null, 251, null), checkoutSessionInitializer.order, checkoutSessionInitializer.environment, checkoutSessionInitializer.clientKey));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckoutSessionInitializer(@NotNull SessionModel sessionModel, @NotNull Environment environment, @NotNull String str, @Nullable OrderRequest orderRequest, @NotNull x xVar) {
        sessionModel.getClass();
        environment.getClass();
        str.getClass();
        xVar.getClass();
        this.sessionModel = sessionModel;
        this.environment = environment;
        this.clientKey = str;
        this.order = orderRequest;
        this.coroutineDispatcher = xVar;
        HttpClient httpClient = HttpClientFactory.INSTANCE.getHttpClient(environment);
        this.httpClient = httpClient;
        SessionService sessionService = new SessionService(httpClient, null, 2, 0 == true ? 1 : 0);
        this.sessionService = sessionService;
        this.sessionRepository = new SessionRepository(sessionService, str);
    }

    @Nullable
    public final Object setupSession(@Nullable Amount amount, @NotNull c<? super CheckoutSessionResult> cVar) {
        return f0.K(this.coroutineDispatcher, new AnonymousClass2(amount, null), cVar);
    }

    public /* synthetic */ CheckoutSessionInitializer(SessionModel sessionModel, Environment environment, String str, OrderRequest orderRequest, x xVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(sessionModel, environment, str, orderRequest, (i11 & 16) != 0 ? DispatcherProvider.INSTANCE.getIO() : xVar);
    }
}
