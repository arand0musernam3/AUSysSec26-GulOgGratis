package p30;

import java.util.concurrent.Executor;
import u30.o;
import v80.f0;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements u30.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f34232b = new h(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f34233c = new h(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f34234d = new h(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f34235e = new h(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34236a;

    public /* synthetic */ h(int i11) {
        this.f34236a = i11;
    }

    @Override // u30.e
    public final Object i(q2 q2Var) {
        switch (this.f34236a) {
            case 0:
                Object objE = q2Var.e(new o(t30.a.class, Executor.class));
                objE.getClass();
                return f0.q((Executor) objE);
            case 1:
                Object objE2 = q2Var.e(new o(t30.c.class, Executor.class));
                objE2.getClass();
                return f0.q((Executor) objE2);
            case 2:
                Object objE3 = q2Var.e(new o(t30.b.class, Executor.class));
                objE3.getClass();
                return f0.q((Executor) objE3);
            default:
                Object objE4 = q2Var.e(new o(t30.d.class, Executor.class));
                objE4.getClass();
                return f0.q((Executor) objE4);
        }
    }
}
