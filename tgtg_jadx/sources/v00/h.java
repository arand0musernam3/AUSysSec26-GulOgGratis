package v00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.i0;
import java.util.Arrays;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends rz.a {

    @NonNull
    public static final Parcelable.Creator<h> CREATOR = new s00.e(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Float f41669b;

    public h(int i11, Float f11) {
        boolean z11 = true;
        if (i11 != 1 && (f11 == null || f11.floatValue() < 0.0f)) {
            z11 = false;
        }
        i0.a("Invalid PatternItem: type=" + i11 + " length=" + f11, z11);
        this.f41668a = i11;
        this.f41669b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f41668a == hVar.f41668a && i0.k(this.f41669b, hVar.f41669b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f41668a), this.f41669b});
    }

    public final String toString() {
        return "[PatternItem: type=" + this.f41668a + " length=" + this.f41669b + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.g0(parcel, 2, 4);
        parcel.writeInt(this.f41668a);
        u.V(parcel, 3, this.f41669b);
        u.i0(iH0, parcel);
    }
}
