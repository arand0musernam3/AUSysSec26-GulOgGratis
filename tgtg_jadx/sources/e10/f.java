package e10;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends rz.a {

    @NonNull
    public static final Parcelable.Creator<f> CREATOR = new com.google.android.gms.common.internal.v(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f15486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f15489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f15491f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.Y(parcel, 2, this.f15486a);
        lx.u.b0(this.f15487b, parcel, 4);
        lx.u.b0(this.f15488c, parcel, 5);
        lx.u.Y(parcel, 6, this.f15489d);
        boolean z11 = this.f15490e;
        lx.u.g0(parcel, 7, 4);
        parcel.writeInt(z11 ? 1 : 0);
        lx.u.b0(this.f15491f, parcel, 8);
        lx.u.i0(iH0, parcel);
    }
}
