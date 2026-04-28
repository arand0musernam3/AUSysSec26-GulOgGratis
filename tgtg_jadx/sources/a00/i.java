package a00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.ErrorCode$UnsupportedErrorCodeException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends j {

    @NonNull
    public static final Parcelable.Creator<i> CREATOR = new p0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f117c;

    public i(int i11, String str, int i12) {
        try {
            this.f115a = n.c(i11);
            this.f116b = str;
            this.f117c = i12;
        } catch (ErrorCode$UnsupportedErrorCodeException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return com.google.android.gms.common.internal.i0.k(this.f115a, iVar.f115a) && com.google.android.gms.common.internal.i0.k(this.f116b, iVar.f116b) && com.google.android.gms.common.internal.i0.k(Integer.valueOf(this.f117c), Integer.valueOf(iVar.f117c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f115a, this.f116b, Integer.valueOf(this.f117c)});
    }

    public final String toString() {
        j30.g gVar = new j30.g(getClass().getSimpleName(), 4);
        String strValueOf = String.valueOf(this.f115a.a());
        k00.c cVar = new k00.c(3, (char) 0);
        ((j30.g) gVar.f24504d).f24504d = cVar;
        gVar.f24504d = cVar;
        cVar.f24503c = strValueOf;
        cVar.f24502b = "errorCode";
        String str = this.f116b;
        if (str != null) {
            gVar.H(str, "errorMessage");
        }
        return gVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        int iA = this.f115a.a();
        lx.u.g0(parcel, 2, 4);
        parcel.writeInt(iA);
        lx.u.b0(this.f116b, parcel, 3);
        lx.u.g0(parcel, 4, 4);
        parcel.writeInt(this.f117c);
        lx.u.i0(iH0, parcel);
    }
}
