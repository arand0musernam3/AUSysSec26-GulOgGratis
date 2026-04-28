package nk;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.item.Ingredient;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements f {

    @NotNull
    public static final Parcelable.Creator<d> CREATOR = new jz.l(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ingredient f30980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f30982c;

    public d(Ingredient ingredient, int i11, boolean z11) {
        ingredient.getClass();
        this.f30980a = ingredient;
        this.f30981b = i11;
        this.f30982c = z11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f30980a, dVar.f30980a) && this.f30981b == dVar.f30981b && this.f30982c == dVar.f30982c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30982c) + r8.k.b(this.f30981b, this.f30980a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Ingredients(ingredient=");
        sb2.append(this.f30980a);
        sb2.append(", bagCount=");
        sb2.append(this.f30981b);
        sb2.append(", displayPercentage=");
        return j4.s.o(sb2, this.f30982c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        this.f30980a.writeToParcel(parcel, i11);
        parcel.writeInt(this.f30981b);
        parcel.writeInt(this.f30982c ? 1 : 0);
    }
}
