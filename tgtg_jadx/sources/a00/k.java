package a00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.Attachment$UnsupportedAttachmentException;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement$UnsupportedResidentKeyRequirementException;
import com.google.android.gms.fido.fido2.api.common.zzbc;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends rz.a {

    @NonNull
    public static final Parcelable.Creator<k> CREATOR = new p0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f123d;

    public k(String str, Boolean bool, String str2, String str3) {
        b bVarA;
        z zVarA = null;
        if (str == null) {
            bVarA = null;
        } else {
            try {
                bVarA = b.a(str);
            } catch (Attachment$UnsupportedAttachmentException | ResidentKeyRequirement$UnsupportedResidentKeyRequirementException | zzbc e5) {
                throw new IllegalArgumentException(e5);
            }
        }
        this.f120a = bVarA;
        this.f121b = bool;
        this.f122c = str2 == null ? null : d0.a(str2);
        if (str3 != null) {
            zVarA = z.a(str3);
        }
        this.f123d = zVarA;
    }

    public final z d() {
        z zVar = this.f123d;
        if (zVar != null) {
            return zVar;
        }
        Boolean bool = this.f121b;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return z.RESIDENT_KEY_REQUIRED;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return com.google.android.gms.common.internal.i0.k(this.f120a, kVar.f120a) && com.google.android.gms.common.internal.i0.k(this.f121b, kVar.f121b) && com.google.android.gms.common.internal.i0.k(this.f122c, kVar.f122c) && com.google.android.gms.common.internal.i0.k(d(), kVar.d());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f120a, this.f121b, this.f122c, d()});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f120a);
        String strValueOf2 = String.valueOf(this.f122c);
        String strValueOf3 = String.valueOf(this.f123d);
        StringBuilder sbS = e0.f.s("AuthenticatorSelectionCriteria{\n attachment=", strValueOf, ", \n requireResidentKey=");
        sbS.append(this.f121b);
        sbS.append(", \n requireUserVerification=");
        sbS.append(strValueOf2);
        sbS.append(", \n residentKeyRequirement=");
        return r8.k.p(sbS, strValueOf3, "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        b bVar = this.f120a;
        lx.u.b0(bVar == null ? null : bVar.toString(), parcel, 2);
        Boolean bool = this.f121b;
        if (bool != null) {
            lx.u.g0(parcel, 3, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        d0 d0Var = this.f122c;
        lx.u.b0(d0Var == null ? null : d0Var.toString(), parcel, 4);
        z zVarD = d();
        lx.u.b0(zVarD != null ? zVarD.toString() : null, parcel, 5);
        lx.u.i0(iH0, parcel);
    }
}
