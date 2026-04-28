package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.feature.login.SplashActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends m {

    @NotNull
    public static final Parcelable.Creator<d0> CREATOR = new a0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37072b;

    public d0(String str, String str2) {
        str.getClass();
        this.f37071a = str;
        this.f37072b = str2;
    }

    @Override // qj.m
    public final f70.b a() {
        return new f70.b(SplashActivity.class, null, false, false, false, null, null, null, null, false, 1022);
    }

    @Override // qj.m
    public final String b() {
        return "login/accept";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.areEqual(this.f37071a, d0Var.f37071a) && Intrinsics.areEqual(this.f37072b, d0Var.f37072b);
    }

    public final int hashCode() {
        int iHashCode = this.f37071a.hashCode() * 31;
        String str = this.f37072b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("EmailLoginDeepLink(userId=", this.f37071a, ", token=", this.f37072b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f37071a);
        parcel.writeString(this.f37072b);
    }
}
