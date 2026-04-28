package m3;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2 f29359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29362d;

    public p0(m2 m2Var, int i11, int i12) {
        this.f29359a = m2Var;
        this.f29360b = i12;
        this.f29361c = i11;
        this.f29362d = m2Var.f29344h;
        if (m2Var.f29343g) {
            o2.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29361c < this.f29360b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        m2 m2Var = this.f29359a;
        int i11 = m2Var.f29344h;
        int i12 = this.f29362d;
        if (i11 != i12) {
            o2.e();
        }
        int i13 = this.f29361c;
        this.f29361c = m2Var.f29337a[(i13 * 5) + 3] + i13;
        return new n2(m2Var, i13, i12);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
