package l0;

import kotlin.jvm.internal.Intrinsics;
import m0.h1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f26747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1.b f26748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1.c f26749c;

    public g(h1 h1Var, l1.b bVar, l1.c cVar) {
        this.f26747a = h1Var;
        this.f26748b = bVar;
        this.f26749c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f26747a, gVar.f26747a) && this.f26748b == gVar.f26748b && Intrinsics.areEqual(this.f26749c, gVar.f26749c);
    }

    public final int hashCode() {
        return this.f26749c.hashCode() + ((this.f26748b.hashCode() + (this.f26747a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ViewfinderArgs(surfaceRequest=" + this.f26747a + ", implementationMode=" + this.f26748b + ", transformationInfo=" + this.f26749c + ')';
    }
}
