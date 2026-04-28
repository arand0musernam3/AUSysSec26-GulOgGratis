package i30;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.google.android.play.integrity.internal.af;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final HashMap f23202o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f23204b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f23210h;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a30.o f23214m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m f23215n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f23206d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f23207e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f23208f = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a30.l f23213k = new a30.l(this, 2);
    public final AtomicInteger l = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23205c = "IntegrityService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d30.b f23211i = d30.b.f14008b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final WeakReference f23212j = new WeakReference(null);

    public c(Context context, n nVar, Intent intent) {
        this.f23203a = context;
        this.f23204b = nVar;
        this.f23210h = intent;
    }

    public static void b(c cVar, d30.c cVar2) {
        m mVar = cVar.f23215n;
        n nVar = cVar.f23204b;
        ArrayList arrayList = cVar.f23206d;
        if (mVar != null || cVar.f23209g) {
            if (!cVar.f23209g) {
                cVar2.run();
                return;
            } else {
                nVar.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(cVar2);
                return;
            }
        }
        nVar.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(cVar2);
        a30.o oVar = new a30.o(cVar, 2);
        cVar.f23214m = oVar;
        cVar.f23209g = true;
        if (cVar.f23203a.bindService(cVar.f23210h, oVar, 1)) {
            return;
        }
        nVar.a("Failed to bind to the service.", new Object[0]);
        cVar.f23209g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((o) it.next()).a(new af("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f23202o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f23205c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f23205c, 10);
                    handlerThread.start();
                    map.put(this.f23205c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f23205c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.f23207e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((d10.g) it.next()).c(new RemoteException(String.valueOf(this.f23205c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
