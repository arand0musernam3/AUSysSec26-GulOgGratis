package w2;

import a3.l3;
import c5.y2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends b4.s implements y2, b5.k, b5.s {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f42839o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public m2.e1 f42840p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public l3 f42841q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m3.k1 f42842r = m3.i.w(null);

    public b0(b bVar, m2.e1 e1Var, l3 l3Var) {
        this.f42839o = bVar;
        this.f42840p = e1Var;
        this.f42841q = l3Var;
    }

    @Override // b4.s
    public final void onAttach() {
        b bVar = this.f42839o;
        if (bVar.f42835a != null) {
            c2.a.c("Expected textInputModifierNode to be null");
        }
        bVar.f42835a = this;
    }

    @Override // b4.s
    public final void onDetach() {
        this.f42839o.k(this);
    }

    @Override // b5.s
    public final void v(z4.z zVar) {
        this.f42842r.setValue(zVar);
    }
}
