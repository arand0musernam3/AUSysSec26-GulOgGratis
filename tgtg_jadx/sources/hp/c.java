package hp;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f22259b;

    public c(List list, d dVar) {
        list.getClass();
        dVar.getClass();
        this.f22258a = list;
        this.f22259b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f22258a, cVar.f22258a) && this.f22259b == cVar.f22259b;
    }

    public final int hashCode() {
        return this.f22259b.hashCode() + (this.f22258a.hashCode() * 31);
    }

    public final String toString() {
        return "PendingPhotos(uris=" + this.f22258a + ", photoSource=" + this.f22259b + ")";
    }
}
