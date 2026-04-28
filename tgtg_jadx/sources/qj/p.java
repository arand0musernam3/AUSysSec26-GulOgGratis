package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.feature.bucketlist.ui.BucketListActivity;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends m {

    @NotNull
    public static final Parcelable.Creator<p> CREATOR = new oa.i(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37129a;

    public p(String str) {
        str.getClass();
        this.f37129a = str;
    }

    @Override // qj.m
    public final f70.b a() {
        return new f70.b(BucketListActivity.class, jb.u.x(new Pair("FILLER_TYPE", this.f37129a)), false, false, false, null, null, null, null, false, 1020);
    }

    @Override // qj.m
    public final String b() {
        return "discover/bucket";
    }

    @Override // qj.m
    public final dv.b d() {
        return h0.g.E(new Pair(dv.a.DEEPLINK_TYPE, new dv.c("discover/bucket")), new Pair(dv.a.BUCKET, new dv.c(this.f37129a)));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.areEqual(this.f37129a, ((p) obj).f37129a);
    }

    public final int hashCode() {
        return this.f37129a.hashCode();
    }

    public final String toString() {
        return w.a0.p("BucketDeepLink(fillerType=", this.f37129a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f37129a);
    }
}
