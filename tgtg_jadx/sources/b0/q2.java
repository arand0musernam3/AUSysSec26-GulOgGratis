package b0;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f5373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f5374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f5375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e0.m1 f5376d;

    public /* synthetic */ q2(a aVar, LinkedHashMap linkedHashMap, e0.m1 m1Var, int i11) {
        this((i11 & 1) != 0 ? new a(0) : aVar, (i11 & 2) != 0 ? new LinkedHashMap() : linkedHashMap, new LinkedHashSet(), (i11 & 8) != 0 ? null : m1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return Intrinsics.areEqual(this.f5373a, q2Var.f5373a) && Intrinsics.areEqual(this.f5374b, q2Var.f5374b) && Intrinsics.areEqual(this.f5375c, q2Var.f5375c) && Intrinsics.areEqual(this.f5376d, q2Var.f5376d);
    }

    public final int hashCode() {
        int iHashCode = (this.f5375c.hashCode() + w.a0.f(this.f5374b, this.f5373a.hashCode() * 31, 31)) * 31;
        e0.m1 m1Var = this.f5376d;
        return iHashCode + (m1Var == null ? 0 : Integer.hashCode(m1Var.f15368a));
    }

    public final String toString() {
        return "InfoBundle(options=" + this.f5373a + ", tags=" + this.f5374b + ", listeners=" + this.f5375c + ", template=" + this.f5376d + ')';
    }

    public q2(a aVar, Map map, Set set, e0.m1 m1Var) {
        aVar.getClass();
        map.getClass();
        this.f5373a = aVar;
        this.f5374b = map;
        this.f5375c = set;
        this.f5376d = m1Var;
    }
}
