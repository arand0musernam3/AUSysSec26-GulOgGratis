package f4;

import b4.s;
import b5.h1;
import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lf4/h;", "Lb5/h1;", "Lf4/b;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class h extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f17296b;

    public h(Function1 function1) {
        this.f17296b = function1;
    }

    @Override // b5.h1
    public final s create() {
        return new b(new c(), this.f17296b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.f17296b == ((h) obj).f17296b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17296b.hashCode();
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "drawWithCache";
        o2Var.f7309c.b(this.f17296b, "onBuildDrawCache");
    }

    @Override // b5.h1
    public final void update(s sVar) {
        b bVar = (b) sVar;
        bVar.f17291r = this.f17296b;
        bVar.L0();
    }
}
