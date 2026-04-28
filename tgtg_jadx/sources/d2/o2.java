package d2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld2/o2;", "Lb5/h1;", "Ld2/p2;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class o2 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f13871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f13872c;

    public o2(Function1 function1, Function1 function12) {
        this.f13871b = function1;
        this.f13872c = function12;
    }

    @Override // b5.h1
    public final b4.s create() {
        p2 p2Var = new p2(c.f13757c);
        p2Var.f13879r = this.f13872c;
        return p2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o2) {
            return this.f13872c == ((o2) obj).f13872c;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13872c.hashCode();
    }

    @Override // b5.h1
    public final void inspectableProperties(c5.o2 o2Var) {
        this.f13871b.invoke(o2Var);
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        p2 p2Var = (p2) sVar;
        Function1 function1 = p2Var.f13879r;
        Function1 function12 = this.f13872c;
        if (function1 != function12) {
            p2Var.f13879r = function12;
            z2 z2Var = p2Var.f13880s;
            if (z2Var != null) {
                y2 y2Var = (y2) function12.invoke(z2Var);
                if (Intrinsics.areEqual(y2Var, p2Var.f13773q)) {
                    return;
                }
                p2Var.f13773q = y2Var;
                p2Var.M0();
            }
        }
    }
}
