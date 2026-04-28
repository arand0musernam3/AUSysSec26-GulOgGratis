package u30;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements t40.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f40698c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f40699a = f40698c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile t40.b f40700b;

    public k(t40.b bVar) {
        this.f40700b = bVar;
    }

    @Override // t40.b
    public final Object get() {
        Object obj;
        Object obj2 = this.f40699a;
        Object obj3 = f40698c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f40699a;
                if (obj == obj3) {
                    obj = this.f40700b.get();
                    this.f40699a = obj;
                    this.f40700b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
