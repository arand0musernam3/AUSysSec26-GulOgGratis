package y00;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b4 extends rz.a {
    public static final Parcelable.Creator<b4> CREATOR = new s00.e(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f44624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f44626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f44627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f44628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f44629g;

    public b4(long j9, byte[] bArr, String str, Bundle bundle, int i11, long j11, String str2) {
        this.f44623a = j9;
        this.f44624b = bArr;
        this.f44625c = str;
        this.f44626d = bundle;
        this.f44627e = i11;
        this.f44628f = j11;
        this.f44629g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.g0(parcel, 1, 8);
        parcel.writeLong(this.f44623a);
        lx.u.T(parcel, 2, this.f44624b);
        lx.u.b0(this.f44625c, parcel, 3);
        lx.u.S(parcel, 4, this.f44626d);
        lx.u.g0(parcel, 5, 4);
        parcel.writeInt(this.f44627e);
        lx.u.g0(parcel, 6, 8);
        parcel.writeLong(this.f44628f);
        lx.u.b0(this.f44629g, parcel, 7);
        lx.u.i0(iH0, parcel);
    }
}
