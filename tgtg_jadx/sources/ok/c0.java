package ok;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32583a;

    public c0(String str) {
        str.getClass();
        this.f32583a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && Intrinsics.areEqual(this.f32583a, ((c0) obj).f32583a);
    }

    public final int hashCode() {
        return this.f32583a.hashCode();
    }

    public final String toString() {
        return w.a0.p("GoToAllergensWebview(url=", this.f32583a, ")");
    }
}
