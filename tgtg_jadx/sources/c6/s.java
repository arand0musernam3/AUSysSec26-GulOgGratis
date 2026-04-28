package c6;

import b5.h1;
import c5.o2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lc6/s;", "Lb5/h1;", "Lc6/t;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class s extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f7756b;

    public s(d dVar) {
        this.f7756b = dVar;
    }

    @Override // b5.h1
    public final b4.s create() {
        return new t(this.f7756b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            return this.f7756b == ((s) obj).f7756b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7756b.hashCode();
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "requestRectangleBringIntoViewBridge";
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        t tVar = (t) sVar;
        d dVar = this.f7756b;
        tVar.f7757o = dVar;
        if (tVar.isAttached()) {
            dVar.invoke(tVar.f7758p);
        }
    }
}
