package lb;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import h7.i0;
import ib.w;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f27574a = w.f("SystemJobScheduler");

    public static final List a(JobScheduler jobScheduler) {
        jobScheduler.getClass();
        try {
            jobScheduler.getClass();
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            allPendingJobs.getClass();
            return allPendingJobs;
        } catch (Throwable th2) {
            w.d().c(f27574a, "getAllPendingJobs() is not reliable on this device.", th2);
            return null;
        }
    }

    public static final JobScheduler b(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("jobscheduler");
        systemService.getClass();
        JobScheduler jobScheduler = (JobScheduler) systemService;
        return Build.VERSION.SDK_INT >= 34 ? i0.g(jobScheduler) : jobScheduler;
    }
}
