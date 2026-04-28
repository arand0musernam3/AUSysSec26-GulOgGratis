package a00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement$UnsupportedResidentKeyRequirementException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public enum z implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");


    @NonNull
    public static final Parcelable.Creator<z> CREATOR = new g0(15);

    @NonNull
    private final String zzb;

    z(String str) {
        this.zzb = str;
    }

    public static z a(String str) throws ResidentKeyRequirement$UnsupportedResidentKeyRequirementException {
        for (z zVar : values()) {
            if (str.equals(zVar.zzb)) {
                return zVar;
            }
        }
        throw new ResidentKeyRequirement$UnsupportedResidentKeyRequirementException(w.a0.p("Resident key requirement ", str, " not supported"));
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
