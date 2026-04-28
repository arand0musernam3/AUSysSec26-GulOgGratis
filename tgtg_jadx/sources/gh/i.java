package gh;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.badge.BadgeCTA;
import com.app.tgtg.model.remote.badge.BadgeProgress;
import e10.b0;
import g9.r0;
import j4.s;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w2.l1;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class i implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f20451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f20452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f20453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BadgeProgress f20454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public BadgeCTA f20455g;

    @NotNull
    public static final h Companion = new h();

    @NotNull
    public static final Parcelable.Creator<i> CREATOR = new b0(7);

    static {
        w.h(new r0(6));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f20449a == iVar.f20449a && Intrinsics.areEqual(this.f20450b, iVar.f20450b) && Intrinsics.areEqual(this.f20451c, iVar.f20451c) && Intrinsics.areEqual(this.f20452d, iVar.f20452d) && Intrinsics.areEqual(this.f20453e, iVar.f20453e) && Intrinsics.areEqual(this.f20454f, iVar.f20454f) && Intrinsics.areEqual(this.f20455g, iVar.f20455g);
    }

    public final int hashCode() {
        int iB = l1.b(l1.b(Integer.hashCode(this.f20449a) * 31, 31, this.f20450b), 31, this.f20451c);
        String str = this.f20452d;
        int iB2 = l1.b((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.f20453e);
        BadgeProgress badgeProgress = this.f20454f;
        int iHashCode = (iB2 + (badgeProgress == null ? 0 : badgeProgress.hashCode())) * 31;
        BadgeCTA badgeCTA = this.f20455g;
        return iHashCode + (badgeCTA != null ? badgeCTA.hashCode() : 0);
    }

    public final String toString() {
        int i11 = this.f20449a;
        String str = this.f20450b;
        String str2 = this.f20451c;
        String str3 = this.f20452d;
        String str4 = this.f20453e;
        BadgeProgress badgeProgress = this.f20454f;
        BadgeCTA badgeCTA = this.f20455g;
        StringBuilder sb2 = new StringBuilder("UserBadgeDetailsResponse(badgeId=");
        sb2.append(i11);
        sb2.append(", imageUrl=");
        sb2.append(str);
        sb2.append(", name=");
        s.A(sb2, str2, ", achievedAt=", str3, ", description=");
        sb2.append(str4);
        sb2.append(", progress=");
        sb2.append(badgeProgress);
        sb2.append(", callToAction=");
        sb2.append(badgeCTA);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(this.f20449a);
        parcel.writeString(this.f20450b);
        parcel.writeString(this.f20451c);
        parcel.writeString(this.f20452d);
        parcel.writeString(this.f20453e);
        BadgeProgress badgeProgress = this.f20454f;
        if (badgeProgress == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badgeProgress.writeToParcel(parcel, i11);
        }
        BadgeCTA badgeCTA = this.f20455g;
        if (badgeCTA == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badgeCTA.writeToParcel(parcel, i11);
        }
    }
}
