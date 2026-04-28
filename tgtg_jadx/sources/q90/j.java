package q90;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f36516c = new j(CollectionsKt.v0(new ArrayList()), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f36517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z20.b f36518b;

    public j(Set set, z20.b bVar) {
        set.getClass();
        this.f36517a = set;
        this.f36518b = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(jVar.f36517a, this.f36517a) && Intrinsics.areEqual(jVar.f36518b, this.f36518b);
    }

    public final int hashCode() {
        int iHashCode = (this.f36517a.hashCode() + 1517) * 41;
        z20.b bVar = this.f36518b;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }
}
