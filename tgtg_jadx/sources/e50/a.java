package e50;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f15748c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile b f15749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f15750b;

    public static c a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f15750b = f15748c;
        aVar.f15749a = bVar;
        return aVar;
    }

    @Override // t70.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f15750b;
        Object obj3 = f15748c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f15750b;
                if (obj == obj3) {
                    obj = this.f15749a.get();
                    Object obj4 = this.f15750b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f15750b = obj;
                    this.f15749a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
