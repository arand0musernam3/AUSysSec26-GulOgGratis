package a00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.TokenBinding$UnsupportedTokenBindingStatusException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public enum a0 implements Parcelable {
    PRESENT("present"),
    SUPPORTED("supported"),
    NOT_SUPPORTED("not-supported");


    @NonNull
    public static final Parcelable.Creator<a0> CREATOR = new g0(17);

    @NonNull
    private final String zzb;

    a0(String str) {
        this.zzb = str;
    }

    public static a0 a(String str) throws TokenBinding$UnsupportedTokenBindingStatusException {
        for (a0 a0Var : values()) {
            if (str.equals(a0Var.zzb)) {
                return a0Var;
            }
        }
        throw new TokenBinding$UnsupportedTokenBindingStatusException(w.a0.p("TokenBindingStatus ", str, " not supported"));
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
