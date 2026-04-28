package a00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends rz.a {

    @NonNull
    public static final Parcelable.Creator<f> CREATOR = new g0(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f100a;

    public f(boolean z11) {
        this.f100a = z11;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f) && this.f100a == ((f) obj).f100a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f100a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.g0(parcel, 1, 4);
        parcel.writeInt(this.f100a ? 1 : 0);
        lx.u.i0(iH0, parcel);
    }
}
