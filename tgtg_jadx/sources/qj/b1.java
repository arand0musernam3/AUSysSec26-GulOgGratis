package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.feature.itemview.ui.ItemViewActivity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b1 extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f37068a = new b1();

    @NotNull
    public static final Parcelable.Creator<b1> CREATOR = new a0(26);

    @Override // qj.m
    public final f70.b a() {
        return new f70.b(ItemViewActivity.class, null, true, false, false, null, null, null, null, false, 1018);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof b1);
    }

    public final int hashCode() {
        return -1798127455;
    }

    public final String toString() {
        return "PaymentItemViewDeepLink";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
