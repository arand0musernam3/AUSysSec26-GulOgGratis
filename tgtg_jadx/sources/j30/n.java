package j30;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i4.a f24520d = new i4.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24521a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile l f24522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f24523c;

    public n(l lVar) {
        lVar.getClass();
        this.f24522b = lVar;
    }

    @Override // j30.l
    public final Object get() {
        l lVar = this.f24522b;
        i4.a aVar = f24520d;
        if (lVar != aVar) {
            synchronized (this.f24521a) {
                try {
                    if (this.f24522b != aVar) {
                        Object obj = this.f24522b.get();
                        this.f24523c = obj;
                        this.f24522b = aVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f24523c;
    }

    public final String toString() {
        Object obj = this.f24522b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == f24520d) {
            obj = "<supplier that returned " + this.f24523c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
