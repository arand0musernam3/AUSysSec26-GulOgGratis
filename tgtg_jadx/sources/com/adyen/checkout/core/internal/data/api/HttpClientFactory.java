package com.adyen.checkout.core.internal.data.api;

import com.adyen.checkout.core.Environment;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import q90.d0;
import u70.j;
import u70.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/adyen/checkout/core/internal/data/api/HttpClientFactory;", "", "<init>", "()V", "Lcom/adyen/checkout/core/Environment;", "environment", "Lcom/adyen/checkout/core/internal/data/api/HttpClient;", "getHttpClient", "(Lcom/adyen/checkout/core/Environment;)Lcom/adyen/checkout/core/internal/data/api/HttpClient;", "getAnalyticsHttpClient", "", "", "defaultHeaders", "Ljava/util/Map;", "Lq90/d0;", "okHttpClient$delegate", "Lu70/j;", "getOkHttpClient", "()Lq90/d0;", "okHttpClient", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HttpClientFactory {

    @NotNull
    public static final HttpClientFactory INSTANCE = new HttpClientFactory();

    @NotNull
    private static final Map<String, String> defaultHeaders = w0.b(new Pair("Content-Type", "application/json"));

    /* JADX INFO: renamed from: okHttpClient$delegate, reason: from kotlin metadata */
    @NotNull
    private static final j okHttpClient = l.b(new Function0<d0>() { // from class: com.adyen.checkout.core.internal.data.api.HttpClientFactory$okHttpClient$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final d0 invoke() {
            return new d0();
        }
    });

    private HttpClientFactory() {
    }

    private final d0 getOkHttpClient() {
        return (d0) okHttpClient.getValue();
    }

    @NotNull
    public final HttpClient getAnalyticsHttpClient(@NotNull Environment environment) {
        environment.getClass();
        d0 okHttpClient2 = getOkHttpClient();
        String string = environment.getCheckoutAnalyticsBaseUrl().toString();
        string.getClass();
        return new OkHttpClient(okHttpClient2, string, defaultHeaders);
    }

    @NotNull
    public final HttpClient getHttpClient(@NotNull Environment environment) {
        environment.getClass();
        d0 okHttpClient2 = getOkHttpClient();
        String string = environment.getCheckoutShopperBaseUrl().toString();
        string.getClass();
        return new OkHttpClient(okHttpClient2, string, defaultHeaders);
    }
}
