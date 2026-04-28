package i30;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f23217c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile f f23218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f23219b;

    /* JADX WARN: Multi-variable type inference failed */
    public static e b(f fVar) {
        if (fVar instanceof e) {
            return (e) fVar;
        }
        e eVar = new e();
        eVar.f23219b = f23217c;
        eVar.f23218a = fVar;
        return eVar;
    }

    @Override // i30.h
    public final Object a() {
        Object objA;
        Object obj = this.f23219b;
        Object obj2 = f23217c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.f23219b;
                if (objA == obj2) {
                    objA = this.f23218a.a();
                    Object obj3 = this.f23219b;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.f23219b = objA;
                    this.f23218a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return objA;
    }
}
