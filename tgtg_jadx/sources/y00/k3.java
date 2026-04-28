package y00;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m3 f44900b;

    public /* synthetic */ k3(m3 m3Var, int i11) {
        this.f44899a = i11;
        this.f44900b = m3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44899a) {
            case 0:
                this.f44900b.v();
                break;
            case 1:
                m3 m3Var = this.f44900b;
                n1 n1Var = (n1) m3Var.f21216b;
                j0 j0Var = m3Var.f44962e;
                if (j0Var == null) {
                    w0 w0Var = n1Var.f44987f;
                    n1.m(w0Var);
                    w0Var.f45260g.a("Failed to send Dma consent settings to service");
                } else {
                    try {
                        j0Var.e(m3Var.F(false));
                        m3Var.C();
                    } catch (RemoteException e5) {
                        w0 w0Var2 = n1Var.f44987f;
                        n1.m(w0Var2);
                        w0Var2.f45260g.b(e5, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
                break;
            default:
                m3 m3Var2 = this.f44900b;
                n1 n1Var2 = (n1) m3Var2.f21216b;
                j0 j0Var2 = m3Var2.f44962e;
                if (j0Var2 == null) {
                    w0 w0Var3 = n1Var2.f44987f;
                    n1.m(w0Var3);
                    w0Var3.f45260g.a("Failed to send storage consent settings to service");
                } else {
                    try {
                        j0Var2.i(m3Var2.F(false));
                        m3Var2.C();
                    } catch (RemoteException e11) {
                        w0 w0Var4 = n1Var2.f44987f;
                        n1.m(w0Var4);
                        w0Var4.f45260g.b(e11, "Failed to send storage consent settings to the service");
                    }
                }
                break;
        }
    }
}
