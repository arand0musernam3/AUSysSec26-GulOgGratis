package n80;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f30712a;

    public f(float f11) {
        this.f30712a = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final boolean a() {
        return 0.0f > this.f30712a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return (a() && ((f) obj).a()) || this.f30712a == ((f) obj).f30712a;
        }
        return false;
    }

    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return Float.hashCode(this.f30712a) + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "0.0.." + this.f30712a;
    }
}
