package j2;

import b4.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends s {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c f24441o;

    public e(c cVar) {
        this.f24441o = cVar;
    }

    @Override // b4.s
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // b4.s
    public final void onAttach() {
        c cVar = this.f24441o;
        if (cVar != null) {
            cVar.f24440a.j(this);
        }
        if (cVar != null) {
            cVar.f24440a.b(this);
        }
        this.f24441o = cVar;
    }

    @Override // b4.s
    public final void onDetach() {
        c cVar = this.f24441o;
        if (cVar != null) {
            cVar.f24440a.j(this);
        }
    }
}
