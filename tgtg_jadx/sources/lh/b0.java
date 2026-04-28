package lh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh.a f27779a;

    public b0(qh.a aVar) {
        this.f27779a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.areEqual(this.f27779a, ((b0) obj).f27779a);
    }

    public final int hashCode() {
        return this.f27779a.hashCode();
    }

    public final String toString() {
        return "Update(bucketListData=" + this.f27779a + ")";
    }
}
