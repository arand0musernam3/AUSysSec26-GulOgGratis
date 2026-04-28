package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.feature.tabprofile.manageaccount.vouchers.VoucherActivity;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends m {

    @NotNull
    public static final Parcelable.Creator<k> CREATOR = new oa.i(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37112a;

    public k(String str) {
        str.getClass();
        this.f37112a = str;
    }

    @Override // qj.m
    public final f70.b a() {
        return new f70.b(VoucherActivity.class, jb.u.x(new Pair("CODE", this.f37112a), new Pair("IS_ONBOARDING", Boolean.FALSE)), false, false, false, null, null, null, null, false, 1020);
    }

    @Override // qj.m
    public final String b() {
        return "campaign/code";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.areEqual(this.f37112a, ((k) obj).f37112a);
    }

    public final int hashCode() {
        return this.f37112a.hashCode();
    }

    public final String toString() {
        return w.a0.p("AddVoucherDeepLink(code=", this.f37112a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f37112a);
    }
}
