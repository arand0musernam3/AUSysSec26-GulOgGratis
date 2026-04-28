package qj;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r0 extends m {

    @NotNull
    public static final Parcelable.Creator<r0> CREATOR = new a0(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f37137a;

    public r0(Uri uri) {
        uri.getClass();
        this.f37137a = uri;
    }

    @Override // qj.m
    public final f70.b a() {
        if (!ft.c.C()) {
            mv.a0 a0Var = new mv.a0();
            f70.i iVar = f70.i.DEEP_LINK;
            iVar.getClass();
            a0Var.f30139b = iVar;
            return a0Var.b();
        }
        mv.a0 a0Var2 = new mv.a0();
        f70.i iVar2 = f70.i.DEEP_LINK;
        iVar2.getClass();
        a0Var2.f30139b = iVar2;
        mv.z zVar = mv.z.MY_STORE;
        zVar.getClass();
        a0Var2.f30138a = zVar;
        a0Var2.a(this.f37137a, "MYSTORE_URL_DATA");
        a0Var2.f30143f = true;
        a0Var2.f30145h = 0;
        a0Var2.f30146i = 0;
        return a0Var2.b();
    }

    @Override // qj.m
    public final String b() {
        return "mystore";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && Intrinsics.areEqual(this.f37137a, ((r0) obj).f37137a);
    }

    public final int hashCode() {
        return this.f37137a.hashCode();
    }

    public final String toString() {
        return "MyStoreDeepLink(myStoreDeeplink=" + this.f37137a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeParcelable(this.f37137a, i11);
    }
}
