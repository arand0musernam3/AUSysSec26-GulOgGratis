package t3;

import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39777a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f39777a == ((a) obj).f39777a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39777a);
    }

    public final String toString() {
        return k.o(new StringBuilder("DeltaCounter(count="), this.f39777a, ')');
    }
}
