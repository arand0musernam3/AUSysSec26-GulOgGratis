package f0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d3 implements e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f16611a;

    public d3(a aVar) {
        this.f16611a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d3) && Intrinsics.areEqual(this.f16611a, ((d3) obj).f16611a);
    }

    public final int hashCode() {
        return this.f16611a.hashCode();
    }

    public final String toString() {
        return "Success(activeCamera=" + this.f16611a + ')';
    }
}
