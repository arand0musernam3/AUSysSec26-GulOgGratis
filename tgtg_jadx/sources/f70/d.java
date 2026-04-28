package f70;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f17484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17485d;

    public d(Bundle bundle) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f17482a = "cookies_v2_result";
        this.f17483b = -1;
        this.f17484c = bundle;
        this.f17485d = jCurrentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f17482a, dVar.f17482a) && this.f17483b == dVar.f17483b && Intrinsics.areEqual(this.f17484c, dVar.f17484c) && this.f17485d == dVar.f17485d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17485d) + ((this.f17484c.hashCode() + r8.k.b(this.f17483b, this.f17482a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "SetResultEvent(requestKey=" + this.f17482a + ", resultCode=" + this.f17483b + ", result=" + this.f17484c + ", timestamp=" + this.f17485d + ")";
    }
}
