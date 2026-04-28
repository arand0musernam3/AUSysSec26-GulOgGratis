package com.adyen.checkout.core.internal.data.api;

import com.braze.h2;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001JD\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H¦@¢\u0006\u0004\b\b\u0010\tJL\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H¦@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/adyen/checkout/core/internal/data/api/HttpClient;", "", "", "path", "", "queryParameters", "headers", "Lcom/adyen/checkout/core/internal/data/api/AdyenApiResponse;", "get", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lx70/c;)Ljava/lang/Object;", "jsonBody", "post", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lx70/c;)Ljava/lang/Object;", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface HttpClient {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static Object get$default(HttpClient httpClient, String str, Map map, Map map2, c cVar, int i11, Object obj) {
            if (obj != null) {
                h2.a("Super calls with default arguments not supported in this target, function: get");
                return null;
            }
            if ((i11 & 2) != 0) {
                map = o0.f26530a;
                map.getClass();
            }
            if ((i11 & 4) != 0) {
                map2 = o0.f26530a;
                map2.getClass();
            }
            return httpClient.get(str, map, map2, cVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Object post$default(HttpClient httpClient, String str, String str2, Map map, Map map2, c cVar, int i11, Object obj) {
            if (obj != null) {
                h2.a("Super calls with default arguments not supported in this target, function: post");
                return null;
            }
            if ((i11 & 4) != 0) {
                map = o0.f26530a;
                map.getClass();
            }
            Map map3 = map;
            if ((i11 & 8) != 0) {
                map2 = o0.f26530a;
                map2.getClass();
            }
            return httpClient.post(str, str2, map3, map2, cVar);
        }
    }

    @Nullable
    Object get(@NotNull String str, @NotNull Map<String, String> map, @NotNull Map<String, String> map2, @NotNull c<? super AdyenApiResponse> cVar);

    @Nullable
    Object post(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map, @NotNull Map<String, String> map2, @NotNull c<? super AdyenApiResponse> cVar);
}
