package t4;

import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39779a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f39779a == ((a) obj).f39779a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39779a);
    }

    public final String toString() {
        return a0.l("IndirectPointerEventPrimaryDirectionalMotionAxis(value=", this.f39779a, ')');
    }
}
