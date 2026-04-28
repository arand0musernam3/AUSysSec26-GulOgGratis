package x5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f43866c = new s(2, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f43867d = new s(1, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f43869b;

    public s(int i11, boolean z11) {
        this.f43868a = i11;
        this.f43869b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f43868a == sVar.f43868a && this.f43869b == sVar.f43869b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43869b) + (Integer.hashCode(this.f43868a) * 31);
    }

    public final String toString() {
        return Intrinsics.areEqual(this, f43866c) ? "TextMotion.Static" : Intrinsics.areEqual(this, f43867d) ? "TextMotion.Animated" : "Invalid";
    }
}
