package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import u6.f;
import v8.a;
import y00.n1;
import y00.w0;
import zendesk.messaging.android.internal.conversationscreen.TimeConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AppMeasurementReceiver extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f12152c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f12152c == null) {
            this.f12152c = new f(this);
        }
        f fVar = this.f12152c;
        fVar.getClass();
        w0 w0Var = n1.s(context, null, null, null).f44987f;
        n1.m(w0Var);
        if (intent == null) {
            w0Var.f45263j.a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        w0Var.f45267o.b(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                w0Var.f45263j.a("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        w0Var.f45267o.a("Starting wakeful intent.");
        ((AppMeasurementReceiver) fVar.f40820a).getClass();
        SparseArray sparseArray = a.f42064a;
        synchronized (sparseArray) {
            try {
                int i11 = a.f42065b;
                int i12 = i11 + 1;
                a.f42065b = i12;
                if (i12 <= 0) {
                    a.f42065b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i11);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(TimeConstants.ONE_MINUTE_DIFFERENCE);
                sparseArray.put(i11, wakeLockNewWakeLock);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
