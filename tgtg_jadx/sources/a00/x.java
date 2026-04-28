package a00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends rz.a {

    @NonNull
    public static final Parcelable.Creator<x> CREATOR = new g0(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k00.q0 f182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f185d;

    public x(String str, String str2, String str3, byte[] bArr) {
        com.google.android.gms.common.internal.i0.h(bArr);
        this.f182a = k00.q0.j(bArr.length, bArr);
        com.google.android.gms.common.internal.i0.h(str);
        this.f183b = str;
        this.f184c = str2;
        com.google.android.gms.common.internal.i0.h(str3);
        this.f185d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return com.google.android.gms.common.internal.i0.k(this.f182a, xVar.f182a) && com.google.android.gms.common.internal.i0.k(this.f183b, xVar.f183b) && com.google.android.gms.common.internal.i0.k(this.f184c, xVar.f184c) && com.google.android.gms.common.internal.i0.k(this.f185d, xVar.f185d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f182a, this.f183b, this.f184c, this.f185d});
    }

    public final String toString() {
        StringBuilder sbS = e0.f.s("PublicKeyCredentialUserEntity{\n id=", vz.c.c(this.f182a.l()), ", \n name='");
        sbS.append(this.f183b);
        sbS.append("', \n icon='");
        sbS.append(this.f184c);
        sbS.append("', \n displayName='");
        return r8.k.p(sbS, this.f185d, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.T(parcel, 2, this.f182a.l());
        lx.u.b0(this.f183b, parcel, 3);
        lx.u.b0(this.f184c, parcel, 4);
        lx.u.b0(this.f185d, parcel, 5);
        lx.u.i0(iH0, parcel);
    }
}
