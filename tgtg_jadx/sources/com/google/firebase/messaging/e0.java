package com.google.firebase.messaging;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f12797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FirebaseMessaging f12798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadPoolExecutor f12799d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new wz.a("firebase-iid-executor"));

    public e0(FirebaseMessaging firebaseMessaging, long j9) {
        this.f12798c = firebaseMessaging;
        this.f12796a = j9;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.getApplicationContext().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f12797b = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f12798c.getApplicationContext().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() throws IOException {
        try {
            if (this.f12798c.blockingGetToken() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e5) {
            String message = e5.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e5.getMessage() != null) {
                    throw e5;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e5.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        a0 a0VarJ = a0.J();
        FirebaseMessaging firebaseMessaging = this.f12798c;
        boolean zP = a0VarJ.P(firebaseMessaging.getApplicationContext());
        PowerManager.WakeLock wakeLock = this.f12797b;
        if (zP) {
            wakeLock.acquire();
        }
        try {
            try {
                firebaseMessaging.setSyncScheduledOrRunning(true);
                if (!firebaseMessaging.isGmsCorePresent()) {
                    firebaseMessaging.setSyncScheduledOrRunning(false);
                    if (a0.J().P(firebaseMessaging.getApplicationContext())) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (!a0.J().O(firebaseMessaging.getApplicationContext()) || a()) {
                    if (b()) {
                        firebaseMessaging.setSyncScheduledOrRunning(false);
                    } else {
                        firebaseMessaging.syncWithDelaySecondsInternal(this.f12796a);
                    }
                    if (a0.J().P(firebaseMessaging.getApplicationContext())) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                d0 d0Var = new d0();
                d0Var.f12794c = this;
                d0Var.a();
                if (a0.J().P(firebaseMessaging.getApplicationContext())) {
                    wakeLock.release();
                }
            } catch (IOException e5) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e5.getMessage() + ". Won't retry the operation.");
                firebaseMessaging.setSyncScheduledOrRunning(false);
                if (a0.J().P(firebaseMessaging.getApplicationContext())) {
                    wakeLock.release();
                }
            }
        } catch (Throwable th2) {
            if (a0.J().P(firebaseMessaging.getApplicationContext())) {
                wakeLock.release();
            }
            throw th2;
        }
    }
}
