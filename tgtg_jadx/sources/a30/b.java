package a30;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f649c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile c f650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f651b;

    public static c b(c cVar) {
        if (cVar instanceof b) {
            return cVar;
        }
        b bVar = new b();
        bVar.f651b = f649c;
        bVar.f650a = cVar;
        return bVar;
    }

    @Override // a30.c
    public final Object a() {
        Object objA;
        Object obj = this.f651b;
        Object obj2 = f649c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.f651b;
                if (objA == obj2) {
                    objA = this.f650a.a();
                    Object obj3 = this.f651b;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.f651b = objA;
                    this.f650a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return objA;
    }
}
