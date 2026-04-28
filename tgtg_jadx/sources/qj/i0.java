package qj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i0 extends m {

    @NotNull
    public static final Parcelable.Creator<i0> CREATOR = new a0(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37107b;

    public i0(String str, String str2) {
        this.f37106a = str;
        this.f37107b = str2;
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
        a0Var.a(this.f37106a, "HERO_COMPONENT_IDENTIFIER");
        a0Var.a(this.f37107b, "HERO_COMPONENT_PARAMETER");
        return a0Var.b();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Intrinsics.areEqual(this.f37106a, i0Var.f37106a) && Intrinsics.areEqual(this.f37107b, i0Var.f37107b);
    }

    public final int hashCode() {
        String str = this.f37106a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f37107b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("HeroComponentDeepLink(heroComponentIdentifier=", this.f37106a, ", heroComponentParameter=", this.f37107b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f37106a);
        parcel.writeString(this.f37107b);
    }
}
