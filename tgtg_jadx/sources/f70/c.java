package f70;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17481b;

    public c(ah.f fVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        fVar.getClass();
        this.f17480a = fVar;
        this.f17481b = jCurrentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f17480a, cVar.f17480a) && this.f17481b == cVar.f17481b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17481b) + (this.f17480a.hashCode() * 31);
    }

    public final String toString() {
        return "NavigateToScreenEvent(route=" + this.f17480a + ", timestamp=" + this.f17481b + ")";
    }
}
