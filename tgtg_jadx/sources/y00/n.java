package y00;

import android.os.Handler;
import com.google.android.gms.internal.measurement.w5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile w5 f44978d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1 f44979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0.f f44980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f44981c;

    public n(x1 x1Var) {
        com.google.android.gms.common.internal.i0.h(x1Var);
        this.f44979a = x1Var;
        this.f44980b = new x0.f(this, x1Var, false, 19);
    }

    public abstract void a();

    public final void b(long j9) {
        c();
        if (j9 >= 0) {
            x1 x1Var = this.f44979a;
            x1Var.c().getClass();
            this.f44981c = System.currentTimeMillis();
            if (d().postDelayed(this.f44980b, j9)) {
                return;
            }
            x1Var.b().f45260g.b(Long.valueOf(j9), "Failed to schedule delayed post. time");
        }
    }

    public final void c() {
        this.f44981c = 0L;
        d().removeCallbacks(this.f44980b);
    }

    public final Handler d() {
        w5 w5Var;
        if (f44978d != null) {
            return f44978d;
        }
        synchronized (n.class) {
            try {
                if (f44978d == null) {
                    f44978d = new w5(this.f44979a.f().getMainLooper(), 0);
                }
                w5Var = f44978d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return w5Var;
    }
}
