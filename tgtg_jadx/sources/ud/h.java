package ud;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f41059c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f41060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f41061b;

    static {
        b bVar = b.f41056a;
        f41059c = new h(bVar, bVar);
    }

    public h(c cVar, c cVar2) {
        this.f41060a = cVar;
        this.f41061b = cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f41060a, hVar.f41060a) && Intrinsics.areEqual(this.f41061b, hVar.f41061b);
    }

    public final int hashCode() {
        return this.f41061b.hashCode() + (this.f41060a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f41060a + ", height=" + this.f41061b + ")";
    }
}
