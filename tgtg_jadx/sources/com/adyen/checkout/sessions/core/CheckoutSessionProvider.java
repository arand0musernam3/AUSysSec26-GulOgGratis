package com.adyen.checkout.sessions.core;

import com.adyen.checkout.components.core.OrderRequest;
import com.adyen.checkout.components.core.OrderResponse;
import com.adyen.checkout.components.core.internal.Configuration;
import com.adyen.checkout.core.Environment;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.sessions.core.internal.CheckoutSessionInitializer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0086@¢\u0006\u0004\b\f\u0010\rJ:\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0086@¢\u0006\u0004\b\f\u0010\u0012J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\f\u0010\u0015J(\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\f\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/adyen/checkout/sessions/core/CheckoutSessionProvider;", "", "<init>", "()V", "Lcom/adyen/checkout/sessions/core/SessionModel;", "sessionModel", "Lcom/adyen/checkout/components/core/internal/Configuration;", "configuration", "Lcom/adyen/checkout/components/core/OrderRequest;", "Lcom/adyen/checkout/components/core/Order;", "order", "Lcom/adyen/checkout/sessions/core/CheckoutSessionResult;", "createSession", "(Lcom/adyen/checkout/sessions/core/SessionModel;Lcom/adyen/checkout/components/core/internal/Configuration;Lcom/adyen/checkout/components/core/OrderRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/adyen/checkout/core/Environment;", "environment", "", "clientKey", "(Lcom/adyen/checkout/sessions/core/SessionModel;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;Lcom/adyen/checkout/components/core/OrderRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/adyen/checkout/sessions/core/SessionPaymentResult;", "sessionPaymentResult", "(Lcom/adyen/checkout/sessions/core/SessionPaymentResult;Lcom/adyen/checkout/components/core/internal/Configuration;Lx70/c;)Ljava/lang/Object;", "(Lcom/adyen/checkout/sessions/core/SessionPaymentResult;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CheckoutSessionProvider {

    @NotNull
    public static final CheckoutSessionProvider INSTANCE = new CheckoutSessionProvider();

    private CheckoutSessionProvider() {
    }

    public static /* synthetic */ Object createSession$default(CheckoutSessionProvider checkoutSessionProvider, SessionModel sessionModel, Environment environment, String str, OrderRequest orderRequest, c cVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            orderRequest = null;
        }
        return checkoutSessionProvider.createSession(sessionModel, environment, str, orderRequest, cVar);
    }

    @Nullable
    public final Object createSession(@NotNull SessionPaymentResult sessionPaymentResult, @NotNull Environment environment, @NotNull String str, @NotNull c<? super CheckoutSessionResult> cVar) {
        if (sessionPaymentResult.getSessionId() == null) {
            throw new CheckoutException("sessionId must not be null to create a session.", null, 2, null);
        }
        SessionModel sessionModel = new SessionModel(sessionPaymentResult.getSessionId(), sessionPaymentResult.getSessionData());
        OrderResponse order = sessionPaymentResult.getOrder();
        CheckoutSessionInitializer checkoutSessionInitializer = new CheckoutSessionInitializer(sessionModel, environment, str, order != null ? new OrderRequest(order.getPspReference(), order.getOrderData()) : null, null, 16, null);
        OrderResponse order2 = sessionPaymentResult.getOrder();
        return checkoutSessionInitializer.setupSession(order2 != null ? order2.getRemainingAmount() : null, cVar);
    }

    public static /* synthetic */ Object createSession$default(CheckoutSessionProvider checkoutSessionProvider, SessionModel sessionModel, Configuration configuration, OrderRequest orderRequest, c cVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            orderRequest = null;
        }
        return checkoutSessionProvider.createSession(sessionModel, configuration, orderRequest, (c<? super CheckoutSessionResult>) cVar);
    }

    @Nullable
    public final Object createSession(@NotNull SessionModel sessionModel, @NotNull Environment environment, @NotNull String str, @Nullable OrderRequest orderRequest, @NotNull c<? super CheckoutSessionResult> cVar) {
        return new CheckoutSessionInitializer(sessionModel, environment, str, orderRequest, null, 16, null).setupSession(null, cVar);
    }

    @Nullable
    public final Object createSession(@NotNull SessionPaymentResult sessionPaymentResult, @NotNull Configuration configuration, @NotNull c<? super CheckoutSessionResult> cVar) {
        return createSession(sessionPaymentResult, configuration.getEnvironment(), configuration.getClientKey(), cVar);
    }

    @Nullable
    public final Object createSession(@NotNull SessionModel sessionModel, @NotNull Configuration configuration, @Nullable OrderRequest orderRequest, @NotNull c<? super CheckoutSessionResult> cVar) {
        return createSession(sessionModel, configuration.getEnvironment(), configuration.getClientKey(), orderRequest, cVar);
    }
}
