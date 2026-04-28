package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import v8.a;
import x0.e;
import x0.f;
import y00.l4;
import y00.n1;
import y00.p3;
import y00.v1;
import y00.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AppMeasurementService extends Service implements p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f12153a;

    @Override // y00.p3
    public final boolean a(int i11) {
        return stopSelfResult(i11);
    }

    @Override // y00.p3
    public final void b(Intent intent) {
        SparseArray sparseArray = a.f42064a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = a.f42064a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // y00.p3
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final e d() {
        if (this.f12153a == null) {
            this.f12153a = new e(this, 4);
        }
        return this.f12153a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        e eVarD = d();
        eVarD.getClass();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new v1(l4.C((Service) eVarD.f43625b));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
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

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i11, final int i12) {
        final e eVarD = d();
        if (intent == null) {
            eVarD.getClass();
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) eVarD.f43625b;
        final w0 w0Var = n1.s(service, null, null, null).f44987f;
        n1.m(w0Var);
        String action = intent.getAction();
        w0Var.f45267o.c("Local AppMeasurementService called. startId, action", Integer.valueOf(i12), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        Runnable runnable = new Runnable() { // from class: y00.q3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Service service2 = (Service) eVarD.f43625b;
                p3 p3Var = (p3) service2;
                int i13 = i12;
                if (p3Var.a(i13)) {
                    w0Var.f45267o.b(Integer.valueOf(i13), "Local AppMeasurementService processed last upload request. StartId");
                    w0 w0Var2 = n1.s(service2, null, null, null).f44987f;
                    n1.m(w0Var2);
                    w0Var2.f45267o.a("Completed wakeful intent.");
                    p3Var.b(intent);
                }
            }
        };
        l4 l4VarC = l4.C(service);
        l4VarC.d().y(new f(eVarD, l4VarC, runnable));
        return 2;
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
}
