package z7;

import y00.f2;
import y00.g2;
import y00.n1;
import y00.r4;
import y00.t2;
import y00.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f47322b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f47321a = i11;
        this.f47322b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f47321a) {
            case 0:
                ((e) this.f47322b).p(0);
                break;
            default:
                n1 n1Var = (n1) this.f47322b;
                r4 r4Var = n1Var.f44990i;
                t2 t2Var = n1Var.f44993m;
                n1.k(r4Var);
                r4Var.p();
                if (r4Var.N() != 1) {
                    w0 w0Var = n1Var.f44987f;
                    n1.m(w0Var);
                    w0Var.f45263j.a("registerTrigger called but app not eligible");
                } else {
                    n1.l(t2Var);
                    t2Var.p();
                    g2 g2Var = t2Var.f45157m;
                    if (g2Var != null) {
                        g2Var.c();
                    }
                    n1.l(t2Var);
                    new Thread(new f2(t2Var, 3)).start();
                }
                break;
        }
    }
}
