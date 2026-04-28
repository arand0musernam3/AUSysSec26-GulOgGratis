package m00;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends rz.a {
    public static final Parcelable.Creator<j> CREATOR = new jz.l(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f28671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinder f28672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PendingIntent f28673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f28674e;

    public j(int i11, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.f28670a = i11;
        this.f28671b = iBinder;
        this.f28672c = iBinder2;
        this.f28673d = pendingIntent;
        this.f28674e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.g0(parcel, 1, 4);
        parcel.writeInt(this.f28670a);
        lx.u.W(parcel, 2, this.f28671b);
        lx.u.W(parcel, 3, this.f28672c);
        lx.u.a0(parcel, 4, this.f28673d, i11);
        lx.u.b0(this.f28674e, parcel, 6);
        lx.u.i0(iH0, parcel);
    }
}
