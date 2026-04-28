package lz;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import jz.l;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends rz.a {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new l(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f28429c;

    public a(int i11, int i12, Bundle bundle) {
        this.f28427a = i11;
        this.f28428b = i12;
        this.f28429c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.g0(parcel, 1, 4);
        parcel.writeInt(this.f28427a);
        u.g0(parcel, 2, 4);
        parcel.writeInt(this.f28428b);
        u.S(parcel, 3, this.f28429c);
        u.i0(iH0, parcel);
    }
}
