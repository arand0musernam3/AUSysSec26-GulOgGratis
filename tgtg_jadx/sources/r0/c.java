package r0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1.f f37442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1.f f37443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f37445d;

    public c(c1.f fVar, c1.f fVar2, int i11, ArrayList arrayList) {
        this.f37442a = fVar;
        this.f37443b = fVar2;
        this.f37444c = i11;
        this.f37445d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f37442a.equals(cVar.f37442a) && this.f37443b.equals(cVar.f37443b) && this.f37444c == cVar.f37444c && this.f37445d.equals(cVar.f37445d);
    }

    public final int hashCode() {
        return ((((((this.f37442a.hashCode() ^ 1000003) * 1000003) ^ this.f37443b.hashCode()) * 1000003) ^ this.f37444c) * 1000003) ^ this.f37445d.hashCode();
    }

    public final String toString() {
        return "In{edge=" + this.f37442a + ", postviewEdge=" + this.f37443b + ", inputFormat=" + this.f37444c + ", outputFormats=" + this.f37445d + "}";
    }
}
