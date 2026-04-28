package com.adyen.checkout.sessions.core;

import com.adyen.checkout.components.core.CheckoutConfiguration;
import com.adyen.checkout.components.core.OrderRequest;
import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.components.core.PaymentMethodsApiResponse;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.core.Environment;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0007J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\nJ\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\nHÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, d2 = {"Lcom/adyen/checkout/sessions/core/CheckoutSession;", "", "sessionSetupResponse", "Lcom/adyen/checkout/sessions/core/SessionSetupResponse;", "order", "Lcom/adyen/checkout/components/core/OrderRequest;", "Lcom/adyen/checkout/components/core/Order;", "environment", "Lcom/adyen/checkout/core/Environment;", "clientKey", "", "(Lcom/adyen/checkout/sessions/core/SessionSetupResponse;Lcom/adyen/checkout/components/core/OrderRequest;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;)V", "getClientKey", "()Ljava/lang/String;", "getEnvironment", "()Lcom/adyen/checkout/core/Environment;", "getOrder", "()Lcom/adyen/checkout/components/core/OrderRequest;", "getSessionSetupResponse", "()Lcom/adyen/checkout/sessions/core/SessionSetupResponse;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "getConfiguration", "Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "getPaymentMethod", "Lcom/adyen/checkout/components/core/PaymentMethod;", Action.PAYMENT_METHOD_TYPE, "hashCode", "", "toString", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCheckoutSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutSession.kt\ncom/adyen/checkout/sessions/core/CheckoutSession\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n295#2,2:42\n*S KotlinDebug\n*F\n+ 1 CheckoutSession.kt\ncom/adyen/checkout/sessions/core/CheckoutSession\n*L\n28#1:42,2\n*E\n"})
public final /* data */ class CheckoutSession {

    @NotNull
    private final String clientKey;

    @NotNull
    private final Environment environment;

    @Nullable
    private final OrderRequest order;

    @NotNull
    private final SessionSetupResponse sessionSetupResponse;

    public CheckoutSession(@NotNull SessionSetupResponse sessionSetupResponse, @Nullable OrderRequest orderRequest, @NotNull Environment environment, @NotNull String str) {
        sessionSetupResponse.getClass();
        environment.getClass();
        str.getClass();
        this.sessionSetupResponse = sessionSetupResponse;
        this.order = orderRequest;
        this.environment = environment;
        this.clientKey = str;
    }

    public static /* synthetic */ CheckoutSession copy$default(CheckoutSession checkoutSession, SessionSetupResponse sessionSetupResponse, OrderRequest orderRequest, Environment environment, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            sessionSetupResponse = checkoutSession.sessionSetupResponse;
        }
        if ((i11 & 2) != 0) {
            orderRequest = checkoutSession.order;
        }
        if ((i11 & 4) != 0) {
            environment = checkoutSession.environment;
        }
        if ((i11 & 8) != 0) {
            str = checkoutSession.clientKey;
        }
        return checkoutSession.copy(sessionSetupResponse, orderRequest, environment, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SessionSetupResponse getSessionSetupResponse() {
        return this.sessionSetupResponse;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OrderRequest getOrder() {
        return this.order;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Environment getEnvironment() {
        return this.environment;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getClientKey() {
        return this.clientKey;
    }

    @NotNull
    public final CheckoutSession copy(@NotNull SessionSetupResponse sessionSetupResponse, @Nullable OrderRequest order, @NotNull Environment environment, @NotNull String clientKey) {
        sessionSetupResponse.getClass();
        environment.getClass();
        clientKey.getClass();
        return new CheckoutSession(sessionSetupResponse, order, environment, clientKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutSession)) {
            return false;
        }
        CheckoutSession checkoutSession = (CheckoutSession) other;
        return Intrinsics.areEqual(this.sessionSetupResponse, checkoutSession.sessionSetupResponse) && Intrinsics.areEqual(this.order, checkoutSession.order) && Intrinsics.areEqual(this.environment, checkoutSession.environment) && Intrinsics.areEqual(this.clientKey, checkoutSession.clientKey);
    }

    @NotNull
    public final String getClientKey() {
        return this.clientKey;
    }

    @NotNull
    public final CheckoutConfiguration getConfiguration() {
        return new CheckoutConfiguration(this.environment, this.clientKey, null, null, null, null, 60, null);
    }

    @NotNull
    public final Environment getEnvironment() {
        return this.environment;
    }

    @Nullable
    public final OrderRequest getOrder() {
        return this.order;
    }

    @Nullable
    public final PaymentMethod getPaymentMethod(@NotNull String paymentMethodType) {
        paymentMethodType.getClass();
        PaymentMethodsApiResponse paymentMethodsApiResponse = this.sessionSetupResponse.getPaymentMethodsApiResponse();
        Object obj = null;
        List<PaymentMethod> paymentMethods = paymentMethodsApiResponse != null ? paymentMethodsApiResponse.getPaymentMethods() : null;
        if (paymentMethods == null) {
            paymentMethods = n0.f26529a;
        }
        Iterator<T> it = paymentMethods.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((PaymentMethod) next).getType(), paymentMethodType)) {
                obj = next;
                break;
            }
        }
        return (PaymentMethod) obj;
    }

    @NotNull
    public final SessionSetupResponse getSessionSetupResponse() {
        return this.sessionSetupResponse;
    }

    public int hashCode() {
        int iHashCode = this.sessionSetupResponse.hashCode() * 31;
        OrderRequest orderRequest = this.order;
        return this.clientKey.hashCode() + ((this.environment.hashCode() + ((iHashCode + (orderRequest == null ? 0 : orderRequest.hashCode())) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "CheckoutSession(sessionSetupResponse=" + this.sessionSetupResponse + ", order=" + this.order + ", environment=" + this.environment + ", clientKey=" + this.clientKey + ")";
    }
}
