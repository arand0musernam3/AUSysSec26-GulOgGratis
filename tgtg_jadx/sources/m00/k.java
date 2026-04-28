package m00;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends rz.a {
    public static final Parcelable.Creator<k> CREATOR = new jz.l(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationRequest f28675a;

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(com.google.android.gms.location.LocationRequest r31, java.util.ArrayList r32, boolean r33, boolean r34, boolean r35, boolean r36, long r37) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m00.k.<init>(com.google.android.gms.location.LocationRequest, java.util.ArrayList, boolean, boolean, boolean, boolean, long):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return i0.k(this.f28675a, ((k) obj).f28675a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28675a.hashCode();
    }

    public final String toString() {
        return this.f28675a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.a0(parcel, 1, this.f28675a, i11);
        lx.u.i0(iH0, parcel);
    }
}
