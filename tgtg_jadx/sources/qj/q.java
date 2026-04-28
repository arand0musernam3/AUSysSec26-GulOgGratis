package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.local.DeeplinkC2CReferralData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends m {

    @NotNull
    public static final Parcelable.Creator<q> CREATOR = new oa.i(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeeplinkC2CReferralData f37132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37133b;

    public q(DeeplinkC2CReferralData deeplinkC2CReferralData, String str) {
        deeplinkC2CReferralData.getClass();
        str.getClass();
        this.f37132a = deeplinkC2CReferralData;
        this.f37133b = str;
    }

    @Override // qj.m
    public final f70.b a() {
        mv.a0 a0Var = new mv.a0();
        mv.z zVar = mv.z.DISCOVER;
        zVar.getClass();
        a0Var.f30138a = zVar;
        f70.i iVar = f70.i.DEEP_LINK;
        iVar.getClass();
        a0Var.f30139b = iVar;
        a0Var.f30148k = this.f37132a;
        return a0Var.b();
    }

    @Override // qj.m
    public final String b() {
        return this.f37133b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.areEqual(this.f37132a, qVar.f37132a) && Intrinsics.areEqual(this.f37133b, qVar.f37133b);
    }

    public final int hashCode() {
        return this.f37133b.hashCode() + (this.f37132a.hashCode() * 31);
    }

    public final String toString() {
        return "C2CReferralCodeDeepLink(deeplinkC2CReferralData=" + this.f37132a + ", trackingValue=" + this.f37133b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        this.f37132a.writeToParcel(parcel, i11);
        parcel.writeString(this.f37133b);
    }
}
