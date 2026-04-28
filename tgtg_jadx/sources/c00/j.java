package c00;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ax.n0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends rz.a {

    @NotNull
    public static final Parcelable.Creator<j> CREATOR = new n0(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f6821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f6822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6825f;

    public j(String str, Bundle bundle, Bundle bundle2, String str2, String str3, String str4) {
        str.getClass();
        bundle.getClass();
        bundle2.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f6820a = str;
        this.f6821b = bundle;
        this.f6822c = bundle2;
        this.f6823d = str2;
        this.f6824e = str3;
        this.f6825f = str4;
        boolean z11 = (StringsKt.H(str3) || StringsKt.H(str4)) ? false : true;
        boolean z12 = !StringsKt.H(str) && str3.length() == 0 && str4.length() == 0;
        if (z11 || z12) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + String.valueOf(str).length() + 31 + String.valueOf(str3).length() + 19 + 69);
        j4.s.A(sb2, "Either type: ", str, ", or requestType: ", str3);
        i4.a.f(e0.f.n(sb2, " and protocolType: ", str4, " must be specified, but at least one contains an invalid blank value."));
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.b0(this.f6820a, parcel, 1);
        lx.u.S(parcel, 2, this.f6821b);
        lx.u.S(parcel, 3, this.f6822c);
        lx.u.b0(this.f6823d, parcel, 4);
        lx.u.b0(this.f6824e, parcel, 5);
        lx.u.b0(this.f6825f, parcel, 6);
        lx.u.i0(iH0, parcel);
    }
}
