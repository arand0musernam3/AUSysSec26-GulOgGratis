package cz;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.a f13606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f13607b;

    public a(fz.a aVar, HashMap map) {
        this.f13606a = aVar;
        this.f13607b = map;
    }

    public final long a(ty.d dVar, long j9, int i11) {
        long jC = j9 - this.f13606a.c();
        b bVar = (b) this.f13607b.get(dVar);
        long j11 = bVar.f13608a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i11 - 1) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j11 > 1 ? j11 : 2L) * ((long) r12)))), jC), bVar.f13609b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f13606a.equals(aVar.f13606a) && this.f13607b.equals(aVar.f13607b);
    }

    public final int hashCode() {
        return ((this.f13606a.hashCode() ^ 1000003) * 1000003) ^ this.f13607b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f13606a + ", values=" + this.f13607b + "}";
    }
}
