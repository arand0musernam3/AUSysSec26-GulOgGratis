package ok;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f32618a;

    public p0(List list) {
        this.f32618a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && Intrinsics.areEqual(this.f32618a, ((p0) obj).f32618a);
    }

    public final int hashCode() {
        return this.f32618a.hashCode();
    }

    public final String toString() {
        return e0.f.m("PageSectionsViewed(sectionsViewed=", ")", this.f32618a);
    }
}
