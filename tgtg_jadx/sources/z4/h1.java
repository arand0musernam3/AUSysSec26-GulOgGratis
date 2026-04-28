package z4;

import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lz4/h1;", "Lb5/h1;", "Lz4/i1;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class h1 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f47132b;

    public h1(Function1 function1) {
        this.f47132b = function1;
    }

    @Override // b5.h1
    public final b4.s create() {
        i1 i1Var = new i1();
        i1Var.f47146o = this.f47132b;
        long j9 = Integer.MIN_VALUE;
        i1Var.f47147p = (j9 & 4294967295L) | (j9 << 32);
        return i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h1) {
            return this.f47132b == ((h1) obj).f47132b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f47132b.hashCode();
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "onSizeChanged";
        o2Var.f7309c.b(this.f47132b, "onSizeChanged");
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        i1 i1Var = (i1) sVar;
        i1Var.f47146o = this.f47132b;
        long j9 = Integer.MIN_VALUE;
        i1Var.f47147p = (j9 & 4294967295L) | (j9 << 32);
    }
}
