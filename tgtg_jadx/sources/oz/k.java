package oz;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.firebase.messaging.a0;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33828b;

    public /* synthetic */ k(Object obj, int i11) {
        this.f33827a = i11;
        this.f33828b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f33827a) {
            case 0:
                int i11 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i11);
                }
                l lVar = (l) this.f33828b;
                synchronized (lVar) {
                    try {
                        n nVar = (n) lVar.f33833e.get(i11);
                        if (nVar == null) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i11);
                            return true;
                        }
                        lVar.f33833e.remove(i11);
                        lVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            nVar.b(new zzt("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (nVar.f33842e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    nVar.c(null);
                                    return true;
                                }
                                nVar.b(new zzt("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle(Bayeux.KEY_DATA);
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                nVar.c(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
            default:
                if (message.what != 0) {
                    return false;
                }
                a0 a0Var = (a0) this.f33828b;
                q20.i iVar = (q20.i) message.obj;
                synchronized (a0Var.f12779b) {
                    if (((q20.i) a0Var.f12781d) == iVar || ((q20.i) a0Var.f12782e) == iVar) {
                        a0Var.A(iVar, 2);
                    }
                    break;
                }
                return true;
        }
    }
}
