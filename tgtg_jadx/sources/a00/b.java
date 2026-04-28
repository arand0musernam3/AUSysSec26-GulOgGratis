package a00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.Attachment$UnsupportedAttachmentException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public enum b implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");


    @NonNull
    public static final Parcelable.Creator<b> CREATOR = new g0(0);

    @NonNull
    private final String zzb;

    b(String str) {
        this.zzb = str;
    }

    public static b a(String str) throws Attachment$UnsupportedAttachmentException {
        for (b bVar : values()) {
            if (str.equals(bVar.zzb)) {
                return bVar;
            }
        }
        throw new Attachment$UnsupportedAttachmentException(w.a0.p("Attachment ", str, " not supported"));
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
