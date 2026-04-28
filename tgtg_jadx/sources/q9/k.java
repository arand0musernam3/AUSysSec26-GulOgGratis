package q9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f36394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36395b;

    public k(b bVar, int i11) {
        bVar.getClass();
        this.f36394a = bVar;
        this.f36395b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f36395b == kVar.f36395b && Intrinsics.areEqual(this.f36394a, kVar.f36394a);
    }

    public final int hashCode() {
        return this.f36394a.hashCode() + (this.f36395b * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InProgress(latestEvent=");
        sb2.append(this.f36394a);
        sb2.append(", direction=");
        return r8.k.o(sb2, this.f36395b, ')');
    }
}
