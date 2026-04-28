package qe;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pe.e f36951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pe.a f36952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f36953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f36954e;

    public a(String str, pe.e eVar, pe.a aVar, boolean z11, boolean z12) {
        this.f36950a = str;
        this.f36951b = eVar;
        this.f36952c = aVar;
        this.f36953d = z11;
        this.f36954e = z12;
    }

    @Override // qe.b
    public final je.c a(he.z zVar, he.k kVar, re.b bVar) {
        return new je.f(zVar, bVar, this);
    }
}
