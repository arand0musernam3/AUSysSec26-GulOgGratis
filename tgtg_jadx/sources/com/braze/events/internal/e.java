package com.braze.events.internal;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {
    public e() {
        com.braze.requests.c.DUST_INITIATED.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        com.braze.requests.c cVar = com.braze.requests.c.SESSION_START;
        return true;
    }

    public final int hashCode() {
        return com.braze.requests.c.DUST_INITIATED.hashCode();
    }

    public final String toString() {
        return "ContentCardRefreshRequestedEvent(requestInitiatedBy=" + com.braze.requests.c.DUST_INITIATED + ")";
    }
}
