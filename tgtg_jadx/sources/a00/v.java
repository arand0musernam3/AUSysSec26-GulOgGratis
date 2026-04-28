package a00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v extends rz.a {

    @NonNull
    public static final Parcelable.Creator<v> CREATOR = new g0(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f181c;

    public v(String str, String str2, String str3) {
        com.google.android.gms.common.internal.i0.h(str);
        this.f179a = str;
        com.google.android.gms.common.internal.i0.h(str2);
        this.f180b = str2;
        this.f181c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return com.google.android.gms.common.internal.i0.k(this.f179a, vVar.f179a) && com.google.android.gms.common.internal.i0.k(this.f180b, vVar.f180b) && com.google.android.gms.common.internal.i0.k(this.f181c, vVar.f181c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f179a, this.f180b, this.f181c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f179a);
        sb2.append("', \n name='");
        sb2.append(this.f180b);
        sb2.append("', \n icon='");
        return r8.k.p(sb2, this.f181c, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.b0(this.f179a, parcel, 2);
        lx.u.b0(this.f180b, parcel, 3);
        lx.u.b0(this.f181c, parcel, 4);
        lx.u.i0(iH0, parcel);
    }
}
