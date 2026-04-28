package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.measurement.w5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k0 extends w5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f11149a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(f fVar, Looper looper) {
        super(looper, 3);
        this.f11149a = fVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        d0 d0Var;
        f fVar = this.f11149a;
        int i11 = fVar.zzd.get();
        int i12 = message.arg1;
        int i13 = message.what;
        if (i11 != i12) {
            if ((i13 == 2 || i13 == 1 || i13 == 7) && (d0Var = (d0) message.obj) != null) {
                synchronized (d0Var) {
                    d0Var.f11105a = null;
                }
                f fVar2 = d0Var.f11107c;
                synchronized (fVar2.zzj()) {
                    fVar2.zzj().remove(d0Var);
                }
                return;
            }
            return;
        }
        if ((i13 == 1 || i13 == 7 || ((i13 == 4 && !fVar.enableLocalFallback()) || message.what == 5)) && !fVar.isConnecting()) {
            d0 d0Var2 = (d0) message.obj;
            if (d0Var2 != null) {
                synchronized (d0Var2) {
                    d0Var2.f11105a = null;
                }
                f fVar3 = d0Var2.f11107c;
                synchronized (fVar3.zzj()) {
                    fVar3.zzj().remove(d0Var2);
                }
                return;
            }
            return;
        }
        int i14 = message.what;
        if (i14 == 4) {
            fVar.zzn(new pz.b(message.arg2, null, null));
            if (fVar.zzg() && !fVar.zzo()) {
                fVar.zzd(3, null);
                return;
            }
            pz.b bVarZzm = fVar.zzm() != null ? fVar.zzm() : new pz.b(8, null, null);
            fVar.zzc.c(bVarZzm);
            fVar.onConnectionFailed(bVarZzm);
            return;
        }
        if (i14 == 5) {
            pz.b bVarZzm2 = fVar.zzm() != null ? fVar.zzm() : new pz.b(8, null, null);
            fVar.zzc.c(bVarZzm2);
            fVar.onConnectionFailed(bVarZzm2);
            return;
        }
        if (i14 == 3) {
            Object obj = message.obj;
            pz.b bVar = new pz.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null);
            fVar.zzc.c(bVar);
            fVar.onConnectionFailed(bVar);
            return;
        }
        if (i14 == 6) {
            fVar.zzd(5, null);
            if (fVar.zzk() != null) {
                fVar.zzk().b(message.arg2);
            }
            fVar.onConnectionSuspended(message.arg2);
            fVar.zze(5, 1, null);
            return;
        }
        if (i14 == 2 && !fVar.isConnected()) {
            d0 d0Var3 = (d0) message.obj;
            if (d0Var3 != null) {
                synchronized (d0Var3) {
                    d0Var3.f11105a = null;
                }
                f fVar4 = d0Var3.f11107c;
                synchronized (fVar4.zzj()) {
                    fVar4.zzj().remove(d0Var3);
                }
                return;
            }
            return;
        }
        int i15 = message.what;
        if (i15 != 2 && i15 != 1 && i15 != 7) {
            Log.wtf("GmsClient", e0.f.h(i15, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i15).length() + 34)), new Exception());
            return;
        }
        d0 d0Var4 = (d0) message.obj;
        synchronized (d0Var4) {
            try {
                bool = d0Var4.f11105a;
                if (d0Var4.f11106b) {
                    String string = d0Var4.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 47);
                    sb2.append("Callback proxy ");
                    sb2.append(string);
                    sb2.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb2.toString());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (bool != null) {
            f fVar5 = d0Var4.f11110f;
            int i16 = d0Var4.f11108d;
            if (i16 != 0) {
                fVar5.zzd(1, null);
                Bundle bundle = d0Var4.f11109e;
                d0Var4.b(new pz.b(i16, bundle != null ? (PendingIntent) bundle.getParcelable(f.KEY_PENDING_INTENT) : null, null));
            } else if (!d0Var4.a()) {
                fVar5.zzd(1, null);
                d0Var4.b(new pz.b(8, null, null));
            }
        }
        synchronized (d0Var4) {
            d0Var4.f11106b = true;
        }
        synchronized (d0Var4) {
            d0Var4.f11105a = null;
        }
        f fVar6 = d0Var4.f11107c;
        synchronized (fVar6.zzj()) {
            fVar6.zzj().remove(d0Var4);
        }
    }
}
