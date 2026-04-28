package y00;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t4 f44860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m3 f44861c;

    public i3(m3 m3Var, t4 t4Var, int i11) {
        this.f44859a = i11;
        switch (i11) {
            case 1:
                this.f44860b = t4Var;
                Objects.requireNonNull(m3Var);
                this.f44861c = m3Var;
                break;
            default:
                this.f44860b = t4Var;
                this.f44861c = m3Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f44859a) {
            case 0:
                m3 m3Var = this.f44861c;
                j0 j0Var = m3Var.f44962e;
                n1 n1Var = (n1) m3Var.f21216b;
                if (j0Var == null) {
                    w0 w0Var = n1Var.f44987f;
                    n1.m(w0Var);
                    w0Var.f45260g.a("Discarding data. Failed to send app launch");
                } else {
                    try {
                        t4 t4Var = this.f44860b;
                        g gVar = n1Var.f44985d;
                        f0 f0Var = g0.W0;
                        if (gVar.A(null, f0Var)) {
                            m3Var.H(j0Var, null, t4Var);
                        }
                        j0Var.F(t4Var);
                        n1Var.o().u();
                        n1Var.f44985d.A(null, f0Var);
                        m3Var.H(j0Var, null, t4Var);
                        m3Var.C();
                    } catch (RemoteException e5) {
                        w0 w0Var2 = n1Var.f44987f;
                        n1.m(w0Var2);
                        w0Var2.f45260g.b(e5, "Failed to send app launch to the service");
                        return;
                    }
                }
                break;
            default:
                m3 m3Var2 = this.f44861c;
                j0 j0Var2 = m3Var2.f44962e;
                n1 n1Var2 = (n1) m3Var2.f21216b;
                if (j0Var2 == null) {
                    w0 w0Var3 = n1Var2.f44987f;
                    n1.m(w0Var3);
                    w0Var3.f45260g.a("Failed to send consent settings to service");
                } else {
                    try {
                        j0Var2.x(this.f44860b);
                        m3Var2.C();
                    } catch (RemoteException e11) {
                        w0 w0Var4 = n1Var2.f44987f;
                        n1.m(w0Var4);
                        w0Var4.f45260g.b(e11, "Failed to send consent settings to the service");
                    }
                }
                break;
        }
    }
}
