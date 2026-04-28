package a30;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.google.android.play.core.appupdate.internal.zzy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap f667n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f669b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f675h;
    public o l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h f679m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f671d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f672e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f673f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f677j = new l(this, 0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f678k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f670c = "AppUpdateService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f676i = new WeakReference(null);

    public p(Context context, j jVar, Intent intent) {
        this.f668a = context;
        this.f669b = jVar;
        this.f675h = intent;
    }

    public static void b(p pVar, k kVar) {
        h hVar = pVar.f679m;
        j jVar = pVar.f669b;
        ArrayList<k> arrayList = pVar.f671d;
        if (hVar != null || pVar.f674g) {
            if (!pVar.f674g) {
                kVar.run();
                return;
            } else {
                jVar.d("Waiting to bind to the service.", new Object[0]);
                arrayList.add(kVar);
                return;
            }
        }
        jVar.d("Initiate binding to the service.", new Object[0]);
        arrayList.add(kVar);
        o oVar = new o(pVar, 0);
        pVar.l = oVar;
        pVar.f674g = true;
        if (pVar.f668a.bindService(pVar.f675h, oVar, 1)) {
            return;
        }
        jVar.d("Failed to bind to the service.", new Object[0]);
        pVar.f674g = false;
        for (k kVar2 : arrayList) {
            zzy zzyVar = new zzy("Failed to bind to the service.");
            d10.g gVar = kVar2.f658a;
            if (gVar != null) {
                gVar.c(zzyVar);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f667n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f670c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f670c, 10);
                    handlerThread.start();
                    map.put(this.f670c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f670c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c(d10.g gVar) {
        synchronized (this.f673f) {
            this.f672e.remove(gVar);
        }
        a().post(new m(this, 0));
    }

    public final void d() {
        HashSet hashSet = this.f672e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((d10.g) it.next()).c(new RemoteException(String.valueOf(this.f670c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
