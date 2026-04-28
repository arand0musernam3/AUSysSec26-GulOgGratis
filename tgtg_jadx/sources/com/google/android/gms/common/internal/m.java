package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f11152a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static t0 f11153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static HandlerThread f11154c;

    public static t0 a(Context context) {
        synchronized (f11152a) {
            try {
                if (f11153b == null) {
                    f11153b = new t0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f11153b;
    }

    public abstract pz.b b(q0 q0Var, m0 m0Var, String str, Executor executor);

    public final void c(String str, String str2, ServiceConnection serviceConnection, boolean z11) {
        q0 q0Var = new q0(str, str2, z11);
        t0 t0Var = (t0) this;
        i0.i(serviceConnection, "ServiceConnection must not be null");
        HashMap map = t0Var.f11197d;
        synchronized (map) {
            try {
                r0 r0Var = (r0) map.get(q0Var);
                if (r0Var == null) {
                    String string = q0Var.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 50);
                    sb2.append("Nonexistent connection status for service config: ");
                    sb2.append(string);
                    throw new IllegalStateException(sb2.toString());
                }
                if (!r0Var.f11182a.containsKey(serviceConnection)) {
                    String string2 = q0Var.toString();
                    StringBuilder sb3 = new StringBuilder(string2.length() + 76);
                    sb3.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb3.append(string2);
                    throw new IllegalStateException(sb3.toString());
                }
                r0Var.f11182a.remove(serviceConnection);
                if (r0Var.f11182a.isEmpty()) {
                    t0Var.f11199f.sendMessageDelayed(t0Var.f11199f.obtainMessage(0, q0Var), t0Var.f11201h);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
