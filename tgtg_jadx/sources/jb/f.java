package jb;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkerStoppedException;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final String l = ib.w.f("Processor");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f24884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ib.b f24885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sb.a f24886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WorkDatabase f24887e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f24889g = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f24888f = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashSet f24891i = new HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f24892j = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f24883a = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f24893k = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f24890h = new HashMap();

    public f(Context context, ib.b bVar, sb.a aVar, WorkDatabase workDatabase) {
        this.f24884b = context;
        this.f24885c = bVar;
        this.f24886d = aVar;
        this.f24887e = workDatabase;
    }

    public static boolean d(String str, d0 d0Var, int i11) {
        String str2 = l;
        if (d0Var == null) {
            ib.w.d().a(str2, "WorkerWrapper could not be found for " + str);
            return false;
        }
        d0Var.f24877m.r(new WorkerStoppedException(i11));
        ib.w.d().a(str2, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(c cVar) {
        synchronized (this.f24893k) {
            this.f24892j.add(cVar);
        }
    }

    public final d0 b(String str) {
        d0 d0Var = (d0) this.f24888f.remove(str);
        boolean z11 = d0Var != null;
        if (!z11) {
            d0Var = (d0) this.f24889g.remove(str);
        }
        this.f24890h.remove(str);
        if (z11) {
            synchronized (this.f24893k) {
                try {
                    if (this.f24888f.isEmpty()) {
                        Context context = this.f24884b;
                        String str2 = pb.a.f34624j;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.f24884b.startService(intent);
                        } catch (Throwable th2) {
                            ib.w.d().c(l, "Unable to stop foreground service", th2);
                        }
                        PowerManager.WakeLock wakeLock = this.f24883a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f24883a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return d0Var;
    }

    public final d0 c(String str) {
        d0 d0Var = (d0) this.f24888f.get(str);
        return d0Var == null ? (d0) this.f24889g.get(str) : d0Var;
    }
}
