package hd;

import fd.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gd.b f21838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f21839c;

    public a(Object obj, gd.b bVar, t tVar) {
        this.f21837a = obj;
        this.f21838b = bVar;
        this.f21839c = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        gd.b bVar = aVar.f21838b;
        gd.b bVar2 = this.f21838b;
        return Intrinsics.areEqual(bVar2, bVar) && bVar2.a(this.f21837a, aVar.f21837a) && Intrinsics.areEqual(this.f21839c, aVar.f21839c);
    }

    public final int hashCode() {
        gd.b bVar = this.f21838b;
        return this.f21839c.hashCode() + ((bVar.b(this.f21837a) + (bVar.hashCode() * 31)) * 31);
    }
}
