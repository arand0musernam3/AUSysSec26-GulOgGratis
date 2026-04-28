package h2;

import c5.o2;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lh2/e;", "Lb5/h1;", "Lh2/d;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f21082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v80.q f21083c;

    public final Object c(z70.c cVar) {
        v80.q qVar = this.f21083c;
        if (qVar == null) {
            qVar = new v80.q();
            this.f21083c = qVar;
            d dVar = this.f21082b;
            if (dVar != null && dVar.isAttached()) {
                dVar.L0();
            }
        }
        Object objM = qVar.m(cVar);
        return objM == y70.a.COROUTINE_SUSPENDED ? objM : Unit.f26487a;
    }

    @Override // b5.h1
    public final b4.s create() {
        return new d(this);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 234;
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "AwaitFirstLayoutModifier";
    }

    @Override // b5.h1
    public final /* bridge */ /* synthetic */ void update(b4.s sVar) {
    }
}
