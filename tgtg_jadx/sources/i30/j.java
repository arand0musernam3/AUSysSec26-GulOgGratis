package i30;

import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23222a;

    public j(long j9) {
        this.f23222a = j9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof j) && this.f23222a == ((j) obj).f23222a;
    }

    public final int hashCode() {
        long j9 = this.f23222a;
        return ((int) ((j9 >>> 32) ^ j9)) ^ (-724379968);
    }

    public final String toString() {
        return a0.j(this.f23222a, "}", new StringBuilder("EventRecord{eventType=3, eventTimestamp="));
    }
}
