package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.measurement.w5;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t0 extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f11197d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f11198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile w5 f11199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final uz.a f11200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f11201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f11202i;

    public t0(Context context, Looper looper) {
        s0 s0Var = new s0(this);
        this.f11198e = context.getApplicationContext();
        w5 w5Var = new w5(looper, s0Var);
        Looper.getMainLooper();
        this.f11199f = w5Var;
        this.f11200g = uz.a.b();
        this.f11201h = 5000L;
        this.f11202i = 300000L;
    }

    @Override // com.google.android.gms.common.internal.m
    public final pz.b b(q0 q0Var, m0 m0Var, String str, Executor executor) {
        pz.b bVarA;
        HashMap map = this.f11197d;
        synchronized (map) {
            try {
                r0 r0Var = (r0) map.get(q0Var);
                if (executor == null) {
                    executor = null;
                }
                if (r0Var == null) {
                    r0Var = new r0(this, q0Var);
                    r0Var.f11182a.put(m0Var, m0Var);
                    bVarA = r0Var.a(str, executor);
                    map.put(q0Var, r0Var);
                } else {
                    this.f11199f.removeMessages(0, q0Var);
                    if (r0Var.f11182a.containsKey(m0Var)) {
                        String string = q0Var.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 81);
                        sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb2.append(string);
                        throw new IllegalStateException(sb2.toString());
                    }
                    r0Var.f11182a.put(m0Var, m0Var);
                    int i11 = r0Var.f11183b;
                    if (i11 == 1) {
                        m0Var.onServiceConnected(r0Var.f11187f, r0Var.f11185d);
                    } else if (i11 == 2) {
                        bVarA = r0Var.a(str, executor);
                    }
                    bVarA = null;
                }
                if (r0Var.f11184c) {
                    return pz.b.f35642f;
                }
                if (bVarA == null) {
                    bVarA = new pz.b(-1, null, null);
                }
                return bVarA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
