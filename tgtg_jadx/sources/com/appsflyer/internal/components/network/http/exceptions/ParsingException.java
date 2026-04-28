package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFe1ySDK;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class ParsingException extends IOException {

    @NonNull
    private final AFe1ySDK<String> getRevenue;

    public ParsingException(String str, Throwable th2, @NonNull AFe1ySDK<String> aFe1ySDK) {
        super(str, th2);
        this.getRevenue = aFe1ySDK;
    }

    @NonNull
    public AFe1ySDK<String> getRawResponse() {
        return this.getRevenue;
    }
}
