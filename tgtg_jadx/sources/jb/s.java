package jb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import b0.j2;
import com.app.tgtg.MainApplication;
import com.braze.h2;
import ib.k0;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import o00.x0;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static s f24922k;
    public static s l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f24923m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ib.b f24925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WorkDatabase f24926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sb.a f24927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f24928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f24929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f24930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f24931h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f24932i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ob.j f24933j;

    static {
        ib.w.f("WorkManagerImpl");
        f24922k = null;
        l = null;
        f24923m = new Object();
    }

    public s(Context context, final ib.b bVar, sb.a aVar, final WorkDatabase workDatabase, final List list, f fVar, ob.j jVar) {
        Context applicationContext = context.getApplicationContext();
        x70.c cVar = null;
        if (applicationContext.isDeviceProtectedStorage()) {
            h2.b("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
        ib.w wVar = new ib.w(bVar.f23699h);
        synchronized (ib.w.f23764b) {
            try {
                if (ib.w.f23765c == null) {
                    ib.w.f23765c = wVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f24924a = applicationContext;
        this.f24927d = aVar;
        this.f24926c = workDatabase;
        this.f24929f = fVar;
        this.f24933j = jVar;
        this.f24925b = bVar;
        this.f24928e = list;
        v80.x xVar = aVar.f38957b;
        xVar.getClass();
        a90.d dVarB = f0.b(xVar);
        this.f24930g = new b(workDatabase);
        final rb.k kVar = aVar.f38956a;
        String str = j.f24900a;
        fVar.a(new c() { // from class: jb.i
            @Override // jb.c
            public final void c(qb.h hVar, boolean z11) {
                kVar.execute(new b0.g(5, list, hVar, bVar, workDatabase));
            }
        });
        aVar.a(new rb.c(applicationContext, this));
        String str2 = n.f24905a;
        if (rb.j.a(applicationContext, bVar)) {
            y80.r.u(dVarB, new y80.w(y80.r.l(y80.r.e(new y80.w(w0.e.p(workDatabase.x().f36870a, false, new String[]{"workspec"}, new qb.r(3)), new m(4, null)), -1)), new j2(applicationContext, cVar, 4), 5));
        }
    }

    public static s d(Context context) {
        s sVarD;
        Object obj = f24923m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    sVarD = f24922k;
                    if (sVarD == null) {
                        sVarD = l;
                    }
                }
                return sVarD;
            } catch (Throwable th2) {
                throw th2;
            } finally {
            }
        }
        if (sVarD == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof MainApplication)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            a50.c cVar = new a50.c(27, false);
            t8.a aVar = ((MainApplication) applicationContext).f8874c;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("workerFactory");
                aVar = null;
            }
            aVar.getClass();
            cVar.f822b = aVar;
            f(applicationContext, new ib.b(cVar));
            sVarD = d(applicationContext);
        }
        return sVarD;
    }

    public static void f(Context context, ib.b bVar) {
        synchronized (f24923m) {
            try {
                s sVar = f24922k;
                if (sVar != null && l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (sVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (l == null) {
                        l = u.B(applicationContext, bVar);
                    }
                    f24922k = l;
                }
            } finally {
            }
        }
    }

    public final ib.y a(String str) {
        ib.y yVar = this.f24925b.f23703m;
        String strConcat = "CancelWorkByName_".concat(str);
        rb.k kVar = this.f24927d.f38956a;
        kVar.getClass();
        return jf.e.I(yVar, strConcat, kVar, new qw.b(8, str, this));
    }

    public final void b(k0 k0Var) {
        k0Var.getClass();
        List listC = kotlin.collections.c0.c(k0Var);
        if (listC.isEmpty()) {
            i4.a.f("enqueue needs at least one WorkRequest.");
        } else {
            new o(this, null, ib.m.KEEP, listC, 0).a();
        }
    }

    public final void c(String str, ib.m mVar, ib.a0 a0Var) {
        mVar.getClass();
        a0Var.getClass();
        new o(this, str, mVar, kotlin.collections.c0.c(a0Var), 0).a();
    }

    public final y80.i e(UUID uuid) {
        qb.w wVarX = this.f24926c.x();
        wVarX.getClass();
        uuid.getClass();
        List listC = kotlin.collections.c0.c(String.valueOf(uuid));
        listC.getClass();
        StringBuilder sbO = b3.i.o("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        pd.g.h(listC.size(), sbO);
        sbO.append(")");
        return y80.r.l(new at.o(w0.e.p(wVarX.f36870a, true, new String[]{"WorkTag", "WorkProgress", "workspec"}, new qb.u(sbO.toString(), listC, wVarX, 0)), 3));
    }

    public final void g() {
        synchronized (f24923m) {
            try {
                this.f24931h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f24932i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f24932i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h() throws Throwable {
        ib.y yVar = this.f24925b.f23703m;
        hi.d dVar = new hi.d(this, 26);
        yVar.getClass();
        boolean zY = x0.y();
        if (zY) {
            try {
                Trace.beginSection(x0.G("ReschedulingWork"));
            } finally {
                InlineMarker.finallyStart(1);
                if (zY) {
                    Trace.endSection();
                }
                InlineMarker.finallyEnd(1);
            }
        }
        dVar.invoke();
    }
}
