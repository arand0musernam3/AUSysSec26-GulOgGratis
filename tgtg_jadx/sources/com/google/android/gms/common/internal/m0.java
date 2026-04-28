package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f11156b;

    public m0(f fVar, int i11) {
        this.f11156b = fVar;
        this.f11155a = i11;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        f fVar = this.f11156b;
        if (iBinder == null) {
            fVar.zzf(16);
            return;
        }
        synchronized (fVar.zzh()) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                fVar.zzi((iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof o)) ? new e0(iBinder) : (o) iInterfaceQueryLocalInterface);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f11156b.zzb(0, null, this.f11155a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        f fVar = this.f11156b;
        synchronized (fVar.zzh()) {
            fVar.zzi(null);
        }
        f fVar2 = this.f11156b;
        int i11 = this.f11155a;
        Handler handler = fVar2.zzb;
        handler.sendMessage(handler.obtainMessage(6, i11, 1));
    }
}
