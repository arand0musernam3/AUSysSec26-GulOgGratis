package p80;

import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34583a;

    @Override // kotlin.time.TimeMark
    public final long a() {
        s.f34581a.getClass();
        long jB = s.b();
        h hVar = h.NANOSECONDS;
        hVar.getClass();
        long j9 = this.f34583a;
        return (1 | (j9 - 1)) == LongCompanionObject.MAX_VALUE ? d.l(o.d(j9)) : o.h(jB, j9, hVar);
    }

    @Override // p80.b
    public final long b(b bVar) {
        bVar.getClass();
        boolean z11 = bVar instanceof t;
        long j9 = this.f34583a;
        if (!z11) {
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) ("ValueTimeMark(reading=" + j9 + ')')) + " and " + bVar);
        }
        long j11 = ((t) bVar).f34583a;
        s.f34581a.getClass();
        h hVar = h.NANOSECONDS;
        hVar.getClass();
        if (((j11 - 1) | 1) != LongCompanionObject.MAX_VALUE) {
            return (1 | (j9 - 1)) == LongCompanionObject.MAX_VALUE ? o.d(j9) : o.h(j9, j11, hVar);
        }
        if (j9 != j11) {
            return d.l(o.d(j11));
        }
        d.f34559b.getClass();
        return 0L;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ int compareTo(Object obj) {
        return o.a(this, (b) obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f34583a == ((t) obj).f34583a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f34583a);
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.f34583a + ')';
    }
}
