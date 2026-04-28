package jz;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.i0;
import java.util.Arrays;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends rz.a {

    @NonNull
    public static final Parcelable.Creator<i> CREATOR = new l(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f25485a;

    public i(PendingIntent pendingIntent) {
        i0.h(pendingIntent);
        this.f25485a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return i0.k(this.f25485a, ((i) obj).f25485a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f25485a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.a0(parcel, 1, this.f25485a, i11);
        u.i0(iH0, parcel);
    }
}
