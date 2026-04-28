package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class da extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f11341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f11342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o30.b1 f11343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s5 f11344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Executor f11345e;

    public da(AtomicBoolean atomicBoolean, Context context, o30.b1 b1Var, s5 s5Var, Executor executor) {
        this.f11341a = atomicBoolean;
        this.f11342b = context;
        this.f11343c = b1Var;
        this.f11344d = s5Var;
        this.f11345e = executor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f11341a.compareAndSet(false, true)) {
            try {
                this.f11342b.unregisterReceiver(this);
            } catch (IllegalArgumentException e5) {
                Log.w("DirectBootUtils", "Failed to unregister receiver", e5);
            }
            o30.b1 b1Var = this.f11343c;
            s5 s5Var = this.f11344d;
            Executor executor = this.f11345e;
            o30.d1 d1Var = new o30.d1();
            d1Var.f31868i = new o30.c1(d1Var, s5Var);
            executor.execute(d1Var);
            b1Var.o(d1Var);
        }
    }
}
