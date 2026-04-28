package v2;

import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41941a;

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f41941a == ((i) obj).f41941a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41941a);
    }

    public final String toString() {
        return a0.l("TextHighlightType(value=", this.f41941a, ')');
    }
}
