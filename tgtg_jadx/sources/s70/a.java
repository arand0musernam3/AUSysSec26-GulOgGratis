package s70;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f38895c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile c f38896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f38897b;

    public static c a(c cVar) {
        cVar.getClass();
        if (cVar instanceof a) {
            return cVar;
        }
        a aVar = new a();
        aVar.f38897b = f38895c;
        aVar.f38896a = cVar;
        return aVar;
    }

    @Override // t70.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f38897b;
        Object obj3 = f38895c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.f38897b;
            if (obj == obj3) {
                obj = this.f38896a.get();
                Object obj4 = this.f38897b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.f38897b = obj;
                this.f38896a = null;
            }
        }
        return obj;
    }
}
