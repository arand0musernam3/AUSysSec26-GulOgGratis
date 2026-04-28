package e10;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identity.intents.model.UserAddress;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends rz.a {

    @NonNull
    public static final Parcelable.Creator<l> CREATOR = new com.google.android.gms.common.internal.v(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f15521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public UserAddress f15522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f15523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f15524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f15525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f15526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Bundle f15527h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.b0(this.f15520a, parcel, 1);
        lx.u.a0(parcel, 2, this.f15521b, i11);
        lx.u.a0(parcel, 3, this.f15522c, i11);
        lx.u.a0(parcel, 4, this.f15523d, i11);
        lx.u.b0(this.f15524e, parcel, 5);
        lx.u.S(parcel, 6, this.f15525f);
        lx.u.b0(this.f15526g, parcel, 7);
        lx.u.S(parcel, 8, this.f15527h);
        lx.u.i0(iH0, parcel);
    }
}
