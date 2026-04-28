package i30;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IBinder f23198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a30.o f23199c;

    public a(a30.o oVar, IBinder iBinder) {
        this.f23199c = oVar;
        this.f23198b = iBinder;
    }

    @Override // i30.o
    public final void b() {
        m kVar;
        c cVar = (c) this.f23199c.f666b;
        cVar.f23211i.getClass();
        int i11 = l.f23224h;
        IBinder iBinder = this.f23198b;
        if (iBinder == null) {
            kVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
            kVar = iInterfaceQueryLocalInterface instanceof m ? (m) iInterfaceQueryLocalInterface : new k(iBinder);
        }
        cVar.f23215n = kVar;
        n nVar = cVar.f23204b;
        nVar.a("linkToDeath", new Object[0]);
        try {
            cVar.f23215n.asBinder().linkToDeath(cVar.f23213k, 0);
        } catch (RemoteException e5) {
            Object[] objArr = new Object[0];
            nVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", n.b(nVar.f23225a, "linkToDeath failed", objArr), e5);
            }
        }
        cVar.f23209g = false;
        Iterator it = cVar.f23206d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        cVar.f23206d.clear();
    }
}
