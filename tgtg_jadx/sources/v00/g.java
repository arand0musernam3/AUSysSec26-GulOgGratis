package v00;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.LatLng;
import ky.o;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class g extends rz.a {

    @NonNull
    public static final Parcelable.Creator<g> CREATOR = new s00.e(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LatLng f41651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f41652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f41653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f41654d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f41657g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f41663n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f41665p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f41666q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f41667r;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f41655e = 0.5f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f41656f = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f41658h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f41659i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f41660j = 0.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f41661k = 0.5f;
    public float l = 0.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f41662m = 1.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f41664o = 0;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.a0(parcel, 2, this.f41651a, i11);
        u.b0(this.f41652b, parcel, 3);
        u.b0(this.f41653c, parcel, 4);
        o oVar = this.f41654d;
        u.W(parcel, 5, oVar == null ? null : ((yz.a) oVar.f26718b).asBinder());
        float f11 = this.f41655e;
        u.g0(parcel, 6, 4);
        parcel.writeFloat(f11);
        float f12 = this.f41656f;
        u.g0(parcel, 7, 4);
        parcel.writeFloat(f12);
        boolean z11 = this.f41657g;
        u.g0(parcel, 8, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.f41658h;
        u.g0(parcel, 9, 4);
        parcel.writeInt(z12 ? 1 : 0);
        boolean z13 = this.f41659i;
        u.g0(parcel, 10, 4);
        parcel.writeInt(z13 ? 1 : 0);
        float f13 = this.f41660j;
        u.g0(parcel, 11, 4);
        parcel.writeFloat(f13);
        float f14 = this.f41661k;
        u.g0(parcel, 12, 4);
        parcel.writeFloat(f14);
        float f15 = this.l;
        u.g0(parcel, 13, 4);
        parcel.writeFloat(f15);
        float f16 = this.f41662m;
        u.g0(parcel, 14, 4);
        parcel.writeFloat(f16);
        float f17 = this.f41663n;
        u.g0(parcel, 15, 4);
        parcel.writeFloat(f17);
        int i12 = this.f41664o;
        u.g0(parcel, 17, 4);
        parcel.writeInt(i12);
        u.W(parcel, 18, new yz.b(this.f41665p));
        int i13 = this.f41666q;
        u.g0(parcel, 19, 4);
        parcel.writeInt(i13);
        u.b0(this.f41667r, parcel, 20);
        u.i0(iH0, parcel);
    }
}
