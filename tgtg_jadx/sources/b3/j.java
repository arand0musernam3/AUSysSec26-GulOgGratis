package b3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l2.f f5604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l2.f f5605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l2.f f5606c;

    public j() {
        l2.f fVarB = l2.g.b(4);
        l2.f fVarB2 = l2.g.b(4);
        l2.f fVarB3 = l2.g.b(0);
        this.f5604a = fVarB;
        this.f5605b = fVarB2;
        this.f5606c = fVarB3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f5604a, jVar.f5604a) && Intrinsics.areEqual(this.f5605b, jVar.f5605b) && Intrinsics.areEqual(this.f5606c, jVar.f5606c);
    }

    public final int hashCode() {
        return this.f5606c.hashCode() + ((this.f5605b.hashCode() + (this.f5604a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(small=" + this.f5604a + ", medium=" + this.f5605b + ", large=" + this.f5606c + ')';
    }
}
