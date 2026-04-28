package i4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    public static String a(int i11) {
        return i11 == 0 ? "None" : i11 == 1 ? "Low" : i11 == 2 ? "Medium" : i11 == 3 ? "High" : "Unknown";
    }

    public final boolean equals(Object obj) {
        return obj instanceof c0;
    }

    public final int hashCode() {
        return Integer.hashCode(1);
    }

    public final String toString() {
        return a(1);
    }
}
