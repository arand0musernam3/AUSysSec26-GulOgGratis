package cb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ab.b f7866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f7867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f7868c;

    public c(ab.b bVar, b bVar2, b bVar3) {
        this.f7866a = bVar;
        this.f7867b = bVar2;
        this.f7868c = bVar3;
        if (bVar.b() == 0 && bVar.a() == 0) {
            i4.a.f("Bounds must be non zero");
            throw null;
        }
        if (bVar.f1194a == 0 || bVar.f1195b == 0) {
            return;
        }
        i4.a.f("Bounding rectangle must start at the top or left window edge for folding features");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f7866a, cVar.f7866a) && Intrinsics.areEqual(this.f7867b, cVar.f7867b) && Intrinsics.areEqual(this.f7868c, cVar.f7868c);
    }

    public final int hashCode() {
        return this.f7868c.hashCode() + ((this.f7867b.hashCode() + (this.f7866a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return c.class.getSimpleName() + " { " + this.f7866a + ", type=" + this.f7867b + ", state=" + this.f7868c + " }";
    }
}
