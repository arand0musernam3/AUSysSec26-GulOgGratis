package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements m40.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f14304a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m40.b f14305b = m40.b.a("name");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m40.b f14306c = m40.b.a("importance");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m40.b f14307d = m40.b.a("frames");

    @Override // m40.a
    public final void a(Object obj, Object obj2) {
        m40.d dVar = (m40.d) obj2;
        v0 v0Var = (v0) ((a2) obj);
        dVar.a(f14305b, v0Var.f14376a);
        dVar.c(f14306c, v0Var.f14377b);
        dVar.a(f14307d, v0Var.f14378c);
    }
}
