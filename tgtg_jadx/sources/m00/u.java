package m00;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class u extends a30.d implements v {
    public u() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 8);
    }

    @Override // a30.d
    public final boolean O(int i11, Parcel parcel) {
        if (i11 != 1) {
            if (i11 != 2) {
                return false;
            }
            d();
            return true;
        }
        s sVar = (s) b.a(parcel, s.CREATOR);
        b.c(parcel);
        D(sVar);
        return true;
    }
}
