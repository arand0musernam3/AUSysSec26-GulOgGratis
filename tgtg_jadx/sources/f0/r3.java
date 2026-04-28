package f0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r3 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f16872a;

    public r3(a aVar) {
        aVar.getClass();
        this.f16872a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r3) && Intrinsics.areEqual(this.f16872a, ((r3) obj).f16872a);
    }

    public final int hashCode() {
        return this.f16872a.hashCode();
    }

    public final String toString() {
        return "RequestClose(activeCamera=" + this.f16872a + ')';
    }
}
