package j0;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import v80.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1 f24290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f24291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f24292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f24293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f24294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f24295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f24296g;

    public h(i1 i1Var) {
        i1Var.getClass();
        this.f24290a = i1Var;
        this.f24291b = new Object();
        this.f24292c = new ArrayList();
        this.f24293d = new Object();
        this.f24294e = new ArrayList();
        this.f24295f = new Object();
        this.f24296g = new ArrayList();
    }

    public final void a(e eVar, Runnable runnable) {
        boolean zAdd;
        eVar.getClass();
        int i11 = f.$EnumSwitchMapping$0[eVar.ordinal()];
        if (i11 == 1) {
            synchronized (this.f24291b) {
                zAdd = this.f24292c.add(runnable);
            }
        } else if (i11 == 2) {
            synchronized (this.f24293d) {
                zAdd = this.f24294e.add(runnable);
            }
        } else if (i11 != 3) {
            e40.a.f();
            return;
        } else {
            synchronized (this.f24295f) {
                zAdd = this.f24296g.add(runnable);
            }
        }
        if (zAdd) {
            return;
        }
        Log.e("CXCP", "CameraPipeLifetime already shut down. This is unexpected. Executing " + eVar + " shutdown action immediately...");
        runnable.run();
    }

    public final void b() {
        synchronized (this.f24291b) {
            Log.d("CXCP", "Shutting down cameras...");
            Iterator it = this.f24292c.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        synchronized (this.f24293d) {
            try {
                Log.d("CXCP", "Shutting down scopes...");
                Iterator it2 = this.f24294e.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f24295f) {
            Log.d("CXCP", "Shutting down threads...");
            Iterator it3 = this.f24296g.iterator();
            while (it3.hasNext()) {
                ((Runnable) it3.next()).run();
            }
        }
    }
}
