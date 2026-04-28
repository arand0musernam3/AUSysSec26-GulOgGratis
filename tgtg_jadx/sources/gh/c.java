package gh;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.badge.BadgeProgress;
import com.app.tgtg.model.remote.badge.BadgeUserStatus;
import e10.b0;
import g9.r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w2.l1;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class c implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BadgeUserStatus f20440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BadgeProgress f20441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f20442e;

    @NotNull
    public static final b Companion = new b();

    @NotNull
    public static final Parcelable.Creator<c> CREATOR = new b0(5);

    static {
        w.h(new r0(4));
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
        return this.f20438a == cVar.f20438a && Intrinsics.areEqual(this.f20439b, cVar.f20439b) && this.f20440c == cVar.f20440c && Intrinsics.areEqual(this.f20441d, cVar.f20441d) && Intrinsics.areEqual(this.f20442e, cVar.f20442e);
    }

    public final int hashCode() {
        int iHashCode = (this.f20440c.hashCode() + l1.b(Integer.hashCode(this.f20438a) * 31, 31, this.f20439b)) * 31;
        BadgeProgress badgeProgress = this.f20441d;
        int iHashCode2 = (iHashCode + (badgeProgress == null ? 0 : badgeProgress.hashCode())) * 31;
        Integer num = this.f20442e;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        int i11 = this.f20438a;
        String str = this.f20439b;
        BadgeUserStatus badgeUserStatus = this.f20440c;
        BadgeProgress badgeProgress = this.f20441d;
        Integer num = this.f20442e;
        StringBuilder sb2 = new StringBuilder("UserBadgeBannerDetail(badgeId=");
        sb2.append(i11);
        sb2.append(", imageUrl=");
        sb2.append(str);
        sb2.append(", badgeUserStatus=");
        sb2.append(badgeUserStatus);
        sb2.append(", progress=");
        sb2.append(badgeProgress);
        sb2.append(", totalBadges=");
        return b3.i.m(sb2, num, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(this.f20438a);
        parcel.writeString(this.f20439b);
        parcel.writeString(this.f20440c.name());
        BadgeProgress badgeProgress = this.f20441d;
        if (badgeProgress == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badgeProgress.writeToParcel(parcel, i11);
        }
        Integer num = this.f20442e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            b3.i.w(parcel, 1, num);
        }
    }
}
