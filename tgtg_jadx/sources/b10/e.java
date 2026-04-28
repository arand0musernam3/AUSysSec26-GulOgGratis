package b10;

import android.os.Parcel;
import android.os.Parcelable;
import ax.n0;
import com.google.android.gms.common.internal.c0;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends rz.a {
    public static final Parcelable.Creator<e> CREATOR = new n0(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pz.b f5551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f5552c;

    public e(int i11, pz.b bVar, c0 c0Var) {
        this.f5550a = i11;
        this.f5551b = bVar;
        this.f5552c = c0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.g0(parcel, 1, 4);
        parcel.writeInt(this.f5550a);
        u.a0(parcel, 2, this.f5551b, i11);
        u.a0(parcel, 3, this.f5552c, i11);
        u.i0(iH0, parcel);
    }
}
