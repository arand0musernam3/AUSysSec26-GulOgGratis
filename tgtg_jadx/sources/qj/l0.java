package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.order.OrderType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends m {

    @NotNull
    public static final Parcelable.Creator<l0> CREATOR = new a0(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37116a;

    public l0(String str) {
        str.getClass();
        this.f37116a = str;
    }

    @Override // qj.m
    public final f70.b a() {
        androidx.core.app.n nVar = new androidx.core.app.n(OrderType.MAGICBAG);
        nVar.f2638e = this.f37116a;
        f70.i iVar = f70.i.DEEP_LINK;
        iVar.getClass();
        nVar.f2639f = iVar;
        nVar.f2634a = true;
        nVar.f2635b = true;
        return nVar.b();
    }

    @Override // qj.m
    public final String b() {
        return "invitation/details";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && Intrinsics.areEqual(this.f37116a, ((l0) obj).f37116a);
    }

    public final int hashCode() {
        return this.f37116a.hashCode();
    }

    public final String toString() {
        return w.a0.p("InvitationDetailsDeepLink(invitationId=", this.f37116a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f37116a);
    }
}
