package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFd1dSDK;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class HttpException extends IOException {
    private final AFd1dSDK getRevenue;

    public HttpException(@NonNull Throwable th2, @NonNull AFd1dSDK aFd1dSDK) {
        super(th2.getMessage(), th2);
        this.getRevenue = aFd1dSDK;
    }

    @NonNull
    public AFd1dSDK getMetrics() {
        return this.getRevenue;
    }
}
