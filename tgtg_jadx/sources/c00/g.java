package c00;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import ax.n0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends rz.a {

    @NotNull
    public static final Parcelable.Creator<g> CREATOR = new n0(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f6811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f6812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ResultReceiver f6815f;

    public g(String str, Bundle bundle, Bundle bundle2, String str2, String str3, ResultReceiver resultReceiver) {
        str.getClass();
        bundle.getClass();
        bundle2.getClass();
        this.f6810a = str;
        this.f6811b = bundle;
        this.f6812c = bundle2;
        this.f6813d = str2;
        this.f6814e = str3;
        this.f6815f = resultReceiver;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.b0(this.f6810a, parcel, 1);
        lx.u.S(parcel, 2, this.f6811b);
        lx.u.S(parcel, 3, this.f6812c);
        lx.u.b0(this.f6813d, parcel, 4);
        lx.u.b0(this.f6814e, parcel, 5);
        lx.u.a0(parcel, 6, this.f6815f, i11);
        lx.u.i0(iH0, parcel);
    }
}
