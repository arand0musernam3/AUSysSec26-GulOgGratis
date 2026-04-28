package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements m40.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f14202a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m40.b f14203b = m40.b.a("generator");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m40.b f14204c = m40.b.a("identifier");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m40.b f14205d = m40.b.a("appQualitySessionId");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m40.b f14206e = m40.b.a("startedAt");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m40.b f14207f = m40.b.a("endedAt");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m40.b f14208g = m40.b.a("crashed");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m40.b f14209h = m40.b.a("app");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m40.b f14210i = m40.b.a("user");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final m40.b f14211j = m40.b.a("os");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m40.b f14212k = m40.b.a("device");
    public static final m40.b l = m40.b.a("events");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final m40.b f14213m = m40.b.a("generatorType");

    @Override // m40.a
    public final void a(Object obj, Object obj2) {
        m40.d dVar = (m40.d) obj2;
        j0 j0Var = (j0) ((m2) obj);
        dVar.a(f14203b, j0Var.f14214a);
        dVar.a(f14204c, j0Var.f14215b.getBytes(n2.f14292a));
        dVar.a(f14205d, j0Var.f14216c);
        dVar.b(f14206e, j0Var.f14217d);
        dVar.a(f14207f, j0Var.f14218e);
        dVar.e(f14208g, j0Var.f14219f);
        dVar.a(f14209h, j0Var.f14220g);
        dVar.a(f14210i, j0Var.f14221h);
        dVar.a(f14211j, j0Var.f14222i);
        dVar.a(f14212k, j0Var.f14223j);
        dVar.a(l, j0Var.f14224k);
        dVar.c(f14213m, j0Var.l);
    }
}
