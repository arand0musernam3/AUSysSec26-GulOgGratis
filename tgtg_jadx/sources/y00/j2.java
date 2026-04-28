package y00;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f44876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t2 f44877c;

    public j2(t2 t2Var, long j9, int i11) {
        this.f44875a = i11;
        switch (i11) {
            case 1:
                this.f44876b = j9;
                this.f44877c = t2Var;
                break;
            default:
                this.f44876b = j9;
                Objects.requireNonNull(t2Var);
                this.f44877c = t2Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44875a) {
            case 0:
                n1 n1Var = (n1) this.f44877c.f21216b;
                e1 e1Var = n1Var.f44986e;
                n1.k(e1Var);
                d1 d1Var = e1Var.l;
                long j9 = this.f44876b;
                d1Var.b(j9);
                w0 w0Var = n1Var.f44987f;
                n1.m(w0Var);
                w0Var.f45266n.b(Long.valueOf(j9), "Session timeout duration set");
                break;
            default:
                t2 t2Var = this.f44877c;
                t2Var.p();
                t2Var.q();
                n1 n1Var2 = (n1) t2Var.f21216b;
                w0 w0Var2 = n1Var2.f44987f;
                n1.m(w0Var2);
                w0Var2.f45266n.a("Resetting analytics data (FE)");
                u3 u3Var = n1Var2.f44989h;
                n1.l(u3Var);
                u3Var.p();
                od.f fVar = u3Var.f45213g;
                ((t3) fVar.f32442c).c();
                ((n1) ((u3) fVar.f32443d).f21216b).f44992k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                fVar.f32440a = jElapsedRealtime;
                fVar.f32441b = jElapsedRealtime;
                n1Var2.r().u();
                boolean z11 = !n1Var2.e();
                e1 e1Var2 = n1Var2.f44986e;
                n1.k(e1Var2);
                e1Var2.f44711g.b(this.f44876b);
                n1 n1Var3 = (n1) e1Var2.f21216b;
                e1 e1Var3 = n1Var3.f44986e;
                n1.k(e1Var3);
                if (!TextUtils.isEmpty(e1Var3.f44726w.i())) {
                    e1Var2.f44726w.j(null);
                }
                e1Var2.f44720q.b(0L);
                e1Var2.f44721r.b(0L);
                if (!n1Var3.f44985d.D()) {
                    e1Var2.x(z11);
                }
                e1Var2.f44727x.j(null);
                e1Var2.f44728y.b(0L);
                e1Var2.f44729z.d0(null);
                m3 m3VarP = n1Var2.p();
                m3VarP.p();
                m3VarP.q();
                t4 t4VarF = m3VarP.F(false);
                m3VarP.B();
                ((n1) m3VarP.f21216b).o().t();
                m3VarP.D(new h3(m3VarP, t4VarF, 0));
                n1.l(u3Var);
                u3Var.f45212f.r();
                t2Var.f45163s = z11;
                n1Var2.p().t(new AtomicReference());
                break;
        }
    }
}
