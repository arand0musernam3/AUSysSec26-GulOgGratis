package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.feature.main.fragments.delivery.basket.ui.ParcelBasketActivity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d1 extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d1 f37073a = new d1();

    @NotNull
    public static final Parcelable.Creator<d1> CREATOR = new a0(28);

    @Override // qj.m
    public final f70.b a() {
        return new f70.b(ParcelBasketActivity.class, null, true, false, false, null, null, null, null, false, 1018);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof d1);
    }

    public final int hashCode() {
        return 1474167544;
    }

    public final String toString() {
        return "PaymentParcelBasketDeepLink";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
