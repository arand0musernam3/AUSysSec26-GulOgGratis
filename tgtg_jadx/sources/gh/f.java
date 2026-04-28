package gh;

import android.os.Parcel;
import android.os.Parcelable;
import e10.b0;
import g9.r0;
import kotlin.jvm.internal.Intrinsics;
import n90.u;
import org.jetbrains.annotations.NotNull;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class f implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f20445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f20446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f20447c;

    @NotNull
    public static final e Companion = new e();

    @NotNull
    public static final Parcelable.Creator<f> CREATOR = new b0(6);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f20444d = w.h(new r0(5));

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f20445a, fVar.f20445a) && Intrinsics.areEqual(this.f20446b, fVar.f20446b) && Intrinsics.areEqual(this.f20447c, fVar.f20447c);
    }

    public final int hashCode() {
        String str = this.f20445a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        c cVar = this.f20446b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        c cVar2 = this.f20447c;
        return iHashCode2 + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    public final String toString() {
        return "UserBadgeBannerDetailsResponse(achievedAt=" + this.f20445a + ", latestAchievedBadge=" + this.f20446b + ", latestInProgressBadge=" + this.f20447c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f20445a);
        c cVar = this.f20446b;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, i11);
        }
        c cVar2 = this.f20447c;
        if (cVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cVar2.writeToParcel(parcel, i11);
        }
    }
}
