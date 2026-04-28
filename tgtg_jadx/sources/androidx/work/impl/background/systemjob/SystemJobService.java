package androidx.work.impl.background.systemjob;

import a3.a3;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import b7.a;
import com.braze.h2;
import dn.k;
import ib.w;
import java.util.Arrays;
import java.util.HashMap;
import jb.c;
import jb.f;
import jb.l;
import jb.s;
import qb.h;
import w.a0;
import wy.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f4160e = w.f("SystemJobService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f4161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f4162b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f4163c = new l(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f4164d;

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        h2.b(a0.p("Cannot invoke ", str, " on a background thread"));
    }

    public static h b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new h(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // jb.c
    public final void c(h hVar, boolean z11) {
        a("onExecuted");
        w.d().a(f4160e, hVar.f36799a + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.f4162b.remove(hVar);
        this.f4163c.b(hVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z11);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            s sVarD = s.d(getApplicationContext());
            this.f4161a = sVarD;
            f fVar = sVarD.f24929f;
            this.f4164d = new k(fVar, sVarD.f24927d);
            fVar.a(this);
        } catch (IllegalStateException e5) {
            if (Application.class.equals(getApplication().getClass())) {
                w.d().g(f4160e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
            } else {
                o.k("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e5);
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        s sVar = this.f4161a;
        if (sVar != null) {
            f fVar = sVar.f24929f;
            synchronized (fVar.f24893k) {
                fVar.f24892j.remove(this);
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        s sVar = this.f4161a;
        String str = f4160e;
        if (sVar == null) {
            w.d().a(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        h hVarB = b(jobParameters);
        if (hVarB == null) {
            w.d().b(str, "WorkSpec id not found!");
            return false;
        }
        HashMap map = this.f4162b;
        if (map.containsKey(hVarB)) {
            w.d().a(str, "Job is already being executed by SystemJobService: " + hVarB);
            return false;
        }
        w.d().a(str, "onStartJob for " + hVarB);
        map.put(hVarB, jobParameters);
        k kVar = new k(19);
        if (jobParameters.getTriggeredContentUris() != null) {
            kVar.f15019c = Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            kVar.f15018b = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            a3.l(jobParameters);
        }
        this.f4164d.x(this.f4163c.d(hVarB), kVar);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        a("onStopJob");
        if (this.f4161a == null) {
            w.d().a(f4160e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        h hVarB = b(jobParameters);
        if (hVarB == null) {
            w.d().b(f4160e, "WorkSpec id not found!");
            return false;
        }
        w.d().a(f4160e, "onStopJob for " + hVarB);
        this.f4162b.remove(hVarB);
        jb.k kVarB = this.f4163c.b(hVarB);
        if (kVarB != null) {
            int i11 = Build.VERSION.SDK_INT >= 31 ? a.i(jobParameters) : -512;
            k kVar = this.f4164d;
            kVar.getClass();
            kVar.y(kVarB, i11);
        }
        f fVar = this.f4161a.f24929f;
        String str = hVarB.f36799a;
        synchronized (fVar.f24893k) {
            zContains = fVar.f24891i.contains(str);
        }
        return !zContains;
    }
}
