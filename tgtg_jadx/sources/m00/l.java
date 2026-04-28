package m00;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends rz.a {
    public static final Parcelable.Creator<l> CREATOR = new jz.l(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f28677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s00.m f28678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s00.j f28679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PendingIntent f28680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v f28681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f28682g;

    public l(int i11, k kVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        s00.m kVar2;
        s00.j iVar;
        this.f28676a = i11;
        this.f28677b = kVar;
        v tVar = null;
        if (iBinder != null) {
            int i12 = s00.l.f38520h;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            kVar2 = iInterfaceQueryLocalInterface instanceof s00.m ? (s00.m) iInterfaceQueryLocalInterface : new s00.k(iBinder, "com.google.android.gms.location.ILocationListener", 4);
        } else {
            kVar2 = null;
        }
        this.f28678c = kVar2;
        this.f28680e = pendingIntent;
        if (iBinder2 != null) {
            int i13 = g.f28659i;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            iVar = iInterfaceQueryLocalInterface2 instanceof s00.j ? (s00.j) iInterfaceQueryLocalInterface2 : new s00.i(iBinder2, "com.google.android.gms.location.ILocationCallback", 4);
        } else {
            iVar = null;
        }
        this.f28679d = iVar;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            tVar = iInterfaceQueryLocalInterface3 instanceof v ? (v) iInterfaceQueryLocalInterface3 : new t(iBinder3, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 4);
        }
        this.f28681f = tVar;
        this.f28682g = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.g0(parcel, 1, 4);
        parcel.writeInt(this.f28676a);
        lx.u.a0(parcel, 2, this.f28677b, i11);
        s00.m mVar = this.f28678c;
        lx.u.W(parcel, 3, mVar == null ? null : mVar.asBinder());
        lx.u.a0(parcel, 4, this.f28680e, i11);
        s00.j jVar = this.f28679d;
        lx.u.W(parcel, 5, jVar == null ? null : jVar.asBinder());
        v vVar = this.f28681f;
        lx.u.W(parcel, 6, vVar != null ? vVar.asBinder() : null);
        lx.u.b0(this.f28682g, parcel, 8);
        lx.u.i0(iH0, parcel);
    }
}
