package s00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends rz.a {
    public static final Parcelable.Creator<g> CREATOR = new e(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f38517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f38518d;

    public g(int i11, int i12, long j9, long j11) {
        this.f38515a = i11;
        this.f38516b = i12;
        this.f38517c = j9;
        this.f38518d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f38515a == gVar.f38515a && this.f38516b == gVar.f38516b && this.f38517c == gVar.f38517c && this.f38518d == gVar.f38518d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f38516b), Integer.valueOf(this.f38515a), Long.valueOf(this.f38518d), Long.valueOf(this.f38517c)});
    }

    public final String toString() {
        int i11 = this.f38515a;
        int length = String.valueOf(i11).length();
        int i12 = this.f38516b;
        int length2 = String.valueOf(i12).length();
        long j9 = this.f38518d;
        int length3 = String.valueOf(j9).length();
        long j11 = this.f38517c;
        StringBuilder sb2 = new StringBuilder(length + 50 + length2 + 18 + length3 + 17 + String.valueOf(j11).length());
        sb2.append("NetworkLocationStatus: Wifi status: ");
        sb2.append(i11);
        sb2.append(" Cell status: ");
        sb2.append(i12);
        org.bouncycastle.jcajce.provider.asymmetric.a.v(sb2, " elapsed time NS: ", j9, " system time ms: ");
        sb2.append(j11);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.g0(parcel, 1, 4);
        parcel.writeInt(this.f38515a);
        u.g0(parcel, 2, 4);
        parcel.writeInt(this.f38516b);
        u.g0(parcel, 3, 8);
        parcel.writeLong(this.f38517c);
        u.g0(parcel, 4, 8);
        parcel.writeLong(this.f38518d);
        u.i0(iH0, parcel);
    }
}
