package oa0;

import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f32269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f32270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f32271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f32272g;

    public /* synthetic */ a0(Method method, int i11, boolean z11, int i12) {
        this.f32269d = i12;
        this.f32270e = method;
        this.f32271f = i11;
        this.f32272g = z11;
    }

    @Override // oa0.u0
    public final void a(k0 k0Var, Object obj) {
        switch (this.f32269d) {
            case 0:
                Map map = (Map) obj;
                int i11 = this.f32271f;
                Method method = this.f32270e;
                if (map == null) {
                    throw u0.n(method, i11, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw u0.n(method, i11, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw u0.n(method, i11, w.a0.p("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String string = value.toString();
                    if (string == null) {
                        throw u0.n(method, i11, "Field map value '" + value + "' converted to null by " + a.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    k0Var.a(str, string, this.f32272g);
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                int i12 = this.f32271f;
                Method method2 = this.f32270e;
                if (map2 == null) {
                    throw u0.n(method2, i12, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw u0.n(method2, i12, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw u0.n(method2, i12, w.a0.p("Header map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    k0Var.b(str2, value2.toString(), this.f32272g);
                }
                return;
            default:
                Map map3 = (Map) obj;
                int i13 = this.f32271f;
                Method method3 = this.f32270e;
                if (map3 == null) {
                    throw u0.n(method3, i13, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str3 = (String) entry3.getKey();
                    if (str3 == null) {
                        throw u0.n(method3, i13, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw u0.n(method3, i13, w.a0.p("Query map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    String string2 = value3.toString();
                    if (string2 == null) {
                        throw u0.n(method3, i13, "Query map value '" + value3 + "' converted to null by " + a.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                    }
                    k0Var.d(str3, string2, this.f32272g);
                }
                return;
        }
    }
}
