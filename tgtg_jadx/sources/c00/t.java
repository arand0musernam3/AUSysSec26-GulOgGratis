package c00;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ax.n0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends rz.a {

    @NotNull
    public static final Parcelable.Creator<t> CREATOR = new n0(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f6834c;

    public t(String str, String str2, Bundle bundle) {
        str.getClass();
        bundle.getClass();
        this.f6832a = str;
        this.f6833b = str2;
        this.f6834c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.b0(this.f6832a, parcel, 1);
        lx.u.b0(this.f6833b, parcel, 2);
        lx.u.S(parcel, 3, this.f6834c);
        lx.u.i0(iH0, parcel);
    }
}
