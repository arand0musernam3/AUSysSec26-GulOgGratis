package j4;

import android.window.OnBackInvokedDispatcher;
import com.google.firebase.datatransport.TransportRegistrar;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import m0.h0;
import m0.j0;
import yi.v;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements j, v, u30.e, s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24535a;

    public /* synthetic */ d(int i11) {
        this.f24535a = i11;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher c(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* synthetic */ void d(int i11, int i12, Object obj) {
        StringBuilder sb2 = new StringBuilder(i11);
        sb2.append(obj);
        sb2.append(i12);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public static /* synthetic */ void e(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void f(String str) {
        throw new ArithmeticException(str);
    }

    public static /* synthetic */ void g(String str, float f11, Object obj, float f12, Object obj2) {
        throw new IllegalArgumentException(str + f11 + obj + f12 + obj2);
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3) {
        throw new KotlinReflectionInternalError(str + obj + obj2 + obj3 + ')');
    }

    public static /* synthetic */ void k(StringBuilder sb2, Object obj) {
        sb2.append(", ");
        sb2.append(obj);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static /* synthetic */ void l(Object obj, String str) {
        throw new UnsupportedOperationException(str + obj);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void n(StringBuilder sb2, Object obj) {
        sb2.append(obj);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static /* synthetic */ void o(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void p(StringBuilder sb2, Object obj) {
        sb2.append(obj);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static /* synthetic */ void q(Object obj, String str) {
        throw new KotlinReflectionInternalError(str + obj);
    }

    public static /* synthetic */ void r(Object obj, String str) {
        throw new KotlinReflectionInternalError(str + obj);
    }

    public static /* synthetic */ void s(Object obj, String str) {
        throw new AssertionError(str + obj);
    }

    public static /* synthetic */ void t(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    @Override // j4.j
    public double a(double d3) {
        switch (this.f24535a) {
            case 0:
                double d11 = d3 < 0.0d ? -d3 : d3;
                return Math.copySign(d11 >= 0.04045d ? Math.pow((0.9478672985781991d * d11) + 0.05213270142180095d, 2.4d) : d11 * 0.07739938080495357d, d3);
            case 1:
                float[] fArr = e.f24536a;
                return e.b(e.f24538c, d3);
            case 2:
                float[] fArr2 = e.f24536a;
                return e.a(e.f24538c, d3);
            case 3:
                float[] fArr3 = e.f24536a;
                return e.d(e.f24539d, d3);
            case 4:
                float[] fArr4 = e.f24536a;
                return e.c(e.f24539d, d3);
            default:
                return d3;
        }
    }

    @Override // s.a
    /* JADX INFO: renamed from: apply */
    public Object mo962apply(Object obj) {
        h0 h0Var = j0.C;
        return null;
    }

    @Override // u30.e
    public Object i(q2 q2Var) {
        switch (this.f24535a) {
            case 24:
                return TransportRegistrar.lambda$getComponents$0(q2Var);
            case 25:
                return TransportRegistrar.lambda$getComponents$1(q2Var);
            default:
                return TransportRegistrar.lambda$getComponents$2(q2Var);
        }
    }

    @Override // yi.v
    public void b() {
    }
}
