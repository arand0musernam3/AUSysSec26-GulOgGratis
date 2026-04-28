package s0;

import android.util.Log;
import com.google.android.gms.internal.measurement.te;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f38386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0.c f38387b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ScheduledFuture f38390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public te f38391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p0 f38392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w.j0 f38393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c40.i f38394i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f38388c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f38389d = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jb.b f38395j = new jb.b(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile Object f38396k = kotlin.collections.n0.f26529a;
    public final AtomicBoolean l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f38397m = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f38398n = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinkedHashMap f38399o = new LinkedHashMap();

    public m0(Executor executor, w0.c cVar) {
        this.f38386a = executor;
        this.f38387b = cVar;
    }

    public final void a(String str) {
        p0 p0Var = this.f38392g;
        if (p0Var == null) {
            return;
        }
        try {
            g0 g0VarQ = p0Var.b(str).q();
            g0VarQ.getClass();
            e(g0VarQ);
        } catch (IllegalArgumentException unused) {
            wd.a.I("CameraPresencePrvdr", "CameraInternal not found for " + str + ". Cannot setup state observer.");
        }
    }

    public final void b(Set set, Set set2) {
        boolean zIsEmpty = set.isEmpty();
        CopyOnWriteArrayList<l0> copyOnWriteArrayList = this.f38398n;
        if (!zIsEmpty) {
            wd.a.y("CameraPresencePrvdr", "Notifying " + set.size() + " cameras added.");
            for (l0 l0Var : copyOnWriteArrayList) {
                l0Var.f38380b.execute(new m0.l(l0Var, set));
            }
        }
        if (set2.isEmpty()) {
            return;
        }
        wd.a.y("CameraPresencePrvdr", "Notifying " + set2.size() + " cameras removed.");
        for (l0 l0Var2 : copyOnWriteArrayList) {
            l0Var2.f38380b.execute(new mr.h(16, l0Var2, set2));
        }
    }

    public final void c(String str) {
        synchronized (this.f38388c) {
            androidx.lifecycle.p0 p0Var = (androidx.lifecycle.p0) this.f38399o.remove(str);
            p0 p0Var2 = this.f38392g;
            if (p0Var != null && p0Var2 != null) {
                try {
                    w.b.U().execute(new mr.h(17, p0Var2.b(str), p0Var));
                    wd.a.p("CameraPresencePrvdr", "Removed state observer for: " + str);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public final void d(int i11, List list) {
        if (i11 > 0 && this.l.get()) {
            this.f38390e = this.f38387b.schedule(new k0(this, list, i11, 1), i11 == 3 ? 0L : 400L, TimeUnit.MILLISECONDS);
        } else if (i11 <= 0) {
            wd.a.I("CameraPresencePrvdr", "Exhausted all retries for camera list refresh.");
        }
    }

    public final void e(g0 g0Var) {
        String strD = g0Var.d();
        strD.getClass();
        if (this.l.get()) {
            synchronized (this.f38388c) {
                if (this.f38399o.containsKey(strD)) {
                    return;
                }
                av.d dVar = new av.d(1, this, strD);
                w.b.U().execute(new mr.h(18, g0Var, dVar));
                this.f38399o.put(strD, dVar);
                wd.a.p("CameraPresencePrvdr", "Registered state observer for camera: ".concat(strD));
            }
        }
    }

    public final void f() {
        a aVar;
        if (!this.l.getAndSet(false)) {
            wd.a.p("CameraPresencePrvdr", "Shutdown called when not monitoring. Ignoring.");
            return;
        }
        wd.a.y("CameraPresencePrvdr", "Shutting down CameraPresenceProvider monitoring.");
        synchronized (this.f38389d) {
            try {
                ScheduledFuture scheduledFuture = this.f38390e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f38390e = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        w.j0 j0Var = this.f38393h;
        if (j0Var != null) {
            jb.b bVar = this.f38395j;
            Iterator it = j0Var.f38280b.iterator();
            while (true) {
                if (it.hasNext()) {
                    aVar = (a) it.next();
                    if (aVar.f38277b.equals(bVar)) {
                        break;
                    }
                } else {
                    aVar = null;
                    break;
                }
            }
            if (aVar != null) {
                j0Var.f38280b.remove(aVar);
            }
            synchronized (j0Var.f38279a) {
                try {
                    if (j0Var.f38283e && j0Var.f38280b.isEmpty()) {
                        Log.i("CameraPresenceSrc", "Last observer removed. Stopping monitoring.");
                        j0Var.f38283e = false;
                        Log.i("PipePresenceSrc", "Stopping camera ID flow collection.");
                        if (j0Var.f42708h.compareAndSet(true, false)) {
                            v80.b2 b2Var = j0Var.f42709i;
                            if (b2Var != null) {
                                b2Var.a(null);
                            }
                            j0Var.f42709i = null;
                        }
                    }
                } finally {
                }
            }
        }
        synchronized (this.f38388c) {
            if (!this.f38399o.isEmpty()) {
                Map mapK = kotlin.collections.x0.k(this.f38399o);
                this.f38399o.clear();
                p0 p0Var = this.f38392g;
                if (p0Var != null) {
                    LinkedHashSet<i0> linkedHashSetC = p0Var.c();
                    ArrayList arrayList = new ArrayList();
                    for (i0 i0Var : linkedHashSetC) {
                        g0 g0VarQ = i0Var != null ? i0Var.q() : null;
                        if (g0VarQ != null) {
                            arrayList.add(g0VarQ);
                        }
                    }
                    wd.a.p("CameraPresencePrvdr", "Clearing all " + mapK.size() + " state observers.");
                    Iterator it2 = mapK.entrySet().iterator();
                    while (it2.hasNext()) {
                        w.b.U().execute(new a40.q((Object) arrayList, r1.getValue(), (String) ((Map.Entry) it2.next()).getKey(), 29));
                    }
                }
            }
        }
        this.f38394i = null;
        this.f38397m.clear();
        this.f38398n.clear();
        this.f38396k = kotlin.collections.n0.f26529a;
        this.f38391f = null;
        this.f38392g = null;
    }

    public final void g(c40.i iVar, te teVar, p0 p0Var) {
        List listUnmodifiableList;
        Throwable th2;
        teVar.getClass();
        p0Var.getClass();
        if (this.l.compareAndSet(false, true)) {
            wd.a.y("CameraPresencePrvdr", "Starting CameraPresenceProvider monitoring.");
            this.f38394i = iVar;
            Set setH = teVar.h();
            setH.getClass();
            Set<String> set = setH;
            ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(set, 10));
            for (String str : set) {
                str.getClass();
                arrayList.add(w0.e.n(str, null, null));
            }
            this.f38396k = arrayList;
            this.f38391f = teVar;
            this.f38392g = p0Var;
            this.f38393h = (w.j0) teVar.f11899g;
            this.f38386a.execute(new j0(this, 0));
            w.j0 j0Var = this.f38393h;
            if (j0Var != null) {
                w0.g gVar = new w0.g(this.f38386a);
                jb.b bVar = this.f38395j;
                j0Var.f38280b.add(new a(gVar, bVar));
                synchronized (j0Var.f38279a) {
                    try {
                        if (!j0Var.f38283e && !j0Var.f38280b.isEmpty()) {
                            Log.i("CameraPresenceSrc", "First observer added. Starting monitoring.");
                            j0Var.f38283e = true;
                            j0Var.c();
                        }
                        listUnmodifiableList = Collections.unmodifiableList(j0Var.f38281c);
                        th2 = j0Var.f38282d;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                gVar.execute(new a40.q(th2, new a(gVar, bVar), listUnmodifiableList, 28));
            }
        }
    }
}
