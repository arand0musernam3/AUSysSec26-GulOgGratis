package v80;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f42094a = new ThreadLocal();

    public static u0 a() {
        ThreadLocal threadLocal = f42094a;
        u0 u0Var = (u0) threadLocal.get();
        if (u0Var != null) {
            return u0Var;
        }
        h hVar = new h(Thread.currentThread());
        threadLocal.set(hVar);
        return hVar;
    }
}
