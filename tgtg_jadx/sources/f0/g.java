package f0;

import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u2 f16670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0.l f16672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Throwable f16673d;

    public g(u2 u2Var, e0.l lVar, Exception exc, int i11) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        lVar = (i11 & 4) != 0 ? null : lVar;
        exc = (i11 & 8) != 0 ? null : exc;
        u2Var.getClass();
        this.f16670a = u2Var;
        this.f16671b = jElapsedRealtimeNanos;
        this.f16672c = lVar;
        this.f16673d = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f16670a == gVar.f16670a && this.f16671b == gVar.f16671b && Intrinsics.areEqual(this.f16672c, gVar.f16672c) && Intrinsics.areEqual(this.f16673d, gVar.f16673d);
    }

    public final int hashCode() {
        int iB = e0.f.b(this.f16670a.hashCode() * 31, 31, this.f16671b);
        e0.l lVar = this.f16672c;
        int iHashCode = (iB + (lVar == null ? 0 : Integer.hashCode(lVar.f15363a))) * 31;
        Throwable th2 = this.f16673d;
        return iHashCode + (th2 != null ? th2.hashCode() : 0);
    }

    public final String toString() {
        return "ClosingInfo(reason=" + this.f16670a + ", closingTimestamp=" + ((Object) h0.o.a(this.f16671b)) + ", errorCode=" + this.f16672c + ", exception=" + this.f16673d + ')';
    }
}
