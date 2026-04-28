package lx;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static k f28358m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f28364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f28365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class f28366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class f28367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class f28368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Method f28369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Method f28370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Method f28371i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Method f28372j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r f28373k;
    public static final o l = new o();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AtomicBoolean f28359n = new AtomicBoolean(false);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ConcurrentHashMap f28360o = new ConcurrentHashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ConcurrentHashMap f28361p = new ConcurrentHashMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ConcurrentHashMap f28362q = new ConcurrentHashMap();

    public k(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Method method, Method method2, Method method3, Method method4, r rVar) {
        this.f28363a = obj;
        this.f28364b = cls;
        this.f28365c = cls2;
        this.f28366d = cls3;
        this.f28367e = cls4;
        this.f28368f = cls5;
        this.f28369g = method;
        this.f28370h = method2;
        this.f28371i = method3;
        this.f28372j = method4;
        this.f28373k = rVar;
    }

    public static final String b() {
        if (yx.a.f46339a.contains(k.class)) {
            return null;
        }
        return "lx.k";
    }

    @Override // lx.g
    public final void a(t tVar, Runnable runnable) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            tVar.getClass();
            c(new a40.q(this, tVar, runnable, 22));
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    public final void c(Runnable runnable) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            if (f28359n.get()) {
                runnable.run();
            } else {
                e(runnable);
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    public final Object d() {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            return this.f28363a;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }

    public final void e(Runnable runnable) {
        Method methodG;
        Class cls = this.f28364b;
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            Class clsE = u.E("com.android.billingclient.api.BillingClientStateListener");
            if (clsE == null || (methodG = u.G(cls, "startConnection", clsE)) == null) {
                return;
            }
            u.I(cls, d(), methodG, Proxy.newProxyInstance(clsE.getClassLoader(), new Class[]{clsE}, new h(runnable)));
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }
}
