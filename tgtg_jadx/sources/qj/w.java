package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsActivity;
import com.app.tgtg.model.remote.OrderId;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w extends m {

    @NotNull
    public static final Parcelable.Creator<w> CREATOR = new oa.i(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37153a;

    public w(String str) {
        str.getClass();
        this.f37153a = str;
    }

    @Override // qj.m
    public final f70.b a() {
        String str = this.f37153a;
        return new f70.b(ContactUsActivity.class, jb.u.x(new Pair("ENTRY_DATA", str.length() > 0 ? new wr.g(wr.h.CONSUMER, wr.b.BAD_ORDER_EXPERIENCE, true, wr.e.MISSED_COLLECTION_CONTACT_AGAIN, null, "Deeplink", OrderId.m210constructorimpl(str), 48) : new wr.g(null, null, false, null, null, null, null, 511))), false, false, false, 1000, null, null, null, false, 988);
    }

    @Override // qj.m
    public final String b() {
        return "contactus/order/followup";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.areEqual(this.f37153a, ((w) obj).f37153a);
    }

    public final int hashCode() {
        return this.f37153a.hashCode();
    }

    public final String toString() {
        return w.a0.p("ContactUsFollowUpDeepLink(orderId=", this.f37153a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f37153a);
    }
}
