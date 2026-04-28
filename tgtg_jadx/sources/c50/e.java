package c50;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements m40.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f7516a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m40.b f7517b = m40.b.a("performance");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m40.b f7518c = m40.b.a("crashlytics");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m40.b f7519d = m40.b.a("sessionSamplingRate");

    @Override // m40.a
    public final void a(Object obj, Object obj2) {
        k kVar = (k) obj;
        m40.d dVar = (m40.d) obj2;
        dVar.a(f7517b, kVar.f7593a);
        dVar.a(f7518c, kVar.f7594b);
        dVar.d(f7519d, kVar.f7595c);
    }
}
