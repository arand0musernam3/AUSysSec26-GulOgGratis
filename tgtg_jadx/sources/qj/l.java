package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.feature.badges.ui.BadgesActivity;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends m {

    @NotNull
    public static final Parcelable.Creator<l> CREATOR = new oa.i(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37115a;

    public l(String str) {
        this.f37115a = str;
    }

    @Override // qj.m
    public final f70.b a() {
        return new f70.b(BadgesActivity.class, jb.u.x(new Pair("BADGE_ID", this.f37115a)), false, false, false, null, null, null, null, false, 1020);
    }

    @Override // qj.m
    public final String b() {
        return "me/badge";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.areEqual(this.f37115a, ((l) obj).f37115a);
    }

    public final int hashCode() {
        String str = this.f37115a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return w.a0.p("BadgesDeepLink(badgeId=", this.f37115a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f37115a);
    }
}
