package com.google.android.gms.oss.licenses;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import o00.a;
import o00.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzb extends a implements IInterface {
    public zzb(IBinder iBinder) {
        super(iBinder);
    }

    public final String zzc(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzb = zzb(2, parcelZza);
        String string = parcelZzb.readString();
        parcelZzb.recycle();
        return string;
    }

    public final String zzd(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzb = zzb(4, parcelZza);
        String string = parcelZzb.readString();
        parcelZzb.recycle();
        return string;
    }

    public final List zze(List list) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeList(list);
        Parcel parcelZzb = zzb(5, parcelZza);
        ArrayList arrayList = parcelZzb.readArrayList(o.f31720a);
        parcelZzb.recycle();
        return arrayList;
    }
}
