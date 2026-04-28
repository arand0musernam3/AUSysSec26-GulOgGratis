package com.google.android.gms.wallet.button;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.i0;
import e10.b0;
import java.util.Arrays;
import lx.u;
import rz.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class ButtonOptions extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<ButtonOptions> CREATOR = new b0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12183e = false;

    public final boolean equals(Object obj) {
        if (obj instanceof ButtonOptions) {
            ButtonOptions buttonOptions = (ButtonOptions) obj;
            if (i0.k(Integer.valueOf(this.f12179a), Integer.valueOf(buttonOptions.f12179a)) && i0.k(Integer.valueOf(this.f12180b), Integer.valueOf(buttonOptions.f12180b)) && i0.k(Integer.valueOf(this.f12181c), Integer.valueOf(buttonOptions.f12181c)) && i0.k(this.f12182d, buttonOptions.f12182d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12179a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        int i12 = this.f12179a;
        u.g0(parcel, 1, 4);
        parcel.writeInt(i12);
        int i13 = this.f12180b;
        u.g0(parcel, 2, 4);
        parcel.writeInt(i13);
        int i14 = this.f12181c;
        u.g0(parcel, 3, 4);
        parcel.writeInt(i14);
        u.b0(this.f12182d, parcel, 4);
        u.i0(iH0, parcel);
    }
}
