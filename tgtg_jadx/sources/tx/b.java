package tx;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.braze.h2;
import com.google.android.gms.internal.measurement.p5;
import com.google.android.gms.internal.measurement.q5;
import com.google.android.gms.internal.measurement.r5;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import y00.f1;
import y00.l1;
import y00.n1;
import y00.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializable f40489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f40490c;

    public b() {
        this.f40488a = 0;
        this.f40489b = new AtomicBoolean(false);
        this.f40490c = new LinkedBlockingDeque();
    }

    public IBinder a() throws InterruptedException {
        if (!((AtomicBoolean) this.f40489b).compareAndSet(false, true)) {
            h2.b("Binder already consumed");
            return null;
        }
        Object objTake = ((LinkedBlockingDeque) this.f40490c).take();
        objTake.getClass();
        return (IBinder) objTake;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        switch (this.f40488a) {
            case 0:
                if (iBinder != null) {
                    try {
                        ((LinkedBlockingDeque) this.f40490c).put(iBinder);
                    } catch (InterruptedException unused) {
                        ax.a0 a0Var = ax.a0.f4849a;
                        return;
                    }
                }
                break;
            default:
                f1 f1Var = (f1) this.f40490c;
                if (iBinder == null) {
                    w0 w0Var = f1Var.f44753b.f44987f;
                    n1.m(w0Var);
                    w0Var.f45263j.a("Install Referrer connection returned with null binder");
                } else {
                    try {
                        int i11 = q5.f11782g;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                        r5 p5Var = iInterfaceQueryLocalInterface instanceof r5 ? (r5) iInterfaceQueryLocalInterface : new p5(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 0);
                        n1 n1Var = f1Var.f44753b;
                        w0 w0Var2 = n1Var.f44987f;
                        n1.m(w0Var2);
                        w0Var2.f45267o.a("Install Referrer Service connected");
                        l1 l1Var = n1Var.f44988g;
                        n1.m(l1Var);
                        l1Var.y(new o30.m0(this, p5Var, this));
                    } catch (RuntimeException e5) {
                        w0 w0Var3 = f1Var.f44753b.f44987f;
                        n1.m(w0Var3);
                        w0Var3.f45263j.b(e5, "Exception occurred while calling Install Referrer API");
                        return;
                    }
                }
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f40488a) {
            case 0:
                break;
            default:
                w0 w0Var = ((f1) this.f40490c).f44753b.f44987f;
                n1.m(w0Var);
                w0Var.f45267o.a("Install Referrer Service disconnected");
                break;
        }
    }

    public b(f1 f1Var, String str) {
        this.f40488a = 1;
        Objects.requireNonNull(f1Var);
        this.f40490c = f1Var;
        this.f40489b = str;
    }

    private final void b(ComponentName componentName) {
    }
}
