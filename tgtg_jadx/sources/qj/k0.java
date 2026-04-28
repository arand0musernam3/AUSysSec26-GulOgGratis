package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.order.OrderType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k0 extends m {

    @NotNull
    public static final Parcelable.Creator<k0> CREATOR = new a0(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37113a;

    public k0(String str) {
        str.getClass();
        this.f37113a = str;
    }

    @Override // qj.m
    public final f70.b a() {
        androidx.core.app.n nVar = new androidx.core.app.n(OrderType.MAGICBAG);
        nVar.f2640g = this.f37113a;
        f70.i iVar = f70.i.DEEP_LINK;
        iVar.getClass();
        nVar.f2639f = iVar;
        return nVar.b();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && Intrinsics.areEqual(this.f37113a, ((k0) obj).f37113a);
    }

    public final int hashCode() {
        return this.f37113a.hashCode();
    }

    public final String toString() {
        return w.a0.p("InvitationDeepLink(invitationExternalId=", this.f37113a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f37113a);
    }
}
