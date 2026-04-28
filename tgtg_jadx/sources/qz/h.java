package qz;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h extends a30.d {
    public h() {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 4);
    }

    @Override // a30.d
    public final boolean M(int i11, Parcel parcel, Parcel parcel2) {
        if (i11 != 1) {
            return false;
        }
        Status status = (Status) h00.a.a(parcel, Status.CREATOR);
        h00.a.b(parcel);
        U(status);
        return true;
    }

    public abstract void U(Status status);
}
