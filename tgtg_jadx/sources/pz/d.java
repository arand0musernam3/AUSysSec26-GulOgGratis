package pz;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.i0;
import java.util.Arrays;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends rz.a {

    @NonNull
    public static final Parcelable.Creator<d> CREATOR = new oa.i(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f35653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f35654d;

    public d(String str, int i11, long j9, boolean z11) {
        this.f35651a = str;
        this.f35652b = i11;
        this.f35653c = j9;
        this.f35654d = z11;
    }

    public final long d() {
        long j9 = this.f35653c;
        return j9 == -1 ? this.f35652b : j9;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (i0.k(this.f35651a, dVar.f35651a) && d() == dVar.d() && this.f35654d == dVar.f35654d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f35651a, Long.valueOf(d()), Boolean.valueOf(this.f35654d)});
    }

    public final String toString() {
        com.google.android.gms.common.internal.q qVar = new com.google.android.gms.common.internal.q(this);
        qVar.b(this.f35651a, "name");
        qVar.b(Long.valueOf(d()), "version");
        qVar.b(Boolean.valueOf(this.f35654d), "is_fully_rolled_out");
        return qVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.b0(this.f35651a, parcel, 1);
        u.g0(parcel, 2, 4);
        parcel.writeInt(this.f35652b);
        long jD = d();
        u.g0(parcel, 3, 8);
        parcel.writeLong(jD);
        u.g0(parcel, 4, 4);
        parcel.writeInt(this.f35654d ? 1 : 0);
        u.i0(iH0, parcel);
    }

    public d(String str, long j9) {
        this(str, -1, j9, false);
    }
}
