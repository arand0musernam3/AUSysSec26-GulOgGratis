package xs;

import android.os.Parcel;
import android.os.Parcelable;
import i90.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s00.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
public final class c implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44495b;

    @NotNull
    public static final b Companion = new b();

    @NotNull
    public static final Parcelable.Creator<c> CREATOR = new e(22);

    public /* synthetic */ c(int i11, String str, String str2) {
        if ((i11 & 1) == 0) {
            this.f44494a = null;
        } else {
            this.f44494a = str;
        }
        if ((i11 & 2) == 0) {
            this.f44495b = null;
        } else {
            this.f44495b = str2;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f44494a, cVar.f44494a) && Intrinsics.areEqual(this.f44495b, cVar.f44495b);
    }

    public final int hashCode() {
        String str = this.f44494a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f44495b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("MyStoreOnboardingSettingsResponse(myStoreOnboardingUrl=", this.f44494a, ", directAppLoginToken=", this.f44495b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f44494a);
        parcel.writeString(this.f44495b);
    }

    public c(String str, String str2) {
        this.f44494a = str;
        this.f44495b = str2;
    }
}
