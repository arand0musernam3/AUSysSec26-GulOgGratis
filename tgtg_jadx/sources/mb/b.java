package mb;

import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29904a;

    public b(int i11) {
        this.f29904a = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f29904a == ((b) obj).f29904a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29904a);
    }

    public final String toString() {
        return k.o(new StringBuilder("ConstraintsNotMet(reason="), this.f29904a, ')');
    }
}
