package e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15363a;

    public static String a(int i11) {
        return w2.l1.f(new StringBuilder("CameraError("), i11 == 0 ? "ERROR_UNDETERMINED" : i11 == 1 ? "ERROR_CAMERA_IN_USE" : i11 == 2 ? "ERROR_CAMERA_LIMIT_EXCEEDED" : i11 == 3 ? "ERROR_CAMERA_DISABLED" : i11 == 4 ? "ERROR_CAMERA_DEVICE" : i11 == 5 ? "ERROR_CAMERA_SERVICE" : i11 == 6 ? "ERROR_CAMERA_DISCONNECTED" : i11 == 7 ? "ERROR_ILLEGAL_ARGUMENT_EXCEPTION" : i11 == 8 ? "ERROR_SECURITY_EXCEPTION" : i11 == 9 ? "ERROR_GRAPH_CONFIG" : i11 == 10 ? "ERROR_DO_NOT_DISTURB_ENABLED" : i11 == 11 ? "ERROR_UNKNOWN_EXCEPTION" : i11 == 12 ? "ERROR_CAMERA_OPENER" : i11 == 13 ? "ERROR_CAMERA_OPEN_TIMEOUT" : "ERROR_UNKNOWN", ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f15363a == ((l) obj).f15363a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15363a);
    }

    public final String toString() {
        return a(this.f15363a);
    }
}
