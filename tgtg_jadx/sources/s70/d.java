package s70;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f38899c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile c f38900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f38901b;

    public static c a(c cVar) {
        if ((cVar instanceof d) || (cVar instanceof a)) {
            return cVar;
        }
        d dVar = new d();
        dVar.f38901b = f38899c;
        dVar.f38900a = cVar;
        return dVar;
    }

    @Override // t70.a
    public final Object get() {
        Object obj = this.f38901b;
        if (obj != f38899c) {
            return obj;
        }
        c cVar = this.f38900a;
        if (cVar == null) {
            return this.f38901b;
        }
        Object obj2 = cVar.get();
        this.f38901b = obj2;
        this.f38900a = null;
        return obj2;
    }
}
