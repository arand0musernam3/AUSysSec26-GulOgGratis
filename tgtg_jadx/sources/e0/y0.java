package e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15424a;

    public final boolean equals(Object obj) {
        if (obj instanceof y0) {
            return this.f15424a == ((y0) obj).f15424a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15424a);
    }

    public final String toString() {
        int i11 = this.f15424a;
        if (i11 == 0) {
            return "PENDING";
        }
        if (i11 == 1) {
            return "AVAILABLE";
        }
        if (i11 == 2) {
            return "UNAVAILABLE";
        }
        switch (i11) {
            case 10:
                return "ERROR_OUTPUT_FAILED";
            case 11:
                return "ERROR_OUTPUT_ABORTED";
            case 12:
                return "ERROR_OUTPUT_MISSING";
            case 13:
                return "ERROR_OUTPUT_DROPPED";
            default:
                return w.a0.l("OutputStatus(value=", i11, ')');
        }
    }
}
