package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n0 extends d0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f11157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f11158h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(f fVar, int i11, IBinder iBinder, Bundle bundle) {
        super(fVar, i11, bundle);
        this.f11158h = fVar;
        this.f11157g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.d0
    public final boolean a() {
        IBinder iBinder = this.f11157g;
        try {
            i0.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            f fVar = this.f11158h;
            if (!fVar.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = fVar.getServiceDescriptor();
                Log.w("GmsClient", e0.f.o(new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", serviceDescriptor, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface iInterfaceCreateServiceInterface = fVar.createServiceInterface(iBinder);
            if (iInterfaceCreateServiceInterface == null || !(fVar.zze(2, 4, iInterfaceCreateServiceInterface) || fVar.zze(3, 4, iInterfaceCreateServiceInterface))) {
                return false;
            }
            fVar.zzn(null);
            b bVarZzk = fVar.zzk();
            Bundle connectionHint = fVar.getConnectionHint();
            if (bVarZzk == null) {
                return true;
            }
            fVar.zzk().d(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // com.google.android.gms.common.internal.d0
    public final void b(pz.b bVar) {
        f fVar = this.f11158h;
        if (fVar.zzl() != null) {
            fVar.zzl().a(bVar);
        }
        fVar.onConnectionFailed(bVar);
    }
}
