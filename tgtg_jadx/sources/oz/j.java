package oz;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o30.m0;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f33826b;

    public /* synthetic */ j(l lVar, int i11) {
        this.f33825a = i11;
        this.f33826b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33825a) {
            case 0:
                break;
            case 1:
                l lVar = this.f33826b;
                synchronized (lVar) {
                    if (lVar.f33829a == 1) {
                        lVar.a("Timed out while binding");
                    }
                    break;
                }
                return;
            default:
                this.f33826b.a("Service disconnected");
                return;
        }
        while (true) {
            l lVar2 = this.f33826b;
            synchronized (lVar2) {
                try {
                    if (lVar2.f33829a != 2) {
                        return;
                    }
                    if (lVar2.f33832d.isEmpty()) {
                        lVar2.c();
                        return;
                    }
                    n nVar = (n) lVar2.f33832d.poll();
                    lVar2.f33833e.put(nVar.f33838a, nVar);
                    ((ScheduledExecutorService) lVar2.f33834f.f33846c).schedule(new m0(12, lVar2, nVar), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(nVar)));
                    }
                    o oVar = lVar2.f33834f;
                    Messenger messenger = lVar2.f33830b;
                    int i11 = nVar.f33840c;
                    Context context = (Context) oVar.f33845b;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i11;
                    messageObtain.arg1 = nVar.f33838a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", nVar.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle(Bayeux.KEY_DATA, nVar.f33841d);
                    messageObtain.setData(bundle);
                    try {
                        m mVar = lVar2.f33831c;
                        Messenger messenger2 = (Messenger) mVar.f33836b;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            g gVar = (g) mVar.f33837c;
                            if (gVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = gVar.f33816a;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e5) {
                        lVar2.a(e5.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
