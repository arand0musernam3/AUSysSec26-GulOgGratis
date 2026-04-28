package ok;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32592a;

    public g0(String str) {
        str.getClass();
        this.f32592a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && Intrinsics.areEqual(this.f32592a, ((g0) obj).f32592a);
    }

    public final int hashCode() {
        return this.f32592a.hashCode();
    }

    public final String toString() {
        return w.a0.p("AddressCopied(address=", this.f32592a, ")");
    }
}
