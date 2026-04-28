package y00;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.u5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z3 extends f4 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AlarmManager f45339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t3 f45340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f45341g;

    public z3(l4 l4Var) {
        super(l4Var);
        this.f45339e = (AlarmManager) ((n1) this.f21216b).f44982a.getSystemService("alarm");
    }

    @Override // y00.f4
    public final void s() {
        AlarmManager alarmManager = this.f45339e;
        if (alarmManager != null) {
            Context context = ((n1) this.f21216b).f44982a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), u5.f11921a));
        }
        v();
    }

    public final n t() {
        if (this.f45340f == null) {
            this.f45340f = new t3(this, this.f44586c.l, 1);
        }
        return this.f45340f;
    }

    public final void u() {
        q();
        n1 n1Var = (n1) this.f21216b;
        w0 w0Var = n1Var.f44987f;
        n1.m(w0Var);
        w0Var.f45267o.a("Unscheduling upload");
        AlarmManager alarmManager = this.f45339e;
        if (alarmManager != null) {
            Context context = n1Var.f44982a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), u5.f11921a));
        }
        t().c();
        v();
    }

    public final void v() {
        JobScheduler jobScheduler = (JobScheduler) ((n1) this.f21216b).f44982a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(w());
        }
    }

    public final int w() {
        if (this.f45341g == null) {
            this.f45341g = Integer.valueOf("measurement".concat(String.valueOf(((n1) this.f21216b).f44982a.getPackageName())).hashCode());
        }
        return this.f45341g.intValue();
    }
}
