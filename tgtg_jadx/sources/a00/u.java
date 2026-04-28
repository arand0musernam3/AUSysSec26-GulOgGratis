package a00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends rz.a {

    @NonNull
    public static final Parcelable.Creator<u> CREATOR = new g0(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f178b;

    public u(String str, int i11) {
        com.google.android.gms.common.internal.i0.h(str);
        try {
            this.f177a = w.a(str);
            try {
                this.f178b = l.a(i11);
            } catch (COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException e5) {
                throw new IllegalArgumentException(e5);
            }
        } catch (PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f177a.equals(uVar.f177a) && this.f178b.equals(uVar.f178b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f177a, this.f178b});
    }

    public final String toString() {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f177a), ", \n algorithm=", String.valueOf(this.f178b), "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.b0(this.f177a.toString(), parcel, 2);
        lx.u.Z(parcel, 3, Integer.valueOf(this.f178b.f128a.a()));
        lx.u.i0(iH0, parcel);
    }
}
