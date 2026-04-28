package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends Service {
    static final long MESSAGE_TIMEOUT_S = 20;
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    final ExecutorService executor;
    private int lastStartId;
    private final Object lock;
    private int runningTasks;

    public f() {
        wz.a aVar = new wz.a("Firebase-Messaging-Intent-Handle");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), aVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.lock = new Object();
        this.runningTasks = 0;
    }

    public static Task access$000(f fVar, Intent intent) {
        if (fVar.handleIntentOnMainThread(intent)) {
            return Tasks.d(null);
        }
        d10.g gVar = new d10.g();
        fVar.executor.execute(new a40.q(fVar, intent, gVar, 13));
        return gVar.f13697a;
    }

    public final void b(Intent intent) {
        if (intent != null) {
            l0.c(intent);
        }
        synchronized (this.lock) {
            try {
                int i11 = this.runningTasks - 1;
                this.runningTasks = i11;
                if (i11 == 0) {
                    stopSelfResultHook(this.lastStartId);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract Intent getStartCommandIntent(Intent intent);

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Service received bind request");
            }
            if (this.binder == null) {
                this.binder = new m0(new se.d(this, 9));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i11, int i12) {
        d10.o oVarD;
        synchronized (this.lock) {
            this.lastStartId = i12;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            b(intent);
            return 2;
        }
        if (handleIntentOnMainThread(startCommandIntent)) {
            oVarD = Tasks.d(null);
        } else {
            d10.g gVar = new d10.g();
            this.executor.execute(new a40.q(this, startCommandIntent, gVar, 13));
            oVarD = gVar.f13697a;
        }
        if (oVarD.m()) {
            b(intent);
            return 2;
        }
        oVarD.c(new l0.b(0), new a50.d(6, this, intent));
        return 3;
    }

    public boolean stopSelfResultHook(int i11) {
        return stopSelfResult(i11);
    }
}
