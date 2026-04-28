package com.adyen.checkout.sessions.core.internal.data.api;

import ba0.g;
import com.adyen.checkout.core.DispatcherProvider;
import com.adyen.checkout.core.internal.data.api.HttpClient;
import com.adyen.checkout.core.internal.data.api.HttpClientExtKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.sessions.core.SessionSetupResponse;
import com.adyen.checkout.sessions.core.internal.data.model.SessionBalanceRequest;
import com.adyen.checkout.sessions.core.internal.data.model.SessionBalanceResponse;
import com.adyen.checkout.sessions.core.internal.data.model.SessionCancelOrderRequest;
import com.adyen.checkout.sessions.core.internal.data.model.SessionCancelOrderResponse;
import com.adyen.checkout.sessions.core.internal.data.model.SessionDetailsRequest;
import com.adyen.checkout.sessions.core.internal.data.model.SessionDetailsResponse;
import com.adyen.checkout.sessions.core.internal.data.model.SessionDisableTokenRequest;
import com.adyen.checkout.sessions.core.internal.data.model.SessionDisableTokenResponse;
import com.adyen.checkout.sessions.core.internal.data.model.SessionOrderRequest;
import com.adyen.checkout.sessions.core.internal.data.model.SessionOrderResponse;
import com.adyen.checkout.sessions.core.internal.data.model.SessionPaymentsRequest;
import com.adyen.checkout.sessions.core.internal.data.model.SessionPaymentsResponse;
import com.adyen.checkout.sessions.core.internal.data.model.SessionSetupRequest;
import com.braze.h2;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import v80.x;
import w.a0;
import x70.c;
import y70.a;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001a\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ(\u0010\"\u001a\u00020!2\u0006\u0010\t\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0086@¢\u0006\u0004\b\"\u0010#J(\u0010&\u001a\u00020%2\u0006\u0010\t\u001a\u00020$2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0086@¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)¨\u0006*"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/data/api/SessionService;", "", "Lcom/adyen/checkout/core/internal/data/api/HttpClient;", "httpClient", "Lv80/x;", "coroutineDispatcher", "<init>", "(Lcom/adyen/checkout/core/internal/data/api/HttpClient;Lv80/x;)V", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionSetupRequest;", "request", "", "sessionId", "clientKey", "Lcom/adyen/checkout/sessions/core/SessionSetupResponse;", "setupSession", "(Lcom/adyen/checkout/sessions/core/internal/data/model/SessionSetupRequest;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionPaymentsRequest;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionPaymentsResponse;", "submitPayment", "(Lcom/adyen/checkout/sessions/core/internal/data/model/SessionPaymentsRequest;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDetailsRequest;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDetailsResponse;", "submitDetails", "(Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDetailsRequest;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionBalanceRequest;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionBalanceResponse;", "checkBalance", "(Lcom/adyen/checkout/sessions/core/internal/data/model/SessionBalanceRequest;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionOrderRequest;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionOrderResponse;", "createOrder", "(Lcom/adyen/checkout/sessions/core/internal/data/model/SessionOrderRequest;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionCancelOrderRequest;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionCancelOrderResponse;", "cancelOrder", "(Lcom/adyen/checkout/sessions/core/internal/data/model/SessionCancelOrderRequest;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDisableTokenRequest;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDisableTokenResponse;", "disableToken", "(Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDisableTokenRequest;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lcom/adyen/checkout/core/internal/data/api/HttpClient;", "Lv80/x;", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SessionService {

    @NotNull
    private final x coroutineDispatcher;

    @NotNull
    private final HttpClient httpClient;

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.data.api.SessionService$cancelOrder$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.data.api.SessionService$cancelOrder$2", f = "SessionService.kt", l = {113}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionCancelOrderResponse;", "<anonymous>", "(Lv80/b0;)Lcom/adyen/checkout/sessions/core/internal/data/model/SessionCancelOrderResponse;"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass2 extends i implements Function2<b0, c<? super SessionCancelOrderResponse>, Object> {
        final /* synthetic */ String $clientKey;
        final /* synthetic */ SessionCancelOrderRequest $request;
        final /* synthetic */ String $sessionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, SessionCancelOrderRequest sessionCancelOrderRequest, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$sessionId = str;
            this.$clientKey = str2;
            this.$request = sessionCancelOrderRequest;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return SessionService.this.new AnonymousClass2(this.$sessionId, this.$clientKey, this.$request, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super SessionCancelOrderResponse> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
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
            HttpClient httpClient = SessionService.this.httpClient;
            String strP = a0.p("v1/sessions/", this.$sessionId, "/orders/cancel");
            Map mapB = w0.b(new Pair("clientKey", this.$clientKey));
            ModelObject.Serializer<SessionCancelOrderRequest> serializer = SessionCancelOrderRequest.SERIALIZER;
            ModelObject.Serializer<SessionCancelOrderResponse> serializer2 = SessionCancelOrderResponse.SERIALIZER;
            SessionCancelOrderRequest sessionCancelOrderRequest = this.$request;
            this.label = 1;
            Object objPost = HttpClientExtKt.post(httpClient, strP, sessionCancelOrderRequest, serializer, serializer2, mapB, this);
            return objPost == aVar ? aVar : objPost;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.data.api.SessionService$checkBalance$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.data.api.SessionService$checkBalance$2", f = "SessionService.kt", l = {85}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionBalanceResponse;", "<anonymous>", "(Lv80/b0;)Lcom/adyen/checkout/sessions/core/internal/data/model/SessionBalanceResponse;"}, k = 3, mv = {1, 9, 0})
    public static final class C01302 extends i implements Function2<b0, c<? super SessionBalanceResponse>, Object> {
        final /* synthetic */ String $clientKey;
        final /* synthetic */ SessionBalanceRequest $request;
        final /* synthetic */ String $sessionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01302(String str, String str2, SessionBalanceRequest sessionBalanceRequest, c<? super C01302> cVar) {
            super(2, cVar);
            this.$sessionId = str;
            this.$clientKey = str2;
            this.$request = sessionBalanceRequest;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return SessionService.this.new C01302(this.$sessionId, this.$clientKey, this.$request, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super SessionBalanceResponse> cVar) {
            return ((C01302) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
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
            HttpClient httpClient = SessionService.this.httpClient;
            String strP = a0.p("v1/sessions/", this.$sessionId, "/paymentMethodBalance");
            Map mapB = w0.b(new Pair("clientKey", this.$clientKey));
            ModelObject.Serializer<SessionBalanceRequest> serializer = SessionBalanceRequest.SERIALIZER;
            ModelObject.Serializer<SessionBalanceResponse> serializer2 = SessionBalanceResponse.SERIALIZER;
            SessionBalanceRequest sessionBalanceRequest = this.$request;
            this.label = 1;
            Object objPost = HttpClientExtKt.post(httpClient, strP, sessionBalanceRequest, serializer, serializer2, mapB, this);
            return objPost == aVar ? aVar : objPost;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.data.api.SessionService$createOrder$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.data.api.SessionService$createOrder$2", f = "SessionService.kt", l = {99}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionOrderResponse;", "<anonymous>", "(Lv80/b0;)Lcom/adyen/checkout/sessions/core/internal/data/model/SessionOrderResponse;"}, k = 3, mv = {1, 9, 0})
    public static final class C01312 extends i implements Function2<b0, c<? super SessionOrderResponse>, Object> {
        final /* synthetic */ String $clientKey;
        final /* synthetic */ SessionOrderRequest $request;
        final /* synthetic */ String $sessionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01312(String str, String str2, SessionOrderRequest sessionOrderRequest, c<? super C01312> cVar) {
            super(2, cVar);
            this.$sessionId = str;
            this.$clientKey = str2;
            this.$request = sessionOrderRequest;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return SessionService.this.new C01312(this.$sessionId, this.$clientKey, this.$request, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super SessionOrderResponse> cVar) {
            return ((C01312) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
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
            HttpClient httpClient = SessionService.this.httpClient;
            String strP = a0.p("v1/sessions/", this.$sessionId, "/orders");
            Map mapB = w0.b(new Pair("clientKey", this.$clientKey));
            ModelObject.Serializer<SessionOrderRequest> serializer = SessionOrderRequest.SERIALIZER;
            ModelObject.Serializer<SessionOrderResponse> serializer2 = SessionOrderResponse.SERIALIZER;
            SessionOrderRequest sessionOrderRequest = this.$request;
            this.label = 1;
            Object objPost = HttpClientExtKt.post(httpClient, strP, sessionOrderRequest, serializer, serializer2, mapB, this);
            return objPost == aVar ? aVar : objPost;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.data.api.SessionService$disableToken$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.data.api.SessionService$disableToken$2", f = "SessionService.kt", l = {127}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDisableTokenResponse;", "<anonymous>", "(Lv80/b0;)Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDisableTokenResponse;"}, k = 3, mv = {1, 9, 0})
    public static final class C01322 extends i implements Function2<b0, c<? super SessionDisableTokenResponse>, Object> {
        final /* synthetic */ String $clientKey;
        final /* synthetic */ SessionDisableTokenRequest $request;
        final /* synthetic */ String $sessionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01322(String str, String str2, SessionDisableTokenRequest sessionDisableTokenRequest, c<? super C01322> cVar) {
            super(2, cVar);
            this.$sessionId = str;
            this.$clientKey = str2;
            this.$request = sessionDisableTokenRequest;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return SessionService.this.new C01322(this.$sessionId, this.$clientKey, this.$request, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super SessionDisableTokenResponse> cVar) {
            return ((C01322) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
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
            HttpClient httpClient = SessionService.this.httpClient;
            String strP = a0.p("v1/sessions/", this.$sessionId, "/disableToken");
            Map mapB = w0.b(new Pair("clientKey", this.$clientKey));
            ModelObject.Serializer<SessionDisableTokenRequest> serializer = SessionDisableTokenRequest.SERIALIZER;
            ModelObject.Serializer<SessionDisableTokenResponse> serializer2 = SessionDisableTokenResponse.SERIALIZER;
            SessionDisableTokenRequest sessionDisableTokenRequest = this.$request;
            this.label = 1;
            Object objPost = HttpClientExtKt.post(httpClient, strP, sessionDisableTokenRequest, serializer, serializer2, mapB, this);
            return objPost == aVar ? aVar : objPost;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.data.api.SessionService$setupSession$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.data.api.SessionService$setupSession$2", f = "SessionService.kt", l = {43}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "Lcom/adyen/checkout/sessions/core/SessionSetupResponse;", "<anonymous>", "(Lv80/b0;)Lcom/adyen/checkout/sessions/core/SessionSetupResponse;"}, k = 3, mv = {1, 9, 0})
    public static final class C01332 extends i implements Function2<b0, c<? super SessionSetupResponse>, Object> {
        final /* synthetic */ String $clientKey;
        final /* synthetic */ SessionSetupRequest $request;
        final /* synthetic */ String $sessionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01332(String str, String str2, SessionSetupRequest sessionSetupRequest, c<? super C01332> cVar) {
            super(2, cVar);
            this.$sessionId = str;
            this.$clientKey = str2;
            this.$request = sessionSetupRequest;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return SessionService.this.new C01332(this.$sessionId, this.$clientKey, this.$request, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super SessionSetupResponse> cVar) {
            return ((C01332) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
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
            HttpClient httpClient = SessionService.this.httpClient;
            String strP = a0.p("v1/sessions/", this.$sessionId, "/setup");
            Map mapB = w0.b(new Pair("clientKey", this.$clientKey));
            ModelObject.Serializer<SessionSetupRequest> serializer = SessionSetupRequest.SERIALIZER;
            ModelObject.Serializer<SessionSetupResponse> serializer2 = SessionSetupResponse.SERIALIZER;
            SessionSetupRequest sessionSetupRequest = this.$request;
            this.label = 1;
            Object objPost = HttpClientExtKt.post(httpClient, strP, sessionSetupRequest, serializer, serializer2, mapB, this);
            return objPost == aVar ? aVar : objPost;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.data.api.SessionService$submitDetails$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.data.api.SessionService$submitDetails$2", f = "SessionService.kt", l = {71}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDetailsResponse;", "<anonymous>", "(Lv80/b0;)Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDetailsResponse;"}, k = 3, mv = {1, 9, 0})
    public static final class C01342 extends i implements Function2<b0, c<? super SessionDetailsResponse>, Object> {
        final /* synthetic */ String $clientKey;
        final /* synthetic */ SessionDetailsRequest $request;
        final /* synthetic */ String $sessionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01342(String str, String str2, SessionDetailsRequest sessionDetailsRequest, c<? super C01342> cVar) {
            super(2, cVar);
            this.$sessionId = str;
            this.$clientKey = str2;
            this.$request = sessionDetailsRequest;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return SessionService.this.new C01342(this.$sessionId, this.$clientKey, this.$request, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super SessionDetailsResponse> cVar) {
            return ((C01342) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
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
            HttpClient httpClient = SessionService.this.httpClient;
            String strP = a0.p("v1/sessions/", this.$sessionId, "/paymentDetails");
            Map mapB = w0.b(new Pair("clientKey", this.$clientKey));
            ModelObject.Serializer<SessionDetailsRequest> serializer = SessionDetailsRequest.SERIALIZER;
            ModelObject.Serializer<SessionDetailsResponse> serializer2 = SessionDetailsResponse.SERIALIZER;
            SessionDetailsRequest sessionDetailsRequest = this.$request;
            this.label = 1;
            Object objPost = HttpClientExtKt.post(httpClient, strP, sessionDetailsRequest, serializer, serializer2, mapB, this);
            return objPost == aVar ? aVar : objPost;
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.sessions.core.internal.data.api.SessionService$submitPayment$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.sessions.core.internal.data.api.SessionService$submitPayment$2", f = "SessionService.kt", l = {57}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionPaymentsResponse;", "<anonymous>", "(Lv80/b0;)Lcom/adyen/checkout/sessions/core/internal/data/model/SessionPaymentsResponse;"}, k = 3, mv = {1, 9, 0})
    public static final class C01352 extends i implements Function2<b0, c<? super SessionPaymentsResponse>, Object> {
        final /* synthetic */ String $clientKey;
        final /* synthetic */ SessionPaymentsRequest $request;
        final /* synthetic */ String $sessionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01352(String str, String str2, SessionPaymentsRequest sessionPaymentsRequest, c<? super C01352> cVar) {
            super(2, cVar);
            this.$sessionId = str;
            this.$clientKey = str2;
            this.$request = sessionPaymentsRequest;
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return SessionService.this.new C01352(this.$sessionId, this.$clientKey, this.$request, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull b0 b0Var, @Nullable c<? super SessionPaymentsResponse> cVar) {
            return ((C01352) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
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
            HttpClient httpClient = SessionService.this.httpClient;
            String strP = a0.p("v1/sessions/", this.$sessionId, "/payments");
            Map mapB = w0.b(new Pair("clientKey", this.$clientKey));
            ModelObject.Serializer<SessionPaymentsRequest> serializer = SessionPaymentsRequest.SERIALIZER;
            ModelObject.Serializer<SessionPaymentsResponse> serializer2 = SessionPaymentsResponse.SERIALIZER;
            SessionPaymentsRequest sessionPaymentsRequest = this.$request;
            this.label = 1;
            Object objPost = HttpClientExtKt.post(httpClient, strP, sessionPaymentsRequest, serializer, serializer2, mapB, this);
            return objPost == aVar ? aVar : objPost;
        }
    }

    public SessionService(@NotNull HttpClient httpClient, @NotNull x xVar) {
        httpClient.getClass();
        xVar.getClass();
        this.httpClient = httpClient;
        this.coroutineDispatcher = xVar;
    }

    @Nullable
    public final Object cancelOrder(@NotNull SessionCancelOrderRequest sessionCancelOrderRequest, @NotNull String str, @NotNull String str2, @NotNull c<? super SessionCancelOrderResponse> cVar) {
        return f0.K(this.coroutineDispatcher, new AnonymousClass2(str, str2, sessionCancelOrderRequest, null), cVar);
    }

    @Nullable
    public final Object checkBalance(@NotNull SessionBalanceRequest sessionBalanceRequest, @NotNull String str, @NotNull String str2, @NotNull c<? super SessionBalanceResponse> cVar) {
        return f0.K(this.coroutineDispatcher, new C01302(str, str2, sessionBalanceRequest, null), cVar);
    }

    @Nullable
    public final Object createOrder(@NotNull SessionOrderRequest sessionOrderRequest, @NotNull String str, @NotNull String str2, @NotNull c<? super SessionOrderResponse> cVar) {
        return f0.K(this.coroutineDispatcher, new C01312(str, str2, sessionOrderRequest, null), cVar);
    }

    @Nullable
    public final Object disableToken(@NotNull SessionDisableTokenRequest sessionDisableTokenRequest, @NotNull String str, @NotNull String str2, @NotNull c<? super SessionDisableTokenResponse> cVar) {
        return f0.K(this.coroutineDispatcher, new C01322(str, str2, sessionDisableTokenRequest, null), cVar);
    }

    @Nullable
    public final Object setupSession(@NotNull SessionSetupRequest sessionSetupRequest, @NotNull String str, @NotNull String str2, @NotNull c<? super SessionSetupResponse> cVar) {
        return f0.K(this.coroutineDispatcher, new C01332(str, str2, sessionSetupRequest, null), cVar);
    }

    @Nullable
    public final Object submitDetails(@NotNull SessionDetailsRequest sessionDetailsRequest, @NotNull String str, @NotNull String str2, @NotNull c<? super SessionDetailsResponse> cVar) {
        return f0.K(this.coroutineDispatcher, new C01342(str, str2, sessionDetailsRequest, null), cVar);
    }

    @Nullable
    public final Object submitPayment(@NotNull SessionPaymentsRequest sessionPaymentsRequest, @NotNull String str, @NotNull String str2, @NotNull c<? super SessionPaymentsResponse> cVar) {
        return f0.K(this.coroutineDispatcher, new C01352(str, str2, sessionPaymentsRequest, null), cVar);
    }

    public /* synthetic */ SessionService(HttpClient httpClient, x xVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(httpClient, (i11 & 2) != 0 ? DispatcherProvider.INSTANCE.getIO() : xVar);
    }
}
