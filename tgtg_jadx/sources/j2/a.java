package j2;

import b4.s;
import b5.h1;
import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lj2/a;", "Lb5/h1;", "Lj2/e;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class a extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f24433b;

    public a(c cVar) {
        this.f24433b = cVar;
    }

    @Override // b5.h1
    public final s create() {
        return new e(this.f24433b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return Intrinsics.areEqual(this.f24433b, ((a) obj).f24433b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24433b.hashCode();
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "bringIntoViewRequester";
        o2Var.f7309c.b(this.f24433b, "bringIntoViewRequester");
    }

    @Override // b5.h1
    public final void update(s sVar) {
        e eVar = (e) sVar;
        c cVar = eVar.f24441o;
        if (cVar != null) {
            cVar.f24440a.j(eVar);
        }
        c cVar2 = this.f24433b;
        if (cVar2 != null) {
            cVar2.f24440a.b(eVar);
        }
        eVar.f24441o = cVar2;
    }
}
