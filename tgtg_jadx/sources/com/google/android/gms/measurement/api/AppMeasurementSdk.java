package com.google.android.gms.measurement.api;

import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.a7;
import com.google.android.gms.internal.measurement.m6;
import com.google.android.gms.internal.measurement.q6;
import com.google.android.gms.internal.measurement.s6;
import com.google.android.gms.internal.measurement.t6;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.x6;
import java.util.ArrayList;
import s30.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class AppMeasurementSdk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a7 f12154a;

    public AppMeasurementSdk(a7 a7Var) {
        this.f12154a = a7Var;
    }

    @NonNull
    @Keep
    public static AppMeasurementSdk getInstance(@NonNull Context context) {
        return a7.c(context, null).f11246b;
    }

    public final void a(b bVar) {
        a7 a7Var = this.f12154a;
        ArrayList arrayList = a7Var.f11247c;
        synchronized (arrayList) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                try {
                    if (bVar.equals(((Pair) arrayList.get(i11)).first)) {
                        Log.w("FA", "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            x6 x6Var = new x6(bVar);
            arrayList.add(new Pair(bVar, x6Var));
            if (a7Var.f11250f != null) {
                try {
                    a7Var.f11250f.registerOnMeasurementEventListener(x6Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            a7Var.a(new m6(a7Var, x6Var, 4));
        }
    }

    @Keep
    public void beginAdUnitExposure(@NonNull String str) {
        a7 a7Var = this.f12154a;
        a7Var.a(new q6(a7Var, str, 0));
    }

    @Keep
    public void endAdUnitExposure(@NonNull String str) {
        a7 a7Var = this.f12154a;
        a7Var.a(new q6(a7Var, str, 1));
    }

    @Keep
    public long generateEventId() {
        return this.f12154a.d();
    }

    @Keep
    public String getAppInstanceId() {
        x5 x5Var = new x5();
        a7 a7Var = this.f12154a;
        a7Var.a(new s6(a7Var, x5Var, 1));
        return (String) x5.C(x5Var.b(50L), String.class);
    }

    @Keep
    public String getGmpAppId() {
        x5 x5Var = new x5();
        a7 a7Var = this.f12154a;
        a7Var.a(new s6(a7Var, x5Var, 0));
        return (String) x5.C(x5Var.b(500L), String.class);
    }

    @Keep
    public void logEvent(@NonNull String str, @NonNull String str2, Bundle bundle) {
        a7 a7Var = this.f12154a;
        a7Var.a(new t6(a7Var, str, str2, bundle, true));
    }
}
