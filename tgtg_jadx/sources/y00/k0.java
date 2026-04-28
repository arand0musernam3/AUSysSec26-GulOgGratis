package y00;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.m5;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k0 extends m5 implements l0 {
    @Override // y00.l0
    public final void G(List list) {
        Parcel parcelL = L();
        parcelL.writeTypedList(list);
        N(parcelL);
    }
}
