package z4;

import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lz4/b0;", "Lb5/h1;", "Lz4/d0;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class b0 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47091b;

    public b0(String str) {
        this.f47091b = str;
    }

    @Override // b5.h1
    public final b4.s create() {
        d0 d0Var = new d0();
        d0Var.f47102o = this.f47091b;
        return d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.areEqual(this.f47091b, ((b0) obj).f47091b);
    }

    public final int hashCode() {
        return this.f47091b.hashCode();
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "layoutId";
        o2Var.f7308b = this.f47091b;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.f47091b) + ')';
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        ((d0) sVar).f47102o = this.f47091b;
    }
}
