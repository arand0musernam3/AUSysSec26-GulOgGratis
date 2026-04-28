package e10;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends rz.a {

    @NonNull
    public static final Parcelable.Creator<m> CREATOR = new com.google.android.gms.common.internal.v(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f15530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r f15532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f15533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o f15534g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s f15535h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15536i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f15537j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f15538k;
    public Bundle l;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        boolean z11 = this.f15528a;
        lx.u.g0(parcel, 1, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.f15529b;
        lx.u.g0(parcel, 2, 4);
        parcel.writeInt(z12 ? 1 : 0);
        lx.u.a0(parcel, 3, this.f15530c, i11);
        boolean z13 = this.f15531d;
        lx.u.g0(parcel, 4, 4);
        parcel.writeInt(z13 ? 1 : 0);
        lx.u.a0(parcel, 5, this.f15532e, i11);
        lx.u.Y(parcel, 6, this.f15533f);
        lx.u.a0(parcel, 7, this.f15534g, i11);
        lx.u.a0(parcel, 8, this.f15535h, i11);
        boolean z14 = this.f15536i;
        lx.u.g0(parcel, 9, 4);
        parcel.writeInt(z14 ? 1 : 0);
        lx.u.b0(this.f15537j, parcel, 10);
        lx.u.S(parcel, 11, this.l);
        lx.u.T(parcel, 12, this.f15538k);
        lx.u.i0(iH0, parcel);
    }
}
