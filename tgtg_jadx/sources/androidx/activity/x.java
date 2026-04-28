package androidx.activity;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends q9.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y f1761h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1762i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, q9.g gVar) {
        super(gVar, yVar.isEnabled(), 0);
        gVar.getClass();
        this.f1761h = yVar;
        this.f1762i = true;
    }

    @Override // q9.e
    public final void a() {
        this.f1761h.handleOnBackCancelled();
    }

    @Override // q9.e
    public final void b() {
        this.f1761h.handleOnBackPressed();
    }

    @Override // q9.e
    public final void c(q9.b bVar) {
        this.f1761h.handleOnBackProgressed(new b(bVar));
    }

    @Override // q9.e
    public final void d(q9.b bVar) {
        bVar.getClass();
        this.f1761h.handleOnBackStarted(new b(bVar));
    }

    public final void h(boolean z11) {
        this.f1762i = z11;
        g(z11 && this.f1761h.isEnabled());
    }
}
