package e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15368a;

    public static final String a(int i11) {
        switch (i11) {
            case 1:
                return "TEMPLATE_PREVIEW";
            case 2:
                return "TEMPLATE_STILL_CAPTURE";
            case 3:
                return "TEMPLATE_RECORD";
            case 4:
                return "TEMPLATE_VIDEO_SNAPSHOT";
            case 5:
                return "TEMPLATE_ZERO_SHUTTER_LAG";
            case 6:
                return "TEMPLATE_MANUAL";
            default:
                return j4.s.f(i11, "UNKNOWN-");
        }
    }

    public static String b(int i11) {
        return w.a0.l("RequestTemplate(value=", i11, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m1) {
            return this.f15368a == ((m1) obj).f15368a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15368a);
    }

    public final String toString() {
        return b(this.f15368a);
    }
}
