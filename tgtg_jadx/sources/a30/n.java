package a30;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IBinder f663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f664c;

    public n(o oVar, IBinder iBinder) {
        this.f664c = oVar;
        this.f663b = iBinder;
    }

    @Override // a30.k
    public final void a() {
        h fVar;
        p pVar = (p) this.f664c.f666b;
        int i11 = g.f655h;
        IBinder iBinder = this.f663b;
        if (iBinder == null) {
            fVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            fVar = iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new f(iBinder);
        }
        pVar.f679m = fVar;
        j jVar = pVar.f669b;
        jVar.d("linkToDeath", new Object[0]);
        try {
            pVar.f679m.asBinder().linkToDeath(pVar.f677j, 0);
        } catch (RemoteException e5) {
            jVar.c(e5, "linkToDeath failed", new Object[0]);
        }
        pVar.f674g = false;
        Iterator it = pVar.f671d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        pVar.f671d.clear();
    }
}
