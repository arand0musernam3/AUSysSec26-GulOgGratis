package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends b5.n implements b5.k, b5.y1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b2.k f18711q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f18712r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f18713s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i4.y f18714t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public f3.a f18715u;

    public h1(b2.k kVar, boolean z11, float f11, i4.y yVar) {
        this.f18711q = kVar;
        this.f18712r = z11;
        this.f18713s = f11;
        this.f18714t = yVar;
    }

    @Override // b5.y1
    public final void l0() {
        b5.o.m(this, new f1(this, 0));
    }

    @Override // b4.s
    public final void onAttach() {
        b5.o.m(this, new f1(this, 0));
    }
}
