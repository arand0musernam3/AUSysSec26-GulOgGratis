package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.feature.flashsales.list.FlashSalesListActivity;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends m {

    @NotNull
    public static final Parcelable.Creator<g0> CREATOR = new a0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37092a;

    public g0(String str) {
        str.getClass();
        this.f37092a = str;
    }

    @Override // qj.m
    public final f70.b a() {
        return new f70.b(FlashSalesListActivity.class, jb.u.x(new Pair("FILLER_TYPE", this.f37092a)), false, false, false, null, null, null, null, false, 1020);
    }

    @Override // qj.m
    public final String b() {
        return "discover/flashsalesbucket";
    }

    @Override // qj.m
    public final dv.b d() {
        return h0.g.E(new Pair(dv.a.DEEPLINK_TYPE, new dv.c("discover/flashsalesbucket")), new Pair(dv.a.BUCKET, new dv.c(this.f37092a)));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && Intrinsics.areEqual(this.f37092a, ((g0) obj).f37092a);
    }

    public final int hashCode() {
        return this.f37092a.hashCode();
    }

    public final String toString() {
        return w.a0.p("FlashSalesBucketDeepLink(fillerType=", this.f37092a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f37092a);
    }
}
