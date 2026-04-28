package a00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<w> CREATOR;

    @NonNull
    public static final w PUBLIC_KEY;
    private static final /* synthetic */ w[] zza;

    @NonNull
    private final String zzb = "public-key";

    static {
        w wVar = new w();
        PUBLIC_KEY = wVar;
        zza = new w[]{wVar};
        CREATOR = new g0(13);
    }

    public static w a(String str) throws PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException {
        for (w wVar : values()) {
            if (str.equals(wVar.zzb)) {
                return wVar;
            }
        }
        throw new PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException(w.a0.p("PublicKeyCredentialType ", str, " not supported"));
    }

    @NonNull
    public static w valueOf(@NonNull String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    @NonNull
    public static w[] values() {
        return (w[]) zza.clone();
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
