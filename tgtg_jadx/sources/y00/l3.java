package y00;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l3 implements ServiceConnection, com.google.android.gms.common.internal.b, com.google.android.gms.common.internal.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f44917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile s0 f44918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m3 f44919c;

    public l3(m3 m3Var) {
        this.f44919c = m3Var;
    }

    @Override // com.google.android.gms.common.internal.c
    public final void a(pz.b bVar) {
        m3 m3Var = this.f44919c;
        l1 l1Var = ((n1) m3Var.f21216b).f44988g;
        n1.m(l1Var);
        l1Var.u();
        w0 w0Var = ((n1) m3Var.f21216b).f44987f;
        if (w0Var == null || !w0Var.f45268c) {
            w0Var = null;
        }
        if (w0Var != null) {
            w0Var.f45267o.b(bVar, "Service connection failed");
        }
        synchronized (this) {
            this.f44917a = false;
            this.f44918b = null;
        }
        l1 l1Var2 = ((n1) this.f44919c.f21216b).f44988g;
        n1.m(l1Var2);
        l1Var2.y(new o30.m0(this, bVar, false, 26));
    }

    @Override // com.google.android.gms.common.internal.b
    public final void b(int i11) {
        n1 n1Var = (n1) this.f44919c.f21216b;
        l1 l1Var = n1Var.f44988g;
        n1.m(l1Var);
        l1Var.u();
        w0 w0Var = n1Var.f44987f;
        n1.m(w0Var);
        w0Var.f45266n.a("Service connection suspended");
        l1 l1Var2 = n1Var.f44988g;
        n1.m(l1Var2);
        l1Var2.y(new a8.f(this, 24));
    }

    @Override // com.google.android.gms.common.internal.b
    public final void d(Bundle bundle) {
        l1 l1Var = ((n1) this.f44919c.f21216b).f44988g;
        n1.m(l1Var);
        l1Var.u();
        synchronized (this) {
            try {
                com.google.android.gms.common.internal.i0.h(this.f44918b);
                j0 j0Var = (j0) this.f44918b.getService();
                l1 l1Var2 = ((n1) this.f44919c.f21216b).f44988g;
                n1.m(l1Var2);
                l1Var2.y(new x0.f(this, j0Var, false, 26));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f44918b = null;
                this.f44917a = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        l1 l1Var = ((n1) this.f44919c.f21216b).f44988g;
        n1.m(l1Var);
        l1Var.u();
        synchronized (this) {
            if (iBinder == null) {
                this.f44917a = false;
                w0 w0Var = ((n1) this.f44919c.f21216b).f44987f;
                n1.m(w0Var);
                w0Var.f45260g.a("Service connected with null binder");
                return;
            }
            Object h0Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    h0Var = iInterfaceQueryLocalInterface instanceof j0 ? (j0) iInterfaceQueryLocalInterface : new h0(iBinder);
                    w0 w0Var2 = ((n1) this.f44919c.f21216b).f44987f;
                    n1.m(w0Var2);
                    w0Var2.f45267o.a("Bound to IMeasurementService interface");
                } else {
                    w0 w0Var3 = ((n1) this.f44919c.f21216b).f44987f;
                    n1.m(w0Var3);
                    w0Var3.f45260g.b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                w0 w0Var4 = ((n1) this.f44919c.f21216b).f44987f;
                n1.m(w0Var4);
                w0Var4.f45260g.a("Service connect failed to get IMeasurementService");
            }
            if (h0Var == null) {
                this.f44917a = false;
                try {
                    uz.a aVarB = uz.a.b();
                    m3 m3Var = this.f44919c;
                    aVarB.c(((n1) m3Var.f21216b).f44982a, m3Var.f44961d);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                l1 l1Var2 = ((n1) this.f44919c.f21216b).f44988g;
                n1.m(l1Var2);
                l1Var2.y(new o30.m0(this, h0Var, false, 24));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        n1 n1Var = (n1) this.f44919c.f21216b;
        l1 l1Var = n1Var.f44988g;
        n1.m(l1Var);
        l1Var.u();
        w0 w0Var = n1Var.f44987f;
        n1.m(w0Var);
        w0Var.f45266n.a("Service disconnected");
        l1 l1Var2 = n1Var.f44988g;
        n1.m(l1Var2);
        l1Var2.y(new x0.f(this, componentName, false, 25));
    }
}
