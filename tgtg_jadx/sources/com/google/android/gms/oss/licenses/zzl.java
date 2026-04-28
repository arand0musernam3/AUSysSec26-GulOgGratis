package com.google.android.gms.oss.licenses;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.List;
import o00.v1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzl extends l {
    public zzl(Context context, Looper looper, i iVar, m mVar, n nVar) {
        super(context, looper, ModuleDescriptor.MODULE_VERSION, iVar, mVar, nVar);
    }

    private final zzb zzs() {
        try {
            return (zzb) getService();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.common.internal.f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.oss.licenses.IOSSLicenseService");
        return iInterfaceQueryLocalInterface instanceof zzb ? (zzb) iInterfaceQueryLocalInterface : new zzb(iBinder);
    }

    @Override // com.google.android.gms.common.internal.f
    public final boolean enableLocalFallback() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.f
    public final int getMinApkVersion() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.oss.licenses.IOSSLicenseService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.oss.licenses.service.START";
    }

    public final synchronized String zzp(String str) throws RemoteException {
        zzb zzbVarZzs;
        zzbVarZzs = zzs();
        if (zzbVarZzs == null) {
            throw new RemoteException("no service for getLicenseDetail call");
        }
        return zzbVarZzs.zzc(str);
    }

    public final synchronized String zzq(v1 v1Var) throws RemoteException {
        zzb zzbVarZzs;
        zzbVarZzs = zzs();
        if (zzbVarZzs == null) {
            throw new RemoteException("no service for getLicenseDetail call");
        }
        return zzbVarZzs.zzd(v1Var.f31757a);
    }

    public final synchronized List zzr(List list) throws RemoteException {
        zzb zzbVarZzs;
        zzbVarZzs = zzs();
        if (zzbVarZzs == null) {
            throw new RemoteException("no service for getLicenseDetail call");
        }
        return zzbVarZzs.zze(list);
    }
}
