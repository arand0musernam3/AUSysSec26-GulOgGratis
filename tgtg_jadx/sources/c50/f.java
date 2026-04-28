package c50;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements m40.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f7526a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m40.b f7527b = m40.b.a("processName");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m40.b f7528c = m40.b.a("pid");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m40.b f7529d = m40.b.a("importance");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m40.b f7530e = m40.b.a("defaultProcess");

    @Override // m40.a
    public final void a(Object obj, Object obj2) {
        h0 h0Var = (h0) obj;
        m40.d dVar = (m40.d) obj2;
        dVar.a(f7527b, h0Var.f7569a);
        dVar.c(f7528c, h0Var.f7570b);
        dVar.c(f7529d, h0Var.f7571c);
        dVar.e(f7530e, h0Var.f7572d);
    }
}
