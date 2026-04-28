package com.adyen.checkout.components.core.internal.data.api;

import com.adyen.checkout.components.core.internal.data.model.StatusRequest;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.adyen.checkout.core.internal.data.api.HttpClient;
import com.adyen.checkout.core.internal.data.api.HttpClientExtKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0080@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/adyen/checkout/components/core/internal/data/api/StatusService;", "", "Lcom/adyen/checkout/core/internal/data/api/HttpClient;", "httpClient", "<init>", "(Lcom/adyen/checkout/core/internal/data/api/HttpClient;)V", "", "clientKey", "Lcom/adyen/checkout/components/core/internal/data/model/StatusRequest;", "statusRequest", "Lcom/adyen/checkout/components/core/internal/data/model/StatusResponse;", "checkStatus$components_core_release", "(Ljava/lang/String;Lcom/adyen/checkout/components/core/internal/data/model/StatusRequest;Lx70/c;)Ljava/lang/Object;", "checkStatus", "Lcom/adyen/checkout/core/internal/data/api/HttpClient;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class StatusService {

    @NotNull
    private final HttpClient httpClient;

    public StatusService(@NotNull HttpClient httpClient) {
        httpClient.getClass();
        this.httpClient = httpClient;
    }

    @Nullable
    public final Object checkStatus$components_core_release(@NotNull String str, @NotNull StatusRequest statusRequest, @NotNull c<? super StatusResponse> cVar) {
        return HttpClientExtKt.post(this.httpClient, "services/PaymentInitiation/v1/status", statusRequest, StatusRequest.SERIALIZER, StatusResponse.SERIALIZER, w0.b(new Pair("token", str)), cVar);
    }
}
