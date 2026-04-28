package s1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1.b f38588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f38589b;

    public f1(t1.b bVar, long j9) {
        this.f38588a = bVar;
        this.f38589b = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return Intrinsics.areEqual(this.f38588a, f1Var.f38588a) && z5.l.a(this.f38589b, f1Var.f38589b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f38589b) + (this.f38588a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.f38588a + ", startSize=" + ((Object) z5.l.b(this.f38589b)) + ')';
    }
}
