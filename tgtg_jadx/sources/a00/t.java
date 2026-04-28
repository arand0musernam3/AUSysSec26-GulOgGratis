package a00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends rz.a {

    @NonNull
    public static final Parcelable.Creator<t> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k00.q0 f174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f175c;

    static {
        k00.n.h(2, k00.a.f25620c, k00.a.f25621d);
        CREATOR = new g0(10);
    }

    public t(String str, byte[] bArr, ArrayList arrayList) {
        k00.q0 q0Var = k00.q0.f25682c;
        k00.q0 q0VarJ = k00.q0.j(bArr.length, bArr);
        com.google.android.gms.common.internal.i0.h(str);
        try {
            this.f173a = w.a(str);
            this.f174b = q0VarJ;
            this.f175c = arrayList;
        } catch (PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        List list = tVar.f175c;
        if (!this.f173a.equals(tVar.f173a) || !com.google.android.gms.common.internal.i0.k(this.f174b, tVar.f174b)) {
            return false;
        }
        List list2 = this.f175c;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f173a, this.f174b, this.f175c});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f173a);
        String strC = vz.c.c(this.f174b.l());
        return r8.k.p(e0.f.t("PublicKeyCredentialDescriptor{\n type=", strValueOf, ", \n id=", strC, ", \n transports="), String.valueOf(this.f175c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.b0(this.f173a.toString(), parcel, 2);
        lx.u.T(parcel, 3, this.f174b.l());
        lx.u.f0(parcel, 4, this.f175c);
        lx.u.i0(iH0, parcel);
    }
}
