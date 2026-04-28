package f6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f17395c;

    public g(Object obj, int i11, d dVar) {
        this.f17393a = obj;
        this.f17394b = i11;
        this.f17395c = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f17393a, gVar.f17393a) && this.f17394b == gVar.f17394b && Intrinsics.areEqual(this.f17395c, gVar.f17395c);
    }

    public final int hashCode() {
        return this.f17395c.hashCode() + r8.k.b(this.f17394b, this.f17393a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "HorizontalAnchor(id=" + this.f17393a + ", index=" + this.f17394b + ", reference=" + this.f17395c + ')';
    }
}
