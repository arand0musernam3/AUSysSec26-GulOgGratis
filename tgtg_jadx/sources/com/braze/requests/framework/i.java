package com.braze.requests.framework;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public enum i {
    PENDING_START,
    PENDING_RETRY,
    IN_FLIGHT,
    BATCHED,
    COMPLETE;

    public final boolean a() {
        return this == PENDING_START || this == PENDING_RETRY;
    }
}
