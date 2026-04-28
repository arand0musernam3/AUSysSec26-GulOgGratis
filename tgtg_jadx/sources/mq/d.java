package mq;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import jz.l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements a {

    @NotNull
    public static final Parcelable.Creator<d> CREATOR = new l(19);

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
        return obj instanceof d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
