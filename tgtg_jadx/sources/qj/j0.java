package qj;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f37110a = new j0();

    @NotNull
    public static final Parcelable.Creator<j0> CREATOR = new a0(8);

    @Override // qj.m
    public final f70.b a() {
        mv.a0 a0Var = new mv.a0();
        f70.i iVar = f70.i.DEEP_LINK;
        iVar.getClass();
        a0Var.f30139b = iVar;
        return a0Var.b();
    }

    @Override // qj.m
    public final String b() {
        return "root";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof j0);
    }

    public final int hashCode() {
        return 1475869224;
    }

    public final String toString() {
        return "HomeDeepLink";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
