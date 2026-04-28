package m3;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n2 implements a4.f, Iterable, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2 f29350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29352c;

    public n2(m2 m2Var, int i11, int i12) {
        this.f29350a = m2Var;
        this.f29351b = i11;
        this.f29352c = i12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return n2Var.f29351b == this.f29351b && n2Var.f29352c == this.f29352c && Intrinsics.areEqual(n2Var.f29350a, this.f29350a);
    }

    public final int hashCode() {
        return (this.f29350a.hashCode() * 31) + this.f29351b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        m2 m2Var = this.f29350a;
        if (m2Var.f29344h != this.f29352c) {
            o2.e();
        }
        int i11 = this.f29351b;
        m2Var.i(i11);
        return new p0(m2Var, i11 + 1, m2Var.f29337a[(i11 * 5) + 3] + i11);
    }
}
