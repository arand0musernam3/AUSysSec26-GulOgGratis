package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.feature.tabprofile.c2creferral.ui.InviteFriendsActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends m {

    @NotNull
    public static final Parcelable.Creator<r> CREATOR = new oa.i(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37136a;

    public r(String str) {
        str.getClass();
        this.f37136a = str;
    }

    @Override // qj.m
    public final f70.b a() {
        return new f70.b(InviteFriendsActivity.class, null, false, false, false, null, null, null, null, false, 1022);
    }

    @Override // qj.m
    public final String b() {
        return this.f37136a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.areEqual(this.f37136a, ((r) obj).f37136a);
    }

    public final int hashCode() {
        return this.f37136a.hashCode();
    }

    public final String toString() {
        return w.a0.p("C2CReferralDeepLink(trackingValue=", this.f37136a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f37136a);
    }
}
