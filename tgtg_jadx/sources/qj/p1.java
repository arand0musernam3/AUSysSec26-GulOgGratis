package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.ui.HiddenStoresActivity;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p1 extends m {

    @NotNull
    public static final Parcelable.Creator<p1> CREATOR = new f1(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37131a;

    public p1(String str) {
        str.getClass();
        this.f37131a = str;
    }

    @Override // qj.m
    public final f70.b a() {
        return new f70.b(HiddenStoresActivity.class, jb.u.x(new Pair("CODE", this.f37131a)), false, false, false, null, null, null, null, false, 1020);
    }

    @Override // qj.m
    public final String b() {
        return "unlock/hidden";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p1) && Intrinsics.areEqual(this.f37131a, ((p1) obj).f37131a);
    }

    public final int hashCode() {
        return this.f37131a.hashCode();
    }

    public final String toString() {
        return w.a0.p("UnlockHiddenStoreDeepLink(code=", this.f37131a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f37131a);
    }
}
