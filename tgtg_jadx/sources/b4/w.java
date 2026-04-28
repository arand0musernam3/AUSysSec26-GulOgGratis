package b4;

import b5.h1;
import c5.o2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lb4/w;", "Lb5/h1;", "Lb4/y;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class w extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f5727b;

    public w(float f11) {
        this.f5727b = f11;
    }

    @Override // b5.h1
    public final s create() {
        y yVar = new y();
        yVar.f5731o = this.f5727b;
        return yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Float.compare(this.f5727b, ((w) obj).f5727b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5727b);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "zIndex";
        o2Var.f7309c.b(Float.valueOf(this.f5727b), "zIndex");
    }

    public final String toString() {
        return r8.k.n(new StringBuilder("ZIndexElement(zIndex="), this.f5727b, ')');
    }

    @Override // b5.h1
    public final void update(s sVar) {
        ((y) sVar).f5731o = this.f5727b;
    }
}
