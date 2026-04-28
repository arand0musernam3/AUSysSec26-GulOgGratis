package i0;

import android.hardware.camera2.CaptureResult;
import e0.h1;
import e0.k1;
import e0.l0;
import e0.l1;
import e0.n1;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements h1, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f22752a = new CopyOnWriteArrayList();

    @Override // e0.h1
    public final void G(k1 k1Var, long j9, f0.n nVar) {
        d(k1Var.g0(), nVar.f16779b);
    }

    @Override // i0.q
    public final void a() {
        Iterator it = this.f22752a.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((a0) it.next()).c();
        }
    }

    @Override // i0.q
    public final void b() {
        Iterator it = this.f22752a.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((a0) it.next()).c();
        }
    }

    @Override // i0.q
    public final void c() {
        Iterator it = this.f22752a.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((a0) it.next()).c();
        }
    }

    public final void d(long j9, f0.o oVar) {
        Integer num;
        Iterator it = this.f22752a.iterator();
        it.getClass();
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            a0Var.getClass();
            oVar.getClass();
            if (!a0Var.f22574d.a0() && !a0Var.f22574d.isCancelled()) {
                synchronized (a0Var) {
                    l1 l1Var = a0Var.f22577g;
                    if (l1Var != null && j9 >= l1Var.f15365a) {
                        CaptureResult.Key key = CaptureResult.SENSOR_TIMESTAMP;
                        key.getClass();
                        Long l = (Long) oVar.c(key);
                        long frameNumber = oVar.f16792a.getFrameNumber();
                        if (l != null && a0Var.f22576f == null) {
                            a0Var.f22576f = l;
                        }
                        Long l7 = a0Var.f22576f;
                        if (a0Var.f22573c == null || l7 == null || l == null || l.longValue() - l7.longValue() <= a0Var.f22573c.longValue()) {
                            if (a0Var.f22575e == null) {
                                a0Var.f22575e = new l0(frameNumber);
                            }
                            l0 l0Var = a0Var.f22575e;
                            if (l0Var != null && (num = a0Var.f22572b) != null && frameNumber - l0Var.f15364a > num.intValue()) {
                                a0Var.f22574d.R(new n1(1, oVar));
                            } else if (((Boolean) a0Var.f22571a.invoke(oVar)).booleanValue()) {
                                a0Var.f22574d.R(new n1(0, oVar));
                            }
                        } else {
                            a0Var.f22574d.R(new n1(2, oVar));
                        }
                    }
                }
            }
            this.f22752a.remove(a0Var);
        }
    }

    @Override // e0.h1
    public final void e(k1 k1Var) {
        k1Var.getClass();
        Iterator it = this.f22752a.iterator();
        it.getClass();
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            long jG0 = k1Var.g0();
            synchronized (a0Var) {
                if (a0Var.f22577g == null) {
                    a0Var.f22577g = new l1(jG0);
                }
            }
        }
    }

    @Override // e0.h1
    public final void u(k1 k1Var, long j9, f0.o oVar) {
        k1Var.getClass();
        d(k1Var.g0(), oVar);
    }
}
