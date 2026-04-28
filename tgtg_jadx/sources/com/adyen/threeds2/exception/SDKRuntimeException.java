package com.adyen.threeds2.exception;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class SDKRuntimeException extends RuntimeException {
    private static final long serialVersionUID = 3282225212522028461L;
    private final String mErrorCode;

    public SDKRuntimeException(String str, String str2, Throwable th2) {
        super(str, th2);
        this.mErrorCode = str2;
    }

    public final String getErrorCode() {
        return this.mErrorCode;
    }
}
