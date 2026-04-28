package q0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0.c f35700a;

    public b(o0.c cVar) {
        this.f35700a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.areEqual(this.f35700a, ((b) obj).f35700a);
    }

    public final int hashCode() {
        return this.f35700a.hashCode();
    }

    public final String toString() {
        return "Supported(resolvedFeatureGroup=" + this.f35700a + ')';
    }
}
