package s00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.i0;
import java.util.Arrays;
import kotlin.jvm.internal.LongCompanionObject;
import lx.u;
import qj.f1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends rz.a {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new f1(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f38499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m00.i f38500d;

    public a(long j9, int i11, boolean z11, m00.i iVar) {
        this.f38497a = j9;
        this.f38498b = i11;
        this.f38499c = z11;
        this.f38500d = iVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f38497a == aVar.f38497a && this.f38498b == aVar.f38498b && this.f38499c == aVar.f38499c && i0.k(this.f38500d, aVar.f38500d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f38497a), Integer.valueOf(this.f38498b), Boolean.valueOf(this.f38499c)});
    }

    public final String toString() {
        String str;
        StringBuilder sbO = b3.i.o("LastLocationRequest[");
        long j9 = this.f38497a;
        if (j9 != LongCompanionObject.MAX_VALUE) {
            sbO.append("maxAge=");
            m00.m.a(j9, sbO);
        }
        int i11 = this.f38498b;
        if (i11 != 0) {
            sbO.append(", ");
            if (i11 == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i11 == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i11 != 2) {
                    i4.a.h();
                    return null;
                }
                str = "GRANULARITY_FINE";
            }
            sbO.append(str);
        }
        if (this.f38499c) {
            sbO.append(", bypass");
        }
        m00.i iVar = this.f38500d;
        if (iVar != null) {
            sbO.append(", impersonation=");
            sbO.append(iVar);
        }
        sbO.append(']');
        return sbO.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.g0(parcel, 1, 8);
        parcel.writeLong(this.f38497a);
        u.g0(parcel, 2, 4);
        parcel.writeInt(this.f38498b);
        u.g0(parcel, 3, 4);
        parcel.writeInt(this.f38499c ? 1 : 0);
        u.a0(parcel, 5, this.f38500d, i11);
        u.i0(iH0, parcel);
    }
}
