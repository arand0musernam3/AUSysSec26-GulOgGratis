package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements m40.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f14243a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m40.b f14244b = m40.b.a("baseAddress");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m40.b f14245c = m40.b.a("size");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m40.b f14246d = m40.b.a("name");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m40.b f14247e = m40.b.a("uuid");

    @Override // m40.a
    public final void a(Object obj, Object obj2) {
        m40.d dVar = (m40.d) obj2;
        s0 s0Var = (s0) ((w1) obj);
        dVar.b(f14244b, s0Var.f14344a);
        dVar.b(f14245c, s0Var.f14345b);
        dVar.a(f14246d, s0Var.f14346c);
        String str = s0Var.f14347d;
        dVar.a(f14247e, str != null ? str.getBytes(n2.f14292a) : null);
    }
}
