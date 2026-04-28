package cb;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7878a;

    public h(List list) {
        list.getClass();
        this.f7878a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(h.class, obj.getClass())) {
            return false;
        }
        return Intrinsics.areEqual(this.f7878a, ((h) obj).f7878a);
    }

    public final int hashCode() {
        return this.f7878a.hashCode();
    }

    public final String toString() {
        return CollectionsKt.U(this.f7878a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
