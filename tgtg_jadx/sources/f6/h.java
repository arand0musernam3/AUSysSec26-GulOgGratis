package f6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f17398c;

    public h(Object obj, int i11, d dVar) {
        this.f17396a = obj;
        this.f17397b = i11;
        this.f17398c = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f17396a, hVar.f17396a) && this.f17397b == hVar.f17397b && Intrinsics.areEqual(this.f17398c, hVar.f17398c);
    }

    public final int hashCode() {
        return this.f17398c.hashCode() + r8.k.b(this.f17397b, this.f17396a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "VerticalAnchor(id=" + this.f17396a + ", index=" + this.f17397b + ", reference=" + this.f17398c + ')';
    }
}
