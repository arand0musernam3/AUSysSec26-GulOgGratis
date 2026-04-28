package oa0;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f32262b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f32263c = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f32264d = new a(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f32265e = new a(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f32266f = new a(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f32267g = new a(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32268a;

    public /* synthetic */ a(int i11) {
        this.f32268a = i11;
    }

    public List a(Executor executor) {
        return Collections.singletonList(new m(executor));
    }

    public List b() {
        return Collections.EMPTY_LIST;
    }

    public String c(Method method, int i11) {
        return "parameter #" + (i11 + 1);
    }

    public Object d(Class cls, Object obj, Method method, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean e(Method method) {
        return false;
    }

    /* JADX WARN: Finally extract failed */
    @Override // oa0.k
    public Object f(Object obj) {
        switch (this.f32268a) {
            case 0:
                return obj.toString();
            case 1:
                q90.r0 r0Var = (q90.r0) obj;
                try {
                    ia0.g gVar = new ia0.g();
                    r0Var.p0().j0(gVar);
                    q90.z zVarG = r0Var.g();
                    long jE = r0Var.e();
                    q90.q0 q0Var = q90.r0.f36605a;
                    q90.q0 q0Var2 = new q90.q0(zVarG, jE, gVar);
                    r0Var.close();
                    return q0Var2;
                } catch (Throwable th2) {
                    r0Var.close();
                    throw th2;
                }
            case 2:
                return (q90.n0) obj;
            case 3:
                return (q90.r0) obj;
            case 4:
                ((q90.r0) obj).close();
                return Unit.f26487a;
            default:
                ((q90.r0) obj).close();
                return null;
        }
    }
}
