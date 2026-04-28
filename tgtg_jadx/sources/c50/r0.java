package c50;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f7617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f7618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f7619c;

    public r0(n nVar, y0 y0Var, b bVar) {
        nVar.getClass();
        this.f7617a = nVar;
        this.f7618b = y0Var;
        this.f7619c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f7617a == r0Var.f7617a && Intrinsics.areEqual(this.f7618b, r0Var.f7618b) && Intrinsics.areEqual(this.f7619c, r0Var.f7619c);
    }

    public final int hashCode() {
        return this.f7619c.hashCode() + ((this.f7618b.hashCode() + (this.f7617a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + this.f7617a + ", sessionData=" + this.f7618b + ", applicationInfo=" + this.f7619c + ')';
    }
}
