package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class fd extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile s5 f11420a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        if (stringExtra.contains("../") || stringExtra.contains("/..")) {
            StringBuilder sb2 = new StringBuilder(stringExtra.length() + 68);
            sb2.append("Got an invalid config package for P/H that includes '..': ");
            sb2.append(stringExtra);
            sb2.append(". Exiting.");
            Log.w("PhUpdateBroadcastRecv", sb2.toString());
            return;
        }
        s5 s5Var = f11420a;
        if (s5Var == null) {
            Log.w("PhUpdateBroadcastRecv", "No callback registered for P/H UPDATE broadcast. Exiting.");
            return;
        }
        jc jcVar = (jc) ((ConcurrentHashMap) ((s5) s5Var.f11844b).f11844b).get(stringExtra);
        if (jcVar != null) {
            jcVar.f11519a.b();
        }
    }
}
