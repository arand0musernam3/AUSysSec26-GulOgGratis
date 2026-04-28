package j5;

import b5.h1;
import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lj5/b;", "Lb5/h1;", "Lj5/e;", "Lj5/q;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends h1 implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f24615c;

    public b(Function1 function1, boolean z11) {
        this.f24614b = z11;
        this.f24615c = function1;
    }

    @Override // j5.q
    public final n H0() {
        n nVar = new n();
        nVar.f24684c = this.f24614b;
        this.f24615c.invoke(nVar);
        return nVar;
    }

    @Override // b5.h1
    public final b4.s create() {
        return new e(this.f24614b, false, this.f24615c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f24614b == bVar.f24614b && this.f24615c == bVar.f24615c;
    }

    public final int hashCode() {
        return this.f24615c.hashCode() + (Boolean.hashCode(this.f24614b) * 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "semantics";
        o2Var.f7309c.b(Boolean.valueOf(this.f24614b), "mergeDescendants");
        r.a(o2Var, H0());
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        e eVar = (e) sVar;
        eVar.f24621o = this.f24614b;
        eVar.f24623q = this.f24615c;
    }
}
