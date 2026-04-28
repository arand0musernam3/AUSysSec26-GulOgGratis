package y00;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c1 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4 f44644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f44645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44646c;

    public c1(l4 l4Var) {
        com.google.android.gms.common.internal.i0.h(l4Var);
        this.f44644a = l4Var;
    }

    public final void a() {
        l4 l4Var = this.f44644a;
        l4Var.m0();
        l4Var.d().p();
        l4Var.d().p();
        if (this.f44645b) {
            l4Var.b().f45267o.a("Unregistering connectivity change receiver");
            this.f44645b = false;
            this.f44646c = false;
            try {
                l4Var.l.f44982a.unregisterReceiver(this);
            } catch (IllegalArgumentException e5) {
                l4Var.b().f45260g.b(e5, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        l4 l4Var = this.f44644a;
        l4Var.m0();
        String action = intent.getAction();
        l4Var.b().f45267o.b(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            l4Var.b().f45263j.b(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        a1 a1Var = l4Var.f44921b;
        l4.U(a1Var);
        boolean zT = a1Var.t();
        if (this.f44646c != zT) {
            this.f44646c = zT;
            l4Var.d().y(new a8.f(this, zT));
        }
    }
}
