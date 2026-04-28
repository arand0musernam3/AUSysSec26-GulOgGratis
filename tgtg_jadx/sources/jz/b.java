package jz;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.i0;
import e10.b0;
import java.util.Arrays;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends rz.a {

    @NonNull
    public static final Parcelable.Creator<b> CREATOR = new b0(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25462b;

    public b(boolean z11, String str) {
        if (z11) {
            i0.h(str);
        }
        this.f25461a = z11;
        this.f25462b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f25461a == bVar.f25461a && i0.k(this.f25462b, bVar.f25462b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f25461a), this.f25462b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.g0(parcel, 1, 4);
        parcel.writeInt(this.f25461a ? 1 : 0);
        u.b0(this.f25462b, parcel, 2);
        u.i0(iH0, parcel);
    }
}
