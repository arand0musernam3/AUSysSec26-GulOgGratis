package qe;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36995a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f36996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pe.b f36997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f36998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pe.e f36999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f37000f;

    public o(String str, pe.b bVar, pe.b bVar2, pe.d dVar, boolean z11) {
        this.f36996b = str;
        this.f36997c = bVar;
        this.f36999e = bVar2;
        this.f37000f = dVar;
        this.f36998d = z11;
    }

    @Override // qe.b
    public final je.c a(he.z zVar, he.k kVar, re.b bVar) {
        switch (this.f36995a) {
            case 0:
                return new je.q(zVar, bVar, this);
            case 1:
                return new je.r(zVar, bVar, this);
            default:
                return new je.v(bVar, this);
        }
    }

    public String toString() {
        switch (this.f36995a) {
            case 0:
                return "RectangleShape{position=" + this.f36999e + ", size=" + ((pe.e) this.f37000f) + '}';
            case 1:
            default:
                return super.toString();
            case 2:
                return "Trim Path: {start: " + this.f36997c + ", end: " + ((pe.b) this.f36999e) + ", offset: " + ((pe.b) this.f37000f) + "}";
        }
    }

    public o(String str, pe.e eVar, pe.a aVar, pe.b bVar, boolean z11) {
        this.f36996b = str;
        this.f36999e = eVar;
        this.f37000f = aVar;
        this.f36997c = bVar;
        this.f36998d = z11;
    }

    public o(String str, y yVar, pe.b bVar, pe.b bVar2, pe.b bVar3, boolean z11) {
        this.f36996b = yVar;
        this.f36997c = bVar;
        this.f36999e = bVar2;
        this.f37000f = bVar3;
        this.f36998d = z11;
    }
}
