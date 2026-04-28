package p80;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.AbstractDoubleTimeSource;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f34556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractDoubleTimeSource f34557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f34558c;

    public a(double d3, AbstractDoubleTimeSource abstractDoubleTimeSource, long j9, DefaultConstructorMarker defaultConstructorMarker) {
        abstractDoubleTimeSource.getClass();
        this.f34556a = d3;
        this.f34557b = abstractDoubleTimeSource;
        this.f34558c = j9;
    }

    @Override // kotlin.time.TimeMark
    public final long a() {
        g.f(this.f34557b.b() - this.f34556a, null);
        throw null;
    }

    @Override // p80.b
    public final long b(b bVar) {
        bVar.getClass();
        if (bVar instanceof a) {
            a aVar = (a) bVar;
            long j9 = aVar.f34558c;
            if (Intrinsics.areEqual(this.f34557b, aVar.f34557b)) {
                long j11 = this.f34558c;
                if (d.e(j11, j9) && d.h(j11)) {
                    d.f34559b.getClass();
                    return 0L;
                }
                d.i(j11, d.l(j9));
                g.f(this.f34556a - aVar.f34556a, null);
                throw null;
            }
        }
        i1.k("Subtracting or comparing time marks from different time sources is not possible: ", this, " and ", bVar);
        return 0L;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ int compareTo(Object obj) {
        return o.a(this, (b) obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f34557b, ((a) obj).f34557b)) {
            return false;
        }
        b((b) obj);
        d.f34559b.getClass();
        return d.e(0L, 0L);
    }

    public final int hashCode() {
        g.f(this.f34556a, null);
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
