package mq;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import jz.l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements a {

    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new l(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30072a;

    public b(boolean z11) {
        this.f30072a = z11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // mq.a
    public final boolean displayedParametersAreEqual(Object obj) {
        obj.getClass();
        return Intrinsics.areEqual(this, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f30072a == ((b) obj).f30072a;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Boolean.valueOf(this.f30072a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(this.f30072a ? 1 : 0);
    }
}
