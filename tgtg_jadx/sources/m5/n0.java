package m5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29600a;

    public /* synthetic */ n0(String str) {
        this.f29600a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n0) {
            return Intrinsics.areEqual(this.f29600a, ((n0) obj).f29600a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29600a.hashCode();
    }

    public final String toString() {
        return e0.f.g(')', "StringAnnotation(value=", this.f29600a);
    }
}
