package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.feature.login.SplashActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y0 extends m {

    @NotNull
    public static final Parcelable.Creator<y0> CREATOR = new a0(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37159b;

    public y0(String str, String str2) {
        str.getClass();
        this.f37158a = str;
        this.f37159b = str2;
    }

    @Override // qj.m
    public final f70.b a() {
        return new f70.b(SplashActivity.class, null, false, false, false, null, null, null, null, false, 1022);
    }

    @Override // qj.m
    public final String b() {
        return "partnerlogin";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return Intrinsics.areEqual(this.f37158a, y0Var.f37158a) && Intrinsics.areEqual(this.f37159b, y0Var.f37159b);
    }

    public final int hashCode() {
        int iHashCode = this.f37158a.hashCode() * 31;
        String str = this.f37159b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("PartnerLoginDeepLink(userId=", this.f37158a, ", token=", this.f37159b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f37158a);
        parcel.writeString(this.f37159b);
    }
}
