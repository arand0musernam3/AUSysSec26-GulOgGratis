package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f12860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f12861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f12862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m0 f12863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12864f;

    public o0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new wz.a("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f12862d = new ArrayDeque();
        this.f12864f = false;
        Context applicationContext = context.getApplicationContext();
        this.f12859a = applicationContext;
        this.f12860b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f12861c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f12862d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                m0 m0Var = this.f12863e;
                if (m0Var == null || !m0Var.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f12863e.a((n0) this.f12862d.poll());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized d10.o b(Intent intent) {
        n0 n0Var;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            n0Var = new n0(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f12861c;
            n0Var.f12853b.f13697a.c(scheduledThreadPoolExecutor, new w.z(scheduledThreadPoolExecutor.schedule(new al.u(n0Var, 26), 20L, TimeUnit.SECONDS), 23));
            this.f12862d.add(n0Var);
            a();
        } catch (Throwable th2) {
            throw th2;
        }
        return n0Var.f12853b.f13697a;
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder("binder is dead. start connection? ");
            sb2.append(!this.f12864f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f12864f) {
            return;
        }
        this.f12864f = true;
        try {
            if (uz.a.b().a(this.f12859a, this.f12860b, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
        } catch (SecurityException e5) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e5);
        }
        this.f12864f = false;
        while (true) {
            ArrayDeque arrayDeque = this.f12862d;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                ((n0) arrayDeque.poll()).f12853b.d(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f12864f = false;
            if (iBinder instanceof m0) {
                this.f12863e = (m0) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.f12862d;
            while (!arrayDeque.isEmpty()) {
                ((n0) arrayDeque.poll()).f12853b.d(null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
