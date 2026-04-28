package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.braze.models.inappmessage.InAppMessageBase;
import com.google.firebase.messaging.r;
import cz.d;
import cz.j;
import java.util.concurrent.Executor;
import t5.a;
import wy.i;
import wy.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11006a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString(InAppMessageBase.EXTRAS);
        int i11 = jobParameters.getExtras().getInt("priority");
        int i12 = jobParameters.getExtras().getInt("attemptNumber");
        p.b(getApplicationContext());
        a aVarA = i.a();
        aVarA.J(string);
        aVarA.f39793d = gz.a.b(i11);
        if (string2 != null) {
            aVarA.f39792c = Base64.decode(string2, 0);
        }
        j jVar = p.a().f43592d;
        ((Executor) jVar.f13637g).execute(new d(jVar, aVarA.f(), i12, new r(3, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
