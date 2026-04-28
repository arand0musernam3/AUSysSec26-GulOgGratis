package q9;

import java.util.List;
import kotlin.collections.d0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f36376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36377b;

    public f(List list, int i11) {
        this.f36376a = list;
        this.f36377b = i11;
        if (list.isEmpty() && i11 == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i11 >= 0 && i11 < size) {
                return;
            }
        }
        e40.a.m(org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '"), d0.f(list), "'.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f36377b == fVar.f36377b && Intrinsics.areEqual(this.f36376a, fVar.f36376a);
    }

    public final int hashCode() {
        return this.f36376a.hashCode() + (this.f36377b * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f36377b + ", mergedHistory=" + this.f36376a + ')';
    }

    public f() {
        this(n0.f26529a, -1);
    }
}
