package a00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public enum c implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");


    @NonNull
    public static final Parcelable.Creator<c> CREATOR = new g0(19);

    @NonNull
    private final String zzb;

    c(String str) {
        this.zzb = str;
    }

    public static c a(String str) throws AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException {
        for (c cVar : values()) {
            if (str.equals(cVar.zzb)) {
                return cVar;
            }
        }
        throw new AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException(w.a0.p("Attestation conveyance preference ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.zzb);
    }
}
