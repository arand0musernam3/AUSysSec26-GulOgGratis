package ye;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pf.a f45913a;

    public k(pf.a aVar) {
        this.f45913a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.areEqual(this.f45913a, ((k) obj).f45913a);
    }

    public final int hashCode() {
        return this.f45913a.hashCode();
    }

    public final String toString() {
        return "Event(event=" + this.f45913a + ')';
    }
}
