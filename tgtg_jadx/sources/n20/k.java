package n20;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f30373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f30374c;

    public k(g gVar, float f11) {
        super(0);
        this.f30373b = gVar;
        this.f30374c = f11;
    }

    @Override // n20.f
    public final boolean o() {
        return true;
    }

    @Override // n20.f
    public final void u(float f11, float f12, float f13, y yVar) {
        this.f30373b.u(f11, f12 - this.f30374c, f13, yVar);
    }
}
