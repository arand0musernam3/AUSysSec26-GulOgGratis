package qj;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f37080a = new f0();

    @NotNull
    public static final Parcelable.Creator<f0> CREATOR = new a0(4);

    @Override // qj.m
    public final f70.b a() {
        mv.a0 a0Var = new mv.a0();
        mv.z zVar = mv.z.FAVORITES;
        zVar.getClass();
        a0Var.f30138a = zVar;
        f70.i iVar = f70.i.DEEP_LINK;
        iVar.getClass();
        a0Var.f30139b = iVar;
        a0Var.a(Boolean.TRUE, "SHOW_GET_NOTIFIED");
        return a0Var.b();
    }

    @Override // qj.m
    public final String b() {
        return "favorites-screen/getnotified";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof f0);
    }

    public final int hashCode() {
        return 792945703;
    }

    public final String toString() {
        return "FavouritesGetNotifiedDeepLink";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
