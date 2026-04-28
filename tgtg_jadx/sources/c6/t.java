package c6;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends b4.s {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public d f7757o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final androidx.fragment.app.r f7758p = new androidx.fragment.app.r(this, 11);

    public t(d dVar) {
        this.f7757o = dVar;
    }

    @Override // b4.s
    public final void onAttach() {
        this.f7757o.invoke(this.f7758p);
    }

    @Override // b4.s
    public final void onDetach() {
        this.f7757o.invoke(null);
    }
}
