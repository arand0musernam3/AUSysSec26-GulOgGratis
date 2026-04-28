package pi;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f35416a;

    public p(List list) {
        list.getClass();
        this.f35416a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.areEqual(this.f35416a, ((p) obj).f35416a);
    }

    public final int hashCode() {
        return this.f35416a.hashCode();
    }

    public final String toString() {
        return e0.f.m("Success(days=", ")", this.f35416a);
    }
}
