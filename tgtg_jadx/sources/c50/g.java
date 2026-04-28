package c50;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements m40.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f7544a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m40.b f7545b = m40.b.a("eventType");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m40.b f7546c = m40.b.a("sessionData");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m40.b f7547d = m40.b.a("applicationInfo");

    @Override // m40.a
    public final void a(Object obj, Object obj2) {
        r0 r0Var = (r0) obj;
        m40.d dVar = (m40.d) obj2;
        dVar.a(f7545b, r0Var.f7617a);
        dVar.a(f7546c, r0Var.f7618b);
        dVar.a(f7547d, r0Var.f7619c);
    }
}
