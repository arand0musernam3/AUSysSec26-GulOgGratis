package pb;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import ax.g0;
import com.braze.h2;
import ib.n;
import ib.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import jb.c;
import jb.f;
import jb.k;
import jb.s;
import mb.b;
import mb.g;
import o10.e;
import qb.h;
import qb.o;
import v80.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements g, c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f34624j = w.f("SystemFgDispatcher");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f34625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sb.a f34626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f34627c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f34628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f34629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f34630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f34631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g0 f34632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SystemForegroundService f34633i;

    public a(Context context) {
        s sVarD = s.d(context);
        this.f34625a = sVarD;
        this.f34626b = sVarD.f24927d;
        this.f34628d = null;
        this.f34629e = new LinkedHashMap();
        this.f34631g = new HashMap();
        this.f34630f = new HashMap();
        this.f34632h = new g0(sVarD.f24933j);
        sVarD.f24929f.a(this);
    }

    public static Intent a(Context context, h hVar, n nVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", hVar.f36799a);
        intent.putExtra("KEY_GENERATION", hVar.f36800b);
        intent.putExtra("KEY_NOTIFICATION_ID", nVar.f23748a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", nVar.f23749b);
        intent.putExtra("KEY_NOTIFICATION", nVar.f23750c);
        return intent;
    }

    public final void b(Intent intent) {
        if (this.f34633i == null) {
            h2.b("handleNotify was called on the destroyed dispatcher");
            return;
        }
        int i11 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        h hVar = new h(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        w.d().a(f34624j, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            i4.a.f("Notification passed in the intent was null.");
            return;
        }
        n nVar = new n(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f34629e;
        linkedHashMap.put(hVar, nVar);
        n nVar2 = (n) linkedHashMap.get(this.f34628d);
        if (nVar2 == null) {
            this.f34628d = hVar;
        } else {
            this.f34633i.f4170d.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i11 |= ((n) ((Map.Entry) it.next()).getValue()).f23749b;
                }
                nVar = new n(nVar2.f23748a, nVar2.f23750c, i11);
            } else {
                nVar = nVar2;
            }
        }
        SystemForegroundService systemForegroundService = this.f34633i;
        int i12 = nVar.f23748a;
        int i13 = nVar.f23749b;
        Notification notification2 = nVar.f23750c;
        systemForegroundService.getClass();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 31) {
            b6.a.y(systemForegroundService, i12, notification2, i13);
        } else if (i14 >= 29) {
            b6.a.x(systemForegroundService, i12, notification2, i13);
        } else {
            systemForegroundService.startForeground(i12, notification2);
        }
    }

    @Override // jb.c
    public final void c(h hVar, boolean z11) {
        Map.Entry entry;
        synchronized (this.f34627c) {
            try {
                i1 i1Var = ((o) this.f34630f.remove(hVar)) != null ? (i1) this.f34631g.remove(hVar) : null;
                if (i1Var != null) {
                    i1Var.a(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        n nVar = (n) this.f34629e.remove(hVar);
        if (hVar.equals(this.f34628d)) {
            if (this.f34629e.size() > 0) {
                Iterator it = this.f34629e.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f34628d = (h) entry.getKey();
                if (this.f34633i != null) {
                    n nVar2 = (n) entry.getValue();
                    SystemForegroundService systemForegroundService = this.f34633i;
                    int i11 = nVar2.f23748a;
                    int i12 = nVar2.f23749b;
                    Notification notification = nVar2.f23750c;
                    systemForegroundService.getClass();
                    int i13 = Build.VERSION.SDK_INT;
                    if (i13 >= 31) {
                        b6.a.y(systemForegroundService, i11, notification, i12);
                    } else if (i13 >= 29) {
                        b6.a.x(systemForegroundService, i11, notification, i12);
                    } else {
                        systemForegroundService.startForeground(i11, notification);
                    }
                    this.f34633i.f4170d.cancel(nVar2.f23748a);
                }
            } else {
                this.f34628d = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.f34633i;
        if (nVar == null || systemForegroundService2 == null) {
            return;
        }
        w.d().a(f34624j, "Removing Notification (id: " + nVar.f23748a + ", workSpecId: " + hVar + ", notificationType: " + nVar.f23749b);
        systemForegroundService2.f4170d.cancel(nVar.f23748a);
    }

    public final void d() {
        this.f34633i = null;
        synchronized (this.f34627c) {
            try {
                Iterator it = this.f34631g.values().iterator();
                while (it.hasNext()) {
                    ((i1) it.next()).a(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f fVar = this.f34625a.f24929f;
        synchronized (fVar.f24893k) {
            fVar.f24892j.remove(this);
        }
    }

    @Override // mb.g
    public final void e(o oVar, mb.c cVar) {
        if (cVar instanceof b) {
            String str = oVar.f36828a;
            w.d().a(f34624j, "Constraints unmet for WorkSpec " + str);
            h hVarV = wd.a.v(oVar);
            int i11 = ((b) cVar).f29904a;
            s sVar = this.f34625a;
            sVar.f24927d.a(new e(sVar.f24929f, new k(hVarV), true, i11));
        }
    }

    public final void f(int i11, int i12) {
        w.d().e(f34624j, "Foreground service timed out, FGS type: " + i12);
        for (Map.Entry entry : this.f34629e.entrySet()) {
            if (((n) entry.getValue()).f23749b == i12) {
                h hVar = (h) entry.getKey();
                s sVar = this.f34625a;
                sVar.f24927d.a(new e(sVar.f24929f, new k(hVar), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.f34633i;
        if (systemForegroundService != null) {
            systemForegroundService.f4168b = true;
            w.d().a(SystemForegroundService.f4166e, "Shutting down.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf(i11);
        }
    }
}
