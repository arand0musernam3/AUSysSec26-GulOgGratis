package e10;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends rz.a {

    @NonNull
    public static final Parcelable.Creator<c> CREATOR = new com.google.android.gms.common.internal.v(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f15477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15480d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.Y(parcel, 1, this.f15477a);
        boolean z11 = this.f15478b;
        lx.u.g0(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.f15479c;
        lx.u.g0(parcel, 3, 4);
        parcel.writeInt(z12 ? 1 : 0);
        int i12 = this.f15480d;
        lx.u.g0(parcel, 4, 4);
        parcel.writeInt(i12);
        lx.u.i0(iH0, parcel);
    }
}
