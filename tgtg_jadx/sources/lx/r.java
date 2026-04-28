package lx;

import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o f28415g = new o();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static r f28416h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f28417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f28418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f28419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f28420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f28421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Method f28422f;

    public r(Class cls, Class cls2, Method method, Method method2, Method method3, Method method4) {
        this.f28417a = cls;
        this.f28418b = cls2;
        this.f28419c = method;
        this.f28420d = method2;
        this.f28421e = method3;
        this.f28422f = method4;
    }

    public final Object a(t tVar, ArrayList arrayList) {
        Object objI;
        Object objI2;
        Class cls = this.f28418b;
        if (!yx.a.f46339a.contains(this)) {
            try {
                tVar.getClass();
                Object objI3 = u.I(this.f28417a, null, this.f28419c, new Object[0]);
                if (objI3 != null && (objI = u.I(cls, objI3, this.f28420d, tVar.a())) != null && (objI2 = u.I(cls, objI, this.f28421e, arrayList)) != null) {
                    return u.I(cls, objI2, this.f28422f, new Object[0]);
                }
            } catch (Throwable th2) {
                yx.a.a(this, th2);
                return null;
            }
        }
        return null;
    }
}
