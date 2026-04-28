package y00;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t4 f44847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m3 f44848c;

    public /* synthetic */ h3(m3 m3Var, t4 t4Var, int i11) {
        this.f44846a = i11;
        this.f44847b = t4Var;
        this.f44848c = m3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44846a) {
            case 0:
                m3 m3Var = this.f44848c;
                j0 j0Var = m3Var.f44962e;
                n1 n1Var = (n1) m3Var.f21216b;
                if (j0Var != null) {
                    try {
                        j0Var.p(this.f44847b);
                    } catch (RemoteException e5) {
                        w0 w0Var = n1Var.f44987f;
                        n1.m(w0Var);
                        w0Var.f45260g.b(e5, "Failed to reset data on the service: remote exception");
                    }
                    m3Var.C();
                } else {
                    w0 w0Var2 = n1Var.f44987f;
                    n1.m(w0Var2);
                    w0Var2.f45260g.a("Failed to reset data on the service: not connected to service");
                }
                break;
            case 1:
                m3 m3Var2 = this.f44848c;
                j0 j0Var2 = m3Var2.f44962e;
                n1 n1Var2 = (n1) m3Var2.f21216b;
                if (j0Var2 == null) {
                    w0 w0Var3 = n1Var2.f44987f;
                    n1.m(w0Var3);
                    w0Var3.f45263j.a("Failed to send app backgrounded");
                } else {
                    try {
                        j0Var2.q(this.f44847b);
                        m3Var2.C();
                    } catch (RemoteException e11) {
                        w0 w0Var4 = n1Var2.f44987f;
                        n1.m(w0Var4);
                        w0Var4.f45260g.b(e11, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
                break;
            default:
                m3 m3Var3 = this.f44848c;
                j0 j0Var3 = m3Var3.f44962e;
                n1 n1Var3 = (n1) m3Var3.f21216b;
                if (j0Var3 == null) {
                    w0 w0Var5 = n1Var3.f44987f;
                    n1.m(w0Var5);
                    w0Var5.f45260g.a("Failed to send measurementEnabled to service");
                } else {
                    try {
                        j0Var3.f(this.f44847b);
                        m3Var3.C();
                    } catch (RemoteException e12) {
                        w0 w0Var6 = n1Var3.f44987f;
                        n1.m(w0Var6);
                        w0Var6.f45260g.b(e12, "Failed to send measurementEnabled to the service");
                    }
                }
                break;
        }
    }
}
