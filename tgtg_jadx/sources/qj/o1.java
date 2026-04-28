package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.local.SearchFilter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o1 extends m {

    @NotNull
    public static final Parcelable.Creator<o1> CREATOR = new f1(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SearchFilter f37127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37128b;

    public o1(SearchFilter searchFilter, String str) {
        searchFilter.getClass();
        str.getClass();
        this.f37127a = searchFilter;
        this.f37128b = str;
    }

    @Override // qj.m
    public final f70.b a() {
        mv.a0 a0Var = new mv.a0();
        SearchFilter searchFilter = this.f37127a;
        searchFilter.getClass();
        a0Var.f30141d = searchFilter;
        mv.z zVar = Intrinsics.areEqual("map", this.f37128b) ? mv.z.MAP : mv.z.LIST;
        zVar.getClass();
        a0Var.f30138a = zVar;
        return a0Var.b();
    }

    @Override // qj.m
    public final String b() {
        return mv.r0.v(this.f37127a.getSearchText()) ? "stores/filter" : "stores/search";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return Intrinsics.areEqual(this.f37127a, o1Var.f37127a) && Intrinsics.areEqual(this.f37128b, o1Var.f37128b);
    }

    public final int hashCode() {
        return this.f37128b.hashCode() + (this.f37127a.hashCode() * 31);
    }

    public final String toString() {
        return "StoreFilterDeepLink(filter=" + this.f37127a + ", view=" + this.f37128b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        this.f37127a.writeToParcel(parcel, i11);
        parcel.writeString(this.f37128b);
    }
}
