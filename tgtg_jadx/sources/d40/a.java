package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements m40.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f14050a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m40.b f14051b = m40.b.a("arch");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m40.b f14052c = m40.b.a("libraryName");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m40.b f14053d = m40.b.a("buildId");

    @Override // m40.a
    public final void a(Object obj, Object obj2) {
        m40.d dVar = (m40.d) obj2;
        e0 e0Var = (e0) ((o1) obj);
        dVar.a(f14051b, e0Var.f14143a);
        dVar.a(f14052c, e0Var.f14144b);
        dVar.a(f14053d, e0Var.f14145c);
    }
}
