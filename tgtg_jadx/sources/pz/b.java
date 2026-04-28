package pz;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.braze.models.inappmessage.InAppMessageBase;
import com.google.android.gms.common.internal.i0;
import java.util.Arrays;
import lx.u;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends rz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PendingIntent f35645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f35646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f35647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f35642f = new b(0, null, null);

    @NonNull
    public static final Parcelable.Creator<b> CREATOR = new oa.i(11);

    public b(int i11, int i12, PendingIntent pendingIntent, String str, Integer num) {
        this.f35643a = i11;
        this.f35644b = i12;
        this.f35645c = pendingIntent;
        this.f35646d = str;
        this.f35647e = num;
    }

    public static String d(int i11) {
        if (i11 == 99) {
            return "UNFINISHED";
        }
        if (i11 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i11) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i11) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 20);
                        sb2.append("UNKNOWN_ERROR_CODE(");
                        sb2.append(i11);
                        sb2.append(")");
                        return sb2.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f35644b == bVar.f35644b && i0.k(this.f35645c, bVar.f35645c) && i0.k(this.f35646d, bVar.f35646d) && i0.k(this.f35647e, bVar.f35647e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f35644b), this.f35645c, this.f35646d, this.f35647e});
    }

    public final String toString() {
        com.google.android.gms.common.internal.q qVar = new com.google.android.gms.common.internal.q(this);
        qVar.b(d(this.f35644b), "statusCode");
        qVar.b(this.f35645c, "resolution");
        qVar.b(this.f35646d, InAppMessageBase.MESSAGE);
        qVar.b(this.f35647e, "clientMethodKey");
        return qVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.g0(parcel, 1, 4);
        parcel.writeInt(this.f35643a);
        u.g0(parcel, 2, 4);
        parcel.writeInt(this.f35644b);
        u.a0(parcel, 3, this.f35645c, i11);
        u.b0(this.f35646d, parcel, 4);
        u.Z(parcel, 5, this.f35647e);
        u.i0(iH0, parcel);
    }

    public b(int i11, PendingIntent pendingIntent, String str) {
        this(1, i11, pendingIntent, str, null);
    }
}
