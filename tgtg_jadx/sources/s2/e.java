package s2;

import b4.s;
import b5.h1;
import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls2/e;", "Lb5/h1;", "Ls2/g;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class e extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function2 f38762b;

    public e(Function2 function2) {
        this.f38762b = function2;
    }

    @Override // b5.h1
    public final s create() {
        return new g(this.f38762b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f38762b == ((e) obj).f38762b;
        }
        return false;
    }

    public final int hashCode() {
        Function2 function2 = this.f38762b;
        if (function2 != null) {
            return function2.hashCode();
        }
        return 0;
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "TextContextMenuGestures";
        o2Var.f7309c.b(this.f38762b, "onPreShowContextMenu");
    }

    @Override // b5.h1
    public final void update(s sVar) {
        ((g) sVar).f38765q = this.f38762b;
    }
}
