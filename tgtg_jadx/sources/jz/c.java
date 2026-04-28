package jz;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.i0;
import e10.b0;
import java.util.Arrays;
import java.util.Objects;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends rz.a {

    @NonNull
    public static final Parcelable.Creator<c> CREATOR = new b0(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f25464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25465c;

    public c(String str, boolean z11, byte[] bArr) {
        if (z11) {
            i0.h(bArr);
            i0.h(str);
        }
        this.f25463a = z11;
        this.f25464b = bArr;
        this.f25465c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f25463a == cVar.f25463a && Arrays.equals(this.f25464b, cVar.f25464b) && Objects.equals(this.f25465c, cVar.f25465c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f25464b) + (Objects.hash(Boolean.valueOf(this.f25463a), this.f25465c) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.g0(parcel, 1, 4);
        parcel.writeInt(this.f25463a ? 1 : 0);
        u.T(parcel, 2, this.f25464b);
        u.b0(this.f25465c, parcel, 3);
        u.i0(iH0, parcel);
    }
}
