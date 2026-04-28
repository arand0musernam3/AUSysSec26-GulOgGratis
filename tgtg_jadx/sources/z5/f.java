package z5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f47277a;

    public static int a(float f11, float f12) {
        if (Float.isNaN(f11) || Float.isNaN(f12)) {
            return 0;
        }
        return Float.compare(f11, f12);
    }

    public static final boolean c(float f11, float f12) {
        return Float.compare(f11, f12) == 0;
    }

    public static String d(float f11) {
        if (Float.isNaN(f11)) {
            return "Dp.Unspecified";
        }
        return f11 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return a(this.f47277a, ((f) obj).f47277a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f47277a, ((f) obj).f47277a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f47277a);
    }

    public final String toString() {
        return d(this.f47277a);
    }
}
