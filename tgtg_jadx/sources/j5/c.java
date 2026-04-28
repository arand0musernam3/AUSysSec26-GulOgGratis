package j5;

import b5.h1;
import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lj5/c;", "Lb5/h1;", "Lj5/e;", "Lj5/q;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends h1 implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f24616b;

    public c(Function1 function1) {
        this.f24616b = function1;
    }

    @Override // j5.q
    public final n H0() {
        n nVar = new n();
        nVar.f24684c = false;
        nVar.f24685d = true;
        this.f24616b.invoke(nVar);
        return nVar;
    }

    @Override // b5.h1
    public final b4.s create() {
        return new e(false, true, this.f24616b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f24616b == ((c) obj).f24616b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24616b.hashCode();
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "clearAndSetSemantics";
        r.a(o2Var, H0());
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        ((e) sVar).f24623q = this.f24616b;
    }
}
