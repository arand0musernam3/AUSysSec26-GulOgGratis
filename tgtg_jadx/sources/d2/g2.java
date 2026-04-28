package d2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f13793a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13794b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f13795c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return Float.compare(this.f13793a, g2Var.f13793a) == 0 && this.f13794b == g2Var.f13794b && Intrinsics.areEqual(this.f13795c, g2Var.f13795c) && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        int iE = r8.k.e(Float.hashCode(this.f13793a) * 31, 31, this.f13794b);
        c cVar = this.f13795c;
        return (iE + (cVar == null ? 0 : cVar.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f13793a + ", fill=" + this.f13794b + ", crossAxisAlignment=" + this.f13795c + ", flowLayoutData=null)";
    }
}
