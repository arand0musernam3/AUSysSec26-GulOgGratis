package e10;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends rz.a {

    @NonNull
    public static final Parcelable.Creator<h> CREATOR = new com.google.android.gms.common.internal.v(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CommonWalletObject f15515c;

    public h(int i11, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f15513a = i11;
        this.f15514b = str2;
        if (i11 >= 3) {
            this.f15515c = commonWalletObject;
            return;
        }
        CommonWalletObject commonWalletObject2 = new CommonWalletObject();
        commonWalletObject2.f12187a = str;
        this.f15515c = commonWalletObject2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.g0(parcel, 1, 4);
        parcel.writeInt(this.f15513a);
        lx.u.b0(this.f15514b, parcel, 3);
        lx.u.a0(parcel, 4, this.f15515c, i11);
        lx.u.i0(iH0, parcel);
    }
}
