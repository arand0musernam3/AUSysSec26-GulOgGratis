package e10;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identity.intents.model.UserAddress;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends rz.a {

    @NonNull
    public static final Parcelable.Creator<b> CREATOR = new com.google.android.gms.common.internal.v(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public UserAddress f15475e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.b0(this.f15471a, parcel, 1);
        lx.u.b0(this.f15472b, parcel, 2);
        lx.u.b0(this.f15473c, parcel, 3);
        int i12 = this.f15474d;
        lx.u.g0(parcel, 4, 4);
        parcel.writeInt(i12);
        lx.u.a0(parcel, 5, this.f15475e, i11);
        lx.u.i0(iH0, parcel);
    }
}
