package qj;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends m {

    @NotNull
    public static final Parcelable.Creator<o> CREATOR = new oa.i(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37125a;

    public o(boolean z11) {
        this.f37125a = z11;
    }

    @Override // qj.m
    public final f70.b a() {
        mv.a0 a0Var = new mv.a0();
        mv.z zVar = mv.z.BROWSE;
        zVar.getClass();
        a0Var.f30138a = zVar;
        a0Var.a(Boolean.valueOf(this.f37125a), "OPEN_BROWSE_FILTER");
        return a0Var.b();
    }

    @Override // qj.m
    public final String b() {
        return this.f37125a ? "browse/filter" : "browse";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.f37125a == ((o) obj).f37125a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37125a);
    }

    public final String toString() {
        return org.bouncycastle.jcajce.provider.asymmetric.a.f("BrowseDeepLink(openFilter=", ")", this.f37125a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(this.f37125a ? 1 : 0);
    }
}
