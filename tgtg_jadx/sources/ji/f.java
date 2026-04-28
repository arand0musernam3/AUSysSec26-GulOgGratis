package ji;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f25275b;

    public f(ArrayList arrayList, List list) {
        list.getClass();
        this.f25274a = list;
        this.f25275b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f25274a, fVar.f25274a) && Intrinsics.areEqual(this.f25275b, fVar.f25275b);
    }

    public final int hashCode() {
        return this.f25275b.hashCode() + (this.f25274a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(products=" + this.f25274a + ", categories=" + this.f25275b + ")";
    }
}
