package e0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15403a;

    public static void a(String str) {
        str.getClass();
        if (StringsKt.H(str)) {
            i4.a.f("CameraId cannot be null or blank!");
        }
    }

    public static String b(String str) {
        return f.k("CameraId-", str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return Intrinsics.areEqual(this.f15403a, ((s) obj).f15403a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15403a.hashCode();
    }

    public final String toString() {
        return b(this.f15403a);
    }
}
