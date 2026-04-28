package m3;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b3 implements a4.f, Iterable, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2 f29249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d2 f29251c;

    public b3(m2 m2Var, int i11, q0 q0Var, d2 d2Var) {
        this.f29249a = m2Var;
        this.f29250b = i11;
        this.f29251c = d2Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) obj;
        return b3Var.f29250b == this.f29250b && Intrinsics.areEqual(b3Var.f29249a, this.f29249a) && Intrinsics.areEqual(b3Var.f29251c, this.f29251c);
    }

    public final int hashCode() {
        return this.f29251c.hashCode() + ((this.f29249a.hashCode() + (this.f29250b * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new a3(this.f29249a, this.f29250b, null, this.f29251c);
    }
}
