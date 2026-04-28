package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.feature.tabprofile.manageaccount.paymentoptions.PaymentOptionsActivity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z0 extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f37161a = new z0();

    @NotNull
    public static final Parcelable.Creator<z0> CREATOR = new a0(24);

    @Override // qj.m
    public final f70.b a() {
        return new f70.b(PaymentOptionsActivity.class, null, false, false, false, null, null, null, null, false, 1022);
    }

    @Override // qj.m
    public final String b() {
        return "payment-cards";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof z0);
    }

    public final int hashCode() {
        return -744731322;
    }

    public final String toString() {
        return "PaymentCardsDeepLink";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
