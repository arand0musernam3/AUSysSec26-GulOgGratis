package com.adyen.checkout.components.core.internal.data.api;

import com.adyen.checkout.components.core.internal.data.model.OrderStatusRequest;
import com.adyen.checkout.components.core.internal.data.model.OrderStatusResponse;
import com.adyen.checkout.core.DispatcherProvider;
import com.adyen.checkout.core.internal.data.api.HttpClient;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.f0;
import v80.x;
import x70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0080@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/adyen/checkout/components/core/internal/data/api/OrderStatusService;", "", "Lcom/adyen/checkout/core/internal/data/api/HttpClient;", "httpClient", "Lv80/x;", "coroutineDispatcher", "<init>", "(Lcom/adyen/checkout/core/internal/data/api/HttpClient;Lv80/x;)V", "Lcom/adyen/checkout/components/core/internal/data/model/OrderStatusRequest;", "request", "", "clientKey", "Lcom/adyen/checkout/components/core/internal/data/model/OrderStatusResponse;", "getOrderStatus$components_core_release", "(Lcom/adyen/checkout/components/core/internal/data/model/OrderStatusRequest;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "getOrderStatus", "Lcom/adyen/checkout/core/internal/data/api/HttpClient;", "Lv80/x;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OrderStatusService {

    @NotNull
    private final x coroutineDispatcher;

    @NotNull
    private final HttpClient httpClient;

    public OrderStatusService(@NotNull HttpClient httpClient, @NotNull x xVar) {
        httpClient.getClass();
        xVar.getClass();
        this.httpClient = httpClient;
        this.coroutineDispatcher = xVar;
    }

    @Nullable
    public final Object getOrderStatus$components_core_release(@NotNull OrderStatusRequest orderStatusRequest, @NotNull String str, @NotNull c<? super OrderStatusResponse> cVar) {
        return f0.K(this.coroutineDispatcher, new OrderStatusService$getOrderStatus$2(this, str, orderStatusRequest, null), cVar);
    }

    public /* synthetic */ OrderStatusService(HttpClient httpClient, x xVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(httpClient, (i11 & 2) != 0 ? DispatcherProvider.INSTANCE.getIO() : xVar);
    }
}
