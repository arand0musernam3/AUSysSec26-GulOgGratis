package c50;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements m40.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f7561a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m40.b f7562b = m40.b.a("sessionId");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m40.b f7563c = m40.b.a("firstSessionId");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m40.b f7564d = m40.b.a("sessionIndex");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m40.b f7565e = m40.b.a("eventTimestampUs");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m40.b f7566f = m40.b.a("dataCollectionStatus");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m40.b f7567g = m40.b.a("firebaseInstallationId");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m40.b f7568h = m40.b.a("firebaseAuthenticationToken");

    @Override // m40.a
    public final void a(Object obj, Object obj2) {
        y0 y0Var = (y0) obj;
        m40.d dVar = (m40.d) obj2;
        dVar.a(f7562b, y0Var.f7658a);
        dVar.a(f7563c, y0Var.f7659b);
        dVar.c(f7564d, y0Var.f7660c);
        dVar.b(f7565e, y0Var.f7661d);
        dVar.a(f7566f, y0Var.f7662e);
        dVar.a(f7567g, y0Var.f7663f);
        dVar.a(f7568h, y0Var.f7664g);
    }
}
