package y00;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.i9;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x2 extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JobScheduler f45299d;

    @Override // y00.i0
    public final boolean s() {
        return true;
    }

    public final void t(long j9) {
        n1 n1Var = (n1) this.f21216b;
        q();
        p();
        JobScheduler jobScheduler = this.f45299d;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(n1Var.f44982a.getPackageName())).hashCode()) != null) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45267o.a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        i9 i9VarU = u();
        if (i9VarU != i9.CLIENT_UPLOAD_ELIGIBLE) {
            w0 w0Var2 = n1Var.f44987f;
            n1.m(w0Var2);
            w0Var2.f45267o.b(i9VarU.name(), "[sgtm] Not eligible for Scion upload");
            return;
        }
        w0 w0Var3 = n1Var.f44987f;
        n1.m(w0Var3);
        w0Var3.f45267o.b(Long.valueOf(j9), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder("measurement-client".concat(String.valueOf(n1Var.f44982a.getPackageName())).hashCode(), new ComponentName(n1Var.f44982a, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j9).setOverrideDeadline(j9 + j9).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.f45299d;
        com.google.android.gms.common.internal.i0.h(jobScheduler2);
        int iSchedule = jobScheduler2.schedule(jobInfoBuild);
        w0 w0Var4 = n1Var.f44987f;
        n1.m(w0Var4);
        w0Var4.f45267o.b(iSchedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    public final i9 u() {
        n1 n1Var = (n1) this.f21216b;
        q();
        p();
        if (this.f45299d == null) {
            return i9.MISSING_JOB_SCHEDULER;
        }
        Boolean boolC = n1Var.f44985d.C("google_analytics_sgtm_upload_enabled");
        return boolC == null ? false : boolC.booleanValue() ? n1Var.r().f45028k >= 119000 ? !r4.K(n1Var.f44982a) ? i9.MEASUREMENT_SERVICE_NOT_ENABLED : !n1Var.p().w() ? i9.NON_PLAY_MODE : i9.CLIENT_UPLOAD_ELIGIBLE : i9.SDK_TOO_OLD : i9.NOT_ENABLED_IN_MANIFEST;
    }
}
