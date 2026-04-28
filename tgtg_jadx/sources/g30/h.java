package g30;

import a30.l;
import a30.o;
import a90.v;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.google.android.play.core.review.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap f19916n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f19918b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f19923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f19924h;
    public o l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f19928m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f19920d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f19921e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f19922f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f19926j = new l(this, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f19927k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19919c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f19925i = new WeakReference(null);

    public h(Context context, v vVar, Intent intent) {
        this.f19917a = context;
        this.f19918b = vVar;
        this.f19924h = intent;
    }

    public static void b(h hVar, f30.e eVar) {
        d dVar = hVar.f19928m;
        v vVar = hVar.f19918b;
        ArrayList<e> arrayList = hVar.f19920d;
        if (dVar != null || hVar.f19923g) {
            if (!hVar.f19923g) {
                eVar.run();
                return;
            } else {
                vVar.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(eVar);
                return;
            }
        }
        vVar.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(eVar);
        o oVar = new o(hVar, 1);
        hVar.l = oVar;
        hVar.f19923g = true;
        if (hVar.f19917a.bindService(hVar.f19924h, oVar, 1)) {
            return;
        }
        vVar.b("Failed to bind to the service.", new Object[0]);
        hVar.f19923g = false;
        for (e eVar2 : arrayList) {
            zzu zzuVar = new zzu("Failed to bind to the service.");
            d10.g gVar = eVar2.f19910a;
            if (gVar != null) {
                gVar.c(zzuVar);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f19916n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f19919c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f19919c, 10);
                    handlerThread.start();
                    map.put(this.f19919c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f19919c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.f19921e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((d10.g) it.next()).c(new RemoteException(String.valueOf(this.f19919c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
