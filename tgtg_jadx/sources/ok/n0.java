package ok;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32615a;

    public n0(String str) {
        this.f32615a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && Intrinsics.areEqual(this.f32615a, ((n0) obj).f32615a);
    }

    public final int hashCode() {
        return this.f32615a.hashCode();
    }

    public final String toString() {
        return w.a0.p("SpecialRewardClicked(url=", this.f32615a, ")");
    }
}
