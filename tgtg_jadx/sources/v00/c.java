package v00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends rz.a {

    @NonNull
    public static final Parcelable.Creator<c> CREATOR = new s00.e(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LatLng f41636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f41637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f41638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f41641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f41642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f41643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f41644i;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.a0(parcel, 2, this.f41636a, i11);
        double d3 = this.f41637b;
        u.g0(parcel, 3, 8);
        parcel.writeDouble(d3);
        float f11 = this.f41638c;
        u.g0(parcel, 4, 4);
        parcel.writeFloat(f11);
        int i12 = this.f41639d;
        u.g0(parcel, 5, 4);
        parcel.writeInt(i12);
        int i13 = this.f41640e;
        u.g0(parcel, 6, 4);
        parcel.writeInt(i13);
        float f12 = this.f41641f;
        u.g0(parcel, 7, 4);
        parcel.writeFloat(f12);
        boolean z11 = this.f41642g;
        u.g0(parcel, 8, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.f41643h;
        u.g0(parcel, 9, 4);
        parcel.writeInt(z12 ? 1 : 0);
        u.f0(parcel, 10, this.f41644i);
        u.i0(iH0, parcel);
    }
}
