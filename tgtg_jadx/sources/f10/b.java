package f10;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.m5;
import com.google.android.gms.wallet.button.ButtonOptions;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends m5 {
    public final yz.a O(yz.b bVar, ButtonOptions buttonOptions) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f11628i);
        r00.a.d(parcelObtain, bVar);
        r00.a.c(parcelObtain, buttonOptions);
        parcelObtain = Parcel.obtain();
        try {
            this.f11627h.transact(1, parcelObtain, parcelObtain, 0);
            parcelObtain.readException();
            parcelObtain.recycle();
            return yz.b.U(parcelObtain.readStrongBinder());
        } catch (RuntimeException e5) {
            throw e5;
        } finally {
            parcelObtain.recycle();
        }
    }
}
