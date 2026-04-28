package a00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<l> CREATOR = new p0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f128a;

    public l(a aVar) {
        com.google.android.gms.common.internal.i0.h(aVar);
        this.f128a = aVar;
    }

    public static l a(int i11) throws COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException {
        a aVar;
        if (i11 == y.LEGACY_RS1.a()) {
            aVar = y.RS1;
        } else {
            y[] yVarArrValues = y.values();
            int length = yVarArrValues.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    for (m mVar : m.values()) {
                        if (mVar.a() == i11) {
                            aVar = mVar;
                        }
                    }
                    throw new COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException(r8.k.h(i11, "Algorithm with COSE value ", " not supported"));
                }
                y yVar = yVarArrValues[i12];
                if (yVar.a() == i11) {
                    aVar = yVar;
                    break;
                }
                i12++;
            }
        }
        return new l(aVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof l) && this.f128a.a() == ((l) obj).f128a.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f128a});
    }

    public final String toString() {
        return w.a0.p("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.f128a), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f128a.a());
    }
}
