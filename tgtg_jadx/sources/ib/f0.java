package ib;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23723b;

    public f0(long j9, long j11) {
        this.f23722a = j9;
        this.f23723b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.areEqual(f0.class, obj.getClass())) {
            f0 f0Var = (f0) obj;
            if (f0Var.f23722a == this.f23722a && f0Var.f23723b == this.f23723b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23723b) + (Long.hashCode(this.f23722a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PeriodicityInfo{repeatIntervalMillis=");
        sb2.append(this.f23722a);
        sb2.append(", flexIntervalMillis=");
        return w.a0.r(sb2, this.f23723b, '}');
    }
}
