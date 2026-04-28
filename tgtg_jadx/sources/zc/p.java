package zc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.o0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Iterable, KMappedMarker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f47506b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f47507a;

    static {
        o0 o0Var = o0.f26530a;
        o0Var.getClass();
        f47506b = new p(o0Var);
    }

    public p(Map map) {
        this.f47507a = map;
    }

    public final Object b(String str) {
        o oVar = (o) this.f47507a.get(str);
        if (oVar != null) {
            return oVar.f47504a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return Intrinsics.areEqual(this.f47507a, ((p) obj).f47507a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f47507a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.f47507a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new Pair((String) entry.getKey(), (o) entry.getValue()));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.f47507a + ')';
    }
}
