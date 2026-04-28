package a00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.ErrorCode$UnsupportedErrorCodeException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public enum n implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);


    @NonNull
    public static final Parcelable.Creator<n> CREATOR = new p0(7);
    private final int zzb;

    n(int i11) {
        this.zzb = i11;
    }

    public static n c(int i11) throws ErrorCode$UnsupportedErrorCodeException {
        for (n nVar : values()) {
            if (i11 == nVar.zzb) {
                return nVar;
            }
        }
        Locale locale = Locale.US;
        throw new ErrorCode$UnsupportedErrorCodeException(r8.k.h(i11, "Error code ", " is not supported"));
    }

    public final int a() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.zzb);
    }
}
