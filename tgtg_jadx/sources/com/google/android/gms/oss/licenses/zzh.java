package com.google.android.gms.oss.licenses;

import android.os.RemoteException;
import com.google.android.gms.common.api.b;
import d10.g;
import java.util.Objects;
import qz.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzh extends u {
    final /* synthetic */ String zza;

    public zzh(zzk zzkVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzkVar);
    }

    @Override // qz.u
    public final /* bridge */ /* synthetic */ void doExecute(b bVar, g gVar) throws RemoteException {
        gVar.b(((zzl) bVar).zzp(this.zza));
    }
}
