package com.adyen.checkout.core.internal.data.api;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/adyen/checkout/core/internal/data/api/AdyenApiResponse;", "", "path", "", "statusCode", "", "headers", "", "body", "(Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;)V", "getBody", "()Ljava/lang/String;", "getHeaders", "()Ljava/util/Map;", "getPath", "getStatusCode", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AdyenApiResponse {

    @NotNull
    private final String body;

    @NotNull
    private final Map<String, String> headers;

    @NotNull
    private final String path;
    private final int statusCode;

    public AdyenApiResponse(@NotNull String str, int i11, @NotNull Map<String, String> map, @NotNull String str2) {
        str.getClass();
        map.getClass();
        str2.getClass();
        this.path = str;
        this.statusCode = i11;
        this.headers = map;
        this.body = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdyenApiResponse copy$default(AdyenApiResponse adyenApiResponse, String str, int i11, Map map, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = adyenApiResponse.path;
        }
        if ((i12 & 2) != 0) {
            i11 = adyenApiResponse.statusCode;
        }
        if ((i12 & 4) != 0) {
            map = adyenApiResponse.headers;
        }
        if ((i12 & 8) != 0) {
            str2 = adyenApiResponse.body;
        }
        return adyenApiResponse.copy(str, i11, map, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.headers;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    @NotNull
    public final AdyenApiResponse copy(@NotNull String path, int statusCode, @NotNull Map<String, String> headers, @NotNull String body) {
        path.getClass();
        headers.getClass();
        body.getClass();
        return new AdyenApiResponse(path, statusCode, headers, body);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdyenApiResponse)) {
            return false;
        }
        AdyenApiResponse adyenApiResponse = (AdyenApiResponse) other;
        return Intrinsics.areEqual(this.path, adyenApiResponse.path) && this.statusCode == adyenApiResponse.statusCode && Intrinsics.areEqual(this.headers, adyenApiResponse.headers) && Intrinsics.areEqual(this.body, adyenApiResponse.body);
    }

    @NotNull
    public final String getBody() {
        return this.body;
    }

    @NotNull
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        return this.body.hashCode() + a0.f(this.headers, k.b(this.statusCode, this.path.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "AdyenApiResponse(path=" + this.path + ", statusCode=" + this.statusCode + ", headers=" + this.headers + ", body=" + this.body + ")";
    }
}
