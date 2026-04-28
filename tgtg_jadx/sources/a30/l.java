package a30;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f660b;

    public /* synthetic */ l(Object obj, int i11) {
        this.f659a = i11;
        this.f660b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.f659a) {
            case 0:
                p pVar = (p) this.f660b;
                pVar.f669b.d("reportBinderDeath", new Object[0]);
                if (pVar.f676i.get() != null) {
                    org.bouncycastle.jce.provider.a.c();
                    return;
                }
                pVar.f669b.d("%s : Binder has died.", pVar.f670c);
                for (k kVar : pVar.f671d) {
                    RemoteException remoteException = new RemoteException(String.valueOf(pVar.f670c).concat(" : Binder has died."));
                    d10.g gVar = kVar.f658a;
                    if (gVar != null) {
                        gVar.c(remoteException);
                    }
                }
                pVar.f671d.clear();
                synchronized (pVar.f673f) {
                    pVar.d();
                    break;
                }
                return;
            case 1:
                g30.h hVar = (g30.h) this.f660b;
                hVar.f19918b.b("reportBinderDeath", new Object[0]);
                if (hVar.f19925i.get() != null) {
                    org.bouncycastle.jce.provider.a.c();
                    return;
                }
                hVar.f19918b.b("%s : Binder has died.", hVar.f19919c);
                for (g30.e eVar : hVar.f19920d) {
                    RemoteException remoteException2 = new RemoteException(String.valueOf(hVar.f19919c).concat(" : Binder has died."));
                    d10.g gVar2 = eVar.f19910a;
                    if (gVar2 != null) {
                        gVar2.c(remoteException2);
                    }
                }
                hVar.f19920d.clear();
                synchronized (hVar.f19922f) {
                    hVar.c();
                    break;
                }
                return;
            default:
                i30.c cVar = (i30.c) this.f660b;
                cVar.f23204b.a("reportBinderDeath", new Object[0]);
                if (cVar.f23212j.get() != null) {
                    org.bouncycastle.jce.provider.a.c();
                    return;
                }
                cVar.f23204b.a("%s : Binder has died.", cVar.f23205c);
                Iterator it = cVar.f23206d.iterator();
                while (it.hasNext()) {
                    ((i30.o) it.next()).a(new RemoteException(String.valueOf(cVar.f23205c).concat(" : Binder has died.")));
                }
                cVar.f23206d.clear();
                synchronized (cVar.f23208f) {
                    cVar.c();
                    break;
                }
                return;
        }
    }
}
