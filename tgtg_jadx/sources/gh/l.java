package gh;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.badge.Badge;
import com.app.tgtg.model.remote.badge.BadgeCollection;
import e10.b0;
import g9.r0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u70.m;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class l implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Badge f20458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f20459b;

    @NotNull
    public static final k Companion = new k();

    @NotNull
    public static final Parcelable.Creator<l> CREATOR = new b0(8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u70.j[] f20457c = {null, u70.l.a(m.PUBLICATION, new g60.d(20))};

    static {
        w.h(new r0(7));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.areEqual(this.f20458a, lVar.f20458a) && Intrinsics.areEqual(this.f20459b, lVar.f20459b);
    }

    public final int hashCode() {
        Badge badge = this.f20458a;
        return this.f20459b.hashCode() + ((badge == null ? 0 : badge.hashCode()) * 31);
    }

    public final String toString() {
        return "UserBadgesResponse(latestBadge=" + this.f20458a + ", badgeCollections=" + this.f20459b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        Badge badge = this.f20458a;
        if (badge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badge.writeToParcel(parcel, i11);
        }
        Iterator itR = b3.i.r(this.f20459b, parcel);
        while (itR.hasNext()) {
            ((BadgeCollection) itR.next()).writeToParcel(parcel, i11);
        }
    }
}
