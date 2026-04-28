package v4;

import b4.s;
import b5.h1;
import c5.l3;
import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv4/e;", "Lb5/h1;", "Lv4/i;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class e extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f41983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f41984c;

    public e(a aVar, d dVar) {
        this.f41983b = aVar;
        this.f41984c = dVar;
    }

    @Override // b5.h1
    public final s create() {
        return new i(this.f41983b, this.f41984c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(eVar.f41983b, this.f41983b) && Intrinsics.areEqual(eVar.f41984c, this.f41984c);
    }

    public final int hashCode() {
        int iHashCode = this.f41983b.hashCode() * 31;
        d dVar = this.f41984c;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "nestedScroll";
        l3 l3Var = o2Var.f7309c;
        l3Var.b(this.f41983b, "connection");
        l3Var.b(this.f41984c, "dispatcher");
    }

    @Override // b5.h1
    public final void update(s sVar) {
        i iVar = (i) sVar;
        iVar.f41992o = this.f41983b;
        d dVar = iVar.f41993p;
        if (dVar.f41979a == iVar) {
            dVar.f41979a = null;
        }
        d dVar2 = this.f41984c;
        if (dVar2 == null) {
            iVar.f41993p = new d();
        } else if (!Intrinsics.areEqual(dVar2, dVar)) {
            iVar.f41993p = dVar2;
        }
        if (iVar.isAttached()) {
            d dVar3 = iVar.f41993p;
            dVar3.f41979a = iVar;
            dVar3.f41980b = null;
            iVar.f41994q = null;
            dVar3.f41981c = new ky.i(iVar, 19);
            iVar.f41993p.f41982d = iVar.getCoroutineScope();
        }
    }
}
