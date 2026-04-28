package r5;

import zendesk.analyticskit.android.model.AnalyticsValueType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37687a;

    public static String a(int i11) {
        return i11 == -1 ? "Unspecified" : i11 == 0 ? "None" : i11 == 1 ? AnalyticsValueType.DEFAULT_TYPE : i11 == 2 ? "Go" : i11 == 3 ? "Search" : i11 == 4 ? "Send" : i11 == 5 ? "Previous" : i11 == 6 ? "Next" : i11 == 7 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f37687a == ((l) obj).f37687a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37687a);
    }

    public final String toString() {
        return a(this.f37687a);
    }
}
