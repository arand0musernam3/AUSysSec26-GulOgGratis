package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.measurement.a7;
import com.google.android.gms.internal.measurement.m6;
import com.google.android.gms.internal.measurement.ye;
import java.util.Objects;
import ky.p;
import o30.m0;
import x0.e;
import x0.f;
import y00.l4;
import y00.p3;
import y00.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AppMeasurementJobService extends JobService implements p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f12151a;

    @Override // y00.p3
    public final boolean a(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // y00.p3
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final e d() {
        if (this.f12151a == null) {
            this.f12151a = new e(this, 4);
        }
        return this.f12151a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) d().f43625b).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) d().f43625b).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        e eVarD = d();
        Service service = (Service) eVarD.f43625b;
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            i0.h(string);
            l4 l4VarC = l4.C(service);
            w0 w0VarB = l4VarC.b();
            p pVar = l4VarC.l.f44984c;
            w0VarB.f45267o.b(string, "Local AppMeasurementJobService called. action");
            l4VarC.d().y(new f(eVarD, l4VarC, new ye(eVarD, w0VarB, jobParameters, 14)));
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        i0.h(string);
        a7 a7VarC = a7.c(service, null);
        m0 m0Var = new m0(27, eVarD, jobParameters);
        a7VarC.getClass();
        a7VarC.a(new m6(a7VarC, m0Var, 2));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    @Override // y00.p3
    public final void b(Intent intent) {
    }
}
