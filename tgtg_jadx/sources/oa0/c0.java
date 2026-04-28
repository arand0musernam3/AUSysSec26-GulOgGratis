package oa0;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f32277d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f32278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f32279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f32280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f32281h;

    public c0(Method method, int i11, k kVar, String str) {
        this.f32278e = method;
        this.f32279f = i11;
        this.f32280g = kVar;
        this.f32281h = str;
    }

    @Override // oa0.u0
    public final void a(k0 k0Var, Object obj) {
        int i11 = this.f32277d;
        k kVar = this.f32280g;
        Object obj2 = this.f32281h;
        Method method = this.f32278e;
        int i12 = this.f32279f;
        switch (i11) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    k0Var.c((q90.t) obj2, (q90.n0) kVar.f(obj));
                    return;
                } catch (IOException e5) {
                    throw u0.n(method, i12, org.bouncycastle.jcajce.provider.asymmetric.a.c(obj, "Unable to convert ", " to RequestBody"), e5);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw u0.n(method, i12, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw u0.n(method, i12, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw u0.n(method, i12, w.a0.p("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String[] strArr = {"Content-Disposition", w.a0.p("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2};
                    q90.t tVar = q90.t.f36613b;
                    k0Var.c(u00.d.L(strArr), (q90.n0) kVar.f(value));
                }
                return;
        }
    }

    public c0(Method method, int i11, q90.t tVar, k kVar) {
        this.f32278e = method;
        this.f32279f = i11;
        this.f32281h = tVar;
        this.f32280g = kVar;
    }
}
