package ad;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f1226c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.a f1227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a.a f1228b;

    static {
        b bVar = b.f1222b;
        f1226c = new h(bVar, bVar);
    }

    public h(a.a aVar, a.a aVar2) {
        this.f1227a = aVar;
        this.f1228b = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f1227a, hVar.f1227a) && Intrinsics.areEqual(this.f1228b, hVar.f1228b);
    }

    public final int hashCode() {
        return this.f1228b.hashCode() + (this.f1227a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f1227a + ", height=" + this.f1228b + ')';
    }
}
