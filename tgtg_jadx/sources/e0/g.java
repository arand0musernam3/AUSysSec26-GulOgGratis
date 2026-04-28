package e0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15338a;

    public /* synthetic */ g(String str) {
        this.f15338a = str;
    }

    public static String a(String str) {
        return f.g(')', "CameraBackendId(value=", str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return Intrinsics.areEqual(this.f15338a, ((g) obj).f15338a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15338a.hashCode();
    }

    public final String toString() {
        return a(this.f15338a);
    }
}
