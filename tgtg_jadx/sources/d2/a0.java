package d2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld2/a0;", "Lb5/h1;", "Ld2/b0;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class a0 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f13729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f13730c;

    public a0(Function1 function1, Function1 function12) {
        this.f13729b = function1;
        this.f13730c = function12;
    }

    @Override // b5.h1
    public final b4.s create() {
        b0 b0Var = new b0();
        b0Var.f13742q = this.f13729b;
        return b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && ((a0) obj).f13729b == this.f13729b;
    }

    public final int hashCode() {
        return this.f13729b.hashCode();
    }

    @Override // b5.h1
    public final void inspectableProperties(c5.o2 o2Var) {
        this.f13730c.invoke(o2Var);
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        b0 b0Var = (b0) sVar;
        Function1 function1 = b0Var.f13742q;
        Function1 function12 = this.f13729b;
        if (function12 != function1) {
            b0Var.f13742q = function12;
        }
    }
}
