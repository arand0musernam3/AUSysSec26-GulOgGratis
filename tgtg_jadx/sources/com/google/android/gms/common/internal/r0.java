package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f11182a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11183b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IBinder f11185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q0 f11186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ComponentName f11187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t0 f11188g;

    public r0(t0 t0Var, q0 q0Var) {
        this.f11188g = t0Var;
        this.f11186e = q0Var;
    }

    public final pz.b a(String str, Executor executor) throws Throwable {
        try {
            Intent intentA = j0.a(this.f11188g.f11198e, this.f11186e);
            this.f11183b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(vz.g.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                t0 t0Var = this.f11188g;
                uz.a aVar = t0Var.f11200g;
                Context context = t0Var.f11198e;
                q0 q0Var = this.f11186e;
                try {
                    boolean zD = aVar.d(context, str, intentA, this, 4225, executor);
                    this.f11184c = zD;
                    if (zD) {
                        t0Var.f11199f.sendMessageDelayed(t0Var.f11199f.obtainMessage(1, q0Var), t0Var.f11202i);
                        pz.b bVar = pz.b.f35642f;
                        StrictMode.setVmPolicy(vmPolicy);
                        return bVar;
                    }
                    this.f11183b = 2;
                    try {
                        t0Var.f11200g.c(t0Var.f11198e, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    pz.b bVar2 = new pz.b(16, null, null);
                    StrictMode.setVmPolicy(vmPolicy);
                    return bVar2;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    StrictMode.setVmPolicy(vmPolicy);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (zzaf e5) {
            return e5.f11216a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        t0 t0Var = this.f11188g;
        synchronized (t0Var.f11197d) {
            try {
                t0Var.f11199f.removeMessages(1, this.f11186e);
                this.f11185d = iBinder;
                this.f11187f = componentName;
                Iterator it = this.f11182a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f11183b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        t0 t0Var = this.f11188g;
        synchronized (t0Var.f11197d) {
            try {
                t0Var.f11199f.removeMessages(1, this.f11186e);
                this.f11185d = null;
                this.f11187f = componentName;
                Iterator it = this.f11182a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f11183b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
