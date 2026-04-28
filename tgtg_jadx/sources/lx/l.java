package lx;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements g {
    public static l I;
    public final Method A;
    public final Method B;
    public final Method C;
    public final Method D;
    public final Method E;
    public final Method F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f28375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f28376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class f28377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class f28378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class f28379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class f28380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Class f28381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Class f28382i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Class f28383j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Class f28384k;
    public final Class l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Class f28385m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Class f28386n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Class f28387o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Method f28388p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Method f28389q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Method f28390r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Method f28391s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Method f28392t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Method f28393u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Method f28394v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Method f28395w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Method f28396x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Method f28397y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Method f28398z;
    public static final j G = new j(1);
    public static final AtomicBoolean H = new AtomicBoolean(false);
    public static final ConcurrentHashMap J = new ConcurrentHashMap();
    public static final ConcurrentHashMap K = new ConcurrentHashMap();
    public static final ConcurrentHashMap L = new ConcurrentHashMap();

    public l(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Class cls8, Class cls9, Class cls10, Class cls11, Class cls12, Class cls13, Class cls14, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Method method9, Method method10, Method method11, Method method12, Method method13, Method method14, Method method15, Method method16, Method method17) {
        this.f28374a = obj;
        this.f28375b = cls;
        this.f28376c = cls2;
        this.f28377d = cls3;
        this.f28378e = cls4;
        this.f28379f = cls5;
        this.f28380g = cls6;
        this.f28381h = cls7;
        this.f28382i = cls8;
        this.f28383j = cls9;
        this.f28384k = cls10;
        this.l = cls11;
        this.f28385m = cls12;
        this.f28386n = cls13;
        this.f28387o = cls14;
        this.f28388p = method;
        this.f28389q = method2;
        this.f28390r = method3;
        this.f28391s = method4;
        this.f28392t = method5;
        this.f28393u = method6;
        this.f28394v = method7;
        this.f28395w = method8;
        this.f28396x = method9;
        this.f28397y = method10;
        this.f28398z = method11;
        this.A = method12;
        this.B = method13;
        this.C = method14;
        this.D = method15;
        this.E = method16;
        this.F = method17;
    }

    public static final String b() {
        if (yx.a.f46339a.contains(l.class)) {
            return null;
        }
        return "lx.l";
    }

    @Override // lx.g
    public final void a(t tVar, Runnable runnable) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            tVar.getClass();
            c(new a40.q(this, tVar, runnable, 23));
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    public final void c(Runnable runnable) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            if (H.get()) {
                runnable.run();
            } else {
                l(runnable);
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
            return this.f28374a;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }

    public final String e(String str) {
        if (!yx.a.f46339a.contains(this)) {
            try {
                kotlin.text.l lVarB = Regex.b(new Regex("jsonString='(.*?)'"), str);
                if (lVarB != null) {
                    return (String) CollectionsKt.Q(1, lVarB.a());
                }
            } catch (Throwable th2) {
                yx.a.a(this, th2);
                return null;
            }
        }
        return null;
    }

    public final Object f(t tVar, ArrayList arrayList) {
        Class cls = this.f28383j;
        Class cls2 = this.l;
        if (!yx.a.f46339a.contains(this)) {
            try {
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object objI = u.I(cls2, u.I(cls2, u.I(cls2, u.I(this.f28379f, null, this.f28398z, new Object[0]), this.B, (String) it.next()), this.C, tVar.a()), this.A, new Object[0]);
                        if (objI != null) {
                            arrayList2.add(objI);
                        }
                    }
                    return u.I(cls, u.I(cls, u.I(this.f28381h, null, this.f28395w, new Object[0]), this.f28397y, arrayList2), this.f28396x, new Object[0]);
                }
            } catch (Throwable th2) {
                yx.a.a(this, th2);
                return null;
            }
        }
        return null;
    }

    public final Object g(t tVar) {
        Class cls = this.f28384k;
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            return u.I(cls, u.I(cls, u.I(this.f28382i, null, this.f28390r, new Object[0]), this.f28392t, tVar.a()), this.f28391s, new Object[0]);
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }

    public final void h(Object[] objArr, Object[] objArr2) {
        if (yx.a.f46339a.contains(this) || objArr2 == null) {
            return;
        }
        try {
            if (objArr2.length == 0) {
                return;
            }
            if (Intrinsics.areEqual(u.I(this.f28380g, objArr2[0], this.F, new Object[0]), (Object) 0)) {
                H.set(true);
                if (objArr.length == 0) {
                    return;
                }
                Object obj = objArr[0];
                if (obj instanceof Runnable) {
                    ((Runnable) obj).run();
                }
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    public final void i(Object[] objArr, Object[] objArr2) {
        String strE;
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            Object objD = y.D(0, objArr);
            Object objD2 = objArr2 != null ? y.D(1, objArr2) : null;
            if (objD2 != null && (objD2 instanceof List)) {
                Iterator it = ((List) objD2).iterator();
                while (it.hasNext()) {
                    try {
                        Object objI = u.I(this.f28377d, it.next(), this.D, new Object[0]);
                        String str = objI instanceof String ? (String) objI : null;
                        if (str != null && (strE = e(str)) != null) {
                            JSONObject jSONObject = new JSONObject(strE);
                            if (jSONObject.has("productId")) {
                                String string = jSONObject.getString("productId");
                                ConcurrentHashMap concurrentHashMap = L;
                                string.getClass();
                                concurrentHashMap.put(string, jSONObject);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                if (objD == null || !(objD instanceof Runnable)) {
                    return;
                }
                ((Runnable) objD).run();
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    public final void j(Object[] objArr, Object[] objArr2) {
        Throwable th2;
        Object objD;
        if (!yx.a.f46339a.contains(this)) {
            try {
                Object objD2 = y.D(0, objArr);
                if (objD2 != null && (objD2 instanceof t)) {
                    Object objD3 = y.D(1, objArr);
                    if (objD3 instanceof Runnable) {
                        if (objArr2 != null) {
                            try {
                                objD = y.D(1, objArr2);
                            } catch (Throwable th3) {
                                th2 = th3;
                                yx.a.a(this, th2);
                            }
                        } else {
                            objD = null;
                        }
                        if (objD != null && (objD instanceof List)) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = ((List) objD).iterator();
                            while (it.hasNext()) {
                                try {
                                    Object objI = u.I(this.f28378e, it.next(), this.f28393u, new Object[0]);
                                    String str = objI instanceof String ? (String) objI : null;
                                    if (str != null) {
                                        JSONObject jSONObject = new JSONObject(str);
                                        if (jSONObject.has("productId")) {
                                            String string = jSONObject.getString("productId");
                                            if (!L.containsKey(string)) {
                                                string.getClass();
                                                arrayList.add(string);
                                            }
                                            if (objD2 == t.INAPP) {
                                                ConcurrentHashMap concurrentHashMap = J;
                                                string.getClass();
                                                concurrentHashMap.put(string, jSONObject);
                                            } else {
                                                ConcurrentHashMap concurrentHashMap2 = K;
                                                string.getClass();
                                                concurrentHashMap2.put(string, jSONObject);
                                            }
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            try {
                                if (arrayList.isEmpty()) {
                                    ((Runnable) objD3).run();
                                } else {
                                    t tVar = (t) objD2;
                                    Runnable runnable = (Runnable) objD3;
                                    if (!yx.a.f46339a.contains(this)) {
                                        try {
                                            try {
                                                c(new b0.g(7, this, runnable, tVar, arrayList));
                                            } catch (Throwable th4) {
                                                th = th4;
                                                yx.a.a(this, th);
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                        }
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                th2 = th;
                                yx.a.a(this, th2);
                            }
                        }
                    }
                }
            } catch (Throwable th7) {
                th = th7;
            }
        }
    }

    public final void k(Object[] objArr, Object[] objArr2) {
        Throwable th2;
        Object objD;
        Object objD2;
        if (!yx.a.f46339a.contains(this)) {
            try {
                objD = y.D(0, objArr);
            } catch (Throwable th3) {
                th = th3;
            }
            if (objD != null && (objD instanceof t)) {
                Object objD3 = y.D(1, objArr);
                if (objD3 instanceof Runnable) {
                    if (objArr2 != null) {
                        try {
                            objD2 = y.D(1, objArr2);
                        } catch (Throwable th4) {
                            th2 = th4;
                        }
                    } else {
                        objD2 = null;
                    }
                    if (objD2 != null && (objD2 instanceof List)) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((List) objD2).iterator();
                        while (it.hasNext()) {
                            Object objI = u.I(this.f28376c, it.next(), this.f28388p, new Object[0]);
                            String str = objI instanceof String ? (String) objI : null;
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.has("productId")) {
                                    String string = jSONObject.getString("productId");
                                    if (!L.containsKey(string)) {
                                        string.getClass();
                                        arrayList.add(string);
                                    }
                                    if (objD == t.INAPP) {
                                        ConcurrentHashMap concurrentHashMap = J;
                                        string.getClass();
                                        concurrentHashMap.put(string, jSONObject);
                                    } else {
                                        ConcurrentHashMap concurrentHashMap2 = K;
                                        string.getClass();
                                        concurrentHashMap2.put(string, jSONObject);
                                    }
                                }
                            }
                        }
                        try {
                            if (arrayList.isEmpty()) {
                                ((Runnable) objD3).run();
                                return;
                            }
                            t tVar = (t) objD;
                            Runnable runnable = (Runnable) objD3;
                            if (!yx.a.f46339a.contains(this)) {
                                try {
                                    try {
                                        c(new b0.g(7, this, runnable, tVar, arrayList));
                                        return;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        yx.a.a(this, th);
                                        return;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                            }
                        } catch (Throwable th7) {
                            th = th7;
                        }
                        th2 = th;
                        yx.a.a(this, th2);
                    }
                }
            }
        }
    }

    public final void l(Runnable runnable) {
        Class cls = this.f28385m;
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new ab.d(this, new Object[]{runnable}, 2));
            u.I(this.f28375b, d(), this.E, objNewProxyInstance);
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }
}
