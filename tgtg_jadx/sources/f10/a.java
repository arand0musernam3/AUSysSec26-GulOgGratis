package f10;

import android.os.Parcel;
import android.os.Parcelable;
import e10.b0;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends rz.a {
    public static final Parcelable.Creator<a> CREATOR = new b0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f17044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f17047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f17048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f17049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f17050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f17051h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f17052i;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.b0(this.f17044a, parcel, 1);
        int i12 = this.f17045b;
        u.g0(parcel, 2, 4);
        parcel.writeInt(i12);
        boolean z11 = this.f17046c;
        u.g0(parcel, 3, 4);
        parcel.writeInt(z11 ? 1 : 0);
        u.b0(this.f17047d, parcel, 4);
        u.b0(this.f17048e, parcel, 5);
        u.b0(this.f17049f, parcel, 6);
        u.b0(this.f17050g, parcel, 7);
        u.b0(this.f17051h, parcel, 8);
        u.b0(this.f17052i, parcel, 9);
        u.i0(iH0, parcel);
    }
}
