package f6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f17392b;

    public f(Object obj, d dVar) {
        this.f17391a = obj;
        this.f17392b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f17391a, fVar.f17391a) && Intrinsics.areEqual(this.f17392b, fVar.f17392b);
    }

    public final int hashCode() {
        return this.f17392b.hashCode() + (this.f17391a.hashCode() * 31);
    }

    public final String toString() {
        return "BaselineAnchor(id=" + this.f17391a + ", reference=" + this.f17392b + ')';
    }
}
