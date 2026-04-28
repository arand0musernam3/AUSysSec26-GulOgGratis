package com.google.firebase.messaging;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.measurement.w5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12792a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f12793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f12794c;

    public d0(oz.m mVar) {
        this.f12794c = mVar;
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        e0 e0Var = (e0) this.f12794c;
        if (e0Var != null) {
            Context applicationContext = e0Var.f12798c.getApplicationContext();
            this.f12793b = applicationContext;
            applicationContext.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f12792a) {
            case 0:
                e0 e0Var = (e0) this.f12794c;
                if (e0Var != null && e0Var.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    e0 e0Var2 = (e0) this.f12794c;
                    e0Var2.f12798c.enqueueTaskWithDelaySeconds(e0Var2, 0L);
                    Context context2 = this.f12793b;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.f12794c = null;
                    return;
                }
                return;
            default:
                Uri data = intent.getData();
                if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
                    oz.m mVar = (oz.m) this.f12794c;
                    qz.w wVar = (qz.w) ((x0.f) mVar.f33837c).f43628c;
                    wVar.f37394c.set(null);
                    w5 w5Var = wVar.f37398g.f37348n;
                    w5Var.sendMessage(w5Var.obtainMessage(3));
                    AlertDialog alertDialog = (AlertDialog) mVar.f33836b;
                    if (alertDialog.isShowing()) {
                        alertDialog.dismiss();
                    }
                    synchronized (this) {
                        try {
                            Context context3 = this.f12793b;
                            if (context3 != null) {
                                context3.unregisterReceiver(this);
                            }
                            this.f12793b = null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ d0() {
    }
}
