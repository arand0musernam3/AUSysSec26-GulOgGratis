package a00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 extends rz.a {

    @NonNull
    public static final Parcelable.Creator<f0> CREATOR = new g0(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final short f102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f103c;

    public f0(int i11, short s7, short s8) {
        this.f101a = i11;
        this.f102b = s7;
        this.f103c = s8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f101a == f0Var.f101a && this.f102b == f0Var.f102b && this.f103c == f0Var.f103c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f101a), Short.valueOf(this.f102b), Short.valueOf(this.f103c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.g0(parcel, 1, 4);
        parcel.writeInt(this.f101a);
        lx.u.g0(parcel, 2, 4);
        parcel.writeInt(this.f102b);
        lx.u.g0(parcel, 3, 4);
        parcel.writeInt(this.f103c);
        lx.u.i0(iH0, parcel);
    }
}
