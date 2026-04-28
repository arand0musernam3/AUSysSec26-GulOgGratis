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
public final class x extends m {

    @NotNull
    public static final Parcelable.Creator<x> CREATOR = new oa.i(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37155a;

    public x(String str) {
        str.getClass();
        this.f37155a = str;
    }

    @Override // qj.m
    public final f70.b a() {
        return new f70.b(ContactUsActivity.class, jb.u.x(new Pair("ENTRY_DATA", new wr.g(wr.h.CONSUMER, wr.b.BAD_ORDER_EXPERIENCE, true, null, null, "Deeplink", OrderId.m210constructorimpl(this.f37155a), 56))), false, false, false, null, null, null, null, false, 1020);
    }

    @Override // qj.m
    public final String b() {
        return "contactus/order";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.areEqual(this.f37155a, ((x) obj).f37155a);
    }

    public final int hashCode() {
        return this.f37155a.hashCode();
    }

    public final String toString() {
        return w.a0.p("ContactUsOrderDeepLink(orderId=", this.f37155a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f37155a);
    }
}
