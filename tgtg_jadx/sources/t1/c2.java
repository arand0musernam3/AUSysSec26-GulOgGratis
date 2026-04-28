package t1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f39402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f39403b;

    public c2(o oVar, u uVar) {
        this.f39402a = oVar;
        this.f39403b = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return Intrinsics.areEqual(this.f39402a, c2Var.f39402a) && Intrinsics.areEqual(this.f39403b, c2Var.f39403b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.f39403b.hashCode() + (this.f39402a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f39402a + ", easing=" + this.f39403b + ", arcMode=ArcMode(value=0))";
    }
}
