package qj;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.feature.helpdesk.HelpCenterActivity;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v extends m {

    @NotNull
    public static final Parcelable.Creator<v> CREATOR = new oa.i(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37151a;

    public v(boolean z11) {
        this.f37151a = z11;
    }

    @Override // qj.m
    public final f70.b a() {
        Bundle bundleX = jb.u.x(new Pair("OPENED_FROM", "Deeplink"));
        if (this.f37151a) {
            bundleX.putSerializable("DESTINATION", ek.b.GO_TO_HOW_TGTG_WORKS);
        }
        return new f70.b(HelpCenterActivity.class, bundleX, false, false, false, null, null, null, null, false, 1020);
    }

    @Override // qj.m
    public final String b() {
        return this.f37151a ? "how-it-works" : "contactus";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.f37151a == ((v) obj).f37151a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37151a);
    }

    public final String toString() {
        return org.bouncycastle.jcajce.provider.asymmetric.a.f("ContactUsDeepLink(gotoHowTGTGWorks=", ")", this.f37151a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(this.f37151a ? 1 : 0);
    }
}
