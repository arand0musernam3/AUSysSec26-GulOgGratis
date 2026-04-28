package jz;

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
    public static final Parcelable.Creator<h> CREATOR = new l(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f25482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25484c;

    public h(k kVar, String str, int i11) {
        i0.h(kVar);
        this.f25482a = kVar;
        this.f25483b = str;
        this.f25484c = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return i0.k(this.f25482a, hVar.f25482a) && i0.k(this.f25483b, hVar.f25483b) && this.f25484c == hVar.f25484c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f25482a, this.f25483b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.a0(parcel, 1, this.f25482a, i11);
        u.b0(this.f25483b, parcel, 2);
        u.g0(parcel, 3, 4);
        parcel.writeInt(this.f25484c);
        u.i0(iH0, parcel);
    }
}
